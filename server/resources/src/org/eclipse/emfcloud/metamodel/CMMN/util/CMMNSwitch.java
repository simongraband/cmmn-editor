/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emfcloud.metamodel.CMMN.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage
 * @generated
 */
public class CMMNSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CMMNPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNSwitch() {
		if (modelPackage == null) {
			modelPackage = CMMNPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CMMNPackage.CMMN_DIAGRAM: {
				CMMNDiagram cmmnDiagram = (CMMNDiagram)theEObject;
				T result = caseCMMNDiagram(cmmnDiagram);
				if (result == null) result = caseCMMNElement(cmmnDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.CMMN_ELEMENT: {
				CMMNElement cmmnElement = (CMMNElement)theEObject;
				T result = caseCMMNElement(cmmnElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.CASE_FILE: {
				CaseFile caseFile = (CaseFile)theEObject;
				T result = caseCaseFile(caseFile);
				if (result == null) result = caseCMMNElement(caseFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = caseCMMNElement(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.STAGE: {
				Stage stage = (Stage)theEObject;
				T result = caseStage(stage);
				if (result == null) result = casePlanItemDefinition(stage);
				if (result == null) result = caseCMMNElement(stage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = casePlanItemDefinition(task);
				if (result == null) result = caseCMMNElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.EVENT_LISTENER: {
				EventListener eventListener = (EventListener)theEObject;
				T result = caseEventListener(eventListener);
				if (result == null) result = casePlanItemDefinition(eventListener);
				if (result == null) result = caseCMMNElement(eventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.SENTRY: {
				Sentry sentry = (Sentry)theEObject;
				T result = caseSentry(sentry);
				if (result == null) result = caseCMMNElement(sentry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.PLAN_ITEM_DEFINITION: {
				PlanItemDefinition planItemDefinition = (PlanItemDefinition)theEObject;
				T result = casePlanItemDefinition(planItemDefinition);
				if (result == null) result = caseCMMNElement(planItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.TIMER_EVENT_LISTENER: {
				TimerEventListener timerEventListener = (TimerEventListener)theEObject;
				T result = caseTimerEventListener(timerEventListener);
				if (result == null) result = caseEventListener(timerEventListener);
				if (result == null) result = casePlanItemDefinition(timerEventListener);
				if (result == null) result = caseCMMNElement(timerEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.USER_EVENT_LISTENER: {
				UserEventListener userEventListener = (UserEventListener)theEObject;
				T result = caseUserEventListener(userEventListener);
				if (result == null) result = caseEventListener(userEventListener);
				if (result == null) result = casePlanItemDefinition(userEventListener);
				if (result == null) result = caseCMMNElement(userEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.TIMER_EXPRESSION: {
				TimerExpression timerExpression = (TimerExpression)theEObject;
				T result = caseTimerExpression(timerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.DECORATOR: {
				Decorator decorator = (Decorator)theEObject;
				T result = caseDecorator(decorator);
				if (result == null) result = caseCMMNElement(decorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.MANDATORY_DECORATOR: {
				MandatoryDecorator mandatoryDecorator = (MandatoryDecorator)theEObject;
				T result = caseMandatoryDecorator(mandatoryDecorator);
				if (result == null) result = caseDecorator(mandatoryDecorator);
				if (result == null) result = caseCMMNElement(mandatoryDecorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMMNPackage.HTTP_HOOK_DECORATOR: {
				HTTPHookDecorator httpHookDecorator = (HTTPHookDecorator)theEObject;
				T result = caseHTTPHookDecorator(httpHookDecorator);
				if (result == null) result = caseDecorator(httpHookDecorator);
				if (result == null) result = caseCMMNElement(httpHookDecorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMMNDiagram(CMMNDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMMNElement(CMMNElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseFile(CaseFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStage(Stage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventListener(EventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentry(Sentry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanItemDefinition(PlanItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerEventListener(TimerEventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserEventListener(UserEventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerExpression(TimerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecorator(Decorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryDecorator(MandatoryDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Hook Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Hook Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPHookDecorator(HTTPHookDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CMMNSwitch
