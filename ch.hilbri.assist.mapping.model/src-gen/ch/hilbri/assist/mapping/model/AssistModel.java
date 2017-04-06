/**
 */
package ch.hilbri.assist.mapping.model;

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
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getChangeDelay <em>Change Delay</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getHardwareContainer <em>Hardware Container</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getProximityRelations <em>Proximity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getCommunicationRelations <em>Communication Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getSchedulingRelations <em>Scheduling Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getTopHardwareLevel <em>Top Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getBottomHardwareLevel <em>Bottom Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.AssistModel#getHardwareLevelCount <em>Hardware Level Count</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel()
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
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_SystemName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.AssistModel#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Change Delay</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Delay</em>' attribute.
	 * @see #setChangeDelay(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_ChangeDelay()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getChangeDelay();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.AssistModel#getChangeDelay <em>Change Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Delay</em>' attribute.
	 * @see #getChangeDelay()
	 * @generated
	 */
	void setChangeDelay(int value);

	/**
	 * Returns the value of the '<em><b>Hardware Container</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.HardwareElementContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Scheduling
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Container</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_HardwareContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HardwareElementContainer> getHardwareContainer();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_Applications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Application Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Groups</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_ApplicationGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationGroup> getApplicationGroups();

	/**
	 * Returns the value of the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.DissimilarityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_DissimilarityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DissimilarityRelation> getDissimilarityRelations();

	/**
	 * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_DislocalityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DislocalityRelation> getDislocalityRelations();

	/**
	 * Returns the value of the '<em><b>Proximity Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.ProximityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proximity Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proximity Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_ProximityRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProximityRelation> getProximityRelations();

	/**
	 * Returns the value of the '<em><b>Communication Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.CommunicationRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_CommunicationRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationRelation> getCommunicationRelations();

	/**
	 * Returns the value of the '<em><b>Scheduling Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.SchedulingRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_SchedulingRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchedulingRelation> getSchedulingRelations();

	/**
	 * Returns the value of the '<em><b>Top Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Scheduling
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_TopHardwareLevel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _xifexpression = null;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\nboolean _isEmpty = _hardwareContainer.isEmpty();\nboolean _not = (!_isEmpty);\nif (_not)\n{\n\t<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _switchResult = null;\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t<%ch.hilbri.assist.mapping.model.HardwareElementContainer%> _get = _hardwareContainer_1.get(0);\n\tboolean _matched = false;\n\tif (_get instanceof <%ch.hilbri.assist.mapping.model.Compartment%>)\n\t{\n\t\t_matched=true;\n\t\t_switchResult = <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.COMPARTMENT;\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.mapping.model.Box%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.BOX;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.mapping.model.Board%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.BOARD;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.mapping.model.Processor%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.PROCESSOR;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.mapping.model.Core%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.CORE;\n\t\t}\n\t}\n\t_xifexpression = _switchResult;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getTopHardwareLevel();

	/**
	 * Returns the value of the '<em><b>Bottom Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Hardware Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_BottomHardwareLevel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.CORE;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getBottomHardwareLevel();

	/**
	 * Returns the value of the '<em><b>Hardware Level Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Level Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Level Count</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getAssistModel_HardwareLevelCount()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='int _switchResult = (int) 0;\n<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t_switchResult = 5;\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t_switchResult = 4;\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\t_switchResult = 3;\n\t\t\tbreak;\n\t\tcase PROCESSOR:\n\t\t\t_switchResult = 2;\n\t\t\tbreak;\n\t\tcase CORE:\n\t\t\t_switchResult = 1;\n\t\t\tbreak;\n\t\tdefault:\n\t\t\t_switchResult = 0;\n\t\t\tbreak;\n\t}\n}\nelse\n{\n\t_switchResult = 0;\n}\nreturn _switchResult;'"
	 * @generated
	 */
	int getHardwareLevelCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_topHardwareLevel, <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.COMPARTMENT);\nif (_equals)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Compartment%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Compartment%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.mapping.model.Compartment%> apply(final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.mapping.model.Compartment%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Compartment%>>map(_hardwareContainer, _function);\n}\nelse\n{\n\treturn new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Compartment%>>();\n}'"
	 * @generated
	 */
	EList<Compartment> getAllCompartments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Box%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Box%>>();\n<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> _boxes = ((<%ch.hilbri.assist.mapping.model.Compartment%>) c).getBoxes();\n\t\t\t\tlist.addAll(_boxes);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Box%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Box%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.mapping.model.Box%> apply(final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.mapping.model.Box%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Box%>>map(_hardwareContainer_1, _function);\n\t\t\tlist.addAll(_map);\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Box> getAllBoxes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Board%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Board%>>();\n<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> _allBoards = ((<%ch.hilbri.assist.mapping.model.Compartment%>) c).getAllBoards();\n\t\t\t\tlist.addAll(_allBoards);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> b : _hardwareContainer_1)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> _boards = ((<%ch.hilbri.assist.mapping.model.Box%>) b).getBoards();\n\t\t\t\tlist.addAll(_boards);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_2 = this.getHardwareContainer();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Board%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Board%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.mapping.model.Board%> apply(final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.mapping.model.Board%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>, <%ch.hilbri.assist.mapping.model.Board%>>map(_hardwareContainer_2, _function);\n\t\t\tlist.addAll(_map);\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Board> getAllBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Processor%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Processor%>>();\n<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> _allProcessors = ((<%ch.hilbri.assist.mapping.model.Compartment%>) c).getAllProcessors();\n\t\t\t\tlist.addAll(_allProcessors);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> b : _hardwareContainer_1)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> _allProcessors_1 = ((<%ch.hilbri.assist.mapping.model.Box%>) b).getAllProcessors();\n\t\t\t\tlist.addAll(_allProcessors_1);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_2 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> b_1 : _hardwareContainer_2)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> _processors = ((<%ch.hilbri.assist.mapping.model.Board%>) b_1).getProcessors();\n\t\t\t\tlist.addAll(_processors);\n\t\t\t}\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Core%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Core%>>();\n<%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nif (_topHardwareLevel != null)\n{\n\tswitch (_topHardwareLevel)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> c : _hardwareContainer)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> _allCores = ((<%ch.hilbri.assist.mapping.model.Compartment%>) c).getAllCores();\n\t\t\t\tlist.addAll(_allCores);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_1 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> b : _hardwareContainer_1)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> _allCores_1 = ((<%ch.hilbri.assist.mapping.model.Box%>) b).getAllCores();\n\t\t\t\tlist.addAll(_allCores_1);\n\t\t\t}\n\t\t\tbreak;\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.HardwareElementContainer%>> _hardwareContainer_2 = this.getHardwareContainer();\n\t\t\tfor (final <%ch.hilbri.assist.mapping.model.HardwareElementContainer%> b_1 : _hardwareContainer_2)\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> _allCores_2 = ((<%ch.hilbri.assist.mapping.model.Board%>) b_1).getAllCores();\n\t\t\t\tlist.addAll(_allCores_2);\n\t\t\t}\n\t\t\tbreak;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nelse\n{\n}\nreturn list;'"
	 * @generated
	 */
	EList<Core> getAllCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (level != null)\n{\n\tswitch (level)\n\t{\n\t\tcase COMPARTMENT:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Compartment%>> _allCompartments = this.getAllCompartments();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Compartment%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Compartment%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allCompartments, _function);\n\t\tcase BOX:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> _allBoxes = this.getAllBoxes();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Box%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Box%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allBoxes, _function_1);\n\t\tcase BOARD:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> _allBoards = this.getAllBoards();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Board%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Board%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allBoards, _function_2);\n\t\tcase PROCESSOR:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> _allProcessors = this.getAllProcessors();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Processor%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Processor%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Processor%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Processor%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allProcessors, _function_3);\n\t\tcase CORE:\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> _allCores = this.getAllCores();\n\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Core%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_4 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Core%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t\t\t{\n\t\t\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Core%> elem)\n\t\t\t\t{\n\t\t\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t\t\t}\n\t\t\t};\n\t\t\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Core%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allCores, _function_4);\n\t\tdefault:\n\t\t\treturn null;\n\t}\n}\nelse\n{\n\treturn null;\n}'"
	 * @generated
	 */
	EList<HardwareElement> getAllHardwareElements(HardwareArchitectureLevelType level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" levelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((level <= 0))\n{\n\treturn null;\n}\nint _hardwareLevelCount = this.getHardwareLevelCount();\nboolean _greaterThan = (level > _hardwareLevelCount);\nif (_greaterThan)\n{\n\treturn null;\n}\nif ((level == 1))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> _allCores = this.getAllCores();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Core%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Core%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Core%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Core%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allCores, _function);\n}\nif ((level == 2))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> _allProcessors = this.getAllProcessors();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Processor%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Processor%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Processor%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Processor%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allProcessors, _function_1);\n}\nif ((level == 3))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> _allBoards = this.getAllBoards();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Board%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Board%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allBoards, _function_2);\n}\nif ((level == 4))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> _allBoxes = this.getAllBoxes();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Box%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Box%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allBoxes, _function_3);\n}\nif ((level == 5))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Compartment%>> _allCompartments = this.getAllCompartments();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>> _function_4 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Compartment%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>()\n\t{\n\t\tpublic <%ch.hilbri.assist.mapping.model.HardwareElement%> apply(final <%ch.hilbri.assist.mapping.model.Compartment%> elem)\n\t\t{\n\t\t\treturn ((<%ch.hilbri.assist.mapping.model.HardwareElement%>) elem);\n\t\t}\n\t};\n\treturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Compartment%>, <%ch.hilbri.assist.mapping.model.HardwareElement%>>map(_allCompartments, _function_4);\n}\nreturn null;'"
	 * @generated
	 */
	EList<HardwareElement> getAllHardwareElements(int level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Thread%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Thread%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Application%>> _applications = this.getApplications();\nfor (final <%ch.hilbri.assist.mapping.model.Application%> a : _applications)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Thread%>> _threads = a.getThreads();\n\tlist.addAll(_threads);\n}\nreturn list;'"
	 * @generated
	 */
	EList<ch.hilbri.assist.mapping.model.Thread> getAllThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" appUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.DislocalityRelation%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.DislocalityRelation%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.DislocalityRelation%>> _dislocalityRelations = this.getDislocalityRelations();\nfor (final <%ch.hilbri.assist.mapping.model.DislocalityRelation%> relation : _dislocalityRelations)\n{\n\t{\n\t\tboolean found = false;\n\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup%>> _applicationsOrGroups = relation.getApplicationsOrGroups();\n\t\tfor (final <%ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup%> aog : _applicationsOrGroups)\n\t\t{\n\t\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(aog, app);\n\t\t\tif (_equals)\n\t\t\t{\n\t\t\t\tfound = true;\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\tif ((aog instanceof <%ch.hilbri.assist.mapping.model.ApplicationGroup%>))\n\t\t\t\t{\n\t\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Application%>> _allApplications = ((<%ch.hilbri.assist.mapping.model.ApplicationGroup%>)aog).getAllApplications();\n\t\t\t\t\tboolean _contains = _allApplications.contains(app);\n\t\t\t\t\tif (_contains)\n\t\t\t\t\t{\n\t\t\t\t\t\tfound = true;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\tif (found)\n\t\t{\n\t\t\tlist.add(relation);\n\t\t}\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<DislocalityRelation> getAllDislocalityRelations(Application app);

} // AssistModel
