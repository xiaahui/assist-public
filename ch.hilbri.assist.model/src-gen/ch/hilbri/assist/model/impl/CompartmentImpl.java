/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PowerSupplyProperty;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Property;

import com.google.common.collect.Iterables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.CompartmentImpl#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.CompartmentImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentImpl extends HardwareElementImpl implements Compartment {
    /**
     * The cached value of the '{@link #getBoxes() <em>Boxes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoxes()
     * @generated
     * @ordered
     */
    protected EList<Box> boxes;

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
    protected CompartmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.COMPARTMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Box> getBoxes() {
        if (boxes == null) {
            boxes = new EObjectContainmentWithInverseEList<Box>(Box.class, this, ModelPackage.COMPARTMENT__BOXES, ModelPackage.BOX__COMPARTMENT);
        }
        return boxes;
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
    public EList<Box> getAllBoxes() {
        return this.getBoxes();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Board> getAllBoards() {
        final Function1<Box, EList<Board>> _function = new Function1<Box, EList<Board>>() {
            public EList<Board> apply(final Box it) {
                return it.getAllBoards();
            }
        };
        return ECollections.<Board>toEList(Iterables.<Board>concat(XcoreEListExtensions.<Box, EList<Board>>map(this.getBoxes(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Processor> getAllProcessors() {
        final Function1<Box, EList<Processor>> _function = new Function1<Box, EList<Processor>>() {
            public EList<Processor> apply(final Box it) {
                return it.getAllProcessors();
            }
        };
        return ECollections.<Processor>toEList(Iterables.<Processor>concat(XcoreEListExtensions.<Box, EList<Processor>>map(this.getBoxes(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Core> getAllCores() {
        final Function1<Box, EList<Core>> _function = new Function1<Box, EList<Core>>() {
            public EList<Core> apply(final Box it) {
                return it.getAllCores();
            }
        };
        return ECollections.<Core>toEList(Iterables.<Core>concat(XcoreEListExtensions.<Box, EList<Core>>map(this.getBoxes(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPowerSupply() {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof PowerSupplyProperty));
            }
        };
        final Iterable<Property> powerSupplyProperties = IterableExtensions.<Property>filter(this.getProperties(), _function);
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(powerSupplyProperties);
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            Property _head = IterableExtensions.<Property>head(powerSupplyProperties);
            return ((PowerSupplyProperty) _head).getValue();
        }
        else {
            return null;
        }
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
            case ModelPackage.COMPARTMENT__BOXES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoxes()).basicAdd(otherEnd, msgs);
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
            case ModelPackage.COMPARTMENT__BOXES:
                return ((InternalEList<?>)getBoxes()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.COMPARTMENT__BOXES:
                return getBoxes();
            case ModelPackage.COMPARTMENT__FULL_NAME:
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
            case ModelPackage.COMPARTMENT__BOXES:
                getBoxes().clear();
                getBoxes().addAll((Collection<? extends Box>)newValue);
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
            case ModelPackage.COMPARTMENT__BOXES:
                getBoxes().clear();
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
            case ModelPackage.COMPARTMENT__BOXES:
                return boxes != null && !boxes.isEmpty();
            case ModelPackage.COMPARTMENT__FULL_NAME:
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
            case ModelPackage.COMPARTMENT___GET_ALL_BOXES:
                return getAllBoxes();
            case ModelPackage.COMPARTMENT___GET_ALL_BOARDS:
                return getAllBoards();
            case ModelPackage.COMPARTMENT___GET_ALL_PROCESSORS:
                return getAllProcessors();
            case ModelPackage.COMPARTMENT___GET_ALL_CORES:
                return getAllCores();
            case ModelPackage.COMPARTMENT___GET_POWER_SUPPLY:
                return getPowerSupply();
        }
        return super.eInvoke(operationID, arguments);
    }

} //CompartmentImpl
