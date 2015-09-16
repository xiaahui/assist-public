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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getEqInterfaces <em>Eq Interfaces</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getEqInterfaceGroups <em>Eq Interface Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getValidDeployments <em>Valid Deployments</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getInvalidDeployments <em>Invalid Deployments</em>}</li>
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
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Compartment> compartments;

	/**
	 * The cached value of the '{@link #getEqInterfaces() <em>Eq Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterface> eqInterfaces;

	/**
	 * The cached value of the '{@link #getEqInterfaceGroups() <em>Eq Interface Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterfaceGroup> eqInterfaceGroups;

	/**
	 * The cached value of the '{@link #getDislocalityRelations() <em>Dislocality Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDislocalityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DislocalityRelation> dislocalityRelations;

	/**
	 * The cached value of the '{@link #getColocalityRelations() <em>Colocality Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColocalityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ColocalityRelation> colocalityRelations;

	/**
	 * The cached value of the '{@link #getValidDeployments() <em>Valid Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDeployment> validDeployments;

	/**
	 * The cached value of the '{@link #getInvalidDeployments() <em>Invalid Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<InvalidDeployment> invalidDeployments;

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
			compartments = new EObjectContainmentEList<Compartment>(Compartment.class, this, ModelPackage.ASSIST_MODEL__COMPARTMENTS);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getEqInterfaces() {
		if (eqInterfaces == null) {
			eqInterfaces = new EObjectContainmentEList<EqInterface>(EqInterface.class, this, ModelPackage.ASSIST_MODEL__EQ_INTERFACES);
		}
		return eqInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterfaceGroup> getEqInterfaceGroups() {
		if (eqInterfaceGroups == null) {
			eqInterfaceGroups = new EObjectContainmentEList<EqInterfaceGroup>(EqInterfaceGroup.class, this, ModelPackage.ASSIST_MODEL__EQ_INTERFACE_GROUPS);
		}
		return eqInterfaceGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DislocalityRelation> getDislocalityRelations() {
		if (dislocalityRelations == null) {
			dislocalityRelations = new EObjectContainmentEList<DislocalityRelation>(DislocalityRelation.class, this, ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS);
		}
		return dislocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColocalityRelation> getColocalityRelations() {
		if (colocalityRelations == null) {
			colocalityRelations = new EObjectContainmentEList<ColocalityRelation>(ColocalityRelation.class, this, ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS);
		}
		return colocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidDeployment> getValidDeployments() {
		if (validDeployments == null) {
			validDeployments = new EObjectContainmentEList<ValidDeployment>(ValidDeployment.class, this, ModelPackage.ASSIST_MODEL__VALID_DEPLOYMENTS);
		}
		return validDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvalidDeployment> getInvalidDeployments() {
		if (invalidDeployments == null) {
			invalidDeployments = new EObjectContainmentEList<InvalidDeployment>(InvalidDeployment.class, this, ModelPackage.ASSIST_MODEL__INVALID_DEPLOYMENTS);
		}
		return invalidDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compartment> getAllCompartments() {
		return this.getCompartments();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDC> getAllRDCs() {
		final BasicEList<RDC> list = new BasicEList<RDC>();
		EList<Compartment> _compartments = this.getCompartments();
		for (final Compartment c : _compartments) {
			EList<RDC> _rdcs = c.getRdcs();
			list.addAll(_rdcs);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getAllConnectors() {
		final BasicEList<Connector> list = new BasicEList<Connector>();
		EList<RDC> _allRDCs = this.getAllRDCs();
		for (final RDC r : _allRDCs) {
			EList<Connector> _connectors = r.getConnectors();
			list.addAll(_connectors);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getAllHardwareElements(final int level) {
		if ((level == 0)) {
			EList<Connector> _allConnectors = this.getAllConnectors();
			final Function1<Connector, HardwareElement> _function = new Function1<Connector, HardwareElement>() {
				public HardwareElement apply(final Connector it) {
					return ((HardwareElement) it);
				}
			};
			return XcoreEListExtensions.<Connector, HardwareElement>map(_allConnectors, _function);
		}
		else {
			if ((level == 1)) {
				EList<RDC> _allRDCs = this.getAllRDCs();
				final Function1<RDC, HardwareElement> _function_1 = new Function1<RDC, HardwareElement>() {
					public HardwareElement apply(final RDC it) {
						return ((HardwareElement) it);
					}
				};
				return XcoreEListExtensions.<RDC, HardwareElement>map(_allRDCs, _function_1);
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACES:
				return ((InternalEList<?>)getEqInterfaces()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACE_GROUPS:
				return ((InternalEList<?>)getEqInterfaceGroups()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return ((InternalEList<?>)getDislocalityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
				return ((InternalEList<?>)getColocalityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__VALID_DEPLOYMENTS:
				return ((InternalEList<?>)getValidDeployments()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__INVALID_DEPLOYMENTS:
				return ((InternalEList<?>)getInvalidDeployments()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACES:
				return getEqInterfaces();
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACE_GROUPS:
				return getEqInterfaceGroups();
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return getDislocalityRelations();
			case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
				return getColocalityRelations();
			case ModelPackage.ASSIST_MODEL__VALID_DEPLOYMENTS:
				return getValidDeployments();
			case ModelPackage.ASSIST_MODEL__INVALID_DEPLOYMENTS:
				return getInvalidDeployments();
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
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACES:
				getEqInterfaces().clear();
				getEqInterfaces().addAll((Collection<? extends EqInterface>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACE_GROUPS:
				getEqInterfaceGroups().clear();
				getEqInterfaceGroups().addAll((Collection<? extends EqInterfaceGroup>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				getDislocalityRelations().addAll((Collection<? extends DislocalityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
				getColocalityRelations().clear();
				getColocalityRelations().addAll((Collection<? extends ColocalityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__VALID_DEPLOYMENTS:
				getValidDeployments().clear();
				getValidDeployments().addAll((Collection<? extends ValidDeployment>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__INVALID_DEPLOYMENTS:
				getInvalidDeployments().clear();
				getInvalidDeployments().addAll((Collection<? extends InvalidDeployment>)newValue);
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
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACES:
				getEqInterfaces().clear();
				return;
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACE_GROUPS:
				getEqInterfaceGroups().clear();
				return;
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
				getColocalityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__VALID_DEPLOYMENTS:
				getValidDeployments().clear();
				return;
			case ModelPackage.ASSIST_MODEL__INVALID_DEPLOYMENTS:
				getInvalidDeployments().clear();
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
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACES:
				return eqInterfaces != null && !eqInterfaces.isEmpty();
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACE_GROUPS:
				return eqInterfaceGroups != null && !eqInterfaceGroups.isEmpty();
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return dislocalityRelations != null && !dislocalityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
				return colocalityRelations != null && !colocalityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__VALID_DEPLOYMENTS:
				return validDeployments != null && !validDeployments.isEmpty();
			case ModelPackage.ASSIST_MODEL__INVALID_DEPLOYMENTS:
				return invalidDeployments != null && !invalidDeployments.isEmpty();
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
			case ModelPackage.ASSIST_MODEL___GET_ALL_COMPARTMENTS:
				return getAllCompartments();
			case ModelPackage.ASSIST_MODEL___GET_ALL_RD_CS:
				return getAllRDCs();
			case ModelPackage.ASSIST_MODEL___GET_ALL_CONNECTORS:
				return getAllConnectors();
			case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT:
				return getAllHardwareElements((Integer)arguments.get(0));
			case ModelPackage.ASSIST_MODEL___GET_SYSTEM_NAME:
				return getSystemName();
			case ModelPackage.ASSIST_MODEL___GET_COMPATIBLE_IO_TYPES:
				return getCompatibleIoTypes();
			case ModelPackage.ASSIST_MODEL___GET_CABLE_WEIGHT_DATA:
				return getCableWeightData();
			case ModelPackage.ASSIST_MODEL___GET_PROTECTION_LEVEL_DATA:
				return getProtectionLevelData();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssistModelImpl
