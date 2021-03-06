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
package org.eclipse.emfcloud.cmmn.glsp.gmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;

public class LabelFactory extends AbstractGModelFactory<ENamedElement, GLabel> {

	public LabelFactory(CMMNModelState modelState) {
		super(modelState);
	}

	@Override
	public GLabel create(ENamedElement semanticElement) {
		if (semanticElement instanceof EAttribute) {
			return create((EAttribute) semanticElement);
		} else if (semanticElement instanceof EEnumLiteral) {
			return create((EEnumLiteral) semanticElement);
		}
		return null;
	}

	public GLabel create(EAttribute eAttribute) {
		String label = String.format("%s : %s", eAttribute.getName(), //
				eAttribute.getEAttributeType().getName());
		return new GLabelBuilder(Types.HTTPDECORATOR) //
				.id(toId(eAttribute))//
				.text(label) //
				.build();
	}

}
