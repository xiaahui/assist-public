/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.FeatureRequirement#getFeaturename <em>Featurename</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.FeatureRequirement#getHardwareLevel <em>Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.FeatureRequirement#getUnits <em>Units</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.FeatureRequirement#isShared <em>Shared</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.FeatureRequirement#isIsExclusive <em>Is Exclusive</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getFeatureRequirement()
 * @model
 * @generated
 */
public interface FeatureRequirement extends EObject {
    /**
     * Returns the value of the '<em><b>Featurename</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Featurename</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Featurename</em>' attribute.
     * @see #setFeaturename(String)
     * @see ch.hilbri.assist.model.ModelPackage#getFeatureRequirement_Featurename()
     * @model default="" unique="false"
     * @generated
     */
    String getFeaturename();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.FeatureRequirement#getFeaturename <em>Featurename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Featurename</em>' attribute.
     * @see #getFeaturename()
     * @generated
     */
    void setFeaturename(String value);

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
     * @see ch.hilbri.assist.model.ModelPackage#getFeatureRequirement_HardwareLevel()
     * @model unique="false"
     * @generated
     */
    HardwareArchitectureLevelType getHardwareLevel();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.FeatureRequirement#getHardwareLevel <em>Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hardware Level</em>' attribute.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see #getHardwareLevel()
     * @generated
     */
    void setHardwareLevel(HardwareArchitectureLevelType value);

    /**
     * Returns the value of the '<em><b>Units</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Units</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Units</em>' attribute.
     * @see #setUnits(int)
     * @see ch.hilbri.assist.model.ModelPackage#getFeatureRequirement_Units()
     * @model default="-1" unique="false"
     * @generated
     */
    int getUnits();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.FeatureRequirement#getUnits <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Units</em>' attribute.
     * @see #getUnits()
     * @generated
     */
    void setUnits(int value);

    /**
     * Returns the value of the '<em><b>Shared</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shared</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shared</em>' attribute.
     * @see #setShared(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getFeatureRequirement_Shared()
     * @model default="false" unique="false"
     * @generated
     */
    boolean isShared();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.FeatureRequirement#isShared <em>Shared</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shared</em>' attribute.
     * @see #isShared()
     * @generated
     */
    void setShared(boolean value);

    /**
     * Returns the value of the '<em><b>Is Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Exclusive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Exclusive</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getFeatureRequirement_IsExclusive()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean _isShared = this.isShared();\nreturn (!_isShared);'"
     * @generated
     */
    boolean isIsExclusive();

} // FeatureRequirement
