/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.ApplicationGroup;
import ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Board;
import ch.hilbri.assist.mapping.model.BoardAttributes;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.BoxAttributes;
import ch.hilbri.assist.mapping.model.CommunicationRelation;
import ch.hilbri.assist.mapping.model.Compartment;
import ch.hilbri.assist.mapping.model.CompartmentAttributes;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.DesignAssuranceLevelType;
import ch.hilbri.assist.mapping.model.DislocalityRelation;
import ch.hilbri.assist.mapping.model.DissimilarityClause;
import ch.hilbri.assist.mapping.model.DissimilarityConjunction;
import ch.hilbri.assist.mapping.model.DissimilarityDisjunction;
import ch.hilbri.assist.mapping.model.DissimilarityEntry;
import ch.hilbri.assist.mapping.model.DissimilarityRelation;
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.model.HardwareElement;
import ch.hilbri.assist.mapping.model.HardwareElementContainer;
import ch.hilbri.assist.mapping.model.IOAdapter;
import ch.hilbri.assist.mapping.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.mapping.model.IOAdapterRequirement;
import ch.hilbri.assist.mapping.model.IOAdapterType;
import ch.hilbri.assist.mapping.model.MetricParameter;
import ch.hilbri.assist.mapping.model.ModelFactory;
import ch.hilbri.assist.mapping.model.ModelPackage;
import ch.hilbri.assist.mapping.model.Network;
import ch.hilbri.assist.mapping.model.Processor;
import ch.hilbri.assist.mapping.model.ProcessorAttributes;
import ch.hilbri.assist.mapping.model.ProximityRelation;
import ch.hilbri.assist.mapping.model.ReferencePointType;
import ch.hilbri.assist.mapping.model.SchedulingRelation;

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
	private EClass schedulingRelationEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referencePointTypeEEnum = null;

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
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#eNS_URI
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
	public EAttribute getAssistModel_ChangeDelay() {
		return (EAttribute)assistModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_HardwareContainer() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_Networks() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_Applications() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_ApplicationGroups() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_DissimilarityRelations() {
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
	public EReference getAssistModel_ProximityRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_CommunicationRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModel_SchedulingRelations() {
		return (EReference)assistModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModel_TopHardwareLevel() {
		return (EAttribute)assistModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModel_BottomHardwareLevel() {
		return (EAttribute)assistModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModel_HardwareLevelCount() {
		return (EAttribute)assistModelEClass.getEStructuralFeatures().get(13);
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
	public EOperation getAssistModel__GetAllBoxes() {
		return assistModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllBoards() {
		return assistModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllProcessors() {
		return assistModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllCores() {
		return assistModelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllHardwareElements__HardwareArchitectureLevelType() {
		return assistModelEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllHardwareElements__int() {
		return assistModelEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllThreads() {
		return assistModelEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModel__GetAllDislocalityRelations__Application() {
		return assistModelEClass.getEOperations().get(8);
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
	public EOperation getCompartment__GetAllBoards() {
		return compartmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAllProcessors() {
		return compartmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAllCores() {
		return compartmentEClass.getEOperations().get(2);
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
	public EOperation getBox__GetAllProcessors() {
		return boxEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBox__GetAllCores() {
		return boxEClass.getEOperations().get(1);
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
	public EAttribute getBoard_Side() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_Ess() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_AssuranceLevel() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_RamCapacity() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_RomCapacity() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Box() {
		return (EReference)boardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Processors() {
		return (EReference)boardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_IoAdapters() {
		return (EReference)boardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__ToString() {
		return boardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__GetAllCores() {
		return boardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__GetSuitableAdapterCount__IOAdapterType_IOAdapterProtectionLevelType() {
		return boardEClass.getEOperations().get(2);
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
	public EAttribute getIOAdapter_TotalCount() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapter_SharedUnitCount() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapter_AdapterType() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOAdapter_ProtectionLevel() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getNetwork_IsBoardLocal() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getApplicationOrApplicationGroup_Name() {
		return (EAttribute)applicationOrApplicationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationOrApplicationGroup__ToString() {
		return applicationOrApplicationGroupEClass.getEOperations().get(0);
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
	public EReference getApplicationGroup_ApplicationsOrGroups() {
		return (EReference)applicationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationGroup__GetAllApplications() {
		return applicationGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationGroup__GetAllThreads() {
		return applicationGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationGroup__ToString() {
		return applicationGroupEClass.getEOperations().get(2);
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
	public EAttribute getApplication_CoreUtilization() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_RamUtilization() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_RomUtilization() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_CriticalityLevel() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_IoAdapterProtectionLevel() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_ParallelThreads() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DevelopedBy() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_IoAdapterRequirements() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_RestrictMappingToHardwareElements() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Threads() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_MetricParameters() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ToString() {
		return applicationEClass.getEOperations().get(0);
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
	public EAttribute getThread_Name() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_CoreUtilization() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Application() {
		return (EReference)threadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_Duration() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_Period() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_EarlyTolerance() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_LateTolerance() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_LatestStartTime() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_LatestEndTime() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_InitTime() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_MaxSlices() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_MinSliceDuration() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Location() {
		return (EReference)threadEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThread__GetExclusiveAdapterRequestCount__IOAdapterType_IOAdapterProtectionLevelType() {
		return threadEClass.getEOperations().get(0);
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
	public EAttribute getIOAdapterRequirement_RequiredAdapterCount() {
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
	public EOperation getDislocalityRelation__GetApplicationCount() {
		return dislocalityRelationEClass.getEOperations().get(0);
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
	public EOperation getCommunicationRelation__GetAllThreads() {
		return communicationRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingRelation() {
		return schedulingRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingRelation_RefBefore() {
		return (EAttribute)schedulingRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingRelation_RefAfter() {
		return (EAttribute)schedulingRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingRelation_ThreadBefore() {
		return (EReference)schedulingRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingRelation_ThreadAfter() {
		return (EReference)schedulingRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingRelation_Delay() {
		return (EAttribute)schedulingRelationEClass.getEStructuralFeatures().get(4);
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
	public EEnum getReferencePointType() {
		return referencePointTypeEEnum;
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
		createEAttribute(assistModelEClass, ASSIST_MODEL__CHANGE_DELAY);
		createEReference(assistModelEClass, ASSIST_MODEL__HARDWARE_CONTAINER);
		createEReference(assistModelEClass, ASSIST_MODEL__NETWORKS);
		createEReference(assistModelEClass, ASSIST_MODEL__APPLICATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__APPLICATION_GROUPS);
		createEReference(assistModelEClass, ASSIST_MODEL__DISSIMILARITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__DISLOCALITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__PROXIMITY_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__COMMUNICATION_RELATIONS);
		createEReference(assistModelEClass, ASSIST_MODEL__SCHEDULING_RELATIONS);
		createEAttribute(assistModelEClass, ASSIST_MODEL__TOP_HARDWARE_LEVEL);
		createEAttribute(assistModelEClass, ASSIST_MODEL__BOTTOM_HARDWARE_LEVEL);
		createEAttribute(assistModelEClass, ASSIST_MODEL__HARDWARE_LEVEL_COUNT);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_COMPARTMENTS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_BOXES);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_BOARDS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_PROCESSORS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_CORES);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__HARDWAREARCHITECTURELEVELTYPE);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_THREADS);
		createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_DISLOCALITY_RELATIONS__APPLICATION);

		hardwareElementEClass = createEClass(HARDWARE_ELEMENT);
		createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__NAME);
		createEReference(hardwareElementEClass, HARDWARE_ELEMENT__METRIC_PARAMETERS);

		hardwareElementContainerEClass = createEClass(HARDWARE_ELEMENT_CONTAINER);

		compartmentEClass = createEClass(COMPARTMENT);
		createEAttribute(compartmentEClass, COMPARTMENT__MANUFACTURER);
		createEAttribute(compartmentEClass, COMPARTMENT__POWER_SUPPLY);
		createEAttribute(compartmentEClass, COMPARTMENT__SIDE);
		createEAttribute(compartmentEClass, COMPARTMENT__ZONE);
		createEReference(compartmentEClass, COMPARTMENT__BOXES);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_BOARDS);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_PROCESSORS);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_CORES);

		boxEClass = createEClass(BOX);
		createEAttribute(boxEClass, BOX__MANUFACTURER);
		createEReference(boxEClass, BOX__COMPARTMENT);
		createEReference(boxEClass, BOX__BOARDS);
		createEOperation(boxEClass, BOX___GET_ALL_PROCESSORS);
		createEOperation(boxEClass, BOX___GET_ALL_CORES);

		boardEClass = createEClass(BOARD);
		createEAttribute(boardEClass, BOARD__MANUFACTURER);
		createEAttribute(boardEClass, BOARD__BOARD_TYPE);
		createEAttribute(boardEClass, BOARD__POWER_SUPPLY);
		createEAttribute(boardEClass, BOARD__SIDE);
		createEAttribute(boardEClass, BOARD__ESS);
		createEAttribute(boardEClass, BOARD__ASSURANCE_LEVEL);
		createEAttribute(boardEClass, BOARD__RAM_CAPACITY);
		createEAttribute(boardEClass, BOARD__ROM_CAPACITY);
		createEReference(boardEClass, BOARD__BOX);
		createEReference(boardEClass, BOARD__PROCESSORS);
		createEReference(boardEClass, BOARD__IO_ADAPTERS);
		createEOperation(boardEClass, BOARD___TO_STRING);
		createEOperation(boardEClass, BOARD___GET_ALL_CORES);
		createEOperation(boardEClass, BOARD___GET_SUITABLE_ADAPTER_COUNT__IOADAPTERTYPE_IOADAPTERPROTECTIONLEVELTYPE);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__MANUFACTURER);
		createEAttribute(processorEClass, PROCESSOR__PROCESSOR_TYPE);
		createEReference(processorEClass, PROCESSOR__BOARD);
		createEReference(processorEClass, PROCESSOR__CORES);

		coreEClass = createEClass(CORE);
		createEAttribute(coreEClass, CORE__ARCHITECTURE);
		createEAttribute(coreEClass, CORE__CAPACITY);
		createEReference(coreEClass, CORE__PROCESSOR);

		ioAdapterEClass = createEClass(IO_ADAPTER);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__NAME);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__TOTAL_COUNT);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__SHARED_UNIT_COUNT);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__ADAPTER_TYPE);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__PROTECTION_LEVEL);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEAttribute(networkEClass, NETWORK__BANDWIDTH_CAPACITY);
		createEReference(networkEClass, NETWORK__BOARDS);
		createEReference(networkEClass, NETWORK__METRIC_PARAMETERS);
		createEAttribute(networkEClass, NETWORK__IS_BOARD_LOCAL);

		applicationOrApplicationGroupEClass = createEClass(APPLICATION_OR_APPLICATION_GROUP);
		createEAttribute(applicationOrApplicationGroupEClass, APPLICATION_OR_APPLICATION_GROUP__NAME);
		createEOperation(applicationOrApplicationGroupEClass, APPLICATION_OR_APPLICATION_GROUP___TO_STRING);

		applicationGroupEClass = createEClass(APPLICATION_GROUP);
		createEReference(applicationGroupEClass, APPLICATION_GROUP__APPLICATIONS_OR_GROUPS);
		createEOperation(applicationGroupEClass, APPLICATION_GROUP___GET_ALL_APPLICATIONS);
		createEOperation(applicationGroupEClass, APPLICATION_GROUP___GET_ALL_THREADS);
		createEOperation(applicationGroupEClass, APPLICATION_GROUP___TO_STRING);

		applicationEClass = createEClass(APPLICATION);
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
		createEOperation(applicationEClass, APPLICATION___TO_STRING);

		threadEClass = createEClass(THREAD);
		createEAttribute(threadEClass, THREAD__NAME);
		createEAttribute(threadEClass, THREAD__CORE_UTILIZATION);
		createEReference(threadEClass, THREAD__APPLICATION);
		createEAttribute(threadEClass, THREAD__DURATION);
		createEAttribute(threadEClass, THREAD__PERIOD);
		createEAttribute(threadEClass, THREAD__EARLY_TOLERANCE);
		createEAttribute(threadEClass, THREAD__LATE_TOLERANCE);
		createEAttribute(threadEClass, THREAD__LATEST_START_TIME);
		createEAttribute(threadEClass, THREAD__LATEST_END_TIME);
		createEAttribute(threadEClass, THREAD__INIT_TIME);
		createEAttribute(threadEClass, THREAD__MAX_SLICES);
		createEAttribute(threadEClass, THREAD__MIN_SLICE_DURATION);
		createEReference(threadEClass, THREAD__LOCATION);
		createEOperation(threadEClass, THREAD___GET_EXCLUSIVE_ADAPTER_REQUEST_COUNT__IOADAPTERTYPE_IOADAPTERPROTECTIONLEVELTYPE);

		ioAdapterRequirementEClass = createEClass(IO_ADAPTER_REQUIREMENT);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT);
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
		createEOperation(dislocalityRelationEClass, DISLOCALITY_RELATION___GET_APPLICATION_COUNT);

		proximityRelationEClass = createEClass(PROXIMITY_RELATION);
		createEReference(proximityRelationEClass, PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS);
		createEAttribute(proximityRelationEClass, PROXIMITY_RELATION__HARDWARE_LEVEL);

		communicationRelationEClass = createEClass(COMMUNICATION_RELATION);
		createEReference(communicationRelationEClass, COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS);
		createEAttribute(communicationRelationEClass, COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION);
		createEOperation(communicationRelationEClass, COMMUNICATION_RELATION___GET_ALL_THREADS);

		schedulingRelationEClass = createEClass(SCHEDULING_RELATION);
		createEAttribute(schedulingRelationEClass, SCHEDULING_RELATION__REF_BEFORE);
		createEAttribute(schedulingRelationEClass, SCHEDULING_RELATION__REF_AFTER);
		createEReference(schedulingRelationEClass, SCHEDULING_RELATION__THREAD_BEFORE);
		createEReference(schedulingRelationEClass, SCHEDULING_RELATION__THREAD_AFTER);
		createEAttribute(schedulingRelationEClass, SCHEDULING_RELATION__DELAY);

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
		referencePointTypeEEnum = createEEnum(REFERENCE_POINT_TYPE);
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
		initEAttribute(getAssistModel_SystemName(), theEcorePackage.getEString(), "systemName", "", 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssistModel_ChangeDelay(), theEcorePackage.getEInt(), "changeDelay", "0", 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_HardwareContainer(), this.getHardwareElementContainer(), null, "hardwareContainer", null, 1, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_Networks(), this.getNetwork(), null, "networks", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_Applications(), this.getApplication(), null, "applications", null, 1, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_ApplicationGroups(), this.getApplicationGroup(), null, "applicationGroups", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_DissimilarityRelations(), this.getDissimilarityRelation(), null, "dissimilarityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_DislocalityRelations(), this.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_ProximityRelations(), this.getProximityRelation(), null, "proximityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_CommunicationRelations(), this.getCommunicationRelation(), null, "communicationRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModel_SchedulingRelations(), this.getSchedulingRelation(), null, "schedulingRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssistModel_TopHardwareLevel(), this.getHardwareArchitectureLevelType(), "topHardwareLevel", null, 0, 1, AssistModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssistModel_BottomHardwareLevel(), this.getHardwareArchitectureLevelType(), "bottomHardwareLevel", null, 0, 1, AssistModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssistModel_HardwareLevelCount(), theEcorePackage.getEInt(), "hardwareLevelCount", null, 0, 1, AssistModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getAssistModel__GetAllCompartments(), this.getCompartment(), "getAllCompartments", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModel__GetAllBoxes(), this.getBox(), "getAllBoxes", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModel__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModel__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModel__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAssistModel__GetAllHardwareElements__HardwareArchitectureLevelType(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHardwareArchitectureLevelType(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssistModel__GetAllHardwareElements__int(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModel__GetAllThreads(), this.getThread(), "getAllThreads", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssistModel__GetAllDislocalityRelations__Application(), this.getDislocalityRelation(), "getAllDislocalityRelations", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getApplication(), "app", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(hardwareElementEClass, HardwareElement.class, "HardwareElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareElement_Name(), theEcorePackage.getEString(), "name", "", 0, 1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareElement_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareElementContainerEClass, HardwareElementContainer.class, "HardwareElementContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compartmentEClass, Compartment.class, "Compartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompartment_Manufacturer(), theEcorePackage.getEString(), "manufacturer", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_PowerSupply(), theEcorePackage.getEString(), "powerSupply", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_Side(), theEcorePackage.getEString(), "side", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_Zone(), theEcorePackage.getEString(), "zone", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartment_Boxes(), this.getBox(), this.getBox_Compartment(), "boxes", null, 1, -1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompartment__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompartment__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompartment__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBox_Manufacturer(), theEcorePackage.getEString(), "manufacturer", "", 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBox_Compartment(), this.getCompartment(), this.getCompartment_Boxes(), "compartment", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBox_Boards(), this.getBoard(), this.getBoard_Box(), "boards", null, 1, -1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBox__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBox__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoard_Manufacturer(), theEcorePackage.getEString(), "manufacturer", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_BoardType(), theEcorePackage.getEString(), "boardType", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_PowerSupply(), theEcorePackage.getEString(), "powerSupply", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_Side(), theEcorePackage.getEString(), "side", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_Ess(), theEcorePackage.getEString(), "ess", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_AssuranceLevel(), this.getDesignAssuranceLevelType(), "assuranceLevel", "None", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_RamCapacity(), theEcorePackage.getEInt(), "ramCapacity", "0", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_RomCapacity(), theEcorePackage.getEInt(), "romCapacity", "0", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Box(), this.getBox(), this.getBox_Boards(), "box", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Processors(), this.getProcessor(), this.getProcessor_Board(), "processors", null, 1, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_IoAdapters(), this.getIOAdapter(), null, "ioAdapters", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBoard__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBoard__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBoard__GetSuitableAdapterCount__IOAdapterType_IOAdapterProtectionLevelType(), theEcorePackage.getEInt(), "getSuitableAdapterCount", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOAdapterType(), "paramAdapterType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOAdapterProtectionLevelType(), "paramMinProtectionLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Manufacturer(), theEcorePackage.getEString(), "manufacturer", "", 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_ProcessorType(), theEcorePackage.getEString(), "processorType", "", 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Board(), this.getBoard(), this.getBoard_Processors(), "board", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Cores(), this.getCore(), this.getCore_Processor(), "cores", null, 1, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCore_Architecture(), theEcorePackage.getEString(), "architecture", "", 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCore_Capacity(), theEcorePackage.getEInt(), "capacity", "0", 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCore_Processor(), this.getProcessor(), this.getProcessor_Cores(), "processor", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioAdapterEClass, IOAdapter.class, "IOAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOAdapter_Name(), theEcorePackage.getEString(), "name", "", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_TotalCount(), theEcorePackage.getEInt(), "totalCount", "0", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_SharedUnitCount(), theEcorePackage.getEInt(), "sharedUnitCount", "0", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_AdapterType(), this.getIOAdapterType(), "adapterType", "None", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_ProtectionLevel(), this.getIOAdapterProtectionLevelType(), "protectionLevel", "None", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Name(), theEcorePackage.getEString(), "name", "", 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_BandwidthCapacity(), theEcorePackage.getEInt(), "bandwidthCapacity", "0", 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Boards(), this.getBoard(), null, "boards", null, 1, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_IsBoardLocal(), theEcorePackage.getEBoolean(), "isBoardLocal", null, 0, 1, Network.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(applicationOrApplicationGroupEClass, ApplicationOrApplicationGroup.class, "ApplicationOrApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationOrApplicationGroup_Name(), theEcorePackage.getEString(), "name", "", 0, 1, ApplicationOrApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApplicationOrApplicationGroup__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(applicationGroupEClass, ApplicationGroup.class, "ApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationGroup_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, ApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApplicationGroup__GetAllApplications(), this.getApplication(), "getAllApplications", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApplicationGroup__GetAllThreads(), this.getThread(), "getAllThreads", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApplicationGroup__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_CoreUtilization(), theEcorePackage.getEInt(), "coreUtilization", "0", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_RamUtilization(), theEcorePackage.getEInt(), "ramUtilization", "0", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_RomUtilization(), theEcorePackage.getEInt(), "romUtilization", "0", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_CriticalityLevel(), this.getDesignAssuranceLevelType(), "criticalityLevel", "None", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_IoAdapterProtectionLevel(), this.getIOAdapterProtectionLevelType(), "ioAdapterProtectionLevel", "None", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_ParallelThreads(), theEcorePackage.getEInt(), "parallelThreads", "1", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_DevelopedBy(), theEcorePackage.getEString(), "developedBy", "", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_IoAdapterRequirements(), this.getIOAdapterRequirement(), null, "ioAdapterRequirements", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_RestrictMappingToHardwareElements(), this.getHardwareElement(), null, "restrictMappingToHardwareElements", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Threads(), this.getThread(), this.getThread_Application(), "threads", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApplication__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(threadEClass, ch.hilbri.assist.mapping.model.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThread_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ch.hilbri.assist.mapping.model.Thread.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_CoreUtilization(), theEcorePackage.getEInt(), "coreUtilization", null, 0, 1, ch.hilbri.assist.mapping.model.Thread.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getThread_Application(), this.getApplication(), this.getApplication_Threads(), "application", null, 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_Duration(), theEcorePackage.getEInt(), "duration", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_Period(), theEcorePackage.getEInt(), "period", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_EarlyTolerance(), theEcorePackage.getEInt(), "earlyTolerance", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_LateTolerance(), theEcorePackage.getEInt(), "lateTolerance", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_LatestStartTime(), theEcorePackage.getEInt(), "latestStartTime", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_LatestEndTime(), theEcorePackage.getEInt(), "latestEndTime", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_InitTime(), theEcorePackage.getEInt(), "initTime", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_MaxSlices(), theEcorePackage.getEInt(), "maxSlices", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_MinSliceDuration(), theEcorePackage.getEInt(), "minSliceDuration", "0", 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_Location(), this.getCore(), null, "location", null, 0, 1, ch.hilbri.assist.mapping.model.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getThread__GetExclusiveAdapterRequestCount__IOAdapterType_IOAdapterProtectionLevelType(), theEcorePackage.getEInt(), "getExclusiveAdapterRequestCount", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOAdapterType(), "paramAdapterType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOAdapterProtectionLevelType(), "paramMinProtectionLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ioAdapterRequirementEClass, IOAdapterRequirement.class, "IOAdapterRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOAdapterRequirement_AdapterType(), this.getIOAdapterType(), "adapterType", "None", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapterRequirement_RequiredAdapterCount(), theEcorePackage.getEInt(), "requiredAdapterCount", "0", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getDissimilarityEntry_Level(), this.getHardwareArchitectureLevelType(), "level", null, 0, 1, DissimilarityEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_CompartmentAttribute(), this.getCompartmentAttributes(), "compartmentAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_BoxAttribute(), this.getBoxAttributes(), "boxAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_BoardAttribute(), this.getBoardAttributes(), "boardAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDissimilarityEntry_ProcessorAttribute(), this.getProcessorAttributes(), "processorAttribute", "None", 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dislocalityRelationEClass, DislocalityRelation.class, "DislocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDislocalityRelation_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDislocalityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDislocalityRelation__GetApplicationCount(), theEcorePackage.getEInt(), "getApplicationCount", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(proximityRelationEClass, ProximityRelation.class, "ProximityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProximityRelation_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, ProximityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProximityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, ProximityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationRelationEClass, CommunicationRelation.class, "CommunicationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationRelation_ApplicationsOrGroups(), this.getApplicationOrApplicationGroup(), null, "applicationsOrGroups", null, 1, -1, CommunicationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationRelation_BandwidthUtilization(), theEcorePackage.getEInt(), "bandwidthUtilization", "0", 0, 1, CommunicationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCommunicationRelation__GetAllThreads(), this.getThread(), "getAllThreads", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(schedulingRelationEClass, SchedulingRelation.class, "SchedulingRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedulingRelation_RefBefore(), this.getReferencePointType(), "refBefore", null, 0, 1, SchedulingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingRelation_RefAfter(), this.getReferencePointType(), "refAfter", null, 0, 1, SchedulingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingRelation_ThreadBefore(), this.getThread(), null, "threadBefore", null, 1, 1, SchedulingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingRelation_ThreadAfter(), this.getThread(), null, "threadAfter", null, 1, 1, SchedulingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingRelation_Delay(), theEcorePackage.getEInt(), "delay", "0", 0, 1, SchedulingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricParameterEClass, MetricParameter.class, "MetricParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricParameter_Name(), theEcorePackage.getEString(), "name", "", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricParameter_Value(), theEcorePackage.getEInt(), "value", "0", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(ioAdapterTypeEEnum, IOAdapterType.NONE);
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
		addEEnumLiteral(boardAttributesEEnum, BoardAttributes.SIDE);
		addEEnumLiteral(boardAttributesEEnum, BoardAttributes.ESS);

		initEEnum(processorAttributesEEnum, ProcessorAttributes.class, "ProcessorAttributes");
		addEEnumLiteral(processorAttributesEEnum, ProcessorAttributes.NONE);
		addEEnumLiteral(processorAttributesEEnum, ProcessorAttributes.MANUFACTURER);
		addEEnumLiteral(processorAttributesEEnum, ProcessorAttributes.PROCESSORTYPE);

		initEEnum(referencePointTypeEEnum, ReferencePointType.class, "ReferencePointType");
		addEEnumLiteral(referencePointTypeEEnum, ReferencePointType.START);
		addEEnumLiteral(referencePointTypeEEnum, ReferencePointType.END);

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
