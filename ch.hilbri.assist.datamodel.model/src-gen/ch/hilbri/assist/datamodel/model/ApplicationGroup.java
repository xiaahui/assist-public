/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ApplicationGroup#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getApplicationGroup()
 * @model
 * @generated
 */
public interface ApplicationGroup extends ApplicationOrApplicationGroup {
	/**
	 * Returns the value of the '<em><b>Applications Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getApplicationGroup_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationOrApplicationGroup> getApplicationsOrGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Application%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Application%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup%>> _applicationsOrGroups = this.getApplicationsOrGroups();\nfor (final <%ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup%> aog : _applicationsOrGroups)\n{\n\tif ((aog instanceof <%ch.hilbri.assist.datamodel.model.Application%>))\n\t{\n\t\tlist.add(((<%ch.hilbri.assist.datamodel.model.Application%>)aog));\n\t}\n\telse\n\t{\n\t\tif ((aog instanceof <%ch.hilbri.assist.datamodel.model.ApplicationGroup%>))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Application%>> _allApplications = ((<%ch.hilbri.assist.datamodel.model.ApplicationGroup%>)aog).getAllApplications();\n\t\t\tlist.addAll(_allApplications);\n\t\t}\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<Application> getAllApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Thread%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Thread%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Application%>> _allApplications = this.getAllApplications();\nfor (final <%ch.hilbri.assist.datamodel.model.Application%> app : _allApplications)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Thread%>> _threads = app.getThreads();\n\tlist.addAll(_threads);\n}\nreturn list;'"
	 * @generated
	 */
	EList<ch.hilbri.assist.datamodel.model.Thread> getAllThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String toString();

} // ApplicationGroup
