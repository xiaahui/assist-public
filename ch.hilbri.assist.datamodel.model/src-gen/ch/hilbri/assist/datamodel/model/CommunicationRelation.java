/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CommunicationRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCommunicationRelation()
 * @model
 * @generated
 */
public interface CommunicationRelation extends EObject {
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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCommunicationRelation_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationOrApplicationGroup> getApplicationsOrGroups();

	/**
	 * Returns the value of the '<em><b>Bandwidth Utilization</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth Utilization</em>' attribute.
	 * @see #setBandwidthUtilization(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCommunicationRelation_BandwidthUtilization()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getBandwidthUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Utilization</em>' attribute.
	 * @see #getBandwidthUtilization()
	 * @generated
	 */
	void setBandwidthUtilization(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Thread%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Thread%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup%>> _applicationsOrGroups = this.getApplicationsOrGroups();\nfor (final <%ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup%> aog : _applicationsOrGroups)\n{\n\tif ((aog instanceof <%ch.hilbri.assist.datamodel.model.ApplicationGroup%>))\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Thread%>> _allThreads = ((<%ch.hilbri.assist.datamodel.model.ApplicationGroup%>)aog).getAllThreads();\n\t\tlist.addAll(_allThreads);\n\t}\n\telse\n\t{\n\t\tif ((aog instanceof <%ch.hilbri.assist.datamodel.model.Application%>))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Thread%>> _threads = ((<%ch.hilbri.assist.datamodel.model.Application%>)aog).getThreads();\n\t\t\tlist.addAll(_threads);\n\t\t}\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<ch.hilbri.assist.datamodel.model.Thread> getAllThreads();

} // CommunicationRelation
