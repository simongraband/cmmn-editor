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

import {
    boundsModule,
    buttonModule,
    commandPaletteModule,
    configureModelElement,
    configureViewerOptions,
    ConsoleLogger,
    decorationModule,
    defaultGLSPModule,
    defaultModule,
    edgeLayoutModule,
    expandModule,
    exportModule,
    fadeModule,
    glspCommandPaletteModule,
    glspEditLabelValidationModule,
    GLSPGraph,
    glspMouseToolModule,
    glspSelectModule,
    HtmlRoot,
    HtmlRootView,
    labelEditModule,
    labelEditUiModule,
    layoutCommandsModule,
    LogLevel,
    modelHintsModule,
    modelSourceModule,
    openModule,
    paletteModule,
    PolylineEdgeView,
    RectangularNodeView,
    requestResponseModule,
    routingModule,
    saveModule,
    SCompartment,
    SCompartmentView,
    SEdge,
    SGraphView,
    SLabel,
    SLabelView,
    SNode,
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
    EditLabelUI
} from "@eclipse-glsp/client/lib";
import executeCommandModule from "@eclipse-glsp/client/lib/features/execute/di.config";
import { Container, ContainerModule } from "inversify";
import { contextMenuModule } from "sprotty/lib";

import { LabelSelectionFeedback } from "./feedback";
import {
    ArrowEdge,
    LabeledNode,
    SEditableLabel
} from "./model";
import {
    ArrowEdgeView,
    StageNodeView,
    TaskNodeView,
    CaseNodeView
} from "./views";
import { EditLabelUIModelValidation } from "./features/model-validation";

export default (containerId: string) => {
    const classDiagramModule = new ContainerModule((bind, unbind, isBound, rebind) => {
        rebind(TYPES.ILogger).to(ConsoleLogger).inSingletonScope();
        rebind(TYPES.LogLevel).toConstantValue(LogLevel.info);
        rebind(EditLabelUI).to(EditLabelUIModelValidation);

        const context = { bind, unbind, isBound, rebind };
        bind(TYPES.IVNodePostprocessor).to(LabelSelectionFeedback);
        configureModelElement(context, 'graph', GLSPGraph, SGraphView);
        configureModelElement(context, 'node:case', LabeledNode, CaseNodeView);
        configureModelElement(context, 'node:stage', LabeledNode, StageNodeView);
        configureModelElement(context, 'node:task', LabeledNode, TaskNodeView);
        configureModelElement(context, 'label:name', SEditableLabel, SLabelView);
        configureModelElement(context, 'label:edge-name', SEditableLabel, SLabelView);
        configureModelElement(context, 'label:edge-multiplicity', SEditableLabel, SLabelView);
        configureModelElement(context, 'node:event-listener', SNode, RectangularNodeView);
        configureModelElement(context, 'label:text', SLabel, SLabelView);
        configureModelElement(context, 'comp:comp', SCompartment, SCompartmentView);
        configureModelElement(context, 'comp:header', SCompartment, SCompartmentView);
        configureModelElement(context, 'comp:decorator', SCompartment, SCompartmentView);
        configureModelElement(context, 'label:icon', SLabel, SLabelView);
        configureModelElement(context, 'html', HtmlRoot, HtmlRootView);
        configureModelElement(context, 'routing-point', SRoutingHandle, SRoutingHandleView);
        configureModelElement(context, 'volatile-routing-point', SRoutingHandle, SRoutingHandleView);
        configureModelElement(context, 'edge:sentry', ArrowEdge, ArrowEdgeView);
        configureModelElement(context, 'edge', SEdge, PolylineEdgeView);
        configureViewerOptions(context, {
            needsClientLayout: false, //was true
            baseDiv: containerId
        });
    });

    const container = new Container();
    container.load(decorationModule, validationModule, defaultModule, glspMouseToolModule, defaultGLSPModule, glspSelectModule, boundsModule, viewportModule, toolsModule,
        glspHoverModule, fadeModule, exportModule, expandModule, openModule, buttonModule, modelSourceModule, labelEditModule, labelEditUiModule, glspEditLabelValidationModule,
        classDiagramModule, saveModule, executeCommandModule, toolFeedbackModule, modelHintsModule, contextMenuModule, glspContextMenuModule, glspServerCopyPasteModule,
        copyPasteContextMenuModule, commandPaletteModule, glspCommandPaletteModule, paletteModule, requestResponseModule, routingModule, edgeLayoutModule, zorderModule,
        layoutCommandsModule);

    return container;

};
