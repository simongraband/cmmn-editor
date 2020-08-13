package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.eclipse.glsp.api.jsonrpc.GLSPServerException.getOrThrow;

import org.eclipse.emfcloud.cmmn.enotation.Diagram;
import org.eclipse.emfcloud.cmmn.enotation.Shape;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNElement;
import org.eclipse.emfcloud.cmmn.metamodel.Case;
import org.eclipse.emfcloud.cmmn.metamodel.EventListener;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelFactory;
import org.eclipse.emfcloud.cmmn.metamodel.Stage;
import org.eclipse.emfcloud.cmmn.metamodel.Task;
import org.eclipse.glsp.api.action.kind.SetMarkersAction;
import org.eclipse.glsp.api.markers.Marker;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.operation.Operation;
import org.eclipse.glsp.api.operation.kind.CreateNodeOperation;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.operationhandler.BasicOperationHandler;

import com.google.common.collect.Lists;

public class CreateNodeChildOperationHandler extends BasicOperationHandler<CreateNodeOperation> {

	private List<String> handledElementTypeIds = Lists.newArrayList(Types.STAGE, Types.TASK, Types.EVENTLISTENER);

	@Override
	public boolean handles(Operation execAction) {
		if (execAction instanceof CreateNodeOperation) {
			CreateNodeOperation action = (CreateNodeOperation) execAction;
			return handledElementTypeIds.contains(action.getElementTypeId());
		}
		return false;
	}

	@Override
	public void executeOperation(CreateNodeOperation operation, GraphicalModelState graphicalModelState) {
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
		CMMNElement container = getOrThrow(
				modelState.getIndex().getSemantic(operation.getContainerId(), CMMNElement.class),
				"No valid container with id " + operation.getContainerId() + " found");
		String elementTypeId = operation.getElementTypeId();

		if (elementTypeId.equals(Types.STAGE) && container instanceof Case) {
			Stage stage = MetamodelFactory.eINSTANCE.createStage();
			setName(stage, modelState);
			modelState.getIndex().add(stage);
			((Case) container).getStages().add(stage);
			drawShape(stage, modelState, operation);
		} else if (elementTypeId.contentEquals(Types.TASK) && (container instanceof Stage || container instanceof Case)) {
			Task task = MetamodelFactory.eINSTANCE.createTask();
			setName(task, modelState);
			modelState.getIndex().add(task);
			if(container instanceof Stage){
				((Stage) container).getTasks().add(task);
			} 
			if(container instanceof Case) ((Case) container).getTasks().add(task);
			drawShape(task, modelState, operation);
		} else if (elementTypeId.contentEquals(Types.EVENTLISTENER)) {
			EventListener eventListener = MetamodelFactory.eINSTANCE.createEventListener();
			setName(eventListener, modelState);
			// set Container
			drawShape(eventListener, modelState, operation);
		}
	}

	protected void drawShape(CMMNElement cmmnElement, GraphicalModelState modelState, CreateNodeOperation operation) {
		CMMNEditorContext context = CMMNModelState.getEditorContext(modelState);
		CMMNFacade facade = context.getCMMNFacade();
		//CMMNDiagram cmmnDiagram = facade.getCMMNDiagram();
		//cmmnDiagram.getCmmnElements().add(cmmnElement);
		Diagram diagram = facade.getDiagram();
		Shape shape = facade.initializeShape(cmmnElement);
		if (operation.getLocation() != null) {
			operation.getLocation().ifPresent(shape::setPosition);
		}
		diagram.getElements().add(shape);
    }

	protected void setName(CMMNElement element, GraphicalModelState modelState) {
        Function<Integer, String> nameProvider = i -> "Unknown" + i;
        if (element instanceof Stage) {
			nameProvider = i -> "NewStage" + i;
		} else if (element instanceof Task) {
			nameProvider = i -> "NewTask" + i;
		} else if (element instanceof EventListener) {
			nameProvider = i -> "NewEventListener" + i;
		}
		int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
		element.setName(nameProvider.apply(nodeCounter));
	}

	@Override
	public String getLabel() {
		return "Create cmmn child node";
	}
    
}