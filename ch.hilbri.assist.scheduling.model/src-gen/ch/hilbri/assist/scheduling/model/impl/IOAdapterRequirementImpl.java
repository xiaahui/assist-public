/**
 */
package ch.hilbri.assist.scheduling.model.impl;

import ch.hilbri.assist.scheduling.model.IOAdapterRequirement;
import ch.hilbri.assist.scheduling.model.IOAdapterType;
import ch.hilbri.assist.scheduling.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link ch.hilbri.assist.scheduling.model.impl.IOAdapterRequirementImpl#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.impl.IOAdapterRequirementImpl#getRequiredAdapterCount <em>Required Adapter Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.impl.IOAdapterRequirementImpl#isIsSharedAllowed <em>Is Shared Allowed</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.impl.IOAdapterRequirementImpl#isIsExclusiveOnly <em>Is Exclusive Only</em>}</li>
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
	 * The default value of the '{@link #getRequiredAdapterCount() <em>Required Adapter Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAdapterCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_ADAPTER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredAdapterCount() <em>Required Adapter Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAdapterCount()
	 * @generated
	 * @ordered
	 */
	protected int requiredAdapterCount = REQUIRED_ADAPTER_COUNT_EDEFAULT;

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
		return ModelPackage.Literals.IO_ADAPTER_REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE, oldAdapterType, adapterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredAdapterCount() {
		return requiredAdapterCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredAdapterCount(int newRequiredAdapterCount) {
		int oldRequiredAdapterCount = requiredAdapterCount;
		requiredAdapterCount = newRequiredAdapterCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT, oldRequiredAdapterCount, requiredAdapterCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED, oldIsSharedAllowed, isSharedAllowed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY, oldIsExclusiveOnly, isExclusiveOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				return getAdapterType();
			case ModelPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT:
				return getRequiredAdapterCount();
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				return isIsSharedAllowed();
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				return isIsExclusiveOnly();
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
			case ModelPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				setAdapterType((IOAdapterType)newValue);
				return;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT:
				setRequiredAdapterCount((Integer)newValue);
				return;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				setIsSharedAllowed((Boolean)newValue);
				return;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				setIsExclusiveOnly((Boolean)newValue);
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
			case ModelPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				setAdapterType(ADAPTER_TYPE_EDEFAULT);
				return;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT:
				setRequiredAdapterCount(REQUIRED_ADAPTER_COUNT_EDEFAULT);
				return;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				setIsSharedAllowed(IS_SHARED_ALLOWED_EDEFAULT);
				return;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				setIsExclusiveOnly(IS_EXCLUSIVE_ONLY_EDEFAULT);
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
			case ModelPackage.IO_ADAPTER_REQUIREMENT__ADAPTER_TYPE:
				return adapterType != ADAPTER_TYPE_EDEFAULT;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__REQUIRED_ADAPTER_COUNT:
				return requiredAdapterCount != REQUIRED_ADAPTER_COUNT_EDEFAULT;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_SHARED_ALLOWED:
				return isSharedAllowed != IS_SHARED_ALLOWED_EDEFAULT;
			case ModelPackage.IO_ADAPTER_REQUIREMENT__IS_EXCLUSIVE_ONLY:
				return isExclusiveOnly != IS_EXCLUSIVE_ONLY_EDEFAULT;
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
		result.append(", requiredAdapterCount: ");
		result.append(requiredAdapterCount);
		result.append(", isSharedAllowed: ");
		result.append(isSharedAllowed);
		result.append(", isExclusiveOnly: ");
		result.append(isExclusiveOnly);
		result.append(')');
		return result.toString();
	}

} //IOAdapterRequirementImpl
