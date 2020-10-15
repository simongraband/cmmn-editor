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
import "@eclipse-glsp/client/css/glsp-sprotty.css";
import "sprotty/css/edit-label.css";

import "balloon-css/balloon.min.css";

import {
    boundsModule,
    buttonModule,
    configureModelElement,
    configureViewerOptions,
    ConsoleLogger,
    defaultGLSPModule,
    defaultModule,
    edgeLayoutModule,
    executeCommandModule,
    expandModule,
    exportModule,
    fadeModule,
    glspCommandPaletteModule,
    GLSPGraph,
    glspMouseToolModule,
    glspDecorationModule,
    glspSelectModule,
    HtmlRoot,
    HtmlRootView,
    labelEditModule,
    labelEditUiModule,
    layoutCommandsModule,
    LogLevel,
    modelHintsModule,
    modelSourceModule,
    markerNavigatorModule,
    navigationModule,
    openModule,
    paletteModule,
    PolylineEdgeView,
    routingModule,
    saveModule,
    SCompartment,
    SEdge,
    SGraphView,
    SLabel,
    SLabelView,
    SRoutingHandle,
    SRoutingHandleView,
    toolFeedbackModule,
    TYPES,
    validationModule,
    viewportModule,
    zorderModule,
    glspHoverModule,
    toolsModule,
    glspServerCopyPasteModule,
    glspContextMenuModule,
    copyPasteContextMenuModule,
    EditLabelUI,
    glspEditLabelModule, PreRenderedElement, PreRenderedView
} from "@eclipse-glsp/client/lib";
import { Container, ContainerModule } from "inversify";

import { LabelSelectionFeedback } from "./feedback";
import {
    ArrowEdge,
    LabeledNode,
    SEditableLabel,
    ActivityNode
} from "./model";
import {
    ExitEdgeView,
    StageNodeView,
    TaskNodeView,
    CaseNodeView,
    EventListenerNodeView, DecoratorNodeView, CaseFileNodeView, HumanTaskNodeView, ProcessTaskNodeView, EntryEdgeView, CustomCompartmentView, IconNodeView
} from "./views";
import { EditLabelUIModelValidation } from "./features/model-validation";

export default (containerId: string) => {
    const classDiagramModule = new ContainerModule((bind, unbind, isBound, rebind) => {
        rebind(TYPES.ILogger).to(ConsoleLogger).inSingletonScope();
        rebind(TYPES.LogLevel).toConstantValue(LogLevel.info);
        rebind(EditLabelUI).to(EditLabelUIModelValidation);

        const context = { bind, unbind, isBound, rebind };
        bind(TYPES.IVNodePostprocessor).to(LabelSelectionFeedback);
        configureModelElement(context, "pre-rendered", PreRenderedElement, PreRenderedView);
        configureModelElement(context, "graph", GLSPGraph, SGraphView);
        configureModelElement(context, "node:case", LabeledNode, CaseNodeView);
        configureModelElement(context, "node:casefile", LabeledNode, CaseFileNodeView);
        configureModelElement(context, "node:stage", LabeledNode, StageNodeView);
        configureModelElement(context, "node:task-human", LabeledNode, HumanTaskNodeView);
        configureModelElement(context, "node:task-process", LabeledNode, ProcessTaskNodeView);
        configureModelElement(context, "node:event-listener", LabeledNode, EventListenerNodeView);
        configureModelElement(context, "label:name", SEditableLabel, SLabelView);
        configureModelElement(context, "label:edge-name", SEditableLabel, SLabelView);
        configureModelElement(context, "label:edge-multiplicity", SEditableLabel, SLabelView);
        configureModelElement(context, "label:request", SEditableLabel, SLabelView);
        configureModelElement(context, "label:value", SEditableLabel, SLabelView);
        configureModelElement(context, "label:text", SLabel, SLabelView);
        configureModelElement(context, "comp:comp", SCompartment, CustomCompartmentView);
        configureModelElement(context, "comp:header", SCompartment, CustomCompartmentView);
        configureModelElement(context, "decorator:http", LabeledNode, TaskNodeView);
        configureModelElement(context, "decorator:mandatory", ActivityNode, DecoratorNodeView);
        configureModelElement(context, "decorator:httpIcon", ActivityNode, IconNodeView);
        configureModelElement(context, "label:icon", SLabel, SLabelView);
        configureModelElement(context, "html", HtmlRoot, HtmlRootView);
        configureModelElement(context, "routing-point", SRoutingHandle, SRoutingHandleView);
        configureModelElement(context, "volatile-routing-point", SRoutingHandle, SRoutingHandleView);
        configureModelElement(context, "edge:sentry-entry", ArrowEdge, EntryEdgeView);
        configureModelElement(context, "edge:sentry-exit", ArrowEdge, ExitEdgeView);
        configureModelElement(context, "edge", SEdge, PolylineEdgeView);
        //configureModelElement(context, "icon:eventlistener", IconEventListener, IconView);
        configureViewerOptions(context, {
            needsClientLayout: false, //was true
            baseDiv: containerId
        });
    });

    const container = new Container();
    container.load(validationModule, defaultModule, glspMouseToolModule, defaultGLSPModule, glspSelectModule, boundsModule, viewportModule, toolsModule,
        glspHoverModule, fadeModule, exportModule, expandModule, openModule, buttonModule, modelSourceModule, labelEditModule, labelEditUiModule, glspEditLabelModule,
        classDiagramModule, saveModule, executeCommandModule, toolFeedbackModule, modelHintsModule, glspContextMenuModule, glspServerCopyPasteModule,
        copyPasteContextMenuModule, navigationModule, glspCommandPaletteModule, paletteModule, routingModule, edgeLayoutModule, zorderModule,
        layoutCommandsModule, markerNavigatorModule, glspDecorationModule);

    return container;

};
