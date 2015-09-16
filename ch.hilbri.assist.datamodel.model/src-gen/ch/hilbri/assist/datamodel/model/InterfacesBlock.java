/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  *******************************************************************************
 * INTERFACES BLOCK
 * *******************************************************************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.InterfacesBlock#getEqInterfaces <em>Eq Interfaces</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInterfacesBlock()
 * @model
 * @generated
 */
public interface InterfacesBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Eq Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interfaces</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInterfacesBlock_EqInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<EqInterface> getEqInterfaces();

} // InterfacesBlock
