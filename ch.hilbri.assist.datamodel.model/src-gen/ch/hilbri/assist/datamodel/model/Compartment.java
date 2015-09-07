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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Connector%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Connector%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _rdcs = this.getRdcs();\nfor (final <%ch.hilbri.assist.datamodel.model.RDC%> rdc : _rdcs)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _connectors = rdc.getConnectors();\n\tlist.addAll(_connectors);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Connector> getAllConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" eqInterfaceTypesUnique="false" eqInterfaceTypesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%java.lang.Integer%>> _xblockexpression = null;\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _allConnectors = this.getAllConnectors();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>>()\n\t{\n\t\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> apply(final <%ch.hilbri.assist.datamodel.model.Connector%> it)\n\t\t{\n\t\t\treturn it.getAvailableEqInterfaces();\n\t\t}\n\t};\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>>map(_allConnectors, _function);\n\tfinal <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> allAvailableEqInterfaces = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>concat(_map);\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.lang.String%>, <%java.lang.Integer%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.lang.String%>, <%java.lang.Integer%>>()\n\t{\n\t\tpublic <%java.lang.Integer%> apply(final <%java.lang.String%> it)\n\t\t{\n\t\t\t<%java.lang.Integer%> _xblockexpression = null;\n\t\t\t{\n\t\t\t\tfinal <%java.lang.String%> typeName = it;\n\t\t\t\t<%java.lang.Integer%> _xifexpression = null;\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _eqInterfaceType = it.getEqInterfaceType();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceType.equals(typeName));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>filter(allAvailableEqInterfaces, _function);\n\t\t\t\tboolean _isNullOrEmpty = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.isNullOrEmpty(_filter);\n\t\t\t\tboolean _not = (!_isNullOrEmpty);\n\t\t\t\tif (_not)\n\t\t\t\t{\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%java.lang.String%> _eqInterfaceType = it.getEqInterfaceType();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceType.equals(typeName));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _filter_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>filter(allAvailableEqInterfaces, _function_1);\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Integer%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%java.lang.Integer%>.valueOf(it.getCount());\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%java.lang.Integer%>> _map = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>>map(_filter_1, _function_2);\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Integer%> apply(final <%java.lang.Integer%> p1, final <%java.lang.Integer%> p2)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%java.lang.Integer%>.valueOf(((p1).intValue() + (p2).intValue()));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t_xifexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Integer%>>reduce(_map, _function_3);\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\t_xifexpression = <%java.lang.Integer%>.valueOf(0);\n\t\t\t\t}\n\t\t\t\t_xblockexpression = _xifexpression;\n\t\t\t}\n\t\t\treturn _xblockexpression;\n\t\t}\n\t};\n\t_xblockexpression = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%java.lang.String%>, <%java.lang.Integer%>>map(eqInterfaceTypes, _function_1);\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<Integer> getAvailableEqInterfaces(EList<String> eqInterfaceTypes);

} // Compartment
