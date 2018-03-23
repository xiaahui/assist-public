/**
 */
package ch.hilbri.assist.model.util;

import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.ApplicationAlternatives;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.AssistModelSchedulingResult;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardAlternative;
import ch.hilbri.assist.model.BoardAlternatives;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.ComplexRelation;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityClause;
import ch.hilbri.assist.model.DissimilarityConjunction;
import ch.hilbri.assist.model.DissimilarityDisjunction;
import ch.hilbri.assist.model.DissimilarityEntry;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.IOAdapter;
import ch.hilbri.assist.model.IOAdapterRequirement;
import ch.hilbri.assist.model.MappingRelation;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.MetricParameter;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.RestrictionAlternative;
import ch.hilbri.assist.model.RestrictionAlternatives;
import ch.hilbri.assist.model.RestrictionFinishAtTheSameTime;
import ch.hilbri.assist.model.RestrictionStartAfterOtherFinished;
import ch.hilbri.assist.model.RestrictionStartAfterOtherStarted;
import ch.hilbri.assist.model.RestrictionStartAtTheSameTime;
import ch.hilbri.assist.model.SchedulingRestriction;
import ch.hilbri.assist.model.SimpleRelation;
import ch.hilbri.assist.model.SingleMappingElement;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskExecutionInstance;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ASSIST_MODEL: {
				AssistModel assistModel = (AssistModel)theEObject;
				T result = caseAssistModel(assistModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HARDWARE_ELEMENT: {
				HardwareElement hardwareElement = (HardwareElement)theEObject;
				T result = caseHardwareElement(hardwareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPARTMENT: {
				Compartment compartment = (Compartment)theEObject;
				T result = caseCompartment(compartment);
				if (result == null) result = caseHardwareElement(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOX: {
				Box box = (Box)theEObject;
				T result = caseBox(box);
				if (result == null) result = caseHardwareElement(box);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOARD_ALTERNATIVES: {
				BoardAlternatives boardAlternatives = (BoardAlternatives)theEObject;
				T result = caseBoardAlternatives(boardAlternatives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOARD_ALTERNATIVE: {
				BoardAlternative boardAlternative = (BoardAlternative)theEObject;
				T result = caseBoardAlternative(boardAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOARD: {
				Board board = (Board)theEObject;
				T result = caseBoard(board);
				if (result == null) result = caseHardwareElement(board);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseHardwareElement(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CORE: {
				Core core = (Core)theEObject;
				T result = caseCore(core);
				if (result == null) result = caseHardwareElement(core);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IO_ADAPTER: {
				IOAdapter ioAdapter = (IOAdapter)theEObject;
				T result = caseIOAdapter(ioAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_ALTERNATIVES: {
				ApplicationAlternatives applicationAlternatives = (ApplicationAlternatives)theEObject;
				T result = caseApplicationAlternatives(applicationAlternatives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_ALTERNATIVE: {
				ApplicationAlternative applicationAlternative = (ApplicationAlternative)theEObject;
				T result = caseApplicationAlternative(applicationAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IO_ADAPTER_REQUIREMENT: {
				IOAdapterRequirement ioAdapterRequirement = (IOAdapterRequirement)theEObject;
				T result = caseIOAdapterRequirement(ioAdapterRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MAPPING_RELATION: {
				MappingRelation mappingRelation = (MappingRelation)theEObject;
				T result = caseMappingRelation(mappingRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISLOCALITY_RELATION: {
				DislocalityRelation dislocalityRelation = (DislocalityRelation)theEObject;
				T result = caseDislocalityRelation(dislocalityRelation);
				if (result == null) result = caseMappingRelation(dislocalityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOCALITY_RELATION: {
				ColocalityRelation colocalityRelation = (ColocalityRelation)theEObject;
				T result = caseColocalityRelation(colocalityRelation);
				if (result == null) result = caseMappingRelation(colocalityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISSIMILARITY_RELATION: {
				DissimilarityRelation dissimilarityRelation = (DissimilarityRelation)theEObject;
				T result = caseDissimilarityRelation(dissimilarityRelation);
				if (result == null) result = caseMappingRelation(dissimilarityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISSIMILARITY_CLAUSE: {
				DissimilarityClause dissimilarityClause = (DissimilarityClause)theEObject;
				T result = caseDissimilarityClause(dissimilarityClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISSIMILARITY_DISJUNCTION: {
				DissimilarityDisjunction dissimilarityDisjunction = (DissimilarityDisjunction)theEObject;
				T result = caseDissimilarityDisjunction(dissimilarityDisjunction);
				if (result == null) result = caseDissimilarityClause(dissimilarityDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISSIMILARITY_CONJUNCTION: {
				DissimilarityConjunction dissimilarityConjunction = (DissimilarityConjunction)theEObject;
				T result = caseDissimilarityConjunction(dissimilarityConjunction);
				if (result == null) result = caseDissimilarityClause(dissimilarityConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISSIMILARITY_ENTRY: {
				DissimilarityEntry dissimilarityEntry = (DissimilarityEntry)theEObject;
				T result = caseDissimilarityEntry(dissimilarityEntry);
				if (result == null) result = caseDissimilarityClause(dissimilarityEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCHEDULING_RESTRICTION: {
				SchedulingRestriction schedulingRestriction = (SchedulingRestriction)theEObject;
				T result = caseSchedulingRestriction(schedulingRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIMPLE_RELATION: {
				SimpleRelation simpleRelation = (SimpleRelation)theEObject;
				T result = caseSimpleRelation(simpleRelation);
				if (result == null) result = caseSchedulingRestriction(simpleRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPLEX_RELATION: {
				ComplexRelation complexRelation = (ComplexRelation)theEObject;
				T result = caseComplexRelation(complexRelation);
				if (result == null) result = caseSchedulingRestriction(complexRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICTION_START_AT_THE_SAME_TIME: {
				RestrictionStartAtTheSameTime restrictionStartAtTheSameTime = (RestrictionStartAtTheSameTime)theEObject;
				T result = caseRestrictionStartAtTheSameTime(restrictionStartAtTheSameTime);
				if (result == null) result = caseSimpleRelation(restrictionStartAtTheSameTime);
				if (result == null) result = caseSchedulingRestriction(restrictionStartAtTheSameTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICTION_FINISH_AT_THE_SAME_TIME: {
				RestrictionFinishAtTheSameTime restrictionFinishAtTheSameTime = (RestrictionFinishAtTheSameTime)theEObject;
				T result = caseRestrictionFinishAtTheSameTime(restrictionFinishAtTheSameTime);
				if (result == null) result = caseSimpleRelation(restrictionFinishAtTheSameTime);
				if (result == null) result = caseSchedulingRestriction(restrictionFinishAtTheSameTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICTION_START_AFTER_OTHER_FINISHED: {
				RestrictionStartAfterOtherFinished restrictionStartAfterOtherFinished = (RestrictionStartAfterOtherFinished)theEObject;
				T result = caseRestrictionStartAfterOtherFinished(restrictionStartAfterOtherFinished);
				if (result == null) result = caseComplexRelation(restrictionStartAfterOtherFinished);
				if (result == null) result = caseSchedulingRestriction(restrictionStartAfterOtherFinished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICTION_START_AFTER_OTHER_STARTED: {
				RestrictionStartAfterOtherStarted restrictionStartAfterOtherStarted = (RestrictionStartAfterOtherStarted)theEObject;
				T result = caseRestrictionStartAfterOtherStarted(restrictionStartAfterOtherStarted);
				if (result == null) result = caseComplexRelation(restrictionStartAfterOtherStarted);
				if (result == null) result = caseSchedulingRestriction(restrictionStartAfterOtherStarted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METRIC_PARAMETER: {
				MetricParameter metricParameter = (MetricParameter)theEObject;
				T result = caseMetricParameter(metricParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICTION_ALTERNATIVES: {
				RestrictionAlternatives restrictionAlternatives = (RestrictionAlternatives)theEObject;
				T result = caseRestrictionAlternatives(restrictionAlternatives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICTION_ALTERNATIVE: {
				RestrictionAlternative restrictionAlternative = (RestrictionAlternative)theEObject;
				T result = caseRestrictionAlternative(restrictionAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXPLORATION_CANDIDATE: {
				ExplorationCandidate explorationCandidate = (ExplorationCandidate)theEObject;
				T result = caseExplorationCandidate(explorationCandidate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPARABLE: {
				@SuppressWarnings("unchecked") Comparable<MappingResult> comparable = (Comparable<MappingResult>)theEObject;
				T result = caseComparable(comparable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METRIC_SCORE_PAIR: {
				@SuppressWarnings("unchecked") Map.Entry<AbstractMetric, Double> metricScorePair = (Map.Entry<AbstractMetric, Double>)theEObject;
				T result = caseMetricScorePair(metricScorePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MAPPING_RESULT: {
				MappingResult mappingResult = (MappingResult)theEObject;
				T result = caseMappingResult(mappingResult);
				if (result == null) result = caseComparable(mappingResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SINGLE_MAPPING_ELEMENT: {
				SingleMappingElement singleMappingElement = (SingleMappingElement)theEObject;
				T result = caseSingleMappingElement(singleMappingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_METRIC: {
				AbstractMetric abstractMetric = (AbstractMetric)theEObject;
				T result = caseAbstractMetric(abstractMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT: {
				AssistModelSchedulingResult assistModelSchedulingResult = (AssistModelSchedulingResult)theEObject;
				T result = caseAssistModelSchedulingResult(assistModelSchedulingResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TASK_EXECUTION_INSTANCE: {
				TaskExecutionInstance taskExecutionInstance = (TaskExecutionInstance)theEObject;
				T result = caseTaskExecutionInstance(taskExecutionInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assist Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assist Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssistModel(AssistModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareElement(HardwareElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartment(Compartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBox(Box object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Alternatives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoardAlternatives(BoardAlternatives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoardAlternative(BoardAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoard(Board object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore(Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOAdapter(IOAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Alternatives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationAlternatives(ApplicationAlternatives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationAlternative(ApplicationAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Adapter Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Adapter Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOAdapterRequirement(IOAdapterRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingRelation(MappingRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dislocality Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dislocality Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDislocalityRelation(DislocalityRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colocality Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colocality Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColocalityRelation(ColocalityRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dissimilarity Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDissimilarityRelation(DissimilarityRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dissimilarity Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDissimilarityClause(DissimilarityClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dissimilarity Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDissimilarityDisjunction(DissimilarityDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dissimilarity Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDissimilarityConjunction(DissimilarityConjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dissimilarity Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDissimilarityEntry(DissimilarityEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingRestriction(SchedulingRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRelation(SimpleRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexRelation(ComplexRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Start At The Same Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Start At The Same Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionStartAtTheSameTime(RestrictionStartAtTheSameTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Finish At The Same Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Finish At The Same Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionFinishAtTheSameTime(RestrictionFinishAtTheSameTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Start After Other Finished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Start After Other Finished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionStartAfterOtherFinished(RestrictionStartAfterOtherFinished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Start After Other Started</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Start After Other Started</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionStartAfterOtherStarted(RestrictionStartAfterOtherStarted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricParameter(MetricParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Alternatives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionAlternatives(RestrictionAlternatives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionAlternative(RestrictionAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exploration Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exploration Candidate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplorationCandidate(ExplorationCandidate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(Comparable<MappingResult> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Score Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Score Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricScorePair(Map.Entry<AbstractMetric, Double> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingResult(MappingResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Mapping Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Mapping Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleMappingElement(SingleMappingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMetric(AbstractMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assist Model Scheduling Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assist Model Scheduling Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssistModelSchedulingResult(AssistModelSchedulingResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Execution Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Execution Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskExecutionInstance(TaskExecutionInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
