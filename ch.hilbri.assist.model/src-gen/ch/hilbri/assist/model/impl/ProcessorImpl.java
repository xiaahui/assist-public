/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.ProcessorTypeProperty;
import ch.hilbri.assist.model.Property;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorImpl extends HardwareElementImpl implements Processor {
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
     * The cached value of the '{@link #getCores() <em>Cores</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCores()
     * @generated
     * @ordered
     */
    protected EList<Core> cores;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.PROCESSOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFullName() {
        String _fullName = this.getBoard().getFullName();
        String _plus = (_fullName + ".");
        String _name = this.getName();
        return (_plus + _name);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Board getBoard() {
        if (eContainerFeatureID() != ModelPackage.PROCESSOR__BOARD) return null;
        return (Board)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Board basicGetBoard() {
        if (eContainerFeatureID() != ModelPackage.PROCESSOR__BOARD) return null;
        return (Board)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBoard, ModelPackage.PROCESSOR__BOARD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoard(Board newBoard) {
        if (newBoard != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PROCESSOR__BOARD && newBoard != null)) {
            if (EcoreUtil.isAncestor(this, newBoard))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBoard != null)
                msgs = ((InternalEObject)newBoard).eInverseAdd(this, ModelPackage.BOARD__PROCESSORS, Board.class, msgs);
            msgs = basicSetBoard(newBoard, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCESSOR__BOARD, newBoard, newBoard));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Core> getCores() {
        if (cores == null) {
            cores = new EObjectContainmentWithInverseEList<Core>(Core.class, this, ModelPackage.PROCESSOR__CORES, ModelPackage.CORE__PROCESSOR);
        }
        return cores;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Core> getAllCores() {
        return this.getCores();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProcessorType() {
        String _xifexpression = null;
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ProcessorTypeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ProcessorTypeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            _xifexpression = ((ProcessorTypeProperty) _head).getValue();
        }
        else {
            _xifexpression = null;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProcessorType(final String newValue) {
        final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
            public Boolean apply(final Property it) {
                return Boolean.valueOf((it instanceof ProcessorTypeProperty));
            }
        };
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(IterableExtensions.<Property>filter(this.getProperties(), _function));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
            final Function1<Property, Boolean> _function_1 = new Function1<Property, Boolean>() {
                public Boolean apply(final Property it) {
                    return Boolean.valueOf((it instanceof ProcessorTypeProperty));
                }
            };
            Property _head = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(this.getProperties(), _function_1));
            ((ProcessorTypeProperty) _head).setValue(newValue);
        }
        else {
            EList<Property> _properties = this.getProperties();
            ProcessorTypeProperty _createProcessorTypeProperty = ModelFactory.eINSTANCE.createProcessorTypeProperty();
            final Procedure1<ProcessorTypeProperty> _function_2 = new Procedure1<ProcessorTypeProperty>() {
                public void apply(final ProcessorTypeProperty it) {
                    it.setValue(newValue);
                }
            };
            ProcessorTypeProperty _doubleArrow = ObjectExtensions.<ProcessorTypeProperty>operator_doubleArrow(_createProcessorTypeProperty, _function_2);
            _properties.add(_doubleArrow);
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
            case ModelPackage.PROCESSOR__BOARD:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBoard((Board)otherEnd, msgs);
            case ModelPackage.PROCESSOR__CORES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCores()).basicAdd(otherEnd, msgs);
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
            case ModelPackage.PROCESSOR__BOARD:
                return basicSetBoard(null, msgs);
            case ModelPackage.PROCESSOR__CORES:
                return ((InternalEList<?>)getCores()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.PROCESSOR__BOARD:
                return eInternalContainer().eInverseRemove(this, ModelPackage.BOARD__PROCESSORS, Board.class, msgs);
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
            case ModelPackage.PROCESSOR__FULL_NAME:
                return getFullName();
            case ModelPackage.PROCESSOR__BOARD:
                if (resolve) return getBoard();
                return basicGetBoard();
            case ModelPackage.PROCESSOR__CORES:
                return getCores();
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
            case ModelPackage.PROCESSOR__BOARD:
                setBoard((Board)newValue);
                return;
            case ModelPackage.PROCESSOR__CORES:
                getCores().clear();
                getCores().addAll((Collection<? extends Core>)newValue);
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
            case ModelPackage.PROCESSOR__BOARD:
                setBoard((Board)null);
                return;
            case ModelPackage.PROCESSOR__CORES:
                getCores().clear();
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
            case ModelPackage.PROCESSOR__FULL_NAME:
                return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
            case ModelPackage.PROCESSOR__BOARD:
                return basicGetBoard() != null;
            case ModelPackage.PROCESSOR__CORES:
                return cores != null && !cores.isEmpty();
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
            case ModelPackage.PROCESSOR___GET_ALL_CORES:
                return getAllCores();
            case ModelPackage.PROCESSOR___GET_PROCESSOR_TYPE:
                return getProcessorType();
            case ModelPackage.PROCESSOR___SET_PROCESSOR_TYPE__STRING:
                setProcessorType((String)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //ProcessorImpl
