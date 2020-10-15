package org.eclipse.emfcloud.cmmn.glsp;

import java.util.List;

import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelServerAccess;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.DisposeClientSessionAction;
import org.eclipse.glsp.server.actions.DisposeClientSessionActionHandler;
import org.eclipse.glsp.server.model.GModelState;

public class CMMNDisposeClientSessionActionHandler extends DisposeClientSessionActionHandler {

	@Override
	protected List<Action> executeAction(final DisposeClientSessionAction action,
			final GModelState graphicalModelState) {
		// Unsubscribe from ModelServer updates
		CMMNModelServerAccess modelServerAccess = CMMNModelState.getModelServerAccess(graphicalModelState);
		modelServerAccess.unsubscribe();
		modelServerAccess.unsubscribeFromValidation();
		return super.executeAction(action, graphicalModelState);
	}

}