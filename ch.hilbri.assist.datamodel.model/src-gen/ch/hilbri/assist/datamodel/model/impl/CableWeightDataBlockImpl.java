/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.CableWeightDataBlock;
import ch.hilbri.assist.datamodel.model.CableWeightEntry;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable Weight Data Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.CableWeightDataBlockImpl#getCableWeightEntries <em>Cable Weight Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CableWeightDataBlockImpl extends MinimalEObjectImpl.Container implements CableWeightDataBlock {
	/**
	 * The cached value of the '{@link #getCableWeightEntries() <em>Cable Weight Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCableWeightEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<CableWeightEntry> cableWeightEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CableWeightDataBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CABLE_WEIGHT_DATA_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CableWeightEntry> getCableWeightEntries() {
		if (cableWeightEntries == null) {
			cableWeightEntries = new EObjectContainmentEList<CableWeightEntry>(CableWeightEntry.class, this, ModelPackage.CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES);
		}
		return cableWeightEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefaultCableWeight() {
		EList<CableWeightEntry> _cableWeightEntries = this.getCableWeightEntries();
		final Function1<CableWeightEntry, Boolean> _function = new Function1<CableWeightEntry, Boolean>() {
			public Boolean apply(final CableWeightEntry it) {
				return Boolean.valueOf(it.isDefaultEntry());
			}
		};
		Iterable<CableWeightEntry> _filter = IterableExtensions.<CableWeightEntry>filter(_cableWeightEntries, _function);
		boolean _isEmpty = IterableExtensions.isEmpty(_filter);
		if (_isEmpty) {
			return 0;
		}
		else {
			EList<CableWeightEntry> _cableWeightEntries_1 = this.getCableWeightEntries();
			final Function1<CableWeightEntry, Boolean> _function_1 = new Function1<CableWeightEntry, Boolean>() {
				public Boolean apply(final CableWeightEntry it) {
					return Boolean.valueOf(it.isDefaultEntry());
				}
			};
			Iterable<CableWeightEntry> _filter_1 = IterableExtensions.<CableWeightEntry>filter(_cableWeightEntries_1, _function_1);
			CableWeightEntry _get = ((CableWeightEntry[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter_1, CableWeightEntry.class))[0];
			return _get.getWeight();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCableWeight(final String ioType) {
		EList<CableWeightEntry> _cableWeightEntries = this.getCableWeightEntries();
		final Function1<CableWeightEntry, Boolean> _function = new Function1<CableWeightEntry, Boolean>() {
			public Boolean apply(final CableWeightEntry it) {
				String _eqInterfaceIoType = it.getEqInterfaceIoType();
				return Boolean.valueOf(_eqInterfaceIoType.equals(ioType));
			}
		};
		Iterable<CableWeightEntry> _filter = IterableExtensions.<CableWeightEntry>filter(_cableWeightEntries, _function);
		boolean _isEmpty = IterableExtensions.isEmpty(_filter);
		if (_isEmpty) {
			return this.getDefaultCableWeight();
		}
		else {
			EList<CableWeightEntry> _cableWeightEntries_1 = this.getCableWeightEntries();
			final Function1<CableWeightEntry, Boolean> _function_1 = new Function1<CableWeightEntry, Boolean>() {
				public Boolean apply(final CableWeightEntry it) {
					String _eqInterfaceIoType = it.getEqInterfaceIoType();
					return Boolean.valueOf(_eqInterfaceIoType.equals(ioType));
				}
			};
			Iterable<CableWeightEntry> _filter_1 = IterableExtensions.<CableWeightEntry>filter(_cableWeightEntries_1, _function_1);
			CableWeightEntry _get = ((CableWeightEntry[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter_1, CableWeightEntry.class))[0];
			return _get.getWeight();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES:
				return ((InternalEList<?>)getCableWeightEntries()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES:
				return getCableWeightEntries();
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
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES:
				getCableWeightEntries().clear();
				getCableWeightEntries().addAll((Collection<? extends CableWeightEntry>)newValue);
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
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES:
				getCableWeightEntries().clear();
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
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK__CABLE_WEIGHT_ENTRIES:
				return cableWeightEntries != null && !cableWeightEntries.isEmpty();
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
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK___GET_DEFAULT_CABLE_WEIGHT:
				return getDefaultCableWeight();
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK___GET_CABLE_WEIGHT__STRING:
				return getCableWeight((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CableWeightDataBlockImpl
