/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.IOAdapter;
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterType;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl#getSharedUnitCount <em>Shared Unit Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.IOAdapterImpl#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOAdapterImpl extends MinimalEObjectImpl.Container implements IOAdapter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected int totalCount = TOTAL_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedUnitCount() <em>Shared Unit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedUnitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SHARED_UNIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSharedUnitCount() <em>Shared Unit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedUnitCount()
	 * @generated
	 * @ordered
	 */
	protected int sharedUnitCount = SHARED_UNIT_COUNT_EDEFAULT;

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
	 * The default value of the '{@link #getProtectionLevel() <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final IOAdapterProtectionLevelType PROTECTION_LEVEL_EDEFAULT = IOAdapterProtectionLevelType.NONE;

	/**
	 * The cached value of the '{@link #getProtectionLevel() <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevel()
	 * @generated
	 * @ordered
	 */
	protected IOAdapterProtectionLevelType protectionLevel = PROTECTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.IO_ADAPTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCount(int newTotalCount) {
		int oldTotalCount = totalCount;
		totalCount = newTotalCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER__TOTAL_COUNT, oldTotalCount, totalCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSharedUnitCount() {
		return sharedUnitCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedUnitCount(int newSharedUnitCount) {
		int oldSharedUnitCount = sharedUnitCount;
		sharedUnitCount = newSharedUnitCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER__SHARED_UNIT_COUNT, oldSharedUnitCount, sharedUnitCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER__ADAPTER_TYPE, oldAdapterType, adapterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOAdapterProtectionLevelType getProtectionLevel() {
		return protectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionLevel(IOAdapterProtectionLevelType newProtectionLevel) {
		IOAdapterProtectionLevelType oldProtectionLevel = protectionLevel;
		protectionLevel = newProtectionLevel == null ? PROTECTION_LEVEL_EDEFAULT : newProtectionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IO_ADAPTER__PROTECTION_LEVEL, oldProtectionLevel, protectionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.IO_ADAPTER__NAME:
				return getName();
			case ModelPackage.IO_ADAPTER__TOTAL_COUNT:
				return getTotalCount();
			case ModelPackage.IO_ADAPTER__SHARED_UNIT_COUNT:
				return getSharedUnitCount();
			case ModelPackage.IO_ADAPTER__ADAPTER_TYPE:
				return getAdapterType();
			case ModelPackage.IO_ADAPTER__PROTECTION_LEVEL:
				return getProtectionLevel();
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
			case ModelPackage.IO_ADAPTER__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.IO_ADAPTER__TOTAL_COUNT:
				setTotalCount((Integer)newValue);
				return;
			case ModelPackage.IO_ADAPTER__SHARED_UNIT_COUNT:
				setSharedUnitCount((Integer)newValue);
				return;
			case ModelPackage.IO_ADAPTER__ADAPTER_TYPE:
				setAdapterType((IOAdapterType)newValue);
				return;
			case ModelPackage.IO_ADAPTER__PROTECTION_LEVEL:
				setProtectionLevel((IOAdapterProtectionLevelType)newValue);
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
			case ModelPackage.IO_ADAPTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.IO_ADAPTER__TOTAL_COUNT:
				setTotalCount(TOTAL_COUNT_EDEFAULT);
				return;
			case ModelPackage.IO_ADAPTER__SHARED_UNIT_COUNT:
				setSharedUnitCount(SHARED_UNIT_COUNT_EDEFAULT);
				return;
			case ModelPackage.IO_ADAPTER__ADAPTER_TYPE:
				setAdapterType(ADAPTER_TYPE_EDEFAULT);
				return;
			case ModelPackage.IO_ADAPTER__PROTECTION_LEVEL:
				setProtectionLevel(PROTECTION_LEVEL_EDEFAULT);
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
			case ModelPackage.IO_ADAPTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.IO_ADAPTER__TOTAL_COUNT:
				return totalCount != TOTAL_COUNT_EDEFAULT;
			case ModelPackage.IO_ADAPTER__SHARED_UNIT_COUNT:
				return sharedUnitCount != SHARED_UNIT_COUNT_EDEFAULT;
			case ModelPackage.IO_ADAPTER__ADAPTER_TYPE:
				return adapterType != ADAPTER_TYPE_EDEFAULT;
			case ModelPackage.IO_ADAPTER__PROTECTION_LEVEL:
				return protectionLevel != PROTECTION_LEVEL_EDEFAULT;
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
		result.append(", totalCount: ");
		result.append(totalCount);
		result.append(", sharedUnitCount: ");
		result.append(sharedUnitCount);
		result.append(", adapterType: ");
		result.append(adapterType);
		result.append(", protectionLevel: ");
		result.append(protectionLevel);
		result.append(')');
		return result.toString();
	}

} //IOAdapterImpl
