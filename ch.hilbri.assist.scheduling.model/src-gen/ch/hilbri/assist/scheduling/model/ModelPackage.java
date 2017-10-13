/**
 */
package ch.hilbri.assist.scheduling.model;

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
 * @see ch.hilbri.assist.scheduling.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelPluginID='ch.hilbri.assist.scheduling.model' editDirectory='/ch.hilbri.assist.scheduling.model.edit/src' editPluginID='ch.hilbri.assist.scheduling.model.edit' editorDirectory='/ch.hilbri.assist.scheduling.model.editor/src' editorPluginID='ch.hilbri.assist.scheduling.model.editor' generateModelWizard='false' generateExampleClass='false' basePackage='ch.hilbri.assist.scheduling'"
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
	String eNS_URI = "ch.hilbri.assist.scheduling.model";

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
	ModelPackage eINSTANCE = ch.hilbri.assist.scheduling.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.scheduling.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.scheduling.model.impl.AssistModelImpl
	 * @see ch.hilbri.assist.scheduling.model.impl.ModelPackageImpl#getAssistModel()
	 * @generated
	 */
	int ASSIST_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assist Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIST_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.scheduling.model.AssistModel <em>Assist Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assist Model</em>'.
	 * @see ch.hilbri.assist.scheduling.model.AssistModel
	 * @generated
	 */
	EClass getAssistModel();

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
		 * The meta object literal for the '{@link ch.hilbri.assist.scheduling.model.impl.AssistModelImpl <em>Assist Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.scheduling.model.impl.AssistModelImpl
		 * @see ch.hilbri.assist.scheduling.model.impl.ModelPackageImpl#getAssistModel()
		 * @generated
		 */
		EClass ASSIST_MODEL = eINSTANCE.getAssistModel();

	}

} //ModelPackage
