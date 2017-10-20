/**
 */
package ch.hilbri.assist.dse.model.impl;

import ch.hilbri.assist.dse.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.ASSIST_MODEL_DSE: return createAssistModelDSE();
			case ModelPackage.BOX_DSE: return createBoxDSE();
			case ModelPackage.BOARD_ALTERNATIVES: return createBoardAlternatives();
			case ModelPackage.BOARD_ALTERNATIVE: return createBoardAlternative();
			case ModelPackage.APPLICATION_ALTERNATIVES: return createApplicationAlternatives();
			case ModelPackage.APPLICATION_ALTERNATIVE: return createApplicationAlternative();
			case ModelPackage.RESTRICTION_ALTERNATIVES: return createRestrictionAlternatives();
			case ModelPackage.RESTRICTION_ALTERNATIVE: return createRestrictionAlternative();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModelDSE createAssistModelDSE() {
		AssistModelDSEImpl assistModelDSE = new AssistModelDSEImpl();
		return assistModelDSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxDSE createBoxDSE() {
		BoxDSEImpl boxDSE = new BoxDSEImpl();
		return boxDSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardAlternatives createBoardAlternatives() {
		BoardAlternativesImpl boardAlternatives = new BoardAlternativesImpl();
		return boardAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardAlternative createBoardAlternative() {
		BoardAlternativeImpl boardAlternative = new BoardAlternativeImpl();
		return boardAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAlternatives createApplicationAlternatives() {
		ApplicationAlternativesImpl applicationAlternatives = new ApplicationAlternativesImpl();
		return applicationAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAlternative createApplicationAlternative() {
		ApplicationAlternativeImpl applicationAlternative = new ApplicationAlternativeImpl();
		return applicationAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionAlternatives createRestrictionAlternatives() {
		RestrictionAlternativesImpl restrictionAlternatives = new RestrictionAlternativesImpl();
		return restrictionAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionAlternative createRestrictionAlternative() {
		RestrictionAlternativeImpl restrictionAlternative = new RestrictionAlternativeImpl();
		return restrictionAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
