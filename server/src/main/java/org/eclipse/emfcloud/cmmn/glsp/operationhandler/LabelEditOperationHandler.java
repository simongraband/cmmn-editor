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

import static org.eclipse.glsp.api.jsonrpc.GLSPServerException.getOrThrow;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.ResourceManager;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.glsp.api.action.kind.SetMarkersAction;
import org.eclipse.glsp.api.jsonrpc.GLSPServerException;
import org.eclipse.glsp.api.markers.Marker;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.operation.kind.ApplyLabelEditOperation;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.server.operationhandler.BasicOperationHandler;

public class LabelEditOperationHandler extends BasicOperationHandler<ApplyLabelEditOperation> {

	@Override
	public void executeOperation(ApplyLabelEditOperation editLabelOperation, GraphicalModelState graphicalModelState) {
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
							((CMMNElement) node_semantic).setName(editLabelOperation.getText().trim());
							// nameChange== uri change so we have to recreate the proxy here
							shape.setSemanticElement(facade.createProxy(node_semantic));
                        }
					break;
			}
		}
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
