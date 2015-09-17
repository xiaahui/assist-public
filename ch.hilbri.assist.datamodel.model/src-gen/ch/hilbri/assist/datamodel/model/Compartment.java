/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Compartment#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Compartment#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Compartment#getSide <em>Side</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Compartment#getZone <em>Zone</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Compartment#getRdcs <em>Rdcs</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartment_Manufacturer()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Compartment#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Power Supply</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply</em>' attribute.
	 * @see #setPowerSupply(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartment_PowerSupply()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPowerSupply();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Compartment#getPowerSupply <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply</em>' attribute.
	 * @see #getPowerSupply()
	 * @generated
	 */
	void setPowerSupply(String value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartment_Side()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Compartment#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartment_Zone()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Compartment#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

	/**
	 * Returns the value of the '<em><b>Rdcs</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.RDC}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.RDC#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdcs</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartment_Rdcs()
	 * @see ch.hilbri.assist.datamodel.model.RDC#getCompartment
	 * @model opposite="compartment" containment="true"
	 * @generated
	 */
	EList<RDC> getRdcs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _rdcs = this.getRdcs();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> apply(final <%ch.hilbri.assist.datamodel.model.RDC%> it)\n\t{\n\t\treturn it.getConnectors();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>>map(_rdcs, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Connector%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Connector%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.Connector%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Connector> getAllConnectors();

} // Compartment
