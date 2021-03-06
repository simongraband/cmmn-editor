package org.eclipse.emfcloud.cmmn.glsp.handler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.eclipse.emfcloud.cmmn.glsp.actions.ReturnToggleValidationAction;
import org.eclipse.emfcloud.cmmn.glsp.actions.ToggleExitAction;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNValidator;
import org.eclipse.emfcloud.validation.ValidationFilter;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.BasicActionHandler;
import org.eclipse.glsp.server.model.GModelState;

public class CMMNToggleExitActionHandler extends BasicActionHandler<ToggleExitAction> {

	@Override
	protected List<Action> executeAction(ToggleExitAction actualAction, GModelState graphicalModelState) {
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
		try {
			modelState.getModelServerAccess().toggleValidationFilter(new ValidationFilter(CMMNValidator.CASE__HAS_EXIT_SENTRY, "org.eclipse.emfcloud.metamodel.CMMN"));
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
