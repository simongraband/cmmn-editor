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
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNSaveModelActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNUndoRedoActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelFactory;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelStateProvider;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CMMNDeleteOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.ChangeBoundsOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateNodeChildOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateNodeOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateSentryOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.LabelEditOperationHandler;
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
import org.eclipse.glsp.server.actionhandler.SaveModelActionHandler;
import org.eclipse.glsp.server.actionhandler.UndoRedoActionHandler;
import org.eclipse.glsp.server.di.DefaultGLSPModule;
import org.eclipse.glsp.server.di.MultiBindConfig;
import org.eclipse.glsp.server.operationhandler.LayoutOperationHandler;

public class CMMNGLSPModule extends DefaultGLSPModule {

	@Override
	protected void configureActionHandlers(MultiBindConfig<ActionHandler> bindings) {
		super.configureActionHandlers(bindings);
		bindings.rebind(OperationActionHandler.class, CMMNOperationActionHandler.class);
		bindings.rebind(SaveModelActionHandler.class, CMMNSaveModelActionHandler.class);
		bindings.rebind(UndoRedoActionHandler.class, CMMNUndoRedoActionHandler.class);
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
		bindings.add(CreateNodeChildOperationHandler.class);
		bindings.add(CreateSentryOperationHandler.class);
		bindings.add(CMMNDeleteOperationHandler.class);
		bindings.add(ChangeBoundsOperationHandler.class);
		bindings.add(LabelEditOperationHandler.class);
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
