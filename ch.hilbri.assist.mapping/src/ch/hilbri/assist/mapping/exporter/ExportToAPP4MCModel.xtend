package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.Processor
import java.math.BigInteger
import java.util.AbstractMap
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.StructureType
import org.eclipse.app4mc.amalthea.model.Value
import org.eclipse.app4mc.amalthea.model.util.ModelUtil
import org.eclipse.emf.common.util.BasicEMap.Entry

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
        val newSystem = amaltheaFactory.createHwStructure => [
            name = assistModel.systemName
            structureType = StructureType.SYSTEM
        ]
        hwModel.structures.add(newSystem)
    
        /* Create the compartments */
        for (compartment : assistModel.compartments) {
            val newCompartment = amaltheaFactory.createHwStructure => [
                name = compartment.name
                structureType = StructureType.GROUP
            ]
            newSystem.structures.add(newCompartment)
            
            /* Create the boxes */            
            for (box : compartment.boxes) {
                val newBox = amaltheaFactory.createHwStructure => [
                    name = box.name
                    structureType = StructureType.GROUP
                ]
                newCompartment.structures.add(newBox)
                
                /* Create the boards -> ECUs */
                for (board : box.boards) {
                    val newBoard = amaltheaFactory.createHwStructure => [
                        name = board.name
                        structureType = StructureType.ECU
                    ]
                    newBox.structures.add(newBoard)
                    
                    /* Add RAM from the boards */
                    if (board.ramCapacity > 0) {
                        val memDefinition = amaltheaFactory.createMemoryDefinition => [
                            name = board.name + "_RAM_Definition"
                            size = amaltheaFactory.createDataSize => [ value = BigInteger.valueOf(board.ramCapacity) ]
                        ]
                        hwModel.definitions.add(memDefinition)
                        
                        val memModule = amaltheaFactory.createMemory => [
                            name = board.name + "_RAM"
                            definition = memDefinition
                        ]
                        newBoard.modules.add(memModule)
                    }
                    
                    /* Add ROM from the boards */
                    if (board.romCapacity > 0) {
                        val memDefinition = amaltheaFactory.createMemoryDefinition => [
                            name = board.name + "_ROM_Definition"
                            size = amaltheaFactory.createDataSize => [ value = BigInteger.valueOf(board.romCapacity) ]
                        ]
                        hwModel.definitions.add(memDefinition)
                        
                        val memModule = amaltheaFactory.createMemory => [
                            name = board.name + "_ROM"
                            definition = memDefinition
                        ]
                        newBoard.modules.add(memModule)
                    }
                    
                    /* Create the processors -> Microcontrollers */
                    for (processor : board.processors) {
                        val amaltheaProcessor = amaltheaFactory.createHwStructure(processor) 
                        newBoard.structures.add(amaltheaProcessor)
                        
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
    private static def HwStructure createHwStructure(AmaltheaFactory factory, Processor processor) {
        factory.createHwStructure => [
            name = processor.name
            structureType = StructureType.MICROCONTROLLER
        ]
        
    } 
     
    private static def ProcessingUnit createProcessingUnit(AmaltheaFactory factory, Core core) {
        factory.createProcessingUnit => [
            name = core.name
            if (!core.architecture.nullOrEmpty) customProperties.put("Architecture", factory.createStringObject => [value = core.architecture])
        ]
    }
    
    

}
