package org.eclipse.emfcloud.cmmn.glsp.actions;

import org.eclipse.glsp.server.actions.RequestAction;

public class ToggleExitAction extends RequestAction<ReturnToggleValidationAction>{

	public static String KIND = "toggleExit";
	
	public ToggleExitAction() {
		super(KIND);
	}
	
}