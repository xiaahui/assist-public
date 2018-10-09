/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Compartment#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Compartment#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends HardwareElement {
    /**
     * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Box}.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Box#getCompartment <em>Compartment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Boxes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Boxes</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getCompartment_Boxes()
     * @see ch.hilbri.assist.model.Box#getCompartment
     * @model opposite="compartment" containment="true" required="true"
     * @generated
     */
    EList<Box> getBoxes();

    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getCompartment_FullName()
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
    EList<Box> getAllBoxes();

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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    String getPowerSupply();

} // Compartment
