/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelData;
import ch.hilbri.assist.datamodel.model.ProtectionLevelEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Level Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ProtectionLevelDataImpl#getProtectionLevelEntries <em>Protection Level Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionLevelDataImpl extends MinimalEObjectImpl.Container implements ProtectionLevelData {
	/**
	 * The cached value of the '{@link #getProtectionLevelEntries() <em>Protection Level Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevelEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionLevelEntry> protectionLevelEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionLevelDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROTECTION_LEVEL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionLevelEntry> getProtectionLevelEntries() {
		if (protectionLevelEntries == null) {
			protectionLevelEntries = new EObjectContainmentEList<ProtectionLevelEntry>(ProtectionLevelEntry.class, this, ModelPackage.PROTECTION_LEVEL_DATA__PROTECTION_LEVEL_ENTRIES);
		}
		return protectionLevelEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PROTECTION_LEVEL_DATA__PROTECTION_LEVEL_ENTRIES:
				return ((InternalEList<?>)getProtectionLevelEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PROTECTION_LEVEL_DATA__PROTECTION_LEVEL_ENTRIES:
				return getProtectionLevelEntries();
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
			case ModelPackage.PROTECTION_LEVEL_DATA__PROTECTION_LEVEL_ENTRIES:
				getProtectionLevelEntries().clear();
				getProtectionLevelEntries().addAll((Collection<? extends ProtectionLevelEntry>)newValue);
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
			case ModelPackage.PROTECTION_LEVEL_DATA__PROTECTION_LEVEL_ENTRIES:
				getProtectionLevelEntries().clear();
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
			case ModelPackage.PROTECTION_LEVEL_DATA__PROTECTION_LEVEL_ENTRIES:
				return protectionLevelEntries != null && !protectionLevelEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtectionLevelDataImpl
