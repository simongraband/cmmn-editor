/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.textui.TestRunner;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sentry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SentryTest extends CMMNElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SentryTest.class);
	}

	/**
	 * Constructs a new Sentry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sentry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sentry getFixture() {
		return (Sentry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CMMNFactory.eINSTANCE.createSentry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SentryTest
