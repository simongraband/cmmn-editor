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
import org.eclipse.emfcloud.cmmn.enotation.Edge;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.CSS;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNElement;
import org.eclipse.emfcloud.cmmn.metamodel.Case;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;
import org.eclipse.emfcloud.cmmn.metamodel.PlanItemDefinition;
import org.eclipse.emfcloud.cmmn.metamodel.Sentry;
import org.eclipse.glsp.api.jsonrpc.GLSPServerException;
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
		GModelElement result = null;
		if (semanticElement instanceof CMMNElement) {
			result = classifierNodeFactory.create((CMMNElement) semanticElement);
		} else if (semanticElement instanceof CMMNDiagram) {
			result = create((CMMNDiagram) semanticElement);
		}
		if (result == null) {
			throw createFailed(semanticElement);
		}
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

		graph.getChildren().addAll(cmmnDiagram.getCmmnElements().stream() //
				.filter(PlanItemDefinition.class::isInstance) //
				.map(PlanItemDefinition.class::cast) //
				.flatMap(cmmnElement -> createEdges(cmmnElement).stream()) //
				.collect(Collectors.toList()));

		return graph;
	}

	private List<GModelElement> createEdges(PlanItemDefinition nodes) {
		List<GModelElement> children = new ArrayList<>();
		// create sentry edges
		nodes.getSentry().stream().map(this::create).filter(Objects::nonNull).forEach(children::add);
		
		return children;
	}

	public GEdge create(Sentry sentry) {
		String source = sentry.getOnPartId();
		String target = sentry.getAnchorId();
		String id = toId(sentry);

		GEdgeBuilder builder = new GEdgeBuilder().id(id) //
				.addCssClass(CSS.SENTRY) //
				.sourceId(source) //7
				.targetId(target) //
				.routerKind(GConstants.RouterKind.MANHATTAN);


		modelState.getIndex().getNotation(toId(sentry), Edge.class).ifPresent(edge -> {

			if (edge.getBendPoints() != null) {
				ArrayList<GPoint> gPoints = new ArrayList<>();
				edge.getBendPoints().forEach(p -> gPoints.add(GraphUtil.copy(p)));
				builder.addRoutingPoints(gPoints);
			}
		});
		return builder.build();
	}

	private String createMultiplicity(EReference eReference) {
		return String.format("[%s..%s]", eReference.getLowerBound(),
				eReference.getUpperBound() == -1 ? "*" : eReference.getUpperBound());
	}

	private GLabel createEdgeMultiplicityLabel(String value, String id, double position) {
		return createEdgeLabel(value, position, id, Types.LABEL_EDGE_MULTIPLICITY, GConstants.EdgeSide.BOTTOM);
	}

	private GLabel createEdgeNameLabel(String name, String id, double position) {
		return createEdgeLabel(name, position, id, Types.LABEL_EDGE_NAME, GConstants.EdgeSide.TOP);
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

}
