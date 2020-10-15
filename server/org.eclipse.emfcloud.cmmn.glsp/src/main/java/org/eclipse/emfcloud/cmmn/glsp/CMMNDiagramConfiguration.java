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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.diagram.EdgeTypeHint;
import org.eclipse.glsp.server.diagram.ShapeTypeHint;

import com.google.common.collect.Lists;

public class CMMNDiagramConfiguration implements DiagramConfiguration {

	@Override
	public String getDiagramType() {
		return "cmmndiagram";
	}

	@Override
	public List<EdgeTypeHint> getEdgeTypeHints() {
		return Lists.newArrayList(createDefaultEdgeTypeHint(Types.SENTRY_ENTRY), createExitEdgeTypeHint(Types.SENTRY_EXIT));
	}

	@Override
	public EdgeTypeHint createDefaultEdgeTypeHint(String elementId) {
		List<String> allowed = Lists.newArrayList(Types.TASK_HUMAN, Types.TASK_PROCESS, Types.EVENTLISTENER, Types.STAGE);
		return new EdgeTypeHint(elementId, true, true, true, allowed, allowed);
	}
	
	public EdgeTypeHint createExitEdgeTypeHint(String elementId) {
		List<String> allowed = Lists.newArrayList(Types.TASK_HUMAN, Types.TASK_PROCESS, Types.EVENTLISTENER, Types.STAGE);
		List<String> allowedDestination = Lists.newArrayList(Types.TASK_HUMAN, Types.TASK_PROCESS, Types.EVENTLISTENER, Types.STAGE, Types.CASE);
		return new EdgeTypeHint(elementId, true, true, true, allowed, allowedDestination);
	}

	@Override
	public List<ShapeTypeHint> getNodeTypeHints() {
		List<ShapeTypeHint> hints = new ArrayList<>();
		hints.add(new ShapeTypeHint(DefaultTypes.GRAPH, false, false, false, true,
				List.of(Types.CASE)));
		hints.add(new ShapeTypeHint(Types.CASE, true, true, false, false, List.of(Types.TASK_HUMAN, Types.TASK_PROCESS, Types.CASEFILE, Types.STAGE, Types.EVENTLISTENER)));
		hints.add(new ShapeTypeHint(Types.STAGE, true, true, false, true, List.of(Types.TASK_HUMAN, Types.TASK_PROCESS, Types.EVENTLISTENER, Types.HTTPDECORATOR, Types.MANDATORYDECORATOR)));
		hints.add(new ShapeTypeHint(Types.TASK_HUMAN, true, true, false, true, List.of(Types.HTTPDECORATOR, Types.MANDATORYDECORATOR)));
		hints.add(new ShapeTypeHint(Types.TASK_PROCESS, true, true, false, true, List.of(Types.HTTPDECORATOR, Types.MANDATORYDECORATOR)));
		hints.add(new ShapeTypeHint(Types.CASEFILE, true, true, false, true));
		hints.add(new ShapeTypeHint(Types.EVENTLISTENER, true, true, false, true));
		hints.add(new ShapeTypeHint(Types.MANDATORYDECORATOR, true, true, false, false));
		hints.add(new ShapeTypeHint(Types.HTTPDECORATOR, true, true, false, false));
		return hints;
	}

	@Override
	public Map<String, EClass> getTypeMappings() {
		Map<String, EClass> mappings = DefaultTypes.getDefaultTypeMappings();

		mappings.put(Types.LABEL_NAME, GraphPackage.Literals.GLABEL);
		mappings.put(Types.LABEL_REQUEST, GraphPackage.Literals.GLABEL);
		mappings.put(Types.LABEL_VALUE, GraphPackage.Literals.GLABEL);
		mappings.put(Types.LABEL_TEXT, GraphPackage.Literals.GLABEL);
		mappings.put(Types.LABEL_EDGE_IF, GraphPackage.Literals.GLABEL);
		mappings.put(Types.COMP, GraphPackage.Literals.GCOMPARTMENT);
		mappings.put(Types.COMP_HEADER, GraphPackage.Literals.GCOMPARTMENT);
		mappings.put(Types.LABEL_ICON, GraphPackage.Literals.GCOMPARTMENT);

		// cmmn stuff
		mappings.put(Types.CASE, GraphPackage.Literals.GNODE);
		mappings.put(Types.CASEFILE, GraphPackage.Literals.GNODE);
		mappings.put(Types.STAGE, GraphPackage.Literals.GNODE);
		mappings.put(Types.TASK_HUMAN, GraphPackage.Literals.GNODE);
		mappings.put(Types.TASK_PROCESS, GraphPackage.Literals.GNODE);
		mappings.put(Types.EVENTLISTENER, GraphPackage.Literals.GNODE);
		mappings.put(Types.SENTRY_ENTRY, GraphPackage.Literals.GEDGE);
		mappings.put(Types.SENTRY_EXIT, GraphPackage.Literals.GEDGE);
		mappings.put(Types.HTTPDECORATOR, GraphPackage.Literals.GNODE);
		mappings.put(Types.MANDATORYDECORATOR, GraphPackage.Literals.GNODE);
		return mappings;
	}

}
