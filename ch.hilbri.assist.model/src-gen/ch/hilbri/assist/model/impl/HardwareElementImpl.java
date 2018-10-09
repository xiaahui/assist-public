/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CustomProperty;
import ch.hilbri.assist.model.Feature;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getGetHardwareLevel <em>Get Hardware Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareElementImpl extends MinimalEObjectImpl.Container implements HardwareElement {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = "";

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
     * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatures()
     * @generated
     * @ordered
     */
    protected EList<Feature> features;

    /**
     * The cached value of the '{@link #getCustomProperties() <em>Custom Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomProperties()
     * @generated
     * @ordered
     */
    protected EList<CustomProperty> customProperties;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * The default value of the '{@link #getGetHardwareLevel() <em>Get Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGetHardwareLevel()
     * @generated
     * @ordered
     */
    protected static final HardwareArchitectureLevelType GET_HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HardwareElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.HARDWARE_ELEMENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HARDWARE_ELEMENT__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HARDWARE_ELEMENT__MANUFACTURER, oldManufacturer, manufacturer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Feature> getFeatures() {
        if (features == null) {
            features = new EObjectContainmentEList<Feature>(Feature.class, this, ModelPackage.HARDWARE_ELEMENT__FEATURES);
        }
        return features;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CustomProperty> getCustomProperties() {
        if (customProperties == null) {
            customProperties = new EObjectContainmentEList<CustomProperty>(CustomProperty.class, this, ModelPackage.HARDWARE_ELEMENT__CUSTOM_PROPERTIES);
        }
        return customProperties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, ModelPackage.HARDWARE_ELEMENT__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HardwareArchitectureLevelType getGetHardwareLevel() {
        HardwareArchitectureLevelType _xifexpression = null;
        if ((this instanceof Compartment)) {
            _xifexpression = HardwareArchitectureLevelType.COMPARTMENT;
        }
        else {
            HardwareArchitectureLevelType _xifexpression_1 = null;
            if ((this instanceof Box)) {
                _xifexpression_1 = HardwareArchitectureLevelType.BOX;
            }
            else {
                HardwareArchitectureLevelType _xifexpression_2 = null;
                if ((this instanceof Board)) {
                    _xifexpression_2 = HardwareArchitectureLevelType.BOARD;
                }
                else {
                    HardwareArchitectureLevelType _xifexpression_3 = null;
                    if ((this instanceof Processor)) {
                        _xifexpression_3 = HardwareArchitectureLevelType.PROCESSOR;
                    }
                    else {
                        HardwareArchitectureLevelType _xifexpression_4 = null;
                        if ((this instanceof Core)) {
                            _xifexpression_4 = HardwareArchitectureLevelType.CORE;
                        }
                        _xifexpression_3 = _xifexpression_4;
                    }
                    _xifexpression_2 = _xifexpression_3;
                }
                _xifexpression_1 = _xifexpression_2;
            }
            _xifexpression = _xifexpression_1;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
            case ModelPackage.HARDWARE_ELEMENT__CUSTOM_PROPERTIES:
                return ((InternalEList<?>)getCustomProperties()).basicRemove(otherEnd, msgs);
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.HARDWARE_ELEMENT__NAME:
                return getName();
            case ModelPackage.HARDWARE_ELEMENT__MANUFACTURER:
                return getManufacturer();
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                return getFeatures();
            case ModelPackage.HARDWARE_ELEMENT__CUSTOM_PROPERTIES:
                return getCustomProperties();
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                return getProperties();
            case ModelPackage.HARDWARE_ELEMENT__GET_HARDWARE_LEVEL:
                return getGetHardwareLevel();
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
            case ModelPackage.HARDWARE_ELEMENT__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.HARDWARE_ELEMENT__MANUFACTURER:
                setManufacturer((String)newValue);
                return;
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                getFeatures().clear();
                getFeatures().addAll((Collection<? extends Feature>)newValue);
                return;
            case ModelPackage.HARDWARE_ELEMENT__CUSTOM_PROPERTIES:
                getCustomProperties().clear();
                getCustomProperties().addAll((Collection<? extends CustomProperty>)newValue);
                return;
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
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
            case ModelPackage.HARDWARE_ELEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.HARDWARE_ELEMENT__MANUFACTURER:
                setManufacturer(MANUFACTURER_EDEFAULT);
                return;
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                getFeatures().clear();
                return;
            case ModelPackage.HARDWARE_ELEMENT__CUSTOM_PROPERTIES:
                getCustomProperties().clear();
                return;
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                getProperties().clear();
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
            case ModelPackage.HARDWARE_ELEMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.HARDWARE_ELEMENT__MANUFACTURER:
                return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                return features != null && !features.isEmpty();
            case ModelPackage.HARDWARE_ELEMENT__CUSTOM_PROPERTIES:
                return customProperties != null && !customProperties.isEmpty();
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case ModelPackage.HARDWARE_ELEMENT__GET_HARDWARE_LEVEL:
                return getGetHardwareLevel() != GET_HARDWARE_LEVEL_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", manufacturer: ");
        result.append(manufacturer);
        result.append(')');
        return result.toString();
    }

} //HardwareElementImpl
