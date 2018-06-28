/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.FeatureRequirement;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#getHardwareLevel <em>Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#isShared <em>Shared</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#isIsExclusive <em>Is Exclusive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureRequirementImpl extends MinimalEObjectImpl.Container implements FeatureRequirement {
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
     * The default value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHardwareLevel()
     * @generated
     * @ordered
     */
    protected static final HardwareArchitectureLevelType HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

    /**
     * The cached value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHardwareLevel()
     * @generated
     * @ordered
     */
    protected HardwareArchitectureLevelType hardwareLevel = HARDWARE_LEVEL_EDEFAULT;

    /**
     * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
    protected static final int UNITS_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
    protected int units = UNITS_EDEFAULT;

    /**
     * The default value of the '{@link #isShared() <em>Shared</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShared()
     * @generated
     * @ordered
     */
    protected static final boolean SHARED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isShared() <em>Shared</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShared()
     * @generated
     * @ordered
     */
    protected boolean shared = SHARED_EDEFAULT;

    /**
     * The default value of the '{@link #isIsExclusive() <em>Is Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExclusive()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXCLUSIVE_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureRequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.FEATURE_REQUIREMENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE_REQUIREMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HardwareArchitectureLevelType getHardwareLevel() {
        return hardwareLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHardwareLevel(HardwareArchitectureLevelType newHardwareLevel) {
        HardwareArchitectureLevelType oldHardwareLevel = hardwareLevel;
        hardwareLevel = newHardwareLevel == null ? HARDWARE_LEVEL_EDEFAULT : newHardwareLevel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL, oldHardwareLevel, hardwareLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getUnits() {
        return units;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnits(int newUnits) {
        int oldUnits = units;
        units = newUnits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE_REQUIREMENT__UNITS, oldUnits, units));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShared(boolean newShared) {
        boolean oldShared = shared;
        shared = newShared;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE_REQUIREMENT__SHARED, oldShared, shared));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsExclusive() {
        boolean _isShared = this.isShared();
        return (!_isShared);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.FEATURE_REQUIREMENT__NAME:
                return getName();
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                return getHardwareLevel();
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                return getUnits();
            case ModelPackage.FEATURE_REQUIREMENT__SHARED:
                return isShared();
            case ModelPackage.FEATURE_REQUIREMENT__IS_EXCLUSIVE:
                return isIsExclusive();
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
            case ModelPackage.FEATURE_REQUIREMENT__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                setHardwareLevel((HardwareArchitectureLevelType)newValue);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                setUnits((Integer)newValue);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__SHARED:
                setShared((Boolean)newValue);
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
            case ModelPackage.FEATURE_REQUIREMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                setHardwareLevel(HARDWARE_LEVEL_EDEFAULT);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                setUnits(UNITS_EDEFAULT);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__SHARED:
                setShared(SHARED_EDEFAULT);
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
            case ModelPackage.FEATURE_REQUIREMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                return hardwareLevel != HARDWARE_LEVEL_EDEFAULT;
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                return units != UNITS_EDEFAULT;
            case ModelPackage.FEATURE_REQUIREMENT__SHARED:
                return shared != SHARED_EDEFAULT;
            case ModelPackage.FEATURE_REQUIREMENT__IS_EXCLUSIVE:
                return isIsExclusive() != IS_EXCLUSIVE_EDEFAULT;
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
        result.append(", hardwareLevel: ");
        result.append(hardwareLevel);
        result.append(", units: ");
        result.append(units);
        result.append(", shared: ");
        result.append(shared);
        result.append(')');
        return result.toString();
    }

} //FeatureRequirementImpl
