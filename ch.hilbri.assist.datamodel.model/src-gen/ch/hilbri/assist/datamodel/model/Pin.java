/**
 */
package ch.hilbri.assist.datamodel.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Pin#getConnector <em>Connector</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Pin#getEqInterfaceType <em>Eq Interface Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Pin#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.Connector#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' container reference.
	 * @see #setConnector(Connector)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getPin_Connector()
	 * @see ch.hilbri.assist.datamodel.model.Connector#getPins
	 * @model opposite="pins" transient="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Pin#getConnector <em>Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' container reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Eq Interface Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Type</em>' attribute.
	 * @see #setEqInterfaceType(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getPin_EqInterfaceType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEqInterfaceType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Pin#getEqInterfaceType <em>Eq Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq Interface Type</em>' attribute.
	 * @see #getEqInterfaceType()
	 * @generated
	 */
	void setEqInterfaceType(String value);

	/**
	 * Returns the value of the '<em><b>Protection Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.ProtectionLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
	 * @see #setProtectionLevel(ProtectionLevelType)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getPin_ProtectionLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	ProtectionLevelType getProtectionLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Pin#getProtectionLevel <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
	 * @see #getProtectionLevel()
	 * @generated
	 */
	void setProtectionLevel(ProtectionLevelType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String toString();

} // Pin
