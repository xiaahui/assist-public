/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.CoreImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.CoreImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.CoreImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.CoreImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreImpl extends HardwareElementImpl implements Core {
    /**
     * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArchitecture()
     * @generated
     * @ordered
     */
    protected static final String ARCHITECTURE_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArchitecture()
     * @generated
     * @ordered
     */
    protected String architecture = ARCHITECTURE_EDEFAULT;

    /**
     * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
    protected static final int CAPACITY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
    protected int capacity = CAPACITY_EDEFAULT;

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
    protected CoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.CORE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArchitecture(String newArchitecture) {
        String oldArchitecture = architecture;
        architecture = newArchitecture;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORE__ARCHITECTURE, oldArchitecture, architecture));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapacity(int newCapacity) {
        int oldCapacity = capacity;
        capacity = newCapacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORE__CAPACITY, oldCapacity, capacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFullName() {
        String _fullName = this.getProcessor().getFullName();
        String _plus = (_fullName + ".");
        String _name = this.getName();
        return (_plus + _name);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Processor getProcessor() {
        if (eContainerFeatureID() != ModelPackage.CORE__PROCESSOR) return null;
        return (Processor)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Processor basicGetProcessor() {
        if (eContainerFeatureID() != ModelPackage.CORE__PROCESSOR) return null;
        return (Processor)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newProcessor, ModelPackage.CORE__PROCESSOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessor(Processor newProcessor) {
        if (newProcessor != eInternalContainer() || (eContainerFeatureID() != ModelPackage.CORE__PROCESSOR && newProcessor != null)) {
            if (EcoreUtil.isAncestor(this, newProcessor))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newProcessor != null)
                msgs = ((InternalEObject)newProcessor).eInverseAdd(this, ModelPackage.PROCESSOR__CORES, Processor.class, msgs);
            msgs = basicSetProcessor(newProcessor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORE__PROCESSOR, newProcessor, newProcessor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.CORE__PROCESSOR:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetProcessor((Processor)otherEnd, msgs);
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
            case ModelPackage.CORE__PROCESSOR:
                return basicSetProcessor(null, msgs);
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
            case ModelPackage.CORE__PROCESSOR:
                return eInternalContainer().eInverseRemove(this, ModelPackage.PROCESSOR__CORES, Processor.class, msgs);
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
            case ModelPackage.CORE__ARCHITECTURE:
                return getArchitecture();
            case ModelPackage.CORE__CAPACITY:
                return getCapacity();
            case ModelPackage.CORE__FULL_NAME:
                return getFullName();
            case ModelPackage.CORE__PROCESSOR:
                if (resolve) return getProcessor();
                return basicGetProcessor();
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
            case ModelPackage.CORE__ARCHITECTURE:
                setArchitecture((String)newValue);
                return;
            case ModelPackage.CORE__CAPACITY:
                setCapacity((Integer)newValue);
                return;
            case ModelPackage.CORE__PROCESSOR:
                setProcessor((Processor)newValue);
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
            case ModelPackage.CORE__ARCHITECTURE:
                setArchitecture(ARCHITECTURE_EDEFAULT);
                return;
            case ModelPackage.CORE__CAPACITY:
                setCapacity(CAPACITY_EDEFAULT);
                return;
            case ModelPackage.CORE__PROCESSOR:
                setProcessor((Processor)null);
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
            case ModelPackage.CORE__ARCHITECTURE:
                return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
            case ModelPackage.CORE__CAPACITY:
                return capacity != CAPACITY_EDEFAULT;
            case ModelPackage.CORE__FULL_NAME:
                return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
            case ModelPackage.CORE__PROCESSOR:
                return basicGetProcessor() != null;
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
        result.append(" (architecture: ");
        result.append(architecture);
        result.append(", capacity: ");
        result.append(capacity);
        result.append(')');
        return result.toString();
    }

} //CoreImpl
