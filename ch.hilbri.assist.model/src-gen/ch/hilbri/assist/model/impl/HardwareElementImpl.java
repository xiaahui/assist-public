/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CustomIntProperty;
import ch.hilbri.assist.model.CustomProperty;
import ch.hilbri.assist.model.CustomStringProperty;
import ch.hilbri.assist.model.Feature;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ManufacturerProperty;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Property;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.HardwareElementImpl#getFeatures <em>Features</em>}</li>
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
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

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
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    public String getManufacturer() {
        String _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ManufacturerProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ManufacturerProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((ManufacturerProperty) _head).getValue();
        }
        else {
            _xifexpression = null;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setManufacturer(final String newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ManufacturerProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ManufacturerProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((ManufacturerProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            ManufacturerProperty _createManufacturerProperty = ModelFactory.eINSTANCE.createManufacturerProperty();
            final Procedure1<ManufacturerProperty> _function_2 = new Procedure1<ManufacturerProperty>() {
                public void apply(final ManufacturerProperty it) {
                    it.setValue(newValue);
                }
            };
            ManufacturerProperty _doubleArrow = ObjectExtensions.<ManufacturerProperty>operator_doubleArrow(_createManufacturerProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CustomProperty> getCustomPropertiesWithName(final String name) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf(((it instanceof CustomProperty) && Objects.equal(((CustomProperty) it).getName(), name)));
            }
        };
        final Function1<Property, CustomProperty> _function_1 = new Function1<Property, CustomProperty>() {
            public CustomProperty apply(final Property it) {
                return ((CustomProperty) it);
            }
        };
        return ECollections.<CustomProperty>toEList(IterableExtensions.<Property, CustomProperty>map(IterableExtensions.<Property>filter(this.getProperties(), _function), _function_1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CustomProperty> getCustomPropertiesWithNameAndValue(final String name, final String value) {
        final Function1<CustomProperty, Boolean> _function = new Function1<CustomProperty, Boolean>() {
            public Boolean apply(final CustomProperty it) {
                String _value = ((CustomStringProperty) it).getValue();
                return Boolean.valueOf(Objects.equal(_value, value));
            }
        };
        return ECollections.<CustomProperty>toEList(IterableExtensions.<CustomProperty>filter(this.getCustomPropertiesWithName(name), _function));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCustomStringProperty(final String name) {
        String _xifexpression = null;
        final Function1<CustomProperty, Boolean> _function = new Function1<CustomProperty, Boolean>() {
            public Boolean apply(final CustomProperty it) {
                return Boolean.valueOf((it instanceof CustomStringProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<CustomProperty>filter(this.getCustomPropertiesWithName(name), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<CustomProperty, Boolean> _function_1 = new Function1<CustomProperty, Boolean>() {
                public Boolean apply(final CustomProperty it) {
                    return Boolean.valueOf((it instanceof CustomStringProperty));
                }
            };
            CustomProperty _head = IterableExtensions.<CustomProperty>head(IterableExtensions.<CustomProperty>filter(this.getCustomPropertiesWithName(name), _function_1));
            _xifexpression = ((CustomStringProperty) _head).getValue();
        }
        else {
            _xifexpression = null;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getCustomIntProperty(final String name) {
        int _xifexpression = (int) 0;
        final Function1<CustomProperty, Boolean> _function = new Function1<CustomProperty, Boolean>() {
            public Boolean apply(final CustomProperty it) {
                return Boolean.valueOf((it instanceof CustomIntProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<CustomProperty>filter(this.getCustomPropertiesWithName(name), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<CustomProperty, Boolean> _function_1 = new Function1<CustomProperty, Boolean>() {
                public Boolean apply(final CustomProperty it) {
                    return Boolean.valueOf((it instanceof CustomIntProperty));
                }
            };
            CustomProperty _head = IterableExtensions.<CustomProperty>head(IterableExtensions.<CustomProperty>filter(this.getCustomPropertiesWithName(name), _function_1));
            _xifexpression = ((CustomIntProperty) _head).getValue();
        }
        else {
            _xifexpression = (-1);
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
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                return getProperties();
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                return getFeatures();
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
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                getFeatures().clear();
                getFeatures().addAll((Collection<? extends Feature>)newValue);
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
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                getProperties().clear();
                return;
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                getFeatures().clear();
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
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
                return features != null && !features.isEmpty();
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
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ModelPackage.HARDWARE_ELEMENT___GET_MANUFACTURER:
                return getManufacturer();
            case ModelPackage.HARDWARE_ELEMENT___SET_MANUFACTURER__STRING:
                setManufacturer((String)arguments.get(0));
                return null;
            case ModelPackage.HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING:
                return getCustomPropertiesWithName((String)arguments.get(0));
            case ModelPackage.HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING:
                return getCustomPropertiesWithNameAndValue((String)arguments.get(0), (String)arguments.get(1));
            case ModelPackage.HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING:
                return getCustomStringProperty((String)arguments.get(0));
            case ModelPackage.HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING:
                return getCustomIntProperty((String)arguments.get(0));
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //HardwareElementImpl
