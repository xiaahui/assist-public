/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.DissimilarityAttributes;
import ch.hilbri.assist.model.DissimilarityEntry;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.ModelPackage;

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
 *   <li>{@link ch.hilbri.assist.model.impl.DissimilarityEntryImpl#getDissimilarityAttribute <em>Dissimilarity Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.DissimilarityEntryImpl#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DissimilarityEntryImpl extends DissimilarityClauseImpl implements DissimilarityEntry {
    /**
     * The default value of the '{@link #getDissimilarityAttribute() <em>Dissimilarity Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDissimilarityAttribute()
     * @generated
     * @ordered
     */
    protected static final DissimilarityAttributes DISSIMILARITY_ATTRIBUTE_EDEFAULT = DissimilarityAttributes.COMPARTMENT_MANUFACTURER;

    /**
     * The cached value of the '{@link #getDissimilarityAttribute() <em>Dissimilarity Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDissimilarityAttribute()
     * @generated
     * @ordered
     */
    protected DissimilarityAttributes dissimilarityAttribute = DISSIMILARITY_ATTRIBUTE_EDEFAULT;

    /**
     * The default value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHardwareLevel()
     * @generated
     * @ordered
     */
    protected static final HardwareArchitectureLevelType HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

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
    public DissimilarityAttributes getDissimilarityAttribute() {
        return dissimilarityAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDissimilarityAttribute(DissimilarityAttributes newDissimilarityAttribute) {
        DissimilarityAttributes oldDissimilarityAttribute = dissimilarityAttribute;
        dissimilarityAttribute = newDissimilarityAttribute == null ? DISSIMILARITY_ATTRIBUTE_EDEFAULT : newDissimilarityAttribute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE, oldDissimilarityAttribute, dissimilarityAttribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HardwareArchitectureLevelType getHardwareLevel() {
        DissimilarityAttributes _dissimilarityAttribute = this.getDissimilarityAttribute();
        if (_dissimilarityAttribute != null) {
            switch (_dissimilarityAttribute) {
                case COMPARTMENT_MANUFACTURER:
                    return HardwareArchitectureLevelType.COMPARTMENT;
                case COMPARTMENT_POWERSUPPLY:
                    return HardwareArchitectureLevelType.COMPARTMENT;
                case BOX_MANUFACTURER:
                    return HardwareArchitectureLevelType.BOX;
                case BOARD_MANUFACTURER:
                    return HardwareArchitectureLevelType.BOARD;
                case BOARD_BOARDTYPE:
                    return HardwareArchitectureLevelType.BOARD;
                case BOARD_POWERSUPPLY:
                    return HardwareArchitectureLevelType.BOARD;
                case BOARD_ASSURANCELEVEL:
                    return HardwareArchitectureLevelType.BOARD;
                case PROCESSOR_MANUFACTURER:
                    return HardwareArchitectureLevelType.PROCESSOR;
                case PROCESSOR_PROCESSORTYPE:
                    return HardwareArchitectureLevelType.PROCESSOR;
                case CORE_ARCHITECTURE:
                    return HardwareArchitectureLevelType.CORE;
                default:
                    break;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE:
                return getDissimilarityAttribute();
            case ModelPackage.DISSIMILARITY_ENTRY__HARDWARE_LEVEL:
                return getHardwareLevel();
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
            case ModelPackage.DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE:
                setDissimilarityAttribute((DissimilarityAttributes)newValue);
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
            case ModelPackage.DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE:
                setDissimilarityAttribute(DISSIMILARITY_ATTRIBUTE_EDEFAULT);
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
            case ModelPackage.DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE:
                return dissimilarityAttribute != DISSIMILARITY_ATTRIBUTE_EDEFAULT;
            case ModelPackage.DISSIMILARITY_ENTRY__HARDWARE_LEVEL:
                return getHardwareLevel() != HARDWARE_LEVEL_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (dissimilarityAttribute: ");
        result.append(dissimilarityAttribute);
        result.append(')');
        return result.toString();
    }

} //DissimilarityEntryImpl
