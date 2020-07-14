/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getTaskRole()
 * @model
 * @generated
 */
public final class TaskRole extends AbstractEnumerator {
	/**
	 * The '<em><b>Human</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_LITERAL
	 * @model name="Human"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN = 0;

	/**
	 * The '<em><b>Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_LITERAL
	 * @model name="Process"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS = 1;

	/**
	 * The '<em><b>Human</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN
	 * @generated
	 * @ordered
	 */
	public static final TaskRole HUMAN_LITERAL = new TaskRole(HUMAN, "Human", "Human");

	/**
	 * The '<em><b>Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS
	 * @generated
	 * @ordered
	 */
	public static final TaskRole PROCESS_LITERAL = new TaskRole(PROCESS, "Process", "Process");

	/**
	 * An array of all the '<em><b>Task Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskRole[] VALUES_ARRAY =
		new TaskRole[] {
			HUMAN_LITERAL,
			PROCESS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskRole get(int value) {
		switch (value) {
			case HUMAN: return HUMAN_LITERAL;
			case PROCESS: return PROCESS_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskRole(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TaskRole
