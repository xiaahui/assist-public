/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardAlternatives;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;

import com.google.common.collect.Iterables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.BoxImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.BoxImpl#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.BoxImpl#getBoardAlternatives <em>Board Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.BoxImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxImpl extends HardwareElementImpl implements Box {
    /**
     * The cached value of the '{@link #getBoards() <em>Boards</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoards()
     * @generated
     * @ordered
     */
    protected EList<Board> boards;

    /**
     * The cached value of the '{@link #getBoardAlternatives() <em>Board Alternatives</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoardAlternatives()
     * @generated
     * @ordered
     */
    protected EList<BoardAlternatives> boardAlternatives;

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
    protected BoxImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.BOX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Compartment getCompartment() {
        if (eContainerFeatureID() != ModelPackage.BOX__COMPARTMENT) return null;
        return (Compartment)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Compartment basicGetCompartment() {
        if (eContainerFeatureID() != ModelPackage.BOX__COMPARTMENT) return null;
        return (Compartment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompartment(Compartment newCompartment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newCompartment, ModelPackage.BOX__COMPARTMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCompartment(Compartment newCompartment) {
        if (newCompartment != eInternalContainer() || (eContainerFeatureID() != ModelPackage.BOX__COMPARTMENT && newCompartment != null)) {
            if (EcoreUtil.isAncestor(this, newCompartment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCompartment != null)
                msgs = ((InternalEObject)newCompartment).eInverseAdd(this, ModelPackage.COMPARTMENT__BOXES, Compartment.class, msgs);
            msgs = basicSetCompartment(newCompartment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOX__COMPARTMENT, newCompartment, newCompartment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Board> getBoards() {
        if (boards == null) {
            boards = new EObjectContainmentWithInverseEList<Board>(Board.class, this, ModelPackage.BOX__BOARDS, ModelPackage.BOARD__BOX);
        }
        return boards;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BoardAlternatives> getBoardAlternatives() {
        if (boardAlternatives == null) {
            boardAlternatives = new EObjectContainmentEList<BoardAlternatives>(BoardAlternatives.class, this, ModelPackage.BOX__BOARD_ALTERNATIVES);
        }
        return boardAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFullName() {
        String _fullName = this.getCompartment().getFullName();
        String _plus = (_fullName + ".");
        String _name = this.getName();
        return (_plus + _name);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Board> getAllBoards() {
        return this.getBoards();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Processor> getAllProcessors() {
        final Function1<Board, EList<Processor>> _function = new Function1<Board, EList<Processor>>() {
            public EList<Processor> apply(final Board it) {
                return it.getAllProcessors();
            }
        };
        return ECollections.<Processor>toEList(Iterables.<Processor>concat(XcoreEListExtensions.<Board, EList<Processor>>map(this.getBoards(), _function)));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Core> getAllCores() {
        final Function1<Board, EList<Core>> _function = new Function1<Board, EList<Core>>() {
            public EList<Core> apply(final Board it) {
                return it.getAllCores();
            }
        };
        return ECollections.<Core>toEList(Iterables.<Core>concat(XcoreEListExtensions.<Board, EList<Core>>map(this.getBoards(), _function)));
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
            case ModelPackage.BOX__COMPARTMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetCompartment((Compartment)otherEnd, msgs);
            case ModelPackage.BOX__BOARDS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoards()).basicAdd(otherEnd, msgs);
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
            case ModelPackage.BOX__COMPARTMENT:
                return basicSetCompartment(null, msgs);
            case ModelPackage.BOX__BOARDS:
                return ((InternalEList<?>)getBoards()).basicRemove(otherEnd, msgs);
            case ModelPackage.BOX__BOARD_ALTERNATIVES:
                return ((InternalEList<?>)getBoardAlternatives()).basicRemove(otherEnd, msgs);
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
            case ModelPackage.BOX__COMPARTMENT:
                return eInternalContainer().eInverseRemove(this, ModelPackage.COMPARTMENT__BOXES, Compartment.class, msgs);
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
            case ModelPackage.BOX__COMPARTMENT:
                if (resolve) return getCompartment();
                return basicGetCompartment();
            case ModelPackage.BOX__BOARDS:
                return getBoards();
            case ModelPackage.BOX__BOARD_ALTERNATIVES:
                return getBoardAlternatives();
            case ModelPackage.BOX__FULL_NAME:
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
            case ModelPackage.BOX__COMPARTMENT:
                setCompartment((Compartment)newValue);
                return;
            case ModelPackage.BOX__BOARDS:
                getBoards().clear();
                getBoards().addAll((Collection<? extends Board>)newValue);
                return;
            case ModelPackage.BOX__BOARD_ALTERNATIVES:
                getBoardAlternatives().clear();
                getBoardAlternatives().addAll((Collection<? extends BoardAlternatives>)newValue);
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
            case ModelPackage.BOX__COMPARTMENT:
                setCompartment((Compartment)null);
                return;
            case ModelPackage.BOX__BOARDS:
                getBoards().clear();
                return;
            case ModelPackage.BOX__BOARD_ALTERNATIVES:
                getBoardAlternatives().clear();
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
            case ModelPackage.BOX__COMPARTMENT:
                return basicGetCompartment() != null;
            case ModelPackage.BOX__BOARDS:
                return boards != null && !boards.isEmpty();
            case ModelPackage.BOX__BOARD_ALTERNATIVES:
                return boardAlternatives != null && !boardAlternatives.isEmpty();
            case ModelPackage.BOX__FULL_NAME:
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
            case ModelPackage.BOX___GET_ALL_BOARDS:
                return getAllBoards();
            case ModelPackage.BOX___GET_ALL_PROCESSORS:
                return getAllProcessors();
            case ModelPackage.BOX___GET_ALL_CORES:
                return getAllCores();
        }
        return super.eInvoke(operationID, arguments);
    }

} //BoxImpl
