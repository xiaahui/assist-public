/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exploration Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.ExplorationResult#getCandidate <em>Candidate</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationResult#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationResult#getMappingResult <em>Mapping Result</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationResult#isFeasible <em>Feasible</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationResult#getAbsoluteScore <em>Absolute Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationResult#getScaledScore <em>Scaled Score</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getExplorationResult()
 * @model
 * @generated
 */
public interface ExplorationResult extends EObject {
    /**
     * Returns the value of the '<em><b>Candidate</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Candidate</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Candidate</em>' reference.
     * @see #setCandidate(ExplorationCandidate)
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationResult_Candidate()
     * @model
     * @generated
     */
    ExplorationCandidate getCandidate();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ExplorationResult#getCandidate <em>Candidate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Candidate</em>' reference.
     * @see #getCandidate()
     * @generated
     */
    void setCandidate(ExplorationCandidate value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' reference.
     * @see #setModel(AssistModel)
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationResult_Model()
     * @model
     * @generated
     */
    AssistModel getModel();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ExplorationResult#getModel <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' reference.
     * @see #getModel()
     * @generated
     */
    void setModel(AssistModel value);

    /**
     * Returns the value of the '<em><b>Mapping Result</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping Result</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping Result</em>' reference.
     * @see #setMappingResult(MappingResult)
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationResult_MappingResult()
     * @model
     * @generated
     */
    MappingResult getMappingResult();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ExplorationResult#getMappingResult <em>Mapping Result</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping Result</em>' reference.
     * @see #getMappingResult()
     * @generated
     */
    void setMappingResult(MappingResult value);

    /**
     * Returns the value of the '<em><b>Feasible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feasible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feasible</em>' attribute.
     * @see #setFeasible(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationResult_Feasible()
     * @model unique="false"
     * @generated
     */
    boolean isFeasible();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ExplorationResult#isFeasible <em>Feasible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feasible</em>' attribute.
     * @see #isFeasible()
     * @generated
     */
    void setFeasible(boolean value);

    /**
     * Returns the value of the '<em><b>Absolute Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Absolute Score</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Absolute Score</em>' attribute.
     * @see #setAbsoluteScore(Double)
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationResult_AbsoluteScore()
     * @model unique="false"
     * @generated
     */
    Double getAbsoluteScore();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ExplorationResult#getAbsoluteScore <em>Absolute Score</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Absolute Score</em>' attribute.
     * @see #getAbsoluteScore()
     * @generated
     */
    void setAbsoluteScore(Double value);

    /**
     * Returns the value of the '<em><b>Scaled Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scaled Score</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scaled Score</em>' attribute.
     * @see #setScaledScore(Double)
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationResult_ScaledScore()
     * @model unique="false"
     * @generated
     */
    Double getScaledScore();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ExplorationResult#getScaledScore <em>Scaled Score</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scaled Score</em>' attribute.
     * @see #getScaledScore()
     * @generated
     */
    void setScaledScore(Double value);

} // ExplorationResult
