/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelEntry;
import ch.hilbri.assist.datamodel.model.ProtectionLevelType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Level Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelEntryImpl#getRdcLocation <em>Rdc Location</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelEntryImpl#getEmhZone1 <em>Emh Zone1</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelEntryImpl#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionLevelEntryImpl extends MinimalEObjectImpl.Container implements ProtectionLevelEntry {
	/**
	 * The default value of the '{@link #getRdcLocation() <em>Rdc Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdcLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String RDC_LOCATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRdcLocation() <em>Rdc Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdcLocation()
	 * @generated
	 * @ordered
	 */
	protected String rdcLocation = RDC_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmhZone1() <em>Emh Zone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmhZone1()
	 * @generated
	 * @ordered
	 */
	protected static final String EMH_ZONE1_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEmhZone1() <em>Emh Zone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmhZone1()
	 * @generated
	 * @ordered
	 */
	protected String emhZone1 = EMH_ZONE1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtectionLevel() <em>Protection Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionLevelType> protectionLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionLevelEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROTECTION_LEVEL_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRdcLocation() {
		return rdcLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdcLocation(String newRdcLocation) {
		String oldRdcLocation = rdcLocation;
		rdcLocation = newRdcLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROTECTION_LEVEL_ENTRY__RDC_LOCATION, oldRdcLocation, rdcLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmhZone1() {
		return emhZone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmhZone1(String newEmhZone1) {
		String oldEmhZone1 = emhZone1;
		emhZone1 = newEmhZone1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROTECTION_LEVEL_ENTRY__EMH_ZONE1, oldEmhZone1, emhZone1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionLevelType> getProtectionLevel() {
		if (protectionLevel == null) {
			protectionLevel = new EDataTypeEList<ProtectionLevelType>(ProtectionLevelType.class, this, ModelPackage.PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL);
		}
		return protectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PROTECTION_LEVEL_ENTRY__RDC_LOCATION:
				return getRdcLocation();
			case ModelPackage.PROTECTION_LEVEL_ENTRY__EMH_ZONE1:
				return getEmhZone1();
			case ModelPackage.PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL:
				return getProtectionLevel();
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
			case ModelPackage.PROTECTION_LEVEL_ENTRY__RDC_LOCATION:
				setRdcLocation((String)newValue);
				return;
			case ModelPackage.PROTECTION_LEVEL_ENTRY__EMH_ZONE1:
				setEmhZone1((String)newValue);
				return;
			case ModelPackage.PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL:
				getProtectionLevel().clear();
				getProtectionLevel().addAll((Collection<? extends ProtectionLevelType>)newValue);
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
			case ModelPackage.PROTECTION_LEVEL_ENTRY__RDC_LOCATION:
				setRdcLocation(RDC_LOCATION_EDEFAULT);
				return;
			case ModelPackage.PROTECTION_LEVEL_ENTRY__EMH_ZONE1:
				setEmhZone1(EMH_ZONE1_EDEFAULT);
				return;
			case ModelPackage.PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL:
				getProtectionLevel().clear();
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
			case ModelPackage.PROTECTION_LEVEL_ENTRY__RDC_LOCATION:
				return RDC_LOCATION_EDEFAULT == null ? rdcLocation != null : !RDC_LOCATION_EDEFAULT.equals(rdcLocation);
			case ModelPackage.PROTECTION_LEVEL_ENTRY__EMH_ZONE1:
				return EMH_ZONE1_EDEFAULT == null ? emhZone1 != null : !EMH_ZONE1_EDEFAULT.equals(emhZone1);
			case ModelPackage.PROTECTION_LEVEL_ENTRY__PROTECTION_LEVEL:
				return protectionLevel != null && !protectionLevel.isEmpty();
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
		result.append(" (rdcLocation: ");
		result.append(rdcLocation);
		result.append(", emhZone1: ");
		result.append(emhZone1);
		result.append(", protectionLevel: ");
		result.append(protectionLevel);
		result.append(')');
		return result.toString();
	}

} //ProtectionLevelEntryImpl
