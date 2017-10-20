/**
 */
package ch.hilbri.assist.dse.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ch.hilbri.assist.dse.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelPluginID='ch.hilbri.assist.dse.model' editDirectory='/ch.hilbri.assist.dse.model.edit/src' editPluginID='ch.hilbri.assist.dse.model.edit' editorDirectory='/ch.hilbri.assist.dse.model.editor/src' editorPluginID='ch.hilbri.assist.dse.model.editor' generateModelWizard='false' generateExampleClass='false' basePackage='ch.hilbri.assist.dse'"
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
	String eNS_URI = "ch.hilbri.assist.dse.model";

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
	ModelPackage eINSTANCE = ch.hilbri.assist.dse.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.AssistModelDSEImpl <em>Assist Model DSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.AssistModelDSEImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getAssistModelDSE()
	 * @generated
	 */
	int ASSIST_MODEL_DSE = 0;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__SYSTEM_NAME = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL__SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__COMPARTMENTS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__APPLICATIONS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL__APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__DISLOCALITY_RELATIONS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS;

	/**
	 * The feature id for the '<em><b>Colocality Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__COLOCALITY_RELATIONS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS;

	/**
	 * The feature id for the '<em><b>Application Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restriction Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assist Model DSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE_FEATURE_COUNT = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Compartments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE___GET_ALL_COMPARTMENTS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL___GET_ALL_COMPARTMENTS;

	/**
	 * The operation id for the '<em>Get All Boxes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE___GET_ALL_BOXES = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL___GET_ALL_BOXES;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE___GET_ALL_BOARDS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL___GET_ALL_BOARDS;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE___GET_ALL_PROCESSORS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL___GET_ALL_PROCESSORS;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE___GET_ALL_CORES = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL___GET_ALL_CORES;

	/**
	 * The operation id for the '<em>Get All Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE___GET_ALL_TASKS = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL___GET_ALL_TASKS;

	/**
	 * The operation id for the '<em>Get All Hardware Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE___GET_ALL_HARDWARE_ELEMENTS__INT = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT;

	/**
	 * The number of operations of the '<em>Assist Model DSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE_OPERATION_COUNT = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.BoxDSEImpl <em>Box DSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.BoxDSEImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getBoxDSE()
	 * @generated
	 */
	int BOX_DSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE__NAME = ch.hilbri.assist.mapping.model.ModelPackage.BOX__NAME;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE__MANUFACTURER = ch.hilbri.assist.mapping.model.ModelPackage.BOX__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE__METRIC_PARAMETERS = ch.hilbri.assist.mapping.model.ModelPackage.BOX__METRIC_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE__COMPARTMENT = ch.hilbri.assist.mapping.model.ModelPackage.BOX__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE__BOARDS = ch.hilbri.assist.mapping.model.ModelPackage.BOX__BOARDS;

	/**
	 * The feature id for the '<em><b>Board Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE__BOARD_ALTERNATIVES = ch.hilbri.assist.mapping.model.ModelPackage.BOX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Box DSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE_FEATURE_COUNT = ch.hilbri.assist.mapping.model.ModelPackage.BOX_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Boards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE___GET_ALL_BOARDS = ch.hilbri.assist.mapping.model.ModelPackage.BOX___GET_ALL_BOARDS;

	/**
	 * The operation id for the '<em>Get All Processors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE___GET_ALL_PROCESSORS = ch.hilbri.assist.mapping.model.ModelPackage.BOX___GET_ALL_PROCESSORS;

	/**
	 * The operation id for the '<em>Get All Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE___GET_ALL_CORES = ch.hilbri.assist.mapping.model.ModelPackage.BOX___GET_ALL_CORES;

	/**
	 * The number of operations of the '<em>Box DSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_DSE_OPERATION_COUNT = ch.hilbri.assist.mapping.model.ModelPackage.BOX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.BoardAlternativesImpl <em>Board Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.BoardAlternativesImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getBoardAlternatives()
	 * @generated
	 */
	int BOARD_ALTERNATIVES = 2;

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
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.BoardAlternativeImpl <em>Board Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.BoardAlternativeImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getBoardAlternative()
	 * @generated
	 */
	int BOARD_ALTERNATIVE = 3;

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
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.ApplicationAlternativesImpl <em>Application Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.ApplicationAlternativesImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getApplicationAlternatives()
	 * @generated
	 */
	int APPLICATION_ALTERNATIVES = 4;

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
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.ApplicationAlternativeImpl <em>Application Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.ApplicationAlternativeImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getApplicationAlternative()
	 * @generated
	 */
	int APPLICATION_ALTERNATIVE = 5;

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
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.RestrictionAlternativesImpl <em>Restriction Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.RestrictionAlternativesImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getRestrictionAlternatives()
	 * @generated
	 */
	int RESTRICTION_ALTERNATIVES = 6;

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
	 * The meta object id for the '{@link ch.hilbri.assist.dse.model.impl.RestrictionAlternativeImpl <em>Restriction Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.dse.model.impl.RestrictionAlternativeImpl
	 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getRestrictionAlternative()
	 * @generated
	 */
	int RESTRICTION_ALTERNATIVE = 7;

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
	 * The number of structural features of the '<em>Restriction Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_ALTERNATIVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Restriction Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_ALTERNATIVE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.AssistModelDSE <em>Assist Model DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assist Model DSE</em>'.
	 * @see ch.hilbri.assist.dse.model.AssistModelDSE
	 * @generated
	 */
	EClass getAssistModelDSE();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.AssistModelDSE#getApplicationAlternatives <em>Application Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.AssistModelDSE#getApplicationAlternatives()
	 * @see #getAssistModelDSE()
	 * @generated
	 */
	EReference getAssistModelDSE_ApplicationAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.AssistModelDSE#getRestrictionAlternatives <em>Restriction Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restriction Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.AssistModelDSE#getRestrictionAlternatives()
	 * @see #getAssistModelDSE()
	 * @generated
	 */
	EReference getAssistModelDSE_RestrictionAlternatives();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.BoxDSE <em>Box DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box DSE</em>'.
	 * @see ch.hilbri.assist.dse.model.BoxDSE
	 * @generated
	 */
	EClass getBoxDSE();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.BoxDSE#getBoardAlternatives <em>Board Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Board Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.BoxDSE#getBoardAlternatives()
	 * @see #getBoxDSE()
	 * @generated
	 */
	EReference getBoxDSE_BoardAlternatives();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.BoardAlternatives <em>Board Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.BoardAlternatives
	 * @generated
	 */
	EClass getBoardAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.BoardAlternatives#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.BoardAlternatives#getAlternatives()
	 * @see #getBoardAlternatives()
	 * @generated
	 */
	EReference getBoardAlternatives_Alternatives();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.BoardAlternative <em>Board Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Alternative</em>'.
	 * @see ch.hilbri.assist.dse.model.BoardAlternative
	 * @generated
	 */
	EClass getBoardAlternative();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.dse.model.BoardAlternative#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.dse.model.BoardAlternative#getName()
	 * @see #getBoardAlternative()
	 * @generated
	 */
	EAttribute getBoardAlternative_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.BoardAlternative#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see ch.hilbri.assist.dse.model.BoardAlternative#getBoards()
	 * @see #getBoardAlternative()
	 * @generated
	 */
	EReference getBoardAlternative_Boards();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.ApplicationAlternatives <em>Application Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.ApplicationAlternatives
	 * @generated
	 */
	EClass getApplicationAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.ApplicationAlternatives#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.ApplicationAlternatives#getAlternatives()
	 * @see #getApplicationAlternatives()
	 * @generated
	 */
	EReference getApplicationAlternatives_Alternatives();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.ApplicationAlternative <em>Application Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Alternative</em>'.
	 * @see ch.hilbri.assist.dse.model.ApplicationAlternative
	 * @generated
	 */
	EClass getApplicationAlternative();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.dse.model.ApplicationAlternative#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.dse.model.ApplicationAlternative#getName()
	 * @see #getApplicationAlternative()
	 * @generated
	 */
	EAttribute getApplicationAlternative_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.ApplicationAlternative#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see ch.hilbri.assist.dse.model.ApplicationAlternative#getApplications()
	 * @see #getApplicationAlternative()
	 * @generated
	 */
	EReference getApplicationAlternative_Applications();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.RestrictionAlternatives <em>Restriction Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.RestrictionAlternatives
	 * @generated
	 */
	EClass getRestrictionAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.RestrictionAlternatives#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see ch.hilbri.assist.dse.model.RestrictionAlternatives#getAlternatives()
	 * @see #getRestrictionAlternatives()
	 * @generated
	 */
	EReference getRestrictionAlternatives_Alternatives();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.RestrictionAlternative <em>Restriction Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Alternative</em>'.
	 * @see ch.hilbri.assist.dse.model.RestrictionAlternative
	 * @generated
	 */
	EClass getRestrictionAlternative();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.dse.model.RestrictionAlternative#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.dse.model.RestrictionAlternative#getName()
	 * @see #getRestrictionAlternative()
	 * @generated
	 */
	EAttribute getRestrictionAlternative_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.RestrictionAlternative#getDislocalityRelations <em>Dislocality Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dislocality Relations</em>'.
	 * @see ch.hilbri.assist.dse.model.RestrictionAlternative#getDislocalityRelations()
	 * @see #getRestrictionAlternative()
	 * @generated
	 */
	EReference getRestrictionAlternative_DislocalityRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.hilbri.assist.dse.model.RestrictionAlternative#getColocalityRelations <em>Colocality Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colocality Relations</em>'.
	 * @see ch.hilbri.assist.dse.model.RestrictionAlternative#getColocalityRelations()
	 * @see #getRestrictionAlternative()
	 * @generated
	 */
	EReference getRestrictionAlternative_ColocalityRelations();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.AssistModelDSEImpl <em>Assist Model DSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.AssistModelDSEImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getAssistModelDSE()
		 * @generated
		 */
		EClass ASSIST_MODEL_DSE = eINSTANCE.getAssistModelDSE();

		/**
		 * The meta object literal for the '<em><b>Application Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES = eINSTANCE.getAssistModelDSE_ApplicationAlternatives();

		/**
		 * The meta object literal for the '<em><b>Restriction Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES = eINSTANCE.getAssistModelDSE_RestrictionAlternatives();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.BoxDSEImpl <em>Box DSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.BoxDSEImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getBoxDSE()
		 * @generated
		 */
		EClass BOX_DSE = eINSTANCE.getBoxDSE();

		/**
		 * The meta object literal for the '<em><b>Board Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX_DSE__BOARD_ALTERNATIVES = eINSTANCE.getBoxDSE_BoardAlternatives();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.BoardAlternativesImpl <em>Board Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.BoardAlternativesImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getBoardAlternatives()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.BoardAlternativeImpl <em>Board Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.BoardAlternativeImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getBoardAlternative()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.ApplicationAlternativesImpl <em>Application Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.ApplicationAlternativesImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getApplicationAlternatives()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.ApplicationAlternativeImpl <em>Application Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.ApplicationAlternativeImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getApplicationAlternative()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.RestrictionAlternativesImpl <em>Restriction Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.RestrictionAlternativesImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getRestrictionAlternatives()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.dse.model.impl.RestrictionAlternativeImpl <em>Restriction Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.dse.model.impl.RestrictionAlternativeImpl
		 * @see ch.hilbri.assist.dse.model.impl.ModelPackageImpl#getRestrictionAlternative()
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

	}

} //ModelPackage
