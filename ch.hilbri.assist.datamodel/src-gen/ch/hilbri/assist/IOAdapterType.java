/**
 */
package ch.hilbri.assist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IO Adapter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.AssistPackage#getIOAdapterType()
 * @model
 * @generated
 */
public enum IOAdapterType implements Enumerator {
	/**
	 * The '<em><b>CAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_VALUE
	 * @generated
	 * @ordered
	 */
	CAN(0, "CAN", "Can"),

	/**
	 * The '<em><b>ELB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELB_VALUE
	 * @generated
	 * @ordered
	 */
	ELB(0, "ELB", "Enhanced Local Bus"),

	/**
	 * The '<em><b>ETH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETH_VALUE
	 * @generated
	 * @ordered
	 */
	ETH(0, "ETH", "Ethernet"),

	/**
	 * The '<em><b>ANALOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG(0, "ANALOG", "Analog"),

	/**
	 * The '<em><b>DIGITAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL(0, "DIGITAL", "Digital"),

	/**
	 * The '<em><b>SERIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL(0, "SERIAL", "Serial"),

	/**
	 * The '<em><b>CUSTOM0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM0_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM0(0, "CUSTOM0", "Custom Type 0"),

	/**
	 * The '<em><b>CUSTOM1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM1_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM1(0, "CUSTOM1", "Custom Type 1"),

	/**
	 * The '<em><b>CUSTOM2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM2_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM2(0, "CUSTOM2", "Custom Type 2"),

	/**
	 * The '<em><b>CUSTOM3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM3_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM3(0, "CUSTOM3", "Custom Type 3"),

	/**
	 * The '<em><b>CUSTOM4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM4_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM4(0, "CUSTOM4", "Custom Type 4"),

	/**
	 * The '<em><b>CUSTOM5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM5_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM5(0, "CUSTOM5", "Custom Type 5"),

	/**
	 * The '<em><b>CUSTOM6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM6_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM6(0, "CUSTOM6", "Custom Type 6"),

	/**
	 * The '<em><b>CUSTOM7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM7_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM7(0, "CUSTOM7", "Custom Type 7"),

	/**
	 * The '<em><b>CUSTOM8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM8_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM8(0, "CUSTOM8", "Custom Type 8"),

	/**
	 * The '<em><b>CUSTOM9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM9_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM9(0, "CUSTOM9", "Custom Type 9"),

	/**
	 * The '<em><b>CUSTOM10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM10_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM10(0, "CUSTOM10", "Custom Type 10"),

	/**
	 * The '<em><b>CUSTOM11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM11_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM11(0, "CUSTOM11", "Custom Type 11"),

	/**
	 * The '<em><b>CUSTOM12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM12_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM12(0, "CUSTOM12", "Custom Type 12"),

	/**
	 * The '<em><b>CUSTOM13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM13_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM13(0, "CUSTOM13", "Custom Type 13"),

	/**
	 * The '<em><b>CUSTOM14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM14_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM14(0, "CUSTOM14", "Custom Type 14"),

	/**
	 * The '<em><b>CUSTOM15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM15_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM15(0, "CUSTOM15", "Custom Type 15"),

	/**
	 * The '<em><b>CUSTOM16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM16_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM16(0, "CUSTOM16", "Custom Type 16"),

	/**
	 * The '<em><b>CUSTOM17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM17_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM17(0, "CUSTOM17", "Custom Type 17"),

	/**
	 * The '<em><b>CUSTOM18</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM18_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM18(0, "CUSTOM18", "Custom Type 18"),

	/**
	 * The '<em><b>CUSTOM19</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM19_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM19(0, "CUSTOM19", "Custom Type 19"),

	/**
	 * The '<em><b>CUSTOM20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM20_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM20(0, "CUSTOM20", "Custom Type 20"),

	/**
	 * The '<em><b>CUSTOM21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM21_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM21(0, "CUSTOM21", "Custom Type 21"),

	/**
	 * The '<em><b>CUSTOM22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM22_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM22(0, "CUSTOM22", "Custom Type 22"),

	/**
	 * The '<em><b>CUSTOM23</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM23_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM23(0, "CUSTOM23", "Custom Type 23"),

	/**
	 * The '<em><b>CUSTOM24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM24_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM24(0, "CUSTOM24", "Custom Type 24"),

	/**
	 * The '<em><b>CUSTOM25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM25_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM25(0, "CUSTOM25", "Custom Type 25"),

	/**
	 * The '<em><b>CUSTOM26</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM26_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM26(0, "CUSTOM26", "Custom Type 26"),

	/**
	 * The '<em><b>CUSTOM27</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM27_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM27(0, "CUSTOM27", "Custom Type 27"),

	/**
	 * The '<em><b>CUSTOM28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM28_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM28(0, "CUSTOM28", "Custom Type 28"),

	/**
	 * The '<em><b>CUSTOM29</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM29_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM29(0, "CUSTOM29", "Custom Type 29"),

	/**
	 * The '<em><b>CUSTOM30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM30_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM30(0, "CUSTOM30", "Custom Type 30"),

	/**
	 * The '<em><b>CUSTOM31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM31_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM31(0, "CUSTOM31", "Custom Type 31"),

	/**
	 * The '<em><b>CUSTOM32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM32_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM32(0, "CUSTOM32", "Custom Type 32"),

	/**
	 * The '<em><b>CUSTOM33</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM33_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM33(0, "CUSTOM33", "Custom Type 33"),

	/**
	 * The '<em><b>CUSTOM34</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM34_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM34(0, "CUSTOM34", "Custom Type 34"),

	/**
	 * The '<em><b>CUSTOM35</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM35_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM35(0, "CUSTOM35", "Custom Type 35"),

	/**
	 * The '<em><b>CUSTOM36</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM36_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM36(0, "CUSTOM36", "Custom Type 36"),

	/**
	 * The '<em><b>CUSTOM37</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM37_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM37(0, "CUSTOM37", "Custom Type 37"),

	/**
	 * The '<em><b>CUSTOM38</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM38_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM38(0, "CUSTOM38", "Custom Type 38"),

	/**
	 * The '<em><b>CUSTOM39</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM39_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM39(0, "CUSTOM39", "Custom Type 39");

	/**
	 * The '<em><b>CAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAN
	 * @model literal="Can"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_VALUE = 0;

	/**
	 * The '<em><b>ELB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELB
	 * @model literal="Enhanced Local Bus"
	 * @generated
	 * @ordered
	 */
	public static final int ELB_VALUE = 0;

