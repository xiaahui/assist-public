/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.BoardAttributes;
import ch.hilbri.assist.datamodel.model.BoxAttributes;
import ch.hilbri.assist.datamodel.model.CompartmentAttributes;
import ch.hilbri.assist.datamodel.model.DissimilarityEntry;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProcessorAttributes;

import com.google.common.base.Objects;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dissimilarity Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl#getCompartmentAttribute <em>Compartment Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl#getBoxAttribute <em>Box Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl#getBoardAttribute <em>Board Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityEntryImpl#getProcessorAttribute <em>Processor Attribute</em>}</li>
 * </ul>
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
		return ModelPackage.Literals.DISSIMILARITY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getLevel() {
		HardwareArchitectureLevelType _xifexpression = null;
		CompartmentAttributes _compartmentAttribute = this.getCompartmentAttribute();
		boolean _notEquals = (!Objects.equal(_compartmentAttribute, CompartmentAttributes.NONE));
		if (_notEquals) {
			_xifexpression = HardwareArchitectureLevelType.COMPARTMENT;
		}
		else {
			HardwareArchitectureLevelType _xifexpression_1 = null;
			BoxAttributes _boxAttribute = this.getBoxAttribute();
			boolean _notEquals_1 = (!Objects.equal(_boxAttribute, BoxAttributes.NONE));
			if (_notEquals_1) {
				_xifexpression_1 = HardwareArchitectureLevelType.BOX;
			}
			else {
				HardwareArchitectureLevelType _xifexpression_2 = null;
				BoardAttributes _boardAttribute = this.getBoardAttribute();
				boolean _notEquals_2 = (!Objects.equal(_boardAttribute, BoardAttributes.NONE));
				if (_notEquals_2) {
					_xifexpression_2 = HardwareArchitectureLevelType.BOARD;
				}
				else {
					HardwareArchitectureLevelType _xifexpression_3 = null;
					ProcessorAttributes _processorAttribute = this.getProcessorAttribute();
					boolean _notEquals_3 = (!Objects.equal(_processorAttribute, ProcessorAttributes.NONE));
					if (_notEquals_3) {
						_xifexpression_3 = HardwareArchitectureLevelType.PROCESSOR;
					}
					else {
						_xifexpression_3 = null;
					}
					_xifexpression_2 = _xifexpression_3;
				}
				_xifexpression_1 = _xifexpression_2;
			}
			_xifexpression = _xifexpression_1;
		}
		return _xifexpression;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE, oldCompartmentAttribute, compartmentAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE, oldBoxAttribute, boxAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE, oldBoardAttribute, boardAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE, oldProcessorAttribute, processorAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DISSIMILARITY_ENTRY__LEVEL:
				return getLevel();
			case ModelPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				return getCompartmentAttribute();
			case ModelPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				return getBoxAttribute();
			case ModelPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				return getBoardAttribute();
			case ModelPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
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
			case ModelPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				setCompartmentAttribute((CompartmentAttributes)newValue);
				return;
			case ModelPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				setBoxAttribute((BoxAttributes)newValue);
				return;
			case ModelPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				setBoardAttribute((BoardAttributes)newValue);
				return;
			case ModelPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
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
			case ModelPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				setCompartmentAttribute(COMPARTMENT_ATTRIBUTE_EDEFAULT);
				return;
			case ModelPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				setBoxAttribute(BOX_ATTRIBUTE_EDEFAULT);
				return;
			case ModelPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				setBoardAttribute(BOARD_ATTRIBUTE_EDEFAULT);
				return;
			case ModelPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
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
			case ModelPackage.DISSIMILARITY_ENTRY__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case ModelPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
				return compartmentAttribute != COMPARTMENT_ATTRIBUTE_EDEFAULT;
			case ModelPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
				return boxAttribute != BOX_ATTRIBUTE_EDEFAULT;
			case ModelPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
				return boardAttribute != BOARD_ATTRIBUTE_EDEFAULT;
			case ModelPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
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
		result.append(" (compartmentAttribute: ");
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
