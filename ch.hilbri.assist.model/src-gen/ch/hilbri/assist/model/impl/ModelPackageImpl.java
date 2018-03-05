/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.ApplicationAlternatives;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.AssistModelDSE;
import ch.hilbri.assist.model.AssistModelSchedulingResult;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardAlternative;
import ch.hilbri.assist.model.BoardAlternatives;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.BoxDSE;
import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.Color;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityAttributes;
import ch.hilbri.assist.model.DissimilarityClause;
import ch.hilbri.assist.model.DissimilarityConjunction;
import ch.hilbri.assist.model.DissimilarityDisjunction;
import ch.hilbri.assist.model.DissimilarityEntry;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.IOAdapter;
import ch.hilbri.assist.model.IOAdapterRequirement;
import ch.hilbri.assist.model.IOAdapterType;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.MetricParameter;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PeriodicityType;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.RestrictionAlternative;
import ch.hilbri.assist.model.RestrictionAlternatives;
import ch.hilbri.assist.model.SingleMappingElement;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskExecutionInstance;

import java.lang.Comparable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private EClass metricParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assistModelDSEEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boxDSEEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boardAlternativesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boardAlternativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationAlternativesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationAlternativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionAlternativesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionAlternativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass explorationCandidateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass comparableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass metricScorePairEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappingResultEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleMappingElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractMetricEClass = null;

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
    private EEnum colorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dissimilarityAttributesEEnum = null;

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
    private EEnum periodicityTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType task2CoreMapTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType stringListEDataType = null;

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
     * @see ch.hilbri.assist.model.ModelPackage#eNS_URI
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
    public EAttribute getAssistModel_MinHypPeriodLength() {
        return (EAttribute)assistModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssistModel_TaskSwitchDelay() {
        return (EAttribute)assistModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssistModel_Compartments() {
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
    public EReference getAssistModel_DislocalityRelations() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssistModel_ColocalityRelations() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssistModel_DissimilarityRelations() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(7);
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
    public EOperation getAssistModel__GetAllTasks() {
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
    public EReference getBox_Compartment() {
        return (EReference)boxEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBox_Boards() {
        return (EReference)boxEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBox_FullName() {
        return (EAttribute)boxEClass.getEStructuralFeatures().get(2);
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
    public EReference getBoard_Box() {
        return (EReference)boardEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBoard_Processors() {
        return (EReference)boardEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBoard_IoAdapters() {
        return (EReference)boardEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBoard_FullName() {
        return (EAttribute)boardEClass.getEStructuralFeatures().get(8);
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
    public EAttribute getCore_FullName() {
        return (EAttribute)coreEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCore_Processor() {
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
    public EAttribute getApplication_DevelopedBy() {
        return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApplication_CriticalityLevel() {
        return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplication_Tasks() {
        return (EReference)applicationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplication_MetricParameters() {
        return (EReference)applicationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplication_RestrictMappingToHardwareElements() {
        return (EReference)applicationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApplication_FullName() {
        return (EAttribute)applicationEClass.getEStructuralFeatures().get(6);
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
    public EAttribute getTask_CoreUtilization() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_RamUtilization() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_RomUtilization() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_Duration() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_Period() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_EarlyTolerance() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_LateTolerance() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_MaxStartTime() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_MaxEndTime() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_AddInitTime() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_Slices() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_MinSliceDuration() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_Periodicity() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTask_Color() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_Application() {
        return (EReference)taskEClass.getEStructuralFeatures().get(15);
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
    public EAttribute getTask_FullName() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_RestrictMappingToHardwareElements() {
        return (EReference)taskEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_AssignedCore() {
        return (EReference)taskEClass.getEStructuralFeatures().get(20);
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
    public EClass getDislocalityRelation() {
        return dislocalityRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDislocalityRelation_Applications() {
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
    public EClass getColocalityRelation() {
        return colocalityRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColocalityRelation_Applications() {
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
    public EClass getDissimilarityRelation() {
        return dissimilarityRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDissimilarityRelation_Applications() {
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
    public EAttribute getDissimilarityEntry_DissimilarityAttribute() {
        return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDissimilarityEntry_HardwareLevel() {
        return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(1);
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
    public EClass getAssistModelDSE() {
        return assistModelDSEEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssistModelDSE_ApplicationAlternatives() {
        return (EReference)assistModelDSEEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssistModelDSE_RestrictionAlternatives() {
        return (EReference)assistModelDSEEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssistModelDSE_ExplorationCandidates() {
        return (EReference)assistModelDSEEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBoxDSE() {
        return boxDSEEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBoxDSE_BoardAlternatives() {
        return (EReference)boxDSEEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBoardAlternatives() {
        return boardAlternativesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBoardAlternatives_Alternatives() {
        return (EReference)boardAlternativesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBoardAlternative() {
        return boardAlternativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBoardAlternative_Name() {
        return (EAttribute)boardAlternativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBoardAlternative_Boards() {
        return (EReference)boardAlternativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getApplicationAlternatives() {
        return applicationAlternativesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplicationAlternatives_Alternatives() {
        return (EReference)applicationAlternativesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getApplicationAlternative() {
        return applicationAlternativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApplicationAlternative_Name() {
        return (EAttribute)applicationAlternativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplicationAlternative_Applications() {
        return (EReference)applicationAlternativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRestrictionAlternatives() {
        return restrictionAlternativesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionAlternatives_Alternatives() {
        return (EReference)restrictionAlternativesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRestrictionAlternative() {
        return restrictionAlternativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionAlternative_Name() {
        return (EAttribute)restrictionAlternativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionAlternative_DislocalityRelations() {
        return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionAlternative_ColocalityRelations() {
        return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionAlternative_DissimilarityRelations() {
        return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExplorationCandidate() {
        return explorationCandidateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExplorationCandidate_Name() {
        return (EAttribute)explorationCandidateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExplorationCandidate_BoardAlternatives() {
        return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExplorationCandidate_ApplicationAlternatives() {
        return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExplorationCandidate_RestrictionAlternatives() {
        return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComparable() {
        return comparableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMetricScorePair() {
        return metricScorePairEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMetricScorePair_Key() {
        return (EReference)metricScorePairEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMetricScorePair_Value() {
        return (EAttribute)metricScorePairEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMappingResult() {
        return mappingResultEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingResult_Name() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingResult_Index() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMappingResult_Model() {
        return (EReference)mappingResultEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingResult_Task2CoreMap() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMappingResult_MetricAbsoluteScoresMap() {
        return (EReference)mappingResultEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMappingResult_MetricScaledScoresMap() {
        return (EReference)mappingResultEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingResult_PartialSolution() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingResult_AbsoluteTotalScore() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingResult_ScaledTotalScore() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMappingResult__GetMappedTasksForCore__Core() {
        return mappingResultEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMappingResult__GetAbsoluteCoreUtilization__Core() {
        return mappingResultEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMappingResult__GetRelativeCoreUtilization__Core() {
        return mappingResultEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMappingResult__GetHardwareElementForTask__Task_int() {
        return mappingResultEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMappingResult__GetMappingElements() {
        return mappingResultEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMappingResult__CompareTo__MappingResult() {
        return mappingResultEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMappingResult__ToString() {
        return mappingResultEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSingleMappingElement() {
        return singleMappingElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleMappingElement_Application() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleMappingElement_Task() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleMappingElement_Core() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleMappingElement_Processor() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleMappingElement_Board() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleMappingElement_Box() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleMappingElement_Compartment() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractMetric() {
        return abstractMetricEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractMetric_Name() {
        return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractMetric_BuiltIn() {
        return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractMetric_HigherScoreIsBetter() {
        return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractMetric_Weight() {
        return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getAbstractMetric__ComputeAbsoluteScore__MappingResult() {
        return abstractMetricEClass.getEOperations().get(0);
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
    public EEnum getColor() {
        return colorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDissimilarityAttributes() {
        return dissimilarityAttributesEEnum;
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
    public EEnum getPeriodicityType() {
        return periodicityTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTask2CoreMapType() {
        return task2CoreMapTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getStringList() {
        return stringListEDataType;
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
        assistModelEClass = createEClass(ASSIST_MODEL);
        createEAttribute(assistModelEClass, ASSIST_MODEL__SYSTEM_NAME);
        createEAttribute(assistModelEClass, ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH);
        createEAttribute(assistModelEClass, ASSIST_MODEL__TASK_SWITCH_DELAY);
        createEReference(assistModelEClass, ASSIST_MODEL__COMPARTMENTS);
        createEReference(assistModelEClass, ASSIST_MODEL__APPLICATIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__DISLOCALITY_RELATIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__COLOCALITY_RELATIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__DISSIMILARITY_RELATIONS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_COMPARTMENTS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_BOXES);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_BOARDS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_PROCESSORS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_CORES);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_TASKS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT);

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
        createEReference(boxEClass, BOX__COMPARTMENT);
        createEReference(boxEClass, BOX__BOARDS);
        createEAttribute(boxEClass, BOX__FULL_NAME);
        createEOperation(boxEClass, BOX___GET_ALL_BOARDS);
        createEOperation(boxEClass, BOX___GET_ALL_PROCESSORS);
        createEOperation(boxEClass, BOX___GET_ALL_CORES);

        boardEClass = createEClass(BOARD);
        createEAttribute(boardEClass, BOARD__BOARD_TYPE);
        createEAttribute(boardEClass, BOARD__POWER_SUPPLY);
        createEAttribute(boardEClass, BOARD__ASSURANCE_LEVEL);
        createEAttribute(boardEClass, BOARD__RAM_CAPACITY);
        createEAttribute(boardEClass, BOARD__ROM_CAPACITY);
        createEReference(boardEClass, BOARD__BOX);
        createEReference(boardEClass, BOARD__PROCESSORS);
        createEReference(boardEClass, BOARD__IO_ADAPTERS);
        createEAttribute(boardEClass, BOARD__FULL_NAME);
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
        createEAttribute(coreEClass, CORE__FULL_NAME);
        createEReference(coreEClass, CORE__PROCESSOR);

        ioAdapterEClass = createEClass(IO_ADAPTER);
        createEAttribute(ioAdapterEClass, IO_ADAPTER__NAME);
        createEAttribute(ioAdapterEClass, IO_ADAPTER__TOTAL_COUNT);
        createEAttribute(ioAdapterEClass, IO_ADAPTER__ADAPTER_TYPE);

        applicationEClass = createEClass(APPLICATION);
        createEAttribute(applicationEClass, APPLICATION__NAME);
        createEAttribute(applicationEClass, APPLICATION__DEVELOPED_BY);
        createEAttribute(applicationEClass, APPLICATION__CRITICALITY_LEVEL);
        createEReference(applicationEClass, APPLICATION__TASKS);
        createEReference(applicationEClass, APPLICATION__METRIC_PARAMETERS);
        createEReference(applicationEClass, APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
        createEAttribute(applicationEClass, APPLICATION__FULL_NAME);
        createEOperation(applicationEClass, APPLICATION___TO_STRING);

        taskEClass = createEClass(TASK);
        createEAttribute(taskEClass, TASK__NAME);
        createEAttribute(taskEClass, TASK__CORE_UTILIZATION);
        createEAttribute(taskEClass, TASK__RAM_UTILIZATION);
        createEAttribute(taskEClass, TASK__ROM_UTILIZATION);
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
        createEAttribute(taskEClass, TASK__COLOR);
        createEReference(taskEClass, TASK__APPLICATION);
        createEReference(taskEClass, TASK__IO_ADAPTER_REQUIREMENTS);
        createEReference(taskEClass, TASK__METRIC_PARAMETERS);
        createEAttribute(taskEClass, TASK__FULL_NAME);
        createEReference(taskEClass, TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
        createEReference(taskEClass, TASK__ASSIGNED_CORE);
        createEOperation(taskEClass, TASK___TO_STRING);

        ioAdapterRequirementEClass = createEClass(IO_ADAPTER_REQUIREMENT);
        createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE);
        createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT);
        createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED);
        createEAttribute(ioAdapterRequirementEClass, IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY);

        dislocalityRelationEClass = createEClass(DISLOCALITY_RELATION);
        createEReference(dislocalityRelationEClass, DISLOCALITY_RELATION__APPLICATIONS);
        createEAttribute(dislocalityRelationEClass, DISLOCALITY_RELATION__HARDWARE_LEVEL);

        colocalityRelationEClass = createEClass(COLOCALITY_RELATION);
        createEReference(colocalityRelationEClass, COLOCALITY_RELATION__APPLICATIONS);
        createEAttribute(colocalityRelationEClass, COLOCALITY_RELATION__HARDWARE_LEVEL);

        dissimilarityRelationEClass = createEClass(DISSIMILARITY_RELATION);
        createEReference(dissimilarityRelationEClass, DISSIMILARITY_RELATION__APPLICATIONS);
        createEReference(dissimilarityRelationEClass, DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE);

        dissimilarityClauseEClass = createEClass(DISSIMILARITY_CLAUSE);

        dissimilarityDisjunctionEClass = createEClass(DISSIMILARITY_DISJUNCTION);
        createEReference(dissimilarityDisjunctionEClass, DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES);

        dissimilarityConjunctionEClass = createEClass(DISSIMILARITY_CONJUNCTION);
        createEReference(dissimilarityConjunctionEClass, DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES);

        dissimilarityEntryEClass = createEClass(DISSIMILARITY_ENTRY);
        createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE);
        createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__HARDWARE_LEVEL);

        metricParameterEClass = createEClass(METRIC_PARAMETER);
        createEAttribute(metricParameterEClass, METRIC_PARAMETER__NAME);
        createEAttribute(metricParameterEClass, METRIC_PARAMETER__VALUE);

        assistModelDSEEClass = createEClass(ASSIST_MODEL_DSE);
        createEReference(assistModelDSEEClass, ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES);
        createEReference(assistModelDSEEClass, ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES);
        createEReference(assistModelDSEEClass, ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES);

        boxDSEEClass = createEClass(BOX_DSE);
        createEReference(boxDSEEClass, BOX_DSE__BOARD_ALTERNATIVES);

        boardAlternativesEClass = createEClass(BOARD_ALTERNATIVES);
        createEReference(boardAlternativesEClass, BOARD_ALTERNATIVES__ALTERNATIVES);

        boardAlternativeEClass = createEClass(BOARD_ALTERNATIVE);
        createEAttribute(boardAlternativeEClass, BOARD_ALTERNATIVE__NAME);
        createEReference(boardAlternativeEClass, BOARD_ALTERNATIVE__BOARDS);

        applicationAlternativesEClass = createEClass(APPLICATION_ALTERNATIVES);
        createEReference(applicationAlternativesEClass, APPLICATION_ALTERNATIVES__ALTERNATIVES);

        applicationAlternativeEClass = createEClass(APPLICATION_ALTERNATIVE);
        createEAttribute(applicationAlternativeEClass, APPLICATION_ALTERNATIVE__NAME);
        createEReference(applicationAlternativeEClass, APPLICATION_ALTERNATIVE__APPLICATIONS);

        restrictionAlternativesEClass = createEClass(RESTRICTION_ALTERNATIVES);
        createEReference(restrictionAlternativesEClass, RESTRICTION_ALTERNATIVES__ALTERNATIVES);

        restrictionAlternativeEClass = createEClass(RESTRICTION_ALTERNATIVE);
        createEAttribute(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__NAME);
        createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS);
        createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS);
        createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__DISSIMILARITY_RELATIONS);

        explorationCandidateEClass = createEClass(EXPLORATION_CANDIDATE);
        createEAttribute(explorationCandidateEClass, EXPLORATION_CANDIDATE__NAME);
        createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES);
        createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES);
        createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES);

        comparableEClass = createEClass(COMPARABLE);

        metricScorePairEClass = createEClass(METRIC_SCORE_PAIR);
        createEReference(metricScorePairEClass, METRIC_SCORE_PAIR__KEY);
        createEAttribute(metricScorePairEClass, METRIC_SCORE_PAIR__VALUE);

        mappingResultEClass = createEClass(MAPPING_RESULT);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__NAME);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__INDEX);
        createEReference(mappingResultEClass, MAPPING_RESULT__MODEL);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__TASK2_CORE_MAP);
        createEReference(mappingResultEClass, MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP);
        createEReference(mappingResultEClass, MAPPING_RESULT__METRIC_SCALED_SCORES_MAP);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__PARTIAL_SOLUTION);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__SCALED_TOTAL_SCORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__TASK_INT);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_MAPPING_ELEMENTS);
        createEOperation(mappingResultEClass, MAPPING_RESULT___COMPARE_TO__MAPPINGRESULT);
        createEOperation(mappingResultEClass, MAPPING_RESULT___TO_STRING);

        singleMappingElementEClass = createEClass(SINGLE_MAPPING_ELEMENT);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__APPLICATION);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__TASK);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__CORE);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__PROCESSOR);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__BOARD);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__BOX);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__COMPARTMENT);

        abstractMetricEClass = createEClass(ABSTRACT_METRIC);
        createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__NAME);
        createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__BUILT_IN);
        createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER);
        createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__WEIGHT);
        createEOperation(abstractMetricEClass, ABSTRACT_METRIC___COMPUTE_ABSOLUTE_SCORE__MAPPINGRESULT);

        assistModelSchedulingResultEClass = createEClass(ASSIST_MODEL_SCHEDULING_RESULT);
        createEAttribute(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__NAME);
        createEAttribute(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__HYPER_PERIOD_LENGTH);
        createEReference(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__MODEL);
        createEAttribute(assistModelSchedulingResultEClass, ASSIST_MODEL_SCHEDULING_RESULT__SCHEDULE);

        taskExecutionInstanceEClass = createEClass(TASK_EXECUTION_INSTANCE);
        createEAttribute(taskExecutionInstanceEClass, TASK_EXECUTION_INSTANCE__BEGIN);
        createEAttribute(taskExecutionInstanceEClass, TASK_EXECUTION_INSTANCE__END);

        // Create enums
        colorEEnum = createEEnum(COLOR);
        dissimilarityAttributesEEnum = createEEnum(DISSIMILARITY_ATTRIBUTES);
        hardwareArchitectureLevelTypeEEnum = createEEnum(HARDWARE_ARCHITECTURE_LEVEL_TYPE);
        designAssuranceLevelTypeEEnum = createEEnum(DESIGN_ASSURANCE_LEVEL_TYPE);
        ioAdapterTypeEEnum = createEEnum(IO_ADAPTER_TYPE);
        periodicityTypeEEnum = createEEnum(PERIODICITY_TYPE);

        // Create data types
        task2CoreMapTypeEDataType = createEDataType(TASK2_CORE_MAP_TYPE);
        stringListEDataType = createEDataType(STRING_LIST);
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
        dissimilarityDisjunctionEClass.getESuperTypes().add(this.getDissimilarityClause());
        dissimilarityConjunctionEClass.getESuperTypes().add(this.getDissimilarityClause());
        dissimilarityEntryEClass.getESuperTypes().add(this.getDissimilarityClause());
        assistModelDSEEClass.getESuperTypes().add(this.getAssistModel());
        boxDSEEClass.getESuperTypes().add(this.getBox());
        mappingResultEClass.getESuperTypes().add(this.getComparable());

        // Initialize classes, features, and operations; add parameters
        initEClass(assistModelEClass, AssistModel.class, "AssistModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAssistModel_SystemName(), theEcorePackage.getEString(), "systemName", "", 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssistModel_MinHypPeriodLength(), theEcorePackage.getEInt(), "minHypPeriodLength", "-1", 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssistModel_TaskSwitchDelay(), theEcorePackage.getEInt(), "taskSwitchDelay", "0", 0, 1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_Compartments(), this.getCompartment(), null, "compartments", null, 1, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_Applications(), this.getApplication(), null, "applications", null, 1, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_DislocalityRelations(), this.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_ColocalityRelations(), this.getColocalityRelation(), null, "colocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_DissimilarityRelations(), this.getDissimilarityRelation(), null, "dissimilarityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getAssistModel__GetAllCompartments(), this.getCompartment(), "getAllCompartments", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllBoxes(), this.getBox(), "getAllBoxes", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllTasks(), this.getTask(), "getAllTasks", 0, -1, !IS_UNIQUE, IS_ORDERED);

        EOperation op = initEOperation(getAssistModel__GetAllHardwareElements__int(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);
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
        initEReference(getBox_Compartment(), this.getCompartment(), this.getCompartment_Boxes(), "compartment", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBox_Boards(), this.getBoard(), this.getBoard_Box(), "boards", null, 0, -1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBox_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Box.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getBox__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBox__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBox__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBoard_BoardType(), theEcorePackage.getEString(), "boardType", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBoard_PowerSupply(), theEcorePackage.getEString(), "powerSupply", "", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBoard_AssuranceLevel(), this.getDesignAssuranceLevelType(), "assuranceLevel", "None", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBoard_RamCapacity(), theEcorePackage.getEInt(), "ramCapacity", "0", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBoard_RomCapacity(), theEcorePackage.getEInt(), "romCapacity", "0", 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBoard_Box(), this.getBox(), this.getBox_Boards(), "box", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBoard_Processors(), this.getProcessor(), this.getProcessor_Board(), "processors", null, 1, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBoard_IoAdapters(), this.getIOAdapter(), null, "ioAdapters", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBoard_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Board.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
        initEAttribute(getCore_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Core.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCore_Processor(), this.getProcessor(), this.getProcessor_Cores(), "processor", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ioAdapterEClass, IOAdapter.class, "IOAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIOAdapter_Name(), theEcorePackage.getEString(), "name", "", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIOAdapter_TotalCount(), theEcorePackage.getEInt(), "totalCount", "0", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIOAdapter_AdapterType(), this.getIOAdapterType(), "adapterType", "None", 0, 1, IOAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getApplication_Name(), theEcorePackage.getEString(), "name", "", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApplication_DevelopedBy(), theEcorePackage.getEString(), "developedBy", "", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApplication_CriticalityLevel(), this.getDesignAssuranceLevelType(), "criticalityLevel", "None", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplication_Tasks(), this.getTask(), this.getTask_Application(), "tasks", null, 1, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplication_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplication_RestrictMappingToHardwareElements(), this.getHardwareElement(), null, "restrictMappingToHardwareElements", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApplication_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Application.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getApplication__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTask_Name(), theEcorePackage.getEString(), "name", "", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_CoreUtilization(), theEcorePackage.getEInt(), "coreUtilization", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_RamUtilization(), theEcorePackage.getEInt(), "ramUtilization", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_RomUtilization(), theEcorePackage.getEInt(), "romUtilization", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_Duration(), theEcorePackage.getEInt(), "duration", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_Period(), theEcorePackage.getEInt(), "period", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_EarlyTolerance(), theEcorePackage.getEInt(), "earlyTolerance", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_LateTolerance(), theEcorePackage.getEInt(), "lateTolerance", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_MaxStartTime(), theEcorePackage.getEInt(), "maxStartTime", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_MaxEndTime(), theEcorePackage.getEInt(), "maxEndTime", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_AddInitTime(), theEcorePackage.getEInt(), "addInitTime", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_Slices(), theEcorePackage.getEInt(), "slices", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_MinSliceDuration(), theEcorePackage.getEInt(), "minSliceDuration", "-1", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_Periodicity(), this.getPeriodicityType(), "periodicity", "strict", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_Color(), this.getColor(), "color", "none", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_Application(), this.getApplication(), this.getApplication_Tasks(), "application", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_IoAdapterRequirements(), this.getIOAdapterRequirement(), null, "ioAdapterRequirements", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_MetricParameters(), this.getMetricParameter(), null, "metricParameters", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Task.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTask_RestrictMappingToHardwareElements(), this.getHardwareElement(), null, "restrictMappingToHardwareElements", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_AssignedCore(), this.getCore(), null, "assignedCore", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getTask__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(ioAdapterRequirementEClass, IOAdapterRequirement.class, "IOAdapterRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIOAdapterRequirement_AdapterType(), this.getIOAdapterType(), "adapterType", "None", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIOAdapterRequirement_RequiredAdapterCount(), theEcorePackage.getEInt(), "requiredAdapterCount", "0", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIOAdapterRequirement_IsSharedAllowed(), theEcorePackage.getEBoolean(), "isSharedAllowed", "false", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIOAdapterRequirement_IsExclusiveOnly(), theEcorePackage.getEBoolean(), "isExclusiveOnly", "false", 0, 1, IOAdapterRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dislocalityRelationEClass, DislocalityRelation.class, "DislocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDislocalityRelation_Applications(), this.getApplication(), null, "applications", null, 1, -1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDislocalityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, DislocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(colocalityRelationEClass, ColocalityRelation.class, "ColocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getColocalityRelation_Applications(), this.getApplication(), null, "applications", null, 0, -1, ColocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColocalityRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, ColocalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dissimilarityRelationEClass, DissimilarityRelation.class, "DissimilarityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDissimilarityRelation_Applications(), this.getApplication(), null, "applications", null, 0, -1, DissimilarityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDissimilarityRelation_DissimilarityClause(), this.getDissimilarityClause(), null, "dissimilarityClause", null, 1, 1, DissimilarityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dissimilarityClauseEClass, DissimilarityClause.class, "DissimilarityClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dissimilarityDisjunctionEClass, DissimilarityDisjunction.class, "DissimilarityDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDissimilarityDisjunction_DissimilarityClauses(), this.getDissimilarityClause(), null, "dissimilarityClauses", null, 2, -1, DissimilarityDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dissimilarityConjunctionEClass, DissimilarityConjunction.class, "DissimilarityConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDissimilarityConjunction_DissimilarityClauses(), this.getDissimilarityClause(), null, "dissimilarityClauses", null, 2, -1, DissimilarityConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dissimilarityEntryEClass, DissimilarityEntry.class, "DissimilarityEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDissimilarityEntry_DissimilarityAttribute(), this.getDissimilarityAttributes(), "dissimilarityAttribute", null, 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDissimilarityEntry_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, DissimilarityEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(metricParameterEClass, MetricParameter.class, "MetricParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMetricParameter_Name(), theEcorePackage.getEString(), "name", "", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMetricParameter_Value(), theEcorePackage.getEInt(), "value", "0", 0, 1, MetricParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assistModelDSEEClass, AssistModelDSE.class, "AssistModelDSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssistModelDSE_ApplicationAlternatives(), this.getApplicationAlternatives(), null, "applicationAlternatives", null, 0, -1, AssistModelDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModelDSE_RestrictionAlternatives(), this.getRestrictionAlternatives(), null, "restrictionAlternatives", null, 0, -1, AssistModelDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModelDSE_ExplorationCandidates(), this.getExplorationCandidate(), null, "explorationCandidates", null, 0, -1, AssistModelDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boxDSEEClass, BoxDSE.class, "BoxDSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBoxDSE_BoardAlternatives(), this.getBoardAlternatives(), null, "boardAlternatives", null, 0, -1, BoxDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boardAlternativesEClass, BoardAlternatives.class, "BoardAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBoardAlternatives_Alternatives(), this.getBoardAlternative(), null, "alternatives", null, 0, -1, BoardAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boardAlternativeEClass, BoardAlternative.class, "BoardAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBoardAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, BoardAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBoardAlternative_Boards(), this.getBoard(), null, "boards", null, 0, -1, BoardAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationAlternativesEClass, ApplicationAlternatives.class, "ApplicationAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getApplicationAlternatives_Alternatives(), this.getApplicationAlternative(), null, "alternatives", null, 0, -1, ApplicationAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationAlternativeEClass, ApplicationAlternative.class, "ApplicationAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getApplicationAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ApplicationAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplicationAlternative_Applications(), this.getApplication(), null, "applications", null, 0, -1, ApplicationAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(restrictionAlternativesEClass, RestrictionAlternatives.class, "RestrictionAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRestrictionAlternatives_Alternatives(), this.getRestrictionAlternative(), null, "alternatives", null, 0, -1, RestrictionAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(restrictionAlternativeEClass, RestrictionAlternative.class, "RestrictionAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRestrictionAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionAlternative_DislocalityRelations(), this.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionAlternative_ColocalityRelations(), this.getColocalityRelation(), null, "colocalityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionAlternative_DissimilarityRelations(), this.getDissimilarityRelation(), null, "dissimilarityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(explorationCandidateEClass, ExplorationCandidate.class, "ExplorationCandidate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExplorationCandidate_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationCandidate_BoardAlternatives(), this.getBoardAlternative(), null, "boardAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationCandidate_ApplicationAlternatives(), this.getApplicationAlternative(), null, "applicationAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationCandidate_RestrictionAlternatives(), this.getRestrictionAlternative(), null, "restrictionAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(comparableEClass, Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Comparable<ch.hilbri.assist.model.MappingResult>");

        initEClass(metricScorePairEClass, Map.Entry.class, "MetricScorePair", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMetricScorePair_Key(), this.getAbstractMetric(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMetricScorePair_Value(), theEcorePackage.getEDoubleObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mappingResultEClass, MappingResult.class, "MappingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMappingResult_Name(), theEcorePackage.getEString(), "name", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_Index(), theEcorePackage.getEInt(), "index", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMappingResult_Model(), this.getAssistModel(), null, "model", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_Task2CoreMap(), this.getTask2CoreMapType(), "task2CoreMap", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMappingResult_MetricAbsoluteScoresMap(), this.getMetricScorePair(), null, "metricAbsoluteScoresMap", null, 0, -1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMappingResult_MetricScaledScoresMap(), this.getMetricScorePair(), null, "metricScaledScoresMap", null, 0, -1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_PartialSolution(), theEcorePackage.getEBoolean(), "partialSolution", "false", 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_AbsoluteTotalScore(), theEcorePackage.getEDouble(), "absoluteTotalScore", null, 0, 1, MappingResult.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_ScaledTotalScore(), theEcorePackage.getEDouble(), "scaledTotalScore", null, 0, 1, MappingResult.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        op = initEOperation(getMappingResult__GetMappedTasksForCore__Core(), this.getTask(), "getMappedTasksForCore", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__GetAbsoluteCoreUtilization__Core(), theEcorePackage.getEInt(), "getAbsoluteCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__GetRelativeCoreUtilization__Core(), theEcorePackage.getEDouble(), "getRelativeCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__GetHardwareElementForTask__Task_int(), this.getHardwareElement(), "getHardwareElementForTask", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getTask(), "task", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getMappingResult__GetMappingElements(), this.getSingleMappingElement(), "getMappingElements", 0, -1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__CompareTo__MappingResult(), theEcorePackage.getEInt(), "compareTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getMappingResult(), "o", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getMappingResult__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(singleMappingElementEClass, SingleMappingElement.class, "SingleMappingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSingleMappingElement_Application(), this.getApplication(), null, "application", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Task(), this.getTask(), null, "task", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Core(), this.getCore(), null, "core", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Processor(), this.getProcessor(), null, "processor", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Board(), this.getBoard(), null, "board", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Box(), this.getBox(), null, "box", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Compartment(), this.getCompartment(), null, "compartment", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractMetricEClass, AbstractMetric.class, "AbstractMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractMetric_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractMetric_BuiltIn(), theEcorePackage.getEBoolean(), "builtIn", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractMetric_HigherScoreIsBetter(), theEcorePackage.getEBoolean(), "higherScoreIsBetter", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractMetric_Weight(), theEcorePackage.getEInt(), "weight", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getAbstractMetric__ComputeAbsoluteScore__MappingResult(), theEcorePackage.getEDouble(), "computeAbsoluteScore", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getMappingResult(), "result", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(assistModelSchedulingResultEClass, AssistModelSchedulingResult.class, "AssistModelSchedulingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAssistModelSchedulingResult_Name(), theEcorePackage.getEString(), "name", "", 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssistModelSchedulingResult_HyperPeriodLength(), theEcorePackage.getEInt(), "hyperPeriodLength", "-1", 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModelSchedulingResult_Model(), this.getAssistModel(), null, "model", null, 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssistModelSchedulingResult_Schedule(), this.getTask2ExecutionInstancesMapType(), "schedule", null, 0, 1, AssistModelSchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(taskExecutionInstanceEClass, TaskExecutionInstance.class, "TaskExecutionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTaskExecutionInstance_Begin(), theEcorePackage.getEInt(), "begin", "-1", 0, 1, TaskExecutionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTaskExecutionInstance_End(), theEcorePackage.getEInt(), "end", "-1", 0, 1, TaskExecutionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(colorEEnum, Color.class, "Color");
        addEEnumLiteral(colorEEnum, Color.NONE);
        addEEnumLiteral(colorEEnum, Color.BLACK);
        addEEnumLiteral(colorEEnum, Color.BLUE);
        addEEnumLiteral(colorEEnum, Color.CYAN);
        addEEnumLiteral(colorEEnum, Color.GRAY);
        addEEnumLiteral(colorEEnum, Color.GREEN);
        addEEnumLiteral(colorEEnum, Color.MAGENTA);
        addEEnumLiteral(colorEEnum, Color.RED);
        addEEnumLiteral(colorEEnum, Color.WHITE);
        addEEnumLiteral(colorEEnum, Color.YELLOW);
        addEEnumLiteral(colorEEnum, Color.DARK_BLUE);
        addEEnumLiteral(colorEEnum, Color.DARK_CYAN);
        addEEnumLiteral(colorEEnum, Color.DARK_GRAY);
        addEEnumLiteral(colorEEnum, Color.DARK_GREEN);
        addEEnumLiteral(colorEEnum, Color.DARK_MAGENTA);
        addEEnumLiteral(colorEEnum, Color.DARK_RED);
        addEEnumLiteral(colorEEnum, Color.DARK_YELLOW);

        initEEnum(dissimilarityAttributesEEnum, DissimilarityAttributes.class, "DissimilarityAttributes");
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.COMPARTMENT_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.COMPARTMENT_POWERSUPPLY);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOX_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_BOARDTYPE);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_POWERSUPPLY);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_ASSURANCELEVEL);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.PROCESSOR_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.PROCESSOR_PROCESSORTYPE);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.CORE_ARCHITECTURE);

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

        initEEnum(periodicityTypeEEnum, PeriodicityType.class, "PeriodicityType");
        addEEnumLiteral(periodicityTypeEEnum, PeriodicityType.STRICT);
        addEEnumLiteral(periodicityTypeEEnum, PeriodicityType.FLEXIBLE);

        // Initialize data types
        initEDataType(task2CoreMapTypeEDataType, HashMap.class, "Task2CoreMapType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.model.Task, ch.hilbri.assist.model.Core>");
        initEDataType(stringListEDataType, List.class, "StringList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.String>");
        initEDataType(task2ExecutionInstancesMapTypeEDataType, HashMap.class, "Task2ExecutionInstancesMapType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.model.Task, java.util.List<ch.hilbri.assist.model.TaskExecutionInstance>>");

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
