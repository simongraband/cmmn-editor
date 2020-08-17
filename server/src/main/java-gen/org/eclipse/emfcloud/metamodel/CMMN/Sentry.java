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
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getOnPartId <em>On Part Id</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getIfPart <em>If Part</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getSentryType <em>Sentry Type</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getAnchorId <em>Anchor Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry()
 * @model
 * @generated
 */
public interface Sentry extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>On Part Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Part Id</em>' attribute.
	 * @see #setOnPartId(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_OnPartId()
	 * @model
	 * @generated
	 */
	String getOnPartId();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getOnPartId <em>On Part Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Part Id</em>' attribute.
	 * @see #getOnPartId()
	 * @generated
	 */
	void setOnPartId(String value);

	/**
	 * Returns the value of the '<em><b>If Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Part</em>' attribute.
	 * @see #setIfPart(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_IfPart()
	 * @model
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
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Anchor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Id</em>' attribute.
	 * @see #setAnchorId(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getSentry_AnchorId()
	 * @model
	 * @generated
	 */
	String getAnchorId();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Sentry#getAnchorId <em>Anchor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Id</em>' attribute.
	 * @see #getAnchorId()
	 * @generated
	 */
	void setAnchorId(String value);

} // Sentry
