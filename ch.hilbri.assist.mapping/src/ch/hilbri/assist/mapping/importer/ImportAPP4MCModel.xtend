package ch.hilbri.assist.mapping.importer

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

public class MyXMIFactoryImpl extends XMIResourceFactoryImpl {
    override def Resource createResource(URI uri) {
        val XMIResourceFactoryImpl resFactory = new XMIResourceFactoryImpl();
        val XMIResource resource = resFactory.createResource(uri) as XMIResource;
        try {
            resource.getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resource;
    }
}


class ImportAPP4MCModel {
    
    static def AssistModel createAssistModel(String filePath) {
        val reg = Resource.Factory.Registry.INSTANCE
        val m = reg.getExtensionToFactoryMap()
        m.put("amxmi", MyXMIFactoryImpl)
        val resSet = new ResourceSetImpl()
        val resource = resSet.getResource(URI.createFileURI(filePath), true)
        return createAssistModel(resource)
    }
    
    
    static def AssistModel createAssistModel(Resource r) {
        val assistModel = ModelFactory.eINSTANCE.createAssistModel => [
            systemName = "App4MC Imported Model"
        ]
        return assistModel
    }
}