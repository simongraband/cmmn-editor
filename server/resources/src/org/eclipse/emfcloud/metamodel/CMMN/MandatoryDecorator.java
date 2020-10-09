/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getMandatoryDecorator()
 * @model
 * @generated
 */
public interface MandatoryDecorator extends Decorator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getMandatoryDecorator_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // MandatoryDecorator
