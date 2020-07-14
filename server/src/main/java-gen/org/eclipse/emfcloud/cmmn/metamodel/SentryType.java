/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sentry Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.cmmn.metamodel.MetamodelPackage#getSentryType()
 * @model
 * @generated
 */
public final class SentryType extends AbstractEnumerator {
	/**
	 * The '<em><b>Entry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_LITERAL
	 * @model name="Entry"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY = 0;

	/**
	 * The '<em><b>Exit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_LITERAL
	 * @model name="Exit"
	 * @generated
	 * @ordered
	 */
	public static final int EXIT = 1;

	/**
	 * The '<em><b>Entry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY
	 * @generated
	 * @ordered
	 */
	public static final SentryType ENTRY_LITERAL = new SentryType(ENTRY, "Entry", "Entry");

	/**
	 * The '<em><b>Exit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT
	 * @generated
	 * @ordered
	 */
	public static final SentryType EXIT_LITERAL = new SentryType(EXIT, "Exit", "Exit");

	/**
	 * An array of all the '<em><b>Sentry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SentryType[] VALUES_ARRAY =
		new SentryType[] {
			ENTRY_LITERAL,
			EXIT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Sentry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sentry Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SentryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SentryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sentry Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SentryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SentryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sentry Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SentryType get(int value) {
		switch (value) {
			case ENTRY: return ENTRY_LITERAL;
			case EXIT: return EXIT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SentryType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SentryType
