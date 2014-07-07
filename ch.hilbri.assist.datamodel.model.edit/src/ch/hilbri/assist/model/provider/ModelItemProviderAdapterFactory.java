/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model.provider;

import ch.hilbri.assist.model.util.ModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.AssistModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelItemProvider assistModelItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.AssistModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssistModelAdapter() {
		if (assistModelItemProvider == null) {
			assistModelItemProvider = new AssistModelItemProvider(this);
		}

		return assistModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.HardwareElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareElementItemProvider hardwareElementItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.HardwareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardwareElementAdapter() {
		if (hardwareElementItemProvider == null) {
			hardwareElementItemProvider = new HardwareElementItemProvider(this);
		}

		return hardwareElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.HardwareElementContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareElementContainerItemProvider hardwareElementContainerItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.HardwareElementContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardwareElementContainerAdapter() {
		if (hardwareElementContainerItemProvider == null) {
			hardwareElementContainerItemProvider = new HardwareElementContainerItemProvider(this);
		}

		return hardwareElementContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Compartment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentItemProvider compartmentItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Compartment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompartmentAdapter() {
		if (compartmentItemProvider == null) {
			compartmentItemProvider = new CompartmentItemProvider(this);
		}

		return compartmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Box} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxItemProvider boxItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Box}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoxAdapter() {
		if (boxItemProvider == null) {
			boxItemProvider = new BoxItemProvider(this);
		}

		return boxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Board} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardItemProvider boardItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Board}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoardAdapter() {
		if (boardItemProvider == null) {
			boardItemProvider = new BoardItemProvider(this);
		}

		return boardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Processor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorItemProvider processorItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessorAdapter() {
		if (processorItemProvider == null) {
			processorItemProvider = new ProcessorItemProvider(this);
		}

		return processorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Core} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreItemProvider coreItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoreAdapter() {
		if (coreItemProvider == null) {
			coreItemProvider = new CoreItemProvider(this);
		}

		return coreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.IOAdapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOAdapterItemProvider ioAdapterItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.IOAdapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIOAdapterAdapter() {
		if (ioAdapterItemProvider == null) {
			ioAdapterItemProvider = new IOAdapterItemProvider(this);
		}

		return ioAdapterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Network} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkItemProvider networkItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkAdapter() {
		if (networkItemProvider == null) {
			networkItemProvider = new NetworkItemProvider(this);
		}

		return networkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ApplicationOrApplicationGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationOrApplicationGroupItemProvider applicationOrApplicationGroupItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.ApplicationOrApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationOrApplicationGroupAdapter() {
		if (applicationOrApplicationGroupItemProvider == null) {
			applicationOrApplicationGroupItemProvider = new ApplicationOrApplicationGroupItemProvider(this);
		}

		return applicationOrApplicationGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ApplicationGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationGroupItemProvider applicationGroupItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationGroupAdapter() {
		if (applicationGroupItemProvider == null) {
			applicationGroupItemProvider = new ApplicationGroupItemProvider(this);
		}

		return applicationGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Thread} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadItemProvider threadItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.Thread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreadAdapter() {
		if (threadItemProvider == null) {
			threadItemProvider = new ThreadItemProvider(this);
		}

		return threadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.IOAdapterRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOAdapterRequirementItemProvider ioAdapterRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.IOAdapterRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIOAdapterRequirementAdapter() {
		if (ioAdapterRequirementItemProvider == null) {
			ioAdapterRequirementItemProvider = new IOAdapterRequirementItemProvider(this);
		}

		return ioAdapterRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.DissimilarityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityRelationItemProvider dissimilarityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.DissimilarityRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDissimilarityRelationAdapter() {
		if (dissimilarityRelationItemProvider == null) {
			dissimilarityRelationItemProvider = new DissimilarityRelationItemProvider(this);
		}

		return dissimilarityRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.DissimilarityClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityClauseItemProvider dissimilarityClauseItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.DissimilarityClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDissimilarityClauseAdapter() {
		if (dissimilarityClauseItemProvider == null) {
			dissimilarityClauseItemProvider = new DissimilarityClauseItemProvider(this);
		}

		return dissimilarityClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.DissimilarityDisjunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityDisjunctionItemProvider dissimilarityDisjunctionItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.DissimilarityDisjunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDissimilarityDisjunctionAdapter() {
		if (dissimilarityDisjunctionItemProvider == null) {
			dissimilarityDisjunctionItemProvider = new DissimilarityDisjunctionItemProvider(this);
		}

		return dissimilarityDisjunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.DissimilarityConjunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityConjunctionItemProvider dissimilarityConjunctionItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.DissimilarityConjunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDissimilarityConjunctionAdapter() {
		if (dissimilarityConjunctionItemProvider == null) {
			dissimilarityConjunctionItemProvider = new DissimilarityConjunctionItemProvider(this);
		}

		return dissimilarityConjunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.DissimilarityEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityEntryItemProvider dissimilarityEntryItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.DissimilarityEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDissimilarityEntryAdapter() {
		if (dissimilarityEntryItemProvider == null) {
			dissimilarityEntryItemProvider = new DissimilarityEntryItemProvider(this);
		}

		return dissimilarityEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.DislocalityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DislocalityRelationItemProvider dislocalityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDislocalityRelationAdapter() {
		if (dislocalityRelationItemProvider == null) {
			dislocalityRelationItemProvider = new DislocalityRelationItemProvider(this);
		}

		return dislocalityRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ProximityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProximityRelationItemProvider proximityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.ProximityRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProximityRelationAdapter() {
		if (proximityRelationItemProvider == null) {
			proximityRelationItemProvider = new ProximityRelationItemProvider(this);
		}

		return proximityRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.CommunicationRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRelationItemProvider communicationRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.CommunicationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationRelationAdapter() {
		if (communicationRelationItemProvider == null) {
			communicationRelationItemProvider = new CommunicationRelationItemProvider(this);
		}

		return communicationRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.MetricParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricParameterItemProvider metricParameterItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.model.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetricParameterAdapter() {
		if (metricParameterItemProvider == null) {
			metricParameterItemProvider = new MetricParameterItemProvider(this);
		}

		return metricParameterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (assistModelItemProvider != null) assistModelItemProvider.dispose();
		if (hardwareElementItemProvider != null) hardwareElementItemProvider.dispose();
		if (hardwareElementContainerItemProvider != null) hardwareElementContainerItemProvider.dispose();
		if (compartmentItemProvider != null) compartmentItemProvider.dispose();
		if (boxItemProvider != null) boxItemProvider.dispose();
		if (boardItemProvider != null) boardItemProvider.dispose();
		if (processorItemProvider != null) processorItemProvider.dispose();
		if (coreItemProvider != null) coreItemProvider.dispose();
		if (ioAdapterItemProvider != null) ioAdapterItemProvider.dispose();
		if (networkItemProvider != null) networkItemProvider.dispose();
		if (applicationOrApplicationGroupItemProvider != null) applicationOrApplicationGroupItemProvider.dispose();
		if (applicationGroupItemProvider != null) applicationGroupItemProvider.dispose();
		if (applicationItemProvider != null) applicationItemProvider.dispose();
		if (threadItemProvider != null) threadItemProvider.dispose();
		if (ioAdapterRequirementItemProvider != null) ioAdapterRequirementItemProvider.dispose();
		if (dissimilarityRelationItemProvider != null) dissimilarityRelationItemProvider.dispose();
		if (dissimilarityClauseItemProvider != null) dissimilarityClauseItemProvider.dispose();
		if (dissimilarityDisjunctionItemProvider != null) dissimilarityDisjunctionItemProvider.dispose();
		if (dissimilarityConjunctionItemProvider != null) dissimilarityConjunctionItemProvider.dispose();
		if (dissimilarityEntryItemProvider != null) dissimilarityEntryItemProvider.dispose();
		if (dislocalityRelationItemProvider != null) dislocalityRelationItemProvider.dispose();
		if (proximityRelationItemProvider != null) proximityRelationItemProvider.dispose();
		if (communicationRelationItemProvider != null) communicationRelationItemProvider.dispose();
		if (metricParameterItemProvider != null) metricParameterItemProvider.dispose();
	}

}