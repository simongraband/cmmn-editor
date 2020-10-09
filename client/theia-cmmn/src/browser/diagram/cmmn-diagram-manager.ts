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
import {
    GLSPDiagramManager,
    GLSPTheiaSprottyConnector,
    GLSPNotificationManager
} from "@eclipse-glsp/theia-integration/lib/browser";
import { MessageService } from "@theia/core";
import { WidgetManager } from "@theia/core/lib/browser";
import { EditorManager } from "@theia/editor/lib/browser";
import { inject, injectable } from "inversify";
import { TheiaFileSaver } from "sprotty-theia";

import { CMMNLanguage } from "../../common/cmmn-language";
import { CMMNGLSPDiagramClient } from "./cmmn-glsp-diagram-client";

@injectable()
export class CMMNDiagramManager extends GLSPDiagramManager {
    readonly diagramType = CMMNLanguage.DiagramType;
    readonly iconClass = "fa fa-project-diagram";
    readonly label = CMMNLanguage.Label + " Editor";

    private _diagramConnector: GLSPTheiaSprottyConnector;

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
