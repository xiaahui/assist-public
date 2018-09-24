/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Box#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getBoardAlternatives <em>Board Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends HardwareElement {
    /**
     * Returns the value of the '<em><b>Compartment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Compartment#getBoxes <em>Boxes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compartment</em>' container reference.
     * @see #setCompartment(Compartment)
     * @see ch.hilbri.assist.model.ModelPackage#getBox_Compartment()
     * @see ch.hilbri.assist.model.Compartment#getBoxes
     * @model opposite="boxes" transient="false"
     * @generated
     */
    Compartment getCompartment();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Box#getCompartment <em>Compartment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Compartment</em>' container reference.
     * @see #getCompartment()
     * @generated
     */
    void setCompartment(Compartment value);

    /**
     * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Board}.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Board#getBox <em>Box</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Boards</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getBox_Boards()
     * @see ch.hilbri.assist.model.Board#getBox
     * @model opposite="box" containment="true"
     * @generated
     */
    EList<Board> getBoards();

    /**
     * Returns the value of the '<em><b>Board Alternatives</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.BoardAlternatives}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Board Alternatives</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Board Alternatives</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getBox_BoardAlternatives()
     * @model containment="true"
     * @generated
     */
    EList<BoardAlternatives> getBoardAlternatives();

    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getBox_FullName()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    String getFullName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Board> getAllBoards();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Processor> getAllProcessors();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Core> getAllCores();

} // Box
