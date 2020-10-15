package org.eclipse.emfcloud.cmmn.glsp.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.validation.ValidationResult;
import org.eclipse.emfcloud.validation.ValidationResultChangeListener;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.actions.ActionDispatcher;
import org.eclipse.glsp.server.actions.ActionMessage;
import org.eclipse.glsp.server.features.validation.Marker;
import org.eclipse.glsp.server.features.validation.MarkerKind;
import org.eclipse.glsp.server.features.validation.SetMarkersAction;

import com.google.inject.Inject;

public class CMMNValidationResultChangeListener extends ValidationResultChangeListener {
	
	public CMMNModelState modelState;
	
	@Inject
	private ActionDispatcher actionDispatcher;
	
	@Override
	public void changed(List<ValidationResult> newResult) {
		actionDispatcher.dispatch(new ActionMessage(modelState.getClientId(), new SetMarkersAction(createMarkers(newResult, modelState))));
	}
	
	public CMMNValidationResultChangeListener(CMMNModelState cmmnModelState, ActionDispatcher actionDispatcher) {
		this.modelState = cmmnModelState;
		this.actionDispatcher = actionDispatcher;
	}
	
	public List<Marker> createMarkers(List<ValidationResult> validationResult, CMMNModelState cmmnModelState){
        CMMNModelIndex index = cmmnModelState.getIndex();
        List<Marker> markers = new ArrayList();
        for(ValidationResult r: validationResult){
            Optional<GModelElement> gElement = index.getGModelElement(r.getIdentifier());
            BasicDiagnostic diagnostic = r.getDiagnostic();
            String message = diagnostic.getMessage();
            if(diagnostic.getSource().equals("org.eclipse.emf.ecore")) {
            	message = adjustMessage(diagnostic);
            }
            //Filter out non error messages
            if(gElement.isPresent()){
                markers.add(new Marker(message, message, gElement.get().getId(), getMarkerKind(r.getDiagnostic().getSeverity())));
            }else{
                markers.add(new Marker(message, message, cmmnModelState.getRoot().getId(), getMarkerKind(r.getDiagnostic().getSeverity())));
            }
        }
        return markers;
    }

    public String getMarkerKind(int severity){
        switch(severity){
            case Diagnostic.ERROR:
                return MarkerKind.ERROR;
            case Diagnostic.WARNING:
                return MarkerKind.WARNING;
            default:
                return MarkerKind.INFO;
        }
    }
    
    private String adjustMessage(BasicDiagnostic diagnostic) {
    	if(diagnostic.getCode()==1) {
    		LinkedHashMap elementMap = (LinkedHashMap) diagnostic.getData().get(0);
    		LinkedHashMap featureMap = (LinkedHashMap) diagnostic.getData().get(1);
    		String fullURI = (String) featureMap.get("$ref");
    		String featureName = fullURI.substring(fullURI.lastIndexOf("/")+1);
    		if(featureName.equals("casefile")) {
    			return elementMap.get("name") + " needs a Casefile";
    		}
    		if(featureName.equals("stages")) {
    			return elementMap.get("name") + " needs at least 1 Stage";
    		}
    		if(featureName.equals("tasks")) {
    			return elementMap.get("name") + " needs at least 1 Task";
    		}
    		if(featureName.equals("cmmnElements")) {
    			return "Diagram is empty";
    		}
    		
    	}
    	return "Message is not handled";
    }

}
