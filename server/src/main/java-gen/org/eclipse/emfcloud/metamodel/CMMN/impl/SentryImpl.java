/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.Expression;
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
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getOnPartId <em>On Part Id</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getIfPart <em>If Part</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getSentryType <em>Sentry Type</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.SentryImpl#getAnchorId <em>Anchor Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SentryImpl extends CMMNElementImpl implements Sentry {
	/**
	 * The default value of the '{@link #getOnPartId() <em>On Part Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPartId()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PART_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPartId() <em>On Part Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPartId()
	 * @generated
	 * @ordered
	 */
	protected String onPartId = ON_PART_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The default value of the '{@link #getAnchorId() <em>Anchor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorId()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorId() <em>Anchor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorId()
	 * @generated
	 * @ordered
	 */
	protected String anchorId = ANCHOR_ID_EDEFAULT;

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
	public String getOnPartId() {
		return onPartId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPartId(String newOnPartId) {
		String oldOnPartId = onPartId;
		onPartId = newOnPartId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__ON_PART_ID, oldOnPartId, onPartId));
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
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.SENTRY__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.SENTRY__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnchorId() {
		return anchorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorId(String newAnchorId) {
		String oldAnchorId = anchorId;
		anchorId = newAnchorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.SENTRY__ANCHOR_ID, oldAnchorId, anchorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNPackage.SENTRY__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case CMMNPackage.SENTRY__ON_PART_ID:
				return getOnPartId();
			case CMMNPackage.SENTRY__IF_PART:
				return getIfPart();
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				return getSentryType();
			case CMMNPackage.SENTRY__EXPRESSION:
				return getExpression();
			case CMMNPackage.SENTRY__ANCHOR_ID:
				return getAnchorId();
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
			case CMMNPackage.SENTRY__ON_PART_ID:
				setOnPartId((String)newValue);
				return;
			case CMMNPackage.SENTRY__IF_PART:
				setIfPart((String)newValue);
				return;
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				setSentryType((SentryType)newValue);
				return;
			case CMMNPackage.SENTRY__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case CMMNPackage.SENTRY__ANCHOR_ID:
				setAnchorId((String)newValue);
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
			case CMMNPackage.SENTRY__ON_PART_ID:
				setOnPartId(ON_PART_ID_EDEFAULT);
				return;
			case CMMNPackage.SENTRY__IF_PART:
				setIfPart(IF_PART_EDEFAULT);
				return;
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				setSentryType(SENTRY_TYPE_EDEFAULT);
				return;
			case CMMNPackage.SENTRY__EXPRESSION:
				setExpression((Expression)null);
				return;
			case CMMNPackage.SENTRY__ANCHOR_ID:
				setAnchorId(ANCHOR_ID_EDEFAULT);
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
			case CMMNPackage.SENTRY__ON_PART_ID:
				return ON_PART_ID_EDEFAULT == null ? onPartId != null : !ON_PART_ID_EDEFAULT.equals(onPartId);
			case CMMNPackage.SENTRY__IF_PART:
				return IF_PART_EDEFAULT == null ? ifPart != null : !IF_PART_EDEFAULT.equals(ifPart);
			case CMMNPackage.SENTRY__SENTRY_TYPE:
				return sentryType != SENTRY_TYPE_EDEFAULT;
			case CMMNPackage.SENTRY__EXPRESSION:
				return expression != null;
			case CMMNPackage.SENTRY__ANCHOR_ID:
				return ANCHOR_ID_EDEFAULT == null ? anchorId != null : !ANCHOR_ID_EDEFAULT.equals(anchorId);
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
		result.append(" (onPartId: ");
		result.append(onPartId);
		result.append(", ifPart: ");
		result.append(ifPart);
		result.append(", SentryType: ");
		result.append(sentryType);
		result.append(", anchorId: ");
		result.append(anchorId);
		result.append(')');
		return result.toString();
	}

} //SentryImpl
