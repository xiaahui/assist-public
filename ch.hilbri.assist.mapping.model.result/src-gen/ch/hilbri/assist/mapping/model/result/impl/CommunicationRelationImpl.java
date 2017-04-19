/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.result.Application;
import ch.hilbri.assist.mapping.model.result.CommunicationRelation;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.CommunicationRelationImpl#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.CommunicationRelationImpl#getBandwidthUtilization <em>Bandwidth Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.CommunicationRelationImpl#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationRelationImpl extends MinimalEObjectImpl.Container implements CommunicationRelation {
	/**
	 * The cached value of the '{@link #getApplicationsOrGroups() <em>Applications Or Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationsOrGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applicationsOrGroups;

	/**
	 * The default value of the '{@link #getBandwidthUtilization() <em>Bandwidth Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int BANDWIDTH_UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBandwidthUtilization() <em>Bandwidth Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthUtilization()
	 * @generated
	 * @ordered
	 */
	protected int bandwidthUtilization = BANDWIDTH_UTILIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceObject() <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceObject()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.mapping.model.CommunicationRelation referenceObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.COMMUNICATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplicationsOrGroups() {
		if (applicationsOrGroups == null) {
			applicationsOrGroups = new EObjectResolvingEList<Application>(Application.class, this, ResultPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS);
		}
		return applicationsOrGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBandwidthUtilization() {
		return bandwidthUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidthUtilization(int newBandwidthUtilization) {
		int oldBandwidthUtilization = bandwidthUtilization;
		bandwidthUtilization = newBandwidthUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION, oldBandwidthUtilization, bandwidthUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.CommunicationRelation getReferenceObject() {
		if (referenceObject != null && referenceObject.eIsProxy()) {
			InternalEObject oldReferenceObject = (InternalEObject)referenceObject;
			referenceObject = (ch.hilbri.assist.mapping.model.CommunicationRelation)eResolveProxy(oldReferenceObject);
			if (referenceObject != oldReferenceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.COMMUNICATION_RELATION__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
			}
		}
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.CommunicationRelation basicGetReferenceObject() {
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceObject(ch.hilbri.assist.mapping.model.CommunicationRelation newReferenceObject) {
		ch.hilbri.assist.mapping.model.CommunicationRelation oldReferenceObject = referenceObject;
		referenceObject = newReferenceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.COMMUNICATION_RELATION__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				return getApplicationsOrGroups();
			case ResultPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				return getBandwidthUtilization();
			case ResultPackage.COMMUNICATION_RELATION__REFERENCE_OBJECT:
				if (resolve) return getReferenceObject();
				return basicGetReferenceObject();
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
			case ResultPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
				getApplicationsOrGroups().addAll((Collection<? extends Application>)newValue);
				return;
			case ResultPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				setBandwidthUtilization((Integer)newValue);
				return;
			case ResultPackage.COMMUNICATION_RELATION__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.CommunicationRelation)newValue);
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
			case ResultPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
				return;
			case ResultPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				setBandwidthUtilization(BANDWIDTH_UTILIZATION_EDEFAULT);
				return;
			case ResultPackage.COMMUNICATION_RELATION__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.CommunicationRelation)null);
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
			case ResultPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				return applicationsOrGroups != null && !applicationsOrGroups.isEmpty();
			case ResultPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				return bandwidthUtilization != BANDWIDTH_UTILIZATION_EDEFAULT;
			case ResultPackage.COMMUNICATION_RELATION__REFERENCE_OBJECT:
				return referenceObject != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (bandwidthUtilization: ");
		result.append(bandwidthUtilization);
		result.append(')');
		return result.toString();
	}

} //CommunicationRelationImpl
