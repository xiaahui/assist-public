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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.Feature} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureItemProvider featureItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.Feature}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFeatureAdapter() {
        if (featureItemProvider == null) {
            featureItemProvider = new FeatureItemProvider(this);
        }

        return featureItemProvider;
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.FeatureRequirement} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureRequirementItemProvider featureRequirementItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.FeatureRequirement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFeatureRequirementAdapter() {
        if (featureRequirementItemProvider == null) {
            featureRequirementItemProvider = new FeatureRequirementItemProvider(this);
        }

        return featureRequirementItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.MappingRelation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingRelationItemProvider mappingRelationItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.MappingRelation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMappingRelationAdapter() {
        if (mappingRelationItemProvider == null) {
            mappingRelationItemProvider = new MappingRelationItemProvider(this);
        }

        return mappingRelationItemProvider;
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.SimpleRelation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleRelationItemProvider simpleRelationItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.SimpleRelation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSimpleRelationAdapter() {
        if (simpleRelationItemProvider == null) {
            simpleRelationItemProvider = new SimpleRelationItemProvider(this);
        }

        return simpleRelationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.ComplexRelation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexRelationItemProvider complexRelationItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.ComplexRelation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createComplexRelationAdapter() {
        if (complexRelationItemProvider == null) {
            complexRelationItemProvider = new ComplexRelationItemProvider(this);
        }

        return complexRelationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RestrictionStartAtTheSameTime} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionStartAtTheSameTimeItemProvider restrictionStartAtTheSameTimeItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RestrictionStartAtTheSameTime}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRestrictionStartAtTheSameTimeAdapter() {
        if (restrictionStartAtTheSameTimeItemProvider == null) {
            restrictionStartAtTheSameTimeItemProvider = new RestrictionStartAtTheSameTimeItemProvider(this);
        }

        return restrictionStartAtTheSameTimeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RestrictionFinishAtTheSameTime} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionFinishAtTheSameTimeItemProvider restrictionFinishAtTheSameTimeItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RestrictionFinishAtTheSameTime}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRestrictionFinishAtTheSameTimeAdapter() {
        if (restrictionFinishAtTheSameTimeItemProvider == null) {
            restrictionFinishAtTheSameTimeItemProvider = new RestrictionFinishAtTheSameTimeItemProvider(this);
        }

        return restrictionFinishAtTheSameTimeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RestrictionStartAfterOtherFinished} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionStartAfterOtherFinishedItemProvider restrictionStartAfterOtherFinishedItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RestrictionStartAfterOtherFinished}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRestrictionStartAfterOtherFinishedAdapter() {
        if (restrictionStartAfterOtherFinishedItemProvider == null) {
            restrictionStartAfterOtherFinishedItemProvider = new RestrictionStartAfterOtherFinishedItemProvider(this);
        }

        return restrictionStartAfterOtherFinishedItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.RestrictionStartAfterOtherStarted} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionStartAfterOtherStartedItemProvider restrictionStartAfterOtherStartedItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.RestrictionStartAfterOtherStarted}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRestrictionStartAfterOtherStartedAdapter() {
        if (restrictionStartAfterOtherStartedItemProvider == null) {
            restrictionStartAfterOtherStartedItemProvider = new RestrictionStartAfterOtherStartedItemProvider(this);
        }

        return restrictionStartAfterOtherStartedItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.CustomProperty} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomPropertyItemProvider customPropertyItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.CustomProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCustomPropertyAdapter() {
        if (customPropertyItemProvider == null) {
            customPropertyItemProvider = new CustomPropertyItemProvider(this);
        }

        return customPropertyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.CustomIntProperty} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomIntPropertyItemProvider customIntPropertyItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.CustomIntProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCustomIntPropertyAdapter() {
        if (customIntPropertyItemProvider == null) {
            customIntPropertyItemProvider = new CustomIntPropertyItemProvider(this);
        }

        return customIntPropertyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.CustomStringProperty} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomStringPropertyItemProvider customStringPropertyItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.CustomStringProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCustomStringPropertyAdapter() {
        if (customStringPropertyItemProvider == null) {
            customStringPropertyItemProvider = new CustomStringPropertyItemProvider(this);
        }

        return customStringPropertyItemProvider;
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
     * This keeps track of the one adapter used for all {@link ch.hilbri.assist.model.SchedulingResult} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchedulingResultItemProvider schedulingResultItemProvider;

    /**
     * This creates an adapter for a {@link ch.hilbri.assist.model.SchedulingResult}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSchedulingResultAdapter() {
        if (schedulingResultItemProvider == null) {
            schedulingResultItemProvider = new SchedulingResultItemProvider(this);
        }

        return schedulingResultItemProvider;
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
        if (featureItemProvider != null) featureItemProvider.dispose();
        if (compartmentItemProvider != null) compartmentItemProvider.dispose();
        if (boxItemProvider != null) boxItemProvider.dispose();
        if (boardAlternativesItemProvider != null) boardAlternativesItemProvider.dispose();
        if (boardAlternativeItemProvider != null) boardAlternativeItemProvider.dispose();
        if (boardItemProvider != null) boardItemProvider.dispose();
        if (processorItemProvider != null) processorItemProvider.dispose();
        if (coreItemProvider != null) coreItemProvider.dispose();
        if (applicationAlternativesItemProvider != null) applicationAlternativesItemProvider.dispose();
        if (applicationAlternativeItemProvider != null) applicationAlternativeItemProvider.dispose();
        if (applicationItemProvider != null) applicationItemProvider.dispose();
        if (taskItemProvider != null) taskItemProvider.dispose();
        if (featureRequirementItemProvider != null) featureRequirementItemProvider.dispose();
        if (mappingRelationItemProvider != null) mappingRelationItemProvider.dispose();
        if (dislocalityRelationItemProvider != null) dislocalityRelationItemProvider.dispose();
        if (colocalityRelationItemProvider != null) colocalityRelationItemProvider.dispose();
        if (dissimilarityRelationItemProvider != null) dissimilarityRelationItemProvider.dispose();
        if (dissimilarityClauseItemProvider != null) dissimilarityClauseItemProvider.dispose();
        if (dissimilarityDisjunctionItemProvider != null) dissimilarityDisjunctionItemProvider.dispose();
        if (dissimilarityConjunctionItemProvider != null) dissimilarityConjunctionItemProvider.dispose();
        if (dissimilarityEntryItemProvider != null) dissimilarityEntryItemProvider.dispose();
        if (schedulingRestrictionItemProvider != null) schedulingRestrictionItemProvider.dispose();
        if (simpleRelationItemProvider != null) simpleRelationItemProvider.dispose();
        if (complexRelationItemProvider != null) complexRelationItemProvider.dispose();
        if (restrictionStartAtTheSameTimeItemProvider != null) restrictionStartAtTheSameTimeItemProvider.dispose();
        if (restrictionFinishAtTheSameTimeItemProvider != null) restrictionFinishAtTheSameTimeItemProvider.dispose();
        if (restrictionStartAfterOtherFinishedItemProvider != null) restrictionStartAfterOtherFinishedItemProvider.dispose();
        if (restrictionStartAfterOtherStartedItemProvider != null) restrictionStartAfterOtherStartedItemProvider.dispose();
        if (customPropertyItemProvider != null) customPropertyItemProvider.dispose();
        if (customIntPropertyItemProvider != null) customIntPropertyItemProvider.dispose();
        if (customStringPropertyItemProvider != null) customStringPropertyItemProvider.dispose();
        if (restrictionAlternativesItemProvider != null) restrictionAlternativesItemProvider.dispose();
        if (restrictionAlternativeItemProvider != null) restrictionAlternativeItemProvider.dispose();
        if (explorationCandidateItemProvider != null) explorationCandidateItemProvider.dispose();
        if (metricScorePairItemProvider != null) metricScorePairItemProvider.dispose();
        if (mappingResultItemProvider != null) mappingResultItemProvider.dispose();
        if (singleMappingElementItemProvider != null) singleMappingElementItemProvider.dispose();
        if (schedulingResultItemProvider != null) schedulingResultItemProvider.dispose();
        if (taskExecutionInstanceItemProvider != null) taskExecutionInstanceItemProvider.dispose();
    }

}
