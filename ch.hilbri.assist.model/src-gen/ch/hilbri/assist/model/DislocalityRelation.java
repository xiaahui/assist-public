/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dislocality Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.DislocalityRelation#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getDislocalityRelation()
 * @model
 * @generated
 */
public interface DislocalityRelation extends EObject {
    /**
     * Returns the value of the '<em><b>Applications</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Application}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applications</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applications</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getDislocalityRelation_Applications()
     * @model required="true"
     * @generated
     */
    EList<Application> getApplications();

    /**
     * Returns the value of the '<em><b>Hardware Level</b></em>' attribute.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hardware Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hardware Level</em>' attribute.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see #setHardwareLevel(HardwareArchitectureLevelType)
     * @see ch.hilbri.assist.model.ModelPackage#getDislocalityRelation_HardwareLevel()
     * @model unique="false"
     * @generated
     */
    HardwareArchitectureLevelType getHardwareLevel();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hardware Level</em>' attribute.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see #getHardwareLevel()
     * @generated
     */
    void setHardwareLevel(HardwareArchitectureLevelType value);

} // DislocalityRelation
