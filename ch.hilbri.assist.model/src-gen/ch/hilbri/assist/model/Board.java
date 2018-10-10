/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Board#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Board#getProcessors <em>Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Board#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends HardwareElement {
    /**
     * Returns the value of the '<em><b>Box</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Box#getBoards <em>Boards</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Box</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Box</em>' container reference.
     * @see #setBox(Box)
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_Box()
     * @see ch.hilbri.assist.model.Box#getBoards
     * @model opposite="boards" transient="false"
     * @generated
     */
    Box getBox();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Board#getBox <em>Box</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Box</em>' container reference.
     * @see #getBox()
     * @generated
     */
    void setBox(Box value);

    /**
     * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Processor}.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Processor#getBoard <em>Board</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processors</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_Processors()
     * @see ch.hilbri.assist.model.Processor#getBoard
     * @model opposite="board" containment="true" required="true"
     * @generated
     */
    EList<Processor> getProcessors();

    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_FullName()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    String getFullName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false"
     * @generated
     */
    String toString();

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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    DesignAssuranceLevelType getAssuranceLevel();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setAssuranceLevel(DesignAssuranceLevelType newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    String getPowerSupply();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setPowerSupply(String newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    String getBoardType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setBoardType(String newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getRamCapacity();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setRamCapacity(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getRomCapacity();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setRomCapacity(int newValue);

} // Board
