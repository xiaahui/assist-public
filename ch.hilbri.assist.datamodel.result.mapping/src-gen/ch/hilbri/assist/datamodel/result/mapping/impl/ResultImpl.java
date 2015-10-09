/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.InterfacesBlock;
import ch.hilbri.assist.datamodel.model.Pin;

import ch.hilbri.assist.datamodel.result.mapping.Evaluation;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;
import ch.hilbri.assist.datamodel.result.mapping.Result;

import com.google.common.base.Objects;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getMappingsForHardwareElements <em>Mappings For Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getSolutionFoundOrderId <em>Solution Found Order Id</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected AssistModel model;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected HashMap<EqInterface, Pin> mapping;

	/**
	 * The cached value of the '{@link #getMappingsForHardwareElements() <em>Mappings For Hardware Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingsForHardwareElements()
	 * @generated
	 * @ordered
	 */
	protected HashMap<HardwareElement, EList<EqInterface>> mappingsForHardwareElements;

	/**
	 * The default value of the '{@link #isPartialSolution() <em>Partial Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartialSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIAL_SOLUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartialSolution() <em>Partial Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartialSolution()
	 * @generated
	 * @ordered
	 */
	protected boolean partialSolution = PARTIAL_SOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolutionFoundOrderId() <em>Solution Found Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionFoundOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUTION_FOUND_ORDER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSolutionFoundOrderId() <em>Solution Found Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionFoundOrderId()
	 * @generated
	 * @ordered
	 */
	protected int solutionFoundOrderId = SOLUTION_FOUND_ORDER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Evaluation evaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (AssistModel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.RESULT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(AssistModel newModel) {
		AssistModel oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<EqInterface, Pin> getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(HashMap<EqInterface, Pin> newMapping) {
		HashMap<EqInterface, Pin> oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<HardwareElement, EList<EqInterface>> getMappingsForHardwareElements() {
		return mappingsForHardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingsForHardwareElements(HashMap<HardwareElement, EList<EqInterface>> newMappingsForHardwareElements) {
		HashMap<HardwareElement, EList<EqInterface>> oldMappingsForHardwareElements = mappingsForHardwareElements;
		mappingsForHardwareElements = newMappingsForHardwareElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__MAPPINGS_FOR_HARDWARE_ELEMENTS, oldMappingsForHardwareElements, mappingsForHardwareElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartialSolution() {
		return partialSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialSolution(boolean newPartialSolution) {
		boolean oldPartialSolution = partialSolution;
		partialSolution = newPartialSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__PARTIAL_SOLUTION, oldPartialSolution, partialSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSolutionFoundOrderId() {
		return solutionFoundOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolutionFoundOrderId(int newSolutionFoundOrderId) {
		int oldSolutionFoundOrderId = solutionFoundOrderId;
		solutionFoundOrderId = newSolutionFoundOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__SOLUTION_FOUND_ORDER_ID, oldSolutionFoundOrderId, solutionFoundOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluation(Evaluation newEvaluation, NotificationChain msgs) {
		Evaluation oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__EVALUATION, oldEvaluation, newEvaluation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Evaluation newEvaluation) {
		if (newEvaluation != evaluation) {
			NotificationChain msgs = null;
			if (evaluation != null)
				msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.RESULT__EVALUATION, null, msgs);
			if (newEvaluation != null)
				msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.RESULT__EVALUATION, null, msgs);
			msgs = basicSetEvaluation(newEvaluation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__EVALUATION, newEvaluation, newEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getAllUnmappedEqInterfaces() {
		AssistModel _model = this.getModel();
		InterfacesBlock _interfacesBlock = _model.getInterfacesBlock();
		EList<EqInterface> _eqInterfaces = _interfacesBlock.getEqInterfaces();
		final Function1<EqInterface, Boolean> _function = new Function1<EqInterface, Boolean>() {
			public Boolean apply(final EqInterface it) {
				HashMap<EqInterface, Pin> _mapping = ResultImpl.this.getMapping();
				Set<EqInterface> _keySet = _mapping.keySet();
				boolean _contains = _keySet.contains(it);
				return Boolean.valueOf((!_contains));
			}
		};
		Iterable<EqInterface> _filter = IterableExtensions.<EqInterface>filter(_eqInterfaces, _function);
		return ECollections.<EqInterface>toEList(_filter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompletenessAsPercentage() {
		EList<EqInterface> _allUnmappedEqInterfaces = this.getAllUnmappedEqInterfaces();
		int _length = ((Object[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_allUnmappedEqInterfaces, Object.class)).length;
		int _multiply = (_length * 100);
		AssistModel _model = this.getModel();
		InterfacesBlock _interfacesBlock = _model.getInterfacesBlock();
		EList<EqInterface> _eqInterfaces = _interfacesBlock.getEqInterfaces();
		int _length_1 = ((Object[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_eqInterfaces, Object.class)).length;
		int _divide = (_multiply / _length_1);
		return (100 - _divide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinForEqInterface(final EqInterface iface) {
		Pin _xifexpression = null;
		HashMap<EqInterface, Pin> _mapping = this.getMapping();
		Set<EqInterface> _keySet = _mapping.keySet();
		boolean _contains = _keySet.contains(iface);
		if (_contains) {
			HashMap<EqInterface, Pin> _mapping_1 = this.getMapping();
			_xifexpression = _mapping_1.get(iface);
		}
		else {
			_xifexpression = null;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqInterface getEqInterfaceForPin(final Pin p) {
		EqInterface _xblockexpression = null;
		{
			HashMap<EqInterface, Pin> _mapping = this.getMapping();
			final Function2<EqInterface, Pin, Boolean> _function = new Function2<EqInterface, Pin, Boolean>() {
				public Boolean apply(final EqInterface iface, final Pin pin) {
					return Boolean.valueOf(Objects.equal(pin, p));
				}
			};
			Map<EqInterface, Pin> _filter = MapExtensions.<EqInterface, Pin>filter(_mapping, _function);
			final Set<EqInterface> ifaces = _filter.keySet();
			EqInterface _xifexpression = null;
			int _length = ((Object[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(ifaces, Object.class)).length;
			boolean _equals = (_length == 1);
			if (_equals) {
				_xifexpression = ((EqInterface[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(ifaces, EqInterface.class))[0];
			}
			_xblockexpression = _xifexpression;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqInterface> getAllMappedEqInterfaces(final HardwareElement elem) {
		HashMap<HardwareElement, EList<EqInterface>> _mappingsForHardwareElements = this.getMappingsForHardwareElements();
		return _mappingsForHardwareElements.get(elem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int compareTo(final Result o) {
		Evaluation _evaluation = o.getEvaluation();
		double _totalScaledScore = _evaluation.getTotalScaledScore();
		Evaluation _evaluation_1 = this.getEvaluation();
		double _totalScaledScore_1 = _evaluation_1.getTotalScaledScore();
		return Double.compare(_totalScaledScore, _totalScaledScore_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.RESULT__EVALUATION:
				return basicSetEvaluation(null, msgs);
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
			case MappingPackage.RESULT__NAME:
				return getName();
			case MappingPackage.RESULT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case MappingPackage.RESULT__MAPPING:
				return getMapping();
			case MappingPackage.RESULT__MAPPINGS_FOR_HARDWARE_ELEMENTS:
				return getMappingsForHardwareElements();
			case MappingPackage.RESULT__PARTIAL_SOLUTION:
				return isPartialSolution();
			case MappingPackage.RESULT__SOLUTION_FOUND_ORDER_ID:
				return getSolutionFoundOrderId();
			case MappingPackage.RESULT__EVALUATION:
				return getEvaluation();
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
			case MappingPackage.RESULT__NAME:
				setName((String)newValue);
				return;
			case MappingPackage.RESULT__MODEL:
				setModel((AssistModel)newValue);
				return;
			case MappingPackage.RESULT__MAPPING:
				setMapping((HashMap<EqInterface, Pin>)newValue);
				return;
			case MappingPackage.RESULT__MAPPINGS_FOR_HARDWARE_ELEMENTS:
				setMappingsForHardwareElements((HashMap<HardwareElement, EList<EqInterface>>)newValue);
				return;
			case MappingPackage.RESULT__PARTIAL_SOLUTION:
				setPartialSolution((Boolean)newValue);
				return;
			case MappingPackage.RESULT__SOLUTION_FOUND_ORDER_ID:
				setSolutionFoundOrderId((Integer)newValue);
				return;
			case MappingPackage.RESULT__EVALUATION:
				setEvaluation((Evaluation)newValue);
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
			case MappingPackage.RESULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MappingPackage.RESULT__MODEL:
				setModel((AssistModel)null);
				return;
			case MappingPackage.RESULT__MAPPING:
				setMapping((HashMap<EqInterface, Pin>)null);
				return;
			case MappingPackage.RESULT__MAPPINGS_FOR_HARDWARE_ELEMENTS:
				setMappingsForHardwareElements((HashMap<HardwareElement, EList<EqInterface>>)null);
				return;
			case MappingPackage.RESULT__PARTIAL_SOLUTION:
				setPartialSolution(PARTIAL_SOLUTION_EDEFAULT);
				return;
			case MappingPackage.RESULT__SOLUTION_FOUND_ORDER_ID:
				setSolutionFoundOrderId(SOLUTION_FOUND_ORDER_ID_EDEFAULT);
				return;
			case MappingPackage.RESULT__EVALUATION:
				setEvaluation((Evaluation)null);
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
			case MappingPackage.RESULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MappingPackage.RESULT__MODEL:
				return model != null;
			case MappingPackage.RESULT__MAPPING:
				return mapping != null;
			case MappingPackage.RESULT__MAPPINGS_FOR_HARDWARE_ELEMENTS:
				return mappingsForHardwareElements != null;
			case MappingPackage.RESULT__PARTIAL_SOLUTION:
				return partialSolution != PARTIAL_SOLUTION_EDEFAULT;
			case MappingPackage.RESULT__SOLUTION_FOUND_ORDER_ID:
				return solutionFoundOrderId != SOLUTION_FOUND_ORDER_ID_EDEFAULT;
			case MappingPackage.RESULT__EVALUATION:
				return evaluation != null;
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
			case MappingPackage.RESULT___GET_ALL_UNMAPPED_EQ_INTERFACES:
				return getAllUnmappedEqInterfaces();
			case MappingPackage.RESULT___GET_COMPLETENESS_AS_PERCENTAGE:
				return getCompletenessAsPercentage();
			case MappingPackage.RESULT___GET_PIN_FOR_EQ_INTERFACE__EQINTERFACE:
				return getPinForEqInterface((EqInterface)arguments.get(0));
			case MappingPackage.RESULT___GET_EQ_INTERFACE_FOR_PIN__PIN:
				return getEqInterfaceForPin((Pin)arguments.get(0));
			case MappingPackage.RESULT___GET_ALL_MAPPED_EQ_INTERFACES__HARDWAREELEMENT:
				return getAllMappedEqInterfaces((HardwareElement)arguments.get(0));
			case MappingPackage.RESULT___COMPARE_TO__RESULT:
				return compareTo((Result)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mapping: ");
		result.append(mapping);
		result.append(", mappingsForHardwareElements: ");
		result.append(mappingsForHardwareElements);
		result.append(", partialSolution: ");
		result.append(partialSolution);
		result.append(", solutionFoundOrderId: ");
		result.append(solutionFoundOrderId);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
