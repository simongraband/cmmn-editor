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
import { EnableToolPaletteAction } from "@eclipse-glsp/client";
import {
    GLSPDiagramManager,
    GLSPDiagramWidget,
    GLSPTheiaSprottyConnector,
    GLSPTheiaDiagramServer,
    GLSPNotificationManager
} from "@eclipse-glsp/theia-integration/lib/browser";
import { MessageService } from "@theia/core";
import { WidgetManager } from "@theia/core/lib/browser";
import { EditorManager } from "@theia/editor/lib/browser";
import { inject, injectable } from "inversify";
import { DiagramServer, ModelSource, RequestModelAction, TYPES } from "sprotty";
import { DiagramWidget, DiagramWidgetOptions, TheiaFileSaver } from "sprotty-theia";

import { CMMNLanguage } from "../../common/cmmn-language";
import { CMMNGLSPDiagramClient } from "./cmmn-glsp-diagram-client";


@injectable()
export class CMMNDiagramManager extends GLSPDiagramManager {
    readonly diagramType = CMMNLanguage.DiagramType;
    readonly iconClass = "fa fa-project-diagram";
    readonly label = CMMNLanguage.Label + " Editor";

    private _diagramConnector: GLSPTheiaSprottyConnector;

    async createWidget(options?: any): Promise<DiagramWidget> {
        if (DiagramWidgetOptions.is(options)) {
            const clientId = this.createClientId();
            const config = this.diagramConfigurationRegistry.get(options.diagramType);
            const diContainer = config.createContainer(clientId);
            const diagramWidget = new CMMNDiagramWidget(options, clientId + '_widget', diContainer, this.editorPreferences, this.diagramConnector);
            return diagramWidget;
        }
        throw Error('DiagramWidgetFactory needs DiagramWidgetOptions but got ' + JSON.stringify(options));
    }
    constructor(
        @inject(CMMNGLSPDiagramClient) diagramClient: CMMNGLSPDiagramClient,
        @inject(TheiaFileSaver) fileSaver: TheiaFileSaver,
        @inject(WidgetManager) widgetManager: WidgetManager,
        @inject(EditorManager) editorManager: EditorManager,
        @inject(MessageService) messageService: MessageService,
        @inject(GLSPNotificationManager) notificationManager: GLSPNotificationManager) {
        super();
        this._diagramConnector = new GLSPTheiaSprottyConnector({ diagramClient,
            fileSaver, editorManager, widgetManager, diagramManager: this, messageService, notificationManager });
    }

    get fileExtensions() {
        return [CMMNLanguage.FileExtension];
    }
    get diagramConnector() {
        return this._diagramConnector;
    }
}

export class CMMNDiagramWidget extends GLSPDiagramWidget {
    protected initializeSprotty() {
        const modelSource = this.diContainer.get<ModelSource>(TYPES.ModelSource);
        if (modelSource instanceof DiagramServer)
            modelSource.clientId = this.id;
        if (modelSource instanceof GLSPTheiaDiagramServer && this.connector)
            this.connector.connect(modelSource);
        this.disposed.connect(() => {
            if (modelSource instanceof GLSPTheiaDiagramServer && this.connector)
                this.connector.disconnect(modelSource);
        });

        this.actionDispatcher.dispatch(new RequestModelAction({
            sourceUri: this.options.uri.replace("file://", ""),
            needsClientLayout: `${this.viewerOptions.needsClientLayout}`,
            ...this.options
        }));
        this.actionDispatcher.dispatch(new EnableToolPaletteAction());
    }
}