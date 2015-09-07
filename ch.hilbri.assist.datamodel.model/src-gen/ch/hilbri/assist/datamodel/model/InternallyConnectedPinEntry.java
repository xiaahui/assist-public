/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internally Connected Pin Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInternallyConnectedPinEntry()
 * @model
 * @generated
 */
public interface InternallyConnectedPinEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Pins</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.AvailableEqInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInternallyConnectedPinEntry_Pins()
	 * @model lower="2"
	 * @generated
	 */
	EList<AvailableEqInterface> getPins();

} // InternallyConnectedPinEntry
