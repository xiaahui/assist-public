package ch.hilbri.assist.mapping.importer

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ModelFactory
import java.util.Map
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
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
        
        return createAssistModel(resource)
    }
    
    
    static def AssistModel createAssistModel(Resource r) {
        val assistModel = ModelFactory.eINSTANCE.createAssistModel => [
            systemName = "App4MC Imported Model"
        ]
        return assistModel
    }
}