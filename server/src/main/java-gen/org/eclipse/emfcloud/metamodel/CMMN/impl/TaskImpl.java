/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.Decorator;
import org.eclipse.emfcloud.metamodel.CMMN.Task;
import org.eclipse.emfcloud.metamodel.CMMN.TaskRole;
import org.eclipse.emfcloud.metamodel.CMMN.TaskType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TaskImpl#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TaskImpl#getTaskRole <em>Task Role</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.TaskImpl#getDecorators <em>Decorators</em>}</li>
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
	protected static final TaskType TASK_TYPE_EDEFAULT = TaskType.TASK;

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
	protected static final TaskRole TASK_ROLE_EDEFAULT = TaskRole.HUMAN;

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
	protected EList<Decorator> decorators;

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
	@Override
	protected EClass eStaticClass() {
		return CMMNPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TASK__TASK_TYPE, oldTaskType, taskType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TASK__TASK_ROLE, oldTaskRole, taskRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decorator> getDecorators() {
		if (decorators == null) {
			decorators = new EObjectContainmentEList<Decorator>(Decorator.class, this, CMMNPackage.TASK__DECORATORS);
		}
		return decorators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNPackage.TASK__DECORATORS:
				return ((InternalEList<?>)getDecorators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CMMNPackage.TASK__TASK_TYPE:
				return getTaskType();
			case CMMNPackage.TASK__TASK_ROLE:
				return getTaskRole();
			case CMMNPackage.TASK__DECORATORS:
				return getDecorators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CMMNPackage.TASK__TASK_TYPE:
				setTaskType((TaskType)newValue);
				return;
			case CMMNPackage.TASK__TASK_ROLE:
				setTaskRole((TaskRole)newValue);
				return;
			case CMMNPackage.TASK__DECORATORS:
				getDecorators().clear();
				getDecorators().addAll((Collection<? extends Decorator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CMMNPackage.TASK__TASK_TYPE:
				setTaskType(TASK_TYPE_EDEFAULT);
				return;
			case CMMNPackage.TASK__TASK_ROLE:
				setTaskRole(TASK_ROLE_EDEFAULT);
				return;
			case CMMNPackage.TASK__DECORATORS:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CMMNPackage.TASK__TASK_TYPE:
				return taskType != TASK_TYPE_EDEFAULT;
			case CMMNPackage.TASK__TASK_ROLE:
				return taskRole != TASK_ROLE_EDEFAULT;
			case CMMNPackage.TASK__DECORATORS:
				return decorators != null && !decorators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (taskType: ");
		result.append(taskType);
		result.append(", taskRole: ");
		result.append(taskRole);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
