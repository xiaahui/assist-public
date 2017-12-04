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
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getDissimilarityAttribute <em>Dissimilarity Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry()
 * @model
 * @generated
 */
public interface DissimilarityEntry extends DissimilarityClause {
	/**
	 * Returns the value of the '<em><b>Dissimilarity Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.DissimilarityAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityAttributes
	 * @see #setDissimilarityAttribute(DissimilarityAttributes)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry_DissimilarityAttribute()
	 * @model unique="false"
	 * @generated
	 */
	DissimilarityAttributes getDissimilarityAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.DissimilarityEntry#getDissimilarityAttribute <em>Dissimilarity Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilarity Attribute</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.DissimilarityAttributes
	 * @see #getDissimilarityAttribute()
	 * @generated
	 */
	void setDissimilarityAttribute(DissimilarityAttributes value);

	/**
	 * Returns the value of the '<em><b>Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityEntry_HardwareLevel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%ch.hilbri.assist.mapping.model.DissimilarityAttributes%&gt; _dissimilarityAttribute = this.getDissimilarityAttribute();\nif (_dissimilarityAttribute != null)\n{\n\tswitch (_dissimilarityAttribute)\n\t{\n\t\tcase COMPARTMENT_MANUFACTURER:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.COMPARTMENT;\n\t\tcase COMPARTMENT_POWERSUPPLY:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.COMPARTMENT;\n\t\tcase BOX_MANUFACTURER:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.BOX;\n\t\tcase BOARD_MANUFACTURER:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.BOARD;\n\t\tcase BOARD_BOARDTYPE:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.BOARD;\n\t\tcase BOARD_POWERSUPPLY:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.BOARD;\n\t\tcase BOARD_ASSURANCELEVEL:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.BOARD;\n\t\tcase PROCESSOR_MANUFACTURER:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.PROCESSOR;\n\t\tcase PROCESSOR_PROCESSORTYPE:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.PROCESSOR;\n\t\tcase CORE_ARCHITECTURE:\n\t\t\treturn &lt;%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%&gt;.CORE;\n\t\tdefault:\n\t\t\tbreak;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

} // DissimilarityEntry
