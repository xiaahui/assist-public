/**
 */
package ch.hilbri.assist.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hardware Architecture Level Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  **********************************************
 * <!-- end-model-doc -->
 * @see ch.hilbri.assist.model.ModelPackage#getHardwareArchitectureLevelType()
 * @model
 * @generated
 */
public enum HardwareArchitectureLevelType implements Enumerator {
    /**
     * The '<em><b>CORE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CORE_VALUE
     * @generated
     * @ordered
     */
    CORE(0, "CORE", "Core"),

    /**
     * The '<em><b>PROCESSOR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROCESSOR_VALUE
     * @generated
     * @ordered
     */
    PROCESSOR(1, "PROCESSOR", "Processor"),

    /**
     * The '<em><b>BOARD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOARD_VALUE
     * @generated
     * @ordered
     */
    BOARD(2, "BOARD", "Board"),

    /**
     * The '<em><b>BOX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOX_VALUE
     * @generated
     * @ordered
     */
    BOX(3, "BOX", "Box"),

    /**
     * The '<em><b>COMPARTMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPARTMENT_VALUE
     * @generated
     * @ordered
     */
    COMPARTMENT(4, "COMPARTMENT", "Compartment");

    /**
     * The '<em><b>CORE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CORE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CORE
     * @model literal="Core"
     * @generated
     * @ordered
     */
    public static final int CORE_VALUE = 0;

    /**
     * The '<em><b>PROCESSOR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PROCESSOR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PROCESSOR
     * @model literal="Processor"
     * @generated
     * @ordered
     */
    public static final int PROCESSOR_VALUE = 1;

    /**
     * The '<em><b>BOARD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BOARD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOARD
     * @model literal="Board"
     * @generated
     * @ordered
     */
    public static final int BOARD_VALUE = 2;

    /**
     * The '<em><b>BOX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BOX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOX
     * @model literal="Box"
     * @generated
     * @ordered
     */
    public static final int BOX_VALUE = 3;

    /**
     * The '<em><b>COMPARTMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COMPARTMENT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMPARTMENT
     * @model literal="Compartment"
     * @generated
     * @ordered
     */
    public static final int COMPARTMENT_VALUE = 4;

    /**
     * An array of all the '<em><b>Hardware Architecture Level Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final HardwareArchitectureLevelType[] VALUES_ARRAY =
        new HardwareArchitectureLevelType[] {
            CORE,
            PROCESSOR,
            BOARD,
            BOX,
            COMPARTMENT,
        };

    /**
     * A public read-only list of all the '<em><b>Hardware Architecture Level Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<HardwareArchitectureLevelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Hardware Architecture Level Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HardwareArchitectureLevelType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            HardwareArchitectureLevelType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Hardware Architecture Level Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HardwareArchitectureLevelType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            HardwareArchitectureLevelType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Hardware Architecture Level Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HardwareArchitectureLevelType get(int value) {
        switch (value) {
            case CORE_VALUE: return CORE;
            case PROCESSOR_VALUE: return PROCESSOR;
            case BOARD_VALUE: return BOARD;
            case BOX_VALUE: return BOX;
            case COMPARTMENT_VALUE: return COMPARTMENT;
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
    private HardwareArchitectureLevelType(int value, String name, String literal) {
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
    
} //HardwareArchitectureLevelType
