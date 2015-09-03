/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.IOAdapter#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.IOAdapter#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.IOAdapter#getSharedUnitCount <em>Shared Unit Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.IOAdapter#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.IOAdapter#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getIOAdapter()
 * @model
 * @generated
 */
public interface IOAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getIOAdapter_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Count</em>' attribute.
	 * @see #setTotalCount(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getIOAdapter_TotalCount()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getTotalCount();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getTotalCount <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Count</em>' attribute.
	 * @see #getTotalCount()
	 * @generated
	 */
	void setTotalCount(int value);

	/**
	 * Returns the value of the '<em><b>Shared Unit Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Unit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Unit Count</em>' attribute.
	 * @see #setSharedUnitCount(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getIOAdapter_SharedUnitCount()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getSharedUnitCount();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getSharedUnitCount <em>Shared Unit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Unit Count</em>' attribute.
	 * @see #getSharedUnitCount()
	 * @generated
	 */
	void setSharedUnitCount(int value);

	/**
	 * Returns the value of the '<em><b>Adapter Type</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.IOAdapterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Scheduling
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adapter Type</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterType
	 * @see #setAdapterType(IOAdapterType)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getIOAdapter_AdapterType()
	 * @model default="None" unique="false"
	 * @generated
	 */
	IOAdapterType getAdapterType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getAdapterType <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Type</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterType
	 * @see #getAdapterType()
	 * @generated
	 */
	void setAdapterType(IOAdapterType value);

	/**
	 * Returns the value of the '<em><b>Protection Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
	 * @see #setProtectionLevel(IOAdapterProtectionLevelType)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getIOAdapter_ProtectionLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	IOAdapterProtectionLevelType getProtectionLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.IOAdapter#getProtectionLevel <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
	 * @see #getProtectionLevel()
	 * @generated
	 */
	void setProtectionLevel(IOAdapterProtectionLevelType value);

} // IOAdapter
