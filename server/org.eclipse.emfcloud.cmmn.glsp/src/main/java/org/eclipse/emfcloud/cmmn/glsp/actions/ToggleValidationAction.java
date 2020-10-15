package org.eclipse.emfcloud.cmmn.glsp.actions;

import org.eclipse.glsp.server.actions.RequestAction;

public class ToggleValidationAction extends RequestAction<ReturnToggleValidationAction>{

	public static String KIND = "toggleValidation";
	
	public ToggleValidationAction() {
		super(KIND);
	}
}
