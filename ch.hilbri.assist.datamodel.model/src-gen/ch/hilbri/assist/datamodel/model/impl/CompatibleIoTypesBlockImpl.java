/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock;
import ch.hilbri.assist.datamodel.model.ModelPackage;

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
 * An implementation of the model object '<em><b>Compatible Io Types Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompatibleIoTypesBlockImpl#getCompatibleIoTypes <em>Compatible Io Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompatibleIoTypesBlockImpl extends MinimalEObjectImpl.Container implements CompatibleIoTypesBlock {
	/**
	 * The cached value of the '{@link #getCompatibleIoTypes() <em>Compatible Io Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleIoTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleIoTypeEntry> compatibleIoTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibleIoTypesBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPATIBLE_IO_TYPES_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleIoTypeEntry> getCompatibleIoTypes() {
		if (compatibleIoTypes == null) {
			compatibleIoTypes = new EObjectContainmentEList<CompatibleIoTypeEntry>(CompatibleIoTypeEntry.class, this, ModelPackage.COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES);
		}
		return compatibleIoTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES:
				return ((InternalEList<?>)getCompatibleIoTypes()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES:
				return getCompatibleIoTypes();
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
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES:
				getCompatibleIoTypes().clear();
				getCompatibleIoTypes().addAll((Collection<? extends CompatibleIoTypeEntry>)newValue);
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
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES:
				getCompatibleIoTypes().clear();
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
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK__COMPATIBLE_IO_TYPES:
				return compatibleIoTypes != null && !compatibleIoTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompatibleIoTypesBlockImpl
