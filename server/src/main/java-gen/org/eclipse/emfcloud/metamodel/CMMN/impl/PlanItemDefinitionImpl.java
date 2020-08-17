/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl#getSentry <em>Sentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanItemDefinitionImpl extends CMMNElementImpl implements PlanItemDefinition {
	/**
	 * The cached value of the '{@link #getSentry() <em>Sentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentry()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentry> sentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNPackage.Literals.PLAN_ITEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentry> getSentry() {
		if (sentry == null) {
			sentry = new EObjectContainmentEList<Sentry>(Sentry.class, this, CMMNPackage.PLAN_ITEM_DEFINITION__SENTRY);
		}
		return sentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNPackage.PLAN_ITEM_DEFINITION__SENTRY:
				return ((InternalEList<?>)getSentry()).basicRemove(otherEnd, msgs);
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
			case CMMNPackage.PLAN_ITEM_DEFINITION__SENTRY:
				return getSentry();
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
			case CMMNPackage.PLAN_ITEM_DEFINITION__SENTRY:
				getSentry().clear();
				getSentry().addAll((Collection<? extends Sentry>)newValue);
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
			case CMMNPackage.PLAN_ITEM_DEFINITION__SENTRY:
				getSentry().clear();
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
			case CMMNPackage.PLAN_ITEM_DEFINITION__SENTRY:
				return sentry != null && !sentry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanItemDefinitionImpl
