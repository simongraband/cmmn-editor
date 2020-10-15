package org.eclipse.emfcloud.cmmn.glsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.validation.ValidationResult;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.server.features.contextmenu.ContextMenuItemProvider;
import org.eclipse.glsp.server.features.contextmenu.MenuItem;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.operations.CreateNodeOperation;

import com.google.common.collect.Lists;

public class CMMNContextMenuItemProvider implements ContextMenuItemProvider{

	@Override
	public List<MenuItem> getItems(List<String> selectedElementIds, GPoint position, Map<String, String> args,
			GModelState graphicalModelState) {
		if(selectedElementIds.size() > 0) {
			CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
			CMMNModelIndex modelIndex = modelState.getIndex();
			Optional<GModelElement> gModelElement = modelIndex.get(selectedElementIds.get(0));
			if(gModelElement.isPresent()) {
				Optional<EObject> eObject =modelIndex.getSemantic(gModelElement.get());
				if(eObject.isPresent()) {
					String uri = EcoreUtil.getURI(eObject.get()).toString();
					uri = uri.substring(uri.lastIndexOf("#")+1);
					try {
						List<MenuItem> quickFixes = new ArrayList<>();
						for(ValidationResult r : modelState.getModelServerAccess().getValidationResult()) {
							if(r.getIdentifier().equals(uri) && r.getDiagnostic().getCode()==1
									&& r.getDiagnostic().getSource().equals("org.eclipse.emf.ecore")) {
								if(eObject.get() instanceof Case) {
									//Lookup Casefile or Stage
						    		LinkedHashMap featureMap = (LinkedHashMap) r.getDiagnostic().getData().get(1);
						    		String fullURI = (String) featureMap.get("$ref");
						    		String featureName = fullURI.substring(fullURI.lastIndexOf("/")+1);
						    		if(featureName.equals("casefile")) {
						    			MenuItem quickFixCase = new MenuItem("quickFixCaseFile", "Add missing Casefile",
												Arrays.asList(new CreateNodeOperation(Types.CASEFILE, position, gModelElement.get().getId())), true);
						    			quickFixes.add(quickFixCase);
						    		}
						    		if(featureName.equals("stages")) {
						    			MenuItem quickFixCase = new MenuItem("quickFixCaseStage", "Add missing Stage",
												Arrays.asList(new CreateNodeOperation(Types.STAGE, position, gModelElement.get().getId())), true);
						    			quickFixes.add(quickFixCase);
						    		}
									}
									if(eObject.get() instanceof Stage) {
										MenuItem quickFixStage = new MenuItem("quickFixStage", "Add missing Task",
												Arrays.asList(new CreateNodeOperation(Types.TASK_HUMAN, position, gModelElement.get().getId())), true);
										MenuItem newChildMenu = new MenuItem("quickFix", "Quick Fixes", Arrays.asList(quickFixStage), "add", "0_new");
										return Lists.newArrayList(newChildMenu);
									}
							}
						}
						MenuItem newChildMenu = new MenuItem("quickFix", "Quick Fixes", quickFixes, "add", "0_new");
						return Lists.newArrayList(newChildMenu);
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
				}
			}
		}
		return null;
	}

}