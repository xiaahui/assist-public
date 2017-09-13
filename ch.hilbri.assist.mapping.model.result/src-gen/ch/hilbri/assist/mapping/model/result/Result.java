/**
 */
package ch.hilbri.assist.mapping.model.result;

import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.HardwareElement;
import ch.hilbri.assist.mapping.model.Task;

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
	 * @see #setModel(AssistModel)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_Model()
	 * @model
	 * @generated
	 */
	AssistModel getModel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(AssistModel value);

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
	HashMap<Task, Core> getTask2CoreMap();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getTask2CoreMap <em>Task2 Core Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task2 Core Map</em>' attribute.
	 * @see #getTask2CoreMap()
	 * @generated
	 */
	void setTask2CoreMap(HashMap<Task, Core> value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%ch.hilbri.assist.mapping.model.Task%&gt; it)\n\t{\n\t\t&lt;%ch.hilbri.assist.mapping.model.Core%&gt; _get = &lt;%this%&gt;.getTask2CoreMap().get(it);\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_get, core));\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;&gt;toEList(&lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;&gt;filter(this.getTask2CoreMap().keySet(), _function));'"
	 * @generated
	 */
	EList<Task> getMappedTasksForCore(Core core);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coreUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.Integer%&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;&gt; taskList = this.getMappedTasksForCore(core);\n\t&lt;%java.lang.Integer%&gt; _xifexpression = null;\n\tboolean _isNullOrEmpty = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.isNullOrEmpty(taskList);\n\tboolean _not = (!_isNullOrEmpty);\n\tif (_not)\n\t{\n\t\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%java.lang.Integer%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%java.lang.Integer%&gt;&gt;()\n\t\t{\n\t\t\tpublic &lt;%java.lang.Integer%&gt; apply(final &lt;%ch.hilbri.assist.mapping.model.Task%&gt; it)\n\t\t\t{\n\t\t\t\treturn &lt;%java.lang.Integer%&gt;.valueOf(it.getCoreUtilization());\n\t\t\t}\n\t\t};\n\t\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function2%&gt;&lt;&lt;%java.lang.Integer%&gt;, &lt;%java.lang.Integer%&gt;, &lt;%java.lang.Integer%&gt;&gt; _function_1 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function2%&gt;&lt;&lt;%java.lang.Integer%&gt;, &lt;%java.lang.Integer%&gt;, &lt;%java.lang.Integer%&gt;&gt;()\n\t\t{\n\t\t\tpublic &lt;%java.lang.Integer%&gt; apply(final &lt;%java.lang.Integer%&gt; p1, final &lt;%java.lang.Integer%&gt; p2)\n\t\t\t{\n\t\t\t\treturn &lt;%java.lang.Integer%&gt;.valueOf(((p1).intValue() + (p2).intValue()));\n\t\t\t}\n\t\t};\n\t\t_xifexpression = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%java.lang.Integer%&gt;&gt;reduce(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%java.lang.Integer%&gt;&gt;map(taskList, _function), _function_1);\n\t}\n\telse\n\t{\n\t\t_xifexpression = &lt;%java.lang.Integer%&gt;.valueOf(0);\n\t}\n\t_xblockexpression = _xifexpression;\n}\nreturn (_xblockexpression).intValue();'"
	 * @generated
	 */
	int getAbsoluteCoreUtilization(Core core);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coreUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='double _xifexpression = (double) 0;\nint _capacity = core.getCapacity();\nboolean _greaterThan = (_capacity &gt; 0);\nif (_greaterThan)\n{\n\tint _absoluteCoreUtilization = this.getAbsoluteCoreUtilization(core);\n\t&lt;%java.lang.Double%&gt; _double = new &lt;%java.lang.Double%&gt;(_absoluteCoreUtilization);\n\tint _capacity_1 = core.getCapacity();\n\t&lt;%java.lang.Double%&gt; _double_1 = new &lt;%java.lang.Double%&gt;(_capacity_1);\n\t_xifexpression = &lt;%org.eclipse.xtext.xbase.lib.DoubleExtensions%&gt;.operator_divide(_double, _double_1);\n}\nelse\n{\n\t_xifexpression = (-1.0);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	double getRelativeCoreUtilization(Core core);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Return the hardware element of the level level that the task task is being mapped to
	 * <!-- end-model-doc -->
	 * @model unique="false" taskUnique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%ch.hilbri.assist.mapping.model.HardwareElement%&gt; _xifexpression = null;\nif ((level == 0))\n{\n\t_xifexpression = this.getTask2CoreMap().get(task);\n}\nelse\n{\n\t&lt;%ch.hilbri.assist.mapping.model.HardwareElement%&gt; _xifexpression_1 = null;\n\tif ((level == 1))\n\t{\n\t\t_xifexpression_1 = this.getTask2CoreMap().get(task).getProcessor();\n\t}\n\telse\n\t{\n\t\t&lt;%ch.hilbri.assist.mapping.model.HardwareElement%&gt; _xifexpression_2 = null;\n\t\tif ((level == 2))\n\t\t{\n\t\t\t_xifexpression_2 = this.getTask2CoreMap().get(task).getProcessor().getBoard();\n\t\t}\n\t\telse\n\t\t{\n\t\t\t&lt;%ch.hilbri.assist.mapping.model.HardwareElement%&gt; _xifexpression_3 = null;\n\t\t\tif ((level == 3))\n\t\t\t{\n\t\t\t\t_xifexpression_3 = this.getTask2CoreMap().get(task).getProcessor().getBoard().getBox();\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\t&lt;%ch.hilbri.assist.mapping.model.Compartment%&gt; _xifexpression_4 = null;\n\t\t\t\tif ((level == 4))\n\t\t\t\t{\n\t\t\t\t\t_xifexpression_4 = this.getTask2CoreMap().get(task).getProcessor().getBoard().getBox().getCompartment();\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\t_xifexpression_4 = null;\n\t\t\t\t}\n\t\t\t\t_xifexpression_3 = _xifexpression_4;\n\t\t\t}\n\t\t\t_xifexpression_2 = _xifexpression_3;\n\t\t}\n\t\t_xifexpression_1 = _xifexpression_2;\n\t}\n\t_xifexpression = _xifexpression_1;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	HardwareElement getHardwareElementForTask(Task task, int level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  This creates the list of mapping elements; each elements contains all hardware / software elements
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%java.util.Map.Entry%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;, &lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%java.util.Map.Entry%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;, &lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt;&gt;()\n{\n\tpublic &lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt; apply(final &lt;%java.util.Map.Entry%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt; it)\n\t{\n\t\t&lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt; _xblockexpression = null;\n\t\t{\n\t\t\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer = it.getKey().eContainer();\n\t\t\tfinal &lt;%ch.hilbri.assist.mapping.model.Application%&gt; application = ((&lt;%ch.hilbri.assist.mapping.model.Application%&gt;) _eContainer);\n\t\t\tfinal &lt;%ch.hilbri.assist.mapping.model.Task%&gt; task = it.getKey();\n\t\t\tfinal &lt;%ch.hilbri.assist.mapping.model.Core%&gt; core = it.getValue();\n\t\t\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer_1 = it.getValue().eContainer();\n\t\t\tfinal &lt;%ch.hilbri.assist.mapping.model.Processor%&gt; processor = ((&lt;%ch.hilbri.assist.mapping.model.Processor%&gt;) _eContainer_1);\n\t\t\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer_2 = it.getValue().eContainer().eContainer();\n\t\t\tfinal &lt;%ch.hilbri.assist.mapping.model.Board%&gt; board = ((&lt;%ch.hilbri.assist.mapping.model.Board%&gt;) _eContainer_2);\n\t\t\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer_3 = it.getValue().eContainer().eContainer().eContainer();\n\t\t\tfinal &lt;%ch.hilbri.assist.mapping.model.Box%&gt; box = ((&lt;%ch.hilbri.assist.mapping.model.Box%&gt;) _eContainer_3);\n\t\t\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer_4 = it.getValue().eContainer().eContainer().eContainer().eContainer();\n\t\t\tfinal &lt;%ch.hilbri.assist.mapping.model.Compartment%&gt; compartment = ((&lt;%ch.hilbri.assist.mapping.model.Compartment%&gt;) _eContainer_4);\n\t\t\t&lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt; _createSingleMappingElement = &lt;%ch.hilbri.assist.mapping.model.result.ResultFactory%&gt;.eINSTANCE.createSingleMappingElement();\n\t\t\tfinal &lt;%org.eclipse.xtext.xbase.lib.Procedures.Procedure1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Procedures.Procedure1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt;&gt;()\n\t\t\t{\n\t\t\t\tpublic void apply(final &lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt; it)\n\t\t\t\t{\n\t\t\t\t\tit.setApplication(application);\n\t\t\t\t\tit.setTask(task);\n\t\t\t\t\tit.setCore(core);\n\t\t\t\t\tit.setProcessor(processor);\n\t\t\t\t\tit.setBoard(board);\n\t\t\t\t\tit.setBox(box);\n\t\t\t\t\tit.setCompartment(compartment);\n\t\t\t\t}\n\t\t\t};\n\t\t\t_xblockexpression = &lt;%org.eclipse.xtext.xbase.lib.ObjectExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt;&gt;operator_doubleArrow(_createSingleMappingElement, _function);\n\t\t}\n\t\treturn _xblockexpression;\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt;&gt;toEList(&lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%java.util.Map.Entry%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Task%&gt;, &lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;, &lt;%ch.hilbri.assist.mapping.model.result.SingleMappingElement%&gt;&gt;map(this.getTask2CoreMap().entrySet(), _function));'"
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

} // Result
