/**
 */
package ch.hilbri.assist.model.util;

import ch.hilbri.assist.model.AbstractDSEMetric;
import ch.hilbri.assist.model.AbstractMappingMetric;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.ApplicationAlternatives;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardAlternative;
import ch.hilbri.assist.model.BoardAlternatives;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.ComplexRelation;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CustomIntProperty;
import ch.hilbri.assist.model.CustomProperty;
import ch.hilbri.assist.model.CustomStringProperty;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityClause;
import ch.hilbri.assist.model.DissimilarityConjunction;
import ch.hilbri.assist.model.DissimilarityDisjunction;
import ch.hilbri.assist.model.DissimilarityEntry;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.ExplorationResult;
import ch.hilbri.assist.model.Feature;
import ch.hilbri.assist.model.FeatureRequirement;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ManufacturerProperty;
import ch.hilbri.assist.model.MappingRelation;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PowerSupplyProperty;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.RestrictionAlternative;
import ch.hilbri.assist.model.RestrictionAlternatives;
import ch.hilbri.assist.model.RestrictionDisjointExecution;
import ch.hilbri.assist.model.RestrictionFinishAtTheSameTime;
import ch.hilbri.assist.model.RestrictionStartAfterOtherFinished;
import ch.hilbri.assist.model.RestrictionStartAfterOtherStarted;
import ch.hilbri.assist.model.RestrictionStartAtTheSameTime;
import ch.hilbri.assist.model.SchedulingRestriction;
import ch.hilbri.assist.model.SchedulingResult;
import ch.hilbri.assist.model.SimpleRelation;
import ch.hilbri.assist.model.SingleMappingElement;
import ch.hilbri.assist.model.SoftwareElement;
import ch.hilbri.assist.model.StringProperty;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskExecutionInstance;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ModelPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelSwitch<Adapter> modelSwitch =
        new ModelSwitch<Adapter>() {
            @Override
            public Adapter caseAssistModel(AssistModel object) {
                return createAssistModelAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseStringProperty(StringProperty object) {
                return createStringPropertyAdapter();
            }
            @Override
            public Adapter caseManufacturerProperty(ManufacturerProperty object) {
                return createManufacturerPropertyAdapter();
            }
            @Override
            public Adapter casePowerSupplyProperty(PowerSupplyProperty object) {
                return createPowerSupplyPropertyAdapter();
            }
            @Override
            public Adapter caseHardwareElement(HardwareElement object) {
                return createHardwareElementAdapter();
            }
            @Override
            public Adapter caseFeature(Feature object) {
                return createFeatureAdapter();
            }
            @Override
            public Adapter caseCompartment(Compartment object) {
                return createCompartmentAdapter();
            }
            @Override
            public Adapter caseBox(Box object) {
                return createBoxAdapter();
            }
            @Override
            public Adapter caseBoardAlternatives(BoardAlternatives object) {
                return createBoardAlternativesAdapter();
            }
            @Override
            public Adapter caseBoardAlternative(BoardAlternative object) {
                return createBoardAlternativeAdapter();
            }
            @Override
            public Adapter caseBoard(Board object) {
                return createBoardAdapter();
            }
            @Override
            public Adapter caseProcessor(Processor object) {
                return createProcessorAdapter();
            }
            @Override
            public Adapter caseCore(Core object) {
                return createCoreAdapter();
            }
            @Override
            public Adapter caseApplicationAlternatives(ApplicationAlternatives object) {
                return createApplicationAlternativesAdapter();
            }
            @Override
            public Adapter caseApplicationAlternative(ApplicationAlternative object) {
                return createApplicationAlternativeAdapter();
            }
            @Override
            public Adapter caseSoftwareElement(SoftwareElement object) {
                return createSoftwareElementAdapter();
            }
            @Override
            public Adapter caseApplication(Application object) {
                return createApplicationAdapter();
            }
            @Override
            public Adapter caseTask(Task object) {
                return createTaskAdapter();
            }
            @Override
            public Adapter caseFeatureRequirement(FeatureRequirement object) {
                return createFeatureRequirementAdapter();
            }
            @Override
            public Adapter caseMappingRelation(MappingRelation object) {
                return createMappingRelationAdapter();
            }
            @Override
            public Adapter caseDislocalityRelation(DislocalityRelation object) {
                return createDislocalityRelationAdapter();
            }
            @Override
            public Adapter caseColocalityRelation(ColocalityRelation object) {
                return createColocalityRelationAdapter();
            }
            @Override
            public Adapter caseDissimilarityRelation(DissimilarityRelation object) {
                return createDissimilarityRelationAdapter();
            }
            @Override
            public Adapter caseDissimilarityClause(DissimilarityClause object) {
                return createDissimilarityClauseAdapter();
            }
            @Override
            public Adapter caseDissimilarityDisjunction(DissimilarityDisjunction object) {
                return createDissimilarityDisjunctionAdapter();
            }
            @Override
            public Adapter caseDissimilarityConjunction(DissimilarityConjunction object) {
                return createDissimilarityConjunctionAdapter();
            }
            @Override
            public Adapter caseDissimilarityEntry(DissimilarityEntry object) {
                return createDissimilarityEntryAdapter();
            }
            @Override
            public Adapter caseSchedulingRestriction(SchedulingRestriction object) {
                return createSchedulingRestrictionAdapter();
            }
            @Override
            public Adapter caseSimpleRelation(SimpleRelation object) {
                return createSimpleRelationAdapter();
            }
            @Override
            public Adapter caseComplexRelation(ComplexRelation object) {
                return createComplexRelationAdapter();
            }
            @Override
            public Adapter caseRestrictionStartAtTheSameTime(RestrictionStartAtTheSameTime object) {
                return createRestrictionStartAtTheSameTimeAdapter();
            }
            @Override
            public Adapter caseRestrictionFinishAtTheSameTime(RestrictionFinishAtTheSameTime object) {
                return createRestrictionFinishAtTheSameTimeAdapter();
            }
            @Override
            public Adapter caseRestrictionStartAfterOtherFinished(RestrictionStartAfterOtherFinished object) {
                return createRestrictionStartAfterOtherFinishedAdapter();
            }
            @Override
            public Adapter caseRestrictionStartAfterOtherStarted(RestrictionStartAfterOtherStarted object) {
                return createRestrictionStartAfterOtherStartedAdapter();
            }
            @Override
            public Adapter caseRestrictionDisjointExecution(RestrictionDisjointExecution object) {
                return createRestrictionDisjointExecutionAdapter();
            }
            @Override
            public Adapter caseCustomProperty(CustomProperty object) {
                return createCustomPropertyAdapter();
            }
            @Override
            public Adapter caseCustomIntProperty(CustomIntProperty object) {
                return createCustomIntPropertyAdapter();
            }
            @Override
            public Adapter caseCustomStringProperty(CustomStringProperty object) {
                return createCustomStringPropertyAdapter();
            }
            @Override
            public Adapter caseRestrictionAlternatives(RestrictionAlternatives object) {
                return createRestrictionAlternativesAdapter();
            }
            @Override
            public Adapter caseRestrictionAlternative(RestrictionAlternative object) {
                return createRestrictionAlternativeAdapter();
            }
            @Override
            public Adapter caseExplorationCandidate(ExplorationCandidate object) {
                return createExplorationCandidateAdapter();
            }
            @Override
            public Adapter caseExplorationResult(ExplorationResult object) {
                return createExplorationResultAdapter();
            }
            @Override
            public Adapter caseAbstractDSEMetric(AbstractDSEMetric object) {
                return createAbstractDSEMetricAdapter();
            }
            @Override
            public Adapter caseComparable(Comparable<MappingResult> object) {
                return createComparableAdapter();
            }
            @Override
            public Adapter caseMetricScorePair(Map.Entry<AbstractMappingMetric, Double> object) {
                return createMetricScorePairAdapter();
            }
            @Override
            public Adapter caseMappingResult(MappingResult object) {
                return createMappingResultAdapter();
            }
            @Override
            public Adapter caseSingleMappingElement(SingleMappingElement object) {
                return createSingleMappingElementAdapter();
            }
            @Override
            public Adapter caseAbstractMappingMetric(AbstractMappingMetric object) {
                return createAbstractMappingMetricAdapter();
            }
            @Override
            public Adapter caseSchedulingResult(SchedulingResult object) {
                return createSchedulingResultAdapter();
            }
            @Override
            public Adapter caseTaskExecutionInstance(TaskExecutionInstance object) {
                return createTaskExecutionInstanceAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.AssistModel <em>Assist Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.AssistModel
     * @generated
     */
    public Adapter createAssistModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.StringProperty <em>String Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.StringProperty
     * @generated
     */
    public Adapter createStringPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.ManufacturerProperty <em>Manufacturer Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.ManufacturerProperty
     * @generated
     */
    public Adapter createManufacturerPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.PowerSupplyProperty <em>Power Supply Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.PowerSupplyProperty
     * @generated
     */
    public Adapter createPowerSupplyPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.HardwareElement <em>Hardware Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.HardwareElement
     * @generated
     */
    public Adapter createHardwareElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Feature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Feature
     * @generated
     */
    public Adapter createFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Compartment <em>Compartment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Compartment
     * @generated
     */
    public Adapter createCompartmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Box <em>Box</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Box
     * @generated
     */
    public Adapter createBoxAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.BoardAlternatives <em>Board Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.BoardAlternatives
     * @generated
     */
    public Adapter createBoardAlternativesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.BoardAlternative <em>Board Alternative</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.BoardAlternative
     * @generated
     */
    public Adapter createBoardAlternativeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Board <em>Board</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Board
     * @generated
     */
    public Adapter createBoardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Processor
     * @generated
     */
    public Adapter createProcessorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Core <em>Core</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Core
     * @generated
     */
    public Adapter createCoreAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.ApplicationAlternatives <em>Application Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.ApplicationAlternatives
     * @generated
     */
    public Adapter createApplicationAlternativesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.ApplicationAlternative <em>Application Alternative</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.ApplicationAlternative
     * @generated
     */
    public Adapter createApplicationAlternativeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.SoftwareElement <em>Software Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.SoftwareElement
     * @generated
     */
    public Adapter createSoftwareElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Application
     * @generated
     */
    public Adapter createApplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.Task
     * @generated
     */
    public Adapter createTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.FeatureRequirement <em>Feature Requirement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.FeatureRequirement
     * @generated
     */
    public Adapter createFeatureRequirementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.MappingRelation <em>Mapping Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.MappingRelation
     * @generated
     */
    public Adapter createMappingRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.DislocalityRelation <em>Dislocality Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.DislocalityRelation
     * @generated
     */
    public Adapter createDislocalityRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.ColocalityRelation <em>Colocality Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.ColocalityRelation
     * @generated
     */
    public Adapter createColocalityRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.DissimilarityRelation <em>Dissimilarity Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.DissimilarityRelation
     * @generated
     */
    public Adapter createDissimilarityRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.DissimilarityClause <em>Dissimilarity Clause</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.DissimilarityClause
     * @generated
     */
    public Adapter createDissimilarityClauseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.DissimilarityDisjunction <em>Dissimilarity Disjunction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.DissimilarityDisjunction
     * @generated
     */
    public Adapter createDissimilarityDisjunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.DissimilarityConjunction <em>Dissimilarity Conjunction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.DissimilarityConjunction
     * @generated
     */
    public Adapter createDissimilarityConjunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.DissimilarityEntry <em>Dissimilarity Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.DissimilarityEntry
     * @generated
     */
    public Adapter createDissimilarityEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.SchedulingRestriction <em>Scheduling Restriction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.SchedulingRestriction
     * @generated
     */
    public Adapter createSchedulingRestrictionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.SimpleRelation <em>Simple Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.SimpleRelation
     * @generated
     */
    public Adapter createSimpleRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.ComplexRelation <em>Complex Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.ComplexRelation
     * @generated
     */
    public Adapter createComplexRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.RestrictionStartAtTheSameTime <em>Restriction Start At The Same Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.RestrictionStartAtTheSameTime
     * @generated
     */
    public Adapter createRestrictionStartAtTheSameTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.RestrictionFinishAtTheSameTime <em>Restriction Finish At The Same Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.RestrictionFinishAtTheSameTime
     * @generated
     */
    public Adapter createRestrictionFinishAtTheSameTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.RestrictionStartAfterOtherFinished <em>Restriction Start After Other Finished</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.RestrictionStartAfterOtherFinished
     * @generated
     */
    public Adapter createRestrictionStartAfterOtherFinishedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.RestrictionStartAfterOtherStarted <em>Restriction Start After Other Started</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.RestrictionStartAfterOtherStarted
     * @generated
     */
    public Adapter createRestrictionStartAfterOtherStartedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.RestrictionDisjointExecution <em>Restriction Disjoint Execution</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.RestrictionDisjointExecution
     * @generated
     */
    public Adapter createRestrictionDisjointExecutionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.CustomProperty <em>Custom Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.CustomProperty
     * @generated
     */
    public Adapter createCustomPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.CustomIntProperty <em>Custom Int Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.CustomIntProperty
     * @generated
     */
    public Adapter createCustomIntPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.CustomStringProperty <em>Custom String Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.CustomStringProperty
     * @generated
     */
    public Adapter createCustomStringPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.RestrictionAlternatives <em>Restriction Alternatives</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.RestrictionAlternatives
     * @generated
     */
    public Adapter createRestrictionAlternativesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.RestrictionAlternative <em>Restriction Alternative</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.RestrictionAlternative
     * @generated
     */
    public Adapter createRestrictionAlternativeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.ExplorationCandidate <em>Exploration Candidate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.ExplorationCandidate
     * @generated
     */
    public Adapter createExplorationCandidateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.ExplorationResult <em>Exploration Result</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.ExplorationResult
     * @generated
     */
    public Adapter createExplorationResultAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.AbstractDSEMetric <em>Abstract DSE Metric</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.AbstractDSEMetric
     * @generated
     */
    public Adapter createAbstractDSEMetricAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Comparable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.lang.Comparable
     * @generated
     */
    public Adapter createComparableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Metric Score Pair</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
    public Adapter createMetricScorePairAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.MappingResult <em>Mapping Result</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.MappingResult
     * @generated
     */
    public Adapter createMappingResultAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.SingleMappingElement <em>Single Mapping Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.SingleMappingElement
     * @generated
     */
    public Adapter createSingleMappingElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.AbstractMappingMetric <em>Abstract Mapping Metric</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.AbstractMappingMetric
     * @generated
     */
    public Adapter createAbstractMappingMetricAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.SchedulingResult <em>Scheduling Result</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.SchedulingResult
     * @generated
     */
    public Adapter createSchedulingResultAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ch.hilbri.assist.model.TaskExecutionInstance <em>Task Execution Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ch.hilbri.assist.model.TaskExecutionInstance
     * @generated
     */
    public Adapter createTaskExecutionInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ModelAdapterFactory
