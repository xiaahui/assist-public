/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>model</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTests extends TestSuite {

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
		TestSuite suite = new ModelTests("model Tests");
		suite.addTestSuite(AssistModelTest.class);
		suite.addTestSuite(CompartmentTest.class);
		suite.addTestSuite(BoxTest.class);
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(ApplicationGroupTest.class);
		suite.addTestSuite(ApplicationTest.class);
		suite.addTestSuite(ThreadTest.class);
		suite.addTestSuite(DissimilarityEntryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTests(String name) {
		super(name);
	}

} //ModelTests
