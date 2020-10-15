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
package org.eclipse.emfcloud.cmmn.glsp.gmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.CSS;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;
import org.eclipse.emfcloud.metamodel.CMMN.SentryType;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.enotation.Edge;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.builder.impl.GEdgeBuilder;
import org.eclipse.glsp.graph.builder.impl.GEdgePlacementBuilder;
import org.eclipse.glsp.graph.builder.impl.GGraphBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.protocol.GLSPServerException;

public class GModelFactory extends AbstractGModelFactory<EObject, GModelElement> {

	private ClassifierNodeFactory classifierNodeFactory;
	private LabelFactory labelFactory;

	public GModelFactory(CMMNModelState modelState) {
		super(modelState);
		classifierNodeFactory = new ClassifierNodeFactory(modelState, this);
		labelFactory = new LabelFactory(modelState);
		getOrCreateRoot();
	}

	@Override
	public GModelElement create(EObject semanticElement) {
		CMMNModelIndex index = modelState.getIndex();
		GModelElement result = null;
		if (semanticElement instanceof CMMNElement) {
			result = classifierNodeFactory.create((CMMNElement) semanticElement);
		} else if (semanticElement instanceof CMMNDiagram) {
			result = create((CMMNDiagram) semanticElement);
		}
		if (result == null) {
			throw createFailed(semanticElement);
		}
		index.indexGModelElement(EcoreUtil.getURI(semanticElement).fragment().toString(), result);
		return result;
	}

	public GGraph create() {
		return create(modelState.getEditorContext().getCMMNFacade().getCMMNDiagram());
	}

	public GGraph create(CMMNDiagram cmmnDiagram) {
		GGraph graph = getOrCreateRoot();
		graph.setId(toId(cmmnDiagram));
		graph.getChildren().addAll(cmmnDiagram.getCmmnElements().stream()//
				.map(this::create)//
				.collect(Collectors.toList()));

		//All Nodes at stages
		graph.getChildren().addAll(cmmnDiagram.getCmmnElements().stream()
				.flatMap(cases -> ((Case) cases).getStages().stream())// //
				.flatMap(stage -> createEdges(stage).stream()) //
				.collect(Collectors.toList()));
		
		//All Case Tasks
		graph.getChildren().addAll(cmmnDiagram.getCmmnElements().stream()
				.flatMap(cases -> ((Case) cases).getTasks().stream())// //
				.flatMap(task -> createEdges(task).stream()) //
				.collect(Collectors.toList()));
		
		//All Case Tasks
		graph.getChildren().addAll(cmmnDiagram.getCmmnElements().stream()
				.flatMap(cases -> ((Case) cases).getEventListeners().stream())// //
				.flatMap(task -> createEdges(task).stream()) //
				.collect(Collectors.toList()));
		
		//All Tasks in Stages
		graph.getChildren().addAll(cmmnDiagram.getCmmnElements().stream()
				.flatMap(cases -> ((Case) cases).getStages().stream())//
				.flatMap(stages -> ((Stage) stages).getTasks().stream())
				.flatMap(task -> createEdges(task).stream()) //
				.collect(Collectors.toList()));
		
		//All EventListeners in Stages
		graph.getChildren().addAll(cmmnDiagram.getCmmnElements().stream()
				.flatMap(cases -> ((Case) cases).getStages().stream())//
				.flatMap(stages -> ((Stage) stages).getEventListeners().stream())
				.flatMap(task -> createEdges(task).stream()) //
				.collect(Collectors.toList()));
		
		return graph;
	}

	private List<GModelElement> createEdges(PlanItemDefinition node) {
		List<GModelElement> children = new ArrayList<>();
		// create sentry edges
		node.getOutgoingSentrys().stream().map(this::create).filter(Objects::nonNull).forEach(children::add);
		
		return children;
	}

	public GEdge create(Sentry sentry) {
		CMMNElement target = sentry.getAnchor();
		PlanItemDefinition source = sentry.getOnPart();
		String id = toId(sentry);

		GEdgeBuilder builder = new GEdgeBuilder().id(id)
				.type(isExit(sentry) ? Types.SENTRY_EXIT : Types.SENTRY_ENTRY)//
				.addCssClass(CSS.SENTRY) //
				.addCssClass(isExit(sentry) ? CSS.EXIT : CSS.ENTRY)
				.sourceId(source.getId()) //
				.targetId(target.getId()) //
				.routerKind(GConstants.RouterKind.MANHATTAN)
				.add(createEdgeNameLabel(sentry.getIfPart(), id + "_label_if", 0.5d));


		modelState.getIndex().getNotation(toId(sentry), Edge.class).ifPresent(edge -> {

			if (edge.getBendPoints() != null) {
				ArrayList<GPoint> gPoints = new ArrayList<>();
				edge.getBendPoints().forEach(p -> gPoints.add(GraphUtil.copy(p)));
				builder.addRoutingPoints(gPoints);
			}
		});
		return builder.build();
	}

	public boolean isExit(Sentry sentry){
		if(sentry.getSentryType() == SentryType.EXIT) return true;
		return false;
	}

	public static GLSPServerException createFailed(EObject semanticElement) {
		return new GLSPServerException("Error during model initialization!", new Throwable(
				"No matching GModelElement found for the semanticElement of type: " + semanticElement.getClass()));
	}

	private GGraph getOrCreateRoot() {
		GModelRoot existingRoot = modelState.getRoot();
		if (existingRoot != null && existingRoot instanceof GGraph) {
			GGraph graph = (GGraph) existingRoot;
			graph.getChildren().clear();
			return graph;
		} else {
			GGraph graph = new GGraphBuilder().build();
			modelState.setRoot(graph);
			return graph;
		}
	}
	
	private GLabel createEdgeNameLabel(String name, String id, double position) {
		return createEdgeLabel(name, position, id, Types.LABEL_EDGE_IF, GConstants.EdgeSide.TOP);
	}
	
	private GLabel createEdgeLabel(String name, double position, String id, String type, String side) {
		return new GLabelBuilder(type) //
				.edgePlacement(new GEdgePlacementBuilder()//
						.side(side)//
						.position(position)//
						.offset(2d) //
						.rotate(false) //
						.build())//
				.id(id) //
				.text(name).build();
	}

}
