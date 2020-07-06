/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

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
 *   <li>{@link metamodel.PlanItemDefinition#getSentry <em>Sentry</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getPlanItemDefinition()
 * @model
 * @generated
 */
public interface PlanItemDefinition extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Sentry</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Sentry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentry</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getPlanItemDefinition_Sentry()
	 * @model type="metamodel.Sentry" containment="true"
	 * @generated
	 */
	EList<Sentry> getSentry();

} // PlanItemDefinition
