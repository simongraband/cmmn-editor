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
package org.eclipse.emfcloud.cmmn.glsp.model;

import org.eclipse.emfcloud.cmmn.enotation.Diagram;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.glsp.api.action.kind.RequestModelAction;
import org.eclipse.glsp.api.factory.ModelFactory;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.builder.impl.GGraphBuilder;

public class CMMNModelFactory implements ModelFactory {
	private static final String ROOT_ID = "sprotty";

	@Override
	public GModelRoot loadModel(RequestModelAction action, GraphicalModelState graphicalModelState) {
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
		graphicalModelState.setClientOptions(action.getOptions());

		CMMNEditorContext context = new CMMNEditorContext(modelState);

		modelState.setEditorContext(context);

		CMMNFacade cmmnFacade = context.getCMMNFacade();
		if (cmmnFacade == null) {
			return createEmptyRoot();
		}
		Diagram diagram = cmmnFacade.getDiagram();

		GModelRoot gmodelRoot = context.getGModelFactory().create(cmmnFacade.getCMMNDiagram());
		cmmnFacade.initialize(diagram, gmodelRoot);
		modelState.setRoot(gmodelRoot);
		return gmodelRoot;
	}

	private static GModelRoot createEmptyRoot() {
		return new GGraphBuilder(DefaultTypes.GRAPH)//
				.id(ROOT_ID) //
				.build();
	}

}
