/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.CaseFile#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCaseFile()
 * @model
 * @generated
 */
public interface CaseFile extends CMMNElement {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCaseFile_Name()
	 * @model dataType="org.eclipse.emfcloud.metamodel.CMMN.String256chars"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.CaseFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // CaseFile
