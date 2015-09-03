/**
 */
package ch.hilbri.assist.datamodel.model;

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
 * @see ch.hilbri.assist.datamodel.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelPluginID='ch.hilbri.assist.datamodel.model' editDirectory='/ch.hilbri.assist.datamodel.model.edit/src' editPluginID='ch.hilbri.assist.datamodel.model.edit' editorDirectory='/ch.hilbri.assist.datamodel.model.editor/src' editorPluginID='ch.hilbri.assist.datamodel.model.editor' generateModelWizard='false' generateExampleClass='false' basePackage='ch.hilbri.assist.datamodel'"
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
	String eNS_URI = "ch.hilbri.assist.datamodel.model";

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
	ModelPackage eINSTANCE = ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.AssistModelImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getAssistModel()
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
	 * The feature id for the '<em><b>Change Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__CHANGE_DELAY = 1;

	/**
	 * The feature id for the '<em><b>Hardware Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__HARDWARE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__NETWORKS = 3;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__APPLICATIONS = 4;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__APPLICATION_GROUPS = 5;

	/**
	 * The feature id for the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__DISSIMILARITY_RELATIONS = 6;

	/**
	 * The feature id for the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__DISLOCALITY_RELATIONS = 7;

	/**
	 * The feature id for the '<em><b>Proximity Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__PROXIMITY_RELATIONS = 8;

	/**
	 * The feature id for the '<em><b>Communication Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__COMMUNICATION_RELATIONS = 9;

	/**
	 * The feature id for the '<em><b>Scheduling Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__SCHEDULING_RELATIONS = 10;

	/**
	 * The feature id for the '<em><b>Top Hardware Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__TOP_HARDWARE_LEVEL = 11;

	/**
	 * The feature id for the '<em><b>Bottom Hardware Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__BOTTOM_HARDWARE_LEVEL = 12;

	/**
	 * The feature id for the '<em><b>Hardware Level Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__HARDWARE_LEVEL_COUNT = 13;

	/**
	 * The number of structural features of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_FEATURE_COUNT = 14;

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
	 * The operation id for the '<em>Get All Hardware Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__HARDWAREARCHITECTURELEVELTYPE = 5;

	/**
	 * The operation id for the '<em>Get All Hardware Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT = 6;

	/**
	 * The operation id for the '<em>Get All Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_THREADS = 7;

	/**
	 * The operation id for the '<em>Get All Dislocality Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_DISLOCALITY_RELATIONS__APPLICATION = 8;

	/**
	 * The number of operations of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareElement()
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
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__METRIC_PARAMETERS = 1;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.HardwareElementContainerImpl <em>Hardware Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.HardwareElementContainerImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareElementContainer()
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
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_CONTAINER__METRIC_PARAMETERS = HARDWARE_ELEMENT__METRIC_PARAMETERS;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CompartmentImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompartment()
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
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__METRIC_PARAMETERS = HARDWARE_ELEMENT_CONTAINER__METRIC_PARAMETERS;

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
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_BOARDS = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_PROCESSORS = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_CORES = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.BoxImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBox()
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
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__METRIC_PARAMETERS = HARDWARE_ELEMENT_CONTAINER__METRIC_PARAMETERS;

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
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_ALL_PROCESSORS = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_ALL_CORES = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.BoardImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBoard()
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
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__METRIC_PARAMETERS = HARDWARE_ELEMENT_CONTAINER__METRIC_PARAMETERS;

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
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SIDE = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ESS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ASSURANCE_LEVEL = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ram Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__RAM_CAPACITY = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rom Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ROM_CAPACITY = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOX = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PROCESSORS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Io Adapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__IO_ADAPTERS = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = HARDWARE_ELEMENT_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___TO_STRING = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_ALL_CORES = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Suitable Adapter Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_SUITABLE_ADAPTER_COUNT__IOADAPTERTYPE_IOADAPTERPROTECTIONLEVELTYPE = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = HARDWARE_ELEMENT_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ProcessorImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProcessor()
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
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__METRIC_PARAMETERS = HARDWARE_ELEMENT__METRIC_PARAMETERS;

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
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CoreImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCore()
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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapter()
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
	 * The feature id for the '<em><b>Total Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__TOTAL_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Shared Unit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__SHARED_UNIT_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Adapter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__ADAPTER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Protection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__PROTECTION_LEVEL = 4;

	/**
	 * The number of structural features of the '<em>IO Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>IO Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.NetworkImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getNetwork()
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
	 * The feature id for the '<em><b>Is Board Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IS_BOARD_LOCAL = 4;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ApplicationOrApplicationGroupImpl <em>Application Or Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ApplicationOrApplicationGroupImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getApplicationOrApplicationGroup()
	 * @generated
	 */
	int APPLICATION_OR_APPLICATION_GROUP = 10;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ApplicationGroupImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getApplicationGroup()
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
	 * The operation id for the '<em>Get All Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP___GET_ALL_APPLICATIONS = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP___GET_ALL_THREADS = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP___TO_STRING = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ApplicationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getApplication()
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
	int APPLICATION__NAME = APPLICATION_OR_APPLICATION_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Core Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CORE_UTILIZATION = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ram Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RAM_UTILIZATION = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rom Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ROM_UTILIZATION = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Criticality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CRITICALITY_LEVEL = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io Adapter Protection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IO_ADAPTER_PROTECTION_LEVEL = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parallel Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARALLEL_THREADS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Developed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DEVELOPED_BY = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Io Adapter Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IO_ADAPTER_REQUIREMENTS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__THREADS = APPLICATION_OR_APPLICATION_GROUP_FEATURE_COUNT + 9;

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
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___TO_STRING = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = APPLICATION_OR_APPLICATION_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ThreadImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Core Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__CORE_UTILIZATION = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__PERIOD = 4;

	/**
	 * The feature id for the '<em><b>Early Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__EARLY_TOLERANCE = 5;

	/**
	 * The feature id for the '<em><b>Late Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__LATE_TOLERANCE = 6;

	/**
	 * The feature id for the '<em><b>Latest Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__LATEST_START_TIME = 7;

	/**
	 * The feature id for the '<em><b>Latest End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__LATEST_END_TIME = 8;

	/**
	 * The feature id for the '<em><b>Init Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__INIT_TIME = 9;

	/**
	 * The feature id for the '<em><b>Max Slices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__MAX_SLICES = 10;

	/**
	 * The feature id for the '<em><b>Min Slice Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__MIN_SLICE_DURATION = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__LOCATION = 12;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Get Exclusive Adapter Request Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_EXCLUSIVE_ADAPTER_REQUEST_COUNT__IOADAPTERTYPE_IOADAPTERPROTECTIONLEVELTYPE = 0;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.IOAdapterRequirementImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapterRequirement()
	 * @generated
	 */
	int IO_ADAPTER_REQUIREMENT = 14;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityRelationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityRelation()
	 * @generated
	 */
	int DISSIMILARITY_RELATION = 15;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityClauseImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityClause()
	 * @generated
	 */
	int DISSIMILARITY_CLAUSE = 16;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityDisjunctionImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityDisjunction()
	 * @generated
	 */
	int DISSIMILARITY_DISJUNCTION = 17;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityConjunctionImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityConjunction()
	 * @generated
	 */
	int DISSIMILARITY_CONJUNCTION = 18;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityEntry()
	 * @generated
	 */
	int DISSIMILARITY_ENTRY = 19;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDislocalityRelation()
	 * @generated
	 */
	int DISLOCALITY_RELATION = 20;

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
	 * The operation id for the '<em>Get Application Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION___GET_APPLICATION_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dislocality Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ProximityRelationImpl <em>Proximity Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ProximityRelationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProximityRelation()
	 * @generated
	 */
	int PROXIMITY_RELATION = 21;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CommunicationRelationImpl <em>Communication Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CommunicationRelationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCommunicationRelation()
	 * @generated
	 */
	int COMMUNICATION_RELATION = 22;

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
	 * The operation id for the '<em>Get All Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RELATION___GET_ALL_THREADS = 0;

	/**
	 * The number of operations of the '<em>Communication Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RELATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl <em>Scheduling Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getSchedulingRelation()
	 * @generated
	 */
	int SCHEDULING_RELATION = 23;

	/**
	 * The feature id for the '<em><b>Ref Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_RELATION__REF_BEFORE = 0;

	/**
	 * The feature id for the '<em><b>Ref After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_RELATION__REF_AFTER = 1;

	/**
	 * The feature id for the '<em><b>Thread Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_RELATION__THREAD_BEFORE = 2;

	/**
	 * The feature id for the '<em><b>Thread After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_RELATION__THREAD_AFTER = 3;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_RELATION__DELAY = 4;

	/**
	 * The number of structural features of the '<em>Scheduling Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_RELATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scheduling Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.MetricParameterImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getMetricParameter()
	 * @generated
	 */
	int METRIC_PARAMETER = 24;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
	 * @generated
	 */
	int HARDWARE_ARCHITECTURE_LEVEL_TYPE = 25;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType <em>IO Adapter Protection Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapterProtectionLevelType()
	 * @generated
	 */
	int IO_ADAPTER_PROTECTION_LEVEL_TYPE = 26;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDesignAssuranceLevelType()
	 * @generated
	 */
	int DESIGN_ASSURANCE_LEVEL_TYPE = 27;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.IOAdapterType <em>IO Adapter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterType
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapterType()
	 * @generated
	 */
	int IO_ADAPTER_TYPE = 28;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.CompartmentAttributes <em>Compartment Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.CompartmentAttributes
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompartmentAttributes()
	 * @generated
	 */
	int COMPARTMENT_ATTRIBUTES = 29;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.BoxAttributes <em>Box Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.BoxAttributes
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBoxAttributes()
	 * @generated
	 */
	int BOX_ATTRIBUTES = 30;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.BoardAttributes <em>Board Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.BoardAttributes
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBoardAttributes()
	 * @generated
	 */
	int BOARD_ATTRIBUTES = 31;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.ProcessorAttributes <em>Processor Attributes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.ProcessorAttributes
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProcessorAttributes()
	 * @generated
	 */
	int PROCESSOR_ATTRIBUTES = 32;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.ReferencePointType <em>Reference Point Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.ReferencePointType
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getReferencePointType()
	 * @generated
	 */
	int REFERENCE_POINT_TYPE = 33;


	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.AssistModel <em>Assist Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assist Model</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel
	 * @generated
	 */
	EClass getAssistModel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AssistModel#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getSystemName()
	 * @see #getAssistModel()
	 * @generated
	 */
	EAttribute getAssistModel_SystemName();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AssistModel#getChangeDelay <em>Change Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Delay</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getChangeDelay()
	 * @see #getAssistModel()
	 * @generated
	 */
	EAttribute getAssistModel_ChangeDelay();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getHardwareContainer <em>Hardware Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Container</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getHardwareContainer()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_HardwareContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getNetworks()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getApplications()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getApplicationGroups()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_ApplicationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Relations</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getDissimilarityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_DissimilarityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dislocality Relations</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getDislocalityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_DislocalityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getProximityRelations <em>Proximity Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proximity Relations</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getProximityRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_ProximityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getCommunicationRelations <em>Communication Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Relations</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getCommunicationRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_CommunicationRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.AssistModel#getSchedulingRelations <em>Scheduling Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Relations</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getSchedulingRelations()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_SchedulingRelations();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AssistModel#getTopHardwareLevel <em>Top Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Hardware Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getTopHardwareLevel()
	 * @see #getAssistModel()
	 * @generated
	 */
	EAttribute getAssistModel_TopHardwareLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AssistModel#getBottomHardwareLevel <em>Bottom Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Hardware Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getBottomHardwareLevel()
	 * @see #getAssistModel()
	 * @generated
	 */
	EAttribute getAssistModel_BottomHardwareLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AssistModel#getHardwareLevelCount <em>Hardware Level Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level Count</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getHardwareLevelCount()
	 * @see #getAssistModel()
	 * @generated
	 */
	EAttribute getAssistModel_HardwareLevelCount();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllCompartments() <em>Get All Compartments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Compartments</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllCompartments()
	 * @generated
	 */
	EOperation getAssistModel__GetAllCompartments();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllBoxes() <em>Get All Boxes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boxes</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllBoxes()
	 * @generated
	 */
	EOperation getAssistModel__GetAllBoxes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllBoards() <em>Get All Boards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boards</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllBoards()
	 * @generated
	 */
	EOperation getAssistModel__GetAllBoards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllProcessors()
	 * @generated
	 */
	EOperation getAssistModel__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllCores()
	 * @generated
	 */
	EOperation getAssistModel__GetAllCores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllHardwareElements(ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType) <em>Get All Hardware Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Hardware Elements</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllHardwareElements(ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType)
	 * @generated
	 */
	EOperation getAssistModel__GetAllHardwareElements__HardwareArchitectureLevelType();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllHardwareElements(int) <em>Get All Hardware Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Hardware Elements</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllHardwareElements(int)
	 * @generated
	 */
	EOperation getAssistModel__GetAllHardwareElements__int();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllThreads() <em>Get All Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Threads</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllThreads()
	 * @generated
	 */
	EOperation getAssistModel__GetAllThreads();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getAllDislocalityRelations(ch.hilbri.assist.datamodel.model.Application) <em>Get All Dislocality Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Dislocality Relations</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getAllDislocalityRelations(ch.hilbri.assist.datamodel.model.Application)
	 * @generated
	 */
	EOperation getAssistModel__GetAllDislocalityRelations__Application();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Element</em>'.
	 * @see ch.hilbri.assist.datamodel.model.HardwareElement
	 * @generated
	 */
	EClass getHardwareElement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.HardwareElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.HardwareElement#getName()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EAttribute getHardwareElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.HardwareElement#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.datamodel.model.HardwareElement#getMetricParameters()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EReference getHardwareElement_MetricParameters();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.HardwareElementContainer <em>Hardware Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Element Container</em>'.
	 * @see ch.hilbri.assist.datamodel.model.HardwareElementContainer
	 * @generated
	 */
	EClass getHardwareElementContainer();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Compartment#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getManufacturer()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Compartment#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getPowerSupply()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Compartment#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getSide()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Side();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Compartment#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getZone()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Zone();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boxes</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getBoxes()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Boxes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Compartment#getAllBoards() <em>Get All Boards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boards</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getAllBoards()
	 * @generated
	 */
	EOperation getCompartment__GetAllBoards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Compartment#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getAllProcessors()
	 * @generated
	 */
	EOperation getCompartment__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Compartment#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getAllCores()
	 * @generated
	 */
	EOperation getCompartment__GetAllCores();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Box#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Box#getManufacturer()
	 * @see #getBox()
	 * @generated
	 */
	EAttribute getBox_Manufacturer();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.datamodel.model.Box#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Box#getCompartment()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Compartment();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Box#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Box#getBoards()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Boards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Box#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Box#getAllProcessors()
	 * @generated
	 */
	EOperation getBox__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Box#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Box#getAllCores()
	 * @generated
	 */
	EOperation getBox__GetAllCores();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getManufacturer()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getBoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getBoardType()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_BoardType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getPowerSupply()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getSide()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Side();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getEss <em>Ess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ess</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getEss()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Ess();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assurance Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getAssuranceLevel()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_AssuranceLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getRamCapacity <em>Ram Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Capacity</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getRamCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RamCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Board#getRomCapacity <em>Rom Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Capacity</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getRomCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RomCapacity();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.datamodel.model.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Box</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getBox()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Box();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Board#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getProcessors()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Board#getIoAdapters <em>Io Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Adapters</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Board#getIoAdapters()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_IoAdapters();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Board#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Board#toString()
	 * @generated
	 */
	EOperation getBoard__ToString();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Board#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Board#getAllCores()
	 * @generated
	 */
	EOperation getBoard__GetAllCores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Board#getSuitableAdapterCount(ch.hilbri.assist.datamodel.model.IOAdapterType, ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType) <em>Get Suitable Adapter Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Suitable Adapter Count</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Board#getSuitableAdapterCount(ch.hilbri.assist.datamodel.model.IOAdapterType, ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType)
	 * @generated
	 */
	EOperation getBoard__GetSuitableAdapterCount__IOAdapterType_IOAdapterProtectionLevelType();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Processor#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Processor#getManufacturer()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Processor#getProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Processor#getProcessorType()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ProcessorType();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.datamodel.model.Processor#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Board</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Processor#getBoard()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cores</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Processor#getCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Cores();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Core#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Core#getArchitecture()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Core#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Core#getCapacity()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Capacity();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.datamodel.model.Core#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Processor</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Core#getProcessor()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Processor();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.IOAdapter <em>IO Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapter
	 * @generated
	 */
	EClass getIOAdapter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapter#getName()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getTotalCount <em>Total Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Count</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapter#getTotalCount()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_TotalCount();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getSharedUnitCount <em>Shared Unit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Unit Count</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapter#getSharedUnitCount()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_SharedUnitCount();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapter#getAdapterType()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_AdapterType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getProtectionLevel <em>Protection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protection Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapter#getProtectionLevel()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_ProtectionLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth Capacity</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Network#getBandwidthCapacity()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_BandwidthCapacity();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.Network#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boards</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Network#getBoards()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Boards();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Network#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Network#getMetricParameters()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_MetricParameters();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Network#isIsBoardLocal <em>Is Board Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Board Local</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Network#isIsBoardLocal()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_IsBoardLocal();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup <em>Application Or Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Or Application Group</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup
	 * @generated
	 */
	EClass getApplicationOrApplicationGroup();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup#getName()
	 * @see #getApplicationOrApplicationGroup()
	 * @generated
	 */
	EAttribute getApplicationOrApplicationGroup_Name();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup#toString()
	 * @generated
	 */
	EOperation getApplicationOrApplicationGroup__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Group</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.ApplicationGroup#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationGroup#getApplicationsOrGroups()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.ApplicationGroup#getAllApplications() <em>Get All Applications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Applications</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationGroup#getAllApplications()
	 * @generated
	 */
	EOperation getApplicationGroup__GetAllApplications();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.ApplicationGroup#getAllThreads() <em>Get All Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Threads</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationGroup#getAllThreads()
	 * @generated
	 */
	EOperation getApplicationGroup__GetAllThreads();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.ApplicationGroup#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.ApplicationGroup#toString()
	 * @generated
	 */
	EOperation getApplicationGroup__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Application#getCoreUtilization <em>Core Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Utilization</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getCoreUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CoreUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Application#getRamUtilization <em>Ram Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Utilization</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getRamUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_RamUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Application#getRomUtilization <em>Rom Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Utilization</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getRomUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_RomUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Application#getCriticalityLevel <em>Criticality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getCriticalityLevel()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CriticalityLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Application#getIoAdapterProtectionLevel <em>Io Adapter Protection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Adapter Protection Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getIoAdapterProtectionLevel()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_IoAdapterProtectionLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Application#getParallelThreads <em>Parallel Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Threads</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getParallelThreads()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ParallelThreads();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Application#getDevelopedBy <em>Developed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developed By</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getDevelopedBy()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_DevelopedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Application#getIoAdapterRequirements <em>Io Adapter Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Adapter Requirements</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getIoAdapterRequirements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_IoAdapterRequirements();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrict Mapping To Hardware Elements</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getRestrictMappingToHardwareElements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_RestrictMappingToHardwareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Application#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threads</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getThreads()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Threads();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Application#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Application#getMetricParameters()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_MetricParameters();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Application#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Application#toString()
	 * @generated
	 */
	EOperation getApplication__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getName()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getCoreUtilization <em>Core Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Utilization</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getCoreUtilization()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_CoreUtilization();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.datamodel.model.Thread#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getApplication()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Application();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getDuration()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Duration();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getPeriod()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Period();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getEarlyTolerance <em>Early Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Early Tolerance</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getEarlyTolerance()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_EarlyTolerance();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getLateTolerance <em>Late Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Late Tolerance</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getLateTolerance()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_LateTolerance();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getLatestStartTime <em>Latest Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Start Time</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getLatestStartTime()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_LatestStartTime();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getLatestEndTime <em>Latest End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest End Time</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getLatestEndTime()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_LatestEndTime();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getInitTime <em>Init Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Time</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getInitTime()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_InitTime();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getMaxSlices <em>Max Slices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Slices</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getMaxSlices()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_MaxSlices();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.Thread#getMinSliceDuration <em>Min Slice Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Slice Duration</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getMinSliceDuration()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_MinSliceDuration();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.datamodel.model.Thread#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getLocation()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Location();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Thread#getExclusiveAdapterRequestCount(ch.hilbri.assist.datamodel.model.IOAdapterType, ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType) <em>Get Exclusive Adapter Request Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Exclusive Adapter Request Count</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Thread#getExclusiveAdapterRequestCount(ch.hilbri.assist.datamodel.model.IOAdapterType, ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType)
	 * @generated
	 */
	EOperation getThread__GetExclusiveAdapterRequestCount__IOAdapterType_IOAdapterProtectionLevelType();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.IOAdapterRequirement <em>IO Adapter Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter Requirement</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterRequirement
	 * @generated
	 */
	EClass getIOAdapterRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterRequirement#getAdapterType()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_AdapterType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapterRequirement#getRequiredAdapterCount <em>Required Adapter Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Adapter Count</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterRequirement#getRequiredAdapterCount()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_RequiredAdapterCount();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shared Allowed</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterRequirement#isIsSharedAllowed()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsSharedAllowed();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exclusive Only</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterRequirement#isIsExclusiveOnly()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsExclusiveOnly();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DissimilarityRelation <em>Dissimilarity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Relation</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityRelation
	 * @generated
	 */
	EClass getDissimilarityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.DissimilarityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityRelation#getApplicationsOrGroups()
	 * @see #getDissimilarityRelation()
	 * @generated
	 */
	EReference getDissimilarityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.DissimilarityRelation#getDissimilarityClause <em>Dissimilarity Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dissimilarity Clause</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityRelation#getDissimilarityClause()
	 * @see #getDissimilarityRelation()
	 * @generated
	 */
	EReference getDissimilarityRelation_DissimilarityClause();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DissimilarityClause <em>Dissimilarity Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Clause</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityClause
	 * @generated
	 */
	EClass getDissimilarityClause();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DissimilarityDisjunction <em>Dissimilarity Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Disjunction</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityDisjunction
	 * @generated
	 */
	EClass getDissimilarityDisjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.DissimilarityDisjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityDisjunction#getDissimilarityClauses()
	 * @see #getDissimilarityDisjunction()
	 * @generated
	 */
	EReference getDissimilarityDisjunction_DissimilarityClauses();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DissimilarityConjunction <em>Dissimilarity Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Conjunction</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityConjunction
	 * @generated
	 */
	EClass getDissimilarityConjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.DissimilarityConjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityConjunction#getDissimilarityClauses()
	 * @see #getDissimilarityConjunction()
	 * @generated
	 */
	EReference getDissimilarityConjunction_DissimilarityClauses();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DissimilarityEntry <em>Dissimilarity Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissimilarity Entry</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityEntry
	 * @generated
	 */
	EClass getDissimilarityEntry();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DissimilarityEntry#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityEntry#getLevel()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_Level();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityEntry#getCompartmentAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_CompartmentAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityEntry#getBoxAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_BoxAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityEntry#getBoardAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_BoardAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DissimilarityEntry#getProcessorAttribute()
	 * @see #getDissimilarityEntry()
	 * @generated
	 */
	EAttribute getDissimilarityEntry_ProcessorAttribute();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation <em>Dislocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dislocality Relation</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation
	 * @generated
	 */
	EClass getDislocalityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation#getApplicationsOrGroups()
	 * @see #getDislocalityRelation()
	 * @generated
	 */
	EReference getDislocalityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation#getHardwareLevel()
	 * @see #getDislocalityRelation()
	 * @generated
	 */
	EAttribute getDislocalityRelation_HardwareLevel();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getApplicationCount() <em>Get Application Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Application Count</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation#getApplicationCount()
	 * @generated
	 */
	EOperation getDislocalityRelation__GetApplicationCount();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ProximityRelation <em>Proximity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proximity Relation</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProximityRelation
	 * @generated
	 */
	EClass getProximityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.ProximityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProximityRelation#getApplicationsOrGroups()
	 * @see #getProximityRelation()
	 * @generated
	 */
	EReference getProximityRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.ProximityRelation#getHardwareLevel <em>Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProximityRelation#getHardwareLevel()
	 * @see #getProximityRelation()
	 * @generated
	 */
	EAttribute getProximityRelation_HardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.CommunicationRelation <em>Communication Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Relation</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CommunicationRelation
	 * @generated
	 */
	EClass getCommunicationRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.CommunicationRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CommunicationRelation#getApplicationsOrGroups()
	 * @see #getCommunicationRelation()
	 * @generated
	 */
	EReference getCommunicationRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth Utilization</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CommunicationRelation#getBandwidthUtilization()
	 * @see #getCommunicationRelation()
	 * @generated
	 */
	EAttribute getCommunicationRelation_BandwidthUtilization();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.CommunicationRelation#getAllThreads() <em>Get All Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Threads</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.CommunicationRelation#getAllThreads()
	 * @generated
	 */
	EOperation getCommunicationRelation__GetAllThreads();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.SchedulingRelation <em>Scheduling Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Relation</em>'.
	 * @see ch.hilbri.assist.datamodel.model.SchedulingRelation
	 * @generated
	 */
	EClass getSchedulingRelation();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.SchedulingRelation#getRefBefore <em>Ref Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Before</em>'.
	 * @see ch.hilbri.assist.datamodel.model.SchedulingRelation#getRefBefore()
	 * @see #getSchedulingRelation()
	 * @generated
	 */
	EAttribute getSchedulingRelation_RefBefore();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.SchedulingRelation#getRefAfter <em>Ref After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref After</em>'.
	 * @see ch.hilbri.assist.datamodel.model.SchedulingRelation#getRefAfter()
	 * @see #getSchedulingRelation()
	 * @generated
	 */
	EAttribute getSchedulingRelation_RefAfter();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.datamodel.model.SchedulingRelation#getThreadBefore <em>Thread Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thread Before</em>'.
	 * @see ch.hilbri.assist.datamodel.model.SchedulingRelation#getThreadBefore()
	 * @see #getSchedulingRelation()
	 * @generated
	 */
	EReference getSchedulingRelation_ThreadBefore();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.datamodel.model.SchedulingRelation#getThreadAfter <em>Thread After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thread After</em>'.
	 * @see ch.hilbri.assist.datamodel.model.SchedulingRelation#getThreadAfter()
	 * @see #getSchedulingRelation()
	 * @generated
	 */
	EReference getSchedulingRelation_ThreadAfter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.SchedulingRelation#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see ch.hilbri.assist.datamodel.model.SchedulingRelation#getDelay()
	 * @see #getSchedulingRelation()
	 * @generated
	 */
	EAttribute getSchedulingRelation_Delay();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.MetricParameter <em>Metric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Parameter</em>'.
	 * @see ch.hilbri.assist.datamodel.model.MetricParameter
	 * @generated
	 */
	EClass getMetricParameter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.MetricParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.MetricParameter#getName()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.MetricParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.hilbri.assist.datamodel.model.MetricParameter#getValue()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Value();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardware Architecture Level Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
	 * @generated
	 */
	EEnum getHardwareArchitectureLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType <em>IO Adapter Protection Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Adapter Protection Level Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
	 * @generated
	 */
	EEnum getIOAdapterProtectionLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Assurance Level Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType
	 * @generated
	 */
	EEnum getDesignAssuranceLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.IOAdapterType <em>IO Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Adapter Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterType
	 * @generated
	 */
	EEnum getIOAdapterType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.CompartmentAttributes <em>Compartment Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Attributes</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompartmentAttributes
	 * @generated
	 */
	EEnum getCompartmentAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.BoxAttributes <em>Box Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Box Attributes</em>'.
	 * @see ch.hilbri.assist.datamodel.model.BoxAttributes
	 * @generated
	 */
	EEnum getBoxAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.BoardAttributes <em>Board Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Board Attributes</em>'.
	 * @see ch.hilbri.assist.datamodel.model.BoardAttributes
	 * @generated
	 */
	EEnum getBoardAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.ProcessorAttributes <em>Processor Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processor Attributes</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProcessorAttributes
	 * @generated
	 */
	EEnum getProcessorAttributes();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.ReferencePointType <em>Reference Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Point Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ReferencePointType
	 * @generated
	 */
	EEnum getReferencePointType();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.AssistModelImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getAssistModel()
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
		 * The meta object literal for the '<em><b>Change Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIST_MODEL__CHANGE_DELAY = eINSTANCE.getAssistModel_ChangeDelay();

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
		 * The meta object literal for the '<em><b>Scheduling Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__SCHEDULING_RELATIONS = eINSTANCE.getAssistModel_SchedulingRelations();

		/**
		 * The meta object literal for the '<em><b>Top Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIST_MODEL__TOP_HARDWARE_LEVEL = eINSTANCE.getAssistModel_TopHardwareLevel();

		/**
		 * The meta object literal for the '<em><b>Bottom Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIST_MODEL__BOTTOM_HARDWARE_LEVEL = eINSTANCE.getAssistModel_BottomHardwareLevel();

		/**
		 * The meta object literal for the '<em><b>Hardware Level Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIST_MODEL__HARDWARE_LEVEL_COUNT = eINSTANCE.getAssistModel_HardwareLevelCount();

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
		 * The meta object literal for the '<em><b>Get All Hardware Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__HARDWAREARCHITECTURELEVELTYPE = eINSTANCE.getAssistModel__GetAllHardwareElements__HardwareArchitectureLevelType();

		/**
		 * The meta object literal for the '<em><b>Get All Hardware Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT = eINSTANCE.getAssistModel__GetAllHardwareElements__int();

		/**
		 * The meta object literal for the '<em><b>Get All Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_THREADS = eINSTANCE.getAssistModel__GetAllThreads();

		/**
		 * The meta object literal for the '<em><b>Get All Dislocality Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_DISLOCALITY_RELATIONS__APPLICATION = eINSTANCE.getAssistModel__GetAllDislocalityRelations__Application();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareElement()
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
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ELEMENT__METRIC_PARAMETERS = eINSTANCE.getHardwareElement_MetricParameters();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.HardwareElementContainerImpl <em>Hardware Element Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.HardwareElementContainerImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareElementContainer()
		 * @generated
		 */
		EClass HARDWARE_ELEMENT_CONTAINER = eINSTANCE.getHardwareElementContainer();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CompartmentImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompartment()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.BoxImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBox()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.BoardImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBoard()
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
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__SIDE = eINSTANCE.getBoard_Side();

		/**
		 * The meta object literal for the '<em><b>Ess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ESS = eINSTANCE.getBoard_Ess();

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
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_ALL_CORES = eINSTANCE.getBoard__GetAllCores();

		/**
		 * The meta object literal for the '<em><b>Get Suitable Adapter Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_SUITABLE_ADAPTER_COUNT__IOADAPTERTYPE_IOADAPTERPROTECTIONLEVELTYPE = eINSTANCE.getBoard__GetSuitableAdapterCount__IOAdapterType_IOAdapterProtectionLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ProcessorImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProcessor()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CoreImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCore()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapter()
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
		 * The meta object literal for the '<em><b>Shared Unit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_ADAPTER__SHARED_UNIT_COUNT = eINSTANCE.getIOAdapter_SharedUnitCount();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.NetworkImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getNetwork()
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
		 * The meta object literal for the '<em><b>Is Board Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IS_BOARD_LOCAL = eINSTANCE.getNetwork_IsBoardLocal();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ApplicationOrApplicationGroupImpl <em>Application Or Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ApplicationOrApplicationGroupImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getApplicationOrApplicationGroup()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ApplicationGroupImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getApplicationGroup()
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
		 * The meta object literal for the '<em><b>Get All Applications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_GROUP___GET_ALL_APPLICATIONS = eINSTANCE.getApplicationGroup__GetAllApplications();

		/**
		 * The meta object literal for the '<em><b>Get All Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_GROUP___GET_ALL_THREADS = eINSTANCE.getApplicationGroup__GetAllThreads();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_GROUP___TO_STRING = eINSTANCE.getApplicationGroup__ToString();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ApplicationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

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
		 * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__THREADS = eINSTANCE.getApplication_Threads();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ThreadImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__NAME = eINSTANCE.getThread_Name();

		/**
		 * The meta object literal for the '<em><b>Core Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__CORE_UTILIZATION = eINSTANCE.getThread_CoreUtilization();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__APPLICATION = eINSTANCE.getThread_Application();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__DURATION = eINSTANCE.getThread_Duration();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__PERIOD = eINSTANCE.getThread_Period();

		/**
		 * The meta object literal for the '<em><b>Early Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__EARLY_TOLERANCE = eINSTANCE.getThread_EarlyTolerance();

		/**
		 * The meta object literal for the '<em><b>Late Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__LATE_TOLERANCE = eINSTANCE.getThread_LateTolerance();

		/**
		 * The meta object literal for the '<em><b>Latest Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__LATEST_START_TIME = eINSTANCE.getThread_LatestStartTime();

		/**
		 * The meta object literal for the '<em><b>Latest End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__LATEST_END_TIME = eINSTANCE.getThread_LatestEndTime();

		/**
		 * The meta object literal for the '<em><b>Init Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__INIT_TIME = eINSTANCE.getThread_InitTime();

		/**
		 * The meta object literal for the '<em><b>Max Slices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__MAX_SLICES = eINSTANCE.getThread_MaxSlices();

		/**
		 * The meta object literal for the '<em><b>Min Slice Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__MIN_SLICE_DURATION = eINSTANCE.getThread_MinSliceDuration();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__LOCATION = eINSTANCE.getThread_Location();

		/**
		 * The meta object literal for the '<em><b>Get Exclusive Adapter Request Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_EXCLUSIVE_ADAPTER_REQUEST_COUNT__IOADAPTERTYPE_IOADAPTERPROTECTIONLEVELTYPE = eINSTANCE.getThread__GetExclusiveAdapterRequestCount__IOAdapterType_IOAdapterProtectionLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.IOAdapterRequirementImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapterRequirement()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityRelationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityRelation()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityClauseImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityClause()
		 * @generated
		 */
		EClass DISSIMILARITY_CLAUSE = eINSTANCE.getDissimilarityClause();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityDisjunctionImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityDisjunction()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityConjunctionImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityConjunction()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDissimilarityEntry()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDislocalityRelation()
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
		 * The meta object literal for the '<em><b>Get Application Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISLOCALITY_RELATION___GET_APPLICATION_COUNT = eINSTANCE.getDislocalityRelation__GetApplicationCount();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ProximityRelationImpl <em>Proximity Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ProximityRelationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProximityRelation()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CommunicationRelationImpl <em>Communication Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CommunicationRelationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCommunicationRelation()
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
		 * The meta object literal for the '<em><b>Get All Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_RELATION___GET_ALL_THREADS = eINSTANCE.getCommunicationRelation__GetAllThreads();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl <em>Scheduling Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getSchedulingRelation()
		 * @generated
		 */
		EClass SCHEDULING_RELATION = eINSTANCE.getSchedulingRelation();

		/**
		 * The meta object literal for the '<em><b>Ref Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_RELATION__REF_BEFORE = eINSTANCE.getSchedulingRelation_RefBefore();

		/**
		 * The meta object literal for the '<em><b>Ref After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_RELATION__REF_AFTER = eINSTANCE.getSchedulingRelation_RefAfter();

		/**
		 * The meta object literal for the '<em><b>Thread Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_RELATION__THREAD_BEFORE = eINSTANCE.getSchedulingRelation_ThreadBefore();

		/**
		 * The meta object literal for the '<em><b>Thread After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_RELATION__THREAD_AFTER = eINSTANCE.getSchedulingRelation_ThreadAfter();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_RELATION__DELAY = eINSTANCE.getSchedulingRelation_Delay();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.MetricParameterImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getMetricParameter()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
		 * @generated
		 */
		EEnum HARDWARE_ARCHITECTURE_LEVEL_TYPE = eINSTANCE.getHardwareArchitectureLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType <em>IO Adapter Protection Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapterProtectionLevelType()
		 * @generated
		 */
		EEnum IO_ADAPTER_PROTECTION_LEVEL_TYPE = eINSTANCE.getIOAdapterProtectionLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDesignAssuranceLevelType()
		 * @generated
		 */
		EEnum DESIGN_ASSURANCE_LEVEL_TYPE = eINSTANCE.getDesignAssuranceLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.IOAdapterType <em>IO Adapter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.IOAdapterType
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getIOAdapterType()
		 * @generated
		 */
		EEnum IO_ADAPTER_TYPE = eINSTANCE.getIOAdapterType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.CompartmentAttributes <em>Compartment Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.CompartmentAttributes
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompartmentAttributes()
		 * @generated
		 */
		EEnum COMPARTMENT_ATTRIBUTES = eINSTANCE.getCompartmentAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.BoxAttributes <em>Box Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.BoxAttributes
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBoxAttributes()
		 * @generated
		 */
		EEnum BOX_ATTRIBUTES = eINSTANCE.getBoxAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.BoardAttributes <em>Board Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.BoardAttributes
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getBoardAttributes()
		 * @generated
		 */
		EEnum BOARD_ATTRIBUTES = eINSTANCE.getBoardAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.ProcessorAttributes <em>Processor Attributes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.ProcessorAttributes
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProcessorAttributes()
		 * @generated
		 */
		EEnum PROCESSOR_ATTRIBUTES = eINSTANCE.getProcessorAttributes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.ReferencePointType <em>Reference Point Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.ReferencePointType
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getReferencePointType()
		 * @generated
		 */
		EEnum REFERENCE_POINT_TYPE = eINSTANCE.getReferencePointType();

	}

} //ModelPackage
