/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.CableWeightDataBlock;
import ch.hilbri.assist.datamodel.model.CableWeightEntry;
import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.CompartmentsBlock;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.GlobalBlock;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock;
import ch.hilbri.assist.datamodel.model.InterfacesBlock;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock;
import ch.hilbri.assist.datamodel.model.ProtectionLevelEntry;
import ch.hilbri.assist.datamodel.model.RDC;
import ch.hilbri.assist.datamodel.model.RestrictionsBlock;
import ch.hilbri.assist.datamodel.model.ValidDeployment;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getGlobalBlock <em>Global Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getCompartmentsBlock <em>Compartments Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getInterfacesBlock <em>Interfaces Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getInterfaceGroupsBlock <em>Interface Groups Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getRestrictionsBlock <em>Restrictions Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssistModelImpl extends MinimalEObjectImpl.Container implements AssistModel {
	/**
	 * The cached value of the '{@link #getGlobalBlock() <em>Global Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalBlock()
	 * @generated
	 * @ordered
	 */
	protected GlobalBlock globalBlock;

	/**
	 * The cached value of the '{@link #getCompartmentsBlock() <em>Compartments Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentsBlock()
	 * @generated
	 * @ordered
	 */
	protected CompartmentsBlock compartmentsBlock;

	/**
	 * The cached value of the '{@link #getInterfacesBlock() <em>Interfaces Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacesBlock()
	 * @generated
	 * @ordered
	 */
	protected InterfacesBlock interfacesBlock;

	/**
	 * The cached value of the '{@link #getInterfaceGroupsBlock() <em>Interface Groups Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceGroupsBlock()
	 * @generated
	 * @ordered
	 */
	protected InterfaceGroupsBlock interfaceGroupsBlock;

	/**
	 * The cached value of the '{@link #getRestrictionsBlock() <em>Restrictions Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionsBlock()
	 * @generated
	 * @ordered
	 */
	protected RestrictionsBlock restrictionsBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ASSIST_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBlock getGlobalBlock() {
		return globalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalBlock(GlobalBlock newGlobalBlock, NotificationChain msgs) {
		GlobalBlock oldGlobalBlock = globalBlock;
		globalBlock = newGlobalBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK, oldGlobalBlock, newGlobalBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalBlock(GlobalBlock newGlobalBlock) {
		if (newGlobalBlock != globalBlock) {
			NotificationChain msgs = null;
			if (globalBlock != null)
				msgs = ((InternalEObject)globalBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK, null, msgs);
			if (newGlobalBlock != null)
				msgs = ((InternalEObject)newGlobalBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK, null, msgs);
			msgs = basicSetGlobalBlock(newGlobalBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK, newGlobalBlock, newGlobalBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentsBlock getCompartmentsBlock() {
		return compartmentsBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartmentsBlock(CompartmentsBlock newCompartmentsBlock, NotificationChain msgs) {
		CompartmentsBlock oldCompartmentsBlock = compartmentsBlock;
		compartmentsBlock = newCompartmentsBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK, oldCompartmentsBlock, newCompartmentsBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentsBlock(CompartmentsBlock newCompartmentsBlock) {
		if (newCompartmentsBlock != compartmentsBlock) {
			NotificationChain msgs = null;
			if (compartmentsBlock != null)
				msgs = ((InternalEObject)compartmentsBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK, null, msgs);
			if (newCompartmentsBlock != null)
				msgs = ((InternalEObject)newCompartmentsBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK, null, msgs);
			msgs = basicSetCompartmentsBlock(newCompartmentsBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK, newCompartmentsBlock, newCompartmentsBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesBlock getInterfacesBlock() {
		return interfacesBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfacesBlock(InterfacesBlock newInterfacesBlock, NotificationChain msgs) {
		InterfacesBlock oldInterfacesBlock = interfacesBlock;
		interfacesBlock = newInterfacesBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK, oldInterfacesBlock, newInterfacesBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacesBlock(InterfacesBlock newInterfacesBlock) {
		if (newInterfacesBlock != interfacesBlock) {
			NotificationChain msgs = null;
			if (interfacesBlock != null)
				msgs = ((InternalEObject)interfacesBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK, null, msgs);
			if (newInterfacesBlock != null)
				msgs = ((InternalEObject)newInterfacesBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK, null, msgs);
			msgs = basicSetInterfacesBlock(newInterfacesBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK, newInterfacesBlock, newInterfacesBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceGroupsBlock getInterfaceGroupsBlock() {
		return interfaceGroupsBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceGroupsBlock(InterfaceGroupsBlock newInterfaceGroupsBlock, NotificationChain msgs) {
		InterfaceGroupsBlock oldInterfaceGroupsBlock = interfaceGroupsBlock;
		interfaceGroupsBlock = newInterfaceGroupsBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK, oldInterfaceGroupsBlock, newInterfaceGroupsBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceGroupsBlock(InterfaceGroupsBlock newInterfaceGroupsBlock) {
		if (newInterfaceGroupsBlock != interfaceGroupsBlock) {
			NotificationChain msgs = null;
			if (interfaceGroupsBlock != null)
				msgs = ((InternalEObject)interfaceGroupsBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK, null, msgs);
			if (newInterfaceGroupsBlock != null)
				msgs = ((InternalEObject)newInterfaceGroupsBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK, null, msgs);
			msgs = basicSetInterfaceGroupsBlock(newInterfaceGroupsBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK, newInterfaceGroupsBlock, newInterfaceGroupsBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsBlock getRestrictionsBlock() {
		return restrictionsBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestrictionsBlock(RestrictionsBlock newRestrictionsBlock, NotificationChain msgs) {
		RestrictionsBlock oldRestrictionsBlock = restrictionsBlock;
		restrictionsBlock = newRestrictionsBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK, oldRestrictionsBlock, newRestrictionsBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionsBlock(RestrictionsBlock newRestrictionsBlock) {
		if (newRestrictionsBlock != restrictionsBlock) {
			NotificationChain msgs = null;
			if (restrictionsBlock != null)
				msgs = ((InternalEObject)restrictionsBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK, null, msgs);
			if (newRestrictionsBlock != null)
				msgs = ((InternalEObject)newRestrictionsBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK, null, msgs);
			msgs = basicSetRestrictionsBlock(newRestrictionsBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK, newRestrictionsBlock, newRestrictionsBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		GlobalBlock _globalBlock = this.getGlobalBlock();
		return _globalBlock.getSystemName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleIoTypeEntry> getCompatibleIoTypes() {
		GlobalBlock _globalBlock = this.getGlobalBlock();
		CompatibleIoTypesBlock _compatibleIoTypesBlock = _globalBlock.getCompatibleIoTypesBlock();
		return _compatibleIoTypesBlock.getCompatibleIoTypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CableWeightEntry> getCableWeightData() {
		GlobalBlock _globalBlock = this.getGlobalBlock();
		CableWeightDataBlock _cableWeightDataBlock = _globalBlock.getCableWeightDataBlock();
		return _cableWeightDataBlock.getCableWeightEntries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionLevelEntry> getProtectionLevelData() {
		GlobalBlock _globalBlock = this.getGlobalBlock();
		ProtectionLevelDataBlock _protectionLevelDataBlock = _globalBlock.getProtectionLevelDataBlock();
		return _protectionLevelDataBlock.getProtectionLevelEntries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compartment> getCompartments() {
		CompartmentsBlock _compartmentsBlock = this.getCompartmentsBlock();
		return _compartmentsBlock.getCompartments();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDC> getRDCs() {
		EList<Compartment> _compartments = this.getCompartments();
		final Function1<Compartment, EList<RDC>> _function = new Function1<Compartment, EList<RDC>>() {
			public EList<RDC> apply(final Compartment it) {
				return it.getRdcs();
			}
		};
		EList<EList<RDC>> _map = XcoreEListExtensions.<Compartment, EList<RDC>>map(_compartments, _function);
		Iterable<RDC> _flatten = Iterables.<RDC>concat(_map);
		return ECollections.<RDC>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		EList<RDC> _rDCs = this.getRDCs();
		final Function1<RDC, EList<Connector>> _function = new Function1<RDC, EList<Connector>>() {
			public EList<Connector> apply(final RDC it) {
				return it.getConnectors();
			}
		};
		EList<EList<Connector>> _map = XcoreEListExtensions.<RDC, EList<Connector>>map(_rDCs, _function);
		Iterable<Connector> _flatten = Iterables.<Connector>concat(_map);
		return ECollections.<Connector>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getEqInterfaces() {
		InterfacesBlock _interfacesBlock = this.getInterfacesBlock();
		return _interfacesBlock.getEqInterfaces();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterfaceGroup> getEqInterfaceGroups() {
		InterfaceGroupsBlock _interfaceGroupsBlock = this.getInterfaceGroupsBlock();
		return _interfaceGroupsBlock.getEqInterfaceGroups();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColocalityRelation> getColocalityRelations() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		return _restrictionsBlock.getColocalityRelations();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DislocalityRelation> getDislocalityRelations() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		return _restrictionsBlock.getDislocalityRelations();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidDeployment> getValidDeployments() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		return _restrictionsBlock.getValidDeployments();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvalidDeployment> getInvalidDeployments() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		return _restrictionsBlock.getInvalidDeployments();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getAllHardwareElements(final int level) {
		if ((level == 0)) {
			EList<Connector> _connectors = this.getConnectors();
			final Function1<Connector, HardwareElement> _function = new Function1<Connector, HardwareElement>() {
				public HardwareElement apply(final Connector it) {
					return ((HardwareElement) it);
				}
			};
			return XcoreEListExtensions.<Connector, HardwareElement>map(_connectors, _function);
		}
		else {
			if ((level == 1)) {
				EList<RDC> _rDCs = this.getRDCs();
				final Function1<RDC, HardwareElement> _function_1 = new Function1<RDC, HardwareElement>() {
					public HardwareElement apply(final RDC it) {
						return ((HardwareElement) it);
					}
				};
				return XcoreEListExtensions.<RDC, HardwareElement>map(_rDCs, _function_1);
			}
			else {
				if ((level == 2)) {
					EList<Compartment> _compartments = this.getCompartments();
					final Function1<Compartment, HardwareElement> _function_2 = new Function1<Compartment, HardwareElement>() {
						public HardwareElement apply(final Compartment it) {
							return ((HardwareElement) it);
						}
					};
					return XcoreEListExtensions.<Compartment, HardwareElement>map(_compartments, _function_2);
				}
				else {
					return null;
				}
			}
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
			case ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK:
				return basicSetGlobalBlock(null, msgs);
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK:
				return basicSetCompartmentsBlock(null, msgs);
			case ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK:
				return basicSetInterfacesBlock(null, msgs);
			case ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK:
				return basicSetInterfaceGroupsBlock(null, msgs);
			case ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK:
				return basicSetRestrictionsBlock(null, msgs);
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
			case ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK:
				return getGlobalBlock();
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK:
				return getCompartmentsBlock();
			case ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK:
				return getInterfacesBlock();
			case ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK:
				return getInterfaceGroupsBlock();
			case ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK:
				return getRestrictionsBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK:
				setGlobalBlock((GlobalBlock)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK:
				setCompartmentsBlock((CompartmentsBlock)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK:
				setInterfacesBlock((InterfacesBlock)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK:
				setInterfaceGroupsBlock((InterfaceGroupsBlock)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK:
				setRestrictionsBlock((RestrictionsBlock)newValue);
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
			case ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK:
				setGlobalBlock((GlobalBlock)null);
				return;
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK:
				setCompartmentsBlock((CompartmentsBlock)null);
				return;
			case ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK:
				setInterfacesBlock((InterfacesBlock)null);
				return;
			case ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK:
				setInterfaceGroupsBlock((InterfaceGroupsBlock)null);
				return;
			case ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK:
				setRestrictionsBlock((RestrictionsBlock)null);
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
			case ModelPackage.ASSIST_MODEL__GLOBAL_BLOCK:
				return globalBlock != null;
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS_BLOCK:
				return compartmentsBlock != null;
			case ModelPackage.ASSIST_MODEL__INTERFACES_BLOCK:
				return interfacesBlock != null;
			case ModelPackage.ASSIST_MODEL__INTERFACE_GROUPS_BLOCK:
				return interfaceGroupsBlock != null;
			case ModelPackage.ASSIST_MODEL__RESTRICTIONS_BLOCK:
				return restrictionsBlock != null;
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
			case ModelPackage.ASSIST_MODEL___GET_SYSTEM_NAME:
				return getSystemName();
			case ModelPackage.ASSIST_MODEL___GET_COMPATIBLE_IO_TYPES:
				return getCompatibleIoTypes();
			case ModelPackage.ASSIST_MODEL___GET_CABLE_WEIGHT_DATA:
				return getCableWeightData();
			case ModelPackage.ASSIST_MODEL___GET_PROTECTION_LEVEL_DATA:
				return getProtectionLevelData();
			case ModelPackage.ASSIST_MODEL___GET_COMPARTMENTS:
				return getCompartments();
			case ModelPackage.ASSIST_MODEL___GET_RD_CS:
				return getRDCs();
			case ModelPackage.ASSIST_MODEL___GET_CONNECTORS:
				return getConnectors();
			case ModelPackage.ASSIST_MODEL___GET_EQ_INTERFACES:
				return getEqInterfaces();
			case ModelPackage.ASSIST_MODEL___GET_EQ_INTERFACE_GROUPS:
				return getEqInterfaceGroups();
			case ModelPackage.ASSIST_MODEL___GET_COLOCALITY_RELATIONS:
				return getColocalityRelations();
			case ModelPackage.ASSIST_MODEL___GET_DISLOCALITY_RELATIONS:
				return getDislocalityRelations();
			case ModelPackage.ASSIST_MODEL___GET_VALID_DEPLOYMENTS:
				return getValidDeployments();
			case ModelPackage.ASSIST_MODEL___GET_INVALID_DEPLOYMENTS:
				return getInvalidDeployments();
			case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT:
				return getAllHardwareElements((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssistModelImpl
