/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.CustomProperty;
import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ModelPackage;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getDevelopedBy <em>Developed By</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ApplicationImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends AbstractSoftwareElementImpl implements Application {
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
     * The default value of the '{@link #getDevelopedBy() <em>Developed By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevelopedBy()
     * @generated
     * @ordered
     */
    protected static final String DEVELOPED_BY_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getDevelopedBy() <em>Developed By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevelopedBy()
     * @generated
     * @ordered
     */
    protected String developedBy = DEVELOPED_BY_EDEFAULT;

    /**
     * The default value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalityLevel()
     * @generated
     * @ordered
     */
    protected static final DesignAssuranceLevelType CRITICALITY_LEVEL_EDEFAULT = DesignAssuranceLevelType.NONE;

    /**
     * The cached value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalityLevel()
     * @generated
     * @ordered
     */
    protected DesignAssuranceLevelType criticalityLevel = CRITICALITY_LEVEL_EDEFAULT;

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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.APPLICATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDevelopedBy() {
        return developedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDevelopedBy(String newDevelopedBy) {
        String oldDevelopedBy = developedBy;
        developedBy = newDevelopedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.APPLICATION__DEVELOPED_BY, oldDevelopedBy, developedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DesignAssuranceLevelType getCriticalityLevel() {
        return criticalityLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCriticalityLevel(DesignAssuranceLevelType newCriticalityLevel) {
        DesignAssuranceLevelType oldCriticalityLevel = criticalityLevel;
        criticalityLevel = newCriticalityLevel == null ? CRITICALITY_LEVEL_EDEFAULT : newCriticalityLevel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.APPLICATION__CRITICALITY_LEVEL, oldCriticalityLevel, criticalityLevel));
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
    public EList<CustomProperty> getCustomProperties() {
        if (customProperties == null) {
            customProperties = new EObjectContainmentEList<CustomProperty>(CustomProperty.class, this, ModelPackage.APPLICATION__CUSTOM_PROPERTIES);
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
    public String toString() {
        return this.getName();
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
            case ModelPackage.APPLICATION__CUSTOM_PROPERTIES:
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.APPLICATION__NAME:
                return getName();
            case ModelPackage.APPLICATION__DEVELOPED_BY:
                return getDevelopedBy();
            case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
                return getCriticalityLevel();
            case ModelPackage.APPLICATION__TASKS:
                return getTasks();
            case ModelPackage.APPLICATION__CUSTOM_PROPERTIES:
                return getCustomProperties();
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
            case ModelPackage.APPLICATION__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.APPLICATION__DEVELOPED_BY:
                setDevelopedBy((String)newValue);
                return;
            case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
                setCriticalityLevel((DesignAssuranceLevelType)newValue);
                return;
            case ModelPackage.APPLICATION__TASKS:
                getTasks().clear();
                getTasks().addAll((Collection<? extends Task>)newValue);
                return;
            case ModelPackage.APPLICATION__CUSTOM_PROPERTIES:
                getCustomProperties().clear();
                getCustomProperties().addAll((Collection<? extends CustomProperty>)newValue);
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
            case ModelPackage.APPLICATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.APPLICATION__DEVELOPED_BY:
                setDevelopedBy(DEVELOPED_BY_EDEFAULT);
                return;
            case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
                setCriticalityLevel(CRITICALITY_LEVEL_EDEFAULT);
                return;
            case ModelPackage.APPLICATION__TASKS:
                getTasks().clear();
                return;
            case ModelPackage.APPLICATION__CUSTOM_PROPERTIES:
                getCustomProperties().clear();
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
            case ModelPackage.APPLICATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.APPLICATION__DEVELOPED_BY:
                return DEVELOPED_BY_EDEFAULT == null ? developedBy != null : !DEVELOPED_BY_EDEFAULT.equals(developedBy);
            case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
                return criticalityLevel != CRITICALITY_LEVEL_EDEFAULT;
            case ModelPackage.APPLICATION__TASKS:
                return tasks != null && !tasks.isEmpty();
            case ModelPackage.APPLICATION__CUSTOM_PROPERTIES:
                return customProperties != null && !customProperties.isEmpty();
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
            case ModelPackage.APPLICATION___TO_STRING:
                return toString();
        }
        return super.eInvoke(operationID, arguments);
    }

} //ApplicationImpl
