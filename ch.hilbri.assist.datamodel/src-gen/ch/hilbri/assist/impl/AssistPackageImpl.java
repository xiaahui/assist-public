/**
 */
package ch.hilbri.assist.impl;

import ch.hilbri.assist.Application;
import ch.hilbri.assist.ApplicationGroup;
import ch.hilbri.assist.ApplicationOrApplicationGroup;
import ch.hilbri.assist.AssistFactory;
import ch.hilbri.assist.AssistModel;
import ch.hilbri.assist.AssistPackage;
import ch.hilbri.assist.Board;
import ch.hilbri.assist.BoardAttributes;
import ch.hilbri.assist.Box;
import ch.hilbri.assist.BoxAttributes;
import ch.hilbri.assist.CommunicationRelation;
import ch.hilbri.assist.Compartment;
import ch.hilbri.assist.CompartmentAttributes;
import ch.hilbri.assist.Core;
import ch.hilbri.assist.DesignAssuranceLevelType;
import ch.hilbri.assist.DislocalityRelation;
import ch.hilbri.assist.DissimilarityClause;
import ch.hilbri.assist.DissimilarityConjunction;
import ch.hilbri.assist.DissimilarityDisjunction;
import ch.hilbri.assist.DissimilarityEntry;
import ch.hilbri.assist.DissimilarityRelation;
import ch.hilbri.assist.HardwareArchitectureLevelType;
import ch.hilbri.assist.HardwareElement;
import ch.hilbri.assist.HardwareElementContainer;
import ch.hilbri.assist.IOAdapter;
import ch.hilbri.assist.IOAdapterProtectionLevelType;
import ch.hilbri.assist.IOAdapterRequirement;
import ch.hilbri.assist.IOAdapterType;
import ch.hilbri.assist.MetricParameter;
import ch.hilbri.assist.Network;
import ch.hilbri.assist.Processor;
import ch.hilbri.assist.ProcessorAttributes;
import ch.hilbri.assist.ProximityRelation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class AssistPackageImpl extends EPackageImpl implements AssistPackage {
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
	private EClass hardwareElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareElementContainerEClass = null;

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
	private EClass boxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationOrApplicationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioAdapterRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dissimilarityRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dissimilarityClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dissimilarityDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dissimilarityConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dissimilarityEntryEClass = null;

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
	private EClass proximityRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRelationEClass = null;

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
	private EEnum hardwareArchitectureLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioAdapterProtectionLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designAssuranceLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioAdapterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compartmentAttributesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boxAttributesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boardAttributesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorAttributesEEnum = null;

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
	 * @see ch.hilbri.assist.AssistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssistPackageImpl() {
		super(eNS_URI, AssistFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssistPackage init() {
		if (isInited) return (AssistPackage)EPackage.Registry.INSTANCE.getEPackage(AssistPackage.eNS_URI);

		// Obtain or create and register package
		AssistPackageImpl theAssistPackage = (AssistPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssistPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssistPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAssistPackage.createPackageContents();

		// Initialize created meta-data
		theAssistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssistPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssistPackage.eNS_URI, theAssistPackage);
		return theAssistPackage;
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
	public EReference getAssistModel_HardwareContainer() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_Networks() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_Applications() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_ApplicationGroups() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_DissimilarityRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_DislocalityRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_ProximityRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_CommunicationRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getHardwareElement_Level() {
		return (EAttribute)hardwareElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareElementContainer() {
		return hardwareElementContainerEClass;
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
	public EReference getCompartment_Boxes() {
		return (EReference)compartmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartment_MetricParameters() {
		return (EReference)compartmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBox() {
		return boxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBox_Manufacturer() {
		return (EAttribute)boxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBox_Compartment() {
		return (EReference)boxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBox_Boards() {
		return (EReference)boxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBox_MetricParameters() {
		return (EReference)boxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_Manufacturer() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_BoardType() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_PowerSupply() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_AssuranceLevel() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_RamCapacity() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_RomCapacity() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Box() {
		return (EReference)boardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Processors() {
		return (EReference)boardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_IoAdapters() {
		return (EReference)boardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_MetricParameters() {
		return (EReference)boardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Manufacturer() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_ProcessorType() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_Board() {
		return (EReference)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_Cores() {
		return (EReference)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_MetricParameters() {
		return (EReference)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCore() {
		return coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCore_Architecture() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCore_Capacity() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCore_Processor() {
		return (EReference)coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCore_MetricParameters() {
		return (EReference)coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOAdapter() {
		return ioAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapter_Name() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapter_TotalUnitCount() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapter_AdapterType() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapter_ProtectionLevel() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_BandwidthCapacity() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Boards() {
		return (EReference)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_MetricParameters() {
		return (EReference)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationOrApplicationGroup() {
		return applicationOrApplicationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationGroup() {
		return applicationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationGroup_Name() {
		return (EAttribute)applicationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationGroup_Applications() {
		return (EReference)applicationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_CoreUtilization() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_RamUtilization() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_RomUtilization() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_CriticalityLevel() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_IoAdapterProtectionLevel() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_ParallelThreads() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DevelopedBy() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_IoAdapterRequirements() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_RestrictMappingToHardwareElements() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Threads() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_MetricParameters() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Application() {
		return (EReference)threadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOAdapterRequirement() {
		return ioAdapterRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapterRequirement_AdapterType() {
		return (EAttribute)ioAdapterRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapterRequirement_RequiredUnits() {
		return (EAttribute)ioAdapterRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapterRequirement_IsSharedAllowed() {
		return (EAttribute)ioAdapterRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapterRequirement_IsExclusiveOnly() {
		return (EAttribute)ioAdapterRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDissimilarityRelation() {
		return dissimilarityRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDissimilarityRelation_ApplicationsOrGroups() {
		return (EReference)dissimilarityRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDissimilarityRelation_DissimilarityClause() {
		return (EReference)dissimilarityRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDissimilarityClause() {
		return dissimilarityClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDissimilarityDisjunction() {
		return dissimilarityDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDissimilarityDisjunction_DissimilarityClauses() {
		return (EReference)dissimilarityDisjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDissimilarityConjunction() {
		return dissimilarityConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDissimilarityConjunction_DissimilarityClauses() {
		return (EReference)dissimilarityConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDissimilarityEntry() {
		return dissimilarityEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDissimilarityEntry_Level() {
		return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDissimilarityEntry_CompartmentAttribute() {
		return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDissimilarityEntry_BoxAttribute() {
		return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDissimilarityEntry_BoardAttribute() {
		return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDissimilarityEntry_ProcessorAttribute() {
		return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(4);
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
	public EReference getDislocalityRelation_ApplicationsOrGroups() {
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
	public EClass getProximityRelation() {
		return proximityRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProximityRelation_ApplicationsOrGroups() {
		return (EReference)proximityRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProximityRelation_HardwareLevel() {
		return (EAttribute)proximityRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRelation() {
		return communicationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRelation_ApplicationsOrGroups() {
		return (EReference)communicationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationRelation_BandwidthUtilization() {
		return (EAttribute)communicationRelationEClass.getEStructuralFeatures().get(1);
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
	public EEnum getHardwareArchitectureLevelType() {
		return hardwareArchitectureLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIOAdapterProtectionLevelType() {
		return ioAdapterProtectionLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDesignAssuranceLevelType() {
		return designAssuranceLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIOAdapterType() {
		return ioAdapterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompartmentAttributes() {
		return compartmentAttributesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoxAttributes() {
		return boxAttributesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoardAttributes() {
		return boardAttributesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorAttributes() {
		return processorAttributesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistFactory getAssistFactory() {
		return (AssistFactory)getEFactoryInstance();
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
		createEReference(assistModelEClass, ASSIST_MODEL__HARDWARE_CONTAINER);
		createEReference(assistModelEClass, ASSIST_MODEL__NETWORKS);
		createEReference(assistModelEClass, ASSIST_MODEL__APPLICATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__APPLICATION_GROUPS);
		createEReference(assistModelEClass, ASSIST_MODEL__DISSIMILARITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__DISLOCALITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__PROXIMITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__COMMUNICATION_RELATIONS);

		hardwareElementEClass = createEClass(HARDWARE_ELEMENT);
		createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__NAME);
		createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__LEVEL);

		hardwareElementContainerEClass = createEClass(HARDWARE_ELEMENT_CONTAINER);

		compartmentEClass = createEClass(COMPARTMENT);
		createEAttribute(compartmentEClass, COMPARTMENT__MANUFACTURER);
		createEAttribute(compartmentEClass, COMPARTMENT__POWER_SUPPLY);
		createEAttribute(compartmentEClass, COMPARTMENT__SIDE);
		createEAttribute(compartmentEClass, COMPARTMENT__ZONE);
		createEReference(compartmentEClass, COMPARTMENT__BOXES);
		createEReference(compartmentEClass, COMPARTMENT__METRIC_PARAMETERS);

		boxEClass = createEClass(BOX);
		createEAttribute(boxEClass, BOX__MANUFACTURER);
		createEReference(boxEClass, BOX__COMPARTMENT);
		createEReference(boxEClass, BOX__BOARDS);
		createEReference(boxEClass, BOX__METRIC_PARAMETERS);

		boardEClass = createEClass(BOARD);
		createEAttribute(boardEClass, BOARD__MANUFACTURER);
		createEAttribute(boardEClass, BOARD__BOARD_TYPE);
		createEAttribute(boardEClass, BOARD__POWER_SUPPLY);
		createEAttribute(boardEClass, BOARD__ASSURANCE_LEVEL);
		createEAttribute(boardEClass, BOARD__RAM_CAPACITY);
		createEAttribute(boardEClass, BOARD__ROM_CAPACITY);
		createEReference(boardEClass, BOARD__BOX);
		createEReference(boardEClass, BOARD__PROCESSORS);
		createEReference(boardEClass, BOARD__IO_ADAPTERS);
		createEReference(boardEClass, BOARD__METRIC_PARAMETERS);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__MANUFACTURER);
		createEAttribute(processorEClass, PROCESSOR__PROCESSOR_TYPE);
		createEReference(processorEClass, PROCESSOR__BOARD);
		createEReference(processorEClass, PROCESSOR__CORES);
		createEReference(processorEClass, PROCESSOR__METRIC_PARAMETERS);

		coreEClass = createEClass(CORE);
		createEAttribute(coreEClass, CORE__ARCHITECTURE);
		createEAttribute(coreEClass, CORE__CAPACITY);
		createEReference(coreEClass, CORE__PROCESSOR);
		createEReference(coreEClass, CORE__METRIC_PARAMETERS);

		ioAdapterEClass = createEClass(IO_ADAPTER);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__NAME);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__TOTAL_UNIT_COUNT);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__ADAPTER_TYPE);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__PROTECTION_LEVEL);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEAttribute(networkEClass, NETWORK__BANDWIDTH_CAPACITY);
		createEReference(networkEClass, NETWORK__BOARDS);
		createEReference(networkEClass, NETWORK__METRIC_PARAMETERS);

		applicationOrApplicationGroupEClass = createEClass(APPLICATION_OR_APPLICATION_GROUP);

		applicationGroupEClass = createEClass(APPLICATION_GROUP);
		createEAttribute(applicationGroupEClass, APPLICATION_GROUP__NAME);
		createEReference(applicationGroupEClass, APPLICATION_GROUP__APPLICATIONS);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__CORE_UTILIZATION);
		createEAttribute(applicationEClass, APPLICATION__RAM_UTILIZATION);
		createEAttribute(applicationEClass, APPLICATION__ROM_UTILIZATION);
		createEAttribute(applicationEClass, APPLICATION__CRITICALITY_LEVEL);
		createEAttribute(applicationEClass, APPLICATION__IO_ADAPTER_PROTECTION_LEVEL);
		createEAttribute(applicationEClass, APPLICATION__PARALLEL_THREADS);
		createEAttribute(applicationEClass, APPLICATION__DEVELOPED_BY);
		createEReference(applicationEClass, APPLICATION__IO_ADAPTER_REQUIREMENTS);
		createEReference(applicationEClass, APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
		createEReference(applicationEClass, APPLICATION__THREADS);
		createEReference(applicationEClass, APPLICATION__METRIC_PARAMETERS);

		threadEClass = createEClass(THREAD);
		createEReference(threadEClass, THREAD__APPLICATION);

		ioAdapterRequirementEClass = createEClass(IO_ADAPTER_REQUIREMENT);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY);

		dissimilarityRelationEClass = createEClass(DISSIMILARITY_RELATION);
		createEReference(dissimilarityRelationEClass, DISSIMILARITY_RELATION__APPLICATIONS_OR_GROUPS);
		createEReference(dissimilarityRelationEClass, DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE);

		dissimilarityClauseEClass = createEClass(DISSIMILARITY_CLAUSE);

		dissimilarityDisjunctionEClass = createEClass(DISSIMILARITY_DISJUNCTION);
		createEReference(dissimilarityDisjunctionEClass, DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES);

		dissimilarityConjunctionEClass = createEClass(DISSIMILARITY_CONJUNCTION);
		createEReference(dissimilarityConjunctionEClass, DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES);

		dissimilarityEntryEClass = createEClass(DISSIMILARITY_ENTRY);
		createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__LEVEL);
		createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE);
		createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__BOX_ATTRIBUTE);
		createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE);
		createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE);

		dislocalityRelationEClass = createEClass(DISLOCALITY_RELATION);
		createEReference(dislocalityRelationEClass, DISLOCALITY_RELATION__APPLICATIONS_OR_GROUPS);
		createEAttribute(dislocalityRelationEClass, DISLOCALITY_RELATION__HARDWARE_LEVEL);

		proximityRelationEClass = createEClass(PROXIMITY_RELATION);
		createEReference(proximityRelationEClass, PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS);
		createEAttribute(proximityRelationEClass, PROXIMITY_RELATION__HARDWARE_LEVEL);

		communicationRelationEClass = createEClass(COMMUNICATION_RELATION);
		createEReference(communicationRelationEClass, COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS);
		createEAttribute(communicationRelationEClass, COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION);

		metricParameterEClass = createEClass(METRIC_PARAMETER);
		createEAttribute(metricParameterEClass, METRIC_PARAMETER__NAME);
		createEAttribute(metricParameterEClass, METRIC_PARAMETER__VALUE);

		// Create enums
		hardwareArchitectureLevelTypeEEnum = createEEnum(HARDWARE_ARCHITECTURE_LEVEL_TYPE);
		ioAdapterProtectionLevelTypeEEnum = createEEnum(IO_ADAPTER_PROTECTION_LEVEL_TYPE);
		designAssuranceLevelTypeEEnum = createEEnum(DESIGN_ASSURANCE_LEVEL_TYPE);
		ioAdapterTypeEEnum = createEEnum(IO_ADAPTER_TYPE);
		compartmentAttributesEEnum = createEEnum(COMPARTMENT_ATTRIBUTES);
		boxAttributesEEnum = createEEnum(BOX_ATTRIBUTES);
		boardAttributesEEnum = createEEnum(BOARD_ATTRIBUTES);
		processorAttributesEEnum = createEEnum(PROCESSOR_ATTRIBUTES);
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
		hardwareElementContainerEClass.getESuperTypes().add(this.getHardwareElement());
		compartmentEClass.getESuperTypes().add(this.getHardwareElementContainer());
		boxEClass.getESuperTypes().add(this.getHardwareElementContainer());
		boardEClass.getESuperTypes().add(this.getHardwareElementContainer());
		processorEClass.getESuperTypes().add(this.getHardwareElement());
		coreEClass.getESuperTypes().add(this.getHardwareElement());
		applicationGroupEClass.getESuperTypes().add(this.getApplicationOrApplicationGroup());
		applicationEClass.getESuperTypes().add(this.getApplicationOrApplicationGroup());
		dissimilarityDisjunctionEClass.getESuperTypes().add(this.getDissimilarityClause());
		dissimilarityConjunctionEClass.getESuperTypes().add(this.getDissimilarityClause());
		dissimilarityEntryEClass.getESuperTypes().add(this.getDissimilarityClause());

		// Initialize classes, features, and operations; add parameters
		initEClass(assistModelEClass, AssistModel.class, "AssistModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssistModel_SystemName(), theEcorePackage.getEString(), "systemName", null, 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_HardwareContainer(), this.getHardwareElementContainer(), null, "hardwareContainer", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_Networks(), this.getNetwork(), null, "networks", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_Applications(), this.getApplication(), null, "applications", null, 1, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_ApplicationGroups(), this.getApplicationGroup(), null, "applicationGroups", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_DissimilarityRelations(), this.getDissimilarityRelation(), null, "dissimilarityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_DislocalityRelations(), this.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_ProximityRelations(), this.getProximityRelation(), null, "proximityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_CommunicationRelations(), this.getCommunicationRelation(), null, "communicationRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareElementEClass, HardwareElement.class, "HardwareElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareElement_Level(), this.getHardwareArchitectureLevelType(), "level", null, 0, 1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareElementContainerEClass, HardwareElementContainer.class, "HardwareElementContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compartmentEClass, Compartment.class, "Compartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompartment_Manufacturer(), theEcorePackage.getEString(), "manufacturer", null, 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_PowerSupply(), theEcorePackage.getEString(), "powerSupply", null, 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_Side(), theEcorePackage.getEString(), "side", null, 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_Zone(), theEcorePackage.getEString(), "zone", null, 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartment_Boxes(), this.getBox(), this.getBox_Compartment(), "boxes", null, 1, -1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartment_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBox_Manufacturer(), theEcorePackage.getEString(), "manufacturer", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBox_Compartment(), this.getCompartment(), this.getCompartment_Boxes(), "compartment", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBox_Boards(), this.getBoard(), this.getBoard_Box(), "boards", null, 1, -1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBox_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoard_Manufacturer(), theEcorePackage.getEString(), "manufacturer", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_BoardType(), theEcorePackage.getEString(), "boardType", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_PowerSupply(), theEcorePackage.getEString(), "powerSupply", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_AssuranceLevel(), this.getDesignAssuranceLevelType(), "assuranceLevel", "None", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_RamCapacity(), theEcorePackage.getEInt(), "ramCapacity", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_RomCapacity(), theEcorePackage.getEInt(), "romCapacity", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Box(), this.getBox(), this.getBox_Boards(), "box", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Processors(), this.getProcessor(), this.getProcessor_Board(), "processors", null, 1, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_IoAdapters(), this.getIOAdapter(), null, "ioAdapters", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Manufacturer(), theEcorePackage.getEString(), "manufacturer", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_ProcessorType(), theEcorePackage.getEString(), "processorType", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Board(), this.getBoard(), this.getBoard_Processors(), "board", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Cores(), this.getCore(), this.getCore_Processor(), "cores", null, 1, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCore_Architecture(), theEcorePackage.getEString(), "architecture", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCore_Capacity(), theEcorePackage.getEInt(), "capacity", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCore_Processor(), this.getProcessor(), this.getProcessor_Cores(), "processor", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCore_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioAdapterEClass, IOAdapter.class, "IOAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOAdapter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_TotalUnitCount(), theEcorePackage.getEInt(), "totalUnitCount", null, 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_AdapterType(), this.getIOAdapterType(), "adapterType", null, 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_ProtectionLevel(), this.getIOAdapterProtectionLevelType(), "protectionLevel", "None", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_BandwidthCapacity(), theEcorePackage.getEInt(), "bandwidthCapacity", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Boards(), this.getBoard(), null, "boards", null, 2, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationOrApplicationGroupEClass, ApplicationOrApplicationGroup.class, "ApplicationOrApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationGroupEClass, ApplicationGroup.class, "ApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationGroup_Applications(), this.getApplication(), null, "applications", null, 2, -1, ApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_CoreUtilization(), theEcorePackage.getEInt(), "coreUtilization", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_RamUtilization(), theEcorePackage.getEInt(), "ramUtilization", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_RomUtilization(), theEcorePackage.getEInt(), "romUtilization", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_CriticalityLevel(), this.getDesignAssuranceLevelType(), "criticalityLevel", "None", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_IoAdapterProtectionLevel(), this.getIOAdapterProtectionLevelType(), "ioAdapterProtectionLevel", "None", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_ParallelThreads(), theEcorePackage.getEInt(), "parallelThreads", "1", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_DevelopedBy(), theEcorePackage.getEString(), "developedBy", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_IoAdapterRequirements(), this.getIOAdapterRequirement(), null, "ioAdapterRequirements", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_RestrictMappingToHardwareElements(), this.getHardwareElement(), null, "restrictMappingToHardwareElements", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Threads(), this.getThread(), this.getThread_Application(), "threads", null, 1, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadEClass, ch.hilbri.assist.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThread_Application(), this.getApplication(), this.getApplication_Threads(), "application", null, 0, 1, ch.hilbri.assist.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioAdapterRequirementEClass, IOAdapterRequirement.class, "IOAdapterRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOAdapterRequirement_AdapterType(), this.getIOAdapterType(), "adapterType", null, 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapterRequirement_RequiredUnits(), theEcorePackage.getEInt(), "requiredUnits", "0", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapterRequirement_IsSharedAllowed(), theEcorePackage.getEBoolean(), "isSharedAllowed", "false", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapterRequirement_IsExclusiveOnly(), theEcorePackage.getEBoolean(), "isExclusiveOnly", "false", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dissimilarityRelationEClass, DissimilarityRelation.class, "DissimilarityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDissimilarityRelation_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, DissimilarityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDissimilarityRelation_DissimilarityClause(), this.getDissimilarityClause(), null, "dissimilarityClause", null, 1, 1, DissimilarityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dissimilarityClauseEClass, DissimilarityClause.class, "DissimilarityClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dissimilarityDisjunctionEClass, DissimilarityDisjunction.class, "DissimilarityDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDissimilarityDisjunction_DissimilarityClauses(), this.getDissimilarityClause(), null, "dissimilarityClauses", null, 2, -1, DissimilarityDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dissimilarityConjunctionEClass, DissimilarityConjunction.class, "DissimilarityConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDissimilarityConjunction_DissimilarityClauses(), this.getDissimilarityClause(), null, "dissimilarityClauses", null, 2, -1, DissimilarityConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dissimilarityEntryEClass, DissimilarityEntry.class, "DissimilarityEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDissimilarityEntry_Level(), this.getHardwareArchitectureLevelType(), "level", null, 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_CompartmentAttribute(), this.getCompartmentAttributes(), "compartmentAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_BoxAttribute(), this.getBoxAttributes(), "boxAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_BoardAttribute(), this.getBoardAttributes(), "boardAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_ProcessorAttribute(), this.getProcessorAttributes(), "processorAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dislocalityRelationEClass, DislocalityRelation.class, "DislocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDislocalityRelation_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDislocalityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proximityRelationEClass, ProximityRelation.class, "ProximityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProximityRelation_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, ProximityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProximityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, ProximityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationRelationEClass, CommunicationRelation.class, "CommunicationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationRelation_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, CommunicationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationRelation_BandwidthUtilization(), theEcorePackage.getEInt(), "bandwidthUtilization", null, 0, 1, CommunicationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricParameterEClass, MetricParameter.class, "MetricParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricParameter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricParameter_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.class, "HardwareArchitectureLevelType");
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.CORE);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.PROCESSOR);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.BOARD);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.BOX);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.COMPARTMENT);

		initEEnum(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.class, "IOAdapterProtectionLevelType");
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.NONE);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_1);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_2);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_3);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_4);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_5);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_6);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_7);
		addEEnumLiteral(ioAdapterProtectionLevelTypeEEnum, IOAdapterProtectionLevelType.LEVEL_8);

		initEEnum(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.class, "DesignAssuranceLevelType");
		addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.NONE);
		addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.QS);
		addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.D);
		addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.C);
		addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.B);
		addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.A);

		initEEnum(ioAdapterTypeEEnum, IOAdapterType.class, "IOAdapterType");
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CAN);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.ELB);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.ETH);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.ANALOG);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.DIGITAL);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.SERIAL);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM0);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM1);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM2);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM3);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM4);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM5);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM6);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM7);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM8);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM9);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM10);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM11);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM12);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM13);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM14);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM15);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM16);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM17);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM18);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM19);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM20);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM21);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM22);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM23);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM24);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM25);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM26);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM27);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM28);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM29);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM30);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM31);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM32);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM33);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM34);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM35);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM36);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM37);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM38);
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.CUSTOM39);

		initEEnum(compartmentAttributesEEnum, CompartmentAttributes.class, "CompartmentAttributes");
		addEEnumLiteral(compartmentAttributesEEnum, CompartmentAttributes.NONE);
		addEEnumLiteral(compartmentAttributesEEnum, CompartmentAttributes.MANUFACTURER);
		addEEnumLiteral(compartmentAttributesEEnum, CompartmentAttributes.POWERSUPPLY);
		addEEnumLiteral(compartmentAttributesEEnum, CompartmentAttributes.SIDE);
		addEEnumLiteral(compartmentAttributesEEnum, CompartmentAttributes.ZONE);

		initEEnum(boxAttributesEEnum, BoxAttributes.class, "BoxAttributes");
		addEEnumLiteral(boxAttributesEEnum, BoxAttributes.NONE);
		addEEnumLiteral(boxAttributesEEnum, BoxAttributes.MANUFACTURER);

		initEEnum(boardAttributesEEnum, BoardAttributes.class, "BoardAttributes");
		addEEnumLiteral(boardAttributesEEnum, BoardAttributes.NONE);
		addEEnumLiteral(boardAttributesEEnum, BoardAttributes.MANUFACTURER);
		addEEnumLiteral(boardAttributesEEnum, BoardAttributes.POWERSUPPLY);
		addEEnumLiteral(boardAttributesEEnum, BoardAttributes.ASSURANCELEVEL);
		addEEnumLiteral(boardAttributesEEnum, BoardAttributes.BOARDTYPE);

		initEEnum(processorAttributesEEnum, ProcessorAttributes.class, "ProcessorAttributes");
		addEEnumLiteral(processorAttributesEEnum, ProcessorAttributes.NONE);
		addEEnumLiteral(processorAttributesEEnum, ProcessorAttributes.MANUFACTURER);
		addEEnumLiteral(processorAttributesEEnum, ProcessorAttributes.PROCESSORTYPE);

		// Create resource
		createResource(eNS_URI);
	}

} //AssistPackageImpl
