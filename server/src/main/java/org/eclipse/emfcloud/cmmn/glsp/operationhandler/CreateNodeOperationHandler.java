package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
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
import org.eclipse.glsp.api.action.kind.SetMarkersAction;
import org.eclipse.glsp.api.markers.Marker;
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
		EPackage cmmnPackage = facade.getCMMNPackage();
		//CMMNElement cmmnElement = createNode(elementTypeId);
		EClassifier cmmnElement = createNode(elementTypeId);
		

		setName(cmmnElement, modelState);
		//TODO
		cmmnPackage.getEClassifiers().add(cmmnElement);
		List<Marker> markers = new ArrayList<Marker>();
		Marker marker = new Marker("Error", "Error", ""+cmmnElement.getClassifierID(), "Error");
		markers.add(marker);
		new SetMarkersAction(markers);
		//cmmnPackage.getCMMNElement().add(cmmnElement);
		//ePackage.getEClassifiers().add(cmmnElement);
		Diagram diagram = facade.getDiagram();
		Shape shape = facade.initializeShape(cmmnElement);
		if (operation.getLocation() != null) {
			operation.getLocation().ifPresent(shape::setPosition);
		}
		diagram.getElements().add(shape);
	}

	protected void setName(EClassifier element, GraphicalModelState modelState) {
		Function<Integer, String> nameProvider = i -> "Unknown" + i;
		if (element instanceof EClass) {
			nameProvider = i -> "NewCase" + i;
		} else if (element instanceof EEnum) {
			nameProvider = i -> "NewStage" + i;
		} else if (element instanceof EDataType) {
			nameProvider = i -> "NewTask" + i;
		}
		int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
		element.setName(nameProvider.apply(nodeCounter));
	}

	private EClassifier createNode(String elementTypeId) {
		if (elementTypeId.equals((Types.CASE))) {
			EClass cmmnCase = EcoreFactory.eINSTANCE.createEClass();
			return cmmnCase;
		} else if (elementTypeId.equals(Types.STAGE)) {
			EEnum stage = EcoreFactory.eINSTANCE.createEEnum();
			return stage;
		} else {
			EDataType task = EcoreFactory.eINSTANCE.createEDataType();
			return task;
		}
	}

	@Override
	public String getLabel() {
		return "Create cmmn node";
	}
    
}