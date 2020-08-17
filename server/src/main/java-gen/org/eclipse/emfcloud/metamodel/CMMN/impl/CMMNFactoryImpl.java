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
			case CMMNPackage.DECORATOR: return createDecorator();
			case CMMNPackage.SENTRY: return createSentry();
			case CMMNPackage.EXPRESSION: return createExpression();
			case CMMNPackage.PLAN_ITEM_DEFINITION: return createPlanItemDefinition();
			case CMMNPackage.TIMER_EVENT_LISTENER: return createTimerEventListener();
			case CMMNPackage.USER_EVENT_LISTENER: return createUserEventListener();
			case CMMNPackage.TIMER_EXPRESSION: return createTimerExpression();
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
	public <DecoratorType extends String> Decorator<DecoratorType> createDecorator() {
		DecoratorImpl<DecoratorType> decorator = new DecoratorImpl<DecoratorType>();
		return decorator;
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
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
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
