/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.AbstractMetric#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.AbstractMetric#getWeight <em>Weight</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.AbstractMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.AbstractMetric#isBuiltIn <em>Built In</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getAbstractMetric()
 * @model
 * @generated
 */
public interface AbstractMetric extends EObject {
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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getAbstractMetric_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.AbstractMetric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getAbstractMetric_Weight()
	 * @model unique="false"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.AbstractMetric#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getAbstractMetric_HigherScoreIsBetter()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHigherScoreIsBetter();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.AbstractMetric#isHigherScoreIsBetter <em>Higher Score Is Better</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher Score Is Better</em>' attribute.
	 * @see #isHigherScoreIsBetter()
	 * @generated
	 */
	void setHigherScoreIsBetter(boolean value);

	/**
	 * Returns the value of the '<em><b>Built In</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In</em>' attribute.
	 * @see #setBuiltIn(boolean)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getAbstractMetric_BuiltIn()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isBuiltIn();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.AbstractMetric#isBuiltIn <em>Built In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In</em>' attribute.
	 * @see #isBuiltIn()
	 * @generated
	 */
	void setBuiltIn(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" resultUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return 0;'"
	 * @generated
	 */
	double computeAbsoluteScore(Result result);

} // AbstractMetric