	/**
	 * The '<em><b>ETH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ETH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETH
	 * @model literal="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ETH_VALUE = 0;

	/**
	 * The '<em><b>ANALOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANALOG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALOG
	 * @model literal="Analog"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE = 0;

	/**
	 * The '<em><b>DIGITAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIGITAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITAL
	 * @model literal="Digital"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_VALUE = 0;

	/**
	 * The '<em><b>SERIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @model literal="Serial"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM0
	 * @model literal="Custom Type 0"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM0_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM1
	 * @model literal="Custom Type 1"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM1_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM2
	 * @model literal="Custom Type 2"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM2_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM3
	 * @model literal="Custom Type 3"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM3_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM4
	 * @model literal="Custom Type 4"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM4_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM5
	 * @model literal="Custom Type 5"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM5_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM6
	 * @model literal="Custom Type 6"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM6_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM7
	 * @model literal="Custom Type 7"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM7_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM8
	 * @model literal="Custom Type 8"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM8_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM9
	 * @model literal="Custom Type 9"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM9_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM10
	 * @model literal="Custom Type 10"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM10_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM11
	 * @model literal="Custom Type 11"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM11_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM12</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM12
	 * @model literal="Custom Type 12"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM12_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM13</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM13
	 * @model literal="Custom Type 13"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM13_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM14</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM14
	 * @model literal="Custom Type 14"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM14_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM15</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM15
	 * @model literal="Custom Type 15"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM15_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM16
	 * @model literal="Custom Type 16"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM16_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM17
	 * @model literal="Custom Type 17"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM17_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM18</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM18</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM18
	 * @model literal="Custom Type 18"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM18_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM19</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM19</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM19
	 * @model literal="Custom Type 19"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM19_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM20</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM20
	 * @model literal="Custom Type 20"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM20_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM21</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM21
	 * @model literal="Custom Type 21"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM21_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM22</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM22
	 * @model literal="Custom Type 22"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM22_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM23</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM23</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM23
	 * @model literal="Custom Type 23"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM23_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM24</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM24
	 * @model literal="Custom Type 24"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM24_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM25</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM25
	 * @model literal="Custom Type 25"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM25_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM26</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM26</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM26
	 * @model literal="Custom Type 26"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM26_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM27</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM27</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM27
	 * @model literal="Custom Type 27"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM27_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM28</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM28
	 * @model literal="Custom Type 28"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM28_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM29</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM29</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM29
	 * @model literal="Custom Type 29"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM29_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM30</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM30
	 * @model literal="Custom Type 30"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM30_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM31</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM31
	 * @model literal="Custom Type 31"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM31_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM32
	 * @model literal="Custom Type 32"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM32_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM33</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM33</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM33
	 * @model literal="Custom Type 33"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM33_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM34</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM34</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM34
	 * @model literal="Custom Type 34"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM34_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM35</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM35</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM35
	 * @model literal="Custom Type 35"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM35_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM36</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM36</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM36
	 * @model literal="Custom Type 36"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM36_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM37</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM37</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM37
	 * @model literal="Custom Type 37"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM37_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM38</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM38</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM38
	 * @model literal="Custom Type 38"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM38_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM39</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM39</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM39
	 * @model literal="Custom Type 39"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM39_VALUE = 0;

	/**
	 * An array of all the '<em><b>IO Adapter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IOAdapterType[] VALUES_ARRAY =
		new IOAdapterType[] {
			CAN,
			ELB,
			ETH,
			ANALOG,
			DIGITAL,
			SERIAL,
			CUSTOM0,
			CUSTOM1,
			CUSTOM2,
			CUSTOM3,
			CUSTOM4,
			CUSTOM5,
			CUSTOM6,
			CUSTOM7,
			CUSTOM8,
			CUSTOM9,
			CUSTOM10,
			CUSTOM11,
			CUSTOM12,
			CUSTOM13,
			CUSTOM14,
			CUSTOM15,
			CUSTOM16,
			CUSTOM17,
			CUSTOM18,
			CUSTOM19,
			CUSTOM20,
			CUSTOM21,
			CUSTOM22,
			CUSTOM23,
			CUSTOM24,
			CUSTOM25,
			CUSTOM26,
			CUSTOM27,
			CUSTOM28,
			CUSTOM29,
			CUSTOM30,
			CUSTOM31,
			CUSTOM32,
			CUSTOM33,
			CUSTOM34,
			CUSTOM35,
			CUSTOM36,
			CUSTOM37,
			CUSTOM38,
			CUSTOM39,
		};

	/**
	 * A public read-only list of all the '<em><b>IO Adapter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IOAdapterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IO Adapter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOAdapterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOAdapterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Adapter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOAdapterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOAdapterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Adapter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOAdapterType get(int value) {
		switch (value) {
			case CAN_VALUE: return CAN;
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
	private IOAdapterType(int value, String name, String literal) {
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
	
} //IOAdapterType
