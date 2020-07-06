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
 *   <li>{@link metamodel.CMMNDiagram#getCmmnElements <em>Cmmn Elements</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getCMMNDiagram()
 * @model
 * @generated
 */
public interface CMMNDiagram extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>Cmmn Elements</b></em>' reference list.
	 * The list contents are of type {@link metamodel.CMMNElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmmn Elements</em>' reference list.
	 * @see metamodel.MetamodelPackage#getCMMNDiagram_CmmnElements()
	 * @model type="metamodel.CMMNElement" required="true"
	 * @generated
	 */
	EList<CMMNElement> getCmmnElements();

} // CMMNDiagram
