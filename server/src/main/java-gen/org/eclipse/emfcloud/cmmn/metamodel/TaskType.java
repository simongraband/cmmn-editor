/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getTaskType()
 * @model
 * @generated
 */
public final class TaskType extends AbstractEnumerator {
	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_LITERAL
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK = 0;

	/**
	 * The '<em><b>Discretionary Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETIONARY_TASK_LITERAL
	 * @model name="DiscretionaryTask"
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETIONARY_TASK = 0;

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @generated
	 * @ordered
	 */
	public static final TaskType TASK_LITERAL = new TaskType(TASK, "Task", "Task");

	/**
	 * The '<em><b>Discretionary Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETIONARY_TASK
	 * @generated
	 * @ordered
	 */
	public static final TaskType DISCRETIONARY_TASK_LITERAL = new TaskType(DISCRETIONARY_TASK, "DiscretionaryTask", "DiscretionaryTask");

	/**
	 * An array of all the '<em><b>Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskType[] VALUES_ARRAY =
		new TaskType[] {
			TASK_LITERAL,
			DISCRETIONARY_TASK_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskType get(int value) {
		switch (value) {
			case TASK: return TASK_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TaskType
