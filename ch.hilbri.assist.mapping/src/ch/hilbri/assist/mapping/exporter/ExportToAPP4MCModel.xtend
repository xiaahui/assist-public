package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.Processor
import java.math.BigInteger
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.Memory
import org.eclipse.app4mc.amalthea.model.MemoryDefinition
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.StructureType
import org.eclipse.app4mc.amalthea.model.util.ModelUtil
import ch.hilbri.assist.model.DesignAssuranceLevelType

class ExportToAPP4MCModel {

    /**
     * @param result a mapping result to be converted to amalthea
     */
    static def Amalthea createModel(MappingResult result) {
        
        val assistModel = result.model
        val amaltheaFactory = AmaltheaFactory.eINSTANCE
        val newAmaltheaModel = amaltheaFactory.createAmalthea
        
        /* Building the hardware model */
        val hwModel = ModelUtil.getOrCreateHwModel(newAmaltheaModel)
        
        /* Create the new system */
        val newSystem = amaltheaFactory.createHwStructure(assistModel)
        hwModel.structures.add(newSystem)
    
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
                        hwModel.definitions.add(ramDefinition)
                        amaltheaBoard.modules.add(amaltheaFactory.createMemory(board.name + "_RAM", ramDefinition))
                    }
                    if (board.romCapacity > 0) {
                        val romDefinition = amaltheaFactory.createMemoryDefinition(board.name + "_ROM_Definition", board.romCapacity)
                        hwModel.definitions.add(romDefinition)
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
        
        return newAmaltheaModel
    }

    /**
     * @param result        a mapping result to be converted to amalthea
     * @param existingModel an amalthea model which should be "enhanced" with the mapping information - 
     *                      it could also be "null" for a clean and empty amalthea model 
     */
    static def Amalthea createModel(MappingResult result, Amalthea existingModel) {
        return null
    }
    
    /**
     * Custom extension methods for each hardware structure / module
     */
    private static def HwStructure createHwStructure(AmaltheaFactory factory, AssistModel assistModel) {
        factory.createHwStructure => [
            name = assistModel.systemName
            structureType = StructureType.SYSTEM
        ]
    }
     
    private static def HwStructure createHwStructure(AmaltheaFactory factory, Compartment compartment) {
        factory.createHwStructure => [
            name = compartment.name
            structureType = StructureType.GROUP
            if (!compartment.manufacturer.nullOrEmpty) customProperties.put("Manufacturer", factory.createStringObject => [value = compartment.manufacturer])
            if (!compartment.powerSupply.nullOrEmpty) customProperties.put("PowerSupply", factory.createStringObject => [value = compartment.powerSupply])
        ]
    }

    private static def HwStructure createHwStructure(AmaltheaFactory factory, Box box) {
        factory.createHwStructure => [
            name = box.name
            structureType = StructureType.GROUP
            if (!box.manufacturer.nullOrEmpty) customProperties.put("Manufacturer", factory.createStringObject => [value = box.manufacturer])
        ]
    }
     
    private static def HwStructure createHwStructure(AmaltheaFactory factory, Board board) {
        factory.createHwStructure => [
            name = board.name
            structureType = StructureType.ECU
            if (!board.manufacturer.nullOrEmpty) customProperties.put("Manufacturer", factory.createStringObject => [value = board.manufacturer])
            if (!board.boardType.nullOrEmpty) customProperties.put("Type", factory.createStringObject => [value = board.boardType])
            if (!board.powerSupply.nullOrEmpty) customProperties.put("PowerSupply", factory.createStringObject => [value = board.powerSupply])
            if (board.assuranceLevel != DesignAssuranceLevelType.NONE) customProperties.put("DesignAssuranceLevel", factory.createStringObject => [value = board.assuranceLevel.getName])
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
            name = processor.name
            structureType = StructureType.MICROCONTROLLER
            if (!processor.manufacturer.nullOrEmpty) customProperties.put("Manufacturer", factory.createStringObject => [value = processor.manufacturer])
            if (!processor.processorType.nullOrEmpty) customProperties.put("ProcessorType", factory.createStringObject => [value = processor.processorType])
        ]
    } 
     
    private static def ProcessingUnit createProcessingUnit(AmaltheaFactory factory, Core core) {
        factory.createProcessingUnit => [
            name = core.name
            if (!core.architecture.nullOrEmpty) customProperties.put("Architecture", factory.createStringObject => [value = core.architecture])
        ]
    }
    
    

}

