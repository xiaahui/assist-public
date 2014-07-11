/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.ApplicationGroup#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ApplicationGroup#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getApplicationGroup()
 * @model
 * @generated
 */
public interface ApplicationGroup extends ApplicationOrApplicationGroup {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.hilbri.assist.model.ModelPackage#getApplicationGroup_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.ApplicationGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Applications Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.ApplicationOrApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getApplicationGroup_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationOrApplicationGroup> getApplicationsOrGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Application%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Application%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.ApplicationOrApplicationGroup%>> _applicationsOrGroups = this.getApplicationsOrGroups();\nfor (final <%ch.hilbri.assist.model.ApplicationOrApplicationGroup%> aog : _applicationsOrGroups)\n{\n\tif ((aog instanceof <%ch.hilbri.assist.model.Application%>))\n\t{\n\t\tlist.add(((<%ch.hilbri.assist.model.Application%>)aog));\n\t}\n\telse\n\t{\n\t\tif ((aog instanceof <%ch.hilbri.assist.model.ApplicationGroup%>))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Application%>> _allApplications = ((<%ch.hilbri.assist.model.ApplicationGroup%>)aog).getAllApplications();\n\t\t\tlist.addAll(_allApplications);\n\t\t}\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<Application> getAllApplications();

} // ApplicationGroup
