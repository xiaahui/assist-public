/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colocality Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ColocalityRelation#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ColocalityRelation#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getColocalityRelation()
 * @model
 * @generated
 */
public interface ColocalityRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Eq Interface Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getColocalityRelation_EqInterfaceOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<EqInterfaceOrGroup> getEqInterfaceOrGroups();

	/**
	 * Returns the value of the '<em><b>Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
	 * @see #setHardwareLevel(HardwareArchitectureLevelType)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getColocalityRelation_HardwareLevel()
	 * @model unique="false"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.ColocalityRelation#getHardwareLevel <em>Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
	 * @see #getHardwareLevel()
	 * @generated
	 */
	void setHardwareLevel(HardwareArchitectureLevelType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup%>> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();\nfor (final <%ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup%> e : _eqInterfaceOrGroups)\n{\n\tif ((e instanceof <%ch.hilbri.assist.datamodel.model.EqInterface%>))\n\t{\n\t\tlist.add(((<%ch.hilbri.assist.datamodel.model.EqInterface%>)e));\n\t}\n\telse\n\t{\n\t\tif ((e instanceof <%ch.hilbri.assist.datamodel.model.EqInterfaceGroup%>))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _eqInterfaces = ((<%ch.hilbri.assist.datamodel.model.EqInterfaceGroup%>)e).getEqInterfaces();\n\t\t\tlist.addAll(_eqInterfaces);\n\t\t}\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<EqInterface> getAllInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> result = \"\";\nboolean first = true;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup%>> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();\nfor (final <%ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup%> e : _eqInterfaceOrGroups)\n{\n\t{\n\t\tif ((!first))\n\t\t{\n\t\t\t<%java.lang.String%> _result = result;\n\t\t\tresult = (_result + \", \");\n\t\t}\n\t\telse\n\t\t{\n\t\t\tfirst = false;\n\t\t}\n\t\tif ((e instanceof <%ch.hilbri.assist.datamodel.model.EqInterface%>))\n\t\t{\n\t\t\t<%java.lang.String%> _result_1 = result;\n\t\t\t<%java.lang.String%> _name = ((<%ch.hilbri.assist.datamodel.model.EqInterface%>)e).getName();\n\t\t\tresult = (_result_1 + _name);\n\t\t}\n\t\tif ((e instanceof <%ch.hilbri.assist.datamodel.model.EqInterfaceGroup%>))\n\t\t{\n\t\t\t<%java.lang.String%> _result_2 = result;\n\t\t\t<%java.lang.String%> _name_1 = ((<%ch.hilbri.assist.datamodel.model.EqInterfaceGroup%>)e).getName();\n\t\t\tresult = (_result_2 + _name_1);\n\t\t}\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	String getAllEqInterfaceOrGroupNames();

} // ColocalityRelation
