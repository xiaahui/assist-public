/**
 */
package ch.hilbri.assist.dse.model.util;

import ch.hilbri.assist.dse.model.*;

import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.HardwareElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.dse.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseAssistModelDSE(AssistModelDSE object) {
				return createAssistModelDSEAdapter();
			}
			@Override
			public Adapter caseBoxDSE(BoxDSE object) {
				return createBoxDSEAdapter();
			}
			@Override
			public Adapter caseBoardAlternatives(BoardAlternatives object) {
				return createBoardAlternativesAdapter();
			}
			@Override
			public Adapter caseBoardAlternative(BoardAlternative object) {
				return createBoardAlternativeAdapter();
			}
			@Override
			public Adapter caseApplicationAlternatives(ApplicationAlternatives object) {
				return createApplicationAlternativesAdapter();
			}
			@Override
			public Adapter caseApplicationAlternative(ApplicationAlternative object) {
				return createApplicationAlternativeAdapter();
			}
			@Override
			public Adapter caseAssistModel(AssistModel object) {
				return createAssistModelAdapter();
			}
			@Override
			public Adapter caseHardwareElement(HardwareElement object) {
				return createHardwareElementAdapter();
			}
			@Override
			public Adapter caseBox(Box object) {
				return createBoxAdapter();
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
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.dse.model.AssistModelDSE <em>Assist Model DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.dse.model.AssistModelDSE
	 * @generated
	 */
	public Adapter createAssistModelDSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.dse.model.BoxDSE <em>Box DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.dse.model.BoxDSE
	 * @generated
	 */
	public Adapter createBoxDSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.dse.model.BoardAlternatives <em>Board Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.dse.model.BoardAlternatives
	 * @generated
	 */
	public Adapter createBoardAlternativesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.dse.model.BoardAlternative <em>Board Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.dse.model.BoardAlternative
	 * @generated
	 */
	public Adapter createBoardAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.dse.model.ApplicationAlternatives <em>Application Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.dse.model.ApplicationAlternatives
	 * @generated
	 */
	public Adapter createApplicationAlternativesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.dse.model.ApplicationAlternative <em>Application Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.dse.model.ApplicationAlternative
	 * @generated
	 */
	public Adapter createApplicationAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.AssistModel <em>Assist Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.AssistModel
	 * @generated
	 */
	public Adapter createAssistModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.HardwareElement
	 * @generated
	 */
	public Adapter createHardwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.mapping.model.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.mapping.model.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
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

} //ModelAdapterFactory
