/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model.tests;

import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.ModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Box#getAllProcessors() <em>Get All Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getAllCores() <em>Get All Cores</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BoxTest extends HardwareElementContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoxTest.class);
	}

	/**
	 * Constructs a new Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Box getFixture() {
		return (Box)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createBox());
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

	/**
	 * Tests the '{@link ch.hilbri.assist.model.Box#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.model.Box#getAllProcessors()
	 * @generated
	 */
	public void testGetAllProcessors() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ch.hilbri.assist.model.Box#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.model.Box#getAllCores()
	 * @generated
	 */
	public void testGetAllCores() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BoxTest
