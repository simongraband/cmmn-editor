/**
 */
package org.eclipse.emfcloud.cmmn.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;
import org.eclipse.emfcloud.cmmn.metamodel.PlanItemDefinition;
import org.eclipse.emfcloud.cmmn.metamodel.Sentry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.cmmn.metamodel.impl.PlanItemDefinitionImpl#getSentry <em>Sentry</em>}</li>
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
	protected EList sentry;

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
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PLAN_ITEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSentry() {
		if (sentry == null) {
			sentry = new EObjectContainmentEList(Sentry.class, this, MetamodelPackage.PLAN_ITEM_DEFINITION__SENTRY);
		}
		return sentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.PLAN_ITEM_DEFINITION__SENTRY:
				return ((InternalEList)getSentry()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.PLAN_ITEM_DEFINITION__SENTRY:
				return getSentry();
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
			case MetamodelPackage.PLAN_ITEM_DEFINITION__SENTRY:
				getSentry().clear();
				getSentry().addAll((Collection)newValue);
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
			case MetamodelPackage.PLAN_ITEM_DEFINITION__SENTRY:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.PLAN_ITEM_DEFINITION__SENTRY:
				return sentry != null && !sentry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanItemDefinitionImpl
