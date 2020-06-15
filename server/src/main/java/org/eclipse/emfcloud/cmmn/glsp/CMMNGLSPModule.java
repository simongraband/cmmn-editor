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

import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNOperationActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelFactory;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelStateProvider;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.ChangeBoundsOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateNodeOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.palette.CMMNToolPaletteItemProvider;
import org.eclipse.emfcloud.cmmn.glsp.registry.CMMNDIOperationHandlerRegistry;
import org.eclipse.glsp.api.action.Action;
import org.eclipse.glsp.api.configuration.ServerConfiguration;
import org.eclipse.glsp.api.diagram.DiagramConfiguration;
import org.eclipse.glsp.api.factory.ModelFactory;
import org.eclipse.glsp.api.handler.ActionHandler;
import org.eclipse.glsp.api.handler.OperationHandler;
import org.eclipse.glsp.api.layout.ILayoutEngine;
import org.eclipse.glsp.api.model.ModelStateProvider;
import org.eclipse.glsp.api.provider.ToolPaletteItemProvider;
import org.eclipse.glsp.api.registry.OperationHandlerRegistry;
import org.eclipse.glsp.server.actionhandler.OperationActionHandler;
import org.eclipse.glsp.server.di.DefaultGLSPModule;
import org.eclipse.glsp.server.di.MultiBindConfig;
import org.eclipse.glsp.server.operationhandler.LayoutOperationHandler;

public class CMMNGLSPModule extends DefaultGLSPModule {

	@Override
	protected void configureActionHandlers(MultiBindConfig<ActionHandler> bindings) {
		super.configureActionHandlers(bindings);
		bindings.rebind(OperationActionHandler.class, CMMNOperationActionHandler.class);
	}
	
	@Override
	protected void configureActions(MultiBindConfig<Action> bindings) {
		super.configureActions(bindings);
	}

	@Override
	public Class<? extends ModelFactory> bindModelFactory() {
		return CMMNModelFactory.class;
	}

	@Override
	protected Class<? extends ILayoutEngine> bindLayoutEngine() {
		return CMMNLayoutEngine.class;
	}
	
	@Override
	protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
		return CMMNToolPaletteItemProvider.class;
	}
	
	@Override
	protected Class<? extends OperationHandlerRegistry> bindOperationHandlerRegistry() {
		return CMMNDIOperationHandlerRegistry.class;
	}

	@Override
	protected void configureOperationHandlers(MultiBindConfig<OperationHandler> bindings) {
		bindings.add(LayoutOperationHandler.class);
		bindings.add(CreateNodeOperationHandler.class);
		bindings.add(ChangeBoundsOperationHandler.class);
	}

	@Override
	protected Class<? extends ServerConfiguration> bindServerConfiguration() {
		return CMMNServerConfiguration.class;
	}

	@Override
	protected Class<? extends ModelStateProvider> bindModelStateProvider() {
		return CMMNModelStateProvider.class;
	}

	@Override
	protected void configureDiagramConfigurations(MultiBindConfig<DiagramConfiguration> bindings) {
		bindings.add(CMMNDiagramConfiguration.class);
	}

}
