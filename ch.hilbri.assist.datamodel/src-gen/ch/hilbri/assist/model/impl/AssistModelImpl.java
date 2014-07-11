/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationGroup;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.CommunicationRelation;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.HardwareElementContainer;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Network;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.ProximityRelation;

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
 * An implementation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getHardwareContainer <em>Hardware Container</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getProximityRelations <em>Proximity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getCommunicationRelations <em>Communication Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getTopHardwareLevel <em>Top Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getBottomHardwareLevel <em>Bottom Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getAllHardwareLevels <em>All Hardware Levels</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.AssistModelImpl#getHardwareLevelCount <em>Hardware Level Count</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getHardwareContainer() <em>Hardware Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareElementContainer> hardwareContainer;

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
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

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
	 * The cached value of the '{@link #getDissimilarityRelations() <em>Dissimilarity Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissimilarityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DissimilarityRelation> dissimilarityRelations;

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
	 * The cached value of the '{@link #getProximityRelations() <em>Proximity Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProximityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProximityRelation> proximityRelations;

	/**
	 * The cached value of the '{@link #getCommunicationRelations() <em>Communication Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRelation> communicationRelations;

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
	 * The default value of the '{@link #getHardwareLevelCount() <em>Hardware Level Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareLevelCount()
	 * @generated
	 * @ordered
	 */
	protected static final int HARDWARE_LEVEL_COUNT_EDEFAULT = 0;

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
	public EList<HardwareElementContainer> getHardwareContainer() {
		if (hardwareContainer == null) {
			hardwareContainer = new EObjectContainmentEList<HardwareElementContainer>(HardwareElementContainer.class, this, ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER);
		}
		return hardwareContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, ModelPackage.ASSIST_MODEL__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<Application>(Application.class, this, ModelPackage.ASSIST_MODEL__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationGroup> getApplicationGroups() {
		if (applicationGroups == null) {
			applicationGroups = new EObjectContainmentEList<ApplicationGroup>(ApplicationGroup.class, this, ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS);
		}
		return applicationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DissimilarityRelation> getDissimilarityRelations() {
		if (dissimilarityRelations == null) {
			dissimilarityRelations = new EObjectContainmentEList<DissimilarityRelation>(DissimilarityRelation.class, this, ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS);
		}
		return dissimilarityRelations;
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
	public EList<ProximityRelation> getProximityRelations() {
		if (proximityRelations == null) {
			proximityRelations = new EObjectContainmentEList<ProximityRelation>(ProximityRelation.class, this, ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS);
		}
		return proximityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRelation> getCommunicationRelations() {
		if (communicationRelations == null) {
			communicationRelations = new EObjectContainmentEList<CommunicationRelation>(CommunicationRelation.class, this, ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS);
		}
		return communicationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getTopHardwareLevel() {
		HardwareArchitectureLevelType _xifexpression = null;
		EList<HardwareElementContainer> _hardwareContainer = this.getHardwareContainer();
		boolean _isEmpty = _hardwareContainer.isEmpty();
		boolean _not = (!_isEmpty);
		if (_not) {
			HardwareArchitectureLevelType _switchResult = null;
			EList<HardwareElementContainer> _hardwareContainer_1 = this.getHardwareContainer();
			HardwareElementContainer _get = _hardwareContainer_1.get(0);
			boolean _matched = false;
			if (!_matched) {
				if (_get instanceof Compartment) {
					_matched=true;
					_switchResult = HardwareArchitectureLevelType.COMPARTMENT;
				}
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
	public EList<HardwareArchitectureLevelType> getAllHardwareLevels() {
		final BasicEList<HardwareArchitectureLevelType> list = new BasicEList<HardwareArchitectureLevelType>();
		list.add(HardwareArchitectureLevelType.CORE);
		list.add(HardwareArchitectureLevelType.PROCESSOR);
		list.add(HardwareArchitectureLevelType.BOARD);
		HardwareArchitectureLevelType _topHardwareLevel = this.getTopHardwareLevel();
		boolean _matched = false;
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.CORE_VALUE)) {
				_matched=true;
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.PROCESSOR_VALUE)) {
				_matched=true;
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOARD_VALUE)) {
				_matched=true;
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOX_VALUE)) {
				_matched=true;
				list.add(HardwareArchitectureLevelType.BOX);
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.COMPARTMENT_VALUE)) {
				_matched=true;
				list.add(HardwareArchitectureLevelType.BOX);
				list.add(HardwareArchitectureLevelType.COMPARTMENT);
			}
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHardwareLevelCount() {
		EList<HardwareArchitectureLevelType> _allHardwareLevels = this.getAllHardwareLevels();
		return _allHardwareLevels.size();
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
			EList<HardwareElementContainer> _hardwareContainer = this.getHardwareContainer();
			final Function1<HardwareElementContainer, Compartment> _function = new Function1<HardwareElementContainer, Compartment>() {
				public Compartment apply(final HardwareElementContainer elem) {
					return ((Compartment) elem);
				}
			};
			return XcoreEListExtensions.<HardwareElementContainer, Compartment>map(_hardwareContainer, _function);
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
		boolean _matched = false;
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.COMPARTMENT_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer = this.getHardwareContainer();
				for (final HardwareElementContainer c : _hardwareContainer) {
					EList<Box> _boxes = ((Compartment) c).getBoxes();
					list.addAll(_boxes);
				}
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOX_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer_1 = this.getHardwareContainer();
				final Function1<HardwareElementContainer, Box> _function = new Function1<HardwareElementContainer, Box>() {
					public Box apply(final HardwareElementContainer elem) {
						return ((Box) elem);
					}
				};
				EList<Box> _map = XcoreEListExtensions.<HardwareElementContainer, Box>map(_hardwareContainer_1, _function);
				list.addAll(_map);
			}
		}
		if (!_matched) {
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
		boolean _matched = false;
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.COMPARTMENT_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer = this.getHardwareContainer();
				for (final HardwareElementContainer c : _hardwareContainer) {
					EList<Board> _allBoards = ((Compartment) c).getAllBoards();
					list.addAll(_allBoards);
				}
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOX_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer_1 = this.getHardwareContainer();
				for (final HardwareElementContainer b : _hardwareContainer_1) {
					EList<Board> _boards = ((Box) b).getBoards();
					list.addAll(_boards);
				}
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOARD_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer_2 = this.getHardwareContainer();
				final Function1<HardwareElementContainer, Board> _function = new Function1<HardwareElementContainer, Board>() {
					public Board apply(final HardwareElementContainer elem) {
						return ((Board) elem);
					}
				};
				EList<Board> _map = XcoreEListExtensions.<HardwareElementContainer, Board>map(_hardwareContainer_2, _function);
				list.addAll(_map);
			}
		}
		if (!_matched) {
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
		boolean _matched = false;
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.COMPARTMENT_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer = this.getHardwareContainer();
				for (final HardwareElementContainer c : _hardwareContainer) {
					EList<Processor> _allProcessors = ((Compartment) c).getAllProcessors();
					list.addAll(_allProcessors);
				}
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOX_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer_1 = this.getHardwareContainer();
				for (final HardwareElementContainer b : _hardwareContainer_1) {
					EList<Processor> _allProcessors_1 = ((Box) b).getAllProcessors();
					list.addAll(_allProcessors_1);
				}
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOARD_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer_2 = this.getHardwareContainer();
				for (final HardwareElementContainer b_1 : _hardwareContainer_2) {
					EList<Processor> _processors = ((Board) b_1).getProcessors();
					list.addAll(_processors);
				}
			}
		}
		if (!_matched) {
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
		boolean _matched = false;
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.COMPARTMENT_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer = this.getHardwareContainer();
				for (final HardwareElementContainer c : _hardwareContainer) {
					EList<Core> _allCores = ((Compartment) c).getAllCores();
					list.addAll(_allCores);
				}
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOX_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer_1 = this.getHardwareContainer();
				for (final HardwareElementContainer b : _hardwareContainer_1) {
					EList<Core> _allCores_1 = ((Box) b).getAllCores();
					list.addAll(_allCores_1);
				}
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(_topHardwareLevel, HardwareArchitectureLevelType.BOARD_VALUE)) {
				_matched=true;
				EList<HardwareElementContainer> _hardwareContainer_2 = this.getHardwareContainer();
				for (final HardwareElementContainer b_1 : _hardwareContainer_2) {
					EList<Core> _allCores_2 = ((Board) b_1).getAllCores();
					list.addAll(_allCores_2);
				}
			}
		}
		if (!_matched) {
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getAllHardwareElements(final HardwareArchitectureLevelType level) {
		boolean _matched = false;
		if (!_matched) {
			if (com.google.common.base.Objects.equal(level, HardwareArchitectureLevelType.COMPARTMENT_VALUE)) {
				_matched=true;
				EList<Compartment> _allCompartments = this.getAllCompartments();
				final Function1<Compartment, HardwareElement> _function = new Function1<Compartment, HardwareElement>() {
					public HardwareElement apply(final Compartment elem) {
						return ((HardwareElement) elem);
					}
				};
				return XcoreEListExtensions.<Compartment, HardwareElement>map(_allCompartments, _function);
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(level, HardwareArchitectureLevelType.BOX_VALUE)) {
				_matched=true;
				EList<Box> _allBoxes = this.getAllBoxes();
				final Function1<Box, HardwareElement> _function_1 = new Function1<Box, HardwareElement>() {
					public HardwareElement apply(final Box elem) {
						return ((HardwareElement) elem);
					}
				};
				return XcoreEListExtensions.<Box, HardwareElement>map(_allBoxes, _function_1);
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(level, HardwareArchitectureLevelType.BOARD_VALUE)) {
				_matched=true;
				EList<Board> _allBoards = this.getAllBoards();
				final Function1<Board, HardwareElement> _function_2 = new Function1<Board, HardwareElement>() {
					public HardwareElement apply(final Board elem) {
						return ((HardwareElement) elem);
					}
				};
				return XcoreEListExtensions.<Board, HardwareElement>map(_allBoards, _function_2);
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(level, HardwareArchitectureLevelType.PROCESSOR_VALUE)) {
				_matched=true;
				EList<Processor> _allProcessors = this.getAllProcessors();
				final Function1<Processor, HardwareElement> _function_3 = new Function1<Processor, HardwareElement>() {
					public HardwareElement apply(final Processor elem) {
						return ((HardwareElement) elem);
					}
				};
				return XcoreEListExtensions.<Processor, HardwareElement>map(_allProcessors, _function_3);
			}
		}
		if (!_matched) {
			if (com.google.common.base.Objects.equal(level, HardwareArchitectureLevelType.CORE_VALUE)) {
				_matched=true;
				EList<Core> _allCores = this.getAllCores();
				final Function1<Core, HardwareElement> _function_4 = new Function1<Core, HardwareElement>() {
					public HardwareElement apply(final Core elem) {
						return ((HardwareElement) elem);
					}
				};
				return XcoreEListExtensions.<Core, HardwareElement>map(_allCores, _function_4);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getAllHardwareElements(final int level) {
		if ((level < 0)) {
			return null;
		}
		int _hardwareLevelCount = this.getHardwareLevelCount();
		boolean _greaterEqualsThan = (level >= _hardwareLevelCount);
		if (_greaterEqualsThan) {
			return null;
		}
		if ((level == 0)) {
			EList<Core> _allCores = this.getAllCores();
			final Function1<Core, HardwareElement> _function = new Function1<Core, HardwareElement>() {
				public HardwareElement apply(final Core elem) {
					return ((HardwareElement) elem);
				}
			};
			return XcoreEListExtensions.<Core, HardwareElement>map(_allCores, _function);
		}
		if ((level == 1)) {
			EList<Processor> _allProcessors = this.getAllProcessors();
			final Function1<Processor, HardwareElement> _function_1 = new Function1<Processor, HardwareElement>() {
				public HardwareElement apply(final Processor elem) {
					return ((HardwareElement) elem);
				}
			};
			return XcoreEListExtensions.<Processor, HardwareElement>map(_allProcessors, _function_1);
		}
		if ((level == 2)) {
			EList<Board> _allBoards = this.getAllBoards();
			final Function1<Board, HardwareElement> _function_2 = new Function1<Board, HardwareElement>() {
				public HardwareElement apply(final Board elem) {
					return ((HardwareElement) elem);
				}
			};
			return XcoreEListExtensions.<Board, HardwareElement>map(_allBoards, _function_2);
		}
		if ((level == 3)) {
			EList<Box> _allBoxes = this.getAllBoxes();
			final Function1<Box, HardwareElement> _function_3 = new Function1<Box, HardwareElement>() {
				public HardwareElement apply(final Box elem) {
					return ((HardwareElement) elem);
				}
			};
			return XcoreEListExtensions.<Box, HardwareElement>map(_allBoxes, _function_3);
		}
		if ((level == 4)) {
			EList<Compartment> _allCompartments = this.getAllCompartments();
			final Function1<Compartment, HardwareElement> _function_4 = new Function1<Compartment, HardwareElement>() {
				public HardwareElement apply(final Compartment elem) {
					return ((HardwareElement) elem);
				}
			};
			return XcoreEListExtensions.<Compartment, HardwareElement>map(_allCompartments, _function_4);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ch.hilbri.assist.model.Thread> getAllThreads() {
		final BasicEList<ch.hilbri.assist.model.Thread> list = new BasicEList<ch.hilbri.assist.model.Thread>();
		EList<Application> _applications = this.getApplications();
		for (final Application a : _applications) {
			EList<ch.hilbri.assist.model.Thread> _threads = a.getThreads();
			list.addAll(_threads);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				return ((InternalEList<?>)getHardwareContainer()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				return ((InternalEList<?>)getApplicationGroups()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				return ((InternalEList<?>)getDissimilarityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return ((InternalEList<?>)getDislocalityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				return ((InternalEList<?>)getProximityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				return ((InternalEList<?>)getCommunicationRelations()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				return getHardwareContainer();
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				return getNetworks();
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				return getApplications();
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				return getApplicationGroups();
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				return getDissimilarityRelations();
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return getDislocalityRelations();
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				return getProximityRelations();
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				return getCommunicationRelations();
			case ModelPackage.ASSIST_MODEL__TOP_HARDWARE_LEVEL:
				return getTopHardwareLevel();
			case ModelPackage.ASSIST_MODEL__BOTTOM_HARDWARE_LEVEL:
				return getBottomHardwareLevel();
			case ModelPackage.ASSIST_MODEL__ALL_HARDWARE_LEVELS:
				return getAllHardwareLevels();
			case ModelPackage.ASSIST_MODEL__HARDWARE_LEVEL_COUNT:
				return getHardwareLevelCount();
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
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				getHardwareContainer().clear();
				getHardwareContainer().addAll((Collection<? extends HardwareElementContainer>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				getApplicationGroups().addAll((Collection<? extends ApplicationGroup>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				getDissimilarityRelations().clear();
				getDissimilarityRelations().addAll((Collection<? extends DissimilarityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				getDislocalityRelations().addAll((Collection<? extends DislocalityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				getProximityRelations().clear();
				getProximityRelations().addAll((Collection<? extends ProximityRelation>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				getCommunicationRelations().clear();
				getCommunicationRelations().addAll((Collection<? extends CommunicationRelation>)newValue);
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
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				getHardwareContainer().clear();
				return;
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				getNetworks().clear();
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				getApplications().clear();
				return;
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				return;
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				getDissimilarityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				getProximityRelations().clear();
				return;
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				getCommunicationRelations().clear();
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
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
				return hardwareContainer != null && !hardwareContainer.isEmpty();
			case ModelPackage.ASSIST_MODEL__NETWORKS:
				return networks != null && !networks.isEmpty();
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
				return applicationGroups != null && !applicationGroups.isEmpty();
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
				return dissimilarityRelations != null && !dissimilarityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
				return dislocalityRelations != null && !dislocalityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
				return proximityRelations != null && !proximityRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
				return communicationRelations != null && !communicationRelations.isEmpty();
			case ModelPackage.ASSIST_MODEL__TOP_HARDWARE_LEVEL:
				return getTopHardwareLevel() != TOP_HARDWARE_LEVEL_EDEFAULT;
			case ModelPackage.ASSIST_MODEL__BOTTOM_HARDWARE_LEVEL:
				return getBottomHardwareLevel() != BOTTOM_HARDWARE_LEVEL_EDEFAULT;
			case ModelPackage.ASSIST_MODEL__ALL_HARDWARE_LEVELS:
				return !getAllHardwareLevels().isEmpty();
			case ModelPackage.ASSIST_MODEL__HARDWARE_LEVEL_COUNT:
				return getHardwareLevelCount() != HARDWARE_LEVEL_COUNT_EDEFAULT;
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
			case ModelPackage.ASSIST_MODEL___GET_ALL_BOXES:
				return getAllBoxes();
			case ModelPackage.ASSIST_MODEL___GET_ALL_BOARDS:
				return getAllBoards();
			case ModelPackage.ASSIST_MODEL___GET_ALL_PROCESSORS:
				return getAllProcessors();
			case ModelPackage.ASSIST_MODEL___GET_ALL_CORES:
				return getAllCores();
			case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__HARDWAREARCHITECTURELEVELTYPE:
				return getAllHardwareElements((HardwareArchitectureLevelType)arguments.get(0));
			case ModelPackage.ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT:
				return getAllHardwareElements((Integer)arguments.get(0));
			case ModelPackage.ASSIST_MODEL___GET_ALL_THREADS:
				return getAllThreads();
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
