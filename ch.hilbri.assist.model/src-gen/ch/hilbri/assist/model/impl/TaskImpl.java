/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AddInitTimeProperty;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.Color;
import ch.hilbri.assist.model.ColorProperty;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CoreUtilizationProperty;
import ch.hilbri.assist.model.DurationProperty;
import ch.hilbri.assist.model.EarlyToleranceProperty;
import ch.hilbri.assist.model.FeatureRequirement;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.LateToleranceProperty;
import ch.hilbri.assist.model.MaxEndTimeProperty;
import ch.hilbri.assist.model.MaxStartTimeProperty;
import ch.hilbri.assist.model.MinSliceDurationProperty;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PeriodProperty;
import ch.hilbri.assist.model.PeriodicityProperty;
import ch.hilbri.assist.model.PeriodicityType;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.RAMUtilizationProperty;
import ch.hilbri.assist.model.ROMUtilizationProperty;
import ch.hilbri.assist.model.SlicesProperty;
import ch.hilbri.assist.model.Task;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getFeatureRequirements <em>Feature Requirements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getAssignedCore <em>Assigned Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends SoftwareElementImpl implements Task {
    /**
     * The cached value of the '{@link #getFeatureRequirements() <em>Feature Requirements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureRequirements()
     * @generated
     * @ordered
     */
    protected EList<FeatureRequirement> featureRequirements;

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
     * The cached value of the '{@link #getAssignedCore() <em>Assigned Core</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignedCore()
     * @generated
     * @ordered
     */
    protected Core assignedCore;

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
    protected TaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Application getApplication() {
        if (eContainerFeatureID() != ModelPackage.TASK__APPLICATION) return null;
        return (Application)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Application basicGetApplication() {
        if (eContainerFeatureID() != ModelPackage.TASK__APPLICATION) return null;
        return (Application)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newApplication, ModelPackage.TASK__APPLICATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplication(Application newApplication) {
        if (newApplication != eInternalContainer() || (eContainerFeatureID() != ModelPackage.TASK__APPLICATION && newApplication != null)) {
            if (EcoreUtil.isAncestor(this, newApplication))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newApplication != null)
                msgs = ((InternalEObject)newApplication).eInverseAdd(this, ModelPackage.APPLICATION__TASKS, Application.class, msgs);
            msgs = basicSetApplication(newApplication, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__APPLICATION, newApplication, newApplication));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FeatureRequirement> getFeatureRequirements() {
        if (featureRequirements == null) {
            featureRequirements = new EObjectContainmentEList<FeatureRequirement>(FeatureRequirement.class, this, ModelPackage.TASK__FEATURE_REQUIREMENTS);
        }
        return featureRequirements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HardwareElement> getRestrictMappingToHardwareElements() {
        if (restrictMappingToHardwareElements == null) {
            restrictMappingToHardwareElements = new EObjectResolvingEList<HardwareElement>(HardwareElement.class, this, ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
        }
        return restrictMappingToHardwareElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Core getAssignedCore() {
        if (assignedCore != null && assignedCore.eIsProxy()) {
            InternalEObject oldAssignedCore = (InternalEObject)assignedCore;
            assignedCore = (Core)eResolveProxy(oldAssignedCore);
            if (assignedCore != oldAssignedCore) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TASK__ASSIGNED_CORE, oldAssignedCore, assignedCore));
            }
        }
        return assignedCore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Core basicGetAssignedCore() {
        return assignedCore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssignedCore(Core newAssignedCore) {
        Core oldAssignedCore = assignedCore;
        assignedCore = newAssignedCore;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__ASSIGNED_CORE, oldAssignedCore, assignedCore));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFullName() {
        String _name = this.getApplication().getName();
        String _plus = (_name + ".");
        String _name_1 = this.getName();
        return (_plus + _name_1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCoreUtilization() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CoreUtilizationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CoreUtilizationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((CoreUtilizationProperty) _head).getValue();
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
    public void setCoreUtilization(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof CoreUtilizationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof CoreUtilizationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((CoreUtilizationProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            CoreUtilizationProperty _createCoreUtilizationProperty = ModelFactory.eINSTANCE.createCoreUtilizationProperty();
            final Procedure1<CoreUtilizationProperty> _function_2 = new Procedure1<CoreUtilizationProperty>() {
                public void apply(final CoreUtilizationProperty it) {
                    it.setValue(newValue);
                }
            };
            CoreUtilizationProperty _doubleArrow = ObjectExtensions.<CoreUtilizationProperty>operator_doubleArrow(_createCoreUtilizationProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRamUtilization() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof RAMUtilizationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof RAMUtilizationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((RAMUtilizationProperty) _head).getValue();
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
    public void setRamUtilization(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof RAMUtilizationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof RAMUtilizationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((RAMUtilizationProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            RAMUtilizationProperty _createRAMUtilizationProperty = ModelFactory.eINSTANCE.createRAMUtilizationProperty();
            final Procedure1<RAMUtilizationProperty> _function_2 = new Procedure1<RAMUtilizationProperty>() {
                public void apply(final RAMUtilizationProperty it) {
                    it.setValue(newValue);
                }
            };
            RAMUtilizationProperty _doubleArrow = ObjectExtensions.<RAMUtilizationProperty>operator_doubleArrow(_createRAMUtilizationProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRomUtilization() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ROMUtilizationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ROMUtilizationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((ROMUtilizationProperty) _head).getValue();
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
    public void setRomUtilization(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ROMUtilizationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ROMUtilizationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((ROMUtilizationProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            ROMUtilizationProperty _createROMUtilizationProperty = ModelFactory.eINSTANCE.createROMUtilizationProperty();
            final Procedure1<ROMUtilizationProperty> _function_2 = new Procedure1<ROMUtilizationProperty>() {
                public void apply(final ROMUtilizationProperty it) {
                    it.setValue(newValue);
                }
            };
            ROMUtilizationProperty _doubleArrow = ObjectExtensions.<ROMUtilizationProperty>operator_doubleArrow(_createROMUtilizationProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDuration() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof DurationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof DurationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((DurationProperty) _head).getValue();
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
    public void setDuration(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof DurationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof DurationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((DurationProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            DurationProperty _createDurationProperty = ModelFactory.eINSTANCE.createDurationProperty();
            final Procedure1<DurationProperty> _function_2 = new Procedure1<DurationProperty>() {
                public void apply(final DurationProperty it) {
                    it.setValue(newValue);
                }
            };
            DurationProperty _doubleArrow = ObjectExtensions.<DurationProperty>operator_doubleArrow(_createDurationProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPeriod() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof PeriodProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof PeriodProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((PeriodProperty) _head).getValue();
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
    public void setPeriod(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof PeriodProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof PeriodProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((PeriodProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            PeriodProperty _createPeriodProperty = ModelFactory.eINSTANCE.createPeriodProperty();
            final Procedure1<PeriodProperty> _function_2 = new Procedure1<PeriodProperty>() {
                public void apply(final PeriodProperty it) {
                    it.setValue(newValue);
                }
            };
            PeriodProperty _doubleArrow = ObjectExtensions.<PeriodProperty>operator_doubleArrow(_createPeriodProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEarlyTolerance() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof EarlyToleranceProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof EarlyToleranceProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((EarlyToleranceProperty) _head).getValue();
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
    public void setEarlyTolerance(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof EarlyToleranceProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof EarlyToleranceProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((EarlyToleranceProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            EarlyToleranceProperty _createEarlyToleranceProperty = ModelFactory.eINSTANCE.createEarlyToleranceProperty();
            final Procedure1<EarlyToleranceProperty> _function_2 = new Procedure1<EarlyToleranceProperty>() {
                public void apply(final EarlyToleranceProperty it) {
                    it.setValue(newValue);
                }
            };
            EarlyToleranceProperty _doubleArrow = ObjectExtensions.<EarlyToleranceProperty>operator_doubleArrow(_createEarlyToleranceProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLateTolerance() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof LateToleranceProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof LateToleranceProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((LateToleranceProperty) _head).getValue();
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
    public void setLateTolerance(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof LateToleranceProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof LateToleranceProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((LateToleranceProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            LateToleranceProperty _createLateToleranceProperty = ModelFactory.eINSTANCE.createLateToleranceProperty();
            final Procedure1<LateToleranceProperty> _function_2 = new Procedure1<LateToleranceProperty>() {
                public void apply(final LateToleranceProperty it) {
                    it.setValue(newValue);
                }
            };
            LateToleranceProperty _doubleArrow = ObjectExtensions.<LateToleranceProperty>operator_doubleArrow(_createLateToleranceProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxStartTime() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MaxStartTimeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MaxStartTimeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((MaxStartTimeProperty) _head).getValue();
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
    public void setMaxStartTime(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MaxStartTimeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MaxStartTimeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((MaxStartTimeProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            MaxStartTimeProperty _createMaxStartTimeProperty = ModelFactory.eINSTANCE.createMaxStartTimeProperty();
            final Procedure1<MaxStartTimeProperty> _function_2 = new Procedure1<MaxStartTimeProperty>() {
                public void apply(final MaxStartTimeProperty it) {
                    it.setValue(newValue);
                }
            };
            MaxStartTimeProperty _doubleArrow = ObjectExtensions.<MaxStartTimeProperty>operator_doubleArrow(_createMaxStartTimeProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxEndTime() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MaxEndTimeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MaxEndTimeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((MaxEndTimeProperty) _head).getValue();
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
    public void setMaxEndTime(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MaxEndTimeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MaxEndTimeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((MaxEndTimeProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            MaxEndTimeProperty _createMaxEndTimeProperty = ModelFactory.eINSTANCE.createMaxEndTimeProperty();
            final Procedure1<MaxEndTimeProperty> _function_2 = new Procedure1<MaxEndTimeProperty>() {
                public void apply(final MaxEndTimeProperty it) {
                    it.setValue(newValue);
                }
            };
            MaxEndTimeProperty _doubleArrow = ObjectExtensions.<MaxEndTimeProperty>operator_doubleArrow(_createMaxEndTimeProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAddInitTime() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof AddInitTimeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof AddInitTimeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((AddInitTimeProperty) _head).getValue();
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
    public void setAddInitTime(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof AddInitTimeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof AddInitTimeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((AddInitTimeProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            AddInitTimeProperty _createAddInitTimeProperty = ModelFactory.eINSTANCE.createAddInitTimeProperty();
            final Procedure1<AddInitTimeProperty> _function_2 = new Procedure1<AddInitTimeProperty>() {
                public void apply(final AddInitTimeProperty it) {
                    it.setValue(newValue);
                }
            };
            AddInitTimeProperty _doubleArrow = ObjectExtensions.<AddInitTimeProperty>operator_doubleArrow(_createAddInitTimeProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSlices() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof SlicesProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof SlicesProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((SlicesProperty) _head).getValue();
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
    public void setSlices(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof SlicesProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof SlicesProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((SlicesProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            SlicesProperty _createSlicesProperty = ModelFactory.eINSTANCE.createSlicesProperty();
            final Procedure1<SlicesProperty> _function_2 = new Procedure1<SlicesProperty>() {
                public void apply(final SlicesProperty it) {
                    it.setValue(newValue);
                }
            };
            SlicesProperty _doubleArrow = ObjectExtensions.<SlicesProperty>operator_doubleArrow(_createSlicesProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinSliceDuration() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MinSliceDurationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MinSliceDurationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((MinSliceDurationProperty) _head).getValue();
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
    public void setMinSliceDuration(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MinSliceDurationProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MinSliceDurationProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((MinSliceDurationProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            MinSliceDurationProperty _createMinSliceDurationProperty = ModelFactory.eINSTANCE.createMinSliceDurationProperty();
            final Procedure1<MinSliceDurationProperty> _function_2 = new Procedure1<MinSliceDurationProperty>() {
                public void apply(final MinSliceDurationProperty it) {
                    it.setValue(newValue);
                }
            };
            MinSliceDurationProperty _doubleArrow = ObjectExtensions.<MinSliceDurationProperty>operator_doubleArrow(_createMinSliceDurationProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeriodicityType getPeriodicity() {
        PeriodicityType _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof PeriodicityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof PeriodicityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((PeriodicityProperty) _head).getValue();
        }
        else {
            _xifexpression = PeriodicityType.STRICT;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriodicity(final PeriodicityType newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof PeriodicityProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof PeriodicityProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((PeriodicityProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            PeriodicityProperty _createPeriodicityProperty = ModelFactory.eINSTANCE.createPeriodicityProperty();
            final Procedure1<PeriodicityProperty> _function_2 = new Procedure1<PeriodicityProperty>() {
                public void apply(final PeriodicityProperty it) {
                    it.setValue(newValue);
                }
            };
            PeriodicityProperty _doubleArrow = ObjectExtensions.<PeriodicityProperty>operator_doubleArrow(_createPeriodicityProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color getColor() {
        Color _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ColorProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ColorProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((ColorProperty) _head).getValue();
        }
        else {
            _xifexpression = Color.NONE;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColor(final Color newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ColorProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ColorProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((ColorProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            ColorProperty _createColorProperty = ModelFactory.eINSTANCE.createColorProperty();
            final Procedure1<ColorProperty> _function_2 = new Procedure1<ColorProperty>() {
                public void apply(final ColorProperty it) {
                    it.setValue(newValue);
                }
            };
            ColorProperty _doubleArrow = ObjectExtensions.<ColorProperty>operator_doubleArrow(_createColorProperty, _function_2);
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
            case ModelPackage.TASK__APPLICATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetApplication((Application)otherEnd, msgs);
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
            case ModelPackage.TASK__APPLICATION:
                return basicSetApplication(null, msgs);
            case ModelPackage.TASK__FEATURE_REQUIREMENTS:
                return ((InternalEList<?>)getFeatureRequirements()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.TASK__APPLICATION:
                return eInternalContainer().eInverseRemove(this, ModelPackage.APPLICATION__TASKS, Application.class, msgs);
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
            case ModelPackage.TASK__APPLICATION:
                if (resolve) return getApplication();
                return basicGetApplication();
            case ModelPackage.TASK__FEATURE_REQUIREMENTS:
                return getFeatureRequirements();
            case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                return getRestrictMappingToHardwareElements();
            case ModelPackage.TASK__ASSIGNED_CORE:
                if (resolve) return getAssignedCore();
                return basicGetAssignedCore();
            case ModelPackage.TASK__FULL_NAME:
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
            case ModelPackage.TASK__APPLICATION:
                setApplication((Application)newValue);
                return;
            case ModelPackage.TASK__FEATURE_REQUIREMENTS:
                getFeatureRequirements().clear();
                getFeatureRequirements().addAll((Collection<? extends FeatureRequirement>)newValue);
                return;
            case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                getRestrictMappingToHardwareElements().clear();
                getRestrictMappingToHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
                return;
            case ModelPackage.TASK__ASSIGNED_CORE:
                setAssignedCore((Core)newValue);
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
            case ModelPackage.TASK__APPLICATION:
                setApplication((Application)null);
                return;
            case ModelPackage.TASK__FEATURE_REQUIREMENTS:
                getFeatureRequirements().clear();
                return;
            case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                getRestrictMappingToHardwareElements().clear();
                return;
            case ModelPackage.TASK__ASSIGNED_CORE:
                setAssignedCore((Core)null);
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
            case ModelPackage.TASK__APPLICATION:
                return basicGetApplication() != null;
            case ModelPackage.TASK__FEATURE_REQUIREMENTS:
                return featureRequirements != null && !featureRequirements.isEmpty();
            case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
                return restrictMappingToHardwareElements != null && !restrictMappingToHardwareElements.isEmpty();
            case ModelPackage.TASK__ASSIGNED_CORE:
                return assignedCore != null;
            case ModelPackage.TASK__FULL_NAME:
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
            case ModelPackage.TASK___GET_CORE_UTILIZATION:
                return getCoreUtilization();
            case ModelPackage.TASK___SET_CORE_UTILIZATION__INT:
                setCoreUtilization((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_RAM_UTILIZATION:
                return getRamUtilization();
            case ModelPackage.TASK___SET_RAM_UTILIZATION__INT:
                setRamUtilization((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_ROM_UTILIZATION:
                return getRomUtilization();
            case ModelPackage.TASK___SET_ROM_UTILIZATION__INT:
                setRomUtilization((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_DURATION:
                return getDuration();
            case ModelPackage.TASK___SET_DURATION__INT:
                setDuration((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_PERIOD:
                return getPeriod();
            case ModelPackage.TASK___SET_PERIOD__INT:
                setPeriod((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_EARLY_TOLERANCE:
                return getEarlyTolerance();
            case ModelPackage.TASK___SET_EARLY_TOLERANCE__INT:
                setEarlyTolerance((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_LATE_TOLERANCE:
                return getLateTolerance();
            case ModelPackage.TASK___SET_LATE_TOLERANCE__INT:
                setLateTolerance((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_MAX_START_TIME:
                return getMaxStartTime();
            case ModelPackage.TASK___SET_MAX_START_TIME__INT:
                setMaxStartTime((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_MAX_END_TIME:
                return getMaxEndTime();
            case ModelPackage.TASK___SET_MAX_END_TIME__INT:
                setMaxEndTime((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_ADD_INIT_TIME:
                return getAddInitTime();
            case ModelPackage.TASK___SET_ADD_INIT_TIME__INT:
                setAddInitTime((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_SLICES:
                return getSlices();
            case ModelPackage.TASK___SET_SLICES__INT:
                setSlices((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_MIN_SLICE_DURATION:
                return getMinSliceDuration();
            case ModelPackage.TASK___SET_MIN_SLICE_DURATION__INT:
                setMinSliceDuration((Integer)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_PERIODICITY:
                return getPeriodicity();
            case ModelPackage.TASK___SET_PERIODICITY__PERIODICITYTYPE:
                setPeriodicity((PeriodicityType)arguments.get(0));
                return null;
            case ModelPackage.TASK___GET_COLOR:
                return getColor();
            case ModelPackage.TASK___SET_COLOR__COLOR:
                setColor((Color)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //TaskImpl
