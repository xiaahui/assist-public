/**
 */
package ch.hilbri.assist.dse.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * The feature id for the '<em><b>Application Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES;

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
	 * The number of structural features of the '<em>Assist Model DSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_DSE_FEATURE_COUNT = ch.hilbri.assist.mapping.model.ModelPackage.ASSIST_MODEL_FEATURE_COUNT + 0;

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
	 * Returns the meta object for class '{@link ch.hilbri.assist.dse.model.AssistModelDSE <em>Assist Model DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assist Model DSE</em>'.
	 * @see ch.hilbri.assist.dse.model.AssistModelDSE
	 * @generated
	 */
	EClass getAssistModelDSE();

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

	}

} //ModelPackage
