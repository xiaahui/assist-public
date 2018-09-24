/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.ExplorationResult;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exploration Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationResultImpl#getCandidate <em>Candidate</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationResultImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationResultImpl#getMappingResult <em>Mapping Result</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationResultImpl#isFeasible <em>Feasible</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationResultImpl#getAbsoluteScore <em>Absolute Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ExplorationResultImpl#getScaledScore <em>Scaled Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplorationResultImpl extends MinimalEObjectImpl.Container implements ExplorationResult {
    /**
     * The cached value of the '{@link #getCandidate() <em>Candidate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCandidate()
     * @generated
     * @ordered
     */
    protected ExplorationCandidate candidate;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected AssistModel model;

    /**
     * The cached value of the '{@link #getMappingResult() <em>Mapping Result</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappingResult()
     * @generated
     * @ordered
     */
    protected MappingResult mappingResult;

    /**
     * The default value of the '{@link #isFeasible() <em>Feasible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFeasible()
     * @generated
     * @ordered
     */
    protected static final boolean FEASIBLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFeasible() <em>Feasible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFeasible()
     * @generated
     * @ordered
     */
    protected boolean feasible = FEASIBLE_EDEFAULT;

    /**
     * The default value of the '{@link #getAbsoluteScore() <em>Absolute Score</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbsoluteScore()
     * @generated
     * @ordered
     */
    protected static final Double ABSOLUTE_SCORE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbsoluteScore() <em>Absolute Score</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbsoluteScore()
     * @generated
     * @ordered
     */
    protected Double absoluteScore = ABSOLUTE_SCORE_EDEFAULT;

    /**
     * The default value of the '{@link #getScaledScore() <em>Scaled Score</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScaledScore()
     * @generated
     * @ordered
     */
    protected static final Double SCALED_SCORE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScaledScore() <em>Scaled Score</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScaledScore()
     * @generated
     * @ordered
     */
    protected Double scaledScore = SCALED_SCORE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExplorationResultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.EXPLORATION_RESULT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplorationCandidate getCandidate() {
        if (candidate != null && candidate.eIsProxy()) {
            InternalEObject oldCandidate = (InternalEObject)candidate;
            candidate = (ExplorationCandidate)eResolveProxy(oldCandidate);
            if (candidate != oldCandidate) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXPLORATION_RESULT__CANDIDATE, oldCandidate, candidate));
            }
        }
        return candidate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplorationCandidate basicGetCandidate() {
        return candidate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCandidate(ExplorationCandidate newCandidate) {
        ExplorationCandidate oldCandidate = candidate;
        candidate = newCandidate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPLORATION_RESULT__CANDIDATE, oldCandidate, candidate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssistModel getModel() {
        if (model != null && model.eIsProxy()) {
            InternalEObject oldModel = (InternalEObject)model;
            model = (AssistModel)eResolveProxy(oldModel);
            if (model != oldModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXPLORATION_RESULT__MODEL, oldModel, model));
            }
        }
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssistModel basicGetModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(AssistModel newModel) {
        AssistModel oldModel = model;
        model = newModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPLORATION_RESULT__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingResult getMappingResult() {
        if (mappingResult != null && mappingResult.eIsProxy()) {
            InternalEObject oldMappingResult = (InternalEObject)mappingResult;
            mappingResult = (MappingResult)eResolveProxy(oldMappingResult);
            if (mappingResult != oldMappingResult) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXPLORATION_RESULT__MAPPING_RESULT, oldMappingResult, mappingResult));
            }
        }
        return mappingResult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingResult basicGetMappingResult() {
        return mappingResult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMappingResult(MappingResult newMappingResult) {
        MappingResult oldMappingResult = mappingResult;
        mappingResult = newMappingResult;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPLORATION_RESULT__MAPPING_RESULT, oldMappingResult, mappingResult));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFeasible() {
        return feasible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeasible(boolean newFeasible) {
        boolean oldFeasible = feasible;
        feasible = newFeasible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPLORATION_RESULT__FEASIBLE, oldFeasible, feasible));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getAbsoluteScore() {
        return absoluteScore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbsoluteScore(Double newAbsoluteScore) {
        Double oldAbsoluteScore = absoluteScore;
        absoluteScore = newAbsoluteScore;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPLORATION_RESULT__ABSOLUTE_SCORE, oldAbsoluteScore, absoluteScore));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getScaledScore() {
        return scaledScore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScaledScore(Double newScaledScore) {
        Double oldScaledScore = scaledScore;
        scaledScore = newScaledScore;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPLORATION_RESULT__SCALED_SCORE, oldScaledScore, scaledScore));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.EXPLORATION_RESULT__CANDIDATE:
                if (resolve) return getCandidate();
                return basicGetCandidate();
            case ModelPackage.EXPLORATION_RESULT__MODEL:
                if (resolve) return getModel();
                return basicGetModel();
            case ModelPackage.EXPLORATION_RESULT__MAPPING_RESULT:
                if (resolve) return getMappingResult();
                return basicGetMappingResult();
            case ModelPackage.EXPLORATION_RESULT__FEASIBLE:
                return isFeasible();
            case ModelPackage.EXPLORATION_RESULT__ABSOLUTE_SCORE:
                return getAbsoluteScore();
            case ModelPackage.EXPLORATION_RESULT__SCALED_SCORE:
                return getScaledScore();
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
            case ModelPackage.EXPLORATION_RESULT__CANDIDATE:
                setCandidate((ExplorationCandidate)newValue);
                return;
            case ModelPackage.EXPLORATION_RESULT__MODEL:
                setModel((AssistModel)newValue);
                return;
            case ModelPackage.EXPLORATION_RESULT__MAPPING_RESULT:
                setMappingResult((MappingResult)newValue);
                return;
            case ModelPackage.EXPLORATION_RESULT__FEASIBLE:
                setFeasible((Boolean)newValue);
                return;
            case ModelPackage.EXPLORATION_RESULT__ABSOLUTE_SCORE:
                setAbsoluteScore((Double)newValue);
                return;
            case ModelPackage.EXPLORATION_RESULT__SCALED_SCORE:
                setScaledScore((Double)newValue);
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
            case ModelPackage.EXPLORATION_RESULT__CANDIDATE:
                setCandidate((ExplorationCandidate)null);
                return;
            case ModelPackage.EXPLORATION_RESULT__MODEL:
                setModel((AssistModel)null);
                return;
            case ModelPackage.EXPLORATION_RESULT__MAPPING_RESULT:
                setMappingResult((MappingResult)null);
                return;
            case ModelPackage.EXPLORATION_RESULT__FEASIBLE:
                setFeasible(FEASIBLE_EDEFAULT);
                return;
            case ModelPackage.EXPLORATION_RESULT__ABSOLUTE_SCORE:
                setAbsoluteScore(ABSOLUTE_SCORE_EDEFAULT);
                return;
            case ModelPackage.EXPLORATION_RESULT__SCALED_SCORE:
                setScaledScore(SCALED_SCORE_EDEFAULT);
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
            case ModelPackage.EXPLORATION_RESULT__CANDIDATE:
                return candidate != null;
            case ModelPackage.EXPLORATION_RESULT__MODEL:
                return model != null;
            case ModelPackage.EXPLORATION_RESULT__MAPPING_RESULT:
                return mappingResult != null;
            case ModelPackage.EXPLORATION_RESULT__FEASIBLE:
                return feasible != FEASIBLE_EDEFAULT;
            case ModelPackage.EXPLORATION_RESULT__ABSOLUTE_SCORE:
                return ABSOLUTE_SCORE_EDEFAULT == null ? absoluteScore != null : !ABSOLUTE_SCORE_EDEFAULT.equals(absoluteScore);
            case ModelPackage.EXPLORATION_RESULT__SCALED_SCORE:
                return SCALED_SCORE_EDEFAULT == null ? scaledScore != null : !SCALED_SCORE_EDEFAULT.equals(scaledScore);
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
        result.append(" (feasible: ");
        result.append(feasible);
        result.append(", absoluteScore: ");
        result.append(absoluteScore);
        result.append(", scaledScore: ");
        result.append(scaledScore);
        result.append(')');
        return result.toString();
    }

} //ExplorationResultImpl
