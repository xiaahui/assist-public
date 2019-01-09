/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.BoardAlternative;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.RestrictionAlternative;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exploration Candidate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationCandidateImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationCandidateImpl#getBoardAlternatives <em>Board Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationCandidateImpl#getApplicationAlternatives <em>Application Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationCandidateImpl#getRestrictionAlternatives <em>Restriction Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplorationCandidateImpl extends MinimalEObjectImpl.Container implements ExplorationCandidate {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

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
     * The cached value of the '{@link #getBoardAlternatives() <em>Board Alternatives</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoardAlternatives()
     * @generated
     * @ordered
     */
    protected EList<BoardAlternative> boardAlternatives;

    /**
     * The cached value of the '{@link #getApplicationAlternatives() <em>Application Alternatives</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationAlternatives()
     * @generated
     * @ordered
     */
    protected EList<ApplicationAlternative> applicationAlternatives;

    /**
     * The cached value of the '{@link #getRestrictionAlternatives() <em>Restriction Alternatives</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRestrictionAlternatives()
     * @generated
     * @ordered
     */
    protected EList<RestrictionAlternative> restrictionAlternatives;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExplorationCandidateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.EXPLORATION_CANDIDATE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPLORATION_CANDIDATE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<BoardAlternative> getBoardAlternatives() {
        if (boardAlternatives == null) {
            boardAlternatives = new EObjectResolvingEList<BoardAlternative>(BoardAlternative.class, this, ModelPackage.EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES);
        }
        return boardAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ApplicationAlternative> getApplicationAlternatives() {
        if (applicationAlternatives == null) {
            applicationAlternatives = new EObjectResolvingEList<ApplicationAlternative>(ApplicationAlternative.class, this, ModelPackage.EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES);
        }
        return applicationAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RestrictionAlternative> getRestrictionAlternatives() {
        if (restrictionAlternatives == null) {
            restrictionAlternatives = new EObjectResolvingEList<RestrictionAlternative>(RestrictionAlternative.class, this, ModelPackage.EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES);
        }
        return restrictionAlternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.EXPLORATION_CANDIDATE__NAME:
                return getName();
            case ModelPackage.EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES:
                return getBoardAlternatives();
            case ModelPackage.EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES:
                return getApplicationAlternatives();
            case ModelPackage.EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES:
                return getRestrictionAlternatives();
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
            case ModelPackage.EXPLORATION_CANDIDATE__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES:
                getBoardAlternatives().clear();
                getBoardAlternatives().addAll((Collection<? extends BoardAlternative>)newValue);
                return;
            case ModelPackage.EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES:
                getApplicationAlternatives().clear();
                getApplicationAlternatives().addAll((Collection<? extends ApplicationAlternative>)newValue);
                return;
            case ModelPackage.EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES:
                getRestrictionAlternatives().clear();
                getRestrictionAlternatives().addAll((Collection<? extends RestrictionAlternative>)newValue);
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
            case ModelPackage.EXPLORATION_CANDIDATE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES:
                getBoardAlternatives().clear();
                return;
            case ModelPackage.EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES:
                getApplicationAlternatives().clear();
                return;
            case ModelPackage.EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES:
                getRestrictionAlternatives().clear();
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
            case ModelPackage.EXPLORATION_CANDIDATE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES:
                return boardAlternatives != null && !boardAlternatives.isEmpty();
            case ModelPackage.EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES:
                return applicationAlternatives != null && !applicationAlternatives.isEmpty();
            case ModelPackage.EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES:
                return restrictionAlternatives != null && !restrictionAlternatives.isEmpty();
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
        result.append(')');
        return result.toString();
    }

} //ExplorationCandidateImpl
