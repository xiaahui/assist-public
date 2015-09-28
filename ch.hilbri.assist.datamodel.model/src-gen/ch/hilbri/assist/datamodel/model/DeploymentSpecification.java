/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getHardwareElements <em>Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DeploymentSpecification#getImplicitHardwareElements <em>Implicit Hardware Elements</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentSpecification()
 * @model
 * @generated
 */
public interface DeploymentSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Eq Interface Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentSpecification_EqInterfaceOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<EqInterfaceOrGroup> getEqInterfaceOrGroups();

	/**
	 * Returns the value of the '<em><b>Hardware Elements</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.HardwareElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Elements</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentSpecification_HardwareElements()
	 * @model
	 * @generated
	 */
	EList<HardwareElement> getHardwareElements();

	/**
	 * Returns the value of the '<em><b>Implicit Hardware Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Hardware Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Hardware Elements</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentSpecification_ImplicitHardwareElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentImplicitDefinition> getImplicitHardwareElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> result = \"\";\nboolean first = true;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup%>> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();\nfor (final <%ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup%> e : _eqInterfaceOrGroups)\n{\n\t{\n\t\tif ((!first))\n\t\t{\n\t\t\t<%java.lang.String%> _result = result;\n\t\t\tresult = (_result + \", \");\n\t\t}\n\t\telse\n\t\t{\n\t\t\tfirst = false;\n\t\t}\n\t\tif ((e instanceof <%ch.hilbri.assist.datamodel.model.EqInterface%>))\n\t\t{\n\t\t\t<%java.lang.String%> _result_1 = result;\n\t\t\t<%java.lang.String%> _name = ((<%ch.hilbri.assist.datamodel.model.EqInterface%>)e).getName();\n\t\t\tresult = (_result_1 + _name);\n\t\t}\n\t\tif ((e instanceof <%ch.hilbri.assist.datamodel.model.EqInterfaceGroup%>))\n\t\t{\n\t\t\t<%java.lang.String%> _result_2 = result;\n\t\t\t<%java.lang.String%> _name_1 = ((<%ch.hilbri.assist.datamodel.model.EqInterfaceGroup%>)e).getName();\n\t\t\tresult = (_result_2 + _name_1);\n\t\t}\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	String getAllEqInterfaceOrGroupNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition%>> _implicitHardwareElements = this.getImplicitHardwareElements();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>> apply(final <%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition%> it)\n\t{\n\t\treturn it.getImplicitlyDefinedPins();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>>map(_implicitHardwareElements, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>concat(_map);\n<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.Pin%>> _set = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>toSet(_flatten);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>toEList(_set);'"
	 * @generated
	 */
	EList<Pin> getImplicitlyDefinedPins();

} // DeploymentSpecification
