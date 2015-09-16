/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Groups Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  *******************************************************************************
 * INTERFACE GROUPS BLOCK
 * *******************************************************************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock#getEqInterfaceGroups <em>Eq Interface Groups</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInterfaceGroupsBlock()
 * @model
 * @generated
 */
public interface InterfaceGroupsBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Eq Interface Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Groups</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getInterfaceGroupsBlock_EqInterfaceGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<EqInterfaceGroup> getEqInterfaceGroups();

} // InterfaceGroupsBlock
