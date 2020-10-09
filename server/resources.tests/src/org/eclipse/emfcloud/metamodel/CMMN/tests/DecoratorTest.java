/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.textui.TestRunner;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.Decorator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecoratorTest extends CMMNElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecoratorTest.class);
	}

	/**
	 * Constructs a new Decorator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecoratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decorator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Decorator getFixture() {
		return (Decorator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CMMNFactory.eINSTANCE.createDecorator());
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

} //DecoratorTest
