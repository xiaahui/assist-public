/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see ch.hilbri.assist.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelPluginID='ch.hilbri.assist.model' editPluginID='ch.hilbri.assist.model.edit' editDirectory='/ch.hilbri.assist.model.edit/src' editorPluginID='ch.hilbri.assist.model.editor' editorDirectory='/ch.hilbri.assist.model.editor/src' generateModelWizard='false' generateExampleClass='false' basePackage='ch.hilbri.assist'"
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
    String eNS_URI = "ch.hilbri.assist.model";

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
    ModelPackage eINSTANCE = ch.hilbri.assist.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.AssistModelImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAssistModel()
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
     * The feature id for the '<em><b>Min Hyp Period Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH = 1;

    /**
     * The feature id for the '<em><b>Task Switch Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__TASK_SWITCH_DELAY = 2;

    /**
     * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__COMPARTMENTS = 3;

    /**
     * The feature id for the '<em><b>Applications</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__APPLICATIONS = 4;

    /**
     * The feature id for the '<em><b>Dislocality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__DISLOCALITY_RELATIONS = 5;

    /**
     * The feature id for the '<em><b>Colocality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__COLOCALITY_RELATIONS = 6;

    /**
     * The feature id for the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__DISSIMILARITY_RELATIONS = 7;

    /**
     * The feature id for the '<em><b>Scheduling Restrictions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__SCHEDULING_RESTRICTIONS = 8;

    /**
     * The feature id for the '<em><b>Application Alternatives</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__APPLICATION_ALTERNATIVES = 9;

    /**
     * The feature id for the '<em><b>Restriction Alternatives</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__RESTRICTION_ALTERNATIVES = 10;

    /**
     * The feature id for the '<em><b>Exploration Candidates</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL__EXPLORATION_CANDIDATES = 11;

    /**
     * The number of structural features of the '<em>Assist Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL_FEATURE_COUNT = 12;

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
     * The operation id for the '<em>Get All Hardware Elements</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS = 7;

    /**
     * The number of operations of the '<em>Assist Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIST_MODEL_OPERATION_COUNT = 8;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.PropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.StringPropertyImpl <em>String Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.StringPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getStringProperty()
     * @generated
     */
    int STRING_PROPERTY = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>String Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.IntPropertyImpl <em>Int Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.IntPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getIntProperty()
     * @generated
     */
    int INT_PROPERTY = 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Int Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Int Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ManufacturerPropertyImpl <em>Manufacturer Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ManufacturerPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getManufacturerProperty()
     * @generated
     */
    int MANUFACTURER_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUFACTURER_PROPERTY__VALUE = STRING_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Manufacturer Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUFACTURER_PROPERTY_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Manufacturer Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUFACTURER_PROPERTY_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.PowerSupplyPropertyImpl <em>Power Supply Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.PowerSupplyPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPowerSupplyProperty()
     * @generated
     */
    int POWER_SUPPLY_PROPERTY = 5;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SUPPLY_PROPERTY__VALUE = STRING_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Power Supply Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SUPPLY_PROPERTY_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Power Supply Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SUPPLY_PROPERTY_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.BoardTypePropertyImpl <em>Board Type Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.BoardTypePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoardTypeProperty()
     * @generated
     */
    int BOARD_TYPE_PROPERTY = 6;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_TYPE_PROPERTY__VALUE = STRING_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Board Type Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_TYPE_PROPERTY_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Board Type Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_TYPE_PROPERTY_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ProcessorTypePropertyImpl <em>Processor Type Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ProcessorTypePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProcessorTypeProperty()
     * @generated
     */
    int PROCESSOR_TYPE_PROPERTY = 7;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_TYPE_PROPERTY__VALUE = STRING_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Processor Type Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_TYPE_PROPERTY_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Processor Type Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_TYPE_PROPERTY_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RAMCapacityPropertyImpl <em>RAM Capacity Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RAMCapacityPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRAMCapacityProperty()
     * @generated
     */
    int RAM_CAPACITY_PROPERTY = 8;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAM_CAPACITY_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>RAM Capacity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAM_CAPACITY_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>RAM Capacity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAM_CAPACITY_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RAMUtilizationPropertyImpl <em>RAM Utilization Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RAMUtilizationPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRAMUtilizationProperty()
     * @generated
     */
    int RAM_UTILIZATION_PROPERTY = 9;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAM_UTILIZATION_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>RAM Utilization Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAM_UTILIZATION_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>RAM Utilization Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAM_UTILIZATION_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ROMCapacityPropertyImpl <em>ROM Capacity Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ROMCapacityPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getROMCapacityProperty()
     * @generated
     */
    int ROM_CAPACITY_PROPERTY = 10;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROM_CAPACITY_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>ROM Capacity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROM_CAPACITY_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ROM Capacity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROM_CAPACITY_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ROMUtilizationPropertyImpl <em>ROM Utilization Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ROMUtilizationPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getROMUtilizationProperty()
     * @generated
     */
    int ROM_UTILIZATION_PROPERTY = 11;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROM_UTILIZATION_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>ROM Utilization Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROM_UTILIZATION_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ROM Utilization Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROM_UTILIZATION_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CoreCapacityPropertyImpl <em>Core Capacity Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CoreCapacityPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCoreCapacityProperty()
     * @generated
     */
    int CORE_CAPACITY_PROPERTY = 12;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CAPACITY_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Core Capacity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CAPACITY_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Core Capacity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CAPACITY_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CoreUtilizationPropertyImpl <em>Core Utilization Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CoreUtilizationPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCoreUtilizationProperty()
     * @generated
     */
    int CORE_UTILIZATION_PROPERTY = 13;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_UTILIZATION_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Core Utilization Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_UTILIZATION_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Core Utilization Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_UTILIZATION_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CoreArchitecturePropertyImpl <em>Core Architecture Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CoreArchitecturePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCoreArchitectureProperty()
     * @generated
     */
    int CORE_ARCHITECTURE_PROPERTY = 14;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_ARCHITECTURE_PROPERTY__VALUE = STRING_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Core Architecture Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_ARCHITECTURE_PROPERTY_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Core Architecture Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_ARCHITECTURE_PROPERTY_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DevelopedByPropertyImpl <em>Developed By Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DevelopedByPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDevelopedByProperty()
     * @generated
     */
    int DEVELOPED_BY_PROPERTY = 15;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVELOPED_BY_PROPERTY__VALUE = STRING_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Developed By Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVELOPED_BY_PROPERTY_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Developed By Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVELOPED_BY_PROPERTY_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DurationPropertyImpl <em>Duration Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DurationPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDurationProperty()
     * @generated
     */
    int DURATION_PROPERTY = 16;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Duration Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Duration Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.PeriodPropertyImpl <em>Period Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.PeriodPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPeriodProperty()
     * @generated
     */
    int PERIOD_PROPERTY = 17;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Period Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Period Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.EarlyTolerancePropertyImpl <em>Early Tolerance Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.EarlyTolerancePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getEarlyToleranceProperty()
     * @generated
     */
    int EARLY_TOLERANCE_PROPERTY = 18;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_TOLERANCE_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Early Tolerance Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_TOLERANCE_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Early Tolerance Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EARLY_TOLERANCE_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.LateTolerancePropertyImpl <em>Late Tolerance Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.LateTolerancePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getLateToleranceProperty()
     * @generated
     */
    int LATE_TOLERANCE_PROPERTY = 19;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LATE_TOLERANCE_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Late Tolerance Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LATE_TOLERANCE_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Late Tolerance Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LATE_TOLERANCE_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.MaxStartTimePropertyImpl <em>Max Start Time Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.MaxStartTimePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMaxStartTimeProperty()
     * @generated
     */
    int MAX_START_TIME_PROPERTY = 20;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_START_TIME_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Max Start Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_START_TIME_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Max Start Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_START_TIME_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.MaxEndTimePropertyImpl <em>Max End Time Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.MaxEndTimePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMaxEndTimeProperty()
     * @generated
     */
    int MAX_END_TIME_PROPERTY = 21;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_END_TIME_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Max End Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_END_TIME_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Max End Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_END_TIME_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.AddInitTimePropertyImpl <em>Add Init Time Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.AddInitTimePropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAddInitTimeProperty()
     * @generated
     */
    int ADD_INIT_TIME_PROPERTY = 22;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADD_INIT_TIME_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Add Init Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADD_INIT_TIME_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Add Init Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADD_INIT_TIME_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.SlicesPropertyImpl <em>Slices Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.SlicesPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSlicesProperty()
     * @generated
     */
    int SLICES_PROPERTY = 23;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLICES_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Slices Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLICES_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Slices Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLICES_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.MinSliceDurationPropertyImpl <em>Min Slice Duration Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.MinSliceDurationPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMinSliceDurationProperty()
     * @generated
     */
    int MIN_SLICE_DURATION_PROPERTY = 24;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_SLICE_DURATION_PROPERTY__VALUE = INT_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Min Slice Duration Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_SLICE_DURATION_PROPERTY_FEATURE_COUNT = INT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Min Slice Duration Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_SLICE_DURATION_PROPERTY_OPERATION_COUNT = INT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DesignAssuranceLevelPropertyImpl <em>Design Assurance Level Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DesignAssuranceLevelPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDesignAssuranceLevelProperty()
     * @generated
     */
    int DESIGN_ASSURANCE_LEVEL_PROPERTY = 25;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_ASSURANCE_LEVEL_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Design Assurance Level Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_ASSURANCE_LEVEL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Design Assurance Level Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_ASSURANCE_LEVEL_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CriticalityLevelPropertyImpl <em>Criticality Level Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CriticalityLevelPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCriticalityLevelProperty()
     * @generated
     */
    int CRITICALITY_LEVEL_PROPERTY = 26;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITICALITY_LEVEL_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Criticality Level Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITICALITY_LEVEL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Criticality Level Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITICALITY_LEVEL_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.PeriodicityPropertyImpl <em>Periodicity Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.PeriodicityPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPeriodicityProperty()
     * @generated
     */
    int PERIODICITY_PROPERTY = 27;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIODICITY_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Periodicity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIODICITY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Periodicity Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIODICITY_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ColorPropertyImpl <em>Color Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ColorPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getColorProperty()
     * @generated
     */
    int COLOR_PROPERTY = 28;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Color Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Color Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CustomPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomProperty()
     * @generated
     */
    int CUSTOM_PROPERTY = 29;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY__NAME = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Custom Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Custom Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CustomIntPropertyImpl <em>Custom Int Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CustomIntPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomIntProperty()
     * @generated
     */
    int CUSTOM_INT_PROPERTY = 30;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_INT_PROPERTY__NAME = CUSTOM_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_INT_PROPERTY__VALUE = CUSTOM_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Custom Int Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_INT_PROPERTY_FEATURE_COUNT = CUSTOM_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Custom Int Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_INT_PROPERTY_OPERATION_COUNT = CUSTOM_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CustomStringPropertyImpl <em>Custom String Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CustomStringPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomStringProperty()
     * @generated
     */
    int CUSTOM_STRING_PROPERTY = 31;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_STRING_PROPERTY__NAME = CUSTOM_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_STRING_PROPERTY__VALUE = CUSTOM_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Custom String Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_STRING_PROPERTY_FEATURE_COUNT = CUSTOM_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Custom String Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_STRING_PROPERTY_OPERATION_COUNT = CUSTOM_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.HardwareElementImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getHardwareElement()
     * @generated
     */
    int HARDWARE_ELEMENT = 32;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__PROPERTIES = 1;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__FEATURES = 2;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__GET_HARDWARE_LEVEL = 3;

    /**
     * The number of structural features of the '<em>Hardware Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT_FEATURE_COUNT = 4;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT___GET_MANUFACTURER = 0;

    /**
     * The operation id for the '<em>Set Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT___SET_MANUFACTURER__STRING = 1;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = 2;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = 3;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING = 4;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING = 5;

    /**
     * The number of operations of the '<em>Hardware Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT_OPERATION_COUNT = 6;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.FeatureImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getFeature()
     * @generated
     */
    int FEATURE = 33;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__NAME = 0;

    /**
     * The feature id for the '<em><b>Units</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__UNITS = 1;

    /**
     * The feature id for the '<em><b>Synchronized Access</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__SYNCHRONIZED_ACCESS = 2;

    /**
     * The feature id for the '<em><b>Shared</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__SHARED = 3;

    /**
     * The feature id for the '<em><b>Is Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__IS_EXCLUSIVE = 4;

    /**
     * The number of structural features of the '<em>Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CompartmentImpl <em>Compartment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CompartmentImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCompartment()
     * @generated
     */
    int COMPARTMENT = 34;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>Boxes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__BOXES = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Compartment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

    /**
     * The operation id for the '<em>Set Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___SET_MANUFACTURER__STRING = HARDWARE_ELEMENT___SET_MANUFACTURER__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___GET_CUSTOM_STRING_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___GET_CUSTOM_INT_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING;

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
     * The operation id for the '<em>Get Power Supply</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___GET_POWER_SUPPLY = HARDWARE_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Set Power Supply</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT___SET_POWER_SUPPLY__STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 5;

    /**
     * The number of operations of the '<em>Compartment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 6;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.BoxImpl <em>Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.BoxImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBox()
     * @generated
     */
    int BOX = 35;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

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
     * The feature id for the '<em><b>Board Alternatives</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__BOARD_ALTERNATIVES = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Box</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

    /**
     * The operation id for the '<em>Set Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX___SET_MANUFACTURER__STRING = HARDWARE_ELEMENT___SET_MANUFACTURER__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX___GET_CUSTOM_STRING_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX___GET_CUSTOM_INT_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.BoardAlternativesImpl <em>Board Alternatives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.BoardAlternativesImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoardAlternatives()
     * @generated
     */
    int BOARD_ALTERNATIVES = 36;

    /**
     * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_ALTERNATIVES__ALTERNATIVES = 0;

    /**
     * The number of structural features of the '<em>Board Alternatives</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_ALTERNATIVES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Board Alternatives</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_ALTERNATIVES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.BoardAlternativeImpl <em>Board Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.BoardAlternativeImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoardAlternative()
     * @generated
     */
    int BOARD_ALTERNATIVE = 37;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_ALTERNATIVE__NAME = 0;

    /**
     * The feature id for the '<em><b>Boards</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_ALTERNATIVE__BOARDS = 1;

    /**
     * The number of structural features of the '<em>Board Alternative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_ALTERNATIVE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Board Alternative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_ALTERNATIVE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.BoardImpl <em>Board</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.BoardImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoard()
     * @generated
     */
    int BOARD = 38;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>Box</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__BOX = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Processors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__PROCESSORS = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Board</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

    /**
     * The operation id for the '<em>Set Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___SET_MANUFACTURER__STRING = HARDWARE_ELEMENT___SET_MANUFACTURER__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_CUSTOM_STRING_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_CUSTOM_INT_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING;

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
     * The operation id for the '<em>Get Assurance Level</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_ASSURANCE_LEVEL = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Set Assurance Level</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___SET_ASSURANCE_LEVEL__DESIGNASSURANCELEVELTYPE = HARDWARE_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Get Power Supply</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_POWER_SUPPLY = HARDWARE_ELEMENT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Set Power Supply</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___SET_POWER_SUPPLY__STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Get Board Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_BOARD_TYPE = HARDWARE_ELEMENT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Set Board Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___SET_BOARD_TYPE__STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Get Ram Capacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_RAM_CAPACITY = HARDWARE_ELEMENT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Set Ram Capacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___SET_RAM_CAPACITY__INT = HARDWARE_ELEMENT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Get Rom Capacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_ROM_CAPACITY = HARDWARE_ELEMENT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Set Rom Capacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___SET_ROM_CAPACITY__INT = HARDWARE_ELEMENT_OPERATION_COUNT + 12;

    /**
     * The number of operations of the '<em>Board</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 13;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ProcessorImpl <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ProcessorImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProcessor()
     * @generated
     */
    int PROCESSOR = 39;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

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
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

    /**
     * The operation id for the '<em>Set Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___SET_MANUFACTURER__STRING = HARDWARE_ELEMENT___SET_MANUFACTURER__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_CUSTOM_STRING_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_CUSTOM_INT_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get All Cores</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_ALL_CORES = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Processor Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_PROCESSOR_TYPE = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Set Processor Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___SET_PROCESSOR_TYPE__STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The number of operations of the '<em>Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CoreImpl <em>Core</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CoreImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCore()
     * @generated
     */
    int CORE = 40;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Processor</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__PROCESSOR = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Core</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

    /**
     * The operation id for the '<em>Set Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___SET_MANUFACTURER__STRING = HARDWARE_ELEMENT___SET_MANUFACTURER__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_CUSTOM_STRING_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_CUSTOM_INT_PROPERTY__STRING = HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Core Capacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_CORE_CAPACITY = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Set Core Capacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___SET_CORE_CAPACITY__INT = HARDWARE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Core Architecture</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_CORE_ARCHITECTURE = HARDWARE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Set Core Architecture</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___SET_CORE_ARCHITECTURE__STRING = HARDWARE_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Core</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ApplicationAlternativesImpl <em>Application Alternatives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ApplicationAlternativesImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplicationAlternatives()
     * @generated
     */
    int APPLICATION_ALTERNATIVES = 41;

    /**
     * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_ALTERNATIVES__ALTERNATIVES = 0;

    /**
     * The number of structural features of the '<em>Application Alternatives</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_ALTERNATIVES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Application Alternatives</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_ALTERNATIVES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ApplicationAlternativeImpl <em>Application Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ApplicationAlternativeImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplicationAlternative()
     * @generated
     */
    int APPLICATION_ALTERNATIVE = 42;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_ALTERNATIVE__NAME = 0;

    /**
     * The feature id for the '<em><b>Applications</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_ALTERNATIVE__APPLICATIONS = 1;

    /**
     * The number of structural features of the '<em>Application Alternative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_ALTERNATIVE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Application Alternative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_ALTERNATIVE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.SoftwareElementImpl <em>Software Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.SoftwareElementImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSoftwareElement()
     * @generated
     */
    int SOFTWARE_ELEMENT = 43;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT__PROPERTIES = 1;

    /**
     * The number of structural features of the '<em>Software Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT___TO_STRING = 0;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = 1;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = 2;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING = 3;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING = 4;

    /**
     * The number of operations of the '<em>Software Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT_OPERATION_COUNT = 5;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ApplicationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplication()
     * @generated
     */
    int APPLICATION = 44;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__NAME = SOFTWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__PROPERTIES = SOFTWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__TASKS = SOFTWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = SOFTWARE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__FULL_NAME = SOFTWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_FEATURE_COUNT = SOFTWARE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___TO_STRING = SOFTWARE_ELEMENT___TO_STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___GET_CUSTOM_STRING_PROPERTY__STRING = SOFTWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___GET_CUSTOM_INT_PROPERTY__STRING = SOFTWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Developed By</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___GET_DEVELOPED_BY = SOFTWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Set Developed By</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___SET_DEVELOPED_BY__STRING = SOFTWARE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Criticality Level</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___GET_CRITICALITY_LEVEL = SOFTWARE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Set Criticality Level</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___SET_CRITICALITY_LEVEL__DESIGNASSURANCELEVELTYPE = SOFTWARE_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_OPERATION_COUNT = SOFTWARE_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.TaskImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask()
     * @generated
     */
    int TASK = 45;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__NAME = SOFTWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__PROPERTIES = SOFTWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Application</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__APPLICATION = SOFTWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Feature Requirements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__FEATURE_REQUIREMENTS = SOFTWARE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = SOFTWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Assigned Core</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ASSIGNED_CORE = SOFTWARE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__FULL_NAME = SOFTWARE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_FEATURE_COUNT = SOFTWARE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___TO_STRING = SOFTWARE_ELEMENT___TO_STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING;

    /**
     * The operation id for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING;

    /**
     * The operation id for the '<em>Get Custom String Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_CUSTOM_STRING_PROPERTY__STRING = SOFTWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Custom Int Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_CUSTOM_INT_PROPERTY__STRING = SOFTWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING;

    /**
     * The operation id for the '<em>Get Core Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_CORE_UTILIZATION = SOFTWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Set Core Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_CORE_UTILIZATION__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Ram Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_RAM_UTILIZATION = SOFTWARE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Set Ram Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_RAM_UTILIZATION__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Get Rom Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_ROM_UTILIZATION = SOFTWARE_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Set Rom Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_ROM_UTILIZATION__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Get Duration</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_DURATION = SOFTWARE_ELEMENT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Set Duration</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_DURATION__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Get Period</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_PERIOD = SOFTWARE_ELEMENT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Set Period</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_PERIOD__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Get Early Tolerance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_EARLY_TOLERANCE = SOFTWARE_ELEMENT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Set Early Tolerance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_EARLY_TOLERANCE__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Get Late Tolerance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_LATE_TOLERANCE = SOFTWARE_ELEMENT_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Set Late Tolerance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_LATE_TOLERANCE__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>Get Max Start Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_MAX_START_TIME = SOFTWARE_ELEMENT_OPERATION_COUNT + 14;

    /**
     * The operation id for the '<em>Set Max Start Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_MAX_START_TIME__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 15;

    /**
     * The operation id for the '<em>Get Max End Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_MAX_END_TIME = SOFTWARE_ELEMENT_OPERATION_COUNT + 16;

    /**
     * The operation id for the '<em>Set Max End Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_MAX_END_TIME__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 17;

    /**
     * The operation id for the '<em>Get Add Init Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_ADD_INIT_TIME = SOFTWARE_ELEMENT_OPERATION_COUNT + 18;

    /**
     * The operation id for the '<em>Set Add Init Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_ADD_INIT_TIME__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 19;

    /**
     * The operation id for the '<em>Get Slices</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_SLICES = SOFTWARE_ELEMENT_OPERATION_COUNT + 20;

    /**
     * The operation id for the '<em>Set Slices</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_SLICES__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 21;

    /**
     * The operation id for the '<em>Get Min Slice Duration</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_MIN_SLICE_DURATION = SOFTWARE_ELEMENT_OPERATION_COUNT + 22;

    /**
     * The operation id for the '<em>Set Min Slice Duration</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_MIN_SLICE_DURATION__INT = SOFTWARE_ELEMENT_OPERATION_COUNT + 23;

    /**
     * The operation id for the '<em>Get Periodicity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_PERIODICITY = SOFTWARE_ELEMENT_OPERATION_COUNT + 24;

    /**
     * The operation id for the '<em>Set Periodicity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_PERIODICITY__PERIODICITYTYPE = SOFTWARE_ELEMENT_OPERATION_COUNT + 25;

    /**
     * The operation id for the '<em>Get Color</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___GET_COLOR = SOFTWARE_ELEMENT_OPERATION_COUNT + 26;

    /**
     * The operation id for the '<em>Set Color</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___SET_COLOR__COLOR = SOFTWARE_ELEMENT_OPERATION_COUNT + 27;

    /**
     * The number of operations of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_OPERATION_COUNT = SOFTWARE_ELEMENT_OPERATION_COUNT + 28;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl <em>Feature Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.FeatureRequirementImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getFeatureRequirement()
     * @generated
     */
    int FEATURE_REQUIREMENT = 46;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_REQUIREMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_REQUIREMENT__HARDWARE_LEVEL = 1;

    /**
     * The feature id for the '<em><b>Units</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_REQUIREMENT__UNITS = 2;

    /**
     * The feature id for the '<em><b>Shared</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_REQUIREMENT__SHARED = 3;

    /**
     * The feature id for the '<em><b>Is Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_REQUIREMENT__IS_EXCLUSIVE = 4;

    /**
     * The number of structural features of the '<em>Feature Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_REQUIREMENT_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Feature Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_REQUIREMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.MappingRelationImpl <em>Mapping Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.MappingRelationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMappingRelation()
     * @generated
     */
    int MAPPING_RELATION = 47;

    /**
     * The feature id for the '<em><b>Software Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RELATION__SOFTWARE_ELEMENTS = 0;

    /**
     * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RELATION__HARDWARE_LEVEL = 1;

    /**
     * The feature id for the '<em><b>All Tasks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RELATION__ALL_TASKS = 2;

    /**
     * The feature id for the '<em><b>Software Element Names</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES = 3;

    /**
     * The number of structural features of the '<em>Mapping Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RELATION_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Mapping Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RELATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DislocalityRelationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDislocalityRelation()
     * @generated
     */
    int DISLOCALITY_RELATION = 48;

    /**
     * The feature id for the '<em><b>Software Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISLOCALITY_RELATION__SOFTWARE_ELEMENTS = MAPPING_RELATION__SOFTWARE_ELEMENTS;

    /**
     * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISLOCALITY_RELATION__HARDWARE_LEVEL = MAPPING_RELATION__HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>All Tasks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISLOCALITY_RELATION__ALL_TASKS = MAPPING_RELATION__ALL_TASKS;

    /**
     * The feature id for the '<em><b>Software Element Names</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISLOCALITY_RELATION__SOFTWARE_ELEMENT_NAMES = MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES;

    /**
     * The number of structural features of the '<em>Dislocality Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISLOCALITY_RELATION_FEATURE_COUNT = MAPPING_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Dislocality Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISLOCALITY_RELATION_OPERATION_COUNT = MAPPING_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ColocalityRelationImpl <em>Colocality Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ColocalityRelationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getColocalityRelation()
     * @generated
     */
    int COLOCALITY_RELATION = 49;

    /**
     * The feature id for the '<em><b>Software Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOCALITY_RELATION__SOFTWARE_ELEMENTS = MAPPING_RELATION__SOFTWARE_ELEMENTS;

    /**
     * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOCALITY_RELATION__HARDWARE_LEVEL = MAPPING_RELATION__HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>All Tasks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOCALITY_RELATION__ALL_TASKS = MAPPING_RELATION__ALL_TASKS;

    /**
     * The feature id for the '<em><b>Software Element Names</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOCALITY_RELATION__SOFTWARE_ELEMENT_NAMES = MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES;

    /**
     * The number of structural features of the '<em>Colocality Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOCALITY_RELATION_FEATURE_COUNT = MAPPING_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Colocality Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOCALITY_RELATION_OPERATION_COUNT = MAPPING_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DissimilarityRelationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityRelation()
     * @generated
     */
    int DISSIMILARITY_RELATION = 50;

    /**
     * The feature id for the '<em><b>Software Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_RELATION__SOFTWARE_ELEMENTS = MAPPING_RELATION__SOFTWARE_ELEMENTS;

    /**
     * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_RELATION__HARDWARE_LEVEL = MAPPING_RELATION__HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>All Tasks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_RELATION__ALL_TASKS = MAPPING_RELATION__ALL_TASKS;

    /**
     * The feature id for the '<em><b>Software Element Names</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_RELATION__SOFTWARE_ELEMENT_NAMES = MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES;

    /**
     * The feature id for the '<em><b>Dissimilarity Clause</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE = MAPPING_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dissimilarity Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_RELATION_FEATURE_COUNT = MAPPING_RELATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Dissimilarity Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_RELATION_OPERATION_COUNT = MAPPING_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DissimilarityClauseImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityClause()
     * @generated
     */
    int DISSIMILARITY_CLAUSE = 51;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DissimilarityDisjunctionImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityDisjunction()
     * @generated
     */
    int DISSIMILARITY_DISJUNCTION = 52;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DissimilarityConjunctionImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityConjunction()
     * @generated
     */
    int DISSIMILARITY_CONJUNCTION = 53;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.DissimilarityEntryImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityEntry()
     * @generated
     */
    int DISSIMILARITY_ENTRY = 54;

    /**
     * The feature id for the '<em><b>Dissimilarity Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_ENTRY__HARDWARE_LEVEL = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dissimilarity Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_ENTRY_FEATURE_COUNT = DISSIMILARITY_CLAUSE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Dissimilarity Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISSIMILARITY_ENTRY_OPERATION_COUNT = DISSIMILARITY_CLAUSE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.SchedulingRestrictionImpl <em>Scheduling Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.SchedulingRestrictionImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSchedulingRestriction()
     * @generated
     */
    int SCHEDULING_RESTRICTION = 55;

    /**
     * The number of structural features of the '<em>Scheduling Restriction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESTRICTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Scheduling Restriction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESTRICTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.SimpleRelationImpl <em>Simple Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.SimpleRelationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSimpleRelation()
     * @generated
     */
    int SIMPLE_RELATION = 56;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RELATION__TASKS = SCHEDULING_RESTRICTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Simple Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RELATION_FEATURE_COUNT = SCHEDULING_RESTRICTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Simple Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RELATION_OPERATION_COUNT = SCHEDULING_RESTRICTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ComplexRelationImpl <em>Complex Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ComplexRelationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getComplexRelation()
     * @generated
     */
    int COMPLEX_RELATION = 57;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RELATION__TASKS = SCHEDULING_RESTRICTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Other Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RELATION__OTHER_TASK = SCHEDULING_RESTRICTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RELATION__DELAY = SCHEDULING_RESTRICTION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Complex Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RELATION_FEATURE_COUNT = SCHEDULING_RESTRICTION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Complex Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RELATION_OPERATION_COUNT = SCHEDULING_RESTRICTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionStartAtTheSameTimeImpl <em>Restriction Start At The Same Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionStartAtTheSameTimeImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionStartAtTheSameTime()
     * @generated
     */
    int RESTRICTION_START_AT_THE_SAME_TIME = 58;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AT_THE_SAME_TIME__TASKS = SIMPLE_RELATION__TASKS;

    /**
     * The number of structural features of the '<em>Restriction Start At The Same Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AT_THE_SAME_TIME_FEATURE_COUNT = SIMPLE_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Restriction Start At The Same Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AT_THE_SAME_TIME_OPERATION_COUNT = SIMPLE_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionFinishAtTheSameTimeImpl <em>Restriction Finish At The Same Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionFinishAtTheSameTimeImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionFinishAtTheSameTime()
     * @generated
     */
    int RESTRICTION_FINISH_AT_THE_SAME_TIME = 59;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_FINISH_AT_THE_SAME_TIME__TASKS = SIMPLE_RELATION__TASKS;

    /**
     * The number of structural features of the '<em>Restriction Finish At The Same Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_FINISH_AT_THE_SAME_TIME_FEATURE_COUNT = SIMPLE_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Restriction Finish At The Same Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_FINISH_AT_THE_SAME_TIME_OPERATION_COUNT = SIMPLE_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionStartAfterOtherFinishedImpl <em>Restriction Start After Other Finished</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionStartAfterOtherFinishedImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionStartAfterOtherFinished()
     * @generated
     */
    int RESTRICTION_START_AFTER_OTHER_FINISHED = 60;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_FINISHED__TASKS = COMPLEX_RELATION__TASKS;

    /**
     * The feature id for the '<em><b>Other Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_FINISHED__OTHER_TASK = COMPLEX_RELATION__OTHER_TASK;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_FINISHED__DELAY = COMPLEX_RELATION__DELAY;

    /**
     * The number of structural features of the '<em>Restriction Start After Other Finished</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_FINISHED_FEATURE_COUNT = COMPLEX_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Restriction Start After Other Finished</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_FINISHED_OPERATION_COUNT = COMPLEX_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionStartAfterOtherStartedImpl <em>Restriction Start After Other Started</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionStartAfterOtherStartedImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionStartAfterOtherStarted()
     * @generated
     */
    int RESTRICTION_START_AFTER_OTHER_STARTED = 61;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_STARTED__TASKS = COMPLEX_RELATION__TASKS;

    /**
     * The feature id for the '<em><b>Other Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_STARTED__OTHER_TASK = COMPLEX_RELATION__OTHER_TASK;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_STARTED__DELAY = COMPLEX_RELATION__DELAY;

    /**
     * The number of structural features of the '<em>Restriction Start After Other Started</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_STARTED_FEATURE_COUNT = COMPLEX_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Restriction Start After Other Started</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_START_AFTER_OTHER_STARTED_OPERATION_COUNT = COMPLEX_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionDisjointExecutionImpl <em>Restriction Disjoint Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionDisjointExecutionImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionDisjointExecution()
     * @generated
     */
    int RESTRICTION_DISJOINT_EXECUTION = 62;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_DISJOINT_EXECUTION__TASKS = SIMPLE_RELATION__TASKS;

    /**
     * The number of structural features of the '<em>Restriction Disjoint Execution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_DISJOINT_EXECUTION_FEATURE_COUNT = SIMPLE_RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Restriction Disjoint Execution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_DISJOINT_EXECUTION_OPERATION_COUNT = SIMPLE_RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionAlternativesImpl <em>Restriction Alternatives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionAlternativesImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionAlternatives()
     * @generated
     */
    int RESTRICTION_ALTERNATIVES = 63;

    /**
     * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVES__ALTERNATIVES = 0;

    /**
     * The number of structural features of the '<em>Restriction Alternatives</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Restriction Alternatives</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionAlternativeImpl <em>Restriction Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionAlternativeImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionAlternative()
     * @generated
     */
    int RESTRICTION_ALTERNATIVE = 64;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVE__NAME = 0;

    /**
     * The feature id for the '<em><b>Dislocality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS = 1;

    /**
     * The feature id for the '<em><b>Colocality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS = 2;

    /**
     * The feature id for the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVE__DISSIMILARITY_RELATIONS = 3;

    /**
     * The number of structural features of the '<em>Restriction Alternative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Restriction Alternative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_ALTERNATIVE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ExplorationCandidateImpl <em>Exploration Candidate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ExplorationCandidateImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getExplorationCandidate()
     * @generated
     */
    int EXPLORATION_CANDIDATE = 65;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_CANDIDATE__NAME = 0;

    /**
     * The feature id for the '<em><b>Board Alternatives</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES = 1;

    /**
     * The feature id for the '<em><b>Application Alternatives</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES = 2;

    /**
     * The feature id for the '<em><b>Restriction Alternatives</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES = 3;

    /**
     * The number of structural features of the '<em>Exploration Candidate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_CANDIDATE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Exploration Candidate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_CANDIDATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ExplorationResultImpl <em>Exploration Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ExplorationResultImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getExplorationResult()
     * @generated
     */
    int EXPLORATION_RESULT = 66;

    /**
     * The feature id for the '<em><b>Candidate</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT__CANDIDATE = 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT__MODEL = 1;

    /**
     * The feature id for the '<em><b>Mapping Result</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT__MAPPING_RESULT = 2;

    /**
     * The feature id for the '<em><b>Feasible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT__FEASIBLE = 3;

    /**
     * The feature id for the '<em><b>Absolute Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT__ABSOLUTE_SCORE = 4;

    /**
     * The feature id for the '<em><b>Scaled Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT__SCALED_SCORE = 5;

    /**
     * The number of structural features of the '<em>Exploration Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Exploration Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLORATION_RESULT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.AbstractDSEMetricImpl <em>Abstract DSE Metric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.AbstractDSEMetricImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAbstractDSEMetric()
     * @generated
     */
    int ABSTRACT_DSE_METRIC = 67;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DSE_METRIC__NAME = 0;

    /**
     * The feature id for the '<em><b>Built In</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DSE_METRIC__BUILT_IN = 1;

    /**
     * The feature id for the '<em><b>Higher Score Is Better</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DSE_METRIC__HIGHER_SCORE_IS_BETTER = 2;

    /**
     * The number of structural features of the '<em>Abstract DSE Metric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DSE_METRIC_FEATURE_COUNT = 3;

    /**
     * The operation id for the '<em>Compute Absolute Score</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DSE_METRIC___COMPUTE_ABSOLUTE_SCORE__EXPLORATIONRESULT = 0;

    /**
     * The number of operations of the '<em>Abstract DSE Metric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DSE_METRIC_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Comparable
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getComparable()
     * @generated
     */
    int COMPARABLE = 68;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.MetricScorePairImpl <em>Metric Score Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.MetricScorePairImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMetricScorePair()
     * @generated
     */
    int METRIC_SCORE_PAIR = 69;

    /**
     * The feature id for the '<em><b>Key</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC_SCORE_PAIR__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC_SCORE_PAIR__VALUE = 1;

    /**
     * The number of structural features of the '<em>Metric Score Pair</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC_SCORE_PAIR_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Metric Score Pair</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC_SCORE_PAIR_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.MappingResultImpl <em>Mapping Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.MappingResultImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMappingResult()
     * @generated
     */
    int MAPPING_RESULT = 70;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__NAME = COMPARABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__INDEX = COMPARABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Task2 Core Map</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__TASK2_CORE_MAP = COMPARABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__MODEL = COMPARABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Metric Absolute Scores Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP = COMPARABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Metric Scaled Scores Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__METRIC_SCALED_SCORES_MAP = COMPARABLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Partial Solution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__PARTIAL_SOLUTION = COMPARABLE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Absolute Total Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE = COMPARABLE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Scaled Total Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT__SCALED_TOTAL_SCORE = COMPARABLE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Mapping Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 9;

    /**
     * The operation id for the '<em>Is Used</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___IS_USED__CORE = COMPARABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Is Used</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___IS_USED__PROCESSOR = COMPARABLE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Is Used</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___IS_USED__BOARD = COMPARABLE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Is Used</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___IS_USED__BOX = COMPARABLE_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Is Used</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___IS_USED__COMPARTMENT = COMPARABLE_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Get Mapped Tasks For Core</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE = COMPARABLE_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Get Absolute Core Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE = COMPARABLE_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Get Relative Core Utilization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE = COMPARABLE_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Get Hardware Element For Task</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__TASK_INT = COMPARABLE_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Get Mapping Elements</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___GET_MAPPING_ELEMENTS = COMPARABLE_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Compare To</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___COMPARE_TO__MAPPINGRESULT = COMPARABLE_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT___TO_STRING = COMPARABLE_OPERATION_COUNT + 11;

    /**
     * The number of operations of the '<em>Mapping Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_RESULT_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 12;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl <em>Single Mapping Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.SingleMappingElementImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSingleMappingElement()
     * @generated
     */
    int SINGLE_MAPPING_ELEMENT = 71;

    /**
     * The feature id for the '<em><b>Application</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT__APPLICATION = 0;

    /**
     * The feature id for the '<em><b>Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT__TASK = 1;

    /**
     * The feature id for the '<em><b>Core</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT__CORE = 2;

    /**
     * The feature id for the '<em><b>Processor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT__PROCESSOR = 3;

    /**
     * The feature id for the '<em><b>Board</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT__BOARD = 4;

    /**
     * The feature id for the '<em><b>Box</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT__BOX = 5;

    /**
     * The feature id for the '<em><b>Compartment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT__COMPARTMENT = 6;

    /**
     * The number of structural features of the '<em>Single Mapping Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Single Mapping Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MAPPING_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.AbstractMappingMetricImpl <em>Abstract Mapping Metric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.AbstractMappingMetricImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAbstractMappingMetric()
     * @generated
     */
    int ABSTRACT_MAPPING_METRIC = 72;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MAPPING_METRIC__NAME = 0;

    /**
     * The feature id for the '<em><b>Built In</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MAPPING_METRIC__BUILT_IN = 1;

    /**
     * The feature id for the '<em><b>Higher Score Is Better</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MAPPING_METRIC__HIGHER_SCORE_IS_BETTER = 2;

    /**
     * The feature id for the '<em><b>Weight</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MAPPING_METRIC__WEIGHT = 3;

    /**
     * The number of structural features of the '<em>Abstract Mapping Metric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MAPPING_METRIC_FEATURE_COUNT = 4;

    /**
     * The operation id for the '<em>Compute Absolute Score</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MAPPING_METRIC___COMPUTE_ABSOLUTE_SCORE__MAPPINGRESULT = 0;

    /**
     * The number of operations of the '<em>Abstract Mapping Metric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MAPPING_METRIC_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.SchedulingResultImpl <em>Scheduling Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.SchedulingResultImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSchedulingResult()
     * @generated
     */
    int SCHEDULING_RESULT = 73;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESULT__NAME = 0;

    /**
     * The feature id for the '<em><b>Hyper Period Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESULT__HYPER_PERIOD_LENGTH = 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESULT__MODEL = 2;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESULT__SCHEDULE = 3;

    /**
     * The number of structural features of the '<em>Scheduling Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESULT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Scheduling Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_RESULT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.TaskExecutionInstanceImpl <em>Task Execution Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.TaskExecutionInstanceImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTaskExecutionInstance()
     * @generated
     */
    int TASK_EXECUTION_INSTANCE = 74;

    /**
     * The feature id for the '<em><b>Begin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_EXECUTION_INSTANCE__BEGIN = 0;

    /**
     * The feature id for the '<em><b>End</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_EXECUTION_INSTANCE__END = 1;

    /**
     * The number of structural features of the '<em>Task Execution Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_EXECUTION_INSTANCE_FEATURE_COUNT = 2;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_EXECUTION_INSTANCE___TO_STRING = 0;

    /**
     * The number of operations of the '<em>Task Execution Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_EXECUTION_INSTANCE_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.DissimilarityAttributes <em>Dissimilarity Attributes</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.DissimilarityAttributes
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityAttributes()
     * @generated
     */
    int DISSIMILARITY_ATTRIBUTES = 75;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
     * @generated
     */
    int HARDWARE_ARCHITECTURE_LEVEL_TYPE = 76;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.DesignAssuranceLevelType
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDesignAssuranceLevelType()
     * @generated
     */
    int DESIGN_ASSURANCE_LEVEL_TYPE = 77;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.PeriodicityType <em>Periodicity Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.PeriodicityType
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPeriodicityType()
     * @generated
     */
    int PERIODICITY_TYPE = 78;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.Color
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getColor()
     * @generated
     */
    int COLOR = 79;

    /**
     * The meta object id for the '<em>List Of Task Lists</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.EList
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getListOfTaskLists()
     * @generated
     */
    int LIST_OF_TASK_LISTS = 80;

    /**
     * The meta object id for the '<em>Task2 Core Map Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.HashMap
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask2CoreMapType()
     * @generated
     */
    int TASK2_CORE_MAP_TYPE = 81;

    /**
     * The meta object id for the '<em>String List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getStringList()
     * @generated
     */
    int STRING_LIST = 82;

    /**
     * The meta object id for the '<em>Task2 Execution Instances Map Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.HashMap
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask2ExecutionInstancesMapType()
     * @generated
     */
    int TASK2_EXECUTION_INSTANCES_MAP_TYPE = 83;


    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.AssistModel <em>Assist Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assist Model</em>'.
     * @see ch.hilbri.assist.model.AssistModel
     * @generated
     */
    EClass getAssistModel();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AssistModel#getSystemName <em>System Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System Name</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getSystemName()
     * @see #getAssistModel()
     * @generated
     */
    EAttribute getAssistModel_SystemName();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AssistModel#getMinHypPeriodLength <em>Min Hyp Period Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Hyp Period Length</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getMinHypPeriodLength()
     * @see #getAssistModel()
     * @generated
     */
    EAttribute getAssistModel_MinHypPeriodLength();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AssistModel#getTaskSwitchDelay <em>Task Switch Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Task Switch Delay</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getTaskSwitchDelay()
     * @see #getAssistModel()
     * @generated
     */
    EAttribute getAssistModel_TaskSwitchDelay();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getCompartments <em>Compartments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Compartments</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getCompartments()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_Compartments();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getApplications <em>Applications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Applications</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getApplications()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_Applications();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dislocality Relations</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getDislocalityRelations()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_DislocalityRelations();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getColocalityRelations <em>Colocality Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Colocality Relations</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getColocalityRelations()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_ColocalityRelations();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dissimilarity Relations</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getDissimilarityRelations()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_DissimilarityRelations();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getSchedulingRestrictions <em>Scheduling Restrictions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scheduling Restrictions</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getSchedulingRestrictions()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_SchedulingRestrictions();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getApplicationAlternatives <em>Application Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Application Alternatives</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getApplicationAlternatives()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_ApplicationAlternatives();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getRestrictionAlternatives <em>Restriction Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Restriction Alternatives</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getRestrictionAlternatives()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_RestrictionAlternatives();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.AssistModel#getExplorationCandidates <em>Exploration Candidates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exploration Candidates</em>'.
     * @see ch.hilbri.assist.model.AssistModel#getExplorationCandidates()
     * @see #getAssistModel()
     * @generated
     */
    EReference getAssistModel_ExplorationCandidates();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllCompartments() <em>Get All Compartments</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Compartments</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllCompartments()
     * @generated
     */
    EOperation getAssistModel__GetAllCompartments();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllBoxes() <em>Get All Boxes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Boxes</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllBoxes()
     * @generated
     */
    EOperation getAssistModel__GetAllBoxes();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllBoards() <em>Get All Boards</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Boards</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllBoards()
     * @generated
     */
    EOperation getAssistModel__GetAllBoards();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllProcessors() <em>Get All Processors</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Processors</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllProcessors()
     * @generated
     */
    EOperation getAssistModel__GetAllProcessors();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllCores() <em>Get All Cores</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Cores</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllCores()
     * @generated
     */
    EOperation getAssistModel__GetAllCores();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllTasks() <em>Get All Tasks</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Tasks</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllTasks()
     * @generated
     */
    EOperation getAssistModel__GetAllTasks();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllHardwareElements(int) <em>Get All Hardware Elements</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Hardware Elements</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllHardwareElements(int)
     * @generated
     */
    EOperation getAssistModel__GetAllHardwareElements__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AssistModel#getAllHardwareElements() <em>Get All Hardware Elements</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Hardware Elements</em>' operation.
     * @see ch.hilbri.assist.model.AssistModel#getAllHardwareElements()
     * @generated
     */
    EOperation getAssistModel__GetAllHardwareElements();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see ch.hilbri.assist.model.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.StringProperty <em>String Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Property</em>'.
     * @see ch.hilbri.assist.model.StringProperty
     * @generated
     */
    EClass getStringProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.StringProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.StringProperty#getValue()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.IntProperty <em>Int Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Int Property</em>'.
     * @see ch.hilbri.assist.model.IntProperty
     * @generated
     */
    EClass getIntProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.IntProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.IntProperty#getValue()
     * @see #getIntProperty()
     * @generated
     */
    EAttribute getIntProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ManufacturerProperty <em>Manufacturer Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manufacturer Property</em>'.
     * @see ch.hilbri.assist.model.ManufacturerProperty
     * @generated
     */
    EClass getManufacturerProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.PowerSupplyProperty <em>Power Supply Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Power Supply Property</em>'.
     * @see ch.hilbri.assist.model.PowerSupplyProperty
     * @generated
     */
    EClass getPowerSupplyProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.BoardTypeProperty <em>Board Type Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Board Type Property</em>'.
     * @see ch.hilbri.assist.model.BoardTypeProperty
     * @generated
     */
    EClass getBoardTypeProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ProcessorTypeProperty <em>Processor Type Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Type Property</em>'.
     * @see ch.hilbri.assist.model.ProcessorTypeProperty
     * @generated
     */
    EClass getProcessorTypeProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RAMCapacityProperty <em>RAM Capacity Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RAM Capacity Property</em>'.
     * @see ch.hilbri.assist.model.RAMCapacityProperty
     * @generated
     */
    EClass getRAMCapacityProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RAMUtilizationProperty <em>RAM Utilization Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RAM Utilization Property</em>'.
     * @see ch.hilbri.assist.model.RAMUtilizationProperty
     * @generated
     */
    EClass getRAMUtilizationProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ROMCapacityProperty <em>ROM Capacity Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ROM Capacity Property</em>'.
     * @see ch.hilbri.assist.model.ROMCapacityProperty
     * @generated
     */
    EClass getROMCapacityProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ROMUtilizationProperty <em>ROM Utilization Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ROM Utilization Property</em>'.
     * @see ch.hilbri.assist.model.ROMUtilizationProperty
     * @generated
     */
    EClass getROMUtilizationProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.CoreCapacityProperty <em>Core Capacity Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Core Capacity Property</em>'.
     * @see ch.hilbri.assist.model.CoreCapacityProperty
     * @generated
     */
    EClass getCoreCapacityProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.CoreUtilizationProperty <em>Core Utilization Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Core Utilization Property</em>'.
     * @see ch.hilbri.assist.model.CoreUtilizationProperty
     * @generated
     */
    EClass getCoreUtilizationProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.CoreArchitectureProperty <em>Core Architecture Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Core Architecture Property</em>'.
     * @see ch.hilbri.assist.model.CoreArchitectureProperty
     * @generated
     */
    EClass getCoreArchitectureProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DevelopedByProperty <em>Developed By Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Developed By Property</em>'.
     * @see ch.hilbri.assist.model.DevelopedByProperty
     * @generated
     */
    EClass getDevelopedByProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DurationProperty <em>Duration Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Duration Property</em>'.
     * @see ch.hilbri.assist.model.DurationProperty
     * @generated
     */
    EClass getDurationProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.PeriodProperty <em>Period Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Period Property</em>'.
     * @see ch.hilbri.assist.model.PeriodProperty
     * @generated
     */
    EClass getPeriodProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.EarlyToleranceProperty <em>Early Tolerance Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Early Tolerance Property</em>'.
     * @see ch.hilbri.assist.model.EarlyToleranceProperty
     * @generated
     */
    EClass getEarlyToleranceProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.LateToleranceProperty <em>Late Tolerance Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Late Tolerance Property</em>'.
     * @see ch.hilbri.assist.model.LateToleranceProperty
     * @generated
     */
    EClass getLateToleranceProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.MaxStartTimeProperty <em>Max Start Time Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Max Start Time Property</em>'.
     * @see ch.hilbri.assist.model.MaxStartTimeProperty
     * @generated
     */
    EClass getMaxStartTimeProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.MaxEndTimeProperty <em>Max End Time Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Max End Time Property</em>'.
     * @see ch.hilbri.assist.model.MaxEndTimeProperty
     * @generated
     */
    EClass getMaxEndTimeProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.AddInitTimeProperty <em>Add Init Time Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Add Init Time Property</em>'.
     * @see ch.hilbri.assist.model.AddInitTimeProperty
     * @generated
     */
    EClass getAddInitTimeProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.SlicesProperty <em>Slices Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Slices Property</em>'.
     * @see ch.hilbri.assist.model.SlicesProperty
     * @generated
     */
    EClass getSlicesProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.MinSliceDurationProperty <em>Min Slice Duration Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Min Slice Duration Property</em>'.
     * @see ch.hilbri.assist.model.MinSliceDurationProperty
     * @generated
     */
    EClass getMinSliceDurationProperty();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DesignAssuranceLevelProperty <em>Design Assurance Level Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Design Assurance Level Property</em>'.
     * @see ch.hilbri.assist.model.DesignAssuranceLevelProperty
     * @generated
     */
    EClass getDesignAssuranceLevelProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.DesignAssuranceLevelProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.DesignAssuranceLevelProperty#getValue()
     * @see #getDesignAssuranceLevelProperty()
     * @generated
     */
    EAttribute getDesignAssuranceLevelProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.CriticalityLevelProperty <em>Criticality Level Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Criticality Level Property</em>'.
     * @see ch.hilbri.assist.model.CriticalityLevelProperty
     * @generated
     */
    EClass getCriticalityLevelProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.CriticalityLevelProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.CriticalityLevelProperty#getValue()
     * @see #getCriticalityLevelProperty()
     * @generated
     */
    EAttribute getCriticalityLevelProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.PeriodicityProperty <em>Periodicity Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Periodicity Property</em>'.
     * @see ch.hilbri.assist.model.PeriodicityProperty
     * @generated
     */
    EClass getPeriodicityProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.PeriodicityProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.PeriodicityProperty#getValue()
     * @see #getPeriodicityProperty()
     * @generated
     */
    EAttribute getPeriodicityProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ColorProperty <em>Color Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Color Property</em>'.
     * @see ch.hilbri.assist.model.ColorProperty
     * @generated
     */
    EClass getColorProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.ColorProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.ColorProperty#getValue()
     * @see #getColorProperty()
     * @generated
     */
    EAttribute getColorProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.CustomProperty <em>Custom Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Property</em>'.
     * @see ch.hilbri.assist.model.CustomProperty
     * @generated
     */
    EClass getCustomProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.CustomProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.CustomProperty#getName()
     * @see #getCustomProperty()
     * @generated
     */
    EAttribute getCustomProperty_Name();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.CustomIntProperty <em>Custom Int Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Int Property</em>'.
     * @see ch.hilbri.assist.model.CustomIntProperty
     * @generated
     */
    EClass getCustomIntProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.CustomIntProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.CustomIntProperty#getValue()
     * @see #getCustomIntProperty()
     * @generated
     */
    EAttribute getCustomIntProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.CustomStringProperty <em>Custom String Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom String Property</em>'.
     * @see ch.hilbri.assist.model.CustomStringProperty
     * @generated
     */
    EClass getCustomStringProperty();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.CustomStringProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ch.hilbri.assist.model.CustomStringProperty#getValue()
     * @see #getCustomStringProperty()
     * @generated
     */
    EAttribute getCustomStringProperty_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.HardwareElement <em>Hardware Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hardware Element</em>'.
     * @see ch.hilbri.assist.model.HardwareElement
     * @generated
     */
    EClass getHardwareElement();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.HardwareElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.HardwareElement#getName()
     * @see #getHardwareElement()
     * @generated
     */
    EAttribute getHardwareElement_Name();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.HardwareElement#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see ch.hilbri.assist.model.HardwareElement#getProperties()
     * @see #getHardwareElement()
     * @generated
     */
    EReference getHardwareElement_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.HardwareElement#getFeatures <em>Features</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Features</em>'.
     * @see ch.hilbri.assist.model.HardwareElement#getFeatures()
     * @see #getHardwareElement()
     * @generated
     */
    EReference getHardwareElement_Features();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.HardwareElement#getGetHardwareLevel <em>Get Hardware Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Get Hardware Level</em>'.
     * @see ch.hilbri.assist.model.HardwareElement#getGetHardwareLevel()
     * @see #getHardwareElement()
     * @generated
     */
    EAttribute getHardwareElement_GetHardwareLevel();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.HardwareElement#getManufacturer() <em>Get Manufacturer</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Manufacturer</em>' operation.
     * @see ch.hilbri.assist.model.HardwareElement#getManufacturer()
     * @generated
     */
    EOperation getHardwareElement__GetManufacturer();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.HardwareElement#setManufacturer(java.lang.String) <em>Set Manufacturer</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Manufacturer</em>' operation.
     * @see ch.hilbri.assist.model.HardwareElement#setManufacturer(java.lang.String)
     * @generated
     */
    EOperation getHardwareElement__SetManufacturer__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.HardwareElement#getCustomPropertiesWithName(java.lang.String) <em>Get Custom Properties With Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom Properties With Name</em>' operation.
     * @see ch.hilbri.assist.model.HardwareElement#getCustomPropertiesWithName(java.lang.String)
     * @generated
     */
    EOperation getHardwareElement__GetCustomPropertiesWithName__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.HardwareElement#getCustomPropertiesWithNameAndValue(java.lang.String, java.lang.String) <em>Get Custom Properties With Name And Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * @see ch.hilbri.assist.model.HardwareElement#getCustomPropertiesWithNameAndValue(java.lang.String, java.lang.String)
     * @generated
     */
    EOperation getHardwareElement__GetCustomPropertiesWithNameAndValue__String_String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.HardwareElement#getCustomStringProperty(java.lang.String) <em>Get Custom String Property</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom String Property</em>' operation.
     * @see ch.hilbri.assist.model.HardwareElement#getCustomStringProperty(java.lang.String)
     * @generated
     */
    EOperation getHardwareElement__GetCustomStringProperty__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.HardwareElement#getCustomIntProperty(java.lang.String) <em>Get Custom Int Property</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom Int Property</em>' operation.
     * @see ch.hilbri.assist.model.HardwareElement#getCustomIntProperty(java.lang.String)
     * @generated
     */
    EOperation getHardwareElement__GetCustomIntProperty__String();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Feature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feature</em>'.
     * @see ch.hilbri.assist.model.Feature
     * @generated
     */
    EClass getFeature();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Feature#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.Feature#getName()
     * @see #getFeature()
     * @generated
     */
    EAttribute getFeature_Name();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Feature#getUnits <em>Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Units</em>'.
     * @see ch.hilbri.assist.model.Feature#getUnits()
     * @see #getFeature()
     * @generated
     */
    EAttribute getFeature_Units();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Feature#isSynchronizedAccess <em>Synchronized Access</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synchronized Access</em>'.
     * @see ch.hilbri.assist.model.Feature#isSynchronizedAccess()
     * @see #getFeature()
     * @generated
     */
    EAttribute getFeature_SynchronizedAccess();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Feature#isShared <em>Shared</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Shared</em>'.
     * @see ch.hilbri.assist.model.Feature#isShared()
     * @see #getFeature()
     * @generated
     */
    EAttribute getFeature_Shared();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Feature#isIsExclusive <em>Is Exclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Exclusive</em>'.
     * @see ch.hilbri.assist.model.Feature#isIsExclusive()
     * @see #getFeature()
     * @generated
     */
    EAttribute getFeature_IsExclusive();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Compartment <em>Compartment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Compartment</em>'.
     * @see ch.hilbri.assist.model.Compartment
     * @generated
     */
    EClass getCompartment();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Compartment#getBoxes <em>Boxes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Boxes</em>'.
     * @see ch.hilbri.assist.model.Compartment#getBoxes()
     * @see #getCompartment()
     * @generated
     */
    EReference getCompartment_Boxes();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Compartment#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @see ch.hilbri.assist.model.Compartment#getFullName()
     * @see #getCompartment()
     * @generated
     */
    EAttribute getCompartment_FullName();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Compartment#getAllBoxes() <em>Get All Boxes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Boxes</em>' operation.
     * @see ch.hilbri.assist.model.Compartment#getAllBoxes()
     * @generated
     */
    EOperation getCompartment__GetAllBoxes();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Compartment#getAllBoards() <em>Get All Boards</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Boards</em>' operation.
     * @see ch.hilbri.assist.model.Compartment#getAllBoards()
     * @generated
     */
    EOperation getCompartment__GetAllBoards();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Compartment#getAllProcessors() <em>Get All Processors</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Processors</em>' operation.
     * @see ch.hilbri.assist.model.Compartment#getAllProcessors()
     * @generated
     */
    EOperation getCompartment__GetAllProcessors();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Compartment#getAllCores() <em>Get All Cores</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Cores</em>' operation.
     * @see ch.hilbri.assist.model.Compartment#getAllCores()
     * @generated
     */
    EOperation getCompartment__GetAllCores();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Compartment#getPowerSupply() <em>Get Power Supply</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Power Supply</em>' operation.
     * @see ch.hilbri.assist.model.Compartment#getPowerSupply()
     * @generated
     */
    EOperation getCompartment__GetPowerSupply();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Compartment#setPowerSupply(java.lang.String) <em>Set Power Supply</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Power Supply</em>' operation.
     * @see ch.hilbri.assist.model.Compartment#setPowerSupply(java.lang.String)
     * @generated
     */
    EOperation getCompartment__SetPowerSupply__String();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Box <em>Box</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Box</em>'.
     * @see ch.hilbri.assist.model.Box
     * @generated
     */
    EClass getBox();

    /**
     * Returns the meta object for the container reference '{@link ch.hilbri.assist.model.Box#getCompartment <em>Compartment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Compartment</em>'.
     * @see ch.hilbri.assist.model.Box#getCompartment()
     * @see #getBox()
     * @generated
     */
    EReference getBox_Compartment();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Box#getBoards <em>Boards</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Boards</em>'.
     * @see ch.hilbri.assist.model.Box#getBoards()
     * @see #getBox()
     * @generated
     */
    EReference getBox_Boards();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Box#getBoardAlternatives <em>Board Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Board Alternatives</em>'.
     * @see ch.hilbri.assist.model.Box#getBoardAlternatives()
     * @see #getBox()
     * @generated
     */
    EReference getBox_BoardAlternatives();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Box#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @see ch.hilbri.assist.model.Box#getFullName()
     * @see #getBox()
     * @generated
     */
    EAttribute getBox_FullName();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Box#getAllBoards() <em>Get All Boards</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Boards</em>' operation.
     * @see ch.hilbri.assist.model.Box#getAllBoards()
     * @generated
     */
    EOperation getBox__GetAllBoards();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Box#getAllProcessors() <em>Get All Processors</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Processors</em>' operation.
     * @see ch.hilbri.assist.model.Box#getAllProcessors()
     * @generated
     */
    EOperation getBox__GetAllProcessors();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Box#getAllCores() <em>Get All Cores</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Cores</em>' operation.
     * @see ch.hilbri.assist.model.Box#getAllCores()
     * @generated
     */
    EOperation getBox__GetAllCores();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.BoardAlternatives <em>Board Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Board Alternatives</em>'.
     * @see ch.hilbri.assist.model.BoardAlternatives
     * @generated
     */
    EClass getBoardAlternatives();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.BoardAlternatives#getAlternatives <em>Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Alternatives</em>'.
     * @see ch.hilbri.assist.model.BoardAlternatives#getAlternatives()
     * @see #getBoardAlternatives()
     * @generated
     */
    EReference getBoardAlternatives_Alternatives();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.BoardAlternative <em>Board Alternative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Board Alternative</em>'.
     * @see ch.hilbri.assist.model.BoardAlternative
     * @generated
     */
    EClass getBoardAlternative();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.BoardAlternative#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.BoardAlternative#getName()
     * @see #getBoardAlternative()
     * @generated
     */
    EAttribute getBoardAlternative_Name();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.BoardAlternative#getBoards <em>Boards</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Boards</em>'.
     * @see ch.hilbri.assist.model.BoardAlternative#getBoards()
     * @see #getBoardAlternative()
     * @generated
     */
    EReference getBoardAlternative_Boards();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Board <em>Board</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Board</em>'.
     * @see ch.hilbri.assist.model.Board
     * @generated
     */
    EClass getBoard();

    /**
     * Returns the meta object for the container reference '{@link ch.hilbri.assist.model.Board#getBox <em>Box</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Box</em>'.
     * @see ch.hilbri.assist.model.Board#getBox()
     * @see #getBoard()
     * @generated
     */
    EReference getBoard_Box();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Board#getProcessors <em>Processors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Processors</em>'.
     * @see ch.hilbri.assist.model.Board#getProcessors()
     * @see #getBoard()
     * @generated
     */
    EReference getBoard_Processors();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Board#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @see ch.hilbri.assist.model.Board#getFullName()
     * @see #getBoard()
     * @generated
     */
    EAttribute getBoard_FullName();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#toString() <em>To String</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>To String</em>' operation.
     * @see ch.hilbri.assist.model.Board#toString()
     * @generated
     */
    EOperation getBoard__ToString();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#getAllProcessors() <em>Get All Processors</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Processors</em>' operation.
     * @see ch.hilbri.assist.model.Board#getAllProcessors()
     * @generated
     */
    EOperation getBoard__GetAllProcessors();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#getAllCores() <em>Get All Cores</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Cores</em>' operation.
     * @see ch.hilbri.assist.model.Board#getAllCores()
     * @generated
     */
    EOperation getBoard__GetAllCores();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#getAssuranceLevel() <em>Get Assurance Level</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Assurance Level</em>' operation.
     * @see ch.hilbri.assist.model.Board#getAssuranceLevel()
     * @generated
     */
    EOperation getBoard__GetAssuranceLevel();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#setAssuranceLevel(ch.hilbri.assist.model.DesignAssuranceLevelType) <em>Set Assurance Level</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Assurance Level</em>' operation.
     * @see ch.hilbri.assist.model.Board#setAssuranceLevel(ch.hilbri.assist.model.DesignAssuranceLevelType)
     * @generated
     */
    EOperation getBoard__SetAssuranceLevel__DesignAssuranceLevelType();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#getPowerSupply() <em>Get Power Supply</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Power Supply</em>' operation.
     * @see ch.hilbri.assist.model.Board#getPowerSupply()
     * @generated
     */
    EOperation getBoard__GetPowerSupply();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#setPowerSupply(java.lang.String) <em>Set Power Supply</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Power Supply</em>' operation.
     * @see ch.hilbri.assist.model.Board#setPowerSupply(java.lang.String)
     * @generated
     */
    EOperation getBoard__SetPowerSupply__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#getBoardType() <em>Get Board Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Board Type</em>' operation.
     * @see ch.hilbri.assist.model.Board#getBoardType()
     * @generated
     */
    EOperation getBoard__GetBoardType();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#setBoardType(java.lang.String) <em>Set Board Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Board Type</em>' operation.
     * @see ch.hilbri.assist.model.Board#setBoardType(java.lang.String)
     * @generated
     */
    EOperation getBoard__SetBoardType__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#getRamCapacity() <em>Get Ram Capacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Ram Capacity</em>' operation.
     * @see ch.hilbri.assist.model.Board#getRamCapacity()
     * @generated
     */
    EOperation getBoard__GetRamCapacity();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#setRamCapacity(int) <em>Set Ram Capacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Ram Capacity</em>' operation.
     * @see ch.hilbri.assist.model.Board#setRamCapacity(int)
     * @generated
     */
    EOperation getBoard__SetRamCapacity__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#getRomCapacity() <em>Get Rom Capacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Rom Capacity</em>' operation.
     * @see ch.hilbri.assist.model.Board#getRomCapacity()
     * @generated
     */
    EOperation getBoard__GetRomCapacity();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Board#setRomCapacity(int) <em>Set Rom Capacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Rom Capacity</em>' operation.
     * @see ch.hilbri.assist.model.Board#setRomCapacity(int)
     * @generated
     */
    EOperation getBoard__SetRomCapacity__int();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor</em>'.
     * @see ch.hilbri.assist.model.Processor
     * @generated
     */
    EClass getProcessor();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Processor#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @see ch.hilbri.assist.model.Processor#getFullName()
     * @see #getProcessor()
     * @generated
     */
    EAttribute getProcessor_FullName();

    /**
     * Returns the meta object for the container reference '{@link ch.hilbri.assist.model.Processor#getBoard <em>Board</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Board</em>'.
     * @see ch.hilbri.assist.model.Processor#getBoard()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_Board();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Processor#getCores <em>Cores</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Cores</em>'.
     * @see ch.hilbri.assist.model.Processor#getCores()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_Cores();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Processor#getAllCores() <em>Get All Cores</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Cores</em>' operation.
     * @see ch.hilbri.assist.model.Processor#getAllCores()
     * @generated
     */
    EOperation getProcessor__GetAllCores();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Processor#getProcessorType() <em>Get Processor Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Processor Type</em>' operation.
     * @see ch.hilbri.assist.model.Processor#getProcessorType()
     * @generated
     */
    EOperation getProcessor__GetProcessorType();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Processor#setProcessorType(java.lang.String) <em>Set Processor Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Processor Type</em>' operation.
     * @see ch.hilbri.assist.model.Processor#setProcessorType(java.lang.String)
     * @generated
     */
    EOperation getProcessor__SetProcessorType__String();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Core <em>Core</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Core</em>'.
     * @see ch.hilbri.assist.model.Core
     * @generated
     */
    EClass getCore();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Core#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @see ch.hilbri.assist.model.Core#getFullName()
     * @see #getCore()
     * @generated
     */
    EAttribute getCore_FullName();

    /**
     * Returns the meta object for the container reference '{@link ch.hilbri.assist.model.Core#getProcessor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Processor</em>'.
     * @see ch.hilbri.assist.model.Core#getProcessor()
     * @see #getCore()
     * @generated
     */
    EReference getCore_Processor();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Core#getCoreCapacity() <em>Get Core Capacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Core Capacity</em>' operation.
     * @see ch.hilbri.assist.model.Core#getCoreCapacity()
     * @generated
     */
    EOperation getCore__GetCoreCapacity();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Core#setCoreCapacity(int) <em>Set Core Capacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Core Capacity</em>' operation.
     * @see ch.hilbri.assist.model.Core#setCoreCapacity(int)
     * @generated
     */
    EOperation getCore__SetCoreCapacity__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Core#getCoreArchitecture() <em>Get Core Architecture</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Core Architecture</em>' operation.
     * @see ch.hilbri.assist.model.Core#getCoreArchitecture()
     * @generated
     */
    EOperation getCore__GetCoreArchitecture();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Core#setCoreArchitecture(java.lang.String) <em>Set Core Architecture</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Core Architecture</em>' operation.
     * @see ch.hilbri.assist.model.Core#setCoreArchitecture(java.lang.String)
     * @generated
     */
    EOperation getCore__SetCoreArchitecture__String();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ApplicationAlternatives <em>Application Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application Alternatives</em>'.
     * @see ch.hilbri.assist.model.ApplicationAlternatives
     * @generated
     */
    EClass getApplicationAlternatives();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.ApplicationAlternatives#getAlternatives <em>Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Alternatives</em>'.
     * @see ch.hilbri.assist.model.ApplicationAlternatives#getAlternatives()
     * @see #getApplicationAlternatives()
     * @generated
     */
    EReference getApplicationAlternatives_Alternatives();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ApplicationAlternative <em>Application Alternative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application Alternative</em>'.
     * @see ch.hilbri.assist.model.ApplicationAlternative
     * @generated
     */
    EClass getApplicationAlternative();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.ApplicationAlternative#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.ApplicationAlternative#getName()
     * @see #getApplicationAlternative()
     * @generated
     */
    EAttribute getApplicationAlternative_Name();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.ApplicationAlternative#getApplications <em>Applications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Applications</em>'.
     * @see ch.hilbri.assist.model.ApplicationAlternative#getApplications()
     * @see #getApplicationAlternative()
     * @generated
     */
    EReference getApplicationAlternative_Applications();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.SoftwareElement <em>Software Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Software Element</em>'.
     * @see ch.hilbri.assist.model.SoftwareElement
     * @generated
     */
    EClass getSoftwareElement();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.SoftwareElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.SoftwareElement#getName()
     * @see #getSoftwareElement()
     * @generated
     */
    EAttribute getSoftwareElement_Name();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.SoftwareElement#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see ch.hilbri.assist.model.SoftwareElement#getProperties()
     * @see #getSoftwareElement()
     * @generated
     */
    EReference getSoftwareElement_Properties();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.SoftwareElement#toString() <em>To String</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>To String</em>' operation.
     * @see ch.hilbri.assist.model.SoftwareElement#toString()
     * @generated
     */
    EOperation getSoftwareElement__ToString();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.SoftwareElement#getCustomPropertiesWithName(java.lang.String) <em>Get Custom Properties With Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom Properties With Name</em>' operation.
     * @see ch.hilbri.assist.model.SoftwareElement#getCustomPropertiesWithName(java.lang.String)
     * @generated
     */
    EOperation getSoftwareElement__GetCustomPropertiesWithName__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.SoftwareElement#getCustomPropertiesWithNameAndValue(java.lang.String, java.lang.String) <em>Get Custom Properties With Name And Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom Properties With Name And Value</em>' operation.
     * @see ch.hilbri.assist.model.SoftwareElement#getCustomPropertiesWithNameAndValue(java.lang.String, java.lang.String)
     * @generated
     */
    EOperation getSoftwareElement__GetCustomPropertiesWithNameAndValue__String_String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.SoftwareElement#getCustomStringProperty(java.lang.String) <em>Get Custom String Property</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom String Property</em>' operation.
     * @see ch.hilbri.assist.model.SoftwareElement#getCustomStringProperty(java.lang.String)
     * @generated
     */
    EOperation getSoftwareElement__GetCustomStringProperty__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.SoftwareElement#getCustomIntProperty(java.lang.String) <em>Get Custom Int Property</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Custom Int Property</em>' operation.
     * @see ch.hilbri.assist.model.SoftwareElement#getCustomIntProperty(java.lang.String)
     * @generated
     */
    EOperation getSoftwareElement__GetCustomIntProperty__String();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application</em>'.
     * @see ch.hilbri.assist.model.Application
     * @generated
     */
    EClass getApplication();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Application#getTasks <em>Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Tasks</em>'.
     * @see ch.hilbri.assist.model.Application#getTasks()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_Tasks();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Restrict Mapping To Hardware Elements</em>'.
     * @see ch.hilbri.assist.model.Application#getRestrictMappingToHardwareElements()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_RestrictMappingToHardwareElements();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Application#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @see ch.hilbri.assist.model.Application#getFullName()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_FullName();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Application#getDevelopedBy() <em>Get Developed By</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Developed By</em>' operation.
     * @see ch.hilbri.assist.model.Application#getDevelopedBy()
     * @generated
     */
    EOperation getApplication__GetDevelopedBy();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Application#setDevelopedBy(java.lang.String) <em>Set Developed By</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Developed By</em>' operation.
     * @see ch.hilbri.assist.model.Application#setDevelopedBy(java.lang.String)
     * @generated
     */
    EOperation getApplication__SetDevelopedBy__String();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Application#getCriticalityLevel() <em>Get Criticality Level</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Criticality Level</em>' operation.
     * @see ch.hilbri.assist.model.Application#getCriticalityLevel()
     * @generated
     */
    EOperation getApplication__GetCriticalityLevel();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Application#setCriticalityLevel(ch.hilbri.assist.model.DesignAssuranceLevelType) <em>Set Criticality Level</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Criticality Level</em>' operation.
     * @see ch.hilbri.assist.model.Application#setCriticalityLevel(ch.hilbri.assist.model.DesignAssuranceLevelType)
     * @generated
     */
    EOperation getApplication__SetCriticalityLevel__DesignAssuranceLevelType();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see ch.hilbri.assist.model.Task
     * @generated
     */
    EClass getTask();

    /**
     * Returns the meta object for the container reference '{@link ch.hilbri.assist.model.Task#getApplication <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Application</em>'.
     * @see ch.hilbri.assist.model.Task#getApplication()
     * @see #getTask()
     * @generated
     */
    EReference getTask_Application();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Task#getFeatureRequirements <em>Feature Requirements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Feature Requirements</em>'.
     * @see ch.hilbri.assist.model.Task#getFeatureRequirements()
     * @see #getTask()
     * @generated
     */
    EReference getTask_FeatureRequirements();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.Task#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Restrict Mapping To Hardware Elements</em>'.
     * @see ch.hilbri.assist.model.Task#getRestrictMappingToHardwareElements()
     * @see #getTask()
     * @generated
     */
    EReference getTask_RestrictMappingToHardwareElements();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.Task#getAssignedCore <em>Assigned Core</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Assigned Core</em>'.
     * @see ch.hilbri.assist.model.Task#getAssignedCore()
     * @see #getTask()
     * @generated
     */
    EReference getTask_AssignedCore();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @see ch.hilbri.assist.model.Task#getFullName()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_FullName();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getCoreUtilization() <em>Get Core Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Core Utilization</em>' operation.
     * @see ch.hilbri.assist.model.Task#getCoreUtilization()
     * @generated
     */
    EOperation getTask__GetCoreUtilization();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setCoreUtilization(int) <em>Set Core Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Core Utilization</em>' operation.
     * @see ch.hilbri.assist.model.Task#setCoreUtilization(int)
     * @generated
     */
    EOperation getTask__SetCoreUtilization__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getRamUtilization() <em>Get Ram Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Ram Utilization</em>' operation.
     * @see ch.hilbri.assist.model.Task#getRamUtilization()
     * @generated
     */
    EOperation getTask__GetRamUtilization();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setRamUtilization(int) <em>Set Ram Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Ram Utilization</em>' operation.
     * @see ch.hilbri.assist.model.Task#setRamUtilization(int)
     * @generated
     */
    EOperation getTask__SetRamUtilization__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getRomUtilization() <em>Get Rom Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Rom Utilization</em>' operation.
     * @see ch.hilbri.assist.model.Task#getRomUtilization()
     * @generated
     */
    EOperation getTask__GetRomUtilization();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setRomUtilization(int) <em>Set Rom Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Rom Utilization</em>' operation.
     * @see ch.hilbri.assist.model.Task#setRomUtilization(int)
     * @generated
     */
    EOperation getTask__SetRomUtilization__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getDuration() <em>Get Duration</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Duration</em>' operation.
     * @see ch.hilbri.assist.model.Task#getDuration()
     * @generated
     */
    EOperation getTask__GetDuration();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setDuration(int) <em>Set Duration</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Duration</em>' operation.
     * @see ch.hilbri.assist.model.Task#setDuration(int)
     * @generated
     */
    EOperation getTask__SetDuration__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getPeriod() <em>Get Period</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Period</em>' operation.
     * @see ch.hilbri.assist.model.Task#getPeriod()
     * @generated
     */
    EOperation getTask__GetPeriod();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setPeriod(int) <em>Set Period</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Period</em>' operation.
     * @see ch.hilbri.assist.model.Task#setPeriod(int)
     * @generated
     */
    EOperation getTask__SetPeriod__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getEarlyTolerance() <em>Get Early Tolerance</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Early Tolerance</em>' operation.
     * @see ch.hilbri.assist.model.Task#getEarlyTolerance()
     * @generated
     */
    EOperation getTask__GetEarlyTolerance();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setEarlyTolerance(int) <em>Set Early Tolerance</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Early Tolerance</em>' operation.
     * @see ch.hilbri.assist.model.Task#setEarlyTolerance(int)
     * @generated
     */
    EOperation getTask__SetEarlyTolerance__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getLateTolerance() <em>Get Late Tolerance</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Late Tolerance</em>' operation.
     * @see ch.hilbri.assist.model.Task#getLateTolerance()
     * @generated
     */
    EOperation getTask__GetLateTolerance();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setLateTolerance(int) <em>Set Late Tolerance</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Late Tolerance</em>' operation.
     * @see ch.hilbri.assist.model.Task#setLateTolerance(int)
     * @generated
     */
    EOperation getTask__SetLateTolerance__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getMaxStartTime() <em>Get Max Start Time</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Max Start Time</em>' operation.
     * @see ch.hilbri.assist.model.Task#getMaxStartTime()
     * @generated
     */
    EOperation getTask__GetMaxStartTime();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setMaxStartTime(int) <em>Set Max Start Time</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Max Start Time</em>' operation.
     * @see ch.hilbri.assist.model.Task#setMaxStartTime(int)
     * @generated
     */
    EOperation getTask__SetMaxStartTime__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getMaxEndTime() <em>Get Max End Time</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Max End Time</em>' operation.
     * @see ch.hilbri.assist.model.Task#getMaxEndTime()
     * @generated
     */
    EOperation getTask__GetMaxEndTime();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setMaxEndTime(int) <em>Set Max End Time</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Max End Time</em>' operation.
     * @see ch.hilbri.assist.model.Task#setMaxEndTime(int)
     * @generated
     */
    EOperation getTask__SetMaxEndTime__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getAddInitTime() <em>Get Add Init Time</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Add Init Time</em>' operation.
     * @see ch.hilbri.assist.model.Task#getAddInitTime()
     * @generated
     */
    EOperation getTask__GetAddInitTime();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setAddInitTime(int) <em>Set Add Init Time</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Add Init Time</em>' operation.
     * @see ch.hilbri.assist.model.Task#setAddInitTime(int)
     * @generated
     */
    EOperation getTask__SetAddInitTime__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getSlices() <em>Get Slices</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Slices</em>' operation.
     * @see ch.hilbri.assist.model.Task#getSlices()
     * @generated
     */
    EOperation getTask__GetSlices();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setSlices(int) <em>Set Slices</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Slices</em>' operation.
     * @see ch.hilbri.assist.model.Task#setSlices(int)
     * @generated
     */
    EOperation getTask__SetSlices__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getMinSliceDuration() <em>Get Min Slice Duration</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Min Slice Duration</em>' operation.
     * @see ch.hilbri.assist.model.Task#getMinSliceDuration()
     * @generated
     */
    EOperation getTask__GetMinSliceDuration();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setMinSliceDuration(int) <em>Set Min Slice Duration</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Min Slice Duration</em>' operation.
     * @see ch.hilbri.assist.model.Task#setMinSliceDuration(int)
     * @generated
     */
    EOperation getTask__SetMinSliceDuration__int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getPeriodicity() <em>Get Periodicity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Periodicity</em>' operation.
     * @see ch.hilbri.assist.model.Task#getPeriodicity()
     * @generated
     */
    EOperation getTask__GetPeriodicity();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setPeriodicity(ch.hilbri.assist.model.PeriodicityType) <em>Set Periodicity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Periodicity</em>' operation.
     * @see ch.hilbri.assist.model.Task#setPeriodicity(ch.hilbri.assist.model.PeriodicityType)
     * @generated
     */
    EOperation getTask__SetPeriodicity__PeriodicityType();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#getColor() <em>Get Color</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Color</em>' operation.
     * @see ch.hilbri.assist.model.Task#getColor()
     * @generated
     */
    EOperation getTask__GetColor();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.Task#setColor(ch.hilbri.assist.model.Color) <em>Set Color</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Color</em>' operation.
     * @see ch.hilbri.assist.model.Task#setColor(ch.hilbri.assist.model.Color)
     * @generated
     */
    EOperation getTask__SetColor__Color();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.FeatureRequirement <em>Feature Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feature Requirement</em>'.
     * @see ch.hilbri.assist.model.FeatureRequirement
     * @generated
     */
    EClass getFeatureRequirement();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.FeatureRequirement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.FeatureRequirement#getName()
     * @see #getFeatureRequirement()
     * @generated
     */
    EAttribute getFeatureRequirement_Name();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.FeatureRequirement#getHardwareLevel <em>Hardware Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hardware Level</em>'.
     * @see ch.hilbri.assist.model.FeatureRequirement#getHardwareLevel()
     * @see #getFeatureRequirement()
     * @generated
     */
    EAttribute getFeatureRequirement_HardwareLevel();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.FeatureRequirement#getUnits <em>Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Units</em>'.
     * @see ch.hilbri.assist.model.FeatureRequirement#getUnits()
     * @see #getFeatureRequirement()
     * @generated
     */
    EAttribute getFeatureRequirement_Units();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.FeatureRequirement#isShared <em>Shared</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Shared</em>'.
     * @see ch.hilbri.assist.model.FeatureRequirement#isShared()
     * @see #getFeatureRequirement()
     * @generated
     */
    EAttribute getFeatureRequirement_Shared();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.FeatureRequirement#isIsExclusive <em>Is Exclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Exclusive</em>'.
     * @see ch.hilbri.assist.model.FeatureRequirement#isIsExclusive()
     * @see #getFeatureRequirement()
     * @generated
     */
    EAttribute getFeatureRequirement_IsExclusive();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.MappingRelation <em>Mapping Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapping Relation</em>'.
     * @see ch.hilbri.assist.model.MappingRelation
     * @generated
     */
    EClass getMappingRelation();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.MappingRelation#getSoftwareElements <em>Software Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Software Elements</em>'.
     * @see ch.hilbri.assist.model.MappingRelation#getSoftwareElements()
     * @see #getMappingRelation()
     * @generated
     */
    EReference getMappingRelation_SoftwareElements();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingRelation#getHardwareLevel <em>Hardware Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hardware Level</em>'.
     * @see ch.hilbri.assist.model.MappingRelation#getHardwareLevel()
     * @see #getMappingRelation()
     * @generated
     */
    EAttribute getMappingRelation_HardwareLevel();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingRelation#getAllTasks <em>All Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>All Tasks</em>'.
     * @see ch.hilbri.assist.model.MappingRelation#getAllTasks()
     * @see #getMappingRelation()
     * @generated
     */
    EAttribute getMappingRelation_AllTasks();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingRelation#getSoftwareElementNames <em>Software Element Names</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Software Element Names</em>'.
     * @see ch.hilbri.assist.model.MappingRelation#getSoftwareElementNames()
     * @see #getMappingRelation()
     * @generated
     */
    EAttribute getMappingRelation_SoftwareElementNames();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DislocalityRelation <em>Dislocality Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dislocality Relation</em>'.
     * @see ch.hilbri.assist.model.DislocalityRelation
     * @generated
     */
    EClass getDislocalityRelation();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ColocalityRelation <em>Colocality Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Colocality Relation</em>'.
     * @see ch.hilbri.assist.model.ColocalityRelation
     * @generated
     */
    EClass getColocalityRelation();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DissimilarityRelation <em>Dissimilarity Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dissimilarity Relation</em>'.
     * @see ch.hilbri.assist.model.DissimilarityRelation
     * @generated
     */
    EClass getDissimilarityRelation();

    /**
     * Returns the meta object for the containment reference '{@link ch.hilbri.assist.model.DissimilarityRelation#getDissimilarityClause <em>Dissimilarity Clause</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Dissimilarity Clause</em>'.
     * @see ch.hilbri.assist.model.DissimilarityRelation#getDissimilarityClause()
     * @see #getDissimilarityRelation()
     * @generated
     */
    EReference getDissimilarityRelation_DissimilarityClause();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DissimilarityClause <em>Dissimilarity Clause</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dissimilarity Clause</em>'.
     * @see ch.hilbri.assist.model.DissimilarityClause
     * @generated
     */
    EClass getDissimilarityClause();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DissimilarityDisjunction <em>Dissimilarity Disjunction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dissimilarity Disjunction</em>'.
     * @see ch.hilbri.assist.model.DissimilarityDisjunction
     * @generated
     */
    EClass getDissimilarityDisjunction();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.DissimilarityDisjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
     * @see ch.hilbri.assist.model.DissimilarityDisjunction#getDissimilarityClauses()
     * @see #getDissimilarityDisjunction()
     * @generated
     */
    EReference getDissimilarityDisjunction_DissimilarityClauses();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DissimilarityConjunction <em>Dissimilarity Conjunction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dissimilarity Conjunction</em>'.
     * @see ch.hilbri.assist.model.DissimilarityConjunction
     * @generated
     */
    EClass getDissimilarityConjunction();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.DissimilarityConjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dissimilarity Clauses</em>'.
     * @see ch.hilbri.assist.model.DissimilarityConjunction#getDissimilarityClauses()
     * @see #getDissimilarityConjunction()
     * @generated
     */
    EReference getDissimilarityConjunction_DissimilarityClauses();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.DissimilarityEntry <em>Dissimilarity Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dissimilarity Entry</em>'.
     * @see ch.hilbri.assist.model.DissimilarityEntry
     * @generated
     */
    EClass getDissimilarityEntry();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.DissimilarityEntry#getDissimilarityAttribute <em>Dissimilarity Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dissimilarity Attribute</em>'.
     * @see ch.hilbri.assist.model.DissimilarityEntry#getDissimilarityAttribute()
     * @see #getDissimilarityEntry()
     * @generated
     */
    EAttribute getDissimilarityEntry_DissimilarityAttribute();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.DissimilarityEntry#getHardwareLevel <em>Hardware Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hardware Level</em>'.
     * @see ch.hilbri.assist.model.DissimilarityEntry#getHardwareLevel()
     * @see #getDissimilarityEntry()
     * @generated
     */
    EAttribute getDissimilarityEntry_HardwareLevel();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.SchedulingRestriction <em>Scheduling Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduling Restriction</em>'.
     * @see ch.hilbri.assist.model.SchedulingRestriction
     * @generated
     */
    EClass getSchedulingRestriction();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.SimpleRelation <em>Simple Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Relation</em>'.
     * @see ch.hilbri.assist.model.SimpleRelation
     * @generated
     */
    EClass getSimpleRelation();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.SimpleRelation#getTasks <em>Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Tasks</em>'.
     * @see ch.hilbri.assist.model.SimpleRelation#getTasks()
     * @see #getSimpleRelation()
     * @generated
     */
    EReference getSimpleRelation_Tasks();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ComplexRelation <em>Complex Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Relation</em>'.
     * @see ch.hilbri.assist.model.ComplexRelation
     * @generated
     */
    EClass getComplexRelation();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.ComplexRelation#getTasks <em>Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Tasks</em>'.
     * @see ch.hilbri.assist.model.ComplexRelation#getTasks()
     * @see #getComplexRelation()
     * @generated
     */
    EReference getComplexRelation_Tasks();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.ComplexRelation#getOtherTask <em>Other Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Other Task</em>'.
     * @see ch.hilbri.assist.model.ComplexRelation#getOtherTask()
     * @see #getComplexRelation()
     * @generated
     */
    EReference getComplexRelation_OtherTask();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.ComplexRelation#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see ch.hilbri.assist.model.ComplexRelation#getDelay()
     * @see #getComplexRelation()
     * @generated
     */
    EAttribute getComplexRelation_Delay();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RestrictionStartAtTheSameTime <em>Restriction Start At The Same Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Start At The Same Time</em>'.
     * @see ch.hilbri.assist.model.RestrictionStartAtTheSameTime
     * @generated
     */
    EClass getRestrictionStartAtTheSameTime();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RestrictionFinishAtTheSameTime <em>Restriction Finish At The Same Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Finish At The Same Time</em>'.
     * @see ch.hilbri.assist.model.RestrictionFinishAtTheSameTime
     * @generated
     */
    EClass getRestrictionFinishAtTheSameTime();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RestrictionStartAfterOtherFinished <em>Restriction Start After Other Finished</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Start After Other Finished</em>'.
     * @see ch.hilbri.assist.model.RestrictionStartAfterOtherFinished
     * @generated
     */
    EClass getRestrictionStartAfterOtherFinished();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RestrictionStartAfterOtherStarted <em>Restriction Start After Other Started</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Start After Other Started</em>'.
     * @see ch.hilbri.assist.model.RestrictionStartAfterOtherStarted
     * @generated
     */
    EClass getRestrictionStartAfterOtherStarted();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RestrictionDisjointExecution <em>Restriction Disjoint Execution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Disjoint Execution</em>'.
     * @see ch.hilbri.assist.model.RestrictionDisjointExecution
     * @generated
     */
    EClass getRestrictionDisjointExecution();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RestrictionAlternatives <em>Restriction Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Alternatives</em>'.
     * @see ch.hilbri.assist.model.RestrictionAlternatives
     * @generated
     */
    EClass getRestrictionAlternatives();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.RestrictionAlternatives#getAlternatives <em>Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Alternatives</em>'.
     * @see ch.hilbri.assist.model.RestrictionAlternatives#getAlternatives()
     * @see #getRestrictionAlternatives()
     * @generated
     */
    EReference getRestrictionAlternatives_Alternatives();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.RestrictionAlternative <em>Restriction Alternative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Alternative</em>'.
     * @see ch.hilbri.assist.model.RestrictionAlternative
     * @generated
     */
    EClass getRestrictionAlternative();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.RestrictionAlternative#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.RestrictionAlternative#getName()
     * @see #getRestrictionAlternative()
     * @generated
     */
    EAttribute getRestrictionAlternative_Name();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.RestrictionAlternative#getDislocalityRelations <em>Dislocality Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dislocality Relations</em>'.
     * @see ch.hilbri.assist.model.RestrictionAlternative#getDislocalityRelations()
     * @see #getRestrictionAlternative()
     * @generated
     */
    EReference getRestrictionAlternative_DislocalityRelations();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.RestrictionAlternative#getColocalityRelations <em>Colocality Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Colocality Relations</em>'.
     * @see ch.hilbri.assist.model.RestrictionAlternative#getColocalityRelations()
     * @see #getRestrictionAlternative()
     * @generated
     */
    EReference getRestrictionAlternative_ColocalityRelations();

    /**
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.RestrictionAlternative#getDissimilarityRelations <em>Dissimilarity Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dissimilarity Relations</em>'.
     * @see ch.hilbri.assist.model.RestrictionAlternative#getDissimilarityRelations()
     * @see #getRestrictionAlternative()
     * @generated
     */
    EReference getRestrictionAlternative_DissimilarityRelations();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ExplorationCandidate <em>Exploration Candidate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exploration Candidate</em>'.
     * @see ch.hilbri.assist.model.ExplorationCandidate
     * @generated
     */
    EClass getExplorationCandidate();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.ExplorationCandidate#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.ExplorationCandidate#getName()
     * @see #getExplorationCandidate()
     * @generated
     */
    EAttribute getExplorationCandidate_Name();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.ExplorationCandidate#getBoardAlternatives <em>Board Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Board Alternatives</em>'.
     * @see ch.hilbri.assist.model.ExplorationCandidate#getBoardAlternatives()
     * @see #getExplorationCandidate()
     * @generated
     */
    EReference getExplorationCandidate_BoardAlternatives();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.ExplorationCandidate#getApplicationAlternatives <em>Application Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Application Alternatives</em>'.
     * @see ch.hilbri.assist.model.ExplorationCandidate#getApplicationAlternatives()
     * @see #getExplorationCandidate()
     * @generated
     */
    EReference getExplorationCandidate_ApplicationAlternatives();

    /**
     * Returns the meta object for the reference list '{@link ch.hilbri.assist.model.ExplorationCandidate#getRestrictionAlternatives <em>Restriction Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Restriction Alternatives</em>'.
     * @see ch.hilbri.assist.model.ExplorationCandidate#getRestrictionAlternatives()
     * @see #getExplorationCandidate()
     * @generated
     */
    EReference getExplorationCandidate_RestrictionAlternatives();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.ExplorationResult <em>Exploration Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exploration Result</em>'.
     * @see ch.hilbri.assist.model.ExplorationResult
     * @generated
     */
    EClass getExplorationResult();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.ExplorationResult#getCandidate <em>Candidate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Candidate</em>'.
     * @see ch.hilbri.assist.model.ExplorationResult#getCandidate()
     * @see #getExplorationResult()
     * @generated
     */
    EReference getExplorationResult_Candidate();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.ExplorationResult#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Model</em>'.
     * @see ch.hilbri.assist.model.ExplorationResult#getModel()
     * @see #getExplorationResult()
     * @generated
     */
    EReference getExplorationResult_Model();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.ExplorationResult#getMappingResult <em>Mapping Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Mapping Result</em>'.
     * @see ch.hilbri.assist.model.ExplorationResult#getMappingResult()
     * @see #getExplorationResult()
     * @generated
     */
    EReference getExplorationResult_MappingResult();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.ExplorationResult#isFeasible <em>Feasible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Feasible</em>'.
     * @see ch.hilbri.assist.model.ExplorationResult#isFeasible()
     * @see #getExplorationResult()
     * @generated
     */
    EAttribute getExplorationResult_Feasible();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.ExplorationResult#getAbsoluteScore <em>Absolute Score</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Absolute Score</em>'.
     * @see ch.hilbri.assist.model.ExplorationResult#getAbsoluteScore()
     * @see #getExplorationResult()
     * @generated
     */
    EAttribute getExplorationResult_AbsoluteScore();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.ExplorationResult#getScaledScore <em>Scaled Score</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scaled Score</em>'.
     * @see ch.hilbri.assist.model.ExplorationResult#getScaledScore()
     * @see #getExplorationResult()
     * @generated
     */
    EAttribute getExplorationResult_ScaledScore();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.AbstractDSEMetric <em>Abstract DSE Metric</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract DSE Metric</em>'.
     * @see ch.hilbri.assist.model.AbstractDSEMetric
     * @generated
     */
    EClass getAbstractDSEMetric();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AbstractDSEMetric#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.AbstractDSEMetric#getName()
     * @see #getAbstractDSEMetric()
     * @generated
     */
    EAttribute getAbstractDSEMetric_Name();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AbstractDSEMetric#isBuiltIn <em>Built In</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Built In</em>'.
     * @see ch.hilbri.assist.model.AbstractDSEMetric#isBuiltIn()
     * @see #getAbstractDSEMetric()
     * @generated
     */
    EAttribute getAbstractDSEMetric_BuiltIn();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AbstractDSEMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Higher Score Is Better</em>'.
     * @see ch.hilbri.assist.model.AbstractDSEMetric#isHigherScoreIsBetter()
     * @see #getAbstractDSEMetric()
     * @generated
     */
    EAttribute getAbstractDSEMetric_HigherScoreIsBetter();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AbstractDSEMetric#computeAbsoluteScore(ch.hilbri.assist.model.ExplorationResult) <em>Compute Absolute Score</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Compute Absolute Score</em>' operation.
     * @see ch.hilbri.assist.model.AbstractDSEMetric#computeAbsoluteScore(ch.hilbri.assist.model.ExplorationResult)
     * @generated
     */
    EOperation getAbstractDSEMetric__ComputeAbsoluteScore__ExplorationResult();

    /**
     * Returns the meta object for class '{@link java.lang.Comparable <em>Comparable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comparable</em>'.
     * @see java.lang.Comparable
     * @model instanceClass="java.lang.Comparable&lt;ch.hilbri.assist.model.MappingResult&gt;"
     * @generated
     */
    EClass getComparable();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Metric Score Pair</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Metric Score Pair</em>'.
     * @see java.util.Map.Entry
     * @model keyType="ch.hilbri.assist.model.AbstractMappingMetric"
     *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EDoubleObject"
     * @generated
     */
    EClass getMetricScorePair();

    /**
     * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getMetricScorePair()
     * @generated
     */
    EReference getMetricScorePair_Key();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getMetricScorePair()
     * @generated
     */
    EAttribute getMetricScorePair_Value();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.MappingResult <em>Mapping Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapping Result</em>'.
     * @see ch.hilbri.assist.model.MappingResult
     * @generated
     */
    EClass getMappingResult();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingResult#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getName()
     * @see #getMappingResult()
     * @generated
     */
    EAttribute getMappingResult_Name();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingResult#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getIndex()
     * @see #getMappingResult()
     * @generated
     */
    EAttribute getMappingResult_Index();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingResult#getTask2CoreMap <em>Task2 Core Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Task2 Core Map</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getTask2CoreMap()
     * @see #getMappingResult()
     * @generated
     */
    EAttribute getMappingResult_Task2CoreMap();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.MappingResult#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Model</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getModel()
     * @see #getMappingResult()
     * @generated
     */
    EReference getMappingResult_Model();

    /**
     * Returns the meta object for the map '{@link ch.hilbri.assist.model.MappingResult#getMetricAbsoluteScoresMap <em>Metric Absolute Scores Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Metric Absolute Scores Map</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getMetricAbsoluteScoresMap()
     * @see #getMappingResult()
     * @generated
     */
    EReference getMappingResult_MetricAbsoluteScoresMap();

    /**
     * Returns the meta object for the map '{@link ch.hilbri.assist.model.MappingResult#getMetricScaledScoresMap <em>Metric Scaled Scores Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Metric Scaled Scores Map</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getMetricScaledScoresMap()
     * @see #getMappingResult()
     * @generated
     */
    EReference getMappingResult_MetricScaledScoresMap();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingResult#isPartialSolution <em>Partial Solution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Partial Solution</em>'.
     * @see ch.hilbri.assist.model.MappingResult#isPartialSolution()
     * @see #getMappingResult()
     * @generated
     */
    EAttribute getMappingResult_PartialSolution();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingResult#getAbsoluteTotalScore <em>Absolute Total Score</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Absolute Total Score</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getAbsoluteTotalScore()
     * @see #getMappingResult()
     * @generated
     */
    EAttribute getMappingResult_AbsoluteTotalScore();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.MappingResult#getScaledTotalScore <em>Scaled Total Score</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scaled Total Score</em>'.
     * @see ch.hilbri.assist.model.MappingResult#getScaledTotalScore()
     * @see #getMappingResult()
     * @generated
     */
    EAttribute getMappingResult_ScaledTotalScore();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Core) <em>Is Used</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Used</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Core)
     * @generated
     */
    EOperation getMappingResult__IsUsed__Core();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Processor) <em>Is Used</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Used</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Processor)
     * @generated
     */
    EOperation getMappingResult__IsUsed__Processor();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Board) <em>Is Used</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Used</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Board)
     * @generated
     */
    EOperation getMappingResult__IsUsed__Board();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Box) <em>Is Used</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Used</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Box)
     * @generated
     */
    EOperation getMappingResult__IsUsed__Box();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Compartment) <em>Is Used</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Used</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#isUsed(ch.hilbri.assist.model.Compartment)
     * @generated
     */
    EOperation getMappingResult__IsUsed__Compartment();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#getMappedTasksForCore(ch.hilbri.assist.model.Core) <em>Get Mapped Tasks For Core</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Mapped Tasks For Core</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#getMappedTasksForCore(ch.hilbri.assist.model.Core)
     * @generated
     */
    EOperation getMappingResult__GetMappedTasksForCore__Core();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#getAbsoluteCoreUtilization(ch.hilbri.assist.model.Core) <em>Get Absolute Core Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Absolute Core Utilization</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#getAbsoluteCoreUtilization(ch.hilbri.assist.model.Core)
     * @generated
     */
    EOperation getMappingResult__GetAbsoluteCoreUtilization__Core();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#getRelativeCoreUtilization(ch.hilbri.assist.model.Core) <em>Get Relative Core Utilization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Relative Core Utilization</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#getRelativeCoreUtilization(ch.hilbri.assist.model.Core)
     * @generated
     */
    EOperation getMappingResult__GetRelativeCoreUtilization__Core();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#getHardwareElementForTask(ch.hilbri.assist.model.Task, int) <em>Get Hardware Element For Task</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Hardware Element For Task</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#getHardwareElementForTask(ch.hilbri.assist.model.Task, int)
     * @generated
     */
    EOperation getMappingResult__GetHardwareElementForTask__Task_int();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#getMappingElements() <em>Get Mapping Elements</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Mapping Elements</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#getMappingElements()
     * @generated
     */
    EOperation getMappingResult__GetMappingElements();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#compareTo(ch.hilbri.assist.model.MappingResult) <em>Compare To</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Compare To</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#compareTo(ch.hilbri.assist.model.MappingResult)
     * @generated
     */
    EOperation getMappingResult__CompareTo__MappingResult();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.MappingResult#toString() <em>To String</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>To String</em>' operation.
     * @see ch.hilbri.assist.model.MappingResult#toString()
     * @generated
     */
    EOperation getMappingResult__ToString();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.SingleMappingElement <em>Single Mapping Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Mapping Element</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement
     * @generated
     */
    EClass getSingleMappingElement();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SingleMappingElement#getApplication <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Application</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement#getApplication()
     * @see #getSingleMappingElement()
     * @generated
     */
    EReference getSingleMappingElement_Application();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SingleMappingElement#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Task</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement#getTask()
     * @see #getSingleMappingElement()
     * @generated
     */
    EReference getSingleMappingElement_Task();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SingleMappingElement#getCore <em>Core</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Core</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement#getCore()
     * @see #getSingleMappingElement()
     * @generated
     */
    EReference getSingleMappingElement_Core();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SingleMappingElement#getProcessor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Processor</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement#getProcessor()
     * @see #getSingleMappingElement()
     * @generated
     */
    EReference getSingleMappingElement_Processor();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SingleMappingElement#getBoard <em>Board</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Board</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement#getBoard()
     * @see #getSingleMappingElement()
     * @generated
     */
    EReference getSingleMappingElement_Board();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SingleMappingElement#getBox <em>Box</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Box</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement#getBox()
     * @see #getSingleMappingElement()
     * @generated
     */
    EReference getSingleMappingElement_Box();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SingleMappingElement#getCompartment <em>Compartment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Compartment</em>'.
     * @see ch.hilbri.assist.model.SingleMappingElement#getCompartment()
     * @see #getSingleMappingElement()
     * @generated
     */
    EReference getSingleMappingElement_Compartment();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.AbstractMappingMetric <em>Abstract Mapping Metric</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Mapping Metric</em>'.
     * @see ch.hilbri.assist.model.AbstractMappingMetric
     * @generated
     */
    EClass getAbstractMappingMetric();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AbstractMappingMetric#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.AbstractMappingMetric#getName()
     * @see #getAbstractMappingMetric()
     * @generated
     */
    EAttribute getAbstractMappingMetric_Name();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AbstractMappingMetric#isBuiltIn <em>Built In</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Built In</em>'.
     * @see ch.hilbri.assist.model.AbstractMappingMetric#isBuiltIn()
     * @see #getAbstractMappingMetric()
     * @generated
     */
    EAttribute getAbstractMappingMetric_BuiltIn();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AbstractMappingMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Higher Score Is Better</em>'.
     * @see ch.hilbri.assist.model.AbstractMappingMetric#isHigherScoreIsBetter()
     * @see #getAbstractMappingMetric()
     * @generated
     */
    EAttribute getAbstractMappingMetric_HigherScoreIsBetter();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.AbstractMappingMetric#getWeight <em>Weight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weight</em>'.
     * @see ch.hilbri.assist.model.AbstractMappingMetric#getWeight()
     * @see #getAbstractMappingMetric()
     * @generated
     */
    EAttribute getAbstractMappingMetric_Weight();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.AbstractMappingMetric#computeAbsoluteScore(ch.hilbri.assist.model.MappingResult) <em>Compute Absolute Score</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Compute Absolute Score</em>' operation.
     * @see ch.hilbri.assist.model.AbstractMappingMetric#computeAbsoluteScore(ch.hilbri.assist.model.MappingResult)
     * @generated
     */
    EOperation getAbstractMappingMetric__ComputeAbsoluteScore__MappingResult();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.SchedulingResult <em>Scheduling Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduling Result</em>'.
     * @see ch.hilbri.assist.model.SchedulingResult
     * @generated
     */
    EClass getSchedulingResult();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.SchedulingResult#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ch.hilbri.assist.model.SchedulingResult#getName()
     * @see #getSchedulingResult()
     * @generated
     */
    EAttribute getSchedulingResult_Name();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.SchedulingResult#getHyperPeriodLength <em>Hyper Period Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hyper Period Length</em>'.
     * @see ch.hilbri.assist.model.SchedulingResult#getHyperPeriodLength()
     * @see #getSchedulingResult()
     * @generated
     */
    EAttribute getSchedulingResult_HyperPeriodLength();

    /**
     * Returns the meta object for the reference '{@link ch.hilbri.assist.model.SchedulingResult#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Model</em>'.
     * @see ch.hilbri.assist.model.SchedulingResult#getModel()
     * @see #getSchedulingResult()
     * @generated
     */
    EReference getSchedulingResult_Model();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.SchedulingResult#getSchedule <em>Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schedule</em>'.
     * @see ch.hilbri.assist.model.SchedulingResult#getSchedule()
     * @see #getSchedulingResult()
     * @generated
     */
    EAttribute getSchedulingResult_Schedule();

    /**
     * Returns the meta object for class '{@link ch.hilbri.assist.model.TaskExecutionInstance <em>Task Execution Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task Execution Instance</em>'.
     * @see ch.hilbri.assist.model.TaskExecutionInstance
     * @generated
     */
    EClass getTaskExecutionInstance();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.TaskExecutionInstance#getBegin <em>Begin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Begin</em>'.
     * @see ch.hilbri.assist.model.TaskExecutionInstance#getBegin()
     * @see #getTaskExecutionInstance()
     * @generated
     */
    EAttribute getTaskExecutionInstance_Begin();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.TaskExecutionInstance#getEnd <em>End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End</em>'.
     * @see ch.hilbri.assist.model.TaskExecutionInstance#getEnd()
     * @see #getTaskExecutionInstance()
     * @generated
     */
    EAttribute getTaskExecutionInstance_End();

    /**
     * Returns the meta object for the '{@link ch.hilbri.assist.model.TaskExecutionInstance#toString() <em>To String</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>To String</em>' operation.
     * @see ch.hilbri.assist.model.TaskExecutionInstance#toString()
     * @generated
     */
    EOperation getTaskExecutionInstance__ToString();

    /**
     * Returns the meta object for enum '{@link ch.hilbri.assist.model.DissimilarityAttributes <em>Dissimilarity Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Dissimilarity Attributes</em>'.
     * @see ch.hilbri.assist.model.DissimilarityAttributes
     * @generated
     */
    EEnum getDissimilarityAttributes();

    /**
     * Returns the meta object for enum '{@link ch.hilbri.assist.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Hardware Architecture Level Type</em>'.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @generated
     */
    EEnum getHardwareArchitectureLevelType();

    /**
     * Returns the meta object for enum '{@link ch.hilbri.assist.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Design Assurance Level Type</em>'.
     * @see ch.hilbri.assist.model.DesignAssuranceLevelType
     * @generated
     */
    EEnum getDesignAssuranceLevelType();

    /**
     * Returns the meta object for enum '{@link ch.hilbri.assist.model.PeriodicityType <em>Periodicity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Periodicity Type</em>'.
     * @see ch.hilbri.assist.model.PeriodicityType
     * @generated
     */
    EEnum getPeriodicityType();

    /**
     * Returns the meta object for enum '{@link ch.hilbri.assist.model.Color <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Color</em>'.
     * @see ch.hilbri.assist.model.Color
     * @generated
     */
    EEnum getColor();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>List Of Task Lists</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  ***********************************************
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>List Of Task Lists</em>'.
     * @see org.eclipse.emf.common.util.EList
     * @model instanceClass="org.eclipse.emf.common.util.EList&lt;org.eclipse.emf.common.util.EList&lt;ch.hilbri.assist.model.Task&gt;&gt;"
     * @generated
     */
    EDataType getListOfTaskLists();

    /**
     * Returns the meta object for data type '{@link java.util.HashMap <em>Task2 Core Map Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  **************************************
     * RESULTS - MAPPING
     * **************************************
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>Task2 Core Map Type</em>'.
     * @see java.util.HashMap
     * @model instanceClass="java.util.HashMap&lt;ch.hilbri.assist.model.Task, ch.hilbri.assist.model.Core&gt;"
     * @generated
     */
    EDataType getTask2CoreMapType();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>String List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>String List</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List&lt;java.lang.String&gt;"
     * @generated
     */
    EDataType getStringList();

    /**
     * Returns the meta object for data type '{@link java.util.HashMap <em>Task2 Execution Instances Map Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  **************************************
     * RESULTS - SCHEDULING
     * *************************************
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>Task2 Execution Instances Map Type</em>'.
     * @see java.util.HashMap
     * @model instanceClass="java.util.HashMap&lt;ch.hilbri.assist.model.Task, java.util.List&lt;ch.hilbri.assist.model.TaskExecutionInstance&gt;&gt;"
     * @generated
     */
    EDataType getTask2ExecutionInstancesMapType();

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
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.AssistModelImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAssistModel()
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
         * The meta object literal for the '<em><b>Min Hyp Period Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH = eINSTANCE.getAssistModel_MinHypPeriodLength();

        /**
         * The meta object literal for the '<em><b>Task Switch Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSIST_MODEL__TASK_SWITCH_DELAY = eINSTANCE.getAssistModel_TaskSwitchDelay();

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
         * The meta object literal for the '<em><b>Dislocality Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIST_MODEL__DISLOCALITY_RELATIONS = eINSTANCE.getAssistModel_DislocalityRelations();

        /**
         * The meta object literal for the '<em><b>Colocality Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIST_MODEL__COLOCALITY_RELATIONS = eINSTANCE.getAssistModel_ColocalityRelations();

        /**
         * The meta object literal for the '<em><b>Dissimilarity Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIST_MODEL__DISSIMILARITY_RELATIONS = eINSTANCE.getAssistModel_DissimilarityRelations();

        /**
         * The meta object literal for the '<em><b>Scheduling Restrictions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIST_MODEL__SCHEDULING_RESTRICTIONS = eINSTANCE.getAssistModel_SchedulingRestrictions();

        /**
         * The meta object literal for the '<em><b>Application Alternatives</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIST_MODEL__APPLICATION_ALTERNATIVES = eINSTANCE.getAssistModel_ApplicationAlternatives();

        /**
         * The meta object literal for the '<em><b>Restriction Alternatives</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIST_MODEL__RESTRICTION_ALTERNATIVES = eINSTANCE.getAssistModel_RestrictionAlternatives();

        /**
         * The meta object literal for the '<em><b>Exploration Candidates</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIST_MODEL__EXPLORATION_CANDIDATES = eINSTANCE.getAssistModel_ExplorationCandidates();

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
         * The meta object literal for the '<em><b>Get All Hardware Elements</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS = eINSTANCE.getAssistModel__GetAllHardwareElements();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.PropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.StringPropertyImpl <em>String Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.StringPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getStringProperty()
         * @generated
         */
        EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__VALUE = eINSTANCE.getStringProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.IntPropertyImpl <em>Int Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.IntPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getIntProperty()
         * @generated
         */
        EClass INT_PROPERTY = eINSTANCE.getIntProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INT_PROPERTY__VALUE = eINSTANCE.getIntProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ManufacturerPropertyImpl <em>Manufacturer Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ManufacturerPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getManufacturerProperty()
         * @generated
         */
        EClass MANUFACTURER_PROPERTY = eINSTANCE.getManufacturerProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.PowerSupplyPropertyImpl <em>Power Supply Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.PowerSupplyPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPowerSupplyProperty()
         * @generated
         */
        EClass POWER_SUPPLY_PROPERTY = eINSTANCE.getPowerSupplyProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.BoardTypePropertyImpl <em>Board Type Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.BoardTypePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoardTypeProperty()
         * @generated
         */
        EClass BOARD_TYPE_PROPERTY = eINSTANCE.getBoardTypeProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ProcessorTypePropertyImpl <em>Processor Type Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ProcessorTypePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProcessorTypeProperty()
         * @generated
         */
        EClass PROCESSOR_TYPE_PROPERTY = eINSTANCE.getProcessorTypeProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RAMCapacityPropertyImpl <em>RAM Capacity Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RAMCapacityPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRAMCapacityProperty()
         * @generated
         */
        EClass RAM_CAPACITY_PROPERTY = eINSTANCE.getRAMCapacityProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RAMUtilizationPropertyImpl <em>RAM Utilization Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RAMUtilizationPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRAMUtilizationProperty()
         * @generated
         */
        EClass RAM_UTILIZATION_PROPERTY = eINSTANCE.getRAMUtilizationProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ROMCapacityPropertyImpl <em>ROM Capacity Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ROMCapacityPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getROMCapacityProperty()
         * @generated
         */
        EClass ROM_CAPACITY_PROPERTY = eINSTANCE.getROMCapacityProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ROMUtilizationPropertyImpl <em>ROM Utilization Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ROMUtilizationPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getROMUtilizationProperty()
         * @generated
         */
        EClass ROM_UTILIZATION_PROPERTY = eINSTANCE.getROMUtilizationProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CoreCapacityPropertyImpl <em>Core Capacity Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CoreCapacityPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCoreCapacityProperty()
         * @generated
         */
        EClass CORE_CAPACITY_PROPERTY = eINSTANCE.getCoreCapacityProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CoreUtilizationPropertyImpl <em>Core Utilization Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CoreUtilizationPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCoreUtilizationProperty()
         * @generated
         */
        EClass CORE_UTILIZATION_PROPERTY = eINSTANCE.getCoreUtilizationProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CoreArchitecturePropertyImpl <em>Core Architecture Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CoreArchitecturePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCoreArchitectureProperty()
         * @generated
         */
        EClass CORE_ARCHITECTURE_PROPERTY = eINSTANCE.getCoreArchitectureProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DevelopedByPropertyImpl <em>Developed By Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DevelopedByPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDevelopedByProperty()
         * @generated
         */
        EClass DEVELOPED_BY_PROPERTY = eINSTANCE.getDevelopedByProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DurationPropertyImpl <em>Duration Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DurationPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDurationProperty()
         * @generated
         */
        EClass DURATION_PROPERTY = eINSTANCE.getDurationProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.PeriodPropertyImpl <em>Period Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.PeriodPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPeriodProperty()
         * @generated
         */
        EClass PERIOD_PROPERTY = eINSTANCE.getPeriodProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.EarlyTolerancePropertyImpl <em>Early Tolerance Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.EarlyTolerancePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getEarlyToleranceProperty()
         * @generated
         */
        EClass EARLY_TOLERANCE_PROPERTY = eINSTANCE.getEarlyToleranceProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.LateTolerancePropertyImpl <em>Late Tolerance Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.LateTolerancePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getLateToleranceProperty()
         * @generated
         */
        EClass LATE_TOLERANCE_PROPERTY = eINSTANCE.getLateToleranceProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.MaxStartTimePropertyImpl <em>Max Start Time Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.MaxStartTimePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMaxStartTimeProperty()
         * @generated
         */
        EClass MAX_START_TIME_PROPERTY = eINSTANCE.getMaxStartTimeProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.MaxEndTimePropertyImpl <em>Max End Time Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.MaxEndTimePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMaxEndTimeProperty()
         * @generated
         */
        EClass MAX_END_TIME_PROPERTY = eINSTANCE.getMaxEndTimeProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.AddInitTimePropertyImpl <em>Add Init Time Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.AddInitTimePropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAddInitTimeProperty()
         * @generated
         */
        EClass ADD_INIT_TIME_PROPERTY = eINSTANCE.getAddInitTimeProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.SlicesPropertyImpl <em>Slices Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.SlicesPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSlicesProperty()
         * @generated
         */
        EClass SLICES_PROPERTY = eINSTANCE.getSlicesProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.MinSliceDurationPropertyImpl <em>Min Slice Duration Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.MinSliceDurationPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMinSliceDurationProperty()
         * @generated
         */
        EClass MIN_SLICE_DURATION_PROPERTY = eINSTANCE.getMinSliceDurationProperty();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DesignAssuranceLevelPropertyImpl <em>Design Assurance Level Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DesignAssuranceLevelPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDesignAssuranceLevelProperty()
         * @generated
         */
        EClass DESIGN_ASSURANCE_LEVEL_PROPERTY = eINSTANCE.getDesignAssuranceLevelProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESIGN_ASSURANCE_LEVEL_PROPERTY__VALUE = eINSTANCE.getDesignAssuranceLevelProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CriticalityLevelPropertyImpl <em>Criticality Level Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CriticalityLevelPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCriticalityLevelProperty()
         * @generated
         */
        EClass CRITICALITY_LEVEL_PROPERTY = eINSTANCE.getCriticalityLevelProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CRITICALITY_LEVEL_PROPERTY__VALUE = eINSTANCE.getCriticalityLevelProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.PeriodicityPropertyImpl <em>Periodicity Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.PeriodicityPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPeriodicityProperty()
         * @generated
         */
        EClass PERIODICITY_PROPERTY = eINSTANCE.getPeriodicityProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERIODICITY_PROPERTY__VALUE = eINSTANCE.getPeriodicityProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ColorPropertyImpl <em>Color Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ColorPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getColorProperty()
         * @generated
         */
        EClass COLOR_PROPERTY = eINSTANCE.getColorProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLOR_PROPERTY__VALUE = eINSTANCE.getColorProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CustomPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomProperty()
         * @generated
         */
        EClass CUSTOM_PROPERTY = eINSTANCE.getCustomProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CUSTOM_PROPERTY__NAME = eINSTANCE.getCustomProperty_Name();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CustomIntPropertyImpl <em>Custom Int Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CustomIntPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomIntProperty()
         * @generated
         */
        EClass CUSTOM_INT_PROPERTY = eINSTANCE.getCustomIntProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CUSTOM_INT_PROPERTY__VALUE = eINSTANCE.getCustomIntProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CustomStringPropertyImpl <em>Custom String Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CustomStringPropertyImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomStringProperty()
         * @generated
         */
        EClass CUSTOM_STRING_PROPERTY = eINSTANCE.getCustomStringProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CUSTOM_STRING_PROPERTY__VALUE = eINSTANCE.getCustomStringProperty_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.HardwareElementImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getHardwareElement()
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
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HARDWARE_ELEMENT__PROPERTIES = eINSTANCE.getHardwareElement_Properties();

        /**
         * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HARDWARE_ELEMENT__FEATURES = eINSTANCE.getHardwareElement_Features();

        /**
         * The meta object literal for the '<em><b>Get Hardware Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HARDWARE_ELEMENT__GET_HARDWARE_LEVEL = eINSTANCE.getHardwareElement_GetHardwareLevel();

        /**
         * The meta object literal for the '<em><b>Get Manufacturer</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation HARDWARE_ELEMENT___GET_MANUFACTURER = eINSTANCE.getHardwareElement__GetManufacturer();

        /**
         * The meta object literal for the '<em><b>Set Manufacturer</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation HARDWARE_ELEMENT___SET_MANUFACTURER__STRING = eINSTANCE.getHardwareElement__SetManufacturer__String();

        /**
         * The meta object literal for the '<em><b>Get Custom Properties With Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = eINSTANCE.getHardwareElement__GetCustomPropertiesWithName__String();

        /**
         * The meta object literal for the '<em><b>Get Custom Properties With Name And Value</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = eINSTANCE.getHardwareElement__GetCustomPropertiesWithNameAndValue__String_String();

        /**
         * The meta object literal for the '<em><b>Get Custom String Property</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING = eINSTANCE.getHardwareElement__GetCustomStringProperty__String();

        /**
         * The meta object literal for the '<em><b>Get Custom Int Property</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING = eINSTANCE.getHardwareElement__GetCustomIntProperty__String();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.FeatureImpl <em>Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.FeatureImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getFeature()
         * @generated
         */
        EClass FEATURE = eINSTANCE.getFeature();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

        /**
         * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE__UNITS = eINSTANCE.getFeature_Units();

        /**
         * The meta object literal for the '<em><b>Synchronized Access</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE__SYNCHRONIZED_ACCESS = eINSTANCE.getFeature_SynchronizedAccess();

        /**
         * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE__SHARED = eINSTANCE.getFeature_Shared();

        /**
         * The meta object literal for the '<em><b>Is Exclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE__IS_EXCLUSIVE = eINSTANCE.getFeature_IsExclusive();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CompartmentImpl <em>Compartment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CompartmentImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCompartment()
         * @generated
         */
        EClass COMPARTMENT = eINSTANCE.getCompartment();

        /**
         * The meta object literal for the '<em><b>Boxes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPARTMENT__BOXES = eINSTANCE.getCompartment_Boxes();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPARTMENT__FULL_NAME = eINSTANCE.getCompartment_FullName();

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
         * The meta object literal for the '<em><b>Get Power Supply</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPARTMENT___GET_POWER_SUPPLY = eINSTANCE.getCompartment__GetPowerSupply();

        /**
         * The meta object literal for the '<em><b>Set Power Supply</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPARTMENT___SET_POWER_SUPPLY__STRING = eINSTANCE.getCompartment__SetPowerSupply__String();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.BoxImpl <em>Box</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.BoxImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBox()
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
         * The meta object literal for the '<em><b>Board Alternatives</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOX__BOARD_ALTERNATIVES = eINSTANCE.getBox_BoardAlternatives();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOX__FULL_NAME = eINSTANCE.getBox_FullName();

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
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.BoardAlternativesImpl <em>Board Alternatives</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.BoardAlternativesImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoardAlternatives()
         * @generated
         */
        EClass BOARD_ALTERNATIVES = eINSTANCE.getBoardAlternatives();

        /**
         * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOARD_ALTERNATIVES__ALTERNATIVES = eINSTANCE.getBoardAlternatives_Alternatives();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.BoardAlternativeImpl <em>Board Alternative</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.BoardAlternativeImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoardAlternative()
         * @generated
         */
        EClass BOARD_ALTERNATIVE = eINSTANCE.getBoardAlternative();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOARD_ALTERNATIVE__NAME = eINSTANCE.getBoardAlternative_Name();

        /**
         * The meta object literal for the '<em><b>Boards</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOARD_ALTERNATIVE__BOARDS = eINSTANCE.getBoardAlternative_Boards();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.BoardImpl <em>Board</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.BoardImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBoard()
         * @generated
         */
        EClass BOARD = eINSTANCE.getBoard();

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
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOARD__FULL_NAME = eINSTANCE.getBoard_FullName();

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
         * The meta object literal for the '<em><b>Get Assurance Level</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___GET_ASSURANCE_LEVEL = eINSTANCE.getBoard__GetAssuranceLevel();

        /**
         * The meta object literal for the '<em><b>Set Assurance Level</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___SET_ASSURANCE_LEVEL__DESIGNASSURANCELEVELTYPE = eINSTANCE.getBoard__SetAssuranceLevel__DesignAssuranceLevelType();

        /**
         * The meta object literal for the '<em><b>Get Power Supply</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___GET_POWER_SUPPLY = eINSTANCE.getBoard__GetPowerSupply();

        /**
         * The meta object literal for the '<em><b>Set Power Supply</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___SET_POWER_SUPPLY__STRING = eINSTANCE.getBoard__SetPowerSupply__String();

        /**
         * The meta object literal for the '<em><b>Get Board Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___GET_BOARD_TYPE = eINSTANCE.getBoard__GetBoardType();

        /**
         * The meta object literal for the '<em><b>Set Board Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___SET_BOARD_TYPE__STRING = eINSTANCE.getBoard__SetBoardType__String();

        /**
         * The meta object literal for the '<em><b>Get Ram Capacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___GET_RAM_CAPACITY = eINSTANCE.getBoard__GetRamCapacity();

        /**
         * The meta object literal for the '<em><b>Set Ram Capacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___SET_RAM_CAPACITY__INT = eINSTANCE.getBoard__SetRamCapacity__int();

        /**
         * The meta object literal for the '<em><b>Get Rom Capacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___GET_ROM_CAPACITY = eINSTANCE.getBoard__GetRomCapacity();

        /**
         * The meta object literal for the '<em><b>Set Rom Capacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOARD___SET_ROM_CAPACITY__INT = eINSTANCE.getBoard__SetRomCapacity__int();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ProcessorImpl <em>Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ProcessorImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProcessor()
         * @generated
         */
        EClass PROCESSOR = eINSTANCE.getProcessor();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR__FULL_NAME = eINSTANCE.getProcessor_FullName();

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
         * The meta object literal for the '<em><b>Get Processor Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation PROCESSOR___GET_PROCESSOR_TYPE = eINSTANCE.getProcessor__GetProcessorType();

        /**
         * The meta object literal for the '<em><b>Set Processor Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation PROCESSOR___SET_PROCESSOR_TYPE__STRING = eINSTANCE.getProcessor__SetProcessorType__String();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CoreImpl <em>Core</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CoreImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCore()
         * @generated
         */
        EClass CORE = eINSTANCE.getCore();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CORE__FULL_NAME = eINSTANCE.getCore_FullName();

        /**
         * The meta object literal for the '<em><b>Processor</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE__PROCESSOR = eINSTANCE.getCore_Processor();

        /**
         * The meta object literal for the '<em><b>Get Core Capacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CORE___GET_CORE_CAPACITY = eINSTANCE.getCore__GetCoreCapacity();

        /**
         * The meta object literal for the '<em><b>Set Core Capacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CORE___SET_CORE_CAPACITY__INT = eINSTANCE.getCore__SetCoreCapacity__int();

        /**
         * The meta object literal for the '<em><b>Get Core Architecture</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CORE___GET_CORE_ARCHITECTURE = eINSTANCE.getCore__GetCoreArchitecture();

        /**
         * The meta object literal for the '<em><b>Set Core Architecture</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CORE___SET_CORE_ARCHITECTURE__STRING = eINSTANCE.getCore__SetCoreArchitecture__String();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ApplicationAlternativesImpl <em>Application Alternatives</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ApplicationAlternativesImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplicationAlternatives()
         * @generated
         */
        EClass APPLICATION_ALTERNATIVES = eINSTANCE.getApplicationAlternatives();

        /**
         * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION_ALTERNATIVES__ALTERNATIVES = eINSTANCE.getApplicationAlternatives_Alternatives();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ApplicationAlternativeImpl <em>Application Alternative</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ApplicationAlternativeImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplicationAlternative()
         * @generated
         */
        EClass APPLICATION_ALTERNATIVE = eINSTANCE.getApplicationAlternative();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION_ALTERNATIVE__NAME = eINSTANCE.getApplicationAlternative_Name();

        /**
         * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION_ALTERNATIVE__APPLICATIONS = eINSTANCE.getApplicationAlternative_Applications();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.SoftwareElementImpl <em>Software Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.SoftwareElementImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSoftwareElement()
         * @generated
         */
        EClass SOFTWARE_ELEMENT = eINSTANCE.getSoftwareElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOFTWARE_ELEMENT__NAME = eINSTANCE.getSoftwareElement_Name();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOFTWARE_ELEMENT__PROPERTIES = eINSTANCE.getSoftwareElement_Properties();

        /**
         * The meta object literal for the '<em><b>To String</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SOFTWARE_ELEMENT___TO_STRING = eINSTANCE.getSoftwareElement__ToString();

        /**
         * The meta object literal for the '<em><b>Get Custom Properties With Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING = eINSTANCE.getSoftwareElement__GetCustomPropertiesWithName__String();

        /**
         * The meta object literal for the '<em><b>Get Custom Properties With Name And Value</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING = eINSTANCE.getSoftwareElement__GetCustomPropertiesWithNameAndValue__String_String();

        /**
         * The meta object literal for the '<em><b>Get Custom String Property</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SOFTWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING = eINSTANCE.getSoftwareElement__GetCustomStringProperty__String();

        /**
         * The meta object literal for the '<em><b>Get Custom Int Property</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SOFTWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING = eINSTANCE.getSoftwareElement__GetCustomIntProperty__String();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ApplicationImpl <em>Application</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ApplicationImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplication()
         * @generated
         */
        EClass APPLICATION = eINSTANCE.getApplication();

        /**
         * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION__TASKS = eINSTANCE.getApplication_Tasks();

        /**
         * The meta object literal for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = eINSTANCE.getApplication_RestrictMappingToHardwareElements();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION__FULL_NAME = eINSTANCE.getApplication_FullName();

        /**
         * The meta object literal for the '<em><b>Get Developed By</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation APPLICATION___GET_DEVELOPED_BY = eINSTANCE.getApplication__GetDevelopedBy();

        /**
         * The meta object literal for the '<em><b>Set Developed By</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation APPLICATION___SET_DEVELOPED_BY__STRING = eINSTANCE.getApplication__SetDevelopedBy__String();

        /**
         * The meta object literal for the '<em><b>Get Criticality Level</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation APPLICATION___GET_CRITICALITY_LEVEL = eINSTANCE.getApplication__GetCriticalityLevel();

        /**
         * The meta object literal for the '<em><b>Set Criticality Level</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation APPLICATION___SET_CRITICALITY_LEVEL__DESIGNASSURANCELEVELTYPE = eINSTANCE.getApplication__SetCriticalityLevel__DesignAssuranceLevelType();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.TaskImpl <em>Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.TaskImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask()
         * @generated
         */
        EClass TASK = eINSTANCE.getTask();

        /**
         * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK__APPLICATION = eINSTANCE.getTask_Application();

        /**
         * The meta object literal for the '<em><b>Feature Requirements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK__FEATURE_REQUIREMENTS = eINSTANCE.getTask_FeatureRequirements();

        /**
         * The meta object literal for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = eINSTANCE.getTask_RestrictMappingToHardwareElements();

        /**
         * The meta object literal for the '<em><b>Assigned Core</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK__ASSIGNED_CORE = eINSTANCE.getTask_AssignedCore();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__FULL_NAME = eINSTANCE.getTask_FullName();

        /**
         * The meta object literal for the '<em><b>Get Core Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_CORE_UTILIZATION = eINSTANCE.getTask__GetCoreUtilization();

        /**
         * The meta object literal for the '<em><b>Set Core Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_CORE_UTILIZATION__INT = eINSTANCE.getTask__SetCoreUtilization__int();

        /**
         * The meta object literal for the '<em><b>Get Ram Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_RAM_UTILIZATION = eINSTANCE.getTask__GetRamUtilization();

        /**
         * The meta object literal for the '<em><b>Set Ram Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_RAM_UTILIZATION__INT = eINSTANCE.getTask__SetRamUtilization__int();

        /**
         * The meta object literal for the '<em><b>Get Rom Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_ROM_UTILIZATION = eINSTANCE.getTask__GetRomUtilization();

        /**
         * The meta object literal for the '<em><b>Set Rom Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_ROM_UTILIZATION__INT = eINSTANCE.getTask__SetRomUtilization__int();

        /**
         * The meta object literal for the '<em><b>Get Duration</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_DURATION = eINSTANCE.getTask__GetDuration();

        /**
         * The meta object literal for the '<em><b>Set Duration</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_DURATION__INT = eINSTANCE.getTask__SetDuration__int();

        /**
         * The meta object literal for the '<em><b>Get Period</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_PERIOD = eINSTANCE.getTask__GetPeriod();

        /**
         * The meta object literal for the '<em><b>Set Period</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_PERIOD__INT = eINSTANCE.getTask__SetPeriod__int();

        /**
         * The meta object literal for the '<em><b>Get Early Tolerance</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_EARLY_TOLERANCE = eINSTANCE.getTask__GetEarlyTolerance();

        /**
         * The meta object literal for the '<em><b>Set Early Tolerance</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_EARLY_TOLERANCE__INT = eINSTANCE.getTask__SetEarlyTolerance__int();

        /**
         * The meta object literal for the '<em><b>Get Late Tolerance</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_LATE_TOLERANCE = eINSTANCE.getTask__GetLateTolerance();

        /**
         * The meta object literal for the '<em><b>Set Late Tolerance</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_LATE_TOLERANCE__INT = eINSTANCE.getTask__SetLateTolerance__int();

        /**
         * The meta object literal for the '<em><b>Get Max Start Time</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_MAX_START_TIME = eINSTANCE.getTask__GetMaxStartTime();

        /**
         * The meta object literal for the '<em><b>Set Max Start Time</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_MAX_START_TIME__INT = eINSTANCE.getTask__SetMaxStartTime__int();

        /**
         * The meta object literal for the '<em><b>Get Max End Time</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_MAX_END_TIME = eINSTANCE.getTask__GetMaxEndTime();

        /**
         * The meta object literal for the '<em><b>Set Max End Time</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_MAX_END_TIME__INT = eINSTANCE.getTask__SetMaxEndTime__int();

        /**
         * The meta object literal for the '<em><b>Get Add Init Time</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_ADD_INIT_TIME = eINSTANCE.getTask__GetAddInitTime();

        /**
         * The meta object literal for the '<em><b>Set Add Init Time</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_ADD_INIT_TIME__INT = eINSTANCE.getTask__SetAddInitTime__int();

        /**
         * The meta object literal for the '<em><b>Get Slices</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_SLICES = eINSTANCE.getTask__GetSlices();

        /**
         * The meta object literal for the '<em><b>Set Slices</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_SLICES__INT = eINSTANCE.getTask__SetSlices__int();

        /**
         * The meta object literal for the '<em><b>Get Min Slice Duration</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_MIN_SLICE_DURATION = eINSTANCE.getTask__GetMinSliceDuration();

        /**
         * The meta object literal for the '<em><b>Set Min Slice Duration</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_MIN_SLICE_DURATION__INT = eINSTANCE.getTask__SetMinSliceDuration__int();

        /**
         * The meta object literal for the '<em><b>Get Periodicity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_PERIODICITY = eINSTANCE.getTask__GetPeriodicity();

        /**
         * The meta object literal for the '<em><b>Set Periodicity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_PERIODICITY__PERIODICITYTYPE = eINSTANCE.getTask__SetPeriodicity__PeriodicityType();

        /**
         * The meta object literal for the '<em><b>Get Color</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___GET_COLOR = eINSTANCE.getTask__GetColor();

        /**
         * The meta object literal for the '<em><b>Set Color</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK___SET_COLOR__COLOR = eINSTANCE.getTask__SetColor__Color();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl <em>Feature Requirement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.FeatureRequirementImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getFeatureRequirement()
         * @generated
         */
        EClass FEATURE_REQUIREMENT = eINSTANCE.getFeatureRequirement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE_REQUIREMENT__NAME = eINSTANCE.getFeatureRequirement_Name();

        /**
         * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE_REQUIREMENT__HARDWARE_LEVEL = eINSTANCE.getFeatureRequirement_HardwareLevel();

        /**
         * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE_REQUIREMENT__UNITS = eINSTANCE.getFeatureRequirement_Units();

        /**
         * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE_REQUIREMENT__SHARED = eINSTANCE.getFeatureRequirement_Shared();

        /**
         * The meta object literal for the '<em><b>Is Exclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE_REQUIREMENT__IS_EXCLUSIVE = eINSTANCE.getFeatureRequirement_IsExclusive();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.MappingRelationImpl <em>Mapping Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.MappingRelationImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMappingRelation()
         * @generated
         */
        EClass MAPPING_RELATION = eINSTANCE.getMappingRelation();

        /**
         * The meta object literal for the '<em><b>Software Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAPPING_RELATION__SOFTWARE_ELEMENTS = eINSTANCE.getMappingRelation_SoftwareElements();

        /**
         * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RELATION__HARDWARE_LEVEL = eINSTANCE.getMappingRelation_HardwareLevel();

        /**
         * The meta object literal for the '<em><b>All Tasks</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RELATION__ALL_TASKS = eINSTANCE.getMappingRelation_AllTasks();

        /**
         * The meta object literal for the '<em><b>Software Element Names</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES = eINSTANCE.getMappingRelation_SoftwareElementNames();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DislocalityRelationImpl <em>Dislocality Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DislocalityRelationImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDislocalityRelation()
         * @generated
         */
        EClass DISLOCALITY_RELATION = eINSTANCE.getDislocalityRelation();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ColocalityRelationImpl <em>Colocality Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ColocalityRelationImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getColocalityRelation()
         * @generated
         */
        EClass COLOCALITY_RELATION = eINSTANCE.getColocalityRelation();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DissimilarityRelationImpl <em>Dissimilarity Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DissimilarityRelationImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityRelation()
         * @generated
         */
        EClass DISSIMILARITY_RELATION = eINSTANCE.getDissimilarityRelation();

        /**
         * The meta object literal for the '<em><b>Dissimilarity Clause</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE = eINSTANCE.getDissimilarityRelation_DissimilarityClause();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DissimilarityClauseImpl <em>Dissimilarity Clause</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DissimilarityClauseImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityClause()
         * @generated
         */
        EClass DISSIMILARITY_CLAUSE = eINSTANCE.getDissimilarityClause();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DissimilarityDisjunctionImpl <em>Dissimilarity Disjunction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DissimilarityDisjunctionImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityDisjunction()
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
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DissimilarityConjunctionImpl <em>Dissimilarity Conjunction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DissimilarityConjunctionImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityConjunction()
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
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.DissimilarityEntryImpl <em>Dissimilarity Entry</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.DissimilarityEntryImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityEntry()
         * @generated
         */
        EClass DISSIMILARITY_ENTRY = eINSTANCE.getDissimilarityEntry();

        /**
         * The meta object literal for the '<em><b>Dissimilarity Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE = eINSTANCE.getDissimilarityEntry_DissimilarityAttribute();

        /**
         * The meta object literal for the '<em><b>Hardware Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISSIMILARITY_ENTRY__HARDWARE_LEVEL = eINSTANCE.getDissimilarityEntry_HardwareLevel();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.SchedulingRestrictionImpl <em>Scheduling Restriction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.SchedulingRestrictionImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSchedulingRestriction()
         * @generated
         */
        EClass SCHEDULING_RESTRICTION = eINSTANCE.getSchedulingRestriction();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.SimpleRelationImpl <em>Simple Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.SimpleRelationImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSimpleRelation()
         * @generated
         */
        EClass SIMPLE_RELATION = eINSTANCE.getSimpleRelation();

        /**
         * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_RELATION__TASKS = eINSTANCE.getSimpleRelation_Tasks();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ComplexRelationImpl <em>Complex Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ComplexRelationImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getComplexRelation()
         * @generated
         */
        EClass COMPLEX_RELATION = eINSTANCE.getComplexRelation();

        /**
         * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_RELATION__TASKS = eINSTANCE.getComplexRelation_Tasks();

        /**
         * The meta object literal for the '<em><b>Other Task</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_RELATION__OTHER_TASK = eINSTANCE.getComplexRelation_OtherTask();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_RELATION__DELAY = eINSTANCE.getComplexRelation_Delay();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RestrictionStartAtTheSameTimeImpl <em>Restriction Start At The Same Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RestrictionStartAtTheSameTimeImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionStartAtTheSameTime()
         * @generated
         */
        EClass RESTRICTION_START_AT_THE_SAME_TIME = eINSTANCE.getRestrictionStartAtTheSameTime();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RestrictionFinishAtTheSameTimeImpl <em>Restriction Finish At The Same Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RestrictionFinishAtTheSameTimeImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionFinishAtTheSameTime()
         * @generated
         */
        EClass RESTRICTION_FINISH_AT_THE_SAME_TIME = eINSTANCE.getRestrictionFinishAtTheSameTime();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RestrictionStartAfterOtherFinishedImpl <em>Restriction Start After Other Finished</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RestrictionStartAfterOtherFinishedImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionStartAfterOtherFinished()
         * @generated
         */
        EClass RESTRICTION_START_AFTER_OTHER_FINISHED = eINSTANCE.getRestrictionStartAfterOtherFinished();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RestrictionStartAfterOtherStartedImpl <em>Restriction Start After Other Started</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RestrictionStartAfterOtherStartedImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionStartAfterOtherStarted()
         * @generated
         */
        EClass RESTRICTION_START_AFTER_OTHER_STARTED = eINSTANCE.getRestrictionStartAfterOtherStarted();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RestrictionDisjointExecutionImpl <em>Restriction Disjoint Execution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RestrictionDisjointExecutionImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionDisjointExecution()
         * @generated
         */
        EClass RESTRICTION_DISJOINT_EXECUTION = eINSTANCE.getRestrictionDisjointExecution();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RestrictionAlternativesImpl <em>Restriction Alternatives</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RestrictionAlternativesImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionAlternatives()
         * @generated
         */
        EClass RESTRICTION_ALTERNATIVES = eINSTANCE.getRestrictionAlternatives();

        /**
         * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_ALTERNATIVES__ALTERNATIVES = eINSTANCE.getRestrictionAlternatives_Alternatives();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.RestrictionAlternativeImpl <em>Restriction Alternative</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.RestrictionAlternativeImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionAlternative()
         * @generated
         */
        EClass RESTRICTION_ALTERNATIVE = eINSTANCE.getRestrictionAlternative();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_ALTERNATIVE__NAME = eINSTANCE.getRestrictionAlternative_Name();

        /**
         * The meta object literal for the '<em><b>Dislocality Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS = eINSTANCE.getRestrictionAlternative_DislocalityRelations();

        /**
         * The meta object literal for the '<em><b>Colocality Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS = eINSTANCE.getRestrictionAlternative_ColocalityRelations();

        /**
         * The meta object literal for the '<em><b>Dissimilarity Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_ALTERNATIVE__DISSIMILARITY_RELATIONS = eINSTANCE.getRestrictionAlternative_DissimilarityRelations();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ExplorationCandidateImpl <em>Exploration Candidate</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ExplorationCandidateImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getExplorationCandidate()
         * @generated
         */
        EClass EXPLORATION_CANDIDATE = eINSTANCE.getExplorationCandidate();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPLORATION_CANDIDATE__NAME = eINSTANCE.getExplorationCandidate_Name();

        /**
         * The meta object literal for the '<em><b>Board Alternatives</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES = eINSTANCE.getExplorationCandidate_BoardAlternatives();

        /**
         * The meta object literal for the '<em><b>Application Alternatives</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES = eINSTANCE.getExplorationCandidate_ApplicationAlternatives();

        /**
         * The meta object literal for the '<em><b>Restriction Alternatives</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES = eINSTANCE.getExplorationCandidate_RestrictionAlternatives();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ExplorationResultImpl <em>Exploration Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ExplorationResultImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getExplorationResult()
         * @generated
         */
        EClass EXPLORATION_RESULT = eINSTANCE.getExplorationResult();

        /**
         * The meta object literal for the '<em><b>Candidate</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPLORATION_RESULT__CANDIDATE = eINSTANCE.getExplorationResult_Candidate();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPLORATION_RESULT__MODEL = eINSTANCE.getExplorationResult_Model();

        /**
         * The meta object literal for the '<em><b>Mapping Result</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPLORATION_RESULT__MAPPING_RESULT = eINSTANCE.getExplorationResult_MappingResult();

        /**
         * The meta object literal for the '<em><b>Feasible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPLORATION_RESULT__FEASIBLE = eINSTANCE.getExplorationResult_Feasible();

        /**
         * The meta object literal for the '<em><b>Absolute Score</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPLORATION_RESULT__ABSOLUTE_SCORE = eINSTANCE.getExplorationResult_AbsoluteScore();

        /**
         * The meta object literal for the '<em><b>Scaled Score</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPLORATION_RESULT__SCALED_SCORE = eINSTANCE.getExplorationResult_ScaledScore();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.AbstractDSEMetricImpl <em>Abstract DSE Metric</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.AbstractDSEMetricImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAbstractDSEMetric()
         * @generated
         */
        EClass ABSTRACT_DSE_METRIC = eINSTANCE.getAbstractDSEMetric();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DSE_METRIC__NAME = eINSTANCE.getAbstractDSEMetric_Name();

        /**
         * The meta object literal for the '<em><b>Built In</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DSE_METRIC__BUILT_IN = eINSTANCE.getAbstractDSEMetric_BuiltIn();

        /**
         * The meta object literal for the '<em><b>Higher Score Is Better</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DSE_METRIC__HIGHER_SCORE_IS_BETTER = eINSTANCE.getAbstractDSEMetric_HigherScoreIsBetter();

        /**
         * The meta object literal for the '<em><b>Compute Absolute Score</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ABSTRACT_DSE_METRIC___COMPUTE_ABSOLUTE_SCORE__EXPLORATIONRESULT = eINSTANCE.getAbstractDSEMetric__ComputeAbsoluteScore__ExplorationResult();

        /**
         * The meta object literal for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Comparable
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getComparable()
         * @generated
         */
        EClass COMPARABLE = eINSTANCE.getComparable();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.MetricScorePairImpl <em>Metric Score Pair</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.MetricScorePairImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMetricScorePair()
         * @generated
         */
        EClass METRIC_SCORE_PAIR = eINSTANCE.getMetricScorePair();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference METRIC_SCORE_PAIR__KEY = eINSTANCE.getMetricScorePair_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METRIC_SCORE_PAIR__VALUE = eINSTANCE.getMetricScorePair_Value();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.MappingResultImpl <em>Mapping Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.MappingResultImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getMappingResult()
         * @generated
         */
        EClass MAPPING_RESULT = eINSTANCE.getMappingResult();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RESULT__NAME = eINSTANCE.getMappingResult_Name();

        /**
         * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RESULT__INDEX = eINSTANCE.getMappingResult_Index();

        /**
         * The meta object literal for the '<em><b>Task2 Core Map</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RESULT__TASK2_CORE_MAP = eINSTANCE.getMappingResult_Task2CoreMap();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAPPING_RESULT__MODEL = eINSTANCE.getMappingResult_Model();

        /**
         * The meta object literal for the '<em><b>Metric Absolute Scores Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP = eINSTANCE.getMappingResult_MetricAbsoluteScoresMap();

        /**
         * The meta object literal for the '<em><b>Metric Scaled Scores Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAPPING_RESULT__METRIC_SCALED_SCORES_MAP = eINSTANCE.getMappingResult_MetricScaledScoresMap();

        /**
         * The meta object literal for the '<em><b>Partial Solution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RESULT__PARTIAL_SOLUTION = eINSTANCE.getMappingResult_PartialSolution();

        /**
         * The meta object literal for the '<em><b>Absolute Total Score</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE = eINSTANCE.getMappingResult_AbsoluteTotalScore();

        /**
         * The meta object literal for the '<em><b>Scaled Total Score</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_RESULT__SCALED_TOTAL_SCORE = eINSTANCE.getMappingResult_ScaledTotalScore();

        /**
         * The meta object literal for the '<em><b>Is Used</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___IS_USED__CORE = eINSTANCE.getMappingResult__IsUsed__Core();

        /**
         * The meta object literal for the '<em><b>Is Used</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___IS_USED__PROCESSOR = eINSTANCE.getMappingResult__IsUsed__Processor();

        /**
         * The meta object literal for the '<em><b>Is Used</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___IS_USED__BOARD = eINSTANCE.getMappingResult__IsUsed__Board();

        /**
         * The meta object literal for the '<em><b>Is Used</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___IS_USED__BOX = eINSTANCE.getMappingResult__IsUsed__Box();

        /**
         * The meta object literal for the '<em><b>Is Used</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___IS_USED__COMPARTMENT = eINSTANCE.getMappingResult__IsUsed__Compartment();

        /**
         * The meta object literal for the '<em><b>Get Mapped Tasks For Core</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE = eINSTANCE.getMappingResult__GetMappedTasksForCore__Core();

        /**
         * The meta object literal for the '<em><b>Get Absolute Core Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE = eINSTANCE.getMappingResult__GetAbsoluteCoreUtilization__Core();

        /**
         * The meta object literal for the '<em><b>Get Relative Core Utilization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE = eINSTANCE.getMappingResult__GetRelativeCoreUtilization__Core();

        /**
         * The meta object literal for the '<em><b>Get Hardware Element For Task</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__TASK_INT = eINSTANCE.getMappingResult__GetHardwareElementForTask__Task_int();

        /**
         * The meta object literal for the '<em><b>Get Mapping Elements</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___GET_MAPPING_ELEMENTS = eINSTANCE.getMappingResult__GetMappingElements();

        /**
         * The meta object literal for the '<em><b>Compare To</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___COMPARE_TO__MAPPINGRESULT = eINSTANCE.getMappingResult__CompareTo__MappingResult();

        /**
         * The meta object literal for the '<em><b>To String</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MAPPING_RESULT___TO_STRING = eINSTANCE.getMappingResult__ToString();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl <em>Single Mapping Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.SingleMappingElementImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSingleMappingElement()
         * @generated
         */
        EClass SINGLE_MAPPING_ELEMENT = eINSTANCE.getSingleMappingElement();

        /**
         * The meta object literal for the '<em><b>Application</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MAPPING_ELEMENT__APPLICATION = eINSTANCE.getSingleMappingElement_Application();

        /**
         * The meta object literal for the '<em><b>Task</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MAPPING_ELEMENT__TASK = eINSTANCE.getSingleMappingElement_Task();

        /**
         * The meta object literal for the '<em><b>Core</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MAPPING_ELEMENT__CORE = eINSTANCE.getSingleMappingElement_Core();

        /**
         * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MAPPING_ELEMENT__PROCESSOR = eINSTANCE.getSingleMappingElement_Processor();

        /**
         * The meta object literal for the '<em><b>Board</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MAPPING_ELEMENT__BOARD = eINSTANCE.getSingleMappingElement_Board();

        /**
         * The meta object literal for the '<em><b>Box</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MAPPING_ELEMENT__BOX = eINSTANCE.getSingleMappingElement_Box();

        /**
         * The meta object literal for the '<em><b>Compartment</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MAPPING_ELEMENT__COMPARTMENT = eINSTANCE.getSingleMappingElement_Compartment();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.AbstractMappingMetricImpl <em>Abstract Mapping Metric</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.AbstractMappingMetricImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getAbstractMappingMetric()
         * @generated
         */
        EClass ABSTRACT_MAPPING_METRIC = eINSTANCE.getAbstractMappingMetric();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_MAPPING_METRIC__NAME = eINSTANCE.getAbstractMappingMetric_Name();

        /**
         * The meta object literal for the '<em><b>Built In</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_MAPPING_METRIC__BUILT_IN = eINSTANCE.getAbstractMappingMetric_BuiltIn();

        /**
         * The meta object literal for the '<em><b>Higher Score Is Better</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_MAPPING_METRIC__HIGHER_SCORE_IS_BETTER = eINSTANCE.getAbstractMappingMetric_HigherScoreIsBetter();

        /**
         * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_MAPPING_METRIC__WEIGHT = eINSTANCE.getAbstractMappingMetric_Weight();

        /**
         * The meta object literal for the '<em><b>Compute Absolute Score</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ABSTRACT_MAPPING_METRIC___COMPUTE_ABSOLUTE_SCORE__MAPPINGRESULT = eINSTANCE.getAbstractMappingMetric__ComputeAbsoluteScore__MappingResult();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.SchedulingResultImpl <em>Scheduling Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.SchedulingResultImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getSchedulingResult()
         * @generated
         */
        EClass SCHEDULING_RESULT = eINSTANCE.getSchedulingResult();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULING_RESULT__NAME = eINSTANCE.getSchedulingResult_Name();

        /**
         * The meta object literal for the '<em><b>Hyper Period Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULING_RESULT__HYPER_PERIOD_LENGTH = eINSTANCE.getSchedulingResult_HyperPeriodLength();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULING_RESULT__MODEL = eINSTANCE.getSchedulingResult_Model();

        /**
         * The meta object literal for the '<em><b>Schedule</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULING_RESULT__SCHEDULE = eINSTANCE.getSchedulingResult_Schedule();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.TaskExecutionInstanceImpl <em>Task Execution Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.TaskExecutionInstanceImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTaskExecutionInstance()
         * @generated
         */
        EClass TASK_EXECUTION_INSTANCE = eINSTANCE.getTaskExecutionInstance();

        /**
         * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK_EXECUTION_INSTANCE__BEGIN = eINSTANCE.getTaskExecutionInstance_Begin();

        /**
         * The meta object literal for the '<em><b>End</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK_EXECUTION_INSTANCE__END = eINSTANCE.getTaskExecutionInstance_End();

        /**
         * The meta object literal for the '<em><b>To String</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TASK_EXECUTION_INSTANCE___TO_STRING = eINSTANCE.getTaskExecutionInstance__ToString();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.DissimilarityAttributes <em>Dissimilarity Attributes</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.DissimilarityAttributes
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDissimilarityAttributes()
         * @generated
         */
        EEnum DISSIMILARITY_ATTRIBUTES = eINSTANCE.getDissimilarityAttributes();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
         * @generated
         */
        EEnum HARDWARE_ARCHITECTURE_LEVEL_TYPE = eINSTANCE.getHardwareArchitectureLevelType();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.DesignAssuranceLevelType
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDesignAssuranceLevelType()
         * @generated
         */
        EEnum DESIGN_ASSURANCE_LEVEL_TYPE = eINSTANCE.getDesignAssuranceLevelType();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.PeriodicityType <em>Periodicity Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.PeriodicityType
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPeriodicityType()
         * @generated
         */
        EEnum PERIODICITY_TYPE = eINSTANCE.getPeriodicityType();

        /**
         * The meta object literal for the '{@link ch.hilbri.assist.model.Color <em>Color</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.Color
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getColor()
         * @generated
         */
        EEnum COLOR = eINSTANCE.getColor();

        /**
         * The meta object literal for the '<em>List Of Task Lists</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.EList
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getListOfTaskLists()
         * @generated
         */
        EDataType LIST_OF_TASK_LISTS = eINSTANCE.getListOfTaskLists();

        /**
         * The meta object literal for the '<em>Task2 Core Map Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.HashMap
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask2CoreMapType()
         * @generated
         */
        EDataType TASK2_CORE_MAP_TYPE = eINSTANCE.getTask2CoreMapType();

        /**
         * The meta object literal for the '<em>String List</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getStringList()
         * @generated
         */
        EDataType STRING_LIST = eINSTANCE.getStringList();

        /**
         * The meta object literal for the '<em>Task2 Execution Instances Map Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.HashMap
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask2ExecutionInstancesMapType()
         * @generated
         */
        EDataType TASK2_EXECUTION_INSTANCES_MAP_TYPE = eINSTANCE.getTask2ExecutionInstancesMapType();

    }

} //ModelPackage
