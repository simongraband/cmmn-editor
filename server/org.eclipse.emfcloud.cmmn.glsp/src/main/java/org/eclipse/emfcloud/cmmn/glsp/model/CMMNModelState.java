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
package org.eclipse.emfcloud.cmmn.glsp.model;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.ResourceManager;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.model.GModelStateImpl;

public class CMMNModelState extends GModelStateImpl implements GModelState {

	private CMMNEditorContext editorContext;
	private CMMNModelServerAccess modelServerAccess;

	public static CMMNModelState getModelState(GModelState state) {
		if (!(state instanceof CMMNModelState)) {
			throw new IllegalArgumentException("Argument must be a ModelServer aware EcoreModelState");
		}
		return ((CMMNModelState) state);
	}

	
	public static CMMNEditorContext getEditorContext(GModelState state) {
		return getModelState(state).getEditorContext();
	}
	public static ResourceManager getResourceManager(GModelState modelState) {
		return getEditorContext(modelState).getResourceManager();
	}
	public static CMMNFacade getCMMNFacade(GModelState modelState) {
		return getEditorContext(modelState).getCMMNFacade();
	}
	public CMMNEditorContext getEditorContext() {
		return editorContext;
	}
	public void setEditorContext(CMMNEditorContext editorContext) {
		this.editorContext = editorContext;
		setCommandStack((BasicCommandStack) editorContext.getResourceManager().getEditingDomain().getCommandStack());
	}

	public static CMMNModelServerAccess getModelServerAccess(GModelState state) {
		return getModelState(state).getModelServerAccess();
	}

	public void setModelServerAccess(CMMNModelServerAccess modelServerAccess) {
		this.modelServerAccess = modelServerAccess;
	}

	public CMMNModelServerAccess getModelServerAccess() {
		return modelServerAccess;
	}

	@Override
	public CMMNModelIndex getIndex() {
		return CMMNModelIndex.get(getRoot());
	}
}
