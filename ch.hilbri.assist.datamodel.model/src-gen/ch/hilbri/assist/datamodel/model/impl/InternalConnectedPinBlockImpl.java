/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.ConnectedPinEntry;
import ch.hilbri.assist.datamodel.model.InternalConnectedPinBlock;
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
 * An implementation of the model object '<em><b>Internal Connected Pin Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.InternalConnectedPinBlockImpl#getConnectedPins <em>Connected Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalConnectedPinBlockImpl extends MinimalEObjectImpl.Container implements InternalConnectedPinBlock {
	/**
	 * The cached value of the '{@link #getConnectedPins() <em>Connected Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedPins()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectedPinEntry> connectedPins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalConnectedPinBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INTERNAL_CONNECTED_PIN_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectedPinEntry> getConnectedPins() {
		if (connectedPins == null) {
			connectedPins = new EObjectContainmentEList<ConnectedPinEntry>(ConnectedPinEntry.class, this, ModelPackage.INTERNAL_CONNECTED_PIN_BLOCK__CONNECTED_PINS);
		}
		return connectedPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INTERNAL_CONNECTED_PIN_BLOCK__CONNECTED_PINS:
				return ((InternalEList<?>)getConnectedPins()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.INTERNAL_CONNECTED_PIN_BLOCK__CONNECTED_PINS:
				return getConnectedPins();
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
			case ModelPackage.INTERNAL_CONNECTED_PIN_BLOCK__CONNECTED_PINS:
				getConnectedPins().clear();
				getConnectedPins().addAll((Collection<? extends ConnectedPinEntry>)newValue);
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
			case ModelPackage.INTERNAL_CONNECTED_PIN_BLOCK__CONNECTED_PINS:
				getConnectedPins().clear();
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
			case ModelPackage.INTERNAL_CONNECTED_PIN_BLOCK__CONNECTED_PINS:
				return connectedPins != null && !connectedPins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternalConnectedPinBlockImpl
