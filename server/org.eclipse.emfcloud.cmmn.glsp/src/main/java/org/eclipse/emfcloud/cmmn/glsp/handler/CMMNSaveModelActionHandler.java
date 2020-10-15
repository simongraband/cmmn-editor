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
package org.eclipse.emfcloud.cmmn.glsp.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.BasicActionHandler;
import org.eclipse.glsp.server.actions.SaveModelAction;
import org.eclipse.glsp.server.actions.SetDirtyStateAction;
import org.eclipse.glsp.server.features.validation.Marker;
import org.eclipse.glsp.server.model.GModelState;

public class CMMNSaveModelActionHandler extends BasicActionHandler<SaveModelAction> {

	@Override
	protected List<Action> executeAction(SaveModelAction action, GModelState modelState) {
		CMMNModelState.getResourceManager(modelState).save();
		modelState.saveIsDone();

		CMMNEditorContext context = CMMNModelState.getEditorContext(modelState);
		CMMNModelIndex modelIndex = context.getModelState().getIndex();
		List<Marker> markers = new ArrayList<>();

		return List.of(new SetDirtyStateAction(modelState.isDirty())/*,new SetMarkersAction(markers)*/);
	}

}