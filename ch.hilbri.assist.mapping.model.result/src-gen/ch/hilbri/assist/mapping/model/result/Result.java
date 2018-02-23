/**
 */
package ch.hilbri.assist.mapping.model.result;

import java.lang.Comparable;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getIndex <em>Index</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getTask2CoreMap <em>Task2 Core Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getMetricAbsoluteScoresMap <em>Metric Absolute Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getMetricScaledScoresMap <em>Metric Scaled Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getAbsoluteTotalScore <em>Absolute Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getScaledTotalScore <em>Scaled Total Score</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult()
 * @model superTypes="ch.hilbri.assist.mapping.model.result.Comparable"
 * @generated
 */
public interface Result extends EObject, Comparable<Result> {
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
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_Index()
	 * @model unique="false"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Object)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_Model()
	 * @model type="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	Object getModel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Object value);

	/**
	 * Returns the value of the '<em><b>Task2 Core Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task2 Core Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task2 Core Map</em>' attribute.
	 * @see #setTask2CoreMap(HashMap)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_Task2CoreMap()
	 * @model unique="false" dataType="ch.hilbri.assist.mapping.model.result.Task2CoreMapType"
	 * @generated
	 */
	HashMap<Object, Object> getTask2CoreMap();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getTask2CoreMap <em>Task2 Core Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task2 Core Map</em>' attribute.
	 * @see #getTask2CoreMap()
	 * @generated
	 */
	void setTask2CoreMap(HashMap<Object, Object> value);

	/**
	 * Returns the value of the '<em><b>Metric Absolute Scores Map</b></em>' map.
	 * The key is of type {@link ch.hilbri.assist.mapping.model.result.AbstractMetric},
	 * and the value is of type {@link java.lang.Double},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Absolute Scores Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Absolute Scores Map</em>' map.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_MetricAbsoluteScoresMap()
	 * @model mapType="ch.hilbri.assist.mapping.model.result.MetricScorePair&lt;ch.hilbri.assist.mapping.model.result.AbstractMetric, org.eclipse.emf.ecore.EDoubleObject&gt;"
	 * @generated
	 */
	EMap<AbstractMetric, Double> getMetricAbsoluteScoresMap();

	/**
	 * Returns the value of the '<em><b>Metric Scaled Scores Map</b></em>' map.
	 * The key is of type {@link ch.hilbri.assist.mapping.model.result.AbstractMetric},
	 * and the value is of type {@link java.lang.Double},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Scaled Scores Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Scaled Scores Map</em>' map.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_MetricScaledScoresMap()
	 * @model mapType="ch.hilbri.assist.mapping.model.result.MetricScorePair&lt;ch.hilbri.assist.mapping.model.result.AbstractMetric, org.eclipse.emf.ecore.EDoubleObject&gt;"
	 * @generated
	 */
	EMap<AbstractMetric, Double> getMetricScaledScoresMap();

	/**
	 * Returns the value of the '<em><b>Partial Solution</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Solution</em>' attribute.
	 * @see #setPartialSolution(boolean)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_PartialSolution()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isPartialSolution();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#isPartialSolution <em>Partial Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Solution</em>' attribute.
	 * @see #isPartialSolution()
	 * @generated
	 */
	void setPartialSolution(boolean value);

	/**
	 * Returns the value of the '<em><b>Absolute Total Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Total Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Total Score</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_AbsoluteTotalScore()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.Double%&gt; _xifexpression = null;\nboolean _isEmpty = this.getMetricAbsoluteScoresMap().keySet().isEmpty();\nif (_isEmpty)\n{\n\t_xifexpression = &lt;%java.lang.Double%&gt;.valueOf(0.0);\n}\nelse\n{\n\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function2%&gt;&lt;&lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function2%&gt;&lt;&lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;&gt;()\n\t{\n\t\tpublic &lt;%java.lang.Double%&gt; apply(final &lt;%java.lang.Double%&gt; p1, final &lt;%java.lang.Double%&gt; p2)\n\t\t{\n\t\t\treturn &lt;%java.lang.Double%&gt;.valueOf(&lt;%org.eclipse.xtext.xbase.lib.DoubleExtensions%&gt;.operator_plus(p1, p2));\n\t\t}\n\t};\n\t_xifexpression = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%java.lang.Double%&gt;&gt;reduce(this.getMetricAbsoluteScoresMap().values(), _function);\n}\nreturn (_xifexpression).doubleValue();'"
	 * @generated
	 */
	double getAbsoluteTotalScore();

	/**
	 * Returns the value of the '<em><b>Scaled Total Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaled Total Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaled Total Score</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_ScaledTotalScore()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.Double%&gt; _xifexpression = null;\nboolean _isEmpty = this.getMetricScaledScoresMap().keySet().isEmpty();\nif (_isEmpty)\n{\n\t_xifexpression = &lt;%java.lang.Double%&gt;.valueOf(0.0);\n}\nelse\n{\n\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function2%&gt;&lt;&lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function2%&gt;&lt;&lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;, &lt;%java.lang.Double%&gt;&gt;()\n\t{\n\t\tpublic &lt;%java.lang.Double%&gt; apply(final &lt;%java.lang.Double%&gt; p1, final &lt;%java.lang.Double%&gt; p2)\n\t\t{\n\t\t\treturn &lt;%java.lang.Double%&gt;.valueOf(&lt;%org.eclipse.xtext.xbase.lib.DoubleExtensions%&gt;.operator_plus(p1, p2));\n\t\t}\n\t};\n\t_xifexpression = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%java.lang.Double%&gt;&gt;reduce(this.getMetricScaledScoresMap().values(), _function);\n}\nreturn (_xifexpression).doubleValue();'"
	 * @generated
	 */
	double getScaledTotalScore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coreUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%java.lang.Object%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%java.lang.Object%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%java.lang.Object%&gt; it)\n\t{\n\t\t&lt;%java.lang.Object%&gt; _get = &lt;%this%&gt;.getTask2CoreMap().get(it);\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_get, core));\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%java.lang.Object%&gt;&gt;toEList(&lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%java.lang.Object%&gt;&gt;filter(this.getTask2CoreMap().keySet(), _function));'"
	 * @generated
	 */
	EList<Object> getMappedTasksForCore(Object core);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coreUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new &lt;%java.lang.Error%&gt;(\"Unresolved compilation problems: The method or field coreUtilization is undefined for the type Object\");'"
	 * @generated
	 */
	int getAbsoluteCoreUtilization(Object core);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coreUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new &lt;%java.lang.Error%&gt;(\"Unresolved compilation problems: The method or field capacity is undefined for the type Object\");'"
	 * @generated
	 */
	double getRelativeCoreUtilization(Object core);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Return the hardware element of the level level that the task task is being mapped to
	 * <!-- end-model-doc -->
	 * @model unique="false" taskUnique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new &lt;%java.lang.Error%&gt;(\"Unresolved compilation problems: The method or field processor is undefined for the type Object\");'"
	 * @generated
	 */
	Object getHardwareElementForTask(Object task, int level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  This creates the list of mapping elements; each elements contains all hardware / software elements
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new &lt;%java.lang.Error%&gt;(\"Unresolved compilation problems: Application cannot be resolved to a type.\");'"
	 * @generated
	 */
	EList<SingleMappingElement> getMappingElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" oUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%java.lang.Double%&gt;.compare(o.getScaledTotalScore(), this.getScaledTotalScore());'"
	 * @generated
	 */
	int compareTo(Result o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new &lt;%java.lang.Error%&gt;(\"Unresolved compilation problems: The method or field allTasks is undefined for the type Object\");'"
	 * @generated
	 */
	String toString();

} // Result
