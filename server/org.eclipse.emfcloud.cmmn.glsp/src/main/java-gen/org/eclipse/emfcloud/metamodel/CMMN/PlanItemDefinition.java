/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getOutgoingSentrys <em>Outgoing Sentrys</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getDecorators <em>Decorators</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition#getIncomingSentrys <em>Incoming Sentrys</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getPlanItemDefinition()
 * @model
 * @generated
 */
public interface PlanItemDefinition extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Sentrys</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.Sentry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Sentrys</em>' containment reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getPlanItemDefinition_OutgoingSentrys()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentry> getOutgoingSentrys();

	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.Decorator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' containment reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getPlanItemDefinition_Decorators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decorator> getDecorators();

	/**
	 * Returns the value of the '<em><b>Incoming Sentrys</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.Sentry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Sentrys</em>' reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getPlanItemDefinition_IncomingSentrys()
	 * @model
	 * @generated
	 */
	EList<Sentry> getIncomingSentrys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isUsed(DiagnosticChain chain, Map<?, ?> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isNoCircle(DiagnosticChain chain, Map<?, ?> context);

} // PlanItemDefinition
