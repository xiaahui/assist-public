/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.RelationWithManyTasks;
import ch.hilbri.assist.model.Task;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation With Many Tasks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.RelationWithManyTasksImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationWithManyTasksImpl extends SchedulingRestrictionImpl implements RelationWithManyTasks {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationWithManyTasksImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.RELATION_WITH_MANY_TASKS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Task> getTasks() {
        if (tasks == null) {
            tasks = new EObjectResolvingEList<Task>(Task.class, this, ModelPackage.RELATION_WITH_MANY_TASKS__TASKS);
        }
        return tasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.RELATION_WITH_MANY_TASKS__TASKS:
                return getTasks();
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
            case ModelPackage.RELATION_WITH_MANY_TASKS__TASKS:
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
            case ModelPackage.RELATION_WITH_MANY_TASKS__TASKS:
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
            case ModelPackage.RELATION_WITH_MANY_TASKS__TASKS:
                return tasks != null && !tasks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RelationWithManyTasksImpl
