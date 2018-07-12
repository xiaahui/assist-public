/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract DSE Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.AbstractDSEMetric#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AbstractDSEMetric#isBuiltIn <em>Built In</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AbstractDSEMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getAbstractDSEMetric()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDSEMetric extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ch.hilbri.assist.model.ModelPackage#getAbstractDSEMetric_Name()
     * @model unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AbstractDSEMetric#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Built In</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Built In</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Built In</em>' attribute.
     * @see #setBuiltIn(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getAbstractDSEMetric_BuiltIn()
     * @model unique="false"
     * @generated
     */
    boolean isBuiltIn();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AbstractDSEMetric#isBuiltIn <em>Built In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Built In</em>' attribute.
     * @see #isBuiltIn()
     * @generated
     */
    void setBuiltIn(boolean value);

    /**
     * Returns the value of the '<em><b>Higher Score Is Better</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Higher Score Is Better</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Higher Score Is Better</em>' attribute.
     * @see #setHigherScoreIsBetter(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getAbstractDSEMetric_HigherScoreIsBetter()
     * @model unique="false"
     * @generated
     */
    boolean isHigherScoreIsBetter();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AbstractDSEMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Higher Score Is Better</em>' attribute.
     * @see #isHigherScoreIsBetter()
     * @generated
     */
    void setHigherScoreIsBetter(boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false" candidateModelUnique="false"
     * @generated
     */
    double computeAbsoluteScore(AssistModel candidateModel);

} // AbstractDSEMetric
