/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Level Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getRdcLocation <em>Rdc Location</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getEmhZone1 <em>Emh Zone1</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getProtectionLevelEntry()
 * @model
 * @generated
 */
public interface ProtectionLevelEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Rdc Location</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdc Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdc Location</em>' attribute.
	 * @see #setRdcLocation(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getProtectionLevelEntry_RdcLocation()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getRdcLocation();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getRdcLocation <em>Rdc Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdc Location</em>' attribute.
	 * @see #getRdcLocation()
	 * @generated
	 */
	void setRdcLocation(String value);

	/**
	 * Returns the value of the '<em><b>Emh Zone1</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emh Zone1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emh Zone1</em>' attribute.
	 * @see #setEmhZone1(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getProtectionLevelEntry_EmhZone1()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEmhZone1();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry#getEmhZone1 <em>Emh Zone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emh Zone1</em>' attribute.
	 * @see #getEmhZone1()
	 * @generated
	 */
	void setEmhZone1(String value);

	/**
	 * Returns the value of the '<em><b>Protection Level</b></em>' attribute list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ProtectionLevelType}.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.ProtectionLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level</em>' attribute list.
	 * @see ch.hilbri.assist.datamodel.model.ProtectionLevelType
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getProtectionLevelEntry_ProtectionLevel()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<ProtectionLevelType> getProtectionLevel();

} // ProtectionLevelEntry
