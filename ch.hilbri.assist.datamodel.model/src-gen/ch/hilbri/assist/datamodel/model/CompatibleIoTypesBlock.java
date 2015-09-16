/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatible Io Types Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock#getCompatibleIoTypes <em>Compatible Io Types</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompatibleIoTypesBlock()
 * @model
 * @generated
 */
public interface CompatibleIoTypesBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Compatible Io Types</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Io Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Io Types</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompatibleIoTypesBlock_CompatibleIoTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompatibleIoTypeEntry> getCompatibleIoTypes();

} // CompatibleIoTypesBlock
