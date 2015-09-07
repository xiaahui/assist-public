/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getCableWeightData <em>Cable Weight Data</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getProtectionLevelData <em>Protection Level Data</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getCompatibleIoTypes <em>Compatible Io Types</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getEqInterfaces <em>Eq Interfaces</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getEqInterfaceGroups <em>Eq Interface Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getValidDeployments <em>Valid Deployments</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getInvalidDeployments <em>Invalid Deployments</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel()
 * @model
 * @generated
 */
public interface AssistModel extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_SystemName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Cable Weight Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cable Weight Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cable Weight Data</em>' containment reference.
	 * @see #setCableWeightData(CableWeightData)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_CableWeightData()
	 * @model containment="true"
	 * @generated
	 */
	CableWeightData getCableWeightData();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getCableWeightData <em>Cable Weight Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cable Weight Data</em>' containment reference.
	 * @see #getCableWeightData()
	 * @generated
	 */
	void setCableWeightData(CableWeightData value);

	/**
	 * Returns the value of the '<em><b>Protection Level Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level Data</em>' containment reference.
	 * @see #setProtectionLevelData(ProtectionLevelData)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_ProtectionLevelData()
	 * @model containment="true"
	 * @generated
	 */
	ProtectionLevelData getProtectionLevelData();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getProtectionLevelData <em>Protection Level Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Level Data</em>' containment reference.
	 * @see #getProtectionLevelData()
	 * @generated
	 */
	void setProtectionLevelData(ProtectionLevelData value);

	/**
	 * Returns the value of the '<em><b>Compatible Io Types</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Io Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Io Types</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_CompatibleIoTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompatibleIoTypeEntry> getCompatibleIoTypes();

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.Compartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_Compartments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Compartment> getCompartments();

	/**
	 * Returns the value of the '<em><b>Eq Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interfaces</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_EqInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<EqInterface> getEqInterfaces();

	/**
	 * Returns the value of the '<em><b>Eq Interface Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Groups</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_EqInterfaceGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<EqInterfaceGroup> getEqInterfaceGroups();

	/**
	 * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_DislocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DislocalityRelation> getDislocalityRelations();

	/**
	 * Returns the value of the '<em><b>Colocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ColocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_ColocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColocalityRelation> getColocalityRelations();

	/**
	 * Returns the value of the '<em><b>Valid Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ValidDeployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Deployments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Deployments</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_ValidDeployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidDeployment> getValidDeployments();

	/**
	 * Returns the value of the '<em><b>Invalid Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.InvalidDeployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Deployments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Deployments</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_InvalidDeployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvalidDeployment> getInvalidDeployments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getCompartments();'"
	 * @generated
	 */
	EList<Compartment> getAllCompartments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.RDC%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.RDC%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Compartment%>> _compartments = this.getCompartments();\nfor (final <%ch.hilbri.assist.datamodel.model.Compartment%> c : _compartments)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _rdcs = c.getRdcs();\n\tlist.addAll(_rdcs);\n}\nreturn list;'"
	 * @generated
	 */
	EList<RDC> getAllRDCs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Connector%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.model.Connector%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _allRDCs = this.getAllRDCs();\nfor (final <%ch.hilbri.assist.datamodel.model.RDC%> r : _allRDCs)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _connectors = r.getConnectors();\n\tlist.addAll(_connectors);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Connector> getAllConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((level == 0))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _allConnectors = this.getAllConnectors();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.Connector%> it)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_allConnectors, _function);\n}\nelse\n{\n\tif ((level == 1))\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _allRDCs = this.getAllRDCs();\n\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t\t{\n\t\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.RDC%> it)\n\t\t\t{\n\t\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t\t}\n\t\t};\n\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_allRDCs, _function_1);\n\t}\n\telse\n\t{\n\t\tif ((level == 2))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Compartment%>> _compartments = this.getCompartments();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.Compartment%> it)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_compartments, _function_2);\n\t\t}\n\t\telse\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	EList<HardwareElement> getAllHardwareElements(int level);

} // AssistModel
