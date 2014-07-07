/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.impl;

import ch.hilbri.assist.result.Application;
import ch.hilbri.assist.result.ApplicationGroup;
import ch.hilbri.assist.result.Board;
import ch.hilbri.assist.result.Box;
import ch.hilbri.assist.result.CommunicationRelation;
import ch.hilbri.assist.result.Compartment;
import ch.hilbri.assist.result.Core;
import ch.hilbri.assist.result.Evaluation;
import ch.hilbri.assist.result.HardwareElement;
import ch.hilbri.assist.result.IOAdapter;
import ch.hilbri.assist.result.IOAdapterRequirement;
import ch.hilbri.assist.result.Network;
import ch.hilbri.assist.result.Processor;
import ch.hilbri.assist.result.Result;
import ch.hilbri.assist.result.ResultFactory;
import ch.hilbri.assist.result.ResultPackage;

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
public class ResultFactoryImpl extends EFactoryImpl implements ResultFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultFactory init() {
		try {
			ResultFactory theResultFactory = (ResultFactory)EPackage.Registry.INSTANCE.getEFactory(ResultPackage.eNS_URI);
			if (theResultFactory != null) {
				return theResultFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultFactoryImpl() {
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
			case ResultPackage.RESULT: return createResult();
			case ResultPackage.HARDWARE_ELEMENT: return createHardwareElement();
			case ResultPackage.COMPARTMENT: return createCompartment();
			case ResultPackage.BOX: return createBox();
			case ResultPackage.BOARD: return createBoard();
			case ResultPackage.PROCESSOR: return createProcessor();
			case ResultPackage.CORE: return createCore();
			case ResultPackage.IO_ADAPTER: return createIOAdapter();
			case ResultPackage.NETWORK: return createNetwork();
			case ResultPackage.APPLICATION_GROUP: return createApplicationGroup();
			case ResultPackage.APPLICATION: return createApplication();
			case ResultPackage.THREAD: return createThread();
			case ResultPackage.IO_ADAPTER_REQUIREMENT: return createIOAdapterRequirement();
			case ResultPackage.COMMUNICATION_RELATION: return createCommunicationRelation();
			case ResultPackage.EVALUATION: return createEvaluation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareElement createHardwareElement() {
		HardwareElementImpl hardwareElement = new HardwareElementImpl();
		return hardwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment createCompartment() {
		CompartmentImpl compartment = new CompartmentImpl();
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOAdapter createIOAdapter() {
		IOAdapterImpl ioAdapter = new IOAdapterImpl();
		return ioAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationGroup createApplicationGroup() {
		ApplicationGroupImpl applicationGroup = new ApplicationGroupImpl();
		return applicationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.result.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOAdapterRequirement createIOAdapterRequirement() {
		IOAdapterRequirementImpl ioAdapterRequirement = new IOAdapterRequirementImpl();
		return ioAdapterRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRelation createCommunicationRelation() {
		CommunicationRelationImpl communicationRelation = new CommunicationRelationImpl();
		return communicationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultPackage getResultPackage() {
		return (ResultPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultPackage getPackage() {
		return ResultPackage.eINSTANCE;
	}

} //ResultFactoryImpl
