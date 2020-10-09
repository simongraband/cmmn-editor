/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.tests;

import junit.textui.TestRunner;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mandatory Decorator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MandatoryDecoratorTest extends DecoratorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MandatoryDecoratorTest.class);
	}

	/**
	 * Constructs a new Mandatory Decorator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryDecoratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mandatory Decorator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MandatoryDecorator getFixture() {
		return (MandatoryDecorator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CMMNFactory.eINSTANCE.createMandatoryDecorator());
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

} //MandatoryDecoratorTest
