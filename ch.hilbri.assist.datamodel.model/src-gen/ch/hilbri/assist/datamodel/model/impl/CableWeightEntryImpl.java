/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.CableWeightEntry;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable Weight Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CableWeightEntryImpl#isDefaultEntry <em>Default Entry</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CableWeightEntryImpl#getEqInterfaceIoType <em>Eq Interface Io Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CableWeightEntryImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CableWeightEntryImpl extends MinimalEObjectImpl.Container implements CableWeightEntry {
	/**
	 * The default value of the '{@link #isDefaultEntry() <em>Default Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultEntry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_ENTRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultEntry() <em>Default Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultEntry()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultEntry = DEFAULT_ENTRY_EDEFAULT;

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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CableWeightEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CABLE_WEIGHT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultEntry() {
		return defaultEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultEntry(boolean newDefaultEntry) {
		boolean oldDefaultEntry = defaultEntry;
		defaultEntry = newDefaultEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY, oldDefaultEntry, defaultEntry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE, oldEqInterfaceIoType, eqInterfaceIoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CABLE_WEIGHT_ENTRY__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY:
				return isDefaultEntry();
			case ModelPackage.CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE:
				return getEqInterfaceIoType();
			case ModelPackage.CABLE_WEIGHT_ENTRY__WEIGHT:
				return getWeight();
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
			case ModelPackage.CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY:
				setDefaultEntry((Boolean)newValue);
				return;
			case ModelPackage.CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE:
				setEqInterfaceIoType((String)newValue);
				return;
			case ModelPackage.CABLE_WEIGHT_ENTRY__WEIGHT:
				setWeight((Double)newValue);
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
			case ModelPackage.CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY:
				setDefaultEntry(DEFAULT_ENTRY_EDEFAULT);
				return;
			case ModelPackage.CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE:
				setEqInterfaceIoType(EQ_INTERFACE_IO_TYPE_EDEFAULT);
				return;
			case ModelPackage.CABLE_WEIGHT_ENTRY__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case ModelPackage.CABLE_WEIGHT_ENTRY__DEFAULT_ENTRY:
				return defaultEntry != DEFAULT_ENTRY_EDEFAULT;
			case ModelPackage.CABLE_WEIGHT_ENTRY__EQ_INTERFACE_IO_TYPE:
				return EQ_INTERFACE_IO_TYPE_EDEFAULT == null ? eqInterfaceIoType != null : !EQ_INTERFACE_IO_TYPE_EDEFAULT.equals(eqInterfaceIoType);
			case ModelPackage.CABLE_WEIGHT_ENTRY__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
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
		result.append(" (defaultEntry: ");
		result.append(defaultEntry);
		result.append(", eqInterfaceIoType: ");
		result.append(eqInterfaceIoType);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //CableWeightEntryImpl
