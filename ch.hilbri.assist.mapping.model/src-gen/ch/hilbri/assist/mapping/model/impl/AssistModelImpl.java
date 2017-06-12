/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.ApplicationGroup;
import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Board;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.Compartment;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.DislocalityRelation;
import ch.hilbri.assist.mapping.model.DissimilarityRelation;
import ch.hilbri.assist.mapping.model.ModelPackage;
import ch.hilbri.assist.mapping.model.Processor;
import ch.hilbri.assist.mapping.model.ProximityRelation;
import ch.hilbri.assist.mapping.model.Task;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
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
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl#getApplicationGroups <em>Application Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.AssistModelImpl#getProximityRelations <em>Proximity Relations</em>}</li>
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
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Compartment> compartments;

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
	public EList<Compartment> getAllCompartments() {
		return this.getCompartments();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Box> getAllBoxes() {
		EList<Compartment> _compartments = this.getCompartments();
		final Function1<Compartment, EList<Box>> _function = new Function1<Compartment, EList<Box>>() {
			public EList<Box> apply(final Compartment it) {
				return it.getAllBoxes();
			}
		};
		EList<EList<Box>> _map = XcoreEListExtensions.<Compartment, EList<Box>>map(_compartments, _function);
		Iterable<Box> _flatten = Iterables.<Box>concat(_map);
		return ECollections.<Box>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getAllBoards() {
		EList<Compartment> _compartments = this.getCompartments();
		final Function1<Compartment, EList<Board>> _function = new Function1<Compartment, EList<Board>>() {
			public EList<Board> apply(final Compartment it) {
				return it.getAllBoards();
			}
		};
		EList<EList<Board>> _map = XcoreEListExtensions.<Compartment, EList<Board>>map(_compartments, _function);
		Iterable<Board> _flatten = Iterables.<Board>concat(_map);
		return ECollections.<Board>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getAllProcessors() {
		EList<Compartment> _compartments = this.getCompartments();
		final Function1<Compartment, EList<Processor>> _function = new Function1<Compartment, EList<Processor>>() {
			public EList<Processor> apply(final Compartment it) {
				return it.getAllProcessors();
			}
		};
		EList<EList<Processor>> _map = XcoreEListExtensions.<Compartment, EList<Processor>>map(_compartments, _function);
		Iterable<Processor> _flatten = Iterables.<Processor>concat(_map);
		return ECollections.<Processor>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getAllCores() {
		EList<Compartment> _compartments = this.getCompartments();
		final Function1<Compartment, EList<Core>> _function = new Function1<Compartment, EList<Core>>() {
			public EList<Core> apply(final Compartment it) {
				return it.getAllCores();
			}
		};
		EList<EList<Core>> _map = XcoreEListExtensions.<Compartment, EList<Core>>map(_compartments, _function);
		Iterable<Core> _flatten = Iterables.<Core>concat(_map);
		return ECollections.<Core>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getAllTasks() {
		EList<Application> _applications = this.getApplications();
		final Function1<Application, EList<Task>> _function = new Function1<Application, EList<Task>>() {
			public EList<Task> apply(final Application it) {
				return it.getAllTasks();
			}
		};
		EList<EList<Task>> _map = XcoreEListExtensions.<Application, EList<Task>>map(_applications, _function);
		Iterable<Task> _flatten = Iterables.<Task>concat(_map);
		return ECollections.<Task>toEList(_flatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				return getCompartments();
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends Compartment>)newValue);
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				getCompartments().clear();
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
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
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
			case ModelPackage.ASSIST_MODEL___GET_ALL_TASKS:
				return getAllTasks();
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
