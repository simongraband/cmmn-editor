/**
 */
package org.eclipse.emfcloud.cmmn.metamodel.impl;

import java.util.Collection;

import org.eclipse.emfcloud.cmmn.metamodel.Decorator;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;
import org.eclipse.emfcloud.cmmn.metamodel.Task;
import org.eclipse.emfcloud.cmmn.metamodel.TaskRole;
import org.eclipse.emfcloud.cmmn.metamodel.TaskType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.impl.TaskImpl#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link metamodel.impl.TaskImpl#getTaskRole <em>Task Role</em>}</li>
 *   <li>{@link metamodel.impl.TaskImpl#getDecorators <em>Decorators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends PlanItemDefinitionImpl implements Task {
	/**
	 * The default value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected static final TaskType TASK_TYPE_EDEFAULT = TaskType.TASK_LITERAL;

	/**
	 * The cached value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected TaskType taskType = TASK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskRole() <em>Task Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRole()
	 * @generated
	 * @ordered
	 */
	protected static final TaskRole TASK_ROLE_EDEFAULT = TaskRole.HUMAN_LITERAL;

	/**
	 * The cached value of the '{@link #getTaskRole() <em>Task Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRole()
	 * @generated
	 * @ordered
	 */
	protected TaskRole taskRole = TASK_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecorators() <em>Decorators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorators()
	 * @generated
	 * @ordered
	 */
	protected EList decorators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType getTaskType() {
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskType(TaskType newTaskType) {
		TaskType oldTaskType = taskType;
		taskType = newTaskType == null ? TASK_TYPE_EDEFAULT : newTaskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TASK__TASK_TYPE, oldTaskType, taskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRole getTaskRole() {
		return taskRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskRole(TaskRole newTaskRole) {
		TaskRole oldTaskRole = taskRole;
		taskRole = newTaskRole == null ? TASK_ROLE_EDEFAULT : newTaskRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TASK__TASK_ROLE, oldTaskRole, taskRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDecorators() {
		if (decorators == null) {
			decorators = new EObjectContainmentEList(Decorator.class, this, MetamodelPackage.TASK__DECORATORS);
		}
		return decorators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.TASK__DECORATORS:
				return ((InternalEList)getDecorators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.TASK__TASK_TYPE:
				return getTaskType();
			case MetamodelPackage.TASK__TASK_ROLE:
				return getTaskRole();
			case MetamodelPackage.TASK__DECORATORS:
				return getDecorators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.TASK__TASK_TYPE:
				setTaskType((TaskType)newValue);
				return;
			case MetamodelPackage.TASK__TASK_ROLE:
				setTaskRole((TaskRole)newValue);
				return;
			case MetamodelPackage.TASK__DECORATORS:
				getDecorators().clear();
				getDecorators().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelPackage.TASK__TASK_TYPE:
				setTaskType(TASK_TYPE_EDEFAULT);
				return;
			case MetamodelPackage.TASK__TASK_ROLE:
				setTaskRole(TASK_ROLE_EDEFAULT);
				return;
			case MetamodelPackage.TASK__DECORATORS:
				getDecorators().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.TASK__TASK_TYPE:
				return taskType != TASK_TYPE_EDEFAULT;
			case MetamodelPackage.TASK__TASK_ROLE:
				return taskRole != TASK_ROLE_EDEFAULT;
			case MetamodelPackage.TASK__DECORATORS:
				return decorators != null && !decorators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (taskType: ");
		result.append(taskType);
		result.append(", taskRole: ");
		result.append(taskRole);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
