/**
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.BoardAlternatives} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BoardAlternativesItemProvider boardAlternativesItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.BoardAlternatives}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBoardAlternativesAdapter() {
        if (boardAlternativesItemProvider == null) {
            boardAlternativesItemProvider = new BoardAlternativesItemProvider(this);
        }

        return boardAlternativesItemProvider;
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Task} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TaskItemProvider taskItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.Task}.
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.MappingRestriction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingRestrictionItemProvider mappingRestrictionItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.MappingRestriction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMappingRestrictionAdapter() {
        if (mappingRestrictionItemProvider == null) {
            mappingRestrictionItemProvider = new MappingRestrictionItemProvider(this);
        }

        return mappingRestrictionItemProvider;
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ColocalityRelation} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ColocalityRelationItemProvider colocalityRelationItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.ColocalityRelation}.
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.SchedulingRestriction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchedulingRestrictionItemProvider schedulingRestrictionItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.SchedulingRestriction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSchedulingRestrictionAdapter() {
        if (schedulingRestrictionItemProvider == null) {
            schedulingRestrictionItemProvider = new SchedulingRestrictionItemProvider(this);
        }

        return schedulingRestrictionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationWithTwoTasksAndDelayItemProvider relationWithTwoTasksAndDelayItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRelationWithTwoTasksAndDelayAdapter() {
        if (relationWithTwoTasksAndDelayItemProvider == null) {
            relationWithTwoTasksAndDelayItemProvider = new RelationWithTwoTasksAndDelayItemProvider(this);
        }

        return relationWithTwoTasksAndDelayItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RelationWithManyTasks} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationWithManyTasksItemProvider relationWithManyTasksItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RelationWithManyTasks}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRelationWithManyTasksAdapter() {
        if (relationWithManyTasksItemProvider == null) {
            relationWithManyTasksItemProvider = new RelationWithManyTasksItemProvider(this);
        }

        return relationWithManyTasksItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RelationWithManyTasksAndDelay} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationWithManyTasksAndDelayItemProvider relationWithManyTasksAndDelayItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RelationWithManyTasksAndDelay}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRelationWithManyTasksAndDelayAdapter() {
        if (relationWithManyTasksAndDelayItemProvider == null) {
            relationWithManyTasksAndDelayItemProvider = new RelationWithManyTasksAndDelayItemProvider(this);
        }

        return relationWithManyTasksAndDelayItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RelationStartAtTheSameTime} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationStartAtTheSameTimeItemProvider relationStartAtTheSameTimeItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RelationStartAtTheSameTime}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRelationStartAtTheSameTimeAdapter() {
        if (relationStartAtTheSameTimeItemProvider == null) {
            relationStartAtTheSameTimeItemProvider = new RelationStartAtTheSameTimeItemProvider(this);
        }

        return relationStartAtTheSameTimeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RelationFinishAtTheSameTime} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationFinishAtTheSameTimeItemProvider relationFinishAtTheSameTimeItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RelationFinishAtTheSameTime}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRelationFinishAtTheSameTimeAdapter() {
        if (relationFinishAtTheSameTimeItemProvider == null) {
            relationFinishAtTheSameTimeItemProvider = new RelationFinishAtTheSameTimeItemProvider(this);
        }

        return relationFinishAtTheSameTimeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RelationStartAfterOtherTaskFinished} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationStartAfterOtherTaskFinishedItemProvider relationStartAfterOtherTaskFinishedItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RelationStartAfterOtherTaskFinished}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRelationStartAfterOtherTaskFinishedAdapter() {
        if (relationStartAfterOtherTaskFinishedItemProvider == null) {
            relationStartAfterOtherTaskFinishedItemProvider = new RelationStartAfterOtherTaskFinishedItemProvider(this);
        }

        return relationStartAfterOtherTaskFinishedItemProvider;
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.BoardAlternative} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BoardAlternativeItemProvider boardAlternativeItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.BoardAlternative}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createBoardAlternativeAdapter() {
        if (boardAlternativeItemProvider == null) {
            boardAlternativeItemProvider = new BoardAlternativeItemProvider(this);
        }

        return boardAlternativeItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ApplicationAlternatives} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ApplicationAlternativesItemProvider applicationAlternativesItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.ApplicationAlternatives}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createApplicationAlternativesAdapter() {
        if (applicationAlternativesItemProvider == null) {
            applicationAlternativesItemProvider = new ApplicationAlternativesItemProvider(this);
        }

        return applicationAlternativesItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ApplicationAlternative} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ApplicationAlternativeItemProvider applicationAlternativeItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.ApplicationAlternative}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createApplicationAlternativeAdapter() {
        if (applicationAlternativeItemProvider == null) {
            applicationAlternativeItemProvider = new ApplicationAlternativeItemProvider(this);
        }

        return applicationAlternativeItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RestrictionAlternatives} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RestrictionAlternativesItemProvider restrictionAlternativesItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RestrictionAlternatives}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createRestrictionAlternativesAdapter() {
        if (restrictionAlternativesItemProvider == null) {
            restrictionAlternativesItemProvider = new RestrictionAlternativesItemProvider(this);
        }

        return restrictionAlternativesItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RestrictionAlternative} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RestrictionAlternativeItemProvider restrictionAlternativeItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RestrictionAlternative}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createRestrictionAlternativeAdapter() {
        if (restrictionAlternativeItemProvider == null) {
            restrictionAlternativeItemProvider = new RestrictionAlternativeItemProvider(this);
        }

        return restrictionAlternativeItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ExplorationCandidate} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ExplorationCandidateItemProvider explorationCandidateItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.ExplorationCandidate}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createExplorationCandidateAdapter() {
        if (explorationCandidateItemProvider == null) {
            explorationCandidateItemProvider = new ExplorationCandidateItemProvider(this);
        }

        return explorationCandidateItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MetricScorePairItemProvider metricScorePairItemProvider;

	/**
     * This creates an adapter for a {@link java.util.Map.Entry}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createMetricScorePairAdapter() {
        if (metricScorePairItemProvider == null) {
            metricScorePairItemProvider = new MetricScorePairItemProvider(this);
        }

        return metricScorePairItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.MappingResult} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MappingResultItemProvider mappingResultItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.MappingResult}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createMappingResultAdapter() {
        if (mappingResultItemProvider == null) {
            mappingResultItemProvider = new MappingResultItemProvider(this);
        }

        return mappingResultItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.SingleMappingElement} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SingleMappingElementItemProvider singleMappingElementItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.SingleMappingElement}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createSingleMappingElementAdapter() {
        if (singleMappingElementItemProvider == null) {
            singleMappingElementItemProvider = new SingleMappingElementItemProvider(this);
        }

        return singleMappingElementItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.AssistModelSchedulingResult} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AssistModelSchedulingResultItemProvider assistModelSchedulingResultItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.AssistModelSchedulingResult}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createAssistModelSchedulingResultAdapter() {
        if (assistModelSchedulingResultItemProvider == null) {
            assistModelSchedulingResultItemProvider = new AssistModelSchedulingResultItemProvider(this);
        }

        return assistModelSchedulingResultItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.TaskExecutionInstance} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TaskExecutionInstanceItemProvider taskExecutionInstanceItemProvider;

	/**
     * This creates an adapter for a {@link ch.hilbri.assist.model.TaskExecutionInstance}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createTaskExecutionInstanceAdapter() {
        if (taskExecutionInstanceItemProvider == null) {
            taskExecutionInstanceItemProvider = new TaskExecutionInstanceItemProvider(this);
        }

        return taskExecutionInstanceItemProvider;
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
        if (compartmentItemProvider != null) compartmentItemProvider.dispose();
        if (boxItemProvider != null) boxItemProvider.dispose();
        if (boardAlternativesItemProvider != null) boardAlternativesItemProvider.dispose();
        if (boardAlternativeItemProvider != null) boardAlternativeItemProvider.dispose();
        if (boardItemProvider != null) boardItemProvider.dispose();
        if (processorItemProvider != null) processorItemProvider.dispose();
        if (coreItemProvider != null) coreItemProvider.dispose();
        if (ioAdapterItemProvider != null) ioAdapterItemProvider.dispose();
        if (applicationAlternativesItemProvider != null) applicationAlternativesItemProvider.dispose();
        if (applicationAlternativeItemProvider != null) applicationAlternativeItemProvider.dispose();
        if (applicationItemProvider != null) applicationItemProvider.dispose();
        if (taskItemProvider != null) taskItemProvider.dispose();
        if (ioAdapterRequirementItemProvider != null) ioAdapterRequirementItemProvider.dispose();
        if (mappingRestrictionItemProvider != null) mappingRestrictionItemProvider.dispose();
        if (dislocalityRelationItemProvider != null) dislocalityRelationItemProvider.dispose();
        if (colocalityRelationItemProvider != null) colocalityRelationItemProvider.dispose();
        if (dissimilarityRelationItemProvider != null) dissimilarityRelationItemProvider.dispose();
        if (dissimilarityClauseItemProvider != null) dissimilarityClauseItemProvider.dispose();
        if (dissimilarityDisjunctionItemProvider != null) dissimilarityDisjunctionItemProvider.dispose();
        if (dissimilarityConjunctionItemProvider != null) dissimilarityConjunctionItemProvider.dispose();
        if (dissimilarityEntryItemProvider != null) dissimilarityEntryItemProvider.dispose();
        if (schedulingRestrictionItemProvider != null) schedulingRestrictionItemProvider.dispose();
        if (relationWithTwoTasksAndDelayItemProvider != null) relationWithTwoTasksAndDelayItemProvider.dispose();
        if (relationWithManyTasksItemProvider != null) relationWithManyTasksItemProvider.dispose();
        if (relationWithManyTasksAndDelayItemProvider != null) relationWithManyTasksAndDelayItemProvider.dispose();
        if (relationStartAtTheSameTimeItemProvider != null) relationStartAtTheSameTimeItemProvider.dispose();
        if (relationFinishAtTheSameTimeItemProvider != null) relationFinishAtTheSameTimeItemProvider.dispose();
        if (relationStartAfterOtherTaskFinishedItemProvider != null) relationStartAfterOtherTaskFinishedItemProvider.dispose();
        if (metricParameterItemProvider != null) metricParameterItemProvider.dispose();
        if (restrictionAlternativesItemProvider != null) restrictionAlternativesItemProvider.dispose();
        if (restrictionAlternativeItemProvider != null) restrictionAlternativeItemProvider.dispose();
        if (explorationCandidateItemProvider != null) explorationCandidateItemProvider.dispose();
        if (metricScorePairItemProvider != null) metricScorePairItemProvider.dispose();
        if (mappingResultItemProvider != null) mappingResultItemProvider.dispose();
        if (singleMappingElementItemProvider != null) singleMappingElementItemProvider.dispose();
        if (assistModelSchedulingResultItemProvider != null) assistModelSchedulingResultItemProvider.dispose();
        if (taskExecutionInstanceItemProvider != null) taskExecutionInstanceItemProvider.dispose();
    }

}
