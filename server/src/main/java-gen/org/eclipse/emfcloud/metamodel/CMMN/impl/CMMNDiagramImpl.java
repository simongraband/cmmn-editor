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

import org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNElement;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.CMMNDiagramImpl#getCmmnElements <em>Cmmn Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMMNDiagramImpl extends CMMNElementImpl implements CMMNDiagram {
	/**
	 * The cached value of the '{@link #getCmmnElements() <em>Cmmn Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmmnElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CMMNElement> cmmnElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMMNDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNPackage.Literals.CMMN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CMMNElement> getCmmnElements() {
		if (cmmnElements == null) {
			cmmnElements = new EObjectContainmentEList<CMMNElement>(CMMNElement.class, this, CMMNPackage.CMMN_DIAGRAM__CMMN_ELEMENTS);
		}
		return cmmnElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				return ((InternalEList<?>)getCmmnElements()).basicRemove(otherEnd, msgs);
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
			case CMMNPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				return getCmmnElements();
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
			case CMMNPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				getCmmnElements().clear();
				getCmmnElements().addAll((Collection<? extends CMMNElement>)newValue);
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
			case CMMNPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				getCmmnElements().clear();
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
			case CMMNPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				return cmmnElements != null && !cmmnElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CMMNDiagramImpl
