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
 *   <li>{@link org.eclipse.emfcloud.cmmn.metamodel.Case#getCasefile <em>Casefile</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.cmmn.metamodel.Case#getStages <em>Stages</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.cmmn.metamodel.Case#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getCase()
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
	 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getCase_Casefile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CaseFile getCasefile();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.cmmn.metamodel.Case#getCasefile <em>Casefile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casefile</em>' containment reference.
	 * @see #getCasefile()
	 * @generated
	 */
	void setCasefile(CaseFile value);

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.cmmn.metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getCase_Stages()
	 * @model type="org.eclipse.emfcloud.cmmn.metamodel.Stage" containment="true" required="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.cmmn.metamodel.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getCase_Tasks()
	 * @model type="org.eclipse.emfcloud.cmmn.metamodel.Task" containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Case
