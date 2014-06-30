/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.AssistModel#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getHardwareContainer <em>Hardware Container</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getProximityRelations <em>Proximity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.AssistModel#getCommunicationRelations <em>Communication Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getAssistModel()
 * @model
 * @generated
 */
public interface AssistModel extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_SystemName()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.AssistModel#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Hardware Container</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.HardwareElementContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Container</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_HardwareContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwareElementContainer> getHardwareContainer();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_Applications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Application Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Groups</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_ApplicationGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationGroup> getApplicationGroups();

	/**
	 * Returns the value of the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.DissimilarityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_DissimilarityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DissimilarityRelation> getDissimilarityRelations();

	/**
	 * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_DislocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DislocalityRelation> getDislocalityRelations();

	/**
	 * Returns the value of the '<em><b>Proximity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.ProximityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proximity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proximity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_ProximityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProximityRelation> getProximityRelations();

	/**
	 * Returns the value of the '<em><b>Communication Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.CommunicationRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getAssistModel_CommunicationRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationRelation> getCommunicationRelations();

} // AssistModel
