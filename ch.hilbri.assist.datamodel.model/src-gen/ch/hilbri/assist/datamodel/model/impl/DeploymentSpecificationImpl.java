/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition;
import ch.hilbri.assist.datamodel.model.DeploymentSpecification;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup;
import ch.hilbri.assist.datamodel.model.HardwareElement;
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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DeploymentSpecificationImpl#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DeploymentSpecificationImpl#getHardwareElements <em>Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DeploymentSpecificationImpl#getImplicitHardwareElements <em>Implicit Hardware Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentSpecificationImpl extends MinimalEObjectImpl.Container implements DeploymentSpecification {
	/**
	 * The cached value of the '{@link #getEqInterfaceOrGroups() <em>Eq Interface Or Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceOrGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterfaceOrGroup> eqInterfaceOrGroups;

	/**
	 * The cached value of the '{@link #getHardwareElements() <em>Hardware Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareElement> hardwareElements;

	/**
	 * The cached value of the '{@link #getImplicitHardwareElements() <em>Implicit Hardware Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitHardwareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentImplicitDefinition> implicitHardwareElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DEPLOYMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterfaceOrGroup> getEqInterfaceOrGroups() {
		if (eqInterfaceOrGroups == null) {
			eqInterfaceOrGroups = new EObjectResolvingEList<EqInterfaceOrGroup>(EqInterfaceOrGroup.class, this, ModelPackage.DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS);
		}
		return eqInterfaceOrGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getHardwareElements() {
		if (hardwareElements == null) {
			hardwareElements = new EObjectResolvingEList<HardwareElement>(HardwareElement.class, this, ModelPackage.DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS);
		}
		return hardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentImplicitDefinition> getImplicitHardwareElements() {
		if (implicitHardwareElements == null) {
			implicitHardwareElements = new EObjectContainmentEList<DeploymentImplicitDefinition>(DeploymentImplicitDefinition.class, this, ModelPackage.DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS);
		}
		return implicitHardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllEqInterfaceOrGroupNames() {
		String result = "";
		boolean first = true;
		EList<EqInterfaceOrGroup> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();
		for (final EqInterfaceOrGroup e : _eqInterfaceOrGroups) {
			{
				if ((!first)) {
					String _result = result;
					result = (_result + ", ");
				}
				else {
					first = false;
				}
				if ((e instanceof EqInterface)) {
					String _result_1 = result;
					String _name = ((EqInterface)e).getName();
					result = (_result_1 + _name);
				}
				if ((e instanceof EqInterfaceGroup)) {
					String _result_2 = result;
					String _name_1 = ((EqInterfaceGroup)e).getName();
					result = (_result_2 + _name_1);
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getImplicitlyDefinedConnectors() {
		final BasicEList<Connector> list = new BasicEList<Connector>();
		EList<DeploymentImplicitDefinition> _implicitHardwareElements = this.getImplicitHardwareElements();
		for (final DeploymentImplicitDefinition definition : _implicitHardwareElements) {
			EList<Connector> _implicitlyDefinedConnectors = definition.getImplicitlyDefinedConnectors();
			list.addAll(_implicitlyDefinedConnectors);
		}
		Set<Connector> _set = IterableExtensions.<Connector>toSet(list);
		List<Connector> _list = IterableExtensions.<Connector>toList(_set);
		return ECollections.<Connector>toEList(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS:
				return ((InternalEList<?>)getImplicitHardwareElements()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS:
				return getEqInterfaceOrGroups();
			case ModelPackage.DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS:
				return getHardwareElements();
			case ModelPackage.DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS:
				return getImplicitHardwareElements();
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
			case ModelPackage.DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS:
				getEqInterfaceOrGroups().clear();
				getEqInterfaceOrGroups().addAll((Collection<? extends EqInterfaceOrGroup>)newValue);
				return;
			case ModelPackage.DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS:
				getHardwareElements().clear();
				getHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
				return;
			case ModelPackage.DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS:
				getImplicitHardwareElements().clear();
				getImplicitHardwareElements().addAll((Collection<? extends DeploymentImplicitDefinition>)newValue);
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
			case ModelPackage.DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS:
				getEqInterfaceOrGroups().clear();
				return;
			case ModelPackage.DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS:
				getHardwareElements().clear();
				return;
			case ModelPackage.DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS:
				getImplicitHardwareElements().clear();
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
			case ModelPackage.DEPLOYMENT_SPECIFICATION__EQ_INTERFACE_OR_GROUPS:
				return eqInterfaceOrGroups != null && !eqInterfaceOrGroups.isEmpty();
			case ModelPackage.DEPLOYMENT_SPECIFICATION__HARDWARE_ELEMENTS:
				return hardwareElements != null && !hardwareElements.isEmpty();
			case ModelPackage.DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS:
				return implicitHardwareElements != null && !implicitHardwareElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.DEPLOYMENT_SPECIFICATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES:
				return getAllEqInterfaceOrGroupNames();
			case ModelPackage.DEPLOYMENT_SPECIFICATION___GET_IMPLICITLY_DEFINED_CONNECTORS:
				return getImplicitlyDefinedConnectors();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeploymentSpecificationImpl
