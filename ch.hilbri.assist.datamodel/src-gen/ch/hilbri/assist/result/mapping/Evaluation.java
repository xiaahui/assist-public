/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.Evaluation#getTotalScore <em>Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Evaluation#getIndividualScores <em>Individual Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Evaluation#getMetricsUsed <em>Metrics Used</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Score</em>' attribute.
	 * @see #setTotalScore(double)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getEvaluation_TotalScore()
	 * @model unique="false"
	 * @generated
	 */
	double getTotalScore();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Evaluation#getTotalScore <em>Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Score</em>' attribute.
	 * @see #getTotalScore()
	 * @generated
	 */
	void setTotalScore(double value);

	/**
	 * Returns the value of the '<em><b>Individual Scores</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Scores</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Scores</em>' attribute list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getEvaluation_IndividualScores()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getIndividualScores();

	/**
	 * Returns the value of the '<em><b>Metrics Used</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.AbstractMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics Used</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Used</em>' containment reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getEvaluation_MetricsUsed()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMetric> getMetricsUsed();

} // Evaluation
