/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AbstractMappingMetric;
import ch.hilbri.assist.model.AddInitTimeProperty;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.ApplicationAlternatives;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardAlternative;
import ch.hilbri.assist.model.BoardAlternatives;
import ch.hilbri.assist.model.BoardTypeProperty;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.Color;
import ch.hilbri.assist.model.ColorProperty;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.ComplexRelation;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CoreArchitectureProperty;
import ch.hilbri.assist.model.CoreCapacityProperty;
import ch.hilbri.assist.model.CoreUtilizationProperty;
import ch.hilbri.assist.model.CriticalityLevelProperty;
import ch.hilbri.assist.model.CustomIntProperty;
import ch.hilbri.assist.model.CustomProperty;
import ch.hilbri.assist.model.CustomStringProperty;
import ch.hilbri.assist.model.DesignAssuranceLevelProperty;
import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.DevelopedByProperty;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityAttributes;
import ch.hilbri.assist.model.DissimilarityClause;
import ch.hilbri.assist.model.DissimilarityConjunction;
import ch.hilbri.assist.model.DissimilarityDisjunction;
import ch.hilbri.assist.model.DissimilarityEntry;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.DurationProperty;
import ch.hilbri.assist.model.EarlyToleranceProperty;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.ExplorationResult;
import ch.hilbri.assist.model.Feature;
import ch.hilbri.assist.model.FeatureRequirement;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.IntProperty;
import ch.hilbri.assist.model.LateToleranceProperty;
import ch.hilbri.assist.model.ManufacturerProperty;
import ch.hilbri.assist.model.MappingRelation;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.MaxEndTimeProperty;
import ch.hilbri.assist.model.MaxStartTimeProperty;
import ch.hilbri.assist.model.MinSliceDurationProperty;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PeriodProperty;
import ch.hilbri.assist.model.PeriodicityProperty;
import ch.hilbri.assist.model.PeriodicityType;
import ch.hilbri.assist.model.PowerSupplyProperty;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.ProcessorTypeProperty;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.RAMCapacityProperty;
import ch.hilbri.assist.model.RAMUtilizationProperty;
import ch.hilbri.assist.model.ROMCapacityProperty;
import ch.hilbri.assist.model.ROMUtilizationProperty;
import ch.hilbri.assist.model.RestrictionAlternative;
import ch.hilbri.assist.model.RestrictionAlternatives;
import ch.hilbri.assist.model.RestrictionDisjointExecution;
import ch.hilbri.assist.model.RestrictionFinishAtTheSameTime;
import ch.hilbri.assist.model.RestrictionStartAfterOtherFinished;
import ch.hilbri.assist.model.RestrictionStartAfterOtherStarted;
import ch.hilbri.assist.model.RestrictionStartAtTheSameTime;
import ch.hilbri.assist.model.SchedulingRestriction;
import ch.hilbri.assist.model.SchedulingResult;
import ch.hilbri.assist.model.SimpleRelation;
import ch.hilbri.assist.model.SingleMappingElement;
import ch.hilbri.assist.model.SlicesProperty;
import ch.hilbri.assist.model.SoftwareElement;
import ch.hilbri.assist.model.StringProperty;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskExecutionInstance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

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
            case ModelPackage.PROPERTY: return createProperty();
            case ModelPackage.STRING_PROPERTY: return createStringProperty();
            case ModelPackage.INT_PROPERTY: return createIntProperty();
            case ModelPackage.MANUFACTURER_PROPERTY: return createManufacturerProperty();
            case ModelPackage.POWER_SUPPLY_PROPERTY: return createPowerSupplyProperty();
            case ModelPackage.BOARD_TYPE_PROPERTY: return createBoardTypeProperty();
            case ModelPackage.PROCESSOR_TYPE_PROPERTY: return createProcessorTypeProperty();
            case ModelPackage.RAM_CAPACITY_PROPERTY: return createRAMCapacityProperty();
            case ModelPackage.RAM_UTILIZATION_PROPERTY: return createRAMUtilizationProperty();
            case ModelPackage.ROM_CAPACITY_PROPERTY: return createROMCapacityProperty();
            case ModelPackage.ROM_UTILIZATION_PROPERTY: return createROMUtilizationProperty();
            case ModelPackage.CORE_CAPACITY_PROPERTY: return createCoreCapacityProperty();
            case ModelPackage.CORE_UTILIZATION_PROPERTY: return createCoreUtilizationProperty();
            case ModelPackage.CORE_ARCHITECTURE_PROPERTY: return createCoreArchitectureProperty();
            case ModelPackage.DEVELOPED_BY_PROPERTY: return createDevelopedByProperty();
            case ModelPackage.DURATION_PROPERTY: return createDurationProperty();
            case ModelPackage.PERIOD_PROPERTY: return createPeriodProperty();
            case ModelPackage.EARLY_TOLERANCE_PROPERTY: return createEarlyToleranceProperty();
            case ModelPackage.LATE_TOLERANCE_PROPERTY: return createLateToleranceProperty();
            case ModelPackage.MAX_START_TIME_PROPERTY: return createMaxStartTimeProperty();
            case ModelPackage.MAX_END_TIME_PROPERTY: return createMaxEndTimeProperty();
            case ModelPackage.ADD_INIT_TIME_PROPERTY: return createAddInitTimeProperty();
            case ModelPackage.SLICES_PROPERTY: return createSlicesProperty();
            case ModelPackage.MIN_SLICE_DURATION_PROPERTY: return createMinSliceDurationProperty();
            case ModelPackage.DESIGN_ASSURANCE_LEVEL_PROPERTY: return createDesignAssuranceLevelProperty();
            case ModelPackage.CRITICALITY_LEVEL_PROPERTY: return createCriticalityLevelProperty();
            case ModelPackage.PERIODICITY_PROPERTY: return createPeriodicityProperty();
            case ModelPackage.COLOR_PROPERTY: return createColorProperty();
            case ModelPackage.CUSTOM_PROPERTY: return createCustomProperty();
            case ModelPackage.CUSTOM_INT_PROPERTY: return createCustomIntProperty();
            case ModelPackage.CUSTOM_STRING_PROPERTY: return createCustomStringProperty();
            case ModelPackage.HARDWARE_ELEMENT: return createHardwareElement();
            case ModelPackage.FEATURE: return createFeature();
            case ModelPackage.COMPARTMENT: return createCompartment();
            case ModelPackage.BOX: return createBox();
            case ModelPackage.BOARD_ALTERNATIVES: return createBoardAlternatives();
            case ModelPackage.BOARD_ALTERNATIVE: return createBoardAlternative();
            case ModelPackage.BOARD: return createBoard();
            case ModelPackage.PROCESSOR: return createProcessor();
            case ModelPackage.CORE: return createCore();
            case ModelPackage.APPLICATION_ALTERNATIVES: return createApplicationAlternatives();
            case ModelPackage.APPLICATION_ALTERNATIVE: return createApplicationAlternative();
            case ModelPackage.SOFTWARE_ELEMENT: return createSoftwareElement();
            case ModelPackage.APPLICATION: return createApplication();
            case ModelPackage.TASK: return createTask();
            case ModelPackage.FEATURE_REQUIREMENT: return createFeatureRequirement();
            case ModelPackage.MAPPING_RELATION: return createMappingRelation();
            case ModelPackage.DISLOCALITY_RELATION: return createDislocalityRelation();
            case ModelPackage.COLOCALITY_RELATION: return createColocalityRelation();
            case ModelPackage.DISSIMILARITY_RELATION: return createDissimilarityRelation();
            case ModelPackage.DISSIMILARITY_CLAUSE: return createDissimilarityClause();
            case ModelPackage.DISSIMILARITY_DISJUNCTION: return createDissimilarityDisjunction();
            case ModelPackage.DISSIMILARITY_CONJUNCTION: return createDissimilarityConjunction();
            case ModelPackage.DISSIMILARITY_ENTRY: return createDissimilarityEntry();
            case ModelPackage.SCHEDULING_RESTRICTION: return createSchedulingRestriction();
            case ModelPackage.SIMPLE_RELATION: return createSimpleRelation();
            case ModelPackage.COMPLEX_RELATION: return createComplexRelation();
            case ModelPackage.RESTRICTION_START_AT_THE_SAME_TIME: return createRestrictionStartAtTheSameTime();
            case ModelPackage.RESTRICTION_FINISH_AT_THE_SAME_TIME: return createRestrictionFinishAtTheSameTime();
            case ModelPackage.RESTRICTION_START_AFTER_OTHER_FINISHED: return createRestrictionStartAfterOtherFinished();
            case ModelPackage.RESTRICTION_START_AFTER_OTHER_STARTED: return createRestrictionStartAfterOtherStarted();
            case ModelPackage.RESTRICTION_DISJOINT_EXECUTION: return createRestrictionDisjointExecution();
            case ModelPackage.RESTRICTION_ALTERNATIVES: return createRestrictionAlternatives();
            case ModelPackage.RESTRICTION_ALTERNATIVE: return createRestrictionAlternative();
            case ModelPackage.EXPLORATION_CANDIDATE: return createExplorationCandidate();
            case ModelPackage.EXPLORATION_RESULT: return createExplorationResult();
            case ModelPackage.METRIC_SCORE_PAIR: return (EObject)createMetricScorePair();
            case ModelPackage.MAPPING_RESULT: return createMappingResult();
            case ModelPackage.SINGLE_MAPPING_ELEMENT: return createSingleMappingElement();
            case ModelPackage.SCHEDULING_RESULT: return createSchedulingResult();
            case ModelPackage.TASK_EXECUTION_INSTANCE: return createTaskExecutionInstance();
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
            case ModelPackage.DISSIMILARITY_ATTRIBUTES:
                return createDissimilarityAttributesFromString(eDataType, initialValue);
            case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
                return createHardwareArchitectureLevelTypeFromString(eDataType, initialValue);
            case ModelPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
                return createDesignAssuranceLevelTypeFromString(eDataType, initialValue);
            case ModelPackage.PERIODICITY_TYPE:
                return createPeriodicityTypeFromString(eDataType, initialValue);
            case ModelPackage.COLOR:
                return createColorFromString(eDataType, initialValue);
            case ModelPackage.LIST_OF_TASK_LISTS:
                return createListOfTaskListsFromString(eDataType, initialValue);
            case ModelPackage.TASK2_CORE_MAP_TYPE:
                return createTask2CoreMapTypeFromString(eDataType, initialValue);
            case ModelPackage.STRING_LIST:
                return createStringListFromString(eDataType, initialValue);
            case ModelPackage.TASK2_EXECUTION_INSTANCES_MAP_TYPE:
                return createTask2ExecutionInstancesMapTypeFromString(eDataType, initialValue);
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
            case ModelPackage.DISSIMILARITY_ATTRIBUTES:
                return convertDissimilarityAttributesToString(eDataType, instanceValue);
            case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
                return convertHardwareArchitectureLevelTypeToString(eDataType, instanceValue);
            case ModelPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
                return convertDesignAssuranceLevelTypeToString(eDataType, instanceValue);
            case ModelPackage.PERIODICITY_TYPE:
                return convertPeriodicityTypeToString(eDataType, instanceValue);
            case ModelPackage.COLOR:
                return convertColorToString(eDataType, instanceValue);
            case ModelPackage.LIST_OF_TASK_LISTS:
                return convertListOfTaskListsToString(eDataType, instanceValue);
            case ModelPackage.TASK2_CORE_MAP_TYPE:
                return convertTask2CoreMapTypeToString(eDataType, instanceValue);
            case ModelPackage.STRING_LIST:
                return convertStringListToString(eDataType, instanceValue);
            case ModelPackage.TASK2_EXECUTION_INSTANCES_MAP_TYPE:
                return convertTask2ExecutionInstancesMapTypeToString(eDataType, instanceValue);
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
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringProperty createStringProperty() {
        StringPropertyImpl stringProperty = new StringPropertyImpl();
        return stringProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntProperty createIntProperty() {
        IntPropertyImpl intProperty = new IntPropertyImpl();
        return intProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManufacturerProperty createManufacturerProperty() {
        ManufacturerPropertyImpl manufacturerProperty = new ManufacturerPropertyImpl();
        return manufacturerProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerSupplyProperty createPowerSupplyProperty() {
        PowerSupplyPropertyImpl powerSupplyProperty = new PowerSupplyPropertyImpl();
        return powerSupplyProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoardTypeProperty createBoardTypeProperty() {
        BoardTypePropertyImpl boardTypeProperty = new BoardTypePropertyImpl();
        return boardTypeProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorTypeProperty createProcessorTypeProperty() {
        ProcessorTypePropertyImpl processorTypeProperty = new ProcessorTypePropertyImpl();
        return processorTypeProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RAMCapacityProperty createRAMCapacityProperty() {
        RAMCapacityPropertyImpl ramCapacityProperty = new RAMCapacityPropertyImpl();
        return ramCapacityProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RAMUtilizationProperty createRAMUtilizationProperty() {
        RAMUtilizationPropertyImpl ramUtilizationProperty = new RAMUtilizationPropertyImpl();
        return ramUtilizationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ROMCapacityProperty createROMCapacityProperty() {
        ROMCapacityPropertyImpl romCapacityProperty = new ROMCapacityPropertyImpl();
        return romCapacityProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ROMUtilizationProperty createROMUtilizationProperty() {
        ROMUtilizationPropertyImpl romUtilizationProperty = new ROMUtilizationPropertyImpl();
        return romUtilizationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoreCapacityProperty createCoreCapacityProperty() {
        CoreCapacityPropertyImpl coreCapacityProperty = new CoreCapacityPropertyImpl();
        return coreCapacityProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoreUtilizationProperty createCoreUtilizationProperty() {
        CoreUtilizationPropertyImpl coreUtilizationProperty = new CoreUtilizationPropertyImpl();
        return coreUtilizationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoreArchitectureProperty createCoreArchitectureProperty() {
        CoreArchitecturePropertyImpl coreArchitectureProperty = new CoreArchitecturePropertyImpl();
        return coreArchitectureProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DevelopedByProperty createDevelopedByProperty() {
        DevelopedByPropertyImpl developedByProperty = new DevelopedByPropertyImpl();
        return developedByProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DurationProperty createDurationProperty() {
        DurationPropertyImpl durationProperty = new DurationPropertyImpl();
        return durationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeriodProperty createPeriodProperty() {
        PeriodPropertyImpl periodProperty = new PeriodPropertyImpl();
        return periodProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EarlyToleranceProperty createEarlyToleranceProperty() {
        EarlyTolerancePropertyImpl earlyToleranceProperty = new EarlyTolerancePropertyImpl();
        return earlyToleranceProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LateToleranceProperty createLateToleranceProperty() {
        LateTolerancePropertyImpl lateToleranceProperty = new LateTolerancePropertyImpl();
        return lateToleranceProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaxStartTimeProperty createMaxStartTimeProperty() {
        MaxStartTimePropertyImpl maxStartTimeProperty = new MaxStartTimePropertyImpl();
        return maxStartTimeProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaxEndTimeProperty createMaxEndTimeProperty() {
        MaxEndTimePropertyImpl maxEndTimeProperty = new MaxEndTimePropertyImpl();
        return maxEndTimeProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddInitTimeProperty createAddInitTimeProperty() {
        AddInitTimePropertyImpl addInitTimeProperty = new AddInitTimePropertyImpl();
        return addInitTimeProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SlicesProperty createSlicesProperty() {
        SlicesPropertyImpl slicesProperty = new SlicesPropertyImpl();
        return slicesProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinSliceDurationProperty createMinSliceDurationProperty() {
        MinSliceDurationPropertyImpl minSliceDurationProperty = new MinSliceDurationPropertyImpl();
        return minSliceDurationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DesignAssuranceLevelProperty createDesignAssuranceLevelProperty() {
        DesignAssuranceLevelPropertyImpl designAssuranceLevelProperty = new DesignAssuranceLevelPropertyImpl();
        return designAssuranceLevelProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CriticalityLevelProperty createCriticalityLevelProperty() {
        CriticalityLevelPropertyImpl criticalityLevelProperty = new CriticalityLevelPropertyImpl();
        return criticalityLevelProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeriodicityProperty createPeriodicityProperty() {
        PeriodicityPropertyImpl periodicityProperty = new PeriodicityPropertyImpl();
        return periodicityProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorProperty createColorProperty() {
        ColorPropertyImpl colorProperty = new ColorPropertyImpl();
        return colorProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomProperty createCustomProperty() {
        CustomPropertyImpl customProperty = new CustomPropertyImpl();
        return customProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomIntProperty createCustomIntProperty() {
        CustomIntPropertyImpl customIntProperty = new CustomIntPropertyImpl();
        return customIntProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomStringProperty createCustomStringProperty() {
        CustomStringPropertyImpl customStringProperty = new CustomStringPropertyImpl();
        return customStringProperty;
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
    public Feature createFeature() {
        FeatureImpl feature = new FeatureImpl();
        return feature;
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
    public Box createBox() {
        BoxImpl box = new BoxImpl();
        return box;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoardAlternatives createBoardAlternatives() {
        BoardAlternativesImpl boardAlternatives = new BoardAlternativesImpl();
        return boardAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoardAlternative createBoardAlternative() {
        BoardAlternativeImpl boardAlternative = new BoardAlternativeImpl();
        return boardAlternative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Board createBoard() {
        BoardImpl board = new BoardImpl();
        return board;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Processor createProcessor() {
        ProcessorImpl processor = new ProcessorImpl();
        return processor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Core createCore() {
        CoreImpl core = new CoreImpl();
        return core;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationAlternatives createApplicationAlternatives() {
        ApplicationAlternativesImpl applicationAlternatives = new ApplicationAlternativesImpl();
        return applicationAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationAlternative createApplicationAlternative() {
        ApplicationAlternativeImpl applicationAlternative = new ApplicationAlternativeImpl();
        return applicationAlternative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoftwareElement createSoftwareElement() {
        SoftwareElementImpl softwareElement = new SoftwareElementImpl();
        return softwareElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Application createApplication() {
        ApplicationImpl application = new ApplicationImpl();
        return application;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task createTask() {
        TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureRequirement createFeatureRequirement() {
        FeatureRequirementImpl featureRequirement = new FeatureRequirementImpl();
        return featureRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingRelation createMappingRelation() {
        MappingRelationImpl mappingRelation = new MappingRelationImpl();
        return mappingRelation;
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
    public DissimilarityRelation createDissimilarityRelation() {
        DissimilarityRelationImpl dissimilarityRelation = new DissimilarityRelationImpl();
        return dissimilarityRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DissimilarityClause createDissimilarityClause() {
        DissimilarityClauseImpl dissimilarityClause = new DissimilarityClauseImpl();
        return dissimilarityClause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DissimilarityDisjunction createDissimilarityDisjunction() {
        DissimilarityDisjunctionImpl dissimilarityDisjunction = new DissimilarityDisjunctionImpl();
        return dissimilarityDisjunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DissimilarityConjunction createDissimilarityConjunction() {
        DissimilarityConjunctionImpl dissimilarityConjunction = new DissimilarityConjunctionImpl();
        return dissimilarityConjunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DissimilarityEntry createDissimilarityEntry() {
        DissimilarityEntryImpl dissimilarityEntry = new DissimilarityEntryImpl();
        return dissimilarityEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchedulingRestriction createSchedulingRestriction() {
        SchedulingRestrictionImpl schedulingRestriction = new SchedulingRestrictionImpl();
        return schedulingRestriction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleRelation createSimpleRelation() {
        SimpleRelationImpl simpleRelation = new SimpleRelationImpl();
        return simpleRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexRelation createComplexRelation() {
        ComplexRelationImpl complexRelation = new ComplexRelationImpl();
        return complexRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionStartAtTheSameTime createRestrictionStartAtTheSameTime() {
        RestrictionStartAtTheSameTimeImpl restrictionStartAtTheSameTime = new RestrictionStartAtTheSameTimeImpl();
        return restrictionStartAtTheSameTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionFinishAtTheSameTime createRestrictionFinishAtTheSameTime() {
        RestrictionFinishAtTheSameTimeImpl restrictionFinishAtTheSameTime = new RestrictionFinishAtTheSameTimeImpl();
        return restrictionFinishAtTheSameTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionStartAfterOtherFinished createRestrictionStartAfterOtherFinished() {
        RestrictionStartAfterOtherFinishedImpl restrictionStartAfterOtherFinished = new RestrictionStartAfterOtherFinishedImpl();
        return restrictionStartAfterOtherFinished;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionStartAfterOtherStarted createRestrictionStartAfterOtherStarted() {
        RestrictionStartAfterOtherStartedImpl restrictionStartAfterOtherStarted = new RestrictionStartAfterOtherStartedImpl();
        return restrictionStartAfterOtherStarted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionDisjointExecution createRestrictionDisjointExecution() {
        RestrictionDisjointExecutionImpl restrictionDisjointExecution = new RestrictionDisjointExecutionImpl();
        return restrictionDisjointExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionAlternatives createRestrictionAlternatives() {
        RestrictionAlternativesImpl restrictionAlternatives = new RestrictionAlternativesImpl();
        return restrictionAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionAlternative createRestrictionAlternative() {
        RestrictionAlternativeImpl restrictionAlternative = new RestrictionAlternativeImpl();
        return restrictionAlternative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplorationCandidate createExplorationCandidate() {
        ExplorationCandidateImpl explorationCandidate = new ExplorationCandidateImpl();
        return explorationCandidate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplorationResult createExplorationResult() {
        ExplorationResultImpl explorationResult = new ExplorationResultImpl();
        return explorationResult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<AbstractMappingMetric, Double> createMetricScorePair() {
        MetricScorePairImpl metricScorePair = new MetricScorePairImpl();
        return metricScorePair;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingResult createMappingResult() {
        MappingResultImpl mappingResult = new MappingResultImpl();
        return mappingResult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SingleMappingElement createSingleMappingElement() {
        SingleMappingElementImpl singleMappingElement = new SingleMappingElementImpl();
        return singleMappingElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchedulingResult createSchedulingResult() {
        SchedulingResultImpl schedulingResult = new SchedulingResultImpl();
        return schedulingResult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TaskExecutionInstance createTaskExecutionInstance() {
        TaskExecutionInstanceImpl taskExecutionInstance = new TaskExecutionInstanceImpl();
        return taskExecutionInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DissimilarityAttributes createDissimilarityAttributesFromString(EDataType eDataType, String initialValue) {
        DissimilarityAttributes result = DissimilarityAttributes.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDissimilarityAttributesToString(EDataType eDataType, Object instanceValue) {
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
    public DesignAssuranceLevelType createDesignAssuranceLevelTypeFromString(EDataType eDataType, String initialValue) {
        DesignAssuranceLevelType result = DesignAssuranceLevelType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDesignAssuranceLevelTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeriodicityType createPeriodicityTypeFromString(EDataType eDataType, String initialValue) {
        PeriodicityType result = PeriodicityType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPeriodicityTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color createColorFromString(EDataType eDataType, String initialValue) {
        Color result = Color.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertColorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<EList<Task>> createListOfTaskListsFromString(EDataType eDataType, String initialValue) {
        return (EList<EList<Task>>)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertListOfTaskListsToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public HashMap<Task, Core> createTask2CoreMapTypeFromString(EDataType eDataType, String initialValue) {
        return (HashMap<Task, Core>)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTask2CoreMapTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public List<String> createStringListFromString(EDataType eDataType, String initialValue) {
        return (List<String>)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStringListToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public HashMap<Task, List<TaskExecutionInstance>> createTask2ExecutionInstancesMapTypeFromString(EDataType eDataType, String initialValue) {
        return (HashMap<Task, List<TaskExecutionInstance>>)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTask2ExecutionInstancesMapTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
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
