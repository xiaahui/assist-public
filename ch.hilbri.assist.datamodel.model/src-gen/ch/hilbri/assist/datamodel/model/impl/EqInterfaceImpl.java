/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getSystem <em>System</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getSubAta <em>Sub Ata</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getLineName <em>Line Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getWiringLane <em>Wiring Lane</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getGrpInfo <em>Grp Info</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getPwSup1 <em>Pw Sup1</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getEmhZone1 <em>Emh Zone1</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getResourceX <em>Resource X</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getResourceY <em>Resource Y</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getResourceZ <em>Resource Z</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.EqInterfaceImpl#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqInterfaceImpl extends EqInterfaceOrGroupImpl implements EqInterface {
	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected String system = SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubAta() <em>Sub Ata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAta()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_ATA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSubAta() <em>Sub Ata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAta()
	 * @generated
	 * @ordered
	 */
	protected String subAta = SUB_ATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected String lineName = LINE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWiringLane() <em>Wiring Lane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiringLane()
	 * @generated
	 * @ordered
	 */
	protected static final String WIRING_LANE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getWiringLane() <em>Wiring Lane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiringLane()
	 * @generated
	 * @ordered
	 */
	protected String wiringLane = WIRING_LANE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrpInfo() <em>Grp Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrpInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String GRP_INFO_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getGrpInfo() <em>Grp Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrpInfo()
	 * @generated
	 * @ordered
	 */
	protected String grpInfo = GRP_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected String route = ROUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPwSup1() <em>Pw Sup1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwSup1()
	 * @generated
	 * @ordered
	 */
	protected static final String PW_SUP1_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPwSup1() <em>Pw Sup1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwSup1()
	 * @generated
	 * @ordered
	 */
	protected String pwSup1 = PW_SUP1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmhZone1() <em>Emh Zone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmhZone1()
	 * @generated
	 * @ordered
	 */
	protected static final String EMH_ZONE1_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEmhZone1() <em>Emh Zone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmhZone1()
	 * @generated
	 * @ordered
	 */
	protected String emhZone1 = EMH_ZONE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected static final String IO_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected String ioType = IO_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceX() <em>Resource X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceX()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceX() <em>Resource X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceX()
	 * @generated
	 * @ordered
	 */
	protected int resourceX = RESOURCE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceY() <em>Resource Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceY()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceY() <em>Resource Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceY()
	 * @generated
	 * @ordered
	 */
	protected int resourceY = RESOURCE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceZ() <em>Resource Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceZ()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceZ() <em>Resource Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceZ()
	 * @generated
	 * @ordered
	 */
	protected int resourceZ = RESOURCE_Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetricParameters() <em>Metric Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MetricParameter> metricParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EQ_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(String newSystem) {
		String oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubAta() {
		return subAta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubAta(String newSubAta) {
		String oldSubAta = subAta;
		subAta = newSubAta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__SUB_ATA, oldSubAta, subAta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineName() {
		return lineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineName(String newLineName) {
		String oldLineName = lineName;
		lineName = newLineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__LINE_NAME, oldLineName, lineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWiringLane() {
		return wiringLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWiringLane(String newWiringLane) {
		String oldWiringLane = wiringLane;
		wiringLane = newWiringLane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__WIRING_LANE, oldWiringLane, wiringLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrpInfo() {
		return grpInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrpInfo(String newGrpInfo) {
		String oldGrpInfo = grpInfo;
		grpInfo = newGrpInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__GRP_INFO, oldGrpInfo, grpInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(String newRoute) {
		String oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPwSup1() {
		return pwSup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwSup1(String newPwSup1) {
		String oldPwSup1 = pwSup1;
		pwSup1 = newPwSup1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__PW_SUP1, oldPwSup1, pwSup1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmhZone1() {
		return emhZone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmhZone1(String newEmhZone1) {
		String oldEmhZone1 = emhZone1;
		emhZone1 = newEmhZone1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__EMH_ZONE1, oldEmhZone1, emhZone1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIoType() {
		return ioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoType(String newIoType) {
		String oldIoType = ioType;
		ioType = newIoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__IO_TYPE, oldIoType, ioType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceX() {
		return resourceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceX(int newResourceX) {
		int oldResourceX = resourceX;
		resourceX = newResourceX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__RESOURCE_X, oldResourceX, resourceX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceY() {
		return resourceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceY(int newResourceY) {
		int oldResourceY = resourceY;
		resourceY = newResourceY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__RESOURCE_Y, oldResourceY, resourceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceZ() {
		return resourceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceZ(int newResourceZ) {
		int oldResourceZ = resourceZ;
		resourceZ = newResourceZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQ_INTERFACE__RESOURCE_Z, oldResourceZ, resourceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricParameter> getMetricParameters() {
		if (metricParameters == null) {
			metricParameters = new EObjectContainmentEList<MetricParameter>(MetricParameter.class, this, ModelPackage.EQ_INTERFACE__METRIC_PARAMETERS);
		}
		return metricParameters;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.EQ_INTERFACE__METRIC_PARAMETERS:
				return ((InternalEList<?>)getMetricParameters()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.EQ_INTERFACE__SYSTEM:
				return getSystem();
			case ModelPackage.EQ_INTERFACE__SUB_ATA:
				return getSubAta();
			case ModelPackage.EQ_INTERFACE__LINE_NAME:
				return getLineName();
			case ModelPackage.EQ_INTERFACE__WIRING_LANE:
				return getWiringLane();
			case ModelPackage.EQ_INTERFACE__GRP_INFO:
				return getGrpInfo();
			case ModelPackage.EQ_INTERFACE__ROUTE:
				return getRoute();
			case ModelPackage.EQ_INTERFACE__PW_SUP1:
				return getPwSup1();
			case ModelPackage.EQ_INTERFACE__EMH_ZONE1:
				return getEmhZone1();
			case ModelPackage.EQ_INTERFACE__IO_TYPE:
				return getIoType();
			case ModelPackage.EQ_INTERFACE__RESOURCE:
				return getResource();
			case ModelPackage.EQ_INTERFACE__RESOURCE_X:
				return getResourceX();
			case ModelPackage.EQ_INTERFACE__RESOURCE_Y:
				return getResourceY();
			case ModelPackage.EQ_INTERFACE__RESOURCE_Z:
				return getResourceZ();
			case ModelPackage.EQ_INTERFACE__METRIC_PARAMETERS:
				return getMetricParameters();
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
			case ModelPackage.EQ_INTERFACE__SYSTEM:
				setSystem((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__SUB_ATA:
				setSubAta((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__LINE_NAME:
				setLineName((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__WIRING_LANE:
				setWiringLane((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__GRP_INFO:
				setGrpInfo((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__ROUTE:
				setRoute((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__PW_SUP1:
				setPwSup1((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__EMH_ZONE1:
				setEmhZone1((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__IO_TYPE:
				setIoType((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE:
				setResource((String)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE_X:
				setResourceX((Integer)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE_Y:
				setResourceY((Integer)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE_Z:
				setResourceZ((Integer)newValue);
				return;
			case ModelPackage.EQ_INTERFACE__METRIC_PARAMETERS:
				getMetricParameters().clear();
				getMetricParameters().addAll((Collection<? extends MetricParameter>)newValue);
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
			case ModelPackage.EQ_INTERFACE__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__SUB_ATA:
				setSubAta(SUB_ATA_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__LINE_NAME:
				setLineName(LINE_NAME_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__WIRING_LANE:
				setWiringLane(WIRING_LANE_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__GRP_INFO:
				setGrpInfo(GRP_INFO_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__ROUTE:
				setRoute(ROUTE_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__PW_SUP1:
				setPwSup1(PW_SUP1_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__EMH_ZONE1:
				setEmhZone1(EMH_ZONE1_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__IO_TYPE:
				setIoType(IO_TYPE_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE_X:
				setResourceX(RESOURCE_X_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE_Y:
				setResourceY(RESOURCE_Y_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__RESOURCE_Z:
				setResourceZ(RESOURCE_Z_EDEFAULT);
				return;
			case ModelPackage.EQ_INTERFACE__METRIC_PARAMETERS:
				getMetricParameters().clear();
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
			case ModelPackage.EQ_INTERFACE__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case ModelPackage.EQ_INTERFACE__SUB_ATA:
				return SUB_ATA_EDEFAULT == null ? subAta != null : !SUB_ATA_EDEFAULT.equals(subAta);
			case ModelPackage.EQ_INTERFACE__LINE_NAME:
				return LINE_NAME_EDEFAULT == null ? lineName != null : !LINE_NAME_EDEFAULT.equals(lineName);
			case ModelPackage.EQ_INTERFACE__WIRING_LANE:
				return WIRING_LANE_EDEFAULT == null ? wiringLane != null : !WIRING_LANE_EDEFAULT.equals(wiringLane);
			case ModelPackage.EQ_INTERFACE__GRP_INFO:
				return GRP_INFO_EDEFAULT == null ? grpInfo != null : !GRP_INFO_EDEFAULT.equals(grpInfo);
			case ModelPackage.EQ_INTERFACE__ROUTE:
				return ROUTE_EDEFAULT == null ? route != null : !ROUTE_EDEFAULT.equals(route);
			case ModelPackage.EQ_INTERFACE__PW_SUP1:
				return PW_SUP1_EDEFAULT == null ? pwSup1 != null : !PW_SUP1_EDEFAULT.equals(pwSup1);
			case ModelPackage.EQ_INTERFACE__EMH_ZONE1:
				return EMH_ZONE1_EDEFAULT == null ? emhZone1 != null : !EMH_ZONE1_EDEFAULT.equals(emhZone1);
			case ModelPackage.EQ_INTERFACE__IO_TYPE:
				return IO_TYPE_EDEFAULT == null ? ioType != null : !IO_TYPE_EDEFAULT.equals(ioType);
			case ModelPackage.EQ_INTERFACE__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case ModelPackage.EQ_INTERFACE__RESOURCE_X:
				return resourceX != RESOURCE_X_EDEFAULT;
			case ModelPackage.EQ_INTERFACE__RESOURCE_Y:
				return resourceY != RESOURCE_Y_EDEFAULT;
			case ModelPackage.EQ_INTERFACE__RESOURCE_Z:
				return resourceZ != RESOURCE_Z_EDEFAULT;
			case ModelPackage.EQ_INTERFACE__METRIC_PARAMETERS:
				return metricParameters != null && !metricParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EqInterfaceOrGroup.class) {
			switch (baseOperationID) {
				case ModelPackage.EQ_INTERFACE_OR_GROUP___TO_STRING: return ModelPackage.EQ_INTERFACE___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EQ_INTERFACE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EqInterfaceImpl
