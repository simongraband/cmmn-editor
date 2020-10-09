/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.TimerExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timer Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimerExpressionTest extends TestCase {

	/**
	 * The fixture for this Timer Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimerExpressionTest.class);
	}

	/**
	 * Constructs a new Timer Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timer Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimerExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timer Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerExpression getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CMMNFactory.eINSTANCE.createTimerExpression());
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

} //TimerExpressionTest
