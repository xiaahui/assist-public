/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.ApplicationAlternatives;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.AssistModelSchedulingResult;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardAlternative;
import ch.hilbri.assist.model.BoardAlternatives;
import ch.hilbri.assist.model.Box;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            case ModelPackage.HARDWARE_ELEMENT: return createHardwareElement();
            case ModelPackage.COMPARTMENT: return createCompartment();
            case ModelPackage.BOX: return createBox();
            case ModelPackage.BOARD_ALTERNATIVES: return createBoardAlternatives();
            case ModelPackage.BOARD_ALTERNATIVE: return createBoardAlternative();
            case ModelPackage.BOARD: return createBoard();
            case ModelPackage.PROCESSOR: return createProcessor();
            case ModelPackage.CORE: return createCore();
            case ModelPackage.IO_ADAPTER: return createIOAdapter();
            case ModelPackage.APPLICATION_ALTERNATIVES: return createApplicationAlternatives();
            case ModelPackage.APPLICATION_ALTERNATIVE: return createApplicationAlternative();
            case ModelPackage.APPLICATION: return createApplication();
            case ModelPackage.TASK: return createTask();
            case ModelPackage.IO_ADAPTER_REQUIREMENT: return createIOAdapterRequirement();
            case ModelPackage.DISLOCALITY_RELATION: return createDislocalityRelation();
            case ModelPackage.COLOCALITY_RELATION: return createColocalityRelation();
            case ModelPackage.DISSIMILARITY_RELATION: return createDissimilarityRelation();
            case ModelPackage.DISSIMILARITY_CLAUSE: return createDissimilarityClause();
            case ModelPackage.DISSIMILARITY_DISJUNCTION: return createDissimilarityDisjunction();
            case ModelPackage.DISSIMILARITY_CONJUNCTION: return createDissimilarityConjunction();
            case ModelPackage.DISSIMILARITY_ENTRY: return createDissimilarityEntry();
            case ModelPackage.METRIC_PARAMETER: return createMetricParameter();
            case ModelPackage.RESTRICTION_ALTERNATIVES: return createRestrictionAlternatives();
            case ModelPackage.RESTRICTION_ALTERNATIVE: return createRestrictionAlternative();
            case ModelPackage.EXPLORATION_CANDIDATE: return createExplorationCandidate();
            case ModelPackage.METRIC_SCORE_PAIR: return (EObject)createMetricScorePair();
            case ModelPackage.MAPPING_RESULT: return createMappingResult();
            case ModelPackage.SINGLE_MAPPING_ELEMENT: return createSingleMappingElement();
            case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT: return createAssistModelSchedulingResult();
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
            case ModelPackage.COLOR:
                return createColorFromString(eDataType, initialValue);
            case ModelPackage.DISSIMILARITY_ATTRIBUTES:
                return createDissimilarityAttributesFromString(eDataType, initialValue);
            case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
                return createHardwareArchitectureLevelTypeFromString(eDataType, initialValue);
            case ModelPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
                return createDesignAssuranceLevelTypeFromString(eDataType, initialValue);
            case ModelPackage.IO_ADAPTER_TYPE:
                return createIOAdapterTypeFromString(eDataType, initialValue);
            case ModelPackage.PERIODICITY_TYPE:
                return createPeriodicityTypeFromString(eDataType, initialValue);
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
            case ModelPackage.COLOR:
                return convertColorToString(eDataType, instanceValue);
            case ModelPackage.DISSIMILARITY_ATTRIBUTES:
                return convertDissimilarityAttributesToString(eDataType, instanceValue);
            case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
                return convertHardwareArchitectureLevelTypeToString(eDataType, instanceValue);
            case ModelPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
                return convertDesignAssuranceLevelTypeToString(eDataType, instanceValue);
            case ModelPackage.IO_ADAPTER_TYPE:
                return convertIOAdapterTypeToString(eDataType, instanceValue);
            case ModelPackage.PERIODICITY_TYPE:
                return convertPeriodicityTypeToString(eDataType, instanceValue);
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
    public IOAdapter createIOAdapter() {
        IOAdapterImpl ioAdapter = new IOAdapterImpl();
        return ioAdapter;
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
    public IOAdapterRequirement createIOAdapterRequirement() {
        IOAdapterRequirementImpl ioAdapterRequirement = new IOAdapterRequirementImpl();
        return ioAdapterRequirement;
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
    public MetricParameter createMetricParameter() {
        MetricParameterImpl metricParameter = new MetricParameterImpl();
        return metricParameter;
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
    public Map.Entry<AbstractMetric, Double> createMetricScorePair() {
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
    public AssistModelSchedulingResult createAssistModelSchedulingResult() {
        AssistModelSchedulingResultImpl assistModelSchedulingResult = new AssistModelSchedulingResultImpl();
        return assistModelSchedulingResult;
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
    public IOAdapterType createIOAdapterTypeFromString(EDataType eDataType, String initialValue) {
        IOAdapterType result = IOAdapterType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIOAdapterTypeToString(EDataType eDataType, Object instanceValue) {
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