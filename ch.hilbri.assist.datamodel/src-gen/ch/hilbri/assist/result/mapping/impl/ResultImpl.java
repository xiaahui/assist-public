/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping.impl;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;

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
import ch.hilbri.assist.result.mapping.MappingPackage;
import ch.hilbri.assist.result.mapping.Network;
import ch.hilbri.assist.result.mapping.Processor;
import ch.hilbri.assist.result.mapping.Result;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getRootHardwareElements <em>Root Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getTopHardwareLevel <em>Top Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getBottomHardwareLevel <em>Bottom Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getIoAdapters <em>Io Adapters</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getCommunications <em>Communications</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ResultImpl#getAssistModel <em>Assist Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootHardwareElements() <em>Root Hardware Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootHardwareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareElement> rootHardwareElements;

	/**
	 * The default value of the '{@link #getTopHardwareLevel() <em>Top Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareArchitectureLevelType TOP_HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

	/**
	 * The default value of the '{@link #getBottomHardwareLevel() <em>Bottom Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareArchitectureLevelType BOTTOM_HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

	/**
	 * The cached value of the '{@link #getIoAdapters() <em>Io Adapters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoAdapters()
	 * @generated
	 * @ordered
	 */
	protected EList<IOAdapter> ioAdapters;

	/**
	 * The cached value of the '{@link #getApplicationGroups() <em>Application Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationGroup> applicationGroups;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<ch.hilbri.assist.result.mapping.Thread> threads;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRelation> communications;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Evaluation evaluation;

	/**
	 * The cached value of the '{@link #getAssistModel() <em>Assist Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistModel()
	 * @generated
	 * @ordered
	 */
	protected AssistModel assistModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getRootHardwareElements() {
		if (rootHardwareElements == null) {
			rootHardwareElements = new EObjectContainmentEList<HardwareElement>(HardwareElement.class, this, MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS);
		}
		return rootHardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getTopHardwareLevel() {
		HardwareArchitectureLevelType _xifexpression = null;
		EList<HardwareElement> _rootHardwareElements = this.getRootHardwareElements();
		boolean _isEmpty = _rootHardwareElements.isEmpty();
		boolean _not = (!_isEmpty);
		if (_not) {
			HardwareArchitectureLevelType _switchResult = null;
			EList<HardwareElement> _rootHardwareElements_1 = this.getRootHardwareElements();
			HardwareElement _get = _rootHardwareElements_1.get(0);
			boolean _matched = false;
			if (!_matched) {
				if (_get instanceof Compartment) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.COMPARTMENT;
				}
			}
			if (!_matched) {
				if (_get instanceof Box) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.BOX;
				}
			}
			if (!_matched) {
				if (_get instanceof Board) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.BOARD;
				}
			}
			if (!_matched) {
				if (_get instanceof Processor) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.PROCESSOR;
				}
			}
			if (!_matched) {
				if (_get instanceof Core) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.CORE;
				}
			}
			_xifexpression = _switchResult;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getBottomHardwareLevel() {
		return HardwareArchitectureLevelType.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOAdapter> getIoAdapters() {
		if (ioAdapters == null) {
			ioAdapters = new EObjectContainmentEList<IOAdapter>(IOAdapter.class, this, MappingPackage.RESULT__IO_ADAPTERS);
		}
		return ioAdapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationGroup> getApplicationGroups() {
		if (applicationGroups == null) {
			applicationGroups = new EObjectContainmentEList<ApplicationGroup>(ApplicationGroup.class, this, MappingPackage.RESULT__APPLICATION_GROUPS);
		}
		return applicationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<Application>(Application.class, this, MappingPackage.RESULT__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ch.hilbri.assist.result.mapping.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectContainmentEList<ch.hilbri.assist.result.mapping.Thread>(ch.hilbri.assist.result.mapping.Thread.class, this, MappingPackage.RESULT__THREADS);
		}
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, MappingPackage.RESULT__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRelation> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<CommunicationRelation>(CommunicationRelation.class, this, MappingPackage.RESULT__COMMUNICATIONS);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluation(Evaluation newEvaluation, NotificationChain msgs) {
		Evaluation oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__EVALUATION, oldEvaluation, newEvaluation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Evaluation newEvaluation) {
		if (newEvaluation != evaluation) {
			NotificationChain msgs = null;
			if (evaluation != null)
				msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.RESULT__EVALUATION, null, msgs);
			if (newEvaluation != null)
				msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.RESULT__EVALUATION, null, msgs);
			msgs = basicSetEvaluation(newEvaluation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__EVALUATION, newEvaluation, newEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModel getAssistModel() {
		if (assistModel != null && assistModel.eIsProxy()) {
			InternalEObject oldAssistModel = (InternalEObject)assistModel;
			assistModel = (AssistModel)eResolveProxy(oldAssistModel);
			if (assistModel != oldAssistModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.RESULT__ASSIST_MODEL, oldAssistModel, assistModel));
			}
		}
		return assistModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModel basicGetAssistModel() {
		return assistModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssistModel(AssistModel newAssistModel) {
		AssistModel oldAssistModel = assistModel;
		assistModel = newAssistModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__ASSIST_MODEL, oldAssistModel, assistModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int compareTo(final Result o) {
		Evaluation _evaluation = null;
		if (this!=null) {
			_evaluation=this.getEvaluation();
		}
		double _totalScore = _evaluation.getTotalScore();
		Evaluation _evaluation_1 = null;
		if (o!=null) {
			_evaluation_1=o.getEvaluation();
		}
		double _totalScore_1 = _evaluation_1.getTotalScore();
		final double diff = (_totalScore - _totalScore_1);
		if ((diff < 0.0)) {
			return 1;
		}
		if ((diff > 0.0)) {
			return (-1);
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				return ((InternalEList<?>)getRootHardwareElements()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__IO_ADAPTERS:
				return ((InternalEList<?>)getIoAdapters()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				return ((InternalEList<?>)getApplicationGroups()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__COMMUNICATIONS:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__EVALUATION:
				return basicSetEvaluation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.RESULT__NAME:
				return getName();
			case MappingPackage.RESULT__SYSTEM_NAME:
				return getSystemName();
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				return getRootHardwareElements();
			case MappingPackage.RESULT__TOP_HARDWARE_LEVEL:
				return getTopHardwareLevel();
			case MappingPackage.RESULT__BOTTOM_HARDWARE_LEVEL:
				return getBottomHardwareLevel();
			case MappingPackage.RESULT__IO_ADAPTERS:
				return getIoAdapters();
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				return getApplicationGroups();
			case MappingPackage.RESULT__APPLICATIONS:
				return getApplications();
			case MappingPackage.RESULT__THREADS:
				return getThreads();
			case MappingPackage.RESULT__NETWORKS:
				return getNetworks();
			case MappingPackage.RESULT__COMMUNICATIONS:
				return getCommunications();
			case MappingPackage.RESULT__EVALUATION:
				return getEvaluation();
			case MappingPackage.RESULT__ASSIST_MODEL:
				if (resolve) return getAssistModel();
				return basicGetAssistModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.RESULT__NAME:
				setName((String)newValue);
				return;
			case MappingPackage.RESULT__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				getRootHardwareElements().clear();
				getRootHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
				return;
			case MappingPackage.RESULT__IO_ADAPTERS:
				getIoAdapters().clear();
				getIoAdapters().addAll((Collection<? extends IOAdapter>)newValue);
				return;
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				getApplicationGroups().addAll((Collection<? extends ApplicationGroup>)newValue);
				return;
			case MappingPackage.RESULT__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case MappingPackage.RESULT__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ch.hilbri.assist.result.mapping.Thread>)newValue);
				return;
			case MappingPackage.RESULT__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case MappingPackage.RESULT__COMMUNICATIONS:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends CommunicationRelation>)newValue);
				return;
			case MappingPackage.RESULT__EVALUATION:
				setEvaluation((Evaluation)newValue);
				return;
			case MappingPackage.RESULT__ASSIST_MODEL:
				setAssistModel((AssistModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingPackage.RESULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MappingPackage.RESULT__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				getRootHardwareElements().clear();
				return;
			case MappingPackage.RESULT__IO_ADAPTERS:
				getIoAdapters().clear();
				return;
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				return;
			case MappingPackage.RESULT__APPLICATIONS:
				getApplications().clear();
				return;
			case MappingPackage.RESULT__THREADS:
				getThreads().clear();
				return;
			case MappingPackage.RESULT__NETWORKS:
				getNetworks().clear();
				return;
			case MappingPackage.RESULT__COMMUNICATIONS:
				getCommunications().clear();
				return;
			case MappingPackage.RESULT__EVALUATION:
				setEvaluation((Evaluation)null);
				return;
			case MappingPackage.RESULT__ASSIST_MODEL:
				setAssistModel((AssistModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.RESULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MappingPackage.RESULT__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				return rootHardwareElements != null && !rootHardwareElements.isEmpty();
			case MappingPackage.RESULT__TOP_HARDWARE_LEVEL:
				return getTopHardwareLevel() != TOP_HARDWARE_LEVEL_EDEFAULT;
			case MappingPackage.RESULT__BOTTOM_HARDWARE_LEVEL:
				return getBottomHardwareLevel() != BOTTOM_HARDWARE_LEVEL_EDEFAULT;
			case MappingPackage.RESULT__IO_ADAPTERS:
				return ioAdapters != null && !ioAdapters.isEmpty();
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				return applicationGroups != null && !applicationGroups.isEmpty();
			case MappingPackage.RESULT__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case MappingPackage.RESULT__THREADS:
				return threads != null && !threads.isEmpty();
			case MappingPackage.RESULT__NETWORKS:
				return networks != null && !networks.isEmpty();
			case MappingPackage.RESULT__COMMUNICATIONS:
				return communications != null && !communications.isEmpty();
			case MappingPackage.RESULT__EVALUATION:
				return evaluation != null;
			case MappingPackage.RESULT__ASSIST_MODEL:
				return assistModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MappingPackage.RESULT___COMPARE_TO__RESULT:
				return compareTo((Result)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
