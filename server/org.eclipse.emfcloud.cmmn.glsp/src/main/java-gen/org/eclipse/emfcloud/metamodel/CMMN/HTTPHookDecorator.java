/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Hook Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getHTTPHookDecorator()
 * @model
 * @generated
 */
public interface HTTPHookDecorator extends Decorator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getHTTPHookDecorator_Value()
	 * @model dataType="org.eclipse.emfcloud.metamodel.CMMN.URLFormat"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #setRequest(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getHTTPHookDecorator_Request()
	 * @model dataType="org.eclipse.emfcloud.metamodel.CMMN.StringHttpRequest"
	 * @generated
	 */
	String getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(String value);

} // HTTPHookDecorator
