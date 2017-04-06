/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getSide <em>Side</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getEss <em>Ess</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getRamCapacity <em>Ram Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getRomCapacity <em>Rom Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getProcessors <em>Processors</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Board#getIoAdapters <em>Io Adapters</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends HardwareElementContainer {
	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_Manufacturer()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Board Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Type</em>' attribute.
	 * @see #setBoardType(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_BoardType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBoardType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getBoardType <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Type</em>' attribute.
	 * @see #getBoardType()
	 * @generated
	 */
	void setBoardType(String value);

	/**
	 * Returns the value of the '<em><b>Power Supply</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply</em>' attribute.
	 * @see #setPowerSupply(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_PowerSupply()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPowerSupply();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getPowerSupply <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply</em>' attribute.
	 * @see #getPowerSupply()
	 * @generated
	 */
	void setPowerSupply(String value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_Side()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Ess</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ess</em>' attribute.
	 * @see #setEss(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_Ess()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEss();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getEss <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ess</em>' attribute.
	 * @see #getEss()
	 * @generated
	 */
	void setEss(String value);

	/**
	 * Returns the value of the '<em><b>Assurance Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.DesignAssuranceLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
	 * @see #setAssuranceLevel(DesignAssuranceLevelType)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_AssuranceLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	DesignAssuranceLevelType getAssuranceLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getAssuranceLevel <em>Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(DesignAssuranceLevelType value);

	/**
	 * Returns the value of the '<em><b>Ram Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Capacity</em>' attribute.
	 * @see #setRamCapacity(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_RamCapacity()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getRamCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getRamCapacity <em>Ram Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Capacity</em>' attribute.
	 * @see #getRamCapacity()
	 * @generated
	 */
	void setRamCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Rom Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rom Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rom Capacity</em>' attribute.
	 * @see #setRomCapacity(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_RomCapacity()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getRomCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getRomCapacity <em>Rom Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom Capacity</em>' attribute.
	 * @see #getRomCapacity()
	 * @generated
	 */
	void setRomCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Box#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' container reference.
	 * @see #setBox(Box)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_Box()
	 * @see ch.hilbri.assist.mapping.model.Box#getBoards
	 * @model opposite="boards" transient="false"
	 * @generated
	 */
	Box getBox();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Board#getBox <em>Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box</em>' container reference.
	 * @see #getBox()
	 * @generated
	 */
	void setBox(Box value);

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Processor}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Processor#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_Processors()
	 * @see ch.hilbri.assist.mapping.model.Processor#getBoard
	 * @model opposite="board" containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Io Adapters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.IOAdapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Adapters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Adapters</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBoard_IoAdapters()
	 * @model containment="true"
	 * @generated
	 */
	EList<IOAdapter> getIoAdapters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Core%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.Core%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> _processors = this.getProcessors();\nfor (final <%ch.hilbri.assist.mapping.model.Processor%> p : _processors)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> _cores = p.getCores();\n\tlist.addAll(_cores);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Core> getAllCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" paramAdapterTypeUnique="false" paramMinProtectionLevelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.IOAdapter%>> _ioAdapters = this.getIoAdapters();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapter%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapter%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.mapping.model.IOAdapter%> it)\n\t{\n\t\t<%ch.hilbri.assist.mapping.model.IOAdapterType%> _adapterType = it.getAdapterType();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_adapterType, paramAdapterType));\n\t}\n};\nfinal <%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.IOAdapter%>> suitableTypeAdapters = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.mapping.model.IOAdapter%>>filter(_ioAdapters, _function);\nboolean _equals = <%com.google.common.base.Objects%>.equal(suitableTypeAdapters, null);\nif (_equals)\n{\n\treturn 0;\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapter%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapter%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.mapping.model.IOAdapter%> it)\n\t{\n\t\t<%ch.hilbri.assist.mapping.model.IOAdapterProtectionLevelType%> _protectionLevel = it.getProtectionLevel();\n\t\tint _ordinal = _protectionLevel.ordinal();\n\t\tint _ordinal_1 = paramMinProtectionLevel.ordinal();\n\t\treturn <%java.lang.Boolean%>.valueOf((_ordinal >= _ordinal_1));\n\t}\n};\nfinal <%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.IOAdapter%>> suiteableTypeAndProtectionLevel = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.mapping.model.IOAdapter%>>filter(suitableTypeAdapters, _function_1);\nboolean _equals_1 = <%com.google.common.base.Objects%>.equal(suiteableTypeAndProtectionLevel, null);\nif (_equals_1)\n{\n\treturn 0;\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapter%>, <%java.lang.Integer%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapter%>, <%java.lang.Integer%>>()\n{\n\tpublic <%java.lang.Integer%> apply(final <%ch.hilbri.assist.mapping.model.IOAdapter%> it)\n\t{\n\t\treturn <%java.lang.Integer%>.valueOf(it.getTotalCount());\n\t}\n};\nfinal int[] suiteableTypeAndProtectionLevelCount = ((int[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.mapping.model.IOAdapter%>, <%java.lang.Integer%>>map(suiteableTypeAndProtectionLevel, _function_2), int.class));\nint _size = ((<%java.util.List%><<%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(suiteableTypeAndProtectionLevelCount)).size();\nboolean _greaterThan = (_size > 1);\nif (_greaterThan)\n{\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>>()\n\t{\n\t\tpublic <%java.lang.Integer%> apply(final <%java.lang.Integer%> p1, final <%java.lang.Integer%> p2)\n\t\t{\n\t\t\treturn <%java.lang.Integer%>.valueOf(((p1).intValue() + (p2).intValue()));\n\t\t}\n\t};\n\treturn (int) <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Integer%>>reduce(((<%java.lang.Iterable%><? extends <%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(suiteableTypeAndProtectionLevelCount)), _function_3);\n}\nelse\n{\n\tint _size_1 = ((<%java.util.List%><<%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(suiteableTypeAndProtectionLevelCount)).size();\n\tboolean _equals_2 = (_size_1 == 1);\n\tif (_equals_2)\n\t{\n\t\treturn suiteableTypeAndProtectionLevelCount[0];\n\t}\n\telse\n\t{\n\t\tint _size_2 = ((<%java.util.List%><<%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(suiteableTypeAndProtectionLevelCount)).size();\n\t\tboolean _equals_3 = (_size_2 == 0);\n\t\tif (_equals_3)\n\t\t{\n\t\t\treturn 0;\n\t\t}\n\t\telse\n\t\t{\n\t\t\treturn (-1);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	int getSuitableAdapterCount(IOAdapterType paramAdapterType, IOAdapterProtectionLevelType paramMinProtectionLevel);

} // Board
