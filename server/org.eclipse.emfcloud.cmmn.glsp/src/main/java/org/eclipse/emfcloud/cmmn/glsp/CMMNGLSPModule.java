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

import org.eclipse.emfcloud.cmmn.glsp.actions.ReturnToggleValidationAction;
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNOperationActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNRequestContextActionsHandler;
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNRequestMarkersActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNSaveModelActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNToggleValidationActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.handler.CMMNUndoRedoActionHandler;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelFactory;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelStateProvider;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CMMNDeleteOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.ChangeBoundsOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.ChangeRoutingPointsOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateNodeChildOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateNodeOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateSentryOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.LabelEditOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.palette.CMMNToolPaletteItemProvider;
import org.eclipse.emfcloud.cmmn.glsp.registry.CMMNDIOperationHandlerRegistry;
import org.eclipse.emfcloud.modelserver.edit.CommandCodec;
import org.eclipse.emfcloud.modelserver.edit.DefaultCommandCodec;
import org.eclipse.glsp.server.DefaultGLSPModule;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.ActionHandler;
import org.eclipse.glsp.server.actions.DisposeClientSessionActionHandler;
import org.eclipse.glsp.server.actions.SaveModelActionHandler;
import org.eclipse.glsp.server.actions.UndoRedoActionHandler;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.factory.ModelFactory;
import org.eclipse.glsp.server.features.contextactions.RequestContextActionsHandler;
import org.eclipse.glsp.server.features.contextmenu.ContextMenuItemProvider;
import org.eclipse.glsp.server.features.directediting.LabelEditValidator;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.features.validation.RequestMarkersHandler;
import org.eclipse.glsp.server.internal.action.DefaultActionDispatcher;
import org.eclipse.glsp.server.layout.ServerLayoutConfiguration;
import org.eclipse.glsp.server.model.ModelStateProvider;
import org.eclipse.glsp.server.operations.OperationActionHandler;
import org.eclipse.glsp.server.operations.OperationHandler;
import org.eclipse.glsp.server.operations.OperationHandlerRegistry;
import org.eclipse.glsp.server.operations.gmodel.LayoutOperationHandler;
import org.eclipse.glsp.server.protocol.GLSPServer;
import org.eclipse.glsp.server.utils.MultiBinding;

public class CMMNGLSPModule extends DefaultGLSPModule {

	@Override
	protected void configureActionHandlers(MultiBinding<ActionHandler> bindings) {
		super.configureActionHandlers(bindings);
		bindings.rebind(RequestContextActionsHandler.class, CMMNRequestContextActionsHandler.class);
		bindings.rebind(OperationActionHandler.class, CMMNOperationActionHandler.class);
		bindings.rebind(SaveModelActionHandler.class, CMMNSaveModelActionHandler.class);
		bindings.rebind(UndoRedoActionHandler.class, CMMNUndoRedoActionHandler.class);
		bindings.rebind(RequestMarkersHandler.class, CMMNRequestMarkersActionHandler.class);
		bindings.rebind(DisposeClientSessionActionHandler.class, CMMNDisposeClientSessionActionHandler.class);
		bindings.add(CMMNToggleValidationActionHandler.class);
	}

	@Override
	public Class<? extends ModelFactory> bindModelFactory() {
		return CMMNModelFactory.class;
	}
	
	@Override
	protected Class<? extends LabelEditValidator> bindLabelEditValidator() {
		return CMMNLabelEditValidator.class;
	}
	
	@Override
	protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
		return CMMNToolPaletteItemProvider.class;
	}
	
	@Override
	protected Class<? extends ContextMenuItemProvider> bindContextMenuItemProvider() {
      return CMMNContextMenuItemProvider.class;
	}
	
	@Override
	protected Class<? extends ServerLayoutConfiguration> bindServerLayoutConfiguration() {
		return CMMNServerConfiguration.class;
	}
	
	@Override
	protected Class<? extends OperationHandlerRegistry> bindOperationHandlerRegistry() {
		return CMMNDIOperationHandlerRegistry.class;
	}

	@Override
	protected void configureOperationHandlers(MultiBinding<OperationHandler> bindings) {
		bindings.add(LayoutOperationHandler.class);
		bindings.add(CreateNodeOperationHandler.class);
		bindings.add(CreateNodeChildOperationHandler.class);
		bindings.add(CreateSentryOperationHandler.class);
		bindings.add(CMMNDeleteOperationHandler.class);
		bindings.add(ChangeBoundsOperationHandler.class);
		bindings.add(ChangeRoutingPointsOperationHandler.class);
		bindings.add(LabelEditOperationHandler.class);
		super.configureOperationHandlers(bindings);
	}
	
	@Override
	protected void configureClientActions(MultiBinding<Action> bindings) {
		super.configureClientActions(bindings);
		bindings.add(ReturnToggleValidationAction.class);
	}

	@Override
	protected Class<? extends ModelStateProvider> bindModelStateProvider() {
		return CMMNModelStateProvider.class;
	}

	@Override
	protected void configureDiagramConfigurations(MultiBinding<DiagramConfiguration> bindings) {
		bindings.add(CMMNDiagramConfiguration.class);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	protected Class<? extends GLSPServer> bindGLSPServer() {
		return CMMNGLSPServer.class;
	}

	@Override
	public void configure() {
		super.configure();
		bind(CommandCodec.class).toInstance(new DefaultCommandCodec());
		bind(ModelServerClientProvider.class).asEagerSingleton();
	}

}
