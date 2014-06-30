/**
 */
package ch.hilbri.assist.util;

import ch.hilbri.assist.Application;
import ch.hilbri.assist.ApplicationGroup;
import ch.hilbri.assist.ApplicationOrApplicationGroup;
import ch.hilbri.assist.AssistModel;
import ch.hilbri.assist.AssistPackage;
import ch.hilbri.assist.Board;
import ch.hilbri.assist.Box;
import ch.hilbri.assist.CommunicationRelation;
import ch.hilbri.assist.Compartment;
import ch.hilbri.assist.Core;
import ch.hilbri.assist.DislocalityRelation;
import ch.hilbri.assist.DissimilarityClause;
import ch.hilbri.assist.DissimilarityConjunction;
import ch.hilbri.assist.DissimilarityDisjunction;
import ch.hilbri.assist.DissimilarityEntry;
import ch.hilbri.assist.DissimilarityRelation;
import ch.hilbri.assist.HardwareElement;
import ch.hilbri.assist.HardwareElementContainer;
import ch.hilbri.assist.IOAdapter;
import ch.hilbri.assist.IOAdapterRequirement;
import ch.hilbri.assist.MetricParameter;
import ch.hilbri.assist.Network;
import ch.hilbri.assist.Processor;
import ch.hilbri.assist.ProximityRelation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.AssistPackage
 * @generated
 */
public class AssistAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssistPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssistPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistSwitch<Adapter> modelSwitch =
		new AssistSwitch<Adapter>() {
			@Override
			public Adapter caseAssistModel(AssistModel object) {
				return createAssistModelAdapter();
			}
			@Override
			public Adapter caseHardwareElement(HardwareElement object) {
				return createHardwareElementAdapter();
			}
			@Override
			public Adapter caseHardwareElementContainer(HardwareElementContainer object) {
				return createHardwareElementContainerAdapter();
			}
			@Override
			public Adapter caseCompartment(Compartment object) {
				return createCompartmentAdapter();
			}
			@Override
			public Adapter caseBox(Box object) {
				return createBoxAdapter();
			}
			@Override
			public Adapter caseBoard(Board object) {
				return createBoardAdapter();
			}
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseCore(Core object) {
				return createCoreAdapter();
			}
			@Override
			public Adapter caseIOAdapter(IOAdapter object) {
				return createIOAdapterAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseApplicationOrApplicationGroup(ApplicationOrApplicationGroup object) {
				return createApplicationOrApplicationGroupAdapter();
			}
			@Override
			public Adapter caseApplicationGroup(ApplicationGroup object) {
				return createApplicationGroupAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseThread(ch.hilbri.assist.Thread object) {
				return createThreadAdapter();
			}
			@Override
			public Adapter caseIOAdapterRequirement(IOAdapterRequirement object) {
				return createIOAdapterRequirementAdapter();
			}
			@Override
			public Adapter caseDissimilarityRelation(DissimilarityRelation object) {
				return createDissimilarityRelationAdapter();
			}
			@Override
			public Adapter caseDissimilarityClause(DissimilarityClause object) {
				return createDissimilarityClauseAdapter();
			}
			@Override
			public Adapter caseDissimilarityDisjunction(DissimilarityDisjunction object) {
				return createDissimilarityDisjunctionAdapter();
			}
			@Override
			public Adapter caseDissimilarityConjunction(DissimilarityConjunction object) {
				return createDissimilarityConjunctionAdapter();
			}
			@Override
			public Adapter caseDissimilarityEntry(DissimilarityEntry object) {
				return createDissimilarityEntryAdapter();
			}
			@Override
			public Adapter caseDislocalityRelation(DislocalityRelation object) {
				return createDislocalityRelationAdapter();
			}
			@Override
			public Adapter caseProximityRelation(ProximityRelation object) {
				return createProximityRelationAdapter();
			}
			@Override
			public Adapter caseCommunicationRelation(CommunicationRelation object) {
				return createCommunicationRelationAdapter();
			}
			@Override
			public Adapter caseMetricParameter(MetricParameter object) {
				return createMetricParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.AssistModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.AssistModel
	 * @generated
	 */
	public Adapter createAssistModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.HardwareElement
	 * @generated
	 */
	public Adapter createHardwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.HardwareElementContainer <em>Hardware Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.HardwareElementContainer
	 * @generated
	 */
	public Adapter createHardwareElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Compartment
	 * @generated
	 */
	public Adapter createCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.IOAdapter <em>IO Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.IOAdapter
	 * @generated
	 */
	public Adapter createIOAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.ApplicationOrApplicationGroup <em>Application Or Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.ApplicationOrApplicationGroup
	 * @generated
	 */
	public Adapter createApplicationOrApplicationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.ApplicationGroup
	 * @generated
	 */
	public Adapter createApplicationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.IOAdapterRequirement <em>IO Adapter Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.IOAdapterRequirement
	 * @generated
	 */
	public Adapter createIOAdapterRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.DissimilarityRelation <em>Dissimilarity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.DissimilarityRelation
	 * @generated
	 */
	public Adapter createDissimilarityRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.DissimilarityClause <em>Dissimilarity Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.DissimilarityClause
	 * @generated
	 */
	public Adapter createDissimilarityClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.DissimilarityDisjunction <em>Dissimilarity Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.DissimilarityDisjunction
	 * @generated
	 */
	public Adapter createDissimilarityDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.DissimilarityConjunction <em>Dissimilarity Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.DissimilarityConjunction
	 * @generated
	 */
	public Adapter createDissimilarityConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.DissimilarityEntry <em>Dissimilarity Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.DissimilarityEntry
	 * @generated
	 */
	public Adapter createDissimilarityEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.DislocalityRelation <em>Dislocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.DislocalityRelation
	 * @generated
	 */
	public Adapter createDislocalityRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.ProximityRelation <em>Proximity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.ProximityRelation
	 * @generated
	 */
	public Adapter createProximityRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.CommunicationRelation <em>Communication Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.CommunicationRelation
	 * @generated
	 */
	public Adapter createCommunicationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.MetricParameter <em>Metric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.MetricParameter
	 * @generated
	 */
	public Adapter createMetricParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssistAdapterFactory
