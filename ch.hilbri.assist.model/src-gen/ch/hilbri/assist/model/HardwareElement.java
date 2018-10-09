/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getFeatures <em>Features</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getGetHardwareLevel <em>Get Hardware Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement()
 * @model
 * @generated
 */
public interface HardwareElement extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_Name()
     * @model default="" unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.HardwareElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Features</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Feature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Features</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_Features()
     * @model containment="true"
     * @generated
     */
    EList<Feature> getFeatures();

    /**
     * Returns the value of the '<em><b>Custom Properties</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.CustomProperty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Properties</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_CustomProperties()
     * @model containment="true"
     * @generated
     */
    EList<CustomProperty> getCustomProperties();

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_Properties()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperties();

    /**
     * Returns the value of the '<em><b>Get Hardware Level</b></em>' attribute.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get Hardware Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Get Hardware Level</em>' attribute.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_GetHardwareLevel()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    HardwareArchitectureLevelType getGetHardwareLevel();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    String getManufacturer();

} // HardwareElement
