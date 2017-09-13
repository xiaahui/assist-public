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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.MetricScorePairImpl <em>Metric Score Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.MetricScorePairImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getMetricScorePair()
	 * @generated
	 */
	int METRIC_SCORE_PAIR = 1;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NAME = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__INDEX = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MODEL = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task2 Core Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TASK2_CORE_MAP = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metric Absolute Scores Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__METRIC_ABSOLUTE_SCORES_MAP = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric Scaled Scores Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__METRIC_SCALED_SCORES_MAP = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Partial Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PARTIAL_SOLUTION = COMPARABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Absolute Total Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ABSOLUTE_TOTAL_SCORE = COMPARABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scaled Total Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SCALED_TOTAL_SCORE = COMPARABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Mapped Tasks For Core</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Absolute Core Utilization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE = COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Relative Core Utilization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE = COMPARABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Hardware Element For Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__TASK_INT = COMPARABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Mapping Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_MAPPING_ELEMENTS = COMPARABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___COMPARE_TO__RESULT = COMPARABLE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl <em>Single Mapping Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getSingleMappingElement()
	 * @generated
	 */
	int SINGLE_MAPPING_ELEMENT = 3;

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
	 * The meta object id for the '{@link ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl <em>Abstract Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getAbstractMetric()
	 * @generated
	 */
	int ABSTRACT_METRIC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Built In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__BUILT_IN = 1;

	/**
	 * The feature id for the '<em><b>Higher Score Is Better</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METRIC__WEIGHT = 3;

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
	 * The meta object id for the '<em>Task2 Core Map Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getTask2CoreMapType()
	 * @generated
	 */
	int TASK2_CORE_MAP_TYPE = 5;

	/**
	 * The meta object id for the '<em>String List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 6;


	/**
	 * Returns the meta object for class '{@link java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result> <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result>
	 * @model instanceClass="java.lang.Comparable&lt;ch.hilbri.assist.mapping.model.result.Result&gt;"
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Metric Score Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Score Pair</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="ch.hilbri.assist.mapping.model.result.AbstractMetric"
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
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getIndex()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Index();

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
	 * Returns the meta object for the map '{@link ch.hilbri.assist.mapping.model.result.Result#getMetricAbsoluteScoresMap <em>Metric Absolute Scores Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Metric Absolute Scores Map</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getMetricAbsoluteScoresMap()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_MetricAbsoluteScoresMap();

	/**
	 * Returns the meta object for the map '{@link ch.hilbri.assist.mapping.model.result.Result#getMetricScaledScoresMap <em>Metric Scaled Scores Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Metric Scaled Scores Map</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getMetricScaledScoresMap()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_MetricScaledScoresMap();

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
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getAbsoluteTotalScore <em>Absolute Total Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Total Score</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAbsoluteTotalScore()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_AbsoluteTotalScore();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.mapping.model.result.Result#getScaledTotalScore <em>Scaled Total Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaled Total Score</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getScaledTotalScore()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_ScaledTotalScore();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getMappedTasksForCore(ch.hilbri.assist.mapping.model.Core) <em>Get Mapped Tasks For Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapped Tasks For Core</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getMappedTasksForCore(ch.hilbri.assist.mapping.model.Core)
	 * @generated
	 */
	EOperation getResult__GetMappedTasksForCore__Core();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getAbsoluteCoreUtilization(ch.hilbri.assist.mapping.model.Core) <em>Get Absolute Core Utilization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Absolute Core Utilization</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getAbsoluteCoreUtilization(ch.hilbri.assist.mapping.model.Core)
	 * @generated
	 */
	EOperation getResult__GetAbsoluteCoreUtilization__Core();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getRelativeCoreUtilization(ch.hilbri.assist.mapping.model.Core) <em>Get Relative Core Utilization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Relative Core Utilization</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getRelativeCoreUtilization(ch.hilbri.assist.mapping.model.Core)
	 * @generated
	 */
	EOperation getResult__GetRelativeCoreUtilization__Core();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getHardwareElementForTask(ch.hilbri.assist.mapping.model.Task, int) <em>Get Hardware Element For Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hardware Element For Task</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getHardwareElementForTask(ch.hilbri.assist.mapping.model.Task, int)
	 * @generated
	 */
	EOperation getResult__GetHardwareElementForTask__Task_int();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.Result#getMappingElements() <em>Get Mapping Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapping Elements</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.Result#getMappingElements()
	 * @generated
	 */
	EOperation getResult__GetMappingElements();

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
	 * Returns the meta object for class '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement <em>Single Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Mapping Element</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement
	 * @generated
	 */
	EClass getSingleMappingElement();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement#getApplication()
	 * @see #getSingleMappingElement()
	 * @generated
	 */
	EReference getSingleMappingElement_Application();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement#getTask()
	 * @see #getSingleMappingElement()
	 * @generated
	 */
	EReference getSingleMappingElement_Task();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCore()
	 * @see #getSingleMappingElement()
	 * @generated
	 */
	EReference getSingleMappingElement_Core();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement#getProcessor()
	 * @see #getSingleMappingElement()
	 * @generated
	 */
	EReference getSingleMappingElement_Processor();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBoard()
	 * @see #getSingleMappingElement()
	 * @generated
	 */
	EReference getSingleMappingElement_Board();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Box</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBox()
	 * @see #getSingleMappingElement()
	 * @generated
	 */
	EReference getSingleMappingElement_Box();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment</em>'.
	 * @see ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCompartment()
	 * @see #getSingleMappingElement()
	 * @generated
	 */
	EReference getSingleMappingElement_Compartment();

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
	 * Returns the meta object for the '{@link ch.hilbri.assist.mapping.model.result.AbstractMetric#computeAbsoluteScore(ch.hilbri.assist.mapping.model.result.Result) <em>Compute Absolute Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Absolute Score</em>' operation.
	 * @see ch.hilbri.assist.mapping.model.result.AbstractMetric#computeAbsoluteScore(ch.hilbri.assist.mapping.model.result.Result)
	 * @generated
	 */
	EOperation getAbstractMetric__ComputeAbsoluteScore__Result();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Task2 Core Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task2 Core Map Type</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap&lt;ch.hilbri.assist.mapping.model.Task, ch.hilbri.assist.mapping.model.Core&gt;"
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
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.MetricScorePairImpl <em>Metric Score Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.MetricScorePairImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getMetricScorePair()
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
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__INDEX = eINSTANCE.getResult_Index();

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
		 * The meta object literal for the '<em><b>Metric Absolute Scores Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__METRIC_ABSOLUTE_SCORES_MAP = eINSTANCE.getResult_MetricAbsoluteScoresMap();

		/**
		 * The meta object literal for the '<em><b>Metric Scaled Scores Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__METRIC_SCALED_SCORES_MAP = eINSTANCE.getResult_MetricScaledScoresMap();

		/**
		 * The meta object literal for the '<em><b>Partial Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__PARTIAL_SOLUTION = eINSTANCE.getResult_PartialSolution();

		/**
		 * The meta object literal for the '<em><b>Absolute Total Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__ABSOLUTE_TOTAL_SCORE = eINSTANCE.getResult_AbsoluteTotalScore();

		/**
		 * The meta object literal for the '<em><b>Scaled Total Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__SCALED_TOTAL_SCORE = eINSTANCE.getResult_ScaledTotalScore();

		/**
		 * The meta object literal for the '<em><b>Get Mapped Tasks For Core</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE = eINSTANCE.getResult__GetMappedTasksForCore__Core();

		/**
		 * The meta object literal for the '<em><b>Get Absolute Core Utilization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE = eINSTANCE.getResult__GetAbsoluteCoreUtilization__Core();

		/**
		 * The meta object literal for the '<em><b>Get Relative Core Utilization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE = eINSTANCE.getResult__GetRelativeCoreUtilization__Core();

		/**
		 * The meta object literal for the '<em><b>Get Hardware Element For Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__TASK_INT = eINSTANCE.getResult__GetHardwareElementForTask__Task_int();

		/**
		 * The meta object literal for the '<em><b>Get Mapping Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_MAPPING_ELEMENTS = eINSTANCE.getResult__GetMappingElements();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___COMPARE_TO__RESULT = eINSTANCE.getResult__CompareTo__Result();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl <em>Single Mapping Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl
		 * @see ch.hilbri.assist.mapping.model.result.impl.ResultPackageImpl#getSingleMappingElement()
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
		 * The meta object literal for the '<em><b>Built In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METRIC__BUILT_IN = eINSTANCE.getAbstractMetric_BuiltIn();

		/**
		 * The meta object literal for the '<em><b>Higher Score Is Better</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER = eINSTANCE.getAbstractMetric_HigherScoreIsBetter();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METRIC__WEIGHT = eINSTANCE.getAbstractMetric_Weight();

		/**
		 * The meta object literal for the '<em><b>Compute Absolute Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_METRIC___COMPUTE_ABSOLUTE_SCORE__RESULT = eINSTANCE.getAbstractMetric__ComputeAbsoluteScore__Result();

		/**
		 * The meta object literal for the '<em>Task2 Core Map Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
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
