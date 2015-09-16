/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restrictions Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  *******************************************************************************
 * RESTRICTIONS BLOCK
 * *******************************************************************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getValidDeployments <em>Valid Deployments</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RestrictionsBlock#getInvalidDeployments <em>Invalid Deployments</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRestrictionsBlock()
 * @model
 * @generated
 */
public interface RestrictionsBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRestrictionsBlock_DislocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DislocalityRelation> getDislocalityRelations();

	/**
	 * Returns the value of the '<em><b>Colocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ColocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRestrictionsBlock_ColocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColocalityRelation> getColocalityRelations();

	/**
	 * Returns the value of the '<em><b>Valid Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ValidDeployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Deployments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Deployments</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRestrictionsBlock_ValidDeployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidDeployment> getValidDeployments();

	/**
	 * Returns the value of the '<em><b>Invalid Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.InvalidDeployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Deployments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Deployments</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRestrictionsBlock_InvalidDeployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvalidDeployment> getInvalidDeployments();

} // RestrictionsBlock
