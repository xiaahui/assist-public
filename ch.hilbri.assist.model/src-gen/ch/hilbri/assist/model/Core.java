/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Core#getFullName <em>Full Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Core#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends HardwareElement {
    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getCore_FullName()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    String getFullName();

    /**
     * Returns the value of the '<em><b>Processor</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Processor#getCores <em>Cores</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processor</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processor</em>' container reference.
     * @see #setProcessor(Processor)
     * @see ch.hilbri.assist.model.ModelPackage#getCore_Processor()
     * @see ch.hilbri.assist.model.Processor#getCores
     * @model opposite="cores" transient="false"
     * @generated
     */
    Processor getProcessor();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Core#getProcessor <em>Processor</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Processor</em>' container reference.
     * @see #getProcessor()
     * @generated
     */
    void setProcessor(Processor value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getCoreCapacity();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setCoreCapacity(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    String getCoreArchitecture();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setCoreArchitecture(String newValue);

} // Core
