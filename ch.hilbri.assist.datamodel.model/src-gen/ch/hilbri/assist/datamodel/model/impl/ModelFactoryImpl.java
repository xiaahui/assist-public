/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ApplicationGroup;
import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.BoardAttributes;
import ch.hilbri.assist.datamodel.model.Box;
import ch.hilbri.assist.datamodel.model.BoxAttributes;
import ch.hilbri.assist.datamodel.model.CommunicationRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.CompartmentAttributes;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.DissimilarityClause;
import ch.hilbri.assist.datamodel.model.DissimilarityConjunction;
import ch.hilbri.assist.datamodel.model.DissimilarityDisjunction;
import ch.hilbri.assist.datamodel.model.DissimilarityEntry;
import ch.hilbri.assist.datamodel.model.DissimilarityRelation;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.HardwareElementContainer;
import ch.hilbri.assist.datamodel.model.IOAdapter;
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterRequirement;
import ch.hilbri.assist.datamodel.model.IOAdapterType;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelFactory;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.Network;
import ch.hilbri.assist.datamodel.model.Processor;
import ch.hilbri.assist.datamodel.model.ProcessorAttributes;
import ch.hilbri.assist.datamodel.model.ProximityRelation;
import ch.hilbri.assist.datamodel.model.ReferencePointType;
import ch.hilbri.assist.datamodel.model.SchedulingRelation;

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
			case ModelPackage.HARDWARE_ELEMENT_CONTAINER: return createHardwareElementContainer();
			case ModelPackage.COMPARTMENT: return createCompartment();
			case ModelPackage.BOX: return createBox();
			case ModelPackage.BOARD: return createBoard();
			case ModelPackage.PROCESSOR: return createProcessor();
			case ModelPackage.CORE: return createCore();
			case ModelPackage.IO_ADAPTER: return createIOAdapter();
			case ModelPackage.NETWORK: return createNetwork();
			case ModelPackage.APPLICATION_OR_APPLICATION_GROUP: return createApplicationOrApplicationGroup();
			case ModelPackage.APPLICATION_GROUP: return createApplicationGroup();
			case ModelPackage.APPLICATION: return createApplication();
			case ModelPackage.THREAD: return createThread();
			case ModelPackage.IO_ADAPTER_REQUIREMENT: return createIOAdapterRequirement();
			case ModelPackage.DISSIMILARITY_RELATION: return createDissimilarityRelation();
			case ModelPackage.DISSIMILARITY_CLAUSE: return createDissimilarityClause();
			case ModelPackage.DISSIMILARITY_DISJUNCTION: return createDissimilarityDisjunction();
			case ModelPackage.DISSIMILARITY_CONJUNCTION: return createDissimilarityConjunction();
			case ModelPackage.DISSIMILARITY_ENTRY: return createDissimilarityEntry();
			case ModelPackage.DISLOCALITY_RELATION: return createDislocalityRelation();
			case ModelPackage.PROXIMITY_RELATION: return createProximityRelation();
			case ModelPackage.COMMUNICATION_RELATION: return createCommunicationRelation();
			case ModelPackage.SCHEDULING_RELATION: return createSchedulingRelation();
			case ModelPackage.METRIC_PARAMETER: return createMetricParameter();
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
			case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
				return createHardwareArchitectureLevelTypeFromString(eDataType, initialValue);
			case ModelPackage.IO_ADAPTER_PROTECTION_LEVEL_TYPE:
				return createIOAdapterProtectionLevelTypeFromString(eDataType, initialValue);
			case ModelPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
				return createDesignAssuranceLevelTypeFromString(eDataType, initialValue);
			case ModelPackage.IO_ADAPTER_TYPE:
				return createIOAdapterTypeFromString(eDataType, initialValue);
			case ModelPackage.COMPARTMENT_ATTRIBUTES:
				return createCompartmentAttributesFromString(eDataType, initialValue);
			case ModelPackage.BOX_ATTRIBUTES:
				return createBoxAttributesFromString(eDataType, initialValue);
			case ModelPackage.BOARD_ATTRIBUTES:
				return createBoardAttributesFromString(eDataType, initialValue);
			case ModelPackage.PROCESSOR_ATTRIBUTES:
				return createProcessorAttributesFromString(eDataType, initialValue);
			case ModelPackage.REFERENCE_POINT_TYPE:
				return createReferencePointTypeFromString(eDataType, initialValue);
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
			case ModelPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
				return convertHardwareArchitectureLevelTypeToString(eDataType, instanceValue);
			case ModelPackage.IO_ADAPTER_PROTECTION_LEVEL_TYPE:
				return convertIOAdapterProtectionLevelTypeToString(eDataType, instanceValue);
			case ModelPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
				return convertDesignAssuranceLevelTypeToString(eDataType, instanceValue);
			case ModelPackage.IO_ADAPTER_TYPE:
				return convertIOAdapterTypeToString(eDataType, instanceValue);
			case ModelPackage.COMPARTMENT_ATTRIBUTES:
				return convertCompartmentAttributesToString(eDataType, instanceValue);
			case ModelPackage.BOX_ATTRIBUTES:
				return convertBoxAttributesToString(eDataType, instanceValue);
			case ModelPackage.BOARD_ATTRIBUTES:
				return convertBoardAttributesToString(eDataType, instanceValue);
			case ModelPackage.PROCESSOR_ATTRIBUTES:
				return convertProcessorAttributesToString(eDataType, instanceValue);
			case ModelPackage.REFERENCE_POINT_TYPE:
				return convertReferencePointTypeToString(eDataType, instanceValue);
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
	public HardwareElementContainer createHardwareElementContainer() {
		HardwareElementContainerImpl hardwareElementContainer = new HardwareElementContainerImpl();
		return hardwareElementContainer;
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
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationOrApplicationGroup createApplicationOrApplicationGroup() {
		ApplicationOrApplicationGroupImpl applicationOrApplicationGroup = new ApplicationOrApplicationGroupImpl();
		return applicationOrApplicationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationGroup createApplicationGroup() {
		ApplicationGroupImpl applicationGroup = new ApplicationGroupImpl();
		return applicationGroup;
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
	public ch.hilbri.assist.datamodel.model.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
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
	public DislocalityRelation createDislocalityRelation() {
		DislocalityRelationImpl dislocalityRelation = new DislocalityRelationImpl();
		return dislocalityRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProximityRelation createProximityRelation() {
		ProximityRelationImpl proximityRelation = new ProximityRelationImpl();
		return proximityRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRelation createCommunicationRelation() {
		CommunicationRelationImpl communicationRelation = new CommunicationRelationImpl();
		return communicationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingRelation createSchedulingRelation() {
		SchedulingRelationImpl schedulingRelation = new SchedulingRelationImpl();
		return schedulingRelation;
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
	public IOAdapterProtectionLevelType createIOAdapterProtectionLevelTypeFromString(EDataType eDataType, String initialValue) {
		IOAdapterProtectionLevelType result = IOAdapterProtectionLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOAdapterProtectionLevelTypeToString(EDataType eDataType, Object instanceValue) {
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
	public CompartmentAttributes createCompartmentAttributesFromString(EDataType eDataType, String initialValue) {
		CompartmentAttributes result = CompartmentAttributes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentAttributesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxAttributes createBoxAttributesFromString(EDataType eDataType, String initialValue) {
		BoxAttributes result = BoxAttributes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoxAttributesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardAttributes createBoardAttributesFromString(EDataType eDataType, String initialValue) {
		BoardAttributes result = BoardAttributes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoardAttributesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorAttributes createProcessorAttributesFromString(EDataType eDataType, String initialValue) {
		ProcessorAttributes result = ProcessorAttributes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorAttributesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencePointType createReferencePointTypeFromString(EDataType eDataType, String initialValue) {
		ReferencePointType result = ReferencePointType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferencePointTypeToString(EDataType eDataType, Object instanceValue) {
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
