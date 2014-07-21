/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getRamCapacity <em>Ram Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getRamUtilization <em>Ram Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getRomCapacity <em>Rom Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getRomUtilization <em>Rom Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getProcessors <em>Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getIoAdapters <em>Io Adapters</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Board#isNotUsed <em>Not Used</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_Manufacturer()
	 * @model unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Board Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Type</em>' attribute.
	 * @see #setBoardType(String)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_BoardType()
	 * @model unique="false"
	 * @generated
	 */
	String getBoardType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getBoardType <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Type</em>' attribute.
	 * @see #getBoardType()
	 * @generated
	 */
	void setBoardType(String value);

	/**
	 * Returns the value of the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply</em>' attribute.
	 * @see #setPowerSupply(String)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_PowerSupply()
	 * @model unique="false"
	 * @generated
	 */
	String getPowerSupply();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getPowerSupply <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply</em>' attribute.
	 * @see #getPowerSupply()
	 * @generated
	 */
	void setPowerSupply(String value);

	/**
	 * Returns the value of the '<em><b>Assurance Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.DesignAssuranceLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Level</em>' attribute.
	 * @see ch.hilbri.assist.model.DesignAssuranceLevelType
	 * @see #setAssuranceLevel(DesignAssuranceLevelType)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_AssuranceLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	DesignAssuranceLevelType getAssuranceLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getAssuranceLevel <em>Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' attribute.
	 * @see ch.hilbri.assist.model.DesignAssuranceLevelType
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(DesignAssuranceLevelType value);

	/**
	 * Returns the value of the '<em><b>Ram Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Capacity</em>' attribute.
	 * @see #setRamCapacity(int)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_RamCapacity()
	 * @model unique="false"
	 * @generated
	 */
	int getRamCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getRamCapacity <em>Ram Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Capacity</em>' attribute.
	 * @see #getRamCapacity()
	 * @generated
	 */
	void setRamCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Ram Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Utilization</em>' attribute.
	 * @see #setRamUtilization(double)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_RamUtilization()
	 * @model unique="false"
	 * @generated
	 */
	double getRamUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getRamUtilization <em>Ram Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Utilization</em>' attribute.
	 * @see #getRamUtilization()
	 * @generated
	 */
	void setRamUtilization(double value);

	/**
	 * Returns the value of the '<em><b>Rom Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rom Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rom Capacity</em>' attribute.
	 * @see #setRomCapacity(int)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_RomCapacity()
	 * @model unique="false"
	 * @generated
	 */
	int getRomCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getRomCapacity <em>Rom Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom Capacity</em>' attribute.
	 * @see #getRomCapacity()
	 * @generated
	 */
	void setRomCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Rom Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rom Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rom Utilization</em>' attribute.
	 * @see #setRomUtilization(double)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_RomUtilization()
	 * @model unique="false"
	 * @generated
	 */
	double getRomUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getRomUtilization <em>Rom Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom Utilization</em>' attribute.
	 * @see #getRomUtilization()
	 * @generated
	 */
	void setRomUtilization(double value);

	/**
	 * Returns the value of the '<em><b>Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.mapping.Box#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' container reference.
	 * @see #setBox(Box)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_Box()
	 * @see ch.hilbri.assist.result.mapping.Box#getBoards
	 * @model opposite="boards" transient="false"
	 * @generated
	 */
	Box getBox();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Board#getBox <em>Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box</em>' container reference.
	 * @see #getBox()
	 * @generated
	 */
	void setBox(Box value);

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.Processor}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.mapping.Processor#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_Processors()
	 * @see ch.hilbri.assist.result.mapping.Processor#getBoard
	 * @model opposite="board" containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Io Adapters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.IOAdapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Adapters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Adapters</em>' containment reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_IoAdapters()
	 * @model containment="true"
	 * @generated
	 */
	EList<IOAdapter> getIoAdapters();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.Network}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.mapping.Network#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_Networks()
	 * @see ch.hilbri.assist.result.mapping.Network#getBoards
	 * @model opposite="boards"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Not Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this processor used? Does it contain any mapped threads?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Used</em>' attribute.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getBoard_NotUsed()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean result = false;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.mapping.Processor%>> _processors = this.getProcessors();\nfor (final <%ch.hilbri.assist.result.mapping.Processor%> p : _processors)\n{\n\tboolean _or = false;\n\tif (result)\n\t{\n\t\t_or = true;\n\t} else\n\t{\n\t\tboolean _isNotUsed = p.isNotUsed();\n\t\t_or = _isNotUsed;\n\t}\n\tresult = _or;\n}\nreturn result;'"
	 * @generated
	 */
	boolean isNotUsed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a list of all applications being mapped to this board
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.result.mapping.Application%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.result.mapping.Application%>>();\nreturn list;'"
	 * @generated
	 */
	EList<Application> getAllApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a list of all cores on this board
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.result.mapping.Core%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.result.mapping.Core%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.mapping.Processor%>> _processors = this.getProcessors();\nfor (final <%ch.hilbri.assist.result.mapping.Processor%> p : _processors)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.mapping.Core%>> _cores = p.getCores();\n\tlist.addAll(_cores);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Core> getAllCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return <%ch.hilbri.assist.model.HardwareArchitectureLevelType%>.BOARD;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

} // Board
