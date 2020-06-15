/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Event Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.TimerEventListener#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getTimerEventListener()
 * @model
 * @generated
 */
public interface TimerEventListener extends EventListener {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.TimerExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getTimerEventListener_Expression()
	 * @model type="metamodel.TimerExpression" containment="true"
	 * @generated
	 */
	EList getExpression();

} // TimerEventListener
