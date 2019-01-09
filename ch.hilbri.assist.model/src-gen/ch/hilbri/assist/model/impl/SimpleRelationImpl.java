/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.SimpleRelation;
import ch.hilbri.assist.model.Task;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.SimpleRelationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SimpleRelationImpl#getTaskNames <em>Task Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleRelationImpl extends SchedulingRestrictionImpl implements SimpleRelation {
    /**
     * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTasks()
     * @generated
     * @ordered
     */
    protected EList<Task> tasks;

    /**
     * The default value of the '{@link #getTaskNames() <em>Task Names</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskNames()
     * @generated
     * @ordered
     */
    protected static final String TASK_NAMES_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.SIMPLE_RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Task> getTasks() {
        if (tasks == null) {
            tasks = new EObjectResolvingEList<Task>(Task.class, this, ModelPackage.SIMPLE_RELATION__TASKS);
        }
        return tasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTaskNames() {
        return IterableExtensions.join(this.getTasks(), ", ");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.SIMPLE_RELATION__TASKS:
                return getTasks();
            case ModelPackage.SIMPLE_RELATION__TASK_NAMES:
                return getTaskNames();
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
            case ModelPackage.SIMPLE_RELATION__TASKS:
                getTasks().clear();
                getTasks().addAll((Collection<? extends Task>)newValue);
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
            case ModelPackage.SIMPLE_RELATION__TASKS:
                getTasks().clear();
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
            case ModelPackage.SIMPLE_RELATION__TASKS:
                return tasks != null && !tasks.isEmpty();
            case ModelPackage.SIMPLE_RELATION__TASK_NAMES:
                return TASK_NAMES_EDEFAULT == null ? getTaskNames() != null : !TASK_NAMES_EDEFAULT.equals(getTaskNames());
        }
        return super.eIsSet(featureID);
    }

} //SimpleRelationImpl
