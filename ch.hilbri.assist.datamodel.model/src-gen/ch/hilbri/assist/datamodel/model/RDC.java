/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getSide <em>Side</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getRdcType <em>Rdc Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getEss <em>Ess</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getLocation <em>Location</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getResourceX <em>Resource X</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getResourceY <em>Resource Y</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getResourceZ <em>Resource Z</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getConnectedPins <em>Connected Pins</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC()
 * @model
 * @generated
 */
public interface RDC extends HardwareElement {
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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Manufacturer()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getManufacturer <em>Manufacturer</em>}' attribute.
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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_PowerSupply()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPowerSupply();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getPowerSupply <em>Power Supply</em>}' attribute.
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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Side()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Rdc Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdc Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdc Type</em>' attribute.
	 * @see #setRdcType(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_RdcType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getRdcType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getRdcType <em>Rdc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdc Type</em>' attribute.
	 * @see #getRdcType()
	 * @generated
	 */
	void setRdcType(String value);

	/**
	 * Returns the value of the '<em><b>Ess</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ess</em>' attribute.
	 * @see #setEss(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Ess()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEss();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getEss <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ess</em>' attribute.
	 * @see #getEss()
	 * @generated
	 */
	void setEss(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Location()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Resource X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource X</em>' attribute.
	 * @see #setResourceX(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ResourceX()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getResourceX();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceX <em>Resource X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource X</em>' attribute.
	 * @see #getResourceX()
	 * @generated
	 */
	void setResourceX(int value);

	/**
	 * Returns the value of the '<em><b>Resource Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Y</em>' attribute.
	 * @see #setResourceY(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ResourceY()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getResourceY();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceY <em>Resource Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Y</em>' attribute.
	 * @see #getResourceY()
	 * @generated
	 */
	void setResourceY(int value);

	/**
	 * Returns the value of the '<em><b>Resource Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Z</em>' attribute.
	 * @see #setResourceZ(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ResourceZ()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getResourceZ();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceZ <em>Resource Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Z</em>' attribute.
	 * @see #getResourceZ()
	 * @generated
	 */
	void setResourceZ(int value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.Compartment#getRdcs <em>Rdcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' container reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Compartment()
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getRdcs
	 * @model opposite="rdcs" transient="false"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getCompartment <em>Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' container reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.Connector}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.Connector#getRdc <em>Rdc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Connectors()
	 * @see ch.hilbri.assist.datamodel.model.Connector#getRdc
	 * @model opposite="rdc" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Connected Pins</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Pins</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ConnectedPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternallyConnectedPinEntry> getConnectedPins();

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
	 * @model unique="false" eqInterfaceTypesUnique="false" eqInterfaceTypesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%java.lang.Integer%>> _xblockexpression = null;\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _connectors = this.getConnectors();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>>()\n\t{\n\t\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> apply(final <%ch.hilbri.assist.datamodel.model.Connector%> it)\n\t\t{\n\t\t\treturn it.getAvailableEqInterfaces();\n\t\t}\n\t};\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>>map(_connectors, _function);\n\tfinal <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> allAvailableEqInterfaces = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>concat(_map);\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.lang.String%>, <%java.lang.Integer%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.lang.String%>, <%java.lang.Integer%>>()\n\t{\n\t\tpublic <%java.lang.Integer%> apply(final <%java.lang.String%> it)\n\t\t{\n\t\t\t<%java.lang.Integer%> _xblockexpression = null;\n\t\t\t{\n\t\t\t\tfinal <%java.lang.String%> typeName = it;\n\t\t\t\t<%java.lang.Integer%> _xifexpression = null;\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _eqInterfaceType = it.getEqInterfaceType();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceType.equals(typeName));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>filter(allAvailableEqInterfaces, _function);\n\t\t\t\tboolean _isNullOrEmpty = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.isNullOrEmpty(_filter);\n\t\t\t\tboolean _not = (!_isNullOrEmpty);\n\t\t\t\tif (_not)\n\t\t\t\t{\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%java.lang.String%> _eqInterfaceType = it.getEqInterfaceType();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceType.equals(typeName));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _filter_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>filter(allAvailableEqInterfaces, _function_1);\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Integer%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%java.lang.Integer%>.valueOf(it.getCount());\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%java.lang.Integer%>> _map = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>>map(_filter_1, _function_2);\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Integer%> apply(final <%java.lang.Integer%> p1, final <%java.lang.Integer%> p2)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%java.lang.Integer%>.valueOf(((p1).intValue() + (p2).intValue()));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t_xifexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Integer%>>reduce(_map, _function_3);\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\t_xifexpression = <%java.lang.Integer%>.valueOf(0);\n\t\t\t\t}\n\t\t\t\t_xblockexpression = _xifexpression;\n\t\t\t}\n\t\t\treturn _xblockexpression;\n\t\t}\n\t};\n\t_xblockexpression = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%java.lang.String%>, <%java.lang.Integer%>>map(eqInterfaceTypes, _function_1);\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<Integer> getAvailableEqInterfaces(EList<String> eqInterfaceTypes);

} // RDC
