/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.Color;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CustomProperty;
import ch.hilbri.assist.model.FeatureRequirement;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PeriodicityType;
import ch.hilbri.assist.model.Task;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getCoreUtilization <em>Core Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getRamUtilization <em>Ram Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getRomUtilization <em>Rom Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getEarlyTolerance <em>Early Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getLateTolerance <em>Late Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getMaxStartTime <em>Max Start Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getMaxEndTime <em>Max End Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getAddInitTime <em>Add Init Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getSlices <em>Slices</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getMinSliceDuration <em>Min Slice Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getPeriodicity <em>Periodicity</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getColor <em>Color</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getIoAdapterRequirements <em>Io Adapter Requirements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getAssignedCore <em>Assigned Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.TaskImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
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
     * The default value of the '{@link #getCoreUtilization() <em>Core Utilization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreUtilization()
     * @generated
     * @ordered
     */
    protected static final int CORE_UTILIZATION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCoreUtilization() <em>Core Utilization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreUtilization()
     * @generated
     * @ordered
     */
    protected int coreUtilization = CORE_UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getRamUtilization() <em>Ram Utilization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRamUtilization()
     * @generated
     * @ordered
     */
    protected static final int RAM_UTILIZATION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRamUtilization() <em>Ram Utilization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRamUtilization()
     * @generated
     * @ordered
     */
    protected int ramUtilization = RAM_UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getRomUtilization() <em>Rom Utilization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRomUtilization()
     * @generated
     * @ordered
     */
    protected static final int ROM_UTILIZATION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRomUtilization() <em>Rom Utilization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRomUtilization()
     * @generated
     * @ordered
     */
    protected int romUtilization = ROM_UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected static final int DURATION_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected int duration = DURATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected static final int PERIOD_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected int period = PERIOD_EDEFAULT;

    /**
     * The default value of the '{@link #getEarlyTolerance() <em>Early Tolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarlyTolerance()
     * @generated
     * @ordered
     */
    protected static final int EARLY_TOLERANCE_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getEarlyTolerance() <em>Early Tolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarlyTolerance()
     * @generated
     * @ordered
     */
    protected int earlyTolerance = EARLY_TOLERANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getLateTolerance() <em>Late Tolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLateTolerance()
     * @generated
     * @ordered
     */
    protected static final int LATE_TOLERANCE_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getLateTolerance() <em>Late Tolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLateTolerance()
     * @generated
     * @ordered
     */
    protected int lateTolerance = LATE_TOLERANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxStartTime() <em>Max Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxStartTime()
     * @generated
     * @ordered
     */
    protected static final int MAX_START_TIME_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMaxStartTime() <em>Max Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxStartTime()
     * @generated
     * @ordered
     */
    protected int maxStartTime = MAX_START_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxEndTime() <em>Max End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxEndTime()
     * @generated
     * @ordered
     */
    protected static final int MAX_END_TIME_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMaxEndTime() <em>Max End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxEndTime()
     * @generated
     * @ordered
     */
    protected int maxEndTime = MAX_END_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getAddInitTime() <em>Add Init Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddInitTime()
     * @generated
     * @ordered
     */
    protected static final int ADD_INIT_TIME_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getAddInitTime() <em>Add Init Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddInitTime()
     * @generated
     * @ordered
     */
    protected int addInitTime = ADD_INIT_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getSlices() <em>Slices</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlices()
     * @generated
     * @ordered
     */
    protected static final int SLICES_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getSlices() <em>Slices</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlices()
     * @generated
     * @ordered
     */
    protected int slices = SLICES_EDEFAULT;

    /**
     * The default value of the '{@link #getMinSliceDuration() <em>Min Slice Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinSliceDuration()
     * @generated
     * @ordered
     */
    protected static final int MIN_SLICE_DURATION_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMinSliceDuration() <em>Min Slice Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinSliceDuration()
     * @generated
     * @ordered
     */
    protected int minSliceDuration = MIN_SLICE_DURATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPeriodicity() <em>Periodicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriodicity()
     * @generated
     * @ordered
     */
    protected static final PeriodicityType PERIODICITY_EDEFAULT = PeriodicityType.STRICT;

    /**
     * The cached value of the '{@link #getPeriodicity() <em>Periodicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriodicity()
     * @generated
     * @ordered
     */
    protected PeriodicityType periodicity = PERIODICITY_EDEFAULT;

    /**
     * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected static final Color COLOR_EDEFAULT = Color.NONE;

    /**
     * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected Color color = COLOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getIoAdapterRequirements() <em>Io Adapter Requirements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIoAdapterRequirements()
     * @generated
     * @ordered
     */
    protected EList<FeatureRequirement> ioAdapterRequirements;

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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCoreUtilization() {
        return coreUtilization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCoreUtilization(int newCoreUtilization) {
        int oldCoreUtilization = coreUtilization;
        coreUtilization = newCoreUtilization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__CORE_UTILIZATION, oldCoreUtilization, coreUtilization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRamUtilization() {
        return ramUtilization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRamUtilization(int newRamUtilization) {
        int oldRamUtilization = ramUtilization;
        ramUtilization = newRamUtilization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__RAM_UTILIZATION, oldRamUtilization, ramUtilization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRomUtilization() {
        return romUtilization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRomUtilization(int newRomUtilization) {
        int oldRomUtilization = romUtilization;
        romUtilization = newRomUtilization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__ROM_UTILIZATION, oldRomUtilization, romUtilization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDuration() {
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDuration(int newDuration) {
        int oldDuration = duration;
        duration = newDuration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__DURATION, oldDuration, duration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPeriod() {
        return period;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriod(int newPeriod) {
        int oldPeriod = period;
        period = newPeriod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__PERIOD, oldPeriod, period));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEarlyTolerance() {
        return earlyTolerance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEarlyTolerance(int newEarlyTolerance) {
        int oldEarlyTolerance = earlyTolerance;
        earlyTolerance = newEarlyTolerance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__EARLY_TOLERANCE, oldEarlyTolerance, earlyTolerance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLateTolerance() {
        return lateTolerance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLateTolerance(int newLateTolerance) {
        int oldLateTolerance = lateTolerance;
        lateTolerance = newLateTolerance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__LATE_TOLERANCE, oldLateTolerance, lateTolerance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxStartTime() {
        return maxStartTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxStartTime(int newMaxStartTime) {
        int oldMaxStartTime = maxStartTime;
        maxStartTime = newMaxStartTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__MAX_START_TIME, oldMaxStartTime, maxStartTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxEndTime() {
        return maxEndTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxEndTime(int newMaxEndTime) {
        int oldMaxEndTime = maxEndTime;
        maxEndTime = newMaxEndTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__MAX_END_TIME, oldMaxEndTime, maxEndTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAddInitTime() {
        return addInitTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddInitTime(int newAddInitTime) {
        int oldAddInitTime = addInitTime;
        addInitTime = newAddInitTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__ADD_INIT_TIME, oldAddInitTime, addInitTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSlices() {
        return slices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSlices(int newSlices) {
        int oldSlices = slices;
        slices = newSlices;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__SLICES, oldSlices, slices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinSliceDuration() {
        return minSliceDuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinSliceDuration(int newMinSliceDuration) {
        int oldMinSliceDuration = minSliceDuration;
        minSliceDuration = newMinSliceDuration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__MIN_SLICE_DURATION, oldMinSliceDuration, minSliceDuration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeriodicityType getPeriodicity() {
        return periodicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriodicity(PeriodicityType newPeriodicity) {
        PeriodicityType oldPeriodicity = periodicity;
        periodicity = newPeriodicity == null ? PERIODICITY_EDEFAULT : newPeriodicity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__PERIODICITY, oldPeriodicity, periodicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color getColor() {
        return color;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColor(Color newColor) {
        Color oldColor = color;
        color = newColor == null ? COLOR_EDEFAULT : newColor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__COLOR, oldColor, color));
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
    public EList<FeatureRequirement> getIoAdapterRequirements() {
        if (ioAdapterRequirements == null) {
            ioAdapterRequirements = new EObjectContainmentEList<FeatureRequirement>(FeatureRequirement.class, this, ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS);
        }
        return ioAdapterRequirements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CustomProperty> getCustomProperties() {
        if (customProperties == null) {
            customProperties = new EObjectContainmentEList<CustomProperty>(CustomProperty.class, this, ModelPackage.TASK__CUSTOM_PROPERTIES);
        }
        return customProperties;
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
    public String toString() {
        return this.getName();
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
            case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
                return ((InternalEList<?>)getIoAdapterRequirements()).basicRemove(otherEnd, msgs);
            case ModelPackage.TASK__CUSTOM_PROPERTIES:
                return ((InternalEList<?>)getCustomProperties()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.TASK__NAME:
                return getName();
            case ModelPackage.TASK__CORE_UTILIZATION:
                return getCoreUtilization();
            case ModelPackage.TASK__RAM_UTILIZATION:
                return getRamUtilization();
            case ModelPackage.TASK__ROM_UTILIZATION:
                return getRomUtilization();
            case ModelPackage.TASK__DURATION:
                return getDuration();
            case ModelPackage.TASK__PERIOD:
                return getPeriod();
            case ModelPackage.TASK__EARLY_TOLERANCE:
                return getEarlyTolerance();
            case ModelPackage.TASK__LATE_TOLERANCE:
                return getLateTolerance();
            case ModelPackage.TASK__MAX_START_TIME:
                return getMaxStartTime();
            case ModelPackage.TASK__MAX_END_TIME:
                return getMaxEndTime();
            case ModelPackage.TASK__ADD_INIT_TIME:
                return getAddInitTime();
            case ModelPackage.TASK__SLICES:
                return getSlices();
            case ModelPackage.TASK__MIN_SLICE_DURATION:
                return getMinSliceDuration();
            case ModelPackage.TASK__PERIODICITY:
                return getPeriodicity();
            case ModelPackage.TASK__COLOR:
                return getColor();
            case ModelPackage.TASK__APPLICATION:
                if (resolve) return getApplication();
                return basicGetApplication();
            case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
                return getIoAdapterRequirements();
            case ModelPackage.TASK__CUSTOM_PROPERTIES:
                return getCustomProperties();
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
            case ModelPackage.TASK__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.TASK__CORE_UTILIZATION:
                setCoreUtilization((Integer)newValue);
                return;
            case ModelPackage.TASK__RAM_UTILIZATION:
                setRamUtilization((Integer)newValue);
                return;
            case ModelPackage.TASK__ROM_UTILIZATION:
                setRomUtilization((Integer)newValue);
                return;
            case ModelPackage.TASK__DURATION:
                setDuration((Integer)newValue);
                return;
            case ModelPackage.TASK__PERIOD:
                setPeriod((Integer)newValue);
                return;
            case ModelPackage.TASK__EARLY_TOLERANCE:
                setEarlyTolerance((Integer)newValue);
                return;
            case ModelPackage.TASK__LATE_TOLERANCE:
                setLateTolerance((Integer)newValue);
                return;
            case ModelPackage.TASK__MAX_START_TIME:
                setMaxStartTime((Integer)newValue);
                return;
            case ModelPackage.TASK__MAX_END_TIME:
                setMaxEndTime((Integer)newValue);
                return;
            case ModelPackage.TASK__ADD_INIT_TIME:
                setAddInitTime((Integer)newValue);
                return;
            case ModelPackage.TASK__SLICES:
                setSlices((Integer)newValue);
                return;
            case ModelPackage.TASK__MIN_SLICE_DURATION:
                setMinSliceDuration((Integer)newValue);
                return;
            case ModelPackage.TASK__PERIODICITY:
                setPeriodicity((PeriodicityType)newValue);
                return;
            case ModelPackage.TASK__COLOR:
                setColor((Color)newValue);
                return;
            case ModelPackage.TASK__APPLICATION:
                setApplication((Application)newValue);
                return;
            case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
                getIoAdapterRequirements().clear();
                getIoAdapterRequirements().addAll((Collection<? extends FeatureRequirement>)newValue);
                return;
            case ModelPackage.TASK__CUSTOM_PROPERTIES:
                getCustomProperties().clear();
                getCustomProperties().addAll((Collection<? extends CustomProperty>)newValue);
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
            case ModelPackage.TASK__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.TASK__CORE_UTILIZATION:
                setCoreUtilization(CORE_UTILIZATION_EDEFAULT);
                return;
            case ModelPackage.TASK__RAM_UTILIZATION:
                setRamUtilization(RAM_UTILIZATION_EDEFAULT);
                return;
            case ModelPackage.TASK__ROM_UTILIZATION:
                setRomUtilization(ROM_UTILIZATION_EDEFAULT);
                return;
            case ModelPackage.TASK__DURATION:
                setDuration(DURATION_EDEFAULT);
                return;
            case ModelPackage.TASK__PERIOD:
                setPeriod(PERIOD_EDEFAULT);
                return;
            case ModelPackage.TASK__EARLY_TOLERANCE:
                setEarlyTolerance(EARLY_TOLERANCE_EDEFAULT);
                return;
            case ModelPackage.TASK__LATE_TOLERANCE:
                setLateTolerance(LATE_TOLERANCE_EDEFAULT);
                return;
            case ModelPackage.TASK__MAX_START_TIME:
                setMaxStartTime(MAX_START_TIME_EDEFAULT);
                return;
            case ModelPackage.TASK__MAX_END_TIME:
                setMaxEndTime(MAX_END_TIME_EDEFAULT);
                return;
            case ModelPackage.TASK__ADD_INIT_TIME:
                setAddInitTime(ADD_INIT_TIME_EDEFAULT);
                return;
            case ModelPackage.TASK__SLICES:
                setSlices(SLICES_EDEFAULT);
                return;
            case ModelPackage.TASK__MIN_SLICE_DURATION:
                setMinSliceDuration(MIN_SLICE_DURATION_EDEFAULT);
                return;
            case ModelPackage.TASK__PERIODICITY:
                setPeriodicity(PERIODICITY_EDEFAULT);
                return;
            case ModelPackage.TASK__COLOR:
                setColor(COLOR_EDEFAULT);
                return;
            case ModelPackage.TASK__APPLICATION:
                setApplication((Application)null);
                return;
            case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
                getIoAdapterRequirements().clear();
                return;
            case ModelPackage.TASK__CUSTOM_PROPERTIES:
                getCustomProperties().clear();
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
            case ModelPackage.TASK__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.TASK__CORE_UTILIZATION:
                return coreUtilization != CORE_UTILIZATION_EDEFAULT;
            case ModelPackage.TASK__RAM_UTILIZATION:
                return ramUtilization != RAM_UTILIZATION_EDEFAULT;
            case ModelPackage.TASK__ROM_UTILIZATION:
                return romUtilization != ROM_UTILIZATION_EDEFAULT;
            case ModelPackage.TASK__DURATION:
                return duration != DURATION_EDEFAULT;
            case ModelPackage.TASK__PERIOD:
                return period != PERIOD_EDEFAULT;
            case ModelPackage.TASK__EARLY_TOLERANCE:
                return earlyTolerance != EARLY_TOLERANCE_EDEFAULT;
            case ModelPackage.TASK__LATE_TOLERANCE:
                return lateTolerance != LATE_TOLERANCE_EDEFAULT;
            case ModelPackage.TASK__MAX_START_TIME:
                return maxStartTime != MAX_START_TIME_EDEFAULT;
            case ModelPackage.TASK__MAX_END_TIME:
                return maxEndTime != MAX_END_TIME_EDEFAULT;
            case ModelPackage.TASK__ADD_INIT_TIME:
                return addInitTime != ADD_INIT_TIME_EDEFAULT;
            case ModelPackage.TASK__SLICES:
                return slices != SLICES_EDEFAULT;
            case ModelPackage.TASK__MIN_SLICE_DURATION:
                return minSliceDuration != MIN_SLICE_DURATION_EDEFAULT;
            case ModelPackage.TASK__PERIODICITY:
                return periodicity != PERIODICITY_EDEFAULT;
            case ModelPackage.TASK__COLOR:
                return color != COLOR_EDEFAULT;
            case ModelPackage.TASK__APPLICATION:
                return basicGetApplication() != null;
            case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
                return ioAdapterRequirements != null && !ioAdapterRequirements.isEmpty();
            case ModelPackage.TASK__CUSTOM_PROPERTIES:
                return customProperties != null && !customProperties.isEmpty();
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
            case ModelPackage.TASK___TO_STRING:
                return toString();
        }
        return super.eInvoke(operationID, arguments);
    }

} //TaskImpl
