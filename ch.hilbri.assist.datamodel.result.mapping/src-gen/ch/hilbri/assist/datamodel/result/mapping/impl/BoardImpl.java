/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;

import ch.hilbri.assist.datamodel.result.mapping.Application;
import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.Box;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.IOAdapter;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;
import ch.hilbri.assist.datamodel.result.mapping.MetricParameter;
import ch.hilbri.assist.datamodel.result.mapping.Network;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getSide <em>Side</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getEss <em>Ess</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getRamCapacity <em>Ram Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getRamUtilization <em>Ram Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getRomCapacity <em>Rom Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getRomUtilization <em>Rom Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getIoAdapters <em>Io Adapters</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#getMetricParameters <em>Metric Parameters</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.BoardImpl#isNotUsed <em>Not Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends HardwareElementImpl implements Board {
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
	 * The default value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected static final String BOARD_TYPE_EDEFAULT = null;

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
	protected static final String POWER_SUPPLY_EDEFAULT = null;

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
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected String side = SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEss() <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEss()
	 * @generated
	 * @ordered
	 */
	protected static final String ESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEss() <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEss()
	 * @generated
	 * @ordered
	 */
	protected String ess = ESS_EDEFAULT;

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
	 * The default value of the '{@link #getRamUtilization() <em>Ram Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRamUtilization() <em>Ram Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamUtilization()
	 * @generated
	 * @ordered
	 */
	protected int ramUtilization = RAM_UTILIZATION_EDEFAULT;

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
	 * The default value of the '{@link #getRomUtilization() <em>Rom Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRomUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int ROM_UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRomUtilization() <em>Rom Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRomUtilization()
	 * @generated
	 * @ordered
	 */
	protected int romUtilization = ROM_UTILIZATION_EDEFAULT;

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
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * The cached value of the '{@link #getMetricParameters() <em>Metric Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MetricParameter> metricParameters;

	/**
	 * The default value of the '{@link #isNotUsed() <em>Not Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_USED_EDEFAULT = false;

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
		return MappingPackage.Literals.BOARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__MANUFACTURER, oldManufacturer, manufacturer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__BOARD_TYPE, oldBoardType, boardType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__POWER_SUPPLY, oldPowerSupply, powerSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide(String newSide) {
		String oldSide = side;
		side = newSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEss() {
		return ess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEss(String newEss) {
		String oldEss = ess;
		ess = newEss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__ESS, oldEss, ess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__RAM_CAPACITY, oldRamCapacity, ramCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRamUtilization() {
		return ramUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamUtilization(int newRamUtilization) {
		int oldRamUtilization = ramUtilization;
		ramUtilization = newRamUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__RAM_UTILIZATION, oldRamUtilization, ramUtilization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__ROM_CAPACITY, oldRomCapacity, romCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRomUtilization() {
		return romUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRomUtilization(int newRomUtilization) {
		int oldRomUtilization = romUtilization;
		romUtilization = newRomUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__ROM_UTILIZATION, oldRomUtilization, romUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getBox() {
		if (eContainerFeatureID() != MappingPackage.BOARD__BOX) return null;
		return (Box)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetBox() {
		if (eContainerFeatureID() != MappingPackage.BOARD__BOX) return null;
		return (Box)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBox(Box newBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBox, MappingPackage.BOARD__BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBox(Box newBox) {
		if (newBox != eInternalContainer() || (eContainerFeatureID() != MappingPackage.BOARD__BOX && newBox != null)) {
			if (EcoreUtil.isAncestor(this, newBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBox != null)
				msgs = ((InternalEObject)newBox).eInverseAdd(this, MappingPackage.BOX__BOARDS, Box.class, msgs);
			msgs = basicSetBox(newBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.BOARD__BOX, newBox, newBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentWithInverseEList<Processor>(Processor.class, this, MappingPackage.BOARD__PROCESSORS, MappingPackage.PROCESSOR__BOARD);
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
			ioAdapters = new EObjectContainmentEList<IOAdapter>(IOAdapter.class, this, MappingPackage.BOARD__IO_ADAPTERS);
		}
		return ioAdapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectWithInverseResolvingEList.ManyInverse<Network>(Network.class, this, MappingPackage.BOARD__NETWORKS, MappingPackage.NETWORK__BOARDS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricParameter> getMetricParameters() {
		if (metricParameters == null) {
			metricParameters = new EObjectContainmentEList<MetricParameter>(MetricParameter.class, this, MappingPackage.BOARD__METRIC_PARAMETERS);
		}
		return metricParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotUsed() {
		boolean result = false;
		EList<Processor> _processors = this.getProcessors();
		for (final Processor p : _processors) {
			result = (result || p.isNotUsed());
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getAllApplications() {
		final BasicEList<Application> list = new BasicEList<Application>();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getAllCores() {
		final BasicEList<Core> list = new BasicEList<Core>();
		EList<Processor> _processors = this.getProcessors();
		for (final Processor p : _processors) {
			EList<Core> _cores = p.getCores();
			list.addAll(_cores);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getHardwareLevel() {
		return HardwareArchitectureLevelType.BOARD;
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
			case MappingPackage.BOARD__BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBox((Box)otherEnd, msgs);
			case MappingPackage.BOARD__PROCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessors()).basicAdd(otherEnd, msgs);
			case MappingPackage.BOARD__NETWORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworks()).basicAdd(otherEnd, msgs);
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
			case MappingPackage.BOARD__BOX:
				return basicSetBox(null, msgs);
			case MappingPackage.BOARD__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
			case MappingPackage.BOARD__IO_ADAPTERS:
				return ((InternalEList<?>)getIoAdapters()).basicRemove(otherEnd, msgs);
			case MappingPackage.BOARD__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case MappingPackage.BOARD__METRIC_PARAMETERS:
				return ((InternalEList<?>)getMetricParameters()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.BOARD__BOX:
				return eInternalContainer().eInverseRemove(this, MappingPackage.BOX__BOARDS, Box.class, msgs);
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
			case MappingPackage.BOARD__MANUFACTURER:
				return getManufacturer();
			case MappingPackage.BOARD__BOARD_TYPE:
				return getBoardType();
			case MappingPackage.BOARD__POWER_SUPPLY:
				return getPowerSupply();
			case MappingPackage.BOARD__SIDE:
				return getSide();
			case MappingPackage.BOARD__ESS:
				return getEss();
			case MappingPackage.BOARD__ASSURANCE_LEVEL:
				return getAssuranceLevel();
			case MappingPackage.BOARD__RAM_CAPACITY:
				return getRamCapacity();
			case MappingPackage.BOARD__RAM_UTILIZATION:
				return getRamUtilization();
			case MappingPackage.BOARD__ROM_CAPACITY:
				return getRomCapacity();
			case MappingPackage.BOARD__ROM_UTILIZATION:
				return getRomUtilization();
			case MappingPackage.BOARD__BOX:
				if (resolve) return getBox();
				return basicGetBox();
			case MappingPackage.BOARD__PROCESSORS:
				return getProcessors();
			case MappingPackage.BOARD__IO_ADAPTERS:
				return getIoAdapters();
			case MappingPackage.BOARD__NETWORKS:
				return getNetworks();
			case MappingPackage.BOARD__METRIC_PARAMETERS:
				return getMetricParameters();
			case MappingPackage.BOARD__NOT_USED:
				return isNotUsed();
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
			case MappingPackage.BOARD__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case MappingPackage.BOARD__BOARD_TYPE:
				setBoardType((String)newValue);
				return;
			case MappingPackage.BOARD__POWER_SUPPLY:
				setPowerSupply((String)newValue);
				return;
			case MappingPackage.BOARD__SIDE:
				setSide((String)newValue);
				return;
			case MappingPackage.BOARD__ESS:
				setEss((String)newValue);
				return;
			case MappingPackage.BOARD__ASSURANCE_LEVEL:
				setAssuranceLevel((DesignAssuranceLevelType)newValue);
				return;
			case MappingPackage.BOARD__RAM_CAPACITY:
				setRamCapacity((Integer)newValue);
				return;
			case MappingPackage.BOARD__RAM_UTILIZATION:
				setRamUtilization((Integer)newValue);
				return;
			case MappingPackage.BOARD__ROM_CAPACITY:
				setRomCapacity((Integer)newValue);
				return;
			case MappingPackage.BOARD__ROM_UTILIZATION:
				setRomUtilization((Integer)newValue);
				return;
			case MappingPackage.BOARD__BOX:
				setBox((Box)newValue);
				return;
			case MappingPackage.BOARD__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
				return;
			case MappingPackage.BOARD__IO_ADAPTERS:
				getIoAdapters().clear();
				getIoAdapters().addAll((Collection<? extends IOAdapter>)newValue);
				return;
			case MappingPackage.BOARD__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case MappingPackage.BOARD__METRIC_PARAMETERS:
				getMetricParameters().clear();
				getMetricParameters().addAll((Collection<? extends MetricParameter>)newValue);
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
			case MappingPackage.BOARD__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case MappingPackage.BOARD__BOARD_TYPE:
				setBoardType(BOARD_TYPE_EDEFAULT);
				return;
			case MappingPackage.BOARD__POWER_SUPPLY:
				setPowerSupply(POWER_SUPPLY_EDEFAULT);
				return;
			case MappingPackage.BOARD__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case MappingPackage.BOARD__ESS:
				setEss(ESS_EDEFAULT);
				return;
			case MappingPackage.BOARD__ASSURANCE_LEVEL:
				setAssuranceLevel(ASSURANCE_LEVEL_EDEFAULT);
				return;
			case MappingPackage.BOARD__RAM_CAPACITY:
				setRamCapacity(RAM_CAPACITY_EDEFAULT);
				return;
			case MappingPackage.BOARD__RAM_UTILIZATION:
				setRamUtilization(RAM_UTILIZATION_EDEFAULT);
				return;
			case MappingPackage.BOARD__ROM_CAPACITY:
				setRomCapacity(ROM_CAPACITY_EDEFAULT);
				return;
			case MappingPackage.BOARD__ROM_UTILIZATION:
				setRomUtilization(ROM_UTILIZATION_EDEFAULT);
				return;
			case MappingPackage.BOARD__BOX:
				setBox((Box)null);
				return;
			case MappingPackage.BOARD__PROCESSORS:
				getProcessors().clear();
				return;
			case MappingPackage.BOARD__IO_ADAPTERS:
				getIoAdapters().clear();
				return;
			case MappingPackage.BOARD__NETWORKS:
				getNetworks().clear();
				return;
			case MappingPackage.BOARD__METRIC_PARAMETERS:
				getMetricParameters().clear();
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
			case MappingPackage.BOARD__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case MappingPackage.BOARD__BOARD_TYPE:
				return BOARD_TYPE_EDEFAULT == null ? boardType != null : !BOARD_TYPE_EDEFAULT.equals(boardType);
			case MappingPackage.BOARD__POWER_SUPPLY:
				return POWER_SUPPLY_EDEFAULT == null ? powerSupply != null : !POWER_SUPPLY_EDEFAULT.equals(powerSupply);
			case MappingPackage.BOARD__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case MappingPackage.BOARD__ESS:
				return ESS_EDEFAULT == null ? ess != null : !ESS_EDEFAULT.equals(ess);
			case MappingPackage.BOARD__ASSURANCE_LEVEL:
				return assuranceLevel != ASSURANCE_LEVEL_EDEFAULT;
			case MappingPackage.BOARD__RAM_CAPACITY:
				return ramCapacity != RAM_CAPACITY_EDEFAULT;
			case MappingPackage.BOARD__RAM_UTILIZATION:
				return ramUtilization != RAM_UTILIZATION_EDEFAULT;
			case MappingPackage.BOARD__ROM_CAPACITY:
				return romCapacity != ROM_CAPACITY_EDEFAULT;
			case MappingPackage.BOARD__ROM_UTILIZATION:
				return romUtilization != ROM_UTILIZATION_EDEFAULT;
			case MappingPackage.BOARD__BOX:
				return basicGetBox() != null;
			case MappingPackage.BOARD__PROCESSORS:
				return processors != null && !processors.isEmpty();
			case MappingPackage.BOARD__IO_ADAPTERS:
				return ioAdapters != null && !ioAdapters.isEmpty();
			case MappingPackage.BOARD__NETWORKS:
				return networks != null && !networks.isEmpty();
			case MappingPackage.BOARD__METRIC_PARAMETERS:
				return metricParameters != null && !metricParameters.isEmpty();
			case MappingPackage.BOARD__NOT_USED:
				return isNotUsed() != NOT_USED_EDEFAULT;
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
			case MappingPackage.BOARD___GET_ALL_APPLICATIONS:
				return getAllApplications();
			case MappingPackage.BOARD___GET_ALL_CORES:
				return getAllCores();
			case MappingPackage.BOARD___GET_HARDWARE_LEVEL:
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
		result.append(", boardType: ");
		result.append(boardType);
		result.append(", powerSupply: ");
		result.append(powerSupply);
		result.append(", side: ");
		result.append(side);
		result.append(", ess: ");
		result.append(ess);
		result.append(", assuranceLevel: ");
		result.append(assuranceLevel);
		result.append(", ramCapacity: ");
		result.append(ramCapacity);
		result.append(", ramUtilization: ");
		result.append(ramUtilization);
		result.append(", romCapacity: ");
		result.append(romCapacity);
		result.append(", romUtilization: ");
		result.append(romUtilization);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
