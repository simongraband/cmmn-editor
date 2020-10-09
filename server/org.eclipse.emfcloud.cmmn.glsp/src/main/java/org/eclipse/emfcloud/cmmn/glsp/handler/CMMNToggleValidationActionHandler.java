package org.eclipse.emfcloud.cmmn.glsp.handler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.eclipse.emfcloud.cmmn.glsp.actions.ReturnToggleValidationAction;
import org.eclipse.emfcloud.cmmn.glsp.actions.ToggleValidationAction;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNValidator;
import org.eclipse.emfcloud.validation.ValidationFilter;
import org.eclipse.glsp.api.action.Action;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.server.actionhandler.BasicActionHandler;

public class CMMNToggleValidationActionHandler extends BasicActionHandler<ToggleValidationAction> {

	@Override
	protected List<Action> executeAction(ToggleValidationAction actualAction, GraphicalModelState graphicalModelState) {
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
		try {
			modelState.getModelServerAccess().toggleValidationFilter(new ValidationFilter(CMMNValidator.PLAN_ITEM_DEFINITION__IS_USED, "org.eclipse.emfcloud.metamodel.CMMN"));
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
