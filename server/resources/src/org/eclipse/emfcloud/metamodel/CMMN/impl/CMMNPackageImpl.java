/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.CaseFile;
import org.eclipse.emfcloud.metamodel.CMMN.Decorator;
import org.eclipse.emfcloud.metamodel.CMMN.EventListener;
import org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.HTTPRequest;
import org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;
import org.eclipse.emfcloud.metamodel.CMMN.SentryType;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.metamodel.CMMN.TaskRole;
import org.eclipse.emfcloud.metamodel.CMMN.TaskType;
import org.eclipse.emfcloud.metamodel.CMMN.TimerEventListener;
import org.eclipse.emfcloud.metamodel.CMMN.TimerExpression;
import org.eclipse.emfcloud.metamodel.CMMN.UserEventListener;

import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNPackageImpl extends EPackageImpl implements CMMNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmnElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planItemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpHookDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sentryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpRequestEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType string100CharsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType string256charsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlFormatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ifConditionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringHttpRequestEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CMMNPackageImpl() {
		super(eNS_URI, CMMNFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CMMNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CMMNPackage init() {
		if (isInited) return (CMMNPackage)EPackage.Registry.INSTANCE.getEPackage(CMMNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCMMNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CMMNPackageImpl theCMMNPackage = registeredCMMNPackage instanceof CMMNPackageImpl ? (CMMNPackageImpl)registeredCMMNPackage : new CMMNPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCMMNPackage.createPackageContents();

		// Initialize created meta-data
		theCMMNPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCMMNPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CMMNValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCMMNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CMMNPackage.eNS_URI, theCMMNPackage);
		return theCMMNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMMNDiagram() {
		return cmmnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMMNDiagram_CmmnElements() {
		return (EReference)cmmnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCMMNDiagram__DuplicateNames__DiagnosticChain_Map() {
		return cmmnDiagramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMMNElement() {
		return cmmnElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMMNElement_Id() {
		return (EAttribute)cmmnElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMMNElement_Description() {
		return (EAttribute)cmmnElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseFile() {
		return caseFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaseFile_Name() {
		return (EAttribute)caseFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Casefile() {
		return (EReference)caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Stages() {
		return (EReference)caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Tasks() {
		return (EReference)caseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_Name() {
		return (EAttribute)caseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_EventListeners() {
		return (EReference)caseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCase__DuplicateStageNames__DiagnosticChain_Map() {
		return caseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCase__DuplicateTaskNames__DiagnosticChain_Map() {
		return caseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_Tasks() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStage_Name() {
		return (EAttribute)stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_EventListeners() {
		return (EReference)stageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStage__DuplicateNames__DiagnosticChain_Map() {
		return stageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TaskType() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TaskRole() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventListener() {
		return eventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListener_Name() {
		return (EAttribute)eventListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentry() {
		return sentryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentry_IfPart() {
		return (EAttribute)sentryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentry_SentryType() {
		return (EAttribute)sentryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentry_OnPart() {
		return (EReference)sentryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentry_Anchor() {
		return (EReference)sentryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanItemDefinition() {
		return planItemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanItemDefinition_OutgoingSentrys() {
		return (EReference)planItemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanItemDefinition_Decorators() {
		return (EReference)planItemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanItemDefinition_IncomingSentrys() {
		return (EReference)planItemDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlanItemDefinition__IsUsed__DiagnosticChain_Map() {
		return planItemDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlanItemDefinition__IsNoCircle__DiagnosticChain_Map() {
		return planItemDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerEventListener() {
		return timerEventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerEventListener_Expression() {
		return (EReference)timerEventListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserEventListener() {
		return userEventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerExpression() {
		return timerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecorator() {
		return decoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryDecorator() {
		return mandatoryDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandatoryDecorator_Value() {
		return (EAttribute)mandatoryDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPHookDecorator() {
		return httpHookDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPHookDecorator_Value() {
		return (EAttribute)httpHookDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPHookDecorator_Request() {
		return (EAttribute)httpHookDecoratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskRole() {
		return taskRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskType() {
		return taskTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSentryType() {
		return sentryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHTTPRequest() {
		return httpRequestEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString100Chars() {
		return string100CharsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString256chars() {
		return string256charsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURLFormat() {
		return urlFormatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIfCondition() {
		return ifConditionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringHttpRequest() {
		return stringHttpRequestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNFactory getCMMNFactory() {
		return (CMMNFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cmmnDiagramEClass = createEClass(CMMN_DIAGRAM);
		createEReference(cmmnDiagramEClass, CMMN_DIAGRAM__CMMN_ELEMENTS);
		createEOperation(cmmnDiagramEClass, CMMN_DIAGRAM___DUPLICATE_NAMES__DIAGNOSTICCHAIN_MAP);

		cmmnElementEClass = createEClass(CMMN_ELEMENT);
		createEAttribute(cmmnElementEClass, CMMN_ELEMENT__ID);
		createEAttribute(cmmnElementEClass, CMMN_ELEMENT__DESCRIPTION);

		caseFileEClass = createEClass(CASE_FILE);
		createEAttribute(caseFileEClass, CASE_FILE__NAME);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__CASEFILE);
		createEReference(caseEClass, CASE__STAGES);
		createEReference(caseEClass, CASE__TASKS);
		createEAttribute(caseEClass, CASE__NAME);
		createEReference(caseEClass, CASE__EVENT_LISTENERS);
		createEOperation(caseEClass, CASE___DUPLICATE_STAGE_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(caseEClass, CASE___DUPLICATE_TASK_NAMES__DIAGNOSTICCHAIN_MAP);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__TASKS);
		createEAttribute(stageEClass, STAGE__NAME);
		createEReference(stageEClass, STAGE__EVENT_LISTENERS);
		createEOperation(stageEClass, STAGE___DUPLICATE_NAMES__DIAGNOSTICCHAIN_MAP);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__TASK_TYPE);
		createEAttribute(taskEClass, TASK__TASK_ROLE);
		createEAttribute(taskEClass, TASK__NAME);

		eventListenerEClass = createEClass(EVENT_LISTENER);
		createEAttribute(eventListenerEClass, EVENT_LISTENER__NAME);

		sentryEClass = createEClass(SENTRY);
		createEAttribute(sentryEClass, SENTRY__IF_PART);
		createEAttribute(sentryEClass, SENTRY__SENTRY_TYPE);
		createEReference(sentryEClass, SENTRY__ON_PART);
		createEReference(sentryEClass, SENTRY__ANCHOR);

		planItemDefinitionEClass = createEClass(PLAN_ITEM_DEFINITION);
		createEReference(planItemDefinitionEClass, PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS);
		createEReference(planItemDefinitionEClass, PLAN_ITEM_DEFINITION__DECORATORS);
		createEReference(planItemDefinitionEClass, PLAN_ITEM_DEFINITION__INCOMING_SENTRYS);
		createEOperation(planItemDefinitionEClass, PLAN_ITEM_DEFINITION___IS_USED__DIAGNOSTICCHAIN_MAP);
		createEOperation(planItemDefinitionEClass, PLAN_ITEM_DEFINITION___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP);

		timerEventListenerEClass = createEClass(TIMER_EVENT_LISTENER);
		createEReference(timerEventListenerEClass, TIMER_EVENT_LISTENER__EXPRESSION);

		userEventListenerEClass = createEClass(USER_EVENT_LISTENER);

		timerExpressionEClass = createEClass(TIMER_EXPRESSION);

		decoratorEClass = createEClass(DECORATOR);

		mandatoryDecoratorEClass = createEClass(MANDATORY_DECORATOR);
		createEAttribute(mandatoryDecoratorEClass, MANDATORY_DECORATOR__VALUE);

		httpHookDecoratorEClass = createEClass(HTTP_HOOK_DECORATOR);
		createEAttribute(httpHookDecoratorEClass, HTTP_HOOK_DECORATOR__VALUE);
		createEAttribute(httpHookDecoratorEClass, HTTP_HOOK_DECORATOR__REQUEST);

		// Create enums
		taskRoleEEnum = createEEnum(TASK_ROLE);
		taskTypeEEnum = createEEnum(TASK_TYPE);
		sentryTypeEEnum = createEEnum(SENTRY_TYPE);
		httpRequestEEnum = createEEnum(HTTP_REQUEST);

		// Create data types
		string100CharsEDataType = createEDataType(STRING100_CHARS);
		string256charsEDataType = createEDataType(STRING256CHARS);
		urlFormatEDataType = createEDataType(URL_FORMAT);
		ifConditionEDataType = createEDataType(IF_CONDITION);
		stringHttpRequestEDataType = createEDataType(STRING_HTTP_REQUEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cmmnDiagramEClass.getESuperTypes().add(this.getCMMNElement());
		caseFileEClass.getESuperTypes().add(this.getCMMNElement());
		caseEClass.getESuperTypes().add(this.getCMMNElement());
		stageEClass.getESuperTypes().add(this.getPlanItemDefinition());
		taskEClass.getESuperTypes().add(this.getPlanItemDefinition());
		eventListenerEClass.getESuperTypes().add(this.getPlanItemDefinition());
		sentryEClass.getESuperTypes().add(this.getCMMNElement());
		planItemDefinitionEClass.getESuperTypes().add(this.getCMMNElement());
		timerEventListenerEClass.getESuperTypes().add(this.getEventListener());
		userEventListenerEClass.getESuperTypes().add(this.getEventListener());
		decoratorEClass.getESuperTypes().add(this.getCMMNElement());
		mandatoryDecoratorEClass.getESuperTypes().add(this.getDecorator());
		httpHookDecoratorEClass.getESuperTypes().add(this.getDecorator());

		// Initialize classes, features, and operations; add parameters
		initEClass(cmmnDiagramEClass, CMMNDiagram.class, "CMMNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMMNDiagram_CmmnElements(), this.getCMMNElement(), null, "cmmnElements", null, 1, -1, CMMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCMMNDiagram__DuplicateNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "duplicateNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cmmnElementEClass, CMMNElement.class, "CMMNElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCMMNElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, CMMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, CMMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseFileEClass, CaseFile.class, "CaseFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaseFile_Name(), this.getString256chars(), "name", null, 0, 1, CaseFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Casefile(), this.getCaseFile(), null, "casefile", null, 1, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_Stages(), this.getStage(), null, "stages", null, 1, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase_Name(), this.getString100Chars(), "name", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_EventListeners(), this.getEventListener(), null, "eventListeners", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCase__DuplicateStageNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "duplicateStageNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCase__DuplicateTaskNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "duplicateTaskNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Tasks(), this.getTask(), null, "tasks", null, 1, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStage_Name(), this.getString100Chars(), "name", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_EventListeners(), this.getEventListener(), null, "eventListeners", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStage__DuplicateNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "duplicateNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_TaskType(), this.getTaskType(), "taskType", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_TaskRole(), this.getTaskRole(), "taskRole", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), this.getString256chars(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventListenerEClass, EventListener.class, "EventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventListener_Name(), this.getString256chars(), "name", null, 0, 1, EventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentryEClass, Sentry.class, "Sentry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSentry_IfPart(), this.getIfCondition(), "ifPart", null, 0, 1, Sentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentry_SentryType(), this.getSentryType(), "SentryType", null, 0, 1, Sentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentry_OnPart(), this.getPlanItemDefinition(), null, "onPart", null, 1, 1, Sentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentry_Anchor(), this.getPlanItemDefinition(), null, "anchor", null, 1, 1, Sentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planItemDefinitionEClass, PlanItemDefinition.class, "PlanItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanItemDefinition_OutgoingSentrys(), this.getSentry(), null, "outgoingSentrys", null, 0, -1, PlanItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanItemDefinition_Decorators(), this.getDecorator(), null, "decorators", null, 0, -1, PlanItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanItemDefinition_IncomingSentrys(), this.getSentry(), null, "incomingSentrys", null, 0, -1, PlanItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPlanItemDefinition__IsUsed__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "isUsed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPlanItemDefinition__IsNoCircle__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "isNoCircle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timerEventListenerEClass, TimerEventListener.class, "TimerEventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimerEventListener_Expression(), this.getTimerExpression(), null, "expression", null, 0, -1, TimerEventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEventListenerEClass, UserEventListener.class, "UserEventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timerExpressionEClass, TimerExpression.class, "TimerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decoratorEClass, Decorator.class, "Decorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mandatoryDecoratorEClass, MandatoryDecorator.class, "MandatoryDecorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandatoryDecorator_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, MandatoryDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpHookDecoratorEClass, HTTPHookDecorator.class, "HTTPHookDecorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPHookDecorator_Value(), this.getURLFormat(), "value", null, 0, 1, HTTPHookDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPHookDecorator_Request(), this.getStringHttpRequest(), "request", null, 0, 1, HTTPHookDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(taskRoleEEnum, TaskRole.class, "TaskRole");
		addEEnumLiteral(taskRoleEEnum, TaskRole.HUMAN);
		addEEnumLiteral(taskRoleEEnum, TaskRole.PROCESS);

		initEEnum(taskTypeEEnum, TaskType.class, "TaskType");
		addEEnumLiteral(taskTypeEEnum, TaskType.TASK);
		addEEnumLiteral(taskTypeEEnum, TaskType.DISCRETIONARY_TASK);

		initEEnum(sentryTypeEEnum, SentryType.class, "SentryType");
		addEEnumLiteral(sentryTypeEEnum, SentryType.ENTRY);
		addEEnumLiteral(sentryTypeEEnum, SentryType.EXIT);

		initEEnum(httpRequestEEnum, HTTPRequest.class, "HTTPRequest");
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.GET);
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.HEAD);
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.POST);
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.PUT);
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.DELETE);
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.CONNECT);
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.OPTIONS);
		addEEnumLiteral(httpRequestEEnum, HTTPRequest.TRACE);

		// Initialize data types
		initEDataType(string100CharsEDataType, String.class, "String100Chars", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(string256charsEDataType, String.class, "String256chars", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(urlFormatEDataType, String.class, "URLFormat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ifConditionEDataType, String.class, "IfCondition", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringHttpRequestEDataType, String.class, "StringHttpRequest", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (string100CharsEDataType,
		   source,
		   new String[] {
			   "maxLength", "100",
			   "pattern", "[a-zA-Z0-9%20/\\-]+"
		   });
		addAnnotation
		  (string256charsEDataType,
		   source,
		   new String[] {
			   "maxLength", "256",
			   "pattern", "[a-zA-Z0-9%20/\\-]+"
		   });
		addAnnotation
		  (urlFormatEDataType,
		   source,
		   new String[] {
			   "pattern", "[hH][tT]{2}[pP]://[wW]{3}.*"
		   });
		addAnnotation
		  (ifConditionEDataType,
		   source,
		   new String[] {
			   "pattern", "[a-zA-Z0-9%20/]+[<>=][a-zA-Z0-9%20/]+[\\+\\-*/]*[a-zA-Z0-9%20/]*"
		   });
		addAnnotation
		  (stringHttpRequestEDataType,
		   source,
		   new String[] {
			   "enumeration", "GET POST HEAD URL OPTIONS TRACE"
		   });
	}

} //CMMNPackageImpl
