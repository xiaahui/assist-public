/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.Pin;

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
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Result#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Result#getEvaluation <em>Evaluation</em>}</li>
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
	 * @model unique="false" dataType="ch.hilbri.assist.datamodel.result.mapping.EqInterfacePinMapType"
	 * @generated
	 */
	HashMap<EqInterface, Pin> getMapping();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Result#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(HashMap<EqInterface, Pin> value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.AssistModel%> _model = this.getModel();\n<%ch.hilbri.assist.datamodel.model.InterfacesBlock%> _interfacesBlock = _model.getInterfacesBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _eqInterfaces = _interfacesBlock.getEqInterfaces();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t{\n\t\t<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>> _mapping = <%this%>.getMapping();\n\t\t<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _keySet = _mapping.keySet();\n\t\tboolean _contains = _keySet.contains(it);\n\t\treturn <%java.lang.Boolean%>.valueOf((!_contains));\n\t}\n};\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>filter(_eqInterfaces, _function);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>>toEList(_filter);'"
	 * @generated
	 */
	EList<EqInterface> getAllUnmappedEqInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _allUnmappedEqInterfaces = this.getAllUnmappedEqInterfaces();\nint _length = ((<%java.lang.Object%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_allUnmappedEqInterfaces, <%java.lang.Object%>.class)).length;\nint _multiply = (_length * 100);\n<%ch.hilbri.assist.datamodel.model.AssistModel%> _model = this.getModel();\n<%ch.hilbri.assist.datamodel.model.InterfacesBlock%> _interfacesBlock = _model.getInterfacesBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _eqInterfaces = _interfacesBlock.getEqInterfaces();\nint _length_1 = ((<%java.lang.Object%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_eqInterfaces, <%java.lang.Object%>.class)).length;\nint _divide = (_multiply / _length_1);\nreturn (100 - _divide);'"
	 * @generated
	 */
	double getCompletenessAsPercentage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ifaceUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.Pin%> _xifexpression = null;\n<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>> _mapping = this.getMapping();\n<%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _keySet = _mapping.keySet();\nboolean _contains = _keySet.contains(iface);\nif (_contains)\n{\n\t<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>> _mapping_1 = this.getMapping();\n\t_xifexpression = _mapping_1.get(iface);\n}\nelse\n{\n\t_xifexpression = null;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	Pin getPinForEqInterface(EqInterface iface);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.EqInterface%> _xblockexpression = null;\n{\n\t<%java.util.HashMap%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>> _mapping = this.getMapping();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>, <%java.lang.Boolean%>>()\n\t{\n\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> iface, final <%ch.hilbri.assist.datamodel.model.Pin%> pin)\n\t\t{\n\t\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(pin, p));\n\t\t}\n\t};\n\t<%java.util.Map%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>> _filter = <%org.eclipse.xtext.xbase.lib.MapExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%ch.hilbri.assist.datamodel.model.Pin%>>filter(_mapping, _function);\n\tfinal <%java.util.Set%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> ifaces = _filter.keySet();\n\t<%ch.hilbri.assist.datamodel.model.EqInterface%> _xifexpression = null;\n\tint _length = ((<%java.lang.Object%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(ifaces, <%java.lang.Object%>.class)).length;\n\tboolean _equals = (_length == 1);\n\tif (_equals)\n\t{\n\t\t_xifexpression = ((<%ch.hilbri.assist.datamodel.model.EqInterface%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(ifaces, <%ch.hilbri.assist.datamodel.model.EqInterface%>.class))[0];\n\t}\n\telse\n\t{\n\t\t_xifexpression = null;\n\t}\n\t_xblockexpression = _xifexpression;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EqInterface getEqInterfaceForPin(Pin p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" oUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.result.mapping.Evaluation%> _evaluation = this.getEvaluation();\ndouble _totalScaledScore = _evaluation.getTotalScaledScore();\n<%ch.hilbri.assist.datamodel.result.mapping.Evaluation%> _evaluation_1 = o.getEvaluation();\ndouble _totalScaledScore_1 = _evaluation_1.getTotalScaledScore();\nreturn <%java.lang.Double%>.compare(_totalScaledScore, _totalScaledScore_1);'"
	 * @generated
	 */
	int compareTo(Result o);

} // Result
