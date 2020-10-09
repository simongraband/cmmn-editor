/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory
 * @model kind="package"
 * @generated
 */
public interface CMMNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CMMN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org/eclipse/cmmnmetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emfcloud.cmmn.metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMMNPackage eINSTANCE = org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNElementImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCMMNElement()
	 * @generated
	 */
	int CMMN_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNDiagramImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCMMNDiagram()
	 * @generated
	 */
	int CMMN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cmmn Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__CMMN_ELEMENTS = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Duplicate Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM___DUPLICATE_NAMES__DIAGNOSTICCHAIN_MAP = CMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM_OPERATION_COUNT = CMMN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CaseFileImpl <em>Case File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CaseFileImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCaseFile()
	 * @generated
	 */
	int CASE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE__NAME = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Case File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE_OPERATION_COUNT = CMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CaseImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Casefile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CASEFILE = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__STAGES = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__TASKS = CMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NAME = CMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__EVENT_LISTENERS = CMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Duplicate Stage Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE___DUPLICATE_STAGE_NAMES__DIAGNOSTICCHAIN_MAP = CMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Duplicate Task Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE___DUPLICATE_TASK_NAMES__DIAGNOSTICCHAIN_MAP = CMMN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = CMMN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl <em>Plan Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getPlanItemDefinition()
	 * @generated
	 */
	int PLAN_ITEM_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing Sentrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__DECORATORS = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Sentrys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__INCOMING_SENTRYS = CMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Plan Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION___IS_USED__DIAGNOSTICCHAIN_MAP = CMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is No Circle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP = CMMN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plan Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION_OPERATION_COUNT = CMMN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.StageImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ID = PLAN_ITEM_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__DESCRIPTION = PLAN_ITEM_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing Sentrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__OUTGOING_SENTRYS = PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__DECORATORS = PLAN_ITEM_DEFINITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Incoming Sentrys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__INCOMING_SENTRYS = PLAN_ITEM_DEFINITION__INCOMING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__TASKS = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__EVENT_LISTENERS = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE___IS_USED__DIAGNOSTICCHAIN_MAP = PLAN_ITEM_DEFINITION___IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is No Circle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP = PLAN_ITEM_DEFINITION___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Duplicate Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE___DUPLICATE_NAMES__DIAGNOSTICCHAIN_MAP = PLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = PLAN_ITEM_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.TaskImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = PLAN_ITEM_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = PLAN_ITEM_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing Sentrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING_SENTRYS = PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DECORATORS = PLAN_ITEM_DEFINITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Incoming Sentrys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING_SENTRYS = PLAN_ITEM_DEFINITION__INCOMING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_TYPE = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_ROLE = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_USED__DIAGNOSTICCHAIN_MAP = PLAN_ITEM_DEFINITION___IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is No Circle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP = PLAN_ITEM_DEFINITION___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.EventListenerImpl <em>Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.EventListenerImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getEventListener()
	 * @generated
	 */
	int EVENT_LISTENER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__ID = PLAN_ITEM_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__DESCRIPTION = PLAN_ITEM_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing Sentrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__OUTGOING_SENTRYS = PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__DECORATORS = PLAN_ITEM_DEFINITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Incoming Sentrys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__INCOMING_SENTRYS = PLAN_ITEM_DEFINITION__INCOMING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__NAME = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_FEATURE_COUNT = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER___IS_USED__DIAGNOSTICCHAIN_MAP = PLAN_ITEM_DEFINITION___IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is No Circle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP = PLAN_ITEM_DEFINITION___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_OPERATION_COUNT = PLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl <em>Sentry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getSentry()
	 * @generated
	 */
	int SENTRY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>If Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__IF_PART = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sentry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__SENTRY_TYPE = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__ON_PART = CMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__ANCHOR = CMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY_OPERATION_COUNT = CMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TimerEventListenerImpl <em>Timer Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.TimerEventListenerImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTimerEventListener()
	 * @generated
	 */
	int TIMER_EVENT_LISTENER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__ID = EVENT_LISTENER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__DESCRIPTION = EVENT_LISTENER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing Sentrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__OUTGOING_SENTRYS = EVENT_LISTENER__OUTGOING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__DECORATORS = EVENT_LISTENER__DECORATORS;

	/**
	 * The feature id for the '<em><b>Incoming Sentrys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__INCOMING_SENTRYS = EVENT_LISTENER__INCOMING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__NAME = EVENT_LISTENER__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__EXPRESSION = EVENT_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timer Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER_FEATURE_COUNT = EVENT_LISTENER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER___IS_USED__DIAGNOSTICCHAIN_MAP = EVENT_LISTENER___IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is No Circle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP = EVENT_LISTENER___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Timer Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER_OPERATION_COUNT = EVENT_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.UserEventListenerImpl <em>User Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.UserEventListenerImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getUserEventListener()
	 * @generated
	 */
	int USER_EVENT_LISTENER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__ID = EVENT_LISTENER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__DESCRIPTION = EVENT_LISTENER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing Sentrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__OUTGOING_SENTRYS = EVENT_LISTENER__OUTGOING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__DECORATORS = EVENT_LISTENER__DECORATORS;

	/**
	 * The feature id for the '<em><b>Incoming Sentrys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__INCOMING_SENTRYS = EVENT_LISTENER__INCOMING_SENTRYS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__NAME = EVENT_LISTENER__NAME;

	/**
	 * The number of structural features of the '<em>User Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER_FEATURE_COUNT = EVENT_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER___IS_USED__DIAGNOSTICCHAIN_MAP = EVENT_LISTENER___IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is No Circle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP = EVENT_LISTENER___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>User Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER_OPERATION_COUNT = EVENT_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TimerExpressionImpl <em>Timer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.TimerExpressionImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTimerExpression()
	 * @generated
	 */
	int TIMER_EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Timer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Timer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.DecoratorImpl <em>Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.DecoratorImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getDecorator()
	 * @generated
	 */
	int DECORATOR = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_OPERATION_COUNT = CMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.MandatoryDecoratorImpl <em>Mandatory Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.MandatoryDecoratorImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getMandatoryDecorator()
	 * @generated
	 */
	int MANDATORY_DECORATOR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DECORATOR__ID = DECORATOR__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DECORATOR__DESCRIPTION = DECORATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DECORATOR__VALUE = DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mandatory Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DECORATOR_FEATURE_COUNT = DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mandatory Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DECORATOR_OPERATION_COUNT = DECORATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.HTTPHookDecoratorImpl <em>HTTP Hook Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.HTTPHookDecoratorImpl
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getHTTPHookDecorator()
	 * @generated
	 */
	int HTTP_HOOK_DECORATOR = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HOOK_DECORATOR__ID = DECORATOR__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HOOK_DECORATOR__DESCRIPTION = DECORATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HOOK_DECORATOR__VALUE = DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HOOK_DECORATOR__REQUEST = DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HTTP Hook Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HOOK_DECORATOR_FEATURE_COUNT = DECORATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HTTP Hook Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HOOK_DECORATOR_OPERATION_COUNT = DECORATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.TaskRole <em>Task Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskRole
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTaskRole()
	 * @generated
	 */
	int TASK_ROLE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.TaskType <em>Task Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskType
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.SentryType <em>Sentry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.SentryType
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getSentryType()
	 * @generated
	 */
	int SENTRY_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPRequest <em>HTTP Request</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.metamodel.CMMN.HTTPRequest
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getHTTPRequest()
	 * @generated
	 */
	int HTTP_REQUEST = 18;

	/**
	 * The meta object id for the '<em>String100 Chars</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getString100Chars()
	 * @generated
	 */
	int STRING100_CHARS = 19;

	/**
	 * The meta object id for the '<em>String256chars</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getString256chars()
	 * @generated
	 */
	int STRING256CHARS = 20;


	/**
	 * The meta object id for the '<em>URL Format</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getURLFormat()
	 * @generated
	 */
	int URL_FORMAT = 21;

	/**
	 * The meta object id for the '<em>If Condition</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getIfCondition()
	 * @generated
	 */
	int IF_CONDITION = 22;


	/**
	 * The meta object id for the '<em>String Http Request</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getStringHttpRequest()
	 * @generated
	 */
	int STRING_HTTP_REQUEST = 23;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram
	 * @generated
	 */
	EClass getCMMNDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram#getCmmnElements <em>Cmmn Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmmn Elements</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram#getCmmnElements()
	 * @see #getCMMNDiagram()
	 * @generated
	 */
	EReference getCMMNDiagram_CmmnElements();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram#duplicateNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Duplicate Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Duplicate Names</em>' operation.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram#duplicateNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCMMNDiagram__DuplicateNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.CMMNElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNElement
	 * @generated
	 */
	EClass getCMMNElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.CMMNElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNElement#getId()
	 * @see #getCMMNElement()
	 * @generated
	 */
	EAttribute getCMMNElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.CMMNElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNElement#getDescription()
	 * @see #getCMMNElement()
	 * @generated
	 */
	EAttribute getCMMNElement_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.CaseFile <em>Case File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case File</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CaseFile
	 * @generated
	 */
	EClass getCaseFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.CaseFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CaseFile#getName()
	 * @see #getCaseFile()
	 * @generated
	 */
	EAttribute getCaseFile_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getCasefile <em>Casefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Casefile</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case#getCasefile()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Casefile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case#getStages()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Stages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case#getTasks()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case#getName()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Listeners</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case#getEventListeners()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_EventListeners();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#duplicateStageNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Duplicate Stage Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Duplicate Stage Names</em>' operation.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case#duplicateStageNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCase__DuplicateStageNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#duplicateTaskNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Duplicate Task Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Duplicate Task Names</em>' operation.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Case#duplicateTaskNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCase__DuplicateTaskNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.Stage#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Stage#getTasks()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.Stage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Stage#getName()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.Stage#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Listeners</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Stage#getEventListeners()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_EventListeners();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.metamodel.CMMN.Stage#duplicateNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Duplicate Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Duplicate Names</em>' operation.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Stage#duplicateNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStage__DuplicateNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Type</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskType()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskRole <em>Task Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Role</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskRole()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskRole();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.EventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listener</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.EventListener
	 * @generated
	 */
	EClass getEventListener();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.EventListener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.EventListener#getName()
	 * @see #getEventListener()
	 * @generated
	 */
	EAttribute getEventListener_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry <em>Sentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentry</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Sentry
	 * @generated
	 */
	EClass getSentry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getIfPart <em>If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Part</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Sentry#getIfPart()
	 * @see #getSentry()
	 * @generated
	 */
	EAttribute getSentry_IfPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getSentryType <em>Sentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentry Type</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Sentry#getSentryType()
	 * @see #getSentry()
	 * @generated
	 */
	EAttribute getSentry_SentryType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getOnPart <em>On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Part</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Sentry#getOnPart()
	 * @see #getSentry()
	 * @generated
	 */
	EReference getSentry_OnPart();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anchor</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Sentry#getAnchor()
	 * @see #getSentry()
	 * @generated
	 */
	EReference getSentry_Anchor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition <em>Plan Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Item Definition</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition
	 * @generated
	 */
	EClass getPlanItemDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getOutgoingSentrys <em>Outgoing Sentrys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Sentrys</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getOutgoingSentrys()
	 * @see #getPlanItemDefinition()
	 * @generated
	 */
	EReference getPlanItemDefinition_OutgoingSentrys();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getDecorators <em>Decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorators</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getDecorators()
	 * @see #getPlanItemDefinition()
	 * @generated
	 */
	EReference getPlanItemDefinition_Decorators();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getIncomingSentrys <em>Incoming Sentrys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Sentrys</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getIncomingSentrys()
	 * @see #getPlanItemDefinition()
	 * @generated
	 */
	EReference getPlanItemDefinition_IncomingSentrys();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#isUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Used</em>' operation.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#isUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPlanItemDefinition__IsUsed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#isNoCircle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Is No Circle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is No Circle</em>' operation.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#isNoCircle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPlanItemDefinition__IsNoCircle__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.TimerEventListener <em>Timer Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Event Listener</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TimerEventListener
	 * @generated
	 */
	EClass getTimerEventListener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.metamodel.CMMN.TimerEventListener#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TimerEventListener#getExpression()
	 * @see #getTimerEventListener()
	 * @generated
	 */
	EReference getTimerEventListener_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.UserEventListener <em>User Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Event Listener</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.UserEventListener
	 * @generated
	 */
	EClass getUserEventListener();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.TimerExpression <em>Timer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Expression</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TimerExpression
	 * @generated
	 */
	EClass getTimerExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.Decorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.Decorator
	 * @generated
	 */
	EClass getDecorator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator <em>Mandatory Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Decorator</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator
	 * @generated
	 */
	EClass getMandatoryDecorator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator#isValue()
	 * @see #getMandatoryDecorator()
	 * @generated
	 */
	EAttribute getMandatoryDecorator_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator <em>HTTP Hook Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Hook Decorator</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator
	 * @generated
	 */
	EClass getHTTPHookDecorator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getValue()
	 * @see #getHTTPHookDecorator()
	 * @generated
	 */
	EAttribute getHTTPHookDecorator_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getRequest()
	 * @see #getHTTPHookDecorator()
	 * @generated
	 */
	EAttribute getHTTPHookDecorator_Request();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.metamodel.CMMN.TaskRole <em>Task Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Role</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskRole
	 * @generated
	 */
	EEnum getTaskRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.metamodel.CMMN.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Type</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskType
	 * @generated
	 */
	EEnum getTaskType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.metamodel.CMMN.SentryType <em>Sentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sentry Type</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.SentryType
	 * @generated
	 */
	EEnum getSentryType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPRequest <em>HTTP Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Request</em>'.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.HTTPRequest
	 * @generated
	 */
	EEnum getHTTPRequest();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String100 Chars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String100 Chars</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="maxLength='100' pattern='[a-zA-Z0-9%20/\\-]+'"
	 * @generated
	 */
	EDataType getString100Chars();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String256chars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String256chars</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="maxLength='256' pattern='[a-zA-Z0-9%20/\\-]+'"
	 * @generated
	 */
	EDataType getString256chars();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URL Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL Format</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[hH][tT]{2}[pP]://[wW]{3}.*'"
	 * @generated
	 */
	EDataType getURLFormat();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>If Condition</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[a-zA-Z0-9%20/]+[&lt;&gt;=][a-zA-Z0-9%20/]+[\\+\\-\052/]*[a-zA-Z0-9%20/]*'"
	 * @generated
	 */
	EDataType getIfCondition();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Http Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Http Request</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="enumeration='GET POST HEAD URL OPTIONS TRACE'"
	 * @generated
	 */
	EDataType getStringHttpRequest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CMMNFactory getCMMNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNDiagramImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCMMNDiagram()
		 * @generated
		 */
		EClass CMMN_DIAGRAM = eINSTANCE.getCMMNDiagram();

		/**
		 * The meta object literal for the '<em><b>Cmmn Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_DIAGRAM__CMMN_ELEMENTS = eINSTANCE.getCMMNDiagram_CmmnElements();

		/**
		 * The meta object literal for the '<em><b>Duplicate Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CMMN_DIAGRAM___DUPLICATE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCMMNDiagram__DuplicateNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNElementImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCMMNElement()
		 * @generated
		 */
		EClass CMMN_ELEMENT = eINSTANCE.getCMMNElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_ELEMENT__ID = eINSTANCE.getCMMNElement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_ELEMENT__DESCRIPTION = eINSTANCE.getCMMNElement_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CaseFileImpl <em>Case File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CaseFileImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCaseFile()
		 * @generated
		 */
		EClass CASE_FILE = eINSTANCE.getCaseFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE_FILE__NAME = eINSTANCE.getCaseFile_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CaseImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Casefile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CASEFILE = eINSTANCE.getCase_Casefile();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__STAGES = eINSTANCE.getCase_Stages();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__TASKS = eINSTANCE.getCase_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__NAME = eINSTANCE.getCase_Name();

		/**
		 * The meta object literal for the '<em><b>Event Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__EVENT_LISTENERS = eINSTANCE.getCase_EventListeners();

		/**
		 * The meta object literal for the '<em><b>Duplicate Stage Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE___DUPLICATE_STAGE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCase__DuplicateStageNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Duplicate Task Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE___DUPLICATE_TASK_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCase__DuplicateTaskNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.StageImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__TASKS = eINSTANCE.getStage_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

		/**
		 * The meta object literal for the '<em><b>Event Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__EVENT_LISTENERS = eINSTANCE.getStage_EventListeners();

		/**
		 * The meta object literal for the '<em><b>Duplicate Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAGE___DUPLICATE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStage__DuplicateNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.TaskImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_TYPE = eINSTANCE.getTask_TaskType();

		/**
		 * The meta object literal for the '<em><b>Task Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_ROLE = eINSTANCE.getTask_TaskRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.EventListenerImpl <em>Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.EventListenerImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getEventListener()
		 * @generated
		 */
		EClass EVENT_LISTENER = eINSTANCE.getEventListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER__NAME = eINSTANCE.getEventListener_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl <em>Sentry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getSentry()
		 * @generated
		 */
		EClass SENTRY = eINSTANCE.getSentry();

		/**
		 * The meta object literal for the '<em><b>If Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTRY__IF_PART = eINSTANCE.getSentry_IfPart();

		/**
		 * The meta object literal for the '<em><b>Sentry Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTRY__SENTRY_TYPE = eINSTANCE.getSentry_SentryType();

		/**
		 * The meta object literal for the '<em><b>On Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTRY__ON_PART = eINSTANCE.getSentry_OnPart();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTRY__ANCHOR = eINSTANCE.getSentry_Anchor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl <em>Plan Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getPlanItemDefinition()
		 * @generated
		 */
		EClass PLAN_ITEM_DEFINITION = eINSTANCE.getPlanItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Outgoing Sentrys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS = eINSTANCE.getPlanItemDefinition_OutgoingSentrys();

		/**
		 * The meta object literal for the '<em><b>Decorators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ITEM_DEFINITION__DECORATORS = eINSTANCE.getPlanItemDefinition_Decorators();

		/**
		 * The meta object literal for the '<em><b>Incoming Sentrys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ITEM_DEFINITION__INCOMING_SENTRYS = eINSTANCE.getPlanItemDefinition_IncomingSentrys();

		/**
		 * The meta object literal for the '<em><b>Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAN_ITEM_DEFINITION___IS_USED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPlanItemDefinition__IsUsed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Is No Circle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAN_ITEM_DEFINITION___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPlanItemDefinition__IsNoCircle__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TimerEventListenerImpl <em>Timer Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.TimerEventListenerImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTimerEventListener()
		 * @generated
		 */
		EClass TIMER_EVENT_LISTENER = eINSTANCE.getTimerEventListener();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_EVENT_LISTENER__EXPRESSION = eINSTANCE.getTimerEventListener_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.UserEventListenerImpl <em>User Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.UserEventListenerImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getUserEventListener()
		 * @generated
		 */
		EClass USER_EVENT_LISTENER = eINSTANCE.getUserEventListener();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TimerExpressionImpl <em>Timer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.TimerExpressionImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTimerExpression()
		 * @generated
		 */
		EClass TIMER_EXPRESSION = eINSTANCE.getTimerExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.DecoratorImpl <em>Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.DecoratorImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getDecorator()
		 * @generated
		 */
		EClass DECORATOR = eINSTANCE.getDecorator();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.MandatoryDecoratorImpl <em>Mandatory Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.MandatoryDecoratorImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getMandatoryDecorator()
		 * @generated
		 */
		EClass MANDATORY_DECORATOR = eINSTANCE.getMandatoryDecorator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY_DECORATOR__VALUE = eINSTANCE.getMandatoryDecorator_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.impl.HTTPHookDecoratorImpl <em>HTTP Hook Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.HTTPHookDecoratorImpl
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getHTTPHookDecorator()
		 * @generated
		 */
		EClass HTTP_HOOK_DECORATOR = eINSTANCE.getHTTPHookDecorator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HOOK_DECORATOR__VALUE = eINSTANCE.getHTTPHookDecorator_Value();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HOOK_DECORATOR__REQUEST = eINSTANCE.getHTTPHookDecorator_Request();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.TaskRole <em>Task Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskRole
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTaskRole()
		 * @generated
		 */
		EEnum TASK_ROLE = eINSTANCE.getTaskRole();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.TaskType <em>Task Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskType
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getTaskType()
		 * @generated
		 */
		EEnum TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.SentryType <em>Sentry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.SentryType
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getSentryType()
		 * @generated
		 */
		EEnum SENTRY_TYPE = eINSTANCE.getSentryType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPRequest <em>HTTP Request</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.metamodel.CMMN.HTTPRequest
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getHTTPRequest()
		 * @generated
		 */
		EEnum HTTP_REQUEST = eINSTANCE.getHTTPRequest();

		/**
		 * The meta object literal for the '<em>String100 Chars</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getString100Chars()
		 * @generated
		 */
		EDataType STRING100_CHARS = eINSTANCE.getString100Chars();

		/**
		 * The meta object literal for the '<em>String256chars</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getString256chars()
		 * @generated
		 */
		EDataType STRING256CHARS = eINSTANCE.getString256chars();

		/**
		 * The meta object literal for the '<em>URL Format</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getURLFormat()
		 * @generated
		 */
		EDataType URL_FORMAT = eINSTANCE.getURLFormat();

		/**
		 * The meta object literal for the '<em>If Condition</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getIfCondition()
		 * @generated
		 */
		EDataType IF_CONDITION = eINSTANCE.getIfCondition();

		/**
		 * The meta object literal for the '<em>String Http Request</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNPackageImpl#getStringHttpRequest()
		 * @generated
		 */
		EDataType STRING_HTTP_REQUEST = eINSTANCE.getStringHttpRequest();

	}

} //CMMNPackage
