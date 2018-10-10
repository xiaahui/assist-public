package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.DesignAssuranceLevelType
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.Processor
import java.math.BigInteger
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.MappingModel
import org.eclipse.app4mc.amalthea.model.Memory
import org.eclipse.app4mc.amalthea.model.MemoryDefinition
import org.eclipse.app4mc.amalthea.model.OSModel
import org.eclipse.app4mc.amalthea.model.OperatingSystem
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation
import org.eclipse.app4mc.amalthea.model.StructureType
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskAllocation
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.util.CustomPropertyUtil
import org.eclipse.app4mc.amalthea.model.util.DeploymentUtil
import org.eclipse.app4mc.amalthea.model.util.ModelUtil
import org.eclipse.app4mc.amalthea.model.util.SearchElementsUtility

class ExportToAPP4MCModel {

    /**
     * @param result a mapping result to be converted to amalthea
     */
    static def Amalthea createModel(MappingResult result) {
        
        val assistModel = result.model
        val amaltheaFactory = AmaltheaFactory.eINSTANCE
        val newAmaltheaModel = amaltheaFactory.createAmalthea
        
        newAmaltheaModel.hwModel = amaltheaFactory.createHWModel(newAmaltheaModel, assistModel)
        newAmaltheaModel.swModel = amaltheaFactory.createSWModel(newAmaltheaModel, assistModel) 

        /* We assume, that each processor is controlled by a single operating system.
         * Each operating system has one scheduler (dispatcher) that is executing on the first core.
         * The scheduler is responsible for the execution of all tasks on all its cores.
         */
        newAmaltheaModel.osModel = amaltheaFactory.createOSModel(newAmaltheaModel, assistModel)
        newAmaltheaModel.mappingModel = amaltheaFactory.createMappingModel(newAmaltheaModel, assistModel, result)

        return newAmaltheaModel
    }

    /**
     * @param result        a mapping result to be converted to amalthea
     * @param existingModel an amalthea model which should be "enhanced" with the mapping information - 
     *                      it could also be "null" for a clean and empty amalthea model 
     */
    static def Amalthea createModel(MappingResult result, Amalthea existingModel) {
        val searchTool = new SearchElementsUtility(existingModel)
        val amaltheaFactory = AmaltheaFactory.eINSTANCE
        val mappingModel = ModelUtil.getOrCreateMappingModel(existingModel)
        
        // We need to go through the mappings and check, if we can add them to the existingModel
        for (assistTask : result.task2CoreMap.keySet) {
            val assistCore = result.task2CoreMap.get(assistTask)
            
            // Make sure that the task is present in the amalthea model
            if (!searchTool.getElementsBasedOnName(assistTask.fullName, Task).nullOrEmpty) {
                val amaltheaTask = searchTool.getElementsBasedOnName(assistTask.fullName, Task).head
                
                // Make sure that we have the core in the model
                if (!searchTool.getElementsBasedOnName(assistCore.fullName, ProcessingUnit).nullOrEmpty) {

                    // Make sure that we have a scheduler with a proper name there
                    // (we assume, that the schedule is configured properly (core affinity, ...))
                    if (searchTool.getElementsBasedOnName("Scheduler/OS/" + assistCore.processor.fullName, TaskScheduler).isNullOrEmpty) {

                        // Create scheduler first
                        val osModel = ModelUtil.getOrCreateOsModel(existingModel)
                        val os = amaltheaFactory.createOperatingSystem(existingModel, assistCore.processor)
                        osModel.operatingSystems.add(os)
                    }

                    // Remove previous task allocations for the amaltheaTask
                    val existingAllocations = DeploymentUtil.getTaskAllocations(amaltheaTask, existingModel)
                    if (!existingAllocations.nullOrEmpty)
                        mappingModel.taskAllocation.removeAll(existingAllocations)
        
                    // We create the new task allocation 
                    val taskAlloc = amaltheaFactory.createTaskAllocation(assistTask, assistCore, searchTool)
                    mappingModel.taskAllocation.add(taskAlloc)                
                }
            }
        }
        
        return existingModel
    }
    
    /**
     * Custom extension methods for each software / hardware structure / module
     */
    
    // ***************************************************************************
    // MAPPING MODEL 
    // ***************************************************************************
         
    private static def MappingModel createMappingModel(AmaltheaFactory amaltheaFactory, Amalthea amaltheaModel,  AssistModel assistModel, MappingResult result) {
        val searchTool = new SearchElementsUtility(amaltheaModel)

        val mappingModel = amaltheaFactory.createMappingModel

        /* Create the allocation for the task scheduler */
        for (taskScheduler : searchTool.getElementsBasedOnType(TaskScheduler)) {
            val taskSchedulerAlloc = amaltheaFactory.createSchedulerAllocation(taskScheduler, searchTool) 
            mappingModel.schedulerAllocation.add(taskSchedulerAlloc)
        }
        
        /* Create the task allocation for each task */
        for (assistTask : assistModel.allTasks) {
            val assistCore = result.task2CoreMap.get(assistTask)
            if (assistCore !== null) {
                val taskAlloc = amaltheaFactory.createTaskAllocation(assistTask, assistCore, searchTool)
                mappingModel.taskAllocation.add(taskAlloc)            
            }
        }

        return mappingModel
    }
    
