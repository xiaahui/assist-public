/**
 */
package ch.hilbri.assist.mapping.model.result;

import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Core;
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
	 * @model mapType="ch.hilbri.assist.mapping.model.result.MetricScorePair<ch.hilbri.assist.mapping.model.result.AbstractMetric, org.eclipse.emf.ecore.EDoubleObject>"
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
	 * @model mapType="ch.hilbri.assist.mapping.model.result.MetricScorePair<ch.hilbri.assist.mapping.model.result.AbstractMetric, org.eclipse.emf.ecore.EDoubleObject>"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.Double%> _xifexpression = null;\n<%org.eclipse.emf.common.util.EMap%><<%ch.hilbri.assist.mapping.model.result.AbstractMetric%>, <%java.lang.Double%>> _metricAbsoluteScoresMap = this.getMetricAbsoluteScoresMap();\n<%java.util.Set%><<%ch.hilbri.assist.mapping.model.result.AbstractMetric%>> _keySet = _metricAbsoluteScoresMap.keySet();\nboolean _isEmpty = _keySet.isEmpty();\nif (_isEmpty)\n{\n\t_xifexpression = <%java.lang.Double%>.valueOf(0.0);\n}\nelse\n{\n\t<%org.eclipse.emf.common.util.EMap%><<%ch.hilbri.assist.mapping.model.result.AbstractMetric%>, <%java.lang.Double%>> _metricAbsoluteScoresMap_1 = this.getMetricAbsoluteScoresMap();\n\t<%java.util.Collection%><<%java.lang.Double%>> _values = _metricAbsoluteScoresMap_1.values();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>>()\n\t{\n\t\tpublic <%java.lang.Double%> apply(final <%java.lang.Double%> p1, final <%java.lang.Double%> p2)\n\t\t{\n\t\t\treturn <%java.lang.Double%>.valueOf(<%org.eclipse.xtext.xbase.lib.DoubleExtensions%>.operator_plus(p1, p2));\n\t\t}\n\t};\n\t_xifexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Double%>>reduce(_values, _function);\n}\nreturn (_xifexpression).doubleValue();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.Double%> _xifexpression = null;\n<%org.eclipse.emf.common.util.EMap%><<%ch.hilbri.assist.mapping.model.result.AbstractMetric%>, <%java.lang.Double%>> _metricScaledScoresMap = this.getMetricScaledScoresMap();\n<%java.util.Set%><<%ch.hilbri.assist.mapping.model.result.AbstractMetric%>> _keySet = _metricScaledScoresMap.keySet();\nboolean _isEmpty = _keySet.isEmpty();\nif (_isEmpty)\n{\n\t_xifexpression = <%java.lang.Double%>.valueOf(0.0);\n}\nelse\n{\n\t<%org.eclipse.emf.common.util.EMap%><<%ch.hilbri.assist.mapping.model.result.AbstractMetric%>, <%java.lang.Double%>> _metricScaledScoresMap_1 = this.getMetricScaledScoresMap();\n\t<%java.util.Collection%><<%java.lang.Double%>> _values = _metricScaledScoresMap_1.values();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>>()\n\t{\n\t\tpublic <%java.lang.Double%> apply(final <%java.lang.Double%> p1, final <%java.lang.Double%> p2)\n\t\t{\n\t\t\treturn <%java.lang.Double%>.valueOf(<%org.eclipse.xtext.xbase.lib.DoubleExtensions%>.operator_plus(p1, p2));\n\t\t}\n\t};\n\t_xifexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Double%>>reduce(_values, _function);\n}\nreturn (_xifexpression).doubleValue();'"
	 * @generated
	 */
	double getScaledTotalScore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  This creates the list of mapping elements; each elements contains all hardware / software elements
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.HashMap%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>> _task2CoreMap = this.getTask2CoreMap();\n<%java.util.Set%><<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>> _entrySet = _task2CoreMap.entrySet();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>, <%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>, <%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>>()\n{\n\tpublic <%ch.hilbri.assist.mapping.model.result.SingleMappingElement%> apply(final <%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>> it)\n\t{\n\t\t<%ch.hilbri.assist.mapping.model.result.SingleMappingElement%> _xblockexpression = null;\n\t\t{\n\t\t\t<%ch.hilbri.assist.mapping.model.Task%> _key = it.getKey();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer = _key.eContainer();\n\t\t\tfinal <%ch.hilbri.assist.mapping.model.Application%> application = ((<%ch.hilbri.assist.mapping.model.Application%>) _eContainer);\n\t\t\tfinal <%ch.hilbri.assist.mapping.model.Task%> task = it.getKey();\n\t\t\tfinal <%ch.hilbri.assist.mapping.model.Core%> core = it.getValue();\n\t\t\t<%ch.hilbri.assist.mapping.model.Core%> _value = it.getValue();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_1 = _value.eContainer();\n\t\t\tfinal <%ch.hilbri.assist.mapping.model.Processor%> processor = ((<%ch.hilbri.assist.mapping.model.Processor%>) _eContainer_1);\n\t\t\t<%ch.hilbri.assist.mapping.model.Core%> _value_1 = it.getValue();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_2 = _value_1.eContainer();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_3 = _eContainer_2.eContainer();\n\t\t\tfinal <%ch.hilbri.assist.mapping.model.Board%> board = ((<%ch.hilbri.assist.mapping.model.Board%>) _eContainer_3);\n\t\t\t<%ch.hilbri.assist.mapping.model.Core%> _value_2 = it.getValue();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_4 = _value_2.eContainer();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_5 = _eContainer_4.eContainer();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_6 = _eContainer_5.eContainer();\n\t\t\tfinal <%ch.hilbri.assist.mapping.model.Box%> box = ((<%ch.hilbri.assist.mapping.model.Box%>) _eContainer_6);\n\t\t\t<%ch.hilbri.assist.mapping.model.Core%> _value_3 = it.getValue();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_7 = _value_3.eContainer();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_8 = _eContainer_7.eContainer();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_9 = _eContainer_8.eContainer();\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_10 = _eContainer_9.eContainer();\n\t\t\tfinal <%ch.hilbri.assist.mapping.model.Compartment%> compartment = ((<%ch.hilbri.assist.mapping.model.Compartment%>) _eContainer_10);\n\t\t\t<%ch.hilbri.assist.mapping.model.result.SingleMappingElement%> _createSingleMappingElement = <%ch.hilbri.assist.mapping.model.result.ResultFactory%>.eINSTANCE.createSingleMappingElement();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Procedures.Procedure1%><<%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Procedures.Procedure1%><<%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>>()\n\t\t\t{\n\t\t\t\tpublic void apply(final <%ch.hilbri.assist.mapping.model.result.SingleMappingElement%> it)\n\t\t\t\t{\n\t\t\t\t\tit.setApplication(application);\n\t\t\t\t\tit.setTask(task);\n\t\t\t\t\tit.setCore(core);\n\t\t\t\t\tit.setProcessor(processor);\n\t\t\t\t\tit.setBoard(board);\n\t\t\t\t\tit.setBox(box);\n\t\t\t\t\tit.setCompartment(compartment);\n\t\t\t\t}\n\t\t\t};\n\t\t\t_xblockexpression = <%org.eclipse.xtext.xbase.lib.ObjectExtensions%>.<<%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>>operator_doubleArrow(_createSingleMappingElement, _function);\n\t\t}\n\t\treturn _xblockexpression;\n\t}\n};\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>> _map = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>, <%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>>map(_entrySet, _function);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.result.SingleMappingElement%>>toEList(_map);'"
	 * @generated
	 */
	EList<SingleMappingElement> getMappingElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" oUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='double _scaledTotalScore = o.getScaledTotalScore();\ndouble _scaledTotalScore_1 = this.getScaledTotalScore();\nreturn <%java.lang.Double%>.compare(_scaledTotalScore, _scaledTotalScore_1);'"
	 * @generated
	 */
	int compareTo(Result o);

} // Result
