package org.eclipse.emfcloud.cmmn.glsp.handler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emfcloud.validation.GenericValidation;
import org.eclipse.emfcloud.validation.ModelServerValidationResult;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelServerAccess;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;
import org.eclipse.glsp.api.action.Action;
import org.eclipse.glsp.api.action.kind.RequestMarkersAction;
import org.eclipse.glsp.api.action.kind.SetMarkersAction;
import org.eclipse.glsp.api.markers.Marker;
import org.eclipse.glsp.api.markers.MarkerKind;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.utils.ClientOptions;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.actionhandler.RequestMarkersHandler;

public class CMMNRequestMarkersActionHandler extends RequestMarkersHandler {

    @Override
    public List<Action> executeAction(final RequestMarkersAction action, final GraphicalModelState modelState) {
        List<Marker> markers = new ArrayList<>();
            CMMNModelState cmmnModelState = CMMNModelState.getModelState(modelState);
            CMMNModelServerAccess access = cmmnModelState.getModelServerAccess();
            try {
				access.validate().join();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       return listOf();
    
   }
}