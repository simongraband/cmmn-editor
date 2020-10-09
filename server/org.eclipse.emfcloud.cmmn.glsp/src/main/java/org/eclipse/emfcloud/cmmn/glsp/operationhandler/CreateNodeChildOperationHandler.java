package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import static org.eclipse.glsp.api.protocol.GLSPServerException.getOrThrow;

import java.util.List;
import java.util.function.Function;

import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelServerAccess;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.CaseFile;
import org.eclipse.emfcloud.metamodel.CMMN.EventListener;
import org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.metamodel.CMMN.TaskRole;
import org.eclipse.emfcloud.metamodel.enotation.Diagram;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.operation.Operation;
import org.eclipse.glsp.api.operation.kind.CreateNodeOperation;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.operationhandler.BasicOperationHandler;

import com.google.common.collect.Lists;

public class CreateNodeChildOperationHandler extends BasicOperationHandler<CreateNodeOperation> {

	private List<String> handledElementTypeIds = Lists.newArrayList(Types.CASEFILE, Types.STAGE, Types.TASK_HUMAN, Types.TASK_PROCESS, Types.EVENTLISTENER, Types.MANDATORYDECORATOR, Types.HTTPDECORATOR);

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
			Stage stage = CMMNFactory.eINSTANCE.createStage();
			setName(stage, modelState);
			modelState.getIndex().add(stage);
			((Case) container).getStages().add(stage);
			drawShape(stage, modelState, operation);
		} else if ((elementTypeId.contentEquals(Types.TASK_HUMAN) || elementTypeId.contentEquals(Types.TASK_PROCESS)) && (container instanceof Stage || container instanceof Case)) {
			Task task = CMMNFactory.eINSTANCE.createTask();
			setName(task, modelState);
			if(elementTypeId.contentEquals(Types.TASK_HUMAN)) task.setTaskRole(TaskRole.HUMAN);
			else task.setTaskRole(TaskRole.PROCESS);
			modelState.getIndex().add(task);
			if(container instanceof Stage){
				((Stage) container).getTasks().add(task);
			} 
			if(container instanceof Case) {
				((Case) container).getTasks().add(task);
			}
			drawShape(task, modelState, operation);
		} else if (elementTypeId.contentEquals(Types.EVENTLISTENER) && (container instanceof Stage || container instanceof Case)) {
			EventListener eventListener = CMMNFactory.eINSTANCE.createEventListener();
			setName(eventListener, modelState);
			if(container instanceof Stage){
				((Stage) container).getEventListeners().add(eventListener);
			} 
			if(container instanceof Case) {
				((Case) container).getEventListeners().add(eventListener);
			}
			drawShape(eventListener, modelState, operation);
		} else if (elementTypeId.contentEquals(Types.CASEFILE) && container instanceof Case) {
			CaseFile caseFile = CMMNFactory.eINSTANCE.createCaseFile();
			setName(caseFile, modelState);
			((Case) container).setCasefile(caseFile);
			drawShape(caseFile, modelState, operation);
		} else if ((elementTypeId.contentEquals(Types.HTTPDECORATOR) || elementTypeId.contentEquals(Types.MANDATORYDECORATOR)) 
				&& (container instanceof Task || container instanceof Stage)) {
			if(elementTypeId.contentEquals(Types.MANDATORYDECORATOR)) {
				MandatoryDecorator decorator = CMMNFactory.eINSTANCE.createMandatoryDecorator();
				decorator.setValue(true);
				((PlanItemDefinition) container).getDecorators().add(decorator);
				drawShape(decorator, modelState, operation);
			}
			if(elementTypeId.contentEquals(Types.HTTPDECORATOR)) {
				HTTPHookDecorator decorator = CMMNFactory.eINSTANCE.createHTTPHookDecorator();
				decorator.setValue("http://www.example.org");
				decorator.setRequest("GET");
				((PlanItemDefinition) container).getDecorators().add(decorator);
				drawShape(decorator, modelState, operation);
			}
		} 
		
		//TODO make smarter
		CMMNModelState cmmnModelState = CMMNModelState.getModelState(modelState);
        CMMNModelServerAccess access = cmmnModelState.getModelServerAccess();
				
		access.setEcoreFacade(CMMNModelState.getCMMNFacade(modelState));
        access.update();
	}

	protected void drawShape(CMMNElement cmmnElement, GraphicalModelState modelState, CreateNodeOperation operation) {
		CMMNEditorContext context = CMMNModelState.getEditorContext(modelState);
		CMMNFacade facade = context.getCMMNFacade();
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
		} else if (element instanceof CaseFile) {
			nameProvider = i -> "NewCaseFile" + i;
		}
		int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
		if (element instanceof Stage) {
			((Stage) element).setName(nameProvider.apply(nodeCounter));
		} else if (element instanceof Task) {
			((Task) element).setName(nameProvider.apply(nodeCounter));
		} else if (element instanceof EventListener) {
			((EventListener) element).setName(nameProvider.apply(nodeCounter));
		} else if (element instanceof CaseFile) {
			((CaseFile) element).setName(nameProvider.apply(nodeCounter));
		}
	}

	@Override
	public String getLabel() {
		return "Create cmmn child node";
	}
    
}