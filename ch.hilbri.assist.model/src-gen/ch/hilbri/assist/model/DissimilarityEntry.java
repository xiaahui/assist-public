/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityEntry#getDissimilarityAttribute <em>Dissimilarity Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityEntry#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry()
 * @model
 * @generated
 */
public interface DissimilarityEntry extends DissimilarityClause {
    /**
     * Returns the value of the '<em><b>Dissimilarity Attribute</b></em>' attribute.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.DissimilarityAttributes}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dissimilarity Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dissimilarity Attribute</em>' attribute.
     * @see ch.hilbri.assist.model.DissimilarityAttributes
     * @see #setDissimilarityAttribute(DissimilarityAttributes)
     * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry_DissimilarityAttribute()
     * @model unique="false"
     * @generated
     */
    DissimilarityAttributes getDissimilarityAttribute();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.DissimilarityEntry#getDissimilarityAttribute <em>Dissimilarity Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dissimilarity Attribute</em>' attribute.
     * @see ch.hilbri.assist.model.DissimilarityAttributes
     * @see #getDissimilarityAttribute()
     * @generated
     */
    void setDissimilarityAttribute(DissimilarityAttributes value);

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
     * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry_HardwareLevel()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    HardwareArchitectureLevelType getHardwareLevel();

} // DissimilarityEntry
