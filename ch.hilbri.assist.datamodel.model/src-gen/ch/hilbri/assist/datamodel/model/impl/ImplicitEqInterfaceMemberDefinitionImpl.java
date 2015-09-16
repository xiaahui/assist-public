/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues;
import ch.hilbri.assist.datamodel.model.InterfacesBlock;
import ch.hilbri.assist.datamodel.model.ModelPackage;

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
 * An implementation of the model object '<em><b>Implicit Eq Interface Member Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ImplicitEqInterfaceMemberDefinitionImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicitEqInterfaceMemberDefinitionImpl extends MinimalEObjectImpl.Container implements ImplicitEqInterfaceMemberDefinition {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplicitEqInterfaceMemberDefinitionAttributesAndValues> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitEqInterfaceMemberDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplicitEqInterfaceMemberDefinitionAttributesAndValues> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<ImplicitEqInterfaceMemberDefinitionAttributesAndValues>(ImplicitEqInterfaceMemberDefinitionAttributesAndValues.class, this, ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getImplicitlyDefinedEqInterfaces() {
		final BasicEList<EqInterface> list = new BasicEList<EqInterface>();
		EObject _eContainer = this.eContainer();
		EObject _eContainer_1 = _eContainer.eContainer();
		final AssistModel model = ((AssistModel) _eContainer_1);
		InterfacesBlock _interfacesBlock = model.getInterfacesBlock();
		Iterable<EqInterface> interfaceList = _interfacesBlock.getEqInterfaces();
		EList<ImplicitEqInterfaceMemberDefinitionAttributesAndValues> _entries = this.getEntries();
		for (final ImplicitEqInterfaceMemberDefinitionAttributesAndValues entry : _entries) {
			ImplicitEqInterfaceMemberDefinitionAttribute _attribute = entry.getAttribute();
			if (_attribute != null) {
				switch (_attribute) {
					case NAME:
						final Function1<EqInterface, Boolean> _function = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _name = it.getName();
								String _value = entry.getValue();
								return Boolean.valueOf(_name.equals(_value));
							}
						};
						Iterable<EqInterface> _filter = IterableExtensions.<EqInterface>filter(interfaceList, _function);
						interfaceList = _filter;
						break;
					case SYSTEM:
						final Function1<EqInterface, Boolean> _function_1 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _system = it.getSystem();
								String _value = entry.getValue();
								return Boolean.valueOf(_system.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_1 = IterableExtensions.<EqInterface>filter(interfaceList, _function_1);
						interfaceList = _filter_1;
						break;
					case SUBATA:
						final Function1<EqInterface, Boolean> _function_2 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _subAta = it.getSubAta();
								String _value = entry.getValue();
								return Boolean.valueOf(_subAta.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_2 = IterableExtensions.<EqInterface>filter(interfaceList, _function_2);
						interfaceList = _filter_2;
						break;
					case RESOURCE:
						final Function1<EqInterface, Boolean> _function_3 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _resource = it.getResource();
								String _value = entry.getValue();
								return Boolean.valueOf(_resource.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_3 = IterableExtensions.<EqInterface>filter(interfaceList, _function_3);
						interfaceList = _filter_3;
						break;
					case LINENAME:
						final Function1<EqInterface, Boolean> _function_4 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _lineName = it.getLineName();
								String _value = entry.getValue();
								return Boolean.valueOf(_lineName.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_4 = IterableExtensions.<EqInterface>filter(interfaceList, _function_4);
						interfaceList = _filter_4;
						break;
					case WIRINGLANE:
						final Function1<EqInterface, Boolean> _function_5 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _wiringLane = it.getWiringLane();
								String _value = entry.getValue();
								return Boolean.valueOf(_wiringLane.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_5 = IterableExtensions.<EqInterface>filter(interfaceList, _function_5);
						interfaceList = _filter_5;
						break;
					case GRPINFO:
						final Function1<EqInterface, Boolean> _function_6 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _grpInfo = it.getGrpInfo();
								String _value = entry.getValue();
								return Boolean.valueOf(_grpInfo.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_6 = IterableExtensions.<EqInterface>filter(interfaceList, _function_6);
						interfaceList = _filter_6;
						break;
					case ROUTE:
						final Function1<EqInterface, Boolean> _function_7 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _route = it.getRoute();
								String _value = entry.getValue();
								return Boolean.valueOf(_route.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_7 = IterableExtensions.<EqInterface>filter(interfaceList, _function_7);
						interfaceList = _filter_7;
						break;
					case PWSUP1:
						final Function1<EqInterface, Boolean> _function_8 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _pwSup1 = it.getPwSup1();
								String _value = entry.getValue();
								return Boolean.valueOf(_pwSup1.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_8 = IterableExtensions.<EqInterface>filter(interfaceList, _function_8);
						interfaceList = _filter_8;
						break;
					case EMHZONE1:
						final Function1<EqInterface, Boolean> _function_9 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _emhZone1 = it.getEmhZone1();
								String _value = entry.getValue();
								return Boolean.valueOf(_emhZone1.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_9 = IterableExtensions.<EqInterface>filter(interfaceList, _function_9);
						interfaceList = _filter_9;
						break;
					case IOTYPE:
						final Function1<EqInterface, Boolean> _function_10 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								String _ioType = it.getIoType();
								String _value = entry.getValue();
								return Boolean.valueOf(_ioType.equals(_value));
							}
						};
						Iterable<EqInterface> _filter_10 = IterableExtensions.<EqInterface>filter(interfaceList, _function_10);
						interfaceList = _filter_10;
						break;
					case RESOURCE_X:
						final Function1<EqInterface, Boolean> _function_11 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								int _resourceX = it.getResourceX();
								String _value = entry.getValue();
								return Boolean.valueOf(Integer.valueOf(_resourceX).equals(_value));
							}
						};
						Iterable<EqInterface> _filter_11 = IterableExtensions.<EqInterface>filter(interfaceList, _function_11);
						interfaceList = _filter_11;
						break;
					case RESOURCE_Y:
						final Function1<EqInterface, Boolean> _function_12 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								int _resourceY = it.getResourceY();
								String _value = entry.getValue();
								return Boolean.valueOf(Integer.valueOf(_resourceY).equals(_value));
							}
						};
						Iterable<EqInterface> _filter_12 = IterableExtensions.<EqInterface>filter(interfaceList, _function_12);
						interfaceList = _filter_12;
						break;
					case RESOURCE_Z:
						final Function1<EqInterface, Boolean> _function_13 = new Function1<EqInterface, Boolean>() {
							public Boolean apply(final EqInterface it) {
								int _resourceZ = it.getResourceZ();
								String _value = entry.getValue();
								return Boolean.valueOf(Integer.valueOf(_resourceZ).equals(_value));
							}
						};
						Iterable<EqInterface> _filter_13 = IterableExtensions.<EqInterface>filter(interfaceList, _function_13);
						interfaceList = _filter_13;
						break;
					default:
						break;
				}
			}
		}
		Iterables.<EqInterface>addAll(list, interfaceList);
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
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES:
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
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES:
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
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends ImplicitEqInterfaceMemberDefinitionAttributesAndValues>)newValue);
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
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES:
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
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION__ENTRIES:
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
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION___GET_IMPLICITLY_DEFINED_EQ_INTERFACES:
				return getImplicitlyDefinedEqInterfaces();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImplicitEqInterfaceMemberDefinitionImpl
