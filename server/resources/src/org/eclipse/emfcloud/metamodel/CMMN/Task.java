/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskRole <em>Task Role</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends PlanItemDefinition {
	/**
	 * Returns the value of the '<em><b>Task Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emfcloud.metamodel.CMMN.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Type</em>' attribute.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskType
	 * @see #setTaskType(TaskType)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getTask_TaskType()
	 * @model
	 * @generated
	 */
	TaskType getTaskType();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskType <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Type</em>' attribute.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskType
	 * @see #getTaskType()
	 * @generated
	 */
	void setTaskType(TaskType value);

	/**
	 * Returns the value of the '<em><b>Task Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emfcloud.metamodel.CMMN.TaskRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Role</em>' attribute.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskRole
	 * @see #setTaskRole(TaskRole)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getTask_TaskRole()
	 * @model
	 * @generated
	 */
	TaskRole getTaskRole();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getTaskRole <em>Task Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Role</em>' attribute.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.TaskRole
	 * @see #getTaskRole()
	 * @generated
	 */
	void setTaskRole(TaskRole value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getTask_Name()
	 * @model dataType="org.eclipse.emfcloud.metamodel.CMMN.String256chars"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Task
