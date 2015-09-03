/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

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
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getScaledScores <em>Scaled Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getTotalScaledScore <em>Total Scaled Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getMetricsUsed <em>Metrics Used</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getEvaluation()
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getEvaluation_AbsoluteScores()
	 * @model unique="false" dataType="ch.hilbri.assist.datamodel.result.mapping.MetricScoreMap"
	 * @generated
	 */
	HashMap<AbstractMetric, Double> getAbsoluteScores();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getAbsoluteScores <em>Absolute Scores</em>}' attribute.
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getEvaluation_ScaledScores()
	 * @model unique="false" dataType="ch.hilbri.assist.datamodel.result.mapping.MetricScoreMap"
	 * @generated
	 */
	HashMap<AbstractMetric, Double> getScaledScores();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Evaluation#getScaledScores <em>Scaled Scores</em>}' attribute.
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getEvaluation_TotalScaledScore()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.Double%> _xifexpression = null;\nboolean _or = false;\n<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.result.mapping.AbstractMetric%>, <%java.lang.Double%>> _scaledScores = this.getScaledScores();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_scaledScores, null);\nif (_equals)\n{\n\t_or = true;\n} else\n{\n\t<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.result.mapping.AbstractMetric%>, <%java.lang.Double%>> _scaledScores_1 = this.getScaledScores();\n\t<%java.util.Set%><<%ch.hilbri.assist.datamodel.result.mapping.AbstractMetric%>> _keySet = _scaledScores_1.keySet();\n\tint _size = _keySet.size();\n\tboolean _equals_1 = (_size == 0);\n\t_or = _equals_1;\n}\nif (_or)\n{\n\treturn 0.0;\n}\nelse\n{\n\t<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.result.mapping.AbstractMetric%>, <%java.lang.Double%>> _scaledScores_2 = this.getScaledScores();\n\t<%java.util.Collection%><<%java.lang.Double%>> _values = _scaledScores_2.values();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>>()\n\t{\n\t\tpublic <%java.lang.Double%> apply(final <%java.lang.Double%> i1, final <%java.lang.Double%> i2)\n\t\t{\n\t\t\treturn <%java.lang.Double%>.valueOf(<%org.eclipse.xtext.xbase.lib.DoubleExtensions%>.operator_plus(i1, i2));\n\t\t}\n\t};\n\t_xifexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Double%>>reduce(_values, _function);\n}\nreturn (_xifexpression).doubleValue();'"
	 * @generated
	 */
	double getTotalScaledScore();

	/**
	 * Returns the value of the '<em><b>Metrics Used</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.result.mapping.AbstractMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics Used</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Used</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getEvaluation_MetricsUsed()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMetric> getMetricsUsed();

} // Evaluation
