/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package org.eclipse.emfcloud.cmmn.glsp.modelserver;

import org.apache.commons.cli.ParseException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emfcloud.modelserver.emf.launch.ModelServerLauncher;

import com.google.common.collect.Lists;

public class CMMNModelServerLauncher {

	public static void main(String[] args) throws ParseException {
		ModelServerLauncher.configureLogger();
		Logger.getRootLogger().setLevel(Level.INFO);
		final ModelServerLauncher launcher = new ModelServerLauncher(args);
		launcher.addEPackageConfigurations(Lists.newArrayList(CMMNPackageConfiguration.class));
		launcher.start();
	}
}
