/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.ApplicationGroup#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.ApplicationGroup#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.ApplicationGroup#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.ApplicationGroup#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getApplicationGroup()
 * @model
 * @generated
 */
public interface ApplicationGroup extends EObject {
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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getApplicationGroup_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.ApplicationGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getApplicationGroup_Applications()
	 * @model
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Application Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Groups</em>' reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getApplicationGroup_ApplicationGroups()
	 * @model
	 * @generated
	 */
	EList<ApplicationGroup> getApplicationGroups();

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.model.ApplicationGroup)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getApplicationGroup_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.model.ApplicationGroup getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.ApplicationGroup#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.model.ApplicationGroup value);

} // ApplicationGroup
