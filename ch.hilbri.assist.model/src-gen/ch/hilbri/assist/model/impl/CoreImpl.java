/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CoreArchitectureProperty;
import ch.hilbri.assist.model.CoreCapacityProperty;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Property;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.CoreImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.CoreImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreImpl extends HardwareElementImpl implements Core {
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
    protected CoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.CORE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFullName() {
        String _fullName = this.getProcessor().getFullName();
        String _plus = (_fullName + ".");
        String _name = this.getName();
        return (_plus + _name);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Processor getProcessor() {
        if (eContainerFeatureID() != ModelPackage.CORE__PROCESSOR) return null;
        return (Processor)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Processor basicGetProcessor() {
        if (eContainerFeatureID() != ModelPackage.CORE__PROCESSOR) return null;
        return (Processor)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newProcessor, ModelPackage.CORE__PROCESSOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessor(Processor newProcessor) {
        if (newProcessor != eInternalContainer() || (eContainerFeatureID() != ModelPackage.CORE__PROCESSOR && newProcessor != null)) {
            if (EcoreUtil.isAncestor(this, newProcessor))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newProcessor != null)
                msgs = ((InternalEObject)newProcessor).eInverseAdd(this, ModelPackage.PROCESSOR__CORES, Processor.class, msgs);
            msgs = basicSetProcessor(newProcessor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORE__PROCESSOR, newProcessor, newProcessor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCoreCapacity() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CoreCapacityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CoreCapacityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((CoreCapacityProperty) _head).getValue();
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
    public void setCoreCapacity(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CoreCapacityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CoreCapacityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((CoreCapacityProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            CoreCapacityProperty _createCoreCapacityProperty = ModelFactory.eINSTANCE.createCoreCapacityProperty();
            final Procedure1<CoreCapacityProperty> _function_2 = new Procedure1<CoreCapacityProperty>() {
                public void apply(final CoreCapacityProperty it) {
                    it.setValue(newValue);
                }
            };
            CoreCapacityProperty _doubleArrow = ObjectExtensions.<CoreCapacityProperty>operator_doubleArrow(_createCoreCapacityProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCoreArchitecture() {
        String _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CoreArchitectureProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CoreArchitectureProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((CoreArchitectureProperty) _head).getValue();
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
    public void setCoreArchitecture(final String newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CoreArchitectureProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CoreArchitectureProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((CoreArchitectureProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            CoreArchitectureProperty _createCoreArchitectureProperty = ModelFactory.eINSTANCE.createCoreArchitectureProperty();
            final Procedure1<CoreArchitectureProperty> _function_2 = new Procedure1<CoreArchitectureProperty>() {
                public void apply(final CoreArchitectureProperty it) {
                    it.setValue(newValue);
                }
            };
            CoreArchitectureProperty _doubleArrow = ObjectExtensions.<CoreArchitectureProperty>operator_doubleArrow(_createCoreArchitectureProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.CORE__PROCESSOR:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetProcessor((Processor)otherEnd, msgs);
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
            case ModelPackage.CORE__PROCESSOR:
                return basicSetProcessor(null, msgs);
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
            case ModelPackage.CORE__PROCESSOR:
                return eInternalContainer().eInverseRemove(this, ModelPackage.PROCESSOR__CORES, Processor.class, msgs);
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
            case ModelPackage.CORE__FULL_NAME:
                return getFullName();
            case ModelPackage.CORE__PROCESSOR:
                if (resolve) return getProcessor();
                return basicGetProcessor();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.CORE__PROCESSOR:
                setProcessor((Processor)newValue);
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
            case ModelPackage.CORE__PROCESSOR:
                setProcessor((Processor)null);
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
            case ModelPackage.CORE__FULL_NAME:
                return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
            case ModelPackage.CORE__PROCESSOR:
                return basicGetProcessor() != null;
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
            case ModelPackage.CORE___GET_CORE_CAPACITY:
                return getCoreCapacity();
            case ModelPackage.CORE___SET_CORE_CAPACITY__INT:
                setCoreCapacity((Integer)arguments.get(0));
                return null;
            case ModelPackage.CORE___GET_CORE_ARCHITECTURE:
                return getCoreArchitecture();
            case ModelPackage.CORE___SET_CORE_ARCHITECTURE__STRING:
                setCoreArchitecture((String)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //CoreImpl
