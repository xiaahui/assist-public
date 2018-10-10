/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Assurance Level Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.DesignAssuranceLevelProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getDesignAssuranceLevelProperty()
 * @model
 * @generated
 */
public interface DesignAssuranceLevelProperty extends Property {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>"None"</code>.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.DesignAssuranceLevelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see ch.hilbri.assist.model.DesignAssuranceLevelType
     * @see #setValue(DesignAssuranceLevelType)
     * @see ch.hilbri.assist.model.ModelPackage#getDesignAssuranceLevelProperty_Value()
     * @model default="None" unique="false"
     * @generated
     */
    DesignAssuranceLevelType getValue();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.DesignAssuranceLevelProperty#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see ch.hilbri.assist.model.DesignAssuranceLevelType
     * @see #getValue()
     * @generated
     */
    void setValue(DesignAssuranceLevelType value);

} // DesignAssuranceLevelProperty
