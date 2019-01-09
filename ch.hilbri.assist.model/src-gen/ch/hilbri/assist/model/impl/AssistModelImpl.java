/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.MinHypPeriodLengthProperty;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.RestrictionAlternative;
import ch.hilbri.assist.model.SchedulingRestriction;
import ch.hilbri.assist.model.SystemNameProperty;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskSwitchDelayProperty;

import com.google.common.collect.Iterables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getApplicationAlternatives <em>Application Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getSchedulingRestrictions <em>Scheduling Restrictions</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getRestrictionAlternatives <em>Restriction Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getExplorationCandidates <em>Exploration Candidates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssistModelImpl extends MinimalEObjectImpl.Container implements AssistModel {
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
     * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompartments()
     * @generated
     * @ordered
     */
    protected EList<Compartment> compartments;

    /**
     * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplications()
     * @generated
     * @ordered
     */
    protected EList<Application> applications;

    /**
     * The cached value of the '{@link #getApplicationAlternatives() <em>Application Alternatives</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationAlternatives()
     * @generated
     * @ordered
     */
    protected EList<ApplicationAlternative> applicationAlternatives;

    /**
     * The cached value of the '{@link #getDislocalityRelations() <em>Dislocality Relations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDislocalityRelations()
     * @generated
     * @ordered
     */
    protected EList<DislocalityRelation> dislocalityRelations;

    /**
     * The cached value of the '{@link #getColocalityRelations() <em>Colocality Relations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColocalityRelations()
     * @generated
     * @ordered
     */
    protected EList<ColocalityRelation> colocalityRelations;

    /**
     * The cached value of the '{@link #getDissimilarityRelations() <em>Dissimilarity Relations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDissimilarityRelations()
     * @generated
     * @ordered
     */
    protected EList<DissimilarityRelation> dissimilarityRelations;

    /**
     * The cached value of the '{@link #getSchedulingRestrictions() <em>Scheduling Restrictions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedulingRestrictions()
     * @generated
     * @ordered
     */
    protected EList<SchedulingRestriction> schedulingRestrictions;

    /**
     * The cached value of the '{@link #getRestrictionAlternatives() <em>Restriction Alternatives</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRestrictionAlternatives()
     * @generated
     * @ordered
     */
    protected EList<RestrictionAlternative> restrictionAlternatives;

    /**
     * The cached value of the '{@link #getExplorationCandidates() <em>Exploration Candidates</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExplorationCandidates()
     * @generated
     * @ordered
     */
    protected EList<ExplorationCandidate> explorationCandidates;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssistModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.ASSIST_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, ModelPackage.ASSIST_MODEL__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Compartment> getCompartments() {
        if (compartments == null) {
            compartments = new EObjectContainmentEList<Compartment>(Compartment.class, this, ModelPackage.ASSIST_MODEL__COMPARTMENTS);
        }
        return compartments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Application> getApplications() {
        if (applications == null) {
            applications = new EObjectContainmentEList<Application>(Application.class, this, ModelPackage.ASSIST_MODEL__APPLICATIONS);
        }
        return applications;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ApplicationAlternative> getApplicationAlternatives() {
        if (applicationAlternatives == null) {
            applicationAlternatives = new EObjectContainmentEList<ApplicationAlternative>(ApplicationAlternative.class, this, ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES);
        }
        return applicationAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<DislocalityRelation> getDislocalityRelations() {
        if (dislocalityRelations == null) {
            dislocalityRelations = new EObjectContainmentEList<DislocalityRelation>(DislocalityRelation.class, this, ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS);
        }
        return dislocalityRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ColocalityRelation> getColocalityRelations() {
        if (colocalityRelations == null) {
            colocalityRelations = new EObjectContainmentEList<ColocalityRelation>(ColocalityRelation.class, this, ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS);
        }
        return colocalityRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<DissimilarityRelation> getDissimilarityRelations() {
        if (dissimilarityRelations == null) {
            dissimilarityRelations = new EObjectContainmentEList<DissimilarityRelation>(DissimilarityRelation.class, this, ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS);
        }
        return dissimilarityRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SchedulingRestriction> getSchedulingRestrictions() {
        if (schedulingRestrictions == null) {
            schedulingRestrictions = new EObjectContainmentEList<SchedulingRestriction>(SchedulingRestriction.class, this, ModelPackage.ASSIST_MODEL__SCHEDULING_RESTRICTIONS);
        }
        return schedulingRestrictions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RestrictionAlternative> getRestrictionAlternatives() {
        if (restrictionAlternatives == null) {
            restrictionAlternatives = new EObjectContainmentEList<RestrictionAlternative>(RestrictionAlternative.class, this, ModelPackage.ASSIST_MODEL__RESTRICTION_ALTERNATIVES);
        }
        return restrictionAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ExplorationCandidate> getExplorationCandidates() {
        if (explorationCandidates == null) {
            explorationCandidates = new EObjectContainmentEList<ExplorationCandidate>(ExplorationCandidate.class, this, ModelPackage.ASSIST_MODEL__EXPLORATION_CANDIDATES);
        }
        return explorationCandidates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Compartment> getAllCompartments() {
        return this.getCompartments();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Box> getAllBoxes() {
        final Function1<Compartment, EList<Box>> _function = new Function1<Compartment, EList<Box>>() {
            public EList<Box> apply(final Compartment it) {
                return it.getAllBoxes();
            }
        };
        return ECollections.<Box>toEList(Iterables.<Box>concat(XcoreEListExtensions.<Compartment, EList<Box>>map(this.getCompartments(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Board> getAllBoards() {
        final Function1<Compartment, EList<Board>> _function = new Function1<Compartment, EList<Board>>() {
            public EList<Board> apply(final Compartment it) {
                return it.getAllBoards();
            }
        };
        return ECollections.<Board>toEList(Iterables.<Board>concat(XcoreEListExtensions.<Compartment, EList<Board>>map(this.getCompartments(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Processor> getAllProcessors() {
        final Function1<Compartment, EList<Processor>> _function = new Function1<Compartment, EList<Processor>>() {
            public EList<Processor> apply(final Compartment it) {
                return it.getAllProcessors();
            }
        };
        return ECollections.<Processor>toEList(Iterables.<Processor>concat(XcoreEListExtensions.<Compartment, EList<Processor>>map(this.getCompartments(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Core> getAllCores() {
        final Function1<Compartment, EList<Core>> _function = new Function1<Compartment, EList<Core>>() {
            public EList<Core> apply(final Compartment it) {
                return it.getAllCores();
            }
        };
        return ECollections.<Core>toEList(Iterables.<Core>concat(XcoreEListExtensions.<Compartment, EList<Core>>map(this.getCompartments(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Task> getAllTasks() {
        final Function1<Application, EList<Task>> _function = new Function1<Application, EList<Task>>() {
            public EList<Task> apply(final Application it) {
                return it.getTasks();
            }
        };
        return ECollections.<Task>toEList(Iterables.<Task>concat(XcoreEListExtensions.<Application, EList<Task>>map(this.getApplications(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<HardwareElement> getAllHardwareElements(final HardwareArchitectureLevelType level) {
        EList<HardwareElement> _switchResult = null;
        if (level != null) {
            switch (level) {
                case CORE:
                    _switchResult = this.getAllHardwareElements(0);
                    break;
                case PROCESSOR:
                    _switchResult = this.getAllHardwareElements(1);
                    break;
                case BOARD:
                    _switchResult = this.getAllHardwareElements(2);
                    break;
                case BOX:
                    _switchResult = this.getAllHardwareElements(3);
                    break;
                case COMPARTMENT:
                    _switchResult = this.getAllHardwareElements(4);
                    break;
                default:
                    break;
            }
        }
        return _switchResult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<HardwareElement> getAllHardwareElements(final int level) {
        EList<HardwareElement> _xifexpression = null;
        if ((level == 0)) {
            final Function1<Core, HardwareElement> _function = new Function1<Core, HardwareElement>() {
                public HardwareElement apply(final Core it) {
                    return ((HardwareElement) it);
                }
            };
            _xifexpression = XcoreEListExtensions.<Core, HardwareElement>map(this.getAllCores(), _function);
        }
        else {
            EList<HardwareElement> _xifexpression_1 = null;
            if ((level == 1)) {
                final Function1<Processor, HardwareElement> _function_1 = new Function1<Processor, HardwareElement>() {
                    public HardwareElement apply(final Processor it) {
                        return ((HardwareElement) it);
                    }
                };
                _xifexpression_1 = XcoreEListExtensions.<Processor, HardwareElement>map(this.getAllProcessors(), _function_1);
            }
            else {
                EList<HardwareElement> _xifexpression_2 = null;
                if ((level == 2)) {
                    final Function1<Board, HardwareElement> _function_2 = new Function1<Board, HardwareElement>() {
                        public HardwareElement apply(final Board it) {
                            return ((HardwareElement) it);
                        }
                    };
                    _xifexpression_2 = XcoreEListExtensions.<Board, HardwareElement>map(this.getAllBoards(), _function_2);
                }
                else {
                    EList<HardwareElement> _xifexpression_3 = null;
                    if ((level == 3)) {
                        final Function1<Box, HardwareElement> _function_3 = new Function1<Box, HardwareElement>() {
                            public HardwareElement apply(final Box it) {
                                return ((HardwareElement) it);
                            }
                        };
                        _xifexpression_3 = XcoreEListExtensions.<Box, HardwareElement>map(this.getAllBoxes(), _function_3);
                    }
                    else {
                        EList<HardwareElement> _xifexpression_4 = null;
                        if ((level == 4)) {
                            final Function1<Compartment, HardwareElement> _function_4 = new Function1<Compartment, HardwareElement>() {
                                public HardwareElement apply(final Compartment it) {
                                    return ((HardwareElement) it);
                                }
                            };
                            _xifexpression_4 = XcoreEListExtensions.<Compartment, HardwareElement>map(this.getAllCompartments(), _function_4);
                        }
                        else {
                            _xifexpression_4 = null;
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
    public EList<HardwareElement> getAllHardwareElements() {
        final Function1<Compartment, HardwareElement> _function = new Function1<Compartment, HardwareElement>() {
            public HardwareElement apply(final Compartment it) {
                return ((HardwareElement) it);
            }
        };
        EList<HardwareElement> _map = XcoreEListExtensions.<Compartment, HardwareElement>map(this.getAllCompartments(), _function);
        final Function1<Box, HardwareElement> _function_1 = new Function1<Box, HardwareElement>() {
            public HardwareElement apply(final Box it) {
                return ((HardwareElement) it);
            }
        };
        EList<HardwareElement> _map_1 = XcoreEListExtensions.<Box, HardwareElement>map(this.getAllBoxes(), _function_1);
        Iterable<HardwareElement> _plus = Iterables.<HardwareElement>concat(_map, _map_1);
        final Function1<Board, HardwareElement> _function_2 = new Function1<Board, HardwareElement>() {
            public HardwareElement apply(final Board it) {
                return ((HardwareElement) it);
            }
        };
        EList<HardwareElement> _map_2 = XcoreEListExtensions.<Board, HardwareElement>map(this.getAllBoards(), _function_2);
        Iterable<HardwareElement> _plus_1 = Iterables.<HardwareElement>concat(_plus, _map_2);
        final Function1<Processor, HardwareElement> _function_3 = new Function1<Processor, HardwareElement>() {
            public HardwareElement apply(final Processor it) {
                return ((HardwareElement) it);
            }
        };
        EList<HardwareElement> _map_3 = XcoreEListExtensions.<Processor, HardwareElement>map(this.getAllProcessors(), _function_3);
        Iterable<HardwareElement> _plus_2 = Iterables.<HardwareElement>concat(_plus_1, _map_3);
        final Function1<Core, HardwareElement> _function_4 = new Function1<Core, HardwareElement>() {
            public HardwareElement apply(final Core it) {
                return ((HardwareElement) it);
            }
        };
        EList<HardwareElement> _map_4 = XcoreEListExtensions.<Core, HardwareElement>map(this.getAllCores(), _function_4);
        final Iterable<HardwareElement> iterables = Iterables.<HardwareElement>concat(_plus_2, _map_4);
        return ECollections.<HardwareElement>toEList(iterables);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSystemName() {
        String _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof SystemNameProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof SystemNameProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((SystemNameProperty) _head).getValue();
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
    public void setSystemName(final String newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof SystemNameProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof SystemNameProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((SystemNameProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            SystemNameProperty _createSystemNameProperty = ModelFactory.eINSTANCE.createSystemNameProperty();
            final Procedure1<SystemNameProperty> _function_2 = new Procedure1<SystemNameProperty>() {
                public void apply(final SystemNameProperty it) {
                    it.setValue(newValue);
                }
            };
            SystemNameProperty _doubleArrow = ObjectExtensions.<SystemNameProperty>operator_doubleArrow(_createSystemNameProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getMinHypPeriodLength() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MinHypPeriodLengthProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MinHypPeriodLengthProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((MinHypPeriodLengthProperty) _head).getValue();
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
    public void setMinHypPeriodLength(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof MinHypPeriodLengthProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof MinHypPeriodLengthProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((MinHypPeriodLengthProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            MinHypPeriodLengthProperty _createMinHypPeriodLengthProperty = ModelFactory.eINSTANCE.createMinHypPeriodLengthProperty();
            final Procedure1<MinHypPeriodLengthProperty> _function_2 = new Procedure1<MinHypPeriodLengthProperty>() {
                public void apply(final MinHypPeriodLengthProperty it) {
                    it.setValue(newValue);
                }
            };
            MinHypPeriodLengthProperty _doubleArrow = ObjectExtensions.<MinHypPeriodLengthProperty>operator_doubleArrow(_createMinHypPeriodLengthProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getTaskSwitchDelay() {
        int _xifexpression = (int) 0;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof TaskSwitchDelayProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof TaskSwitchDelayProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((TaskSwitchDelayProperty) _head).getValue();
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
    public void setTaskSwitchDelay(final int newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof TaskSwitchDelayProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof TaskSwitchDelayProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((TaskSwitchDelayProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            TaskSwitchDelayProperty _createTaskSwitchDelayProperty = ModelFactory.eINSTANCE.createTaskSwitchDelayProperty();
            final Procedure1<TaskSwitchDelayProperty> _function_2 = new Procedure1<TaskSwitchDelayProperty>() {
                public void apply(final TaskSwitchDelayProperty it) {
                    it.setValue(newValue);
                }
            };
            TaskSwitchDelayProperty _doubleArrow = ObjectExtensions.<TaskSwitchDelayProperty>operator_doubleArrow(_createTaskSwitchDelayProperty, _function_2);
            _properties.add(_doubleArrow);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.ASSIST_MODEL__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES:
                return ((InternalEList<?>)getApplicationAlternatives()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                return ((InternalEList<?>)getDislocalityRelations()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                return ((InternalEList<?>)getColocalityRelations()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                return ((InternalEList<?>)getDissimilarityRelations()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__SCHEDULING_RESTRICTIONS:
                return ((InternalEList<?>)getSchedulingRestrictions()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__RESTRICTION_ALTERNATIVES:
                return ((InternalEList<?>)getRestrictionAlternatives()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__EXPLORATION_CANDIDATES:
                return ((InternalEList<?>)getExplorationCandidates()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.ASSIST_MODEL__PROPERTIES:
                return getProperties();
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                return getCompartments();
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                return getApplications();
            case ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES:
                return getApplicationAlternatives();
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                return getDislocalityRelations();
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                return getColocalityRelations();
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                return getDissimilarityRelations();
            case ModelPackage.ASSIST_MODEL__SCHEDULING_RESTRICTIONS:
                return getSchedulingRestrictions();
            case ModelPackage.ASSIST_MODEL__RESTRICTION_ALTERNATIVES:
                return getRestrictionAlternatives();
            case ModelPackage.ASSIST_MODEL__EXPLORATION_CANDIDATES:
                return getExplorationCandidates();
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
            case ModelPackage.ASSIST_MODEL__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                getCompartments().clear();
                getCompartments().addAll((Collection<? extends Compartment>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                getApplications().clear();
                getApplications().addAll((Collection<? extends Application>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES:
                getApplicationAlternatives().clear();
                getApplicationAlternatives().addAll((Collection<? extends ApplicationAlternative>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                getDislocalityRelations().clear();
                getDislocalityRelations().addAll((Collection<? extends DislocalityRelation>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                getColocalityRelations().clear();
                getColocalityRelations().addAll((Collection<? extends ColocalityRelation>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                getDissimilarityRelations().clear();
                getDissimilarityRelations().addAll((Collection<? extends DissimilarityRelation>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__SCHEDULING_RESTRICTIONS:
                getSchedulingRestrictions().clear();
                getSchedulingRestrictions().addAll((Collection<? extends SchedulingRestriction>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__RESTRICTION_ALTERNATIVES:
                getRestrictionAlternatives().clear();
                getRestrictionAlternatives().addAll((Collection<? extends RestrictionAlternative>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__EXPLORATION_CANDIDATES:
                getExplorationCandidates().clear();
                getExplorationCandidates().addAll((Collection<? extends ExplorationCandidate>)newValue);
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
            case ModelPackage.ASSIST_MODEL__PROPERTIES:
                getProperties().clear();
                return;
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                getCompartments().clear();
                return;
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                getApplications().clear();
                return;
            case ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES:
                getApplicationAlternatives().clear();
                return;
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                getDislocalityRelations().clear();
                return;
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                getColocalityRelations().clear();
                return;
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                getDissimilarityRelations().clear();
                return;
            case ModelPackage.ASSIST_MODEL__SCHEDULING_RESTRICTIONS:
                getSchedulingRestrictions().clear();
                return;
            case ModelPackage.ASSIST_MODEL__RESTRICTION_ALTERNATIVES:
                getRestrictionAlternatives().clear();
                return;
            case ModelPackage.ASSIST_MODEL__EXPLORATION_CANDIDATES:
                getExplorationCandidates().clear();
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
            case ModelPackage.ASSIST_MODEL__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                return compartments != null && !compartments.isEmpty();
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                return applications != null && !applications.isEmpty();
            case ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES:
                return applicationAlternatives != null && !applicationAlternatives.isEmpty();
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                return dislocalityRelations != null && !dislocalityRelations.isEmpty();
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                return colocalityRelations != null && !colocalityRelations.isEmpty();
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                return dissimilarityRelations != null && !dissimilarityRelations.isEmpty();
            case ModelPackage.ASSIST_MODEL__SCHEDULING_RESTRICTIONS:
                return schedulingRestrictions != null && !schedulingRestrictions.isEmpty();
            case ModelPackage.ASSIST_MODEL__RESTRICTION_ALTERNATIVES:
                return restrictionAlternatives != null && !restrictionAlternatives.isEmpty();
            case ModelPackage.ASSIST_MODEL__EXPLORATION_CANDIDATES:
                return explorationCandidates != null && !explorationCandidates.isEmpty();
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
            case ModelPackage.ASSIST_MODEL___GET_ALL_COMPARTMENTS:
                return getAllCompartments();
            case ModelPackage.ASSIST_MODEL___GET_ALL_BOXES:
                return getAllBoxes();
            case ModelPackage.ASSIST_MODEL___GET_ALL_BOARDS:
                return getAllBoards();
            case ModelPackage.ASSIST_MODEL___GET_ALL_PROCESSORS:
                return getAllProcessors();
            case ModelPackage.ASSIST_MODEL___GET_ALL_CORES:
                return getAllCores();
            case ModelPackage.ASSIST_MODEL___GET_ALL_TASKS:
                return getAllTasks();
            case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__HARDWAREARCHITECTURELEVELTYPE:
                return getAllHardwareElements((HardwareArchitectureLevelType)arguments.get(0));
            case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT:
                return getAllHardwareElements((Integer)arguments.get(0));
            case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS:
                return getAllHardwareElements();
            case ModelPackage.ASSIST_MODEL___GET_SYSTEM_NAME:
                return getSystemName();
            case ModelPackage.ASSIST_MODEL___SET_SYSTEM_NAME__STRING:
                setSystemName((String)arguments.get(0));
                return null;
            case ModelPackage.ASSIST_MODEL___GET_MIN_HYP_PERIOD_LENGTH:
                return getMinHypPeriodLength();
            case ModelPackage.ASSIST_MODEL___SET_MIN_HYP_PERIOD_LENGTH__INT:
                setMinHypPeriodLength((Integer)arguments.get(0));
                return null;
            case ModelPackage.ASSIST_MODEL___GET_TASK_SWITCH_DELAY:
                return getTaskSwitchDelay();
            case ModelPackage.ASSIST_MODEL___SET_TASK_SWITCH_DELAY__INT:
                setTaskSwitchDelay((Integer)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //AssistModelImpl
