/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.CableWeightData;
import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelData;
import ch.hilbri.assist.datamodel.model.RDC;
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
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getCableWeightData <em>Cable Weight Data</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getProtectionLevelData <em>Protection Level Data</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.AssistModelImpl#getCompatibleIoTypes <em>Compatible Io Types</em>}</li>
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
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCableWeightData() <em>Cable Weight Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCableWeightData()
	 * @generated
	 * @ordered
	 */
	protected CableWeightData cableWeightData;

	/**
	 * The cached value of the '{@link #getProtectionLevelData() <em>Protection Level Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevelData()
	 * @generated
	 * @ordered
	 */
	protected ProtectionLevelData protectionLevelData;

	/**
	 * The cached value of the '{@link #getCompatibleIoTypes() <em>Compatible Io Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleIoTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleIoTypeEntry> compatibleIoTypes;

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
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableWeightData getCableWeightData() {
		return cableWeightData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCableWeightData(CableWeightData newCableWeightData, NotificationChain msgs) {
		CableWeightData oldCableWeightData = cableWeightData;
		cableWeightData = newCableWeightData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA, oldCableWeightData, newCableWeightData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCableWeightData(CableWeightData newCableWeightData) {
		if (newCableWeightData != cableWeightData) {
			NotificationChain msgs = null;
			if (cableWeightData != null)
				msgs = ((InternalEObject)cableWeightData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA, null, msgs);
			if (newCableWeightData != null)
				msgs = ((InternalEObject)newCableWeightData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA, null, msgs);
			msgs = basicSetCableWeightData(newCableWeightData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA, newCableWeightData, newCableWeightData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionLevelData getProtectionLevelData() {
		return protectionLevelData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectionLevelData(ProtectionLevelData newProtectionLevelData, NotificationChain msgs) {
		ProtectionLevelData oldProtectionLevelData = protectionLevelData;
		protectionLevelData = newProtectionLevelData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA, oldProtectionLevelData, newProtectionLevelData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionLevelData(ProtectionLevelData newProtectionLevelData) {
		if (newProtectionLevelData != protectionLevelData) {
			NotificationChain msgs = null;
			if (protectionLevelData != null)
				msgs = ((InternalEObject)protectionLevelData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA, null, msgs);
			if (newProtectionLevelData != null)
				msgs = ((InternalEObject)newProtectionLevelData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA, null, msgs);
			msgs = basicSetProtectionLevelData(newProtectionLevelData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA, newProtectionLevelData, newProtectionLevelData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleIoTypeEntry> getCompatibleIoTypes() {
		if (compatibleIoTypes == null) {
			compatibleIoTypes = new EObjectContainmentEList<CompatibleIoTypeEntry>(CompatibleIoTypeEntry.class, this, ModelPackage.ASSIST_MODEL__COMPATIBLE_IO_TYPES);
		}
		return compatibleIoTypes;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA:
				return basicSetCableWeightData(null, msgs);
			case ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA:
				return basicSetProtectionLevelData(null, msgs);
			case ModelPackage.ASSIST_MODEL__COMPATIBLE_IO_TYPES:
				return ((InternalEList<?>)getCompatibleIoTypes()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				return getSystemName();
			case ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA:
				return getCableWeightData();
			case ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA:
				return getProtectionLevelData();
			case ModelPackage.ASSIST_MODEL__COMPATIBLE_IO_TYPES:
				return getCompatibleIoTypes();
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA:
				setCableWeightData((CableWeightData)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA:
				setProtectionLevelData((ProtectionLevelData)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__COMPATIBLE_IO_TYPES:
				getCompatibleIoTypes().clear();
				getCompatibleIoTypes().addAll((Collection<? extends CompatibleIoTypeEntry>)newValue);
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA:
				setCableWeightData((CableWeightData)null);
				return;
			case ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA:
				setProtectionLevelData((ProtectionLevelData)null);
				return;
			case ModelPackage.ASSIST_MODEL__COMPATIBLE_IO_TYPES:
				getCompatibleIoTypes().clear();
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA:
				return cableWeightData != null;
			case ModelPackage.ASSIST_MODEL__PROTECTION_LEVEL_DATA:
				return protectionLevelData != null;
			case ModelPackage.ASSIST_MODEL__COMPATIBLE_IO_TYPES:
				return compatibleIoTypes != null && !compatibleIoTypes.isEmpty();
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
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //AssistModelImpl
