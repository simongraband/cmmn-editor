/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;
import org.eclipse.emfcloud.metamodel.CMMN.SentryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getIfPart <em>If Part</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getSentryType <em>Sentry Type</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getOnPart <em>On Part</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SentryImpl extends CMMNElementImpl implements Sentry {
	/**
	 * The default value of the '{@link #getIfPart() <em>If Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfPart()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfPart() <em>If Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfPart()
	 * @generated
	 * @ordered
	 */
	protected String ifPart = IF_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getSentryType() <em>Sentry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentryType()
	 * @generated
	 * @ordered
	 */
	protected static final SentryType SENTRY_TYPE_EDEFAULT = SentryType.ENTRY;

	/**
	 * The cached value of the '{@link #getSentryType() <em>Sentry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentryType()
	 * @generated
	 * @ordered
	 */
	protected SentryType sentryType = SENTRY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnPart() <em>On Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPart()
	 * @generated
	 * @ordered
	 */
	protected PlanItemDefinition onPart;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected PlanItemDefinition anchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SentryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNPackage.Literals.SENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfPart() {
		return ifPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfPart(String newIfPart) {
		String oldIfPart = ifPart;
		ifPart = newIfPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__IF_PART, oldIfPart, ifPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentryType getSentryType() {
		return sentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentryType(SentryType newSentryType) {
		SentryType oldSentryType = sentryType;
		sentryType = newSentryType == null ? SENTRY_TYPE_EDEFAULT : newSentryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__SENTRY_TYPE, oldSentryType, sentryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanItemDefinition getOnPart() {
		if (onPart != null && onPart.eIsProxy()) {
			InternalEObject oldOnPart = (InternalEObject)onPart;
			onPart = (PlanItemDefinition)eResolveProxy(oldOnPart);
			if (onPart != oldOnPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNPackage.SENTRY__ON_PART, oldOnPart, onPart));
			}
		}
		return onPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanItemDefinition basicGetOnPart() {
		return onPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPart(PlanItemDefinition newOnPart) {
		PlanItemDefinition oldOnPart = onPart;
		onPart = newOnPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__ON_PART, oldOnPart, onPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanItemDefinition getAnchor() {
		if (anchor != null && anchor.eIsProxy()) {
			InternalEObject oldAnchor = (InternalEObject)anchor;
			anchor = (PlanItemDefinition)eResolveProxy(oldAnchor);
			if (anchor != oldAnchor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNPackage.SENTRY__ANCHOR, oldAnchor, anchor));
			}
		}
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanItemDefinition basicGetAnchor() {
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor(PlanItemDefinition newAnchor) {
		PlanItemDefinition oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__ANCHOR, oldAnchor, anchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CMMNPackage.SENTRY__IF_PART:
				return getIfPart();
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				return getSentryType();
			case CMMNPackage.SENTRY__ON_PART:
				if (resolve) return getOnPart();
				return basicGetOnPart();
			case CMMNPackage.SENTRY__ANCHOR:
				if (resolve) return getAnchor();
				return basicGetAnchor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CMMNPackage.SENTRY__IF_PART:
				setIfPart((String)newValue);
				return;
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				setSentryType((SentryType)newValue);
				return;
			case CMMNPackage.SENTRY__ON_PART:
				setOnPart((PlanItemDefinition)newValue);
				return;
			case CMMNPackage.SENTRY__ANCHOR:
				setAnchor((PlanItemDefinition)newValue);
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
			case CMMNPackage.SENTRY__IF_PART:
				setIfPart(IF_PART_EDEFAULT);
				return;
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				setSentryType(SENTRY_TYPE_EDEFAULT);
				return;
			case CMMNPackage.SENTRY__ON_PART:
				setOnPart((PlanItemDefinition)null);
				return;
			case CMMNPackage.SENTRY__ANCHOR:
				setAnchor((PlanItemDefinition)null);
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
			case CMMNPackage.SENTRY__IF_PART:
				return IF_PART_EDEFAULT == null ? ifPart != null : !IF_PART_EDEFAULT.equals(ifPart);
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				return sentryType != SENTRY_TYPE_EDEFAULT;
			case CMMNPackage.SENTRY__ON_PART:
				return onPart != null;
			case CMMNPackage.SENTRY__ANCHOR:
				return anchor != null;
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
		result.append(" (ifPart: ");
		result.append(ifPart);
		result.append(", SentryType: ");
		result.append(sentryType);
		result.append(')');
		return result.toString();
	}

} //SentryImpl
