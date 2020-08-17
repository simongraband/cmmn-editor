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

import java.util.Optional;

import com.google.inject.Inject;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.ModelServerClientProvider;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram;
import org.eclipse.emfcloud.metamodel.enotation.Diagram;
import org.eclipse.emfcloud.metamodel.enotation.Edge;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;
import org.eclipse.emfcloud.modelserver.edit.CommandCodec;
import org.eclipse.glsp.api.action.ActionProcessor;
import org.eclipse.glsp.api.action.kind.RequestModelAction;
import org.eclipse.glsp.api.factory.ModelFactory;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.utils.ClientOptions;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.builder.impl.GGraphBuilder;

public class CMMNModelFactory implements ModelFactory {
	private static Logger LOGGER = Logger.getLogger(CMMNModelFactory.class);
	private static final String ROOT_ID = "sprotty";

	@Inject
	private ModelServerClientProvider modelServerClientProvider;

	@Inject
	private ActionProcessor actionProcessor;

	@Inject
	private AdapterFactory adapterFactory;

	@Inject
	private CommandCodec commandCodec;

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
		/*CMMNEditorContext context = new CMMNEditorContext(CMMNModelState.getModelState(graphicalModelState));
		Optional<String> sourceURI = ClientOptions.getValue(action.getOptions(), ClientOptions.SOURCE_URI);
		if(sourceURI.isEmpty()){
			LOGGER.error("No URI given to load model, return empty model");
			return createEmptyRoot();
		}

		Optional<ModelServerClient> modelServerClient = modelServerClientProvider.get();
		if(modelServerClient.isEmpty()){
			LOGGER.error("Could not reach Model Server, create Empty model");
			return createEmptyRoot();
		}

		CMMNModelServerAccess modelAccess = new CMMNModelServerAccess(sourceURI.get(), modelServerClient.get(), adapterFactory, commandCodec);
		//modelAccess.subscribe(subscriptionListener);
		
		if(graphicalModelState instanceof CMMNModelState){
			((CMMNModelState) graphicalModelState).setModelAccess(modelAccess);
		}

		CMMNFacade cmmnFacade = modelAccess.getCMMNFacade();
		if(cmmnFacade == null){
			return createEmptyRoot();
		}

		CMMNDiagram diagram = cmmnFacade.getCMMNDiagram();*/
		
	}

	/*public static MappedGModelRoot populate(CMMNFacade cmmnFacade, GraphicalModelState modelState) {
		Diagram diagram = cmmnFacade.getDiagram();

		GModelRoot root = createEmptyRoot();
		modelState.setRoot(root);

		cmmnFacade.initializeNotation(diagram);
		root.setId(cmmnFacade.findDiagram(diagram).get().getGraphicId());
		Map<Node, GNode> nodeMapping = new HashMap<>();
		for (Node node : diagram.getNodes()) {
			cmmnFacade.findDiagramElement(node, Shape.class) //
					.flatMap(shape -> toGNode(node, shape, modelState)) //
					.ifPresent(gnode -> {
						nodeMapping.put(node, gnode);
						root.getChildren().add(gnode);
					});
		}

		for (Flow flow : diagram.getFlows()) {
			cmmnFacade.findDiagramElement(flow, Edge.class)
					.flatMap(edge -> toGEdge(flow, edge, nodeMapping, modelState)) //
					.ifPresent(root.getChildren()::add);
		}
		return new MappedGModelRoot(root, nodeMapping);
	}*/

	private static GModelRoot createEmptyRoot() {
		return new GGraphBuilder(DefaultTypes.GRAPH)//
				.id(ROOT_ID) //
				.build();
	}

}
