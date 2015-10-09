/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

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
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel generateModelWizard='false' generateExampleClass='false' basePackage='ch.hilbri.assist.datamodel.result'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ch.hilbri.assist.datamodel.result.mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result> <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result>
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getComparable()
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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getResult()
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
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MODEL = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MAPPING = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mappings For Hardware Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MAPPINGS_FOR_HARDWARE_ELEMENTS = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partial Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PARTIAL_SOLUTION = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Solution Found Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SOLUTION_FOUND_ORDER_ID = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__EVALUATION = COMPARABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get All Unmapped Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_UNMAPPED_EQ_INTERFACES = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Completeness As Percentage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_COMPLETENESS_AS_PERCENTAGE = COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Pin For Eq Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_PIN_FOR_EQ_INTERFACE__EQINTERFACE = COMPARABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Eq Interface For Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_EQ_INTERFACE_FOR_PIN__PIN = COMPARABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Mapped Eq Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT___GET_ALL_MAPPED_EQ_INTERFACES__HARDWAREELEMENT = COMPARABLE_OPERATION_COUNT + 4;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl <em>Abstract Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getAbstractMetric()
	 * @generated
	 */
	int ABSTRACT_METRIC = 2;

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
	 * The meta object id for the '{@link ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 3;

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
	 * The feature id for the '<em><b>Metrics Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__METRICS_USED = 2;

	/**
	 * The feature id for the '<em><b>Total Scaled Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__TOTAL_SCALED_SCORE = 3;

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
	 * The meta object id for the '<em>Eq Interface Pin Map Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getEqInterfacePinMapType()
	 * @generated
	 */
	int EQ_INTERFACE_PIN_MAP_TYPE = 4;

	/**
	 * The meta object id for the '<em>Hardware Element Mappings Map Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getHardwareElementMappingsMapType()
	 * @generated
	 */
	int HARDWARE_ELEMENT_MAPPINGS_MAP_TYPE = 5;

	/**
	 * The meta object id for the '<em>Metric Score Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getMetricScoreMap()
	 * @generated
	 */
	int METRIC_SCORE_MAP = 6;


	/**
	 * Returns the meta object for class '{@link java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result> <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result>
	 * @model instanceClass="java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result>"
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.result.mapping.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getName()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Name();

	/**
	 * Returns the meta object for the reference '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getModel()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Model();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getMapping()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getMappingsForHardwareElements <em>Mappings For Hardware Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mappings For Hardware Elements</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getMappingsForHardwareElements()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_MappingsForHardwareElements();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Result#isPartialSolution <em>Partial Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial Solution</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#isPartialSolution()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_PartialSolution();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getSolutionFoundOrderId <em>Solution Found Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution Found Order Id</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getSolutionFoundOrderId()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_SolutionFoundOrderId();

	/**
	 * Returns the meta object for the containment reference '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getEvaluation()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Evaluation();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getAllUnmappedEqInterfaces() <em>Get All Unmapped Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Unmapped Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getAllUnmappedEqInterfaces()
	 * @generated
	 */
	EOperation getResult__GetAllUnmappedEqInterfaces();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getCompletenessAsPercentage() <em>Get Completeness As Percentage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Completeness As Percentage</em>' operation.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getCompletenessAsPercentage()
	 * @generated
	 */
	EOperation getResult__GetCompletenessAsPercentage();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getPinForEqInterface(ch.hilbri.assist.datamodel.model.EqInterface) <em>Get Pin For Eq Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pin For Eq Interface</em>' operation.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getPinForEqInterface(ch.hilbri.assist.datamodel.model.EqInterface)
	 * @generated
	 */
	EOperation getResult__GetPinForEqInterface__EqInterface();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getEqInterfaceForPin(ch.hilbri.assist.datamodel.model.Pin) <em>Get Eq Interface For Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Eq Interface For Pin</em>' operation.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getEqInterfaceForPin(ch.hilbri.assist.datamodel.model.Pin)
	 * @generated
	 */
	EOperation getResult__GetEqInterfaceForPin__Pin();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getAllMappedEqInterfaces(ch.hilbri.assist.datamodel.model.HardwareElement) <em>Get All Mapped Eq Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Mapped Eq Interfaces</em>' operation.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#getAllMappedEqInterfaces(ch.hilbri.assist.datamodel.model.HardwareElement)
	 * @generated
	 */
	EOperation getResult__GetAllMappedEqInterfaces__HardwareElement();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#compareTo(ch.hilbri.assist.datamodel.result.mapping.Result) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Result#compareTo(ch.hilbri.assist.datamodel.result.mapping.Result)
	 * @generated
	 */
	EOperation getResult__CompareTo__Result();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.result.mapping.AbstractMetric <em>Abstract Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Metric</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.AbstractMetric
	 * @generated
	 */
	EClass getAbstractMetric();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#getName()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#getWeight()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_Weight();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Higher Score Is Better</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#isHigherScoreIsBetter()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_HigherScoreIsBetter();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#isBuiltIn <em>Built In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#isBuiltIn()
	 * @see #getAbstractMetric()
	 * @generated
	 */
	EAttribute getAbstractMetric_BuiltIn();

	/**
	 * Returns the meta object for the '{@link ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#computeAbsoluteScore(ch.hilbri.assist.datamodel.result.mapping.Result) <em>Compute Absolute Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Absolute Score</em>' operation.
	 * @see ch.hilbri.assist.datamodel.result.mapping.AbstractMetric#computeAbsoluteScore(ch.hilbri.assist.datamodel.result.mapping.Result)
	 * @generated
	 */
	EOperation getAbstractMetric__ComputeAbsoluteScore__Result();

	/**
	 * Returns the meta object for class '{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Scores</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Evaluation#getAbsoluteScores()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_AbsoluteScores();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getScaledScores <em>Scaled Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaled Scores</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Evaluation#getScaledScores()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_ScaledScores();

	/**
	 * Returns the meta object for the reference list '{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getMetricsUsed <em>Metrics Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics Used</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Evaluation#getMetricsUsed()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_MetricsUsed();

	/**
	 * Returns the meta object for the attribute '{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getTotalScaledScore <em>Total Scaled Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Scaled Score</em>'.
	 * @see ch.hilbri.assist.datamodel.result.mapping.Evaluation#getTotalScaledScore()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_TotalScaledScore();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Eq Interface Pin Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Eq Interface Pin Map Type</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap<ch.hilbri.assist.datamodel.model.EqInterface, ch.hilbri.assist.datamodel.model.Pin>"
	 * @generated
	 */
	EDataType getEqInterfacePinMapType();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Hardware Element Mappings Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hardware Element Mappings Map Type</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap<ch.hilbri.assist.datamodel.model.HardwareElement, org.eclipse.emf.common.util.EList<ch.hilbri.assist.datamodel.model.EqInterface>>"
	 * @generated
	 */
	EDataType getHardwareElementMappingsMapType();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Metric Score Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Metric Score Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap<ch.hilbri.assist.datamodel.result.mapping.AbstractMetric, java.lang.Double>"
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
	MappingFactory getMappingFactory();

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
		 * The meta object literal for the '{@link java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result> <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result>
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getResult()
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
		 * The meta object literal for the '<em><b>Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__MAPPING = eINSTANCE.getResult_Mapping();

		/**
		 * The meta object literal for the '<em><b>Mappings For Hardware Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__MAPPINGS_FOR_HARDWARE_ELEMENTS = eINSTANCE.getResult_MappingsForHardwareElements();

		/**
		 * The meta object literal for the '<em><b>Partial Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__PARTIAL_SOLUTION = eINSTANCE.getResult_PartialSolution();

		/**
		 * The meta object literal for the '<em><b>Solution Found Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__SOLUTION_FOUND_ORDER_ID = eINSTANCE.getResult_SolutionFoundOrderId();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__EVALUATION = eINSTANCE.getResult_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Get All Unmapped Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_UNMAPPED_EQ_INTERFACES = eINSTANCE.getResult__GetAllUnmappedEqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Get Completeness As Percentage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_COMPLETENESS_AS_PERCENTAGE = eINSTANCE.getResult__GetCompletenessAsPercentage();

		/**
		 * The meta object literal for the '<em><b>Get Pin For Eq Interface</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_PIN_FOR_EQ_INTERFACE__EQINTERFACE = eINSTANCE.getResult__GetPinForEqInterface__EqInterface();

		/**
		 * The meta object literal for the '<em><b>Get Eq Interface For Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_EQ_INTERFACE_FOR_PIN__PIN = eINSTANCE.getResult__GetEqInterfaceForPin__Pin();

		/**
		 * The meta object literal for the '<em><b>Get All Mapped Eq Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___GET_ALL_MAPPED_EQ_INTERFACES__HARDWAREELEMENT = eINSTANCE.getResult__GetAllMappedEqInterfaces__HardwareElement();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULT___COMPARE_TO__RESULT = eINSTANCE.getResult__CompareTo__Result();

		/**
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl <em>Abstract Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getAbstractMetric()
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
		 * The meta object literal for the '{@link ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getEvaluation()
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
		 * The meta object literal for the '<em><b>Metrics Used</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__METRICS_USED = eINSTANCE.getEvaluation_MetricsUsed();

		/**
		 * The meta object literal for the '<em><b>Total Scaled Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__TOTAL_SCALED_SCORE = eINSTANCE.getEvaluation_TotalScaledScore();

		/**
		 * The meta object literal for the '<em>Eq Interface Pin Map Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getEqInterfacePinMapType()
		 * @generated
		 */
		EDataType EQ_INTERFACE_PIN_MAP_TYPE = eINSTANCE.getEqInterfacePinMapType();

		/**
		 * The meta object literal for the '<em>Hardware Element Mappings Map Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getHardwareElementMappingsMapType()
		 * @generated
		 */
		EDataType HARDWARE_ELEMENT_MAPPINGS_MAP_TYPE = eINSTANCE.getHardwareElementMappingsMapType();

		/**
		 * The meta object literal for the '<em>Metric Score Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see ch.hilbri.assist.datamodel.result.mapping.impl.MappingPackageImpl#getMetricScoreMap()
		 * @generated
		 */
		EDataType METRIC_SCORE_MAP = eINSTANCE.getMetricScoreMap();

	}

} //MappingPackage
