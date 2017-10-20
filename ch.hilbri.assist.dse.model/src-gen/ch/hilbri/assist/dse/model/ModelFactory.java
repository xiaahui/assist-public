/**
 */
package ch.hilbri.assist.dse.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.dse.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = ch.hilbri.assist.dse.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assist Model DSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assist Model DSE</em>'.
	 * @generated
	 */
	AssistModelDSE createAssistModelDSE();

	/**
	 * Returns a new object of class '<em>Box DSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box DSE</em>'.
	 * @generated
	 */
	BoxDSE createBoxDSE();

	/**
	 * Returns a new object of class '<em>Board Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board Alternatives</em>'.
	 * @generated
	 */
	BoardAlternatives createBoardAlternatives();

	/**
	 * Returns a new object of class '<em>Board Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board Alternative</em>'.
	 * @generated
	 */
	BoardAlternative createBoardAlternative();

	/**
	 * Returns a new object of class '<em>Application Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Alternatives</em>'.
	 * @generated
	 */
	ApplicationAlternatives createApplicationAlternatives();

	/**
	 * Returns a new object of class '<em>Application Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Alternative</em>'.
	 * @generated
	 */
	ApplicationAlternative createApplicationAlternative();

	/**
	 * Returns a new object of class '<em>Restriction Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Alternatives</em>'.
	 * @generated
	 */
	RestrictionAlternatives createRestrictionAlternatives();

	/**
	 * Returns a new object of class '<em>Restriction Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Alternative</em>'.
	 * @generated
	 */
	RestrictionAlternative createRestrictionAlternative();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
