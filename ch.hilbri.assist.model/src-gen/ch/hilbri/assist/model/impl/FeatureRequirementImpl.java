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
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#getFeaturename <em>Featurename</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#getHardwareLevel <em>Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureRequirementImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureRequirementImpl extends MinimalEObjectImpl.Container implements FeatureRequirement {
    /**
     * The default value of the '{@link #getFeaturename() <em>Featurename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeaturename()
     * @generated
     * @ordered
     */
    protected static final String FEATURENAME_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getFeaturename() <em>Featurename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeaturename()
     * @generated
     * @ordered
     */
    protected String featurename = FEATURENAME_EDEFAULT;

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
    protected static final int UNITS_EDEFAULT = 0;

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
    public String getFeaturename() {
        return featurename;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeaturename(String newFeaturename) {
        String oldFeaturename = featurename;
        featurename = newFeaturename;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE_REQUIREMENT__FEATURENAME, oldFeaturename, featurename));
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.FEATURE_REQUIREMENT__FEATURENAME:
                return getFeaturename();
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                return getHardwareLevel();
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                return getUnits();
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
            case ModelPackage.FEATURE_REQUIREMENT__FEATURENAME:
                setFeaturename((String)newValue);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                setHardwareLevel((HardwareArchitectureLevelType)newValue);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                setUnits((Integer)newValue);
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
            case ModelPackage.FEATURE_REQUIREMENT__FEATURENAME:
                setFeaturename(FEATURENAME_EDEFAULT);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                setHardwareLevel(HARDWARE_LEVEL_EDEFAULT);
                return;
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                setUnits(UNITS_EDEFAULT);
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
            case ModelPackage.FEATURE_REQUIREMENT__FEATURENAME:
                return FEATURENAME_EDEFAULT == null ? featurename != null : !FEATURENAME_EDEFAULT.equals(featurename);
            case ModelPackage.FEATURE_REQUIREMENT__HARDWARE_LEVEL:
                return hardwareLevel != HARDWARE_LEVEL_EDEFAULT;
            case ModelPackage.FEATURE_REQUIREMENT__UNITS:
                return units != UNITS_EDEFAULT;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (featurename: ");
        result.append(featurename);
        result.append(", hardwareLevel: ");
        result.append(hardwareLevel);
        result.append(", units: ");
        result.append(units);
        result.append(')');
        return result.toString();
    }

} //FeatureRequirementImpl
