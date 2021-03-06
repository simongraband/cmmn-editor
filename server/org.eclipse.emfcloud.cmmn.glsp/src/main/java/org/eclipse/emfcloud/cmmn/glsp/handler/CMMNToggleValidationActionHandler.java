package org.eclipse.emfcloud.cmmn.glsp.handler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.eclipse.emf.ecore.util.EcoreValidator;
import org.eclipse.emfcloud.cmmn.glsp.actions.ReturnToggleValidationAction;
import org.eclipse.emfcloud.cmmn.glsp.actions.ToggleValidationAction;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNValidator;
import org.eclipse.emfcloud.validation.ValidationFilter;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.BasicActionHandler;
import org.eclipse.glsp.server.model.GModelState;

public class CMMNToggleValidationActionHandler extends BasicActionHandler<ToggleValidationAction> {

	@Override
	protected List<Action> executeAction(ToggleValidationAction actualAction, GModelState graphicalModelState) {
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
		try {
			modelState.getModelServerAccess().toggleValidationFilter(new ValidationFilter(CMMNValidator.PLAN_ITEM_DEFINITION__IS_USED, "org.eclipse.emfcloud.metamodel.CMMN"));
			modelState.getModelServerAccess().validate();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return List.of(new ReturnToggleValidationAction(false));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return List.of(new ReturnToggleValidationAction(false));
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return List.of(new ReturnToggleValidationAction(false));
		}
		
		return List.of(new ReturnToggleValidationAction(true));
	}

}
