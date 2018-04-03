/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exploration Candidate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.ExplorationCandidate#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationCandidate#getBoardAlternatives <em>Board Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationCandidate#getApplicationAlternatives <em>Application Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ExplorationCandidate#getRestrictionAlternatives <em>Restriction Alternatives</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getExplorationCandidate()
 * @model
 * @generated
 */
public interface ExplorationCandidate extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationCandidate_Name()
     * @model unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ExplorationCandidate#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Board Alternatives</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.BoardAlternative}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Board Alternatives</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Board Alternatives</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationCandidate_BoardAlternatives()
     * @model
     * @generated
     */
    EList<BoardAlternative> getBoardAlternatives();

    /**
     * Returns the value of the '<em><b>Application Alternatives</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.ApplicationAlternative}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Alternatives</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Application Alternatives</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationCandidate_ApplicationAlternatives()
     * @model
     * @generated
     */
    EList<ApplicationAlternative> getApplicationAlternatives();

    /**
     * Returns the value of the '<em><b>Restriction Alternatives</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.RestrictionAlternative}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restriction Alternatives</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restriction Alternatives</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getExplorationCandidate_RestrictionAlternatives()
     * @model
     * @generated
     */
    EList<RestrictionAlternative> getRestrictionAlternatives();

} // ExplorationCandidate
