/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType;

import ch.hilbri.assist.mapping.model.result.Board;
import ch.hilbri.assist.mapping.model.result.Box;
import ch.hilbri.assist.mapping.model.result.Compartment;
import ch.hilbri.assist.mapping.model.result.Core;
import ch.hilbri.assist.mapping.model.result.Processor;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.BoxImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.BoxImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.BoxImpl#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxImpl extends HardwareElementImpl implements Box {
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
	 * The cached value of the '{@link #getBoards() <em>Boards</em>}' containment reference list.
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
	protected BoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.BOX__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		if (eContainerFeatureID() != ResultPackage.BOX__COMPARTMENT) return null;
		return (Compartment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetCompartment() {
		if (eContainerFeatureID() != ResultPackage.BOX__COMPARTMENT) return null;
		return (Compartment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartment(Compartment newCompartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompartment, ResultPackage.BOX__COMPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(Compartment newCompartment) {
		if (newCompartment != eInternalContainer() || (eContainerFeatureID() != ResultPackage.BOX__COMPARTMENT && newCompartment != null)) {
			if (EcoreUtil.isAncestor(this, newCompartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompartment != null)
				msgs = ((InternalEObject)newCompartment).eInverseAdd(this, ResultPackage.COMPARTMENT__BOXES, Compartment.class, msgs);
			msgs = basicSetCompartment(newCompartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.BOX__COMPARTMENT, newCompartment, newCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getBoards() {
		if (boards == null) {
			boards = new EObjectContainmentWithInverseEList<Board>(Board.class, this, ResultPackage.BOX__BOARDS, ResultPackage.BOARD__BOX);
		}
		return boards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getAllProcessors() {
		final BasicEList<Processor> list = new BasicEList<Processor>();
		EList<Board> _boards = this.getBoards();
		for (final Board b : _boards) {
			EList<Processor> _processors = b.getProcessors();
			list.addAll(_processors);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getAllCores() {
		final BasicEList<Core> list = new BasicEList<Core>();
		EList<Board> _boards = this.getBoards();
		for (final Board b : _boards) {
			EList<Core> _allCores = b.getAllCores();
			list.addAll(_allCores);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getHardwareLevel() {
		return HardwareArchitectureLevelType.BOX;
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
			case ResultPackage.BOX__COMPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompartment((Compartment)otherEnd, msgs);
			case ResultPackage.BOX__BOARDS:
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
			case ResultPackage.BOX__COMPARTMENT:
				return basicSetCompartment(null, msgs);
			case ResultPackage.BOX__BOARDS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ResultPackage.BOX__COMPARTMENT:
				return eInternalContainer().eInverseRemove(this, ResultPackage.COMPARTMENT__BOXES, Compartment.class, msgs);
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
			case ResultPackage.BOX__MANUFACTURER:
				return getManufacturer();
			case ResultPackage.BOX__COMPARTMENT:
				if (resolve) return getCompartment();
				return basicGetCompartment();
			case ResultPackage.BOX__BOARDS:
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
			case ResultPackage.BOX__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case ResultPackage.BOX__COMPARTMENT:
				setCompartment((Compartment)newValue);
				return;
			case ResultPackage.BOX__BOARDS:
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
			case ResultPackage.BOX__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case ResultPackage.BOX__COMPARTMENT:
				setCompartment((Compartment)null);
				return;
			case ResultPackage.BOX__BOARDS:
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
			case ResultPackage.BOX__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case ResultPackage.BOX__COMPARTMENT:
				return basicGetCompartment() != null;
			case ResultPackage.BOX__BOARDS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ResultPackage.BOX___GET_ALL_PROCESSORS:
				return getAllProcessors();
			case ResultPackage.BOX___GET_ALL_CORES:
				return getAllCores();
			case ResultPackage.BOX___GET_HARDWARE_LEVEL:
				return getHardwareLevel();
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
		result.append(" (manufacturer: ");
		result.append(manufacturer);
		result.append(')');
		return result.toString();
	}

} //BoxImpl
