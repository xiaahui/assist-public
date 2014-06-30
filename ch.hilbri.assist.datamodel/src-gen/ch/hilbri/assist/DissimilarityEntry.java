/**
 */
package ch.hilbri.assist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.DissimilarityEntry#getLevel <em>Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getDissimilarityEntry()
 * @model
 * @generated
 */
public interface DissimilarityEntry extends DissimilarityClause {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @see #setLevel(HardwareArchitectureLevelType)
	 * @see ch.hilbri.assist.AssistPackage#getDissimilarityEntry_Level()
	 * @model unique="false"
	 * @generated
	 */
	HardwareArchitectureLevelType getLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.DissimilarityEntry#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(HardwareArchitectureLevelType value);

	/**
	 * Returns the value of the '<em><b>Compartment Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.CompartmentAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Attribute</em>' attribute.
	 * @see ch.hilbri.assist.CompartmentAttributes
	 * @see #setCompartmentAttribute(CompartmentAttributes)
	 * @see ch.hilbri.assist.AssistPackage#getDissimilarityEntry_CompartmentAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	CompartmentAttributes getCompartmentAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Attribute</em>' attribute.
	 * @see ch.hilbri.assist.CompartmentAttributes
	 * @see #getCompartmentAttribute()
	 * @generated
	 */
	void setCompartmentAttribute(CompartmentAttributes value);

	/**
	 * Returns the value of the '<em><b>Box Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.BoxAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Attribute</em>' attribute.
	 * @see ch.hilbri.assist.BoxAttributes
	 * @see #setBoxAttribute(BoxAttributes)
	 * @see ch.hilbri.assist.AssistPackage#getDissimilarityEntry_BoxAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	BoxAttributes getBoxAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Attribute</em>' attribute.
	 * @see ch.hilbri.assist.BoxAttributes
	 * @see #getBoxAttribute()
	 * @generated
	 */
	void setBoxAttribute(BoxAttributes value);

	/**
	 * Returns the value of the '<em><b>Board Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.BoardAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Attribute</em>' attribute.
	 * @see ch.hilbri.assist.BoardAttributes
	 * @see #setBoardAttribute(BoardAttributes)
	 * @see ch.hilbri.assist.AssistPackage#getDissimilarityEntry_BoardAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	BoardAttributes getBoardAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Attribute</em>' attribute.
	 * @see ch.hilbri.assist.BoardAttributes
	 * @see #getBoardAttribute()
	 * @generated
	 */
	void setBoardAttribute(BoardAttributes value);

	/**
	 * Returns the value of the '<em><b>Processor Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.ProcessorAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Attribute</em>' attribute.
	 * @see ch.hilbri.assist.ProcessorAttributes
	 * @see #setProcessorAttribute(ProcessorAttributes)
	 * @see ch.hilbri.assist.AssistPackage#getDissimilarityEntry_ProcessorAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	ProcessorAttributes getProcessorAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Attribute</em>' attribute.
	 * @see ch.hilbri.assist.ProcessorAttributes
	 * @see #getProcessorAttribute()
	 * @generated
	 */
	void setProcessorAttribute(ProcessorAttributes value);

} // DissimilarityEntry
