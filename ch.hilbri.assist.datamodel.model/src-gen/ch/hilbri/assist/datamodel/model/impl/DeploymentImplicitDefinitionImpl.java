/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.CompartmentsBlock;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.Pin;
import ch.hilbri.assist.datamodel.model.RDC;

import com.google.common.base.Objects;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
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

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

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
	public EList<Pin> getImplicitlyDefinedPins() {
		EList<Pin> _xblockexpression = null;
		{
			final BasicEList<Pin> list = new BasicEList<Pin>();
			EObject _eContainer = this.eContainer();
			EObject _eContainer_1 = _eContainer.eContainer();
			EObject _eContainer_2 = _eContainer_1.eContainer();
			final AssistModel model = ((AssistModel) _eContainer_2);
			CompartmentsBlock _compartmentsBlock = model.getCompartmentsBlock();
			boolean _equals = Objects.equal(_compartmentsBlock, null);
			if (_equals) {
				return null;
			}
			CompartmentsBlock _compartmentsBlock_1 = model.getCompartmentsBlock();
			EList<Compartment> _compartments = _compartmentsBlock_1.getCompartments();
			final Function1<Compartment, Iterable<Pin>> _function = new Function1<Compartment, Iterable<Pin>>() {
				public Iterable<Pin> apply(final Compartment it) {
					EList<RDC> _rdcs = it.getRdcs();
					final Function1<RDC, Iterable<Pin>> _function = new Function1<RDC, Iterable<Pin>>() {
						public Iterable<Pin> apply(final RDC it) {
							EList<Connector> _connectors = it.getConnectors();
							final Function1<Connector, EList<Pin>> _function = new Function1<Connector, EList<Pin>>() {
								public EList<Pin> apply(final Connector it) {
									return it.getPins();
								}
							};
							EList<EList<Pin>> _map = XcoreEListExtensions.<Connector, EList<Pin>>map(_connectors, _function);
							return Iterables.<Pin>concat(_map);
						}
					};
					EList<Iterable<Pin>> _map = XcoreEListExtensions.<RDC, Iterable<Pin>>map(_rdcs, _function);
					return Iterables.<Pin>concat(_map);
				}
			};
			EList<Iterable<Pin>> _map = XcoreEListExtensions.<Compartment, Iterable<Pin>>map(_compartments, _function);
			Iterable<Pin> pinList = Iterables.<Pin>concat(_map);
			EList<DeploymentImplicitDefinitionAttributeAndValue> _entries = this.getEntries();
			for (final DeploymentImplicitDefinitionAttributeAndValue entry : _entries) {
				DeploymentImplicitDefinitionAttribute _attribute = entry.getAttribute();
				if (_attribute != null) {
					switch (_attribute) {
						case COMPARTMENT_NAME:
							final Function1<Pin, Boolean> _function_1 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									Compartment _compartment = _rdc.getCompartment();
									String _name = _compartment.getName();
									String _value = entry.getValue();
									return Boolean.valueOf(_name.equals(_value));
								}
							};
							Iterable<Pin> _filter = IterableExtensions.<Pin>filter(pinList, _function_1);
							pinList = _filter;
							break;
						case COMPARTMENT_MANUFACTURER:
							final Function1<Pin, Boolean> _function_2 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									Compartment _compartment = _rdc.getCompartment();
									String _manufacturer = _compartment.getManufacturer();
									String _value = entry.getValue();
									return Boolean.valueOf(_manufacturer.equals(_value));
								}
							};
							Iterable<Pin> _filter_1 = IterableExtensions.<Pin>filter(pinList, _function_2);
							pinList = _filter_1;
							break;
						case COMPARTMENT_POWERSUPPLY:
							final Function1<Pin, Boolean> _function_3 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									Compartment _compartment = _rdc.getCompartment();
									String _powerSupply = _compartment.getPowerSupply();
									String _value = entry.getValue();
									return Boolean.valueOf(_powerSupply.equals(_value));
								}
							};
							Iterable<Pin> _filter_2 = IterableExtensions.<Pin>filter(pinList, _function_3);
							pinList = _filter_2;
							break;
						case COMPARTMENT_SIDE:
							final Function1<Pin, Boolean> _function_4 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									Compartment _compartment = _rdc.getCompartment();
									String _side = _compartment.getSide();
									String _value = entry.getValue();
									return Boolean.valueOf(_side.equals(_value));
								}
							};
							Iterable<Pin> _filter_3 = IterableExtensions.<Pin>filter(pinList, _function_4);
							pinList = _filter_3;
							break;
						case COMPARTMENT_ZONE:
							final Function1<Pin, Boolean> _function_5 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									Compartment _compartment = _rdc.getCompartment();
									String _zone = _compartment.getZone();
									String _value = entry.getValue();
									return Boolean.valueOf(_zone.equals(_value));
								}
							};
							Iterable<Pin> _filter_4 = IterableExtensions.<Pin>filter(pinList, _function_5);
							pinList = _filter_4;
							break;
						case RDC_NAME:
							final Function1<Pin, Boolean> _function_6 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									String _name = _rdc.getName();
									String _value = entry.getValue();
									return Boolean.valueOf(_name.equals(_value));
								}
							};
							Iterable<Pin> _filter_5 = IterableExtensions.<Pin>filter(pinList, _function_6);
							pinList = _filter_5;
							break;
						case RDC_MANUFACTURER:
							final Function1<Pin, Boolean> _function_7 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									String _manufacturer = _rdc.getManufacturer();
									String _value = entry.getValue();
									return Boolean.valueOf(_manufacturer.equals(_value));
								}
							};
							Iterable<Pin> _filter_6 = IterableExtensions.<Pin>filter(pinList, _function_7);
							pinList = _filter_6;
							break;
						case RDC_POWERSUPPLY1:
							final Function1<Pin, Boolean> _function_8 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									String _powerSupply1 = _rdc.getPowerSupply1();
									String _value = entry.getValue();
									return Boolean.valueOf(_powerSupply1.equals(_value));
								}
							};
							Iterable<Pin> _filter_7 = IterableExtensions.<Pin>filter(pinList, _function_8);
							pinList = _filter_7;
							break;
						case RDC_POWERSUPPLY2:
							final Function1<Pin, Boolean> _function_9 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									String _powerSupply2 = _rdc.getPowerSupply2();
									String _value = entry.getValue();
									return Boolean.valueOf(_powerSupply2.equals(_value));
								}
							};
							Iterable<Pin> _filter_8 = IterableExtensions.<Pin>filter(pinList, _function_9);
							pinList = _filter_8;
							break;
						case RDC_SIDE:
							final Function1<Pin, Boolean> _function_10 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									String _side = _rdc.getSide();
									String _value = entry.getValue();
									return Boolean.valueOf(_side.equals(_value));
								}
							};
							Iterable<Pin> _filter_9 = IterableExtensions.<Pin>filter(pinList, _function_10);
							pinList = _filter_9;
							break;
						case RDC_TYPE:
							final Function1<Pin, Boolean> _function_11 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									String _rdcType = _rdc.getRdcType();
									String _value = entry.getValue();
									return Boolean.valueOf(_rdcType.equals(_value));
								}
							};
							Iterable<Pin> _filter_10 = IterableExtensions.<Pin>filter(pinList, _function_11);
							pinList = _filter_10;
							break;
						case RDC_ESS:
							final Function1<Pin, Boolean> _function_12 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									String _ess = _rdc.getEss();
									String _value = entry.getValue();
									return Boolean.valueOf(_ess.equals(_value));
								}
							};
							Iterable<Pin> _filter_11 = IterableExtensions.<Pin>filter(pinList, _function_12);
							pinList = _filter_11;
							break;
						case RDC_RESOURCE_X:
							final Function1<Pin, Boolean> _function_13 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									int _resourceX = _rdc.getResourceX();
									String _value = entry.getValue();
									return Boolean.valueOf(Integer.valueOf(_resourceX).equals(_value));
								}
							};
							Iterable<Pin> _filter_12 = IterableExtensions.<Pin>filter(pinList, _function_13);
							pinList = _filter_12;
							break;
						case RDC_RESOURCE_Y:
							final Function1<Pin, Boolean> _function_14 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									int _resourceY = _rdc.getResourceY();
									String _value = entry.getValue();
									return Boolean.valueOf(Integer.valueOf(_resourceY).equals(_value));
								}
							};
							Iterable<Pin> _filter_13 = IterableExtensions.<Pin>filter(pinList, _function_14);
							pinList = _filter_13;
							break;
						case RDC_RESOURCE_Z:
							final Function1<Pin, Boolean> _function_15 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									RDC _rdc = _connector.getRdc();
									int _resourceZ = _rdc.getResourceZ();
									String _value = entry.getValue();
									return Boolean.valueOf(Integer.valueOf(_resourceZ).equals(_value));
								}
							};
							Iterable<Pin> _filter_14 = IterableExtensions.<Pin>filter(pinList, _function_15);
							pinList = _filter_14;
							break;
						case CONNECTOR_NAME:
							final Function1<Pin, Boolean> _function_16 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									Connector _connector = it.getConnector();
									String _name = _connector.getName();
									String _value = entry.getValue();
									return Boolean.valueOf(_name.equals(_value));
								}
							};
							Iterable<Pin> _filter_15 = IterableExtensions.<Pin>filter(pinList, _function_16);
							pinList = _filter_15;
							break;
						case PIN_NAME:
							final Function1<Pin, Boolean> _function_17 = new Function1<Pin, Boolean>() {
								public Boolean apply(final Pin it) {
									String _name = it.getName();
									String _value = entry.getValue();
									return Boolean.valueOf(_name.equals(_value));
								}
							};
							Iterable<Pin> _filter_16 = IterableExtensions.<Pin>filter(pinList, _function_17);
							pinList = _filter_16;
							break;
						default:
							break;
					}
				}
			}
			Iterables.<Pin>addAll(list, pinList);
			Set<Pin> _set = IterableExtensions.<Pin>toSet(list);
			_xblockexpression = ECollections.<Pin>toEList(_set);
		}
		return _xblockexpression;
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
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION___GET_IMPLICITLY_DEFINED_PINS:
				return getImplicitlyDefinedPins();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeploymentImplicitDefinitionImpl
