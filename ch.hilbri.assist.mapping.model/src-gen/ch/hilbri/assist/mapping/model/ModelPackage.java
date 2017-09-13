/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ch.hilbri.assist.mapping.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelPluginID='ch.hilbri.assist.mapping.model' editDirectory='/ch.hilbri.assist.mapping.model.edit/src' editPluginID='ch.hilbri.assist.mapping.model.edit' editorDirectory='/ch.hilbri.assist.mapping.model.editor/src' editorPluginID='ch.hilbri.assist.mapping.model.editor' generateModelWizard='false' generateExampleClass='false' basePackage='ch.hilbri.assist.mapping'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ch.hilbri.assist.mapping.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = ch.hilbri.assist.mapping.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.AssistModelImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getAssistModel()
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
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__COMPARTMENTS = 1;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__APPLICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__APPLICATION_GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__DISSIMILARITY_RELATIONS = 4;

	/**
	 * The feature id for the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__DISLOCALITY_RELATIONS = 5;

	/**
	 * The feature id for the '<em><b>Proximity Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__PROXIMITY_RELATIONS = 6;

	/**
	 * The number of structural features of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get All Compartments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_COMPARTMENTS = 0;

	/**
	 * The operation id for the '<em>Get All Boxes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_BOXES = 1;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_BOARDS = 2;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_PROCESSORS = 3;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_CORES = 4;

	/**
	 * The operation id for the '<em>Get All Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_TASKS = 5;

	/**
	 * The operation id for the '<em>Get All Hardware Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT = 6;

	/**
	 * The number of operations of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.HardwareElementImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getHardwareElement()
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
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__MANUFACTURER = 1;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__METRIC_PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Hardware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hardware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.CompartmentImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__MANUFACTURER = HARDWARE_ELEMENT__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__METRIC_PARAMETERS = HARDWARE_ELEMENT__METRIC_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__POWER_SUPPLY = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__BOXES = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Boxes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_BOXES = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_BOARDS = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_PROCESSORS = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.BoxImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__MANUFACTURER = HARDWARE_ELEMENT__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__METRIC_PARAMETERS = HARDWARE_ELEMENT__METRIC_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__COMPARTMENT = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__BOARDS = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_ALL_BOARDS = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_ALL_PROCESSORS = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.BoardImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__MANUFACTURER = HARDWARE_ELEMENT__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__METRIC_PARAMETERS = HARDWARE_ELEMENT__METRIC_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Board Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARD_TYPE = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__POWER_SUPPLY = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ASSURANCE_LEVEL = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ram Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__RAM_CAPACITY = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rom Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ROM_CAPACITY = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOX = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PROCESSORS = HARDWARE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Io Adapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__IO_ADAPTERS = HARDWARE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___TO_STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_ALL_PROCESSORS = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.ProcessorImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MANUFACTURER = HARDWARE_ELEMENT__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__METRIC_PARAMETERS = HARDWARE_ELEMENT__METRIC_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Processor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROCESSOR_TYPE = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__BOARD = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CORES = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.CoreImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__MANUFACTURER = HARDWARE_ELEMENT__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__METRIC_PARAMETERS = HARDWARE_ELEMENT__METRIC_PARAMETERS;

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
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.IOAdapterImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getIOAdapter()
	 * @generated
	 */
	int IO_ADAPTER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__TOTAL_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__ADAPTER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>IO Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IO Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.ApplicationOrApplicationGroupImpl <em>Application Or Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.ApplicationOrApplicationGroupImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getApplicationOrApplicationGroup()
	 * @generated
	 */
	int APPLICATION_OR_APPLICATION_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OR_APPLICATION_GROUP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Application Or Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OR_APPLICATION_GROUP___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Application Or Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.ApplicationGroupImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getApplicationGroup()
	 * @generated
	 */
	int APPLICATION_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__NAME = APPLICATION_OR_APPLICATION_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Applications Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__APPLICATIONS_OR_GROUPS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_FEATURE_COUNT = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP___TO_STRING = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.ApplicationImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = APPLICATION_OR_APPLICATION_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Criticality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CRITICALITY_LEVEL = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Developed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DEVELOPED_BY = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TASKS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__METRIC_PARAMETERS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___TO_STRING = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___GET_ALL_TASKS = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.TaskImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Core Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CORE_UTILIZATION = 1;

	/**
	 * The feature id for the '<em><b>Ram Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RAM_UTILIZATION = 2;

	/**
	 * The feature id for the '<em><b>Rom Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ROM_UTILIZATION = 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Io Adapter Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IO_ADAPTER_REQUIREMENTS = 5;

	/**
	 * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__METRIC_PARAMETERS = 7;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.IOAdapterRequirementImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getIOAdapterRequirement()
	 * @generated
	 */
	int IO_ADAPTER_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Required Adapter Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT = 1;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityRelationImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityRelation()
	 * @generated
	 */
	int DISSIMILARITY_RELATION = 13;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityClauseImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityClause()
	 * @generated
	 */
	int DISSIMILARITY_CLAUSE = 14;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityDisjunctionImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityDisjunction()
	 * @generated
	 */
	int DISSIMILARITY_DISJUNCTION = 15;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityConjunctionImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityConjunction()
	 * @generated
	 */
	int DISSIMILARITY_CONJUNCTION = 16;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityEntryImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityEntry()
	 * @generated
	 */
	int DISSIMILARITY_ENTRY = 17;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.DislocalityRelationImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDislocalityRelation()
	 * @generated
	 */
	int DISLOCALITY_RELATION = 18;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.ColocalityRelationImpl <em>Colocality Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.ColocalityRelationImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getColocalityRelation()
	 * @generated
	 */
	int COLOCALITY_RELATION = 19;

	/**
	 * The feature id for the '<em><b>Applications Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION__APPLICATIONS_OR_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION__HARDWARE_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Colocality Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Colocality Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.impl.MetricParameterImpl
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getMetricParameter()
	 * @generated
	 */
	int METRIC_PARAMETER = 20;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.CompartmentAttributes <em>Compartment Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.CompartmentAttributes
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getCompartmentAttributes()
	 * @generated
	 */
	int COMPARTMENT_ATTRIBUTES = 21;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.BoxAttributes <em>Box Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.BoxAttributes
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBoxAttributes()
	 * @generated
	 */
	int BOX_ATTRIBUTES = 22;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.BoardAttributes <em>Board Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.BoardAttributes
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBoardAttributes()
	 * @generated
	 */
	int BOARD_ATTRIBUTES = 23;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.ProcessorAttributes <em>Processor Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.ProcessorAttributes
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getProcessorAttributes()
	 * @generated
	 */
	int PROCESSOR_ATTRIBUTES = 24;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
	 * @generated
	 */
	int HARDWARE_ARCHITECTURE_LEVEL_TYPE = 25;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDesignAssuranceLevelType()
	 * @generated
	 */
	int DESIGN_ASSURANCE_LEVEL_TYPE = 26;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.IOAdapterType <em>IO Adapter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.IOAdapterType
	 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getIOAdapterType()
	 * @generated
	 */
	int IO_ADAPTER_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.AssistModel <em>Assist Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assist Model</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel
	 * @generated
	 */
	EClass getAssistModel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.AssistModel#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getSystemName()
	 * @see #getAssistModel()
	 * @generated
	 */
	EAttribute getAssistModel_SystemName();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.AssistModel#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getCompartments()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_Compartments();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.AssistModel#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getApplications()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.AssistModel#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getApplicationGroups()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_ApplicationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Relations</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getDissimilarityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_DissimilarityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dislocality Relations</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getDislocalityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_DislocalityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.AssistModel#getProximityRelations <em>Proximity Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proximity Relations</em>'.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getProximityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_ProximityRelations();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.AssistModel#getAllCompartments() <em>Get All Compartments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Compartments</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getAllCompartments()
	 * @generated
	 */
	EOperation getAssistModel__GetAllCompartments();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.AssistModel#getAllBoxes() <em>Get All Boxes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boxes</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getAllBoxes()
	 * @generated
	 */
	EOperation getAssistModel__GetAllBoxes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.AssistModel#getAllBoards() <em>Get All Boards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boards</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getAllBoards()
	 * @generated
	 */
	EOperation getAssistModel__GetAllBoards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.AssistModel#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getAllProcessors()
	 * @generated
	 */
	EOperation getAssistModel__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.AssistModel#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getAllCores()
	 * @generated
	 */
	EOperation getAssistModel__GetAllCores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.AssistModel#getAllTasks() <em>Get All Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Tasks</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getAllTasks()
	 * @generated
	 */
	EOperation getAssistModel__GetAllTasks();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.AssistModel#getAllHardwareElements(int) <em>Get All Hardware Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Hardware Elements</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.AssistModel#getAllHardwareElements(int)
	 * @generated
	 */
	EOperation getAssistModel__GetAllHardwareElements__int();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Element</em>'.
	 * @see ch.hilbri.assist.mapping.model.HardwareElement
	 * @generated
	 */
	EClass getHardwareElement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.HardwareElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.HardwareElement#getName()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EAttribute getHardwareElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.HardwareElement#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.mapping.model.HardwareElement#getManufacturer()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EAttribute getHardwareElement_Manufacturer();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.HardwareElement#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.mapping.model.HardwareElement#getMetricParameters()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EReference getHardwareElement_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.mapping.model.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Compartment#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.mapping.model.Compartment#getPowerSupply()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_PowerSupply();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boxes</em>'.
	 * @see ch.hilbri.assist.mapping.model.Compartment#getBoxes()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Boxes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Compartment#getAllBoxes() <em>Get All Boxes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boxes</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Compartment#getAllBoxes()
	 * @generated
	 */
	EOperation getCompartment__GetAllBoxes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Compartment#getAllBoards() <em>Get All Boards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boards</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Compartment#getAllBoards()
	 * @generated
	 */
	EOperation getCompartment__GetAllBoards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Compartment#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Compartment#getAllProcessors()
	 * @generated
	 */
	EOperation getCompartment__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Compartment#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Compartment#getAllCores()
	 * @generated
	 */
	EOperation getCompartment__GetAllCores();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see ch.hilbri.assist.mapping.model.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.Box#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.mapping.model.Box#getCompartment()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Compartment();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Box#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see ch.hilbri.assist.mapping.model.Box#getBoards()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Boards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Box#getAllBoards() <em>Get All Boards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boards</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Box#getAllBoards()
	 * @generated
	 */
	EOperation getBox__GetAllBoards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Box#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Box#getAllProcessors()
	 * @generated
	 */
	EOperation getBox__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Box#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Box#getAllCores()
	 * @generated
	 */
	EOperation getBox__GetAllCores();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Board#getBoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getBoardType()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_BoardType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Board#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getPowerSupply()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Board#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assurance Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getAssuranceLevel()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_AssuranceLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Board#getRamCapacity <em>Ram Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getRamCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RamCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Board#getRomCapacity <em>Rom Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getRomCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RomCapacity();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Box</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getBox()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Box();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Board#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getProcessors()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Board#getIoAdapters <em>Io Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Adapters</em>'.
	 * @see ch.hilbri.assist.mapping.model.Board#getIoAdapters()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_IoAdapters();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Board#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Board#toString()
	 * @generated
	 */
	EOperation getBoard__ToString();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Board#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Board#getAllProcessors()
	 * @generated
	 */
	EOperation getBoard__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Board#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Board#getAllCores()
	 * @generated
	 */
	EOperation getBoard__GetAllCores();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see ch.hilbri.assist.mapping.model.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Processor#getProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.Processor#getProcessorType()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ProcessorType();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.Processor#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Board</em>'.
	 * @see ch.hilbri.assist.mapping.model.Processor#getBoard()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cores</em>'.
	 * @see ch.hilbri.assist.mapping.model.Processor#getCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Cores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Processor#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Processor#getAllCores()
	 * @generated
	 */
	EOperation getProcessor__GetAllCores();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see ch.hilbri.assist.mapping.model.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Core#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see ch.hilbri.assist.mapping.model.Core#getArchitecture()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Core#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.Core#getCapacity()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Capacity();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.Core#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Processor</em>'.
	 * @see ch.hilbri.assist.mapping.model.Core#getProcessor()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Processor();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.IOAdapter <em>IO Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapter
	 * @generated
	 */
	EClass getIOAdapter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.IOAdapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapter#getName()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.IOAdapter#getTotalCount <em>Total Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Count</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapter#getTotalCount()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_TotalCount();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.IOAdapter#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapter#getAdapterType()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_AdapterType();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup <em>Application Or Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Or Application Group</em>'.
	 * @see ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup
	 * @generated
	 */
	EClass getApplicationOrApplicationGroup();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup#getName()
	 * @see #getApplicationOrApplicationGroup()
	 * @generated
	 */
	EAttribute getApplicationOrApplicationGroup_Name();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup#toString()
	 * @generated
	 */
	EOperation getApplicationOrApplicationGroup__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Group</em>'.
	 * @see ch.hilbri.assist.mapping.model.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.ApplicationGroup#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.ApplicationGroup#getApplicationsOrGroups()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.ApplicationGroup#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.ApplicationGroup#toString()
	 * @generated
	 */
	EOperation getApplicationGroup__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see ch.hilbri.assist.mapping.model.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Application#getCriticalityLevel <em>Criticality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.Application#getCriticalityLevel()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CriticalityLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Application#getDevelopedBy <em>Developed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developed By</em>'.
	 * @see ch.hilbri.assist.mapping.model.Application#getDevelopedBy()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_DevelopedBy();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrict Mapping To Hardware Elements</em>'.
	 * @see ch.hilbri.assist.mapping.model.Application#getRestrictMappingToHardwareElements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_RestrictMappingToHardwareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Application#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see ch.hilbri.assist.mapping.model.Application#getTasks()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Application#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.mapping.model.Application#getMetricParameters()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_MetricParameters();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Application#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Application#toString()
	 * @generated
	 */
	EOperation getApplication__ToString();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Application#getAllTasks() <em>Get All Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Tasks</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Application#getAllTasks()
	 * @generated
	 */
	EOperation getApplication__GetAllTasks();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Task#getCoreUtilization <em>Core Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getCoreUtilization()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CoreUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Task#getRamUtilization <em>Ram Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getRamUtilization()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_RamUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.Task#getRomUtilization <em>Rom Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getRomUtilization()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_RomUtilization();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.Task#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getApplication()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Application();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Task#getIoAdapterRequirements <em>Io Adapter Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Adapter Requirements</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getIoAdapterRequirements()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_IoAdapterRequirements();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.Task#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrict Mapping To Hardware Elements</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getRestrictMappingToHardwareElements()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_RestrictMappingToHardwareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.Task#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.mapping.model.Task#getMetricParameters()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_MetricParameters();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.Task#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.Task#toString()
	 * @generated
	 */
	EOperation getTask__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement <em>IO Adapter Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter Requirement</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterRequirement
	 * @generated
	 */
	EClass getIOAdapterRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterRequirement#getAdapterType()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_AdapterType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#getRequiredAdapterCount <em>Required Adapter Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Adapter Count</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterRequirement#getRequiredAdapterCount()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_RequiredAdapterCount();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shared Allowed</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsSharedAllowed()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsSharedAllowed();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exclusive Only</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsExclusiveOnly()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsExclusiveOnly();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.DissimilarityRelation <em>Dissimilarity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Relation</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityRelation
	 * @generated
	 */
	EClass getDissimilarityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.DissimilarityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityRelation#getApplicationsOrGroups()
	 * @see #getDissimilarityRelation()
	 * @generated
	 */
	EReference getDissimilarityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.mapping.model.DissimilarityRelation#getDissimilarityClause <em>Dissimilarity Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dissimilarity Clause</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityRelation#getDissimilarityClause()
	 * @see #getDissimilarityRelation()
	 * @generated
	 */
	EReference getDissimilarityRelation_DissimilarityClause();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.DissimilarityClause <em>Dissimilarity Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Clause</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityClause
	 * @generated
	 */
	EClass getDissimilarityClause();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.DissimilarityDisjunction <em>Dissimilarity Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Disjunction</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityDisjunction
	 * @generated
	 */
	EClass getDissimilarityDisjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.DissimilarityDisjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityDisjunction#getDissimilarityClauses()
	 * @see #getDissimilarityDisjunction()
	 * @generated
	 */
	EReference getDissimilarityDisjunction_DissimilarityClauses();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.DissimilarityConjunction <em>Dissimilarity Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Conjunction</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityConjunction
	 * @generated
	 */
	EClass getDissimilarityConjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.DissimilarityConjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityConjunction#getDissimilarityClauses()
	 * @see #getDissimilarityConjunction()
	 * @generated
	 */
	EReference getDissimilarityConjunction_DissimilarityClauses();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry <em>Dissimilarity Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Entry</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityEntry
	 * @generated
	 */
	EClass getDissimilarityEntry();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityEntry#getLevel()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_Level();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Attribute</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityEntry#getCompartmentAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_CompartmentAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Attribute</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoxAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_BoxAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Attribute</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoardAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_BoardAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Attribute</em>'.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityEntry#getProcessorAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_ProcessorAttribute();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.DislocalityRelation <em>Dislocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dislocality Relation</em>'.
	 * @see ch.hilbri.assist.mapping.model.DislocalityRelation
	 * @generated
	 */
	EClass getDislocalityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.DislocalityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.DislocalityRelation#getApplicationsOrGroups()
	 * @see #getDislocalityRelation()
	 * @generated
	 */
	EReference getDislocalityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.DislocalityRelation#getHardwareLevel()
	 * @see #getDislocalityRelation()
	 * @generated
	 */
	EAttribute getDislocalityRelation_HardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.ColocalityRelation <em>Colocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colocality Relation</em>'.
	 * @see ch.hilbri.assist.mapping.model.ColocalityRelation
	 * @generated
	 */
	EClass getColocalityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.ColocalityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.ColocalityRelation#getApplicationsOrGroups()
	 * @see #getColocalityRelation()
	 * @generated
	 */
	EReference getColocalityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.ColocalityRelation#getHardwareLevel <em>Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.ColocalityRelation#getHardwareLevel()
	 * @see #getColocalityRelation()
	 * @generated
	 */
	EAttribute getColocalityRelation_HardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.MetricParameter <em>Metric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Parameter</em>'.
	 * @see ch.hilbri.assist.mapping.model.MetricParameter
	 * @generated
	 */
	EClass getMetricParameter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.MetricParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.MetricParameter#getName()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.MetricParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.hilbri.assist.mapping.model.MetricParameter#getValue()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Value();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.mapping.model.CompartmentAttributes <em>Compartment Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Attributes</em>'.
	 * @see ch.hilbri.assist.mapping.model.CompartmentAttributes
	 * @generated
	 */
	EEnum getCompartmentAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.mapping.model.BoxAttributes <em>Box Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Box Attributes</em>'.
	 * @see ch.hilbri.assist.mapping.model.BoxAttributes
	 * @generated
	 */
	EEnum getBoxAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.mapping.model.BoardAttributes <em>Board Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Board Attributes</em>'.
	 * @see ch.hilbri.assist.mapping.model.BoardAttributes
	 * @generated
	 */
	EEnum getBoardAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.mapping.model.ProcessorAttributes <em>Processor Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processor Attributes</em>'.
	 * @see ch.hilbri.assist.mapping.model.ProcessorAttributes
	 * @generated
	 */
	EEnum getProcessorAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardware Architecture Level Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
	 * @generated
	 */
	EEnum getHardwareArchitectureLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.mapping.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Assurance Level Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
	 * @generated
	 */
	EEnum getDesignAssuranceLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.mapping.model.IOAdapterType <em>IO Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Adapter Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterType
	 * @generated
	 */
	EEnum getIOAdapterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.AssistModelImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getAssistModel()
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
		 * The meta object literal for the '<em><b>Compartments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__COMPARTMENTS = eINSTANCE.getAssistModel_Compartments();

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
		 * The meta object literal for the '<em><b>Get All Compartments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_COMPARTMENTS = eINSTANCE.getAssistModel__GetAllCompartments();

		/**
		 * The meta object literal for the '<em><b>Get All Boxes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_BOXES = eINSTANCE.getAssistModel__GetAllBoxes();

		/**
		 * The meta object literal for the '<em><b>Get All Boards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_BOARDS = eINSTANCE.getAssistModel__GetAllBoards();

		/**
		 * The meta object literal for the '<em><b>Get All Processors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_PROCESSORS = eINSTANCE.getAssistModel__GetAllProcessors();

		/**
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_CORES = eINSTANCE.getAssistModel__GetAllCores();

		/**
		 * The meta object literal for the '<em><b>Get All Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_TASKS = eINSTANCE.getAssistModel__GetAllTasks();

		/**
		 * The meta object literal for the '<em><b>Get All Hardware Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT = eINSTANCE.getAssistModel__GetAllHardwareElements__int();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.HardwareElementImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getHardwareElement()
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
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ELEMENT__MANUFACTURER = eINSTANCE.getHardwareElement_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ELEMENT__METRIC_PARAMETERS = eINSTANCE.getHardwareElement_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.CompartmentImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getCompartment()
		 * @generated
		 */
		EClass COMPARTMENT = eINSTANCE.getCompartment();

		/**
		 * The meta object literal for the '<em><b>Power Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__POWER_SUPPLY = eINSTANCE.getCompartment_PowerSupply();

		/**
		 * The meta object literal for the '<em><b>Boxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__BOXES = eINSTANCE.getCompartment_Boxes();

		/**
		 * The meta object literal for the '<em><b>Get All Boxes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___GET_ALL_BOXES = eINSTANCE.getCompartment__GetAllBoxes();

		/**
		 * The meta object literal for the '<em><b>Get All Boards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___GET_ALL_BOARDS = eINSTANCE.getCompartment__GetAllBoards();

		/**
		 * The meta object literal for the '<em><b>Get All Processors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___GET_ALL_PROCESSORS = eINSTANCE.getCompartment__GetAllProcessors();

		/**
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___GET_ALL_CORES = eINSTANCE.getCompartment__GetAllCores();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.BoxImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

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
		 * The meta object literal for the '<em><b>Get All Boards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOX___GET_ALL_BOARDS = eINSTANCE.getBox__GetAllBoards();

		/**
		 * The meta object literal for the '<em><b>Get All Processors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOX___GET_ALL_PROCESSORS = eINSTANCE.getBox__GetAllProcessors();

		/**
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOX___GET_ALL_CORES = eINSTANCE.getBox__GetAllCores();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.BoardImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

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
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___TO_STRING = eINSTANCE.getBoard__ToString();

		/**
		 * The meta object literal for the '<em><b>Get All Processors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_ALL_PROCESSORS = eINSTANCE.getBoard__GetAllProcessors();

		/**
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_ALL_CORES = eINSTANCE.getBoard__GetAllCores();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.ProcessorImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

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
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSOR___GET_ALL_CORES = eINSTANCE.getProcessor__GetAllCores();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.CoreImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getCore()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.IOAdapterImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getIOAdapter()
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
		 * The meta object literal for the '<em><b>Total Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER__TOTAL_COUNT = eINSTANCE.getIOAdapter_TotalCount();

		/**
		 * The meta object literal for the '<em><b>Adapter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER__ADAPTER_TYPE = eINSTANCE.getIOAdapter_AdapterType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.ApplicationOrApplicationGroupImpl <em>Application Or Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.ApplicationOrApplicationGroupImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getApplicationOrApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_OR_APPLICATION_GROUP = eINSTANCE.getApplicationOrApplicationGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_OR_APPLICATION_GROUP__NAME = eINSTANCE.getApplicationOrApplicationGroup_Name();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_OR_APPLICATION_GROUP___TO_STRING = eINSTANCE.getApplicationOrApplicationGroup__ToString();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.ApplicationGroupImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_GROUP = eINSTANCE.getApplicationGroup();

		/**
		 * The meta object literal for the '<em><b>Applications Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__APPLICATIONS_OR_GROUPS = eINSTANCE.getApplicationGroup_ApplicationsOrGroups();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_GROUP___TO_STRING = eINSTANCE.getApplicationGroup__ToString();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.ApplicationImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Criticality Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__CRITICALITY_LEVEL = eINSTANCE.getApplication_CriticalityLevel();

		/**
		 * The meta object literal for the '<em><b>Developed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DEVELOPED_BY = eINSTANCE.getApplication_DevelopedBy();

		/**
		 * The meta object literal for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = eINSTANCE.getApplication_RestrictMappingToHardwareElements();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__TASKS = eINSTANCE.getApplication_Tasks();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__METRIC_PARAMETERS = eINSTANCE.getApplication_MetricParameters();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___TO_STRING = eINSTANCE.getApplication__ToString();

		/**
		 * The meta object literal for the '<em><b>Get All Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___GET_ALL_TASKS = eINSTANCE.getApplication__GetAllTasks();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.TaskImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Core Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CORE_UTILIZATION = eINSTANCE.getTask_CoreUtilization();

		/**
		 * The meta object literal for the '<em><b>Ram Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RAM_UTILIZATION = eINSTANCE.getTask_RamUtilization();

		/**
		 * The meta object literal for the '<em><b>Rom Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ROM_UTILIZATION = eINSTANCE.getTask_RomUtilization();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__APPLICATION = eINSTANCE.getTask_Application();

		/**
		 * The meta object literal for the '<em><b>Io Adapter Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IO_ADAPTER_REQUIREMENTS = eINSTANCE.getTask_IoAdapterRequirements();

		/**
		 * The meta object literal for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = eINSTANCE.getTask_RestrictMappingToHardwareElements();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__METRIC_PARAMETERS = eINSTANCE.getTask_MetricParameters();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___TO_STRING = eINSTANCE.getTask__ToString();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.IOAdapterRequirementImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getIOAdapterRequirement()
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
		 * The meta object literal for the '<em><b>Required Adapter Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT = eINSTANCE.getIOAdapterRequirement_RequiredAdapterCount();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityRelationImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityRelation()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityClauseImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityClause()
		 * @generated
		 */
		EClass DISSIMILARITY_CLAUSE = eINSTANCE.getDissimilarityClause();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityDisjunctionImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityDisjunction()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityConjunctionImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityConjunction()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.DissimilarityEntryImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDissimilarityEntry()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.DislocalityRelationImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDislocalityRelation()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.ColocalityRelationImpl <em>Colocality Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.ColocalityRelationImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getColocalityRelation()
		 * @generated
		 */
		EClass COLOCALITY_RELATION = eINSTANCE.getColocalityRelation();

		/**
		 * The meta object literal for the '<em><b>Applications Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOCALITY_RELATION__APPLICATIONS_OR_GROUPS = eINSTANCE.getColocalityRelation_ApplicationsOrGroups();

		/**
		 * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOCALITY_RELATION__HARDWARE_LEVEL = eINSTANCE.getColocalityRelation_HardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.impl.MetricParameterImpl
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getMetricParameter()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.CompartmentAttributes <em>Compartment Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.CompartmentAttributes
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getCompartmentAttributes()
		 * @generated
		 */
		EEnum COMPARTMENT_ATTRIBUTES = eINSTANCE.getCompartmentAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.BoxAttributes <em>Box Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.BoxAttributes
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBoxAttributes()
		 * @generated
		 */
		EEnum BOX_ATTRIBUTES = eINSTANCE.getBoxAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.BoardAttributes <em>Board Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.BoardAttributes
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getBoardAttributes()
		 * @generated
		 */
		EEnum BOARD_ATTRIBUTES = eINSTANCE.getBoardAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.ProcessorAttributes <em>Processor Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.ProcessorAttributes
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getProcessorAttributes()
		 * @generated
		 */
		EEnum PROCESSOR_ATTRIBUTES = eINSTANCE.getProcessorAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
		 * @generated
		 */
		EEnum HARDWARE_ARCHITECTURE_LEVEL_TYPE = eINSTANCE.getHardwareArchitectureLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getDesignAssuranceLevelType()
		 * @generated
		 */
		EEnum DESIGN_ASSURANCE_LEVEL_TYPE = eINSTANCE.getDesignAssuranceLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.IOAdapterType <em>IO Adapter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.IOAdapterType
		 * @see ch.hilbri.assist.mapping.model.impl.ModelPackageImpl#getIOAdapterType()
		 * @generated
		 */
		EEnum IO_ADAPTER_TYPE = eINSTANCE.getIOAdapterType();

	}

} //ModelPackage
