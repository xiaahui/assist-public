/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.RDC;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ConnectorImpl#getRdc <em>Rdc</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ConnectorImpl#getAvailableEqInterfaces <em>Available Eq Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends HardwareElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getAvailableEqInterfaces() <em>Available Eq Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableEqInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<AvailableEqInterface> availableEqInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDC getRdc() {
		if (eContainerFeatureID() != ModelPackage.CONNECTOR__RDC) return null;
		return (RDC)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDC basicGetRdc() {
		if (eContainerFeatureID() != ModelPackage.CONNECTOR__RDC) return null;
		return (RDC)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdc(RDC newRdc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdc, ModelPackage.CONNECTOR__RDC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdc(RDC newRdc) {
		if (newRdc != eInternalContainer() || (eContainerFeatureID() != ModelPackage.CONNECTOR__RDC && newRdc != null)) {
			if (EcoreUtil.isAncestor(this, newRdc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdc != null)
				msgs = ((InternalEObject)newRdc).eInverseAdd(this, ModelPackage.RDC__CONNECTORS, RDC.class, msgs);
			msgs = basicSetRdc(newRdc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONNECTOR__RDC, newRdc, newRdc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvailableEqInterface> getAvailableEqInterfaces() {
		if (availableEqInterfaces == null) {
			availableEqInterfaces = new EObjectContainmentEList<AvailableEqInterface>(AvailableEqInterface.class, this, ModelPackage.CONNECTOR__AVAILABLE_EQ_INTERFACES);
		}
		return availableEqInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String fullName() {
		RDC _rdc = this.getRdc();
		Compartment _compartment = _rdc.getCompartment();
		String _name = _compartment.getName();
		String _plus = (_name + ".");
		RDC _rdc_1 = this.getRdc();
		String _name_1 = _rdc_1.getName();
		String _plus_1 = (_plus + _name_1);
		String _plus_2 = (_plus_1 + ".");
		String _name_2 = this.getName();
		return (_plus_2 + _name_2);
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
	public EList<Integer> getAvailableEqInterfaces(final EList<String> eqInterfaceTypes) {
		final Function1<String, Integer> _function = new Function1<String, Integer>() {
			public Integer apply(final String it) {
				Integer _xblockexpression = null;
				{
					final String typeName = it;
					Integer _xifexpression = null;
					EList<AvailableEqInterface> _availableEqInterfaces = ConnectorImpl.this.getAvailableEqInterfaces();
					final Function1<AvailableEqInterface, Boolean> _function = new Function1<AvailableEqInterface, Boolean>() {
						public Boolean apply(final AvailableEqInterface it) {
							String _eqInterfaceType = it.getEqInterfaceType();
							return Boolean.valueOf(_eqInterfaceType.equals(typeName));
						}
					};
					Iterable<AvailableEqInterface> _filter = IterableExtensions.<AvailableEqInterface>filter(_availableEqInterfaces, _function);
					boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_filter);
					boolean _not = (!_isNullOrEmpty);
					if (_not) {
						EList<AvailableEqInterface> _availableEqInterfaces_1 = ConnectorImpl.this.getAvailableEqInterfaces();
						final Function1<AvailableEqInterface, Boolean> _function_1 = new Function1<AvailableEqInterface, Boolean>() {
							public Boolean apply(final AvailableEqInterface it) {
								String _eqInterfaceType = it.getEqInterfaceType();
								return Boolean.valueOf(_eqInterfaceType.equals(typeName));
							}
						};
						Iterable<AvailableEqInterface> _filter_1 = IterableExtensions.<AvailableEqInterface>filter(_availableEqInterfaces_1, _function_1);
						final Function1<AvailableEqInterface, Integer> _function_2 = new Function1<AvailableEqInterface, Integer>() {
							public Integer apply(final AvailableEqInterface it) {
								return Integer.valueOf(it.getCount());
							}
						};
						Iterable<Integer> _map = IterableExtensions.<AvailableEqInterface, Integer>map(_filter_1, _function_2);
						final Function2<Integer, Integer, Integer> _function_3 = new Function2<Integer, Integer, Integer>() {
							public Integer apply(final Integer p1, final Integer p2) {
								return Integer.valueOf(((p1).intValue() + (p2).intValue()));
							}
						};
						_xifexpression = IterableExtensions.<Integer>reduce(_map, _function_3);
					}
					else {
						_xifexpression = Integer.valueOf(0);
					}
					_xblockexpression = _xifexpression;
				}
				return _xblockexpression;
			}
		};
		return XcoreEListExtensions.<String, Integer>map(eqInterfaceTypes, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CONNECTOR__RDC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdc((RDC)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CONNECTOR__RDC:
				return basicSetRdc(null, msgs);
			case ModelPackage.CONNECTOR__AVAILABLE_EQ_INTERFACES:
				return ((InternalEList<?>)getAvailableEqInterfaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.CONNECTOR__RDC:
				return eInternalContainer().eInverseRemove(this, ModelPackage.RDC__CONNECTORS, RDC.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONNECTOR__RDC:
				if (resolve) return getRdc();
				return basicGetRdc();
			case ModelPackage.CONNECTOR__AVAILABLE_EQ_INTERFACES:
				return getAvailableEqInterfaces();
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
			case ModelPackage.CONNECTOR__RDC:
				setRdc((RDC)newValue);
				return;
			case ModelPackage.CONNECTOR__AVAILABLE_EQ_INTERFACES:
				getAvailableEqInterfaces().clear();
				getAvailableEqInterfaces().addAll((Collection<? extends AvailableEqInterface>)newValue);
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
			case ModelPackage.CONNECTOR__RDC:
				setRdc((RDC)null);
				return;
			case ModelPackage.CONNECTOR__AVAILABLE_EQ_INTERFACES:
				getAvailableEqInterfaces().clear();
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
			case ModelPackage.CONNECTOR__RDC:
				return basicGetRdc() != null;
			case ModelPackage.CONNECTOR__AVAILABLE_EQ_INTERFACES:
				return availableEqInterfaces != null && !availableEqInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.CONNECTOR___FULL_NAME:
				return fullName();
			case ModelPackage.CONNECTOR___TO_STRING:
				return toString();
			case ModelPackage.CONNECTOR___GET_AVAILABLE_EQ_INTERFACES__ELIST:
				return getAvailableEqInterfaces((EList<String>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectorImpl
