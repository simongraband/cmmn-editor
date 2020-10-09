/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emfcloud.metamodel.CMMN.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNFactoryImpl extends EFactoryImpl implements CMMNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMMNFactory init() {
		try {
			CMMNFactory theCMMNFactory = (CMMNFactory)EPackage.Registry.INSTANCE.getEFactory(CMMNPackage.eNS_URI);
			if (theCMMNFactory != null) {
				return theCMMNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CMMNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CMMNPackage.CMMN_DIAGRAM: return createCMMNDiagram();
			case CMMNPackage.CMMN_ELEMENT: return createCMMNElement();
			case CMMNPackage.CASE_FILE: return createCaseFile();
			case CMMNPackage.CASE: return createCase();
			case CMMNPackage.STAGE: return createStage();
			case CMMNPackage.TASK: return createTask();
			case CMMNPackage.EVENT_LISTENER: return createEventListener();
			case CMMNPackage.SENTRY: return createSentry();
			case CMMNPackage.PLAN_ITEM_DEFINITION: return createPlanItemDefinition();
			case CMMNPackage.TIMER_EVENT_LISTENER: return createTimerEventListener();
			case CMMNPackage.USER_EVENT_LISTENER: return createUserEventListener();
			case CMMNPackage.TIMER_EXPRESSION: return createTimerExpression();
			case CMMNPackage.DECORATOR: return createDecorator();
			case CMMNPackage.MANDATORY_DECORATOR: return createMandatoryDecorator();
			case CMMNPackage.HTTP_HOOK_DECORATOR: return createHTTPHookDecorator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CMMNPackage.TASK_ROLE:
				return createTaskRoleFromString(eDataType, initialValue);
			case CMMNPackage.TASK_TYPE:
				return createTaskTypeFromString(eDataType, initialValue);
			case CMMNPackage.SENTRY_TYPE:
				return createSentryTypeFromString(eDataType, initialValue);
			case CMMNPackage.HTTP_REQUEST:
				return createHTTPRequestFromString(eDataType, initialValue);
			case CMMNPackage.STRING100_CHARS:
				return createString100CharsFromString(eDataType, initialValue);
			case CMMNPackage.STRING256CHARS:
				return createString256charsFromString(eDataType, initialValue);
			case CMMNPackage.URL_FORMAT:
				return createURLFormatFromString(eDataType, initialValue);
			case CMMNPackage.IF_CONDITION:
				return createIfConditionFromString(eDataType, initialValue);
			case CMMNPackage.STRING_HTTP_REQUEST:
				return createStringHttpRequestFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CMMNPackage.TASK_ROLE:
				return convertTaskRoleToString(eDataType, instanceValue);
			case CMMNPackage.TASK_TYPE:
				return convertTaskTypeToString(eDataType, instanceValue);
			case CMMNPackage.SENTRY_TYPE:
				return convertSentryTypeToString(eDataType, instanceValue);
			case CMMNPackage.HTTP_REQUEST:
				return convertHTTPRequestToString(eDataType, instanceValue);
			case CMMNPackage.STRING100_CHARS:
				return convertString100CharsToString(eDataType, instanceValue);
			case CMMNPackage.STRING256CHARS:
				return convertString256charsToString(eDataType, instanceValue);
			case CMMNPackage.URL_FORMAT:
				return convertURLFormatToString(eDataType, instanceValue);
			case CMMNPackage.IF_CONDITION:
				return convertIfConditionToString(eDataType, instanceValue);
			case CMMNPackage.STRING_HTTP_REQUEST:
				return convertStringHttpRequestToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNDiagram createCMMNDiagram() {
		CMMNDiagramImpl cmmnDiagram = new CMMNDiagramImpl();
		return cmmnDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNElement createCMMNElement() {
		CMMNElementImpl cmmnElement = new CMMNElementImpl();
		return cmmnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseFile createCaseFile() {
		CaseFileImpl caseFile = new CaseFileImpl();
		return caseFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListener createEventListener() {
		EventListenerImpl eventListener = new EventListenerImpl();
		return eventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentry createSentry() {
		SentryImpl sentry = new SentryImpl();
		return sentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanItemDefinition createPlanItemDefinition() {
		PlanItemDefinitionImpl planItemDefinition = new PlanItemDefinitionImpl();
		return planItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEventListener createTimerEventListener() {
		TimerEventListenerImpl timerEventListener = new TimerEventListenerImpl();
		return timerEventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserEventListener createUserEventListener() {
		UserEventListenerImpl userEventListener = new UserEventListenerImpl();
		return userEventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerExpression createTimerExpression() {
		TimerExpressionImpl timerExpression = new TimerExpressionImpl();
		return timerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decorator createDecorator() {
		DecoratorImpl decorator = new DecoratorImpl();
		return decorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryDecorator createMandatoryDecorator() {
		MandatoryDecoratorImpl mandatoryDecorator = new MandatoryDecoratorImpl();
		return mandatoryDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPHookDecorator createHTTPHookDecorator() {
		HTTPHookDecoratorImpl httpHookDecorator = new HTTPHookDecoratorImpl();
		return httpHookDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRole createTaskRoleFromString(EDataType eDataType, String initialValue) {
		TaskRole result = TaskRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskTypeFromString(EDataType eDataType, String initialValue) {
		TaskType result = TaskType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentryType createSentryTypeFromString(EDataType eDataType, String initialValue) {
		SentryType result = SentryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSentryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPRequest createHTTPRequestFromString(EDataType eDataType, String initialValue) {
		HTTPRequest result = HTTPRequest.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPRequestToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createString100CharsFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString100CharsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createString256charsFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString256charsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURLFormatFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLFormatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfConditionFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfConditionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringHttpRequestFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringHttpRequestToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNPackage getCMMNPackage() {
		return (CMMNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CMMNPackage getPackage() {
		return CMMNPackage.eINSTANCE;
	}

} //CMMNFactoryImpl
