/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.ColorProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getColorProperty()
 * @model
 * @generated
 */
public interface ColorProperty extends Property {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.Color}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see ch.hilbri.assist.model.Color
     * @see #setValue(Color)
     * @see ch.hilbri.assist.model.ModelPackage#getColorProperty_Value()
     * @model default="none" unique="false"
     * @generated
     */
    Color getValue();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ColorProperty#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see ch.hilbri.assist.model.Color
     * @see #getValue()
     * @generated
     */
    void setValue(Color value);

} // ColorProperty
