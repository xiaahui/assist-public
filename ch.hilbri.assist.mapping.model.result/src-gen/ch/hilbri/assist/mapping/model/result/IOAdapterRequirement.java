/**
 */
package ch.hilbri.assist.mapping.model.result;

import ch.hilbri.assist.mapping.model.IOAdapterType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Adapter Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getRequiredUnits <em>Required Units</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getIOAdapterRequirement()
 * @model
 * @generated
 */
public interface IOAdapterRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Adapter Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.IOAdapterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Type</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterType
	 * @see #setAdapterType(IOAdapterType)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getIOAdapterRequirement_AdapterType()
	 * @model unique="false"
	 * @generated
	 */
	IOAdapterType getAdapterType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Type</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterType
	 * @see #getAdapterType()
	 * @generated
	 */
	void setAdapterType(IOAdapterType value);

	/**
	 * Returns the value of the '<em><b>Required Units</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Units</em>' attribute.
	 * @see #setRequiredUnits(int)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getIOAdapterRequirement_RequiredUnits()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getRequiredUnits();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getRequiredUnits <em>Required Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Units</em>' attribute.
	 * @see #getRequiredUnits()
	 * @generated
	 */
	void setRequiredUnits(int value);

	/**
	 * Returns the value of the '<em><b>Is Shared Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Shared Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Shared Allowed</em>' attribute.
	 * @see #setIsSharedAllowed(boolean)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getIOAdapterRequirement_IsSharedAllowed()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsSharedAllowed();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shared Allowed</em>' attribute.
	 * @see #isIsSharedAllowed()
	 * @generated
	 */
	void setIsSharedAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Exclusive Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exclusive Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exclusive Only</em>' attribute.
	 * @see #setIsExclusiveOnly(boolean)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getIOAdapterRequirement_IsExclusiveOnly()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsExclusiveOnly();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exclusive Only</em>' attribute.
	 * @see #isIsExclusiveOnly()
	 * @generated
	 */
	void setIsExclusiveOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.mapping.model.IOAdapterRequirement)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getIOAdapterRequirement_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.mapping.model.IOAdapterRequirement getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.mapping.model.IOAdapterRequirement value);

} // IOAdapterRequirement
