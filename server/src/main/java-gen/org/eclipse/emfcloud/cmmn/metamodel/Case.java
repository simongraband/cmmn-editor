/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Case#getCasefile <em>Casefile</em>}</li>
 *   <li>{@link metamodel.Case#getStages <em>Stages</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Casefile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casefile</em>' containment reference.
	 * @see #setCasefile(CaseFile)
	 * @see metamodel.MetamodelPackage#getCase_Casefile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CaseFile getCasefile();

	/**
	 * Sets the value of the '{@link metamodel.Case#getCasefile <em>Casefile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casefile</em>' containment reference.
	 * @see #getCasefile()
	 * @generated
	 */
	void setCasefile(CaseFile value);

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getCase_Stages()
	 * @model type="metamodel.Stage" containment="true" required="true"
	 * @generated
	 */
	EList getStages();

} // Case
