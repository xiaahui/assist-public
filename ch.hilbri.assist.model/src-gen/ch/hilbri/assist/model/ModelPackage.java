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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ManufacturerPropertyImpl <em>Manufacturer Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ManufacturerPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getManufacturerProperty()
     * @generated
     */
    int MANUFACTURER_PROPERTY = 3;

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
    int POWER_SUPPLY_PROPERTY = 4;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.HardwareElementImpl <em>Hardware Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.HardwareElementImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getHardwareElement()
     * @generated
     */
    int HARDWARE_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__FEATURES = 1;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__CUSTOM_PROPERTIES = 2;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__PROPERTIES = 3;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT__GET_HARDWARE_LEVEL = 4;

    /**
     * The number of structural features of the '<em>Hardware Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT_FEATURE_COUNT = 5;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT___GET_MANUFACTURER = 0;

    /**
     * The number of operations of the '<em>Hardware Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HARDWARE_ELEMENT_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.FeatureImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getFeature()
     * @generated
     */
    int FEATURE = 6;

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
    int COMPARTMENT = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__CUSTOM_PROPERTIES = HARDWARE_ELEMENT__CUSTOM_PROPERTIES;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

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
     * The number of operations of the '<em>Compartment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 5;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.BoxImpl <em>Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.BoxImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getBox()
     * @generated
     */
    int BOX = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__CUSTOM_PROPERTIES = HARDWARE_ELEMENT__CUSTOM_PROPERTIES;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOX__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

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
    int BOARD_ALTERNATIVES = 9;

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
    int BOARD_ALTERNATIVE = 10;

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
    int BOARD = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__CUSTOM_PROPERTIES = HARDWARE_ELEMENT__CUSTOM_PROPERTIES;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

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
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Board</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOARD___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ProcessorImpl <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ProcessorImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProcessor()
     * @generated
     */
    int PROCESSOR = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__CUSTOM_PROPERTIES = HARDWARE_ELEMENT__CUSTOM_PROPERTIES;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

    /**
     * The feature id for the '<em><b>Processor Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__PROCESSOR_TYPE = HARDWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 1;

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
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CoreImpl <em>Core</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CoreImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCore()
     * @generated
     */
    int CORE = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__NAME = HARDWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__FEATURES = HARDWARE_ELEMENT__FEATURES;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__CUSTOM_PROPERTIES = HARDWARE_ELEMENT__CUSTOM_PROPERTIES;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__PROPERTIES = HARDWARE_ELEMENT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Get Hardware Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__GET_HARDWARE_LEVEL = HARDWARE_ELEMENT__GET_HARDWARE_LEVEL;

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
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__FULL_NAME = HARDWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Processor</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE__PROCESSOR = HARDWARE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Core</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_COUNT = HARDWARE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Manufacturer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE___GET_MANUFACTURER = HARDWARE_ELEMENT___GET_MANUFACTURER;

    /**
     * The number of operations of the '<em>Core</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_OPERATION_COUNT = HARDWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ApplicationAlternativesImpl <em>Application Alternatives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ApplicationAlternativesImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplicationAlternatives()
     * @generated
     */
    int APPLICATION_ALTERNATIVES = 14;

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
    int APPLICATION_ALTERNATIVE = 15;

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
    int SOFTWARE_ELEMENT = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT__NAME = 0;

    /**
     * The number of structural features of the '<em>Software Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT___TO_STRING = 0;

    /**
     * The number of operations of the '<em>Software Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ELEMENT_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.ApplicationImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getApplication()
     * @generated
     */
    int APPLICATION = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__NAME = SOFTWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Developed By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__DEVELOPED_BY = SOFTWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Criticality Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__CRITICALITY_LEVEL = SOFTWARE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__TASKS = SOFTWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__CUSTOM_PROPERTIES = SOFTWARE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = SOFTWARE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__FULL_NAME = SOFTWARE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_FEATURE_COUNT = SOFTWARE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___TO_STRING = SOFTWARE_ELEMENT___TO_STRING;

    /**
     * The number of operations of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_OPERATION_COUNT = SOFTWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.TaskImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask()
     * @generated
     */
    int TASK = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__NAME = SOFTWARE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Core Utilization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__CORE_UTILIZATION = SOFTWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ram Utilization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__RAM_UTILIZATION = SOFTWARE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Rom Utilization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ROM_UTILIZATION = SOFTWARE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DURATION = SOFTWARE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__PERIOD = SOFTWARE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Early Tolerance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__EARLY_TOLERANCE = SOFTWARE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Late Tolerance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__LATE_TOLERANCE = SOFTWARE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Max Start Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__MAX_START_TIME = SOFTWARE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Max End Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__MAX_END_TIME = SOFTWARE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Add Init Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ADD_INIT_TIME = SOFTWARE_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Slices</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__SLICES = SOFTWARE_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Min Slice Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__MIN_SLICE_DURATION = SOFTWARE_ELEMENT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Periodicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__PERIODICITY = SOFTWARE_ELEMENT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__COLOR = SOFTWARE_ELEMENT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Application</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__APPLICATION = SOFTWARE_ELEMENT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Feature Requirements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__FEATURE_REQUIREMENTS = SOFTWARE_ELEMENT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__CUSTOM_PROPERTIES = SOFTWARE_ELEMENT_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS = SOFTWARE_ELEMENT_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Assigned Core</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ASSIGNED_CORE = SOFTWARE_ELEMENT_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__FULL_NAME = SOFTWARE_ELEMENT_FEATURE_COUNT + 19;

    /**
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_FEATURE_COUNT = SOFTWARE_ELEMENT_FEATURE_COUNT + 20;

    /**
     * The operation id for the '<em>To String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK___TO_STRING = SOFTWARE_ELEMENT___TO_STRING;

    /**
     * The number of operations of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_OPERATION_COUNT = SOFTWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl <em>Feature Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.FeatureRequirementImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getFeatureRequirement()
     * @generated
     */
    int FEATURE_REQUIREMENT = 19;

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
    int MAPPING_RELATION = 20;

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
    int DISLOCALITY_RELATION = 21;

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
    int COLOCALITY_RELATION = 22;

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
    int DISSIMILARITY_RELATION = 23;

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
    int DISSIMILARITY_CLAUSE = 24;

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
    int DISSIMILARITY_DISJUNCTION = 25;

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
    int DISSIMILARITY_CONJUNCTION = 26;

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
    int DISSIMILARITY_ENTRY = 27;

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
    int SCHEDULING_RESTRICTION = 28;

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
    int SIMPLE_RELATION = 29;

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
    int COMPLEX_RELATION = 30;

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
    int RESTRICTION_START_AT_THE_SAME_TIME = 31;

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
    int RESTRICTION_FINISH_AT_THE_SAME_TIME = 32;

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
    int RESTRICTION_START_AFTER_OTHER_FINISHED = 33;

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
    int RESTRICTION_START_AFTER_OTHER_STARTED = 34;

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
    int RESTRICTION_DISJOINT_EXECUTION = 35;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CustomPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomProperty()
     * @generated
     */
    int CUSTOM_PROPERTY = 36;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY__NAME = 0;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY__STRING_VALUE = 1;

    /**
     * The feature id for the '<em><b>Int Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY__INT_VALUE = 2;

    /**
     * The number of structural features of the '<em>Custom Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Custom Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.CustomIntPropertyImpl <em>Custom Int Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.CustomIntPropertyImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCustomIntProperty()
     * @generated
     */
    int CUSTOM_INT_PROPERTY = 37;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_INT_PROPERTY__NAME = CUSTOM_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_INT_PROPERTY__STRING_VALUE = CUSTOM_PROPERTY__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Int Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_INT_PROPERTY__INT_VALUE = CUSTOM_PROPERTY__INT_VALUE;

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
    int CUSTOM_STRING_PROPERTY = 38;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_STRING_PROPERTY__NAME = CUSTOM_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_STRING_PROPERTY__STRING_VALUE = CUSTOM_PROPERTY__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Int Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_STRING_PROPERTY__INT_VALUE = CUSTOM_PROPERTY__INT_VALUE;

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
     * The meta object id for the '{@link ch.hilbri.assist.model.impl.RestrictionAlternativesImpl <em>Restriction Alternatives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.impl.RestrictionAlternativesImpl
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getRestrictionAlternatives()
     * @generated
     */
    int RESTRICTION_ALTERNATIVES = 39;

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
    int RESTRICTION_ALTERNATIVE = 40;

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
    int EXPLORATION_CANDIDATE = 41;

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
    int EXPLORATION_RESULT = 42;

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
    int ABSTRACT_DSE_METRIC = 43;

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
    int COMPARABLE = 44;

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
    int METRIC_SCORE_PAIR = 45;

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
    int MAPPING_RESULT = 46;

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
    int SINGLE_MAPPING_ELEMENT = 47;

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
    int ABSTRACT_MAPPING_METRIC = 48;

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
    int SCHEDULING_RESULT = 49;

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
    int TASK_EXECUTION_INSTANCE = 50;

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
    int DISSIMILARITY_ATTRIBUTES = 51;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.HardwareArchitectureLevelType <em>Hardware Architecture Level Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getHardwareArchitectureLevelType()
     * @generated
     */
    int HARDWARE_ARCHITECTURE_LEVEL_TYPE = 52;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.DesignAssuranceLevelType <em>Design Assurance Level Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.DesignAssuranceLevelType
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getDesignAssuranceLevelType()
     * @generated
     */
    int DESIGN_ASSURANCE_LEVEL_TYPE = 53;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.PeriodicityType <em>Periodicity Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.PeriodicityType
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getPeriodicityType()
     * @generated
     */
    int PERIODICITY_TYPE = 54;

    /**
     * The meta object id for the '{@link ch.hilbri.assist.model.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ch.hilbri.assist.model.Color
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getColor()
     * @generated
     */
    int COLOR = 55;

    /**
     * The meta object id for the '<em>List Of Task Lists</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.EList
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getListOfTaskLists()
     * @generated
     */
    int LIST_OF_TASK_LISTS = 56;

    /**
     * The meta object id for the '<em>Task2 Core Map Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.HashMap
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask2CoreMapType()
     * @generated
     */
    int TASK2_CORE_MAP_TYPE = 57;

    /**
     * The meta object id for the '<em>String List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getStringList()
     * @generated
     */
    int STRING_LIST = 58;

    /**
     * The meta object id for the '<em>Task2 Execution Instances Map Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.HashMap
     * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask2ExecutionInstancesMapType()
     * @generated
     */
    int TASK2_EXECUTION_INSTANCES_MAP_TYPE = 59;


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
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.HardwareElement#getCustomProperties <em>Custom Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Custom Properties</em>'.
     * @see ch.hilbri.assist.model.HardwareElement#getCustomProperties()
     * @see #getHardwareElement()
     * @generated
     */
    EReference getHardwareElement_CustomProperties();

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
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Board#getBoardType <em>Board Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Board Type</em>'.
     * @see ch.hilbri.assist.model.Board#getBoardType()
     * @see #getBoard()
     * @generated
     */
    EAttribute getBoard_BoardType();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Board#getPowerSupply <em>Power Supply</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Power Supply</em>'.
     * @see ch.hilbri.assist.model.Board#getPowerSupply()
     * @see #getBoard()
     * @generated
     */
    EAttribute getBoard_PowerSupply();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Board#getAssuranceLevel <em>Assurance Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Assurance Level</em>'.
     * @see ch.hilbri.assist.model.Board#getAssuranceLevel()
     * @see #getBoard()
     * @generated
     */
    EAttribute getBoard_AssuranceLevel();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Board#getRamCapacity <em>Ram Capacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ram Capacity</em>'.
     * @see ch.hilbri.assist.model.Board#getRamCapacity()
     * @see #getBoard()
     * @generated
     */
    EAttribute getBoard_RamCapacity();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Board#getRomCapacity <em>Rom Capacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rom Capacity</em>'.
     * @see ch.hilbri.assist.model.Board#getRomCapacity()
     * @see #getBoard()
     * @generated
     */
    EAttribute getBoard_RomCapacity();

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
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor</em>'.
     * @see ch.hilbri.assist.model.Processor
     * @generated
     */
    EClass getProcessor();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Processor#getProcessorType <em>Processor Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Processor Type</em>'.
     * @see ch.hilbri.assist.model.Processor#getProcessorType()
     * @see #getProcessor()
     * @generated
     */
    EAttribute getProcessor_ProcessorType();

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
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Core <em>Core</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Core</em>'.
     * @see ch.hilbri.assist.model.Core
     * @generated
     */
    EClass getCore();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Core#getArchitecture <em>Architecture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Architecture</em>'.
     * @see ch.hilbri.assist.model.Core#getArchitecture()
     * @see #getCore()
     * @generated
     */
    EAttribute getCore_Architecture();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Core#getCapacity <em>Capacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Capacity</em>'.
     * @see ch.hilbri.assist.model.Core#getCapacity()
     * @see #getCore()
     * @generated
     */
    EAttribute getCore_Capacity();

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
     * Returns the meta object for the '{@link ch.hilbri.assist.model.SoftwareElement#toString() <em>To String</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>To String</em>' operation.
     * @see ch.hilbri.assist.model.SoftwareElement#toString()
     * @generated
     */
    EOperation getSoftwareElement__ToString();

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
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Application#getDevelopedBy <em>Developed By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Developed By</em>'.
     * @see ch.hilbri.assist.model.Application#getDevelopedBy()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_DevelopedBy();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Application#getCriticalityLevel <em>Criticality Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Criticality Level</em>'.
     * @see ch.hilbri.assist.model.Application#getCriticalityLevel()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_CriticalityLevel();

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
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Application#getCustomProperties <em>Custom Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Custom Properties</em>'.
     * @see ch.hilbri.assist.model.Application#getCustomProperties()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_CustomProperties();

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
     * Returns the meta object for class '{@link ch.hilbri.assist.model.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see ch.hilbri.assist.model.Task
     * @generated
     */
    EClass getTask();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getCoreUtilization <em>Core Utilization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Core Utilization</em>'.
     * @see ch.hilbri.assist.model.Task#getCoreUtilization()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_CoreUtilization();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getRamUtilization <em>Ram Utilization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ram Utilization</em>'.
     * @see ch.hilbri.assist.model.Task#getRamUtilization()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_RamUtilization();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getRomUtilization <em>Rom Utilization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rom Utilization</em>'.
     * @see ch.hilbri.assist.model.Task#getRomUtilization()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_RomUtilization();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Duration</em>'.
     * @see ch.hilbri.assist.model.Task#getDuration()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_Duration();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getPeriod <em>Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Period</em>'.
     * @see ch.hilbri.assist.model.Task#getPeriod()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_Period();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getEarlyTolerance <em>Early Tolerance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Early Tolerance</em>'.
     * @see ch.hilbri.assist.model.Task#getEarlyTolerance()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_EarlyTolerance();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getLateTolerance <em>Late Tolerance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Late Tolerance</em>'.
     * @see ch.hilbri.assist.model.Task#getLateTolerance()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_LateTolerance();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getMaxStartTime <em>Max Start Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Start Time</em>'.
     * @see ch.hilbri.assist.model.Task#getMaxStartTime()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_MaxStartTime();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getMaxEndTime <em>Max End Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max End Time</em>'.
     * @see ch.hilbri.assist.model.Task#getMaxEndTime()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_MaxEndTime();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getAddInitTime <em>Add Init Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Add Init Time</em>'.
     * @see ch.hilbri.assist.model.Task#getAddInitTime()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_AddInitTime();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getSlices <em>Slices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Slices</em>'.
     * @see ch.hilbri.assist.model.Task#getSlices()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_Slices();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getMinSliceDuration <em>Min Slice Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Slice Duration</em>'.
     * @see ch.hilbri.assist.model.Task#getMinSliceDuration()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_MinSliceDuration();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getPeriodicity <em>Periodicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Periodicity</em>'.
     * @see ch.hilbri.assist.model.Task#getPeriodicity()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_Periodicity();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.Task#getColor <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Color</em>'.
     * @see ch.hilbri.assist.model.Task#getColor()
     * @see #getTask()
     * @generated
     */
    EAttribute getTask_Color();

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
     * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.model.Task#getCustomProperties <em>Custom Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Custom Properties</em>'.
     * @see ch.hilbri.assist.model.Task#getCustomProperties()
     * @see #getTask()
     * @generated
     */
    EReference getTask_CustomProperties();

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
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.CustomProperty#getStringValue <em>String Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>String Value</em>'.
     * @see ch.hilbri.assist.model.CustomProperty#getStringValue()
     * @see #getCustomProperty()
     * @generated
     */
    EAttribute getCustomProperty_StringValue();

    /**
     * Returns the meta object for the attribute '{@link ch.hilbri.assist.model.CustomProperty#getIntValue <em>Int Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Int Value</em>'.
     * @see ch.hilbri.assist.model.CustomProperty#getIntValue()
     * @see #getCustomProperty()
     * @generated
     */
    EAttribute getCustomProperty_IntValue();

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
         * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HARDWARE_ELEMENT__FEATURES = eINSTANCE.getHardwareElement_Features();

        /**
         * The meta object literal for the '<em><b>Custom Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HARDWARE_ELEMENT__CUSTOM_PROPERTIES = eINSTANCE.getHardwareElement_CustomProperties();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HARDWARE_ELEMENT__PROPERTIES = eINSTANCE.getHardwareElement_Properties();

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
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.ProcessorImpl <em>Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.ProcessorImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getProcessor()
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
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.CoreImpl <em>Core</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.CoreImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getCore()
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
         * The meta object literal for the '<em><b>To String</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SOFTWARE_ELEMENT___TO_STRING = eINSTANCE.getSoftwareElement__ToString();

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
         * The meta object literal for the '<em><b>Developed By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION__DEVELOPED_BY = eINSTANCE.getApplication_DevelopedBy();

        /**
         * The meta object literal for the '<em><b>Criticality Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION__CRITICALITY_LEVEL = eINSTANCE.getApplication_CriticalityLevel();

        /**
         * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION__TASKS = eINSTANCE.getApplication_Tasks();

        /**
         * The meta object literal for the '<em><b>Custom Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION__CUSTOM_PROPERTIES = eINSTANCE.getApplication_CustomProperties();

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
         * The meta object literal for the '{@link ch.hilbri.assist.model.impl.TaskImpl <em>Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ch.hilbri.assist.model.impl.TaskImpl
         * @see ch.hilbri.assist.model.impl.ModelPackageImpl#getTask()
         * @generated
         */
        EClass TASK = eINSTANCE.getTask();

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
         * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__DURATION = eINSTANCE.getTask_Duration();

        /**
         * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__PERIOD = eINSTANCE.getTask_Period();

        /**
         * The meta object literal for the '<em><b>Early Tolerance</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__EARLY_TOLERANCE = eINSTANCE.getTask_EarlyTolerance();

        /**
         * The meta object literal for the '<em><b>Late Tolerance</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__LATE_TOLERANCE = eINSTANCE.getTask_LateTolerance();

        /**
         * The meta object literal for the '<em><b>Max Start Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__MAX_START_TIME = eINSTANCE.getTask_MaxStartTime();

        /**
         * The meta object literal for the '<em><b>Max End Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__MAX_END_TIME = eINSTANCE.getTask_MaxEndTime();

        /**
         * The meta object literal for the '<em><b>Add Init Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__ADD_INIT_TIME = eINSTANCE.getTask_AddInitTime();

        /**
         * The meta object literal for the '<em><b>Slices</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__SLICES = eINSTANCE.getTask_Slices();

        /**
         * The meta object literal for the '<em><b>Min Slice Duration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__MIN_SLICE_DURATION = eINSTANCE.getTask_MinSliceDuration();

        /**
         * The meta object literal for the '<em><b>Periodicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__PERIODICITY = eINSTANCE.getTask_Periodicity();

        /**
         * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK__COLOR = eINSTANCE.getTask_Color();

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
         * The meta object literal for the '<em><b>Custom Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK__CUSTOM_PROPERTIES = eINSTANCE.getTask_CustomProperties();

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
         * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CUSTOM_PROPERTY__STRING_VALUE = eINSTANCE.getCustomProperty_StringValue();

        /**
         * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CUSTOM_PROPERTY__INT_VALUE = eINSTANCE.getCustomProperty_IntValue();

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
