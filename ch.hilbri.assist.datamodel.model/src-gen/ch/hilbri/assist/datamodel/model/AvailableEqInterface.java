/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Available Eq Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getEqInterfaceType <em>Eq Interface Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getCount <em>Count</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAvailableEqInterface()
 * @model
 * @generated
 */
public interface AvailableEqInterface extends EObject {
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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAvailableEqInterface_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eq Interface Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Type</em>' attribute.
	 * @see #setEqInterfaceType(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAvailableEqInterface_EqInterfaceType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEqInterfaceType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getEqInterfaceType <em>Eq Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq Interface Type</em>' attribute.
	 * @see #getEqInterfaceType()
	 * @generated
	 */
	void setEqInterfaceType(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAvailableEqInterface_Count()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Protection Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.ProtectionLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
	 * @see #setProtectionLevel(ProtectionLevelType)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAvailableEqInterface_ProtectionLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	ProtectionLevelType getProtectionLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AvailableEqInterface#getProtectionLevel <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
	 * @see #getProtectionLevel()
	 * @generated
	 */
	void setProtectionLevel(ProtectionLevelType value);

} // AvailableEqInterface
