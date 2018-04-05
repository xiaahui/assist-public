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
	 * Returns a new object of class '<em>Mapping Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Relation</em>'.
	 * @generated
	 */
	MappingRelation createMappingRelation();

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
	 * Returns a new object of class '<em>Scheduling Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling Restriction</em>'.
	 * @generated
	 */
	SchedulingRestriction createSchedulingRestriction();

	/**
	 * Returns a new object of class '<em>Simple Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Relation</em>'.
	 * @generated
	 */
	SimpleRelation createSimpleRelation();

	/**
	 * Returns a new object of class '<em>Complex Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Relation</em>'.
	 * @generated
	 */
	ComplexRelation createComplexRelation();

	/**
	 * Returns a new object of class '<em>Restriction Start At The Same Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Start At The Same Time</em>'.
	 * @generated
	 */
	RestrictionStartAtTheSameTime createRestrictionStartAtTheSameTime();

	/**
	 * Returns a new object of class '<em>Restriction Finish At The Same Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Finish At The Same Time</em>'.
	 * @generated
	 */
	RestrictionFinishAtTheSameTime createRestrictionFinishAtTheSameTime();

	/**
	 * Returns a new object of class '<em>Restriction Start After Other Finished</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Start After Other Finished</em>'.
	 * @generated
	 */
	RestrictionStartAfterOtherFinished createRestrictionStartAfterOtherFinished();

	/**
	 * Returns a new object of class '<em>Restriction Start After Other Started</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Start After Other Started</em>'.
	 * @generated
	 */
	RestrictionStartAfterOtherStarted createRestrictionStartAfterOtherStarted();

	/**
	 * Returns a new object of class '<em>Custom Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Property</em>'.
	 * @generated
	 */
	CustomProperty createCustomProperty();

	/**
	 * Returns a new object of class '<em>Custom Int Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Int Property</em>'.
	 * @generated
	 */
	CustomIntProperty createCustomIntProperty();

	/**
	 * Returns a new object of class '<em>Custom String Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom String Property</em>'.
	 * @generated
	 */
	CustomStringProperty createCustomStringProperty();

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
	 * Returns a new object of class '<em>Exploration Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exploration Candidate</em>'.
	 * @generated
	 */
	ExplorationCandidate createExplorationCandidate();

	/**
	 * Returns a new object of class '<em>Mapping Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Result</em>'.
	 * @generated
	 */
	MappingResult createMappingResult();

	/**
	 * Returns a new object of class '<em>Single Mapping Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Mapping Element</em>'.
	 * @generated
	 */
	SingleMappingElement createSingleMappingElement();

	/**
	 * Returns a new object of class '<em>Assist Model Scheduling Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assist Model Scheduling Result</em>'.
	 * @generated
	 */
	AssistModelSchedulingResult createAssistModelSchedulingResult();

	/**
	 * Returns a new object of class '<em>Task Execution Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Execution Instance</em>'.
	 * @generated
	 */
	TaskExecutionInstance createTaskExecutionInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
