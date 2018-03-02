/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.BoardAlternative#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.BoardAlternative#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getBoardAlternative()
 * @model
 * @generated
 */
public interface BoardAlternative extends EObject {
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
     * @see ch.hilbri.assist.model.ModelPackage#getBoardAlternative_Name()
     * @model unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.BoardAlternative#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Board}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Boards</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getBoardAlternative_Boards()
     * @model containment="true"
     * @generated
     */
    EList<Board> getBoards();

} // BoardAlternative
