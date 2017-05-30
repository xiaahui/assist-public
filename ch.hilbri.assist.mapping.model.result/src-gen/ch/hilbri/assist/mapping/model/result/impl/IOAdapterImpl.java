/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.IOAdapterType;

import ch.hilbri.assist.mapping.model.result.IOAdapter;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl#getTotalUnitCount <em>Total Unit Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.IOAdapterImpl#getReferenceObject <em>Reference Object</em>}</li>
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
	 * The default value of the '{@link #getTotalUnitCount() <em>Total Unit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUnitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_UNIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalUnitCount() <em>Total Unit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUnitCount()
	 * @generated
	 * @ordered
	 */
	protected int totalUnitCount = TOTAL_UNIT_COUNT_EDEFAULT;

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
	 * The cached value of the '{@link #getReferenceObject() <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceObject()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.mapping.model.IOAdapter referenceObject;

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
		return ResultPackage.Literals.IO_ADAPTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalUnitCount() {
		return totalUnitCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalUnitCount(int newTotalUnitCount) {
		int oldTotalUnitCount = totalUnitCount;
		totalUnitCount = newTotalUnitCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER__TOTAL_UNIT_COUNT, oldTotalUnitCount, totalUnitCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER__ADAPTER_TYPE, oldAdapterType, adapterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.IOAdapter getReferenceObject() {
		if (referenceObject != null && referenceObject.eIsProxy()) {
			InternalEObject oldReferenceObject = (InternalEObject)referenceObject;
			referenceObject = (ch.hilbri.assist.mapping.model.IOAdapter)eResolveProxy(oldReferenceObject);
			if (referenceObject != oldReferenceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.IO_ADAPTER__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
			}
		}
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.IOAdapter basicGetReferenceObject() {
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceObject(ch.hilbri.assist.mapping.model.IOAdapter newReferenceObject) {
		ch.hilbri.assist.mapping.model.IOAdapter oldReferenceObject = referenceObject;
		referenceObject = newReferenceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.IO_ADAPTER__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.IO_ADAPTER__NAME:
				return getName();
			case ResultPackage.IO_ADAPTER__TOTAL_UNIT_COUNT:
				return getTotalUnitCount();
			case ResultPackage.IO_ADAPTER__ADAPTER_TYPE:
				return getAdapterType();
			case ResultPackage.IO_ADAPTER__REFERENCE_OBJECT:
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
			case ResultPackage.IO_ADAPTER__NAME:
				setName((String)newValue);
				return;
			case ResultPackage.IO_ADAPTER__TOTAL_UNIT_COUNT:
				setTotalUnitCount((Integer)newValue);
				return;
			case ResultPackage.IO_ADAPTER__ADAPTER_TYPE:
				setAdapterType((IOAdapterType)newValue);
				return;
			case ResultPackage.IO_ADAPTER__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.IOAdapter)newValue);
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
			case ResultPackage.IO_ADAPTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResultPackage.IO_ADAPTER__TOTAL_UNIT_COUNT:
				setTotalUnitCount(TOTAL_UNIT_COUNT_EDEFAULT);
				return;
			case ResultPackage.IO_ADAPTER__ADAPTER_TYPE:
				setAdapterType(ADAPTER_TYPE_EDEFAULT);
				return;
			case ResultPackage.IO_ADAPTER__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.IOAdapter)null);
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
			case ResultPackage.IO_ADAPTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResultPackage.IO_ADAPTER__TOTAL_UNIT_COUNT:
				return totalUnitCount != TOTAL_UNIT_COUNT_EDEFAULT;
			case ResultPackage.IO_ADAPTER__ADAPTER_TYPE:
				return adapterType != ADAPTER_TYPE_EDEFAULT;
			case ResultPackage.IO_ADAPTER__REFERENCE_OBJECT:
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
		result.append(", totalUnitCount: ");
		result.append(totalUnitCount);
		result.append(", adapterType: ");
		result.append(adapterType);
		result.append(')');
		return result.toString();
	}

} //IOAdapterImpl
