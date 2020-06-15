/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Decorator#getDataType <em>Data Type</em>}</li>
 *   <li>{@link metamodel.Decorator#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getDecorator()
 * @model
 * @generated
 */
public interface Decorator extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Class)
	 * @see metamodel.MetamodelPackage#getDecorator_DataType()
	 * @model
	 * @generated
	 */
	Class getDataType();

	/**
	 * Sets the value of the '{@link metamodel.Decorator#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Class value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Class)
	 * @see metamodel.MetamodelPackage#getDecorator_Value()
	 * @model
	 * @generated
	 */
	Class getValue();

	/**
	 * Sets the value of the '{@link metamodel.Decorator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Class value);

} // Decorator
