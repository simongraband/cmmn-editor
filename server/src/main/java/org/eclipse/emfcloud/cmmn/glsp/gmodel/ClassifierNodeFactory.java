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

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.CSS;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.EventListener;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GCompartmentBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.graph.util.GraphUtil;

public class ClassifierNodeFactory extends AbstractGModelFactory<CMMNElement, GNode> {

	private GModelFactory parentFactory;

	public ClassifierNodeFactory(CMMNModelState modelState, GModelFactory parentFactory) {
		super(modelState);
		this.parentFactory = parentFactory;
	}

	@Override
	public GNode create(CMMNElement element) {
		if (element instanceof Case) {
			return create((Case) element);
		} else if (element instanceof Stage) {
			return create((Stage) element);
		} else if (element instanceof Task) {
			return create((Task) element);
		} else if (element instanceof EventListener){
			return create((EventListener) element);
		}
		return null;
	}

	public GNode create(Case cmmnCase) {
		GNodeBuilder b = new GNodeBuilder(Types.CASE) //
				.id(toId(cmmnCase)) //
				.layout(GConstants.Layout.VBOX) //
				.addCssClass(CSS.CASE) //
				.add(buildHeader(cmmnCase))//
				.add(createLabeledChildrenCompartment(cmmnCase.getStages(), cmmnCase));
		applyShapeData(cmmnCase, b);
		return b.build();
	}

	public GNode create(Stage cmmnStage) {
		GNodeBuilder b = new GNodeBuilder(Types.STAGE) //
				.id(toId(cmmnStage)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.STAGE) //
				.add(buildHeader(cmmnStage))//
				.add(createLabeledChildrenCompartment(cmmnStage.getTasks(), cmmnStage));
		applyShapeData(cmmnStage, b);

		return b.build();
	}

	public GNode create(Task cmmnTask) {
		GNodeBuilder b = new GNodeBuilder(Types.TASK) //
				.id(toId(cmmnTask)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.TASK) //
				.add(buildHeader(cmmnTask))//
				.add(new GCompartmentBuilder(Types.COMP) //
						.id(toId(cmmnTask) + "_childCompartment")//
						.layout(GConstants.Layout.VBOX) //
						.layoutOptions(new GLayoutOptions() //
								.hAlign(GConstants.HAlign.CENTER) //
								.resizeContainer(true)) //
						.build());

		applyShapeData(cmmnTask, b);
		return b.build();
	}

	// TODO refactor Task
	public GNode create(EventListener cmmnTask) {
		GNodeBuilder b = new GNodeBuilder(Types.TASK) //
				.id(toId(cmmnTask)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.TASK) //
				.add(buildHeader(cmmnTask))//
				.add(new GCompartmentBuilder(Types.COMP) //
						.id(toId(cmmnTask) + "_childCompartment")//
						.layout(GConstants.Layout.VBOX) //
						.layoutOptions(new GLayoutOptions() //
								.hAlign(GConstants.HAlign.CENTER) //
								.resizeContainer(true)) //
						.build());

		applyShapeData(cmmnTask, b);
		return b.build();
	}

	private void applyShapeData(CMMNElement element, GNodeBuilder builder) {
		modelState.getIndex().getNotation(element, Shape.class).ifPresent(shape -> {
			if (shape.getPosition() != null) {
				builder.position(GraphUtil.copy(shape.getPosition()));
			} else if (shape.getSize() != null) {
				builder.size(GraphUtil.copy(shape.getSize()));
			}
		});
	}

	private GCompartment buildHeader(CMMNElement element) {
		return new GCompartmentBuilder(Types.COMP_HEADER) //
				.layout("hbox") //
				.id(toId(element) + "_header") //
				.add(new GLabelBuilder(Types.LABEL_NAME) //
						.id(toId(element) + "_header_label").text(element.getName()) //
						.build()) //
				.build();
	}

	private GCompartment createLabeledChildrenCompartment(Collection<? extends EObject> children, CMMNElement parent) {
		return new GCompartmentBuilder(Types.COMP) //
				.id(toId(parent) + "_childCompartment").layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions() //
						.hAlign(GConstants.HAlign.LEFT) //
						.resizeContainer(true)) //
				.addAll(children.stream() //
						.map(parentFactory::create) //
						.collect(Collectors.toList()))
				.build();
	}
}
