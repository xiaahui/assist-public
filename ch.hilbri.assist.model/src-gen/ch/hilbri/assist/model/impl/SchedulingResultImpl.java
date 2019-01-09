/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.SchedulingResult;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskExecutionInstance;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.SchedulingResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SchedulingResultImpl#getHyperPeriodLength <em>Hyper Period Length</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SchedulingResultImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SchedulingResultImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingResultImpl extends MinimalEObjectImpl.Container implements SchedulingResult {
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
     * The default value of the '{@link #getHyperPeriodLength() <em>Hyper Period Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHyperPeriodLength()
     * @generated
     * @ordered
     */
    protected static final int HYPER_PERIOD_LENGTH_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getHyperPeriodLength() <em>Hyper Period Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHyperPeriodLength()
     * @generated
     * @ordered
     */
    protected int hyperPeriodLength = HYPER_PERIOD_LENGTH_EDEFAULT;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected AssistModel model;

    /**
     * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedule()
     * @generated
     * @ordered
     */
    protected HashMap<Task, List<TaskExecutionInstance>> schedule;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchedulingResultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.SCHEDULING_RESULT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RESULT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getHyperPeriodLength() {
        return hyperPeriodLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHyperPeriodLength(int newHyperPeriodLength) {
        int oldHyperPeriodLength = hyperPeriodLength;
        hyperPeriodLength = newHyperPeriodLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RESULT__HYPER_PERIOD_LENGTH, oldHyperPeriodLength, hyperPeriodLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssistModel getModel() {
        if (model != null && model.eIsProxy()) {
            InternalEObject oldModel = (InternalEObject)model;
            model = (AssistModel)eResolveProxy(oldModel);
            if (model != oldModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SCHEDULING_RESULT__MODEL, oldModel, model));
            }
        }
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssistModel basicGetModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModel(AssistModel newModel) {
        AssistModel oldModel = model;
        model = newModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RESULT__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HashMap<Task, List<TaskExecutionInstance>> getSchedule() {
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSchedule(HashMap<Task, List<TaskExecutionInstance>> newSchedule) {
        HashMap<Task, List<TaskExecutionInstance>> oldSchedule = schedule;
        schedule = newSchedule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RESULT__SCHEDULE, oldSchedule, schedule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.SCHEDULING_RESULT__NAME:
                return getName();
            case ModelPackage.SCHEDULING_RESULT__HYPER_PERIOD_LENGTH:
                return getHyperPeriodLength();
            case ModelPackage.SCHEDULING_RESULT__MODEL:
                if (resolve) return getModel();
                return basicGetModel();
            case ModelPackage.SCHEDULING_RESULT__SCHEDULE:
                return getSchedule();
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
            case ModelPackage.SCHEDULING_RESULT__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.SCHEDULING_RESULT__HYPER_PERIOD_LENGTH:
                setHyperPeriodLength((Integer)newValue);
                return;
            case ModelPackage.SCHEDULING_RESULT__MODEL:
                setModel((AssistModel)newValue);
                return;
            case ModelPackage.SCHEDULING_RESULT__SCHEDULE:
                setSchedule((HashMap<Task, List<TaskExecutionInstance>>)newValue);
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
            case ModelPackage.SCHEDULING_RESULT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.SCHEDULING_RESULT__HYPER_PERIOD_LENGTH:
                setHyperPeriodLength(HYPER_PERIOD_LENGTH_EDEFAULT);
                return;
            case ModelPackage.SCHEDULING_RESULT__MODEL:
                setModel((AssistModel)null);
                return;
            case ModelPackage.SCHEDULING_RESULT__SCHEDULE:
                setSchedule((HashMap<Task, List<TaskExecutionInstance>>)null);
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
            case ModelPackage.SCHEDULING_RESULT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.SCHEDULING_RESULT__HYPER_PERIOD_LENGTH:
                return hyperPeriodLength != HYPER_PERIOD_LENGTH_EDEFAULT;
            case ModelPackage.SCHEDULING_RESULT__MODEL:
                return model != null;
            case ModelPackage.SCHEDULING_RESULT__SCHEDULE:
                return schedule != null;
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
        result.append(", hyperPeriodLength: ");
        result.append(hyperPeriodLength);
        result.append(", schedule: ");
        result.append(schedule);
        result.append(')');
        return result.toString();
    }

} //SchedulingResultImpl
