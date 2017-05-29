/**
 */
package ch.hilbri.assist.mapping.model.result.util;

import ch.hilbri.assist.mapping.model.result.AbstractMetric;
import ch.hilbri.assist.mapping.model.result.Application;
import ch.hilbri.assist.mapping.model.result.ApplicationGroup;
import ch.hilbri.assist.mapping.model.result.Board;
import ch.hilbri.assist.mapping.model.result.Box;
import ch.hilbri.assist.mapping.model.result.CommunicationRelation;
import ch.hilbri.assist.mapping.model.result.Compartment;
import ch.hilbri.assist.mapping.model.result.Core;
import ch.hilbri.assist.mapping.model.result.Evaluation;
import ch.hilbri.assist.mapping.model.result.HardwareElement;
import ch.hilbri.assist.mapping.model.result.IOAdapter;
import ch.hilbri.assist.mapping.model.result.IOAdapterRequirement;
import ch.hilbri.assist.mapping.model.result.MetricParameter;
import ch.hilbri.assist.mapping.model.result.Processor;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage
 * @generated
 */
public class ResultAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResultPackage.eINSTANCE;
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
	protected ResultSwitch<Adapter> modelSwitch =
		new ResultSwitch<Adapter>() {
			@Override
			public Adapter caseComparable(Comparable<Result> object) {
				return createComparableAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseHardwareElement(HardwareElement object) {
				return createHardwareElementAdapter();
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
			public Adapter caseApplicationGroup(ApplicationGroup object) {
				return createApplicationGroupAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseThread(ch.hilbri.assist.mapping.model.result.Thread object) {
				return createThreadAdapter();
			}
			@Override
			public Adapter caseIOAdapterRequirement(IOAdapterRequirement object) {
				return createIOAdapterRequirementAdapter();
			}
			@Override
			public Adapter caseCommunicationRelation(CommunicationRelation object) {
				return createCommunicationRelationAdapter();
			}
			@Override
			public Adapter caseAbstractMetric(AbstractMetric object) {
				return createAbstractMetricAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
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
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result> <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result>
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.HardwareElement
	 * @generated
	 */
	public Adapter createHardwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment
	 * @generated
	 */
	public Adapter createCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.IOAdapter <em>IO Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapter
	 * @generated
	 */
	public Adapter createIOAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.ApplicationGroup
	 * @generated
	 */
	public Adapter createApplicationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement <em>IO Adapter Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapterRequirement
	 * @generated
	 */
	public Adapter createIOAdapterRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.CommunicationRelation <em>Communication Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.CommunicationRelation
	 * @generated
	 */
	public Adapter createCommunicationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric <em>Abstract Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric
	 * @generated
	 */
	public Adapter createAbstractMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.result.MetricParameter <em>Metric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.result.MetricParameter
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

} //ResultAdapterFactory
