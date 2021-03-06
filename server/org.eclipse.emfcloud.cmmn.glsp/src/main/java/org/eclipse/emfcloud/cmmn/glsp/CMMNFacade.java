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
package org.eclipse.emfcloud.cmmn.glsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram;
import org.eclipse.emfcloud.metamodel.enotation.Diagram;
import org.eclipse.emfcloud.metamodel.enotation.Edge;
import org.eclipse.emfcloud.metamodel.enotation.EnotationFactory;
import org.eclipse.emfcloud.metamodel.enotation.NotationElement;
import org.eclipse.emfcloud.metamodel.enotation.SemanticProxy;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.glsp.graph.GDimension;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.GShapeElement;
import org.eclipse.glsp.graph.util.GraphUtil;

import com.google.common.base.Preconditions;

public class CMMNFacade {

	private final Resource semanticResource;
	private final Resource notationResource;
	private final CMMNDiagram cmmnDiagram;

	private boolean diagramIsNewlyCreated = false;

	private Diagram diagram;
	private CMMNModelIndex modelIndex;

	public CMMNFacade(Resource semanticResource, Resource notationResource, CMMNModelIndex modelIndex) {
		this.semanticResource = semanticResource;
		this.notationResource = notationResource;
		this.modelIndex = modelIndex;
		this.cmmnDiagram = semanticResource.getContents().stream().filter(CMMNDiagram.class::isInstance)
				.map(CMMNDiagram.class::cast).findFirst().orElseThrow();
		EcoreUtil.resolveAll(cmmnDiagram);
	}

	public Resource getSemanticResource() {
		return semanticResource;
	}

	public Resource getNotationResource() {
		return notationResource;
	}

	public CMMNDiagram getCMMNDiagram() {
		return this.cmmnDiagram;
	}

	public Diagram getDiagram() {
		if (diagram == null) {
			getOrCreateDiagram();
		}
		return diagram;
	}

	private Diagram getOrCreateDiagram() {
		Optional<Diagram> existingDiagram = findDiagram();
		diagram = existingDiagram.isPresent() ? existingDiagram.get() : createDiagram();
		findUnresolvedElements(diagram).forEach(e -> e.setSemanticElement(resolved(e.getSemanticElement())));
		modelIndex.indexNotation(diagram);
		return diagram;

	}

	public Diagram initialize(Diagram diagram, GModelRoot gRoot) {
		Preconditions.checkArgument(diagram.getSemanticElement().getResolvedElement() == cmmnDiagram);
		gRoot.getChildren().forEach(child -> {
			modelIndex.getNotation(child).ifPresentOrElse(n -> updateNotationElement(n, child),
					() -> initializeNotationElement(child).ifPresent(diagram.getElements()::add));
		});
		return diagram;
	}

	public boolean diagramNeedsAutoLayout() {
		boolean oldValue = this.diagramIsNewlyCreated;
		this.diagramIsNewlyCreated = false;
		return oldValue;
	}

	public Optional<? extends NotationElement> initializeNotationElement(GModelElement gModelElement) {
		Optional<? extends NotationElement> result = Optional.empty();
		if (gModelElement instanceof GNode) {
			result = initializeShape((GNode) gModelElement);
		} else if (gModelElement instanceof GEdge) {
			result = initializeEdge((GEdge) gModelElement);
		}
		return result;
	}

	public List<NotationElement> findUnresolvedElements(Diagram diagram) {
		return diagram.getElements().stream()
				.filter(element -> resolved(element.getSemanticElement()).getResolvedElement() == null)
				.collect(Collectors.toList());
	}

	private Diagram createDiagram() {
		Diagram diagram = EnotationFactory.eINSTANCE.createDiagram();
		diagram.setSemanticElement(createProxy(cmmnDiagram));
		notationResource.getContents().add(diagram);
		diagramIsNewlyCreated = true;
		return diagram;
	}

