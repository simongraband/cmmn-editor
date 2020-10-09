/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.cmmn.glsp;

import org.apache.log4j.Logger;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;
import org.eclipse.emfcloud.modelserver.client.Response;
import org.eclipse.glsp.server.jsonrpc.DefaultGLSPServer;

import com.google.inject.Inject;

public class CMMNGLSPServer extends DefaultGLSPServer<CMMNInitializeOptions> {
	static Logger LOGGER = Logger.getLogger(CMMNGLSPServer.class);
	private static final String MODEL_SERVER_BASE_URL = "http://localhost:8081/api/v1/";

	@Inject
	private ModelServerClientProvider modelServerClientProvider;

	public CMMNGLSPServer() {
		super(CMMNInitializeOptions.class);
	}

	@Override
	public boolean handleOptions(CMMNInitializeOptions options) {
		if (options != null) {
			LOGGER.debug(String.format("[%s] Pinging modelserver", options.getTimestamp()));
			try {
				ModelServerClient client = new ModelServerClient(MODEL_SERVER_BASE_URL);
				boolean alive = client.ping().thenApply(Response<Boolean>::body).get();
				if (alive) {
					modelServerClientProvider.setModelServerClient(client);
					return true;
				}

			} catch (Exception e) {
				LOGGER.error("Error during initialization of modelserver connection", e);
			}
		}
		return true;
	}

}
