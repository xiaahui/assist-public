/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationGroup;
import ch.hilbri.assist.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationGroupImpl#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationGroupImpl extends ApplicationOrApplicationGroupImpl implements ApplicationGroup {
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
	 * The cached value of the '{@link #getApplicationsOrGroups() <em>Applications Or Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationsOrGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationOrApplicationGroup> applicationsOrGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.APPLICATION_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.APPLICATION_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationOrApplicationGroup> getApplicationsOrGroups() {
		if (applicationsOrGroups == null) {
			applicationsOrGroups = new EObjectResolvingEList<ApplicationOrApplicationGroup>(ApplicationOrApplicationGroup.class, this, ModelPackage.APPLICATION_GROUP__APPLICATIONS_OR_GROUPS);
		}
		return applicationsOrGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getAllApplications() {
		BasicEList<Application> list = new BasicEList<Application>();
		EList<ApplicationOrApplicationGroup> _applicationsOrGroups = this.getApplicationsOrGroups();
		for (final ApplicationOrApplicationGroup aog : _applicationsOrGroups) {
			if ((aog instanceof Application)) {
				list.add(((Application)aog));
			}
			else {
				if ((aog instanceof ApplicationGroup)) {
					EList<Application> _allApplications = ((ApplicationGroup)aog).getAllApplications();
					list.addAll(_allApplications);
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
			case ModelPackage.APPLICATION_GROUP__NAME:
				return getName();
			case ModelPackage.APPLICATION_GROUP__APPLICATIONS_OR_GROUPS:
				return getApplicationsOrGroups();
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
			case ModelPackage.APPLICATION_GROUP__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.APPLICATION_GROUP__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
				getApplicationsOrGroups().addAll((Collection<? extends ApplicationOrApplicationGroup>)newValue);
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
			case ModelPackage.APPLICATION_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.APPLICATION_GROUP__APPLICATIONS_OR_GROUPS:
				getApplicationsOrGroups().clear();
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
			case ModelPackage.APPLICATION_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.APPLICATION_GROUP__APPLICATIONS_OR_GROUPS:
				return applicationsOrGroups != null && !applicationsOrGroups.isEmpty();
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
			case ModelPackage.APPLICATION_GROUP___GET_ALL_APPLICATIONS:
				return getAllApplications();
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
		result.append(')');
		return result.toString();
	}

} //ApplicationGroupImpl
