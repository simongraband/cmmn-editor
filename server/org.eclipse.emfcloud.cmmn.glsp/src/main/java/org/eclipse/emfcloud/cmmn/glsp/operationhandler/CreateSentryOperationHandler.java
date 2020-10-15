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

import java.util.List;

import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelServerAccess;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;
import org.eclipse.emfcloud.metamodel.CMMN.SentryType;
import org.eclipse.emfcloud.metamodel.enotation.Diagram;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.operations.BasicOperationHandler;
import org.eclipse.glsp.server.operations.CreateEdgeOperation;
import org.eclipse.glsp.server.operations.Operation;
import static org.eclipse.glsp.server.protocol.GLSPServerException.getOrThrow;

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
	public void executeOperation(CreateEdgeOperation operation, GModelState modelState) {
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
		
		sourceItem.getOutgoingSentrys().add(sentry);
		targetItem.getIncomingSentrys().add(sentry);

		GEdge edge = context.getGModelFactory().create(sentry);
		diagram.getElements().add(facade.initializeEdge(sentry, edge));
		
		CMMNModelState cmmnModelState = CMMNModelState.getModelState(modelState);
		CMMNModelServerAccess access = cmmnModelState.getModelServerAccess();
				
		access.setEcoreFacade(CMMNModelState.getCMMNFacade(modelState));
		access.update();
	}

	private Sentry createSentry(PlanItemDefinition source, PlanItemDefinition target, String elementTypeId) {
		Sentry sentry = CMMNFactory.eINSTANCE.createSentry();
		sentry.setOnPart(source);
		sentry.setAnchor(target);
		if(elementTypeId.equals(Types.SENTRY_ENTRY)) {
			sentry.setSentryType(SentryType.ENTRY);
		} else {
			sentry.setSentryType(SentryType.EXIT);
		}
		sentry.setIfPart("a > 12");
		return sentry;

	}

	@Override
	public String getLabel() {
		return "Create ecore edge";
	}

}
