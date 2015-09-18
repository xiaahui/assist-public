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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\nreturn _globalBlock.getSystemName();'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\n<%ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock%> _compatibleIoTypesBlock = _globalBlock.getCompatibleIoTypesBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>> _compatibleIoTypes = null;\nif (_compatibleIoTypesBlock!=null)\n{\n\t_compatibleIoTypes=_compatibleIoTypesBlock.getCompatibleIoTypes();\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>>toEList(_compatibleIoTypes);'"
	 * @generated
	 */
	EList<CompatibleIoTypeEntry> getCompatibleIoTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\n<%ch.hilbri.assist.datamodel.model.CableWeightDataBlock%> _cableWeightDataBlock = _globalBlock.getCableWeightDataBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _cableWeightEntries = null;\nif (_cableWeightDataBlock!=null)\n{\n\t_cableWeightEntries=_cableWeightDataBlock.getCableWeightEntries();\n}\nreturn _cableWeightEntries;'"
	 * @generated
	 */
	EList<CableWeightEntry> getCableWeightData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\n<%ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock%> _protectionLevelDataBlock = _globalBlock.getProtectionLevelDataBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ProtectionLevelEntry%>> _protectionLevelEntries = null;\nif (_protectionLevelDataBlock!=null)\n{\n\t_protectionLevelEntries=_protectionLevelDataBlock.getProtectionLevelEntries();\n}\nreturn _protectionLevelEntries;'"
	 * @generated
	 */
	EList<ProtectionLevelEntry> getProtectionLevelData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.CompartmentsBlock%> _compartmentsBlock = this.getCompartmentsBlock();\nreturn _compartmentsBlock.getCompartments();'"
	 * @generated
	 */
	EList<Compartment> getCompartments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Compartment%>> _compartments = this.getCompartments();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> apply(final <%ch.hilbri.assist.datamodel.model.Compartment%> it)\n\t{\n\t\treturn it.getRdcs();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Compartment%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>>>map(_compartments, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.RDC%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.RDC%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.RDC%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<RDC> getRDCs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _rDCs = this.getRDCs();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> apply(final <%ch.hilbri.assist.datamodel.model.RDC%> it)\n\t{\n\t\treturn it.getConnectors();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.RDC%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>>>map(_rDCs, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Connector%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Connector%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.Connector%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _connectors = this.getConnectors();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>> apply(final <%ch.hilbri.assist.datamodel.model.Connector%> it)\n\t{\n\t\treturn it.getPins();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Connector%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Pin%>>>map(_connectors, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.Pin%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.datamodel.model.Pin%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.InterfacesBlock%> _interfacesBlock = this.getInterfacesBlock();\nreturn _interfacesBlock.getEqInterfaces();'"
	 * @generated
	 */
	EList<EqInterface> getEqInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock%> _interfaceGroupsBlock = this.getInterfaceGroupsBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterfaceGroup%>> _eqInterfaceGroups = null;\nif (_interfaceGroupsBlock!=null)\n{\n\t_eqInterfaceGroups=_interfaceGroupsBlock.getEqInterfaceGroups();\n}\nreturn _eqInterfaceGroups;'"
	 * @generated
	 */
	EList<EqInterfaceGroup> getEqInterfaceGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.RestrictionsBlock%> _restrictionsBlock = this.getRestrictionsBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ColocalityRelation%>> _colocalityRelations = null;\nif (_restrictionsBlock!=null)\n{\n\t_colocalityRelations=_restrictionsBlock.getColocalityRelations();\n}\nreturn _colocalityRelations;'"
	 * @generated
	 */
	EList<ColocalityRelation> getColocalityRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.RestrictionsBlock%> _restrictionsBlock = this.getRestrictionsBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.DislocalityRelation%>> _dislocalityRelations = null;\nif (_restrictionsBlock!=null)\n{\n\t_dislocalityRelations=_restrictionsBlock.getDislocalityRelations();\n}\nreturn _dislocalityRelations;'"
	 * @generated
	 */
	EList<DislocalityRelation> getDislocalityRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.RestrictionsBlock%> _restrictionsBlock = this.getRestrictionsBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ValidDeployment%>> _validDeployments = null;\nif (_restrictionsBlock!=null)\n{\n\t_validDeployments=_restrictionsBlock.getValidDeployments();\n}\nreturn _validDeployments;'"
	 * @generated
	 */
	EList<ValidDeployment> getValidDeployments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.RestrictionsBlock%> _restrictionsBlock = this.getRestrictionsBlock();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.InvalidDeployment%>> _invalidDeployments = null;\nif (_restrictionsBlock!=null)\n{\n\t_invalidDeployments=_restrictionsBlock.getInvalidDeployments();\n}\nreturn _invalidDeployments;'"
	 * @generated
	 */
	EList<InvalidDeployment> getInvalidDeployments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.EqInterface%>> _eqInterfaces = this.getEqInterfaces();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.String%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.String%>>()\n{\n\tpublic <%java.lang.String%> apply(final <%ch.hilbri.assist.datamodel.model.EqInterface%> it)\n\t{\n\t\treturn it.getIoType();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%java.lang.String%>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.EqInterface%>, <%java.lang.String%>>map(_eqInterfaces, _function);\n<%java.util.Set%><<%java.lang.String%>> _set = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.String%>>toSet(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%java.lang.String%>>toEList(_set);'"
	 * @generated
	 */
	EList<String> getEqInterfaceTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" eqIfaceTypeUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%java.lang.String%>> _xifexpression = null;\n<%ch.hilbri.assist.datamodel.model.GlobalBlock%> _globalBlock = this.getGlobalBlock();\n<%ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock%> _compatibleIoTypesBlock = _globalBlock.getCompatibleIoTypesBlock();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_compatibleIoTypesBlock, null);\nif (_equals)\n{\n\t_xifexpression = <%org.eclipse.emf.common.util.ECollections%>.<<%java.lang.String%>>toEList(java.util.Collections.<<%java.lang.String%>>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<<%java.lang.String%>>newArrayList(eqIfaceType)));\n}\nelse\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>> _compatibleIoTypes = this.getCompatibleIoTypes();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>, <%java.lang.Boolean%>>()\n\t{\n\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%> it)\n\t\t{\n\t\t\t<%java.lang.String%> _eqInterfaceIoType = it.getEqInterfaceIoType();\n\t\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_eqInterfaceIoType, eqIfaceType));\n\t\t}\n\t};\n\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>>filter(_compatibleIoTypes, _function);\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>, <%org.eclipse.emf.common.util.EList%><<%java.lang.String%>>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>, <%org.eclipse.emf.common.util.EList%><<%java.lang.String%>>>()\n\t{\n\t\tpublic <%org.eclipse.emf.common.util.EList%><<%java.lang.String%>> apply(final <%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%> it)\n\t\t{\n\t\t\treturn it.getPinInterfaceIoTypes();\n\t\t}\n\t};\n\t<%java.lang.Iterable%><<%org.eclipse.emf.common.util.EList%><<%java.lang.String%>>> _map = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry%>, <%org.eclipse.emf.common.util.EList%><<%java.lang.String%>>>map(_filter, _function_1);\n\t<%java.lang.Iterable%><<%java.lang.String%>> _flatten = <%com.google.common.collect.Iterables%>.<<%java.lang.String%>>concat(_map);\n\t<%java.util.Set%><<%java.lang.String%>> _set = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.String%>>toSet(_flatten);\n\t<%java.lang.Iterable%><<%java.lang.String%>> _plus = <%com.google.common.collect.Iterables%>.<<%java.lang.String%>>concat(java.util.Collections.<<%java.lang.String%>>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<<%java.lang.String%>>newArrayList(eqIfaceType)), _set);\n\t_xifexpression = <%org.eclipse.emf.common.util.ECollections%>.<<%java.lang.String%>>toEList(_plus);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	EList<String> getCompatiblePinTypes(String eqIfaceType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((level == 0))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Connector%>> _connectors = this.getConnectors();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.Connector%> it)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Connector%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_connectors, _function);\n}\nelse\n{\n\tif ((level == 1))\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.RDC%>> _rDCs = this.getRDCs();\n\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t\t{\n\t\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.RDC%> it)\n\t\t\t{\n\t\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t\t}\n\t\t};\n\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.RDC%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_rDCs, _function_1);\n\t}\n\telse\n\t{\n\t\tif ((level == 2))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Compartment%>> _compartments = this.getCompartments();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.datamodel.model.HardwareElement%> apply(final <%ch.hilbri.assist.datamodel.model.Compartment%> it)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.datamodel.model.HardwareElement%>) it);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.datamodel.model.Compartment%>, <%ch.hilbri.assist.datamodel.model.HardwareElement%>>map(_compartments, _function_2);\n\t\t}\n\t\telse\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	EList<HardwareElement> getAllHardwareElements(int level);

} // AssistModel
