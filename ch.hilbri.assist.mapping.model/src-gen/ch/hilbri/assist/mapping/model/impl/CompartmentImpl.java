/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Board;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.Compartment;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.ModelPackage;
import ch.hilbri.assist.mapping.model.Processor;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.CompartmentImpl#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.CompartmentImpl#getBoxes <em>Boxes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentImpl extends HardwareElementImpl implements Compartment {
	/**
	 * The default value of the '{@link #getPowerSupply() <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSupply()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_SUPPLY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPowerSupply() <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSupply()
	 * @generated
	 * @ordered
	 */
	protected String powerSupply = POWER_SUPPLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoxes() <em>Boxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxes()
	 * @generated
	 * @ordered
	 */
	protected EList<Box> boxes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerSupply() {
		return powerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSupply(String newPowerSupply) {
		String oldPowerSupply = powerSupply;
		powerSupply = newPowerSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARTMENT__POWER_SUPPLY, oldPowerSupply, powerSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Box> getBoxes() {
		if (boxes == null) {
			boxes = new EObjectContainmentWithInverseEList<Box>(Box.class, this, ModelPackage.COMPARTMENT__BOXES, ModelPackage.BOX__COMPARTMENT);
		}
		return boxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Box> getAllBoxes() {
		return this.getBoxes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getAllBoards() {
		EList<Box> _boxes = this.getBoxes();
		final Function1<Box, EList<Board>> _function = new Function1<Box, EList<Board>>() {
			public EList<Board> apply(final Box it) {
				return it.getAllBoards();
			}
		};
		EList<EList<Board>> _map = XcoreEListExtensions.<Box, EList<Board>>map(_boxes, _function);
		Iterable<Board> _flatten = Iterables.<Board>concat(_map);
		return ECollections.<Board>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getAllProcessors() {
		EList<Box> _boxes = this.getBoxes();
		final Function1<Box, EList<Processor>> _function = new Function1<Box, EList<Processor>>() {
			public EList<Processor> apply(final Box it) {
				return it.getAllProcessors();
			}
		};
		EList<EList<Processor>> _map = XcoreEListExtensions.<Box, EList<Processor>>map(_boxes, _function);
		Iterable<Processor> _flatten = Iterables.<Processor>concat(_map);
		return ECollections.<Processor>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getAllCores() {
		EList<Box> _boxes = this.getBoxes();
		final Function1<Box, EList<Core>> _function = new Function1<Box, EList<Core>>() {
			public EList<Core> apply(final Box it) {
				return it.getAllCores();
			}
		};
		EList<EList<Core>> _map = XcoreEListExtensions.<Box, EList<Core>>map(_boxes, _function);
		Iterable<Core> _flatten = Iterables.<Core>concat(_map);
		return ECollections.<Core>toEList(_flatten);
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
			case ModelPackage.COMPARTMENT__BOXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoxes()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.COMPARTMENT__BOXES:
				return ((InternalEList<?>)getBoxes()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				return getPowerSupply();
			case ModelPackage.COMPARTMENT__BOXES:
				return getBoxes();
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
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				setPowerSupply((String)newValue);
				return;
			case ModelPackage.COMPARTMENT__BOXES:
				getBoxes().clear();
				getBoxes().addAll((Collection<? extends Box>)newValue);
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
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				setPowerSupply(POWER_SUPPLY_EDEFAULT);
				return;
			case ModelPackage.COMPARTMENT__BOXES:
				getBoxes().clear();
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
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				return POWER_SUPPLY_EDEFAULT == null ? powerSupply != null : !POWER_SUPPLY_EDEFAULT.equals(powerSupply);
			case ModelPackage.COMPARTMENT__BOXES:
				return boxes != null && !boxes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.COMPARTMENT___GET_ALL_BOXES:
				return getAllBoxes();
			case ModelPackage.COMPARTMENT___GET_ALL_BOARDS:
				return getAllBoards();
			case ModelPackage.COMPARTMENT___GET_ALL_PROCESSORS:
				return getAllProcessors();
			case ModelPackage.COMPARTMENT___GET_ALL_CORES:
				return getAllCores();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (powerSupply: ");
		result.append(powerSupply);
		result.append(')');
		return result.toString();
	}

} //CompartmentImpl
