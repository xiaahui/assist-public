/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityEntry#getLevel <em>Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry()
 * @model
 * @generated
 */
public interface DissimilarityEntry extends DissimilarityClause {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
	 * @see #setLevel(HardwareArchitectureLevelType)
	 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry_Level()
	 * @model unique="false"
	 * @generated
	 */
	HardwareArchitectureLevelType getLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.DissimilarityEntry#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(HardwareArchitectureLevelType value);

	/**
	 * Returns the value of the '<em><b>Compartment Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.CompartmentAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.CompartmentAttributes
	 * @see #setCompartmentAttribute(CompartmentAttributes)
	 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry_CompartmentAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	CompartmentAttributes getCompartmentAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.CompartmentAttributes
	 * @see #getCompartmentAttribute()
	 * @generated
	 */
	void setCompartmentAttribute(CompartmentAttributes value);

	/**
	 * Returns the value of the '<em><b>Box Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.BoxAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.BoxAttributes
	 * @see #setBoxAttribute(BoxAttributes)
	 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry_BoxAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	BoxAttributes getBoxAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.BoxAttributes
	 * @see #getBoxAttribute()
	 * @generated
	 */
	void setBoxAttribute(BoxAttributes value);

	/**
	 * Returns the value of the '<em><b>Board Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.BoardAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.BoardAttributes
	 * @see #setBoardAttribute(BoardAttributes)
	 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry_BoardAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	BoardAttributes getBoardAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.BoardAttributes
	 * @see #getBoardAttribute()
	 * @generated
	 */
	void setBoardAttribute(BoardAttributes value);

	/**
	 * Returns the value of the '<em><b>Processor Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.model.ProcessorAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.ProcessorAttributes
	 * @see #setProcessorAttribute(ProcessorAttributes)
	 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityEntry_ProcessorAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	ProcessorAttributes getProcessorAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Attribute</em>' attribute.
	 * @see ch.hilbri.assist.model.ProcessorAttributes
	 * @see #getProcessorAttribute()
	 * @generated
	 */
	void setProcessorAttribute(ProcessorAttributes value);

} // DissimilarityEntry
