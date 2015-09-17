/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.model.ModelPackage;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.datamodel.result.mapping.Evaluation;
import ch.hilbri.assist.datamodel.result.mapping.MappingFactory;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;
import ch.hilbri.assist.datamodel.result.mapping.Result;

import java.lang.Comparable;

import java.util.HashMap;

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
public class MappingPackageImpl extends EPackageImpl implements MappingPackage {
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
	private EClass resultEClass = null;

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
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eqInterfacePinMapTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType metricScoreMapEDataType = null;

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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappingPackageImpl() {
		super(eNS_URI, MappingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappingPackage init() {
		if (isInited) return (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Obtain or create and register package
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappingPackage.eNS_URI, theMappingPackage);
		return theMappingPackage;
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
	public EReference getResult_Model() {
		return (EReference)resultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Mapping() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_PartialSolution() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_Evaluation() {
		return (EReference)resultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetAllUnmappedEqInterfaces() {
		return resultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetCompletenessAsPercentage() {
		return resultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetPinForEqInterface__EqInterface() {
		return resultEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResult__GetEqInterfaceForPin__Pin() {
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
	public EAttribute getAbstractMetric_Weight() {
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
	public EAttribute getAbstractMetric_BuiltIn() {
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
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_AbsoluteScores() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_ScaledScores() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_MetricsUsed() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_TotalScaledScore() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEqInterfacePinMapType() {
		return eqInterfacePinMapTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMetricScoreMap() {
		return metricScoreMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactory getMappingFactory() {
		return (MappingFactory)getEFactoryInstance();
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

		resultEClass = createEClass(RESULT);
		createEAttribute(resultEClass, RESULT__NAME);
		createEReference(resultEClass, RESULT__MODEL);
		createEAttribute(resultEClass, RESULT__MAPPING);
		createEAttribute(resultEClass, RESULT__PARTIAL_SOLUTION);
		createEReference(resultEClass, RESULT__EVALUATION);
		createEOperation(resultEClass, RESULT___GET_ALL_UNMAPPED_EQ_INTERFACES);
		createEOperation(resultEClass, RESULT___GET_COMPLETENESS_AS_PERCENTAGE);
		createEOperation(resultEClass, RESULT___GET_PIN_FOR_EQ_INTERFACE__EQINTERFACE);
		createEOperation(resultEClass, RESULT___GET_EQ_INTERFACE_FOR_PIN__PIN);
		createEOperation(resultEClass, RESULT___COMPARE_TO__RESULT);

		abstractMetricEClass = createEClass(ABSTRACT_METRIC);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__NAME);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__WEIGHT);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER);
		createEAttribute(abstractMetricEClass, ABSTRACT_METRIC__BUILT_IN);
		createEOperation(abstractMetricEClass, ABSTRACT_METRIC___COMPUTE_ABSOLUTE_SCORE__RESULT);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__ABSOLUTE_SCORES);
		createEAttribute(evaluationEClass, EVALUATION__SCALED_SCORES);
		createEReference(evaluationEClass, EVALUATION__METRICS_USED);
		createEAttribute(evaluationEClass, EVALUATION__TOTAL_SCALED_SCORE);

		// Create data types
		eqInterfacePinMapTypeEDataType = createEDataType(EQ_INTERFACE_PIN_MAP_TYPE);
		metricScoreMapEDataType = createEDataType(METRIC_SCORE_MAP);
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
		initEClass(comparableEClass, Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Comparable<ch.hilbri.assist.datamodel.result.mapping.Result>");

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResult_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_Model(), theModelPackage.getAssistModel(), null, "model", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Mapping(), this.getEqInterfacePinMapType(), "mapping", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_PartialSolution(), theEcorePackage.getEBoolean(), "partialSolution", "false", 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_Evaluation(), this.getEvaluation(), null, "evaluation", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResult__GetAllUnmappedEqInterfaces(), theModelPackage.getEqInterface(), "getAllUnmappedEqInterfaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getResult__GetCompletenessAsPercentage(), theEcorePackage.getEDouble(), "getCompletenessAsPercentage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getResult__GetPinForEqInterface__EqInterface(), theModelPackage.getPin(), "getPinForEqInterface", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelPackage.getEqInterface(), "iface", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResult__GetEqInterfaceForPin__Pin(), theModelPackage.getEqInterface(), "getEqInterfaceForPin", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelPackage.getPin(), "p", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResult__CompareTo__Result(), theEcorePackage.getEInt(), "compareTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResult(), "o", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractMetricEClass, AbstractMetric.class, "AbstractMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMetric_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMetric_Weight(), theEcorePackage.getEInt(), "weight", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMetric_HigherScoreIsBetter(), theEcorePackage.getEBoolean(), "higherScoreIsBetter", null, 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMetric_BuiltIn(), theEcorePackage.getEBoolean(), "builtIn", "false", 0, 1, AbstractMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractMetric__ComputeAbsoluteScore__Result(), theEcorePackage.getEDouble(), "computeAbsoluteScore", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResult(), "result", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_AbsoluteScores(), this.getMetricScoreMap(), "absoluteScores", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_ScaledScores(), this.getMetricScoreMap(), "scaledScores", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_MetricsUsed(), this.getAbstractMetric(), null, "metricsUsed", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_TotalScaledScore(), theEcorePackage.getEDouble(), "totalScaledScore", null, 0, 1, Evaluation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eqInterfacePinMapTypeEDataType, HashMap.class, "EqInterfacePinMapType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.datamodel.model.EqInterface, ch.hilbri.assist.datamodel.model.Pin>");
		initEDataType(metricScoreMapEDataType, HashMap.class, "MetricScoreMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.datamodel.result.mapping.AbstractMetric, java.lang.Double>");

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

} //MappingPackageImpl
