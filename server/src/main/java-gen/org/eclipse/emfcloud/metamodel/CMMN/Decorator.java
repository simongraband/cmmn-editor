/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Decorator#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getDecorator()
 * @model DecoratorTypeBounds="org.eclipse.emf.ecore.EString"
 * @generated
 */
public interface Decorator<DecoratorType extends String> extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getDecorator_Value()
	 * @model
	 * @generated
	 */
	DecoratorType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Decorator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DecoratorType value);

} // Decorator
