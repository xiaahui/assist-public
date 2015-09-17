/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Connector#getRdc <em>Rdc</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Connector#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Rdc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.RDC#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdc</em>' container reference.
	 * @see #setRdc(RDC)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getConnector_Rdc()
	 * @see ch.hilbri.assist.datamodel.model.RDC#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	RDC getRdc();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Connector#getRdc <em>Rdc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdc</em>' container reference.
	 * @see #getRdc()
	 * @generated
	 */
	void setRdc(RDC value);

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.Pin}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.Pin#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getConnector_Pins()
	 * @see ch.hilbri.assist.datamodel.model.Pin#getConnector
	 * @model opposite="connector" containment="true"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = this.getRdc();\n<%ch.hilbri.assist.datamodel.model.Compartment%> _compartment = _rdc.getCompartment();\n<%java.lang.String%> _name = _compartment.getName();\n<%java.lang.String%> _plus = (_name + \".\");\n<%ch.hilbri.assist.datamodel.model.RDC%> _rdc_1 = this.getRdc();\n<%java.lang.String%> _name_1 = _rdc_1.getName();\n<%java.lang.String%> _plus_1 = (_plus + _name_1);\n<%java.lang.String%> _plus_2 = (_plus_1 + \".\");\n<%java.lang.String%> _name_2 = this.getName();\nreturn (_plus_2 + _name_2);'"
	 * @generated
	 */
	String fullName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String toString();

} // Connector
