/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Stage#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends PlanItemDefinition {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getStage_Tasks()
	 * @model type="metamodel.Task" containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Stage
