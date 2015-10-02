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
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.InterfaceGroupsBlock;
import ch.hilbri.assist.datamodel.model.InterfacesBlock;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.Pin;
import ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock;
import ch.hilbri.assist.datamodel.model.ProtectionLevelEntry;
import ch.hilbri.assist.datamodel.model.RDC;
import ch.hilbri.assist.datamodel.model.RestrictionsBlock;
import ch.hilbri.assist.datamodel.model.ValidDeployment;

import com.google.common.base.Objects;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getRdcs <em>Rdcs</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getPins <em>Pins</em>}</li>
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
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Compartment> compartments;

	/**
	 * The cached value of the '{@link #getRdcs() <em>Rdcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdcs()
	 * @generated
	 * @ordered
	 */
	protected EList<RDC> rdcs;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pins;

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
	public EList<Compartment> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectResolvingEList<Compartment>(Compartment.class, this, ModelPackage.ASSIST_MODEL__COMPARTMENTS);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDC> getRdcs() {
		if (rdcs == null) {
			rdcs = new EObjectResolvingEList<RDC>(RDC.class, this, ModelPackage.ASSIST_MODEL__RDCS);
		}
		return rdcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectResolvingEList<Connector>(Connector.class, this, ModelPackage.ASSIST_MODEL__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectResolvingEList<Pin>(Pin.class, this, ModelPackage.ASSIST_MODEL__PINS);
		}
		return pins;
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
		EList<CompatibleIoTypeEntry> _compatibleIoTypes = null;
		if (_compatibleIoTypesBlock!=null) {
			_compatibleIoTypes=_compatibleIoTypesBlock.getCompatibleIoTypes();
		}
		return ECollections.<CompatibleIoTypeEntry>toEList(_compatibleIoTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CableWeightEntry> getCableWeightData() {
		GlobalBlock _globalBlock = this.getGlobalBlock();
		CableWeightDataBlock _cableWeightDataBlock = _globalBlock.getCableWeightDataBlock();
		EList<CableWeightEntry> _cableWeightEntries = null;
		if (_cableWeightDataBlock!=null) {
			_cableWeightEntries=_cableWeightDataBlock.getCableWeightEntries();
		}
		return _cableWeightEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionLevelEntry> getProtectionLevelData() {
		GlobalBlock _globalBlock = this.getGlobalBlock();
		ProtectionLevelDataBlock _protectionLevelDataBlock = _globalBlock.getProtectionLevelDataBlock();
		EList<ProtectionLevelEntry> _protectionLevelEntries = null;
		if (_protectionLevelDataBlock!=null) {
			_protectionLevelEntries=_protectionLevelDataBlock.getProtectionLevelEntries();
		}
		return _protectionLevelEntries;
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
		EList<EqInterfaceGroup> _eqInterfaceGroups = null;
		if (_interfaceGroupsBlock!=null) {
			_eqInterfaceGroups=_interfaceGroupsBlock.getEqInterfaceGroups();
		}
		return _eqInterfaceGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColocalityRelation> getColocalityRelations() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		EList<ColocalityRelation> _colocalityRelations = null;
		if (_restrictionsBlock!=null) {
			_colocalityRelations=_restrictionsBlock.getColocalityRelations();
		}
		return _colocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DislocalityRelation> getDislocalityRelations() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		EList<DislocalityRelation> _dislocalityRelations = null;
		if (_restrictionsBlock!=null) {
			_dislocalityRelations=_restrictionsBlock.getDislocalityRelations();
		}
		return _dislocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidDeployment> getValidDeployments() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		EList<ValidDeployment> _validDeployments = null;
		if (_restrictionsBlock!=null) {
			_validDeployments=_restrictionsBlock.getValidDeployments();
		}
		return _validDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvalidDeployment> getInvalidDeployments() {
		RestrictionsBlock _restrictionsBlock = this.getRestrictionsBlock();
		EList<InvalidDeployment> _invalidDeployments = null;
		if (_restrictionsBlock!=null) {
			_invalidDeployments=_restrictionsBlock.getInvalidDeployments();
		}
		return _invalidDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEqInterfaceTypes() {
		EList<EqInterface> _eqInterfaces = this.getEqInterfaces();
		final Function1<EqInterface, String> _function = new Function1<EqInterface, String>() {
			public String apply(final EqInterface it) {
				return it.getIoType();
			}
		};
		EList<String> _map = XcoreEListExtensions.<EqInterface, String>map(_eqInterfaces, _function);
		Set<String> _set = IterableExtensions.<String>toSet(_map);
		return ECollections.<String>toEList(_set);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCompatiblePinTypes(final String eqIfaceType) {
		EList<String> _xifexpression = null;
		GlobalBlock _globalBlock = this.getGlobalBlock();
		CompatibleIoTypesBlock _compatibleIoTypesBlock = _globalBlock.getCompatibleIoTypesBlock();
		boolean _equals = Objects.equal(_compatibleIoTypesBlock, null);
		if (_equals) {
			_xifexpression = ECollections.<String>toEList(java.util.Collections.<String>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<String>newArrayList(eqIfaceType)));
		}
		else {
			EList<CompatibleIoTypeEntry> _compatibleIoTypes = this.getCompatibleIoTypes();
			final Function1<CompatibleIoTypeEntry, Boolean> _function = new Function1<CompatibleIoTypeEntry, Boolean>() {
				public Boolean apply(final CompatibleIoTypeEntry it) {
					String _eqInterfaceIoType = it.getEqInterfaceIoType();
					return Boolean.valueOf(Objects.equal(_eqInterfaceIoType, eqIfaceType));
				}
			};
			Iterable<CompatibleIoTypeEntry> _filter = IterableExtensions.<CompatibleIoTypeEntry>filter(_compatibleIoTypes, _function);
			final Function1<CompatibleIoTypeEntry, EList<String>> _function_1 = new Function1<CompatibleIoTypeEntry, EList<String>>() {
				public EList<String> apply(final CompatibleIoTypeEntry it) {
					return it.getPinInterfaceIoTypes();
				}
			};
			Iterable<EList<String>> _map = IterableExtensions.<CompatibleIoTypeEntry, EList<String>>map(_filter, _function_1);
			Iterable<String> _flatten = Iterables.<String>concat(_map);
			Set<String> _set = IterableExtensions.<String>toSet(_flatten);
			Iterable<String> _plus = Iterables.<String>concat(java.util.Collections.<String>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<String>newArrayList(eqIfaceType)), _set);
			_xifexpression = ECollections.<String>toEList(_plus);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getAllHardwareElements(final HardwareArchitectureLevelType level) {
		boolean _equals = Objects.equal(level, HardwareArchitectureLevelType.PIN);
		if (_equals) {
			EList<Pin> _pins = this.getPins();
			final Function1<Pin, HardwareElement> _function = new Function1<Pin, HardwareElement>() {
				public HardwareElement apply(final Pin it) {
					return ((HardwareElement) it);
				}
			};
			return XcoreEListExtensions.<Pin, HardwareElement>map(_pins, _function);
		}
		else {
			boolean _equals_1 = Objects.equal(level, HardwareArchitectureLevelType.CONNECTOR);
			if (_equals_1) {
				EList<Connector> _connectors = this.getConnectors();
				final Function1<Connector, HardwareElement> _function_1 = new Function1<Connector, HardwareElement>() {
					public HardwareElement apply(final Connector it) {
						return ((HardwareElement) it);
					}
				};
				return XcoreEListExtensions.<Connector, HardwareElement>map(_connectors, _function_1);
			}
			else {
				boolean _equals_2 = Objects.equal(level, HardwareArchitectureLevelType.RDC);
				if (_equals_2) {
					EList<RDC> _rdcs = this.getRdcs();
					final Function1<RDC, HardwareElement> _function_2 = new Function1<RDC, HardwareElement>() {
						public HardwareElement apply(final RDC it) {
							return ((HardwareElement) it);
						}
					};
					return XcoreEListExtensions.<RDC, HardwareElement>map(_rdcs, _function_2);
				}
				else {
					boolean _equals_3 = Objects.equal(level, HardwareArchitectureLevelType.COMPARTMENT);
					if (_equals_3) {
						EList<Compartment> _compartments = this.getCompartments();
						final Function1<Compartment, HardwareElement> _function_3 = new Function1<Compartment, HardwareElement>() {
							public HardwareElement apply(final Compartment it) {
								return ((HardwareElement) it);
							}
						};
						return XcoreEListExtensions.<Compartment, HardwareElement>map(_compartments, _function_3);
					}
					else {
						return null;
					}
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				return getCompartments();
			case ModelPackage.ASSIST_MODEL__RDCS:
				return getRdcs();
			case ModelPackage.ASSIST_MODEL__CONNECTORS:
				return getConnectors();
			case ModelPackage.ASSIST_MODEL__PINS:
				return getPins();
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends Compartment>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__RDCS:
				getRdcs().clear();
				getRdcs().addAll((Collection<? extends RDC>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				getCompartments().clear();
				return;
			case ModelPackage.ASSIST_MODEL__RDCS:
				getRdcs().clear();
				return;
			case ModelPackage.ASSIST_MODEL__CONNECTORS:
				getConnectors().clear();
				return;
			case ModelPackage.ASSIST_MODEL__PINS:
				getPins().clear();
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
			case ModelPackage.ASSIST_MODEL__RDCS:
				return rdcs != null && !rdcs.isEmpty();
			case ModelPackage.ASSIST_MODEL__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case ModelPackage.ASSIST_MODEL__PINS:
				return pins != null && !pins.isEmpty();
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
			case ModelPackage.ASSIST_MODEL___GET_EQ_INTERFACE_TYPES:
				return getEqInterfaceTypes();
			case ModelPackage.ASSIST_MODEL___GET_COMPATIBLE_PIN_TYPES__STRING:
				return getCompatiblePinTypes((String)arguments.get(0));
			case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__HARDWAREARCHITECTURELEVELTYPE:
				return getAllHardwareElements((HardwareArchitectureLevelType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssistModelImpl
