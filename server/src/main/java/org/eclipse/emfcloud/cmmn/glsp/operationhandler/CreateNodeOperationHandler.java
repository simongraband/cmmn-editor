package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emfcloud.cmmn.enotation.Diagram;
import org.eclipse.emfcloud.cmmn.enotation.Shape;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNElement;
import org.eclipse.emfcloud.cmmn.metamodel.Case;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelFactory;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;
import org.eclipse.emfcloud.cmmn.metamodel.Stage;
import org.eclipse.emfcloud.cmmn.metamodel.Task;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.operation.Operation;
import org.eclipse.glsp.api.operation.kind.CreateNodeOperation;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.operationhandler.BasicOperationHandler;

import com.google.common.collect.Lists;

public class CreateNodeOperationHandler extends BasicOperationHandler<CreateNodeOperation> {

	private List<String> handledElementTypeIds = Lists.newArrayList(Types.CASE, Types.STAGE, Types.TASK);

	@Override
	public boolean handles(Operation execAction) {
		if (execAction instanceof CreateNodeOperation) {
			CreateNodeOperation action = (CreateNodeOperation) execAction;
			return handledElementTypeIds.contains(action.getElementTypeId());
		}
		return false;
	}

	@Override
	public void executeOperation(CreateNodeOperation operation, GraphicalModelState modelState) {
		String elementTypeId = operation.getElementTypeId();
		CMMNEditorContext context = CMMNModelState.getEditorContext(modelState);
		CMMNFacade facade = context.getCMMNFacade();
		EPackage ePackage = facade.getEPackage();
		CMMNElement cmmnElement = createNode(elementTypeId);

		setName(cmmnElement, modelState);
		//TODO
		//cmmnPackage.getCMMNElement().add(cmmnElement);
		ePackage.getEClassifiers().add((EClassifier) cmmnElement);
		Diagram diagram = facade.getDiagram();
		Shape shape = facade.initializeShape(cmmnElement);
		if (operation.getLocation() != null) {
			operation.getLocation().ifPresent(shape::setPosition);
		}
		diagram.getElements().add(shape);
	}

	protected void setName(CMMNElement element, GraphicalModelState modelState) {
		Function<Integer, String> nameProvider = i -> "Unknown" + i;
		if (element instanceof Case) {
			nameProvider = i -> "NewCase" + i;
		} else if (element instanceof Stage) {
			nameProvider = i -> "NewStage" + i;
		} else if (element instanceof Task) {
			nameProvider = i -> "NewTask" + i;
		}
		int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
		element.setName(nameProvider.apply(nodeCounter));
	}

	private CMMNElement createNode(String elementTypeId) {
		if (elementTypeId.equals((Types.CASE))) {
			Case cmmnCase = MetamodelFactory.eINSTANCE.createCase();
			return cmmnCase;
		} else if (elementTypeId.equals(Types.STAGE)) {
			Stage stage = MetamodelFactory.eINSTANCE.createStage();
			return stage;
		} else {
			Task task = MetamodelFactory.eINSTANCE.createTask();
			return task;
		}
	}

	@Override
	public String getLabel() {
		return "Create cmmn node";
	}
    
}