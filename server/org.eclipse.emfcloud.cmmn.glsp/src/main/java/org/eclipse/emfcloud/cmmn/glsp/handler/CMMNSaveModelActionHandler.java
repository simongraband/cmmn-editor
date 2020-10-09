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
import java.util.Optional;
import java.util.Set;

import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.glsp.api.action.Action;
import org.eclipse.glsp.api.action.kind.SaveModelAction;
import org.eclipse.glsp.api.action.kind.SetDirtyStateAction;
import org.eclipse.glsp.api.action.kind.SetMarkersAction;
import org.eclipse.glsp.api.markers.Marker;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.actionhandler.BasicActionHandler;

public class CMMNSaveModelActionHandler extends BasicActionHandler<SaveModelAction> {

	@Override
	protected List<Action> executeAction(SaveModelAction action, GraphicalModelState modelState) {
		CMMNModelState.getResourceManager(modelState).save();
		modelState.saveIsDone();

		CMMNEditorContext context = CMMNModelState.getEditorContext(modelState);
		CMMNModelIndex modelIndex = context.getModelState().getIndex();
		List<Marker> markers = new ArrayList<>();


		/*
		for(String elementId : modelIndex.allIds()){
			elementId = elementId.substring(0, 35);
			CMMNElement element1 = getOrThrow(modelIndex.getSemantic(modelState.getIndex().get(elementId).get(), CMMNElement.class),
							 "No semantic CMMNElement found for source element with id " + elementId);
			for(String compareId : modelIndex.allIds()){
				compareId = compareId.substring(0, 35);
				if(!elementId.equals(compareId)){
						CMMNElement element2 = getOrThrow(modelIndex.getSemantic(modelState.getIndex().get(compareId).get(), CMMNElement.class),
								"No semantic CMMNElement found for source element with id " + compareId);
						if(element1.getName().equals(element2.getName())){
							Marker marker = new Marker("Error", "Has the same name as "+ compareId, elementId, "error");
							if(!markers.contains(marker)){
								markers.add(marker);
							}
						}
				}
			}
		}*/
		/*for(String elementId : modelState.getIndex().allIds()){
			for(String compareId : modelState.getIndex().allIds()){
				if(!elementId.equals(compareId)){
					if(elementId.getClass().getName().equals(compareId.getClass().getName())){
						Marker marker = new Marker("Error", "Has the same name as "+ compareId, elementId, "error");
							if(!markers.contains(marker)){
								markers.add(marker);
							}
					}
				}
			}
		}*/
		return List.of(new SetDirtyStateAction(modelState.isDirty())/*,new SetMarkersAction(markers)*/);
	}

}