	public Optional<Shape> initializeShape(GShapeElement shapeElement) {
		return modelIndex.getSemantic(shapeElement)
				.map(semanticElement -> initializeShape(semanticElement, shapeElement));
	}

	public Shape initializeShape(EObject semanticElement) {
		return initializeShape(semanticElement, null);
	}

	public Shape initializeShape(EObject semanticElement, GShapeElement shapeElement) {
		Shape shape = EnotationFactory.eINSTANCE.createShape();
		shape.setSemanticElement(createProxy(semanticElement));
		if (shapeElement != null) {
			updateShape(shape, shapeElement);
		}
		modelIndex.indexNotation(shape);
		return shape;
	}

	public Optional<Edge> initializeEdge(GEdge gEdge) {
		return modelIndex.getSemantic(gEdge).map(semanticElement -> initializeEdge(semanticElement, gEdge));
	}

	public Edge initializeEdge(EObject semanticElement) {
		return initializeEdge(semanticElement, null);
	}

	public Edge initializeEdge(EObject semanticElement, GEdge gEdge) {
		Edge edge = EnotationFactory.eINSTANCE.createEdge();
		edge.setSemanticElement(createProxy(semanticElement));
		if (gEdge != null) {
			updateEdge(edge, gEdge);
		}
		modelIndex.indexNotation(edge);
		return edge;
	}

	public SemanticProxy createProxy(EObject eObject) {
		SemanticProxy proxy = EnotationFactory.eINSTANCE.createSemanticProxy();
		proxy.setResolvedElement(eObject);
		proxy.setUri(semanticResource.getURIFragment(eObject));
		return proxy;
	}

	public SemanticProxy resolved(SemanticProxy proxy) {
		if (proxy.getResolvedElement() != null) {
			return proxy;
		}
		return reResolved(proxy);
	}

	public SemanticProxy reResolved(SemanticProxy proxy) {
		proxy.setResolvedElement(semanticResource.getEObject(proxy.getUri()));
		return proxy;
	}

	public void updateNotationElement(NotationElement notation, GModelElement modelElement) {
		if (notation instanceof Shape && modelElement instanceof GShapeElement) {
			updateShape((Shape) notation, (GShapeElement) modelElement);
		} else if (notation instanceof Edge && modelElement instanceof GEdge) {
			updateEdge((Edge) notation, (GEdge) modelElement);
		}
	}

	public void updateShape(Shape shape, GShapeElement shapeElement) {
		if (shapeElement.getSize() != null) {
			shape.setSize(GraphUtil.copy(shapeElement.getSize()));
		} else {
			GDimension size = GraphUtil.dimension(10, 10);
			shape.setSize(size);
		}
		if (shapeElement.getPosition() != null) {
			shape.setPosition(GraphUtil.copy(shapeElement.getPosition()));
		}
	}

	public void updateEdge(Edge edge, GEdge gEdge) {
		edge.getBendPoints().clear();
		if (gEdge.getRoutingPoints() != null) {
			ArrayList<GPoint> gPoints = new ArrayList<>();
			gEdge.getRoutingPoints().forEach(p -> gPoints.add(GraphUtil.copy(p)));
			edge.getBendPoints().addAll(gPoints);
		}
	}

	public void updateNotationElement(GModelElement modelElement) {
		modelIndex.getNotation(modelElement).ifPresent(notation -> updateNotationElement(notation, modelElement));
	}

	private Optional<Diagram> findDiagram() {
		return notationResource.getContents().stream().filter(eObject -> isDiagramForCMMNDiagram(eObject))
				.map(Diagram.class::cast).findFirst();
	}

	private boolean isDiagramForCMMNDiagram(EObject eObject) {
		if (eObject instanceof Diagram) {
			Diagram diagram = (Diagram) eObject;

			return resolved(diagram.getSemanticElement()).getResolvedElement() == cmmnDiagram;

		}
		return false;
	}

}
