/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import java.util.HashMap;

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
 *   <li>{@link ch.hilbri.assist.result.mapping.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Evaluation#getScaledScores <em>Scaled Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Evaluation#getTotalScaledScore <em>Total Scaled Score</em>}</li>
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
	 * Returns the value of the '<em><b>Absolute Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Scores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Scores</em>' attribute.
	 * @see #setAbsoluteScores(HashMap)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getEvaluation_AbsoluteScores()
	 * @model unique="false" dataType="ch.hilbri.assist.result.mapping.MetricScoreMap"
	 * @generated
	 */
	HashMap<AbstractMetric, Double> getAbsoluteScores();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Scores</em>' attribute.
	 * @see #getAbsoluteScores()
	 * @generated
	 */
	void setAbsoluteScores(HashMap<AbstractMetric, Double> value);

	/**
	 * Returns the value of the '<em><b>Scaled Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaled Scores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaled Scores</em>' attribute.
	 * @see #setScaledScores(HashMap)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getEvaluation_ScaledScores()
	 * @model unique="false" dataType="ch.hilbri.assist.result.mapping.MetricScoreMap"
	 * @generated
	 */
	HashMap<AbstractMetric, Double> getScaledScores();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Evaluation#getScaledScores <em>Scaled Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaled Scores</em>' attribute.
	 * @see #getScaledScores()
	 * @generated
	 */
	void setScaledScores(HashMap<AbstractMetric, Double> value);

	/**
	 * Returns the value of the '<em><b>Total Scaled Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Scaled Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Scaled Score</em>' attribute.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getEvaluation_TotalScaledScore()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.util.HashMap%><<%ch.hilbri.assist.result.mapping.AbstractMetric%>, <%java.lang.Double%>> _scaledScores = this.getScaledScores();\n<%java.util.Collection%><<%java.lang.Double%>> _values = _scaledScores.values();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>>()\n{\n\tpublic <%java.lang.Double%> apply(final <%java.lang.Double%> i1, final <%java.lang.Double%> i2)\n\t{\n\t\treturn <%java.lang.Double%>.valueOf(<%org.eclipse.xtext.xbase.lib.DoubleExtensions%>.operator_plus(i1, i2));\n\t}\n};\nreturn (double) <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Double%>>reduce(_values, _function);'"
	 * @generated
	 */
	double getTotalScaledScore();

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
