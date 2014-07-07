/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result;

import ch.hilbri.assist.model.AssistModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.Result#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getRootHardwareElements <em>Root Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getTopHardwareLevel <em>Top Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getBottomHardwareLevel <em>Bottom Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getIoAdapters <em>Io Adapters</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getThreads <em>Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getCommunications <em>Communications</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Result#getAssistModel <em>Assist Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.ResultPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of this result
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Result#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_SystemName()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Result#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Root Hardware Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.HardwareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all hardware elements in the top hierarchy level
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Hardware Elements</em>' containment reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_RootHardwareElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwareElement> getRootHardwareElements();

	/**
	 * Returns the value of the '<em><b>Top Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.result.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the top hardware level for this result
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.result.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_TopHardwareLevel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%ch.hilbri.assist.result.HardwareArchitectureLevelType%> _xifexpression = null;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.HardwareElement%>> _rootHardwareElements = this.getRootHardwareElements();\nboolean _isEmpty = _rootHardwareElements.isEmpty();\nboolean _not = (!_isEmpty);\nif (_not)\n{\n\t<%ch.hilbri.assist.result.HardwareArchitectureLevelType%> _switchResult = null;\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.HardwareElement%>> _rootHardwareElements_1 = this.getRootHardwareElements();\n\t<%ch.hilbri.assist.result.HardwareElement%> _get = _rootHardwareElements_1.get(0);\n\tboolean _matched = false;\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.result.Compartment%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.result.HardwareArchitectureLevelType%>.COMPARTMENT;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.result.Box%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.result.HardwareArchitectureLevelType%>.BOX;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.result.Board%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.result.HardwareArchitectureLevelType%>.BOARD;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.result.Processor%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.result.HardwareArchitectureLevelType%>.PROCESSOR;\n\t\t}\n\t}\n\tif (!_matched)\n\t{\n\t\tif (_get instanceof <%ch.hilbri.assist.result.Core%>)\n\t\t{\n\t\t\t_matched=true;\n\t\t\t_switchResult = <%ch.hilbri.assist.result.HardwareArchitectureLevelType%>.CORE;\n\t\t}\n\t}\n\t_xifexpression = _switchResult;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getTopHardwareLevel();

	/**
	 * Returns the value of the '<em><b>Bottom Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.result.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the bottom hardware level for this result
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bottom Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.result.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_BottomHardwareLevel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return <%ch.hilbri.assist.result.HardwareArchitectureLevelType%>.CORE;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getBottomHardwareLevel();

	/**
	 * Returns the value of the '<em><b>Io Adapters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.IOAdapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of all io adapters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Io Adapters</em>' containment reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_IoAdapters()
	 * @model containment="true"
	 * @generated
	 */
	EList<IOAdapter> getIoAdapters();

	/**
	 * Returns the value of the '<em><b>Application Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of all application groups
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Groups</em>' containment reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_ApplicationGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationGroup> getApplicationGroups();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of all applications
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_Applications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.Thread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of all threads
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_Threads()
	 * @model containment="true"
	 * @generated
	 */
	EList<ch.hilbri.assist.result.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of all networks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Communications</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.CommunicationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a list of all communication relations between applications
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communications</em>' containment reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_Communications()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationRelation> getCommunications();

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the results of the evaluation for this result
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference.
	 * @see #setEvaluation(Evaluation)
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_Evaluation()
	 * @model containment="true"
	 * @generated
	 */
	Evaluation getEvaluation();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Result#getEvaluation <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' containment reference.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Evaluation value);

	/**
	 * Returns the value of the '<em><b>Assist Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the original input specification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assist Model</em>' reference.
	 * @see #setAssistModel(AssistModel)
	 * @see ch.hilbri.assist.result.ResultPackage#getResult_AssistModel()
	 * @model
	 * @generated
	 */
	AssistModel getAssistModel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Result#getAssistModel <em>Assist Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assist Model</em>' reference.
	 * @see #getAssistModel()
	 * @generated
	 */
	void setAssistModel(AssistModel value);

} // Result
