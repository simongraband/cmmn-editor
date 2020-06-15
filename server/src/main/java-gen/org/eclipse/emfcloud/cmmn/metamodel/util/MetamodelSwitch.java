/**
 */
package org.eclipse.emfcloud.cmmn.metamodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNElement;
import org.eclipse.emfcloud.cmmn.metamodel.Case;
import org.eclipse.emfcloud.cmmn.metamodel.CaseFile;
import org.eclipse.emfcloud.cmmn.metamodel.Decorator;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;
import org.eclipse.emfcloud.cmmn.metamodel.PlanItemDefinition;
import org.eclipse.emfcloud.cmmn.metamodel.Sentry;
import org.eclipse.emfcloud.cmmn.metamodel.TimerEventListener;
import org.eclipse.emfcloud.cmmn.metamodel.TimerExpression;
import org.eclipse.emfcloud.cmmn.metamodel.UserEventListener;

import org.eclipse.emfcloud.cmmn.metamodel.*;

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
 * @see metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetamodelPackage.CMMN_ELEMENT: {
				CMMNElement cmmnElement = (CMMNElement)theEObject;
				Object result = caseCMMNElement(cmmnElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CASE_FILE: {
				CaseFile caseFile = (CaseFile)theEObject;
				Object result = caseCaseFile(caseFile);
				if (result == null) result = caseCMMNElement(caseFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CASE: {
				Case case_ = (Case)theEObject;
				Object result = caseCase(case_);
				if (result == null) result = caseCMMNElement(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.STAGE: {
				Stage stage = (Stage)theEObject;
				Object result = caseStage(stage);
				if (result == null) result = casePlanItemDefinition(stage);
				if (result == null) result = caseCMMNElement(stage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TASK: {
				Task task = (Task)theEObject;
				Object result = caseTask(task);
				if (result == null) result = casePlanItemDefinition(task);
				if (result == null) result = caseCMMNElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EVENT_LISTENER: {
				EventListener eventListener = (EventListener)theEObject;
				Object result = caseEventListener(eventListener);
				if (result == null) result = casePlanItemDefinition(eventListener);
				if (result == null) result = caseCMMNElement(eventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DECORATOR: {
				Decorator decorator = (Decorator)theEObject;
				Object result = caseDecorator(decorator);
				if (result == null) result = caseCMMNElement(decorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.SENTRY: {
				Sentry sentry = (Sentry)theEObject;
				Object result = caseSentry(sentry);
				if (result == null) result = caseCMMNElement(sentry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = caseCMMNElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.PLAN_ITEM_DEFINITION: {
				PlanItemDefinition planItemDefinition = (PlanItemDefinition)theEObject;
				Object result = casePlanItemDefinition(planItemDefinition);
				if (result == null) result = caseCMMNElement(planItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TIMER_EVENT_LISTENER: {
				TimerEventListener timerEventListener = (TimerEventListener)theEObject;
				Object result = caseTimerEventListener(timerEventListener);
				if (result == null) result = caseEventListener(timerEventListener);
				if (result == null) result = casePlanItemDefinition(timerEventListener);
				if (result == null) result = caseCMMNElement(timerEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.USER_EVENT_LISTENER: {
				UserEventListener userEventListener = (UserEventListener)theEObject;
				Object result = caseUserEventListener(userEventListener);
				if (result == null) result = caseEventListener(userEventListener);
				if (result == null) result = casePlanItemDefinition(userEventListener);
				if (result == null) result = caseCMMNElement(userEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TIMER_EXPRESSION: {
				TimerExpression timerExpression = (TimerExpression)theEObject;
				Object result = caseTimerExpression(timerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMMN Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMMN Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCMMNElement(CMMNElement object) {
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
	public Object caseCaseFile(CaseFile object) {
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
	public Object caseCase(Case object) {
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
	public Object caseStage(Stage object) {
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
	public Object caseTask(Task object) {
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
	public Object caseEventListener(EventListener object) {
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
	public Object caseDecorator(Decorator object) {
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
	public Object caseSentry(Sentry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
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
	public Object casePlanItemDefinition(PlanItemDefinition object) {
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
	public Object caseTimerEventListener(TimerEventListener object) {
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
	public Object caseUserEventListener(UserEventListener object) {
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
	public Object caseTimerExpression(TimerExpression object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //MetamodelSwitch
