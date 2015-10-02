/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.Pin;
import ch.hilbri.assist.datamodel.model.RDC;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CompartmentImpl#getPins <em>Pins</em>}</li>
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
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pins;

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
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectResolvingEList<Pin>(Pin.class, this, ModelPackage.COMPARTMENT__PINS);
		}
		return pins;
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
			case ModelPackage.COMPARTMENT__PINS:
				return getPins();
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
			case ModelPackage.COMPARTMENT__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
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
			case ModelPackage.COMPARTMENT__PINS:
				getPins().clear();
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
			case ModelPackage.COMPARTMENT__PINS:
				return pins != null && !pins.isEmpty();
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
			case ModelPackage.COMPARTMENT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompartmentImpl
