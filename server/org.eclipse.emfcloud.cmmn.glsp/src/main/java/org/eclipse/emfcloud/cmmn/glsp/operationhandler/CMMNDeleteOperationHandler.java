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
package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelServerAccess;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.metamodel.enotation.NotationElement;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.graph.GModelIndex;
import org.eclipse.glsp.server.operationhandler.DeleteOperationHandler;

public class CMMNDeleteOperationHandler extends DeleteOperationHandler {
	@Override
	protected boolean delete(String elementId, GModelIndex index, GraphicalModelState graphicalModelState) {
		super.delete(elementId, index, graphicalModelState);
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);

		Optional<EObject> semantic = modelState.getIndex().getSemantic(elementId);
		Optional<NotationElement> notation = modelState.getIndex().getNotation(elementId);

		semantic.ifPresent(element -> {
			if (element instanceof Task) {
				
			}
			if (element instanceof Stage) {

			}
		});
		
		//TODO
		notation.ifPresent(EcoreUtil::delete);
		semantic.ifPresent(EcoreUtil::delete);
		if(notation.isPresent()){
			modelState.getIndex().removeURI(notation.get().getSemanticElement().getUri());
		}
		
		//TODO make smarter
		CMMNModelState cmmnModelState = CMMNModelState.getModelState(modelState);
		CMMNModelServerAccess access = cmmnModelState.getModelServerAccess();
				
		access.setEcoreFacade(CMMNModelState.getCMMNFacade(modelState));
		access.update();
		
		return true;
	}
	
}