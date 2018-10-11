/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Application#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Application#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends SoftwareElement {
    /**
     * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Task}.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Task#getApplication <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tasks</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getApplication_Tasks()
     * @see ch.hilbri.assist.model.Task#getApplication
     * @model opposite="application" containment="true" required="true"
     * @generated
     */
    EList<Task> getTasks();

    /**
     * Returns the value of the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.HardwareElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restrict Mapping To Hardware Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restrict Mapping To Hardware Elements</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getApplication_RestrictMappingToHardwareElements()
     * @model
     * @generated
     */
    EList<HardwareElement> getRestrictMappingToHardwareElements();

    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getApplication_FullName()
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
    String getDevelopedBy();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setDevelopedBy(String newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    DesignAssuranceLevelType getCriticalityLevel();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setCriticalityLevel(DesignAssuranceLevelType newValue);

} // Application
