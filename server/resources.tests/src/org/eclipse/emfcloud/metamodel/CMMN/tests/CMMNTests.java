/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>CMMN</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CMMNTests("CMMN Tests");
		suite.addTestSuite(CMMNDiagramTest.class);
		suite.addTestSuite(CaseTest.class);
		suite.addTestSuite(StageTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(EventListenerTest.class);
		suite.addTestSuite(PlanItemDefinitionTest.class);
		suite.addTestSuite(TimerEventListenerTest.class);
		suite.addTestSuite(UserEventListenerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNTests(String name) {
		super(name);
	}

} //CMMNTests
