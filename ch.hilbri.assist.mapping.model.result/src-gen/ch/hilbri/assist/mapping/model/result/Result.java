/**
 */
package ch.hilbri.assist.mapping.model.result;

import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.Task;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getTotalScore <em>Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Result#getDetailedMappingResults <em>Detailed Mapping Results</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
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
	 * @see #setTask2CoreMap(Map)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_Task2CoreMap()
	 * @model unique="false" dataType="ch.hilbri.assist.mapping.model.result.Task2CoreMapType"
	 * @generated
	 */
	Map<Task, Core> getTask2CoreMap();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getTask2CoreMap <em>Task2 Core Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task2 Core Map</em>' attribute.
	 * @see #getTask2CoreMap()
	 * @generated
	 */
	void setTask2CoreMap(Map<Task, Core> value);

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
	 * Returns the value of the '<em><b>Total Score</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Score</em>' attribute.
	 * @see #setTotalScore(double)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_TotalScore()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getTotalScore();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Result#getTotalScore <em>Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Score</em>' attribute.
	 * @see #getTotalScore()
	 * @generated
	 */
	void setTotalScore(double value);

	/**
	 * Returns the value of the '<em><b>Detailed Mapping Results</b></em>' attribute list.
	 * The list contents are of type {@link java.util.List}&lt;java.lang.String>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns a list of the mappings; each entry is a list of names for the mapped elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Mapping Results</em>' attribute list.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getResult_DetailedMappingResults()
	 * @model unique="false" dataType="ch.hilbri.assist.mapping.model.result.StringList" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.util.Map%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>> _task2CoreMap = this.getTask2CoreMap();\n<%java.util.Set%><<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>> _entrySet = _task2CoreMap.entrySet();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>, <%java.util.List%><<%java.lang.String%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>, <%java.util.List%><<%java.lang.String%>>>()\n{\n\tpublic <%java.util.List%><<%java.lang.String%>> apply(final <%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>> it)\n\t{\n\t\t<%ch.hilbri.assist.mapping.model.Task%> _key = it.getKey();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer = _key.eContainer();\n\t\t<%java.lang.String%> _name = ((<%ch.hilbri.assist.mapping.model.Application%>) _eContainer).getName();\n\t\t<%ch.hilbri.assist.mapping.model.Task%> _key_1 = it.getKey();\n\t\t<%java.lang.String%> _name_1 = _key_1.getName();\n\t\t<%ch.hilbri.assist.mapping.model.Core%> _value = it.getValue();\n\t\t<%java.lang.String%> _name_2 = _value.getName();\n\t\t<%ch.hilbri.assist.mapping.model.Core%> _value_1 = it.getValue();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_1 = _value_1.eContainer();\n\t\t<%java.lang.String%> _name_3 = ((<%ch.hilbri.assist.mapping.model.Processor%>) _eContainer_1).getName();\n\t\t<%ch.hilbri.assist.mapping.model.Core%> _value_2 = it.getValue();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_2 = _value_2.eContainer();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_3 = _eContainer_2.eContainer();\n\t\t<%java.lang.String%> _name_4 = ((<%ch.hilbri.assist.mapping.model.Board%>) _eContainer_3).getName();\n\t\t<%ch.hilbri.assist.mapping.model.Core%> _value_3 = it.getValue();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_4 = _value_3.eContainer();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_5 = _eContainer_4.eContainer();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_6 = _eContainer_5.eContainer();\n\t\t<%java.lang.String%> _name_5 = ((<%ch.hilbri.assist.mapping.model.Box%>) _eContainer_6).getName();\n\t\t<%ch.hilbri.assist.mapping.model.Core%> _value_4 = it.getValue();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_7 = _value_4.eContainer();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_8 = _eContainer_7.eContainer();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_9 = _eContainer_8.eContainer();\n\t\t<%org.eclipse.emf.ecore.EObject%> _eContainer_10 = _eContainer_9.eContainer();\n\t\t<%java.lang.String%> _name_6 = ((<%ch.hilbri.assist.mapping.model.Compartment%>) _eContainer_10).getName();\n\t\treturn java.util.Collections.<<%java.lang.String%>>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<<%java.lang.String%>>newArrayList(_name, _name_1, _name_2, _name_3, _name_4, _name_5, _name_6));\n\t}\n};\n<%java.lang.Iterable%><<%java.util.List%><<%java.lang.String%>>> _map = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.util.Map.Entry%><<%ch.hilbri.assist.mapping.model.Task%>, <%ch.hilbri.assist.mapping.model.Core%>>, <%java.util.List%><<%java.lang.String%>>>map(_entrySet, _function);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%java.util.List%><<%java.lang.String%>>>toEList(_map);'"
	 * @generated
	 */
	EList<List<String>> getDetailedMappingResults();

} // Result
