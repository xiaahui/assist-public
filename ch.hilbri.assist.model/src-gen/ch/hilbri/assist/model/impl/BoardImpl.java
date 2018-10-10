/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardTypeProperty;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.DesignAssuranceLevelProperty;
import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PowerSupplyProperty;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.RAMCapacityProperty;
import ch.hilbri.assist.model.ROMCapacityProperty;

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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.BoardImpl#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.BoardImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.BoardImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends HardwareElementImpl implements Board {
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
     * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFullName()
     * @generated
     * @ordered
     */
    protected static final String FULL_NAME_EDEFAULT = null;

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
    public String getFullName() {
        String _xifexpression = null;
        Box _box = this.getBox();
        boolean _tripleNotEquals = (_box != null);
        if (_tripleNotEquals) {
            String _fullName = this.getBox().getFullName();
            String _plus = (_fullName + ".");
            String _name = this.getName();
            _xifexpression = (_plus + _name);
        }
        else {
            _xifexpression = this.getName();
        }
        return _xifexpression;
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
    public DesignAssuranceLevelType getAssuranceLevel() {
        DesignAssuranceLevelType _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof DesignAssuranceLevelProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof DesignAssuranceLevelProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((DesignAssuranceLevelProperty) _head).getValue();
        }
        else {
            _xifexpression = DesignAssuranceLevelType.NONE;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssuranceLevel(final DesignAssuranceLevelType newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof DesignAssuranceLevelProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof DesignAssuranceLevelProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((DesignAssuranceLevelProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            DesignAssuranceLevelProperty _createDesignAssuranceLevelProperty = ModelFactory.eINSTANCE.createDesignAssuranceLevelProperty();
            final Procedure1<DesignAssuranceLevelProperty> _function_2 = new Procedure1<DesignAssuranceLevelProperty>() {
                public void apply(final DesignAssuranceLevelProperty it) {
                    it.setValue(newValue);
                }
            };
            DesignAssuranceLevelProperty _doubleArrow = ObjectExtensions.<DesignAssuranceLevelProperty>operator_doubleArrow(_createDesignAssuranceLevelProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPowerSupply() {
        String _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof PowerSupplyProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof PowerSupplyProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((PowerSupplyProperty) _head).getValue();
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
    public void setPowerSupply(final String newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof PowerSupplyProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof PowerSupplyProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((PowerSupplyProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            PowerSupplyProperty _createPowerSupplyProperty = ModelFactory.eINSTANCE.createPowerSupplyProperty();
            final Procedure1<PowerSupplyProperty> _function_2 = new Procedure1<PowerSupplyProperty>() {
                public void apply(final PowerSupplyProperty it) {
                    it.setValue(newValue);
                }
            };
            PowerSupplyProperty _doubleArrow = ObjectExtensions.<PowerSupplyProperty>operator_doubleArrow(_createPowerSupplyProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBoardType() {
        String _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof BoardTypeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof BoardTypeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((BoardTypeProperty) _head).getValue();
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
    public void setBoardType(final String newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof BoardTypeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof BoardTypeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((BoardTypeProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            BoardTypeProperty _createBoardTypeProperty = ModelFactory.eINSTANCE.createBoardTypeProperty();
            final Procedure1<BoardTypeProperty> _function_2 = new Procedure1<BoardTypeProperty>() {
                public void apply(final BoardTypeProperty it) {
                    it.setValue(newValue);
                }
            };
            BoardTypeProperty _doubleArrow = ObjectExtensions.<BoardTypeProperty>operator_doubleArrow(_createBoardTypeProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRamCapacity() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof RAMCapacityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof RAMCapacityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((RAMCapacityProperty) _head).getValue();
        }
        else {
            _xifexpression = 0;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRamCapacity(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof RAMCapacityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof RAMCapacityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((RAMCapacityProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            RAMCapacityProperty _createRAMCapacityProperty = ModelFactory.eINSTANCE.createRAMCapacityProperty();
            final Procedure1<RAMCapacityProperty> _function_2 = new Procedure1<RAMCapacityProperty>() {
                public void apply(final RAMCapacityProperty it) {
                    it.setValue(newValue);
                }
            };
            RAMCapacityProperty _doubleArrow = ObjectExtensions.<RAMCapacityProperty>operator_doubleArrow(_createRAMCapacityProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRomCapacity() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ROMCapacityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ROMCapacityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((ROMCapacityProperty) _head).getValue();
        }
        else {
            _xifexpression = 0;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRomCapacity(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ROMCapacityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ROMCapacityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((ROMCapacityProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            ROMCapacityProperty _createROMCapacityProperty = ModelFactory.eINSTANCE.createROMCapacityProperty();
            final Procedure1<ROMCapacityProperty> _function_2 = new Procedure1<ROMCapacityProperty>() {
                public void apply(final ROMCapacityProperty it) {
                    it.setValue(newValue);
                }
            };
            ROMCapacityProperty _doubleArrow = ObjectExtensions.<ROMCapacityProperty>operator_doubleArrow(_createROMCapacityProperty, _function_2);
            _properties.add(_doubleArrow);
        }
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
            case ModelPackage.BOARD__BOX:
                if (resolve) return getBox();
                return basicGetBox();
            case ModelPackage.BOARD__PROCESSORS:
                return getProcessors();
            case ModelPackage.BOARD__FULL_NAME:
                return getFullName();
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
            case ModelPackage.BOARD__BOX:
                setBox((Box)newValue);
                return;
            case ModelPackage.BOARD__PROCESSORS:
                getProcessors().clear();
                getProcessors().addAll((Collection<? extends Processor>)newValue);
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
            case ModelPackage.BOARD__BOX:
                setBox((Box)null);
                return;
            case ModelPackage.BOARD__PROCESSORS:
                getProcessors().clear();
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
            case ModelPackage.BOARD__BOX:
                return basicGetBox() != null;
            case ModelPackage.BOARD__PROCESSORS:
                return processors != null && !processors.isEmpty();
            case ModelPackage.BOARD__FULL_NAME:
                return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
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
            case ModelPackage.BOARD___GET_ASSURANCE_LEVEL:
                return getAssuranceLevel();
            case ModelPackage.BOARD___SET_ASSURANCE_LEVEL__DESIGNASSURANCELEVELTYPE:
                setAssuranceLevel((DesignAssuranceLevelType)arguments.get(0));
                return null;
            case ModelPackage.BOARD___GET_POWER_SUPPLY:
                return getPowerSupply();
            case ModelPackage.BOARD___SET_POWER_SUPPLY__STRING:
                setPowerSupply((String)arguments.get(0));
                return null;
            case ModelPackage.BOARD___GET_BOARD_TYPE:
                return getBoardType();
            case ModelPackage.BOARD___SET_BOARD_TYPE__STRING:
                setBoardType((String)arguments.get(0));
                return null;
            case ModelPackage.BOARD___GET_RAM_CAPACITY:
                return getRamCapacity();
            case ModelPackage.BOARD___SET_RAM_CAPACITY__INT:
                setRamCapacity((Integer)arguments.get(0));
                return null;
            case ModelPackage.BOARD___GET_ROM_CAPACITY:
                return getRomCapacity();
            case ModelPackage.BOARD___SET_ROM_CAPACITY__INT:
                setRomCapacity((Integer)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //BoardImpl