    private static def TaskAllocation createTaskAllocation(AmaltheaFactory amaltheaFactory, ch.hilbri.assist.model.Task assistTask, Core assistCore, SearchElementsUtility searchTool) {
        amaltheaFactory.createTaskAllocation => [
            val amaltheaTask = searchTool.getElementsBasedOnName(assistTask.fullName, Task).head
            task = amaltheaTask
            
            val amaltheaAssignedCore = searchTool.getElementsBasedOnName(assistCore.fullName, ProcessingUnit).head
            affinity.add(amaltheaAssignedCore)
            
            val amaltheaScheduler = searchTool.getElementsBasedOnName("Scheduler/OS/" + assistCore.processor.fullName, TaskScheduler).head
            scheduler = amaltheaScheduler
        ]
    }
    
    private static def SchedulerAllocation createSchedulerAllocation(AmaltheaFactory amaltheaFactory, TaskScheduler taskScheduler, SearchElementsUtility searchTool) {
        val processorFullName = taskScheduler.name.split("/").last
        
        amaltheaFactory.createSchedulerAllocation => [
                // Find the processor in the amalthea model for this operating system
                val amaltheaProcessor = searchTool.getElementsBasedOnName(processorFullName, HwStructure)
                                                  .filter[structureType == StructureType.MICROCONTROLLER]
                                                  .head

                // ... and add all its cores to the responsibility of the scheduler
                val cores = amaltheaProcessor.modules.filter[it instanceof ProcessingUnit].map[it as ProcessingUnit]
                
                // Set the list of cores that the scheduler is responsible for
                responsibility.addAll(cores)

                // Make sure the scheduler is executed on the first core
                executingPU = cores.head

                // Store reference to the scheduler
                scheduler = taskScheduler
        ]
    }

    // ***************************************************************************
    // OS MODEL 
    // ***************************************************************************

    private static def OSModel createOSModel(AmaltheaFactory amaltheaFactory, Amalthea amaltheaModel, AssistModel assistModel) {
        amaltheaFactory.createOSModel => [
            for (processor : assistModel.allProcessors) {
                val amaltheaOS = amaltheaFactory.createOperatingSystem(amaltheaModel, processor)
                operatingSystems.add(amaltheaOS)
            }            
        ]
    } 
    
    private static def OperatingSystem createOperatingSystem(AmaltheaFactory amaltheaFactory, Amalthea amaltheaModel, Processor processor) {
        amaltheaFactory.createOperatingSystem => [
            name = "OS/" + processor.fullName
            val taskScheduler = amaltheaFactory.createTaskScheduler(it)
            taskSchedulers.add(taskScheduler)
        ]
    } 
    
    private static def TaskScheduler createTaskScheduler(AmaltheaFactory amaltheaFactory, OperatingSystem operatingSystem) {
        amaltheaFactory.createTaskScheduler => [
            name = "Scheduler/" + operatingSystem.name
        ]
    }
    
    // ***************************************************************************
    // SOFTWARE MODEL 
    // ***************************************************************************
    
    private static def SWModel createSWModel(AmaltheaFactory amaltheaFactory, Amalthea amaltheaModel, AssistModel assistModel) {
        amaltheaFactory.createSWModel => [
            for (task : assistModel.allTasks) {
                val amaltheaTask = amaltheaFactory.createTask(task)
                tasks.add(amaltheaTask)
            }    
        ]
    }
    
     private static def Task createTask(AmaltheaFactory factory, ch.hilbri.assist.model.Task assistTask) {
        factory.createTask => [
            name = assistTask.fullName
        ]
    }
    
    // ***************************************************************************
    // HARDWARE MODEL 
    // ***************************************************************************
    
