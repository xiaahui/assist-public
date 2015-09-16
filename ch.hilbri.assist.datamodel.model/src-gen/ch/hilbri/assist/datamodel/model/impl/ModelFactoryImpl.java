/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.ASSIST_MODEL: return createAssistModel();
			case ModelPackage.GLOBAL_BLOCK: return createGlobalBlock();
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK: return createCompatibleIoTypesBlock();
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK: return createCableWeightDataBlock();
			case ModelPackage.PROTECTION_LEVEL_DATA_BLOCK: return createProtectionLevelDataBlock();
			case ModelPackage.COMPARTMENTS_BLOCK: return createCompartmentsBlock();
			case ModelPackage.INTERFACES_BLOCK: return createInterfacesBlock();
			case ModelPackage.INTERFACE_GROUPS_BLOCK: return createInterfaceGroupsBlock();
			case ModelPackage.RESTRICTIONS_BLOCK: return createRestrictionsBlock();
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY: return createCompatibleIoTypeEntry();
			case ModelPackage.PROTECTION_LEVEL_ENTRY: return createProtectionLevelEntry();
			case ModelPackage.CABLE_WEIGHT_DATA: return createCableWeightData();
			case ModelPackage.CABLE_WEIGHT_ENTRY: return createCableWeightEntry();
			case ModelPackage.HARDWARE_ELEMENT: return createHardwareElement();
			case ModelPackage.COMPARTMENT: return createCompartment();
			case ModelPackage.RDC: return createRDC();
			case ModelPackage.INTERNALLY_CONNECTED_PIN_ENTRY: return createInternallyConnectedPinEntry();
			case ModelPackage.CONNECTOR: return createConnector();
			case ModelPackage.AVAILABLE_EQ_INTERFACE: return createAvailableEqInterface();
			case ModelPackage.EQ_INTERFACE_OR_GROUP: return createEqInterfaceOrGroup();
			case ModelPackage.EQ_INTERFACE: return createEqInterface();
			case ModelPackage.EQ_INTERFACE_GROUP: return createEqInterfaceGroup();
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION: return createImplicitEqInterfaceMemberDefinition();
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES: return createImplicitEqInterfaceMemberDefinitionAttributesAndValues();
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION: return createEqInterfaceGroupWithCombinedDefinition();
			case ModelPackage.METRIC_PARAMETER: return createMetricParameter();
			case ModelPackage.DISLOCALITY_RELATION: return createDislocalityRelation();
			case ModelPackage.COLOCALITY_RELATION: return createColocalityRelation();
			case ModelPackage.DEPLOYMENT_SPECIFICATION: return createDeploymentSpecification();
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION: return createDeploymentImplicitDefinition();
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE: return createDeploymentImplicitDefinitionAttributeAndValue();
			case ModelPackage.VALID_DEPLOYMENT: return createValidDeployment();
			case ModelPackage.INVALID_DEPLOYMENT: return createInvalidDeployment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.PROTECTION_LEVEL_TYPE:
				return createProtectionLevelTypeFromString(eDataType, initialValue);
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTE:
				return createImplicitEqInterfaceMemberDefinitionAttributeFromString(eDataType, initialValue);
			case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
				return createHardwareArchitectureLevelTypeFromString(eDataType, initialValue);
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE:
				return createDeploymentImplicitDefinitionAttributeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.PROTECTION_LEVEL_TYPE:
				return convertProtectionLevelTypeToString(eDataType, instanceValue);
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTE:
				return convertImplicitEqInterfaceMemberDefinitionAttributeToString(eDataType, instanceValue);
			case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
				return convertHardwareArchitectureLevelTypeToString(eDataType, instanceValue);
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE:
				return convertDeploymentImplicitDefinitionAttributeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModel createAssistModel() {
		AssistModelImpl assistModel = new AssistModelImpl();
		return assistModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBlock createGlobalBlock() {
		GlobalBlockImpl globalBlock = new GlobalBlockImpl();
		return globalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleIoTypesBlock createCompatibleIoTypesBlock() {
		CompatibleIoTypesBlockImpl compatibleIoTypesBlock = new CompatibleIoTypesBlockImpl();
		return compatibleIoTypesBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableWeightDataBlock createCableWeightDataBlock() {
		CableWeightDataBlockImpl cableWeightDataBlock = new CableWeightDataBlockImpl();
		return cableWeightDataBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionLevelDataBlock createProtectionLevelDataBlock() {
		ProtectionLevelDataBlockImpl protectionLevelDataBlock = new ProtectionLevelDataBlockImpl();
		return protectionLevelDataBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentsBlock createCompartmentsBlock() {
		CompartmentsBlockImpl compartmentsBlock = new CompartmentsBlockImpl();
		return compartmentsBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesBlock createInterfacesBlock() {
		InterfacesBlockImpl interfacesBlock = new InterfacesBlockImpl();
		return interfacesBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceGroupsBlock createInterfaceGroupsBlock() {
		InterfaceGroupsBlockImpl interfaceGroupsBlock = new InterfaceGroupsBlockImpl();
		return interfaceGroupsBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsBlock createRestrictionsBlock() {
		RestrictionsBlockImpl restrictionsBlock = new RestrictionsBlockImpl();
		return restrictionsBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleIoTypeEntry createCompatibleIoTypeEntry() {
		CompatibleIoTypeEntryImpl compatibleIoTypeEntry = new CompatibleIoTypeEntryImpl();
		return compatibleIoTypeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionLevelEntry createProtectionLevelEntry() {
		ProtectionLevelEntryImpl protectionLevelEntry = new ProtectionLevelEntryImpl();
		return protectionLevelEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableWeightData createCableWeightData() {
		CableWeightDataImpl cableWeightData = new CableWeightDataImpl();
		return cableWeightData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableWeightEntry createCableWeightEntry() {
		CableWeightEntryImpl cableWeightEntry = new CableWeightEntryImpl();
		return cableWeightEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareElement createHardwareElement() {
		HardwareElementImpl hardwareElement = new HardwareElementImpl();
		return hardwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment createCompartment() {
		CompartmentImpl compartment = new CompartmentImpl();
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDC createRDC() {
		RDCImpl rdc = new RDCImpl();
		return rdc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternallyConnectedPinEntry createInternallyConnectedPinEntry() {
		InternallyConnectedPinEntryImpl internallyConnectedPinEntry = new InternallyConnectedPinEntryImpl();
		return internallyConnectedPinEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableEqInterface createAvailableEqInterface() {
		AvailableEqInterfaceImpl availableEqInterface = new AvailableEqInterfaceImpl();
		return availableEqInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqInterfaceOrGroup createEqInterfaceOrGroup() {
		EqInterfaceOrGroupImpl eqInterfaceOrGroup = new EqInterfaceOrGroupImpl();
		return eqInterfaceOrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqInterface createEqInterface() {
		EqInterfaceImpl eqInterface = new EqInterfaceImpl();
		return eqInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqInterfaceGroup createEqInterfaceGroup() {
		EqInterfaceGroupImpl eqInterfaceGroup = new EqInterfaceGroupImpl();
		return eqInterfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitEqInterfaceMemberDefinition createImplicitEqInterfaceMemberDefinition() {
		ImplicitEqInterfaceMemberDefinitionImpl implicitEqInterfaceMemberDefinition = new ImplicitEqInterfaceMemberDefinitionImpl();
		return implicitEqInterfaceMemberDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitEqInterfaceMemberDefinitionAttributesAndValues createImplicitEqInterfaceMemberDefinitionAttributesAndValues() {
		ImplicitEqInterfaceMemberDefinitionAttributesAndValuesImpl implicitEqInterfaceMemberDefinitionAttributesAndValues = new ImplicitEqInterfaceMemberDefinitionAttributesAndValuesImpl();
		return implicitEqInterfaceMemberDefinitionAttributesAndValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqInterfaceGroupWithCombinedDefinition createEqInterfaceGroupWithCombinedDefinition() {
		EqInterfaceGroupWithCombinedDefinitionImpl eqInterfaceGroupWithCombinedDefinition = new EqInterfaceGroupWithCombinedDefinitionImpl();
		return eqInterfaceGroupWithCombinedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricParameter createMetricParameter() {
		MetricParameterImpl metricParameter = new MetricParameterImpl();
		return metricParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DislocalityRelation createDislocalityRelation() {
		DislocalityRelationImpl dislocalityRelation = new DislocalityRelationImpl();
		return dislocalityRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColocalityRelation createColocalityRelation() {
		ColocalityRelationImpl colocalityRelation = new ColocalityRelationImpl();
		return colocalityRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createDeploymentSpecification() {
		DeploymentSpecificationImpl deploymentSpecification = new DeploymentSpecificationImpl();
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentImplicitDefinition createDeploymentImplicitDefinition() {
		DeploymentImplicitDefinitionImpl deploymentImplicitDefinition = new DeploymentImplicitDefinitionImpl();
		return deploymentImplicitDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentImplicitDefinitionAttributeAndValue createDeploymentImplicitDefinitionAttributeAndValue() {
		DeploymentImplicitDefinitionAttributeAndValueImpl deploymentImplicitDefinitionAttributeAndValue = new DeploymentImplicitDefinitionAttributeAndValueImpl();
		return deploymentImplicitDefinitionAttributeAndValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidDeployment createValidDeployment() {
		ValidDeploymentImpl validDeployment = new ValidDeploymentImpl();
		return validDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidDeployment createInvalidDeployment() {
		InvalidDeploymentImpl invalidDeployment = new InvalidDeploymentImpl();
		return invalidDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionLevelType createProtectionLevelTypeFromString(EDataType eDataType, String initialValue) {
		ProtectionLevelType result = ProtectionLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtectionLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitEqInterfaceMemberDefinitionAttribute createImplicitEqInterfaceMemberDefinitionAttributeFromString(EDataType eDataType, String initialValue) {
		ImplicitEqInterfaceMemberDefinitionAttribute result = ImplicitEqInterfaceMemberDefinitionAttribute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplicitEqInterfaceMemberDefinitionAttributeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType createHardwareArchitectureLevelTypeFromString(EDataType eDataType, String initialValue) {
		HardwareArchitectureLevelType result = HardwareArchitectureLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHardwareArchitectureLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentImplicitDefinitionAttribute createDeploymentImplicitDefinitionAttributeFromString(EDataType eDataType, String initialValue) {
		DeploymentImplicitDefinitionAttribute result = DeploymentImplicitDefinitionAttribute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentImplicitDefinitionAttributeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
