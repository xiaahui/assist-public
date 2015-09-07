/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq Interface Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl#getEqInterfaces <em>Eq Interfaces</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl#getWithoutEqInterfaces <em>Without Eq Interfaces</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl#getImplicitMemberDefinitions <em>Implicit Member Definitions</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceGroupImpl#getWithoutImplicitMemberDefinitions <em>Without Implicit Member Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqInterfaceGroupImpl extends EqInterfaceOrGroupImpl implements EqInterfaceGroup {
	/**
	 * The cached value of the '{@link #getEqInterfaces() <em>Eq Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterface> eqInterfaces;

	/**
	 * The cached value of the '{@link #getWithoutEqInterfaces() <em>Without Eq Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithoutEqInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterface> withoutEqInterfaces;

	/**
	 * The cached value of the '{@link #getImplicitMemberDefinitions() <em>Implicit Member Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitMemberDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplicitEqInterfaceMemberDefinition> implicitMemberDefinitions;

	/**
	 * The cached value of the '{@link #getWithoutImplicitMemberDefinitions() <em>Without Implicit Member Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithoutImplicitMemberDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplicitEqInterfaceMemberDefinition> withoutImplicitMemberDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqInterfaceGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EQ_INTERFACE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getEqInterfaces() {
		if (eqInterfaces == null) {
			eqInterfaces = new EObjectResolvingEList<EqInterface>(EqInterface.class, this, ModelPackage.EQ_INTERFACE_GROUP__EQ_INTERFACES);
		}
		return eqInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getWithoutEqInterfaces() {
		if (withoutEqInterfaces == null) {
			withoutEqInterfaces = new EObjectResolvingEList<EqInterface>(EqInterface.class, this, ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES);
		}
		return withoutEqInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplicitEqInterfaceMemberDefinition> getImplicitMemberDefinitions() {
		if (implicitMemberDefinitions == null) {
			implicitMemberDefinitions = new EObjectContainmentEList<ImplicitEqInterfaceMemberDefinition>(ImplicitEqInterfaceMemberDefinition.class, this, ModelPackage.EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS);
		}
		return implicitMemberDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplicitEqInterfaceMemberDefinition> getWithoutImplicitMemberDefinitions() {
		if (withoutImplicitMemberDefinitions == null) {
			withoutImplicitMemberDefinitions = new EObjectContainmentEList<ImplicitEqInterfaceMemberDefinition>(ImplicitEqInterfaceMemberDefinition.class, this, ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS);
		}
		return withoutImplicitMemberDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getImplicitlyDefinedEqInterfaces() {
		final BasicEList<EqInterface> list = new BasicEList<EqInterface>();
		EList<ImplicitEqInterfaceMemberDefinition> _implicitMemberDefinitions = this.getImplicitMemberDefinitions();
		for (final ImplicitEqInterfaceMemberDefinition implicitDefinitionElement : _implicitMemberDefinitions) {
			EList<EqInterface> _implicitlyDefinedEqInterfaces = implicitDefinitionElement.getImplicitlyDefinedEqInterfaces();
			list.addAll(_implicitlyDefinedEqInterfaces);
		}
		Set<EqInterface> _set = IterableExtensions.<EqInterface>toSet(list);
		List<EqInterface> _list = IterableExtensions.<EqInterface>toList(_set);
		return ECollections.<EqInterface>toEList(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getWithoutImplicitlyDefinedEqInterfaces() {
		final BasicEList<EqInterface> list = new BasicEList<EqInterface>();
		EList<ImplicitEqInterfaceMemberDefinition> _withoutImplicitMemberDefinitions = this.getWithoutImplicitMemberDefinitions();
		for (final ImplicitEqInterfaceMemberDefinition implicitDefinitionElement : _withoutImplicitMemberDefinitions) {
			EList<EqInterface> _implicitlyDefinedEqInterfaces = implicitDefinitionElement.getImplicitlyDefinedEqInterfaces();
			list.addAll(_implicitlyDefinedEqInterfaces);
		}
		Set<EqInterface> _set = IterableExtensions.<EqInterface>toSet(list);
		List<EqInterface> _list = IterableExtensions.<EqInterface>toList(_set);
		return ECollections.<EqInterface>toEList(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS:
				return ((InternalEList<?>)getImplicitMemberDefinitions()).basicRemove(otherEnd, msgs);
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS:
				return ((InternalEList<?>)getWithoutImplicitMemberDefinitions()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.EQ_INTERFACE_GROUP__EQ_INTERFACES:
				return getEqInterfaces();
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES:
				return getWithoutEqInterfaces();
			case ModelPackage.EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS:
				return getImplicitMemberDefinitions();
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS:
				return getWithoutImplicitMemberDefinitions();
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
			case ModelPackage.EQ_INTERFACE_GROUP__EQ_INTERFACES:
				getEqInterfaces().clear();
				getEqInterfaces().addAll((Collection<? extends EqInterface>)newValue);
				return;
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES:
				getWithoutEqInterfaces().clear();
				getWithoutEqInterfaces().addAll((Collection<? extends EqInterface>)newValue);
				return;
			case ModelPackage.EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS:
				getImplicitMemberDefinitions().clear();
				getImplicitMemberDefinitions().addAll((Collection<? extends ImplicitEqInterfaceMemberDefinition>)newValue);
				return;
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS:
				getWithoutImplicitMemberDefinitions().clear();
				getWithoutImplicitMemberDefinitions().addAll((Collection<? extends ImplicitEqInterfaceMemberDefinition>)newValue);
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
			case ModelPackage.EQ_INTERFACE_GROUP__EQ_INTERFACES:
				getEqInterfaces().clear();
				return;
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES:
				getWithoutEqInterfaces().clear();
				return;
			case ModelPackage.EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS:
				getImplicitMemberDefinitions().clear();
				return;
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS:
				getWithoutImplicitMemberDefinitions().clear();
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
			case ModelPackage.EQ_INTERFACE_GROUP__EQ_INTERFACES:
				return eqInterfaces != null && !eqInterfaces.isEmpty();
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_EQ_INTERFACES:
				return withoutEqInterfaces != null && !withoutEqInterfaces.isEmpty();
			case ModelPackage.EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS:
				return implicitMemberDefinitions != null && !implicitMemberDefinitions.isEmpty();
			case ModelPackage.EQ_INTERFACE_GROUP__WITHOUT_IMPLICIT_MEMBER_DEFINITIONS:
				return withoutImplicitMemberDefinitions != null && !withoutImplicitMemberDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EqInterfaceOrGroup.class) {
			switch (baseOperationID) {
				case ModelPackage.EQ_INTERFACE_OR_GROUP___TO_STRING: return ModelPackage.EQ_INTERFACE_GROUP___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EQ_INTERFACE_GROUP___TO_STRING:
				return toString();
			case ModelPackage.EQ_INTERFACE_GROUP___GET_IMPLICITLY_DEFINED_EQ_INTERFACES:
				return getImplicitlyDefinedEqInterfaces();
			case ModelPackage.EQ_INTERFACE_GROUP___GET_WITHOUT_IMPLICITLY_DEFINED_EQ_INTERFACES:
				return getWithoutImplicitlyDefinedEqInterfaces();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EqInterfaceGroupImpl
