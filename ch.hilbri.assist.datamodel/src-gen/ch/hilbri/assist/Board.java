/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.Board#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getRamCapacity <em>Ram Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getRomCapacity <em>Rom Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getProcessors <em>Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getIoAdapters <em>Io Adapters</em>}</li>
 *   <li>{@link ch.hilbri.assist.Board#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends HardwareElementContainer {
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
	 * @see ch.hilbri.assist.AssistPackage#getBoard_Manufacturer()
	 * @model unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Board#getManufacturer <em>Manufacturer</em>}' attribute.
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
	 * @see ch.hilbri.assist.AssistPackage#getBoard_BoardType()
	 * @model unique="false"
	 * @generated
	 */
	String getBoardType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Board#getBoardType <em>Board Type</em>}' attribute.
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
	 * @see ch.hilbri.assist.AssistPackage#getBoard_PowerSupply()
	 * @model unique="false"
	 * @generated
	 */
	String getPowerSupply();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Board#getPowerSupply <em>Power Supply</em>}' attribute.
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
	 * The literals are from the enumeration {@link ch.hilbri.assist.DesignAssuranceLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Level</em>' attribute.
	 * @see ch.hilbri.assist.DesignAssuranceLevelType
	 * @see #setAssuranceLevel(DesignAssuranceLevelType)
	 * @see ch.hilbri.assist.AssistPackage#getBoard_AssuranceLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	DesignAssuranceLevelType getAssuranceLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Board#getAssuranceLevel <em>Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' attribute.
	 * @see ch.hilbri.assist.DesignAssuranceLevelType
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
	 * @see ch.hilbri.assist.AssistPackage#getBoard_RamCapacity()
	 * @model unique="false"
	 * @generated
	 */
	int getRamCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Board#getRamCapacity <em>Ram Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Capacity</em>' attribute.
	 * @see #getRamCapacity()
	 * @generated
	 */
	void setRamCapacity(int value);

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
	 * @see ch.hilbri.assist.AssistPackage#getBoard_RomCapacity()
	 * @model unique="false"
	 * @generated
	 */
	int getRomCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Board#getRomCapacity <em>Rom Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom Capacity</em>' attribute.
	 * @see #getRomCapacity()
	 * @generated
	 */
	void setRomCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.Box#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' container reference.
	 * @see #setBox(Box)
	 * @see ch.hilbri.assist.AssistPackage#getBoard_Box()
	 * @see ch.hilbri.assist.Box#getBoards
	 * @model opposite="boards" transient="false"
	 * @generated
	 */
	Box getBox();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Board#getBox <em>Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box</em>' container reference.
	 * @see #getBox()
	 * @generated
	 */
	void setBox(Box value);

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.Processor}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.Processor#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getBoard_Processors()
	 * @see ch.hilbri.assist.Processor#getBoard
	 * @model opposite="board" containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Io Adapters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.IOAdapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Adapters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Adapters</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getBoard_IoAdapters()
	 * @model containment="true"
	 * @generated
	 */
	EList<IOAdapter> getIoAdapters();

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getBoard_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

} // Board
