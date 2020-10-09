/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
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
package org.eclipse.emfcloud.cmmn.glsp;

import java.net.MalformedURLException;
import java.util.Optional;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emfcloud.validation.GenericValidation;
import org.eclipse.emfcloud.validation.EMFFacetConstraints;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelServerAccess;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.CaseFile;
import org.eclipse.emfcloud.metamodel.CMMN.EventListener;
import org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;
import org.eclipse.glsp.api.labeledit.LabelEditValidator;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.types.ValidationStatus;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.GModelElement;

public class CMMNLabelEditValidator implements LabelEditValidator {

	@Override
	public ValidationStatus validate(final GraphicalModelState modelState, final String label,
			final GModelElement element) {
		CMMNModelState ecoreModelState = CMMNModelState.getModelState(modelState);
		String type = element.getType();
		GModelElement parent = getRoot(element);
		Optional<EObject> eObjectOptional = ecoreModelState.getIndex().getSemantic(parent);
		
		int elementId = -1;
		int featureId = -1;
		
		if(eObjectOptional.isPresent()) {
			EObject eObject = eObjectOptional.get();
			if(eObject instanceof Case) {
				elementId = CMMNPackage.CASE;
				if(type.equals(Types.LABEL_NAME)) {
					featureId = CMMNPackage.CASE__NAME;
				}
			}
			if(eObject instanceof Stage) {
				elementId = CMMNPackage.STAGE;
				if(type.equals(Types.LABEL_NAME)) {
					featureId = CMMNPackage.STAGE__NAME;
				}
			}
			if(eObject instanceof Task) {
				elementId = CMMNPackage.TASK;
				if(type.equals(Types.LABEL_NAME)) {
					featureId = CMMNPackage.TASK__NAME;
				}
			}
			if(eObject instanceof EventListener) {
				elementId = CMMNPackage.EVENT_LISTENER;
				if(type.equals(Types.LABEL_NAME)) {
					featureId = CMMNPackage.EVENT_LISTENER__NAME;
				}
			}
			if(eObject instanceof Sentry) {
				elementId = CMMNPackage.SENTRY;
				if(type.equals(Types.LABEL_EDGE_IF)) {
					featureId = CMMNPackage.SENTRY__IF_PART;
				}
			}
			if(eObject instanceof HTTPHookDecorator) {
				elementId = CMMNPackage.HTTP_HOOK_DECORATOR;
				if(type.equals(Types.LABEL_REQUEST)) {
					featureId = CMMNPackage.HTTP_HOOK_DECORATOR__REQUEST;
				}
			}
			if(eObject instanceof HTTPHookDecorator) {
				elementId = CMMNPackage.HTTP_HOOK_DECORATOR;
				if(type.equals(Types.LABEL_VALUE)) {
					featureId = CMMNPackage.HTTP_HOOK_DECORATOR__VALUE;
				}
			}
		}
		if(label.length()==0) {
			return ValidationStatus.error("Must not be empty");
		}
		if(elementId == -1 || featureId == -1) {
			//EStructural Feature not supported
			return ValidationStatus.ok();
		}else {
			//Load the constraint List from the modelserver;
			CMMNModelServerAccess access = CMMNModelState.getModelServerAccess(modelState);
			EMFFacetConstraints constraints = access.getConstraintList(elementId, featureId);
			if(!constraints.isPatternDefault()) {
				if(type.equals(Types.LABEL_VALUE)) {
					for(String pattern: constraints.getPattern()) {
						if(!Pattern.matches(pattern, label)) {
							return ValidationStatus.error("Must be Valid HTTP (http://www.example.org)");
						}
					}
				}else {
					for(String pattern: constraints.getPattern()) {
						if(!Pattern.matches(pattern, label)) {
							if(eObjectOptional.get() instanceof Sentry) return ValidationStatus.error("Must be a Condition (a <,=,> b (+,-,*,/ c)");
							if(eObjectOptional.get() instanceof Case) return ValidationStatus.error("Must consist only of letters, numbers, - and /");
							if(eObjectOptional.get() instanceof Stage) return ValidationStatus.error("Must consist only of letters, numbers, - and /");
							if(eObjectOptional.get() instanceof Task) return ValidationStatus.error("Must consist only of letters, numbers, - and /"); 
							else return ValidationStatus.error("Must fit the follwing expression: "+pattern);
						}
					}
				}
			}
			if(!constraints.isMinLengthDefault()) {
				if(label.length()<constraints.getMinLength()) {
					return ValidationStatus.error("Name must be longer than "+ constraints.getMinLength()+" digits");
				}
			}
			if(!constraints.isMaxLengthDefault()) {
				if(label.length()>constraints.getMaxLength()) {
					return ValidationStatus.error("Name must be shorter than "+ constraints.getMaxLength()+" digits");
				}
			}
			if(!constraints.isEnumerationDefault()) {
				String enums = constraints.getEnumeration().toString();
				for(String eEnum: constraints.getEnumeration()) {
					if(label.toUpperCase().equals(eEnum)) {
						return ValidationStatus.ok();
					}
				}
				return ValidationStatus.error("Must be one of the following: " + enums);
			}
		}
		return ValidationStatus.ok();
   }
   
   private GModelElement getRoot(GModelElement element) {
	   if(element instanceof GLabel || element instanceof GCompartment) {
		   return getRoot(element.getParent());
	   }
	   return element;
   }

}