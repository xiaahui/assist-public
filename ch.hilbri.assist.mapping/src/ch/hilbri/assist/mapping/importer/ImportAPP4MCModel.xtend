package ch.hilbri.assist.mapping.importer

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.ModelFactory
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.io.AmaltheaLoader

class ImportAPP4MCModel {
    
    static def AssistModel createAssistModel(String filePath) {
        val amaltheaModel = AmaltheaLoader.loadFromFileNamed(filePath)
        val assistModel =  createAssistModel(amaltheaModel)
        return assistModel
    }
    
    
    static def AssistModel createAssistModel(Amalthea amaltheaModel) {
        /* Factory */
        val f = ModelFactory.eINSTANCE
        
        val assistModel = f.createAssistModel => [
            systemName = amaltheaModel.hwModel.structures.get(0).name
    
            /* Hardware Model */
            compartments.add(f.createCompartment => [
                name = "Compartment"
                
                boxes.add(f.createBox => [
                    name = "Box"
                    
                    for (hwStruc : amaltheaModel.hwModel.structures.get(0).structures) {
                        boards.add(createBoard(hwStruc))
                    }
                ])
            ])
            
            
            /* Software Model */
            for (runnable : amaltheaModel.swModel.runnables) {
                applications.add(createApplication(runnable))
            }
        ]
        return assistModel
    }
    
    private static def Board createBoard(HwStructure hwStructure) {
        ModelFactory.eINSTANCE.createBoard => [ 
            name = hwStructure.name
            processors.add(ModelFactory.eINSTANCE.createProcessor => [
                name = hwStructure.name + "_proc"
                cores.add(ModelFactory.eINSTANCE.createCore => [
                    name = hwStructure.name + "_core"
                ])
            ])
        ]
    }
    
    private static def Application createApplication(Runnable runnable) {
        ModelFactory.eINSTANCE.createApplication => [
            name = runnable.name
            tasks.add(ModelFactory.eINSTANCE.createTask => [ name = runnable.name + "_task" ])
        ]
    }
}