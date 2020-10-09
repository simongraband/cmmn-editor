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
package org.eclipse.emfcloud.cmmn.glsp.util;

public final class CMMNConfig {

	public static final class Types {

		public static final String LABEL_NAME = "label:name";
		public static final String LABEL_REQUEST = "label:request";
		public static final String LABEL_VALUE = "label:value";
		public static final String LABEL_TEXT = "label:text";
		public static final String LABEL_EDGE_IF = "label:edge-name";
		public static final String COMP = "comp:comp";
		public static final String COMP_HEADER = "comp:header";
		public static final String LABEL_ICON = "label:icon";
		public static final String HTTPDECORATOR = "decorator:http";
		public static final String MANDATORYDECORATOR = "decorator:mandatory";
		public static final String CASE = "node:case";
		public static final String STAGE = "node:stage";
		public static final String TASK_HUMAN = "node:task-human";
		public static final String TASK_PROCESS = "node:task-process";
		public static final String EVENTLISTENER = "node:event-listener";
		public static final String CASEFILE = "node:casefile";
		public static final String SENTRY_ENTRY = "edge:sentry-entry";
		public static final String SENTRY_EXIT = "edge:sentry-exit";


		private Types() {
		};
	}

	public static final class CSS {

		public static final String CASE = "cmmn-case";
		public static final String STAGE = "cmmn-stage";
		public static final String TASK = "cmmn-task";
		public static final String SENTRY = "cmmn-sentry";
		public static final String EXIT = "exit";
		public static final String ENTRY = "entry";
		public static final String ICON = "cmmn-icon";
		public static final String FOREIGN_PACKAGE = "foreign-package";
		public static final String CMMN_EDGE = "cmmn-edge";
		public static final String ITALIC = "italic";

		private CSS() {
		};
	}

	private CMMNConfig() {
	};
}
