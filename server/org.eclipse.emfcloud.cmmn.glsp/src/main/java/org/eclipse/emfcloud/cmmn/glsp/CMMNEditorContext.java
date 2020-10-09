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
package org.eclipse.emfcloud.cmmn.glsp;

import org.eclipse.emfcloud.cmmn.glsp.gmodel.GModelFactory;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;

public class CMMNEditorContext {
	private final ResourceManager resourceManager;
	private final GModelFactory gModelFactory;
	private final CMMNModelState modelState;

	public CMMNEditorContext(CMMNModelState modelState) {
		this.modelState = modelState;
		gModelFactory = new GModelFactory(modelState);
		resourceManager = new ResourceManager(modelState);
	}

	public CMMNFacade getCMMNFacade() {
		return resourceManager.getCMMNFacade();
	}

	public ResourceManager getResourceManager() {
		return resourceManager;
	}

	public GModelFactory getGModelFactory() {
		return gModelFactory;
	}

	public CMMNModelState getModelState() {
		return modelState;
	}

}
