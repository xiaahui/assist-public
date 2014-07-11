/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getHardwareContainer <em>Hardware Container</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getProximityRelations <em>Proximity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getCommunicationRelations <em>Communication Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getTopHardwareLevel <em>Top Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getBottomHardwareLevel <em>Bottom Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getAllHardwareLevels <em>All Hardware Levels</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getHardwareLevelCount <em>Hardware Level Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel()
 * @model
 * @generated
 */
public interface AssistModel extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_SystemName()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.AssistModel#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Hardware Container</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.HardwareElementContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Container</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_HardwareContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HardwareElementContainer> getHardwareContainer();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_Applications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Application Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Groups</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_ApplicationGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationGroup> getApplicationGroups();

	/**
	 * Returns the value of the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.DissimilarityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_DissimilarityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DissimilarityRelation> getDissimilarityRelations();

	/**
	 * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_DislocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DislocalityRelation> getDislocalityRelations();

	/**
	 * Returns the value of the '<em><b>Proximity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.ProximityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proximity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proximity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_ProximityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProximityRelation> getProximityRelations();

	/**
	 * Returns the value of the '<em><b>Communication Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.CommunicationRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_CommunicationRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationRelation> getCommunicationRelations();

	/**
	 * Returns the value of the '<em><b>Top Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the top hardware level for this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_TopHardwareLevel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _xifexpression = null;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\nboolean _isEmpty = _hardwareContainer.isEmpty();\nboolean _not = (!_isEmpty);\nif (_not)\n{\n\t<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _switchResult = null;\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t<%ch.hilbri.assist.model.HardwareElementContainer%> _get = _hardwareContainer_1.get(0);\n\tboolean _matched = false;\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.model.Compartment%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.COMPARTMENT;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.model.Box%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOX;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.model.Board%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOARD;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.model.Processor%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.PROCESSOR;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.model.Core%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.CORE;\n\t\t}\n\t}\n\t_xifexpression = _switchResult;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getTopHardwareLevel();

	/**
	 * Returns the value of the '<em><b>Bottom Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the bottom hardware level for this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bottom Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_BottomHardwareLevel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.CORE;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getBottomHardwareLevel();

	/**
	 * Returns the value of the '<em><b>All Hardware Levels</b></em>' attribute list.
	 * The list contents are of type {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of all HardwareArchitectureLevels for this model - Core level is the first item in this list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Hardware Levels</em>' attribute list.
	 * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_AllHardwareLevels()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>>();\nlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.CORE);\nlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.PROCESSOR);\nlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOARD);\n<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase CORE:\n\t\t\tbreak;\n\t\tcase PROCESSOR:\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\tlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOX);\n\t\t\tbreak;\n\t\tcase COMPARTMENT:\n\t\t\tlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOX);\n\t\t\tlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.COMPARTMENT);\n\t\t\tbreak;\n\t\tdefault:\n\t\t\treturn null;\n\t}\n}\nelse\n{\n\treturn null;\n}\nreturn list;'"
	 * @generated
	 */
	EList<HardwareArchitectureLevelType> getAllHardwareLevels();

	/**
	 * Returns the value of the '<em><b>Hardware Level Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the amount of hardware levels in this model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Level Count</em>' attribute.
	 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_HardwareLevelCount()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>> _allHardwareLevels = this.getAllHardwareLevels();\nreturn _allHardwareLevels.size();'"
	 * @generated
	 */
	int getHardwareLevelCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of all compartments in this model
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_topHardwareLevel, <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.COMPARTMENT);\nif (_equals)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Compartment%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Compartment%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.model.Compartment%> apply(final <%ch.hilbri.assist.model.HardwareElementContainer%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.model.Compartment%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Compartment%>>map(_hardwareContainer, _function);\n}\nelse\n{\n\treturn new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Compartment%>>();\n}'"
	 * @generated
	 */
	EList<Compartment> getAllCompartments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of all boxes in this model
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Box%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Box%>>();\n<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Box%>> _boxes = ((<%ch.hilbri.assist.model.Compartment%>) c).getBoxes();\n\t\t\t\tlist.addAll(_boxes);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Box%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Box%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.model.Box%> apply(final <%ch.hilbri.assist.model.HardwareElementContainer%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.model.Box%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Box%>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Box%>>map(_hardwareContainer_1, _function);\n\t\t\tlist.addAll(_map);\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Box> getAllBoxes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of all boards in this model
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Board%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Board%>>();\n<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Board%>> _allBoards = ((<%ch.hilbri.assist.model.Compartment%>) c).getAllBoards();\n\t\t\t\tlist.addAll(_allBoards);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> b : _hardwareContainer_1)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Board%>> _boards = ((<%ch.hilbri.assist.model.Box%>) b).getBoards();\n\t\t\t\tlist.addAll(_boards);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_2 = this.getHardwareContainer();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Board%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Board%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.model.Board%> apply(final <%ch.hilbri.assist.model.HardwareElementContainer%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.model.Board%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Board%>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.HardwareElementContainer%>, <%ch.hilbri.assist.model.Board%>>map(_hardwareContainer_2, _function);\n\t\t\tlist.addAll(_map);\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Board> getAllBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of all processors in this model
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Processor%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Processor%>>();\n<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Processor%>> _allProcessors = ((<%ch.hilbri.assist.model.Compartment%>) c).getAllProcessors();\n\t\t\t\tlist.addAll(_allProcessors);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> b : _hardwareContainer_1)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Processor%>> _allProcessors_1 = ((<%ch.hilbri.assist.model.Box%>) b).getAllProcessors();\n\t\t\t\tlist.addAll(_allProcessors_1);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_2 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> b_1 : _hardwareContainer_2)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Processor%>> _processors = ((<%ch.hilbri.assist.model.Board%>) b_1).getProcessors();\n\t\t\t\tlist.addAll(_processors);\n\t\t\t}\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of all cores in this model
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Core%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Core%>>();\n<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Core%>> _allCores = ((<%ch.hilbri.assist.model.Compartment%>) c).getAllCores();\n\t\t\t\tlist.addAll(_allCores);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> b : _hardwareContainer_1)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Core%>> _allCores_1 = ((<%ch.hilbri.assist.model.Box%>) b).getAllCores();\n\t\t\t\tlist.addAll(_allCores_1);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.HardwareElementContainer%>> _hardwareContainer_2 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.model.HardwareElementContainer%> b_1 : _hardwareContainer_2)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Core%>> _allCores_2 = ((<%ch.hilbri.assist.model.Board%>) b_1).getAllCores();\n\t\t\t\tlist.addAll(_allCores_2);\n\t\t\t}\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Core> getAllCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of all hardware elements in the specified hardware level
	 * <!-- end-model-doc -->
	 * @model unique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (level != null)\n{\n\tswitch (level)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Compartment%>> _allCompartments = this.getAllCompartments();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Compartment%>, <%ch.hilbri.assist.model.HardwareElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Compartment%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Compartment%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Compartment%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allCompartments, _function);\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Box%>> _allBoxes = this.getAllBoxes();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Box%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Box%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Box%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Box%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allBoxes, _function_1);\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Board%>> _allBoards = this.getAllBoards();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Board%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Board%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Board%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Board%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allBoards, _function_2);\n\t\tcase PROCESSOR:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Processor%>> _allProcessors = this.getAllProcessors();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Processor%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Processor%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Processor%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Processor%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allProcessors, _function_3);\n\t\tcase CORE:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Core%>> _allCores = this.getAllCores();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Core%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_4 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Core%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Core%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Core%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allCores, _function_4);\n\t\tdefault:\n\t\t\treturn null;\n\t}\n}\nelse\n{\n\treturn null;\n}'"
	 * @generated
	 */
	EList<HardwareElement> getAllHardwareElements(HardwareArchitectureLevelType level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of all hardware elements in the specified hardware level (Core level = 1)
	 * <!-- end-model-doc -->
	 * @model unique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((level <= 0))\n{\n\treturn null;\n}\nint _hardwareLevelCount = this.getHardwareLevelCount();\nboolean _greaterThan = (level > _hardwareLevelCount);\nif (_greaterThan)\n{\n\treturn null;\n}\nif ((level == 1))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Core%>> _allCores = this.getAllCores();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Core%>, <%ch.hilbri.assist.model.HardwareElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Core%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Core%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Core%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allCores, _function);\n}\nif ((level == 2))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Processor%>> _allProcessors = this.getAllProcessors();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Processor%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Processor%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Processor%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Processor%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allProcessors, _function_1);\n}\nif ((level == 3))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Board%>> _allBoards = this.getAllBoards();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Board%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Board%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Board%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Board%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allBoards, _function_2);\n}\nif ((level == 4))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Box%>> _allBoxes = this.getAllBoxes();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Box%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Box%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Box%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Box%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allBoxes, _function_3);\n}\nif ((level == 5))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Compartment%>> _allCompartments = this.getAllCompartments();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Compartment%>, <%ch.hilbri.assist.model.HardwareElement%>> _function_4 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.model.Compartment%>, <%ch.hilbri.assist.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.model.HardwareElement%> apply(final <%ch.hilbri.assist.model.Compartment%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.model.Compartment%>, <%ch.hilbri.assist.model.HardwareElement%>>map(_allCompartments, _function_4);\n}\nreturn null;'"
	 * @generated
	 */
	EList<HardwareElement> getAllHardwareElements(int level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of all threads in the model
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Thread%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Thread%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Application%>> _applications = this.getApplications();\nfor (final <%ch.hilbri.assist.model.Application%> a : _applications)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Thread%>> _threads = a.getThreads();\n\tlist.addAll(_threads);\n}\nreturn list;'"
	 * @generated
	 */
	EList<ch.hilbri.assist.model.Thread> getAllThreads();

} // AssistModel
