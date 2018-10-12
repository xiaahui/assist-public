/**
 */
package ch.hilbri.assist.model.util;

import ch.hilbri.assist.model.AbstractDSEMetric;
import ch.hilbri.assist.model.AbstractMappingMetric;
import ch.hilbri.assist.model.AddInitTimeProperty;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationAlternative;
import ch.hilbri.assist.model.AssignedCoreProperty;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.BoardAlternative;
import ch.hilbri.assist.model.BoardTypeProperty;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.ColocalityRelation;
import ch.hilbri.assist.model.ColorProperty;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.ComplexRelation;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.CoreArchitectureProperty;
import ch.hilbri.assist.model.CoreCapacityProperty;
import ch.hilbri.assist.model.CoreUtilizationProperty;
import ch.hilbri.assist.model.CriticalityLevelProperty;
import ch.hilbri.assist.model.CustomIntProperty;
import ch.hilbri.assist.model.CustomProperty;
import ch.hilbri.assist.model.CustomStringProperty;
import ch.hilbri.assist.model.DesignAssuranceLevelProperty;
import ch.hilbri.assist.model.DevelopedByProperty;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityClause;
import ch.hilbri.assist.model.DissimilarityConjunction;
import ch.hilbri.assist.model.DissimilarityDisjunction;
import ch.hilbri.assist.model.DissimilarityEntry;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.DurationProperty;
import ch.hilbri.assist.model.EarlyToleranceProperty;
import ch.hilbri.assist.model.ExplorationCandidate;
import ch.hilbri.assist.model.ExplorationResult;
import ch.hilbri.assist.model.Feature;
import ch.hilbri.assist.model.FeatureRequirement;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.IntProperty;
import ch.hilbri.assist.model.LateToleranceProperty;
import ch.hilbri.assist.model.ManufacturerProperty;
import ch.hilbri.assist.model.MappingRelation;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.MaxEndTimeProperty;
import ch.hilbri.assist.model.MaxStartTimeProperty;
import ch.hilbri.assist.model.MinHypPeriodLengthProperty;
import ch.hilbri.assist.model.MinSliceDurationProperty;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PeriodProperty;
import ch.hilbri.assist.model.PeriodicityProperty;
import ch.hilbri.assist.model.PowerSupplyProperty;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.ProcessorTypeProperty;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.RAMCapacityProperty;
import ch.hilbri.assist.model.RAMUtilizationProperty;
import ch.hilbri.assist.model.ROMCapacityProperty;
import ch.hilbri.assist.model.ROMUtilizationProperty;
import ch.hilbri.assist.model.RestrictionAlternative;
import ch.hilbri.assist.model.RestrictionDisjointExecution;
import ch.hilbri.assist.model.RestrictionFinishAtTheSameTime;
import ch.hilbri.assist.model.RestrictionStartAfterOtherFinished;
import ch.hilbri.assist.model.RestrictionStartAfterOtherStarted;
import ch.hilbri.assist.model.RestrictionStartAtTheSameTime;
import ch.hilbri.assist.model.SchedulingRestriction;
import ch.hilbri.assist.model.SchedulingResult;
import ch.hilbri.assist.model.SimpleRelation;
import ch.hilbri.assist.model.SingleMappingElement;
import ch.hilbri.assist.model.SlicesProperty;
import ch.hilbri.assist.model.SoftwareElement;
import ch.hilbri.assist.model.StringProperty;
import ch.hilbri.assist.model.SystemNameProperty;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskExecutionInstance;
import ch.hilbri.assist.model.TaskSwitchDelayProperty;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelSwitch() {
        if (modelPackage == null) {
            modelPackage = ModelPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ModelPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.STRING_PROPERTY: {
                StringProperty stringProperty = (StringProperty)theEObject;
                T result = caseStringProperty(stringProperty);
                if (result == null) result = caseProperty(stringProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.INT_PROPERTY: {
                IntProperty intProperty = (IntProperty)theEObject;
                T result = caseIntProperty(intProperty);
                if (result == null) result = caseProperty(intProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SYSTEM_NAME_PROPERTY: {
                SystemNameProperty systemNameProperty = (SystemNameProperty)theEObject;
                T result = caseSystemNameProperty(systemNameProperty);
                if (result == null) result = caseStringProperty(systemNameProperty);
                if (result == null) result = caseProperty(systemNameProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MIN_HYP_PERIOD_LENGTH_PROPERTY: {
                MinHypPeriodLengthProperty minHypPeriodLengthProperty = (MinHypPeriodLengthProperty)theEObject;
                T result = caseMinHypPeriodLengthProperty(minHypPeriodLengthProperty);
                if (result == null) result = caseIntProperty(minHypPeriodLengthProperty);
                if (result == null) result = caseProperty(minHypPeriodLengthProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.TASK_SWITCH_DELAY_PROPERTY: {
                TaskSwitchDelayProperty taskSwitchDelayProperty = (TaskSwitchDelayProperty)theEObject;
                T result = caseTaskSwitchDelayProperty(taskSwitchDelayProperty);
                if (result == null) result = caseIntProperty(taskSwitchDelayProperty);
                if (result == null) result = caseProperty(taskSwitchDelayProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MANUFACTURER_PROPERTY: {
                ManufacturerProperty manufacturerProperty = (ManufacturerProperty)theEObject;
                T result = caseManufacturerProperty(manufacturerProperty);
                if (result == null) result = caseStringProperty(manufacturerProperty);
                if (result == null) result = caseProperty(manufacturerProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.POWER_SUPPLY_PROPERTY: {
                PowerSupplyProperty powerSupplyProperty = (PowerSupplyProperty)theEObject;
                T result = casePowerSupplyProperty(powerSupplyProperty);
                if (result == null) result = caseStringProperty(powerSupplyProperty);
                if (result == null) result = caseProperty(powerSupplyProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BOARD_TYPE_PROPERTY: {
                BoardTypeProperty boardTypeProperty = (BoardTypeProperty)theEObject;
                T result = caseBoardTypeProperty(boardTypeProperty);
                if (result == null) result = caseStringProperty(boardTypeProperty);
                if (result == null) result = caseProperty(boardTypeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.PROCESSOR_TYPE_PROPERTY: {
                ProcessorTypeProperty processorTypeProperty = (ProcessorTypeProperty)theEObject;
                T result = caseProcessorTypeProperty(processorTypeProperty);
                if (result == null) result = caseStringProperty(processorTypeProperty);
                if (result == null) result = caseProperty(processorTypeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RAM_CAPACITY_PROPERTY: {
                RAMCapacityProperty ramCapacityProperty = (RAMCapacityProperty)theEObject;
                T result = caseRAMCapacityProperty(ramCapacityProperty);
                if (result == null) result = caseIntProperty(ramCapacityProperty);
                if (result == null) result = caseProperty(ramCapacityProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RAM_UTILIZATION_PROPERTY: {
                RAMUtilizationProperty ramUtilizationProperty = (RAMUtilizationProperty)theEObject;
                T result = caseRAMUtilizationProperty(ramUtilizationProperty);
                if (result == null) result = caseIntProperty(ramUtilizationProperty);
                if (result == null) result = caseProperty(ramUtilizationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROM_CAPACITY_PROPERTY: {
                ROMCapacityProperty romCapacityProperty = (ROMCapacityProperty)theEObject;
                T result = caseROMCapacityProperty(romCapacityProperty);
                if (result == null) result = caseIntProperty(romCapacityProperty);
                if (result == null) result = caseProperty(romCapacityProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROM_UTILIZATION_PROPERTY: {
                ROMUtilizationProperty romUtilizationProperty = (ROMUtilizationProperty)theEObject;
                T result = caseROMUtilizationProperty(romUtilizationProperty);
                if (result == null) result = caseIntProperty(romUtilizationProperty);
                if (result == null) result = caseProperty(romUtilizationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CORE_CAPACITY_PROPERTY: {
                CoreCapacityProperty coreCapacityProperty = (CoreCapacityProperty)theEObject;
                T result = caseCoreCapacityProperty(coreCapacityProperty);
                if (result == null) result = caseIntProperty(coreCapacityProperty);
                if (result == null) result = caseProperty(coreCapacityProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CORE_UTILIZATION_PROPERTY: {
                CoreUtilizationProperty coreUtilizationProperty = (CoreUtilizationProperty)theEObject;
                T result = caseCoreUtilizationProperty(coreUtilizationProperty);
                if (result == null) result = caseIntProperty(coreUtilizationProperty);
                if (result == null) result = caseProperty(coreUtilizationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CORE_ARCHITECTURE_PROPERTY: {
                CoreArchitectureProperty coreArchitectureProperty = (CoreArchitectureProperty)theEObject;
                T result = caseCoreArchitectureProperty(coreArchitectureProperty);
                if (result == null) result = caseStringProperty(coreArchitectureProperty);
                if (result == null) result = caseProperty(coreArchitectureProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DEVELOPED_BY_PROPERTY: {
                DevelopedByProperty developedByProperty = (DevelopedByProperty)theEObject;
                T result = caseDevelopedByProperty(developedByProperty);
                if (result == null) result = caseStringProperty(developedByProperty);
                if (result == null) result = caseProperty(developedByProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DURATION_PROPERTY: {
                DurationProperty durationProperty = (DurationProperty)theEObject;
                T result = caseDurationProperty(durationProperty);
                if (result == null) result = caseIntProperty(durationProperty);
                if (result == null) result = caseProperty(durationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.PERIOD_PROPERTY: {
                PeriodProperty periodProperty = (PeriodProperty)theEObject;
                T result = casePeriodProperty(periodProperty);
                if (result == null) result = caseIntProperty(periodProperty);
                if (result == null) result = caseProperty(periodProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.EARLY_TOLERANCE_PROPERTY: {
                EarlyToleranceProperty earlyToleranceProperty = (EarlyToleranceProperty)theEObject;
                T result = caseEarlyToleranceProperty(earlyToleranceProperty);
                if (result == null) result = caseIntProperty(earlyToleranceProperty);
                if (result == null) result = caseProperty(earlyToleranceProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.LATE_TOLERANCE_PROPERTY: {
                LateToleranceProperty lateToleranceProperty = (LateToleranceProperty)theEObject;
                T result = caseLateToleranceProperty(lateToleranceProperty);
                if (result == null) result = caseIntProperty(lateToleranceProperty);
                if (result == null) result = caseProperty(lateToleranceProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MAX_START_TIME_PROPERTY: {
                MaxStartTimeProperty maxStartTimeProperty = (MaxStartTimeProperty)theEObject;
                T result = caseMaxStartTimeProperty(maxStartTimeProperty);
                if (result == null) result = caseIntProperty(maxStartTimeProperty);
                if (result == null) result = caseProperty(maxStartTimeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MAX_END_TIME_PROPERTY: {
                MaxEndTimeProperty maxEndTimeProperty = (MaxEndTimeProperty)theEObject;
                T result = caseMaxEndTimeProperty(maxEndTimeProperty);
                if (result == null) result = caseIntProperty(maxEndTimeProperty);
                if (result == null) result = caseProperty(maxEndTimeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ADD_INIT_TIME_PROPERTY: {
                AddInitTimeProperty addInitTimeProperty = (AddInitTimeProperty)theEObject;
                T result = caseAddInitTimeProperty(addInitTimeProperty);
                if (result == null) result = caseIntProperty(addInitTimeProperty);
                if (result == null) result = caseProperty(addInitTimeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SLICES_PROPERTY: {
                SlicesProperty slicesProperty = (SlicesProperty)theEObject;
                T result = caseSlicesProperty(slicesProperty);
                if (result == null) result = caseIntProperty(slicesProperty);
                if (result == null) result = caseProperty(slicesProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MIN_SLICE_DURATION_PROPERTY: {
                MinSliceDurationProperty minSliceDurationProperty = (MinSliceDurationProperty)theEObject;
                T result = caseMinSliceDurationProperty(minSliceDurationProperty);
                if (result == null) result = caseIntProperty(minSliceDurationProperty);
                if (result == null) result = caseProperty(minSliceDurationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DESIGN_ASSURANCE_LEVEL_PROPERTY: {
                DesignAssuranceLevelProperty designAssuranceLevelProperty = (DesignAssuranceLevelProperty)theEObject;
                T result = caseDesignAssuranceLevelProperty(designAssuranceLevelProperty);
                if (result == null) result = caseProperty(designAssuranceLevelProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CRITICALITY_LEVEL_PROPERTY: {
                CriticalityLevelProperty criticalityLevelProperty = (CriticalityLevelProperty)theEObject;
                T result = caseCriticalityLevelProperty(criticalityLevelProperty);
                if (result == null) result = caseProperty(criticalityLevelProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.PERIODICITY_PROPERTY: {
                PeriodicityProperty periodicityProperty = (PeriodicityProperty)theEObject;
                T result = casePeriodicityProperty(periodicityProperty);
                if (result == null) result = caseProperty(periodicityProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.COLOR_PROPERTY: {
                ColorProperty colorProperty = (ColorProperty)theEObject;
                T result = caseColorProperty(colorProperty);
                if (result == null) result = caseProperty(colorProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ASSIGNED_CORE_PROPERTY: {
                AssignedCoreProperty assignedCoreProperty = (AssignedCoreProperty)theEObject;
                T result = caseAssignedCoreProperty(assignedCoreProperty);
                if (result == null) result = caseProperty(assignedCoreProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CUSTOM_PROPERTY: {
                CustomProperty customProperty = (CustomProperty)theEObject;
                T result = caseCustomProperty(customProperty);
                if (result == null) result = caseProperty(customProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CUSTOM_INT_PROPERTY: {
                CustomIntProperty customIntProperty = (CustomIntProperty)theEObject;
                T result = caseCustomIntProperty(customIntProperty);
                if (result == null) result = caseCustomProperty(customIntProperty);
                if (result == null) result = caseProperty(customIntProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CUSTOM_STRING_PROPERTY: {
                CustomStringProperty customStringProperty = (CustomStringProperty)theEObject;
                T result = caseCustomStringProperty(customStringProperty);
                if (result == null) result = caseCustomProperty(customStringProperty);
                if (result == null) result = caseProperty(customStringProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ASSIST_MODEL: {
                AssistModel assistModel = (AssistModel)theEObject;
                T result = caseAssistModel(assistModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.HARDWARE_ELEMENT: {
                HardwareElement hardwareElement = (HardwareElement)theEObject;
                T result = caseHardwareElement(hardwareElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.FEATURE: {
                Feature feature = (Feature)theEObject;
                T result = caseFeature(feature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.COMPARTMENT: {
                Compartment compartment = (Compartment)theEObject;
                T result = caseCompartment(compartment);
                if (result == null) result = caseHardwareElement(compartment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BOX: {
                Box box = (Box)theEObject;
                T result = caseBox(box);
                if (result == null) result = caseHardwareElement(box);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BOARD_ALTERNATIVE: {
                BoardAlternative boardAlternative = (BoardAlternative)theEObject;
                T result = caseBoardAlternative(boardAlternative);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BOARD: {
                Board board = (Board)theEObject;
                T result = caseBoard(board);
                if (result == null) result = caseHardwareElement(board);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.PROCESSOR: {
                Processor processor = (Processor)theEObject;
                T result = caseProcessor(processor);
                if (result == null) result = caseHardwareElement(processor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CORE: {
                Core core = (Core)theEObject;
                T result = caseCore(core);
                if (result == null) result = caseHardwareElement(core);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.APPLICATION_ALTERNATIVE: {
                ApplicationAlternative applicationAlternative = (ApplicationAlternative)theEObject;
                T result = caseApplicationAlternative(applicationAlternative);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SOFTWARE_ELEMENT: {
                SoftwareElement softwareElement = (SoftwareElement)theEObject;
                T result = caseSoftwareElement(softwareElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.APPLICATION: {
                Application application = (Application)theEObject;
                T result = caseApplication(application);
                if (result == null) result = caseSoftwareElement(application);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.TASK: {
                Task task = (Task)theEObject;
                T result = caseTask(task);
                if (result == null) result = caseSoftwareElement(task);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.FEATURE_REQUIREMENT: {
                FeatureRequirement featureRequirement = (FeatureRequirement)theEObject;
                T result = caseFeatureRequirement(featureRequirement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MAPPING_RELATION: {
                MappingRelation mappingRelation = (MappingRelation)theEObject;
                T result = caseMappingRelation(mappingRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DISLOCALITY_RELATION: {
                DislocalityRelation dislocalityRelation = (DislocalityRelation)theEObject;
                T result = caseDislocalityRelation(dislocalityRelation);
                if (result == null) result = caseMappingRelation(dislocalityRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.COLOCALITY_RELATION: {
                ColocalityRelation colocalityRelation = (ColocalityRelation)theEObject;
                T result = caseColocalityRelation(colocalityRelation);
                if (result == null) result = caseMappingRelation(colocalityRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DISSIMILARITY_RELATION: {
                DissimilarityRelation dissimilarityRelation = (DissimilarityRelation)theEObject;
                T result = caseDissimilarityRelation(dissimilarityRelation);
                if (result == null) result = caseMappingRelation(dissimilarityRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DISSIMILARITY_CLAUSE: {
                DissimilarityClause dissimilarityClause = (DissimilarityClause)theEObject;
                T result = caseDissimilarityClause(dissimilarityClause);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DISSIMILARITY_DISJUNCTION: {
                DissimilarityDisjunction dissimilarityDisjunction = (DissimilarityDisjunction)theEObject;
                T result = caseDissimilarityDisjunction(dissimilarityDisjunction);
                if (result == null) result = caseDissimilarityClause(dissimilarityDisjunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DISSIMILARITY_CONJUNCTION: {
                DissimilarityConjunction dissimilarityConjunction = (DissimilarityConjunction)theEObject;
                T result = caseDissimilarityConjunction(dissimilarityConjunction);
                if (result == null) result = caseDissimilarityClause(dissimilarityConjunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DISSIMILARITY_ENTRY: {
                DissimilarityEntry dissimilarityEntry = (DissimilarityEntry)theEObject;
                T result = caseDissimilarityEntry(dissimilarityEntry);
                if (result == null) result = caseDissimilarityClause(dissimilarityEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SCHEDULING_RESTRICTION: {
                SchedulingRestriction schedulingRestriction = (SchedulingRestriction)theEObject;
                T result = caseSchedulingRestriction(schedulingRestriction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SIMPLE_RELATION: {
                SimpleRelation simpleRelation = (SimpleRelation)theEObject;
                T result = caseSimpleRelation(simpleRelation);
                if (result == null) result = caseSchedulingRestriction(simpleRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.COMPLEX_RELATION: {
                ComplexRelation complexRelation = (ComplexRelation)theEObject;
                T result = caseComplexRelation(complexRelation);
                if (result == null) result = caseSchedulingRestriction(complexRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RESTRICTION_START_AT_THE_SAME_TIME: {
                RestrictionStartAtTheSameTime restrictionStartAtTheSameTime = (RestrictionStartAtTheSameTime)theEObject;
                T result = caseRestrictionStartAtTheSameTime(restrictionStartAtTheSameTime);
                if (result == null) result = caseSimpleRelation(restrictionStartAtTheSameTime);
                if (result == null) result = caseSchedulingRestriction(restrictionStartAtTheSameTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RESTRICTION_FINISH_AT_THE_SAME_TIME: {
                RestrictionFinishAtTheSameTime restrictionFinishAtTheSameTime = (RestrictionFinishAtTheSameTime)theEObject;
                T result = caseRestrictionFinishAtTheSameTime(restrictionFinishAtTheSameTime);
                if (result == null) result = caseSimpleRelation(restrictionFinishAtTheSameTime);
                if (result == null) result = caseSchedulingRestriction(restrictionFinishAtTheSameTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RESTRICTION_START_AFTER_OTHER_FINISHED: {
                RestrictionStartAfterOtherFinished restrictionStartAfterOtherFinished = (RestrictionStartAfterOtherFinished)theEObject;
                T result = caseRestrictionStartAfterOtherFinished(restrictionStartAfterOtherFinished);
                if (result == null) result = caseComplexRelation(restrictionStartAfterOtherFinished);
                if (result == null) result = caseSchedulingRestriction(restrictionStartAfterOtherFinished);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RESTRICTION_START_AFTER_OTHER_STARTED: {
                RestrictionStartAfterOtherStarted restrictionStartAfterOtherStarted = (RestrictionStartAfterOtherStarted)theEObject;
                T result = caseRestrictionStartAfterOtherStarted(restrictionStartAfterOtherStarted);
                if (result == null) result = caseComplexRelation(restrictionStartAfterOtherStarted);
                if (result == null) result = caseSchedulingRestriction(restrictionStartAfterOtherStarted);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RESTRICTION_DISJOINT_EXECUTION: {
                RestrictionDisjointExecution restrictionDisjointExecution = (RestrictionDisjointExecution)theEObject;
                T result = caseRestrictionDisjointExecution(restrictionDisjointExecution);
                if (result == null) result = caseSimpleRelation(restrictionDisjointExecution);
                if (result == null) result = caseSchedulingRestriction(restrictionDisjointExecution);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RESTRICTION_ALTERNATIVE: {
                RestrictionAlternative restrictionAlternative = (RestrictionAlternative)theEObject;
                T result = caseRestrictionAlternative(restrictionAlternative);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.EXPLORATION_CANDIDATE: {
                ExplorationCandidate explorationCandidate = (ExplorationCandidate)theEObject;
                T result = caseExplorationCandidate(explorationCandidate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.EXPLORATION_RESULT: {
                ExplorationResult explorationResult = (ExplorationResult)theEObject;
                T result = caseExplorationResult(explorationResult);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ABSTRACT_DSE_METRIC: {
                AbstractDSEMetric abstractDSEMetric = (AbstractDSEMetric)theEObject;
                T result = caseAbstractDSEMetric(abstractDSEMetric);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.COMPARABLE: {
                @SuppressWarnings("unchecked") Comparable<MappingResult> comparable = (Comparable<MappingResult>)theEObject;
                T result = caseComparable(comparable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.METRIC_SCORE_PAIR: {
                @SuppressWarnings("unchecked") Map.Entry<AbstractMappingMetric, Double> metricScorePair = (Map.Entry<AbstractMappingMetric, Double>)theEObject;
                T result = caseMetricScorePair(metricScorePair);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.MAPPING_RESULT: {
                MappingResult mappingResult = (MappingResult)theEObject;
                T result = caseMappingResult(mappingResult);
                if (result == null) result = caseComparable(mappingResult);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SINGLE_MAPPING_ELEMENT: {
                SingleMappingElement singleMappingElement = (SingleMappingElement)theEObject;
                T result = caseSingleMappingElement(singleMappingElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ABSTRACT_MAPPING_METRIC: {
                AbstractMappingMetric abstractMappingMetric = (AbstractMappingMetric)theEObject;
                T result = caseAbstractMappingMetric(abstractMappingMetric);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SCHEDULING_RESULT: {
                SchedulingResult schedulingResult = (SchedulingResult)theEObject;
                T result = caseSchedulingResult(schedulingResult);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.TASK_EXECUTION_INSTANCE: {
                TaskExecutionInstance taskExecutionInstance = (TaskExecutionInstance)theEObject;
                T result = caseTaskExecutionInstance(taskExecutionInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringProperty(StringProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Int Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Int Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntProperty(IntProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Name Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Name Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemNameProperty(SystemNameProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Min Hyp Period Length Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Min Hyp Period Length Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinHypPeriodLengthProperty(MinHypPeriodLengthProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task Switch Delay Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task Switch Delay Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTaskSwitchDelayProperty(TaskSwitchDelayProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Manufacturer Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Manufacturer Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseManufacturerProperty(ManufacturerProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Supply Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Supply Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSupplyProperty(PowerSupplyProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Board Type Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Board Type Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoardTypeProperty(BoardTypeProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Type Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Type Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorTypeProperty(ProcessorTypeProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RAM Capacity Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RAM Capacity Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRAMCapacityProperty(RAMCapacityProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RAM Utilization Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RAM Utilization Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRAMUtilizationProperty(RAMUtilizationProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ROM Capacity Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ROM Capacity Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseROMCapacityProperty(ROMCapacityProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ROM Utilization Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ROM Utilization Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseROMUtilizationProperty(ROMUtilizationProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Core Capacity Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Core Capacity Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCoreCapacityProperty(CoreCapacityProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Core Utilization Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Core Utilization Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCoreUtilizationProperty(CoreUtilizationProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Core Architecture Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Core Architecture Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCoreArchitectureProperty(CoreArchitectureProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Developed By Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Developed By Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDevelopedByProperty(DevelopedByProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Duration Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Duration Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDurationProperty(DurationProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Period Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Period Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePeriodProperty(PeriodProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Early Tolerance Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Early Tolerance Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEarlyToleranceProperty(EarlyToleranceProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Late Tolerance Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Late Tolerance Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLateToleranceProperty(LateToleranceProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Max Start Time Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Max Start Time Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaxStartTimeProperty(MaxStartTimeProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Max End Time Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Max End Time Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaxEndTimeProperty(MaxEndTimeProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Add Init Time Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Add Init Time Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddInitTimeProperty(AddInitTimeProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Slices Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Slices Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSlicesProperty(SlicesProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Min Slice Duration Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Min Slice Duration Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinSliceDurationProperty(MinSliceDurationProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Design Assurance Level Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Design Assurance Level Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDesignAssuranceLevelProperty(DesignAssuranceLevelProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Criticality Level Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Criticality Level Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCriticalityLevelProperty(CriticalityLevelProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Periodicity Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Periodicity Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePeriodicityProperty(PeriodicityProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Color Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Color Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColorProperty(ColorProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assigned Core Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assigned Core Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignedCoreProperty(AssignedCoreProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomProperty(CustomProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom Int Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Int Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomIntProperty(CustomIntProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom String Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom String Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomStringProperty(CustomStringProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assist Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assist Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssistModel(AssistModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hardware Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hardware Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHardwareElement(HardwareElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeature(Feature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompartment(Compartment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Box</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBox(Box object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Board Alternative</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Board Alternative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoardAlternative(BoardAlternative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Board</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoard(Board object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessor(Processor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Core</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCore(Core object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application Alternative</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application Alternative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplicationAlternative(ApplicationAlternative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Software Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Software Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareElement(SoftwareElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplication(Application object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTask(Task object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature Requirement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureRequirement(FeatureRequirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mapping Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mapping Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMappingRelation(MappingRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dislocality Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dislocality Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDislocalityRelation(DislocalityRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Colocality Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Colocality Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColocalityRelation(ColocalityRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dissimilarity Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDissimilarityRelation(DissimilarityRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Clause</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dissimilarity Clause</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDissimilarityClause(DissimilarityClause object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Disjunction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dissimilarity Disjunction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDissimilarityDisjunction(DissimilarityDisjunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Conjunction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dissimilarity Conjunction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDissimilarityConjunction(DissimilarityConjunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dissimilarity Entry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dissimilarity Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDissimilarityEntry(DissimilarityEntry object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduling Restriction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduling Restriction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulingRestriction(SchedulingRestriction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleRelation(SimpleRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplexRelation(ComplexRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction Start At The Same Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction Start At The Same Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestrictionStartAtTheSameTime(RestrictionStartAtTheSameTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction Finish At The Same Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction Finish At The Same Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestrictionFinishAtTheSameTime(RestrictionFinishAtTheSameTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction Start After Other Finished</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction Start After Other Finished</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestrictionStartAfterOtherFinished(RestrictionStartAfterOtherFinished object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction Start After Other Started</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction Start After Other Started</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestrictionStartAfterOtherStarted(RestrictionStartAfterOtherStarted object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction Disjoint Execution</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction Disjoint Execution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestrictionDisjointExecution(RestrictionDisjointExecution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction Alternative</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction Alternative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestrictionAlternative(RestrictionAlternative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exploration Candidate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exploration Candidate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExplorationCandidate(ExplorationCandidate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exploration Result</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exploration Result</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExplorationResult(ExplorationResult object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract DSE Metric</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract DSE Metric</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDSEMetric(AbstractDSEMetric object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComparable(Comparable<MappingResult> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Metric Score Pair</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Metric Score Pair</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetricScorePair(Map.Entry<AbstractMappingMetric, Double> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mapping Result</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mapping Result</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMappingResult(MappingResult object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Single Mapping Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Single Mapping Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleMappingElement(SingleMappingElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Mapping Metric</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Mapping Metric</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractMappingMetric(AbstractMappingMetric object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduling Result</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduling Result</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulingResult(SchedulingResult object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task Execution Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task Execution Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTaskExecutionInstance(TaskExecutionInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ModelSwitch
