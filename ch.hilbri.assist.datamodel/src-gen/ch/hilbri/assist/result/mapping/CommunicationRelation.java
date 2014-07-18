/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

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
 *   <li>{@link ch.hilbri.assist.result.mapping.CommunicationRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.CommunicationRelation#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCommunicationRelation()
 * @model
 * @generated
 */
public interface CommunicationRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCommunicationRelation_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<Application> getApplicationsOrGroups();

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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCommunicationRelation_BandwidthUtilization()
	 * @model unique="false"
	 * @generated
	 */
	int getBandwidthUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.CommunicationRelation#getBandwidthUtilization <em>Bandwidth Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Utilization</em>' attribute.
	 * @see #getBandwidthUtilization()
	 * @generated
	 */
	void setBandwidthUtilization(int value);

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.model.CommunicationRelation)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCommunicationRelation_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.model.CommunicationRelation getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.CommunicationRelation#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.model.CommunicationRelation value);

} // CommunicationRelation
