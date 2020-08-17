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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;
import org.eclipse.emfcloud.metamodel.CMMN.SentryType;
import org.eclipse.emfcloud.metamodel.enotation.Diagram;
import org.eclipse.emfcloud.metamodel.enotation.NotationElement;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.operation.Operation;
import org.eclipse.glsp.api.operation.kind.CreateEdgeOperation;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.server.operationhandler.BasicOperationHandler;

import com.google.common.collect.Lists;

public class CreateSentryOperationHandler extends BasicOperationHandler<CreateEdgeOperation> {
	private List<String> handledElementTypeIds = Lists.newArrayList(Types.SENTRY_ENTRY, Types.SENTRY_EXIT);

	@Override
	public boolean handles(Operation operation) {
		if (operation instanceof CreateEdgeOperation) {
			CreateEdgeOperation connectAction = (CreateEdgeOperation) operation;
			return this.handledElementTypeIds.contains(connectAction.getElementTypeId());
		}
		return false;
	}

	@Override
	public void executeOperation(CreateEdgeOperation operation, GraphicalModelState modelState) {
		String elementTypeId = operation.getElementTypeId();

		CMMNEditorContext context = CMMNModelState.getEditorContext(modelState);
		CMMNModelIndex modelIndex = context.getModelState().getIndex();
		CMMNFacade facade = context.getCMMNFacade();
		PlanItemDefinition sourceItem = getOrThrow(modelIndex.getSemantic(operation.getSourceElementId(), PlanItemDefinition.class),
				"No semantic EClass found for source element with id " + operation.getSourceElementId());
		sourceItem.setId(operation.getSourceElementId());
		PlanItemDefinition targetItem = getOrThrow(modelIndex.getSemantic(operation.getTargetElementId(), PlanItemDefinition.class),
				"No semantic EClass found for target element with id" + operation.getTargetElementId());
		targetItem.setId(operation.getTargetElementId());

		Diagram diagram = facade.getDiagram();

		Sentry sentry = createSentry(sourceItem, targetItem, elementTypeId);

		GEdge edge = getOrThrow(context.getGModelFactory().create(sentry, GEdge.class),
				" No viewmodel factory found for element: " + sentry);
		diagram.getElements().add(facade.initializeEdge(sentry, edge));
	}

	private Sentry createSentry(PlanItemDefinition source, PlanItemDefinition target, String elementTypeId) {
		Sentry sentry = CMMNFactory.eINSTANCE.createSentry();
		sentry.setOnPartId(source.getId());
		sentry.setAnchorId(target.getId());
		if(elementTypeId==Types.SENTRY_ENTRY) sentry.setSentryType(SentryType.ENTRY);
		else sentry.setSentryType(SentryType.EXIT);
		//sentry.setName(target.getName().toLowerCase() + "s");
		target.getSentry().add(sentry);
		return sentry;

	}

	@Override
	public String getLabel() {
		return "Create ecore edge";
	}

}
