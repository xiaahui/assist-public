/**
 */
package ch.hilbri.assist.mapping.model.provider;

import ch.hilbri.assist.mapping.model.util.ModelAdapterFactory;

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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.AssistModelMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelMappingItemProvider assistModelMappingItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.AssistModelMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssistModelMappingAdapter() {
		if (assistModelMappingItemProvider == null) {
			assistModelMappingItemProvider = new AssistModelMappingItemProvider(this);
		}

		return assistModelMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.HardwareElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareElementItemProvider hardwareElementItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.HardwareElement}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.Compartment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentItemProvider compartmentItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.Compartment}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.Box} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxItemProvider boxItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.Box}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.Board} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardItemProvider boardItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.Board}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.Processor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorItemProvider processorItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.Processor}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.Core} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreItemProvider coreItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.Core}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.IOAdapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOAdapterItemProvider ioAdapterItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.IOAdapter}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.Application}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.IOAdapterRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOAdapterRequirementItemProvider ioAdapterRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.IOAdapterRequirement}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.DislocalityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DislocalityRelationItemProvider dislocalityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.DislocalityRelation}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.ColocalityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColocalityRelationItemProvider colocalityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.ColocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColocalityRelationAdapter() {
		if (colocalityRelationItemProvider == null) {
			colocalityRelationItemProvider = new ColocalityRelationItemProvider(this);
		}

		return colocalityRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.DissimilarityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityRelationItemProvider dissimilarityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.DissimilarityRelation}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.DissimilarityClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityClauseItemProvider dissimilarityClauseItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.DissimilarityClause}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.DissimilarityEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityEntryItemProvider dissimilarityEntryItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.DissimilarityEntry}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.DissimilarityDisjunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityDisjunctionItemProvider dissimilarityDisjunctionItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.DissimilarityDisjunction}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.DissimilarityConjunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityConjunctionItemProvider dissimilarityConjunctionItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.DissimilarityConjunction}.
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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.mapping.model.MetricParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricParameterItemProvider metricParameterItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.mapping.model.MetricParameter}.
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
		if (assistModelMappingItemProvider != null) assistModelMappingItemProvider.dispose();
		if (hardwareElementItemProvider != null) hardwareElementItemProvider.dispose();
		if (compartmentItemProvider != null) compartmentItemProvider.dispose();
		if (boxItemProvider != null) boxItemProvider.dispose();
		if (boardItemProvider != null) boardItemProvider.dispose();
		if (processorItemProvider != null) processorItemProvider.dispose();
		if (coreItemProvider != null) coreItemProvider.dispose();
		if (ioAdapterItemProvider != null) ioAdapterItemProvider.dispose();
		if (applicationItemProvider != null) applicationItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (ioAdapterRequirementItemProvider != null) ioAdapterRequirementItemProvider.dispose();
		if (dislocalityRelationItemProvider != null) dislocalityRelationItemProvider.dispose();
		if (colocalityRelationItemProvider != null) colocalityRelationItemProvider.dispose();
		if (dissimilarityRelationItemProvider != null) dissimilarityRelationItemProvider.dispose();
		if (dissimilarityClauseItemProvider != null) dissimilarityClauseItemProvider.dispose();
		if (dissimilarityDisjunctionItemProvider != null) dissimilarityDisjunctionItemProvider.dispose();
		if (dissimilarityConjunctionItemProvider != null) dissimilarityConjunctionItemProvider.dispose();
		if (dissimilarityEntryItemProvider != null) dissimilarityEntryItemProvider.dispose();
		if (metricParameterItemProvider != null) metricParameterItemProvider.dispose();
	}

}
