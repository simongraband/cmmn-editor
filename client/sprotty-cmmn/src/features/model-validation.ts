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
import { generateRequestId, GLSPActionDispatcher, RequestAction, ResponseAction, TYPES } from "@eclipse-glsp/client/lib";
import { inject, injectable } from "inversify";
import { EditLabelUI} from "sprotty/lib";

@injectable()
export class EditLabelUIModelValidation extends EditLabelUI {

    protected showAutocomplete = false;
    protected outerDiv: HTMLElement;
    protected listContainer: HTMLElement;
    protected currentFocus: number;
    protected types = false;

    constructor(@inject(TYPES.IActionDispatcher) protected actionDispatcher: GLSPActionDispatcher) {
        super();
    }

    protected validateLabelIfContentChange(event: KeyboardEvent, value: string) {
        super.validateLabelIfContentChange(event, value);
    }
} 

export class ToggleValidationAction  implements RequestAction<ReturnToggleValidationAction> {
    static readonly KIND = "toggleValidation";
    kind = ToggleValidationAction.KIND;
    constructor(public readonly requestId: string = generateRequestId()) { }
}

export class ReturnToggleValidationAction implements ResponseAction {
    static readonly KIND = "returnToggleValidation";
    kind = ReturnToggleValidationAction.KIND;
    types: boolean;
    constructor(public readonly actions: boolean, public readonly responseId: string = "") {
        this.types = actions;
    }
}
