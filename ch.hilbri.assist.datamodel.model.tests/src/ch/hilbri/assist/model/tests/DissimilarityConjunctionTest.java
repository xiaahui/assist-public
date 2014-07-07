/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model.tests;

import ch.hilbri.assist.model.DissimilarityConjunction;
import ch.hilbri.assist.model.ModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dissimilarity Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DissimilarityConjunctionTest extends DissimilarityClauseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DissimilarityConjunctionTest.class);
	}

	/**
	 * Constructs a new Dissimilarity Conjunction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DissimilarityConjunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dissimilarity Conjunction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DissimilarityConjunction getFixture() {
		return (DissimilarityConjunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createDissimilarityConjunction());
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

} //DissimilarityConjunctionTest
