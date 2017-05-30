/**
 */
package ch.hilbri.assist.mapping.model.result;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see ch.hilbri.assist.mapping.model.result.ResultFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel generateModelWizard='false' generateExampleClass='false' basePackage='ch.hilbri.assist.mapping.model'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface ResultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "result";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ch.hilbri.assist.mapping.model.result";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "result";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultPackage eINSTANCE = ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result> <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result>
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 0;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NAME = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SYSTEM_NAME = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Hardware Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ROOT_HARDWARE_ELEMENTS = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Top Hardware Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TOP_HARDWARE_LEVEL = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bottom Hardware Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__BOTTOM_HARDWARE_LEVEL = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__APPLICATION_GROUPS = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__APPLICATIONS = COMPARABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__COMMUNICATIONS = COMPARABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__EVALUATION = COMPARABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___COMPARE_TO__RESULT = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Compartments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_COMPARTMENTS = COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Boxes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_BOXES = COMPARABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_BOARDS = COMPARABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_PROCESSORS = COMPARABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_CORES = COMPARABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get All Threads</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_THREADS = COMPARABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Find Result Hardware Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___FIND_RESULT_HARDWARE_ELEMENT__HARDWAREELEMENT = COMPARABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Find Result Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___FIND_RESULT_APPLICATION__APPLICATION = COMPARABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Find Result Application Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___FIND_RESULT_APPLICATION_GROUP__APPLICATIONGROUP = COMPARABLE_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.HardwareElementImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getHardwareElement()
	 * @generated
	 */
	int HARDWARE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__REFERENCE_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Hardware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Metric Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT___GET_METRIC_PARAMETER_VALUE__STRING = 0;

	/**
	 * The operation id for the '<em>Get Hardware Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT___GET_HARDWARE_LEVEL = 1;

	/**
	 * The number of operations of the '<em>Hardware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.CompartmentImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getCompartment()
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
	int COMPARTMENT__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__REFERENCE_OBJECT = HARDWARE_ELEMENT__REFERENCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__MANUFACTURER = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__POWER_SUPPLY = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__SIDE = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__ZONE = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__BOXES = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Metric Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_METRIC_PARAMETER_VALUE__STRING = HARDWARE_ELEMENT___GET_METRIC_PARAMETER_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_BOARDS = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_PROCESSORS = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Hardware Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_HARDWARE_LEVEL = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.BoxImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getBox()
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
	int BOX__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__REFERENCE_OBJECT = HARDWARE_ELEMENT__REFERENCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__MANUFACTURER = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__COMPARTMENT = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__BOARDS = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Metric Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_METRIC_PARAMETER_VALUE__STRING = HARDWARE_ELEMENT___GET_METRIC_PARAMETER_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_ALL_PROCESSORS = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Hardware Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX___GET_HARDWARE_LEVEL = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.BoardImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getBoard()
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
	int BOARD__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__REFERENCE_OBJECT = HARDWARE_ELEMENT__REFERENCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__MANUFACTURER = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Board Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARD_TYPE = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__POWER_SUPPLY = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SIDE = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ESS = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ASSURANCE_LEVEL = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ram Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__RAM_CAPACITY = HARDWARE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ram Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__RAM_UTILIZATION = HARDWARE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rom Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ROM_CAPACITY = HARDWARE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rom Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ROM_UTILIZATION = HARDWARE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOX = HARDWARE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PROCESSORS = HARDWARE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Io Adapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__IO_ADAPTERS = HARDWARE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__METRIC_PARAMETERS = HARDWARE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Not Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NOT_USED = HARDWARE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Metric Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_METRIC_PARAMETER_VALUE__STRING = HARDWARE_ELEMENT___GET_METRIC_PARAMETER_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get All Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_ALL_APPLICATIONS = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Hardware Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_HARDWARE_LEVEL = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.ProcessorImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getProcessor()
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
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__REFERENCE_OBJECT = HARDWARE_ELEMENT__REFERENCE_OBJECT;

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
	 * The feature id for the '<em><b>Not Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NOT_USED = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Metric Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_METRIC_PARAMETER_VALUE__STRING = HARDWARE_ELEMENT___GET_METRIC_PARAMETER_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Hardware Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_HARDWARE_LEVEL = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.CoreImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getCore()
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
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__REFERENCE_OBJECT = HARDWARE_ELEMENT__REFERENCE_OBJECT;

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
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__UTILIZATION = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relative Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__RELATIVE_UTILIZATION = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__PROCESSOR = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__THREADS = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Not Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NOT_USED = HARDWARE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remaining Absolute Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__REMAINING_ABSOLUTE_CAPACITY = HARDWARE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Remaining Relative Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__REMAINING_RELATIVE_CAPACITY = HARDWARE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Metric Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE___GET_METRIC_PARAMETER_VALUE__STRING = HARDWARE_ELEMENT___GET_METRIC_PARAMETER_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Hardware Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE___GET_HARDWARE_LEVEL = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getIOAdapter()
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
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER__REFERENCE_OBJECT = 3;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.ApplicationGroupImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getApplicationGroup()
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
	int APPLICATION_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__APPLICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__APPLICATION_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__REFERENCE_OBJECT = 3;

	/**
	 * The number of structural features of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getApplication()
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
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Core Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CORE_UTILIZATION = 1;

	/**
	 * The feature id for the '<em><b>Ram Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RAM_UTILIZATION = 2;

	/**
	 * The feature id for the '<em><b>Rom Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ROM_UTILIZATION = 3;

	/**
	 * The feature id for the '<em><b>Criticality Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CRITICALITY_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Parallel Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARALLEL_THREADS = 5;

	/**
	 * The feature id for the '<em><b>Developed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DEVELOPED_BY = 6;

	/**
	 * The feature id for the '<em><b>Io Adapter Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IO_ADAPTER_REQUIREMENTS = 7;

	/**
	 * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = 8;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__THREADS = 9;

	/**
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__REFERENCE_OBJECT = 10;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Get Metric Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___GET_METRIC_PARAMETER_VALUE__STRING = 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.ThreadImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 11;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__CORE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getIOAdapterRequirement()
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
	 * The feature id for the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>IO Adapter Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>IO Adapter Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ADAPTER_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.CommunicationRelationImpl <em>Communication Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.CommunicationRelationImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getCommunicationRelation()
	 * @generated
	 */
	int COMMUNICATION_RELATION = 13;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl <em>Abstract Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getAbstractMetric()
	 * @generated
	 */
	int ABSTRACT_METRIC = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Higher Score Is Better</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER = 2;

	/**
	 * The feature id for the '<em><b>Built In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__BUILT_IN = 3;

	/**
	 * The number of structural features of the '<em>Abstract Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Absolute Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC___COMPUTE_ABSOLUTE_SCORE__RESULT = 0;

	/**
	 * The number of operations of the '<em>Abstract Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.EvaluationImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 15;

	/**
	 * The feature id for the '<em><b>Absolute Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__ABSOLUTE_SCORES = 0;

	/**
	 * The feature id for the '<em><b>Scaled Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__SCALED_SCORES = 1;

	/**
	 * The feature id for the '<em><b>Total Scaled Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__TOTAL_SCALED_SCORE = 2;

	/**
	 * The feature id for the '<em><b>Metrics Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__METRICS_USED = 3;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.MetricParameterImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getMetricParameter()
	 * @generated
	 */
	int METRIC_PARAMETER = 16;

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
	 * The meta object id for the '<em>Metric Score Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getMetricScoreMap()
	 * @generated
	 */
	int METRIC_SCORE_MAP = 17;


	/**
	 * Returns the meta object for class '{@link java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result> <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result>
	 * @model instanceClass="java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result>"
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getName()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getSystemName()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_SystemName();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Result#getRootHardwareElements <em>Root Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Hardware Elements</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getRootHardwareElements()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_RootHardwareElements();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getTopHardwareLevel <em>Top Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Hardware Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getTopHardwareLevel()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_TopHardwareLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getBottomHardwareLevel <em>Bottom Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Hardware Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getBottomHardwareLevel()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_BottomHardwareLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Result#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getApplicationGroups()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_ApplicationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Result#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getApplications()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Result#getCommunications <em>Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communications</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getCommunications()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Communications();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.mapping.model.result.Result#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getEvaluation()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Evaluation();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#compareTo(ch.hilbri.assist.mapping.model.result.Result) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#compareTo(ch.hilbri.assist.mapping.model.result.Result)
	 * @generated
	 */
	EOperation getResult__CompareTo__Result();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getAllCompartments() <em>Get All Compartments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Compartments</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAllCompartments()
	 * @generated
	 */
	EOperation getResult__GetAllCompartments();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getAllBoxes() <em>Get All Boxes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boxes</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAllBoxes()
	 * @generated
	 */
	EOperation getResult__GetAllBoxes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getAllBoards() <em>Get All Boards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boards</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAllBoards()
	 * @generated
	 */
	EOperation getResult__GetAllBoards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAllProcessors()
	 * @generated
	 */
	EOperation getResult__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAllCores()
	 * @generated
	 */
	EOperation getResult__GetAllCores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getAllThreads() <em>Get All Threads</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Threads</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAllThreads()
	 * @generated
	 */
	EOperation getResult__GetAllThreads();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#findResultHardwareElement(ch.hilbri.assist.mapping.model.HardwareElement) <em>Find Result Hardware Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Hardware Element</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#findResultHardwareElement(ch.hilbri.assist.mapping.model.HardwareElement)
	 * @generated
	 */
	EOperation getResult__FindResultHardwareElement__HardwareElement();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#findResultApplication(ch.hilbri.assist.mapping.model.Application) <em>Find Result Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Application</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#findResultApplication(ch.hilbri.assist.mapping.model.Application)
	 * @generated
	 */
	EOperation getResult__FindResultApplication__Application();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#findResultApplicationGroup(ch.hilbri.assist.mapping.model.ApplicationGroup) <em>Find Result Application Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Application Group</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#findResultApplicationGroup(ch.hilbri.assist.mapping.model.ApplicationGroup)
	 * @generated
	 */
	EOperation getResult__FindResultApplicationGroup__ApplicationGroup();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.HardwareElement <em>Hardware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Element</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.HardwareElement
	 * @generated
	 */
	EClass getHardwareElement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.HardwareElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.HardwareElement#getName()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EAttribute getHardwareElement_Name();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.HardwareElement#getReferenceObject <em>Reference Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Object</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.HardwareElement#getReferenceObject()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EReference getHardwareElement_ReferenceObject();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.HardwareElement#getMetricParameterValue(java.lang.String) <em>Get Metric Parameter Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Metric Parameter Value</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.HardwareElement#getMetricParameterValue(java.lang.String)
	 * @generated
	 */
	EOperation getHardwareElement__GetMetricParameterValue__String();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.HardwareElement#getHardwareLevel() <em>Get Hardware Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hardware Level</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.HardwareElement#getHardwareLevel()
	 * @generated
	 */
	EOperation getHardwareElement__GetHardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Compartment#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getManufacturer()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Compartment#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getPowerSupply()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Compartment#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getSide()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Side();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Compartment#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getZone()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Zone();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boxes</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getBoxes()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Boxes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Compartment#getAllBoards() <em>Get All Boards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Boards</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getAllBoards()
	 * @generated
	 */
	EOperation getCompartment__GetAllBoards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Compartment#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getAllProcessors()
	 * @generated
	 */
	EOperation getCompartment__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Compartment#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getAllCores()
	 * @generated
	 */
	EOperation getCompartment__GetAllCores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Compartment#getHardwareLevel() <em>Get Hardware Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hardware Level</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getHardwareLevel()
	 * @generated
	 */
	EOperation getCompartment__GetHardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Box#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Box#getManufacturer()
	 * @see #getBox()
	 * @generated
	 */
	EAttribute getBox_Manufacturer();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.result.Box#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Box#getCompartment()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Compartment();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Box#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Box#getBoards()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Boards();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Box#getAllProcessors() <em>Get All Processors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Processors</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Box#getAllProcessors()
	 * @generated
	 */
	EOperation getBox__GetAllProcessors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Box#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Box#getAllCores()
	 * @generated
	 */
	EOperation getBox__GetAllCores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Box#getHardwareLevel() <em>Get Hardware Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hardware Level</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Box#getHardwareLevel()
	 * @generated
	 */
	EOperation getBox__GetHardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getManufacturer()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getBoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getBoardType()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_BoardType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getPowerSupply()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getSide()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Side();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getEss <em>Ess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ess</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getEss()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Ess();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assurance Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getAssuranceLevel()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_AssuranceLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getRamCapacity <em>Ram Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getRamCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RamCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getRamUtilization <em>Ram Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getRamUtilization()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RamUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getRomCapacity <em>Rom Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getRomCapacity()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RomCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#getRomUtilization <em>Rom Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getRomUtilization()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_RomUtilization();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.result.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Box</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getBox()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Box();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Board#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getProcessors()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Board#getIoAdapters <em>Io Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Adapters</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getIoAdapters()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_IoAdapters();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Board#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getMetricParameters()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_MetricParameters();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Board#isNotUsed <em>Not Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Used</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Board#isNotUsed()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_NotUsed();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Board#getAllApplications() <em>Get All Applications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Applications</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getAllApplications()
	 * @generated
	 */
	EOperation getBoard__GetAllApplications();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Board#getAllCores() <em>Get All Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Cores</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getAllCores()
	 * @generated
	 */
	EOperation getBoard__GetAllCores();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Board#getHardwareLevel() <em>Get Hardware Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hardware Level</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Board#getHardwareLevel()
	 * @generated
	 */
	EOperation getBoard__GetHardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Processor#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Processor#getManufacturer()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Processor#getProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Processor#getProcessorType()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ProcessorType();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.result.Processor#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Board</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Processor#getBoard()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cores</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Processor#getCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Cores();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Processor#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Processor#getMetricParameters()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_MetricParameters();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Processor#isNotUsed <em>Not Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Used</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Processor#isNotUsed()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_NotUsed();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Processor#getHardwareLevel() <em>Get Hardware Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hardware Level</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Processor#getHardwareLevel()
	 * @generated
	 */
	EOperation getProcessor__GetHardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Core#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getArchitecture()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Core#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getCapacity()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Core#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getUtilization()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Core#getRelativeUtilization <em>Relative Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getRelativeUtilization()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_RelativeUtilization();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.result.Core#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Processor</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getProcessor()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Processor();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.result.Core#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threads</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getThreads()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Threads();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Core#isNotUsed <em>Not Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Used</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#isNotUsed()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_NotUsed();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Core#getRemainingAbsoluteCapacity <em>Remaining Absolute Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Absolute Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getRemainingAbsoluteCapacity()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_RemainingAbsoluteCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Core#getRemainingRelativeCapacity <em>Remaining Relative Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Relative Capacity</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getRemainingRelativeCapacity()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_RemainingRelativeCapacity();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Core#getHardwareLevel() <em>Get Hardware Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hardware Level</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Core#getHardwareLevel()
	 * @generated
	 */
	EOperation getCore__GetHardwareLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.IOAdapter <em>IO Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapter
	 * @generated
	 */
	EClass getIOAdapter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.IOAdapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapter#getName()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.IOAdapter#getTotalUnitCount <em>Total Unit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Unit Count</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapter#getTotalUnitCount()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_TotalUnitCount();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.IOAdapter#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapter#getAdapterType()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EAttribute getIOAdapter_AdapterType();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.IOAdapter#getReferenceObject <em>Reference Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Object</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapter#getReferenceObject()
	 * @see #getIOAdapter()
	 * @generated
	 */
	EReference getIOAdapter_ReferenceObject();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Group</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.ApplicationGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.ApplicationGroup#getName()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EAttribute getApplicationGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.result.ApplicationGroup#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.ApplicationGroup#getApplications()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_Applications();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.result.ApplicationGroup#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Application Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.ApplicationGroup#getApplicationGroups()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_ApplicationGroups();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.ApplicationGroup#getReferenceObject <em>Reference Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Object</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.ApplicationGroup#getReferenceObject()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_ReferenceObject();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Application#getCoreUtilization <em>Core Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getCoreUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CoreUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Application#getRamUtilization <em>Ram Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getRamUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_RamUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Application#getRomUtilization <em>Rom Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getRomUtilization()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_RomUtilization();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Application#getCriticalityLevel <em>Criticality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality Level</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getCriticalityLevel()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CriticalityLevel();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Application#getParallelThreads <em>Parallel Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Threads</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getParallelThreads()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ParallelThreads();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Application#getDevelopedBy <em>Developed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developed By</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getDevelopedBy()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_DevelopedBy();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.result.Application#getIoAdapterRequirements <em>Io Adapter Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Io Adapter Requirements</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getIoAdapterRequirements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_IoAdapterRequirements();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.result.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restrict Mapping To Hardware Elements</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getRestrictMappingToHardwareElements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_RestrictMappingToHardwareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Application#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threads</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getThreads()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Threads();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.Application#getReferenceObject <em>Reference Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Object</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getReferenceObject()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ReferenceObject();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Application#getMetricParameterValue(java.lang.String) <em>Get Metric Parameter Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Metric Parameter Value</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Application#getMetricParameterValue(java.lang.String)
	 * @generated
	 */
	EOperation getApplication__GetMetricParameterValue__String();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.mapping.model.result.Thread#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Thread#getApplication()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Application();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.Thread#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Thread#getCore()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Core();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Thread#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Thread#getName()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Name();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement <em>IO Adapter Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Adapter Requirement</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapterRequirement
	 * @generated
	 */
	EClass getIOAdapterRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Type</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getAdapterType()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_AdapterType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getRequiredUnits <em>Required Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Units</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getRequiredUnits()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_RequiredUnits();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shared Allowed</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsSharedAllowed()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsSharedAllowed();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exclusive Only</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsExclusiveOnly()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EAttribute getIOAdapterRequirement_IsExclusiveOnly();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getReferenceObject <em>Reference Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Object</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getReferenceObject()
	 * @see #getIOAdapterRequirement()
	 * @generated
	 */
	EReference getIOAdapterRequirement_ReferenceObject();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.CommunicationRelation <em>Communication Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Relation</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.CommunicationRelation
	 * @generated
	 */
	EClass getCommunicationRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.mapping.model.result.CommunicationRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications Or Groups</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.CommunicationRelation#getApplicationsOrGroups()
	 * @see #getCommunicationRelation()
	 * @generated
	 */
	EReference getCommunicationRelation_ApplicationsOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth Utilization</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.CommunicationRelation#getBandwidthUtilization()
	 * @see #getCommunicationRelation()
	 * @generated
	 */
	EAttribute getCommunicationRelation_BandwidthUtilization();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric <em>Abstract Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Metric</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric
	 * @generated
	 */
	EClass getAbstractMetric();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric#getName()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric#getWeight()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_Weight();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Higher Score Is Better</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric#isHigherScoreIsBetter()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_HigherScoreIsBetter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric#isBuiltIn <em>Built In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric#isBuiltIn()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_BuiltIn();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric#computeAbsoluteScore(ch.hilbri.assist.mapping.model.result.Result) <em>Compute Absolute Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Absolute Score</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric#computeAbsoluteScore(ch.hilbri.assist.mapping.model.result.Result)
	 * @generated
	 */
	EOperation getAbstractMetric__ComputeAbsoluteScore__Result();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Scores</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Evaluation#getAbsoluteScores()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_AbsoluteScores();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Evaluation#getScaledScores <em>Scaled Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaled Scores</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Evaluation#getScaledScores()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_ScaledScores();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Evaluation#getTotalScaledScore <em>Total Scaled Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Scaled Score</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Evaluation#getTotalScaledScore()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_TotalScaledScore();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.mapping.model.result.Evaluation#getMetricsUsed <em>Metrics Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics Used</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Evaluation#getMetricsUsed()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_MetricsUsed();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.MetricParameter <em>Metric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Parameter</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.MetricParameter
	 * @generated
	 */
	EClass getMetricParameter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.MetricParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.MetricParameter#getName()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.MetricParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.MetricParameter#getValue()
	 * @see #getMetricParameter()
	 * @generated
	 */
	EAttribute getMetricParameter_Value();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Metric Score Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Metric Score Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap<ch.hilbri.assist.mapping.model.result.AbstractMetric, java.lang.Double>"
	 * @generated
	 */
	EDataType getMetricScoreMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultFactory getResultFactory();

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
		 * The meta object literal for the '{@link java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result> <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result>
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__NAME = eINSTANCE.getResult_Name();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__SYSTEM_NAME = eINSTANCE.getResult_SystemName();

		/**
		 * The meta object literal for the '<em><b>Root Hardware Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__ROOT_HARDWARE_ELEMENTS = eINSTANCE.getResult_RootHardwareElements();

		/**
		 * The meta object literal for the '<em><b>Top Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__TOP_HARDWARE_LEVEL = eINSTANCE.getResult_TopHardwareLevel();

		/**
		 * The meta object literal for the '<em><b>Bottom Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__BOTTOM_HARDWARE_LEVEL = eINSTANCE.getResult_BottomHardwareLevel();

		/**
		 * The meta object literal for the '<em><b>Application Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__APPLICATION_GROUPS = eINSTANCE.getResult_ApplicationGroups();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__APPLICATIONS = eINSTANCE.getResult_Applications();

		/**
		 * The meta object literal for the '<em><b>Communications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__COMMUNICATIONS = eINSTANCE.getResult_Communications();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__EVALUATION = eINSTANCE.getResult_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___COMPARE_TO__RESULT = eINSTANCE.getResult__CompareTo__Result();

		/**
		 * The meta object literal for the '<em><b>Get All Compartments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_COMPARTMENTS = eINSTANCE.getResult__GetAllCompartments();

		/**
		 * The meta object literal for the '<em><b>Get All Boxes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_BOXES = eINSTANCE.getResult__GetAllBoxes();

		/**
		 * The meta object literal for the '<em><b>Get All Boards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_BOARDS = eINSTANCE.getResult__GetAllBoards();

		/**
		 * The meta object literal for the '<em><b>Get All Processors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_PROCESSORS = eINSTANCE.getResult__GetAllProcessors();

		/**
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_CORES = eINSTANCE.getResult__GetAllCores();

		/**
		 * The meta object literal for the '<em><b>Get All Threads</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_THREADS = eINSTANCE.getResult__GetAllThreads();

		/**
		 * The meta object literal for the '<em><b>Find Result Hardware Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___FIND_RESULT_HARDWARE_ELEMENT__HARDWAREELEMENT = eINSTANCE.getResult__FindResultHardwareElement__HardwareElement();

		/**
		 * The meta object literal for the '<em><b>Find Result Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___FIND_RESULT_APPLICATION__APPLICATION = eINSTANCE.getResult__FindResultApplication__Application();

		/**
		 * The meta object literal for the '<em><b>Find Result Application Group</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___FIND_RESULT_APPLICATION_GROUP__APPLICATIONGROUP = eINSTANCE.getResult__FindResultApplicationGroup__ApplicationGroup();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.HardwareElementImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getHardwareElement()
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
		 * The meta object literal for the '<em><b>Reference Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ELEMENT__REFERENCE_OBJECT = eINSTANCE.getHardwareElement_ReferenceObject();

		/**
		 * The meta object literal for the '<em><b>Get Metric Parameter Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HARDWARE_ELEMENT___GET_METRIC_PARAMETER_VALUE__STRING = eINSTANCE.getHardwareElement__GetMetricParameterValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Hardware Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HARDWARE_ELEMENT___GET_HARDWARE_LEVEL = eINSTANCE.getHardwareElement__GetHardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.CompartmentImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getCompartment()
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
		 * The meta object literal for the '<em><b>Get Hardware Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___GET_HARDWARE_LEVEL = eINSTANCE.getCompartment__GetHardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.BoxImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getBox()
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
		 * The meta object literal for the '<em><b>Get Hardware Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOX___GET_HARDWARE_LEVEL = eINSTANCE.getBox__GetHardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.BoardImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getBoard()
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
		 * The meta object literal for the '<em><b>Ram Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__RAM_UTILIZATION = eINSTANCE.getBoard_RamUtilization();

		/**
		 * The meta object literal for the '<em><b>Rom Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ROM_CAPACITY = eINSTANCE.getBoard_RomCapacity();

		/**
		 * The meta object literal for the '<em><b>Rom Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ROM_UTILIZATION = eINSTANCE.getBoard_RomUtilization();

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
		 * The meta object literal for the '<em><b>Not Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NOT_USED = eINSTANCE.getBoard_NotUsed();

		/**
		 * The meta object literal for the '<em><b>Get All Applications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_ALL_APPLICATIONS = eINSTANCE.getBoard__GetAllApplications();

		/**
		 * The meta object literal for the '<em><b>Get All Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_ALL_CORES = eINSTANCE.getBoard__GetAllCores();

		/**
		 * The meta object literal for the '<em><b>Get Hardware Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_HARDWARE_LEVEL = eINSTANCE.getBoard__GetHardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.ProcessorImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getProcessor()
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
		 * The meta object literal for the '<em><b>Not Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NOT_USED = eINSTANCE.getProcessor_NotUsed();

		/**
		 * The meta object literal for the '<em><b>Get Hardware Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSOR___GET_HARDWARE_LEVEL = eINSTANCE.getProcessor__GetHardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.CoreImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getCore()
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
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__UTILIZATION = eINSTANCE.getCore_Utilization();

		/**
		 * The meta object literal for the '<em><b>Relative Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__RELATIVE_UTILIZATION = eINSTANCE.getCore_RelativeUtilization();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__PROCESSOR = eINSTANCE.getCore_Processor();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__THREADS = eINSTANCE.getCore_Threads();

		/**
		 * The meta object literal for the '<em><b>Not Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__NOT_USED = eINSTANCE.getCore_NotUsed();

		/**
		 * The meta object literal for the '<em><b>Remaining Absolute Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__REMAINING_ABSOLUTE_CAPACITY = eINSTANCE.getCore_RemainingAbsoluteCapacity();

		/**
		 * The meta object literal for the '<em><b>Remaining Relative Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__REMAINING_RELATIVE_CAPACITY = eINSTANCE.getCore_RemainingRelativeCapacity();

		/**
		 * The meta object literal for the '<em><b>Get Hardware Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE___GET_HARDWARE_LEVEL = eINSTANCE.getCore__GetHardwareLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl <em>IO Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getIOAdapter()
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
		 * The meta object literal for the '<em><b>Reference Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_ADAPTER__REFERENCE_OBJECT = eINSTANCE.getIOAdapter_ReferenceObject();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.ApplicationGroupImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getApplicationGroup()
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
		 * The meta object literal for the '<em><b>Application Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__APPLICATION_GROUPS = eINSTANCE.getApplicationGroup_ApplicationGroups();

		/**
		 * The meta object literal for the '<em><b>Reference Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__REFERENCE_OBJECT = eINSTANCE.getApplicationGroup_ReferenceObject();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getApplication()
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
		 * The meta object literal for the '<em><b>Io Adapter Requirements</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Reference Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__REFERENCE_OBJECT = eINSTANCE.getApplication_ReferenceObject();

		/**
		 * The meta object literal for the '<em><b>Get Metric Parameter Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___GET_METRIC_PARAMETER_VALUE__STRING = eINSTANCE.getApplication__GetMetricParameterValue__String();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.ThreadImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__APPLICATION = eINSTANCE.getThread_Application();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__CORE = eINSTANCE.getThread_Core();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__NAME = eINSTANCE.getThread_Name();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl <em>IO Adapter Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getIOAdapterRequirement()
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
		 * The meta object literal for the '<em><b>Reference Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT = eINSTANCE.getIOAdapterRequirement_ReferenceObject();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.CommunicationRelationImpl <em>Communication Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.CommunicationRelationImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getCommunicationRelation()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl <em>Abstract Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getAbstractMetric()
		 * @generated
		 */
		EClass ABSTRACT_METRIC = eINSTANCE.getAbstractMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METRIC__NAME = eINSTANCE.getAbstractMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METRIC__WEIGHT = eINSTANCE.getAbstractMetric_Weight();

		/**
		 * The meta object literal for the '<em><b>Higher Score Is Better</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER = eINSTANCE.getAbstractMetric_HigherScoreIsBetter();

		/**
		 * The meta object literal for the '<em><b>Built In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METRIC__BUILT_IN = eINSTANCE.getAbstractMetric_BuiltIn();

		/**
		 * The meta object literal for the '<em><b>Compute Absolute Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_METRIC___COMPUTE_ABSOLUTE_SCORE__RESULT = eINSTANCE.getAbstractMetric__ComputeAbsoluteScore__Result();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.EvaluationImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Absolute Scores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__ABSOLUTE_SCORES = eINSTANCE.getEvaluation_AbsoluteScores();

		/**
		 * The meta object literal for the '<em><b>Scaled Scores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__SCALED_SCORES = eINSTANCE.getEvaluation_ScaledScores();

		/**
		 * The meta object literal for the '<em><b>Total Scaled Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__TOTAL_SCALED_SCORE = eINSTANCE.getEvaluation_TotalScaledScore();

		/**
		 * The meta object literal for the '<em><b>Metrics Used</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__METRICS_USED = eINSTANCE.getEvaluation_MetricsUsed();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.MetricParameterImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getMetricParameter()
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
		 * The meta object literal for the '<em>Metric Score Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getMetricScoreMap()
		 * @generated
		 */
		EDataType METRIC_SCORE_MAP = eINSTANCE.getMetricScoreMap();

	}

} //ResultPackage
