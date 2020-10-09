package org.eclipse.emfcloud.cmmn.glsp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.operationhandler.CreateNodeChildOperationHandler;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.operation.kind.CreateNodeOperation;
import org.eclipse.glsp.api.provider.ContextMenuItemProvider;
import org.eclipse.glsp.api.types.MenuItem;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.server.operationhandler.BasicOperationHandler;

import com.google.common.collect.Lists;

public class CMMNContextMenuItemProvider implements ContextMenuItemProvider{

	@Override
	public List<MenuItem> getItems(List<String> selectedElementIds, GPoint position, Map<String, String> args,
			GraphicalModelState graphicalModelState) {
		if(selectedElementIds.size() > 0) {
			CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
			CMMNModelIndex modelIndex = modelState.getIndex();
			Optional<GModelElement> gModelElement = modelIndex.get(selectedElementIds.get(0));
			if(gModelElement.isPresent()) {
				Optional<EObject> eObject =modelIndex.getSemantic(gModelElement.get());
				if(eObject.isPresent()) {
					if(eObject.get() instanceof Case) {
						MenuItem quickFixCase = new MenuItem("quickFixCase", "Quick Fix: Add missing Stage",
								Arrays.asList(new CreateNodeOperation(Types.STAGE, position)), true);
						MenuItem newChildMenu = new MenuItem("new", "New", Arrays.asList(quickFixCase), "add", "0_new");
						return Lists.newArrayList(newChildMenu);
					}
					if(eObject.get() instanceof Stage) {
						MenuItem quickFixStage = new MenuItem("quickFixCase", "Quick Fix: Add missing Stage",
								Arrays.asList(new CreateNodeOperation(Types.TASK_HUMAN, position)), true);
						MenuItem newChildMenu = new MenuItem("new", "New", Arrays.asList(quickFixStage), "add", "0_new");
						return Lists.newArrayList(newChildMenu);
					}
				}
			}
		}
		return null;
	}

}