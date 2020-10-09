/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.textui.TestRunner;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.UserEventListener;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Event Listener</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserEventListenerTest extends EventListenerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserEventListenerTest.class);
	}

	/**
	 * Constructs a new User Event Listener test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserEventListenerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Event Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserEventListener getFixture() {
		return (UserEventListener)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CMMNFactory.eINSTANCE.createUserEventListener());
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

} //UserEventListenerTest
