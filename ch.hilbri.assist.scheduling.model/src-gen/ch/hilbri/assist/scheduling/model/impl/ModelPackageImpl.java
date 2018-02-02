/**
 */
package ch.hilbri.assist.scheduling.model.impl;

import ch.hilbri.assist.scheduling.model.Application;
import ch.hilbri.assist.scheduling.model.AssistModelScheduling;
import ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult;
import ch.hilbri.assist.scheduling.model.Board;
import ch.hilbri.assist.scheduling.model.Box;
import ch.hilbri.assist.scheduling.model.Compartment;
import ch.hilbri.assist.scheduling.model.Core;
import ch.hilbri.assist.scheduling.model.DesignAssuranceLevelType;
import ch.hilbri.assist.scheduling.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.scheduling.model.HardwareElement;
import ch.hilbri.assist.scheduling.model.IOAdapter;
import ch.hilbri.assist.scheduling.model.IOAdapterRequirement;
import ch.hilbri.assist.scheduling.model.IOAdapterType;
import ch.hilbri.assist.scheduling.model.MetricParameter;
import ch.hilbri.assist.scheduling.model.ModelFactory;
import ch.hilbri.assist.scheduling.model.ModelPackage;
import ch.hilbri.assist.scheduling.model.PeriodicityType;
import ch.hilbri.assist.scheduling.model.Processor;
import ch.hilbri.assist.scheduling.model.Task;
import ch.hilbri.assist.scheduling.model.TaskExecutionInstance;

