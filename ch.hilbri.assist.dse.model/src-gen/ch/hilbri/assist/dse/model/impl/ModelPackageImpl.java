/**
 */
package ch.hilbri.assist.dse.model.impl;

import ch.hilbri.assist.dse.model.ApplicationAlternative;
import ch.hilbri.assist.dse.model.ApplicationAlternatives;
import ch.hilbri.assist.dse.model.AssistModelDSE;
import ch.hilbri.assist.dse.model.BoardAlternative;
import ch.hilbri.assist.dse.model.BoardAlternatives;
import ch.hilbri.assist.dse.model.BoxDSE;
import ch.hilbri.assist.dse.model.ExplorationCandidate;
import ch.hilbri.assist.dse.model.ModelFactory;
import ch.hilbri.assist.dse.model.ModelPackage;
import ch.hilbri.assist.dse.model.RestrictionAlternative;
import ch.hilbri.assist.dse.model.RestrictionAlternatives;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assistModelDSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxDSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardAlternativesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAlternativesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionAlternativesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explorationCandidateEClass = null;

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
	 * @see ch.hilbri.assist.dse.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ch.hilbri.assist.mapping.model.ModelPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssistModelDSE() {
		return assistModelDSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModelDSE_ApplicationAlternatives() {
		return (EReference)assistModelDSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModelDSE_RestrictionAlternatives() {
		return (EReference)assistModelDSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssistModelDSE_ExplorationCandidates() {
		return (EReference)assistModelDSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoxDSE() {
		return boxDSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxDSE_BoardAlternatives() {
		return (EReference)boxDSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardAlternatives() {
		return boardAlternativesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoardAlternatives_Alternatives() {
		return (EReference)boardAlternativesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoardAlternative() {
		return boardAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoardAlternative_Name() {
		return (EAttribute)boardAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoardAlternative_Boards() {
		return (EReference)boardAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAlternatives() {
		return applicationAlternativesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationAlternatives_Alternatives() {
		return (EReference)applicationAlternativesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAlternative() {
		return applicationAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationAlternative_Name() {
		return (EAttribute)applicationAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationAlternative_Applications() {
		return (EReference)applicationAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionAlternatives() {
		return restrictionAlternativesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionAlternatives_Alternatives() {
		return (EReference)restrictionAlternativesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionAlternative() {
		return restrictionAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictionAlternative_Name() {
		return (EAttribute)restrictionAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionAlternative_DislocalityRelations() {
		return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionAlternative_ColocalityRelations() {
		return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplorationCandidate() {
		return explorationCandidateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExplorationCandidate_Name() {
		return (EAttribute)explorationCandidateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplorationCandidate_BoardAlternatives() {
		return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplorationCandidate_ApplicationAlternatives() {
		return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplorationCandidate_RestrictionAlternatives() {
		return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		assistModelDSEEClass = createEClass(ASSIST_MODEL_DSE);
		createEReference(assistModelDSEEClass, ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES);
		createEReference(assistModelDSEEClass, ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES);
		createEReference(assistModelDSEEClass, ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES);

		boxDSEEClass = createEClass(BOX_DSE);
		createEReference(boxDSEEClass, BOX_DSE__BOARD_ALTERNATIVES);

		boardAlternativesEClass = createEClass(BOARD_ALTERNATIVES);
		createEReference(boardAlternativesEClass, BOARD_ALTERNATIVES__ALTERNATIVES);

		boardAlternativeEClass = createEClass(BOARD_ALTERNATIVE);
		createEAttribute(boardAlternativeEClass, BOARD_ALTERNATIVE__NAME);
		createEReference(boardAlternativeEClass, BOARD_ALTERNATIVE__BOARDS);

		applicationAlternativesEClass = createEClass(APPLICATION_ALTERNATIVES);
		createEReference(applicationAlternativesEClass, APPLICATION_ALTERNATIVES__ALTERNATIVES);

		applicationAlternativeEClass = createEClass(APPLICATION_ALTERNATIVE);
		createEAttribute(applicationAlternativeEClass, APPLICATION_ALTERNATIVE__NAME);
		createEReference(applicationAlternativeEClass, APPLICATION_ALTERNATIVE__APPLICATIONS);

		restrictionAlternativesEClass = createEClass(RESTRICTION_ALTERNATIVES);
		createEReference(restrictionAlternativesEClass, RESTRICTION_ALTERNATIVES__ALTERNATIVES);

		restrictionAlternativeEClass = createEClass(RESTRICTION_ALTERNATIVE);
		createEAttribute(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__NAME);
		createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS);
		createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS);

		explorationCandidateEClass = createEClass(EXPLORATION_CANDIDATE);
		createEAttribute(explorationCandidateEClass, EXPLORATION_CANDIDATE__NAME);
		createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES);
		createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES);
		createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES);
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
		ch.hilbri.assist.mapping.model.ModelPackage theModelPackage_1 = (ch.hilbri.assist.mapping.model.ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ch.hilbri.assist.mapping.model.ModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assistModelDSEEClass.getESuperTypes().add(theModelPackage_1.getAssistModelMapping());
		boxDSEEClass.getESuperTypes().add(theModelPackage_1.getBox());

		// Initialize classes, features, and operations; add parameters
		initEClass(assistModelDSEEClass, AssistModelDSE.class, "AssistModelDSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssistModelDSE_ApplicationAlternatives(), this.getApplicationAlternatives(), null, "applicationAlternatives", null, 0, -1, AssistModelDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModelDSE_RestrictionAlternatives(), this.getRestrictionAlternatives(), null, "restrictionAlternatives", null, 0, -1, AssistModelDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssistModelDSE_ExplorationCandidates(), this.getExplorationCandidate(), null, "explorationCandidates", null, 0, -1, AssistModelDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boxDSEEClass, BoxDSE.class, "BoxDSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoxDSE_BoardAlternatives(), this.getBoardAlternatives(), null, "boardAlternatives", null, 0, -1, BoxDSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardAlternativesEClass, BoardAlternatives.class, "BoardAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoardAlternatives_Alternatives(), this.getBoardAlternative(), null, "alternatives", null, 0, -1, BoardAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardAlternativeEClass, BoardAlternative.class, "BoardAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoardAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, BoardAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoardAlternative_Boards(), theModelPackage_1.getBoard(), null, "boards", null, 0, -1, BoardAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationAlternativesEClass, ApplicationAlternatives.class, "ApplicationAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationAlternatives_Alternatives(), this.getApplicationAlternative(), null, "alternatives", null, 0, -1, ApplicationAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationAlternativeEClass, ApplicationAlternative.class, "ApplicationAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ApplicationAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationAlternative_Applications(), theModelPackage_1.getApplication(), null, "applications", null, 0, -1, ApplicationAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionAlternativesEClass, RestrictionAlternatives.class, "RestrictionAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestrictionAlternatives_Alternatives(), this.getRestrictionAlternative(), null, "alternatives", null, 0, -1, RestrictionAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionAlternativeEClass, RestrictionAlternative.class, "RestrictionAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestrictionAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionAlternative_DislocalityRelations(), theModelPackage_1.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionAlternative_ColocalityRelations(), theModelPackage_1.getColocalityRelation(), null, "colocalityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(explorationCandidateEClass, ExplorationCandidate.class, "ExplorationCandidate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExplorationCandidate_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplorationCandidate_BoardAlternatives(), this.getBoardAlternative(), null, "boardAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplorationCandidate_ApplicationAlternatives(), this.getApplicationAlternative(), null, "applicationAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplorationCandidate_RestrictionAlternatives(), this.getRestrictionAlternative(), null, "restrictionAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //ModelPackageImpl
