/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getSentry <em>Sentry</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getPlanItemDefinition()
 * @model
 * @generated
 */
public interface PlanItemDefinition extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Sentry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.Sentry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentry</em>' containment reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getPlanItemDefinition_Sentry()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentry> getSentry();

} // PlanItemDefinition
