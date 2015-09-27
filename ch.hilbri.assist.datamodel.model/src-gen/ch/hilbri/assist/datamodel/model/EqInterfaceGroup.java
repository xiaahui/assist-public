/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eq Interface Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getEqInterfaces <em>Eq Interfaces</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutEqInterfaces <em>Without Eq Interfaces</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getImplicitMemberDefinitions <em>Implicit Member Definitions</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup#getWithoutImplicitMemberDefinitions <em>Without Implicit Member Definitions</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getEqInterfaceGroup()
 * @model
 * @generated
 */
public interface EqInterfaceGroup extends EqInterfaceOrGroup {
	/**
	 * Returns the value of the '<em><b>Eq Interfaces</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interfaces</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getEqInterfaceGroup_EqInterfaces()
	 * @model
	 * @generated
	 */
	EList<EqInterface> getEqInterfaces();

	/**
	 * Returns the value of the '<em><b>Without Eq Interfaces</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Without Eq Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Without Eq Interfaces</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getEqInterfaceGroup_WithoutEqInterfaces()
	 * @model
	 * @generated
	 */
	EList<EqInterface> getWithoutEqInterfaces();

	/**
	 * Returns the value of the '<em><b>Implicit Member Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Member Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Member Definitions</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getEqInterfaceGroup_ImplicitMemberDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplicitEqInterfaceMemberDefinition> getImplicitMemberDefinitions();

	/**
	 * Returns the value of the '<em><b>Without Implicit Member Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Without Implicit Member Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Without Implicit Member Definitions</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getEqInterfaceGroup_WithoutImplicitMemberDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplicitEqInterfaceMemberDefinition> getWithoutImplicitMemberDefinitions();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>> _implicitMemberDefinitions = this.getImplicitMemberDefinitions();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> apply(final <%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%> it)\n\t{\n\t\treturn it.getImplicitlyDefinedEqInterfaces();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>>map(_implicitMemberDefinitions, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>concat(_map);\n<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _set = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toSet(_flatten);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toEList(_set);'"
	 * @generated
	 */
	EList<EqInterface> getImplicitlyDefinedEqInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>> _withoutImplicitMemberDefinitions = this.getWithoutImplicitMemberDefinitions();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> apply(final <%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%> it)\n\t{\n\t\treturn it.getImplicitlyDefinedEqInterfaces();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>>map(_withoutImplicitMemberDefinitions, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>concat(_map);\n<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _set = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toSet(_flatten);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toEList(_set);'"
	 * @generated
	 */
	EList<EqInterface> getWithoutImplicitlyDefinedEqInterfaces();

} // EqInterfaceGroup
