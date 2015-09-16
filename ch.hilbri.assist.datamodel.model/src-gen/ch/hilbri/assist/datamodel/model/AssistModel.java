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
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getGlobalBlock <em>Global Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getCompartmentsBlock <em>Compartments Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getInterfacesBlock <em>Interfaces Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getInterfaceGroupsBlock <em>Interface Groups Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.AssistModel#getRestrictionsBlock <em>Restrictions Block</em>}</li>
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
	 * Returns the value of the '<em><b>Global Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Block</em>' containment reference.
	 * @see #setGlobalBlock(GlobalBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_GlobalBlock()
	 * @model containment="true"
	 * @generated
	 */
	GlobalBlock getGlobalBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getGlobalBlock <em>Global Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Block</em>' containment reference.
	 * @see #getGlobalBlock()
	 * @generated
	 */
	void setGlobalBlock(GlobalBlock value);

	/**
	 * Returns the value of the '<em><b>Compartments Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments Block</em>' containment reference.
	 * @see #setCompartmentsBlock(CompartmentsBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_CompartmentsBlock()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentsBlock getCompartmentsBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getCompartmentsBlock <em>Compartments Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartments Block</em>' containment reference.
	 * @see #getCompartmentsBlock()
	 * @generated
	 */
	void setCompartmentsBlock(CompartmentsBlock value);

	/**
	 * Returns the value of the '<em><b>Interfaces Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces Block</em>' containment reference.
	 * @see #setInterfacesBlock(InterfacesBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_InterfacesBlock()
	 * @model containment="true"
	 * @generated
	 */
	InterfacesBlock getInterfacesBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getInterfacesBlock <em>Interfaces Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces Block</em>' containment reference.
	 * @see #getInterfacesBlock()
	 * @generated
	 */
	void setInterfacesBlock(InterfacesBlock value);

	/**
	 * Returns the value of the '<em><b>Interface Groups Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Groups Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Groups Block</em>' containment reference.
	 * @see #setInterfaceGroupsBlock(InterfaceGroupsBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_InterfaceGroupsBlock()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceGroupsBlock getInterfaceGroupsBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getInterfaceGroupsBlock <em>Interface Groups Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Groups Block</em>' containment reference.
	 * @see #getInterfaceGroupsBlock()
	 * @generated
	 */
	void setInterfaceGroupsBlock(InterfaceGroupsBlock value);

	/**
	 * Returns the value of the '<em><b>Restrictions Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions Block</em>' containment reference.
	 * @see #setRestrictionsBlock(RestrictionsBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getAssistModel_RestrictionsBlock()
	 * @model containment="true"
	 * @generated
	 */
	RestrictionsBlock getRestrictionsBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.AssistModel#getRestrictionsBlock <em>Restrictions Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrictions Block</em>' containment reference.
	 * @see #getRestrictionsBlock()
	 * @generated
	 */
	void setRestrictionsBlock(RestrictionsBlock value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\nreturn _globalBlock.getSystemName();'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\n<%ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock%> _compatibleIoTypesBlock = _globalBlock.getCompatibleIoTypesBlock();\nreturn _compatibleIoTypesBlock.getCompatibleIoTypes();'"
	 * @generated
	 */
	EList<CompatibleIoTypeEntry> getCompatibleIoTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\n<%ch.hilbri.assist.datamodel.model.CableWeightDataBlock%> _cableWeightDataBlock = _globalBlock.getCableWeightDataBlock();\nreturn _cableWeightDataBlock.getCableWeightEntries();'"
	 * @generated
	 */
	EList<CableWeightEntry> getCableWeightData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\n<%ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock%> _protectionLevelDataBlock = _globalBlock.getProtectionLevelDataBlock();\nreturn _protectionLevelDataBlock.getProtectionLevelEntries();'"
	 * @generated
	 */
	EList<ProtectionLevelEntry> getProtectionLevelData();

} // AssistModel
