/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq Interface Group With Combined Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupWithCombinedDefinitionImpl#getCombinedGroups <em>Combined Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqInterfaceGroupWithCombinedDefinitionImpl extends EqInterfaceGroupImpl implements EqInterfaceGroupWithCombinedDefinition {
	/**
	 * The cached value of the '{@link #getCombinedGroups() <em>Combined Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterfaceGroup> combinedGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqInterfaceGroupWithCombinedDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterfaceGroup> getCombinedGroups() {
		if (combinedGroups == null) {
			combinedGroups = new EObjectResolvingEList<EqInterfaceGroup>(EqInterfaceGroup.class, this, ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS);
		}
		return combinedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS:
				return getCombinedGroups();
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
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS:
				getCombinedGroups().clear();
				getCombinedGroups().addAll((Collection<? extends EqInterfaceGroup>)newValue);
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
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS:
				getCombinedGroups().clear();
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
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION__COMBINED_GROUPS:
				return combinedGroups != null && !combinedGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EqInterfaceGroupWithCombinedDefinitionImpl
