/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.IOAdapterType;

import ch.hilbri.assist.mapping.model.result.IOAdapterRequirement;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO Adapter Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl#getRequiredUnits <em>Required Units</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl#isIsSharedAllowed <em>Is Shared Allowed</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl#isIsExclusiveOnly <em>Is Exclusive Only</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterRequirementImpl#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOAdapterRequirementImpl extends MinimalEObjectImpl.Container implements IOAdapterRequirement {
	/**
	 * The default value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterType()
	 * @generated
	 * @ordered
	 */
	protected static final IOAdapterType ADAPTER_TYPE_EDEFAULT = IOAdapterType.NONE;

	/**
	 * The cached value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterType()
	 * @generated
	 * @ordered
	 */
	protected IOAdapterType adapterType = ADAPTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredUnits() <em>Required Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredUnits() <em>Required Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredUnits()
	 * @generated
	 * @ordered
	 */
	protected int requiredUnits = REQUIRED_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSharedAllowed() <em>Is Shared Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSharedAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHARED_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSharedAllowed() <em>Is Shared Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSharedAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean isSharedAllowed = IS_SHARED_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExclusiveOnly() <em>Is Exclusive Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExclusiveOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXCLUSIVE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExclusiveOnly() <em>Is Exclusive Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExclusiveOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isExclusiveOnly = IS_EXCLUSIVE_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceObject() <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceObject()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.mapping.model.IOAdapterRequirement referenceObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOAdapterRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.IO_ADAPTER_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOAdapterType getAdapterType() {
		return adapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapterType(IOAdapterType newAdapterType) {
		IOAdapterType oldAdapterType = adapterType;
		adapterType = newAdapterType == null ? ADAPTER_TYPE_EDEFAULT : newAdapterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE, oldAdapterType, adapterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredUnits() {
		return requiredUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredUnits(int newRequiredUnits) {
		int oldRequiredUnits = requiredUnits;
		requiredUnits = newRequiredUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS, oldRequiredUnits, requiredUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSharedAllowed() {
		return isSharedAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSharedAllowed(boolean newIsSharedAllowed) {
		boolean oldIsSharedAllowed = isSharedAllowed;
		isSharedAllowed = newIsSharedAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED, oldIsSharedAllowed, isSharedAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExclusiveOnly() {
		return isExclusiveOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExclusiveOnly(boolean newIsExclusiveOnly) {
		boolean oldIsExclusiveOnly = isExclusiveOnly;
		isExclusiveOnly = newIsExclusiveOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY, oldIsExclusiveOnly, isExclusiveOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.IOAdapterRequirement getReferenceObject() {
		if (referenceObject != null && referenceObject.eIsProxy()) {
			InternalEObject oldReferenceObject = (InternalEObject)referenceObject;
			referenceObject = (ch.hilbri.assist.mapping.model.IOAdapterRequirement)eResolveProxy(oldReferenceObject);
			if (referenceObject != oldReferenceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
			}
		}
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.IOAdapterRequirement basicGetReferenceObject() {
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceObject(ch.hilbri.assist.mapping.model.IOAdapterRequirement newReferenceObject) {
		ch.hilbri.assist.mapping.model.IOAdapterRequirement oldReferenceObject = referenceObject;
		referenceObject = newReferenceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				return getAdapterType();
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS:
				return getRequiredUnits();
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				return isIsSharedAllowed();
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				return isIsExclusiveOnly();
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				setAdapterType((IOAdapterType)newValue);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS:
				setRequiredUnits((Integer)newValue);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				setIsSharedAllowed((Boolean)newValue);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				setIsExclusiveOnly((Boolean)newValue);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.IOAdapterRequirement)newValue);
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
			case ResultPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				setAdapterType(ADAPTER_TYPE_EDEFAULT);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS:
				setRequiredUnits(REQUIRED_UNITS_EDEFAULT);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				setIsSharedAllowed(IS_SHARED_ALLOWED_EDEFAULT);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				setIsExclusiveOnly(IS_EXCLUSIVE_ONLY_EDEFAULT);
				return;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.IOAdapterRequirement)null);
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
			case ResultPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				return adapterType != ADAPTER_TYPE_EDEFAULT;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_UNITS:
				return requiredUnits != REQUIRED_UNITS_EDEFAULT;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				return isSharedAllowed != IS_SHARED_ALLOWED_EDEFAULT;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				return isExclusiveOnly != IS_EXCLUSIVE_ONLY_EDEFAULT;
			case ResultPackage.IO_ADAPTER_REQUIREMENT__REFERENCE_OBJECT:
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
		result.append(" (adapterType: ");
		result.append(adapterType);
		result.append(", requiredUnits: ");
		result.append(requiredUnits);
		result.append(", isSharedAllowed: ");
		result.append(isSharedAllowed);
		result.append(", isExclusiveOnly: ");
		result.append(isExclusiveOnly);
		result.append(')');
		return result.toString();
	}

} //IOAdapterRequirementImpl
