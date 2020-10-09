/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getCasefile <em>Casefile</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getStages <em>Stages</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getEventListeners <em>Event Listeners</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCase()
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
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCase_Casefile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CaseFile getCasefile();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getCasefile <em>Casefile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casefile</em>' containment reference.
	 * @see #getCasefile()
	 * @generated
	 */
	void setCasefile(CaseFile value);

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCase_Stages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCase_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCase_Name()
	 * @model dataType="org.eclipse.emfcloud.metamodel.CMMN.String100Chars"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emfcloud.metamodel.CMMN.Case#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.EventListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listeners</em>' containment reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCase_EventListeners()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventListener> getEventListeners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean duplicateStageNames(DiagnosticChain chain, Map<?, ?> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean duplicateTaskNames(DiagnosticChain chain, Map<?, ?> context);

} // Case
