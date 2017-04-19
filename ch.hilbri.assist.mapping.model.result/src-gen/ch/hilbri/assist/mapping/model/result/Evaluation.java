/**
 */
package ch.hilbri.assist.mapping.model.result;

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
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Evaluation#getScaledScores <em>Scaled Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Evaluation#getTotalScaledScore <em>Total Scaled Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Evaluation#getMetricsUsed <em>Metrics Used</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getEvaluation()
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
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getEvaluation_AbsoluteScores()
	 * @model unique="false" dataType="ch.hilbri.assist.mapping.model.result.MetricScoreMap"
	 * @generated
	 */
	HashMap<AbstractMetric, Double> getAbsoluteScores();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}' attribute.
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
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getEvaluation_ScaledScores()
	 * @model unique="false" dataType="ch.hilbri.assist.mapping.model.result.MetricScoreMap"
	 * @generated
	 */
	HashMap<AbstractMetric, Double> getScaledScores();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Evaluation#getScaledScores <em>Scaled Scores</em>}' attribute.
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
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getEvaluation_TotalScaledScore()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.Double%> _xifexpression = null;\nif ((<%com.google.common.base.Objects%>.equal(this.getScaledScores(), null) || (this.getScaledScores().keySet().size() == 0)))\n{\n\treturn 0.0;\n}\nelse\n{\n\t<%java.util.HashMap%><<%ch.hilbri.assist.mapping.model.result.AbstractMetric%>, <%java.lang.Double%>> _scaledScores = this.getScaledScores();\n\t<%java.util.Collection%><<%java.lang.Double%>> _values = _scaledScores.values();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>>()\n\t{\n\t\tpublic <%java.lang.Double%> apply(final <%java.lang.Double%> i1, final <%java.lang.Double%> i2)\n\t\t{\n\t\t\treturn <%java.lang.Double%>.valueOf(<%org.eclipse.xtext.xbase.lib.DoubleExtensions%>.operator_plus(i1, i2));\n\t\t}\n\t};\n\t_xifexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Double%>>reduce(_values, _function);\n}\nreturn (_xifexpression).doubleValue();'"
	 * @generated
	 */
	double getTotalScaledScore();

	/**
	 * Returns the value of the '<em><b>Metrics Used</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.result.AbstractMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics Used</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Used</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getEvaluation_MetricsUsed()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMetric> getMetricsUsed();

} // Evaluation
