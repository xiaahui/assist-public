/**
 */
package ch.hilbri.assist.impl;

import ch.hilbri.assist.AssistPackage;
import ch.hilbri.assist.BoardAttributes;
import ch.hilbri.assist.BoxAttributes;
import ch.hilbri.assist.CompartmentAttributes;
import ch.hilbri.assist.DissimilarityEntry;
import ch.hilbri.assist.HardwareArchitectureLevelType;
import ch.hilbri.assist.ProcessorAttributes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dissimilarity Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.impl.DissimilarityEntryImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.impl.DissimilarityEntryImpl#getCompartmentAttribute <em>Compartment Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.impl.DissimilarityEntryImpl#getBoxAttribute <em>Box Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.impl.DissimilarityEntryImpl#getBoardAttribute <em>Board Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.impl.DissimilarityEntryImpl#getProcessorAttribute <em>Processor Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DissimilarityEntryImpl extends DissimilarityClauseImpl implements DissimilarityEntry {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareArchitectureLevelType LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected HardwareArchitectureLevelType level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompartmentAttribute() <em>Compartment Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final CompartmentAttributes COMPARTMENT_ATTRIBUTE_EDEFAULT = CompartmentAttributes.NONE;

	/**
	 * The cached value of the '{@link #getCompartmentAttribute() <em>Compartment Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentAttribute()
	 * @generated
	 * @ordered
	 */
	protected CompartmentAttributes compartmentAttribute = COMPARTMENT_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxAttribute() <em>Box Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final BoxAttributes BOX_ATTRIBUTE_EDEFAULT = BoxAttributes.NONE;

	/**
	 * The cached value of the '{@link #getBoxAttribute() <em>Box Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxAttribute()
	 * @generated
	 * @ordered
	 */
	protected BoxAttributes boxAttribute = BOX_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardAttribute() <em>Board Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final BoardAttributes BOARD_ATTRIBUTE_EDEFAULT = BoardAttributes.NONE;

	/**
	 * The cached value of the '{@link #getBoardAttribute() <em>Board Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardAttribute()
	 * @generated
	 * @ordered
	 */
	protected BoardAttributes boardAttribute = BOARD_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorAttribute() <em>Processor Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessorAttributes PROCESSOR_ATTRIBUTE_EDEFAULT = ProcessorAttributes.NONE;

	/**
	 * The cached value of the '{@link #getProcessorAttribute() <em>Processor Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorAttribute()
	 * @generated
	 * @ordered
	 */
	protected ProcessorAttributes processorAttribute = PROCESSOR_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssistPackage.Literals.DISSIMILARITY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(HardwareArchitectureLevelType newLevel) {
		HardwareArchitectureLevelType oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssistPackage.DISSIMILARITY_ENTRY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentAttributes getCompartmentAttribute() {
		return compartmentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentAttribute(CompartmentAttributes newCompartmentAttribute) {
		CompartmentAttributes oldCompartmentAttribute = compartmentAttribute;
		compartmentAttribute = newCompartmentAttribute == null ? COMPARTMENT_ATTRIBUTE_EDEFAULT : newCompartmentAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssistPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE, oldCompartmentAttribute, compartmentAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxAttributes getBoxAttribute() {
		return boxAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxAttribute(BoxAttributes newBoxAttribute) {
		BoxAttributes oldBoxAttribute = boxAttribute;
		boxAttribute = newBoxAttribute == null ? BOX_ATTRIBUTE_EDEFAULT : newBoxAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssistPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE, oldBoxAttribute, boxAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardAttributes getBoardAttribute() {
		return boardAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardAttribute(BoardAttributes newBoardAttribute) {
		BoardAttributes oldBoardAttribute = boardAttribute;
		boardAttribute = newBoardAttribute == null ? BOARD_ATTRIBUTE_EDEFAULT : newBoardAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssistPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE, oldBoardAttribute, boardAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorAttributes getProcessorAttribute() {
		return processorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorAttribute(ProcessorAttributes newProcessorAttribute) {
		ProcessorAttributes oldProcessorAttribute = processorAttribute;
		processorAttribute = newProcessorAttribute == null ? PROCESSOR_ATTRIBUTE_EDEFAULT : newProcessorAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssistPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE, oldProcessorAttribute, processorAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssistPackage.DISSIMILARITY_ENTRY__LEVEL:
				return getLevel();
			case AssistPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				return getCompartmentAttribute();
			case AssistPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				return getBoxAttribute();
			case AssistPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				return getBoardAttribute();
			case AssistPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
				return getProcessorAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssistPackage.DISSIMILARITY_ENTRY__LEVEL:
				setLevel((HardwareArchitectureLevelType)newValue);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				setCompartmentAttribute((CompartmentAttributes)newValue);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				setBoxAttribute((BoxAttributes)newValue);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				setBoardAttribute((BoardAttributes)newValue);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
				setProcessorAttribute((ProcessorAttributes)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssistPackage.DISSIMILARITY_ENTRY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				setCompartmentAttribute(COMPARTMENT_ATTRIBUTE_EDEFAULT);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				setBoxAttribute(BOX_ATTRIBUTE_EDEFAULT);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				setBoardAttribute(BOARD_ATTRIBUTE_EDEFAULT);
				return;
			case AssistPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
				setProcessorAttribute(PROCESSOR_ATTRIBUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssistPackage.DISSIMILARITY_ENTRY__LEVEL:
				return level != LEVEL_EDEFAULT;
			case AssistPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				return compartmentAttribute != COMPARTMENT_ATTRIBUTE_EDEFAULT;
			case AssistPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				return boxAttribute != BOX_ATTRIBUTE_EDEFAULT;
			case AssistPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				return boardAttribute != BOARD_ATTRIBUTE_EDEFAULT;
			case AssistPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
				return processorAttribute != PROCESSOR_ATTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (level: ");
		result.append(level);
		result.append(", compartmentAttribute: ");
		result.append(compartmentAttribute);
		result.append(", boxAttribute: ");
		result.append(boxAttribute);
		result.append(", boardAttribute: ");
		result.append(boardAttribute);
		result.append(", processorAttribute: ");
		result.append(processorAttribute);
		result.append(')');
		return result.toString();
	}

} //DissimilarityEntryImpl
