/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compatible Io Type Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypeEntryImpl#getEqInterfaceIoType <em>Eq Interface Io Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypeEntryImpl#getPinInterfaceIoTypes <em>Pin Interface Io Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompatibleIoTypeEntryImpl extends MinimalEObjectImpl.Container implements CompatibleIoTypeEntry {
	/**
	 * The default value of the '{@link #getEqInterfaceIoType() <em>Eq Interface Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceIoType()
	 * @generated
	 * @ordered
	 */
	protected static final String EQ_INTERFACE_IO_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEqInterfaceIoType() <em>Eq Interface Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceIoType()
	 * @generated
	 * @ordered
	 */
	protected String eqInterfaceIoType = EQ_INTERFACE_IO_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPinInterfaceIoTypes() <em>Pin Interface Io Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinInterfaceIoTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pinInterfaceIoTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibleIoTypeEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPATIBLE_IO_TYPE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEqInterfaceIoType() {
		return eqInterfaceIoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqInterfaceIoType(String newEqInterfaceIoType) {
		String oldEqInterfaceIoType = eqInterfaceIoType;
		eqInterfaceIoType = newEqInterfaceIoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE, oldEqInterfaceIoType, eqInterfaceIoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPinInterfaceIoTypes() {
		if (pinInterfaceIoTypes == null) {
			pinInterfaceIoTypes = new EDataTypeEList<String>(String.class, this, ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES);
		}
		return pinInterfaceIoTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE:
				return getEqInterfaceIoType();
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES:
				return getPinInterfaceIoTypes();
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
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE:
				setEqInterfaceIoType((String)newValue);
				return;
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES:
				getPinInterfaceIoTypes().clear();
				getPinInterfaceIoTypes().addAll((Collection<? extends String>)newValue);
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
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE:
				setEqInterfaceIoType(EQ_INTERFACE_IO_TYPE_EDEFAULT);
				return;
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES:
				getPinInterfaceIoTypes().clear();
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
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__EQ_INTERFACE_IO_TYPE:
				return EQ_INTERFACE_IO_TYPE_EDEFAULT == null ? eqInterfaceIoType != null : !EQ_INTERFACE_IO_TYPE_EDEFAULT.equals(eqInterfaceIoType);
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY__PIN_INTERFACE_IO_TYPES:
				return pinInterfaceIoTypes != null && !pinInterfaceIoTypes.isEmpty();
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
		result.append(" (eqInterfaceIoType: ");
		result.append(eqInterfaceIoType);
		result.append(", pinInterfaceIoTypes: ");
		result.append(pinInterfaceIoTypes);
		result.append(')');
		return result.toString();
	}

} //CompatibleIoTypeEntryImpl
