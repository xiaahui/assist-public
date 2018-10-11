/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.CriticalityLevelProperty;
import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.DevelopedByProperty;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.Task;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends SoftwareElementImpl implements Application {
    /**
     * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTasks()
     * @generated
     * @ordered
     */
    protected EList<Task> tasks;

    /**
     * The cached value of the '{@link #getRestrictMappingToHardwareElements() <em>Restrict Mapping To Hardware Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRestrictMappingToHardwareElements()
     * @generated
     * @ordered
     */
    protected EList<HardwareElement> restrictMappingToHardwareElements;

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
    protected ApplicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.APPLICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Task> getTasks() {
        if (tasks == null) {
            tasks = new EObjectContainmentWithInverseEList<Task>(Task.class, this, ModelPackage.APPLICATION__TASKS, ModelPackage.TASK__APPLICATION);
        }
        return tasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HardwareElement> getRestrictMappingToHardwareElements() {
        if (restrictMappingToHardwareElements == null) {
            restrictMappingToHardwareElements = new EObjectResolvingEList<HardwareElement>(HardwareElement.class, this, ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
        }
        return restrictMappingToHardwareElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFullName() {
        return this.getName();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDevelopedBy() {
        String _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof DevelopedByProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof DevelopedByProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((DevelopedByProperty) _head).getValue();
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
    public void setDevelopedBy(final String newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof DevelopedByProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof DevelopedByProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((DevelopedByProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            DevelopedByProperty _createDevelopedByProperty = ModelFactory.eINSTANCE.createDevelopedByProperty();
            final Procedure1<DevelopedByProperty> _function_2 = new Procedure1<DevelopedByProperty>() {
                public void apply(final DevelopedByProperty it) {
                    it.setValue(newValue);
                }
            };
            DevelopedByProperty _doubleArrow = ObjectExtensions.<DevelopedByProperty>operator_doubleArrow(_createDevelopedByProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DesignAssuranceLevelType getCriticalityLevel() {
        DesignAssuranceLevelType _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CriticalityLevelProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CriticalityLevelProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((CriticalityLevelProperty) _head).getValue();
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
    public void setCriticalityLevel(final DesignAssuranceLevelType newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CriticalityLevelProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CriticalityLevelProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((CriticalityLevelProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            CriticalityLevelProperty _createCriticalityLevelProperty = ModelFactory.eINSTANCE.createCriticalityLevelProperty();
            final Procedure1<CriticalityLevelProperty> _function_2 = new Procedure1<CriticalityLevelProperty>() {
                public void apply(final CriticalityLevelProperty it) {
                    it.setValue(newValue);
                }
            };
            CriticalityLevelProperty _doubleArrow = ObjectExtensions.<CriticalityLevelProperty>operator_doubleArrow(_createCriticalityLevelProperty, _function_2);
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
            case ModelPackage.APPLICATION__TASKS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
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
            case ModelPackage.APPLICATION__TASKS:
                return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.APPLICATION__TASKS:
                return getTasks();
            case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                return getRestrictMappingToHardwareElements();
            case ModelPackage.APPLICATION__FULL_NAME:
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
            case ModelPackage.APPLICATION__TASKS:
                getTasks().clear();
                getTasks().addAll((Collection<? extends Task>)newValue);
                return;
            case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                getRestrictMappingToHardwareElements().clear();
                getRestrictMappingToHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
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
            case ModelPackage.APPLICATION__TASKS:
                getTasks().clear();
                return;
            case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                getRestrictMappingToHardwareElements().clear();
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
            case ModelPackage.APPLICATION__TASKS:
                return tasks != null && !tasks.isEmpty();
            case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                return restrictMappingToHardwareElements != null && !restrictMappingToHardwareElements.isEmpty();
            case ModelPackage.APPLICATION__FULL_NAME:
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
            case ModelPackage.APPLICATION___GET_DEVELOPED_BY:
                return getDevelopedBy();
            case ModelPackage.APPLICATION___SET_DEVELOPED_BY__STRING:
                setDevelopedBy((String)arguments.get(0));
                return null;
            case ModelPackage.APPLICATION___GET_CRITICALITY_LEVEL:
                return getCriticalityLevel();
            case ModelPackage.APPLICATION___SET_CRITICALITY_LEVEL__DESIGNASSURANCELEVELTYPE:
                setCriticalityLevel((DesignAssuranceLevelType)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //ApplicationImpl
