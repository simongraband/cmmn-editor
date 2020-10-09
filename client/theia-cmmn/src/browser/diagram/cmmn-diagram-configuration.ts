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
import { TYPES} from "@eclipse-glsp/client/lib";
import { SelectionService } from "@theia/core";
import { ExternalNavigateToTargetHandler } from "@eclipse-glsp/client/lib";
import { Container, inject, injectable } from "inversify";
import { createCMMNDiagramContainer } from "sprotty-cmmn/lib";
import { DiagramConfiguration, TheiaDiagramServer, TheiaSprottySelectionForwarder } from "sprotty-theia/lib";
import {
    connectTheiaMarkerManager,
    TheiaMarkerManager,
    TheiaMarkerManagerFactory
} from "@eclipse-glsp/theia-integration/lib/browser/diagram/glsp-theia-marker-manager";
import { CMMNLanguage } from "../../common/cmmn-language";
import { CMMNGLSPTheiaDiagramServer } from "./cmmn-glsp-theia-diagram-server";
import { TheiaNavigateToTargetHandler } from "@eclipse-glsp/theia-integration/lib/browser";

@injectable()
export class CMMNDiagramConfiguration implements DiagramConfiguration {
    @inject(SelectionService) protected selectionService: SelectionService;
    @inject(TheiaNavigateToTargetHandler) protected navigateToTargetHandler: TheiaNavigateToTargetHandler;
    @inject(TheiaMarkerManagerFactory) protected readonly theiaMarkerManager: () => TheiaMarkerManager;
    diagramType: string = CMMNLanguage.DiagramType;

    createContainer(widgetId: string): Container {
        const container = createCMMNDiagramContainer(widgetId);
        container.bind(TYPES.ModelSource).to(CMMNGLSPTheiaDiagramServer).inSingletonScope();
        container.bind(TheiaDiagramServer).toService(CMMNGLSPTheiaDiagramServer);
        //container.rebind(KeyTool).to(TheiaKeyTool).inSingletonScope()
        container.bind(TYPES.IActionHandlerInitializer).to(TheiaSprottySelectionForwarder);
        container.bind(ExternalNavigateToTargetHandler).toConstantValue(this.navigateToTargetHandler);
        container.bind(SelectionService).toConstantValue(this.selectionService);
        connectTheiaMarkerManager(container, this.theiaMarkerManager, this.diagramType);
        return container;
    }
}
