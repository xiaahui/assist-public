/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom String Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.CustomStringProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getCustomStringProperty()
 * @model
 * @generated
 */
public interface CustomStringProperty extends CustomProperty {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ch.hilbri.assist.model.ModelPackage#getCustomStringProperty_Value()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.CustomStringProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CustomStringProperty
