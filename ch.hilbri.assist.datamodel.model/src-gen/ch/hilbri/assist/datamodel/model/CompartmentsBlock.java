/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartments Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  *******************************************************************************
 * COMPARTMENTS BLOCK
 * *******************************************************************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CompartmentsBlock#getCompartments <em>Compartments</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartmentsBlock()
 * @model
 * @generated
 */
public interface CompartmentsBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.Compartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCompartmentsBlock_Compartments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Compartment> getCompartments();

} // CompartmentsBlock
