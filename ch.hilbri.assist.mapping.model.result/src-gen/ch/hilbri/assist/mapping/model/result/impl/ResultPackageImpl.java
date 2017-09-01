/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.ModelPackage;

import ch.hilbri.assist.mapping.model.result.AbstractMetric;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.model.result.ResultFactory;
import ch.hilbri.assist.mapping.model.result.ResultPackage;
import ch.hilbri.assist.mapping.model.result.SingleMappingElement;

import java.lang.Comparable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultPackageImpl extends EPackageImpl implements ResultPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricScorePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleMappingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType task2CoreMapTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringListEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResultPackageImpl() {
		super(eNS_URI, ResultFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResultPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResultPackage init() {
		if (isInited) return (ResultPackage)EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);

		// Obtain or create and register package
		ResultPackageImpl theResultPackage = (ResultPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResultPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResultPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResultPackage.createPackageContents();

		// Initialize created meta-data
		theResultPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResultPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResultPackage.eNS_URI, theResultPackage);
		return theResultPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricScorePair() {
		return metricScorePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricScorePair_Key() {
		return (EReference)metricScorePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricScorePair_Value() {
		return (EAttribute)metricScorePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Name() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Index() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_Model() {
		return (EReference)resultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Task2CoreMap() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_MetricAbsoluteScoresMap() {
		return (EReference)resultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_MetricScaledScoresMap() {
		return (EReference)resultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_PartialSolution() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_AbsoluteTotalScore() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_ScaledTotalScore() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetMappedTasksForCore__Core() {
		return resultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetAbsoluteCoreUtilization__Core() {
		return resultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetRelativeCoreUtilization__Core() {
		return resultEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetMappingElements() {
		return resultEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__CompareTo__Result() {
		return resultEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleMappingElement() {
		return singleMappingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleMappingElement_Application() {
		return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleMappingElement_Task() {
		return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleMappingElement_Core() {
		return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleMappingElement_Processor() {
		return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleMappingElement_Board() {
		return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleMappingElement_Box() {
		return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleMappingElement_Compartment() {
		return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMetric() {
		return abstractMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMetric_Name() {
		return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMetric_BuiltIn() {
		return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMetric_HigherScoreIsBetter() {
		return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMetric_Weight() {
		return (EAttribute)abstractMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractMetric__ComputeAbsoluteScore__Result() {
		return abstractMetricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTask2CoreMapType() {
		return task2CoreMapTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringList() {
		return stringListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultFactory getResultFactory() {
		return (ResultFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		comparableEClass = createEClass(COMPARABLE);

		metricScorePairEClass = createEClass(METRIC_SCORE_PAIR);
		createEReference(metricScorePairEClass, METRIC_SCORE_PAIR__KEY);
		createEAttribute(metricScorePairEClass, METRIC_SCORE_PAIR__VALUE);

		resultEClass = createEClass(RESULT);
		createEAttribute(resultEClass, RESULT__NAME);
		createEAttribute(resultEClass, RESULT__INDEX);
		createEReference(resultEClass, RESULT__MODEL);
		createEAttribute(resultEClass, RESULT__TASK2_CORE_MAP);
		createEReference(resultEClass, RESULT__METRIC_ABSOLUTE_SCORES_MAP);
		createEReference(resultEClass, RESULT__METRIC_SCALED_SCORES_MAP);
		createEAttribute(resultEClass, RESULT__PARTIAL_SOLUTION);
		createEAttribute(resultEClass, RESULT__ABSOLUTE_TOTAL_SCORE);
		createEAttribute(resultEClass, RESULT__SCALED_TOTAL_SCORE);
		createEOperation(resultEClass, RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE);
		createEOperation(resultEClass, RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE);
		createEOperation(resultEClass, RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE);
		createEOperation(resultEClass, RESULT___GET_MAPPING_ELEMENTS);
		createEOperation(resultEClass, RESULT___COMPARE_TO__RESULT);

		singleMappingElementEClass = createEClass(SINGLE_MAPPING_ELEMENT);
		createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__APPLICATION);
		createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__TASK);
		createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__CORE);
		createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__PROCESSOR);
		createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__BOARD);
		createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__BOX);
		createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__COMPARTMENT);

		abstractMetricEClass = createEClass(ABSTRACT_METRIC);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__NAME);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__BUILT_IN);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__WEIGHT);
		createEOperation(abstractMetricEClass, ABSTRACT_METRIC___COMPUTE_ABSOLUTE_SCORE__RESULT);

		// Create data types
		task2CoreMapTypeEDataType = createEDataType(TASK2_CORE_MAP_TYPE);
		stringListEDataType = createEDataType(STRING_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resultEClass.getESuperTypes().add(this.getComparable());

		// Initialize classes, features, and operations; add parameters
		initEClass(comparableEClass, Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Comparable<ch.hilbri.assist.mapping.model.result.Result>");

		initEClass(metricScorePairEClass, Map.Entry.class, "MetricScorePair", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricScorePair_Key(), this.getAbstractMetric(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricScorePair_Value(), theEcorePackage.getEDoubleObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResult_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Index(), theEcorePackage.getEInt(), "index", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_Model(), theModelPackage.getAssistModel(), null, "model", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Task2CoreMap(), this.getTask2CoreMapType(), "task2CoreMap", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_MetricAbsoluteScoresMap(), this.getMetricScorePair(), null, "metricAbsoluteScoresMap", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_MetricScaledScoresMap(), this.getMetricScorePair(), null, "metricScaledScoresMap", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_PartialSolution(), theEcorePackage.getEBoolean(), "partialSolution", "false", 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_AbsoluteTotalScore(), theEcorePackage.getEDouble(), "absoluteTotalScore", null, 0, 1, Result.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_ScaledTotalScore(), theEcorePackage.getEDouble(), "scaledTotalScore", null, 0, 1, Result.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getResult__GetMappedTasksForCore__Core(), theModelPackage.getTask(), "getMappedTasksForCore", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelPackage.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResult__GetAbsoluteCoreUtilization__Core(), theEcorePackage.getEInt(), "getAbsoluteCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelPackage.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResult__GetRelativeCoreUtilization__Core(), theEcorePackage.getEDouble(), "getRelativeCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelPackage.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getResult__GetMappingElements(), this.getSingleMappingElement(), "getMappingElements", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResult__CompareTo__Result(), theEcorePackage.getEInt(), "compareTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResult(), "o", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(singleMappingElementEClass, SingleMappingElement.class, "SingleMappingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleMappingElement_Application(), theModelPackage.getApplication(), null, "application", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleMappingElement_Task(), theModelPackage.getTask(), null, "task", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleMappingElement_Core(), theModelPackage.getCore(), null, "core", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleMappingElement_Processor(), theModelPackage.getProcessor(), null, "processor", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleMappingElement_Board(), theModelPackage.getBoard(), null, "board", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleMappingElement_Box(), theModelPackage.getBox(), null, "box", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleMappingElement_Compartment(), theModelPackage.getCompartment(), null, "compartment", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMetricEClass, AbstractMetric.class, "AbstractMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMetric_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMetric_BuiltIn(), theEcorePackage.getEBoolean(), "builtIn", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMetric_HigherScoreIsBetter(), theEcorePackage.getEBoolean(), "higherScoreIsBetter", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMetric_Weight(), theEcorePackage.getEInt(), "weight", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractMetric__ComputeAbsoluteScore__Result(), theEcorePackage.getEDouble(), "computeAbsoluteScore", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResult(), "result", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(task2CoreMapTypeEDataType, HashMap.class, "Task2CoreMapType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.mapping.model.Task, ch.hilbri.assist.mapping.model.Core>");
		initEDataType(stringListEDataType, List.class, "StringList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.String>");

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "GenModel", "http://www.eclipse.org/emf/2002/GenModel"
		   });
	}

} //ResultPackageImpl
