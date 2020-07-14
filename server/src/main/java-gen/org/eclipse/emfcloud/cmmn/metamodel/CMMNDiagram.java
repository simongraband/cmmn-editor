/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.cmmn.metamodel.CMMNDiagram#getCmmnElements <em>Cmmn Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getCMMNDiagram()
 * @model
 * @generated
 */
public interface CMMNDiagram extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Cmmn Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emfcloud.cmmn.metamodel.CMMNElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmmn Elements</em>' containment reference list.
	 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getCMMNDiagram_CmmnElements()
	 * @model type="org.eclipse.emfcloud.cmmn.metamodel.CMMNElement" containment="true" required="true"
	 * @generated
	 */
	EList<CMMNElement> getCmmnElements();

} // CMMNDiagram
