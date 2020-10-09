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
import { BaseGLSPClientContribution } from "@eclipse-glsp/theia-integration/lib/browser";
import { injectable } from "inversify";

import { CMMNLanguage } from "../common/cmmn-language";

export interface CMMNInitializeOptions {
    timestamp: Date;
}

@injectable()
export class CMMNGLSPClientContribution extends BaseGLSPClientContribution {

    readonly fileExtensions = [CMMNLanguage.FileExtension];
    readonly id = CMMNLanguage.Id;
    readonly name = CMMNLanguage.Name;

    protected async createInitializeOptions(): Promise<CMMNInitializeOptions> {

        return {
            timestamp: new Date()
        };
    }
}
