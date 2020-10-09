package org.eclipse.emfcloud.cmmn.glsp.actions;

import java.util.List;

import org.eclipse.glsp.api.action.kind.ResponseAction;

public class ReturnToggleValidationAction extends ResponseAction {

	public static String KIND = "returnToggleValidation";
	private boolean successfull;
	
	public ReturnToggleValidationAction() {
		super(KIND);
	}

	public ReturnToggleValidationAction(boolean successfull) {
		super(KIND);
		this.successfull = successfull;
	}

	public boolean Setsuccessfull() {
		return successfull;
	}

	public void setSuccessfull(boolean successfull) {
		this.successfull = successfull;
	}
}