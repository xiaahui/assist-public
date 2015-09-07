/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.CableWeightData;
import ch.hilbri.assist.datamodel.model.CableWeightEntry;
import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue;
import ch.hilbri.assist.datamodel.model.DeploymentSpecification;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition;
import ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues;
import ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelFactory;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelData;
import ch.hilbri.assist.datamodel.model.ProtectionLevelEntry;
import ch.hilbri.assist.datamodel.model.ProtectionLevelType;
import ch.hilbri.assist.datamodel.model.ValidDeployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assistModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibleIoTypeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionLevelDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionLevelEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableWeightDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableWeightEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internallyConnectedPinEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availableEqInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqInterfaceOrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqInterfaceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitEqInterfaceMemberDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqInterfaceGroupWithCombinedDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dislocalityRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colocalityRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentImplicitDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentImplicitDefinitionAttributeAndValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protectionLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implicitEqInterfaceMemberDefinitionAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hardwareArchitectureLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentImplicitDefinitionAttributeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssistModel() {
		return assistModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModel_SystemName() {
		return (EAttribute)assistModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_CableWeightData() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_ProtectionLevelData() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_CompatibleIoTypes() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_Compartments() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_EqInterfaces() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_EqInterfaceGroups() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_DislocalityRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_ColocalityRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_ValidDeployments() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_InvalidDeployments() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllCompartments() {
		return assistModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllRDCs() {
		return assistModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllConnectors() {
		return assistModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllHardwareElements__int() {
		return assistModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompatibleIoTypeEntry() {
		return compatibleIoTypeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompatibleIoTypeEntry_EqInterfaceIoType() {
		return (EAttribute)compatibleIoTypeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompatibleIoTypeEntry_PinInterfaceIoTypes() {
		return (EAttribute)compatibleIoTypeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectionLevelData() {
		return protectionLevelDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionLevelData_ProtectionLevelEntries() {
		return (EReference)protectionLevelDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectionLevelEntry() {
		return protectionLevelEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionLevelEntry_RdcLocation() {
		return (EAttribute)protectionLevelEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionLevelEntry_EmhZone1() {
		return (EAttribute)protectionLevelEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionLevelEntry_ProtectionLevel() {
		return (EAttribute)protectionLevelEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCableWeightData() {
		return cableWeightDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCableWeightData_CableWeightEntries() {
		return (EReference)cableWeightDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCableWeightData__GetDefaultCableWeight() {
		return cableWeightDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCableWeightData__GetCableWeight__String() {
		return cableWeightDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCableWeightEntry() {
		return cableWeightEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableWeightEntry_DefaultEntry() {
		return (EAttribute)cableWeightEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableWeightEntry_EqInterfaceIoType() {
		return (EAttribute)cableWeightEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableWeightEntry_Weight() {
		return (EAttribute)cableWeightEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareElement() {
		return hardwareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareElement_Name() {
		return (EAttribute)hardwareElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareElement_MetricParameters() {
		return (EReference)hardwareElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartment() {
		return compartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartment_Manufacturer() {
		return (EAttribute)compartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartment_PowerSupply() {
		return (EAttribute)compartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartment_Side() {
		return (EAttribute)compartmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartment_Zone() {
		return (EAttribute)compartmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartment_Rdcs() {
		return (EReference)compartmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__ToString() {
		return compartmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAllConnectors() {
		return compartmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAvailableEqInterfaces__EList() {
		return compartmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDC() {
		return rdcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_Manufacturer() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_PowerSupply() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_Side() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_RdcType() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_Ess() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_Location() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_ResourceX() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_ResourceY() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDC_ResourceZ() {
		return (EAttribute)rdcEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDC_Compartment() {
		return (EReference)rdcEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDC_Connectors() {
		return (EReference)rdcEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDC_ConnectedPins() {
		return (EReference)rdcEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRDC__ToString() {
		return rdcEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRDC__GetAvailableEqInterfaces__EList() {
		return rdcEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternallyConnectedPinEntry() {
		return internallyConnectedPinEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternallyConnectedPinEntry_Pins() {
		return (EReference)internallyConnectedPinEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Rdc() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_AvailableEqInterfaces() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__FullName() {
		return connectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__ToString() {
		return connectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__GetAvailableEqInterfaces__EList() {
		return connectorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailableEqInterface() {
		return availableEqInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailableEqInterface_Name() {
		return (EAttribute)availableEqInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailableEqInterface_EqInterfaceType() {
		return (EAttribute)availableEqInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailableEqInterface_Count() {
		return (EAttribute)availableEqInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailableEqInterface_ProtectionLevel() {
		return (EAttribute)availableEqInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqInterfaceOrGroup() {
		return eqInterfaceOrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterfaceOrGroup_Name() {
		return (EAttribute)eqInterfaceOrGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEqInterfaceOrGroup__ToString() {
		return eqInterfaceOrGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqInterface() {
		return eqInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_System() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_SubAta() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_LineName() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_WiringLane() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_GrpInfo() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_Route() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_PwSup1() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_EmhZone1() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_IoType() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_Resource() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_ResourceX() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_ResourceY() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqInterface_ResourceZ() {
		return (EAttribute)eqInterfaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqInterface_MetricParameters() {
		return (EReference)eqInterfaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEqInterface__ToString() {
		return eqInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqInterfaceGroup() {
		return eqInterfaceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqInterfaceGroup_EqInterfaces() {
		return (EReference)eqInterfaceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqInterfaceGroup_WithoutEqInterfaces() {
		return (EReference)eqInterfaceGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqInterfaceGroup_ImplicitMemberDefinitions() {
		return (EReference)eqInterfaceGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqInterfaceGroup_WithoutImplicitMemberDefinitions() {
		return (EReference)eqInterfaceGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEqInterfaceGroup__ToString() {
		return eqInterfaceGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEqInterfaceGroup__GetImplicitlyDefinedEqInterfaces() {
		return eqInterfaceGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEqInterfaceGroup__GetWithoutImplicitlyDefinedEqInterfaces() {
		return eqInterfaceGroupEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitEqInterfaceMemberDefinition() {
		return implicitEqInterfaceMemberDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitEqInterfaceMemberDefinition_Entries() {
		return (EReference)implicitEqInterfaceMemberDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplicitEqInterfaceMemberDefinition__GetImplicitlyDefinedEqInterfaces() {
		return implicitEqInterfaceMemberDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitEqInterfaceMemberDefinitionAttributesAndValues() {
		return implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Attribute() {
		return (EAttribute)implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Value() {
		return (EAttribute)implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqInterfaceGroupWithCombinedDefinition() {
		return eqInterfaceGroupWithCombinedDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqInterfaceGroupWithCombinedDefinition_CombinedGroups() {
		return (EReference)eqInterfaceGroupWithCombinedDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricParameter() {
		return metricParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricParameter_Name() {
		return (EAttribute)metricParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricParameter_Value() {
		return (EAttribute)metricParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDislocalityRelation() {
		return dislocalityRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDislocalityRelation_EqInterfaceOrGroups() {
		return (EReference)dislocalityRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDislocalityRelation_HardwareLevel() {
		return (EAttribute)dislocalityRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDislocalityRelation__GetAllInterfaces() {
		return dislocalityRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDislocalityRelation__GetTotalInterfaceCount() {
		return dislocalityRelationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDislocalityRelation__GetAllEqInterfaceOrGroupNames() {
		return dislocalityRelationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColocalityRelation() {
		return colocalityRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColocalityRelation_EqInterfaceOrGroups() {
		return (EReference)colocalityRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColocalityRelation_HardwareLevel() {
		return (EAttribute)colocalityRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColocalityRelation__GetAllInterfaces() {
		return colocalityRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColocalityRelation__GetAllEqInterfaceOrGroupNames() {
		return colocalityRelationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpecification() {
		return deploymentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_EqInterfaceOrGroups() {
		return (EReference)deploymentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_HardwareElements() {
		return (EReference)deploymentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_ImplicitHardwareElements() {
		return (EReference)deploymentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentSpecification__GetAllEqInterfaceOrGroupNames() {
		return deploymentSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentSpecification__GetImplicitlyDefinedConnectors() {
		return deploymentSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentImplicitDefinition() {
		return deploymentImplicitDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentImplicitDefinition_Entries() {
		return (EReference)deploymentImplicitDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentImplicitDefinition__GetImplicitlyDefinedConnectors() {
		return deploymentImplicitDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentImplicitDefinitionAttributeAndValue() {
		return deploymentImplicitDefinitionAttributeAndValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentImplicitDefinitionAttributeAndValue_Attribute() {
		return (EAttribute)deploymentImplicitDefinitionAttributeAndValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentImplicitDefinitionAttributeAndValue_Value() {
		return (EAttribute)deploymentImplicitDefinitionAttributeAndValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidDeployment() {
		return validDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidDeployment() {
		return invalidDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtectionLevelType() {
		return protectionLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImplicitEqInterfaceMemberDefinitionAttribute() {
		return implicitEqInterfaceMemberDefinitionAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHardwareArchitectureLevelType() {
		return hardwareArchitectureLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeploymentImplicitDefinitionAttribute() {
		return deploymentImplicitDefinitionAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assistModelEClass = createEClass(ASSIST_MODEL);
		createEAttribute(assistModelEClass, ASSIST_MODEL__SYSTEM_NAME);
		createEReference(assistModelEClass, ASSIST_MODEL__CABLE_WEIGHT_DATA);
		createEReference(assistModelEClass, ASSIST_MODEL__PROTECTION_LEVEL_DATA);
		createEReference(assistModelEClass, ASSIST_MODEL__COMPATIBLE_IO_TYPES);
		createEReference(assistModelEClass, ASSIST_MODEL__COMPARTMENTS);
		createEReference(assistModelEClass, ASSIST_MODEL__EQ_INTERFACES);
		createEReference(assistModelEClass, ASSIST_MODEL__EQ_INTERFACE_GROUPS);
		createEReference(assistModelEClass, ASSIST_MODEL__DISLOCALITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__COLOCALITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__VALID_DEPLOYMENTS);
		createEReference(assistModelEClass, ASSIST_MODEL__INVALID_DEPLOYMENTS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_COMPARTMENTS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_RD_CS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_CONNECTORS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT);

		compatibleIoTypeEntryEClass = createEClass(COMPATIBLE_IO_TYPE_ENTRY);
		createEAttribute(compatibleIoTypeEntryEClass, COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE);
		createEAttribute(compatibleIoTypeEntryEClass, COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES);

		protectionLevelDataEClass = createEClass(PROTECTION_LEVEL_DATA);
		createEReference(protectionLevelDataEClass, PROTECTION_LEVEL_DATA__PROTECTION_LEVEL_ENTRIES);

		protectionLevelEntryEClass = createEClass(PROTECTION_LEVEL_ENTRY);
		createEAttribute(protectionLevelEntryEClass, PROTECTION_LEVEL_ENTRY__RDC_LOCATION);
		createEAttribute(protectionLevelEntryEClass, PROTECTION_LEVEL_ENTRY__EMH_ZONE1);
		createEAttribute(protectionLevelEntryEClass, PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL);

		cableWeightDataEClass = createEClass(CABLE_WEIGHT_DATA);
		createEReference(cableWeightDataEClass, CABLE_WEIGHT_DATA__CABLE_WEIGHT_ENTRIES);
		createEOperation(cableWeightDataEClass, CABLE_WEIGHT_DATA___GET_DEFAULT_CABLE_WEIGHT);
		createEOperation(cableWeightDataEClass, CABLE_WEIGHT_DATA___GET_CABLE_WEIGHT__STRING);

		cableWeightEntryEClass = createEClass(CABLE_WEIGHT_ENTRY);
		createEAttribute(cableWeightEntryEClass, CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY);
		createEAttribute(cableWeightEntryEClass, CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE);
		createEAttribute(cableWeightEntryEClass, CABLE_WEIGHT_ENTRY__WEIGHT);

		hardwareElementEClass = createEClass(HARDWARE_ELEMENT);
		createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__NAME);
		createEReference(hardwareElementEClass, HARDWARE_ELEMENT__METRIC_PARAMETERS);

		compartmentEClass = createEClass(COMPARTMENT);
		createEAttribute(compartmentEClass, COMPARTMENT__MANUFACTURER);
		createEAttribute(compartmentEClass, COMPARTMENT__POWER_SUPPLY);
		createEAttribute(compartmentEClass, COMPARTMENT__SIDE);
		createEAttribute(compartmentEClass, COMPARTMENT__ZONE);
		createEReference(compartmentEClass, COMPARTMENT__RDCS);
		createEOperation(compartmentEClass, COMPARTMENT___TO_STRING);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_CONNECTORS);
		createEOperation(compartmentEClass, COMPARTMENT___GET_AVAILABLE_EQ_INTERFACES__ELIST);

		rdcEClass = createEClass(RDC);
		createEAttribute(rdcEClass, RDC__MANUFACTURER);
		createEAttribute(rdcEClass, RDC__POWER_SUPPLY);
		createEAttribute(rdcEClass, RDC__SIDE);
		createEAttribute(rdcEClass, RDC__RDC_TYPE);
		createEAttribute(rdcEClass, RDC__ESS);
		createEAttribute(rdcEClass, RDC__LOCATION);
		createEAttribute(rdcEClass, RDC__RESOURCE_X);
		createEAttribute(rdcEClass, RDC__RESOURCE_Y);
		createEAttribute(rdcEClass, RDC__RESOURCE_Z);
		createEReference(rdcEClass, RDC__COMPARTMENT);
		createEReference(rdcEClass, RDC__CONNECTORS);
		createEReference(rdcEClass, RDC__CONNECTED_PINS);
		createEOperation(rdcEClass, RDC___TO_STRING);
		createEOperation(rdcEClass, RDC___GET_AVAILABLE_EQ_INTERFACES__ELIST);

		internallyConnectedPinEntryEClass = createEClass(INTERNALLY_CONNECTED_PIN_ENTRY);
		createEReference(internallyConnectedPinEntryEClass, INTERNALLY_CONNECTED_PIN_ENTRY__PINS);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__RDC);
		createEReference(connectorEClass, CONNECTOR__AVAILABLE_EQ_INTERFACES);
		createEOperation(connectorEClass, CONNECTOR___FULL_NAME);
		createEOperation(connectorEClass, CONNECTOR___TO_STRING);
		createEOperation(connectorEClass, CONNECTOR___GET_AVAILABLE_EQ_INTERFACES__ELIST);

		availableEqInterfaceEClass = createEClass(AVAILABLE_EQ_INTERFACE);
		createEAttribute(availableEqInterfaceEClass, AVAILABLE_EQ_INTERFACE__NAME);
		createEAttribute(availableEqInterfaceEClass, AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE);
		createEAttribute(availableEqInterfaceEClass, AVAILABLE_EQ_INTERFACE__COUNT);
		createEAttribute(availableEqInterfaceEClass, AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL);

		eqInterfaceOrGroupEClass = createEClass(EQ_INTERFACE_OR_GROUP);
		createEAttribute(eqInterfaceOrGroupEClass, EQ_INTERFACE_OR_GROUP__NAME);
		createEOperation(eqInterfaceOrGroupEClass, EQ_INTERFACE_OR_GROUP___TO_STRING);

		eqInterfaceEClass = createEClass(EQ_INTERFACE);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__SYSTEM);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__SUB_ATA);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__LINE_NAME);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__WIRING_LANE);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__GRP_INFO);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__ROUTE);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__PW_SUP1);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__EMH_ZONE1);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__IO_TYPE);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__RESOURCE);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__RESOURCE_X);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__RESOURCE_Y);
		createEAttribute(eqInterfaceEClass, EQ_INTERFACE__RESOURCE_Z);
		createEReference(eqInterfaceEClass, EQ_INTERFACE__METRIC_PARAMETERS);
		createEOperation(eqInterfaceEClass, EQ_INTERFACE___TO_STRING);

		eqInterfaceGroupEClass = createEClass(EQ_INTERFACE_GROUP);
		createEReference(eqInterfaceGroupEClass, EQ_INTERFACE_GROUP__EQ_INTERFACES);
		createEReference(eqInterfaceGroupEClass, EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES);
		createEReference(eqInterfaceGroupEClass, EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS);
		createEReference(eqInterfaceGroupEClass, EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS);
		createEOperation(eqInterfaceGroupEClass, EQ_INTERFACE_GROUP___TO_STRING);
		createEOperation(eqInterfaceGroupEClass, EQ_INTERFACE_GROUP___GET_IMPLICITLY_DEFINED_EQ_INTERFACES);
		createEOperation(eqInterfaceGroupEClass, EQ_INTERFACE_GROUP___GET_WITHOUT_IMPLICITLY_DEFINED_EQ_INTERFACES);

		implicitEqInterfaceMemberDefinitionEClass = createEClass(IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION);
		createEReference(implicitEqInterfaceMemberDefinitionEClass, IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES);
		createEOperation(implicitEqInterfaceMemberDefinitionEClass, IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION___GET_IMPLICITLY_DEFINED_EQ_INTERFACES);

		implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass = createEClass(IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES);
		createEAttribute(implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass, IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__ATTRIBUTE);
		createEAttribute(implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass, IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__VALUE);

		eqInterfaceGroupWithCombinedDefinitionEClass = createEClass(EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION);
		createEReference(eqInterfaceGroupWithCombinedDefinitionEClass, EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS);

		metricParameterEClass = createEClass(METRIC_PARAMETER);
		createEAttribute(metricParameterEClass, METRIC_PARAMETER__NAME);
		createEAttribute(metricParameterEClass, METRIC_PARAMETER__VALUE);

		dislocalityRelationEClass = createEClass(DISLOCALITY_RELATION);
		createEReference(dislocalityRelationEClass, DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS);
		createEAttribute(dislocalityRelationEClass, DISLOCALITY_RELATION__HARDWARE_LEVEL);
		createEOperation(dislocalityRelationEClass, DISLOCALITY_RELATION___GET_ALL_INTERFACES);
		createEOperation(dislocalityRelationEClass, DISLOCALITY_RELATION___GET_TOTAL_INTERFACE_COUNT);
		createEOperation(dislocalityRelationEClass, DISLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES);

		colocalityRelationEClass = createEClass(COLOCALITY_RELATION);
		createEReference(colocalityRelationEClass, COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS);
		createEAttribute(colocalityRelationEClass, COLOCALITY_RELATION__HARDWARE_LEVEL);
		createEOperation(colocalityRelationEClass, COLOCALITY_RELATION___GET_ALL_INTERFACES);
		createEOperation(colocalityRelationEClass, COLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES);

		deploymentSpecificationEClass = createEClass(DEPLOYMENT_SPECIFICATION);
		createEReference(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS);
		createEReference(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS);
		createEReference(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS);
		createEOperation(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES);
		createEOperation(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION___GET_IMPLICITLY_DEFINED_CONNECTORS);

		deploymentImplicitDefinitionEClass = createEClass(DEPLOYMENT_IMPLICIT_DEFINITION);
		createEReference(deploymentImplicitDefinitionEClass, DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES);
		createEOperation(deploymentImplicitDefinitionEClass, DEPLOYMENT_IMPLICIT_DEFINITION___GET_IMPLICITLY_DEFINED_CONNECTORS);

		deploymentImplicitDefinitionAttributeAndValueEClass = createEClass(DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE);
		createEAttribute(deploymentImplicitDefinitionAttributeAndValueEClass, DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__ATTRIBUTE);
		createEAttribute(deploymentImplicitDefinitionAttributeAndValueEClass, DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__VALUE);

		validDeploymentEClass = createEClass(VALID_DEPLOYMENT);

		invalidDeploymentEClass = createEClass(INVALID_DEPLOYMENT);

		// Create enums
		protectionLevelTypeEEnum = createEEnum(PROTECTION_LEVEL_TYPE);
		implicitEqInterfaceMemberDefinitionAttributeEEnum = createEEnum(IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTE);
		hardwareArchitectureLevelTypeEEnum = createEEnum(HARDWARE_ARCHITECTURE_LEVEL_TYPE);
		deploymentImplicitDefinitionAttributeEEnum = createEEnum(DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compartmentEClass.getESuperTypes().add(this.getHardwareElement());
		rdcEClass.getESuperTypes().add(this.getHardwareElement());
		connectorEClass.getESuperTypes().add(this.getHardwareElement());
		eqInterfaceEClass.getESuperTypes().add(this.getEqInterfaceOrGroup());
		eqInterfaceGroupEClass.getESuperTypes().add(this.getEqInterfaceOrGroup());
		eqInterfaceGroupWithCombinedDefinitionEClass.getESuperTypes().add(this.getEqInterfaceGroup());
		validDeploymentEClass.getESuperTypes().add(this.getDeploymentSpecification());
		invalidDeploymentEClass.getESuperTypes().add(this.getDeploymentSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(assistModelEClass, AssistModel.class, "AssistModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssistModel_SystemName(), theEcorePackage.getEString(), "systemName", "", 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_CableWeightData(), this.getCableWeightData(), null, "cableWeightData", null, 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_ProtectionLevelData(), this.getProtectionLevelData(), null, "protectionLevelData", null, 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_CompatibleIoTypes(), this.getCompatibleIoTypeEntry(), null, "compatibleIoTypes", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_Compartments(), this.getCompartment(), null, "compartments", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_EqInterfaces(), this.getEqInterface(), null, "eqInterfaces", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_EqInterfaceGroups(), this.getEqInterfaceGroup(), null, "eqInterfaceGroups", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_DislocalityRelations(), this.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_ColocalityRelations(), this.getColocalityRelation(), null, "colocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_ValidDeployments(), this.getValidDeployment(), null, "validDeployments", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_InvalidDeployments(), this.getInvalidDeployment(), null, "invalidDeployments", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAssistModel__GetAllCompartments(), this.getCompartment(), "getAllCompartments", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModel__GetAllRDCs(), this.getRDC(), "getAllRDCs", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModel__GetAllConnectors(), this.getConnector(), "getAllConnectors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAssistModel__GetAllHardwareElements__int(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(compatibleIoTypeEntryEClass, CompatibleIoTypeEntry.class, "CompatibleIoTypeEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompatibleIoTypeEntry_EqInterfaceIoType(), theEcorePackage.getEString(), "eqInterfaceIoType", "", 0, 1, CompatibleIoTypeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompatibleIoTypeEntry_PinInterfaceIoTypes(), theEcorePackage.getEString(), "pinInterfaceIoTypes", "", 1, -1, CompatibleIoTypeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionLevelDataEClass, ProtectionLevelData.class, "ProtectionLevelData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtectionLevelData_ProtectionLevelEntries(), this.getProtectionLevelEntry(), null, "protectionLevelEntries", null, 0, -1, ProtectionLevelData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionLevelEntryEClass, ProtectionLevelEntry.class, "ProtectionLevelEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtectionLevelEntry_RdcLocation(), theEcorePackage.getEString(), "rdcLocation", "", 0, 1, ProtectionLevelEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionLevelEntry_EmhZone1(), theEcorePackage.getEString(), "emhZone1", "", 0, 1, ProtectionLevelEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionLevelEntry_ProtectionLevel(), this.getProtectionLevelType(), "protectionLevel", null, 1, -1, ProtectionLevelEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cableWeightDataEClass, CableWeightData.class, "CableWeightData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCableWeightData_CableWeightEntries(), this.getCableWeightEntry(), null, "cableWeightEntries", null, 0, -1, CableWeightData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCableWeightData__GetDefaultCableWeight(), theEcorePackage.getEDouble(), "getDefaultCableWeight", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCableWeightData__GetCableWeight__String(), theEcorePackage.getEDouble(), "getCableWeight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "ioType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cableWeightEntryEClass, CableWeightEntry.class, "CableWeightEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCableWeightEntry_DefaultEntry(), theEcorePackage.getEBoolean(), "defaultEntry", "false", 0, 1, CableWeightEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCableWeightEntry_EqInterfaceIoType(), theEcorePackage.getEString(), "eqInterfaceIoType", "", 0, 1, CableWeightEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCableWeightEntry_Weight(), theEcorePackage.getEDouble(), "weight", "0.0", 0, 1, CableWeightEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareElementEClass, HardwareElement.class, "HardwareElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareElement_Name(), theEcorePackage.getEString(), "name", "", 0, 1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareElement_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentEClass, Compartment.class, "Compartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompartment_Manufacturer(), theEcorePackage.getEString(), "manufacturer", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_PowerSupply(), theEcorePackage.getEString(), "powerSupply", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_Side(), theEcorePackage.getEString(), "side", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_Zone(), theEcorePackage.getEString(), "zone", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartment_Rdcs(), this.getRDC(), this.getRDC_Compartment(), "rdcs", null, 0, -1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompartment__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompartment__GetAllConnectors(), this.getConnector(), "getAllConnectors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompartment__GetAvailableEqInterfaces__EList(), theEcorePackage.getEInt(), "getAvailableEqInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "eqInterfaceTypes", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rdcEClass, ch.hilbri.assist.datamodel.model.RDC.class, "RDC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDC_Manufacturer(), theEcorePackage.getEString(), "manufacturer", "", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_PowerSupply(), theEcorePackage.getEString(), "powerSupply", "", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_Side(), theEcorePackage.getEString(), "side", "", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_RdcType(), theEcorePackage.getEString(), "rdcType", "", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_Ess(), theEcorePackage.getEString(), "ess", "", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_Location(), theEcorePackage.getEString(), "location", "", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_ResourceX(), theEcorePackage.getEInt(), "resourceX", "0", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_ResourceY(), theEcorePackage.getEInt(), "resourceY", "0", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDC_ResourceZ(), theEcorePackage.getEInt(), "resourceZ", "0", 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDC_Compartment(), this.getCompartment(), this.getCompartment_Rdcs(), "compartment", null, 0, 1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDC_Connectors(), this.getConnector(), this.getConnector_Rdc(), "connectors", null, 0, -1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDC_ConnectedPins(), this.getInternallyConnectedPinEntry(), null, "connectedPins", null, 0, -1, ch.hilbri.assist.datamodel.model.RDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRDC__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRDC__GetAvailableEqInterfaces__EList(), theEcorePackage.getEInt(), "getAvailableEqInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "eqInterfaceTypes", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(internallyConnectedPinEntryEClass, InternallyConnectedPinEntry.class, "InternallyConnectedPinEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternallyConnectedPinEntry_Pins(), this.getAvailableEqInterface(), null, "pins", null, 2, -1, InternallyConnectedPinEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Rdc(), this.getRDC(), this.getRDC_Connectors(), "rdc", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_AvailableEqInterfaces(), this.getAvailableEqInterface(), null, "availableEqInterfaces", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConnector__FullName(), theEcorePackage.getEString(), "fullName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnector__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnector__GetAvailableEqInterfaces__EList(), theEcorePackage.getEInt(), "getAvailableEqInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "eqInterfaceTypes", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(availableEqInterfaceEClass, AvailableEqInterface.class, "AvailableEqInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAvailableEqInterface_Name(), theEcorePackage.getEString(), "name", "", 0, 1, AvailableEqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailableEqInterface_EqInterfaceType(), theEcorePackage.getEString(), "eqInterfaceType", "", 0, 1, AvailableEqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailableEqInterface_Count(), theEcorePackage.getEInt(), "count", "0", 0, 1, AvailableEqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailableEqInterface_ProtectionLevel(), this.getProtectionLevelType(), "protectionLevel", "None", 0, 1, AvailableEqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eqInterfaceOrGroupEClass, EqInterfaceOrGroup.class, "EqInterfaceOrGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEqInterfaceOrGroup_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EqInterfaceOrGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEqInterfaceOrGroup__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eqInterfaceEClass, EqInterface.class, "EqInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEqInterface_System(), theEcorePackage.getEString(), "system", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_SubAta(), theEcorePackage.getEString(), "subAta", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_LineName(), theEcorePackage.getEString(), "lineName", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_WiringLane(), theEcorePackage.getEString(), "wiringLane", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_GrpInfo(), theEcorePackage.getEString(), "grpInfo", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_Route(), theEcorePackage.getEString(), "route", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_PwSup1(), theEcorePackage.getEString(), "pwSup1", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_EmhZone1(), theEcorePackage.getEString(), "emhZone1", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_IoType(), theEcorePackage.getEString(), "ioType", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_Resource(), theEcorePackage.getEString(), "resource", "", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_ResourceX(), theEcorePackage.getEInt(), "resourceX", "0", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_ResourceY(), theEcorePackage.getEInt(), "resourceY", "0", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqInterface_ResourceZ(), theEcorePackage.getEInt(), "resourceZ", "0", 0, 1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqInterface_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, EqInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEqInterface__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eqInterfaceGroupEClass, EqInterfaceGroup.class, "EqInterfaceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEqInterfaceGroup_EqInterfaces(), this.getEqInterface(), null, "eqInterfaces", null, 0, -1, EqInterfaceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqInterfaceGroup_WithoutEqInterfaces(), this.getEqInterface(), null, "withoutEqInterfaces", null, 0, -1, EqInterfaceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqInterfaceGroup_ImplicitMemberDefinitions(), this.getImplicitEqInterfaceMemberDefinition(), null, "implicitMemberDefinitions", null, 0, -1, EqInterfaceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqInterfaceGroup_WithoutImplicitMemberDefinitions(), this.getImplicitEqInterfaceMemberDefinition(), null, "withoutImplicitMemberDefinitions", null, 0, -1, EqInterfaceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEqInterfaceGroup__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEqInterfaceGroup__GetImplicitlyDefinedEqInterfaces(), this.getEqInterface(), "getImplicitlyDefinedEqInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEqInterfaceGroup__GetWithoutImplicitlyDefinedEqInterfaces(), this.getEqInterface(), "getWithoutImplicitlyDefinedEqInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(implicitEqInterfaceMemberDefinitionEClass, ImplicitEqInterfaceMemberDefinition.class, "ImplicitEqInterfaceMemberDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicitEqInterfaceMemberDefinition_Entries(), this.getImplicitEqInterfaceMemberDefinitionAttributesAndValues(), null, "entries", null, 1, -1, ImplicitEqInterfaceMemberDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImplicitEqInterfaceMemberDefinition__GetImplicitlyDefinedEqInterfaces(), this.getEqInterface(), "getImplicitlyDefinedEqInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(implicitEqInterfaceMemberDefinitionAttributesAndValuesEClass, ImplicitEqInterfaceMemberDefinitionAttributesAndValues.class, "ImplicitEqInterfaceMemberDefinitionAttributesAndValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Attribute(), this.getImplicitEqInterfaceMemberDefinitionAttribute(), "attribute", null, 0, 1, ImplicitEqInterfaceMemberDefinitionAttributesAndValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Value(), theEcorePackage.getEString(), "value", null, 0, 1, ImplicitEqInterfaceMemberDefinitionAttributesAndValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eqInterfaceGroupWithCombinedDefinitionEClass, EqInterfaceGroupWithCombinedDefinition.class, "EqInterfaceGroupWithCombinedDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEqInterfaceGroupWithCombinedDefinition_CombinedGroups(), this.getEqInterfaceGroup(), null, "combinedGroups", null, 1, -1, EqInterfaceGroupWithCombinedDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricParameterEClass, MetricParameter.class, "MetricParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricParameter_Name(), theEcorePackage.getEString(), "name", "", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricParameter_Value(), theEcorePackage.getEInt(), "value", "0", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dislocalityRelationEClass, DislocalityRelation.class, "DislocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDislocalityRelation_EqInterfaceOrGroups(), this.getEqInterfaceOrGroup(), null, "eqInterfaceOrGroups", null, 1, -1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDislocalityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDislocalityRelation__GetAllInterfaces(), this.getEqInterface(), "getAllInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDislocalityRelation__GetTotalInterfaceCount(), theEcorePackage.getEInt(), "getTotalInterfaceCount", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDislocalityRelation__GetAllEqInterfaceOrGroupNames(), theEcorePackage.getEString(), "getAllEqInterfaceOrGroupNames", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(colocalityRelationEClass, ColocalityRelation.class, "ColocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColocalityRelation_EqInterfaceOrGroups(), this.getEqInterfaceOrGroup(), null, "eqInterfaceOrGroups", null, 1, -1, ColocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColocalityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, ColocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getColocalityRelation__GetAllInterfaces(), this.getEqInterface(), "getAllInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getColocalityRelation__GetAllEqInterfaceOrGroupNames(), theEcorePackage.getEString(), "getAllEqInterfaceOrGroupNames", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(deploymentSpecificationEClass, DeploymentSpecification.class, "DeploymentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentSpecification_EqInterfaceOrGroups(), this.getEqInterfaceOrGroup(), null, "eqInterfaceOrGroups", null, 1, -1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSpecification_HardwareElements(), this.getHardwareElement(), null, "hardwareElements", null, 0, -1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSpecification_ImplicitHardwareElements(), this.getDeploymentImplicitDefinition(), null, "implicitHardwareElements", null, 0, -1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeploymentSpecification__GetAllEqInterfaceOrGroupNames(), theEcorePackage.getEString(), "getAllEqInterfaceOrGroupNames", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeploymentSpecification__GetImplicitlyDefinedConnectors(), this.getConnector(), "getImplicitlyDefinedConnectors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(deploymentImplicitDefinitionEClass, DeploymentImplicitDefinition.class, "DeploymentImplicitDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentImplicitDefinition_Entries(), this.getDeploymentImplicitDefinitionAttributeAndValue(), null, "entries", null, 1, -1, DeploymentImplicitDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeploymentImplicitDefinition__GetImplicitlyDefinedConnectors(), this.getConnector(), "getImplicitlyDefinedConnectors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(deploymentImplicitDefinitionAttributeAndValueEClass, DeploymentImplicitDefinitionAttributeAndValue.class, "DeploymentImplicitDefinitionAttributeAndValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentImplicitDefinitionAttributeAndValue_Attribute(), this.getDeploymentImplicitDefinitionAttribute(), "attribute", null, 0, 1, DeploymentImplicitDefinitionAttributeAndValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentImplicitDefinitionAttributeAndValue_Value(), theEcorePackage.getEString(), "value", null, 0, 1, DeploymentImplicitDefinitionAttributeAndValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validDeploymentEClass, ValidDeployment.class, "ValidDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invalidDeploymentEClass, InvalidDeployment.class, "InvalidDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(protectionLevelTypeEEnum, ProtectionLevelType.class, "ProtectionLevelType");
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.NONE);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L1);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L2);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L3);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L4);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L5);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L6);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L7);
		addEEnumLiteral(protectionLevelTypeEEnum, ProtectionLevelType.L8);

		initEEnum(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.class, "ImplicitEqInterfaceMemberDefinitionAttribute");
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.NAME);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.SYSTEM);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.SUBATA);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.RESOURCE);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.LINENAME);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.WIRINGLANE);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.GRPINFO);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.ROUTE);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.PWSUP1);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.EMHZONE1);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.IOTYPE);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.RESOURCE_X);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.RESOURCE_Y);
		addEEnumLiteral(implicitEqInterfaceMemberDefinitionAttributeEEnum, ImplicitEqInterfaceMemberDefinitionAttribute.RESOURCE_Z);

		initEEnum(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.class, "HardwareArchitectureLevelType");
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.CONNECTOR);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.RDC);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.COMPARTMENT);

		initEEnum(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.class, "DeploymentImplicitDefinitionAttribute");
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.COMPARTMENT_NAME);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.COMPARTMENT_MANUFACTURER);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.COMPARTMENT_POWERSUPPLY);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.COMPARTMENT_SIDE);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.COMPARTMENT_ZONE);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_NAME);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_MANUFACTURER);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_POWERSUPPLY);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_SIDE);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_TYPE);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_ESS);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_RESOURCE_X);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_RESOURCE_Y);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.RDC_RESOURCE_Z);
		addEEnumLiteral(deploymentImplicitDefinitionAttributeEEnum, DeploymentImplicitDefinitionAttribute.CONNECTOR_NAME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "GenModel", "http://www.eclipse.org/emf/2002/GenModel"
		   });
	}

} //ModelPackageImpl