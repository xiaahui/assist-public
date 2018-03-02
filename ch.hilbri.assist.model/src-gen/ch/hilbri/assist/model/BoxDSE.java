/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box DSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.BoxDSE#getBoardAlternatives <em>Board Alternatives</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getBoxDSE()
 * @model
 * @generated
 */
public interface BoxDSE extends Box {
    /**
     * Returns the value of the '<em><b>Board Alternatives</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.BoardAlternatives}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Board Alternatives</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Board Alternatives</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getBoxDSE_BoardAlternatives()
     * @model containment="true"
     * @generated
     */
    EList<BoardAlternatives> getBoardAlternatives();

} // BoxDSE
