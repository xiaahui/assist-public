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
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureImpl#isShared <em>Shared</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.FeatureImpl#isIsExclusive <em>Is Exclusive</em>}</li>
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getUnits() {
        return units;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
    public boolean isSynchronizedAccess() {
        return synchronizedAccess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
    public boolean isShared() {
        return shared;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShared(boolean newShared) {
        boolean oldShared = shared;
        shared = newShared;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__SHARED, oldShared, shared));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
            case ModelPackage.FEATURE__NAME:
                return getName();
            case ModelPackage.FEATURE__UNITS:
                return getUnits();
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                return isSynchronizedAccess();
            case ModelPackage.FEATURE__SHARED:
                return isShared();
            case ModelPackage.FEATURE__IS_EXCLUSIVE:
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
            case ModelPackage.FEATURE__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.FEATURE__UNITS:
                setUnits((Integer)newValue);
                return;
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                setSynchronizedAccess((Boolean)newValue);
                return;
            case ModelPackage.FEATURE__SHARED:
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
            case ModelPackage.FEATURE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.FEATURE__UNITS:
                setUnits(UNITS_EDEFAULT);
                return;
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                setSynchronizedAccess(SYNCHRONIZED_ACCESS_EDEFAULT);
                return;
            case ModelPackage.FEATURE__SHARED:
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
            case ModelPackage.FEATURE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.FEATURE__UNITS:
                return units != UNITS_EDEFAULT;
            case ModelPackage.FEATURE__SYNCHRONIZED_ACCESS:
                return synchronizedAccess != SYNCHRONIZED_ACCESS_EDEFAULT;
            case ModelPackage.FEATURE__SHARED:
                return shared != SHARED_EDEFAULT;
            case ModelPackage.FEATURE__IS_EXCLUSIVE:
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
        result.append(", units: ");
        result.append(units);
        result.append(", synchronizedAccess: ");
        result.append(synchronizedAccess);
        result.append(", shared: ");
        result.append(shared);
        result.append(')');
        return result.toString();
    }

} //FeatureImpl
