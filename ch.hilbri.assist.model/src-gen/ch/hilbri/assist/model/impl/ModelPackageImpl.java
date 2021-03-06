/**
 */
package ch.hilbri.assist.model.impl;

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
import ch.hilbri.assist.model.Color;
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
import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.DevelopedByProperty;
import ch.hilbri.assist.model.DislocalityRelation;
import ch.hilbri.assist.model.DissimilarityAttributes;
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
import ch.hilbri.assist.model.HardwareArchitectureLevelType;
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
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PeriodProperty;
import ch.hilbri.assist.model.PeriodicityProperty;
import ch.hilbri.assist.model.PeriodicityType;
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

import java.lang.Comparable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemNamePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minHypPeriodLengthPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskSwitchDelayPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass manufacturerPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerSupplyPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boardTypePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorTypePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ramCapacityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ramUtilizationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass romCapacityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass romUtilizationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreCapacityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreUtilizationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreArchitecturePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass developedByPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass durationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass periodPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass earlyTolerancePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lateTolerancePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass maxStartTimePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass maxEndTimePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass addInitTimePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass slicesPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minSliceDurationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass designAssuranceLevelPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass criticalityLevelPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass periodicityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colorPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignedCorePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass customPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass customIntPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass customStringPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assistModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hardwareElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass featureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compartmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boxEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boardAlternativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boardEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationAlternativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softwareElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass featureRequirementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappingRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dislocalityRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colocalityRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dissimilarityRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dissimilarityClauseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dissimilarityDisjunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dissimilarityConjunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dissimilarityEntryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schedulingRestrictionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionStartAtTheSameTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionFinishAtTheSameTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionStartAfterOtherFinishedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionStartAfterOtherStartedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionDisjointExecutionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionAlternativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass explorationCandidateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass explorationResultEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDSEMetricEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass comparableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass metricScorePairEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappingResultEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleMappingElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractMappingMetricEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schedulingResultEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskExecutionInstanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dissimilarityAttributesEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum hardwareArchitectureLevelTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum designAssuranceLevelTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum periodicityTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum colorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType listOfTaskListsEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType task2CoreMapTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType stringListEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType task2ExecutionInstancesMapTypeEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see ch.hilbri.assist.model.ModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelPackageImpl() {
        super(eNS_URI, ModelFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelPackage init() {
        if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl ? (ModelPackageImpl)registeredModelPackage : new ModelPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theModelPackage.createPackageContents();

        // Initialize created meta-data
        theModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModelPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
        return theModelPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getProperty__GetStringValue() {
        return propertyEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStringProperty() {
        return stringPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getStringProperty_Value() {
        return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIntProperty() {
        return intPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIntProperty_Value() {
        return (EAttribute)intPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSystemNameProperty() {
        return systemNamePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMinHypPeriodLengthProperty() {
        return minHypPeriodLengthPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTaskSwitchDelayProperty() {
        return taskSwitchDelayPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getManufacturerProperty() {
        return manufacturerPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPowerSupplyProperty() {
        return powerSupplyPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBoardTypeProperty() {
        return boardTypePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessorTypeProperty() {
        return processorTypePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRAMCapacityProperty() {
        return ramCapacityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRAMUtilizationProperty() {
        return ramUtilizationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getROMCapacityProperty() {
        return romCapacityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getROMUtilizationProperty() {
        return romUtilizationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCoreCapacityProperty() {
        return coreCapacityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCoreUtilizationProperty() {
        return coreUtilizationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCoreArchitectureProperty() {
        return coreArchitecturePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDevelopedByProperty() {
        return developedByPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDurationProperty() {
        return durationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPeriodProperty() {
        return periodPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEarlyToleranceProperty() {
        return earlyTolerancePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLateToleranceProperty() {
        return lateTolerancePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMaxStartTimeProperty() {
        return maxStartTimePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMaxEndTimeProperty() {
        return maxEndTimePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAddInitTimeProperty() {
        return addInitTimePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSlicesProperty() {
        return slicesPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMinSliceDurationProperty() {
        return minSliceDurationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDesignAssuranceLevelProperty() {
        return designAssuranceLevelPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDesignAssuranceLevelProperty_Value() {
        return (EAttribute)designAssuranceLevelPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCriticalityLevelProperty() {
        return criticalityLevelPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCriticalityLevelProperty_Value() {
        return (EAttribute)criticalityLevelPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPeriodicityProperty() {
        return periodicityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPeriodicityProperty_Value() {
        return (EAttribute)periodicityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getColorProperty() {
        return colorPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getColorProperty_Value() {
        return (EAttribute)colorPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignedCoreProperty() {
        return assignedCorePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssignedCoreProperty_Value() {
        return (EReference)assignedCorePropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCustomProperty() {
        return customPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCustomProperty_Name() {
        return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCustomIntProperty() {
        return customIntPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCustomIntProperty_Value() {
        return (EAttribute)customIntPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCustomStringProperty() {
        return customStringPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCustomStringProperty_Value() {
        return (EAttribute)customStringPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssistModel() {
        return assistModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_Properties() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_Compartments() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_Applications() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_ApplicationAlternatives() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_DislocalityRelations() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_ColocalityRelations() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_DissimilarityRelations() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_SchedulingRestrictions() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_RestrictionAlternatives() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssistModel_ExplorationCandidates() {
        return (EReference)assistModelEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllCompartments() {
        return assistModelEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllBoxes() {
        return assistModelEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllBoards() {
        return assistModelEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllProcessors() {
        return assistModelEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllCores() {
        return assistModelEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllTasks() {
        return assistModelEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllHardwareElements__HardwareArchitectureLevelType() {
        return assistModelEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllHardwareElements__int() {
        return assistModelEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetAllHardwareElements() {
        return assistModelEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetSystemName() {
        return assistModelEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__SetSystemName__String() {
        return assistModelEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetMinHypPeriodLength() {
        return assistModelEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__SetMinHypPeriodLength__int() {
        return assistModelEClass.getEOperations().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__GetTaskSwitchDelay() {
        return assistModelEClass.getEOperations().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAssistModel__SetTaskSwitchDelay__int() {
        return assistModelEClass.getEOperations().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHardwareElement() {
        return hardwareElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHardwareElement_Name() {
        return (EAttribute)hardwareElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHardwareElement_Properties() {
        return (EReference)hardwareElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHardwareElement_Features() {
        return (EReference)hardwareElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHardwareElement_GetHardwareLevel() {
        return (EAttribute)hardwareElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getHardwareElement__GetManufacturer() {
        return hardwareElementEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getHardwareElement__SetManufacturer__String() {
        return hardwareElementEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getHardwareElement__GetCustomPropertiesWithName__String() {
        return hardwareElementEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getHardwareElement__GetCustomPropertiesWithNameAndValue__String_String() {
        return hardwareElementEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getHardwareElement__GetCustomStringProperty__String() {
        return hardwareElementEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getHardwareElement__GetCustomIntProperty__String() {
        return hardwareElementEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFeature() {
        return featureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeature_Name() {
        return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeature_Units() {
        return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeature_SynchronizedAccess() {
        return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeature_Shared() {
        return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeature_IsExclusive() {
        return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCompartment() {
        return compartmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompartment_Boxes() {
        return (EReference)compartmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCompartment_FullName() {
        return (EAttribute)compartmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompartment__GetAllBoxes() {
        return compartmentEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompartment__GetAllBoards() {
        return compartmentEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompartment__GetAllProcessors() {
        return compartmentEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompartment__GetAllCores() {
        return compartmentEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompartment__GetPowerSupply() {
        return compartmentEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompartment__SetPowerSupply__String() {
        return compartmentEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBox() {
        return boxEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBox_Compartment() {
        return (EReference)boxEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBox_Boards() {
        return (EReference)boxEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBox_BoardAlternatives() {
        return (EReference)boxEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBox_FullName() {
        return (EAttribute)boxEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBox__GetAllBoards() {
        return boxEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBox__GetAllProcessors() {
        return boxEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBox__GetAllCores() {
        return boxEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBoardAlternative() {
        return boardAlternativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoardAlternative_Name() {
        return (EAttribute)boardAlternativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBoardAlternative_Boards() {
        return (EReference)boardAlternativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBoard() {
        return boardEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBoard_Box() {
        return (EReference)boardEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBoard_Processors() {
        return (EReference)boardEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoard_FullName() {
        return (EAttribute)boardEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__ToString() {
        return boardEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__GetAllProcessors() {
        return boardEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__GetAllCores() {
        return boardEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__GetAssuranceLevel() {
        return boardEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__SetAssuranceLevel__DesignAssuranceLevelType() {
        return boardEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__GetPowerSupply() {
        return boardEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__SetPowerSupply__String() {
        return boardEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__GetBoardType() {
        return boardEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__SetBoardType__String() {
        return boardEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__GetRamCapacity() {
        return boardEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__SetRamCapacity__int() {
        return boardEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__GetRomCapacity() {
        return boardEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBoard__SetRomCapacity__int() {
        return boardEClass.getEOperations().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessor() {
        return processorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessor_FullName() {
        return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessor_Board() {
        return (EReference)processorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessor_Cores() {
        return (EReference)processorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getProcessor__GetAllCores() {
        return processorEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getProcessor__GetProcessorType() {
        return processorEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getProcessor__SetProcessorType__String() {
        return processorEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCore() {
        return coreEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCore_FullName() {
        return (EAttribute)coreEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCore_Processor() {
        return (EReference)coreEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCore__GetCoreCapacity() {
        return coreEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCore__SetCoreCapacity__int() {
        return coreEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCore__GetCoreArchitecture() {
        return coreEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCore__SetCoreArchitecture__String() {
        return coreEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicationAlternative() {
        return applicationAlternativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplicationAlternative_Name() {
        return (EAttribute)applicationAlternativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationAlternative_Applications() {
        return (EReference)applicationAlternativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSoftwareElement() {
        return softwareElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSoftwareElement_Name() {
        return (EAttribute)softwareElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSoftwareElement_Properties() {
        return (EReference)softwareElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSoftwareElement__ToString() {
        return softwareElementEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSoftwareElement__GetCustomPropertiesWithName__String() {
        return softwareElementEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSoftwareElement__GetCustomPropertiesWithNameAndValue__String_String() {
        return softwareElementEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSoftwareElement__GetCustomStringProperty__String() {
        return softwareElementEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSoftwareElement__GetCustomIntProperty__String() {
        return softwareElementEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplication() {
        return applicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplication_Tasks() {
        return (EReference)applicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplication_RestrictMappingToHardwareElements() {
        return (EReference)applicationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplication_FullName() {
        return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplication__GetDevelopedBy() {
        return applicationEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplication__SetDevelopedBy__String() {
        return applicationEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplication__GetCriticalityLevel() {
        return applicationEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplication__SetCriticalityLevel__DesignAssuranceLevelType() {
        return applicationEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTask() {
        return taskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTask_Application() {
        return (EReference)taskEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTask_FeatureRequirements() {
        return (EReference)taskEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTask_RestrictMappingToHardwareElements() {
        return (EReference)taskEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTask_FullName() {
        return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetCoreUtilization() {
        return taskEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetCoreUtilization__int() {
        return taskEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetRamUtilization() {
        return taskEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetRamUtilization__int() {
        return taskEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetRomUtilization() {
        return taskEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetRomUtilization__int() {
        return taskEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetDuration() {
        return taskEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetDuration__int() {
        return taskEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetPeriod() {
        return taskEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetPeriod__int() {
        return taskEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetEarlyTolerance() {
        return taskEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetEarlyTolerance__int() {
        return taskEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetLateTolerance() {
        return taskEClass.getEOperations().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetLateTolerance__int() {
        return taskEClass.getEOperations().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetMaxStartTime() {
        return taskEClass.getEOperations().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetMaxStartTime__int() {
        return taskEClass.getEOperations().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetMaxEndTime() {
        return taskEClass.getEOperations().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetMaxEndTime__int() {
        return taskEClass.getEOperations().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetAddInitTime() {
        return taskEClass.getEOperations().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetAddInitTime__int() {
        return taskEClass.getEOperations().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetSlices() {
        return taskEClass.getEOperations().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetSlices__int() {
        return taskEClass.getEOperations().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetMinSliceDuration() {
        return taskEClass.getEOperations().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetMinSliceDuration__int() {
        return taskEClass.getEOperations().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetPeriodicity() {
        return taskEClass.getEOperations().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetPeriodicity__PeriodicityType() {
        return taskEClass.getEOperations().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetColor() {
        return taskEClass.getEOperations().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetColor__Color() {
        return taskEClass.getEOperations().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__GetAssignedCore() {
        return taskEClass.getEOperations().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTask__SetAssignedCore__Core() {
        return taskEClass.getEOperations().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFeatureRequirement() {
        return featureRequirementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeatureRequirement_Name() {
        return (EAttribute)featureRequirementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeatureRequirement_HardwareLevel() {
        return (EAttribute)featureRequirementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeatureRequirement_Units() {
        return (EAttribute)featureRequirementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeatureRequirement_Shared() {
        return (EAttribute)featureRequirementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFeatureRequirement_IsExclusive() {
        return (EAttribute)featureRequirementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMappingRelation() {
        return mappingRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMappingRelation_SoftwareElements() {
        return (EReference)mappingRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingRelation_HardwareLevel() {
        return (EAttribute)mappingRelationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingRelation_AllTasks() {
        return (EAttribute)mappingRelationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingRelation_SoftwareElementNames() {
        return (EAttribute)mappingRelationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDislocalityRelation() {
        return dislocalityRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getColocalityRelation() {
        return colocalityRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDissimilarityRelation() {
        return dissimilarityRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDissimilarityRelation_DissimilarityClause() {
        return (EReference)dissimilarityRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDissimilarityClause() {
        return dissimilarityClauseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDissimilarityDisjunction() {
        return dissimilarityDisjunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDissimilarityDisjunction_DissimilarityClauses() {
        return (EReference)dissimilarityDisjunctionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDissimilarityConjunction() {
        return dissimilarityConjunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDissimilarityConjunction_DissimilarityClauses() {
        return (EReference)dissimilarityConjunctionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDissimilarityEntry() {
        return dissimilarityEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDissimilarityEntry_DissimilarityAttribute() {
        return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDissimilarityEntry_HardwareLevel() {
        return (EAttribute)dissimilarityEntryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSchedulingRestriction() {
        return schedulingRestrictionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSimpleRelation() {
        return simpleRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSimpleRelation_Tasks() {
        return (EReference)simpleRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSimpleRelation_TaskNames() {
        return (EAttribute)simpleRelationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getComplexRelation() {
        return complexRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getComplexRelation_Tasks() {
        return (EReference)complexRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getComplexRelation_OtherTask() {
        return (EReference)complexRelationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getComplexRelation_Delay() {
        return (EAttribute)complexRelationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getComplexRelation_TaskNames() {
        return (EAttribute)complexRelationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRestrictionStartAtTheSameTime() {
        return restrictionStartAtTheSameTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRestrictionFinishAtTheSameTime() {
        return restrictionFinishAtTheSameTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRestrictionStartAfterOtherFinished() {
        return restrictionStartAfterOtherFinishedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRestrictionStartAfterOtherStarted() {
        return restrictionStartAfterOtherStartedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRestrictionDisjointExecution() {
        return restrictionDisjointExecutionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRestrictionAlternative() {
        return restrictionAlternativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRestrictionAlternative_Name() {
        return (EAttribute)restrictionAlternativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRestrictionAlternative_DislocalityRelations() {
        return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRestrictionAlternative_ColocalityRelations() {
        return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRestrictionAlternative_DissimilarityRelations() {
        return (EReference)restrictionAlternativeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExplorationCandidate() {
        return explorationCandidateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExplorationCandidate_Name() {
        return (EAttribute)explorationCandidateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExplorationCandidate_BoardAlternatives() {
        return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExplorationCandidate_ApplicationAlternatives() {
        return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExplorationCandidate_RestrictionAlternatives() {
        return (EReference)explorationCandidateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExplorationResult() {
        return explorationResultEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExplorationResult_Candidate() {
        return (EReference)explorationResultEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExplorationResult_Model() {
        return (EReference)explorationResultEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExplorationResult_MappingResult() {
        return (EReference)explorationResultEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExplorationResult_Feasible() {
        return (EAttribute)explorationResultEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExplorationResult_AbsoluteScore() {
        return (EAttribute)explorationResultEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExplorationResult_ScaledScore() {
        return (EAttribute)explorationResultEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractDSEMetric() {
        return abstractDSEMetricEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDSEMetric_Name() {
        return (EAttribute)abstractDSEMetricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDSEMetric_BuiltIn() {
        return (EAttribute)abstractDSEMetricEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDSEMetric_HigherScoreIsBetter() {
        return (EAttribute)abstractDSEMetricEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAbstractDSEMetric__ComputeAbsoluteScore__ExplorationResult() {
        return abstractDSEMetricEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getComparable() {
        return comparableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMetricScorePair() {
        return metricScorePairEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMetricScorePair_Key() {
        return (EReference)metricScorePairEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMetricScorePair_Value() {
        return (EAttribute)metricScorePairEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMappingResult() {
        return mappingResultEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingResult_Name() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingResult_Index() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingResult_Task2CoreMap() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMappingResult_Model() {
        return (EReference)mappingResultEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMappingResult_MetricAbsoluteScoresMap() {
        return (EReference)mappingResultEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMappingResult_MetricScaledScoresMap() {
        return (EReference)mappingResultEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingResult_PartialSolution() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingResult_AbsoluteTotalScore() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMappingResult_ScaledTotalScore() {
        return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__IsUsed__Core() {
        return mappingResultEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__IsUsed__Processor() {
        return mappingResultEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__IsUsed__Board() {
        return mappingResultEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__IsUsed__Box() {
        return mappingResultEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__IsUsed__Compartment() {
        return mappingResultEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__GetMappedTasksForCore__Core() {
        return mappingResultEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__GetAbsoluteCoreUtilization__Core() {
        return mappingResultEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__GetRelativeCoreUtilization__Core() {
        return mappingResultEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__GetHardwareElementForTask__Task_int() {
        return mappingResultEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__GetMappingElements() {
        return mappingResultEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__CompareTo__MappingResult() {
        return mappingResultEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getMappingResult__ToString() {
        return mappingResultEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSingleMappingElement() {
        return singleMappingElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMappingElement_Application() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMappingElement_Task() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMappingElement_Core() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMappingElement_Processor() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMappingElement_Board() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMappingElement_Box() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMappingElement_Compartment() {
        return (EReference)singleMappingElementEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractMappingMetric() {
        return abstractMappingMetricEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractMappingMetric_Name() {
        return (EAttribute)abstractMappingMetricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractMappingMetric_BuiltIn() {
        return (EAttribute)abstractMappingMetricEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractMappingMetric_HigherScoreIsBetter() {
        return (EAttribute)abstractMappingMetricEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractMappingMetric_Weight() {
        return (EAttribute)abstractMappingMetricEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAbstractMappingMetric__ComputeAbsoluteScore__MappingResult() {
        return abstractMappingMetricEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSchedulingResult() {
        return schedulingResultEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSchedulingResult_Name() {
        return (EAttribute)schedulingResultEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSchedulingResult_HyperPeriodLength() {
        return (EAttribute)schedulingResultEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSchedulingResult_Model() {
        return (EReference)schedulingResultEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSchedulingResult_Schedule() {
        return (EAttribute)schedulingResultEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTaskExecutionInstance() {
        return taskExecutionInstanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTaskExecutionInstance_Begin() {
        return (EAttribute)taskExecutionInstanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTaskExecutionInstance_End() {
        return (EAttribute)taskExecutionInstanceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTaskExecutionInstance__ToString() {
        return taskExecutionInstanceEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getDissimilarityAttributes() {
        return dissimilarityAttributesEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getHardwareArchitectureLevelType() {
        return hardwareArchitectureLevelTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getDesignAssuranceLevelType() {
        return designAssuranceLevelTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPeriodicityType() {
        return periodicityTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getColor() {
        return colorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getListOfTaskLists() {
        return listOfTaskListsEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTask2CoreMapType() {
        return task2CoreMapTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getStringList() {
        return stringListEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTask2ExecutionInstancesMapType() {
        return task2ExecutionInstancesMapTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModelFactory getModelFactory() {
        return (ModelFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        propertyEClass = createEClass(PROPERTY);
        createEOperation(propertyEClass, PROPERTY___GET_STRING_VALUE);

        stringPropertyEClass = createEClass(STRING_PROPERTY);
        createEAttribute(stringPropertyEClass, STRING_PROPERTY__VALUE);

        intPropertyEClass = createEClass(INT_PROPERTY);
        createEAttribute(intPropertyEClass, INT_PROPERTY__VALUE);

        systemNamePropertyEClass = createEClass(SYSTEM_NAME_PROPERTY);

        minHypPeriodLengthPropertyEClass = createEClass(MIN_HYP_PERIOD_LENGTH_PROPERTY);

        taskSwitchDelayPropertyEClass = createEClass(TASK_SWITCH_DELAY_PROPERTY);

        manufacturerPropertyEClass = createEClass(MANUFACTURER_PROPERTY);

        powerSupplyPropertyEClass = createEClass(POWER_SUPPLY_PROPERTY);

        boardTypePropertyEClass = createEClass(BOARD_TYPE_PROPERTY);

        processorTypePropertyEClass = createEClass(PROCESSOR_TYPE_PROPERTY);

        ramCapacityPropertyEClass = createEClass(RAM_CAPACITY_PROPERTY);

        ramUtilizationPropertyEClass = createEClass(RAM_UTILIZATION_PROPERTY);

        romCapacityPropertyEClass = createEClass(ROM_CAPACITY_PROPERTY);

        romUtilizationPropertyEClass = createEClass(ROM_UTILIZATION_PROPERTY);

        coreCapacityPropertyEClass = createEClass(CORE_CAPACITY_PROPERTY);

        coreUtilizationPropertyEClass = createEClass(CORE_UTILIZATION_PROPERTY);

        coreArchitecturePropertyEClass = createEClass(CORE_ARCHITECTURE_PROPERTY);

        developedByPropertyEClass = createEClass(DEVELOPED_BY_PROPERTY);

        durationPropertyEClass = createEClass(DURATION_PROPERTY);

        periodPropertyEClass = createEClass(PERIOD_PROPERTY);

        earlyTolerancePropertyEClass = createEClass(EARLY_TOLERANCE_PROPERTY);

        lateTolerancePropertyEClass = createEClass(LATE_TOLERANCE_PROPERTY);

        maxStartTimePropertyEClass = createEClass(MAX_START_TIME_PROPERTY);

        maxEndTimePropertyEClass = createEClass(MAX_END_TIME_PROPERTY);

        addInitTimePropertyEClass = createEClass(ADD_INIT_TIME_PROPERTY);

        slicesPropertyEClass = createEClass(SLICES_PROPERTY);

        minSliceDurationPropertyEClass = createEClass(MIN_SLICE_DURATION_PROPERTY);

        designAssuranceLevelPropertyEClass = createEClass(DESIGN_ASSURANCE_LEVEL_PROPERTY);
        createEAttribute(designAssuranceLevelPropertyEClass, DESIGN_ASSURANCE_LEVEL_PROPERTY__VALUE);

        criticalityLevelPropertyEClass = createEClass(CRITICALITY_LEVEL_PROPERTY);
        createEAttribute(criticalityLevelPropertyEClass, CRITICALITY_LEVEL_PROPERTY__VALUE);

        periodicityPropertyEClass = createEClass(PERIODICITY_PROPERTY);
        createEAttribute(periodicityPropertyEClass, PERIODICITY_PROPERTY__VALUE);

        colorPropertyEClass = createEClass(COLOR_PROPERTY);
        createEAttribute(colorPropertyEClass, COLOR_PROPERTY__VALUE);

        assignedCorePropertyEClass = createEClass(ASSIGNED_CORE_PROPERTY);
        createEReference(assignedCorePropertyEClass, ASSIGNED_CORE_PROPERTY__VALUE);

        customPropertyEClass = createEClass(CUSTOM_PROPERTY);
        createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__NAME);

        customIntPropertyEClass = createEClass(CUSTOM_INT_PROPERTY);
        createEAttribute(customIntPropertyEClass, CUSTOM_INT_PROPERTY__VALUE);

        customStringPropertyEClass = createEClass(CUSTOM_STRING_PROPERTY);
        createEAttribute(customStringPropertyEClass, CUSTOM_STRING_PROPERTY__VALUE);

        assistModelEClass = createEClass(ASSIST_MODEL);
        createEReference(assistModelEClass, ASSIST_MODEL__PROPERTIES);
        createEReference(assistModelEClass, ASSIST_MODEL__COMPARTMENTS);
        createEReference(assistModelEClass, ASSIST_MODEL__APPLICATIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__APPLICATION_ALTERNATIVES);
        createEReference(assistModelEClass, ASSIST_MODEL__DISLOCALITY_RELATIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__COLOCALITY_RELATIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__DISSIMILARITY_RELATIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__SCHEDULING_RESTRICTIONS);
        createEReference(assistModelEClass, ASSIST_MODEL__RESTRICTION_ALTERNATIVES);
        createEReference(assistModelEClass, ASSIST_MODEL__EXPLORATION_CANDIDATES);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_COMPARTMENTS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_BOXES);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_BOARDS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_PROCESSORS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_CORES);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_TASKS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__HARDWAREARCHITECTURELEVELTYPE);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS__INT);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_ALL_HARDWARE_ELEMENTS);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_SYSTEM_NAME);
        createEOperation(assistModelEClass, ASSIST_MODEL___SET_SYSTEM_NAME__STRING);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_MIN_HYP_PERIOD_LENGTH);
        createEOperation(assistModelEClass, ASSIST_MODEL___SET_MIN_HYP_PERIOD_LENGTH__INT);
        createEOperation(assistModelEClass, ASSIST_MODEL___GET_TASK_SWITCH_DELAY);
        createEOperation(assistModelEClass, ASSIST_MODEL___SET_TASK_SWITCH_DELAY__INT);

        hardwareElementEClass = createEClass(HARDWARE_ELEMENT);
        createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__NAME);
        createEReference(hardwareElementEClass, HARDWARE_ELEMENT__PROPERTIES);
        createEReference(hardwareElementEClass, HARDWARE_ELEMENT__FEATURES);
        createEAttribute(hardwareElementEClass, HARDWARE_ELEMENT__GET_HARDWARE_LEVEL);
        createEOperation(hardwareElementEClass, HARDWARE_ELEMENT___GET_MANUFACTURER);
        createEOperation(hardwareElementEClass, HARDWARE_ELEMENT___SET_MANUFACTURER__STRING);
        createEOperation(hardwareElementEClass, HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING);
        createEOperation(hardwareElementEClass, HARDWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING);
        createEOperation(hardwareElementEClass, HARDWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING);
        createEOperation(hardwareElementEClass, HARDWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING);

        featureEClass = createEClass(FEATURE);
        createEAttribute(featureEClass, FEATURE__NAME);
        createEAttribute(featureEClass, FEATURE__UNITS);
        createEAttribute(featureEClass, FEATURE__SYNCHRONIZED_ACCESS);
        createEAttribute(featureEClass, FEATURE__SHARED);
        createEAttribute(featureEClass, FEATURE__IS_EXCLUSIVE);

        compartmentEClass = createEClass(COMPARTMENT);
        createEReference(compartmentEClass, COMPARTMENT__BOXES);
        createEAttribute(compartmentEClass, COMPARTMENT__FULL_NAME);
        createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_BOXES);
        createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_BOARDS);
        createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_PROCESSORS);
        createEOperation(compartmentEClass, COMPARTMENT___GET_ALL_CORES);
        createEOperation(compartmentEClass, COMPARTMENT___GET_POWER_SUPPLY);
        createEOperation(compartmentEClass, COMPARTMENT___SET_POWER_SUPPLY__STRING);

        boxEClass = createEClass(BOX);
        createEReference(boxEClass, BOX__COMPARTMENT);
        createEReference(boxEClass, BOX__BOARDS);
        createEReference(boxEClass, BOX__BOARD_ALTERNATIVES);
        createEAttribute(boxEClass, BOX__FULL_NAME);
        createEOperation(boxEClass, BOX___GET_ALL_BOARDS);
        createEOperation(boxEClass, BOX___GET_ALL_PROCESSORS);
        createEOperation(boxEClass, BOX___GET_ALL_CORES);

        boardAlternativeEClass = createEClass(BOARD_ALTERNATIVE);
        createEAttribute(boardAlternativeEClass, BOARD_ALTERNATIVE__NAME);
        createEReference(boardAlternativeEClass, BOARD_ALTERNATIVE__BOARDS);

        boardEClass = createEClass(BOARD);
        createEReference(boardEClass, BOARD__BOX);
        createEReference(boardEClass, BOARD__PROCESSORS);
        createEAttribute(boardEClass, BOARD__FULL_NAME);
        createEOperation(boardEClass, BOARD___TO_STRING);
        createEOperation(boardEClass, BOARD___GET_ALL_PROCESSORS);
        createEOperation(boardEClass, BOARD___GET_ALL_CORES);
        createEOperation(boardEClass, BOARD___GET_ASSURANCE_LEVEL);
        createEOperation(boardEClass, BOARD___SET_ASSURANCE_LEVEL__DESIGNASSURANCELEVELTYPE);
        createEOperation(boardEClass, BOARD___GET_POWER_SUPPLY);
        createEOperation(boardEClass, BOARD___SET_POWER_SUPPLY__STRING);
        createEOperation(boardEClass, BOARD___GET_BOARD_TYPE);
        createEOperation(boardEClass, BOARD___SET_BOARD_TYPE__STRING);
        createEOperation(boardEClass, BOARD___GET_RAM_CAPACITY);
        createEOperation(boardEClass, BOARD___SET_RAM_CAPACITY__INT);
        createEOperation(boardEClass, BOARD___GET_ROM_CAPACITY);
        createEOperation(boardEClass, BOARD___SET_ROM_CAPACITY__INT);

        processorEClass = createEClass(PROCESSOR);
        createEAttribute(processorEClass, PROCESSOR__FULL_NAME);
        createEReference(processorEClass, PROCESSOR__BOARD);
        createEReference(processorEClass, PROCESSOR__CORES);
        createEOperation(processorEClass, PROCESSOR___GET_ALL_CORES);
        createEOperation(processorEClass, PROCESSOR___GET_PROCESSOR_TYPE);
        createEOperation(processorEClass, PROCESSOR___SET_PROCESSOR_TYPE__STRING);

        coreEClass = createEClass(CORE);
        createEAttribute(coreEClass, CORE__FULL_NAME);
        createEReference(coreEClass, CORE__PROCESSOR);
        createEOperation(coreEClass, CORE___GET_CORE_CAPACITY);
        createEOperation(coreEClass, CORE___SET_CORE_CAPACITY__INT);
        createEOperation(coreEClass, CORE___GET_CORE_ARCHITECTURE);
        createEOperation(coreEClass, CORE___SET_CORE_ARCHITECTURE__STRING);

        applicationAlternativeEClass = createEClass(APPLICATION_ALTERNATIVE);
        createEAttribute(applicationAlternativeEClass, APPLICATION_ALTERNATIVE__NAME);
        createEReference(applicationAlternativeEClass, APPLICATION_ALTERNATIVE__APPLICATIONS);

        softwareElementEClass = createEClass(SOFTWARE_ELEMENT);
        createEAttribute(softwareElementEClass, SOFTWARE_ELEMENT__NAME);
        createEReference(softwareElementEClass, SOFTWARE_ELEMENT__PROPERTIES);
        createEOperation(softwareElementEClass, SOFTWARE_ELEMENT___TO_STRING);
        createEOperation(softwareElementEClass, SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME__STRING);
        createEOperation(softwareElementEClass, SOFTWARE_ELEMENT___GET_CUSTOM_PROPERTIES_WITH_NAME_AND_VALUE__STRING_STRING);
        createEOperation(softwareElementEClass, SOFTWARE_ELEMENT___GET_CUSTOM_STRING_PROPERTY__STRING);
        createEOperation(softwareElementEClass, SOFTWARE_ELEMENT___GET_CUSTOM_INT_PROPERTY__STRING);

        applicationEClass = createEClass(APPLICATION);
        createEReference(applicationEClass, APPLICATION__TASKS);
        createEReference(applicationEClass, APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
        createEAttribute(applicationEClass, APPLICATION__FULL_NAME);
        createEOperation(applicationEClass, APPLICATION___GET_DEVELOPED_BY);
        createEOperation(applicationEClass, APPLICATION___SET_DEVELOPED_BY__STRING);
        createEOperation(applicationEClass, APPLICATION___GET_CRITICALITY_LEVEL);
        createEOperation(applicationEClass, APPLICATION___SET_CRITICALITY_LEVEL__DESIGNASSURANCELEVELTYPE);

        taskEClass = createEClass(TASK);
        createEReference(taskEClass, TASK__APPLICATION);
        createEReference(taskEClass, TASK__FEATURE_REQUIREMENTS);
        createEReference(taskEClass, TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
        createEAttribute(taskEClass, TASK__FULL_NAME);
        createEOperation(taskEClass, TASK___GET_CORE_UTILIZATION);
        createEOperation(taskEClass, TASK___SET_CORE_UTILIZATION__INT);
        createEOperation(taskEClass, TASK___GET_RAM_UTILIZATION);
        createEOperation(taskEClass, TASK___SET_RAM_UTILIZATION__INT);
        createEOperation(taskEClass, TASK___GET_ROM_UTILIZATION);
        createEOperation(taskEClass, TASK___SET_ROM_UTILIZATION__INT);
        createEOperation(taskEClass, TASK___GET_DURATION);
        createEOperation(taskEClass, TASK___SET_DURATION__INT);
        createEOperation(taskEClass, TASK___GET_PERIOD);
        createEOperation(taskEClass, TASK___SET_PERIOD__INT);
        createEOperation(taskEClass, TASK___GET_EARLY_TOLERANCE);
        createEOperation(taskEClass, TASK___SET_EARLY_TOLERANCE__INT);
        createEOperation(taskEClass, TASK___GET_LATE_TOLERANCE);
        createEOperation(taskEClass, TASK___SET_LATE_TOLERANCE__INT);
        createEOperation(taskEClass, TASK___GET_MAX_START_TIME);
        createEOperation(taskEClass, TASK___SET_MAX_START_TIME__INT);
        createEOperation(taskEClass, TASK___GET_MAX_END_TIME);
        createEOperation(taskEClass, TASK___SET_MAX_END_TIME__INT);
        createEOperation(taskEClass, TASK___GET_ADD_INIT_TIME);
        createEOperation(taskEClass, TASK___SET_ADD_INIT_TIME__INT);
        createEOperation(taskEClass, TASK___GET_SLICES);
        createEOperation(taskEClass, TASK___SET_SLICES__INT);
        createEOperation(taskEClass, TASK___GET_MIN_SLICE_DURATION);
        createEOperation(taskEClass, TASK___SET_MIN_SLICE_DURATION__INT);
        createEOperation(taskEClass, TASK___GET_PERIODICITY);
        createEOperation(taskEClass, TASK___SET_PERIODICITY__PERIODICITYTYPE);
        createEOperation(taskEClass, TASK___GET_COLOR);
        createEOperation(taskEClass, TASK___SET_COLOR__COLOR);
        createEOperation(taskEClass, TASK___GET_ASSIGNED_CORE);
        createEOperation(taskEClass, TASK___SET_ASSIGNED_CORE__CORE);

        featureRequirementEClass = createEClass(FEATURE_REQUIREMENT);
        createEAttribute(featureRequirementEClass, FEATURE_REQUIREMENT__NAME);
        createEAttribute(featureRequirementEClass, FEATURE_REQUIREMENT__HARDWARE_LEVEL);
        createEAttribute(featureRequirementEClass, FEATURE_REQUIREMENT__UNITS);
        createEAttribute(featureRequirementEClass, FEATURE_REQUIREMENT__SHARED);
        createEAttribute(featureRequirementEClass, FEATURE_REQUIREMENT__IS_EXCLUSIVE);

        mappingRelationEClass = createEClass(MAPPING_RELATION);
        createEReference(mappingRelationEClass, MAPPING_RELATION__SOFTWARE_ELEMENTS);
        createEAttribute(mappingRelationEClass, MAPPING_RELATION__HARDWARE_LEVEL);
        createEAttribute(mappingRelationEClass, MAPPING_RELATION__ALL_TASKS);
        createEAttribute(mappingRelationEClass, MAPPING_RELATION__SOFTWARE_ELEMENT_NAMES);

        dislocalityRelationEClass = createEClass(DISLOCALITY_RELATION);

        colocalityRelationEClass = createEClass(COLOCALITY_RELATION);

        dissimilarityRelationEClass = createEClass(DISSIMILARITY_RELATION);
        createEReference(dissimilarityRelationEClass, DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE);

        dissimilarityClauseEClass = createEClass(DISSIMILARITY_CLAUSE);

        dissimilarityDisjunctionEClass = createEClass(DISSIMILARITY_DISJUNCTION);
        createEReference(dissimilarityDisjunctionEClass, DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES);

        dissimilarityConjunctionEClass = createEClass(DISSIMILARITY_CONJUNCTION);
        createEReference(dissimilarityConjunctionEClass, DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES);

        dissimilarityEntryEClass = createEClass(DISSIMILARITY_ENTRY);
        createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__DISSIMILARITY_ATTRIBUTE);
        createEAttribute(dissimilarityEntryEClass, DISSIMILARITY_ENTRY__HARDWARE_LEVEL);

        schedulingRestrictionEClass = createEClass(SCHEDULING_RESTRICTION);

        simpleRelationEClass = createEClass(SIMPLE_RELATION);
        createEReference(simpleRelationEClass, SIMPLE_RELATION__TASKS);
        createEAttribute(simpleRelationEClass, SIMPLE_RELATION__TASK_NAMES);

        complexRelationEClass = createEClass(COMPLEX_RELATION);
        createEReference(complexRelationEClass, COMPLEX_RELATION__TASKS);
        createEReference(complexRelationEClass, COMPLEX_RELATION__OTHER_TASK);
        createEAttribute(complexRelationEClass, COMPLEX_RELATION__DELAY);
        createEAttribute(complexRelationEClass, COMPLEX_RELATION__TASK_NAMES);

        restrictionStartAtTheSameTimeEClass = createEClass(RESTRICTION_START_AT_THE_SAME_TIME);

        restrictionFinishAtTheSameTimeEClass = createEClass(RESTRICTION_FINISH_AT_THE_SAME_TIME);

        restrictionStartAfterOtherFinishedEClass = createEClass(RESTRICTION_START_AFTER_OTHER_FINISHED);

        restrictionStartAfterOtherStartedEClass = createEClass(RESTRICTION_START_AFTER_OTHER_STARTED);

        restrictionDisjointExecutionEClass = createEClass(RESTRICTION_DISJOINT_EXECUTION);

        restrictionAlternativeEClass = createEClass(RESTRICTION_ALTERNATIVE);
        createEAttribute(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__NAME);
        createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__DISLOCALITY_RELATIONS);
        createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__COLOCALITY_RELATIONS);
        createEReference(restrictionAlternativeEClass, RESTRICTION_ALTERNATIVE__DISSIMILARITY_RELATIONS);

        explorationCandidateEClass = createEClass(EXPLORATION_CANDIDATE);
        createEAttribute(explorationCandidateEClass, EXPLORATION_CANDIDATE__NAME);
        createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES);
        createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__APPLICATION_ALTERNATIVES);
        createEReference(explorationCandidateEClass, EXPLORATION_CANDIDATE__RESTRICTION_ALTERNATIVES);

        explorationResultEClass = createEClass(EXPLORATION_RESULT);
        createEReference(explorationResultEClass, EXPLORATION_RESULT__CANDIDATE);
        createEReference(explorationResultEClass, EXPLORATION_RESULT__MODEL);
        createEReference(explorationResultEClass, EXPLORATION_RESULT__MAPPING_RESULT);
        createEAttribute(explorationResultEClass, EXPLORATION_RESULT__FEASIBLE);
        createEAttribute(explorationResultEClass, EXPLORATION_RESULT__ABSOLUTE_SCORE);
        createEAttribute(explorationResultEClass, EXPLORATION_RESULT__SCALED_SCORE);

        abstractDSEMetricEClass = createEClass(ABSTRACT_DSE_METRIC);
        createEAttribute(abstractDSEMetricEClass, ABSTRACT_DSE_METRIC__NAME);
        createEAttribute(abstractDSEMetricEClass, ABSTRACT_DSE_METRIC__BUILT_IN);
        createEAttribute(abstractDSEMetricEClass, ABSTRACT_DSE_METRIC__HIGHER_SCORE_IS_BETTER);
        createEOperation(abstractDSEMetricEClass, ABSTRACT_DSE_METRIC___COMPUTE_ABSOLUTE_SCORE__EXPLORATIONRESULT);

        comparableEClass = createEClass(COMPARABLE);

        metricScorePairEClass = createEClass(METRIC_SCORE_PAIR);
        createEReference(metricScorePairEClass, METRIC_SCORE_PAIR__KEY);
        createEAttribute(metricScorePairEClass, METRIC_SCORE_PAIR__VALUE);

        mappingResultEClass = createEClass(MAPPING_RESULT);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__NAME);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__INDEX);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__TASK2_CORE_MAP);
        createEReference(mappingResultEClass, MAPPING_RESULT__MODEL);
        createEReference(mappingResultEClass, MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP);
        createEReference(mappingResultEClass, MAPPING_RESULT__METRIC_SCALED_SCORES_MAP);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__PARTIAL_SOLUTION);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE);
        createEAttribute(mappingResultEClass, MAPPING_RESULT__SCALED_TOTAL_SCORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___IS_USED__CORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___IS_USED__PROCESSOR);
        createEOperation(mappingResultEClass, MAPPING_RESULT___IS_USED__BOARD);
        createEOperation(mappingResultEClass, MAPPING_RESULT___IS_USED__BOX);
        createEOperation(mappingResultEClass, MAPPING_RESULT___IS_USED__COMPARTMENT);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__TASK_INT);
        createEOperation(mappingResultEClass, MAPPING_RESULT___GET_MAPPING_ELEMENTS);
        createEOperation(mappingResultEClass, MAPPING_RESULT___COMPARE_TO__MAPPINGRESULT);
        createEOperation(mappingResultEClass, MAPPING_RESULT___TO_STRING);

        singleMappingElementEClass = createEClass(SINGLE_MAPPING_ELEMENT);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__APPLICATION);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__TASK);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__CORE);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__PROCESSOR);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__BOARD);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__BOX);
        createEReference(singleMappingElementEClass, SINGLE_MAPPING_ELEMENT__COMPARTMENT);

        abstractMappingMetricEClass = createEClass(ABSTRACT_MAPPING_METRIC);
        createEAttribute(abstractMappingMetricEClass, ABSTRACT_MAPPING_METRIC__NAME);
        createEAttribute(abstractMappingMetricEClass, ABSTRACT_MAPPING_METRIC__BUILT_IN);
        createEAttribute(abstractMappingMetricEClass, ABSTRACT_MAPPING_METRIC__HIGHER_SCORE_IS_BETTER);
        createEAttribute(abstractMappingMetricEClass, ABSTRACT_MAPPING_METRIC__WEIGHT);
        createEOperation(abstractMappingMetricEClass, ABSTRACT_MAPPING_METRIC___COMPUTE_ABSOLUTE_SCORE__MAPPINGRESULT);

        schedulingResultEClass = createEClass(SCHEDULING_RESULT);
        createEAttribute(schedulingResultEClass, SCHEDULING_RESULT__NAME);
        createEAttribute(schedulingResultEClass, SCHEDULING_RESULT__HYPER_PERIOD_LENGTH);
        createEReference(schedulingResultEClass, SCHEDULING_RESULT__MODEL);
        createEAttribute(schedulingResultEClass, SCHEDULING_RESULT__SCHEDULE);

        taskExecutionInstanceEClass = createEClass(TASK_EXECUTION_INSTANCE);
        createEAttribute(taskExecutionInstanceEClass, TASK_EXECUTION_INSTANCE__BEGIN);
        createEAttribute(taskExecutionInstanceEClass, TASK_EXECUTION_INSTANCE__END);
        createEOperation(taskExecutionInstanceEClass, TASK_EXECUTION_INSTANCE___TO_STRING);

        // Create enums
        dissimilarityAttributesEEnum = createEEnum(DISSIMILARITY_ATTRIBUTES);
        hardwareArchitectureLevelTypeEEnum = createEEnum(HARDWARE_ARCHITECTURE_LEVEL_TYPE);
        designAssuranceLevelTypeEEnum = createEEnum(DESIGN_ASSURANCE_LEVEL_TYPE);
        periodicityTypeEEnum = createEEnum(PERIODICITY_TYPE);
        colorEEnum = createEEnum(COLOR);

        // Create data types
        listOfTaskListsEDataType = createEDataType(LIST_OF_TASK_LISTS);
        task2CoreMapTypeEDataType = createEDataType(TASK2_CORE_MAP_TYPE);
        stringListEDataType = createEDataType(STRING_LIST);
        task2ExecutionInstancesMapTypeEDataType = createEDataType(TASK2_EXECUTION_INSTANCES_MAP_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        stringPropertyEClass.getESuperTypes().add(this.getProperty());
        intPropertyEClass.getESuperTypes().add(this.getProperty());
        systemNamePropertyEClass.getESuperTypes().add(this.getStringProperty());
        minHypPeriodLengthPropertyEClass.getESuperTypes().add(this.getIntProperty());
        taskSwitchDelayPropertyEClass.getESuperTypes().add(this.getIntProperty());
        manufacturerPropertyEClass.getESuperTypes().add(this.getStringProperty());
        powerSupplyPropertyEClass.getESuperTypes().add(this.getStringProperty());
        boardTypePropertyEClass.getESuperTypes().add(this.getStringProperty());
        processorTypePropertyEClass.getESuperTypes().add(this.getStringProperty());
        ramCapacityPropertyEClass.getESuperTypes().add(this.getIntProperty());
        ramUtilizationPropertyEClass.getESuperTypes().add(this.getIntProperty());
        romCapacityPropertyEClass.getESuperTypes().add(this.getIntProperty());
        romUtilizationPropertyEClass.getESuperTypes().add(this.getIntProperty());
        coreCapacityPropertyEClass.getESuperTypes().add(this.getIntProperty());
        coreUtilizationPropertyEClass.getESuperTypes().add(this.getIntProperty());
        coreArchitecturePropertyEClass.getESuperTypes().add(this.getStringProperty());
        developedByPropertyEClass.getESuperTypes().add(this.getStringProperty());
        durationPropertyEClass.getESuperTypes().add(this.getIntProperty());
        periodPropertyEClass.getESuperTypes().add(this.getIntProperty());
        earlyTolerancePropertyEClass.getESuperTypes().add(this.getIntProperty());
        lateTolerancePropertyEClass.getESuperTypes().add(this.getIntProperty());
        maxStartTimePropertyEClass.getESuperTypes().add(this.getIntProperty());
        maxEndTimePropertyEClass.getESuperTypes().add(this.getIntProperty());
        addInitTimePropertyEClass.getESuperTypes().add(this.getIntProperty());
        slicesPropertyEClass.getESuperTypes().add(this.getIntProperty());
        minSliceDurationPropertyEClass.getESuperTypes().add(this.getIntProperty());
        designAssuranceLevelPropertyEClass.getESuperTypes().add(this.getProperty());
        criticalityLevelPropertyEClass.getESuperTypes().add(this.getProperty());
        periodicityPropertyEClass.getESuperTypes().add(this.getProperty());
        colorPropertyEClass.getESuperTypes().add(this.getProperty());
        assignedCorePropertyEClass.getESuperTypes().add(this.getProperty());
        customPropertyEClass.getESuperTypes().add(this.getProperty());
        customIntPropertyEClass.getESuperTypes().add(this.getCustomProperty());
        customStringPropertyEClass.getESuperTypes().add(this.getCustomProperty());
        compartmentEClass.getESuperTypes().add(this.getHardwareElement());
        boxEClass.getESuperTypes().add(this.getHardwareElement());
        boardEClass.getESuperTypes().add(this.getHardwareElement());
        processorEClass.getESuperTypes().add(this.getHardwareElement());
        coreEClass.getESuperTypes().add(this.getHardwareElement());
        applicationEClass.getESuperTypes().add(this.getSoftwareElement());
        taskEClass.getESuperTypes().add(this.getSoftwareElement());
        dislocalityRelationEClass.getESuperTypes().add(this.getMappingRelation());
        colocalityRelationEClass.getESuperTypes().add(this.getMappingRelation());
        dissimilarityRelationEClass.getESuperTypes().add(this.getMappingRelation());
        dissimilarityDisjunctionEClass.getESuperTypes().add(this.getDissimilarityClause());
        dissimilarityConjunctionEClass.getESuperTypes().add(this.getDissimilarityClause());
        dissimilarityEntryEClass.getESuperTypes().add(this.getDissimilarityClause());
        simpleRelationEClass.getESuperTypes().add(this.getSchedulingRestriction());
        complexRelationEClass.getESuperTypes().add(this.getSchedulingRestriction());
        restrictionStartAtTheSameTimeEClass.getESuperTypes().add(this.getSimpleRelation());
        restrictionFinishAtTheSameTimeEClass.getESuperTypes().add(this.getSimpleRelation());
        restrictionStartAfterOtherFinishedEClass.getESuperTypes().add(this.getComplexRelation());
        restrictionStartAfterOtherStartedEClass.getESuperTypes().add(this.getComplexRelation());
        restrictionDisjointExecutionEClass.getESuperTypes().add(this.getSimpleRelation());
        mappingResultEClass.getESuperTypes().add(this.getComparable());

        // Initialize classes, features, and operations; add parameters
        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getProperty__GetStringValue(), theEcorePackage.getEString(), "getStringValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringProperty_Value(), theEcorePackage.getEString(), "value", "", 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intPropertyEClass, IntProperty.class, "IntProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntProperty_Value(), theEcorePackage.getEInt(), "value", "0", 0, 1, IntProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemNamePropertyEClass, SystemNameProperty.class, "SystemNameProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(minHypPeriodLengthPropertyEClass, MinHypPeriodLengthProperty.class, "MinHypPeriodLengthProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(taskSwitchDelayPropertyEClass, TaskSwitchDelayProperty.class, "TaskSwitchDelayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(manufacturerPropertyEClass, ManufacturerProperty.class, "ManufacturerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(powerSupplyPropertyEClass, PowerSupplyProperty.class, "PowerSupplyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(boardTypePropertyEClass, BoardTypeProperty.class, "BoardTypeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorTypePropertyEClass, ProcessorTypeProperty.class, "ProcessorTypeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ramCapacityPropertyEClass, RAMCapacityProperty.class, "RAMCapacityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ramUtilizationPropertyEClass, RAMUtilizationProperty.class, "RAMUtilizationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(romCapacityPropertyEClass, ROMCapacityProperty.class, "ROMCapacityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(romUtilizationPropertyEClass, ROMUtilizationProperty.class, "ROMUtilizationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreCapacityPropertyEClass, CoreCapacityProperty.class, "CoreCapacityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreUtilizationPropertyEClass, CoreUtilizationProperty.class, "CoreUtilizationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreArchitecturePropertyEClass, CoreArchitectureProperty.class, "CoreArchitectureProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(developedByPropertyEClass, DevelopedByProperty.class, "DevelopedByProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(durationPropertyEClass, DurationProperty.class, "DurationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(periodPropertyEClass, PeriodProperty.class, "PeriodProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(earlyTolerancePropertyEClass, EarlyToleranceProperty.class, "EarlyToleranceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lateTolerancePropertyEClass, LateToleranceProperty.class, "LateToleranceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(maxStartTimePropertyEClass, MaxStartTimeProperty.class, "MaxStartTimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(maxEndTimePropertyEClass, MaxEndTimeProperty.class, "MaxEndTimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(addInitTimePropertyEClass, AddInitTimeProperty.class, "AddInitTimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(slicesPropertyEClass, SlicesProperty.class, "SlicesProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(minSliceDurationPropertyEClass, MinSliceDurationProperty.class, "MinSliceDurationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(designAssuranceLevelPropertyEClass, DesignAssuranceLevelProperty.class, "DesignAssuranceLevelProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDesignAssuranceLevelProperty_Value(), this.getDesignAssuranceLevelType(), "value", "None", 0, 1, DesignAssuranceLevelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(criticalityLevelPropertyEClass, CriticalityLevelProperty.class, "CriticalityLevelProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCriticalityLevelProperty_Value(), this.getDesignAssuranceLevelType(), "value", "None", 0, 1, CriticalityLevelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(periodicityPropertyEClass, PeriodicityProperty.class, "PeriodicityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPeriodicityProperty_Value(), this.getPeriodicityType(), "value", "strict", 0, 1, PeriodicityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(colorPropertyEClass, ColorProperty.class, "ColorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getColorProperty_Value(), this.getColor(), "value", "none", 0, 1, ColorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignedCorePropertyEClass, AssignedCoreProperty.class, "AssignedCoreProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignedCoreProperty_Value(), this.getCore(), null, "value", null, 0, 1, AssignedCoreProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customPropertyEClass, CustomProperty.class, "CustomProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCustomProperty_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customIntPropertyEClass, CustomIntProperty.class, "CustomIntProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCustomIntProperty_Value(), theEcorePackage.getEInt(), "value", "0", 0, 1, CustomIntProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customStringPropertyEClass, CustomStringProperty.class, "CustomStringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCustomStringProperty_Value(), theEcorePackage.getEString(), "value", "", 0, 1, CustomStringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assistModelEClass, AssistModel.class, "AssistModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssistModel_Properties(), this.getProperty(), null, "properties", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_Compartments(), this.getCompartment(), null, "compartments", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_Applications(), this.getApplication(), null, "applications", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_ApplicationAlternatives(), this.getApplicationAlternative(), null, "applicationAlternatives", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_DislocalityRelations(), this.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_ColocalityRelations(), this.getColocalityRelation(), null, "colocalityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_DissimilarityRelations(), this.getDissimilarityRelation(), null, "dissimilarityRelations", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_SchedulingRestrictions(), this.getSchedulingRestriction(), null, "schedulingRestrictions", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_RestrictionAlternatives(), this.getRestrictionAlternative(), null, "restrictionAlternatives", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssistModel_ExplorationCandidates(), this.getExplorationCandidate(), null, "explorationCandidates", null, 0, -1, AssistModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getAssistModel__GetAllCompartments(), this.getCompartment(), "getAllCompartments", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllBoxes(), this.getBox(), "getAllBoxes", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllTasks(), this.getTask(), "getAllTasks", 0, -1, !IS_UNIQUE, IS_ORDERED);

        EOperation op = initEOperation(getAssistModel__GetAllHardwareElements__HardwareArchitectureLevelType(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getHardwareArchitectureLevelType(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getAssistModel__GetAllHardwareElements__int(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetAllHardwareElements(), this.getHardwareElement(), "getAllHardwareElements", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetSystemName(), theEcorePackage.getEString(), "getSystemName", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getAssistModel__SetSystemName__String(), null, "setSystemName", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetMinHypPeriodLength(), theEcorePackage.getEInt(), "getMinHypPeriodLength", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getAssistModel__SetMinHypPeriodLength__int(), null, "setMinHypPeriodLength", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getAssistModel__GetTaskSwitchDelay(), theEcorePackage.getEInt(), "getTaskSwitchDelay", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getAssistModel__SetTaskSwitchDelay__int(), null, "setTaskSwitchDelay", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(hardwareElementEClass, HardwareElement.class, "HardwareElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHardwareElement_Name(), theEcorePackage.getEString(), "name", "", 0, 1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getHardwareElement_Properties(), this.getProperty(), null, "properties", null, 0, -1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getHardwareElement_Features(), this.getFeature(), null, "features", null, 0, -1, HardwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHardwareElement_GetHardwareLevel(), this.getHardwareArchitectureLevelType(), "getHardwareLevel", null, 0, 1, HardwareElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getHardwareElement__GetManufacturer(), theEcorePackage.getEString(), "getManufacturer", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getHardwareElement__SetManufacturer__String(), null, "setManufacturer", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getHardwareElement__GetCustomPropertiesWithName__String(), this.getCustomProperty(), "getCustomPropertiesWithName", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getHardwareElement__GetCustomPropertiesWithNameAndValue__String_String(), this.getCustomProperty(), "getCustomPropertiesWithNameAndValue", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getHardwareElement__GetCustomStringProperty__String(), theEcorePackage.getEString(), "getCustomStringProperty", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getHardwareElement__GetCustomIntProperty__String(), theEcorePackage.getEInt(), "getCustomIntProperty", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFeature_Name(), theEcorePackage.getEString(), "name", "", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeature_Units(), theEcorePackage.getEInt(), "units", "-1", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeature_SynchronizedAccess(), theEcorePackage.getEBoolean(), "synchronizedAccess", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeature_Shared(), theEcorePackage.getEBoolean(), "shared", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeature_IsExclusive(), theEcorePackage.getEBoolean(), "isExclusive", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(compartmentEClass, Compartment.class, "Compartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompartment_Boxes(), this.getBox(), this.getBox_Compartment(), "boxes", null, 1, -1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCompartment_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Compartment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getCompartment__GetAllBoxes(), this.getBox(), "getAllBoxes", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompartment__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompartment__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompartment__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompartment__GetPowerSupply(), theEcorePackage.getEString(), "getPowerSupply", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCompartment__SetPowerSupply__String(), null, "setPowerSupply", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBox_Compartment(), this.getCompartment(), this.getCompartment_Boxes(), "compartment", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBox_Boards(), this.getBoard(), this.getBoard_Box(), "boards", null, 0, -1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBox_BoardAlternatives(), this.getBoardAlternative(), null, "boardAlternatives", null, 0, -1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBox_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Box.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getBox__GetAllBoards(), this.getBoard(), "getAllBoards", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBox__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBox__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEClass(boardAlternativeEClass, BoardAlternative.class, "BoardAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBoardAlternative_Name(), theEcorePackage.getEString(), "name", "", 0, 1, BoardAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBoardAlternative_Boards(), this.getBoard(), null, "boards", null, 0, -1, BoardAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBoard_Box(), this.getBox(), this.getBox_Boards(), "box", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBoard_Processors(), this.getProcessor(), this.getProcessor_Board(), "processors", null, 1, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBoard_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Board.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getBoard__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBoard__GetAllProcessors(), this.getProcessor(), "getAllProcessors", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBoard__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBoard__GetAssuranceLevel(), this.getDesignAssuranceLevelType(), "getAssuranceLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getBoard__SetAssuranceLevel__DesignAssuranceLevelType(), null, "setAssuranceLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getDesignAssuranceLevelType(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBoard__GetPowerSupply(), theEcorePackage.getEString(), "getPowerSupply", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getBoard__SetPowerSupply__String(), null, "setPowerSupply", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBoard__GetBoardType(), theEcorePackage.getEString(), "getBoardType", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getBoard__SetBoardType__String(), null, "setBoardType", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBoard__GetRamCapacity(), theEcorePackage.getEInt(), "getRamCapacity", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getBoard__SetRamCapacity__int(), null, "setRamCapacity", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getBoard__GetRomCapacity(), theEcorePackage.getEInt(), "getRomCapacity", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getBoard__SetRomCapacity__int(), null, "setRomCapacity", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessor_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Processor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getProcessor_Board(), this.getBoard(), this.getBoard_Processors(), "board", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessor_Cores(), this.getCore(), this.getCore_Processor(), "cores", null, 1, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getProcessor__GetAllCores(), this.getCore(), "getAllCores", 0, -1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getProcessor__GetProcessorType(), theEcorePackage.getEString(), "getProcessorType", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getProcessor__SetProcessorType__String(), null, "setProcessorType", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCore_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Core.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCore_Processor(), this.getProcessor(), this.getProcessor_Cores(), "processor", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getCore__GetCoreCapacity(), theEcorePackage.getEInt(), "getCoreCapacity", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCore__SetCoreCapacity__int(), null, "setCoreCapacity", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getCore__GetCoreArchitecture(), theEcorePackage.getEString(), "getCoreArchitecture", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCore__SetCoreArchitecture__String(), null, "setCoreArchitecture", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(applicationAlternativeEClass, ApplicationAlternative.class, "ApplicationAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getApplicationAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ApplicationAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplicationAlternative_Applications(), this.getApplication(), null, "applications", null, 0, -1, ApplicationAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(softwareElementEClass, SoftwareElement.class, "SoftwareElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSoftwareElement_Name(), theEcorePackage.getEString(), "name", "", 0, 1, SoftwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSoftwareElement_Properties(), this.getProperty(), null, "properties", null, 0, -1, SoftwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getSoftwareElement__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSoftwareElement__GetCustomPropertiesWithName__String(), this.getCustomProperty(), "getCustomPropertiesWithName", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSoftwareElement__GetCustomPropertiesWithNameAndValue__String_String(), this.getCustomProperty(), "getCustomPropertiesWithNameAndValue", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSoftwareElement__GetCustomStringProperty__String(), theEcorePackage.getEString(), "getCustomStringProperty", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSoftwareElement__GetCustomIntProperty__String(), theEcorePackage.getEInt(), "getCustomIntProperty", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getApplication_Tasks(), this.getTask(), this.getTask_Application(), "tasks", null, 1, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplication_RestrictMappingToHardwareElements(), this.getHardwareElement(), null, "restrictMappingToHardwareElements", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApplication_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Application.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getApplication__GetDevelopedBy(), theEcorePackage.getEString(), "getDevelopedBy", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getApplication__SetDevelopedBy__String(), null, "setDevelopedBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEString(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getApplication__GetCriticalityLevel(), this.getDesignAssuranceLevelType(), "getCriticalityLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getApplication__SetCriticalityLevel__DesignAssuranceLevelType(), null, "setCriticalityLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getDesignAssuranceLevelType(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTask_Application(), this.getApplication(), this.getApplication_Tasks(), "application", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_FeatureRequirements(), this.getFeatureRequirement(), null, "featureRequirements", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_RestrictMappingToHardwareElements(), this.getHardwareElement(), null, "restrictMappingToHardwareElements", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTask_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, Task.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getTask__GetCoreUtilization(), theEcorePackage.getEInt(), "getCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetCoreUtilization__int(), null, "setCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetRamUtilization(), theEcorePackage.getEInt(), "getRamUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetRamUtilization__int(), null, "setRamUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetRomUtilization(), theEcorePackage.getEInt(), "getRomUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetRomUtilization__int(), null, "setRomUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetDuration(), theEcorePackage.getEInt(), "getDuration", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetDuration__int(), null, "setDuration", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetPeriod(), theEcorePackage.getEInt(), "getPeriod", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetPeriod__int(), null, "setPeriod", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetEarlyTolerance(), theEcorePackage.getEInt(), "getEarlyTolerance", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetEarlyTolerance__int(), null, "setEarlyTolerance", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetLateTolerance(), theEcorePackage.getEInt(), "getLateTolerance", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetLateTolerance__int(), null, "setLateTolerance", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetMaxStartTime(), theEcorePackage.getEInt(), "getMaxStartTime", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetMaxStartTime__int(), null, "setMaxStartTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetMaxEndTime(), theEcorePackage.getEInt(), "getMaxEndTime", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetMaxEndTime__int(), null, "setMaxEndTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetAddInitTime(), theEcorePackage.getEInt(), "getAddInitTime", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetAddInitTime__int(), null, "setAddInitTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetSlices(), theEcorePackage.getEInt(), "getSlices", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetSlices__int(), null, "setSlices", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetMinSliceDuration(), theEcorePackage.getEInt(), "getMinSliceDuration", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetMinSliceDuration__int(), null, "setMinSliceDuration", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetPeriodicity(), this.getPeriodicityType(), "getPeriodicity", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetPeriodicity__PeriodicityType(), null, "setPeriodicity", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getPeriodicityType(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetColor(), this.getColor(), "getColor", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetColor__Color(), null, "setColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getColor(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getTask__GetAssignedCore(), this.getCore(), "getAssignedCore", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTask__SetAssignedCore__Core(), null, "setAssignedCore", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(featureRequirementEClass, FeatureRequirement.class, "FeatureRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFeatureRequirement_Name(), theEcorePackage.getEString(), "name", "", 0, 1, FeatureRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeatureRequirement_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, FeatureRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeatureRequirement_Units(), theEcorePackage.getEInt(), "units", "-1", 0, 1, FeatureRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeatureRequirement_Shared(), theEcorePackage.getEBoolean(), "shared", "false", 0, 1, FeatureRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeatureRequirement_IsExclusive(), theEcorePackage.getEBoolean(), "isExclusive", null, 0, 1, FeatureRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(mappingRelationEClass, MappingRelation.class, "MappingRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMappingRelation_SoftwareElements(), this.getSoftwareElement(), null, "softwareElements", null, 0, -1, MappingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingRelation_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, MappingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingRelation_AllTasks(), this.getListOfTaskLists(), "allTasks", null, 0, 1, MappingRelation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingRelation_SoftwareElementNames(), theEcorePackage.getEString(), "softwareElementNames", null, 0, 1, MappingRelation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(dislocalityRelationEClass, DislocalityRelation.class, "DislocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(colocalityRelationEClass, ColocalityRelation.class, "ColocalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dissimilarityRelationEClass, DissimilarityRelation.class, "DissimilarityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDissimilarityRelation_DissimilarityClause(), this.getDissimilarityClause(), null, "dissimilarityClause", null, 1, 1, DissimilarityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dissimilarityClauseEClass, DissimilarityClause.class, "DissimilarityClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dissimilarityDisjunctionEClass, DissimilarityDisjunction.class, "DissimilarityDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDissimilarityDisjunction_DissimilarityClauses(), this.getDissimilarityClause(), null, "dissimilarityClauses", null, 2, -1, DissimilarityDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dissimilarityConjunctionEClass, DissimilarityConjunction.class, "DissimilarityConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDissimilarityConjunction_DissimilarityClauses(), this.getDissimilarityClause(), null, "dissimilarityClauses", null, 2, -1, DissimilarityConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dissimilarityEntryEClass, DissimilarityEntry.class, "DissimilarityEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDissimilarityEntry_DissimilarityAttribute(), this.getDissimilarityAttributes(), "dissimilarityAttribute", null, 0, 1, DissimilarityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDissimilarityEntry_HardwareLevel(), this.getHardwareArchitectureLevelType(), "hardwareLevel", null, 0, 1, DissimilarityEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(schedulingRestrictionEClass, SchedulingRestriction.class, "SchedulingRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simpleRelationEClass, SimpleRelation.class, "SimpleRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSimpleRelation_Tasks(), this.getTask(), null, "tasks", null, 2, -1, SimpleRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSimpleRelation_TaskNames(), theEcorePackage.getEString(), "taskNames", null, 0, 1, SimpleRelation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(complexRelationEClass, ComplexRelation.class, "ComplexRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComplexRelation_Tasks(), this.getTask(), null, "tasks", null, 1, -1, ComplexRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexRelation_OtherTask(), this.getTask(), null, "otherTask", null, 0, 1, ComplexRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexRelation_Delay(), theEcorePackage.getEInt(), "delay", null, 0, 1, ComplexRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexRelation_TaskNames(), theEcorePackage.getEString(), "taskNames", null, 0, 1, ComplexRelation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(restrictionStartAtTheSameTimeEClass, RestrictionStartAtTheSameTime.class, "RestrictionStartAtTheSameTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(restrictionFinishAtTheSameTimeEClass, RestrictionFinishAtTheSameTime.class, "RestrictionFinishAtTheSameTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(restrictionStartAfterOtherFinishedEClass, RestrictionStartAfterOtherFinished.class, "RestrictionStartAfterOtherFinished", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(restrictionStartAfterOtherStartedEClass, RestrictionStartAfterOtherStarted.class, "RestrictionStartAfterOtherStarted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(restrictionDisjointExecutionEClass, RestrictionDisjointExecution.class, "RestrictionDisjointExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(restrictionAlternativeEClass, RestrictionAlternative.class, "RestrictionAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRestrictionAlternative_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionAlternative_DislocalityRelations(), this.getDislocalityRelation(), null, "dislocalityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionAlternative_ColocalityRelations(), this.getColocalityRelation(), null, "colocalityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionAlternative_DissimilarityRelations(), this.getDissimilarityRelation(), null, "dissimilarityRelations", null, 0, -1, RestrictionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(explorationCandidateEClass, ExplorationCandidate.class, "ExplorationCandidate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExplorationCandidate_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationCandidate_BoardAlternatives(), this.getBoardAlternative(), null, "boardAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationCandidate_ApplicationAlternatives(), this.getApplicationAlternative(), null, "applicationAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationCandidate_RestrictionAlternatives(), this.getRestrictionAlternative(), null, "restrictionAlternatives", null, 0, -1, ExplorationCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(explorationResultEClass, ExplorationResult.class, "ExplorationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExplorationResult_Candidate(), this.getExplorationCandidate(), null, "candidate", null, 0, 1, ExplorationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationResult_Model(), this.getAssistModel(), null, "model", null, 0, 1, ExplorationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExplorationResult_MappingResult(), this.getMappingResult(), null, "mappingResult", null, 0, 1, ExplorationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExplorationResult_Feasible(), theEcorePackage.getEBoolean(), "feasible", null, 0, 1, ExplorationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExplorationResult_AbsoluteScore(), theEcorePackage.getEDoubleObject(), "absoluteScore", null, 0, 1, ExplorationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExplorationResult_ScaledScore(), theEcorePackage.getEDoubleObject(), "scaledScore", null, 0, 1, ExplorationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractDSEMetricEClass, AbstractDSEMetric.class, "AbstractDSEMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractDSEMetric_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractDSEMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractDSEMetric_BuiltIn(), theEcorePackage.getEBoolean(), "builtIn", null, 0, 1, AbstractDSEMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractDSEMetric_HigherScoreIsBetter(), theEcorePackage.getEBoolean(), "higherScoreIsBetter", null, 0, 1, AbstractDSEMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getAbstractDSEMetric__ComputeAbsoluteScore__ExplorationResult(), theEcorePackage.getEDouble(), "computeAbsoluteScore", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExplorationResult(), "result", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(comparableEClass, Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Comparable<ch.hilbri.assist.model.MappingResult>");

        initEClass(metricScorePairEClass, Map.Entry.class, "MetricScorePair", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMetricScorePair_Key(), this.getAbstractMappingMetric(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMetricScorePair_Value(), theEcorePackage.getEDoubleObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mappingResultEClass, MappingResult.class, "MappingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMappingResult_Name(), theEcorePackage.getEString(), "name", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_Index(), theEcorePackage.getEInt(), "index", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_Task2CoreMap(), this.getTask2CoreMapType(), "task2CoreMap", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMappingResult_Model(), this.getAssistModel(), null, "model", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMappingResult_MetricAbsoluteScoresMap(), this.getMetricScorePair(), null, "metricAbsoluteScoresMap", null, 0, -1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMappingResult_MetricScaledScoresMap(), this.getMetricScorePair(), null, "metricScaledScoresMap", null, 0, -1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_PartialSolution(), theEcorePackage.getEBoolean(), "partialSolution", "false", 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_AbsoluteTotalScore(), theEcorePackage.getEDouble(), "absoluteTotalScore", null, 0, 1, MappingResult.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingResult_ScaledTotalScore(), theEcorePackage.getEDouble(), "scaledTotalScore", null, 0, 1, MappingResult.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        op = initEOperation(getMappingResult__IsUsed__Core(), theEcorePackage.getEBoolean(), "isUsed", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__IsUsed__Processor(), theEcorePackage.getEBoolean(), "isUsed", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getProcessor(), "processor", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__IsUsed__Board(), theEcorePackage.getEBoolean(), "isUsed", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getBoard(), "board", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__IsUsed__Box(), theEcorePackage.getEBoolean(), "isUsed", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getBox(), "box", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__IsUsed__Compartment(), theEcorePackage.getEBoolean(), "isUsed", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCompartment(), "compartment", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__GetMappedTasksForCore__Core(), this.getTask(), "getMappedTasksForCore", 0, -1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__GetAbsoluteCoreUtilization__Core(), theEcorePackage.getEInt(), "getAbsoluteCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__GetRelativeCoreUtilization__Core(), theEcorePackage.getEDouble(), "getRelativeCoreUtilization", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCore(), "core", 0, 1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__GetHardwareElementForTask__Task_int(), this.getHardwareElement(), "getHardwareElementForTask", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getTask(), "task", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theEcorePackage.getEInt(), "level", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getMappingResult__GetMappingElements(), this.getSingleMappingElement(), "getMappingElements", 0, -1, !IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getMappingResult__CompareTo__MappingResult(), theEcorePackage.getEInt(), "compareTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getMappingResult(), "o", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEOperation(getMappingResult__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(singleMappingElementEClass, SingleMappingElement.class, "SingleMappingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSingleMappingElement_Application(), this.getApplication(), null, "application", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Task(), this.getTask(), null, "task", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Core(), this.getCore(), null, "core", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Processor(), this.getProcessor(), null, "processor", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Board(), this.getBoard(), null, "board", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Box(), this.getBox(), null, "box", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleMappingElement_Compartment(), this.getCompartment(), null, "compartment", null, 0, 1, SingleMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractMappingMetricEClass, AbstractMappingMetric.class, "AbstractMappingMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractMappingMetric_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractMappingMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractMappingMetric_BuiltIn(), theEcorePackage.getEBoolean(), "builtIn", null, 0, 1, AbstractMappingMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractMappingMetric_HigherScoreIsBetter(), theEcorePackage.getEBoolean(), "higherScoreIsBetter", null, 0, 1, AbstractMappingMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractMappingMetric_Weight(), theEcorePackage.getEInt(), "weight", null, 0, 1, AbstractMappingMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getAbstractMappingMetric__ComputeAbsoluteScore__MappingResult(), theEcorePackage.getEDouble(), "computeAbsoluteScore", 0, 1, !IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getMappingResult(), "result", 0, 1, !IS_UNIQUE, IS_ORDERED);

        initEClass(schedulingResultEClass, SchedulingResult.class, "SchedulingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSchedulingResult_Name(), theEcorePackage.getEString(), "name", "", 0, 1, SchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchedulingResult_HyperPeriodLength(), theEcorePackage.getEInt(), "hyperPeriodLength", "-1", 0, 1, SchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchedulingResult_Model(), this.getAssistModel(), null, "model", null, 0, 1, SchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchedulingResult_Schedule(), this.getTask2ExecutionInstancesMapType(), "schedule", null, 0, 1, SchedulingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(taskExecutionInstanceEClass, TaskExecutionInstance.class, "TaskExecutionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTaskExecutionInstance_Begin(), theEcorePackage.getEInt(), "begin", "-1", 0, 1, TaskExecutionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTaskExecutionInstance_End(), theEcorePackage.getEInt(), "end", "-1", 0, 1, TaskExecutionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getTaskExecutionInstance__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(dissimilarityAttributesEEnum, DissimilarityAttributes.class, "DissimilarityAttributes");
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.COMPARTMENT_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.COMPARTMENT_POWERSUPPLY);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOX_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_BOARDTYPE);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_POWERSUPPLY);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.BOARD_ASSURANCELEVEL);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.PROCESSOR_MANUFACTURER);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.PROCESSOR_PROCESSORTYPE);
        addEEnumLiteral(dissimilarityAttributesEEnum, DissimilarityAttributes.CORE_ARCHITECTURE);

        initEEnum(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.class, "HardwareArchitectureLevelType");
        addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.CORE);
        addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.PROCESSOR);
        addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.BOARD);
        addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.BOX);
        addEEnumLiteral(hardwareArchitectureLevelTypeEEnum, HardwareArchitectureLevelType.COMPARTMENT);

        initEEnum(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.class, "DesignAssuranceLevelType");
        addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.NONE);
        addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.QS);
        addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.D);
        addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.C);
        addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.B);
        addEEnumLiteral(designAssuranceLevelTypeEEnum, DesignAssuranceLevelType.A);

        initEEnum(periodicityTypeEEnum, PeriodicityType.class, "PeriodicityType");
        addEEnumLiteral(periodicityTypeEEnum, PeriodicityType.STRICT);
        addEEnumLiteral(periodicityTypeEEnum, PeriodicityType.FLEXIBLE);

        initEEnum(colorEEnum, Color.class, "Color");
        addEEnumLiteral(colorEEnum, Color.NONE);
        addEEnumLiteral(colorEEnum, Color.BLACK);
        addEEnumLiteral(colorEEnum, Color.BLUE);
        addEEnumLiteral(colorEEnum, Color.CYAN);
        addEEnumLiteral(colorEEnum, Color.GRAY);
        addEEnumLiteral(colorEEnum, Color.GREEN);
        addEEnumLiteral(colorEEnum, Color.MAGENTA);
        addEEnumLiteral(colorEEnum, Color.RED);
        addEEnumLiteral(colorEEnum, Color.WHITE);
        addEEnumLiteral(colorEEnum, Color.YELLOW);
        addEEnumLiteral(colorEEnum, Color.DARK_BLUE);
        addEEnumLiteral(colorEEnum, Color.DARK_CYAN);
        addEEnumLiteral(colorEEnum, Color.DARK_GRAY);
        addEEnumLiteral(colorEEnum, Color.DARK_GREEN);
        addEEnumLiteral(colorEEnum, Color.DARK_MAGENTA);
        addEEnumLiteral(colorEEnum, Color.DARK_RED);
        addEEnumLiteral(colorEEnum, Color.DARK_YELLOW);

        // Initialize data types
        initEDataType(listOfTaskListsEDataType, EList.class, "ListOfTaskLists", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "org.eclipse.emf.common.util.EList<org.eclipse.emf.common.util.EList<ch.hilbri.assist.model.Task>>");
        initEDataType(task2CoreMapTypeEDataType, HashMap.class, "Task2CoreMapType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.model.Task, ch.hilbri.assist.model.Core>");
        initEDataType(stringListEDataType, List.class, "StringList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.String>");
        initEDataType(task2ExecutionInstancesMapTypeEDataType, HashMap.class, "Task2ExecutionInstancesMapType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ch.hilbri.assist.model.Task, java.util.List<ch.hilbri.assist.model.TaskExecutionInstance>>");

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/emf/2011/Xcore
        createXcoreAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createXcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2011/Xcore";
        addAnnotation
          (this,
           source,
           new String[] {
               "GenModel", "http://www.eclipse.org/emf/2002/GenModel"
           });
    }

} //ModelPackageImpl
