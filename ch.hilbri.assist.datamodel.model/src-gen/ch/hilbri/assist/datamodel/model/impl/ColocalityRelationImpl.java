/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colocality Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ColocalityRelationImpl#getEqInterfaceOrGroups <em>Eq Interface Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ColocalityRelationImpl#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColocalityRelationImpl extends MinimalEObjectImpl.Container implements ColocalityRelation {
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
	protected static final HardwareArchitectureLevelType HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.PIN;

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
	protected ColocalityRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COLOCALITY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterfaceOrGroup> getEqInterfaceOrGroups() {
		if (eqInterfaceOrGroups == null) {
			eqInterfaceOrGroups = new EObjectResolvingEList<EqInterfaceOrGroup>(EqInterfaceOrGroup.class, this, ModelPackage.COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COLOCALITY_RELATION__HARDWARE_LEVEL, oldHardwareLevel, hardwareLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getAllInterfaces() {
		EList<EqInterfaceOrGroup> _eqInterfaceOrGroups = this.getEqInterfaceOrGroups();
		final Function1<EqInterfaceOrGroup, List<EqInterface>> _function = new Function1<EqInterfaceOrGroup, List<EqInterface>>() {
			public List<EqInterface> apply(final EqInterfaceOrGroup it) {
				List<EqInterface> _xifexpression = null;
				if ((it instanceof EqInterface)) {
					_xifexpression = java.util.Collections.<EqInterface>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EqInterface>newArrayList(((EqInterface)it)));
				}
				else {
					EList<EqInterface> _xifexpression_1 = null;
					if ((it instanceof EqInterfaceGroup)) {
						_xifexpression_1 = ((EqInterfaceGroup)it).getEqInterfaces();
					}
					_xifexpression = _xifexpression_1;
				}
				return _xifexpression;
			}
		};
		EList<List<EqInterface>> _map = XcoreEListExtensions.<EqInterfaceOrGroup, List<EqInterface>>map(_eqInterfaceOrGroups, _function);
		Iterable<EqInterface> _flatten = Iterables.<EqInterface>concat(_map);
		return ECollections.<EqInterface>toEList(_flatten);
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
			case ModelPackage.COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				return getEqInterfaceOrGroups();
			case ModelPackage.COLOCALITY_RELATION__HARDWARE_LEVEL:
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
			case ModelPackage.COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				getEqInterfaceOrGroups().clear();
				getEqInterfaceOrGroups().addAll((Collection<? extends EqInterfaceOrGroup>)newValue);
				return;
			case ModelPackage.COLOCALITY_RELATION__HARDWARE_LEVEL:
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
			case ModelPackage.COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				getEqInterfaceOrGroups().clear();
				return;
			case ModelPackage.COLOCALITY_RELATION__HARDWARE_LEVEL:
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
			case ModelPackage.COLOCALITY_RELATION__EQ_INTERFACE_OR_GROUPS:
				return eqInterfaceOrGroups != null && !eqInterfaceOrGroups.isEmpty();
			case ModelPackage.COLOCALITY_RELATION__HARDWARE_LEVEL:
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
			case ModelPackage.COLOCALITY_RELATION___GET_ALL_INTERFACES:
				return getAllInterfaces();
			case ModelPackage.COLOCALITY_RELATION___GET_ALL_EQ_INTERFACE_OR_GROUP_NAMES:
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

} //ColocalityRelationImpl
