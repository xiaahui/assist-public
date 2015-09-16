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
	 * @model containment="true" required="true"
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
	 * @model containment="true" required="true"
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
	 * @model containment="true" required="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.CompartmentsBlock%> _compartmentsBlock = this.getCompartmentsBlock();\nreturn _compartmentsBlock.getCompartments();'"
	 * @generated
	 */
	EList<Compartment> getAllCompartments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Compartment%>> _allCompartments = this.getAllCompartments();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> apply(final <%ch.hilbri.assist.datamodel.model.Compartment%> it)\n\t{\n\t\treturn it.getRdcs();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>>map(_allCompartments, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.RDC%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.RDC%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.RDC%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<RDC> getAllRDCs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _allRDCs = this.getAllRDCs();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> apply(final <%ch.hilbri.assist.datamodel.model.RDC%> it)\n\t{\n\t\treturn it.getConnectors();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>>map(_allRDCs, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Connector%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Connector%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.Connector%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Connector> getAllConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((level == 0))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _allConnectors = this.getAllConnectors();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.Connector%> it)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_allConnectors, _function);\n}\nelse\n{\n\tif ((level == 1))\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _allRDCs = this.getAllRDCs();\n\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t\t{\n\t\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.RDC%> it)\n\t\t\t{\n\t\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t\t}\n\t\t};\n\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_allRDCs, _function_1);\n\t}\n\telse\n\t{\n\t\tif ((level == 2))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Compartment%>> _allCompartments = this.getAllCompartments();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.Compartment%> it)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_allCompartments, _function_2);\n\t\t}\n\t\telse\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t}\n}'"
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
