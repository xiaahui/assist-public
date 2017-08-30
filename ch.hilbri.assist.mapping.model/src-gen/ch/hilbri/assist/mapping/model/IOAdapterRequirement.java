/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Adapter Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ***********************************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#getRequiredAdapterCount <em>Required Adapter Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getIOAdapterRequirement()
 * @model
 * @generated
 */
public interface IOAdapterRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Adapter Type</b></em>' attribute.
	 * The default value is <code>"None"</code>.
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
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getIOAdapterRequirement_AdapterType()
	 * @model default="None" unique="false"
	 * @generated
	 */
	IOAdapterType getAdapterType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#getAdapterType <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Type</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterType
	 * @see #getAdapterType()
	 * @generated
	 */
	void setAdapterType(IOAdapterType value);

	/**
	 * Returns the value of the '<em><b>Required Adapter Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Adapter Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Adapter Count</em>' attribute.
	 * @see #setRequiredAdapterCount(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getIOAdapterRequirement_RequiredAdapterCount()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getRequiredAdapterCount();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#getRequiredAdapterCount <em>Required Adapter Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Adapter Count</em>' attribute.
	 * @see #getRequiredAdapterCount()
	 * @generated
	 */
	void setRequiredAdapterCount(int value);

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
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getIOAdapterRequirement_IsSharedAllowed()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsSharedAllowed();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsSharedAllowed <em>Is Shared Allowed</em>}' attribute.
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
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getIOAdapterRequirement_IsExclusiveOnly()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsExclusiveOnly();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.IOAdapterRequirement#isIsExclusiveOnly <em>Is Exclusive Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exclusive Only</em>' attribute.
	 * @see #isIsExclusiveOnly()
	 * @generated
	 */
	void setIsExclusiveOnly(boolean value);

} // IOAdapterRequirement
