/**
 */
package ch.hilbri.assist.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.model.ModelPackage#getColor()
 * @model
 * @generated
 */
public enum Color implements Enumerator {
    /**
     * The '<em><b>NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE(-1, "NONE", "none"),

    /**
     * The '<em><b>BLACK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BLACK_VALUE
     * @generated
     * @ordered
     */
    BLACK(0, "BLACK", "black"),

    /**
     * The '<em><b>BLUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BLUE_VALUE
     * @generated
     * @ordered
     */
    BLUE(1, "BLUE", "blue"),

    /**
     * The '<em><b>CYAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CYAN_VALUE
     * @generated
     * @ordered
     */
    CYAN(2, "CYAN", "cyan"),

    /**
     * The '<em><b>GRAY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GRAY_VALUE
     * @generated
     * @ordered
     */
    GRAY(3, "GRAY", "gray"),

    /**
     * The '<em><b>GREEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREEN_VALUE
     * @generated
     * @ordered
     */
    GREEN(4, "GREEN", "green"),

    /**
     * The '<em><b>MAGENTA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAGENTA_VALUE
     * @generated
     * @ordered
     */
    MAGENTA(5, "MAGENTA", "magenta"),

    /**
     * The '<em><b>RED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RED_VALUE
     * @generated
     * @ordered
     */
    RED(6, "RED", "red"),

    /**
     * The '<em><b>WHITE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WHITE_VALUE
     * @generated
     * @ordered
     */
    WHITE(7, "WHITE", "white"),

    /**
     * The '<em><b>YELLOW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YELLOW_VALUE
     * @generated
     * @ordered
     */
    YELLOW(8, "YELLOW", "yellow"),

    /**
     * The '<em><b>DARK BLUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DARK_BLUE_VALUE
     * @generated
     * @ordered
     */
    DARK_BLUE(9, "DARK_BLUE", "darkblue"),

    /**
     * The '<em><b>DARK CYAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DARK_CYAN_VALUE
     * @generated
     * @ordered
     */
    DARK_CYAN(10, "DARK_CYAN", "darkcyan"),

    /**
     * The '<em><b>DARK GRAY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DARK_GRAY_VALUE
     * @generated
     * @ordered
     */
    DARK_GRAY(11, "DARK_GRAY", "darkgray"),

    /**
     * The '<em><b>DARK GREEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DARK_GREEN_VALUE
     * @generated
     * @ordered
     */
    DARK_GREEN(12, "DARK_GREEN", "darkgreen"),

    /**
     * The '<em><b>DARK MAGENTA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DARK_MAGENTA_VALUE
     * @generated
     * @ordered
     */
    DARK_MAGENTA(13, "DARK_MAGENTA", "darkmagenta"),

    /**
     * The '<em><b>DARK RED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DARK_RED_VALUE
     * @generated
     * @ordered
     */
    DARK_RED(14, "DARK_RED", "darkred"),

    /**
     * The '<em><b>DARK YELLOW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DARK_YELLOW_VALUE
     * @generated
     * @ordered
     */
    DARK_YELLOW(15, "DARK_YELLOW", "darkyellow");

    /**
     * The '<em><b>NONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model literal="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = -1;

    /**
     * The '<em><b>BLACK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BLACK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BLACK
     * @model literal="black"
     * @generated
     * @ordered
     */
    public static final int BLACK_VALUE = 0;

    /**
     * The '<em><b>BLUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BLUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BLUE
     * @model literal="blue"
     * @generated
     * @ordered
     */
    public static final int BLUE_VALUE = 1;

    /**
     * The '<em><b>CYAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CYAN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CYAN
     * @model literal="cyan"
     * @generated
     * @ordered
     */
    public static final int CYAN_VALUE = 2;

    /**
     * The '<em><b>GRAY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GRAY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GRAY
     * @model literal="gray"
     * @generated
     * @ordered
     */
    public static final int GRAY_VALUE = 3;

    /**
     * The '<em><b>GREEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GREEN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GREEN
     * @model literal="green"
     * @generated
     * @ordered
     */
    public static final int GREEN_VALUE = 4;

