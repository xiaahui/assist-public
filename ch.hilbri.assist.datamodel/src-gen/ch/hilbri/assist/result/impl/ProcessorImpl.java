/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.impl;

import ch.hilbri.assist.result.Board;
import ch.hilbri.assist.result.Core;
import ch.hilbri.assist.result.Processor;
import ch.hilbri.assist.result.ResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.impl.ProcessorImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.ProcessorImpl#getProcessorType <em>Processor Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.ProcessorImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.ProcessorImpl#getCores <em>Cores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends HardwareElementImpl implements Processor {
	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorType() <em>Processor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorType() <em>Processor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorType()
	 * @generated
	 * @ordered
	 */
	protected String processorType = PROCESSOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> cores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSOR__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessorType() {
		return processorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorType(String newProcessorType) {
		String oldProcessorType = processorType;
		processorType = newProcessorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSOR__PROCESSOR_TYPE, oldProcessorType, processorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getBoard() {
		if (eContainerFeatureID() != ResultPackage.PROCESSOR__BOARD) return null;
		return (Board)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetBoard() {
		if (eContainerFeatureID() != ResultPackage.PROCESSOR__BOARD) return null;
		return (Board)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBoard, ResultPackage.PROCESSOR__BOARD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Board newBoard) {
		if (newBoard != eInternalContainer() || (eContainerFeatureID() != ResultPackage.PROCESSOR__BOARD && newBoard != null)) {
			if (EcoreUtil.isAncestor(this, newBoard))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoard != null)
				msgs = ((InternalEObject)newBoard).eInverseAdd(this, ResultPackage.BOARD__PROCESSORS, Board.class, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSOR__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCores() {
		if (cores == null) {
			cores = new EObjectContainmentWithInverseEList<Core>(Core.class, this, ResultPackage.PROCESSOR__CORES, ResultPackage.CORE__PROCESSOR);
		}
		return cores;
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
			case ResultPackage.PROCESSOR__BOARD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoard((Board)otherEnd, msgs);
			case ResultPackage.PROCESSOR__CORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCores()).basicAdd(otherEnd, msgs);
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
			case ResultPackage.PROCESSOR__BOARD:
				return basicSetBoard(null, msgs);
			case ResultPackage.PROCESSOR__CORES:
				return ((InternalEList<?>)getCores()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ResultPackage.PROCESSOR__BOARD:
				return eInternalContainer().eInverseRemove(this, ResultPackage.BOARD__PROCESSORS, Board.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.PROCESSOR__MANUFACTURER:
				return getManufacturer();
			case ResultPackage.PROCESSOR__PROCESSOR_TYPE:
				return getProcessorType();
			case ResultPackage.PROCESSOR__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case ResultPackage.PROCESSOR__CORES:
				return getCores();
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
			case ResultPackage.PROCESSOR__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case ResultPackage.PROCESSOR__PROCESSOR_TYPE:
				setProcessorType((String)newValue);
				return;
			case ResultPackage.PROCESSOR__BOARD:
				setBoard((Board)newValue);
				return;
			case ResultPackage.PROCESSOR__CORES:
				getCores().clear();
				getCores().addAll((Collection<? extends Core>)newValue);
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
			case ResultPackage.PROCESSOR__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case ResultPackage.PROCESSOR__PROCESSOR_TYPE:
				setProcessorType(PROCESSOR_TYPE_EDEFAULT);
				return;
			case ResultPackage.PROCESSOR__BOARD:
				setBoard((Board)null);
				return;
			case ResultPackage.PROCESSOR__CORES:
				getCores().clear();
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
			case ResultPackage.PROCESSOR__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case ResultPackage.PROCESSOR__PROCESSOR_TYPE:
				return PROCESSOR_TYPE_EDEFAULT == null ? processorType != null : !PROCESSOR_TYPE_EDEFAULT.equals(processorType);
			case ResultPackage.PROCESSOR__BOARD:
				return basicGetBoard() != null;
			case ResultPackage.PROCESSOR__CORES:
				return cores != null && !cores.isEmpty();
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
		result.append(" (manufacturer: ");
		result.append(manufacturer);
		result.append(", processorType: ");
		result.append(processorType);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
