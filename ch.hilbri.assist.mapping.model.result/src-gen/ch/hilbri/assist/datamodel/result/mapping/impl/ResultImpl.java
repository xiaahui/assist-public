/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.result.mapping.Application;
import ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup;
import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.Box;
import ch.hilbri.assist.datamodel.result.mapping.CommunicationRelation;
import ch.hilbri.assist.datamodel.result.mapping.Compartment;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.Evaluation;
import ch.hilbri.assist.datamodel.result.mapping.HardwareElement;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;
import ch.hilbri.assist.datamodel.result.mapping.Network;
import ch.hilbri.assist.datamodel.result.mapping.Processor;
import ch.hilbri.assist.datamodel.result.mapping.Result;

import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType;

import com.google.common.base.Objects;

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
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getRootHardwareElements <em>Root Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getTopHardwareLevel <em>Top Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getBottomHardwareLevel <em>Bottom Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.ResultImpl#getCommunications <em>Communications</em>}</li>
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
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getRootHardwareElements() <em>Root Hardware Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootHardwareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareElement> rootHardwareElements;

	/**
	 * The default value of the '{@link #getTopHardwareLevel() <em>Top Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareArchitectureLevelType TOP_HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

	/**
	 * The default value of the '{@link #getBottomHardwareLevel() <em>Bottom Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomHardwareLevel()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareArchitectureLevelType BOTTOM_HARDWARE_LEVEL_EDEFAULT = HardwareArchitectureLevelType.CORE;

	/**
	 * The cached value of the '{@link #getApplicationGroups() <em>Application Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationGroup> applicationGroups;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRelation> communications;

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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.RESULT__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getRootHardwareElements() {
		if (rootHardwareElements == null) {
			rootHardwareElements = new EObjectContainmentEList<HardwareElement>(HardwareElement.class, this, MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS);
		}
		return rootHardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getTopHardwareLevel() {
		HardwareArchitectureLevelType _xifexpression = null;
		EList<HardwareElement> _rootHardwareElements = this.getRootHardwareElements();
		boolean _isEmpty = _rootHardwareElements.isEmpty();
		boolean _not = (!_isEmpty);
		if (_not) {
			HardwareArchitectureLevelType _switchResult = null;
			EList<HardwareElement> _rootHardwareElements_1 = this.getRootHardwareElements();
			HardwareElement _get = _rootHardwareElements_1.get(0);
			boolean _matched = false;
			if (_get instanceof Compartment) {
				_matched=true;
				_switchResult = HardwareArchitectureLevelType.COMPARTMENT;
			}
			if (!_matched) {
				if (_get instanceof Box) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.BOX;
				}
			}
			if (!_matched) {
				if (_get instanceof Board) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.BOARD;
				}
			}
			if (!_matched) {
				if (_get instanceof Processor) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.PROCESSOR;
				}
			}
			if (!_matched) {
				if (_get instanceof Core) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.CORE;
				}
			}
			_xifexpression = _switchResult;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getBottomHardwareLevel() {
		return HardwareArchitectureLevelType.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationGroup> getApplicationGroups() {
		if (applicationGroups == null) {
			applicationGroups = new EObjectContainmentEList<ApplicationGroup>(ApplicationGroup.class, this, MappingPackage.RESULT__APPLICATION_GROUPS);
		}
		return applicationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<Application>(Application.class, this, MappingPackage.RESULT__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, MappingPackage.RESULT__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRelation> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<CommunicationRelation>(CommunicationRelation.class, this, MappingPackage.RESULT__COMMUNICATIONS);
		}
		return communications;
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
	public int compareTo(final Result o) {
		Evaluation _evaluation = null;
		if (this!=null) {
			_evaluation=this.getEvaluation();
		}
		double _totalScaledScore = _evaluation.getTotalScaledScore();
		Evaluation _evaluation_1 = null;
		if (o!=null) {
			_evaluation_1=o.getEvaluation();
		}
		double _totalScaledScore_1 = _evaluation_1.getTotalScaledScore();
		final double diff = (_totalScaledScore - _totalScaledScore_1);
		if ((diff < 0.0)) {
			return 1;
		}
		if ((diff > 0.0)) {
			return (-1);
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compartment> getAllCompartments() {
		HardwareArchitectureLevelType _topHardwareLevel = this.getTopHardwareLevel();
		boolean _equals = Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.COMPARTMENT);
		if (_equals) {
			EList<HardwareElement> _rootHardwareElements = this.getRootHardwareElements();
			final Function1<HardwareElement, Compartment> _function = new Function1<HardwareElement, Compartment>() {
				public Compartment apply(final HardwareElement elem) {
					return ((Compartment) elem);
				}
			};
			return XcoreEListExtensions.<HardwareElement, Compartment>map(_rootHardwareElements, _function);
		}
		else {
			return new BasicEList<Compartment>();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Box> getAllBoxes() {
		final BasicEList<Box> list = new BasicEList<Box>();
		HardwareArchitectureLevelType _topHardwareLevel = this.getTopHardwareLevel();
		if (_topHardwareLevel != null) {
			switch (_topHardwareLevel) {
				case COMPARTMENT:
					EList<HardwareElement> _rootHardwareElements = this.getRootHardwareElements();
					for (final HardwareElement c : _rootHardwareElements) {
						EList<Box> _boxes = ((Compartment) c).getBoxes();
						list.addAll(_boxes);
					}
					break;
				case BOX:
					EList<HardwareElement> _rootHardwareElements_1 = this.getRootHardwareElements();
					final Function1<HardwareElement, Box> _function = new Function1<HardwareElement, Box>() {
						public Box apply(final HardwareElement elem) {
							return ((Box) elem);
						}
					};
					EList<Box> _map = XcoreEListExtensions.<HardwareElement, Box>map(_rootHardwareElements_1, _function);
					list.addAll(_map);
					break;
				default:
					break;
			}
		}
		else {
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getAllBoards() {
		final BasicEList<Board> list = new BasicEList<Board>();
		HardwareArchitectureLevelType _topHardwareLevel = this.getTopHardwareLevel();
		if (_topHardwareLevel != null) {
			switch (_topHardwareLevel) {
				case COMPARTMENT:
					EList<HardwareElement> _rootHardwareElements = this.getRootHardwareElements();
					for (final HardwareElement c : _rootHardwareElements) {
						EList<Board> _allBoards = ((Compartment) c).getAllBoards();
						list.addAll(_allBoards);
					}
					break;
				case BOX:
					EList<HardwareElement> _rootHardwareElements_1 = this.getRootHardwareElements();
					for (final HardwareElement b : _rootHardwareElements_1) {
						EList<Board> _boards = ((Box) b).getBoards();
						list.addAll(_boards);
					}
					break;
				case BOARD:
					EList<HardwareElement> _rootHardwareElements_2 = this.getRootHardwareElements();
					final Function1<HardwareElement, Board> _function = new Function1<HardwareElement, Board>() {
						public Board apply(final HardwareElement elem) {
							return ((Board) elem);
						}
					};
					EList<Board> _map = XcoreEListExtensions.<HardwareElement, Board>map(_rootHardwareElements_2, _function);
					list.addAll(_map);
					break;
				default:
					break;
			}
		}
		else {
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getAllProcessors() {
		final BasicEList<Processor> list = new BasicEList<Processor>();
		HardwareArchitectureLevelType _topHardwareLevel = this.getTopHardwareLevel();
		if (_topHardwareLevel != null) {
			switch (_topHardwareLevel) {
				case COMPARTMENT:
					EList<HardwareElement> _rootHardwareElements = this.getRootHardwareElements();
					for (final HardwareElement c : _rootHardwareElements) {
						EList<Processor> _allProcessors = ((Compartment) c).getAllProcessors();
						list.addAll(_allProcessors);
					}
					break;
				case BOX:
					EList<HardwareElement> _rootHardwareElements_1 = this.getRootHardwareElements();
					for (final HardwareElement b : _rootHardwareElements_1) {
						EList<Processor> _allProcessors_1 = ((Box) b).getAllProcessors();
						list.addAll(_allProcessors_1);
					}
					break;
				case BOARD:
					EList<HardwareElement> _rootHardwareElements_2 = this.getRootHardwareElements();
					for (final HardwareElement b_1 : _rootHardwareElements_2) {
						EList<Processor> _processors = ((Board) b_1).getProcessors();
						list.addAll(_processors);
					}
					break;
				default:
					break;
			}
		}
		else {
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getAllCores() {
		final BasicEList<Core> list = new BasicEList<Core>();
		HardwareArchitectureLevelType _topHardwareLevel = this.getTopHardwareLevel();
		if (_topHardwareLevel != null) {
			switch (_topHardwareLevel) {
				case COMPARTMENT:
					EList<HardwareElement> _rootHardwareElements = this.getRootHardwareElements();
					for (final HardwareElement c : _rootHardwareElements) {
						EList<Core> _allCores = ((Compartment) c).getAllCores();
						list.addAll(_allCores);
					}
					break;
				case BOX:
					EList<HardwareElement> _rootHardwareElements_1 = this.getRootHardwareElements();
					for (final HardwareElement b : _rootHardwareElements_1) {
						EList<Core> _allCores_1 = ((Box) b).getAllCores();
						list.addAll(_allCores_1);
					}
					break;
				case BOARD:
					EList<HardwareElement> _rootHardwareElements_2 = this.getRootHardwareElements();
					for (final HardwareElement b_1 : _rootHardwareElements_2) {
						EList<Core> _allCores_2 = ((Board) b_1).getAllCores();
						list.addAll(_allCores_2);
					}
					break;
				default:
					break;
			}
		}
		else {
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ch.hilbri.assist.datamodel.result.mapping.Thread> getAllThreads() {
		final BasicEList<ch.hilbri.assist.datamodel.result.mapping.Thread> list = new BasicEList<ch.hilbri.assist.datamodel.result.mapping.Thread>();
		EList<Application> _applications = this.getApplications();
		for (final Application a : _applications) {
			EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = a.getThreads();
			list.addAll(_threads);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareElement findResultHardwareElement(final ch.hilbri.assist.mapping.model.HardwareElement modelHwElement) {
		boolean _matched = false;
		if (modelHwElement instanceof ch.hilbri.assist.mapping.model.Core) {
			_matched=true;
			EList<Core> _allCores = this.getAllCores();
			for (final Core c : _allCores) {
				ch.hilbri.assist.mapping.model.HardwareElement _referenceObject = c.getReferenceObject();
				boolean _equals = Objects.equal(_referenceObject, modelHwElement);
				if (_equals) {
					return c;
				}
			}
		}
		if (!_matched) {
			if (modelHwElement instanceof ch.hilbri.assist.mapping.model.Processor) {
				_matched=true;
				EList<Processor> _allProcessors = this.getAllProcessors();
				for (final Processor p : _allProcessors) {
					ch.hilbri.assist.mapping.model.HardwareElement _referenceObject = p.getReferenceObject();
					boolean _equals = Objects.equal(_referenceObject, modelHwElement);
					if (_equals) {
						return p;
					}
				}
			}
		}
		if (!_matched) {
			if (modelHwElement instanceof ch.hilbri.assist.mapping.model.Board) {
				_matched=true;
				EList<Board> _allBoards = this.getAllBoards();
				for (final Board b : _allBoards) {
					ch.hilbri.assist.mapping.model.HardwareElement _referenceObject = b.getReferenceObject();
					boolean _equals = Objects.equal(_referenceObject, modelHwElement);
					if (_equals) {
						return b;
					}
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application findResultApplication(final ch.hilbri.assist.mapping.model.Application modelApp) {
		EList<Application> _applications = this.getApplications();
		for (final Application resultApp : _applications) {
			ch.hilbri.assist.mapping.model.Application _referenceObject = resultApp.getReferenceObject();
			boolean _equals = Objects.equal(_referenceObject, modelApp);
			if (_equals) {
				return resultApp;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.datamodel.result.mapping.Thread findResultThread(final ch.hilbri.assist.mapping.model.Thread modelThread) {
		EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _allThreads = this.getAllThreads();
		for (final ch.hilbri.assist.datamodel.result.mapping.Thread resultThread : _allThreads) {
			ch.hilbri.assist.mapping.model.Thread _referenceObject = resultThread.getReferenceObject();
			boolean _equals = Objects.equal(_referenceObject, modelThread);
			if (_equals) {
				return resultThread;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationGroup findResultApplicationGroup(final ch.hilbri.assist.mapping.model.ApplicationGroup modelAppGroup) {
		EList<ApplicationGroup> _applicationGroups = this.getApplicationGroups();
		for (final ApplicationGroup resultAppGroup : _applicationGroups) {
			ch.hilbri.assist.mapping.model.ApplicationGroup _referenceObject = resultAppGroup.getReferenceObject();
			boolean _equals = Objects.equal(_referenceObject, modelAppGroup);
			if (_equals) {
				return resultAppGroup;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				return ((InternalEList<?>)getRootHardwareElements()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				return ((InternalEList<?>)getApplicationGroups()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case MappingPackage.RESULT__COMMUNICATIONS:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.RESULT__SYSTEM_NAME:
				return getSystemName();
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				return getRootHardwareElements();
			case MappingPackage.RESULT__TOP_HARDWARE_LEVEL:
				return getTopHardwareLevel();
			case MappingPackage.RESULT__BOTTOM_HARDWARE_LEVEL:
				return getBottomHardwareLevel();
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				return getApplicationGroups();
			case MappingPackage.RESULT__APPLICATIONS:
				return getApplications();
			case MappingPackage.RESULT__NETWORKS:
				return getNetworks();
			case MappingPackage.RESULT__COMMUNICATIONS:
				return getCommunications();
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
			case MappingPackage.RESULT__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				getRootHardwareElements().clear();
				getRootHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
				return;
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				getApplicationGroups().addAll((Collection<? extends ApplicationGroup>)newValue);
				return;
			case MappingPackage.RESULT__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case MappingPackage.RESULT__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case MappingPackage.RESULT__COMMUNICATIONS:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends CommunicationRelation>)newValue);
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
			case MappingPackage.RESULT__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				getRootHardwareElements().clear();
				return;
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				return;
			case MappingPackage.RESULT__APPLICATIONS:
				getApplications().clear();
				return;
			case MappingPackage.RESULT__NETWORKS:
				getNetworks().clear();
				return;
			case MappingPackage.RESULT__COMMUNICATIONS:
				getCommunications().clear();
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
			case MappingPackage.RESULT__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case MappingPackage.RESULT__ROOT_HARDWARE_ELEMENTS:
				return rootHardwareElements != null && !rootHardwareElements.isEmpty();
			case MappingPackage.RESULT__TOP_HARDWARE_LEVEL:
				return getTopHardwareLevel() != TOP_HARDWARE_LEVEL_EDEFAULT;
			case MappingPackage.RESULT__BOTTOM_HARDWARE_LEVEL:
				return getBottomHardwareLevel() != BOTTOM_HARDWARE_LEVEL_EDEFAULT;
			case MappingPackage.RESULT__APPLICATION_GROUPS:
				return applicationGroups != null && !applicationGroups.isEmpty();
			case MappingPackage.RESULT__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case MappingPackage.RESULT__NETWORKS:
				return networks != null && !networks.isEmpty();
			case MappingPackage.RESULT__COMMUNICATIONS:
				return communications != null && !communications.isEmpty();
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
			case MappingPackage.RESULT___COMPARE_TO__RESULT:
				return compareTo((Result)arguments.get(0));
			case MappingPackage.RESULT___GET_ALL_COMPARTMENTS:
				return getAllCompartments();
			case MappingPackage.RESULT___GET_ALL_BOXES:
				return getAllBoxes();
			case MappingPackage.RESULT___GET_ALL_BOARDS:
				return getAllBoards();
			case MappingPackage.RESULT___GET_ALL_PROCESSORS:
				return getAllProcessors();
			case MappingPackage.RESULT___GET_ALL_CORES:
				return getAllCores();
			case MappingPackage.RESULT___GET_ALL_THREADS:
				return getAllThreads();
			case MappingPackage.RESULT___FIND_RESULT_HARDWARE_ELEMENT__HARDWAREELEMENT:
				return findResultHardwareElement((ch.hilbri.assist.mapping.model.HardwareElement)arguments.get(0));
			case MappingPackage.RESULT___FIND_RESULT_APPLICATION__APPLICATION:
				return findResultApplication((ch.hilbri.assist.mapping.model.Application)arguments.get(0));
			case MappingPackage.RESULT___FIND_RESULT_THREAD__THREAD:
				return findResultThread((ch.hilbri.assist.mapping.model.Thread)arguments.get(0));
			case MappingPackage.RESULT___FIND_RESULT_APPLICATION_GROUP__APPLICATIONGROUP:
				return findResultApplicationGroup((ch.hilbri.assist.mapping.model.ApplicationGroup)arguments.get(0));
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
		result.append(", systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
