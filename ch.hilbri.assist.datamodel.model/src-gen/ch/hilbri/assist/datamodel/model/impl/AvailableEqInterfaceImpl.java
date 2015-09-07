/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Available Eq Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl#getEqInterfaceType <em>Eq Interface Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl#getCount <em>Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AvailableEqInterfaceImpl#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailableEqInterfaceImpl extends MinimalEObjectImpl.Container implements AvailableEqInterface {
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
	 * The default value of the '{@link #getEqInterfaceType() <em>Eq Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final String EQ_INTERFACE_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEqInterfaceType() <em>Eq Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected String eqInterfaceType = EQ_INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtectionLevel() <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ProtectionLevelType PROTECTION_LEVEL_EDEFAULT = ProtectionLevelType.NONE;

	/**
	 * The cached value of the '{@link #getProtectionLevel() <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevel()
	 * @generated
	 * @ordered
	 */
	protected ProtectionLevelType protectionLevel = PROTECTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableEqInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.AVAILABLE_EQ_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AVAILABLE_EQ_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEqInterfaceType() {
		return eqInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqInterfaceType(String newEqInterfaceType) {
		String oldEqInterfaceType = eqInterfaceType;
		eqInterfaceType = newEqInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE, oldEqInterfaceType, eqInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AVAILABLE_EQ_INTERFACE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionLevelType getProtectionLevel() {
		return protectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionLevel(ProtectionLevelType newProtectionLevel) {
		ProtectionLevelType oldProtectionLevel = protectionLevel;
		protectionLevel = newProtectionLevel == null ? PROTECTION_LEVEL_EDEFAULT : newProtectionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL, oldProtectionLevel, protectionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.AVAILABLE_EQ_INTERFACE__NAME:
				return getName();
			case ModelPackage.AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE:
				return getEqInterfaceType();
			case ModelPackage.AVAILABLE_EQ_INTERFACE__COUNT:
				return getCount();
			case ModelPackage.AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL:
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
			case ModelPackage.AVAILABLE_EQ_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE:
				setEqInterfaceType((String)newValue);
				return;
			case ModelPackage.AVAILABLE_EQ_INTERFACE__COUNT:
				setCount((Integer)newValue);
				return;
			case ModelPackage.AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL:
				setProtectionLevel((ProtectionLevelType)newValue);
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
			case ModelPackage.AVAILABLE_EQ_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE:
				setEqInterfaceType(EQ_INTERFACE_TYPE_EDEFAULT);
				return;
			case ModelPackage.AVAILABLE_EQ_INTERFACE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ModelPackage.AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL:
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
			case ModelPackage.AVAILABLE_EQ_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE:
				return EQ_INTERFACE_TYPE_EDEFAULT == null ? eqInterfaceType != null : !EQ_INTERFACE_TYPE_EDEFAULT.equals(eqInterfaceType);
			case ModelPackage.AVAILABLE_EQ_INTERFACE__COUNT:
				return count != COUNT_EDEFAULT;
			case ModelPackage.AVAILABLE_EQ_INTERFACE__PROTECTION_LEVEL:
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
		result.append(", eqInterfaceType: ");
		result.append(eqInterfaceType);
		result.append(", count: ");
		result.append(count);
		result.append(", protectionLevel: ");
		result.append(protectionLevel);
		result.append(')');
		return result.toString();
	}

} //AvailableEqInterfaceImpl
