/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;

import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.Box;
import ch.hilbri.assist.datamodel.result.mapping.Compartment;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;
import ch.hilbri.assist.datamodel.result.mapping.Processor;

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
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoxImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoxImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoxImpl#getBoards <em>Boards</em>}</li>
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
		return MappingPackage.Literals.BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOX__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		if (eContainerFeatureID() != MappingPackage.BOX__COMPARTMENT) return null;
		return (Compartment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetCompartment() {
		if (eContainerFeatureID() != MappingPackage.BOX__COMPARTMENT) return null;
		return (Compartment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartment(Compartment newCompartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompartment, MappingPackage.BOX__COMPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(Compartment newCompartment) {
		if (newCompartment != eInternalContainer() || (eContainerFeatureID() != MappingPackage.BOX__COMPARTMENT && newCompartment != null)) {
			if (EcoreUtil.isAncestor(this, newCompartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompartment != null)
				msgs = ((InternalEObject)newCompartment).eInverseAdd(this, MappingPackage.COMPARTMENT__BOXES, Compartment.class, msgs);
			msgs = basicSetCompartment(newCompartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOX__COMPARTMENT, newCompartment, newCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getBoards() {
		if (boards == null) {
			boards = new EObjectContainmentWithInverseEList<Board>(Board.class, this, MappingPackage.BOX__BOARDS, MappingPackage.BOARD__BOX);
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
			case MappingPackage.BOX__COMPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompartment((Compartment)otherEnd, msgs);
			case MappingPackage.BOX__BOARDS:
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
			case MappingPackage.BOX__COMPARTMENT:
				return basicSetCompartment(null, msgs);
			case MappingPackage.BOX__BOARDS:
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
			case MappingPackage.BOX__COMPARTMENT:
				return eInternalContainer().eInverseRemove(this, MappingPackage.COMPARTMENT__BOXES, Compartment.class, msgs);
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
			case MappingPackage.BOX__MANUFACTURER:
				return getManufacturer();
			case MappingPackage.BOX__COMPARTMENT:
				if (resolve) return getCompartment();
				return basicGetCompartment();
			case MappingPackage.BOX__BOARDS:
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
			case MappingPackage.BOX__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case MappingPackage.BOX__COMPARTMENT:
				setCompartment((Compartment)newValue);
				return;
			case MappingPackage.BOX__BOARDS:
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
			case MappingPackage.BOX__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case MappingPackage.BOX__COMPARTMENT:
				setCompartment((Compartment)null);
				return;
			case MappingPackage.BOX__BOARDS:
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
			case MappingPackage.BOX__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case MappingPackage.BOX__COMPARTMENT:
				return basicGetCompartment() != null;
			case MappingPackage.BOX__BOARDS:
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
			case MappingPackage.BOX___GET_ALL_PROCESSORS:
				return getAllProcessors();
			case MappingPackage.BOX___GET_ALL_CORES:
				return getAllCores();
			case MappingPackage.BOX___GET_HARDWARE_LEVEL:
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
