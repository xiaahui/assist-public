/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Feature;
import ch.hilbri.assist.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureImpl#isSynchronizedAccess <em>Synchronized Access</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureImpl#isIsShared <em>Is Shared</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
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
     * The default value of the '{@link #isSynchronizedAccess() <em>Synchronized Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSynchronizedAccess()
     * @generated
     * @ordered
     */
    protected static final boolean SYNCHRONIZED_ACCESS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSynchronizedAccess() <em>Synchronized Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSynchronizedAccess()
     * @generated
     * @ordered
     */
    protected boolean synchronizedAccess = SYNCHRONIZED_ACCESS_EDEFAULT;

    /**
     * The default value of the '{@link #isIsShared() <em>Is Shared</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsShared()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SHARED_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.FEATURE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__UNITS, oldUnits, units));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSynchronizedAccess() {
        return synchronizedAccess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSynchronizedAccess(boolean newSynchronizedAccess) {
        boolean oldSynchronizedAccess = synchronizedAccess;
        synchronizedAccess = newSynchronizedAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__SYNCHRONIZED_ACCESS, oldSynchronizedAccess, synchronizedAccess));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsShared() {
        int _units = this.getUnits();
        return (_units == 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.FEATURE__NAME:
                return getName();
            case ModelPackage.FEATURE__UNITS:
                return getUnits();
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                return isSynchronizedAccess();
            case ModelPackage.FEATURE__IS_SHARED:
                return isIsShared();
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
            case ModelPackage.FEATURE__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.FEATURE__UNITS:
                setUnits((Integer)newValue);
                return;
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                setSynchronizedAccess((Boolean)newValue);
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
            case ModelPackage.FEATURE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.FEATURE__UNITS:
                setUnits(UNITS_EDEFAULT);
                return;
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                setSynchronizedAccess(SYNCHRONIZED_ACCESS_EDEFAULT);
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
            case ModelPackage.FEATURE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.FEATURE__UNITS:
                return units != UNITS_EDEFAULT;
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                return synchronizedAccess != SYNCHRONIZED_ACCESS_EDEFAULT;
            case ModelPackage.FEATURE__IS_SHARED:
                return isIsShared() != IS_SHARED_EDEFAULT;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", units: ");
        result.append(units);
        result.append(", synchronizedAccess: ");
        result.append(synchronizedAccess);
        result.append(')');
        return result.toString();
    }

} //FeatureImpl
