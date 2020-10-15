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
import { LaunchOptions } from "@eclipse-emfcloud/modelserver-theia";
import { BackendApplicationContribution } from "@theia/core/lib/node";
import { LanguageServerContribution } from "@theia/languages/lib/node";
import { ContainerModule, injectable } from "inversify";
import { GLSPServerContribution } from "@eclipse-glsp/theia-integration/lib/node";

import { CMMNGLSPServerContribution } from "./cmmn-glsp-server-contribution";
import {GLSPLaunchOptions, GLSPServerLauncher} from "./glsp-server-launcher";
import { join, resolve } from "path";

@injectable()
export class CMMNGlspLaunchOptions implements GLSPLaunchOptions {
    isRunning = true;
    hostname = "localhost";
    jarPath = resolve(join(__dirname, "..", "..", "build", "org.eclipse.emfcloud.cmmn.glsp-0.0.1-glsp.jar"));
    serverPort = 5007;
}

@injectable()
export class CMMNModelServerLaunchOptions implements LaunchOptions {
    isRunning = true;
    baseURL = "api/v1/";
    serverPort = 8081;
    hostname = "localhost";
    jarPath = resolve(join(__dirname, "..", "..", "build", "org.eclipse.emfcloud.cmmn.modelserver-0.0.1-SNAPSHOT-standalone.jar"));
    additionalArgs = [
        "--errorsOnly",
        `-r=${resolve(join(__dirname, "..", "..", "..", "workspace"))}`
    ];
}

export default new ContainerModule((bind, _unbind, isBound, rebind) => {
    if (isBound(LaunchOptions)) {
        rebind(LaunchOptions).to(CMMNModelServerLaunchOptions).inSingletonScope();
    } else {
        bind(LaunchOptions).to(CMMNModelServerLaunchOptions).inSingletonScope();
    }

    bind(GLSPLaunchOptions).to(CMMNGlspLaunchOptions).inSingletonScope();
    
    bind(GLSPServerContribution).to(CMMNGLSPServerContribution).inSingletonScope();
    bind(LanguageServerContribution).to(CMMNGLSPServerContribution).inSingletonScope();
    bind(BackendApplicationContribution).to(GLSPServerLauncher);
});
