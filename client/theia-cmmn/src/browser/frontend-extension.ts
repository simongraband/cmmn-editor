/* eslint-disable*/
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
import { GLSPClientContribution } from "@eclipse-glsp/theia-integration/lib/browser";
import {
    FrontendApplicationContribution,
    OpenHandler,
    WebSocketConnectionProvider,
    WidgetFactory
} from "@theia/core/lib/browser";
import { ContainerModule, interfaces } from "inversify";
import { DiagramConfiguration, DiagramManager, DiagramManagerProvider } from "sprotty-theia/lib";
import { FILEGEN_SERVICE_PATH, FileGenServer } from "../common/generate-protocol";
import { CMMNDiagramConfiguration } from "./diagram/cmmn-diagram-configuration";
import { CMMNDiagramManager } from "./diagram/cmmn-diagram-manager";
import { CMMNGLSPDiagramClient } from "./diagram/cmmn-glsp-diagram-client";
import { CMMNGLSPClientContribution } from "./cmmn-glsp-contribution";
import { CMMNCommandContribution } from "./command-contribution";
import { CommandContribution } from "@theia/core";

export default new ContainerModule((bind: interfaces.Bind, unbind: interfaces.Unbind, isBound: interfaces.IsBound, rebind: interfaces.Rebind) => {
    bind(CMMNGLSPClientContribution).toSelf().inSingletonScope();
    bind(GLSPClientContribution).toService(CMMNGLSPClientContribution);
    bind(CMMNGLSPDiagramClient).toSelf().inSingletonScope();
    bind(DiagramConfiguration).to(CMMNDiagramConfiguration).inSingletonScope();
    bind(CMMNDiagramManager).toSelf().inSingletonScope();
    bind(FrontendApplicationContribution).toService(CMMNDiagramManager);
    bind(OpenHandler).toService(CMMNDiagramManager);
    bind(CommandContribution).to(CMMNCommandContribution);
    bind(WidgetFactory).toService(CMMNDiagramManager);
    bind(DiagramManagerProvider).toProvider<DiagramManager>(context => {
        return () => {
            return new Promise<DiagramManager>(resolve => {
                const diagramManager = context.container.get<CMMNDiagramManager>(CMMNDiagramManager);
                resolve(diagramManager);
            });
        };
    });
    bind(FileGenServer).toDynamicValue(ctx => {
        const connection = ctx.container.get(WebSocketConnectionProvider);
        return connection.createProxy<FileGenServer>(FILEGEN_SERVICE_PATH);
    }).inSingletonScope();
});
