/**
 */
package ch.hilbri.assist.datamodel.model.util;

import ch.hilbri.assist.datamodel.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.datamodel.model.ModelPackage
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
			public Adapter caseAssistModel(AssistModel object) {
				return createAssistModelAdapter();
			}
			@Override
			public Adapter caseGlobalBlock(GlobalBlock object) {
				return createGlobalBlockAdapter();
			}
			@Override
			public Adapter caseCompatibleIoTypesBlock(CompatibleIoTypesBlock object) {
				return createCompatibleIoTypesBlockAdapter();
			}
			@Override
			public Adapter caseCompatibleIoTypeEntry(CompatibleIoTypeEntry object) {
				return createCompatibleIoTypeEntryAdapter();
			}
			@Override
			public Adapter caseCableWeightDataBlock(CableWeightDataBlock object) {
				return createCableWeightDataBlockAdapter();
			}
			@Override
			public Adapter caseCableWeightEntry(CableWeightEntry object) {
				return createCableWeightEntryAdapter();
			}
			@Override
			public Adapter caseProtectionLevelDataBlock(ProtectionLevelDataBlock object) {
				return createProtectionLevelDataBlockAdapter();
			}
			@Override
			public Adapter caseProtectionLevelEntry(ProtectionLevelEntry object) {
				return createProtectionLevelEntryAdapter();
			}
			@Override
			public Adapter caseCompartmentsBlock(CompartmentsBlock object) {
				return createCompartmentsBlockAdapter();
			}
			@Override
			public Adapter caseHardwareElement(HardwareElement object) {
				return createHardwareElementAdapter();
			}
			@Override
			public Adapter caseMetricParametersBlock(MetricParametersBlock object) {
				return createMetricParametersBlockAdapter();
			}
			@Override
			public Adapter caseMetricParameter(MetricParameter object) {
				return createMetricParameterAdapter();
			}
			@Override
			public Adapter caseCompartment(Compartment object) {
				return createCompartmentAdapter();
			}
			@Override
			public Adapter caseRDC(RDC object) {
				return createRDCAdapter();
			}
			@Override
			public Adapter caseInternallyConnectedPinEntry(InternallyConnectedPinEntry object) {
				return createInternallyConnectedPinEntryAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseAvailableEqInterface(AvailableEqInterface object) {
				return createAvailableEqInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfacesBlock(InterfacesBlock object) {
				return createInterfacesBlockAdapter();
			}
			@Override
			public Adapter caseEqInterfaceOrGroup(EqInterfaceOrGroup object) {
				return createEqInterfaceOrGroupAdapter();
			}
			@Override
			public Adapter caseEqInterface(EqInterface object) {
				return createEqInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfaceGroupsBlock(InterfaceGroupsBlock object) {
				return createInterfaceGroupsBlockAdapter();
			}
			@Override
			public Adapter caseEqInterfaceGroup(EqInterfaceGroup object) {
				return createEqInterfaceGroupAdapter();
			}
			@Override
			public Adapter caseImplicitEqInterfaceMemberDefinition(ImplicitEqInterfaceMemberDefinition object) {
				return createImplicitEqInterfaceMemberDefinitionAdapter();
			}
			@Override
			public Adapter caseImplicitEqInterfaceMemberDefinitionAttributesAndValues(ImplicitEqInterfaceMemberDefinitionAttributesAndValues object) {
				return createImplicitEqInterfaceMemberDefinitionAttributesAndValuesAdapter();
			}
			@Override
			public Adapter caseEqInterfaceGroupWithCombinedDefinition(EqInterfaceGroupWithCombinedDefinition object) {
				return createEqInterfaceGroupWithCombinedDefinitionAdapter();
			}
			@Override
			public Adapter caseRestrictionsBlock(RestrictionsBlock object) {
				return createRestrictionsBlockAdapter();
			}
			@Override
			public Adapter caseDislocalityRelation(DislocalityRelation object) {
				return createDislocalityRelationAdapter();
			}
			@Override
			public Adapter caseColocalityRelation(ColocalityRelation object) {
				return createColocalityRelationAdapter();
			}
			@Override
			public Adapter caseDeploymentSpecification(DeploymentSpecification object) {
				return createDeploymentSpecificationAdapter();
			}
			@Override
			public Adapter caseDeploymentImplicitDefinition(DeploymentImplicitDefinition object) {
				return createDeploymentImplicitDefinitionAdapter();
			}
			@Override
			public Adapter caseDeploymentImplicitDefinitionAttributeAndValue(DeploymentImplicitDefinitionAttributeAndValue object) {
				return createDeploymentImplicitDefinitionAttributeAndValueAdapter();
			}
			@Override
			public Adapter caseValidDeployment(ValidDeployment object) {
				return createValidDeploymentAdapter();
			}
			@Override
			public Adapter caseInvalidDeployment(InvalidDeployment object) {
				return createInvalidDeploymentAdapter();
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
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.AssistModel <em>Assist Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel
	 * @generated
	 */
	public Adapter createAssistModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.GlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.GlobalBlock
	 * @generated
	 */
	public Adapter createGlobalBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock <em>Compatible Io Types Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock
	 * @generated
	 */
	public Adapter createCompatibleIoTypesBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry <em>Compatible Io Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry
	 * @generated
	 */
	public Adapter createCompatibleIoTypeEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.CableWeightDataBlock <em>Cable Weight Data Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightDataBlock
	 * @generated
	 */
	public Adapter createCableWeightDataBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry <em>Cable Weight Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightEntry
	 * @generated
	 */
	public Adapter createCableWeightEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock <em>Protection Level Data Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock
	 * @generated
	 */
	public Adapter createProtectionLevelDataBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry <em>Protection Level Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelEntry
	 * @generated
	 */
	public Adapter createProtectionLevelEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.CompartmentsBlock <em>Compartments Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.CompartmentsBlock
	 * @generated
	 */
	public Adapter createCompartmentsBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.HardwareElement
	 * @generated
	 */
	public Adapter createHardwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.MetricParametersBlock <em>Metric Parameters Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.MetricParametersBlock
	 * @generated
	 */
	public Adapter createMetricParametersBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.MetricParameter <em>Metric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.MetricParameter
	 * @generated
	 */
	public Adapter createMetricParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.Compartment
	 * @generated
	 */
	public Adapter createCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.RDC <em>RDC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.RDC
	 * @generated
	 */
	public Adapter createRDCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry <em>Internally Connected Pin Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry
	 * @generated
	 */
	public Adapter createInternallyConnectedPinEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface <em>Available Eq Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.AvailableEqInterface
	 * @generated
	 */
	public Adapter createAvailableEqInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.InterfacesBlock <em>Interfaces Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.InterfacesBlock
	 * @generated
	 */
	public Adapter createInterfacesBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup <em>Eq Interface Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup
	 * @generated
	 */
	public Adapter createEqInterfaceOrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.EqInterface <em>Eq Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface
	 * @generated
	 */
	public Adapter createEqInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock <em>Interface Groups Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock
	 * @generated
	 */
	public Adapter createInterfaceGroupsBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup <em>Eq Interface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup
	 * @generated
	 */
	public Adapter createEqInterfaceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition <em>Implicit Eq Interface Member Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition
	 * @generated
	 */
	public Adapter createImplicitEqInterfaceMemberDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues <em>Implicit Eq Interface Member Definition Attributes And Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues
	 * @generated
	 */
	public Adapter createImplicitEqInterfaceMemberDefinitionAttributesAndValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition <em>Eq Interface Group With Combined Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition
	 * @generated
	 */
	public Adapter createEqInterfaceGroupWithCombinedDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock <em>Restrictions Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.RestrictionsBlock
	 * @generated
	 */
	public Adapter createRestrictionsBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation <em>Dislocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation
	 * @generated
	 */
	public Adapter createDislocalityRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.ColocalityRelation <em>Colocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.ColocalityRelation
	 * @generated
	 */
	public Adapter createColocalityRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentSpecification
	 * @generated
	 */
	public Adapter createDeploymentSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition <em>Deployment Implicit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition
	 * @generated
	 */
	public Adapter createDeploymentImplicitDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue <em>Deployment Implicit Definition Attribute And Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue
	 * @generated
	 */
	public Adapter createDeploymentImplicitDefinitionAttributeAndValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.ValidDeployment <em>Valid Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.ValidDeployment
	 * @generated
	 */
	public Adapter createValidDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.hilbri.assist.datamodel.model.InvalidDeployment <em>Invalid Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.hilbri.assist.datamodel.model.InvalidDeployment
	 * @generated
	 */
	public Adapter createInvalidDeploymentAdapter() {
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
