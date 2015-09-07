/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.EqInterface;

import java.lang.Comparable;

import java.util.HashMap;

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
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Result#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Result#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Result#getMapping <em>Mapping</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Result#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Result#isPartialSolution <em>Partial Solution</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getResult()
 * @model superTypes="ch.hilbri.assist.datamodel.result.mapping.Comparable"
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getResult_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getName <em>Name</em>}' attribute.
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getResult_Model()
	 * @model
	 * @generated
	 */
	AssistModel getModel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(AssistModel value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see #setMapping(HashMap)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getResult_Mapping()
	 * @model unique="false" dataType="ch.hilbri.assist.datamodel.result.mapping.EqInterfaceConnectorMapType"
	 * @generated
	 */
	HashMap<EqInterface, Connector> getMapping();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(HashMap<EqInterface, Connector> value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference.
	 * @see #setEvaluation(Evaluation)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getResult_Evaluation()
	 * @model containment="true"
	 * @generated
	 */
	Evaluation getEvaluation();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getEvaluation <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' containment reference.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Evaluation value);

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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getResult_PartialSolution()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isPartialSolution();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#isPartialSolution <em>Partial Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Solution</em>' attribute.
	 * @see #isPartialSolution()
	 * @generated
	 */
	void setPartialSolution(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" oUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.result.mapping.Evaluation%> _evaluation = null;\nif (this!=null)\n{\n\t_evaluation=this.getEvaluation();\n}\ndouble _totalScaledScore = _evaluation.getTotalScaledScore();\n<%ch.hilbri.assist.datamodel.result.mapping.Evaluation%> _evaluation_1 = null;\nif (o!=null)\n{\n\t_evaluation_1=o.getEvaluation();\n}\ndouble _totalScaledScore_1 = _evaluation_1.getTotalScaledScore();\nfinal double diff = (_totalScaledScore - _totalScaledScore_1);\nif ((diff < 0.0))\n{\n\treturn 1;\n}\nif ((diff > 0.0))\n{\n\treturn (-1);\n}\nreturn 0;'"
	 * @generated
	 */
	int compareTo(Result o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" connectorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>();\n<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Connector%>> _mapping = this.getMapping();\n<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _keySet = _mapping.keySet();\nfor (final <%ch.hilbri.assist.datamodel.model.EqInterface%> iface : _keySet)\n{\n\t<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Connector%>> _mapping_1 = this.getMapping();\n\t<%ch.hilbri.assist.datamodel.model.Connector%> _get = _mapping_1.get(iface);\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_get, connector);\n\tif (_equals)\n\t{\n\t\tlist.add(iface);\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<EqInterface> getAllMappedEqInterfacesForConnector(Connector connector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.AssistModel%> _model = this.getModel();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _eqInterfaces = _model.getEqInterfaces();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t{\n\t\t<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Connector%>> _mapping = <%this%>.getMapping();\n\t\t<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _keySet = _mapping.keySet();\n\t\tboolean _contains = _keySet.contains(it);\n\t\treturn <%java.lang.Boolean%>.valueOf((!_contains));\n\t}\n};\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(_eqInterfaces, _function);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toEList(_filter);'"
	 * @generated
	 */
	EList<EqInterface> getAllUnmappedEqInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _allUnmappedEqInterfaces = this.getAllUnmappedEqInterfaces();\nint _length = ((<%java.lang.Object%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_allUnmappedEqInterfaces, <%java.lang.Object%>.class)).length;\nint _multiply = (_length * 100);\n<%ch.hilbri.assist.datamodel.model.AssistModel%> _model = this.getModel();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _eqInterfaces = _model.getEqInterfaces();\nint _length_1 = ((<%java.lang.Object%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_eqInterfaces, <%java.lang.Object%>.class)).length;\nint _divide = (_multiply / _length_1);\nreturn (100 - _divide);'"
	 * @generated
	 */
	double getCompletenessAsPercentage();

} // Result
