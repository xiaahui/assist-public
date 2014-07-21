/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import ch.hilbri.assist.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.model.IOAdapterType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.IOAdapter#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.IOAdapter#getTotalUnitCount <em>Total Unit Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.IOAdapter#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.IOAdapter#getProtectionLevel <em>Protection Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.IOAdapter#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getIOAdapter()
 * @model
 * @generated
 */
public interface IOAdapter extends EObject {
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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getIOAdapter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.IOAdapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Unit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Unit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Unit Count</em>' attribute.
	 * @see #setTotalUnitCount(int)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getIOAdapter_TotalUnitCount()
	 * @model unique="false"
	 * @generated
	 */
	int getTotalUnitCount();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.IOAdapter#getTotalUnitCount <em>Total Unit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Unit Count</em>' attribute.
	 * @see #getTotalUnitCount()
	 * @generated
	 */
	void setTotalUnitCount(int value);

	/**
	 * Returns the value of the '<em><b>Adapter Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.IOAdapterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Type</em>' attribute.
	 * @see ch.hilbri.assist.model.IOAdapterType
	 * @see #setAdapterType(IOAdapterType)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getIOAdapter_AdapterType()
	 * @model unique="false"
	 * @generated
	 */
	IOAdapterType getAdapterType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.IOAdapter#getAdapterType <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Type</em>' attribute.
	 * @see ch.hilbri.assist.model.IOAdapterType
	 * @see #getAdapterType()
	 * @generated
	 */
	void setAdapterType(IOAdapterType value);

	/**
	 * Returns the value of the '<em><b>Protection Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.IOAdapterProtectionLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.model.IOAdapterProtectionLevelType
	 * @see #setProtectionLevel(IOAdapterProtectionLevelType)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getIOAdapter_ProtectionLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	IOAdapterProtectionLevelType getProtectionLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.IOAdapter#getProtectionLevel <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.model.IOAdapterProtectionLevelType
	 * @see #getProtectionLevel()
	 * @generated
	 */
	void setProtectionLevel(IOAdapterProtectionLevelType value);

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.model.IOAdapter)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getIOAdapter_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.model.IOAdapter getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.IOAdapter#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.model.IOAdapter value);

} // IOAdapter
