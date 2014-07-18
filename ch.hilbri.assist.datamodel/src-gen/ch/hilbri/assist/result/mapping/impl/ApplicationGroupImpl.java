/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping.impl;

import ch.hilbri.assist.result.mapping.Application;
import ch.hilbri.assist.result.mapping.ApplicationGroup;
import ch.hilbri.assist.result.mapping.MappingPackage;

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
 * An implementation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ApplicationGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ApplicationGroupImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ApplicationGroupImpl#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.impl.ApplicationGroupImpl#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationGroupImpl extends MinimalEObjectImpl.Container implements ApplicationGroup {
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
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getApplicationGroups() <em>Application Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationGroup> applicationGroups;

	/**
	 * The cached value of the '{@link #getReferenceObject() <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceObject()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.model.ApplicationGroup referenceObject;

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
		return MappingPackage.Literals.APPLICATION_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.APPLICATION_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectResolvingEList<Application>(Application.class, this, MappingPackage.APPLICATION_GROUP__APPLICATIONS);
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
			applicationGroups = new EObjectResolvingEList<ApplicationGroup>(ApplicationGroup.class, this, MappingPackage.APPLICATION_GROUP__APPLICATION_GROUPS);
		}
		return applicationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.model.ApplicationGroup getReferenceObject() {
		if (referenceObject != null && referenceObject.eIsProxy()) {
			InternalEObject oldReferenceObject = (InternalEObject)referenceObject;
			referenceObject = (ch.hilbri.assist.model.ApplicationGroup)eResolveProxy(oldReferenceObject);
			if (referenceObject != oldReferenceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.APPLICATION_GROUP__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
			}
		}
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.model.ApplicationGroup basicGetReferenceObject() {
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceObject(ch.hilbri.assist.model.ApplicationGroup newReferenceObject) {
		ch.hilbri.assist.model.ApplicationGroup oldReferenceObject = referenceObject;
		referenceObject = newReferenceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.APPLICATION_GROUP__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.APPLICATION_GROUP__NAME:
				return getName();
			case MappingPackage.APPLICATION_GROUP__APPLICATIONS:
				return getApplications();
			case MappingPackage.APPLICATION_GROUP__APPLICATION_GROUPS:
				return getApplicationGroups();
			case MappingPackage.APPLICATION_GROUP__REFERENCE_OBJECT:
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
			case MappingPackage.APPLICATION_GROUP__NAME:
				setName((String)newValue);
				return;
			case MappingPackage.APPLICATION_GROUP__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case MappingPackage.APPLICATION_GROUP__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				getApplicationGroups().addAll((Collection<? extends ApplicationGroup>)newValue);
				return;
			case MappingPackage.APPLICATION_GROUP__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.model.ApplicationGroup)newValue);
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
			case MappingPackage.APPLICATION_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MappingPackage.APPLICATION_GROUP__APPLICATIONS:
				getApplications().clear();
				return;
			case MappingPackage.APPLICATION_GROUP__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				return;
			case MappingPackage.APPLICATION_GROUP__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.model.ApplicationGroup)null);
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
			case MappingPackage.APPLICATION_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MappingPackage.APPLICATION_GROUP__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case MappingPackage.APPLICATION_GROUP__APPLICATION_GROUPS:
				return applicationGroups != null && !applicationGroups.isEmpty();
			case MappingPackage.APPLICATION_GROUP__REFERENCE_OBJECT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationGroupImpl
