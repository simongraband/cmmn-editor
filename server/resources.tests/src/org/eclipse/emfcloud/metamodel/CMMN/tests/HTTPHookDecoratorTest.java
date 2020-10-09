/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.textui.TestRunner;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HTTP Hook Decorator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HTTPHookDecoratorTest extends DecoratorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HTTPHookDecoratorTest.class);
	}

	/**
	 * Constructs a new HTTP Hook Decorator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPHookDecoratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this HTTP Hook Decorator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HTTPHookDecorator getFixture() {
		return (HTTPHookDecorator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CMMNFactory.eINSTANCE.createHTTPHookDecorator());
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

} //HTTPHookDecoratorTest
