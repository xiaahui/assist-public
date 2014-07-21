/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping.impl;

import ch.hilbri.assist.result.mapping.AbstractMetric;
import ch.hilbri.assist.result.mapping.Application;
import ch.hilbri.assist.result.mapping.ApplicationGroup;
import ch.hilbri.assist.result.mapping.Board;
import ch.hilbri.assist.result.mapping.Box;
import ch.hilbri.assist.result.mapping.CommunicationRelation;
import ch.hilbri.assist.result.mapping.Compartment;
import ch.hilbri.assist.result.mapping.Core;
import ch.hilbri.assist.result.mapping.Evaluation;
import ch.hilbri.assist.result.mapping.HardwareElement;
import ch.hilbri.assist.result.mapping.IOAdapter;
import ch.hilbri.assist.result.mapping.IOAdapterRequirement;
import ch.hilbri.assist.result.mapping.MappingFactory;
import ch.hilbri.assist.result.mapping.MappingPackage;
import ch.hilbri.assist.result.mapping.Network;
import ch.hilbri.assist.result.mapping.Processor;
import ch.hilbri.assist.result.mapping.Result;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingFactory init() {
		try {
			MappingFactory theMappingFactory = (MappingFactory)EPackage.Registry.INSTANCE.getEFactory(MappingPackage.eNS_URI);
			if (theMappingFactory != null) {
				return theMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactoryImpl() {
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
			case MappingPackage.RESULT: return createResult();
			case MappingPackage.HARDWARE_ELEMENT: return createHardwareElement();
			case MappingPackage.COMPARTMENT: return createCompartment();
			case MappingPackage.BOX: return createBox();
			case MappingPackage.BOARD: return createBoard();
			case MappingPackage.PROCESSOR: return createProcessor();
			case MappingPackage.CORE: return createCore();
			case MappingPackage.IO_ADAPTER: return createIOAdapter();
			case MappingPackage.NETWORK: return createNetwork();
			case MappingPackage.APPLICATION_GROUP: return createApplicationGroup();
			case MappingPackage.APPLICATION: return createApplication();
			case MappingPackage.THREAD: return createThread();
			case MappingPackage.IO_ADAPTER_REQUIREMENT: return createIOAdapterRequirement();
			case MappingPackage.COMMUNICATION_RELATION: return createCommunicationRelation();
			case MappingPackage.ABSTRACT_METRIC: return createAbstractMetric();
			case MappingPackage.EVALUATION: return createEvaluation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MappingPackage.METRIC_SCORE_MAP:
				return createMetricScoreMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MappingPackage.METRIC_SCORE_MAP:
				return convertMetricScoreMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public ch.hilbri.assist.result.mapping.Thread createThread() {
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
	public AbstractMetric createAbstractMetric() {
		AbstractMetricImpl abstractMetric = new AbstractMetricImpl();
		return abstractMetric;
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
	@SuppressWarnings("unchecked")
	public HashMap<AbstractMetric, Double> createMetricScoreMapFromString(EDataType eDataType, String initialValue) {
		return (HashMap<AbstractMetric, Double>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricScoreMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingPackage getMappingPackage() {
		return (MappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappingPackage getPackage() {
		return MappingPackage.eINSTANCE;
	}

} //MappingFactoryImpl
