/**
 */
package ch.hilbri.assist.dse.model.impl;

import ch.hilbri.assist.dse.model.BoardAlternatives;
import ch.hilbri.assist.dse.model.BoxDSE;
import ch.hilbri.assist.dse.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box DSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.dse.model.impl.BoxDSEImpl#getBoardAlternatives <em>Board Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxDSEImpl extends EObjectImpl implements BoxDSE {
	/**
	 * The cached value of the '{@link #getBoardAlternatives() <em>Board Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<BoardAlternatives> boardAlternatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxDSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOX_DSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoardAlternatives> getBoardAlternatives() {
		if (boardAlternatives == null) {
			boardAlternatives = new EObjectContainmentEList<BoardAlternatives>(BoardAlternatives.class, this, ModelPackage.BOX_DSE__BOARD_ALTERNATIVES);
		}
		return boardAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BOX_DSE__BOARD_ALTERNATIVES:
				return ((InternalEList<?>)getBoardAlternatives()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.BOX_DSE__BOARD_ALTERNATIVES:
				return getBoardAlternatives();
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
			case ModelPackage.BOX_DSE__BOARD_ALTERNATIVES:
				getBoardAlternatives().clear();
				getBoardAlternatives().addAll((Collection<? extends BoardAlternatives>)newValue);
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
			case ModelPackage.BOX_DSE__BOARD_ALTERNATIVES:
				getBoardAlternatives().clear();
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
			case ModelPackage.BOX_DSE__BOARD_ALTERNATIVES:
				return boardAlternatives != null && !boardAlternatives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoxDSEImpl
