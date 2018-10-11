/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodicity Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.PeriodicityProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getPeriodicityProperty()
 * @model
 * @generated
 */
public interface PeriodicityProperty extends Property {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>"strict"</code>.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.PeriodicityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see ch.hilbri.assist.model.PeriodicityType
     * @see #setValue(PeriodicityType)
     * @see ch.hilbri.assist.model.ModelPackage#getPeriodicityProperty_Value()
     * @model default="strict" unique="false"
     * @generated
     */
    PeriodicityType getValue();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.PeriodicityProperty#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see ch.hilbri.assist.model.PeriodicityType
     * @see #getValue()
     * @generated
     */
    void setValue(PeriodicityType value);

} // PeriodicityProperty
