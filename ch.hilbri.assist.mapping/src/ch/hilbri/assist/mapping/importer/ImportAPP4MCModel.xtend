package ch.hilbri.assist.mapping.importer

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ModelFactory

class ImportAPP4MCModel {
    static def AssistModel createAssistModel(Object app4mc) {
        val assistModel = ModelFactory.eINSTANCE.createAssistModel => [
            systemName = "App4MC Imported Model"
        ]
        return assistModel
    }
}