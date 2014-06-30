/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.AssistFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='ch.hilbri'"
 * @generated
 */
public interface AssistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ch.hilbri.assist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssistPackage eINSTANCE = ch.hilbri.assist.impl.AssistPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.AssistModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.AssistModelImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getAssistModel()
	 * @generated
	 */
	int ASSIST_MODEL = 0;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__SYSTEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Hardware Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__HARDWARE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__NETWORKS = 2;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__APPLICATIONS = 3;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__APPLICATION_GROUPS = 4;

	/**
	 * The feature id for the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__DISSIMILARITY_RELATIONS = 5;

	/**
	 * The feature id for the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__DISLOCALITY_RELATIONS = 6;

	/**
	 * The feature id for the '<em><b>Proximity Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__PROXIMITY_RELATIONS = 7;

	/**
	 * The feature id for the '<em><b>Communication Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__COMMUNICATION_RELATIONS = 8;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.HardwareElementImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getHardwareElement()
	 * @generated
	 */
	int HARDWARE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Hardware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hardware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.HardwareElementContainerImpl <em>Hardware Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.HardwareElementContainerImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getHardwareElementContainer()
	 * @generated
	 */
	int HARDWARE_ELEMENT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_CONTAINER__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_CONTAINER__LEVEL = HARDWARE_ELEMENT__LEVEL;

	/**
	 * The number of structural features of the '<em>Hardware Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.CompartmentImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NAME = HARDWARE_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__LEVEL = HARDWARE_ELEMENT_CONTAINER__LEVEL;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__MANUFACTURER = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__POWER_SUPPLY = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__SIDE = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__ZONE = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__BOXES = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__METRIC_PARAMETERS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.BoxImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__NAME = HARDWARE_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__LEVEL = HARDWARE_ELEMENT_CONTAINER__LEVEL;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__MANUFACTURER = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__COMPARTMENT = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__BOARDS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__METRIC_PARAMETERS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.BoardImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = HARDWARE_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__LEVEL = HARDWARE_ELEMENT_CONTAINER__LEVEL;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__MANUFACTURER = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Board Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARD_TYPE = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__POWER_SUPPLY = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ASSURANCE_LEVEL = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ram Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__RAM_CAPACITY = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rom Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ROM_CAPACITY = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOX = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PROCESSORS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Io Adapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__IO_ADAPTERS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__METRIC_PARAMETERS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.ProcessorImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__LEVEL = HARDWARE_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MANUFACTURER = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROCESSOR_TYPE = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Board</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__BOARD = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CORES = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__METRIC_PARAMETERS = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.CoreImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__LEVEL = HARDWARE_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__ARCHITECTURE = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CAPACITY = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__PROCESSOR = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__METRIC_PARAMETERS = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.IOAdapterImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapter()
	 * @generated
	 */
	int IO_ADAPTER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Unit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__TOTAL_UNIT_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__ADAPTER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Protection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__PROTECTION_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>IO Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IO Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.NetworkImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bandwidth Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BANDWIDTH_CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BOARDS = 2;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__METRIC_PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.ApplicationOrApplicationGroupImpl <em>Application Or Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.ApplicationOrApplicationGroupImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getApplicationOrApplicationGroup()
	 * @generated
	 */
	int APPLICATION_OR_APPLICATION_GROUP = 10;

	/**
	 * The number of structural features of the '<em>Application Or Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Application Or Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.ApplicationGroupImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getApplicationGroup()
	 * @generated
	 */
	int APPLICATION_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__NAME = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__APPLICATIONS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_FEATURE_COUNT = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.ApplicationImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CORE_UTILIZATION = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ram Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RAM_UTILIZATION = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rom Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ROM_UTILIZATION = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Criticality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CRITICALITY_LEVEL = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Io Adapter Protection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IO_ADAPTER_PROTECTION_LEVEL = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parallel Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARALLEL_THREADS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Developed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DEVELOPED_BY = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Io Adapter Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IO_ADAPTER_REQUIREMENTS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__METRIC_PARAMETERS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.IOAdapterRequirementImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapterRequirement()
	 * @generated
	 */
	int IO_ADAPTER_REQUIREMENT = 13;

	/**
	 * The feature id for the '<em><b>Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Required Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS = 1;

	/**
	 * The feature id for the '<em><b>Is Shared Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED = 2;

	/**
	 * The feature id for the '<em><b>Is Exclusive Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY = 3;

	/**
	 * The number of structural features of the '<em>IO Adapter Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IO Adapter Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.DissimilarityRelationImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityRelation()
	 * @generated
	 */
	int DISSIMILARITY_RELATION = 14;

	/**
	 * The feature id for the '<em><b>Applications Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_RELATION__APPLICATIONS_OR_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Dissimilarity Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE = 1;

	/**
	 * The number of structural features of the '<em>Dissimilarity Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dissimilarity Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.DissimilarityClauseImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityClause()
	 * @generated
	 */
	int DISSIMILARITY_CLAUSE = 15;

	/**
	 * The number of structural features of the '<em>Dissimilarity Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_CLAUSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dissimilarity Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.DissimilarityDisjunctionImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityDisjunction()
	 * @generated
	 */
	int DISSIMILARITY_DISJUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Dissimilarity Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dissimilarity Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_DISJUNCTION_FEATURE_COUNT = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dissimilarity Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_DISJUNCTION_OPERATION_COUNT = DISSIMILARITY_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.DissimilarityConjunctionImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityConjunction()
	 * @generated
	 */
	int DISSIMILARITY_CONJUNCTION = 17;

	/**
	 * The feature id for the '<em><b>Dissimilarity Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dissimilarity Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_CONJUNCTION_FEATURE_COUNT = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dissimilarity Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_CONJUNCTION_OPERATION_COUNT = DISSIMILARITY_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.DissimilarityEntryImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityEntry()
	 * @generated
	 */
	int DISSIMILARITY_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_ENTRY__LEVEL = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compartment Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Box Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_ENTRY__BOX_ATTRIBUTE = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Board Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Processor Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dissimilarity Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_ENTRY_FEATURE_COUNT = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dissimilarity Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSIMILARITY_ENTRY_OPERATION_COUNT = DISSIMILARITY_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.DislocalityRelationImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDislocalityRelation()
	 * @generated
	 */
	int DISLOCALITY_RELATION = 19;

	/**
	 * The feature id for the '<em><b>Applications Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION__APPLICATIONS_OR_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION__HARDWARE_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Dislocality Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dislocality Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.ProximityRelationImpl <em>Proximity Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.ProximityRelationImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getProximityRelation()
	 * @generated
	 */
	int PROXIMITY_RELATION = 20;

	/**
	 * The feature id for the '<em><b>Applications Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_RELATION__HARDWARE_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Proximity Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Proximity Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.CommunicationRelationImpl <em>Communication Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.CommunicationRelationImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCommunicationRelation()
	 * @generated
	 */
	int COMMUNICATION_RELATION = 21;

	/**
	 * The feature id for the '<em><b>Applications Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Bandwidth Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION = 1;

	/**
	 * The number of structural features of the '<em>Communication Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Communication Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.impl.MetricParameterImpl
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getMetricParameter()
	 * @generated
	 */
	int METRIC_PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Metric Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metric Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getHardwareArchitectureLevelType()
	 * @generated
	 */
	int HARDWARE_ARCHITECTURE_LEVEL_TYPE = 23;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.IOAdapterProtectionLevelType <em>IO Adapter Protection Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.IOAdapterProtectionLevelType
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapterProtectionLevelType()
	 * @generated
	 */
	int IO_ADAPTER_PROTECTION_LEVEL_TYPE = 24;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.DesignAssuranceLevelType
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDesignAssuranceLevelType()
	 * @generated
	 */
	int DESIGN_ASSURANCE_LEVEL_TYPE = 25;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.IOAdapterType <em>IO Adapter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.IOAdapterType
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapterType()
	 * @generated
	 */
	int IO_ADAPTER_TYPE = 26;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.CompartmentAttributes <em>Compartment Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.CompartmentAttributes
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCompartmentAttributes()
	 * @generated
	 */
	int COMPARTMENT_ATTRIBUTES = 27;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.BoxAttributes <em>Box Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.BoxAttributes
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBoxAttributes()
	 * @generated
	 */
	int BOX_ATTRIBUTES = 28;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.BoardAttributes <em>Board Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.BoardAttributes
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBoardAttributes()
	 * @generated
	 */
	int BOARD_ATTRIBUTES = 29;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.ProcessorAttributes <em>Processor Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.ProcessorAttributes
	 * @see ch.hilbri.assist.impl.AssistPackageImpl#getProcessorAttributes()
	 * @generated
	 */
	int PROCESSOR_ATTRIBUTES = 30;


	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.AssistModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ch.hilbri.assist.AssistModel
	 * @generated
	 */
	EClass getAssistModel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.AssistModel#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see ch.hilbri.assist.AssistModel#getSystemName()
	 * @see #getAssistModel()
	 * @generated
	 */
	EAttribute getAssistModel_SystemName();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getHardwareContainer <em>Hardware Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Container</em>'.
	 * @see ch.hilbri.assist.AssistModel#getHardwareContainer()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_HardwareContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see ch.hilbri.assist.AssistModel#getNetworks()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see ch.hilbri.assist.AssistModel#getApplications()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Groups</em>'.
	 * @see ch.hilbri.assist.AssistModel#getApplicationGroups()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_ApplicationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Relations</em>'.
	 * @see ch.hilbri.assist.AssistModel#getDissimilarityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_DissimilarityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dislocality Relations</em>'.
	 * @see ch.hilbri.assist.AssistModel#getDislocalityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_DislocalityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getProximityRelations <em>Proximity Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proximity Relations</em>'.
	 * @see ch.hilbri.assist.AssistModel#getProximityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_ProximityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.AssistModel#getCommunicationRelations <em>Communication Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Relations</em>'.
	 * @see ch.hilbri.assist.AssistModel#getCommunicationRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_CommunicationRelations();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Element</em>'.
	 * @see ch.hilbri.assist.HardwareElement
	 * @generated
	 */
	EClass getHardwareElement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.HardwareElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.HardwareElement#getName()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EAttribute getHardwareElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.HardwareElement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ch.hilbri.assist.HardwareElement#getLevel()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EAttribute getHardwareElement_Level();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.HardwareElementContainer <em>Hardware Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Element Container</em>'.
	 * @see ch.hilbri.assist.HardwareElementContainer
	 * @generated
	 */
	EClass getHardwareElementContainer();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Compartment#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.Compartment#getManufacturer()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Compartment#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.Compartment#getPowerSupply()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Compartment#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see ch.hilbri.assist.Compartment#getSide()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Side();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Compartment#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see ch.hilbri.assist.Compartment#getZone()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Zone();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boxes</em>'.
	 * @see ch.hilbri.assist.Compartment#getBoxes()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Boxes();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Compartment#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.Compartment#getMetricParameters()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see ch.hilbri.assist.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Box#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.Box#getManufacturer()
	 * @see #getBox()
	 * @generated
	 */
	EAttribute getBox_Manufacturer();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.Box#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.Box#getCompartment()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Compartment();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Box#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see ch.hilbri.assist.Box#getBoards()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Boards();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Box#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.Box#getMetricParameters()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see ch.hilbri.assist.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Board#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.Board#getManufacturer()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Board#getBoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Type</em>'.
	 * @see ch.hilbri.assist.Board#getBoardType()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_BoardType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Board#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.Board#getPowerSupply()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Board#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assurance Level</em>'.
	 * @see ch.hilbri.assist.Board#getAssuranceLevel()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_AssuranceLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Board#getRamCapacity <em>Ram Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Capacity</em>'.
	 * @see ch.hilbri.assist.Board#getRamCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RamCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Board#getRomCapacity <em>Rom Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Capacity</em>'.
	 * @see ch.hilbri.assist.Board#getRomCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RomCapacity();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Box</em>'.
	 * @see ch.hilbri.assist.Board#getBox()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Box();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Board#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see ch.hilbri.assist.Board#getProcessors()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Board#getIoAdapters <em>Io Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Adapters</em>'.
	 * @see ch.hilbri.assist.Board#getIoAdapters()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_IoAdapters();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Board#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.Board#getMetricParameters()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see ch.hilbri.assist.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Processor#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.Processor#getManufacturer()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Processor#getProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Type</em>'.
	 * @see ch.hilbri.assist.Processor#getProcessorType()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ProcessorType();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.Processor#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Board</em>'.
	 * @see ch.hilbri.assist.Processor#getBoard()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cores</em>'.
	 * @see ch.hilbri.assist.Processor#getCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Cores();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Processor#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.Processor#getMetricParameters()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see ch.hilbri.assist.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Core#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see ch.hilbri.assist.Core#getArchitecture()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Core#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ch.hilbri.assist.Core#getCapacity()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Capacity();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.Core#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Processor</em>'.
	 * @see ch.hilbri.assist.Core#getProcessor()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Processor();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Core#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.Core#getMetricParameters()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.IOAdapter <em>IO Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter</em>'.
	 * @see ch.hilbri.assist.IOAdapter
	 * @generated
	 */
	EClass getIOAdapter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.IOAdapter#getName()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapter#getTotalUnitCount <em>Total Unit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Unit Count</em>'.
	 * @see ch.hilbri.assist.IOAdapter#getTotalUnitCount()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_TotalUnitCount();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapter#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.IOAdapter#getAdapterType()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_AdapterType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapter#getProtectionLevel <em>Protection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protection Level</em>'.
	 * @see ch.hilbri.assist.IOAdapter#getProtectionLevel()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_ProtectionLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see ch.hilbri.assist.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth Capacity</em>'.
	 * @see ch.hilbri.assist.Network#getBandwidthCapacity()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_BandwidthCapacity();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.Network#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boards</em>'.
	 * @see ch.hilbri.assist.Network#getBoards()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Boards();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Network#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.Network#getMetricParameters()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.ApplicationOrApplicationGroup <em>Application Or Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Or Application Group</em>'.
	 * @see ch.hilbri.assist.ApplicationOrApplicationGroup
	 * @generated
	 */
	EClass getApplicationOrApplicationGroup();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Group</em>'.
	 * @see ch.hilbri.assist.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.ApplicationGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.ApplicationGroup#getName()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EAttribute getApplicationGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.ApplicationGroup#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see ch.hilbri.assist.ApplicationGroup#getApplications()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_Applications();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see ch.hilbri.assist.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getCoreUtilization <em>Core Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Utilization</em>'.
	 * @see ch.hilbri.assist.Application#getCoreUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CoreUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getRamUtilization <em>Ram Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Utilization</em>'.
	 * @see ch.hilbri.assist.Application#getRamUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_RamUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getRomUtilization <em>Rom Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Utilization</em>'.
	 * @see ch.hilbri.assist.Application#getRomUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_RomUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getCriticalityLevel <em>Criticality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality Level</em>'.
	 * @see ch.hilbri.assist.Application#getCriticalityLevel()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CriticalityLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getIoAdapterProtectionLevel <em>Io Adapter Protection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Adapter Protection Level</em>'.
	 * @see ch.hilbri.assist.Application#getIoAdapterProtectionLevel()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_IoAdapterProtectionLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getParallelThreads <em>Parallel Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Threads</em>'.
	 * @see ch.hilbri.assist.Application#getParallelThreads()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ParallelThreads();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.Application#getDevelopedBy <em>Developed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developed By</em>'.
	 * @see ch.hilbri.assist.Application#getDevelopedBy()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_DevelopedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Application#getIoAdapterRequirements <em>Io Adapter Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Adapter Requirements</em>'.
	 * @see ch.hilbri.assist.Application#getIoAdapterRequirements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_IoAdapterRequirements();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrict Mapping To Hardware Elements</em>'.
	 * @see ch.hilbri.assist.Application#getRestrictMappingToHardwareElements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_RestrictMappingToHardwareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.Application#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.Application#getMetricParameters()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.IOAdapterRequirement <em>IO Adapter Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter Requirement</em>'.
	 * @see ch.hilbri.assist.IOAdapterRequirement
	 * @generated
	 */
	EClass getIOAdapterRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.IOAdapterRequirement#getAdapterType()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_AdapterType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapterRequirement#getRequiredUnits <em>Required Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Units</em>'.
	 * @see ch.hilbri.assist.IOAdapterRequirement#getRequiredUnits()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_RequiredUnits();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shared Allowed</em>'.
	 * @see ch.hilbri.assist.IOAdapterRequirement#isIsSharedAllowed()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsSharedAllowed();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exclusive Only</em>'.
	 * @see ch.hilbri.assist.IOAdapterRequirement#isIsExclusiveOnly()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsExclusiveOnly();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.DissimilarityRelation <em>Dissimilarity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Relation</em>'.
	 * @see ch.hilbri.assist.DissimilarityRelation
	 * @generated
	 */
	EClass getDissimilarityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.DissimilarityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.DissimilarityRelation#getApplicationsOrGroups()
	 * @see #getDissimilarityRelation()
	 * @generated
	 */
	EReference getDissimilarityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.DissimilarityRelation#getDissimilarityClause <em>Dissimilarity Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dissimilarity Clause</em>'.
	 * @see ch.hilbri.assist.DissimilarityRelation#getDissimilarityClause()
	 * @see #getDissimilarityRelation()
	 * @generated
	 */
	EReference getDissimilarityRelation_DissimilarityClause();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.DissimilarityClause <em>Dissimilarity Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Clause</em>'.
	 * @see ch.hilbri.assist.DissimilarityClause
	 * @generated
	 */
	EClass getDissimilarityClause();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.DissimilarityDisjunction <em>Dissimilarity Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Disjunction</em>'.
	 * @see ch.hilbri.assist.DissimilarityDisjunction
	 * @generated
	 */
	EClass getDissimilarityDisjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.DissimilarityDisjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
	 * @see ch.hilbri.assist.DissimilarityDisjunction#getDissimilarityClauses()
	 * @see #getDissimilarityDisjunction()
	 * @generated
	 */
	EReference getDissimilarityDisjunction_DissimilarityClauses();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.DissimilarityConjunction <em>Dissimilarity Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Conjunction</em>'.
	 * @see ch.hilbri.assist.DissimilarityConjunction
	 * @generated
	 */
	EClass getDissimilarityConjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.DissimilarityConjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
	 * @see ch.hilbri.assist.DissimilarityConjunction#getDissimilarityClauses()
	 * @see #getDissimilarityConjunction()
	 * @generated
	 */
	EReference getDissimilarityConjunction_DissimilarityClauses();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.DissimilarityEntry <em>Dissimilarity Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Entry</em>'.
	 * @see ch.hilbri.assist.DissimilarityEntry
	 * @generated
	 */
	EClass getDissimilarityEntry();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.DissimilarityEntry#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ch.hilbri.assist.DissimilarityEntry#getLevel()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_Level();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Attribute</em>'.
	 * @see ch.hilbri.assist.DissimilarityEntry#getCompartmentAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_CompartmentAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Attribute</em>'.
	 * @see ch.hilbri.assist.DissimilarityEntry#getBoxAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_BoxAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Attribute</em>'.
	 * @see ch.hilbri.assist.DissimilarityEntry#getBoardAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_BoardAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Attribute</em>'.
	 * @see ch.hilbri.assist.DissimilarityEntry#getProcessorAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_ProcessorAttribute();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.DislocalityRelation <em>Dislocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dislocality Relation</em>'.
	 * @see ch.hilbri.assist.DislocalityRelation
	 * @generated
	 */
	EClass getDislocalityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.DislocalityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.DislocalityRelation#getApplicationsOrGroups()
	 * @see #getDislocalityRelation()
	 * @generated
	 */
	EReference getDislocalityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level</em>'.
	 * @see ch.hilbri.assist.DislocalityRelation#getHardwareLevel()
	 * @see #getDislocalityRelation()
	 * @generated
	 */
	EAttribute getDislocalityRelation_HardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.ProximityRelation <em>Proximity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proximity Relation</em>'.
	 * @see ch.hilbri.assist.ProximityRelation
	 * @generated
	 */
	EClass getProximityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.ProximityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.ProximityRelation#getApplicationsOrGroups()
	 * @see #getProximityRelation()
	 * @generated
	 */
	EReference getProximityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.ProximityRelation#getHardwareLevel <em>Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level</em>'.
	 * @see ch.hilbri.assist.ProximityRelation#getHardwareLevel()
	 * @see #getProximityRelation()
	 * @generated
	 */
	EAttribute getProximityRelation_HardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.CommunicationRelation <em>Communication Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Relation</em>'.
	 * @see ch.hilbri.assist.CommunicationRelation
	 * @generated
	 */
	EClass getCommunicationRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.CommunicationRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.CommunicationRelation#getApplicationsOrGroups()
	 * @see #getCommunicationRelation()
	 * @generated
	 */
	EReference getCommunicationRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth Utilization</em>'.
	 * @see ch.hilbri.assist.CommunicationRelation#getBandwidthUtilization()
	 * @see #getCommunicationRelation()
	 * @generated
	 */
	EAttribute getCommunicationRelation_BandwidthUtilization();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.MetricParameter <em>Metric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Parameter</em>'.
	 * @see ch.hilbri.assist.MetricParameter
	 * @generated
	 */
	EClass getMetricParameter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.MetricParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.MetricParameter#getName()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.MetricParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.hilbri.assist.MetricParameter#getValue()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Value();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardware Architecture Level Type</em>'.
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @generated
	 */
	EEnum getHardwareArchitectureLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.IOAdapterProtectionLevelType <em>IO Adapter Protection Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Adapter Protection Level Type</em>'.
	 * @see ch.hilbri.assist.IOAdapterProtectionLevelType
	 * @generated
	 */
	EEnum getIOAdapterProtectionLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Assurance Level Type</em>'.
	 * @see ch.hilbri.assist.DesignAssuranceLevelType
	 * @generated
	 */
	EEnum getDesignAssuranceLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.IOAdapterType <em>IO Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Adapter Type</em>'.
	 * @see ch.hilbri.assist.IOAdapterType
	 * @generated
	 */
	EEnum getIOAdapterType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.CompartmentAttributes <em>Compartment Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Attributes</em>'.
	 * @see ch.hilbri.assist.CompartmentAttributes
	 * @generated
	 */
	EEnum getCompartmentAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.BoxAttributes <em>Box Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Box Attributes</em>'.
	 * @see ch.hilbri.assist.BoxAttributes
	 * @generated
	 */
	EEnum getBoxAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.BoardAttributes <em>Board Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Board Attributes</em>'.
	 * @see ch.hilbri.assist.BoardAttributes
	 * @generated
	 */
	EEnum getBoardAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.ProcessorAttributes <em>Processor Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processor Attributes</em>'.
	 * @see ch.hilbri.assist.ProcessorAttributes
	 * @generated
	 */
	EEnum getProcessorAttributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssistFactory getAssistFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.AssistModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.AssistModelImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getAssistModel()
		 * @generated
		 */
		EClass ASSIST_MODEL = eINSTANCE.getAssistModel();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIST_MODEL__SYSTEM_NAME = eINSTANCE.getAssistModel_SystemName();

		/**
		 * The meta object literal for the '<em><b>Hardware Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__HARDWARE_CONTAINER = eINSTANCE.getAssistModel_HardwareContainer();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__NETWORKS = eINSTANCE.getAssistModel_Networks();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__APPLICATIONS = eINSTANCE.getAssistModel_Applications();

		/**
		 * The meta object literal for the '<em><b>Application Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__APPLICATION_GROUPS = eINSTANCE.getAssistModel_ApplicationGroups();

		/**
		 * The meta object literal for the '<em><b>Dissimilarity Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__DISSIMILARITY_RELATIONS = eINSTANCE.getAssistModel_DissimilarityRelations();

		/**
		 * The meta object literal for the '<em><b>Dislocality Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__DISLOCALITY_RELATIONS = eINSTANCE.getAssistModel_DislocalityRelations();

		/**
		 * The meta object literal for the '<em><b>Proximity Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__PROXIMITY_RELATIONS = eINSTANCE.getAssistModel_ProximityRelations();

		/**
		 * The meta object literal for the '<em><b>Communication Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__COMMUNICATION_RELATIONS = eINSTANCE.getAssistModel_CommunicationRelations();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.HardwareElementImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getHardwareElement()
		 * @generated
		 */
		EClass HARDWARE_ELEMENT = eINSTANCE.getHardwareElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ELEMENT__NAME = eINSTANCE.getHardwareElement_Name();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ELEMENT__LEVEL = eINSTANCE.getHardwareElement_Level();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.HardwareElementContainerImpl <em>Hardware Element Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.HardwareElementContainerImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getHardwareElementContainer()
		 * @generated
		 */
		EClass HARDWARE_ELEMENT_CONTAINER = eINSTANCE.getHardwareElementContainer();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.CompartmentImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCompartment()
		 * @generated
		 */
		EClass COMPARTMENT = eINSTANCE.getCompartment();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__MANUFACTURER = eINSTANCE.getCompartment_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Power Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__POWER_SUPPLY = eINSTANCE.getCompartment_PowerSupply();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__SIDE = eINSTANCE.getCompartment_Side();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__ZONE = eINSTANCE.getCompartment_Zone();

		/**
		 * The meta object literal for the '<em><b>Boxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__BOXES = eINSTANCE.getCompartment_Boxes();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__METRIC_PARAMETERS = eINSTANCE.getCompartment_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.BoxImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX__MANUFACTURER = eINSTANCE.getBox_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__COMPARTMENT = eINSTANCE.getBox_Compartment();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__BOARDS = eINSTANCE.getBox_Boards();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__METRIC_PARAMETERS = eINSTANCE.getBox_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.BoardImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__MANUFACTURER = eINSTANCE.getBoard_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Board Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__BOARD_TYPE = eINSTANCE.getBoard_BoardType();

		/**
		 * The meta object literal for the '<em><b>Power Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__POWER_SUPPLY = eINSTANCE.getBoard_PowerSupply();

		/**
		 * The meta object literal for the '<em><b>Assurance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ASSURANCE_LEVEL = eINSTANCE.getBoard_AssuranceLevel();

		/**
		 * The meta object literal for the '<em><b>Ram Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__RAM_CAPACITY = eINSTANCE.getBoard_RamCapacity();

		/**
		 * The meta object literal for the '<em><b>Rom Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ROM_CAPACITY = eINSTANCE.getBoard_RomCapacity();

		/**
		 * The meta object literal for the '<em><b>Box</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__BOX = eINSTANCE.getBoard_Box();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PROCESSORS = eINSTANCE.getBoard_Processors();

		/**
		 * The meta object literal for the '<em><b>Io Adapters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__IO_ADAPTERS = eINSTANCE.getBoard_IoAdapters();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__METRIC_PARAMETERS = eINSTANCE.getBoard_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.ProcessorImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__MANUFACTURER = eINSTANCE.getProcessor_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Processor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__PROCESSOR_TYPE = eINSTANCE.getProcessor_ProcessorType();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__BOARD = eINSTANCE.getProcessor_Board();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__CORES = eINSTANCE.getProcessor_Cores();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__METRIC_PARAMETERS = eINSTANCE.getProcessor_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.CoreImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__ARCHITECTURE = eINSTANCE.getCore_Architecture();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__CAPACITY = eINSTANCE.getCore_Capacity();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__PROCESSOR = eINSTANCE.getCore_Processor();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__METRIC_PARAMETERS = eINSTANCE.getCore_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.IOAdapterImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapter()
		 * @generated
		 */
		EClass IO_ADAPTER = eINSTANCE.getIOAdapter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER__NAME = eINSTANCE.getIOAdapter_Name();

		/**
		 * The meta object literal for the '<em><b>Total Unit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER__TOTAL_UNIT_COUNT = eINSTANCE.getIOAdapter_TotalUnitCount();

		/**
		 * The meta object literal for the '<em><b>Adapter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER__ADAPTER_TYPE = eINSTANCE.getIOAdapter_AdapterType();

		/**
		 * The meta object literal for the '<em><b>Protection Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER__PROTECTION_LEVEL = eINSTANCE.getIOAdapter_ProtectionLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.NetworkImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Bandwidth Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__BANDWIDTH_CAPACITY = eINSTANCE.getNetwork_BandwidthCapacity();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__BOARDS = eINSTANCE.getNetwork_Boards();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__METRIC_PARAMETERS = eINSTANCE.getNetwork_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.ApplicationOrApplicationGroupImpl <em>Application Or Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.ApplicationOrApplicationGroupImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getApplicationOrApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_OR_APPLICATION_GROUP = eINSTANCE.getApplicationOrApplicationGroup();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.ApplicationGroupImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_GROUP = eINSTANCE.getApplicationGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_GROUP__NAME = eINSTANCE.getApplicationGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__APPLICATIONS = eINSTANCE.getApplicationGroup_Applications();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.ApplicationImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Core Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__CORE_UTILIZATION = eINSTANCE.getApplication_CoreUtilization();

		/**
		 * The meta object literal for the '<em><b>Ram Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__RAM_UTILIZATION = eINSTANCE.getApplication_RamUtilization();

		/**
		 * The meta object literal for the '<em><b>Rom Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__ROM_UTILIZATION = eINSTANCE.getApplication_RomUtilization();

		/**
		 * The meta object literal for the '<em><b>Criticality Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__CRITICALITY_LEVEL = eINSTANCE.getApplication_CriticalityLevel();

		/**
		 * The meta object literal for the '<em><b>Io Adapter Protection Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__IO_ADAPTER_PROTECTION_LEVEL = eINSTANCE.getApplication_IoAdapterProtectionLevel();

		/**
		 * The meta object literal for the '<em><b>Parallel Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PARALLEL_THREADS = eINSTANCE.getApplication_ParallelThreads();

		/**
		 * The meta object literal for the '<em><b>Developed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DEVELOPED_BY = eINSTANCE.getApplication_DevelopedBy();

		/**
		 * The meta object literal for the '<em><b>Io Adapter Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__IO_ADAPTER_REQUIREMENTS = eINSTANCE.getApplication_IoAdapterRequirements();

		/**
		 * The meta object literal for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = eINSTANCE.getApplication_RestrictMappingToHardwareElements();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__METRIC_PARAMETERS = eINSTANCE.getApplication_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.IOAdapterRequirementImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapterRequirement()
		 * @generated
		 */
		EClass IO_ADAPTER_REQUIREMENT = eINSTANCE.getIOAdapterRequirement();

		/**
		 * The meta object literal for the '<em><b>Adapter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE = eINSTANCE.getIOAdapterRequirement_AdapterType();

		/**
		 * The meta object literal for the '<em><b>Required Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS = eINSTANCE.getIOAdapterRequirement_RequiredUnits();

		/**
		 * The meta object literal for the '<em><b>Is Shared Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED = eINSTANCE.getIOAdapterRequirement_IsSharedAllowed();

		/**
		 * The meta object literal for the '<em><b>Is Exclusive Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY = eINSTANCE.getIOAdapterRequirement_IsExclusiveOnly();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.DissimilarityRelationImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityRelation()
		 * @generated
		 */
		EClass DISSIMILARITY_RELATION = eINSTANCE.getDissimilarityRelation();

		/**
		 * The meta object literal for the '<em><b>Applications Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISSIMILARITY_RELATION__APPLICATIONS_OR_GROUPS = eINSTANCE.getDissimilarityRelation_ApplicationsOrGroups();

		/**
		 * The meta object literal for the '<em><b>Dissimilarity Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE = eINSTANCE.getDissimilarityRelation_DissimilarityClause();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.DissimilarityClauseImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityClause()
		 * @generated
		 */
		EClass DISSIMILARITY_CLAUSE = eINSTANCE.getDissimilarityClause();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.DissimilarityDisjunctionImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityDisjunction()
		 * @generated
		 */
		EClass DISSIMILARITY_DISJUNCTION = eINSTANCE.getDissimilarityDisjunction();

		/**
		 * The meta object literal for the '<em><b>Dissimilarity Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES = eINSTANCE.getDissimilarityDisjunction_DissimilarityClauses();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.DissimilarityConjunctionImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityConjunction()
		 * @generated
		 */
		EClass DISSIMILARITY_CONJUNCTION = eINSTANCE.getDissimilarityConjunction();

		/**
		 * The meta object literal for the '<em><b>Dissimilarity Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES = eINSTANCE.getDissimilarityConjunction_DissimilarityClauses();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.DissimilarityEntryImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDissimilarityEntry()
		 * @generated
		 */
		EClass DISSIMILARITY_ENTRY = eINSTANCE.getDissimilarityEntry();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISSIMILARITY_ENTRY__LEVEL = eINSTANCE.getDissimilarityEntry_Level();

		/**
		 * The meta object literal for the '<em><b>Compartment Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE = eINSTANCE.getDissimilarityEntry_CompartmentAttribute();

		/**
		 * The meta object literal for the '<em><b>Box Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISSIMILARITY_ENTRY__BOX_ATTRIBUTE = eINSTANCE.getDissimilarityEntry_BoxAttribute();

		/**
		 * The meta object literal for the '<em><b>Board Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE = eINSTANCE.getDissimilarityEntry_BoardAttribute();

		/**
		 * The meta object literal for the '<em><b>Processor Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE = eINSTANCE.getDissimilarityEntry_ProcessorAttribute();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.DislocalityRelationImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDislocalityRelation()
		 * @generated
		 */
		EClass DISLOCALITY_RELATION = eINSTANCE.getDislocalityRelation();

		/**
		 * The meta object literal for the '<em><b>Applications Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISLOCALITY_RELATION__APPLICATIONS_OR_GROUPS = eINSTANCE.getDislocalityRelation_ApplicationsOrGroups();

		/**
		 * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISLOCALITY_RELATION__HARDWARE_LEVEL = eINSTANCE.getDislocalityRelation_HardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.ProximityRelationImpl <em>Proximity Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.ProximityRelationImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getProximityRelation()
		 * @generated
		 */
		EClass PROXIMITY_RELATION = eINSTANCE.getProximityRelation();

		/**
		 * The meta object literal for the '<em><b>Applications Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS = eINSTANCE.getProximityRelation_ApplicationsOrGroups();

		/**
		 * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXIMITY_RELATION__HARDWARE_LEVEL = eINSTANCE.getProximityRelation_HardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.CommunicationRelationImpl <em>Communication Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.CommunicationRelationImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCommunicationRelation()
		 * @generated
		 */
		EClass COMMUNICATION_RELATION = eINSTANCE.getCommunicationRelation();

		/**
		 * The meta object literal for the '<em><b>Applications Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS = eINSTANCE.getCommunicationRelation_ApplicationsOrGroups();

		/**
		 * The meta object literal for the '<em><b>Bandwidth Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION = eINSTANCE.getCommunicationRelation_BandwidthUtilization();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.impl.MetricParameterImpl
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getMetricParameter()
		 * @generated
		 */
		EClass METRIC_PARAMETER = eINSTANCE.getMetricParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_PARAMETER__NAME = eINSTANCE.getMetricParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_PARAMETER__VALUE = eINSTANCE.getMetricParameter_Value();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.HardwareArchitectureLevelType
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getHardwareArchitectureLevelType()
		 * @generated
		 */
		EEnum HARDWARE_ARCHITECTURE_LEVEL_TYPE = eINSTANCE.getHardwareArchitectureLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.IOAdapterProtectionLevelType <em>IO Adapter Protection Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.IOAdapterProtectionLevelType
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapterProtectionLevelType()
		 * @generated
		 */
		EEnum IO_ADAPTER_PROTECTION_LEVEL_TYPE = eINSTANCE.getIOAdapterProtectionLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.DesignAssuranceLevelType
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getDesignAssuranceLevelType()
		 * @generated
		 */
		EEnum DESIGN_ASSURANCE_LEVEL_TYPE = eINSTANCE.getDesignAssuranceLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.IOAdapterType <em>IO Adapter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.IOAdapterType
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getIOAdapterType()
		 * @generated
		 */
		EEnum IO_ADAPTER_TYPE = eINSTANCE.getIOAdapterType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.CompartmentAttributes <em>Compartment Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.CompartmentAttributes
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getCompartmentAttributes()
		 * @generated
		 */
		EEnum COMPARTMENT_ATTRIBUTES = eINSTANCE.getCompartmentAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.BoxAttributes <em>Box Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.BoxAttributes
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBoxAttributes()
		 * @generated
		 */
		EEnum BOX_ATTRIBUTES = eINSTANCE.getBoxAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.BoardAttributes <em>Board Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.BoardAttributes
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getBoardAttributes()
		 * @generated
		 */
		EEnum BOARD_ATTRIBUTES = eINSTANCE.getBoardAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.ProcessorAttributes <em>Processor Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.ProcessorAttributes
		 * @see ch.hilbri.assist.impl.AssistPackageImpl#getProcessorAttributes()
		 * @generated
		 */
		EEnum PROCESSOR_ATTRIBUTES = eINSTANCE.getProcessorAttributes();

	}

} //AssistPackage
