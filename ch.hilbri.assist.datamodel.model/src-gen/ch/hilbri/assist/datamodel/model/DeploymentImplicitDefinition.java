/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Implicit Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentImplicitDefinition()
 * @model
 * @generated
 */
public interface DeploymentImplicitDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentImplicitDefinition_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DeploymentImplicitDefinitionAttributeAndValue> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Pin%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Pin%>>();\n\t<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\n\t<%org.eclipse.emf.ecore.EObject%> _eContainer_1 = _eContainer.eContainer();\n\t<%org.eclipse.emf.ecore.EObject%> _eContainer_2 = _eContainer_1.eContainer();\n\tfinal <%ch.hilbri.assist.datamodel.model.AssistModel%> model = ((<%ch.hilbri.assist.datamodel.model.AssistModel%>) _eContainer_2);\n\t<%ch.hilbri.assist.datamodel.model.CompartmentsBlock%> _compartmentsBlock = model.getCompartmentsBlock();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_compartmentsBlock, null);\n\tif (_equals)\n\t{\n\t\treturn null;\n\t}\n\t<%ch.hilbri.assist.datamodel.model.CompartmentsBlock%> _compartmentsBlock_1 = model.getCompartmentsBlock();\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Compartment%>> _compartments = _compartmentsBlock_1.getCompartments();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>>()\n\t{\n\t\tpublic <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> apply(final <%ch.hilbri.assist.datamodel.model.Compartment%> it)\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _rdcs = it.getRdcs();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>>()\n\t\t\t{\n\t\t\t\tpublic <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> apply(final <%ch.hilbri.assist.datamodel.model.RDC%> it)\n\t\t\t\t{\n\t\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _connectors = it.getConnectors();\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>> apply(final <%ch.hilbri.assist.datamodel.model.Connector%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn it.getPins();\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>>map(_connectors, _function);\n\t\t\t\t\treturn <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>concat(_map);\n\t\t\t\t}\n\t\t\t};\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.RDC%>, <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>>map(_rdcs, _function);\n\t\t\treturn <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>concat(_map);\n\t\t}\n\t};\n\t<%org.eclipse.emf.common.util.EList%><<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Compartment%>, <%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>>>map(_compartments, _function);\n\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> pinList = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>concat(_map);\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue%>> _entries = this.getEntries();\n\tfor (final <%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue%> entry : _entries)\n\t{\n\t\t<%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute%> _attribute = entry.getAttribute();\n\t\tif (_attribute != null)\n\t\t{\n\t\t\tswitch (_attribute)\n\t\t\t{\n\t\t\t\tcase COMPARTMENT_NAME:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Compartment%> _compartment = _rdc.getCompartment();\n\t\t\t\t\t\t\t<%java.lang.String%> _name = _compartment.getName();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_name.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_1);\n\t\t\t\t\tpinList = _filter;\n\t\t\t\t\tbreak;\n\t\t\t\tcase COMPARTMENT_MANUFACTURER:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Compartment%> _compartment = _rdc.getCompartment();\n\t\t\t\t\t\t\t<%java.lang.String%> _manufacturer = _compartment.getManufacturer();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_manufacturer.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_2);\n\t\t\t\t\tpinList = _filter_1;\n\t\t\t\t\tbreak;\n\t\t\t\tcase COMPARTMENT_POWERSUPPLY:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Compartment%> _compartment = _rdc.getCompartment();\n\t\t\t\t\t\t\t<%java.lang.String%> _powerSupply = _compartment.getPowerSupply();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_powerSupply.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_2 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_3);\n\t\t\t\t\tpinList = _filter_2;\n\t\t\t\t\tbreak;\n\t\t\t\tcase COMPARTMENT_SIDE:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_4 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Compartment%> _compartment = _rdc.getCompartment();\n\t\t\t\t\t\t\t<%java.lang.String%> _side = _compartment.getSide();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_side.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_3 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_4);\n\t\t\t\t\tpinList = _filter_3;\n\t\t\t\t\tbreak;\n\t\t\t\tcase COMPARTMENT_ZONE:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_5 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Compartment%> _compartment = _rdc.getCompartment();\n\t\t\t\t\t\t\t<%java.lang.String%> _zone = _compartment.getZone();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_zone.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_4 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_5);\n\t\t\t\t\tpinList = _filter_4;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_NAME:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_6 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%java.lang.String%> _name = _rdc.getName();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_name.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_5 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_6);\n\t\t\t\t\tpinList = _filter_5;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_MANUFACTURER:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_7 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%java.lang.String%> _manufacturer = _rdc.getManufacturer();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_manufacturer.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_6 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_7);\n\t\t\t\t\tpinList = _filter_6;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_POWERSUPPLY1:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_8 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%java.lang.String%> _powerSupply1 = _rdc.getPowerSupply1();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_powerSupply1.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_7 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_8);\n\t\t\t\t\tpinList = _filter_7;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_POWERSUPPLY2:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_9 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%java.lang.String%> _powerSupply2 = _rdc.getPowerSupply2();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_powerSupply2.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_8 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_9);\n\t\t\t\t\tpinList = _filter_8;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_SIDE:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_10 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%java.lang.String%> _side = _rdc.getSide();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_side.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_9 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_10);\n\t\t\t\t\tpinList = _filter_9;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_TYPE:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_11 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%java.lang.String%> _rdcType = _rdc.getRdcType();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_rdcType.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_10 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_11);\n\t\t\t\t\tpinList = _filter_10;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_ESS:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_12 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\t<%java.lang.String%> _ess = _rdc.getEss();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_ess.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_11 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_12);\n\t\t\t\t\tpinList = _filter_11;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_RESOURCE_X:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_13 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\tint _resourceX = _rdc.getResourceX();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(<%java.lang.Integer%>.valueOf(_resourceX).equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_12 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_13);\n\t\t\t\t\tpinList = _filter_12;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_RESOURCE_Y:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_14 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\tint _resourceY = _rdc.getResourceY();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(<%java.lang.Integer%>.valueOf(_resourceY).equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_13 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_14);\n\t\t\t\t\tpinList = _filter_13;\n\t\t\t\t\tbreak;\n\t\t\t\tcase RDC_RESOURCE_Z:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_15 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.RDC%> _rdc = _connector.getRdc();\n\t\t\t\t\t\t\tint _resourceZ = _rdc.getResourceZ();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(<%java.lang.Integer%>.valueOf(_resourceZ).equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_14 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_15);\n\t\t\t\t\tpinList = _filter_14;\n\t\t\t\t\tbreak;\n\t\t\t\tcase CONNECTOR_NAME:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_16 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%ch.hilbri.assist.datamodel.model.Connector%> _connector = it.getConnector();\n\t\t\t\t\t\t\t<%java.lang.String%> _name = _connector.getName();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_name.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_15 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_16);\n\t\t\t\t\tpinList = _filter_15;\n\t\t\t\t\tbreak;\n\t\t\t\tcase PIN_NAME:\n\t\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function_17 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.Pin%> it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t<%java.lang.String%> _name = it.getName();\n\t\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_name.equals(_value));\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _filter_16 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>filter(pinList, _function_17);\n\t\t\t\t\tpinList = _filter_16;\n\t\t\t\t\tbreak;\n\t\t\t\tdefault:\n\t\t\t\t\tbreak;\n\t\t\t}\n\t\t}\n\t}\n\t<%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>addAll(list, pinList);\n\t<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.Pin%>> _set = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>toSet(list);\n\t_xblockexpression = <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>toEList(_set);\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<Pin> getImplicitlyDefinedPins();

} // DeploymentImplicitDefinition
