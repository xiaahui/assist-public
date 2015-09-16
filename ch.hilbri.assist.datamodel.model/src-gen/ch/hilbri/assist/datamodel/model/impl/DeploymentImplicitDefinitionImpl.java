/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.RDC;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Implicit Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DeploymentImplicitDefinitionImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImplicitDefinitionImpl extends MinimalEObjectImpl.Container implements DeploymentImplicitDefinition {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentImplicitDefinitionAttributeAndValue> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImplicitDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentImplicitDefinitionAttributeAndValue> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<DeploymentImplicitDefinitionAttributeAndValue>(DeploymentImplicitDefinitionAttributeAndValue.class, this, ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getImplicitlyDefinedConnectors() {
		final BasicEList<Connector> list = new BasicEList<Connector>();
		EObject _eContainer = this.eContainer();
		EObject _eContainer_1 = _eContainer.eContainer();
		final AssistModel model = ((AssistModel) _eContainer_1);
		Iterable<Connector> connectorList = model.getConnectors();
		EList<DeploymentImplicitDefinitionAttributeAndValue> _entries = this.getEntries();
		for (final DeploymentImplicitDefinitionAttributeAndValue entry : _entries) {
			DeploymentImplicitDefinitionAttribute _attribute = entry.getAttribute();
			if (_attribute != null) {
				switch (_attribute) {
					case COMPARTMENT_NAME:
						final Function1<Connector, Boolean> _function = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								Compartment _compartment = _rdc.getCompartment();
								String _name = _compartment.getName();
								String _value = entry.getValue();
								return Boolean.valueOf(_name.equals(_value));
							}
						};
						Iterable<Connector> _filter = IterableExtensions.<Connector>filter(connectorList, _function);
						connectorList = _filter;
						break;
					case COMPARTMENT_MANUFACTURER:
						final Function1<Connector, Boolean> _function_1 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								Compartment _compartment = _rdc.getCompartment();
								String _manufacturer = _compartment.getManufacturer();
								String _value = entry.getValue();
								return Boolean.valueOf(_manufacturer.equals(_value));
							}
						};
						Iterable<Connector> _filter_1 = IterableExtensions.<Connector>filter(connectorList, _function_1);
						connectorList = _filter_1;
						break;
					case COMPARTMENT_POWERSUPPLY:
						final Function1<Connector, Boolean> _function_2 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								Compartment _compartment = _rdc.getCompartment();
								String _powerSupply = _compartment.getPowerSupply();
								String _value = entry.getValue();
								return Boolean.valueOf(_powerSupply.equals(_value));
							}
						};
						Iterable<Connector> _filter_2 = IterableExtensions.<Connector>filter(connectorList, _function_2);
						connectorList = _filter_2;
						break;
					case COMPARTMENT_SIDE:
						final Function1<Connector, Boolean> _function_3 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								Compartment _compartment = _rdc.getCompartment();
								String _side = _compartment.getSide();
								String _value = entry.getValue();
								return Boolean.valueOf(_side.equals(_value));
							}
						};
						Iterable<Connector> _filter_3 = IterableExtensions.<Connector>filter(connectorList, _function_3);
						connectorList = _filter_3;
						break;
					case COMPARTMENT_ZONE:
						final Function1<Connector, Boolean> _function_4 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								Compartment _compartment = _rdc.getCompartment();
								String _zone = _compartment.getZone();
								String _value = entry.getValue();
								return Boolean.valueOf(_zone.equals(_value));
							}
						};
						Iterable<Connector> _filter_4 = IterableExtensions.<Connector>filter(connectorList, _function_4);
						connectorList = _filter_4;
						break;
					case RDC_NAME:
						final Function1<Connector, Boolean> _function_5 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								String _name = _rdc.getName();
								String _value = entry.getValue();
								return Boolean.valueOf(_name.equals(_value));
							}
						};
						Iterable<Connector> _filter_5 = IterableExtensions.<Connector>filter(connectorList, _function_5);
						connectorList = _filter_5;
						break;
					case RDC_MANUFACTURER:
						final Function1<Connector, Boolean> _function_6 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								String _manufacturer = _rdc.getManufacturer();
								String _value = entry.getValue();
								return Boolean.valueOf(_manufacturer.equals(_value));
							}
						};
						Iterable<Connector> _filter_6 = IterableExtensions.<Connector>filter(connectorList, _function_6);
						connectorList = _filter_6;
						break;
					case RDC_POWERSUPPLY:
						final Function1<Connector, Boolean> _function_7 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								String _powerSupply = _rdc.getPowerSupply();
								String _value = entry.getValue();
								return Boolean.valueOf(_powerSupply.equals(_value));
							}
						};
						Iterable<Connector> _filter_7 = IterableExtensions.<Connector>filter(connectorList, _function_7);
						connectorList = _filter_7;
						break;
					case RDC_SIDE:
						final Function1<Connector, Boolean> _function_8 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								String _side = _rdc.getSide();
								String _value = entry.getValue();
								return Boolean.valueOf(_side.equals(_value));
							}
						};
						Iterable<Connector> _filter_8 = IterableExtensions.<Connector>filter(connectorList, _function_8);
						connectorList = _filter_8;
						break;
					case RDC_TYPE:
						final Function1<Connector, Boolean> _function_9 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								String _rdcType = _rdc.getRdcType();
								String _value = entry.getValue();
								return Boolean.valueOf(_rdcType.equals(_value));
							}
						};
						Iterable<Connector> _filter_9 = IterableExtensions.<Connector>filter(connectorList, _function_9);
						connectorList = _filter_9;
						break;
					case RDC_ESS:
						final Function1<Connector, Boolean> _function_10 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								String _ess = _rdc.getEss();
								String _value = entry.getValue();
								return Boolean.valueOf(_ess.equals(_value));
							}
						};
						Iterable<Connector> _filter_10 = IterableExtensions.<Connector>filter(connectorList, _function_10);
						connectorList = _filter_10;
						break;
					case RDC_RESOURCE_X:
						final Function1<Connector, Boolean> _function_11 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								int _resourceX = _rdc.getResourceX();
								String _value = entry.getValue();
								return Boolean.valueOf(Integer.valueOf(_resourceX).equals(_value));
							}
						};
						Iterable<Connector> _filter_11 = IterableExtensions.<Connector>filter(connectorList, _function_11);
						connectorList = _filter_11;
						break;
					case RDC_RESOURCE_Y:
						final Function1<Connector, Boolean> _function_12 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								int _resourceY = _rdc.getResourceY();
								String _value = entry.getValue();
								return Boolean.valueOf(Integer.valueOf(_resourceY).equals(_value));
							}
						};
						Iterable<Connector> _filter_12 = IterableExtensions.<Connector>filter(connectorList, _function_12);
						connectorList = _filter_12;
						break;
					case RDC_RESOURCE_Z:
						final Function1<Connector, Boolean> _function_13 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								RDC _rdc = it.getRdc();
								int _resourceZ = _rdc.getResourceZ();
								String _value = entry.getValue();
								return Boolean.valueOf(Integer.valueOf(_resourceZ).equals(_value));
							}
						};
						Iterable<Connector> _filter_13 = IterableExtensions.<Connector>filter(connectorList, _function_13);
						connectorList = _filter_13;
						break;
					case CONNECTOR_NAME:
						final Function1<Connector, Boolean> _function_14 = new Function1<Connector, Boolean>() {
							public Boolean apply(final Connector it) {
								String _name = it.getName();
								String _value = entry.getValue();
								return Boolean.valueOf(_name.equals(_value));
							}
						};
						Iterable<Connector> _filter_14 = IterableExtensions.<Connector>filter(connectorList, _function_14);
						connectorList = _filter_14;
						break;
					default:
						break;
				}
			}
		}
		Iterables.<Connector>addAll(list, connectorList);
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
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES:
				return getEntries();
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
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends DeploymentImplicitDefinitionAttributeAndValue>)newValue);
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
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES:
				getEntries().clear();
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
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION__ENTRIES:
				return entries != null && !entries.isEmpty();
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
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION___GET_IMPLICITLY_DEFINED_CONNECTORS:
				return getImplicitlyDefinedConnectors();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeploymentImplicitDefinitionImpl
