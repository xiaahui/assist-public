/**
 */
package ch.hilbri.assist.mapping.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getLevel <em>Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry()
 * @model
 * @generated
 */
public interface DissimilarityEntry extends DissimilarityClause {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry_Level()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt; _xifexpression = null;\n&lt;%ch.hilbri.assist.mapping.model.CompartmentAttributes%&gt; _compartmentAttribute = this.getCompartmentAttribute();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_compartmentAttribute, &lt;%ch.hilbri.assist.mapping.model.CompartmentAttributes%&gt;.NONE));\nif (_notEquals)\n{\n\t_xifexpression = &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.COMPARTMENT;\n}\nelse\n{\n\t&lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt; _xifexpression_1 = null;\n\t&lt;%ch.hilbri.assist.mapping.model.BoxAttributes%&gt; _boxAttribute = this.getBoxAttribute();\n\tboolean _notEquals_1 = (!&lt;%com.google.common.base.Objects%&gt;.equal(_boxAttribute, &lt;%ch.hilbri.assist.mapping.model.BoxAttributes%&gt;.NONE));\n\tif (_notEquals_1)\n\t{\n\t\t_xifexpression_1 = &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.BOX;\n\t}\n\telse\n\t{\n\t\t&lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt; _xifexpression_2 = null;\n\t\t&lt;%ch.hilbri.assist.mapping.model.BoardAttributes%&gt; _boardAttribute = this.getBoardAttribute();\n\t\tboolean _notEquals_2 = (!&lt;%com.google.common.base.Objects%&gt;.equal(_boardAttribute, &lt;%ch.hilbri.assist.mapping.model.BoardAttributes%&gt;.NONE));\n\t\tif (_notEquals_2)\n\t\t{\n\t\t\t_xifexpression_2 = &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.BOARD;\n\t\t}\n\t\telse\n\t\t{\n\t\t\t&lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt; _xifexpression_3 = null;\n\t\t\t&lt;%ch.hilbri.assist.mapping.model.ProcessorAttributes%&gt; _processorAttribute = this.getProcessorAttribute();\n\t\t\tboolean _notEquals_3 = (!&lt;%com.google.common.base.Objects%&gt;.equal(_processorAttribute, &lt;%ch.hilbri.assist.mapping.model.ProcessorAttributes%&gt;.NONE));\n\t\t\tif (_notEquals_3)\n\t\t\t{\n\t\t\t\t_xifexpression_3 = &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.PROCESSOR;\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\t_xifexpression_3 = null;\n\t\t\t}\n\t\t\t_xifexpression_2 = _xifexpression_3;\n\t\t}\n\t\t_xifexpression_1 = _xifexpression_2;\n\t}\n\t_xifexpression = _xifexpression_1;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getLevel();

	/**
	 * Returns the value of the '<em><b>Compartment Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.CompartmentAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.CompartmentAttributes
	 * @see #setCompartmentAttribute(CompartmentAttributes)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry_CompartmentAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	CompartmentAttributes getCompartmentAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getCompartmentAttribute <em>Compartment Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.CompartmentAttributes
	 * @see #getCompartmentAttribute()
	 * @generated
	 */
	void setCompartmentAttribute(CompartmentAttributes value);

	/**
	 * Returns the value of the '<em><b>Box Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.BoxAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.BoxAttributes
	 * @see #setBoxAttribute(BoxAttributes)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry_BoxAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	BoxAttributes getBoxAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoxAttribute <em>Box Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.BoxAttributes
	 * @see #getBoxAttribute()
	 * @generated
	 */
	void setBoxAttribute(BoxAttributes value);

	/**
	 * Returns the value of the '<em><b>Board Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.BoardAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.BoardAttributes
	 * @see #setBoardAttribute(BoardAttributes)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry_BoardAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	BoardAttributes getBoardAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getBoardAttribute <em>Board Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.BoardAttributes
	 * @see #getBoardAttribute()
	 * @generated
	 */
	void setBoardAttribute(BoardAttributes value);

	/**
	 * Returns the value of the '<em><b>Processor Attribute</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.ProcessorAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ProcessorAttributes
	 * @see #setProcessorAttribute(ProcessorAttributes)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry_ProcessorAttribute()
	 * @model default="None" unique="false"
	 * @generated
	 */
	ProcessorAttributes getProcessorAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getProcessorAttribute <em>Processor Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ProcessorAttributes
	 * @see #getProcessorAttribute()
	 * @generated
	 */
	void setProcessorAttribute(ProcessorAttributes value);

} // DissimilarityEntry
