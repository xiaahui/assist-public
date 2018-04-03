/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.RestrictionAlternative;
import ch.hilbri.assist.model.RestrictionAlternatives;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Alternatives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.RestrictionAlternativesImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionAlternativesImpl extends MinimalEObjectImpl.Container implements RestrictionAlternatives {
    /**
     * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlternatives()
     * @generated
     * @ordered
     */
    protected EList<RestrictionAlternative> alternatives;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionAlternativesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.RESTRICTION_ALTERNATIVES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RestrictionAlternative> getAlternatives() {
        if (alternatives == null) {
            alternatives = new EObjectContainmentEList<RestrictionAlternative>(RestrictionAlternative.class, this, ModelPackage.RESTRICTION_ALTERNATIVES__ALTERNATIVES);
        }
        return alternatives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.RESTRICTION_ALTERNATIVES__ALTERNATIVES:
                return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.RESTRICTION_ALTERNATIVES__ALTERNATIVES:
                return getAlternatives();
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
            case ModelPackage.RESTRICTION_ALTERNATIVES__ALTERNATIVES:
                getAlternatives().clear();
                getAlternatives().addAll((Collection<? extends RestrictionAlternative>)newValue);
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
            case ModelPackage.RESTRICTION_ALTERNATIVES__ALTERNATIVES:
                getAlternatives().clear();
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
            case ModelPackage.RESTRICTION_ALTERNATIVES__ALTERNATIVES:
                return alternatives != null && !alternatives.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RestrictionAlternativesImpl
