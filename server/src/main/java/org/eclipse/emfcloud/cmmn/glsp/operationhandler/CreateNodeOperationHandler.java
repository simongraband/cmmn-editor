package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import java.util.List;
import java.util.function.Function;

import com.google.common.collect.Lists;

import org.eclipse.emfcloud.cmmn.enotation.Diagram;
import org.eclipse.emfcloud.cmmn.enotation.Shape;
import org.eclipse.emfcloud.cmmn.glsp.CMMNEditorContext;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNElement;
import org.eclipse.emfcloud.cmmn.metamodel.Case;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelFactory;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.operation.Operation;
import org.eclipse.glsp.api.operation.kind.CreateNodeOperation;
import org.eclipse.glsp.graph.GDimension;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.graph.impl.GDimensionImpl;
import org.eclipse.glsp.server.operationhandler.BasicOperationHandler;

public class CreateNodeOperationHandler extends BasicOperationHandler<CreateNodeOperation> {

	private List<String> handledElementTypeIds = Lists.newArrayList(Types.CASE);

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
		CMMNDiagram cmmnDiagram = facade.getCMMNDiagram();
		CMMNElement cmmnElement = createNode(elementTypeId);
		
		setName(cmmnElement, modelState);
		cmmnDiagram.getCmmnElements().add((CMMNElement) cmmnElement);
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
		}
		int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
		element.setName(nameProvider.apply(nodeCounter));
	}

	private CMMNElement createNode(String elementTypeId) {
		return MetamodelFactory.eINSTANCE.createCase();
	}

	@Override
	public String getLabel() {
		return "Create cmmn node";
	}

}