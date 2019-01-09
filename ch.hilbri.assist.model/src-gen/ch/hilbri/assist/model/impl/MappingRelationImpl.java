/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.MappingRelation;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.SoftwareElement;
import ch.hilbri.assist.model.Task;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingRelationImpl#getSoftwareElements <em>Software Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingRelationImpl#getHardwareLevel <em>Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingRelationImpl#getAllTasks <em>All Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingRelationImpl#getSoftwareElementNames <em>Software Element Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingRelationImpl extends MinimalEObjectImpl.Container implements MappingRelation {
    /**
     * The cached value of the '{@link #getSoftwareElements() <em>Software Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoftwareElements()
     * @generated
     * @ordered
     */
    protected EList<SoftwareElement> softwareElements;

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
     * The cached value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHardwareLevel()
     * @generated
     * @ordered
     */
    protected HardwareArchitectureLevelType hardwareLevel = HARDWARE_LEVEL_EDEFAULT;

    /**
     * The default value of the '{@link #getSoftwareElementNames() <em>Software Element Names</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoftwareElementNames()
     * @generated
     * @ordered
     */
    protected static final String SOFTWARE_ELEMENT_NAMES_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.MAPPING_RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SoftwareElement> getSoftwareElements() {
        if (softwareElements == null) {
            softwareElements = new EObjectResolvingEList<SoftwareElement>(SoftwareElement.class, this, ModelPackage.MAPPING_RELATION__SOFTWARE_ELEMENTS);
        }
        return softwareElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HardwareArchitectureLevelType getHardwareLevel() {
        return hardwareLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHardwareLevel(HardwareArchitectureLevelType newHardwareLevel) {
        HardwareArchitectureLevelType oldHardwareLevel = hardwareLevel;
        hardwareLevel = newHardwareLevel == null ? HARDWARE_LEVEL_EDEFAULT : newHardwareLevel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPING_RELATION__HARDWARE_LEVEL, oldHardwareLevel, hardwareLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EList<Task>> getAllTasks() {
        final List<EList<Task>> list = CollectionLiterals.<EList<Task>>newArrayList();
        EList<SoftwareElement> _softwareElements = this.getSoftwareElements();
        for (final SoftwareElement se : _softwareElements) {
            {
                if ((se instanceof Application)) {
                    list.add(((Application)se).getTasks());
                }
                if ((se instanceof Task)) {
                    list.add(ECollections.<Task>toEList(java.util.Collections.<Task>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<Task>newArrayList(((Task)se)))));
                }
            }
        }
        return ECollections.<EList<Task>>toEList(list);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSoftwareElementNames() {
        return IterableExtensions.join(this.getSoftwareElements(), ", ");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.MAPPING_RELATION__SOFTWARE_ELEMENTS:
                return getSoftwareElements();
            case ModelPackage.MAPPING_RELATION__HARDWARE_LEVEL:
                return getHardwareLevel();
            case ModelPackage.MAPPING_RELATION__ALL_TASKS:
                return getAllTasks();
            case ModelPackage.MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES:
                return getSoftwareElementNames();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.MAPPING_RELATION__SOFTWARE_ELEMENTS:
                getSoftwareElements().clear();
                getSoftwareElements().addAll((Collection<? extends SoftwareElement>)newValue);
                return;
            case ModelPackage.MAPPING_RELATION__HARDWARE_LEVEL:
                setHardwareLevel((HardwareArchitectureLevelType)newValue);
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
            case ModelPackage.MAPPING_RELATION__SOFTWARE_ELEMENTS:
                getSoftwareElements().clear();
                return;
            case ModelPackage.MAPPING_RELATION__HARDWARE_LEVEL:
                setHardwareLevel(HARDWARE_LEVEL_EDEFAULT);
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
            case ModelPackage.MAPPING_RELATION__SOFTWARE_ELEMENTS:
                return softwareElements != null && !softwareElements.isEmpty();
            case ModelPackage.MAPPING_RELATION__HARDWARE_LEVEL:
                return hardwareLevel != HARDWARE_LEVEL_EDEFAULT;
            case ModelPackage.MAPPING_RELATION__ALL_TASKS:
                return getAllTasks() != null;
            case ModelPackage.MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES:
                return SOFTWARE_ELEMENT_NAMES_EDEFAULT == null ? getSoftwareElementNames() != null : !SOFTWARE_ELEMENT_NAMES_EDEFAULT.equals(getSoftwareElementNames());
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
        result.append(" (hardwareLevel: ");
        result.append(hardwareLevel);
        result.append(')');
        return result.toString();
    }

} //MappingRelationImpl
