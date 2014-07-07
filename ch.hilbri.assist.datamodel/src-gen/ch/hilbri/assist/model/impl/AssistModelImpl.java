/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationGroup;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.CommunicationRelation;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.HardwareElementContainer;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Network;
import ch.hilbri.assist.model.ProximityRelation;

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
 * An implementation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getHardwareContainer <em>Hardware Container</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getProximityRelations <em>Proximity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getCommunicationRelations <em>Communication Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssistModelImpl extends MinimalEObjectImpl.Container implements AssistModel {
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
	 * The cached value of the '{@link #getHardwareContainer() <em>Hardware Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareElementContainer> hardwareContainer;

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
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

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
	 * The cached value of the '{@link #getDissimilarityRelations() <em>Dissimilarity Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissimilarityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DissimilarityRelation> dissimilarityRelations;

	/**
	 * The cached value of the '{@link #getDislocalityRelations() <em>Dislocality Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDislocalityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DislocalityRelation> dislocalityRelations;

	/**
	 * The cached value of the '{@link #getProximityRelations() <em>Proximity Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProximityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProximityRelation> proximityRelations;

	/**
	 * The cached value of the '{@link #getCommunicationRelations() <em>Communication Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRelation> communicationRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ASSIST_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElementContainer> getHardwareContainer() {
		if (hardwareContainer == null) {
			hardwareContainer = new EObjectContainmentEList<HardwareElementContainer>(HardwareElementContainer.class, this, ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER);
		}
		return hardwareContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, ModelPackage.ASSIST_MODEL__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<Application>(Application.class, this, ModelPackage.ASSIST_MODEL__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationGroup> getApplicationGroups() {
		if (applicationGroups == null) {
			applicationGroups = new EObjectContainmentEList<ApplicationGroup>(ApplicationGroup.class, this, ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS);
		}
		return applicationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DissimilarityRelation> getDissimilarityRelations() {
		if (dissimilarityRelations == null) {
			dissimilarityRelations = new EObjectContainmentEList<DissimilarityRelation>(DissimilarityRelation.class, this, ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS);
		}
		return dissimilarityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DislocalityRelation> getDislocalityRelations() {
		if (dislocalityRelations == null) {
			dislocalityRelations = new EObjectContainmentEList<DislocalityRelation>(DislocalityRelation.class, this, ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS);
		}
		return dislocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProximityRelation> getProximityRelations() {
		if (proximityRelations == null) {
			proximityRelations = new EObjectContainmentEList<ProximityRelation>(ProximityRelation.class, this, ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS);
		}
		return proximityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRelation> getCommunicationRelations() {
		if (communicationRelations == null) {
			communicationRelations = new EObjectContainmentEList<CommunicationRelation>(CommunicationRelation.class, this, ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS);
		}
		return communicationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean postProcessingForMapping() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				return ((InternalEList<?>)getHardwareContainer()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				return ((InternalEList<?>)getApplicationGroups()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				return ((InternalEList<?>)getDissimilarityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return ((InternalEList<?>)getDislocalityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				return ((InternalEList<?>)getProximityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				return ((InternalEList<?>)getCommunicationRelations()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				return getSystemName();
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				return getHardwareContainer();
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				return getNetworks();
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				return getApplications();
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				return getApplicationGroups();
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				return getDissimilarityRelations();
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return getDislocalityRelations();
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				return getProximityRelations();
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				return getCommunicationRelations();
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				getHardwareContainer().clear();
				getHardwareContainer().addAll((Collection<? extends HardwareElementContainer>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				getApplicationGroups().addAll((Collection<? extends ApplicationGroup>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				getDissimilarityRelations().clear();
				getDissimilarityRelations().addAll((Collection<? extends DissimilarityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				getDislocalityRelations().addAll((Collection<? extends DislocalityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				getProximityRelations().clear();
				getProximityRelations().addAll((Collection<? extends ProximityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				getCommunicationRelations().clear();
				getCommunicationRelations().addAll((Collection<? extends CommunicationRelation>)newValue);
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				getHardwareContainer().clear();
				return;
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				getNetworks().clear();
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				getApplications().clear();
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				return;
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				getDissimilarityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				getProximityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				getCommunicationRelations().clear();
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				return hardwareContainer != null && !hardwareContainer.isEmpty();
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				return networks != null && !networks.isEmpty();
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				return applicationGroups != null && !applicationGroups.isEmpty();
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				return dissimilarityRelations != null && !dissimilarityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return dislocalityRelations != null && !dislocalityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				return proximityRelations != null && !proximityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				return communicationRelations != null && !communicationRelations.isEmpty();
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
			case ModelPackage.ASSIST_MODEL___POST_PROCESSING_FOR_MAPPING:
				return postProcessingForMapping();
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
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //AssistModelImpl
