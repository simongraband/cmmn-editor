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

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNElement;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;
import org.eclipse.glsp.api.jsonrpc.GLSPServerException;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.builder.impl.GGraphBuilder;

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
		if (semanticElement instanceof EClassifier) {
			result = classifierNodeFactory.create((EClassifier) semanticElement);
		} else if (semanticElement instanceof EPackage) {
			result = create((EPackage) semanticElement);
		} 
		if (result == null) {
			throw createFailed(semanticElement);
		}
		return result;
	}

	public GGraph create() {
		return create(modelState.getEditorContext().getCMMNFacade().getCMMNPackage());
	}

	public GGraph create(EPackage cmmnPackage) {
		GGraph graph = getOrCreateRoot();
		graph.setId(toId(cmmnPackage));
		//TODO is this right?
		graph.getChildren().addAll(cmmnPackage.getEClassifiers().stream()//
				.map(this::create)//
				.collect(Collectors.toList()));
		return graph;
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
