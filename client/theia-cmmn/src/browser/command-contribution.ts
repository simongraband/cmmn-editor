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
    FrontendApplication,
    OpenerService,
    QuickOpenService
} from "@theia/core/lib/browser";
import { Command, CommandContribution, CommandRegistry } from "@theia/core/lib/common/command";
import { MessageService } from "@theia/core/lib/common/message-service";
import { ProgressService } from "@theia/core/lib/common/progress-service";
import { SelectionService } from "@theia/core/lib/common/selection-service";
import URI from "@theia/core/lib/common/uri";
import { UriAwareCommandHandler, UriCommandHandler } from "@theia/core/lib/common/uri-command-handler";
import { EDITOR_CONTEXT_MENU } from "@theia/editor/lib/browser";
import { FileDialogService } from "@theia/filesystem/lib/browser";
import { FileStat, FileSystem } from "@theia/filesystem/lib/common/filesystem";
import { NAVIGATOR_CONTEXT_MENU } from "@theia/navigator/lib/browser/navigator-contribution";
import { WorkspaceService } from "@theia/workspace/lib/browser";
import { inject, injectable } from "inversify";
import { ToggleValidationAction } from "sprotty-cmmn/lib/features/model-validation";
import { DiagramManagerProvider, DiagramWidget } from "@eclipse-glsp/theia-integration/lib/browser";
import { CMMNDiagramManager } from "./diagram/cmmn-diagram-manager";
//import { ReturnToggleValidationAction, ToggleValidationAction} from "../../../sprotty-cmmn/lib/features/model-validation";

export const EXAMPLE_NAVIGATOR = [...NAVIGATOR_CONTEXT_MENU, "example"];
export const EXAMPLE_EDITOR = [...EDITOR_CONTEXT_MENU, "example"];

export const TOGGLE_CONSTRAINT: Command = {
    id: "validation.toggleConstraint",
    category: "Validation",
    label: "Toggle (Object is unused) Warning"
};

@injectable()
export class CMMNCommandContribution implements CommandContribution {

    protected types = false;

    @inject(FileSystem) protected readonly fileSystem: FileSystem;
    @inject(SelectionService) protected readonly selectionService: SelectionService;
    @inject(OpenerService) protected readonly openerService: OpenerService;
    @inject(FrontendApplication) protected readonly app: FrontendApplication;
    @inject(MessageService) protected readonly messageService: MessageService;
    @inject(FileDialogService) protected readonly fileDialogService: FileDialogService;
    @inject(WorkspaceService) protected readonly workspaceService: WorkspaceService;
    @inject(ProgressService) protected readonly progressService: ProgressService;
    @inject(QuickOpenService) protected readonly quickOpenService: QuickOpenService;
    @inject(DiagramManagerProvider) protected readonly diagramManagerProvider: DiagramManagerProvider;

    registerCommands(registry: CommandRegistry): void {
        registry.registerCommand(TOGGLE_CONSTRAINT, this.newWorkspaceRootUriAwareCommandHandler({
            execute: uri => this.getDirectory(uri).then(parent => {

            this.diagramManagerProvider().then(provider => {
                            const myprovider = provider as CMMNDiagramManager;
                            const widget = myprovider.diagramConnector.widgetManager.getWidgets(provider.id)[0] as DiagramWidget;
                            widget.actionDispatcher.dispatch(new ToggleValidationAction());
            });

        }),
        }));
    }

    protected withProgress<T>(task: () => Promise<T>): Promise<T> {
        return this.progressService.withProgress("", "scm", task);
    }

    protected newUriAwareCommandHandler(handler: UriCommandHandler<URI>): UriAwareCommandHandler<URI> {
        return new UriAwareCommandHandler(this.selectionService, handler);
    }

    protected newMultiUriAwareCommandHandler(handler: UriCommandHandler<URI[]>): UriAwareCommandHandler<URI[]> {
        return new UriAwareCommandHandler(this.selectionService, handler, { multi: true });
    }

    protected newWorkspaceRootUriAwareCommandHandler(handler: UriCommandHandler<URI>): WorkspaceRootUriAwareCommandHandler {
        return new WorkspaceRootUriAwareCommandHandler(this.workspaceService, this.selectionService, handler);
    }

    protected async getDirectory(candidate: URI): Promise<FileStat | undefined> {
        const stat = await this.fileSystem.getFileStat(candidate.toString());
        if (stat && stat.isDirectory) {
            return stat;
        }
        return this.getParent(candidate);
    }

    protected getParent(candidate: URI): Promise<FileStat | undefined> {
        return this.fileSystem.getFileStat(candidate.parent.toString());
    }
}

export class WorkspaceRootUriAwareCommandHandler extends UriAwareCommandHandler<URI> {

    constructor(
        protected readonly workspaceService: WorkspaceService,
        protected readonly selectionService: SelectionService,
        protected readonly handler: UriCommandHandler<URI>
    ) {
        super(selectionService, handler);
    }

    public isEnabled(...args: any[]): boolean {
        return super.isEnabled(...args) && !!this.workspaceService.tryGetRoots().length;
    }

    public isVisible(...args: any[]): boolean {
        return super.isVisible(...args) && !!this.workspaceService.tryGetRoots().length;
    }

    protected getUri(...args: any[]): URI | undefined {
        const uri = super.getUri(...args);
        // If the URI is available, return it immediately.
        if (uri) {
            return uri;
        }
        // Return the first root if available.
        if (this.workspaceService.tryGetRoots().length) {
            return new URI(this.workspaceService.tryGetRoots()[0].uri);
        }
        return undefined;
    }
}
