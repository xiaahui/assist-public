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
 *   <li>{@link ch.hilbri.assist.datamodel.model.Connector#getAvailableEqInterfaces <em>Available Eq Interfaces</em>}</li>
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
	 * Returns the value of the '<em><b>Available Eq Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.AvailableEqInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Eq Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Eq Interfaces</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getConnector_AvailableEqInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<AvailableEqInterface> getAvailableEqInterfaces();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" eqInterfaceTypesUnique="false" eqInterfaceTypesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.lang.String%>, <%java.lang.Integer%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.lang.String%>, <%java.lang.Integer%>>()\n{\n\tpublic <%java.lang.Integer%> apply(final <%java.lang.String%> it)\n\t{\n\t\t<%java.lang.Integer%> _xblockexpression = null;\n\t\t{\n\t\t\tfinal <%java.lang.String%> typeName = it;\n\t\t\t<%java.lang.Integer%> _xifexpression = null;\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _availableEqInterfaces = <%this%>.getAvailableEqInterfaces();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t{\n\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t{\n\t\t\t\t\t<%java.lang.String%> _eqInterfaceType = it.getEqInterfaceType();\n\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceType.equals(typeName));\n\t\t\t\t}\n\t\t\t};\n\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>filter(_availableEqInterfaces, _function);\n\t\t\tboolean _isNullOrEmpty = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.isNullOrEmpty(_filter);\n\t\t\tboolean _not = (!_isNullOrEmpty);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _availableEqInterfaces_1 = <%this%>.getAvailableEqInterfaces();\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _eqInterfaceType = it.getEqInterfaceType();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceType.equals(typeName));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>> _filter_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>>filter(_availableEqInterfaces_1, _function_1);\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Integer%> apply(final <%ch.hilbri.assist.datamodel.model.AvailableEqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%java.lang.Integer%>.valueOf(it.getCount());\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%java.lang.Integer%>> _map = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.AvailableEqInterface%>, <%java.lang.Integer%>>map(_filter_1, _function_2);\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Integer%> apply(final <%java.lang.Integer%> p1, final <%java.lang.Integer%> p2)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%java.lang.Integer%>.valueOf(((p1).intValue() + (p2).intValue()));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t_xifexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Integer%>>reduce(_map, _function_3);\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\t_xifexpression = <%java.lang.Integer%>.valueOf(0);\n\t\t\t}\n\t\t\t_xblockexpression = _xifexpression;\n\t\t}\n\t\treturn _xblockexpression;\n\t}\n};\nreturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%java.lang.String%>, <%java.lang.Integer%>>map(eqInterfaceTypes, _function);'"
	 * @generated
	 */
	EList<Integer> getAvailableEqInterfaces(EList<String> eqInterfaceTypes);

} // Connector
