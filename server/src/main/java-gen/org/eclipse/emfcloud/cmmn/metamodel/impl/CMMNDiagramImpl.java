/**
 */
package org.eclipse.emfcloud.cmmn.metamodel.impl;

import java.util.Collection;

import org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram;
import org.eclipse.emfcloud.cmmn.metamodel.CMMNElement;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.impl.CMMNDiagramImpl#getCmmnElements <em>Cmmn Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMMNDiagramImpl extends CMMNElementImpl implements CMMNDiagram {
	/**
	 * The cached value of the '{@link #getCmmnElements() <em>Cmmn Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmmnElements()
	 * @generated
	 * @ordered
	 */
	protected EList cmmnElements;

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
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CMMN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCmmnElements() {
		if (cmmnElements == null) {
			cmmnElements = new EObjectResolvingEList(CMMNElement.class, this, MetamodelPackage.CMMN_DIAGRAM__CMMN_ELEMENTS);
		}
		return cmmnElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				return getCmmnElements();
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
			case MetamodelPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				getCmmnElements().clear();
				getCmmnElements().addAll((Collection)newValue);
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
			case MetamodelPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
				return cmmnElements != null && !cmmnElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CMMNDiagramImpl
