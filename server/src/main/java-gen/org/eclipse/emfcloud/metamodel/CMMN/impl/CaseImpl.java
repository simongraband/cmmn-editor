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
import org.eclipse.emfcloud.metamodel.CMMN.Case;
import org.eclipse.emfcloud.metamodel.CMMN.CaseFile;
import org.eclipse.emfcloud.metamodel.CMMN.Stage;
import org.eclipse.emfcloud.metamodel.CMMN.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CaseImpl#getCasefile <em>Casefile</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CaseImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CaseImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseImpl extends CMMNElementImpl implements Case {
	/**
	 * The cached value of the '{@link #getCasefile() <em>Casefile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasefile()
	 * @generated
	 * @ordered
	 */
	protected CaseFile casefile;

	/**
	 * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stages;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNPackage.Literals.CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseFile getCasefile() {
		return casefile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCasefile(CaseFile newCasefile, NotificationChain msgs) {
		CaseFile oldCasefile = casefile;
		casefile = newCasefile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.CASE__CASEFILE, oldCasefile, newCasefile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasefile(CaseFile newCasefile) {
		if (newCasefile != casefile) {
			NotificationChain msgs = null;
			if (casefile != null)
				msgs = ((InternalEObject)casefile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.CASE__CASEFILE, null, msgs);
			if (newCasefile != null)
				msgs = ((InternalEObject)newCasefile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.CASE__CASEFILE, null, msgs);
			msgs = basicSetCasefile(newCasefile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.CASE__CASEFILE, newCasefile, newCasefile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stage> getStages() {
		if (stages == null) {
			stages = new EObjectContainmentEList<Stage>(Stage.class, this, CMMNPackage.CASE__STAGES);
		}
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, CMMNPackage.CASE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNPackage.CASE__CASEFILE:
				return basicSetCasefile(null, msgs);
			case CMMNPackage.CASE__STAGES:
				return ((InternalEList<?>)getStages()).basicRemove(otherEnd, msgs);
			case CMMNPackage.CASE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case CMMNPackage.CASE__CASEFILE:
				return getCasefile();
			case CMMNPackage.CASE__STAGES:
				return getStages();
			case CMMNPackage.CASE__TASKS:
				return getTasks();
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
			case CMMNPackage.CASE__CASEFILE:
				setCasefile((CaseFile)newValue);
				return;
			case CMMNPackage.CASE__STAGES:
				getStages().clear();
				getStages().addAll((Collection<? extends Stage>)newValue);
				return;
			case CMMNPackage.CASE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case CMMNPackage.CASE__CASEFILE:
				setCasefile((CaseFile)null);
				return;
			case CMMNPackage.CASE__STAGES:
				getStages().clear();
				return;
			case CMMNPackage.CASE__TASKS:
				getTasks().clear();
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
			case CMMNPackage.CASE__CASEFILE:
				return casefile != null;
			case CMMNPackage.CASE__STAGES:
				return stages != null && !stages.isEmpty();
			case CMMNPackage.CASE__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseImpl