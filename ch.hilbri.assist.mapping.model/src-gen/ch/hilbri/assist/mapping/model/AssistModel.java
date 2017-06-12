/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getProximityRelations <em>Proximity Relations</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel()
 * @model
 * @generated
 */
public interface AssistModel extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_SystemName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.AssistModel#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Compartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_Compartments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Compartment> getCompartments();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_Applications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Application Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Groups</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_ApplicationGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationGroup> getApplicationGroups();

	/**
	 * Returns the value of the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.DissimilarityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_DissimilarityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DissimilarityRelation> getDissimilarityRelations();

	/**
	 * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_DislocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DislocalityRelation> getDislocalityRelations();

	/**
	 * Returns the value of the '<em><b>Proximity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.ProximityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proximity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proximity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_ProximityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProximityRelation> getProximityRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getCompartments();'"
	 * @generated
	 */
	EList<Compartment> getAllCompartments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Compartment%>> _compartments = this.getCompartments();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> apply(final <%ch.hilbri.assist.mapping.model.Compartment%> it)\n\t{\n\t\treturn it.getAllBoxes();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>>>map(_compartments, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Box%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Box%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Box%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Box> getAllBoxes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Compartment%>> _compartments = this.getCompartments();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> apply(final <%ch.hilbri.assist.mapping.model.Compartment%> it)\n\t{\n\t\treturn it.getAllBoards();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>>map(_compartments, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Board%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Board%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Board%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Board> getAllBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Compartment%>> _compartments = this.getCompartments();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> apply(final <%ch.hilbri.assist.mapping.model.Compartment%> it)\n\t{\n\t\treturn it.getAllProcessors();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>>map(_compartments, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Processor%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Processor%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Processor%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Compartment%>> _compartments = this.getCompartments();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> apply(final <%ch.hilbri.assist.mapping.model.Compartment%> it)\n\t{\n\t\treturn it.getAllCores();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>>map(_compartments, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Core%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Core%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Core%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Core> getAllCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Application%>> _applications = this.getApplications();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Application%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Task%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Application%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Task%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Task%>> apply(final <%ch.hilbri.assist.mapping.model.Application%> it)\n\t{\n\t\treturn it.getAllTasks();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Task%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Application%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Task%>>>map(_applications, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Task%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Task%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Task%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Task> getAllTasks();

} // AssistModel
