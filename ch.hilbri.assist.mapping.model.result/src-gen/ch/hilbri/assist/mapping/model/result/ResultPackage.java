/**
 */
package ch.hilbri.assist.mapping.model.result;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	int RESULT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Task2 Core Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TASK2_CORE_MAP = 2;

	/**
	 * The feature id for the '<em><b>Partial Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PARTIAL_SOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Detailed Mapping Results</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DETAILED_MAPPING_RESULTS = 4;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Task2 Core Map Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getTask2CoreMapType()
	 * @generated
	 */
	int TASK2_CORE_MAP_TYPE = 2;

	/**
	 * The meta object id for the '<em>String List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 3;


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
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.Result#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getModel()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Model();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getTask2CoreMap <em>Task2 Core Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task2 Core Map</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getTask2CoreMap()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Task2CoreMap();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#isPartialSolution <em>Partial Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial Solution</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#isPartialSolution()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_PartialSolution();

	/**
	 * Returns the meta object for the attribute list '{@link ch.hilbri.assist.mapping.model.result.Result#getDetailedMappingResults <em>Detailed Mapping Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Detailed Mapping Results</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getDetailedMappingResults()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_DetailedMappingResults();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Task2 Core Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task2 Core Map Type</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map<ch.hilbri.assist.mapping.model.Task, ch.hilbri.assist.mapping.model.Core>"
	 * @generated
	 */
	EDataType getTask2CoreMapType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<java.lang.String>"
	 * @generated
	 */
	EDataType getStringList();

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
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__MODEL = eINSTANCE.getResult_Model();

		/**
		 * The meta object literal for the '<em><b>Task2 Core Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__TASK2_CORE_MAP = eINSTANCE.getResult_Task2CoreMap();

		/**
		 * The meta object literal for the '<em><b>Partial Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__PARTIAL_SOLUTION = eINSTANCE.getResult_PartialSolution();

		/**
		 * The meta object literal for the '<em><b>Detailed Mapping Results</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__DETAILED_MAPPING_RESULTS = eINSTANCE.getResult_DetailedMappingResults();

		/**
		 * The meta object literal for the '<em>Task2 Core Map Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getTask2CoreMapType()
		 * @generated
		 */
		EDataType TASK2_CORE_MAP_TYPE = eINSTANCE.getTask2CoreMapType();

		/**
		 * The meta object literal for the '<em>String List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getStringList()
		 * @generated
		 */
		EDataType STRING_LIST = eINSTANCE.getStringList();

	}

} //ResultPackage
