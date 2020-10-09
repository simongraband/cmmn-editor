/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.textui.TestRunner;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.EventListener;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Listener</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventListenerTest extends PlanItemDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventListenerTest.class);
	}

	/**
	 * Constructs a new Event Listener test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventListener getFixture() {
		return (EventListener)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CMMNFactory.eINSTANCE.createEventListener());
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

} //EventListenerTest