    /**
     * The '<em><b>MAGENTA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MAGENTA</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAGENTA
     * @model literal="magenta"
     * @generated
     * @ordered
     */
    public static final int MAGENTA_VALUE = 5;

    /**
     * The '<em><b>RED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RED
     * @model literal="red"
     * @generated
     * @ordered
     */
    public static final int RED_VALUE = 6;

    /**
     * The '<em><b>WHITE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WHITE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WHITE
     * @model literal="white"
     * @generated
     * @ordered
     */
    public static final int WHITE_VALUE = 7;

    /**
     * The '<em><b>YELLOW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>YELLOW</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YELLOW
     * @model literal="yellow"
     * @generated
     * @ordered
     */
    public static final int YELLOW_VALUE = 8;

    /**
     * The '<em><b>DARK BLUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DARK BLUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DARK_BLUE
     * @model literal="darkblue"
     * @generated
     * @ordered
     */
    public static final int DARK_BLUE_VALUE = 9;

    /**
     * The '<em><b>DARK CYAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DARK CYAN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DARK_CYAN
     * @model literal="darkcyan"
     * @generated
     * @ordered
     */
    public static final int DARK_CYAN_VALUE = 10;

    /**
     * The '<em><b>DARK GRAY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DARK GRAY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DARK_GRAY
     * @model literal="darkgray"
     * @generated
     * @ordered
     */
    public static final int DARK_GRAY_VALUE = 11;

    /**
     * The '<em><b>DARK GREEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DARK GREEN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DARK_GREEN
     * @model literal="darkgreen"
     * @generated
     * @ordered
     */
    public static final int DARK_GREEN_VALUE = 12;

    /**
     * The '<em><b>DARK MAGENTA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DARK MAGENTA</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DARK_MAGENTA
     * @model literal="darkmagenta"
     * @generated
     * @ordered
     */
    public static final int DARK_MAGENTA_VALUE = 13;

    /**
     * The '<em><b>DARK RED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DARK RED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DARK_RED
     * @model literal="darkred"
     * @generated
     * @ordered
     */
    public static final int DARK_RED_VALUE = 14;

    /**
     * The '<em><b>DARK YELLOW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DARK YELLOW</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DARK_YELLOW
     * @model literal="darkyellow"
     * @generated
     * @ordered
     */
    public static final int DARK_YELLOW_VALUE = 15;

    /**
     * An array of all the '<em><b>Color</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Color[] VALUES_ARRAY =
        new Color[] {
            NONE,
            BLACK,
            BLUE,
            CYAN,
            GRAY,
            GREEN,
            MAGENTA,
            RED,
            WHITE,
            YELLOW,
            DARK_BLUE,
            DARK_CYAN,
            DARK_GRAY,
            DARK_GREEN,
            DARK_MAGENTA,
            DARK_RED,
            DARK_YELLOW,
        };

    /**
     * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Color get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Color result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Color</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Color getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Color result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Color get(int value) {
        switch (value) {
            case NONE_VALUE: return NONE;
            case BLACK_VALUE: return BLACK;
            case BLUE_VALUE: return BLUE;
            case CYAN_VALUE: return CYAN;
            case GRAY_VALUE: return GRAY;
            case GREEN_VALUE: return GREEN;
            case MAGENTA_VALUE: return MAGENTA;
            case RED_VALUE: return RED;
            case WHITE_VALUE: return WHITE;
            case YELLOW_VALUE: return YELLOW;
            case DARK_BLUE_VALUE: return DARK_BLUE;
            case DARK_CYAN_VALUE: return DARK_CYAN;
            case DARK_GRAY_VALUE: return DARK_GRAY;
            case DARK_GREEN_VALUE: return DARK_GREEN;
            case DARK_MAGENTA_VALUE: return DARK_MAGENTA;
            case DARK_RED_VALUE: return DARK_RED;
            case DARK_YELLOW_VALUE: return DARK_YELLOW;
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
    private Color(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    
} //Color
