/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.ProximityRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proximity Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ProximityRelationImpl#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ProximityRelationImpl#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProximityRelationImpl extends MinimalEObjectImpl.Container implements ProximityRelation {
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
	 * The default value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareArchitectureLevelType HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

	/**
	 * The cached value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected HardwareArchitectureLevelType hardwareLevel = HARDWARE_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProximityRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROXIMITY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationOrApplicationGroup> getApplicationsOrGroups() {
		if (applicationsOrGroups == null) {
			applicationsOrGroups = new EObjectResolvingEList<ApplicationOrApplicationGroup>(ApplicationOrApplicationGroup.class, this, ModelPackage.PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS);
		}
		return applicationsOrGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getHardwareLevel() {
		return hardwareLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareLevel(HardwareArchitectureLevelType newHardwareLevel) {
		HardwareArchitectureLevelType oldHardwareLevel = hardwareLevel;
		hardwareLevel = newHardwareLevel == null ? HARDWARE_LEVEL_EDEFAULT : newHardwareLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROXIMITY_RELATION__HARDWARE_LEVEL, oldHardwareLevel, hardwareLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS:
				return getApplicationsOrGroups();
			case ModelPackage.PROXIMITY_RELATION__HARDWARE_LEVEL:
				return getHardwareLevel();
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
			case ModelPackage.PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
				getApplicationsOrGroups().addAll((Collection<? extends ApplicationOrApplicationGroup>)newValue);
				return;
			case ModelPackage.PROXIMITY_RELATION__HARDWARE_LEVEL:
				setHardwareLevel((HardwareArchitectureLevelType)newValue);
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
			case ModelPackage.PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
				return;
			case ModelPackage.PROXIMITY_RELATION__HARDWARE_LEVEL:
				setHardwareLevel(HARDWARE_LEVEL_EDEFAULT);
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
			case ModelPackage.PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS:
				return applicationsOrGroups != null && !applicationsOrGroups.isEmpty();
			case ModelPackage.PROXIMITY_RELATION__HARDWARE_LEVEL:
				return hardwareLevel != HARDWARE_LEVEL_EDEFAULT;
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
		result.append(" (hardwareLevel: ");
		result.append(hardwareLevel);
		result.append(')');
		return result.toString();
	}

} //ProximityRelationImpl
