/**
 */
package ch.hilbri.assist.util;

import ch.hilbri.assist.*;

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
 * @see ch.hilbri.assist.AssistPackage
 * @generated
 */
public class AssistSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssistPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistSwitch() {
		if (modelPackage == null) {
			modelPackage = AssistPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case AssistPackage.ASSIST_MODEL: {
				AssistModel assistModel = (AssistModel)theEObject;
				T result = caseAssistModel(assistModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.HARDWARE_ELEMENT: {
				HardwareElement hardwareElement = (HardwareElement)theEObject;
				T result = caseHardwareElement(hardwareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.HARDWARE_ELEMENT_CONTAINER: {
				HardwareElementContainer hardwareElementContainer = (HardwareElementContainer)theEObject;
				T result = caseHardwareElementContainer(hardwareElementContainer);
				if (result == null) result = caseHardwareElement(hardwareElementContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.COMPARTMENT: {
				Compartment compartment = (Compartment)theEObject;
				T result = caseCompartment(compartment);
				if (result == null) result = caseHardwareElementContainer(compartment);
				if (result == null) result = caseHardwareElement(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.BOX: {
				Box box = (Box)theEObject;
				T result = caseBox(box);
				if (result == null) result = caseHardwareElementContainer(box);
				if (result == null) result = caseHardwareElement(box);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.BOARD: {
				Board board = (Board)theEObject;
				T result = caseBoard(board);
				if (result == null) result = caseHardwareElementContainer(board);
				if (result == null) result = caseHardwareElement(board);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseHardwareElement(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.CORE: {
				Core core = (Core)theEObject;
				T result = caseCore(core);
				if (result == null) result = caseHardwareElement(core);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.IO_ADAPTER: {
				IOAdapter ioAdapter = (IOAdapter)theEObject;
				T result = caseIOAdapter(ioAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.APPLICATION_OR_APPLICATION_GROUP: {
				ApplicationOrApplicationGroup applicationOrApplicationGroup = (ApplicationOrApplicationGroup)theEObject;
				T result = caseApplicationOrApplicationGroup(applicationOrApplicationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.APPLICATION_GROUP: {
				ApplicationGroup applicationGroup = (ApplicationGroup)theEObject;
				T result = caseApplicationGroup(applicationGroup);
				if (result == null) result = caseApplicationOrApplicationGroup(applicationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseApplicationOrApplicationGroup(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.IO_ADAPTER_REQUIREMENT: {
				IOAdapterRequirement ioAdapterRequirement = (IOAdapterRequirement)theEObject;
				T result = caseIOAdapterRequirement(ioAdapterRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.DISSIMILARITY_RELATION: {
				DissimilarityRelation dissimilarityRelation = (DissimilarityRelation)theEObject;
				T result = caseDissimilarityRelation(dissimilarityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.DISSIMILARITY_CLAUSE: {
				DissimilarityClause dissimilarityClause = (DissimilarityClause)theEObject;
				T result = caseDissimilarityClause(dissimilarityClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.DISSIMILARITY_DISJUNCTION: {
				DissimilarityDisjunction dissimilarityDisjunction = (DissimilarityDisjunction)theEObject;
				T result = caseDissimilarityDisjunction(dissimilarityDisjunction);
				if (result == null) result = caseDissimilarityClause(dissimilarityDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.DISSIMILARITY_CONJUNCTION: {
				DissimilarityConjunction dissimilarityConjunction = (DissimilarityConjunction)theEObject;
				T result = caseDissimilarityConjunction(dissimilarityConjunction);
				if (result == null) result = caseDissimilarityClause(dissimilarityConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.DISSIMILARITY_ENTRY: {
				DissimilarityEntry dissimilarityEntry = (DissimilarityEntry)theEObject;
				T result = caseDissimilarityEntry(dissimilarityEntry);
				if (result == null) result = caseDissimilarityClause(dissimilarityEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.DISLOCALITY_RELATION: {
				DislocalityRelation dislocalityRelation = (DislocalityRelation)theEObject;
				T result = caseDislocalityRelation(dislocalityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.PROXIMITY_RELATION: {
				ProximityRelation proximityRelation = (ProximityRelation)theEObject;
				T result = caseProximityRelation(proximityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.COMMUNICATION_RELATION: {
				CommunicationRelation communicationRelation = (CommunicationRelation)theEObject;
				T result = caseCommunicationRelation(communicationRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssistPackage.METRIC_PARAMETER: {
				MetricParameter metricParameter = (MetricParameter)theEObject;
				T result = caseMetricParameter(metricParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
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
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareElementContainer(HardwareElementContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Or Application Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Or Application Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationOrApplicationGroup(ApplicationOrApplicationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationGroup(ApplicationGroup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Proximity Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proximity Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProximityRelation(ProximityRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRelation(CommunicationRelation object) {
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

} //AssistSwitch
