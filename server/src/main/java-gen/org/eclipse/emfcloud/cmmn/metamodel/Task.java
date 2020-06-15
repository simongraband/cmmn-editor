/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Task#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link metamodel.Task#getTaskRole <em>Task Role</em>}</li>
 *   <li>{@link metamodel.Task#getDecorators <em>Decorators</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends PlanItemDefinition {
	/**
	 * Returns the value of the '<em><b>Task Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Type</em>' attribute.
	 * @see metamodel.TaskType
	 * @see #setTaskType(TaskType)
	 * @see metamodel.MetamodelPackage#getTask_TaskType()
	 * @model
	 * @generated
	 */
	TaskType getTaskType();

	/**
	 * Sets the value of the '{@link metamodel.Task#getTaskType <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Type</em>' attribute.
	 * @see metamodel.TaskType
	 * @see #getTaskType()
	 * @generated
	 */
	void setTaskType(TaskType value);

	/**
	 * Returns the value of the '<em><b>Task Role</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel.TaskRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Role</em>' attribute.
	 * @see metamodel.TaskRole
	 * @see #setTaskRole(TaskRole)
	 * @see metamodel.MetamodelPackage#getTask_TaskRole()
	 * @model
	 * @generated
	 */
	TaskRole getTaskRole();

	/**
	 * Sets the value of the '{@link metamodel.Task#getTaskRole <em>Task Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Role</em>' attribute.
	 * @see metamodel.TaskRole
	 * @see #getTaskRole()
	 * @generated
	 */
	void setTaskRole(TaskRole value);

	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Decorator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getTask_Decorators()
	 * @model type="metamodel.Decorator" containment="true"
	 * @generated
	 */
	EList getDecorators();

} // Task
