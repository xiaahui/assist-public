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
 *   <li>{@link ch.hilbri.assist.model.Board#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Board#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Board#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Board#getRamCapacity <em>Ram Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Board#getRomCapacity <em>Rom Capacity</em>}</li>
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
     * Returns the value of the '<em><b>Board Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Board Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Board Type</em>' attribute.
     * @see #setBoardType(String)
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_BoardType()
     * @model default="" unique="false"
     * @generated
     */
    String getBoardType();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Board#getBoardType <em>Board Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Board Type</em>' attribute.
     * @see #getBoardType()
     * @generated
     */
    void setBoardType(String value);

    /**
     * Returns the value of the '<em><b>Power Supply</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Supply</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Supply</em>' attribute.
     * @see #setPowerSupply(String)
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_PowerSupply()
     * @model default="" unique="false"
     * @generated
     */
    String getPowerSupply();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Board#getPowerSupply <em>Power Supply</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Supply</em>' attribute.
     * @see #getPowerSupply()
     * @generated
     */
    void setPowerSupply(String value);

    /**
     * Returns the value of the '<em><b>Assurance Level</b></em>' attribute.
     * The default value is <code>"None"</code>.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.DesignAssuranceLevelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assurance Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assurance Level</em>' attribute.
     * @see ch.hilbri.assist.model.DesignAssuranceLevelType
     * @see #setAssuranceLevel(DesignAssuranceLevelType)
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_AssuranceLevel()
     * @model default="None" unique="false"
     * @generated
     */
    DesignAssuranceLevelType getAssuranceLevel();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Board#getAssuranceLevel <em>Assurance Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assurance Level</em>' attribute.
     * @see ch.hilbri.assist.model.DesignAssuranceLevelType
     * @see #getAssuranceLevel()
     * @generated
     */
    void setAssuranceLevel(DesignAssuranceLevelType value);

    /**
     * Returns the value of the '<em><b>Ram Capacity</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ram Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ram Capacity</em>' attribute.
     * @see #setRamCapacity(int)
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_RamCapacity()
     * @model default="0" unique="false"
     * @generated
     */
    int getRamCapacity();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Board#getRamCapacity <em>Ram Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ram Capacity</em>' attribute.
     * @see #getRamCapacity()
     * @generated
     */
    void setRamCapacity(int value);

    /**
     * Returns the value of the '<em><b>Rom Capacity</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rom Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rom Capacity</em>' attribute.
     * @see #setRomCapacity(int)
     * @see ch.hilbri.assist.model.ModelPackage#getBoard_RomCapacity()
     * @model default="0" unique="false"
     * @generated
     */
    int getRomCapacity();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Board#getRomCapacity <em>Rom Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rom Capacity</em>' attribute.
     * @see #getRomCapacity()
     * @generated
     */
    void setRomCapacity(int value);

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

} // Board
