/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.impl;

import ch.hilbri.assist.result.Board;
import ch.hilbri.assist.result.Network;
import ch.hilbri.assist.result.ResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.NetworkImpl#getBandwidthCapacity <em>Bandwidth Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.NetworkImpl#isIsBoardLocalNetwork <em>Is Board Local Network</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.NetworkImpl#getBoards <em>Boards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
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
	 * The default value of the '{@link #getBandwidthCapacity() <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int BANDWIDTH_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBandwidthCapacity() <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthCapacity()
	 * @generated
	 * @ordered
	 */
	protected int bandwidthCapacity = BANDWIDTH_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBoardLocalNetwork() <em>Is Board Local Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBoardLocalNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOARD_LOCAL_NETWORK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getBoards() <em>Boards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoards()
	 * @generated
	 * @ordered
	 */
	protected EList<Board> boards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBandwidthCapacity() {
		return bandwidthCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidthCapacity(int newBandwidthCapacity) {
		int oldBandwidthCapacity = bandwidthCapacity;
		bandwidthCapacity = newBandwidthCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.NETWORK__BANDWIDTH_CAPACITY, oldBandwidthCapacity, bandwidthCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBoardLocalNetwork() {
		EList<Board> _boards = this.getBoards();
		int _size = _boards.size();
		return (_size <= 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getBoards() {
		if (boards == null) {
			boards = new EObjectWithInverseResolvingEList.ManyInverse<Board>(Board.class, this, ResultPackage.NETWORK__BOARDS, ResultPackage.BOARD__NETWORKS);
		}
		return boards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.NETWORK__BOARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoards()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.NETWORK__BOARDS:
				return ((InternalEList<?>)getBoards()).basicRemove(otherEnd, msgs);
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
			case ResultPackage.NETWORK__NAME:
				return getName();
			case ResultPackage.NETWORK__BANDWIDTH_CAPACITY:
				return getBandwidthCapacity();
			case ResultPackage.NETWORK__IS_BOARD_LOCAL_NETWORK:
				return isIsBoardLocalNetwork();
			case ResultPackage.NETWORK__BOARDS:
				return getBoards();
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
			case ResultPackage.NETWORK__NAME:
				setName((String)newValue);
				return;
			case ResultPackage.NETWORK__BANDWIDTH_CAPACITY:
				setBandwidthCapacity((Integer)newValue);
				return;
			case ResultPackage.NETWORK__BOARDS:
				getBoards().clear();
				getBoards().addAll((Collection<? extends Board>)newValue);
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
			case ResultPackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResultPackage.NETWORK__BANDWIDTH_CAPACITY:
				setBandwidthCapacity(BANDWIDTH_CAPACITY_EDEFAULT);
				return;
			case ResultPackage.NETWORK__BOARDS:
				getBoards().clear();
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
			case ResultPackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResultPackage.NETWORK__BANDWIDTH_CAPACITY:
				return bandwidthCapacity != BANDWIDTH_CAPACITY_EDEFAULT;
			case ResultPackage.NETWORK__IS_BOARD_LOCAL_NETWORK:
				return isIsBoardLocalNetwork() != IS_BOARD_LOCAL_NETWORK_EDEFAULT;
			case ResultPackage.NETWORK__BOARDS:
				return boards != null && !boards.isEmpty();
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
		result.append(", bandwidthCapacity: ");
		result.append(bandwidthCapacity);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
