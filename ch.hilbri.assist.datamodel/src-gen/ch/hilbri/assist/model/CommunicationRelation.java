/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.CommunicationRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getCommunicationRelation()
 * @model
 * @generated
 */
public interface CommunicationRelation extends EObject {
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
	 * @see ch.hilbri.assist.model.ModelPackage#getCommunicationRelation_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationOrApplicationGroup> getApplicationsOrGroups();

	/**
	 * Returns the value of the '<em><b>Bandwidth Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth Utilization</em>' attribute.
	 * @see #setBandwidthUtilization(int)
	 * @see ch.hilbri.assist.model.ModelPackage#getCommunicationRelation_BandwidthUtilization()
	 * @model unique="false"
	 * @generated
	 */
	int getBandwidthUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Utilization</em>' attribute.
	 * @see #getBandwidthUtilization()
	 * @generated
	 */
	void setBandwidthUtilization(int value);

} // CommunicationRelation
