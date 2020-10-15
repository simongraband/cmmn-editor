/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.ResourceManager;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelServerAccess;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.CaseFile;
import org.eclipse.emfcloud.metamodel.CMMN.EventListener;
import org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.server.features.directediting.ApplyLabelEditOperation;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.operations.BasicOperationHandler;
import static org.eclipse.glsp.server.protocol.GLSPServerException.getOrThrow;

public class LabelEditOperationHandler extends BasicOperationHandler<ApplyLabelEditOperation> {

	@Override
	public void executeOperation(ApplyLabelEditOperation editLabelOperation, GModelState graphicalModelState) {
		CMMNFacade facade = CMMNModelState.getCMMNFacade(graphicalModelState);
		CMMNModelIndex index = CMMNModelState.getModelState(graphicalModelState).getIndex();
		Optional<String> type = index.findElementByClass(editLabelOperation.getLabelId(), GModelElement.class).map(e -> e.getType());
		if (type.isPresent()) {
			switch (type.get()) { 
				case Types.LABEL_NAME:
					GNode node = getOrThrow(index.findElementByClass(editLabelOperation.getLabelId(), GNode.class), 
							"No parent Node for element with id " + editLabelOperation.getLabelId() + " found");
						
					EObject node_semantic = getOrThrow(index.getSemantic(node),
							"No semantic element for labelContainer with id " + node.getId() + " found");
					
					Shape shape = getOrThrow(index.getNotation(node_semantic), Shape.class,
								"No shape element for label with id " + editLabelOperation.getLabelId() + " found");
		
						if (node_semantic instanceof CMMNElement) {
							if (node_semantic instanceof Stage) {
								((Stage) node_semantic).setName(editLabelOperation.getText().trim());
							} else if (node_semantic instanceof Task) {
								((Task) node_semantic).setName(editLabelOperation.getText().trim());
							} else if (node_semantic instanceof EventListener) {
								((EventListener) node_semantic).setName(editLabelOperation.getText().trim());
							} else if (node_semantic instanceof Case) {
								((Case) node_semantic).setName(editLabelOperation.getText().trim());
							} else if (node_semantic instanceof CaseFile) {
								((CaseFile) node_semantic).setName(editLabelOperation.getText().trim());
							}
							// nameChange== uri change so we have to recreate the proxy here
							index.removeURI(shape.getSemanticElement().getUri());
							shape.setSemanticElement(facade.createProxy(node_semantic));
                        }
					break;
				case Types.LABEL_REQUEST:
					node = getOrThrow(index.findElementByClass(editLabelOperation.getLabelId(), GNode.class), 
							"No parent Node for element with id " + editLabelOperation.getLabelId() + " found");
					node_semantic = getOrThrow(index.getSemantic(node),
							"No semantic element for labelContainer with id " + node.getId() + " found");
					if(node_semantic instanceof HTTPHookDecorator) {
						((HTTPHookDecorator) node_semantic).setRequest(editLabelOperation.getText().trim().toUpperCase());
					}
					break;
				case Types.LABEL_VALUE:
					node = getOrThrow(index.findElementByClass(editLabelOperation.getLabelId(), GNode.class), 
							"No parent Node for element with id " + editLabelOperation.getLabelId() + " found");
					node_semantic = getOrThrow(index.getSemantic(node),
							"No semantic element for labelContainer with id " + node.getId() + " found");
					if(node_semantic instanceof HTTPHookDecorator) {
						((HTTPHookDecorator) node_semantic).setValue(editLabelOperation.getText().trim());
					}
					break;
				case Types.LABEL_EDGE_IF:
					Sentry sentry_semantic = (Sentry) getOrThrow(
							index.getSemantic(editLabelOperation.getLabelId().split("_")[0]),
							"No semantic element for labelContainer with id " + editLabelOperation.getLabelId().split("_")[0] + " found");
					((Sentry) sentry_semantic).setIfPart(editLabelOperation.getText().trim());
					break;
			}
		}
		
		CMMNModelState cmmnModelState = CMMNModelState.getModelState(CMMNModelState.getModelState(graphicalModelState));
		CMMNModelServerAccess access = cmmnModelState.getModelServerAccess();
				
		access.setEcoreFacade(CMMNModelState.getCMMNFacade(CMMNModelState.getModelState(graphicalModelState)));
		access.update();
	}

	private Optional<EClassifier> parseStringToEType(String name, ResourceManager resManager) {
		for (EClassifier type : getAllEAttributeTypes(resManager)) {
			if (type.getName().toLowerCase().equals(name.toLowerCase())) {
				return Optional.ofNullable(type);
			}
		}
		return Optional.empty();
	}

	public static List<EClassifier> getAllEAttributeTypes(ResourceManager resManager) {
		List<EClassifier> listOfTypes = new ArrayList<>(EcorePackage.eINSTANCE.getEClassifiers());
		listOfTypes.removeIf(e -> !(e instanceof EDataType));
		TreeIterator<Notifier> resourceSetContent = resManager.getEditingDomain().getResourceSet().getAllContents();
		while (resourceSetContent.hasNext()) {
			Notifier res = resourceSetContent.next();
			if (res instanceof EDataType) {
				listOfTypes.add((EClassifier) res);
			}
		}
		return listOfTypes;
	}

	@Override
	public String getLabel() {
		return "Apply label";
	}
}
