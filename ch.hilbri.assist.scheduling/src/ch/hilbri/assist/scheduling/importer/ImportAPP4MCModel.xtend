package ch.hilbri.assist.scheduling.importer

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.ModelFactory
import java.util.Map
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class ImportAPP4MCModel {
    
    static def AssistModel createAssistModel(String filePath) {
        
        AmaltheaPackage.eINSTANCE.eClass()
        
        val Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE
        val Map<String, Object> m = reg.getExtensionToFactoryMap()
        m.put("amxmi", new XMIResourceFactoryImpl())
        
        val resSet = new ResourceSetImpl()
        val uri = URI.createFileURI(filePath)
        val resource = resSet.getResource(uri, true)
        
        return createAssistModel(resource.contents.get(0) as Amalthea)
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
