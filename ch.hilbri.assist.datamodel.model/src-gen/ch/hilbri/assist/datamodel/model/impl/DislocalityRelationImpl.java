/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dislocality Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DislocalityRelationImpl#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DislocalityRelationImpl extends MinimalEObjectImpl.Container implements DislocalityRelation {
	/**
	 * The cached value of the '{@link #getEqInterfaceOrGroups() <em>Eq Interface Or Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceOrGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EqInterfaceOrGroup> eqInterfaceOrGroups;

	/**
	 * The default value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareArchitectureLevelType HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CONNECTOR;

	/**
	 * The cached value of the '{@link #getHardwareLevel() <em>Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected HardwareArchitectureLevelType hardwareLevel = HARDWARE_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DislocalityRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DISLOCALITY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterfaceOrGroup> getEqInterfaceOrGroups() {
		if (eqInterfaceOrGroups == null) {
			eqInterfaceOrGroups = new EObjectResolvingEList<EqInterfaceOrGroup>(EqInterfaceOrGroup.class, this, ModelPackage.DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS);
		}
		return eqInterfaceOrGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getHardwareLevel() {
		return hardwareLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareLevel(HardwareArchitectureLevelType newHardwareLevel) {
		HardwareArchitectureLevelType oldHardwareLevel = hardwareLevel;
		hardwareLevel = newHardwareLevel == null ? HARDWARE_LEVEL_EDEFAULT : newHardwareLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISLOCALITY_RELATION__HARDWARE_LEVEL, oldHardwareLevel, hardwareLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getAllInterfaces() {
		final BasicEList<EqInterface> list = new BasicEList<EqInterface>();
		EList<EqInterfaceOrGroup> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();
		for (final EqInterfaceOrGroup e : _eqInterfaceOrGroups) {
			if ((e instanceof EqInterface)) {
				list.add(((EqInterface)e));
			}
			else {
				if ((e instanceof EqInterfaceGroup)) {
					EList<EqInterface> _eqInterfaces = ((EqInterfaceGroup)e).getEqInterfaces();
					list.addAll(_eqInterfaces);
				}
			}
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalInterfaceCount() {
		int counter = 0;
		EList<EqInterfaceOrGroup> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();
		for (final EqInterfaceOrGroup e : _eqInterfaceOrGroups) {
			if ((e instanceof EqInterface)) {
				int _counter = counter;
				counter = (_counter + 1);
			}
			else {
				if ((e instanceof EqInterfaceGroup)) {
					int _counter_1 = counter;
					EList<EqInterface> _eqInterfaces = ((EqInterfaceGroup)e).getEqInterfaces();
					int _length = ((Object[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_eqInterfaces, Object.class)).length;
					counter = (_counter_1 + _length);
				}
			}
		}
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllEqInterfaceOrGroupNames() {
		String result = "";
		boolean first = true;
		EList<EqInterfaceOrGroup> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();
		for (final EqInterfaceOrGroup e : _eqInterfaceOrGroups) {
			{
				if ((!first)) {
					String _result = result;
					result = (_result + ", ");
				}
				else {
					first = false;
				}
				if ((e instanceof EqInterface)) {
					String _result_1 = result;
					String _name = ((EqInterface)e).getName();
					result = (_result_1 + _name);
				}
				if ((e instanceof EqInterfaceGroup)) {
					String _result_2 = result;
					String _name_1 = ((EqInterfaceGroup)e).getName();
					result = (_result_2 + _name_1);
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				return getEqInterfaceOrGroups();
			case ModelPackage.DISLOCALITY_RELATION__HARDWARE_LEVEL:
				return getHardwareLevel();
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
			case ModelPackage.DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				getEqInterfaceOrGroups().clear();
				getEqInterfaceOrGroups().addAll((Collection<? extends EqInterfaceOrGroup>)newValue);
				return;
			case ModelPackage.DISLOCALITY_RELATION__HARDWARE_LEVEL:
				setHardwareLevel((HardwareArchitectureLevelType)newValue);
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
			case ModelPackage.DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				getEqInterfaceOrGroups().clear();
				return;
			case ModelPackage.DISLOCALITY_RELATION__HARDWARE_LEVEL:
				setHardwareLevel(HARDWARE_LEVEL_EDEFAULT);
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
			case ModelPackage.DISLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				return eqInterfaceOrGroups != null && !eqInterfaceOrGroups.isEmpty();
			case ModelPackage.DISLOCALITY_RELATION__HARDWARE_LEVEL:
				return hardwareLevel != HARDWARE_LEVEL_EDEFAULT;
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
			case ModelPackage.DISLOCALITY_RELATION___GET_ALL_INTERFACES:
				return getAllInterfaces();
			case ModelPackage.DISLOCALITY_RELATION___GET_TOTAL_INTERFACE_COUNT:
				return getTotalInterfaceCount();
			case ModelPackage.DISLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES:
				return getAllEqInterfaceOrGroupNames();
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
		result.append(" (hardwareLevel: ");
		result.append(hardwareLevel);
		result.append(')');
		return result.toString();
	}

} //DislocalityRelationImpl
