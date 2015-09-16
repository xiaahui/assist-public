/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock;
import ch.hilbri.assist.datamodel.model.ModelPackage;

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
 * An implementation of the model object '<em><b>Interface Groups Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.InterfaceGroupsBlockImpl#getEqInterfaceGroups <em>Eq Interface Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceGroupsBlockImpl extends MinimalEObjectImpl.Container implements InterfaceGroupsBlock {
	/**
	 * The cached value of the '{@link #getEqInterfaceGroups() <em>Eq Interface Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterfaceGroup> eqInterfaceGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceGroupsBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INTERFACE_GROUPS_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterfaceGroup> getEqInterfaceGroups() {
		if (eqInterfaceGroups == null) {
			eqInterfaceGroups = new EObjectContainmentEList<EqInterfaceGroup>(EqInterfaceGroup.class, this, ModelPackage.INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS);
		}
		return eqInterfaceGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS:
				return ((InternalEList<?>)getEqInterfaceGroups()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS:
				return getEqInterfaceGroups();
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
			case ModelPackage.INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS:
				getEqInterfaceGroups().clear();
				getEqInterfaceGroups().addAll((Collection<? extends EqInterfaceGroup>)newValue);
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
			case ModelPackage.INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS:
				getEqInterfaceGroups().clear();
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
			case ModelPackage.INTERFACE_GROUPS_BLOCK__EQ_INTERFACE_GROUPS:
				return eqInterfaceGroups != null && !eqInterfaceGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceGroupsBlockImpl
