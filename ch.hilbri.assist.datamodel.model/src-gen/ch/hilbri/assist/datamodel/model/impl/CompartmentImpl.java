/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.RDC;

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
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl#getSide <em>Side</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl#getRdcs <em>Rdcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentImpl extends HardwareElementImpl implements Compartment {
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
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected String zone = ZONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRdcs() <em>Rdcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdcs()
	 * @generated
	 * @ordered
	 */
	protected EList<RDC> rdcs;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARTMENT__MANUFACTURER, oldManufacturer, manufacturer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARTMENT__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(String newZone) {
		String oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARTMENT__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDC> getRdcs() {
		if (rdcs == null) {
			rdcs = new EObjectContainmentWithInverseEList<RDC>(RDC.class, this, ModelPackage.COMPARTMENT__RDCS, ModelPackage.RDC__COMPARTMENT);
		}
		return rdcs;
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
	public EList<Connector> getAllConnectors() {
		EList<RDC> _rdcs = this.getRdcs();
		final Function1<RDC, EList<Connector>> _function = new Function1<RDC, EList<Connector>>() {
			public EList<Connector> apply(final RDC it) {
				return it.getConnectors();
			}
		};
		EList<EList<Connector>> _map = XcoreEListExtensions.<RDC, EList<Connector>>map(_rdcs, _function);
		Iterable<Connector> _flatten = Iterables.<Connector>concat(_map);
		return ECollections.<Connector>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getAvailableEqInterfaces(final EList<String> eqInterfaceTypes) {
		EList<Integer> _xblockexpression = null;
		{
			EList<Connector> _allConnectors = this.getAllConnectors();
			final Function1<Connector, EList<AvailableEqInterface>> _function = new Function1<Connector, EList<AvailableEqInterface>>() {
				public EList<AvailableEqInterface> apply(final Connector it) {
					return it.getAvailableEqInterfaces();
				}
			};
			EList<EList<AvailableEqInterface>> _map = XcoreEListExtensions.<Connector, EList<AvailableEqInterface>>map(_allConnectors, _function);
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
			case ModelPackage.COMPARTMENT__RDCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdcs()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.COMPARTMENT__RDCS:
				return ((InternalEList<?>)getRdcs()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMPARTMENT__MANUFACTURER:
				return getManufacturer();
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				return getPowerSupply();
			case ModelPackage.COMPARTMENT__SIDE:
				return getSide();
			case ModelPackage.COMPARTMENT__ZONE:
				return getZone();
			case ModelPackage.COMPARTMENT__RDCS:
				return getRdcs();
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
			case ModelPackage.COMPARTMENT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				setPowerSupply((String)newValue);
				return;
			case ModelPackage.COMPARTMENT__SIDE:
				setSide((String)newValue);
				return;
			case ModelPackage.COMPARTMENT__ZONE:
				setZone((String)newValue);
				return;
			case ModelPackage.COMPARTMENT__RDCS:
				getRdcs().clear();
				getRdcs().addAll((Collection<? extends RDC>)newValue);
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
			case ModelPackage.COMPARTMENT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				setPowerSupply(POWER_SUPPLY_EDEFAULT);
				return;
			case ModelPackage.COMPARTMENT__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case ModelPackage.COMPARTMENT__ZONE:
				setZone(ZONE_EDEFAULT);
				return;
			case ModelPackage.COMPARTMENT__RDCS:
				getRdcs().clear();
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
			case ModelPackage.COMPARTMENT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case ModelPackage.COMPARTMENT__POWER_SUPPLY:
				return POWER_SUPPLY_EDEFAULT == null ? powerSupply != null : !POWER_SUPPLY_EDEFAULT.equals(powerSupply);
			case ModelPackage.COMPARTMENT__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case ModelPackage.COMPARTMENT__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
			case ModelPackage.COMPARTMENT__RDCS:
				return rdcs != null && !rdcs.isEmpty();
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
			case ModelPackage.COMPARTMENT___TO_STRING:
				return toString();
			case ModelPackage.COMPARTMENT___GET_ALL_CONNECTORS:
				return getAllConnectors();
			case ModelPackage.COMPARTMENT___GET_AVAILABLE_EQ_INTERFACES__ELIST:
				return getAvailableEqInterfaces((EList<String>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompartmentImpl
