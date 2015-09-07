/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Level Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ProtectionLevelData#getProtectionLevelEntries <em>Protection Level Entries</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getProtectionLevelData()
 * @model
 * @generated
 */
public interface ProtectionLevelData extends EObject {
	/**
	 * Returns the value of the '<em><b>Protection Level Entries</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ProtectionLevelEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level Entries</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getProtectionLevelData_ProtectionLevelEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtectionLevelEntry> getProtectionLevelEntries();

} // ProtectionLevelData
