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
	 * The feature id for the '<em><b>Global Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__GLOBAL_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Compartments Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__COMPARTMENTS_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Interfaces Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__INTERFACES_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Interface Groups Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__INTERFACE_GROUPS_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Restrictions Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL__RESTRICTIONS_BLOCK = 4;

	/**
	 * The number of structural features of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get System Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_SYSTEM_NAME = 0;

	/**
	 * The operation id for the '<em>Get Compatible Io Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_COMPATIBLE_IO_TYPES = 1;

	/**
	 * The operation id for the '<em>Get Cable Weight Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_CABLE_WEIGHT_DATA = 2;

	/**
	 * The operation id for the '<em>Get Protection Level Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_PROTECTION_LEVEL_DATA = 3;

	/**
	 * The operation id for the '<em>Get Compartments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_COMPARTMENTS = 4;

	/**
	 * The operation id for the '<em>Get RD Cs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_RD_CS = 5;

	/**
	 * The operation id for the '<em>Get Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_CONNECTORS = 6;

	/**
	 * The operation id for the '<em>Get Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_EQ_INTERFACES = 7;

	/**
	 * The operation id for the '<em>Get Eq Interface Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_EQ_INTERFACE_GROUPS = 8;

	/**
	 * The operation id for the '<em>Get Colocality Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_COLOCALITY_RELATIONS = 9;

	/**
	 * The operation id for the '<em>Get Dislocality Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_DISLOCALITY_RELATIONS = 10;

	/**
	 * The operation id for the '<em>Get Valid Deployments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_VALID_DEPLOYMENTS = 11;

	/**
	 * The operation id for the '<em>Get Invalid Deployments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_INVALID_DEPLOYMENTS = 12;

	/**
	 * The operation id for the '<em>Get All Hardware Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT = 13;

	/**
	 * The number of operations of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl <em>Global Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getGlobalBlock()
	 * @generated
	 */
	int GLOBAL_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__SYSTEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Compatible Io Types Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Cable Weight Data Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Protection Level Data Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK = 3;

	/**
	 * The number of structural features of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypesBlockImpl <em>Compatible Io Types Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypesBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompatibleIoTypesBlock()
	 * @generated
	 */
	int COMPATIBLE_IO_TYPES_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Compatible Io Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Compatible Io Types Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_IO_TYPES_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Compatible Io Types Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_IO_TYPES_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypeEntryImpl <em>Compatible Io Type Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypeEntryImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompatibleIoTypeEntry()
	 * @generated
	 */
	int COMPATIBLE_IO_TYPE_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Eq Interface Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Pin Interface Io Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Compatible Io Type Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_IO_TYPE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compatible Io Type Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_IO_TYPE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CableWeightDataBlockImpl <em>Cable Weight Data Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CableWeightDataBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCableWeightDataBlock()
	 * @generated
	 */
	int CABLE_WEIGHT_DATA_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Cable Weight Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Cable Weight Data Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_DATA_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Default Cable Weight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_DATA_BLOCK___GET_DEFAULT_CABLE_WEIGHT = 0;

	/**
	 * The operation id for the '<em>Get Cable Weight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_DATA_BLOCK___GET_CABLE_WEIGHT__STRING = 1;

	/**
	 * The number of operations of the '<em>Cable Weight Data Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_DATA_BLOCK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CableWeightEntryImpl <em>Cable Weight Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CableWeightEntryImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCableWeightEntry()
	 * @generated
	 */
	int CABLE_WEIGHT_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Default Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Eq Interface Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_ENTRY__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Cable Weight Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cable Weight Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_WEIGHT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelDataBlockImpl <em>Protection Level Data Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ProtectionLevelDataBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProtectionLevelDataBlock()
	 * @generated
	 */
	int PROTECTION_LEVEL_DATA_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Protection Level Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_DATA_BLOCK__PROTECTION_LEVEL_ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Protection Level Data Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_DATA_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Protection Level Data Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_DATA_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelEntryImpl <em>Protection Level Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ProtectionLevelEntryImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProtectionLevelEntry()
	 * @generated
	 */
	int PROTECTION_LEVEL_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Rdc Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_ENTRY__RDC_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Emh Zone1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_ENTRY__EMH_ZONE1 = 1;

	/**
	 * The feature id for the '<em><b>Protection Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Protection Level Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Protection Level Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_LEVEL_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CompartmentsBlockImpl <em>Compartments Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CompartmentsBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompartmentsBlock()
	 * @generated
	 */
	int COMPARTMENTS_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENTS_BLOCK__COMPARTMENTS = 0;

	/**
	 * The number of structural features of the '<em>Compartments Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENTS_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Compartments Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENTS_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareElement()
	 * @generated
	 */
	int HARDWARE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metric Parameters Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK = 1;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.MetricParametersBlockImpl <em>Metric Parameters Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.MetricParametersBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getMetricParametersBlock()
	 * @generated
	 */
	int METRIC_PARAMETERS_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PARAMETERS_BLOCK__METRIC_PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Metric Parameters Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PARAMETERS_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metric Parameters Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PARAMETERS_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.MetricParameterImpl <em>Metric Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.MetricParameterImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getMetricParameter()
	 * @generated
	 */
	int METRIC_PARAMETER = 11;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.CompartmentImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metric Parameters Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__METRIC_PARAMETERS_BLOCK = HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK;

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
	 * The feature id for the '<em><b>Rdcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__RDCS = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___TO_STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_ALL_CONNECTORS = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Available Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT___GET_AVAILABLE_EQ_INTERFACES__ELIST = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl <em>RDC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.RDCImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getRDC()
	 * @generated
	 */
	int RDC = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metric Parameters Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__METRIC_PARAMETERS_BLOCK = HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__MANUFACTURER = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__POWER_SUPPLY = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__SIDE = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rdc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__RDC_TYPE = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__ESS = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__LOCATION = HARDWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__RESOURCE_X = HARDWARE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__RESOURCE_Y = HARDWARE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Resource Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__RESOURCE_Z = HARDWARE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__COMPARTMENT = HARDWARE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__CONNECTORS = HARDWARE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connected Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC__CONNECTED_PINS = HARDWARE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>RDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC___TO_STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Available Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC___GET_AVAILABLE_EQ_INTERFACES__ELIST = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>RDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDC_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.InternallyConnectedPinEntryImpl <em>Internally Connected Pin Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.InternallyConnectedPinEntryImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInternallyConnectedPinEntry()
	 * @generated
	 */
	int INTERNALLY_CONNECTED_PIN_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNALLY_CONNECTED_PIN_ENTRY__PINS = 0;

	/**
	 * The number of structural features of the '<em>Internally Connected Pin Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNALLY_CONNECTED_PIN_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Internally Connected Pin Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNALLY_CONNECTED_PIN_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ConnectorImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = HARDWARE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metric Parameters Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__METRIC_PARAMETERS_BLOCK = HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK;

	/**
	 * The feature id for the '<em><b>Rdc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RDC = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available Eq Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__AVAILABLE_EQ_INTERFACES = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Full Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___FULL_NAME = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___TO_STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Available Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_AVAILABLE_EQ_INTERFACES__ELIST = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl <em>Available Eq Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getAvailableEqInterface()
	 * @generated
	 */
	int AVAILABLE_EQ_INTERFACE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_EQ_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Eq Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_EQ_INTERFACE__COUNT = 2;

	/**
	 * The feature id for the '<em><b>Protection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Available Eq Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_EQ_INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Available Eq Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_EQ_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.InterfacesBlockImpl <em>Interfaces Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.InterfacesBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInterfacesBlock()
	 * @generated
	 */
	int INTERFACES_BLOCK = 17;

	/**
	 * The feature id for the '<em><b>Eq Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_BLOCK__EQ_INTERFACES = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceOrGroupImpl <em>Eq Interface Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceOrGroupImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterfaceOrGroup()
	 * @generated
	 */
	int EQ_INTERFACE_OR_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_OR_GROUP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Eq Interface Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_OR_GROUP_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_OR_GROUP___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Eq Interface Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_OR_GROUP_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl <em>Eq Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterface()
	 * @generated
	 */
	int EQ_INTERFACE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__NAME = EQ_INTERFACE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__SYSTEM = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Ata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__SUB_ATA = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__LINE_NAME = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wiring Lane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__WIRING_LANE = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grp Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__GRP_INFO = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__ROUTE = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pw Sup1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__PW_SUP1 = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Emh Zone1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__EMH_ZONE1 = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__IO_TYPE = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__RESOURCE = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resource X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__RESOURCE_X = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resource Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__RESOURCE_Y = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resource Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__RESOURCE_Z = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE__METRIC_PARAMETERS = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Eq Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_FEATURE_COUNT = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE___TO_STRING = EQ_INTERFACE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eq Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_OPERATION_COUNT = EQ_INTERFACE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.InterfaceGroupsBlockImpl <em>Interface Groups Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.InterfaceGroupsBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInterfaceGroupsBlock()
	 * @generated
	 */
	int INTERFACE_GROUPS_BLOCK = 20;

	/**
	 * The feature id for the '<em><b>Eq Interface Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Interface Groups Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GROUPS_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface Groups Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GROUPS_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl <em>Eq Interface Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterfaceGroup()
	 * @generated
	 */
	int EQ_INTERFACE_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP__NAME = EQ_INTERFACE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Eq Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP__EQ_INTERFACES = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Without Eq Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implicit Member Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Without Implicit Member Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eq Interface Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_FEATURE_COUNT = EQ_INTERFACE_OR_GROUP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP___TO_STRING = EQ_INTERFACE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Implicitly Defined Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP___GET_IMPLICITLY_DEFINED_EQ_INTERFACES = EQ_INTERFACE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Without Implicitly Defined Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP___GET_WITHOUT_IMPLICITLY_DEFINED_EQ_INTERFACES = EQ_INTERFACE_OR_GROUP_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eq Interface Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_OPERATION_COUNT = EQ_INTERFACE_OR_GROUP_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionImpl <em>Implicit Eq Interface Member Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getImplicitEqInterfaceMemberDefinition()
	 * @generated
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Implicit Eq Interface Member Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Implicitly Defined Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION___GET_IMPLICITLY_DEFINED_EQ_INTERFACES = 0;

	/**
	 * The number of operations of the '<em>Implicit Eq Interface Member Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionAttributesAndValuesImpl <em>Implicit Eq Interface Member Definition Attributes And Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionAttributesAndValuesImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getImplicitEqInterfaceMemberDefinitionAttributesAndValues()
	 * @generated
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Implicit Eq Interface Member Definition Attributes And Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Implicit Eq Interface Member Definition Attributes And Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupWithCombinedDefinitionImpl <em>Eq Interface Group With Combined Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupWithCombinedDefinitionImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterfaceGroupWithCombinedDefinition()
	 * @generated
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__NAME = EQ_INTERFACE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Eq Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__EQ_INTERFACES = EQ_INTERFACE_GROUP__EQ_INTERFACES;

	/**
	 * The feature id for the '<em><b>Without Eq Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__WITHOUT_EQ_INTERFACES = EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implicit Member Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__IMPLICIT_MEMBER_DEFINITIONS = EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Without Implicit Member Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS = EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Combined Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS = EQ_INTERFACE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eq Interface Group With Combined Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION_FEATURE_COUNT = EQ_INTERFACE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION___TO_STRING = EQ_INTERFACE_GROUP___TO_STRING;

	/**
	 * The operation id for the '<em>Get Implicitly Defined Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION___GET_IMPLICITLY_DEFINED_EQ_INTERFACES = EQ_INTERFACE_GROUP___GET_IMPLICITLY_DEFINED_EQ_INTERFACES;

	/**
	 * The operation id for the '<em>Get Without Implicitly Defined Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION___GET_WITHOUT_IMPLICITLY_DEFINED_EQ_INTERFACES = EQ_INTERFACE_GROUP___GET_WITHOUT_IMPLICITLY_DEFINED_EQ_INTERFACES;

	/**
	 * The number of operations of the '<em>Eq Interface Group With Combined Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION_OPERATION_COUNT = EQ_INTERFACE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl <em>Restrictions Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getRestrictionsBlock()
	 * @generated
	 */
	int RESTRICTIONS_BLOCK = 25;

	/**
	 * The feature id for the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS = 0;

	/**
	 * The feature id for the '<em><b>Colocality Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Valid Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS = 2;

	/**
	 * The feature id for the '<em><b>Invalid Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS = 3;

	/**
	 * The number of structural features of the '<em>Restrictions Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Restrictions Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTIONS_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDislocalityRelation()
	 * @generated
	 */
	int DISLOCALITY_RELATION = 26;

	/**
	 * The feature id for the '<em><b>Eq Interface Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS = 0;

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
	 * The operation id for the '<em>Get All Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION___GET_ALL_INTERFACES = 0;

	/**
	 * The operation id for the '<em>Get Total Interface Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION___GET_TOTAL_INTERFACE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = 2;

	/**
	 * The number of operations of the '<em>Dislocality Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISLOCALITY_RELATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ColocalityRelationImpl <em>Colocality Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ColocalityRelationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getColocalityRelation()
	 * @generated
	 */
	int COLOCALITY_RELATION = 27;

	/**
	 * The feature id for the '<em><b>Eq Interface Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS = 0;

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
	 * The operation id for the '<em>Get All Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION___GET_ALL_INTERFACES = 0;

	/**
	 * The operation id for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = 1;

	/**
	 * The number of operations of the '<em>Colocality Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCALITY_RELATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DeploymentSpecificationImpl <em>Deployment Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DeploymentSpecificationImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentSpecification()
	 * @generated
	 */
	int DEPLOYMENT_SPECIFICATION = 28;

	/**
	 * The feature id for the '<em><b>Eq Interface Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Implicit Hardware Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Deployment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = 0;

	/**
	 * The operation id for the '<em>Get Implicitly Defined Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION___GET_IMPLICITLY_DEFINED_CONNECTORS = 1;

	/**
	 * The number of operations of the '<em>Deployment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionImpl <em>Deployment Implicit Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentImplicitDefinition()
	 * @generated
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION = 29;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Deployment Implicit Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Implicitly Defined Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION___GET_IMPLICITLY_DEFINED_CONNECTORS = 0;

	/**
	 * The number of operations of the '<em>Deployment Implicit Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionAttributeAndValueImpl <em>Deployment Implicit Definition Attribute And Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionAttributeAndValueImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentImplicitDefinitionAttributeAndValue()
	 * @generated
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE = 30;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Deployment Implicit Definition Attribute And Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment Implicit Definition Attribute And Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.ValidDeploymentImpl <em>Valid Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.ValidDeploymentImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getValidDeployment()
	 * @generated
	 */
	int VALID_DEPLOYMENT = 31;

	/**
	 * The feature id for the '<em><b>Eq Interface Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DEPLOYMENT__EQ_INTERFACE_OR_GROUPS = DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS;

	/**
	 * The feature id for the '<em><b>Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DEPLOYMENT__HARDWARE_ELEMENTS = DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Hardware Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DEPLOYMENT__IMPLICIT_HARDWARE_ELEMENTS = DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Valid Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DEPLOYMENT_FEATURE_COUNT = DEPLOYMENT_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DEPLOYMENT___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = DEPLOYMENT_SPECIFICATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES;

	/**
	 * The operation id for the '<em>Get Implicitly Defined Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DEPLOYMENT___GET_IMPLICITLY_DEFINED_CONNECTORS = DEPLOYMENT_SPECIFICATION___GET_IMPLICITLY_DEFINED_CONNECTORS;

	/**
	 * The number of operations of the '<em>Valid Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DEPLOYMENT_OPERATION_COUNT = DEPLOYMENT_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.impl.InvalidDeploymentImpl <em>Invalid Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.impl.InvalidDeploymentImpl
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInvalidDeployment()
	 * @generated
	 */
	int INVALID_DEPLOYMENT = 32;

	/**
	 * The feature id for the '<em><b>Eq Interface Or Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DEPLOYMENT__EQ_INTERFACE_OR_GROUPS = DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS;

	/**
	 * The feature id for the '<em><b>Hardware Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DEPLOYMENT__HARDWARE_ELEMENTS = DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Hardware Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DEPLOYMENT__IMPLICIT_HARDWARE_ELEMENTS = DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Invalid Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DEPLOYMENT_FEATURE_COUNT = DEPLOYMENT_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DEPLOYMENT___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = DEPLOYMENT_SPECIFICATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES;

	/**
	 * The operation id for the '<em>Get Implicitly Defined Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DEPLOYMENT___GET_IMPLICITLY_DEFINED_CONNECTORS = DEPLOYMENT_SPECIFICATION___GET_IMPLICITLY_DEFINED_CONNECTORS;

	/**
	 * The number of operations of the '<em>Invalid Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DEPLOYMENT_OPERATION_COUNT = DEPLOYMENT_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelType <em>Protection Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProtectionLevelType()
	 * @generated
	 */
	int PROTECTION_LEVEL_TYPE = 33;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute <em>Implicit Eq Interface Member Definition Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getImplicitEqInterfaceMemberDefinitionAttribute()
	 * @generated
	 */
	int IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTE = 34;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
	 * @generated
	 */
	int HARDWARE_ARCHITECTURE_LEVEL_TYPE = 35;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute <em>Deployment Implicit Definition Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute
	 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentImplicitDefinitionAttribute()
	 * @generated
	 */
	int DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE = 36;


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
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.AssistModel#getGlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getGlobalBlock()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_GlobalBlock();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.AssistModel#getCompartmentsBlock <em>Compartments Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compartments Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getCompartmentsBlock()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_CompartmentsBlock();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.AssistModel#getInterfacesBlock <em>Interfaces Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getInterfacesBlock()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_InterfacesBlock();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.AssistModel#getInterfaceGroupsBlock <em>Interface Groups Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Groups Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getInterfaceGroupsBlock()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_InterfaceGroupsBlock();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.AssistModel#getRestrictionsBlock <em>Restrictions Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restrictions Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getRestrictionsBlock()
	 * @see #getAssistModel()
	 * @generated
	 */
	EReference getAssistModel_RestrictionsBlock();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getSystemName() <em>Get System Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get System Name</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getSystemName()
	 * @generated
	 */
	EOperation getAssistModel__GetSystemName();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getCompatibleIoTypes() <em>Get Compatible Io Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Compatible Io Types</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getCompatibleIoTypes()
	 * @generated
	 */
	EOperation getAssistModel__GetCompatibleIoTypes();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getCableWeightData() <em>Get Cable Weight Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cable Weight Data</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getCableWeightData()
	 * @generated
	 */
	EOperation getAssistModel__GetCableWeightData();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getProtectionLevelData() <em>Get Protection Level Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Protection Level Data</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getProtectionLevelData()
	 * @generated
	 */
	EOperation getAssistModel__GetProtectionLevelData();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getCompartments() <em>Get Compartments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Compartments</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getCompartments()
	 * @generated
	 */
	EOperation getAssistModel__GetCompartments();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getRDCs() <em>Get RD Cs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RD Cs</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getRDCs()
	 * @generated
	 */
	EOperation getAssistModel__GetRDCs();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getConnectors() <em>Get Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connectors</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getConnectors()
	 * @generated
	 */
	EOperation getAssistModel__GetConnectors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getEqInterfaces() <em>Get Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getEqInterfaces()
	 * @generated
	 */
	EOperation getAssistModel__GetEqInterfaces();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getEqInterfaceGroups() <em>Get Eq Interface Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Eq Interface Groups</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getEqInterfaceGroups()
	 * @generated
	 */
	EOperation getAssistModel__GetEqInterfaceGroups();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getColocalityRelations() <em>Get Colocality Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Colocality Relations</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getColocalityRelations()
	 * @generated
	 */
	EOperation getAssistModel__GetColocalityRelations();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getDislocalityRelations() <em>Get Dislocality Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dislocality Relations</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getDislocalityRelations()
	 * @generated
	 */
	EOperation getAssistModel__GetDislocalityRelations();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getValidDeployments() <em>Get Valid Deployments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Valid Deployments</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getValidDeployments()
	 * @generated
	 */
	EOperation getAssistModel__GetValidDeployments();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getInvalidDeployments() <em>Get Invalid Deployments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invalid Deployments</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.AssistModel#getInvalidDeployments()
	 * @generated
	 */
	EOperation getAssistModel__GetInvalidDeployments();

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
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.GlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.GlobalBlock
	 * @generated
	 */
	EClass getGlobalBlock();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.GlobalBlock#getSystemName()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EAttribute getGlobalBlock_SystemName();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getCompatibleIoTypesBlock <em>Compatible Io Types Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compatible Io Types Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.GlobalBlock#getCompatibleIoTypesBlock()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_CompatibleIoTypesBlock();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getCableWeightDataBlock <em>Cable Weight Data Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cable Weight Data Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.GlobalBlock#getCableWeightDataBlock()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_CableWeightDataBlock();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getProtectionLevelDataBlock <em>Protection Level Data Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protection Level Data Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.GlobalBlock#getProtectionLevelDataBlock()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_ProtectionLevelDataBlock();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock <em>Compatible Io Types Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatible Io Types Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock
	 * @generated
	 */
	EClass getCompatibleIoTypesBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock#getCompatibleIoTypes <em>Compatible Io Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compatible Io Types</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock#getCompatibleIoTypes()
	 * @see #getCompatibleIoTypesBlock()
	 * @generated
	 */
	EReference getCompatibleIoTypesBlock_CompatibleIoTypes();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry <em>Compatible Io Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatible Io Type Entry</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry
	 * @generated
	 */
	EClass getCompatibleIoTypeEntry();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry#getEqInterfaceIoType <em>Eq Interface Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eq Interface Io Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry#getEqInterfaceIoType()
	 * @see #getCompatibleIoTypeEntry()
	 * @generated
	 */
	EAttribute getCompatibleIoTypeEntry_EqInterfaceIoType();

	/**
	 * Returns the meta object for the attribute list '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry#getPinInterfaceIoTypes <em>Pin Interface Io Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pin Interface Io Types</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry#getPinInterfaceIoTypes()
	 * @see #getCompatibleIoTypeEntry()
	 * @generated
	 */
	EAttribute getCompatibleIoTypeEntry_PinInterfaceIoTypes();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.CableWeightDataBlock <em>Cable Weight Data Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Weight Data Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightDataBlock
	 * @generated
	 */
	EClass getCableWeightDataBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.CableWeightDataBlock#getCableWeightEntries <em>Cable Weight Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cable Weight Entries</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightDataBlock#getCableWeightEntries()
	 * @see #getCableWeightDataBlock()
	 * @generated
	 */
	EReference getCableWeightDataBlock_CableWeightEntries();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.CableWeightDataBlock#getDefaultCableWeight() <em>Get Default Cable Weight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Cable Weight</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightDataBlock#getDefaultCableWeight()
	 * @generated
	 */
	EOperation getCableWeightDataBlock__GetDefaultCableWeight();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.CableWeightDataBlock#getCableWeight(java.lang.String) <em>Get Cable Weight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cable Weight</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightDataBlock#getCableWeight(java.lang.String)
	 * @generated
	 */
	EOperation getCableWeightDataBlock__GetCableWeight__String();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry <em>Cable Weight Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Weight Entry</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightEntry
	 * @generated
	 */
	EClass getCableWeightEntry();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#isDefaultEntry <em>Default Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Entry</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightEntry#isDefaultEntry()
	 * @see #getCableWeightEntry()
	 * @generated
	 */
	EAttribute getCableWeightEntry_DefaultEntry();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#getEqInterfaceIoType <em>Eq Interface Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eq Interface Io Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightEntry#getEqInterfaceIoType()
	 * @see #getCableWeightEntry()
	 * @generated
	 */
	EAttribute getCableWeightEntry_EqInterfaceIoType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CableWeightEntry#getWeight()
	 * @see #getCableWeightEntry()
	 * @generated
	 */
	EAttribute getCableWeightEntry_Weight();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock <em>Protection Level Data Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Level Data Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock
	 * @generated
	 */
	EClass getProtectionLevelDataBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock#getProtectionLevelEntries <em>Protection Level Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protection Level Entries</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock#getProtectionLevelEntries()
	 * @see #getProtectionLevelDataBlock()
	 * @generated
	 */
	EReference getProtectionLevelDataBlock_ProtectionLevelEntries();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry <em>Protection Level Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Level Entry</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelEntry
	 * @generated
	 */
	EClass getProtectionLevelEntry();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getRdcLocation <em>Rdc Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdc Location</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getRdcLocation()
	 * @see #getProtectionLevelEntry()
	 * @generated
	 */
	EAttribute getProtectionLevelEntry_RdcLocation();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getEmhZone1 <em>Emh Zone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emh Zone1</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getEmhZone1()
	 * @see #getProtectionLevelEntry()
	 * @generated
	 */
	EAttribute getProtectionLevelEntry_EmhZone1();

	/**
	 * Returns the meta object for the attribute list '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getProtectionLevel <em>Protection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Protection Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getProtectionLevel()
	 * @see #getProtectionLevelEntry()
	 * @generated
	 */
	EAttribute getProtectionLevelEntry_ProtectionLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.CompartmentsBlock <em>Compartments Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartments Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompartmentsBlock
	 * @generated
	 */
	EClass getCompartmentsBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.CompartmentsBlock#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see ch.hilbri.assist.datamodel.model.CompartmentsBlock#getCompartments()
	 * @see #getCompartmentsBlock()
	 * @generated
	 */
	EReference getCompartmentsBlock_Compartments();

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
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.model.HardwareElement#getMetricParametersBlock <em>Metric Parameters Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metric Parameters Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.HardwareElement#getMetricParametersBlock()
	 * @see #getHardwareElement()
	 * @generated
	 */
	EReference getHardwareElement_MetricParametersBlock();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.MetricParametersBlock <em>Metric Parameters Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Parameters Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.MetricParametersBlock
	 * @generated
	 */
	EClass getMetricParametersBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.MetricParametersBlock#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.datamodel.model.MetricParametersBlock#getMetricParameters()
	 * @see #getMetricParametersBlock()
	 * @generated
	 */
	EReference getMetricParametersBlock_MetricParameters();

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
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Compartment#getRdcs <em>Rdcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdcs</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getRdcs()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Rdcs();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Compartment#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#toString()
	 * @generated
	 */
	EOperation getCompartment__ToString();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Compartment#getAllConnectors() <em>Get All Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Connectors</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getAllConnectors()
	 * @generated
	 */
	EOperation getCompartment__GetAllConnectors();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Compartment#getAvailableEqInterfaces(org.eclipse.emf.common.util.EList) <em>Get Available Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getAvailableEqInterfaces(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCompartment__GetAvailableEqInterfaces__EList();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.RDC <em>RDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDC</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC
	 * @generated
	 */
	EClass getRDC();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getManufacturer()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getPowerSupply()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_PowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getSide()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_Side();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getRdcType <em>Rdc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdc Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getRdcType()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_RdcType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getEss <em>Ess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ess</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getEss()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_Ess();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getLocation()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_Location();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceX <em>Resource X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource X</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getResourceX()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_ResourceX();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceY <em>Resource Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Y</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getResourceY()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_ResourceY();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceZ <em>Resource Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Z</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getResourceZ()
	 * @see #getRDC()
	 * @generated
	 */
	EAttribute getRDC_ResourceZ();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.datamodel.model.RDC#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getCompartment()
	 * @see #getRDC()
	 * @generated
	 */
	EReference getRDC_Compartment();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.RDC#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getConnectors()
	 * @see #getRDC()
	 * @generated
	 */
	EReference getRDC_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.RDC#getConnectedPins <em>Connected Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Pins</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getConnectedPins()
	 * @see #getRDC()
	 * @generated
	 */
	EReference getRDC_ConnectedPins();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.RDC#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.RDC#toString()
	 * @generated
	 */
	EOperation getRDC__ToString();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.RDC#getAvailableEqInterfaces(org.eclipse.emf.common.util.EList) <em>Get Available Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.RDC#getAvailableEqInterfaces(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRDC__GetAvailableEqInterfaces__EList();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry <em>Internally Connected Pin Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internally Connected Pin Entry</em>'.
	 * @see ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry
	 * @generated
	 */
	EClass getInternallyConnectedPinEntry();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pins</em>'.
	 * @see ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry#getPins()
	 * @see #getInternallyConnectedPinEntry()
	 * @generated
	 */
	EReference getInternallyConnectedPinEntry_Pins();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the container reference '{@link ch.hilbri.assist.datamodel.model.Connector#getRdc <em>Rdc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdc</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Connector#getRdc()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Rdc();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.Connector#getAvailableEqInterfaces <em>Available Eq Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Eq Interfaces</em>'.
	 * @see ch.hilbri.assist.datamodel.model.Connector#getAvailableEqInterfaces()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_AvailableEqInterfaces();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Connector#fullName() <em>Full Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Full Name</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Connector#fullName()
	 * @generated
	 */
	EOperation getConnector__FullName();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Connector#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Connector#toString()
	 * @generated
	 */
	EOperation getConnector__ToString();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.Connector#getAvailableEqInterfaces(org.eclipse.emf.common.util.EList) <em>Get Available Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.Connector#getAvailableEqInterfaces(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getConnector__GetAvailableEqInterfaces__EList();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface <em>Available Eq Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Available Eq Interface</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AvailableEqInterface
	 * @generated
	 */
	EClass getAvailableEqInterface();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AvailableEqInterface#getName()
	 * @see #getAvailableEqInterface()
	 * @generated
	 */
	EAttribute getAvailableEqInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getEqInterfaceType <em>Eq Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eq Interface Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AvailableEqInterface#getEqInterfaceType()
	 * @see #getAvailableEqInterface()
	 * @generated
	 */
	EAttribute getAvailableEqInterface_EqInterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AvailableEqInterface#getCount()
	 * @see #getAvailableEqInterface()
	 * @generated
	 */
	EAttribute getAvailableEqInterface_Count();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getProtectionLevel <em>Protection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protection Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.AvailableEqInterface#getProtectionLevel()
	 * @see #getAvailableEqInterface()
	 * @generated
	 */
	EAttribute getAvailableEqInterface_ProtectionLevel();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.InterfacesBlock <em>Interfaces Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.InterfacesBlock
	 * @generated
	 */
	EClass getInterfacesBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.InterfacesBlock#getEqInterfaces <em>Eq Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq Interfaces</em>'.
	 * @see ch.hilbri.assist.datamodel.model.InterfacesBlock#getEqInterfaces()
	 * @see #getInterfacesBlock()
	 * @generated
	 */
	EReference getInterfacesBlock_EqInterfaces();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup <em>Eq Interface Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Interface Or Group</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup
	 * @generated
	 */
	EClass getEqInterfaceOrGroup();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup#getName()
	 * @see #getEqInterfaceOrGroup()
	 * @generated
	 */
	EAttribute getEqInterfaceOrGroup_Name();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup#toString()
	 * @generated
	 */
	EOperation getEqInterfaceOrGroup__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.EqInterface <em>Eq Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Interface</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface
	 * @generated
	 */
	EClass getEqInterface();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getSystem()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_System();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getSubAta <em>Sub Ata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Ata</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getSubAta()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_SubAta();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getLineName <em>Line Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Name</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getLineName()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_LineName();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getWiringLane <em>Wiring Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiring Lane</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getWiringLane()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_WiringLane();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getGrpInfo <em>Grp Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grp Info</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getGrpInfo()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_GrpInfo();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getRoute()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_Route();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getPwSup1 <em>Pw Sup1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pw Sup1</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getPwSup1()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_PwSup1();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getEmhZone1 <em>Emh Zone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emh Zone1</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getEmhZone1()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_EmhZone1();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getIoType <em>Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getIoType()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_IoType();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getResource()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_Resource();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getResourceX <em>Resource X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource X</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getResourceX()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_ResourceX();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getResourceY <em>Resource Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Y</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getResourceY()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_ResourceY();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.EqInterface#getResourceZ <em>Resource Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Z</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getResourceZ()
	 * @see #getEqInterface()
	 * @generated
	 */
	EAttribute getEqInterface_ResourceZ();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.EqInterface#getMetricParameters <em>Metric Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Parameters</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#getMetricParameters()
	 * @see #getEqInterface()
	 * @generated
	 */
	EReference getEqInterface_MetricParameters();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.EqInterface#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.EqInterface#toString()
	 * @generated
	 */
	EOperation getEqInterface__ToString();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock <em>Interface Groups Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Groups Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock
	 * @generated
	 */
	EClass getInterfaceGroupsBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock#getEqInterfaceGroups <em>Eq Interface Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq Interface Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock#getEqInterfaceGroups()
	 * @see #getInterfaceGroupsBlock()
	 * @generated
	 */
	EReference getInterfaceGroupsBlock_EqInterfaceGroups();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup <em>Eq Interface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Interface Group</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup
	 * @generated
	 */
	EClass getEqInterfaceGroup();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getEqInterfaces <em>Eq Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eq Interfaces</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getEqInterfaces()
	 * @see #getEqInterfaceGroup()
	 * @generated
	 */
	EReference getEqInterfaceGroup_EqInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutEqInterfaces <em>Without Eq Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Without Eq Interfaces</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutEqInterfaces()
	 * @see #getEqInterfaceGroup()
	 * @generated
	 */
	EReference getEqInterfaceGroup_WithoutEqInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getImplicitMemberDefinitions <em>Implicit Member Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implicit Member Definitions</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getImplicitMemberDefinitions()
	 * @see #getEqInterfaceGroup()
	 * @generated
	 */
	EReference getEqInterfaceGroup_ImplicitMemberDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutImplicitMemberDefinitions <em>Without Implicit Member Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Without Implicit Member Definitions</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutImplicitMemberDefinitions()
	 * @see #getEqInterfaceGroup()
	 * @generated
	 */
	EReference getEqInterfaceGroup_WithoutImplicitMemberDefinitions();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup#toString()
	 * @generated
	 */
	EOperation getEqInterfaceGroup__ToString();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getImplicitlyDefinedEqInterfaces() <em>Get Implicitly Defined Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implicitly Defined Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getImplicitlyDefinedEqInterfaces()
	 * @generated
	 */
	EOperation getEqInterfaceGroup__GetImplicitlyDefinedEqInterfaces();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutImplicitlyDefinedEqInterfaces() <em>Get Without Implicitly Defined Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Without Implicitly Defined Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutImplicitlyDefinedEqInterfaces()
	 * @generated
	 */
	EOperation getEqInterfaceGroup__GetWithoutImplicitlyDefinedEqInterfaces();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition <em>Implicit Eq Interface Member Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Eq Interface Member Definition</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition
	 * @generated
	 */
	EClass getImplicitEqInterfaceMemberDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition#getEntries()
	 * @see #getImplicitEqInterfaceMemberDefinition()
	 * @generated
	 */
	EReference getImplicitEqInterfaceMemberDefinition_Entries();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition#getImplicitlyDefinedEqInterfaces() <em>Get Implicitly Defined Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implicitly Defined Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition#getImplicitlyDefinedEqInterfaces()
	 * @generated
	 */
	EOperation getImplicitEqInterfaceMemberDefinition__GetImplicitlyDefinedEqInterfaces();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues <em>Implicit Eq Interface Member Definition Attributes And Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Eq Interface Member Definition Attributes And Values</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues
	 * @generated
	 */
	EClass getImplicitEqInterfaceMemberDefinitionAttributesAndValues();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getAttribute()
	 * @see #getImplicitEqInterfaceMemberDefinitionAttributesAndValues()
	 * @generated
	 */
	EAttribute getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getValue()
	 * @see #getImplicitEqInterfaceMemberDefinitionAttributesAndValues()
	 * @generated
	 */
	EAttribute getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Value();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition <em>Eq Interface Group With Combined Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Interface Group With Combined Definition</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition
	 * @generated
	 */
	EClass getEqInterfaceGroupWithCombinedDefinition();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition#getCombinedGroups <em>Combined Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combined Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition#getCombinedGroups()
	 * @see #getEqInterfaceGroupWithCombinedDefinition()
	 * @generated
	 */
	EReference getEqInterfaceGroupWithCombinedDefinition_CombinedGroups();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock <em>Restrictions Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restrictions Block</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RestrictionsBlock
	 * @generated
	 */
	EClass getRestrictionsBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getDislocalityRelations <em>Dislocality Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dislocality Relations</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RestrictionsBlock#getDislocalityRelations()
	 * @see #getRestrictionsBlock()
	 * @generated
	 */
	EReference getRestrictionsBlock_DislocalityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getColocalityRelations <em>Colocality Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colocality Relations</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RestrictionsBlock#getColocalityRelations()
	 * @see #getRestrictionsBlock()
	 * @generated
	 */
	EReference getRestrictionsBlock_ColocalityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getValidDeployments <em>Valid Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valid Deployments</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RestrictionsBlock#getValidDeployments()
	 * @see #getRestrictionsBlock()
	 * @generated
	 */
	EReference getRestrictionsBlock_ValidDeployments();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getInvalidDeployments <em>Invalid Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invalid Deployments</em>'.
	 * @see ch.hilbri.assist.datamodel.model.RestrictionsBlock#getInvalidDeployments()
	 * @see #getRestrictionsBlock()
	 * @generated
	 */
	EReference getRestrictionsBlock_InvalidDeployments();

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
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eq Interface Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation#getEqInterfaceOrGroups()
	 * @see #getDislocalityRelation()
	 * @generated
	 */
	EReference getDislocalityRelation_EqInterfaceOrGroups();

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
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getAllInterfaces() <em>Get All Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation#getAllInterfaces()
	 * @generated
	 */
	EOperation getDislocalityRelation__GetAllInterfaces();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getTotalInterfaceCount() <em>Get Total Interface Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Interface Count</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation#getTotalInterfaceCount()
	 * @generated
	 */
	EOperation getDislocalityRelation__GetTotalInterfaceCount();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getAllEqInterfaceOrGroupNames() <em>Get All Eq Interface Or Group Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.DislocalityRelation#getAllEqInterfaceOrGroupNames()
	 * @generated
	 */
	EOperation getDislocalityRelation__GetAllEqInterfaceOrGroupNames();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ColocalityRelation <em>Colocality Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colocality Relation</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ColocalityRelation
	 * @generated
	 */
	EClass getColocalityRelation();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.ColocalityRelation#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eq Interface Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ColocalityRelation#getEqInterfaceOrGroups()
	 * @see #getColocalityRelation()
	 * @generated
	 */
	EReference getColocalityRelation_EqInterfaceOrGroups();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.ColocalityRelation#getHardwareLevel <em>Hardware Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Level</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ColocalityRelation#getHardwareLevel()
	 * @see #getColocalityRelation()
	 * @generated
	 */
	EAttribute getColocalityRelation_HardwareLevel();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.ColocalityRelation#getAllInterfaces() <em>Get All Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.ColocalityRelation#getAllInterfaces()
	 * @generated
	 */
	EOperation getColocalityRelation__GetAllInterfaces();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.ColocalityRelation#getAllEqInterfaceOrGroupNames() <em>Get All Eq Interface Or Group Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.ColocalityRelation#getAllEqInterfaceOrGroupNames()
	 * @generated
	 */
	EOperation getColocalityRelation__GetAllEqInterfaceOrGroupNames();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Specification</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentSpecification
	 * @generated
	 */
	EClass getDeploymentSpecification();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eq Interface Or Groups</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentSpecification#getEqInterfaceOrGroups()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EReference getDeploymentSpecification_EqInterfaceOrGroups();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getHardwareElements <em>Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hardware Elements</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentSpecification#getHardwareElements()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EReference getDeploymentSpecification_HardwareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getImplicitHardwareElements <em>Implicit Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implicit Hardware Elements</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentSpecification#getImplicitHardwareElements()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EReference getDeploymentSpecification_ImplicitHardwareElements();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getAllEqInterfaceOrGroupNames() <em>Get All Eq Interface Or Group Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Eq Interface Or Group Names</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentSpecification#getAllEqInterfaceOrGroupNames()
	 * @generated
	 */
	EOperation getDeploymentSpecification__GetAllEqInterfaceOrGroupNames();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getImplicitlyDefinedConnectors() <em>Get Implicitly Defined Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implicitly Defined Connectors</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentSpecification#getImplicitlyDefinedConnectors()
	 * @generated
	 */
	EOperation getDeploymentSpecification__GetImplicitlyDefinedConnectors();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition <em>Deployment Implicit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Implicit Definition</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition
	 * @generated
	 */
	EClass getDeploymentImplicitDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition#getEntries()
	 * @see #getDeploymentImplicitDefinition()
	 * @generated
	 */
	EReference getDeploymentImplicitDefinition_Entries();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition#getImplicitlyDefinedConnectors() <em>Get Implicitly Defined Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implicitly Defined Connectors</em>' operation.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition#getImplicitlyDefinedConnectors()
	 * @generated
	 */
	EOperation getDeploymentImplicitDefinition__GetImplicitlyDefinedConnectors();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue <em>Deployment Implicit Definition Attribute And Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Implicit Definition Attribute And Value</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue
	 * @generated
	 */
	EClass getDeploymentImplicitDefinitionAttributeAndValue();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getAttribute()
	 * @see #getDeploymentImplicitDefinitionAttributeAndValue()
	 * @generated
	 */
	EAttribute getDeploymentImplicitDefinitionAttributeAndValue_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getValue()
	 * @see #getDeploymentImplicitDefinitionAttributeAndValue()
	 * @generated
	 */
	EAttribute getDeploymentImplicitDefinitionAttributeAndValue_Value();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.ValidDeployment <em>Valid Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Deployment</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ValidDeployment
	 * @generated
	 */
	EClass getValidDeployment();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.model.InvalidDeployment <em>Invalid Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Deployment</em>'.
	 * @see ch.hilbri.assist.datamodel.model.InvalidDeployment
	 * @generated
	 */
	EClass getInvalidDeployment();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelType <em>Protection Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protection Level Type</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
	 * @generated
	 */
	EEnum getProtectionLevelType();

	/**
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute <em>Implicit Eq Interface Member Definition Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implicit Eq Interface Member Definition Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute
	 * @generated
	 */
	EEnum getImplicitEqInterfaceMemberDefinitionAttribute();

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
	 * Returns the meta object for enum '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute <em>Deployment Implicit Definition Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Implicit Definition Attribute</em>'.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute
	 * @generated
	 */
	EEnum getDeploymentImplicitDefinitionAttribute();

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
		 * The meta object literal for the '<em><b>Global Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__GLOBAL_BLOCK = eINSTANCE.getAssistModel_GlobalBlock();

		/**
		 * The meta object literal for the '<em><b>Compartments Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__COMPARTMENTS_BLOCK = eINSTANCE.getAssistModel_CompartmentsBlock();

		/**
		 * The meta object literal for the '<em><b>Interfaces Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__INTERFACES_BLOCK = eINSTANCE.getAssistModel_InterfacesBlock();

		/**
		 * The meta object literal for the '<em><b>Interface Groups Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__INTERFACE_GROUPS_BLOCK = eINSTANCE.getAssistModel_InterfaceGroupsBlock();

		/**
		 * The meta object literal for the '<em><b>Restrictions Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL__RESTRICTIONS_BLOCK = eINSTANCE.getAssistModel_RestrictionsBlock();

		/**
		 * The meta object literal for the '<em><b>Get System Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_SYSTEM_NAME = eINSTANCE.getAssistModel__GetSystemName();

		/**
		 * The meta object literal for the '<em><b>Get Compatible Io Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_COMPATIBLE_IO_TYPES = eINSTANCE.getAssistModel__GetCompatibleIoTypes();

		/**
		 * The meta object literal for the '<em><b>Get Cable Weight Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_CABLE_WEIGHT_DATA = eINSTANCE.getAssistModel__GetCableWeightData();

		/**
		 * The meta object literal for the '<em><b>Get Protection Level Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_PROTECTION_LEVEL_DATA = eINSTANCE.getAssistModel__GetProtectionLevelData();

		/**
		 * The meta object literal for the '<em><b>Get Compartments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_COMPARTMENTS = eINSTANCE.getAssistModel__GetCompartments();

		/**
		 * The meta object literal for the '<em><b>Get RD Cs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_RD_CS = eINSTANCE.getAssistModel__GetRDCs();

		/**
		 * The meta object literal for the '<em><b>Get Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_CONNECTORS = eINSTANCE.getAssistModel__GetConnectors();

		/**
		 * The meta object literal for the '<em><b>Get Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_EQ_INTERFACES = eINSTANCE.getAssistModel__GetEqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Get Eq Interface Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_EQ_INTERFACE_GROUPS = eINSTANCE.getAssistModel__GetEqInterfaceGroups();

		/**
		 * The meta object literal for the '<em><b>Get Colocality Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_COLOCALITY_RELATIONS = eINSTANCE.getAssistModel__GetColocalityRelations();

		/**
		 * The meta object literal for the '<em><b>Get Dislocality Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_DISLOCALITY_RELATIONS = eINSTANCE.getAssistModel__GetDislocalityRelations();

		/**
		 * The meta object literal for the '<em><b>Get Valid Deployments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_VALID_DEPLOYMENTS = eINSTANCE.getAssistModel__GetValidDeployments();

		/**
		 * The meta object literal for the '<em><b>Get Invalid Deployments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_INVALID_DEPLOYMENTS = eINSTANCE.getAssistModel__GetInvalidDeployments();

		/**
		 * The meta object literal for the '<em><b>Get All Hardware Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT = eINSTANCE.getAssistModel__GetAllHardwareElements__int();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl <em>Global Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getGlobalBlock()
		 * @generated
		 */
		EClass GLOBAL_BLOCK = eINSTANCE.getGlobalBlock();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BLOCK__SYSTEM_NAME = eINSTANCE.getGlobalBlock_SystemName();

		/**
		 * The meta object literal for the '<em><b>Compatible Io Types Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK = eINSTANCE.getGlobalBlock_CompatibleIoTypesBlock();

		/**
		 * The meta object literal for the '<em><b>Cable Weight Data Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK = eINSTANCE.getGlobalBlock_CableWeightDataBlock();

		/**
		 * The meta object literal for the '<em><b>Protection Level Data Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK = eINSTANCE.getGlobalBlock_ProtectionLevelDataBlock();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypesBlockImpl <em>Compatible Io Types Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypesBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompatibleIoTypesBlock()
		 * @generated
		 */
		EClass COMPATIBLE_IO_TYPES_BLOCK = eINSTANCE.getCompatibleIoTypesBlock();

		/**
		 * The meta object literal for the '<em><b>Compatible Io Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES = eINSTANCE.getCompatibleIoTypesBlock_CompatibleIoTypes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypeEntryImpl <em>Compatible Io Type Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypeEntryImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompatibleIoTypeEntry()
		 * @generated
		 */
		EClass COMPATIBLE_IO_TYPE_ENTRY = eINSTANCE.getCompatibleIoTypeEntry();

		/**
		 * The meta object literal for the '<em><b>Eq Interface Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE = eINSTANCE.getCompatibleIoTypeEntry_EqInterfaceIoType();

		/**
		 * The meta object literal for the '<em><b>Pin Interface Io Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES = eINSTANCE.getCompatibleIoTypeEntry_PinInterfaceIoTypes();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CableWeightDataBlockImpl <em>Cable Weight Data Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CableWeightDataBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCableWeightDataBlock()
		 * @generated
		 */
		EClass CABLE_WEIGHT_DATA_BLOCK = eINSTANCE.getCableWeightDataBlock();

		/**
		 * The meta object literal for the '<em><b>Cable Weight Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES = eINSTANCE.getCableWeightDataBlock_CableWeightEntries();

		/**
		 * The meta object literal for the '<em><b>Get Default Cable Weight</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CABLE_WEIGHT_DATA_BLOCK___GET_DEFAULT_CABLE_WEIGHT = eINSTANCE.getCableWeightDataBlock__GetDefaultCableWeight();

		/**
		 * The meta object literal for the '<em><b>Get Cable Weight</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CABLE_WEIGHT_DATA_BLOCK___GET_CABLE_WEIGHT__STRING = eINSTANCE.getCableWeightDataBlock__GetCableWeight__String();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CableWeightEntryImpl <em>Cable Weight Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CableWeightEntryImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCableWeightEntry()
		 * @generated
		 */
		EClass CABLE_WEIGHT_ENTRY = eINSTANCE.getCableWeightEntry();

		/**
		 * The meta object literal for the '<em><b>Default Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY = eINSTANCE.getCableWeightEntry_DefaultEntry();

		/**
		 * The meta object literal for the '<em><b>Eq Interface Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE = eINSTANCE.getCableWeightEntry_EqInterfaceIoType();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_WEIGHT_ENTRY__WEIGHT = eINSTANCE.getCableWeightEntry_Weight();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelDataBlockImpl <em>Protection Level Data Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ProtectionLevelDataBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProtectionLevelDataBlock()
		 * @generated
		 */
		EClass PROTECTION_LEVEL_DATA_BLOCK = eINSTANCE.getProtectionLevelDataBlock();

		/**
		 * The meta object literal for the '<em><b>Protection Level Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_LEVEL_DATA_BLOCK__PROTECTION_LEVEL_ENTRIES = eINSTANCE.getProtectionLevelDataBlock_ProtectionLevelEntries();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelEntryImpl <em>Protection Level Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ProtectionLevelEntryImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProtectionLevelEntry()
		 * @generated
		 */
		EClass PROTECTION_LEVEL_ENTRY = eINSTANCE.getProtectionLevelEntry();

		/**
		 * The meta object literal for the '<em><b>Rdc Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_LEVEL_ENTRY__RDC_LOCATION = eINSTANCE.getProtectionLevelEntry_RdcLocation();

		/**
		 * The meta object literal for the '<em><b>Emh Zone1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_LEVEL_ENTRY__EMH_ZONE1 = eINSTANCE.getProtectionLevelEntry_EmhZone1();

		/**
		 * The meta object literal for the '<em><b>Protection Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL = eINSTANCE.getProtectionLevelEntry_ProtectionLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.CompartmentsBlockImpl <em>Compartments Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.CompartmentsBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getCompartmentsBlock()
		 * @generated
		 */
		EClass COMPARTMENTS_BLOCK = eINSTANCE.getCompartmentsBlock();

		/**
		 * The meta object literal for the '<em><b>Compartments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENTS_BLOCK__COMPARTMENTS = eINSTANCE.getCompartmentsBlock_Compartments();

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
		 * The meta object literal for the '<em><b>Metric Parameters Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK = eINSTANCE.getHardwareElement_MetricParametersBlock();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.MetricParametersBlockImpl <em>Metric Parameters Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.MetricParametersBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getMetricParametersBlock()
		 * @generated
		 */
		EClass METRIC_PARAMETERS_BLOCK = eINSTANCE.getMetricParametersBlock();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_PARAMETERS_BLOCK__METRIC_PARAMETERS = eINSTANCE.getMetricParametersBlock_MetricParameters();

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
		 * The meta object literal for the '<em><b>Rdcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__RDCS = eINSTANCE.getCompartment_Rdcs();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___TO_STRING = eINSTANCE.getCompartment__ToString();

		/**
		 * The meta object literal for the '<em><b>Get All Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___GET_ALL_CONNECTORS = eINSTANCE.getCompartment__GetAllConnectors();

		/**
		 * The meta object literal for the '<em><b>Get Available Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARTMENT___GET_AVAILABLE_EQ_INTERFACES__ELIST = eINSTANCE.getCompartment__GetAvailableEqInterfaces__EList();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl <em>RDC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.RDCImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getRDC()
		 * @generated
		 */
		EClass RDC = eINSTANCE.getRDC();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__MANUFACTURER = eINSTANCE.getRDC_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Power Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__POWER_SUPPLY = eINSTANCE.getRDC_PowerSupply();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__SIDE = eINSTANCE.getRDC_Side();

		/**
		 * The meta object literal for the '<em><b>Rdc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__RDC_TYPE = eINSTANCE.getRDC_RdcType();

		/**
		 * The meta object literal for the '<em><b>Ess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__ESS = eINSTANCE.getRDC_Ess();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__LOCATION = eINSTANCE.getRDC_Location();

		/**
		 * The meta object literal for the '<em><b>Resource X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__RESOURCE_X = eINSTANCE.getRDC_ResourceX();

		/**
		 * The meta object literal for the '<em><b>Resource Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__RESOURCE_Y = eINSTANCE.getRDC_ResourceY();

		/**
		 * The meta object literal for the '<em><b>Resource Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDC__RESOURCE_Z = eINSTANCE.getRDC_ResourceZ();

		/**
		 * The meta object literal for the '<em><b>Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDC__COMPARTMENT = eINSTANCE.getRDC_Compartment();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDC__CONNECTORS = eINSTANCE.getRDC_Connectors();

		/**
		 * The meta object literal for the '<em><b>Connected Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDC__CONNECTED_PINS = eINSTANCE.getRDC_ConnectedPins();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDC___TO_STRING = eINSTANCE.getRDC__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Available Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RDC___GET_AVAILABLE_EQ_INTERFACES__ELIST = eINSTANCE.getRDC__GetAvailableEqInterfaces__EList();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.InternallyConnectedPinEntryImpl <em>Internally Connected Pin Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.InternallyConnectedPinEntryImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInternallyConnectedPinEntry()
		 * @generated
		 */
		EClass INTERNALLY_CONNECTED_PIN_ENTRY = eINSTANCE.getInternallyConnectedPinEntry();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNALLY_CONNECTED_PIN_ENTRY__PINS = eINSTANCE.getInternallyConnectedPinEntry_Pins();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ConnectorImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Rdc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__RDC = eINSTANCE.getConnector_Rdc();

		/**
		 * The meta object literal for the '<em><b>Available Eq Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__AVAILABLE_EQ_INTERFACES = eINSTANCE.getConnector_AvailableEqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___FULL_NAME = eINSTANCE.getConnector__FullName();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___TO_STRING = eINSTANCE.getConnector__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Available Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___GET_AVAILABLE_EQ_INTERFACES__ELIST = eINSTANCE.getConnector__GetAvailableEqInterfaces__EList();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl <em>Available Eq Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getAvailableEqInterface()
		 * @generated
		 */
		EClass AVAILABLE_EQ_INTERFACE = eINSTANCE.getAvailableEqInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLE_EQ_INTERFACE__NAME = eINSTANCE.getAvailableEqInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Eq Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE = eINSTANCE.getAvailableEqInterface_EqInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLE_EQ_INTERFACE__COUNT = eINSTANCE.getAvailableEqInterface_Count();

		/**
		 * The meta object literal for the '<em><b>Protection Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL = eINSTANCE.getAvailableEqInterface_ProtectionLevel();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.InterfacesBlockImpl <em>Interfaces Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.InterfacesBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInterfacesBlock()
		 * @generated
		 */
		EClass INTERFACES_BLOCK = eINSTANCE.getInterfacesBlock();

		/**
		 * The meta object literal for the '<em><b>Eq Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_BLOCK__EQ_INTERFACES = eINSTANCE.getInterfacesBlock_EqInterfaces();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceOrGroupImpl <em>Eq Interface Or Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceOrGroupImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterfaceOrGroup()
		 * @generated
		 */
		EClass EQ_INTERFACE_OR_GROUP = eINSTANCE.getEqInterfaceOrGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE_OR_GROUP__NAME = eINSTANCE.getEqInterfaceOrGroup_Name();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQ_INTERFACE_OR_GROUP___TO_STRING = eINSTANCE.getEqInterfaceOrGroup__ToString();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl <em>Eq Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterface()
		 * @generated
		 */
		EClass EQ_INTERFACE = eINSTANCE.getEqInterface();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__SYSTEM = eINSTANCE.getEqInterface_System();

		/**
		 * The meta object literal for the '<em><b>Sub Ata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__SUB_ATA = eINSTANCE.getEqInterface_SubAta();

		/**
		 * The meta object literal for the '<em><b>Line Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__LINE_NAME = eINSTANCE.getEqInterface_LineName();

		/**
		 * The meta object literal for the '<em><b>Wiring Lane</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__WIRING_LANE = eINSTANCE.getEqInterface_WiringLane();

		/**
		 * The meta object literal for the '<em><b>Grp Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__GRP_INFO = eINSTANCE.getEqInterface_GrpInfo();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__ROUTE = eINSTANCE.getEqInterface_Route();

		/**
		 * The meta object literal for the '<em><b>Pw Sup1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__PW_SUP1 = eINSTANCE.getEqInterface_PwSup1();

		/**
		 * The meta object literal for the '<em><b>Emh Zone1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__EMH_ZONE1 = eINSTANCE.getEqInterface_EmhZone1();

		/**
		 * The meta object literal for the '<em><b>Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__IO_TYPE = eINSTANCE.getEqInterface_IoType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__RESOURCE = eINSTANCE.getEqInterface_Resource();

		/**
		 * The meta object literal for the '<em><b>Resource X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__RESOURCE_X = eINSTANCE.getEqInterface_ResourceX();

		/**
		 * The meta object literal for the '<em><b>Resource Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__RESOURCE_Y = eINSTANCE.getEqInterface_ResourceY();

		/**
		 * The meta object literal for the '<em><b>Resource Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQ_INTERFACE__RESOURCE_Z = eINSTANCE.getEqInterface_ResourceZ();

		/**
		 * The meta object literal for the '<em><b>Metric Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_INTERFACE__METRIC_PARAMETERS = eINSTANCE.getEqInterface_MetricParameters();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQ_INTERFACE___TO_STRING = eINSTANCE.getEqInterface__ToString();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.InterfaceGroupsBlockImpl <em>Interface Groups Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.InterfaceGroupsBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInterfaceGroupsBlock()
		 * @generated
		 */
		EClass INTERFACE_GROUPS_BLOCK = eINSTANCE.getInterfaceGroupsBlock();

		/**
		 * The meta object literal for the '<em><b>Eq Interface Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS = eINSTANCE.getInterfaceGroupsBlock_EqInterfaceGroups();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl <em>Eq Interface Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterfaceGroup()
		 * @generated
		 */
		EClass EQ_INTERFACE_GROUP = eINSTANCE.getEqInterfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Eq Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_INTERFACE_GROUP__EQ_INTERFACES = eINSTANCE.getEqInterfaceGroup_EqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Without Eq Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES = eINSTANCE.getEqInterfaceGroup_WithoutEqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Implicit Member Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS = eINSTANCE.getEqInterfaceGroup_ImplicitMemberDefinitions();

		/**
		 * The meta object literal for the '<em><b>Without Implicit Member Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS = eINSTANCE.getEqInterfaceGroup_WithoutImplicitMemberDefinitions();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQ_INTERFACE_GROUP___TO_STRING = eINSTANCE.getEqInterfaceGroup__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Implicitly Defined Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQ_INTERFACE_GROUP___GET_IMPLICITLY_DEFINED_EQ_INTERFACES = eINSTANCE.getEqInterfaceGroup__GetImplicitlyDefinedEqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Get Without Implicitly Defined Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQ_INTERFACE_GROUP___GET_WITHOUT_IMPLICITLY_DEFINED_EQ_INTERFACES = eINSTANCE.getEqInterfaceGroup__GetWithoutImplicitlyDefinedEqInterfaces();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionImpl <em>Implicit Eq Interface Member Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getImplicitEqInterfaceMemberDefinition()
		 * @generated
		 */
		EClass IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION = eINSTANCE.getImplicitEqInterfaceMemberDefinition();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES = eINSTANCE.getImplicitEqInterfaceMemberDefinition_Entries();

		/**
		 * The meta object literal for the '<em><b>Get Implicitly Defined Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION___GET_IMPLICITLY_DEFINED_EQ_INTERFACES = eINSTANCE.getImplicitEqInterfaceMemberDefinition__GetImplicitlyDefinedEqInterfaces();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionAttributesAndValuesImpl <em>Implicit Eq Interface Member Definition Attributes And Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionAttributesAndValuesImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getImplicitEqInterfaceMemberDefinitionAttributesAndValues()
		 * @generated
		 */
		EClass IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES = eINSTANCE.getImplicitEqInterfaceMemberDefinitionAttributesAndValues();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__ATTRIBUTE = eINSTANCE.getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__VALUE = eINSTANCE.getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Value();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupWithCombinedDefinitionImpl <em>Eq Interface Group With Combined Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupWithCombinedDefinitionImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getEqInterfaceGroupWithCombinedDefinition()
		 * @generated
		 */
		EClass EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION = eINSTANCE.getEqInterfaceGroupWithCombinedDefinition();

		/**
		 * The meta object literal for the '<em><b>Combined Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS = eINSTANCE.getEqInterfaceGroupWithCombinedDefinition_CombinedGroups();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl <em>Restrictions Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getRestrictionsBlock()
		 * @generated
		 */
		EClass RESTRICTIONS_BLOCK = eINSTANCE.getRestrictionsBlock();

		/**
		 * The meta object literal for the '<em><b>Dislocality Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS = eINSTANCE.getRestrictionsBlock_DislocalityRelations();

		/**
		 * The meta object literal for the '<em><b>Colocality Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS = eINSTANCE.getRestrictionsBlock_ColocalityRelations();

		/**
		 * The meta object literal for the '<em><b>Valid Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS = eINSTANCE.getRestrictionsBlock_ValidDeployments();

		/**
		 * The meta object literal for the '<em><b>Invalid Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS = eINSTANCE.getRestrictionsBlock_InvalidDeployments();

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
		 * The meta object literal for the '<em><b>Eq Interface Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS = eINSTANCE.getDislocalityRelation_EqInterfaceOrGroups();

		/**
		 * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISLOCALITY_RELATION__HARDWARE_LEVEL = eINSTANCE.getDislocalityRelation_HardwareLevel();

		/**
		 * The meta object literal for the '<em><b>Get All Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISLOCALITY_RELATION___GET_ALL_INTERFACES = eINSTANCE.getDislocalityRelation__GetAllInterfaces();

		/**
		 * The meta object literal for the '<em><b>Get Total Interface Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISLOCALITY_RELATION___GET_TOTAL_INTERFACE_COUNT = eINSTANCE.getDislocalityRelation__GetTotalInterfaceCount();

		/**
		 * The meta object literal for the '<em><b>Get All Eq Interface Or Group Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = eINSTANCE.getDislocalityRelation__GetAllEqInterfaceOrGroupNames();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ColocalityRelationImpl <em>Colocality Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ColocalityRelationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getColocalityRelation()
		 * @generated
		 */
		EClass COLOCALITY_RELATION = eINSTANCE.getColocalityRelation();

		/**
		 * The meta object literal for the '<em><b>Eq Interface Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS = eINSTANCE.getColocalityRelation_EqInterfaceOrGroups();

		/**
		 * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOCALITY_RELATION__HARDWARE_LEVEL = eINSTANCE.getColocalityRelation_HardwareLevel();

		/**
		 * The meta object literal for the '<em><b>Get All Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLOCALITY_RELATION___GET_ALL_INTERFACES = eINSTANCE.getColocalityRelation__GetAllInterfaces();

		/**
		 * The meta object literal for the '<em><b>Get All Eq Interface Or Group Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = eINSTANCE.getColocalityRelation__GetAllEqInterfaceOrGroupNames();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DeploymentSpecificationImpl <em>Deployment Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DeploymentSpecificationImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentSpecification()
		 * @generated
		 */
		EClass DEPLOYMENT_SPECIFICATION = eINSTANCE.getDeploymentSpecification();

		/**
		 * The meta object literal for the '<em><b>Eq Interface Or Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS = eINSTANCE.getDeploymentSpecification_EqInterfaceOrGroups();

		/**
		 * The meta object literal for the '<em><b>Hardware Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS = eINSTANCE.getDeploymentSpecification_HardwareElements();

		/**
		 * The meta object literal for the '<em><b>Implicit Hardware Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS = eINSTANCE.getDeploymentSpecification_ImplicitHardwareElements();

		/**
		 * The meta object literal for the '<em><b>Get All Eq Interface Or Group Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYMENT_SPECIFICATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES = eINSTANCE.getDeploymentSpecification__GetAllEqInterfaceOrGroupNames();

		/**
		 * The meta object literal for the '<em><b>Get Implicitly Defined Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYMENT_SPECIFICATION___GET_IMPLICITLY_DEFINED_CONNECTORS = eINSTANCE.getDeploymentSpecification__GetImplicitlyDefinedConnectors();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionImpl <em>Deployment Implicit Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentImplicitDefinition()
		 * @generated
		 */
		EClass DEPLOYMENT_IMPLICIT_DEFINITION = eINSTANCE.getDeploymentImplicitDefinition();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES = eINSTANCE.getDeploymentImplicitDefinition_Entries();

		/**
		 * The meta object literal for the '<em><b>Get Implicitly Defined Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYMENT_IMPLICIT_DEFINITION___GET_IMPLICITLY_DEFINED_CONNECTORS = eINSTANCE.getDeploymentImplicitDefinition__GetImplicitlyDefinedConnectors();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionAttributeAndValueImpl <em>Deployment Implicit Definition Attribute And Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionAttributeAndValueImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentImplicitDefinitionAttributeAndValue()
		 * @generated
		 */
		EClass DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE = eINSTANCE.getDeploymentImplicitDefinitionAttributeAndValue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__ATTRIBUTE = eINSTANCE.getDeploymentImplicitDefinitionAttributeAndValue_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__VALUE = eINSTANCE.getDeploymentImplicitDefinitionAttributeAndValue_Value();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.ValidDeploymentImpl <em>Valid Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.ValidDeploymentImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getValidDeployment()
		 * @generated
		 */
		EClass VALID_DEPLOYMENT = eINSTANCE.getValidDeployment();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.impl.InvalidDeploymentImpl <em>Invalid Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.impl.InvalidDeploymentImpl
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getInvalidDeployment()
		 * @generated
		 */
		EClass INVALID_DEPLOYMENT = eINSTANCE.getInvalidDeployment();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelType <em>Protection Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getProtectionLevelType()
		 * @generated
		 */
		EEnum PROTECTION_LEVEL_TYPE = eINSTANCE.getProtectionLevelType();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute <em>Implicit Eq Interface Member Definition Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getImplicitEqInterfaceMemberDefinitionAttribute()
		 * @generated
		 */
		EEnum IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTE = eINSTANCE.getImplicitEqInterfaceMemberDefinitionAttribute();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute <em>Deployment Implicit Definition Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute
		 * @see ch.hilbri.assist.datamodel.model.impl.ModelPackageImpl#getDeploymentImplicitDefinitionAttribute()
		 * @generated
		 */
		EEnum DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE = eINSTANCE.getDeploymentImplicitDefinitionAttribute();

	}

} //ModelPackage
