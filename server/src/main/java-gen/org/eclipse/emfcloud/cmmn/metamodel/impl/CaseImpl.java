/**
 */
package org.eclipse.emfcloud.cmmn.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emfcloud.cmmn.metamodel.Case;
import org.eclipse.emfcloud.cmmn.metamodel.CaseFile;
import org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage;
import org.eclipse.emfcloud.cmmn.metamodel.Stage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.impl.CaseImpl#getCasefile <em>Casefile</em>}</li>
 *   <li>{@link metamodel.impl.CaseImpl#getStages <em>Stages</em>}</li>
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
	protected EList stages;

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
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CASE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.CASE__CASEFILE, oldCasefile, newCasefile);
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
				msgs = ((InternalEObject)casefile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.CASE__CASEFILE, null, msgs);
			if (newCasefile != null)
				msgs = ((InternalEObject)newCasefile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.CASE__CASEFILE, null, msgs);
			msgs = basicSetCasefile(newCasefile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CASE__CASEFILE, newCasefile, newCasefile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStages() {
		if (stages == null) {
			stages = new EObjectContainmentEList(Stage.class, this, MetamodelPackage.CASE__STAGES);
		}
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.CASE__CASEFILE:
				return basicSetCasefile(null, msgs);
			case MetamodelPackage.CASE__STAGES:
				return ((InternalEList)getStages()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.CASE__CASEFILE:
				return getCasefile();
			case MetamodelPackage.CASE__STAGES:
				return getStages();
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
			case MetamodelPackage.CASE__CASEFILE:
				setCasefile((CaseFile)newValue);
				return;
			case MetamodelPackage.CASE__STAGES:
				getStages().clear();
				getStages().addAll((Collection)newValue);
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
			case MetamodelPackage.CASE__CASEFILE:
				setCasefile((CaseFile)null);
				return;
			case MetamodelPackage.CASE__STAGES:
				getStages().clear();
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
			case MetamodelPackage.CASE__CASEFILE:
				return casefile != null;
			case MetamodelPackage.CASE__STAGES:
				return stages != null && !stages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseImpl
