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

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Logger;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.ModelServerClientProvider;
import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNValidator;
import org.eclipse.emfcloud.metamodel.enotation.Diagram;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;
import org.eclipse.emfcloud.modelserver.edit.CommandCodec;
import org.eclipse.emfcloud.validation.ValidationFilter;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.builder.impl.GGraphBuilder;
import org.eclipse.glsp.server.actions.ActionDispatcher;
import org.eclipse.glsp.server.actions.RequestModelAction;
import org.eclipse.glsp.server.factory.ModelFactory;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.utils.ClientOptions;

import com.google.inject.Inject;

public class CMMNModelFactory implements ModelFactory {
	private static Logger LOGGER = Logger.getLogger(CMMNModelFactory.class);
	private static final String ROOT_ID = "sprotty";

	@Inject
	private ModelServerClientProvider modelServerClientProvider;

	@Inject
	private ActionDispatcher actionDispatcher;

	@Inject
	private CommandCodec commandCodec;

	@Override
	public GModelRoot loadModel(RequestModelAction action, GModelState graphicalModelState) {
		// 1. Load models and create ecore facade
		Optional<String> sourceURI = ClientOptions.getValue(action.getOptions(), ClientOptions.SOURCE_URI);
		if (sourceURI.isEmpty()) {
			LOGGER.error("No source uri given to load model, return empty model.");
			return createEmptyRoot();
		}
		Optional<ModelServerClient> modelServerClient = modelServerClientProvider.get();
		if (modelServerClient.isEmpty()) {
			LOGGER.error("Connection to modelserver has not been initialized, return empty model");
			return createEmptyRoot();
		}
				
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
		modelState.setClientOptions(action.getOptions());
		
		CMMNEditorContext editorContext = new CMMNEditorContext(modelState);
		modelState.setEditorContext(editorContext);
		
		CMMNFacade cmmnFacade = editorContext.getCMMNFacade();
		if (cmmnFacade == null) {
			LOGGER.error("CMMNFacade could not be found, return empty model");
			return createEmptyRoot();
		}
		
		// TODO: improve modeluri fetching
		String modelUri = sourceURI.get().split("workspace/")[1];
		CMMNValidationResultChangeListener changeListener = new CMMNValidationResultChangeListener(modelState, actionDispatcher);
		CMMNModelServerAccess modelServerAccess = new CMMNModelServerAccess(modelUri, modelServerClient.get(),
				commandCodec, changeListener);
		try {
			modelServerAccess.addValidationFilter(List.of(new ValidationFilter(CMMNValidator.CASE__HAS_EXIT_SENTRY, "org.eclipse.emfcloud.metamodel.CMMN")));
		} catch (IOException | InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		modelServerAccess.subscribeToValidation();
		modelServerAccess.initConstraintList();
		
		//modelServerAccess.subscribe(new CMMNModelServerSubscriptionListener(modelState, modelServerAccess, actionDispatcher));
		modelState.setModelServerAccess(modelServerAccess);

		// 3. Set current cmmn model
		// TODO - check if this is still correct
		Diagram diagram = cmmnFacade.getDiagram();
		GModelRoot gmodelRoot = editorContext.getGModelFactory().create(cmmnFacade.getCMMNDiagram());
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
