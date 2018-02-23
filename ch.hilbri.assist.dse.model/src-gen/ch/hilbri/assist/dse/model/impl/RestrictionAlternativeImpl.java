/**
 */
package ch.hilbri.assist.dse.model.impl;

import ch.hilbri.assist.dse.model.ModelPackage;
import ch.hilbri.assist.dse.model.RestrictionAlternative;

import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.DislocalityRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.dse.model.impl.RestrictionAlternativeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.dse.model.impl.RestrictionAlternativeImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.dse.model.impl.RestrictionAlternativeImpl#getColocalityRelations <em>Colocality Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionAlternativeImpl extends MinimalEObjectImpl.Container implements RestrictionAlternative {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDislocalityRelations() <em>Dislocality Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDislocalityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DislocalityRelation> dislocalityRelations;

	/**
	 * The cached value of the '{@link #getColocalityRelations() <em>Colocality Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColocalityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ColocalityRelation> colocalityRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESTRICTION_ALTERNATIVE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESTRICTION_ALTERNATIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DislocalityRelation> getDislocalityRelations() {
		if (dislocalityRelations == null) {
			dislocalityRelations = new EObjectContainmentEList<DislocalityRelation>(DislocalityRelation.class, this, ModelPackage.RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS);
		}
		return dislocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColocalityRelation> getColocalityRelations() {
		if (colocalityRelations == null) {
			colocalityRelations = new EObjectContainmentEList<ColocalityRelation>(ColocalityRelation.class, this, ModelPackage.RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS);
		}
		return colocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS:
				return ((InternalEList<?>)getDislocalityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS:
				return ((InternalEList<?>)getColocalityRelations()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RESTRICTION_ALTERNATIVE__NAME:
				return getName();
			case ModelPackage.RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS:
				return getDislocalityRelations();
			case ModelPackage.RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS:
				return getColocalityRelations();
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
			case ModelPackage.RESTRICTION_ALTERNATIVE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				getDislocalityRelations().addAll((Collection<? extends DislocalityRelation>)newValue);
				return;
			case ModelPackage.RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS:
				getColocalityRelations().clear();
				getColocalityRelations().addAll((Collection<? extends ColocalityRelation>)newValue);
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
			case ModelPackage.RESTRICTION_ALTERNATIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				return;
			case ModelPackage.RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS:
				getColocalityRelations().clear();
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
			case ModelPackage.RESTRICTION_ALTERNATIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS:
				return dislocalityRelations != null && !dislocalityRelations.isEmpty();
			case ModelPackage.RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS:
				return colocalityRelations != null && !colocalityRelations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RestrictionAlternativeImpl
