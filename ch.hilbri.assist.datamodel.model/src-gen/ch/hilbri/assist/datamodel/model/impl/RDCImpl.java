/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.RDC;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getSide <em>Side</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getRdcType <em>Rdc Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getEss <em>Ess</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getResourceX <em>Resource X</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getResourceY <em>Resource Y</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getResourceZ <em>Resource Z</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RDCImpl#getConnectedPins <em>Connected Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDCImpl extends HardwareElementImpl implements RDC {
	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = "";

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
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_EDEFAULT = "";

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
	 * The default value of the '{@link #getRdcType() <em>Rdc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdcType()
	 * @generated
	 * @ordered
	 */
	protected static final String RDC_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRdcType() <em>Rdc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdcType()
	 * @generated
	 * @ordered
	 */
	protected String rdcType = RDC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEss() <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEss()
	 * @generated
	 * @ordered
	 */
	protected static final String ESS_EDEFAULT = "";

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceX() <em>Resource X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceX()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceX() <em>Resource X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceX()
	 * @generated
	 * @ordered
	 */
	protected int resourceX = RESOURCE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceY() <em>Resource Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceY()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceY() <em>Resource Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceY()
	 * @generated
	 * @ordered
	 */
	protected int resourceY = RESOURCE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceZ() <em>Resource Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceZ()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceZ() <em>Resource Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceZ()
	 * @generated
	 * @ordered
	 */
	protected int resourceZ = RESOURCE_Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getConnectedPins() <em>Connected Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedPins()
	 * @generated
	 * @ordered
	 */
	protected EList<InternallyConnectedPinEntry> connectedPins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RDC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__MANUFACTURER, oldManufacturer, manufacturer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__POWER_SUPPLY, oldPowerSupply, powerSupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRdcType() {
		return rdcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdcType(String newRdcType) {
		String oldRdcType = rdcType;
		rdcType = newRdcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__RDC_TYPE, oldRdcType, rdcType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__ESS, oldEss, ess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceX() {
		return resourceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceX(int newResourceX) {
		int oldResourceX = resourceX;
		resourceX = newResourceX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__RESOURCE_X, oldResourceX, resourceX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceY() {
		return resourceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceY(int newResourceY) {
		int oldResourceY = resourceY;
		resourceY = newResourceY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__RESOURCE_Y, oldResourceY, resourceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceZ() {
		return resourceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceZ(int newResourceZ) {
		int oldResourceZ = resourceZ;
		resourceZ = newResourceZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__RESOURCE_Z, oldResourceZ, resourceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		if (eContainerFeatureID() != ModelPackage.RDC__COMPARTMENT) return null;
		return (Compartment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetCompartment() {
		if (eContainerFeatureID() != ModelPackage.RDC__COMPARTMENT) return null;
		return (Compartment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartment(Compartment newCompartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompartment, ModelPackage.RDC__COMPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(Compartment newCompartment) {
		if (newCompartment != eInternalContainer() || (eContainerFeatureID() != ModelPackage.RDC__COMPARTMENT && newCompartment != null)) {
			if (EcoreUtil.isAncestor(this, newCompartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompartment != null)
				msgs = ((InternalEObject)newCompartment).eInverseAdd(this, ModelPackage.COMPARTMENT__RDCS, Compartment.class, msgs);
			msgs = basicSetCompartment(newCompartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RDC__COMPARTMENT, newCompartment, newCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, ModelPackage.RDC__CONNECTORS, ModelPackage.CONNECTOR__RDC);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternallyConnectedPinEntry> getConnectedPins() {
		if (connectedPins == null) {
			connectedPins = new EObjectContainmentEList<InternallyConnectedPinEntry>(InternallyConnectedPinEntry.class, this, ModelPackage.RDC__CONNECTED_PINS);
		}
		return connectedPins;
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
	public EList<Integer> getAvailableEqInterfaces(final EList<String> eqInterfaceTypes) {
		EList<Integer> _xblockexpression = null;
		{
			EList<Connector> _connectors = this.getConnectors();
			final Function1<Connector, EList<AvailableEqInterface>> _function = new Function1<Connector, EList<AvailableEqInterface>>() {
				public EList<AvailableEqInterface> apply(final Connector it) {
					return it.getAvailableEqInterfaces();
				}
			};
			EList<EList<AvailableEqInterface>> _map = XcoreEListExtensions.<Connector, EList<AvailableEqInterface>>map(_connectors, _function);
			final Iterable<AvailableEqInterface> allAvailableEqInterfaces = Iterables.<AvailableEqInterface>concat(_map);
			final Function1<String, Integer> _function_1 = new Function1<String, Integer>() {
				public Integer apply(final String it) {
					Integer _xblockexpression = null;
					{
						final String typeName = it;
						Integer _xifexpression = null;
						final Function1<AvailableEqInterface, Boolean> _function = new Function1<AvailableEqInterface, Boolean>() {
							public Boolean apply(final AvailableEqInterface it) {
								String _eqInterfaceType = it.getEqInterfaceType();
								return Boolean.valueOf(_eqInterfaceType.equals(typeName));
							}
						};
						Iterable<AvailableEqInterface> _filter = IterableExtensions.<AvailableEqInterface>filter(allAvailableEqInterfaces, _function);
						boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_filter);
						boolean _not = (!_isNullOrEmpty);
						if (_not) {
							final Function1<AvailableEqInterface, Boolean> _function_1 = new Function1<AvailableEqInterface, Boolean>() {
								public Boolean apply(final AvailableEqInterface it) {
									String _eqInterfaceType = it.getEqInterfaceType();
									return Boolean.valueOf(_eqInterfaceType.equals(typeName));
								}
							};
							Iterable<AvailableEqInterface> _filter_1 = IterableExtensions.<AvailableEqInterface>filter(allAvailableEqInterfaces, _function_1);
							final Function1<AvailableEqInterface, Integer> _function_2 = new Function1<AvailableEqInterface, Integer>() {
								public Integer apply(final AvailableEqInterface it) {
									return Integer.valueOf(it.getCount());
								}
							};
							Iterable<Integer> _map = IterableExtensions.<AvailableEqInterface, Integer>map(_filter_1, _function_2);
							final Function2<Integer, Integer, Integer> _function_3 = new Function2<Integer, Integer, Integer>() {
								public Integer apply(final Integer p1, final Integer p2) {
									return Integer.valueOf(((p1).intValue() + (p2).intValue()));
								}
							};
							_xifexpression = IterableExtensions.<Integer>reduce(_map, _function_3);
						}
						else {
							_xifexpression = Integer.valueOf(0);
						}
						_xblockexpression = _xifexpression;
					}
					return _xblockexpression;
				}
			};
			_xblockexpression = XcoreEListExtensions.<String, Integer>map(eqInterfaceTypes, _function_1);
		}
		return _xblockexpression;
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
			case ModelPackage.RDC__COMPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompartment((Compartment)otherEnd, msgs);
			case ModelPackage.RDC__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.RDC__COMPARTMENT:
				return basicSetCompartment(null, msgs);
			case ModelPackage.RDC__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case ModelPackage.RDC__CONNECTED_PINS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.RDC__COMPARTMENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.COMPARTMENT__RDCS, Compartment.class, msgs);
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
			case ModelPackage.RDC__MANUFACTURER:
				return getManufacturer();
			case ModelPackage.RDC__POWER_SUPPLY:
				return getPowerSupply();
			case ModelPackage.RDC__SIDE:
				return getSide();
			case ModelPackage.RDC__RDC_TYPE:
				return getRdcType();
			case ModelPackage.RDC__ESS:
				return getEss();
			case ModelPackage.RDC__LOCATION:
				return getLocation();
			case ModelPackage.RDC__RESOURCE_X:
				return getResourceX();
			case ModelPackage.RDC__RESOURCE_Y:
				return getResourceY();
			case ModelPackage.RDC__RESOURCE_Z:
				return getResourceZ();
			case ModelPackage.RDC__COMPARTMENT:
				if (resolve) return getCompartment();
				return basicGetCompartment();
			case ModelPackage.RDC__CONNECTORS:
				return getConnectors();
			case ModelPackage.RDC__CONNECTED_PINS:
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
			case ModelPackage.RDC__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case ModelPackage.RDC__POWER_SUPPLY:
				setPowerSupply((String)newValue);
				return;
			case ModelPackage.RDC__SIDE:
				setSide((String)newValue);
				return;
			case ModelPackage.RDC__RDC_TYPE:
				setRdcType((String)newValue);
				return;
			case ModelPackage.RDC__ESS:
				setEss((String)newValue);
				return;
			case ModelPackage.RDC__LOCATION:
				setLocation((String)newValue);
				return;
			case ModelPackage.RDC__RESOURCE_X:
				setResourceX((Integer)newValue);
				return;
			case ModelPackage.RDC__RESOURCE_Y:
				setResourceY((Integer)newValue);
				return;
			case ModelPackage.RDC__RESOURCE_Z:
				setResourceZ((Integer)newValue);
				return;
			case ModelPackage.RDC__COMPARTMENT:
				setCompartment((Compartment)newValue);
				return;
			case ModelPackage.RDC__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case ModelPackage.RDC__CONNECTED_PINS:
				getConnectedPins().clear();
				getConnectedPins().addAll((Collection<? extends InternallyConnectedPinEntry>)newValue);
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
			case ModelPackage.RDC__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case ModelPackage.RDC__POWER_SUPPLY:
				setPowerSupply(POWER_SUPPLY_EDEFAULT);
				return;
			case ModelPackage.RDC__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case ModelPackage.RDC__RDC_TYPE:
				setRdcType(RDC_TYPE_EDEFAULT);
				return;
			case ModelPackage.RDC__ESS:
				setEss(ESS_EDEFAULT);
				return;
			case ModelPackage.RDC__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ModelPackage.RDC__RESOURCE_X:
				setResourceX(RESOURCE_X_EDEFAULT);
				return;
			case ModelPackage.RDC__RESOURCE_Y:
				setResourceY(RESOURCE_Y_EDEFAULT);
				return;
			case ModelPackage.RDC__RESOURCE_Z:
				setResourceZ(RESOURCE_Z_EDEFAULT);
				return;
			case ModelPackage.RDC__COMPARTMENT:
				setCompartment((Compartment)null);
				return;
			case ModelPackage.RDC__CONNECTORS:
				getConnectors().clear();
				return;
			case ModelPackage.RDC__CONNECTED_PINS:
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
			case ModelPackage.RDC__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case ModelPackage.RDC__POWER_SUPPLY:
				return POWER_SUPPLY_EDEFAULT == null ? powerSupply != null : !POWER_SUPPLY_EDEFAULT.equals(powerSupply);
			case ModelPackage.RDC__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case ModelPackage.RDC__RDC_TYPE:
				return RDC_TYPE_EDEFAULT == null ? rdcType != null : !RDC_TYPE_EDEFAULT.equals(rdcType);
			case ModelPackage.RDC__ESS:
				return ESS_EDEFAULT == null ? ess != null : !ESS_EDEFAULT.equals(ess);
			case ModelPackage.RDC__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ModelPackage.RDC__RESOURCE_X:
				return resourceX != RESOURCE_X_EDEFAULT;
			case ModelPackage.RDC__RESOURCE_Y:
				return resourceY != RESOURCE_Y_EDEFAULT;
			case ModelPackage.RDC__RESOURCE_Z:
				return resourceZ != RESOURCE_Z_EDEFAULT;
			case ModelPackage.RDC__COMPARTMENT:
				return basicGetCompartment() != null;
			case ModelPackage.RDC__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case ModelPackage.RDC__CONNECTED_PINS:
				return connectedPins != null && !connectedPins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.RDC___TO_STRING:
				return toString();
			case ModelPackage.RDC___GET_AVAILABLE_EQ_INTERFACES__ELIST:
				return getAvailableEqInterfaces((EList<String>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RDCImpl