    private static def HWModel createHWModel(AmaltheaFactory amaltheaFactory, Amalthea amaltheaModel, AssistModel assistModel) {
        /* Building the hardware model */
        amaltheaFactory.createHWModel => [
        
            /* Create the new system */
            val newSystem = amaltheaFactory.createHwStructure(assistModel)
            structures.add(newSystem)
    
            /* Create the compartments */
            for (compartment : assistModel.compartments) {
                val amaltheaCompartment = amaltheaFactory.createHwStructure(compartment)
                newSystem.structures.add(amaltheaCompartment)
            
                /* Create the boxes */            
                for (box : compartment.boxes) {
                    val amaltheaBox = amaltheaFactory.createHwStructure(box)
                    amaltheaCompartment.structures.add(amaltheaBox)
                
                    /* Create the boards -> ECUs */
                    for (board : box.boards) {
                        val amaltheaBoard = amaltheaFactory.createHwStructure(board)
                        amaltheaBox.structures.add(amaltheaBoard)
                    
                        /* Add memories to the board */
                        if (board.ramCapacity > 0) {
                            val ramDefinition = amaltheaFactory.createMemoryDefinition(board.name + "_RAM_Definition", board.ramCapacity)
                            definitions.add(ramDefinition)
                            amaltheaBoard.modules.add(amaltheaFactory.createMemory(board.name + "_RAM", ramDefinition))
                        }
                        if (board.romCapacity > 0) {
                            val romDefinition = amaltheaFactory.createMemoryDefinition(board.name + "_ROM_Definition", board.romCapacity)
                            definitions.add(romDefinition)
                            amaltheaBoard.modules.add(amaltheaFactory.createMemory(board.name + "_ROM", romDefinition))
                        }
                    
                        /* Create the processors -> Microcontrollers */
                        for (processor : board.processors) {
                            val amaltheaProcessor = amaltheaFactory.createHwStructure(processor) 
                            amaltheaBoard.structures.add(amaltheaProcessor)
                        
                            /* Create the cores -> Modules/ProcessingUnit */
                            for (core : processor.cores) {
                                val amaltheaCore = amaltheaFactory.createProcessingUnit(core)
                                amaltheaProcessor.modules.add(amaltheaCore)
                            }
                        }
                    }
                }    
            }
        ]
    } 
     
    private static def HwStructure createHwStructure(AmaltheaFactory factory, AssistModel assistModel) {
        factory.createHwStructure => [
            name = assistModel.systemName
            structureType = StructureType.SYSTEM
        ]
    }
     
    private static def HwStructure createHwStructure(AmaltheaFactory factory, Compartment compartment) {
        factory.createHwStructure => [
            name = compartment.fullName
            structureType = StructureType.GROUP
            if (!compartment.manufacturer.nullOrEmpty) CustomPropertyUtil.customPut(it, "Manufacturer", compartment.manufacturer)
            if (!compartment.powerSupply.nullOrEmpty) CustomPropertyUtil.customPut(it, "PowerSupply", compartment.powerSupply)
        ]
    }

    private static def HwStructure createHwStructure(AmaltheaFactory factory, Box box) {
        factory.createHwStructure => [
            name = box.fullName
            structureType = StructureType.GROUP
            if (!box.manufacturer.nullOrEmpty) CustomPropertyUtil.customPut(it, "Manufacturer", box.manufacturer)
        ]
    }
     
    private static def HwStructure createHwStructure(AmaltheaFactory factory, Board board) {
        factory.createHwStructure => [
            name = board.fullName
            structureType = StructureType.ECU
            if (!board.manufacturer.nullOrEmpty) CustomPropertyUtil.customPut(it, "Manufacturer", board.manufacturer)
            if (!board.boardType.nullOrEmpty) CustomPropertyUtil.customPut(it, "Type", board.boardType)
            if (!board.powerSupply.nullOrEmpty) CustomPropertyUtil.customPut(it, "PowerSupply", board.powerSupply)
            if (board.assuranceLevel != DesignAssuranceLevelType.NONE) CustomPropertyUtil.customPut(it, "DesignAssuranceLevel", board.assuranceLevel.getName)
        ]
    }
    
    private static def MemoryDefinition createMemoryDefinition(AmaltheaFactory factory, String memDefinitionName, int memSize) {
        factory.createMemoryDefinition => [
            name = memDefinitionName 
            size = factory.createDataSize => [value = BigInteger.valueOf(memSize)]
        ]
    }
    
    private static def Memory createMemory(AmaltheaFactory factory, String memName, MemoryDefinition memDefinition) {
        factory.createMemory => [
            name = memName
            definition = memDefinition
        ]
    }

    private static def HwStructure createHwStructure(AmaltheaFactory factory, Processor processor) {
        factory.createHwStructure => [
            name = processor.fullName
            structureType = StructureType.MICROCONTROLLER
            if (!processor.manufacturer.nullOrEmpty) CustomPropertyUtil.customPut(it, "Manufacturer", processor.manufacturer)
            if (!processor.processorType.nullOrEmpty) CustomPropertyUtil.customPut(it, "ProcessorType", processor.processorType)
        ]
    } 
     
    private static def ProcessingUnit createProcessingUnit(AmaltheaFactory factory, Core core) {
        factory.createProcessingUnit => [
            name = core.fullName
            if (!core.coreArchitecture.nullOrEmpty) CustomPropertyUtil.customPut(it, "Architecture", core.coreArchitecture)
        ]
    }
}