import java.util.HashMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	private EClass assistModelSchedulingEClass = null;

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
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

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
	private EClass metricParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assistModelSchedulingResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskExecutionInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum periodicityTypeEEnum = null;

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
	private EDataType task2ExecutionInstancesMapTypeEDataType = null;

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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#eNS_URI
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
	public EClass getAssistModelScheduling() {
		return assistModelSchedulingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModelScheduling_SystemName() {
		return (EAttribute)assistModelSchedulingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModelScheduling_Compartments() {
		return (EReference)assistModelSchedulingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModelScheduling_Applications() {
		return (EReference)assistModelSchedulingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModelScheduling__GetAllCompartments() {
		return assistModelSchedulingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModelScheduling__GetAllBoxes() {
		return assistModelSchedulingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModelScheduling__GetAllBoards() {
		return assistModelSchedulingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModelScheduling__GetAllProcessors() {
		return assistModelSchedulingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModelScheduling__GetAllCores() {
		return assistModelSchedulingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModelScheduling__GetAllTasks() {
		return assistModelSchedulingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssistModelScheduling__GetAllHardwareElements__int() {
		return assistModelSchedulingEClass.getEOperations().get(6);
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
	public EAttribute getHardwareElement_Manufacturer() {
		return (EAttribute)hardwareElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareElement_MetricParameters() {
		return (EReference)hardwareElementEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getCompartment_PowerSupply() {
		return (EAttribute)compartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartment_FullName() {
		return (EAttribute)compartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartment_Boxes() {
		return (EReference)compartmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAllBoxes() {
		return compartmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAllBoards() {
		return compartmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAllProcessors() {
		return compartmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompartment__GetAllCores() {
		return compartmentEClass.getEOperations().get(3);
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
	public EAttribute getBox_FullName() {
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
	public EOperation getBox__GetAllBoards() {
		return boxEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBox__GetAllProcessors() {
		return boxEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBox__GetAllCores() {
		return boxEClass.getEOperations().get(2);
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
	public EAttribute getBoard_BoardType() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_PowerSupply() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_AssuranceLevel() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_RamCapacity() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_RomCapacity() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_FullName() {
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
	public EOperation getBoard__ToString() {
		return boardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__GetAllProcessors() {
		return boardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__GetAllCores() {
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
	public EAttribute getProcessor_ProcessorType() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_FullName() {
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
	public EOperation getProcessor__GetAllCores() {
		return processorEClass.getEOperations().get(0);
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
	public EAttribute getCore_FullName() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getIOAdapter_AdapterType() {
		return (EAttribute)ioAdapterEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getApplication_FullName() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DevelopedBy() {
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
	public EReference getApplication_Tasks() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_MetricParameters() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_RestrictMappingToHardwareElements() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(6);
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
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_RamUtilization() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_RomUtilization() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Application() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_FullName() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_AssignedCore() {
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Duration() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Period() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_EarlyTolerance() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_LateTolerance() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_MaxStartTime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_MaxEndTime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_AddInitTime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Slices() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_MinSliceDuration() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Periodicity() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_IoAdapterRequirements() {
		return (EReference)taskEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_MetricParameters() {
		return (EReference)taskEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ToString() {
		return taskEClass.getEOperations().get(0);
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
	public EClass getAssistModelSchedulingResult() {
		return assistModelSchedulingResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModelSchedulingResult_Name() {
		return (EAttribute)assistModelSchedulingResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModelSchedulingResult_HyperPeriodLength() {
		return (EAttribute)assistModelSchedulingResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModelSchedulingResult_Model() {
		return (EReference)assistModelSchedulingResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssistModelSchedulingResult_Schedule() {
		return (EAttribute)assistModelSchedulingResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskExecutionInstance() {
		return taskExecutionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskExecutionInstance_Begin() {
		return (EAttribute)taskExecutionInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskExecutionInstance_End() {
		return (EAttribute)taskExecutionInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPeriodicityType() {
		return periodicityTypeEEnum;
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
	public EDataType getTask2ExecutionInstancesMapType() {
		return task2ExecutionInstancesMapTypeEDataType;
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
		assistModelSchedulingEClass = createEClass(ASSIST_MODEL_SCHEDULING);
		createEAttribute(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING__SYSTEM_NAME);
		createEReference(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING__COMPARTMENTS);
		createEReference(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING__APPLICATIONS);
		createEOperation(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING___GET_ALL_COMPARTMENTS);
		createEOperation(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING___GET_ALL_BOXES);
		createEOperation(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING___GET_ALL_BOARDS);
		createEOperation(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING___GET_ALL_PROCESSORS);
		createEOperation(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING___GET_ALL_CORES);
		createEOperation(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING___GET_ALL_TASKS);
		createEOperation(assistModelSchedulingEClass, ASSIST_MODEL_SCHEDULING___GET_ALL_HARDWARE_ELEMENTS__INT);

		hardwareElementEClass = createEClass(HARDWARE_ELEMENT);
		createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__NAME);
		createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__MANUFACTURER);
		createEReference(hardwareElementEClass, HARDWARE_ELEMENT__METRIC_PARAMETERS);

		compartmentEClass = createEClass(COMPARTMENT);
		createEAttribute(compartmentEClass, COMPARTMENT__POWER_SUPPLY);
		createEAttribute(compartmentEClass, COMPARTMENT__FULL_NAME);
		createEReference(compartmentEClass, COMPARTMENT__BOXES);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_BOXES);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_BOARDS);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_PROCESSORS);
		createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_CORES);

		boxEClass = createEClass(BOX);
		createEAttribute(boxEClass, BOX__FULL_NAME);
		createEReference(boxEClass, BOX__COMPARTMENT);
		createEReference(boxEClass, BOX__BOARDS);
		createEOperation(boxEClass, BOX___GET_ALL_BOARDS);
		createEOperation(boxEClass, BOX___GET_ALL_PROCESSORS);
		createEOperation(boxEClass, BOX___GET_ALL_CORES);

		boardEClass = createEClass(BOARD);
		createEAttribute(boardEClass, BOARD__BOARD_TYPE);
		createEAttribute(boardEClass, BOARD__POWER_SUPPLY);
		createEAttribute(boardEClass, BOARD__ASSURANCE_LEVEL);
		createEAttribute(boardEClass, BOARD__RAM_CAPACITY);
		createEAttribute(boardEClass, BOARD__ROM_CAPACITY);
		createEAttribute(boardEClass, BOARD__FULL_NAME);
		createEReference(boardEClass, BOARD__BOX);
		createEReference(boardEClass, BOARD__PROCESSORS);
		createEReference(boardEClass, BOARD__IO_ADAPTERS);
		createEOperation(boardEClass, BOARD___TO_STRING);
		createEOperation(boardEClass, BOARD___GET_ALL_PROCESSORS);
		createEOperation(boardEClass, BOARD___GET_ALL_CORES);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__PROCESSOR_TYPE);
		createEAttribute(processorEClass, PROCESSOR__FULL_NAME);
		createEReference(processorEClass, PROCESSOR__BOARD);
		createEReference(processorEClass, PROCESSOR__CORES);
		createEOperation(processorEClass, PROCESSOR___GET_ALL_CORES);

		coreEClass = createEClass(CORE);
		createEAttribute(coreEClass, CORE__ARCHITECTURE);
		createEAttribute(coreEClass, CORE__CAPACITY);
		createEReference(coreEClass, CORE__PROCESSOR);
		createEAttribute(coreEClass, CORE__FULL_NAME);

		ioAdapterEClass = createEClass(IO_ADAPTER);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__NAME);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__TOTAL_COUNT);
		createEAttribute(ioAdapterEClass, IO_ADAPTER__ADAPTER_TYPE);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__FULL_NAME);
		createEAttribute(applicationEClass, APPLICATION__DEVELOPED_BY);
		createEAttribute(applicationEClass, APPLICATION__CRITICALITY_LEVEL);
		createEReference(applicationEClass, APPLICATION__TASKS);
		createEReference(applicationEClass, APPLICATION__METRIC_PARAMETERS);
		createEReference(applicationEClass, APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
		createEOperation(applicationEClass, APPLICATION___TO_STRING);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__RAM_UTILIZATION);
		createEAttribute(taskEClass, TASK__ROM_UTILIZATION);
		createEReference(taskEClass, TASK__APPLICATION);
		createEAttribute(taskEClass, TASK__FULL_NAME);
		createEReference(taskEClass, TASK__ASSIGNED_CORE);
		createEAttribute(taskEClass, TASK__DURATION);
		createEAttribute(taskEClass, TASK__PERIOD);
		createEAttribute(taskEClass, TASK__EARLY_TOLERANCE);
		createEAttribute(taskEClass, TASK__LATE_TOLERANCE);
		createEAttribute(taskEClass, TASK__MAX_START_TIME);
		createEAttribute(taskEClass, TASK__MAX_END_TIME);
		createEAttribute(taskEClass, TASK__ADD_INIT_TIME);
		createEAttribute(taskEClass, TASK__SLICES);
		createEAttribute(taskEClass, TASK__MIN_SLICE_DURATION);
		createEAttribute(taskEClass, TASK__PERIODICITY);
		createEReference(taskEClass, TASK__IO_ADAPTER_REQUIREMENTS);
		createEReference(taskEClass, TASK__METRIC_PARAMETERS);
		createEOperation(taskEClass, TASK___TO_STRING);

		ioAdapterRequirementEClass = createEClass(IO_ADAPTER_REQUIREMENT);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED);
		createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY);

		metricParameterEClass = createEClass(METRIC_PARAMETER);
		createEAttribute(metricParameterEClass, METRIC_PARAMETER__NAME);
		createEAttribute(metricParameterEClass, METRIC_PARAMETER__VALUE);

		assistModelSchedulingResultEClass = createEClass(ASSIST_MODEL_SCHEDULING_RESULT);
		createEAttribute(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__NAME);
		createEAttribute(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__HYPER_PERIOD_LENGTH);
		createEReference(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__MODEL);
		createEAttribute(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__SCHEDULE);

		taskExecutionInstanceEClass = createEClass(TASK_EXECUTION_INSTANCE);
		createEAttribute(taskExecutionInstanceEClass, TASK_EXECUTION_INSTANCE__BEGIN);
		createEAttribute(taskExecutionInstanceEClass, TASK_EXECUTION_INSTANCE__END);

		// Create enums
		periodicityTypeEEnum = createEEnum(PERIODICITY_TYPE);
		hardwareArchitectureLevelTypeEEnum = createEEnum(HARDWARE_ARCHITECTURE_LEVEL_TYPE);
		designAssuranceLevelTypeEEnum = createEEnum(DESIGN_ASSURANCE_LEVEL_TYPE);
		ioAdapterTypeEEnum = createEEnum(IO_ADAPTER_TYPE);

		// Create data types
		task2ExecutionInstancesMapTypeEDataType = createEDataType(TASK2_EXECUTION_INSTANCES_MAP_TYPE);
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
		boxEClass.getESuperTypes().add(this.getHardwareElement());
		boardEClass.getESuperTypes().add(this.getHardwareElement());
		processorEClass.getESuperTypes().add(this.getHardwareElement());
		coreEClass.getESuperTypes().add(this.getHardwareElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(assistModelSchedulingEClass, AssistModelScheduling.class, "AssistModelScheduling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssistModelScheduling_SystemName(), theEcorePackage.getEString(), "systemName", "", 0, 1, AssistModelScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModelScheduling_Compartments(), this.getCompartment(), null, "compartments", null, 1, -1, AssistModelScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModelScheduling_Applications(), this.getApplication(), null, "applications", null, 1, -1, AssistModelScheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAssistModelScheduling__GetAllCompartments(), this.getCompartment(), "getAllCompartments", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModelScheduling__GetAllBoxes(), this.getBox(), "getAllBoxes", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModelScheduling__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModelScheduling__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModelScheduling__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssistModelScheduling__GetAllTasks(), this.getTask(), "getAllTasks", 0, -1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAssistModelScheduling__GetAllHardwareElements__int(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(hardwareElementEClass, HardwareElement.class, "HardwareElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareElement_Name(), theEcorePackage.getEString(), "name", "", 0, 1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareElement_Manufacturer(), theEcorePackage.getEString(), "manufacturer", "", 0, 1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareElement_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentEClass, Compartment.class, "Compartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompartment_PowerSupply(), theEcorePackage.getEString(), "powerSupply", "", 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartment_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Compartment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompartment_Boxes(), this.getBox(), this.getBox_Compartment(), "boxes", null, 1, -1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompartment__GetAllBoxes(), this.getBox(), "getAllBoxes", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompartment__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompartment__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompartment__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBox_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Box.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBox_Compartment(), this.getCompartment(), this.getCompartment_Boxes(), "compartment", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBox_Boards(), this.getBoard(), this.getBoard_Box(), "boards", null, 0, -1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBox__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBox__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBox__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoard_BoardType(), theEcorePackage.getEString(), "boardType", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_PowerSupply(), theEcorePackage.getEString(), "powerSupply", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_AssuranceLevel(), this.getDesignAssuranceLevelType(), "assuranceLevel", "None", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_RamCapacity(), theEcorePackage.getEInt(), "ramCapacity", "0", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_RomCapacity(), theEcorePackage.getEInt(), "romCapacity", "0", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Board.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Box(), this.getBox(), this.getBox_Boards(), "box", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Processors(), this.getProcessor(), this.getProcessor_Board(), "processors", null, 1, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_IoAdapters(), this.getIOAdapter(), null, "ioAdapters", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBoard__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBoard__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBoard__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_ProcessorType(), theEcorePackage.getEString(), "processorType", "", 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Processor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Board(), this.getBoard(), this.getBoard_Processors(), "board", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Cores(), this.getCore(), this.getCore_Processor(), "cores", null, 1, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcessor__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCore_Architecture(), theEcorePackage.getEString(), "architecture", "", 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCore_Capacity(), theEcorePackage.getEInt(), "capacity", "0", 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCore_Processor(), this.getProcessor(), this.getProcessor_Cores(), "processor", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCore_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Core.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ioAdapterEClass, IOAdapter.class, "IOAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOAdapter_Name(), theEcorePackage.getEString(), "name", "", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_TotalCount(), theEcorePackage.getEInt(), "totalCount", "0", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapter_AdapterType(), this.getIOAdapterType(), "adapterType", "None", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), theEcorePackage.getEString(), "name", "", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Application.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_DevelopedBy(), theEcorePackage.getEString(), "developedBy", "", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_CriticalityLevel(), this.getDesignAssuranceLevelType(), "criticalityLevel", "None", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Tasks(), this.getTask(), this.getTask_Application(), "tasks", null, 1, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_RestrictMappingToHardwareElements(), this.getHardwareElement(), null, "restrictMappingToHardwareElements", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApplication__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), theEcorePackage.getEString(), "name", "", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_RamUtilization(), theEcorePackage.getEInt(), "ramUtilization", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_RomUtilization(), theEcorePackage.getEInt(), "romUtilization", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Application(), this.getApplication(), this.getApplication_Tasks(), "application", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Task.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTask_AssignedCore(), this.getCore(), null, "assignedCore", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Duration(), theEcorePackage.getEInt(), "duration", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Period(), theEcorePackage.getEInt(), "period", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_EarlyTolerance(), theEcorePackage.getEInt(), "earlyTolerance", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_LateTolerance(), theEcorePackage.getEInt(), "lateTolerance", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_MaxStartTime(), theEcorePackage.getEInt(), "maxStartTime", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_MaxEndTime(), theEcorePackage.getEInt(), "maxEndTime", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_AddInitTime(), theEcorePackage.getEInt(), "addInitTime", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Slices(), theEcorePackage.getEInt(), "slices", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_MinSliceDuration(), theEcorePackage.getEInt(), "minSliceDuration", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Periodicity(), this.getPeriodicityType(), "periodicity", "fixed", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_IoAdapterRequirements(), this.getIOAdapterRequirement(), null, "ioAdapterRequirements", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTask__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ioAdapterRequirementEClass, IOAdapterRequirement.class, "IOAdapterRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOAdapterRequirement_AdapterType(), this.getIOAdapterType(), "adapterType", "None", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapterRequirement_RequiredAdapterCount(), theEcorePackage.getEInt(), "requiredAdapterCount", "0", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapterRequirement_IsSharedAllowed(), theEcorePackage.getEBoolean(), "isSharedAllowed", "false", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOAdapterRequirement_IsExclusiveOnly(), theEcorePackage.getEBoolean(), "isExclusiveOnly", "false", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricParameterEClass, MetricParameter.class, "MetricParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricParameter_Name(), theEcorePackage.getEString(), "name", "", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricParameter_Value(), theEcorePackage.getEInt(), "value", "0", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assistModelSchedulingResultEClass, AssistModelSchedulingResult.class, "AssistModelSchedulingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssistModelSchedulingResult_Name(), theEcorePackage.getEString(), "name", "", 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssistModelSchedulingResult_HyperPeriodLength(), theEcorePackage.getEInt(), "hyperPeriodLength", "-1", 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModelSchedulingResult_Model(), this.getAssistModelScheduling(), null, "model", null, 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssistModelSchedulingResult_Schedule(), this.getTask2ExecutionInstancesMapType(), "schedule", null, 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskExecutionInstanceEClass, TaskExecutionInstance.class, "TaskExecutionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskExecutionInstance_Begin(), theEcorePackage.getEInt(), "begin", "-1", 0, 1, TaskExecutionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskExecutionInstance_End(), theEcorePackage.getEInt(), "end", "-1", 0, 1, TaskExecutionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(periodicityTypeEEnum, PeriodicityType.class, "PeriodicityType");
		addEEnumLiteral(periodicityTypeEEnum, PeriodicityType.FIXED);
		addEEnumLiteral(periodicityTypeEEnum, PeriodicityType.FLEXIBLE);

		initEEnum(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.class, "HardwareArchitectureLevelType");
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.CORE);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.PROCESSOR);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.BOARD);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.BOX);
		addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.COMPARTMENT);

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

		// Initialize data types
		initEDataType(task2ExecutionInstancesMapTypeEDataType, HashMap.class, "Task2ExecutionInstancesMapType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.scheduling.model.Task, java.util.List<ch.hilbri.assist.scheduling.model.TaskExecutionInstance>>");

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
