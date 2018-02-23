/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = ch.hilbri.assist.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assist Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assist Model</em>'.
	 * @generated
	 */
	AssistModel createAssistModel();

	/**
	 * Returns a new object of class '<em>Hardware Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Element</em>'.
	 * @generated
	 */
	HardwareElement createHardwareElement();

	/**
	 * Returns a new object of class '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment</em>'.
	 * @generated
	 */
	Compartment createCompartment();

	/**
	 * Returns a new object of class '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box</em>'.
	 * @generated
	 */
	Box createBox();

	/**
	 * Returns a new object of class '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board</em>'.
	 * @generated
	 */
	Board createBoard();

	/**
	 * Returns a new object of class '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor</em>'.
	 * @generated
	 */
	Processor createProcessor();

	/**
	 * Returns a new object of class '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core</em>'.
	 * @generated
	 */
	Core createCore();

	/**
	 * Returns a new object of class '<em>IO Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Adapter</em>'.
	 * @generated
	 */
	IOAdapter createIOAdapter();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>IO Adapter Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Adapter Requirement</em>'.
	 * @generated
	 */
	IOAdapterRequirement createIOAdapterRequirement();

	/**
	 * Returns a new object of class '<em>Dislocality Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dislocality Relation</em>'.
	 * @generated
	 */
	DislocalityRelation createDislocalityRelation();

	/**
	 * Returns a new object of class '<em>Colocality Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colocality Relation</em>'.
	 * @generated
	 */
	ColocalityRelation createColocalityRelation();

	/**
	 * Returns a new object of class '<em>Dissimilarity Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dissimilarity Relation</em>'.
	 * @generated
	 */
	DissimilarityRelation createDissimilarityRelation();

	/**
	 * Returns a new object of class '<em>Dissimilarity Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dissimilarity Clause</em>'.
	 * @generated
	 */
	DissimilarityClause createDissimilarityClause();

	/**
	 * Returns a new object of class '<em>Dissimilarity Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dissimilarity Disjunction</em>'.
	 * @generated
	 */
	DissimilarityDisjunction createDissimilarityDisjunction();

	/**
	 * Returns a new object of class '<em>Dissimilarity Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dissimilarity Conjunction</em>'.
	 * @generated
	 */
	DissimilarityConjunction createDissimilarityConjunction();

	/**
	 * Returns a new object of class '<em>Dissimilarity Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dissimilarity Entry</em>'.
	 * @generated
	 */
	DissimilarityEntry createDissimilarityEntry();

	/**
	 * Returns a new object of class '<em>Metric Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Parameter</em>'.
	 * @generated
	 */
	MetricParameter createMetricParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
