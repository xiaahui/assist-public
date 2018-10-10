/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Processor#getFullName <em>Full Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Processor#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Processor#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends HardwareElement {
    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getProcessor_FullName()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    String getFullName();

    /**
     * Returns the value of the '<em><b>Board</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Board#getProcessors <em>Processors</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Board</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Board</em>' container reference.
     * @see #setBoard(Board)
     * @see ch.hilbri.assist.model.ModelPackage#getProcessor_Board()
     * @see ch.hilbri.assist.model.Board#getProcessors
     * @model opposite="processors" transient="false"
     * @generated
     */
    Board getBoard();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Processor#getBoard <em>Board</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Board</em>' container reference.
     * @see #getBoard()
     * @generated
     */
    void setBoard(Board value);

    /**
     * Returns the value of the '<em><b>Cores</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Core}.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Core#getProcessor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cores</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cores</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getProcessor_Cores()
     * @see ch.hilbri.assist.model.Core#getProcessor
     * @model opposite="processor" containment="true" required="true"
     * @generated
     */
    EList<Core> getCores();

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
    String getProcessorType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setProcessorType(String newValue);

} // Processor
