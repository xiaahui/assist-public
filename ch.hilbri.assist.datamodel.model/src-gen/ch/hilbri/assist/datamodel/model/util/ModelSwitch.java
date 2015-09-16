/**
 */
package ch.hilbri.assist.datamodel.model.util;

import ch.hilbri.assist.datamodel.model.*;

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
 * @see ch.hilbri.assist.datamodel.model.ModelPackage
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
			case ModelPackage.GLOBAL_BLOCK: {
				GlobalBlock globalBlock = (GlobalBlock)theEObject;
				T result = caseGlobalBlock(globalBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK: {
				CompatibleIoTypesBlock compatibleIoTypesBlock = (CompatibleIoTypesBlock)theEObject;
				T result = caseCompatibleIoTypesBlock(compatibleIoTypesBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY: {
				CompatibleIoTypeEntry compatibleIoTypeEntry = (CompatibleIoTypeEntry)theEObject;
				T result = caseCompatibleIoTypeEntry(compatibleIoTypeEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK: {
				CableWeightDataBlock cableWeightDataBlock = (CableWeightDataBlock)theEObject;
				T result = caseCableWeightDataBlock(cableWeightDataBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CABLE_WEIGHT_ENTRY: {
				CableWeightEntry cableWeightEntry = (CableWeightEntry)theEObject;
				T result = caseCableWeightEntry(cableWeightEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROTECTION_LEVEL_DATA_BLOCK: {
				ProtectionLevelDataBlock protectionLevelDataBlock = (ProtectionLevelDataBlock)theEObject;
				T result = caseProtectionLevelDataBlock(protectionLevelDataBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROTECTION_LEVEL_ENTRY: {
				ProtectionLevelEntry protectionLevelEntry = (ProtectionLevelEntry)theEObject;
				T result = caseProtectionLevelEntry(protectionLevelEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPARTMENTS_BLOCK: {
				CompartmentsBlock compartmentsBlock = (CompartmentsBlock)theEObject;
				T result = caseCompartmentsBlock(compartmentsBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HARDWARE_ELEMENT: {
				HardwareElement hardwareElement = (HardwareElement)theEObject;
				T result = caseHardwareElement(hardwareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METRIC_PARAMETERS_BLOCK: {
				MetricParametersBlock metricParametersBlock = (MetricParametersBlock)theEObject;
				T result = caseMetricParametersBlock(metricParametersBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METRIC_PARAMETER: {
				MetricParameter metricParameter = (MetricParameter)theEObject;
				T result = caseMetricParameter(metricParameter);
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
			case ModelPackage.RDC: {
				RDC rdc = (RDC)theEObject;
				T result = caseRDC(rdc);
				if (result == null) result = caseHardwareElement(rdc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERNALLY_CONNECTED_PIN_ENTRY: {
				InternallyConnectedPinEntry internallyConnectedPinEntry = (InternallyConnectedPinEntry)theEObject;
				T result = caseInternallyConnectedPinEntry(internallyConnectedPinEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseHardwareElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AVAILABLE_EQ_INTERFACE: {
				AvailableEqInterface availableEqInterface = (AvailableEqInterface)theEObject;
				T result = caseAvailableEqInterface(availableEqInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACES_BLOCK: {
				InterfacesBlock interfacesBlock = (InterfacesBlock)theEObject;
				T result = caseInterfacesBlock(interfacesBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EQ_INTERFACE_OR_GROUP: {
				EqInterfaceOrGroup eqInterfaceOrGroup = (EqInterfaceOrGroup)theEObject;
				T result = caseEqInterfaceOrGroup(eqInterfaceOrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EQ_INTERFACE: {
				EqInterface eqInterface = (EqInterface)theEObject;
				T result = caseEqInterface(eqInterface);
				if (result == null) result = caseEqInterfaceOrGroup(eqInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_GROUPS_BLOCK: {
				InterfaceGroupsBlock interfaceGroupsBlock = (InterfaceGroupsBlock)theEObject;
				T result = caseInterfaceGroupsBlock(interfaceGroupsBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EQ_INTERFACE_GROUP: {
				EqInterfaceGroup eqInterfaceGroup = (EqInterfaceGroup)theEObject;
				T result = caseEqInterfaceGroup(eqInterfaceGroup);
				if (result == null) result = caseEqInterfaceOrGroup(eqInterfaceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION: {
				ImplicitEqInterfaceMemberDefinition implicitEqInterfaceMemberDefinition = (ImplicitEqInterfaceMemberDefinition)theEObject;
				T result = caseImplicitEqInterfaceMemberDefinition(implicitEqInterfaceMemberDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES: {
				ImplicitEqInterfaceMemberDefinitionAttributesAndValues implicitEqInterfaceMemberDefinitionAttributesAndValues = (ImplicitEqInterfaceMemberDefinitionAttributesAndValues)theEObject;
				T result = caseImplicitEqInterfaceMemberDefinitionAttributesAndValues(implicitEqInterfaceMemberDefinitionAttributesAndValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION: {
				EqInterfaceGroupWithCombinedDefinition eqInterfaceGroupWithCombinedDefinition = (EqInterfaceGroupWithCombinedDefinition)theEObject;
				T result = caseEqInterfaceGroupWithCombinedDefinition(eqInterfaceGroupWithCombinedDefinition);
				if (result == null) result = caseEqInterfaceGroup(eqInterfaceGroupWithCombinedDefinition);
				if (result == null) result = caseEqInterfaceOrGroup(eqInterfaceGroupWithCombinedDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICTIONS_BLOCK: {
				RestrictionsBlock restrictionsBlock = (RestrictionsBlock)theEObject;
				T result = caseRestrictionsBlock(restrictionsBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISLOCALITY_RELATION: {
				DislocalityRelation dislocalityRelation = (DislocalityRelation)theEObject;
				T result = caseDislocalityRelation(dislocalityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOCALITY_RELATION: {
				ColocalityRelation colocalityRelation = (ColocalityRelation)theEObject;
				T result = caseColocalityRelation(colocalityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DEPLOYMENT_SPECIFICATION: {
				DeploymentSpecification deploymentSpecification = (DeploymentSpecification)theEObject;
				T result = caseDeploymentSpecification(deploymentSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION: {
				DeploymentImplicitDefinition deploymentImplicitDefinition = (DeploymentImplicitDefinition)theEObject;
				T result = caseDeploymentImplicitDefinition(deploymentImplicitDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE: {
				DeploymentImplicitDefinitionAttributeAndValue deploymentImplicitDefinitionAttributeAndValue = (DeploymentImplicitDefinitionAttributeAndValue)theEObject;
				T result = caseDeploymentImplicitDefinitionAttributeAndValue(deploymentImplicitDefinitionAttributeAndValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VALID_DEPLOYMENT: {
				ValidDeployment validDeployment = (ValidDeployment)theEObject;
				T result = caseValidDeployment(validDeployment);
				if (result == null) result = caseDeploymentSpecification(validDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INVALID_DEPLOYMENT: {
				InvalidDeployment invalidDeployment = (InvalidDeployment)theEObject;
				T result = caseInvalidDeployment(invalidDeployment);
				if (result == null) result = caseDeploymentSpecification(invalidDeployment);
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
	 * Returns the result of interpreting the object as an instance of '<em>Global Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalBlock(GlobalBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compatible Io Types Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compatible Io Types Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompatibleIoTypesBlock(CompatibleIoTypesBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compatible Io Type Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compatible Io Type Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompatibleIoTypeEntry(CompatibleIoTypeEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Weight Data Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Weight Data Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCableWeightDataBlock(CableWeightDataBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Weight Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Weight Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCableWeightEntry(CableWeightEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Level Data Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Level Data Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionLevelDataBlock(ProtectionLevelDataBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Level Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Level Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionLevelEntry(ProtectionLevelEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartments Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartments Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentsBlock(CompartmentsBlock object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Metric Parameters Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Parameters Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricParametersBlock(MetricParametersBlock object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>RDC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDC(RDC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internally Connected Pin Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internally Connected Pin Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternallyConnectedPinEntry(InternallyConnectedPinEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Available Eq Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Available Eq Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailableEqInterface(AvailableEqInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfaces Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfaces Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacesBlock(InterfacesBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq Interface Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq Interface Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqInterfaceOrGroup(EqInterfaceOrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqInterface(EqInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Groups Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Groups Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceGroupsBlock(InterfaceGroupsBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq Interface Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq Interface Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqInterfaceGroup(EqInterfaceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Eq Interface Member Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Eq Interface Member Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitEqInterfaceMemberDefinition(ImplicitEqInterfaceMemberDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Eq Interface Member Definition Attributes And Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Eq Interface Member Definition Attributes And Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitEqInterfaceMemberDefinitionAttributesAndValues(ImplicitEqInterfaceMemberDefinitionAttributesAndValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq Interface Group With Combined Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq Interface Group With Combined Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqInterfaceGroupWithCombinedDefinition(EqInterfaceGroupWithCombinedDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restrictions Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restrictions Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionsBlock(RestrictionsBlock object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentSpecification(DeploymentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Implicit Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Implicit Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentImplicitDefinition(DeploymentImplicitDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Implicit Definition Attribute And Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Implicit Definition Attribute And Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentImplicitDefinitionAttributeAndValue(DeploymentImplicitDefinitionAttributeAndValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidDeployment(ValidDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidDeployment(InvalidDeployment object) {
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
