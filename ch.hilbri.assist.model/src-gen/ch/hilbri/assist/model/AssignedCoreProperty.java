/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assigned Core Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.AssignedCoreProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getAssignedCoreProperty()
 * @model
 * @generated
 */
public interface AssignedCoreProperty extends Property {
    /**
     * Returns the value of the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' reference.
     * @see #setValue(Core)
     * @see ch.hilbri.assist.model.ModelPackage#getAssignedCoreProperty_Value()
     * @model
     * @generated
     */
    Core getValue();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AssignedCoreProperty#getValue <em>Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' reference.
     * @see #getValue()
     * @generated
     */
    void setValue(Core value);

} // AssignedCoreProperty
