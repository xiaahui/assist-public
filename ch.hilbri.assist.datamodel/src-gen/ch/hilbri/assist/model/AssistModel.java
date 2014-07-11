/**
 * Copyright 2014 - Robert Hilbrich
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>>();\nlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.CORE);\nlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.PROCESSOR);\nlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOARD);\n<%ch.hilbri.assist.model.HardwareArchitectureLevelType%> _topHardwareLevel = this.getTopHardwareLevel();\nboolean _matched = false;\nif (!_matched)\n{\n\tif (com.google.common.base.Objects.equal(_topHardwareLevel, <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.CORE_VALUE))\n\t{\n\t\t_matched=true;\n\t}\n}\nif (!_matched)\n{\n\tif (com.google.common.base.Objects.equal(_topHardwareLevel, <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.PROCESSOR_VALUE))\n\t{\n\t\t_matched=true;\n\t}\n}\nif (!_matched)\n{\n\tif (com.google.common.base.Objects.equal(_topHardwareLevel, <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOARD_VALUE))\n\t{\n\t\t_matched=true;\n\t}\n}\nif (!_matched)\n{\n\tif (com.google.common.base.Objects.equal(_topHardwareLevel, <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOX_VALUE))\n\t{\n\t\t_matched=true;\n\t\tlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOX);\n\t}\n}\nif (!_matched)\n{\n\tif (com.google.common.base.Objects.equal(_topHardwareLevel, <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.COMPARTMENT_VALUE))\n\t{\n\t\t_matched=true;\n\t\tlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOX);\n\t\tlist.add(<%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.COMPARTMENT);\n\t}\n}\nreturn list;'"
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
	 * *
	 * Should be called before the mapping to make the model proper
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean postProcessingForMapping();

} // AssistModel
