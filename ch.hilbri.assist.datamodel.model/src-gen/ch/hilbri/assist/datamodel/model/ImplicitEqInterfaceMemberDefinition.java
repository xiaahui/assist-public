/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Eq Interface Member Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getImplicitEqInterfaceMemberDefinition()
 * @model
 * @generated
 */
public interface ImplicitEqInterfaceMemberDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getImplicitEqInterfaceMemberDefinition_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ImplicitEqInterfaceMemberDefinitionAttributesAndValues> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\n<%org.eclipse.emf.ecore.EObject%> _eContainer_1 = _eContainer.eContainer();\n<%org.eclipse.emf.ecore.EObject%> _eContainer_2 = _eContainer_1.eContainer();\nfinal <%ch.hilbri.assist.datamodel.model.AssistModel%> model = ((<%ch.hilbri.assist.datamodel.model.AssistModel%>) _eContainer_2);\n<%ch.hilbri.assist.datamodel.model.InterfacesBlock%> _interfacesBlock = model.getInterfacesBlock();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_interfacesBlock, null);\nif (_equals)\n{\n\treturn null;\n}\n<%ch.hilbri.assist.datamodel.model.InterfacesBlock%> _interfacesBlock_1 = model.getInterfacesBlock();\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> interfaceList = _interfacesBlock_1.getEqInterfaces();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues%>> _entries = this.getEntries();\nfor (final <%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues%> entry : _entries)\n{\n\t<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute%> _attribute = entry.getAttribute();\n\tif (_attribute != null)\n\t{\n\t\tswitch (_attribute)\n\t\t{\n\t\t\tcase NAME:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _name = it.getName();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_name.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function);\n\t\t\t\tinterfaceList = _filter;\n\t\t\t\tbreak;\n\t\t\tcase SYSTEM:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _system = it.getSystem();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_system.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_1);\n\t\t\t\tinterfaceList = _filter_1;\n\t\t\t\tbreak;\n\t\t\tcase SUBATA:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _subAta = it.getSubAta();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_subAta.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_2 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_2);\n\t\t\t\tinterfaceList = _filter_2;\n\t\t\t\tbreak;\n\t\t\tcase RESOURCE:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _resource = it.getResource();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_resource.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_3 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_3);\n\t\t\t\tinterfaceList = _filter_3;\n\t\t\t\tbreak;\n\t\t\tcase LINENAME:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_4 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _lineName = it.getLineName();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_lineName.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_4 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_4);\n\t\t\t\tinterfaceList = _filter_4;\n\t\t\t\tbreak;\n\t\t\tcase WIRINGLANE:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_5 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _wiringLane = it.getWiringLane();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_wiringLane.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_5 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_5);\n\t\t\t\tinterfaceList = _filter_5;\n\t\t\t\tbreak;\n\t\t\tcase GRPINFO:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_6 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _grpInfo = it.getGrpInfo();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_grpInfo.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_6 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_6);\n\t\t\t\tinterfaceList = _filter_6;\n\t\t\t\tbreak;\n\t\t\tcase ROUTE:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_7 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _route = it.getRoute();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_route.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_7 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_7);\n\t\t\t\tinterfaceList = _filter_7;\n\t\t\t\tbreak;\n\t\t\tcase PWSUP1:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_8 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _pwSup1 = it.getPwSup1();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_pwSup1.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_8 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_8);\n\t\t\t\tinterfaceList = _filter_8;\n\t\t\t\tbreak;\n\t\t\tcase EMHZONE1:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_9 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _emhZone1 = it.getEmhZone1();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_emhZone1.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_9 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_9);\n\t\t\t\tinterfaceList = _filter_9;\n\t\t\t\tbreak;\n\t\t\tcase IOTYPE:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_10 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%java.lang.String%> _ioType = it.getIoType();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_ioType.equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_10 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_10);\n\t\t\t\tinterfaceList = _filter_10;\n\t\t\t\tbreak;\n\t\t\tcase RESOURCE_X:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_11 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\tint _resourceX = it.getResourceX();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(<%java.lang.Integer%>.valueOf(_resourceX).equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_11 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_11);\n\t\t\t\tinterfaceList = _filter_11;\n\t\t\t\tbreak;\n\t\t\tcase RESOURCE_Y:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_12 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\tint _resourceY = it.getResourceY();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(<%java.lang.Integer%>.valueOf(_resourceY).equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_12 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_12);\n\t\t\t\tinterfaceList = _filter_12;\n\t\t\t\tbreak;\n\t\t\tcase RESOURCE_Z:\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function_13 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t\t\t\t\t{\n\t\t\t\t\t\tint _resourceZ = it.getResourceZ();\n\t\t\t\t\t\t<%java.lang.String%> _value = entry.getValue();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(<%java.lang.Integer%>.valueOf(_resourceZ).equals(_value));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter_13 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(interfaceList, _function_13);\n\t\t\t\tinterfaceList = _filter_13;\n\t\t\t\tbreak;\n\t\t\tdefault:\n\t\t\t\tbreak;\n\t\t}\n\t}\n}\n<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _set = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toSet(interfaceList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toEList(_set);'"
	 * @generated
	 */
	EList<EqInterface> getImplicitlyDefinedEqInterfaces();

} // ImplicitEqInterfaceMemberDefinition
