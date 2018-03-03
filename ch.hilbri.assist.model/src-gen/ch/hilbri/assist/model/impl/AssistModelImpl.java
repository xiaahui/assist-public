/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Task;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getMinHypPeriodLength <em>Min Hyp Period Length</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getTaskSwitchDelay <em>Task Switch Delay</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssistModelImpl extends MinimalEObjectImpl.Container implements AssistModel {
    /**
     * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystemName()
     * @generated
     * @ordered
     */
    protected static final String SYSTEM_NAME_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystemName()
     * @generated
     * @ordered
     */
    protected String systemName = SYSTEM_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMinHypPeriodLength() <em>Min Hyp Period Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinHypPeriodLength()
     * @generated
     * @ordered
     */
    protected static final int MIN_HYP_PERIOD_LENGTH_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMinHypPeriodLength() <em>Min Hyp Period Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinHypPeriodLength()
     * @generated
     * @ordered
     */
    protected int minHypPeriodLength = MIN_HYP_PERIOD_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getTaskSwitchDelay() <em>Task Switch Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskSwitchDelay()
     * @generated
     * @ordered
     */
    protected static final int TASK_SWITCH_DELAY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTaskSwitchDelay() <em>Task Switch Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskSwitchDelay()
     * @generated
     * @ordered
     */
    protected int taskSwitchDelay = TASK_SWITCH_DELAY_EDEFAULT;

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
    public String getSystemName() {
        return systemName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSystemName(String newSystemName) {
        String oldSystemName = systemName;
        systemName = newSystemName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__SYSTEM_NAME, oldSystemName, systemName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinHypPeriodLength() {
        return minHypPeriodLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinHypPeriodLength(int newMinHypPeriodLength) {
        int oldMinHypPeriodLength = minHypPeriodLength;
        minHypPeriodLength = newMinHypPeriodLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH, oldMinHypPeriodLength, minHypPeriodLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTaskSwitchDelay() {
        return taskSwitchDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTaskSwitchDelay(int newTaskSwitchDelay) {
        int oldTaskSwitchDelay = taskSwitchDelay;
        taskSwitchDelay = newTaskSwitchDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__TASK_SWITCH_DELAY, oldTaskSwitchDelay, taskSwitchDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public EList<Compartment> getAllCompartments() {
        return this.getCompartments();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                return ((InternalEList<?>)getDislocalityRelations()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                return ((InternalEList<?>)getColocalityRelations()).basicRemove(otherEnd, msgs);
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                return ((InternalEList<?>)getDissimilarityRelations()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
                return getSystemName();
            case ModelPackage.ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH:
                return getMinHypPeriodLength();
            case ModelPackage.ASSIST_MODEL__TASK_SWITCH_DELAY:
                return getTaskSwitchDelay();
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                return getCompartments();
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                return getApplications();
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                return getDislocalityRelations();
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                return getColocalityRelations();
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                return getDissimilarityRelations();
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
            case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
                setSystemName((String)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH:
                setMinHypPeriodLength((Integer)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__TASK_SWITCH_DELAY:
                setTaskSwitchDelay((Integer)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                getCompartments().clear();
                getCompartments().addAll((Collection<? extends Compartment>)newValue);
                return;
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                getApplications().clear();
                getApplications().addAll((Collection<? extends Application>)newValue);
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
            case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
                setSystemName(SYSTEM_NAME_EDEFAULT);
                return;
            case ModelPackage.ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH:
                setMinHypPeriodLength(MIN_HYP_PERIOD_LENGTH_EDEFAULT);
                return;
            case ModelPackage.ASSIST_MODEL__TASK_SWITCH_DELAY:
                setTaskSwitchDelay(TASK_SWITCH_DELAY_EDEFAULT);
                return;
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                getCompartments().clear();
                return;
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                getApplications().clear();
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
            case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
                return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
            case ModelPackage.ASSIST_MODEL__MIN_HYP_PERIOD_LENGTH:
                return minHypPeriodLength != MIN_HYP_PERIOD_LENGTH_EDEFAULT;
            case ModelPackage.ASSIST_MODEL__TASK_SWITCH_DELAY:
                return taskSwitchDelay != TASK_SWITCH_DELAY_EDEFAULT;
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
                return compartments != null && !compartments.isEmpty();
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
                return applications != null && !applications.isEmpty();
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
                return dislocalityRelations != null && !dislocalityRelations.isEmpty();
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
                return colocalityRelations != null && !colocalityRelations.isEmpty();
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
                return dissimilarityRelations != null && !dissimilarityRelations.isEmpty();
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
            case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT:
                return getAllHardwareElements((Integer)arguments.get(0));
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (systemName: ");
        result.append(systemName);
        result.append(", minHypPeriodLength: ");
        result.append(minHypPeriodLength);
        result.append(", taskSwitchDelay: ");
        result.append(taskSwitchDelay);
        result.append(')');
        return result.toString();
    }

} //AssistModelImpl
