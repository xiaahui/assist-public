package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.mapping.model.result.Result
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.scheduling.model.ModelFactory
import ch.hilbri.assist.scheduling.model.AssistModelScheduling

class FactorySchedulingModelFromMappingSolution {
	private static Logger logger = LoggerFactory.getLogger(FactorySchedulingModelFromMappingSolution)
	
	static def AssistModelScheduling createAssistModel(Result mappingResult) {
		
		val f = ModelFactory.eINSTANCE
		val assistModelScheduling = f.createAssistModelScheduling => [
			systemName = mappingResult.model.systemName + " - " + mappingResult.name			
		]
		
		logger.info("Created a new scheduling model")		
		
		return assistModelScheduling
	}
}