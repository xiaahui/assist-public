/**
 */
package ch.hilbri.assist.impl;

import ch.hilbri.assist.*;

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
public class AssistFactoryImpl extends EFactoryImpl implements AssistFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssistFactory init() {
		try {
			AssistFactory theAssistFactory = (AssistFactory)EPackage.Registry.INSTANCE.getEFactory(AssistPackage.eNS_URI);
			if (theAssistFactory != null) {
				return theAssistFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssistFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistFactoryImpl() {
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
			case AssistPackage.ASSIST_MODEL: return createAssistModel();
			case AssistPackage.HARDWARE_ELEMENT: return createHardwareElement();
			case AssistPackage.HARDWARE_ELEMENT_CONTAINER: return createHardwareElementContainer();
			case AssistPackage.COMPARTMENT: return createCompartment();
			case AssistPackage.BOX: return createBox();
			case AssistPackage.BOARD: return createBoard();
			case AssistPackage.PROCESSOR: return createProcessor();
			case AssistPackage.CORE: return createCore();
			case AssistPackage.IO_ADAPTER: return createIOAdapter();
			case AssistPackage.NETWORK: return createNetwork();
			case AssistPackage.APPLICATION_OR_APPLICATION_GROUP: return createApplicationOrApplicationGroup();
			case AssistPackage.APPLICATION_GROUP: return createApplicationGroup();
			case AssistPackage.APPLICATION: return createApplication();
			case AssistPackage.IO_ADAPTER_REQUIREMENT: return createIOAdapterRequirement();
			case AssistPackage.DISSIMILARITY_RELATION: return createDissimilarityRelation();
			case AssistPackage.DISSIMILARITY_CLAUSE: return createDissimilarityClause();
			case AssistPackage.DISSIMILARITY_DISJUNCTION: return createDissimilarityDisjunction();
			case AssistPackage.DISSIMILARITY_CONJUNCTION: return createDissimilarityConjunction();
			case AssistPackage.DISSIMILARITY_ENTRY: return createDissimilarityEntry();
			case AssistPackage.DISLOCALITY_RELATION: return createDislocalityRelation();
			case AssistPackage.PROXIMITY_RELATION: return createProximityRelation();
			case AssistPackage.COMMUNICATION_RELATION: return createCommunicationRelation();
			case AssistPackage.METRIC_PARAMETER: return createMetricParameter();
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
			case AssistPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
				return createHardwareArchitectureLevelTypeFromString(eDataType, initialValue);
			case AssistPackage.IO_ADAPTER_PROTECTION_LEVEL_TYPE:
				return createIOAdapterProtectionLevelTypeFromString(eDataType, initialValue);
			case AssistPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
				return createDesignAssuranceLevelTypeFromString(eDataType, initialValue);
			case AssistPackage.IO_ADAPTER_TYPE:
				return createIOAdapterTypeFromString(eDataType, initialValue);
			case AssistPackage.COMPARTMENT_ATTRIBUTES:
				return createCompartmentAttributesFromString(eDataType, initialValue);
			case AssistPackage.BOX_ATTRIBUTES:
				return createBoxAttributesFromString(eDataType, initialValue);
			case AssistPackage.BOARD_ATTRIBUTES:
				return createBoardAttributesFromString(eDataType, initialValue);
			case AssistPackage.PROCESSOR_ATTRIBUTES:
				return createProcessorAttributesFromString(eDataType, initialValue);
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
			case AssistPackage.HARDWARE_ARCHITECTURE_LEVEL_TYPE:
				return convertHardwareArchitectureLevelTypeToString(eDataType, instanceValue);
			case AssistPackage.IO_ADAPTER_PROTECTION_LEVEL_TYPE:
				return convertIOAdapterProtectionLevelTypeToString(eDataType, instanceValue);
			case AssistPackage.DESIGN_ASSURANCE_LEVEL_TYPE:
				return convertDesignAssuranceLevelTypeToString(eDataType, instanceValue);
			case AssistPackage.IO_ADAPTER_TYPE:
				return convertIOAdapterTypeToString(eDataType, instanceValue);
			case AssistPackage.COMPARTMENT_ATTRIBUTES:
				return convertCompartmentAttributesToString(eDataType, instanceValue);
			case AssistPackage.BOX_ATTRIBUTES:
				return convertBoxAttributesToString(eDataType, instanceValue);
			case AssistPackage.BOARD_ATTRIBUTES:
				return convertBoardAttributesToString(eDataType, instanceValue);
			case AssistPackage.PROCESSOR_ATTRIBUTES:
				return convertProcessorAttributesToString(eDataType, instanceValue);
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
	public AssistPackage getAssistPackage() {
		return (AssistPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssistPackage getPackage() {
		return AssistPackage.eINSTANCE;
	}

} //AssistFactoryImpl
