/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

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
	MetamodelPackage eINSTANCE = org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNElementImpl <em>CMMN Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNElementImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCMMNElement()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>CMMN Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNDiagramImpl <em>CMMN Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNDiagramImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCMMNDiagram()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__NAME = CMMN_ELEMENT__NAME;

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
	 * The number of structural features of the '<em>CMMN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CaseFileImpl <em>Case File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CaseFileImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCaseFile()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE__NAME = CMMN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Case File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FILE_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CaseImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCase()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NAME = CMMN_ELEMENT__NAME;

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
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.PlanItemDefinitionImpl <em>Plan Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.PlanItemDefinitionImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getPlanItemDefinition()
	 * @generated
	 */
	int PLAN_ITEM_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__NAME = CMMN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION__SENTRY = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ITEM_DEFINITION_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.StageImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getStage()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = PLAN_ITEM_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__DESCRIPTION = PLAN_ITEM_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__SENTRY = PLAN_ITEM_DEFINITION__SENTRY;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__TASKS = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.TaskImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTask()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = PLAN_ITEM_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = PLAN_ITEM_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SENTRY = PLAN_ITEM_DEFINITION__SENTRY;

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
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DECORATORS = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.EventListenerImpl <em>Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.EventListenerImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getEventListener()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__NAME = PLAN_ITEM_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__DESCRIPTION = PLAN_ITEM_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__SENTRY = PLAN_ITEM_DEFINITION__SENTRY;

	/**
	 * The number of structural features of the '<em>Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_FEATURE_COUNT = PLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.DecoratorImpl <em>Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.DecoratorImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getDecorator()
	 * @generated
	 */
	int DECORATOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__NAME = CMMN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__DATA_TYPE = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__VALUE = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.SentryImpl <em>Sentry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.SentryImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getSentry()
	 * @generated
	 */
	int SENTRY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__NAME = CMMN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>On Part Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__ON_PART_ID = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__IF_PART = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sentry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__SENTRY_TYPE = CMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__EXPRESSION = CMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anchor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY__ANCHOR_ID = CMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTRY_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.ExpressionImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = CMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = CMMN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = CMMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LANGUAGE = CMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BODY = CMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = CMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.TimerEventListenerImpl <em>Timer Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.TimerEventListenerImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTimerEventListener()
	 * @generated
	 */
	int TIMER_EVENT_LISTENER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__ID = EVENT_LISTENER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__NAME = EVENT_LISTENER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__DESCRIPTION = EVENT_LISTENER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_LISTENER__SENTRY = EVENT_LISTENER__SENTRY;

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
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.UserEventListenerImpl <em>User Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.UserEventListenerImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getUserEventListener()
	 * @generated
	 */
	int USER_EVENT_LISTENER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__ID = EVENT_LISTENER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__NAME = EVENT_LISTENER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__DESCRIPTION = EVENT_LISTENER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER__SENTRY = EVENT_LISTENER__SENTRY;

	/**
	 * The number of structural features of the '<em>User Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EVENT_LISTENER_FEATURE_COUNT = EVENT_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.TimerExpressionImpl <em>Timer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.TimerExpressionImpl
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTimerExpression()
	 * @generated
	 */
	int TIMER_EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Timer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.TaskRole <em>Task Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.TaskRole
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTaskRole()
	 * @generated
	 */
	int TASK_ROLE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.TaskType <em>Task Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.TaskType
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emfcloud.cmmn.metamodel.SentryType <em>Sentry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emfcloud.cmmn.metamodel.SentryType
	 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getSentryType()
	 * @generated
	 */
	int SENTRY_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram <em>CMMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMN Diagram</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram
	 * @generated
	 */
	EClass getCMMNDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram#getCmmnElements <em>Cmmn Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmmn Elements</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram#getCmmnElements()
	 * @see #getCMMNDiagram()
	 * @generated
	 */
	EReference getCMMNDiagram_CmmnElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.CMMNElement <em>CMMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMN Element</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.CMMNElement
	 * @generated
	 */
	EClass getCMMNElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.CMMNElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.CMMNElement#getId()
	 * @see #getCMMNElement()
	 * @generated
	 */
	EAttribute getCMMNElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.CMMNElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.CMMNElement#getName()
	 * @see #getCMMNElement()
	 * @generated
	 */
	EAttribute getCMMNElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.CMMNElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.CMMNElement#getDescription()
	 * @see #getCMMNElement()
	 * @generated
	 */
	EAttribute getCMMNElement_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.CaseFile <em>Case File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case File</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.CaseFile
	 * @generated
	 */
	EClass getCaseFile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emfcloud.cmmn.metamodel.Case#getCasefile <em>Casefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Casefile</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Case#getCasefile()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Casefile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.cmmn.metamodel.Case#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Case#getStages()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Stages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.cmmn.metamodel.Case#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Case#getTasks()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Tasks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.cmmn.metamodel.Stage#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Stage#getTasks()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Tasks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Task#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Type</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Task#getTaskType()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Task#getTaskRole <em>Task Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Role</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Task#getTaskRole()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.cmmn.metamodel.Task#getDecorators <em>Decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorators</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Task#getDecorators()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Decorators();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.EventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listener</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.EventListener
	 * @generated
	 */
	EClass getEventListener();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.Decorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Decorator
	 * @generated
	 */
	EClass getDecorator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Decorator#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Decorator#getDataType()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Decorator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Decorator#getValue()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.Sentry <em>Sentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentry</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Sentry
	 * @generated
	 */
	EClass getSentry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Sentry#getOnPartId <em>On Part Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Part Id</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Sentry#getOnPartId()
	 * @see #getSentry()
	 * @generated
	 */
	EAttribute getSentry_OnPartId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Sentry#getIfPart <em>If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Part</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Sentry#getIfPart()
	 * @see #getSentry()
	 * @generated
	 */
	EAttribute getSentry_IfPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Sentry#getSentryType <em>Sentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentry Type</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Sentry#getSentryType()
	 * @see #getSentry()
	 * @generated
	 */
	EAttribute getSentry_SentryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emfcloud.cmmn.metamodel.Sentry#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Sentry#getExpression()
	 * @see #getSentry()
	 * @generated
	 */
	EReference getSentry_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Sentry#getAnchorId <em>Anchor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Id</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Sentry#getAnchorId()
	 * @see #getSentry()
	 * @generated
	 */
	EAttribute getSentry_AnchorId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Expression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Expression#getLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emfcloud.cmmn.metamodel.Expression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.Expression#getBody()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.PlanItemDefinition <em>Plan Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Item Definition</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.PlanItemDefinition
	 * @generated
	 */
	EClass getPlanItemDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.cmmn.metamodel.PlanItemDefinition#getSentry <em>Sentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentry</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.PlanItemDefinition#getSentry()
	 * @see #getPlanItemDefinition()
	 * @generated
	 */
	EReference getPlanItemDefinition_Sentry();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.TimerEventListener <em>Timer Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Event Listener</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.TimerEventListener
	 * @generated
	 */
	EClass getTimerEventListener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emfcloud.cmmn.metamodel.TimerEventListener#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.TimerEventListener#getExpression()
	 * @see #getTimerEventListener()
	 * @generated
	 */
	EReference getTimerEventListener_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.UserEventListener <em>User Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Event Listener</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.UserEventListener
	 * @generated
	 */
	EClass getUserEventListener();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emfcloud.cmmn.metamodel.TimerExpression <em>Timer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Expression</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.TimerExpression
	 * @generated
	 */
	EClass getTimerExpression();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.cmmn.metamodel.TaskRole <em>Task Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Role</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.TaskRole
	 * @generated
	 */
	EEnum getTaskRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.cmmn.metamodel.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Type</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.TaskType
	 * @generated
	 */
	EEnum getTaskType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emfcloud.cmmn.metamodel.SentryType <em>Sentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sentry Type</em>'.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.SentryType
	 * @generated
	 */
	EEnum getSentryType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNDiagramImpl <em>CMMN Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNDiagramImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCMMNDiagram()
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
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNElementImpl <em>CMMN Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CMMNElementImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCMMNElement()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_ELEMENT__NAME = eINSTANCE.getCMMNElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_ELEMENT__DESCRIPTION = eINSTANCE.getCMMNElement_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CaseFileImpl <em>Case File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CaseFileImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCaseFile()
		 * @generated
		 */
		EClass CASE_FILE = eINSTANCE.getCaseFile();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.CaseImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getCase()
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
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.StageImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getStage()
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
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.TaskImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Decorators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DECORATORS = eINSTANCE.getTask_Decorators();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.EventListenerImpl <em>Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.EventListenerImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getEventListener()
		 * @generated
		 */
		EClass EVENT_LISTENER = eINSTANCE.getEventListener();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.DecoratorImpl <em>Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.DecoratorImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getDecorator()
		 * @generated
		 */
		EClass DECORATOR = eINSTANCE.getDecorator();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__DATA_TYPE = eINSTANCE.getDecorator_DataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__VALUE = eINSTANCE.getDecorator_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.SentryImpl <em>Sentry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.SentryImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getSentry()
		 * @generated
		 */
		EClass SENTRY = eINSTANCE.getSentry();

		/**
		 * The meta object literal for the '<em><b>On Part Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTRY__ON_PART_ID = eINSTANCE.getSentry_OnPartId();

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
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTRY__EXPRESSION = eINSTANCE.getSentry_Expression();

		/**
		 * The meta object literal for the '<em><b>Anchor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTRY__ANCHOR_ID = eINSTANCE.getSentry_AnchorId();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.ExpressionImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__LANGUAGE = eINSTANCE.getExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__BODY = eINSTANCE.getExpression_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.PlanItemDefinitionImpl <em>Plan Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.PlanItemDefinitionImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getPlanItemDefinition()
		 * @generated
		 */
		EClass PLAN_ITEM_DEFINITION = eINSTANCE.getPlanItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Sentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ITEM_DEFINITION__SENTRY = eINSTANCE.getPlanItemDefinition_Sentry();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.TimerEventListenerImpl <em>Timer Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.TimerEventListenerImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTimerEventListener()
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
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.UserEventListenerImpl <em>User Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.UserEventListenerImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getUserEventListener()
		 * @generated
		 */
		EClass USER_EVENT_LISTENER = eINSTANCE.getUserEventListener();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.impl.TimerExpressionImpl <em>Timer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.TimerExpressionImpl
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTimerExpression()
		 * @generated
		 */
		EClass TIMER_EXPRESSION = eINSTANCE.getTimerExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.TaskRole <em>Task Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.TaskRole
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTaskRole()
		 * @generated
		 */
		EEnum TASK_ROLE = eINSTANCE.getTaskRole();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.TaskType <em>Task Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.TaskType
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getTaskType()
		 * @generated
		 */
		EEnum TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emfcloud.cmmn.metamodel.SentryType <em>Sentry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emfcloud.cmmn.metamodel.SentryType
		 * @see org.eclipse.emfcloud.cmmn.metamodel.impl.MetamodelPackageImpl#getSentryType()
		 * @generated
		 */
		EEnum SENTRY_TYPE = eINSTANCE.getSentryType();

	}

} //MetamodelPackage
