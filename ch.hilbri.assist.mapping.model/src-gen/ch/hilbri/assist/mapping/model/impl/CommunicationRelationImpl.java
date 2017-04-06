/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.ApplicationGroup;
import ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.mapping.model.CommunicationRelation;
import ch.hilbri.assist.mapping.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.CommunicationRelationImpl#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.CommunicationRelationImpl#getBandwidthUtilization <em>Bandwidth Utilization</em>}</li>
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
	protected EList<ApplicationOrApplicationGroup> applicationsOrGroups;

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
		return ModelPackage.Literals.COMMUNICATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationOrApplicationGroup> getApplicationsOrGroups() {
		if (applicationsOrGroups == null) {
			applicationsOrGroups = new EObjectResolvingEList<ApplicationOrApplicationGroup>(ApplicationOrApplicationGroup.class, this, ModelPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION, oldBandwidthUtilization, bandwidthUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ch.hilbri.assist.mapping.model.Thread> getAllThreads() {
		BasicEList<ch.hilbri.assist.mapping.model.Thread> list = new BasicEList<ch.hilbri.assist.mapping.model.Thread>();
		EList<ApplicationOrApplicationGroup> _applicationsOrGroups = this.getApplicationsOrGroups();
		for (final ApplicationOrApplicationGroup aog : _applicationsOrGroups) {
			if ((aog instanceof ApplicationGroup)) {
				EList<ch.hilbri.assist.mapping.model.Thread> _allThreads = ((ApplicationGroup)aog).getAllThreads();
				list.addAll(_allThreads);
			}
			else {
				if ((aog instanceof Application)) {
					EList<ch.hilbri.assist.mapping.model.Thread> _threads = ((Application)aog).getThreads();
					list.addAll(_threads);
				}
			}
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				return getApplicationsOrGroups();
			case ModelPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				return getBandwidthUtilization();
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
			case ModelPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
				getApplicationsOrGroups().addAll((Collection<? extends ApplicationOrApplicationGroup>)newValue);
				return;
			case ModelPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				setBandwidthUtilization((Integer)newValue);
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
			case ModelPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
				return;
			case ModelPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				setBandwidthUtilization(BANDWIDTH_UTILIZATION_EDEFAULT);
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
			case ModelPackage.COMMUNICATION_RELATION__APPLICATIONS_OR_GROUPS:
				return applicationsOrGroups != null && !applicationsOrGroups.isEmpty();
			case ModelPackage.COMMUNICATION_RELATION__BANDWIDTH_UTILIZATION:
				return bandwidthUtilization != BANDWIDTH_UTILIZATION_EDEFAULT;
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
			case ModelPackage.COMMUNICATION_RELATION___GET_ALL_THREADS:
				return getAllThreads();
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
		result.append(" (bandwidthUtilization: ");
		result.append(bandwidthUtilization);
		result.append(')');
		return result.toString();
	}

} //CommunicationRelationImpl
