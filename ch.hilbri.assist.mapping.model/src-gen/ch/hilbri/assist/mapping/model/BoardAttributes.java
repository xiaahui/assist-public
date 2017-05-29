/**
 */
package ch.hilbri.assist.mapping.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Board Attributes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoardAttributes()
 * @model
 * @generated
 */
public enum BoardAttributes implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "None"),

	/**
	 * The '<em><b>MANUFACTURER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURER_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURER(0, "MANUFACTURER", "Manufacturer"),

	/**
	 * The '<em><b>POWERSUPPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWERSUPPLY_VALUE
	 * @generated
	 * @ordered
	 */
	POWERSUPPLY(0, "POWERSUPPLY", "PowerSupply"),

	/**
	 * The '<em><b>ASSURANCELEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSURANCELEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	ASSURANCELEVEL(0, "ASSURANCELEVEL", "AssuranceLevel"),

	/**
	 * The '<em><b>BOARDTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARDTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	BOARDTYPE(0, "BOARDTYPE", "BoardType");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model literal="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>MANUFACTURER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANUFACTURER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURER
	 * @model literal="Manufacturer"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURER_VALUE = 0;

	/**
	 * The '<em><b>POWERSUPPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POWERSUPPLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWERSUPPLY
	 * @model literal="PowerSupply"
	 * @generated
	 * @ordered
	 */
	public static final int POWERSUPPLY_VALUE = 0;

	/**
	 * The '<em><b>ASSURANCELEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSURANCELEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSURANCELEVEL
	 * @model literal="AssuranceLevel"
	 * @generated
	 * @ordered
	 */
	public static final int ASSURANCELEVEL_VALUE = 0;

	/**
	 * The '<em><b>BOARDTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOARDTYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOARDTYPE
	 * @model literal="BoardType"
	 * @generated
	 * @ordered
	 */
	public static final int BOARDTYPE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Board Attributes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BoardAttributes[] VALUES_ARRAY =
		new BoardAttributes[] {
			NONE,
			MANUFACTURER,
			POWERSUPPLY,
			ASSURANCELEVEL,
			BOARDTYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Board Attributes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BoardAttributes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Board Attributes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardAttributes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoardAttributes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Board Attributes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardAttributes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoardAttributes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Board Attributes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardAttributes get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BoardAttributes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BoardAttributes
