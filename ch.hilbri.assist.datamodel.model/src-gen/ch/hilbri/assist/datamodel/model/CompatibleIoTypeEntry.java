/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatible Io Type Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry#getEqInterfaceIoType <em>Eq Interface Io Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry#getPinInterfaceIoTypes <em>Pin Interface Io Types</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompatibleIoTypeEntry()
 * @model
 * @generated
 */
public interface CompatibleIoTypeEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Eq Interface Io Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Io Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Io Type</em>' attribute.
	 * @see #setEqInterfaceIoType(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompatibleIoTypeEntry_EqInterfaceIoType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEqInterfaceIoType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry#getEqInterfaceIoType <em>Eq Interface Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq Interface Io Type</em>' attribute.
	 * @see #getEqInterfaceIoType()
	 * @generated
	 */
	void setEqInterfaceIoType(String value);

	/**
	 * Returns the value of the '<em><b>Pin Interface Io Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Interface Io Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Interface Io Types</em>' attribute list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompatibleIoTypeEntry_PinInterfaceIoTypes()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	EList<String> getPinInterfaceIoTypes();

} // CompatibleIoTypeEntry
