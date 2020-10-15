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
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.CSS;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.CaseFile;
import org.eclipse.emfcloud.metamodel.CMMN.EventListener;
import org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.metamodel.CMMN.TaskRole;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GDimension;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GCompartmentBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.impl.GDimensionImpl;
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
		} else if (element instanceof CaseFile) {
			return create((CaseFile) element);
		} else if (element instanceof HTTPHookDecorator) {
			return create((HTTPHookDecorator) element);
		} else if (element instanceof MandatoryDecorator) {
			return create((MandatoryDecorator) element);
		}
		return null;
	}

	public GNode create(Case cmmnCase) {
		List<CMMNElement> allChildren = new ArrayList<>();
		if(cmmnCase.getCasefile() != null) allChildren.add(cmmnCase.getCasefile());
		allChildren.addAll(cmmnCase.getStages());
		allChildren.addAll(cmmnCase.getTasks());
		allChildren.addAll(cmmnCase.getEventListeners());
		GNodeBuilder b = new GNodeBuilder(Types.CASE) //
				.id(toId(cmmnCase)) //
				.layout(GConstants.Layout.VBOX) //
				.addCssClass(CSS.CASE) //
				.add(buildHeader(cmmnCase))//
				//.add(createCaseFileChildrenCompartment(cmmnCase.getCasefile(), cmmnCase))
				//.add(createStageChildrenCompartment(cmmnCase.getStages(), cmmnCase))
				//.add(createTaskChildrenCompartment(cmmnCase.getTasks(), cmmnCase))
				//.add(createEventListenerChildrenCompartment(cmmnCase.getEventListeners(), cmmnCase));
				.add(createChildrenCompartment(allChildren, cmmnCase));
			
		applyShapeData(cmmnCase, b);
		return b.build();
	}

	public GNode create(Stage cmmnStage) {
		List<CMMNElement> allChildren = new ArrayList<>();
		allChildren.addAll(cmmnStage.getTasks());
		allChildren.addAll(cmmnStage.getEventListeners());
		allChildren.addAll(cmmnStage.getDecorators());
		GNodeBuilder b = new GNodeBuilder(Types.STAGE) //
				.id(toId(cmmnStage)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.STAGE) //
				.add(buildHeader(cmmnStage))//
				//.add(createTaskChildrenCompartment(cmmnStage.getTasks(), cmmnStage))
				//.add(createEventListenerChildrenCompartment(cmmnStage.getEventListeners(), cmmnStage))
				//.add(createDecoratorChildrenCompartment(cmmnStage.getDecorators(), cmmnStage));
				.add(createChildrenCompartment(allChildren, cmmnStage));
		applyShapeData(cmmnStage, b);

		return b.build();
	}

	public GNode create(Task cmmnTask) {
		String role = Types.TASK_PROCESS;
		if(cmmnTask.getTaskRole() == TaskRole.HUMAN) role = Types.TASK_HUMAN;
		GNodeBuilder b = new GNodeBuilder(role) //
				.id(toId(cmmnTask)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.TASK) //
				.add(createDecoratorChildrenCompartment(cmmnTask.getDecorators(), cmmnTask))
				.add(buildHeader(cmmnTask));

		applyShapeData(cmmnTask, b);
		return b.build();
	}

	public GNode create(EventListener cmmnTask) {
		GNodeBuilder b = new GNodeBuilder(Types.EVENTLISTENER) //
				.id(toId(cmmnTask)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.ICON) //
				.add(buildHeader(cmmnTask));

		applyShapeData(cmmnTask, b);
		return b.build();
	}
	
	public GNode create(CaseFile caseFile) {
		GNodeBuilder b = new GNodeBuilder(Types.CASEFILE) //
				.id(toId(caseFile)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.ICON) //
				.add(buildHeader(caseFile));

		applyShapeData(caseFile, b);
		return b.build();
	}
	
	public GNode create(MandatoryDecorator mandatoryDecorator) {
		GNodeBuilder b = new GNodeBuilder(Types.MANDATORYDECORATOR) //
				.id(toId(mandatoryDecorator)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.TASK) //
				.add(buildHeader(mandatoryDecorator));

		applyShapeData(mandatoryDecorator, b);
		return b.build();
	}
	
	public GNode create(HTTPHookDecorator httpHookDecorator) {
		GNodeBuilder b = new GNodeBuilder(Types.HTTPDECORATOR) //
				.id(toId(httpHookDecorator)) //
				.layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions().resizeContainer(true)) //
				.addCssClass(CSS.ICON) //
				.add(buildHTTPHook(httpHookDecorator));//

		applyShapeData(httpHookDecorator, b);
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
		String name = "UnkownNode";
		if (element instanceof Stage) {
			name = ((Stage) element).getName();
		} else if (element instanceof Task) {
			name = ((Task) element).getName();
		} else if (element instanceof EventListener) {
			name = ((EventListener) element).getName();
		} else if (element instanceof Case) {
			name = ((Case) element).getName();
		} else if (element instanceof CaseFile) {
			name = ((CaseFile) element).getName();
		}
		return new GCompartmentBuilder(Types.COMP_HEADER) //
				.layout("hbox") //
				.layoutOptions(new GLayoutOptions() //
						.hAlign(GConstants.HAlign.LEFT) //
						.vAlign(GConstants.VAlign.TOP)
						.resizeContainer(true)) //
				.id(toId(element) + "_header") //
				.add(new GLabelBuilder(Types.LABEL_NAME) //
						.id(toId(element) + "_header_label").text(name) //
						.build()) //
				.build();
	}
	
	private GCompartment buildHTTPHook(HTTPHookDecorator element) {
		return new GCompartmentBuilder(Types.COMP_HEADER) //
				.layout("hbox") //
				.layoutOptions(new GLayoutOptions() //
						.hAlign(GConstants.HAlign.CENTER) //
						.vAlign(GConstants.VAlign.TOP)
						.resizeContainer(true)) //
				.id(toId(element) + "_header") //
				.add(new GLabelBuilder(Types.HTTPDECORATORICON) //
						.id(toId(element) + "_icon") //
						.build()) //
				.add(new GLabelBuilder(Types.LABEL_REQUEST) //
						.id(toId(element) + "_request_label").text(element.getRequest().toString()) //
						.build()) //
				.add(new GLabelBuilder(Types.LABEL_TEXT) //
						.id(toId(element) + "_divider_label").text("->") //
						.build())
				.add(new GLabelBuilder(Types.LABEL_VALUE) //
						.id(toId(element) + "_value_label").text(element.getValue()) //
						.build())
				.build();
	}
	
	private GCompartment createChildrenCompartment(Collection<? extends EObject> children, CMMNElement parent) {
		return new GCompartmentBuilder(Types.COMP)
				.id(toId(parent) + "_ChildCompartment")
				.addAll(children.stream() //
						.map(parentFactory::create) //
						.collect(Collectors.toList()))
				.build();
	}
	
	private GCompartment createStageChildrenCompartment(Collection<? extends EObject> children, CMMNElement parent) {
		return new GCompartmentBuilder(Types.COMP)
				.id(toId(parent) + "_StageCompartment").layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions() //
						.hAlign(GConstants.HAlign.LEFT) //
						.resizeContainer(true)) //
				.addAll(children.stream() //
						.map(parentFactory::create) //
						.collect(Collectors.toList()))
				.build();
	}

	private GCompartment createTaskChildrenCompartment(Collection<? extends EObject> children, CMMNElement parent) {
		return new GCompartmentBuilder(Types.COMP) //
				.id(toId(parent) + "_taskCompartment").layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions() //
						.hAlign(GConstants.HAlign.LEFT) //
						.resizeContainer(true)) //
				.addAll(children.stream() //
						.map(parentFactory::create) //
						.collect(Collectors.toList()))
				.build();
	}
	
	private GCompartment createEventListenerChildrenCompartment(Collection<? extends EObject> children, CMMNElement parent) {
		return new GCompartmentBuilder(Types.COMP) //
				.id(toId(parent) + "_eventListenerCompartment").layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions() //
						.hAlign(GConstants.HAlign.LEFT) //
						.resizeContainer(true)) //
				.addAll(children.stream() //
						.map(parentFactory::create) //
						.collect(Collectors.toList()))
				.build();
	}
	
	private GCompartment createCaseFileChildrenCompartment(EObject child, CMMNElement parent) {
		if(child == null) {
			return new GCompartmentBuilder(Types.COMP) //
					.id(toId(parent) + "_caseFileCompartment")
					.layoutOptions(new GLayoutOptions() //
							.hAlign(GConstants.HAlign.LEFT) //
							.resizeContainer(true)) //
					.build();
		}else {
			return new GCompartmentBuilder(Types.COMP) //
					.id(toId(parent) + "_caseFileCompartment")
					.layoutOptions(new GLayoutOptions() //
							.hAlign(GConstants.HAlign.LEFT) //
							.resizeContainer(true)) //
					.add(parentFactory.create(child))
					.build();
		}
	}
	
	private GCompartment createDecoratorChildrenCompartment(Collection<? extends EObject> children, CMMNElement parent) {
		return new GCompartmentBuilder(Types.COMP) //
				.id(toId(parent) + "_decoratorCompartment").layout(GConstants.Layout.VBOX) //
				.layoutOptions(new GLayoutOptions() //
						.hAlign(GConstants.HAlign.CENTER) //
						.vAlign(GConstants.VAlign.BOTTOM)
						.resizeContainer(true)) //
				.addAll(children.stream() //
						.map(parentFactory::create) //
						.collect(Collectors.toList()))
				.build();
	}
	
}
