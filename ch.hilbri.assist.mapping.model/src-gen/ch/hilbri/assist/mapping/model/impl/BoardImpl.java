/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Board;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.DesignAssuranceLevelType;
import ch.hilbri.assist.mapping.model.IOAdapter;
import ch.hilbri.assist.mapping.model.ModelPackage;
import ch.hilbri.assist.mapping.model.Processor;

import com.google.common.collect.Iterables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getRamCapacity <em>Ram Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getRomCapacity <em>Rom Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.BoardImpl#getIoAdapters <em>Io Adapters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends HardwareElementImpl implements Board {
	/**
	 * The default value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected static final String BOARD_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected String boardType = BOARD_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getAssuranceLevel() <em>Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DesignAssuranceLevelType ASSURANCE_LEVEL_EDEFAULT = DesignAssuranceLevelType.NONE;

	/**
	 * The cached value of the '{@link #getAssuranceLevel() <em>Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceLevel()
	 * @generated
	 * @ordered
	 */
	protected DesignAssuranceLevelType assuranceLevel = ASSURANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamCapacity() <em>Ram Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRamCapacity() <em>Ram Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamCapacity()
	 * @generated
	 * @ordered
	 */
	protected int ramCapacity = RAM_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRomCapacity() <em>Rom Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRomCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int ROM_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRomCapacity() <em>Rom Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRomCapacity()
	 * @generated
	 * @ordered
	 */
	protected int romCapacity = ROM_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getIoAdapters() <em>Io Adapters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoAdapters()
	 * @generated
	 * @ordered
	 */
	protected EList<IOAdapter> ioAdapters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoardType() {
		return boardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardType(String newBoardType) {
		String oldBoardType = boardType;
		boardType = newBoardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOARD__BOARD_TYPE, oldBoardType, boardType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOARD__POWER_SUPPLY, oldPowerSupply, powerSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAssuranceLevelType getAssuranceLevel() {
		return assuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssuranceLevel(DesignAssuranceLevelType newAssuranceLevel) {
		DesignAssuranceLevelType oldAssuranceLevel = assuranceLevel;
		assuranceLevel = newAssuranceLevel == null ? ASSURANCE_LEVEL_EDEFAULT : newAssuranceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOARD__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRamCapacity() {
		return ramCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamCapacity(int newRamCapacity) {
		int oldRamCapacity = ramCapacity;
		ramCapacity = newRamCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOARD__RAM_CAPACITY, oldRamCapacity, ramCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRomCapacity() {
		return romCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRomCapacity(int newRomCapacity) {
		int oldRomCapacity = romCapacity;
		romCapacity = newRomCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOARD__ROM_CAPACITY, oldRomCapacity, romCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getBox() {
		if (eContainerFeatureID() != ModelPackage.BOARD__BOX) return null;
		return (Box)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetBox() {
		if (eContainerFeatureID() != ModelPackage.BOARD__BOX) return null;
		return (Box)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBox(Box newBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBox, ModelPackage.BOARD__BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBox(Box newBox) {
		if (newBox != eInternalContainer() || (eContainerFeatureID() != ModelPackage.BOARD__BOX && newBox != null)) {
			if (EcoreUtil.isAncestor(this, newBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBox != null)
				msgs = ((InternalEObject)newBox).eInverseAdd(this, ModelPackage.BOX__BOARDS, Box.class, msgs);
			msgs = basicSetBox(newBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOARD__BOX, newBox, newBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentWithInverseEList<Processor>(Processor.class, this, ModelPackage.BOARD__PROCESSORS, ModelPackage.PROCESSOR__BOARD);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOAdapter> getIoAdapters() {
		if (ioAdapters == null) {
			ioAdapters = new EObjectContainmentEList<IOAdapter>(IOAdapter.class, this, ModelPackage.BOARD__IO_ADAPTERS);
		}
		return ioAdapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getAllProcessors() {
		return this.getProcessors();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getAllCores() {
		final Function1<Processor, EList<Core>> _function = new Function1<Processor, EList<Core>>() {
			public EList<Core> apply(final Processor it) {
				return it.getAllCores();
			}
		};
		return ECollections.<Core>toEList(Iterables.<Core>concat(XcoreEListExtensions.<Processor, EList<Core>>map(this.getProcessors(), _function)));
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
			case ModelPackage.BOARD__BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBox((Box)otherEnd, msgs);
			case ModelPackage.BOARD__PROCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessors()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.BOARD__BOX:
				return basicSetBox(null, msgs);
			case ModelPackage.BOARD__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
			case ModelPackage.BOARD__IO_ADAPTERS:
				return ((InternalEList<?>)getIoAdapters()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.BOARD__BOX:
				return eInternalContainer().eInverseRemove(this, ModelPackage.BOX__BOARDS, Box.class, msgs);
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
			case ModelPackage.BOARD__BOARD_TYPE:
				return getBoardType();
			case ModelPackage.BOARD__POWER_SUPPLY:
				return getPowerSupply();
			case ModelPackage.BOARD__ASSURANCE_LEVEL:
				return getAssuranceLevel();
			case ModelPackage.BOARD__RAM_CAPACITY:
				return getRamCapacity();
			case ModelPackage.BOARD__ROM_CAPACITY:
				return getRomCapacity();
			case ModelPackage.BOARD__BOX:
				if (resolve) return getBox();
				return basicGetBox();
			case ModelPackage.BOARD__PROCESSORS:
				return getProcessors();
			case ModelPackage.BOARD__IO_ADAPTERS:
				return getIoAdapters();
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
			case ModelPackage.BOARD__BOARD_TYPE:
				setBoardType((String)newValue);
				return;
			case ModelPackage.BOARD__POWER_SUPPLY:
				setPowerSupply((String)newValue);
				return;
			case ModelPackage.BOARD__ASSURANCE_LEVEL:
				setAssuranceLevel((DesignAssuranceLevelType)newValue);
				return;
			case ModelPackage.BOARD__RAM_CAPACITY:
				setRamCapacity((Integer)newValue);
				return;
			case ModelPackage.BOARD__ROM_CAPACITY:
				setRomCapacity((Integer)newValue);
				return;
			case ModelPackage.BOARD__BOX:
				setBox((Box)newValue);
				return;
			case ModelPackage.BOARD__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
				return;
			case ModelPackage.BOARD__IO_ADAPTERS:
				getIoAdapters().clear();
				getIoAdapters().addAll((Collection<? extends IOAdapter>)newValue);
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
			case ModelPackage.BOARD__BOARD_TYPE:
				setBoardType(BOARD_TYPE_EDEFAULT);
				return;
			case ModelPackage.BOARD__POWER_SUPPLY:
				setPowerSupply(POWER_SUPPLY_EDEFAULT);
				return;
			case ModelPackage.BOARD__ASSURANCE_LEVEL:
				setAssuranceLevel(ASSURANCE_LEVEL_EDEFAULT);
				return;
			case ModelPackage.BOARD__RAM_CAPACITY:
				setRamCapacity(RAM_CAPACITY_EDEFAULT);
				return;
			case ModelPackage.BOARD__ROM_CAPACITY:
				setRomCapacity(ROM_CAPACITY_EDEFAULT);
				return;
			case ModelPackage.BOARD__BOX:
				setBox((Box)null);
				return;
			case ModelPackage.BOARD__PROCESSORS:
				getProcessors().clear();
				return;
			case ModelPackage.BOARD__IO_ADAPTERS:
				getIoAdapters().clear();
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
			case ModelPackage.BOARD__BOARD_TYPE:
				return BOARD_TYPE_EDEFAULT == null ? boardType != null : !BOARD_TYPE_EDEFAULT.equals(boardType);
			case ModelPackage.BOARD__POWER_SUPPLY:
				return POWER_SUPPLY_EDEFAULT == null ? powerSupply != null : !POWER_SUPPLY_EDEFAULT.equals(powerSupply);
			case ModelPackage.BOARD__ASSURANCE_LEVEL:
				return assuranceLevel != ASSURANCE_LEVEL_EDEFAULT;
			case ModelPackage.BOARD__RAM_CAPACITY:
				return ramCapacity != RAM_CAPACITY_EDEFAULT;
			case ModelPackage.BOARD__ROM_CAPACITY:
				return romCapacity != ROM_CAPACITY_EDEFAULT;
			case ModelPackage.BOARD__BOX:
				return basicGetBox() != null;
			case ModelPackage.BOARD__PROCESSORS:
				return processors != null && !processors.isEmpty();
			case ModelPackage.BOARD__IO_ADAPTERS:
				return ioAdapters != null && !ioAdapters.isEmpty();
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
			case ModelPackage.BOARD___TO_STRING:
				return toString();
			case ModelPackage.BOARD___GET_ALL_PROCESSORS:
				return getAllProcessors();
			case ModelPackage.BOARD___GET_ALL_CORES:
				return getAllCores();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BoardImpl
