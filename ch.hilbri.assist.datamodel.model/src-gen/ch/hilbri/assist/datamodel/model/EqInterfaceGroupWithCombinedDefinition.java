/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eq Interface Group With Combined Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition#getCombinedGroups <em>Combined Groups</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getEqInterfaceGroupWithCombinedDefinition()
 * @model
 * @generated
 */
public interface EqInterfaceGroupWithCombinedDefinition extends EqInterfaceGroup {
	/**
	 * Returns the value of the '<em><b>Combined Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Groups</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getEqInterfaceGroupWithCombinedDefinition_CombinedGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<EqInterfaceGroup> getCombinedGroups();

} // EqInterfaceGroupWithCombinedDefinition
