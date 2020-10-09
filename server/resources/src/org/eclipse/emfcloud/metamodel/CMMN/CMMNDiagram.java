/**
 */
package org.eclipse.emfcloud.metamodel.CMMN;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram#getCmmnElements <em>Cmmn Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCMMNDiagram()
 * @model
 * @generated
 */
public interface CMMNDiagram extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Cmmn Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.metamodel.CMMN.CMMNElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmmn Elements</em>' containment reference list.
	 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage#getCMMNDiagram_CmmnElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CMMNElement> getCmmnElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean duplicateNames(DiagnosticChain chain, Map<?, ?> context);

} // CMMNDiagram
