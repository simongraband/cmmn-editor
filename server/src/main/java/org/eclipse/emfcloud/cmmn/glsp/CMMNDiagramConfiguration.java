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
import org.eclipse.glsp.api.diagram.DiagramConfiguration;
import org.eclipse.glsp.api.types.EdgeTypeHint;
import org.eclipse.glsp.api.types.ShapeTypeHint;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GraphPackage;

import com.google.common.collect.Lists;

public class CMMNDiagramConfiguration implements DiagramConfiguration {

	@Override
	public String getDiagramType() {
		return "cmmndiagram";
	}

	@Override
	public List<EdgeTypeHint> getEdgeTypeHints() {
		return Lists.newArrayList(createDefaultEdgeTypeHint(Types.SENTRY));
	}

	@Override
	public EdgeTypeHint createDefaultEdgeTypeHint(String elementId) {
		List<String> allowed = Lists.newArrayList(Types.TASK, Types.EVENTLISTENER, Types.STAGE);
		return new EdgeTypeHint(elementId, true, true, true, allowed, allowed);
	}

	@Override
	public List<ShapeTypeHint> getNodeTypeHints() {
		List<ShapeTypeHint> hints = new ArrayList<>();
		hints.add(new ShapeTypeHint(DefaultTypes.GRAPH, false, false, false, true,
				List.of(Types.CASE)));
		hints.add(new ShapeTypeHint(Types.CASE, true, true, true, false, List.of(Types.TASK, Types.STAGE, Types.EVENTLISTENER)));
		hints.add(new ShapeTypeHint(Types.STAGE, true, true, true, true, List.of(Types.TASK, Types.EVENTLISTENER)));
		hints.add(new ShapeTypeHint(Types.TASK, true, true, false, true));
		hints.add(new ShapeTypeHint(Types.EVENTLISTENER, true, true, false, true));
		return hints;
	}

	@Override
	public Map<String, EClass> getTypeMappings() {
		Map<String, EClass> mappings = DefaultTypes.getDefaultTypeMappings();

		mappings.put(Types.LABEL_NAME, GraphPackage.Literals.GLABEL);
		mappings.put(Types.LABEL_TEXT, GraphPackage.Literals.GLABEL);
		mappings.put(Types.LABEL_EDGE_NAME, GraphPackage.Literals.GLABEL);
		mappings.put(Types.LABEL_EDGE_MULTIPLICITY, GraphPackage.Literals.GLABEL);
		mappings.put(Types.COMP, GraphPackage.Literals.GCOMPARTMENT);
		mappings.put(Types.COMP_HEADER, GraphPackage.Literals.GCOMPARTMENT);
		mappings.put(Types.LABEL_ICON, GraphPackage.Literals.GCOMPARTMENT);

		// cmmn stuff
		mappings.put(Types.CASE, GraphPackage.Literals.GNODE);
		mappings.put(Types.STAGE, GraphPackage.Literals.GNODE);
		mappings.put(Types.TASK, GraphPackage.Literals.GNODE);
		mappings.put(Types.EVENTLISTENER, GraphPackage.Literals.GNODE);
		mappings.put(Types.SENTRY, GraphPackage.Literals.GEDGE);
		mappings.put(Types.DECORATOR, GraphPackage.Literals.GCOMPARTMENT);
		return mappings;
	}

}
