/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Connected Pin Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.InternalConnectedPinBlock#getConnectedPins <em>Connected Pins</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInternalConnectedPinBlock()
 * @model
 * @generated
 */
public interface InternalConnectedPinBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Connected Pins</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ConnectedPinEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Pins</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInternalConnectedPinBlock_ConnectedPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectedPinEntry> getConnectedPins();

} // InternalConnectedPinBlock
