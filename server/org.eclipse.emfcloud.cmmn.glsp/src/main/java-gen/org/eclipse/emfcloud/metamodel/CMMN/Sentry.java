/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getIfPart <em>If Part</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getSentryType <em>Sentry Type</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getOnPart <em>On Part</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry()
 * @model
 * @generated
 */
public interface Sentry extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>If Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Part</em>' attribute.
	 * @see #setIfPart(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_IfPart()
	 * @model dataType="org.eclipse.emfcloud.metamodel.CMMN.IfCondition"
	 * @generated
	 */
	String getIfPart();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getIfPart <em>If Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Part</em>' attribute.
	 * @see #getIfPart()
	 * @generated
	 */
	void setIfPart(String value);

	/**
	 * Returns the value of the '<em><b>Sentry Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emfcloud.metamodel.CMMN.SentryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentry Type</em>' attribute.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.SentryType
	 * @see #setSentryType(SentryType)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_SentryType()
	 * @model
	 * @generated
	 */
	SentryType getSentryType();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getSentryType <em>Sentry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentry Type</em>' attribute.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.SentryType
	 * @see #getSentryType()
	 * @generated
	 */
	void setSentryType(SentryType value);

	/**
	 * Returns the value of the '<em><b>On Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Part</em>' reference.
	 * @see #setOnPart(PlanItemDefinition)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_OnPart()
	 * @model required="true"
	 * @generated
	 */
	PlanItemDefinition getOnPart();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getOnPart <em>On Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Part</em>' reference.
	 * @see #getOnPart()
	 * @generated
	 */
	void setOnPart(PlanItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' reference.
	 * @see #setAnchor(PlanItemDefinition)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_Anchor()
	 * @model required="true"
	 * @generated
	 */
	PlanItemDefinition getAnchor();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getAnchor <em>Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(PlanItemDefinition value);

} // Sentry
