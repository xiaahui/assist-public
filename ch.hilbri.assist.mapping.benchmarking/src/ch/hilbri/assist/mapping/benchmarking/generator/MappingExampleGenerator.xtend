package ch.hilbri.assist.mapping.benchmarking.generator

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.ModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class MappingExampleGenerator {
	static def AssistModel generate() {
		val factory = ModelFactory.eINSTANCE	
		val assistModel = factory.createAssistModel()
		
		/* Creating the application */
		val application = factory.createApplication
		application.name = "A1"
				
		val task = factory.createTask
		task.name = "A1_T1"
		
		application.tasks.add(task)
		assistModel.applications.add(application)
		
		/* Creating the hardware tree */
		val compartment = factory.createCompartment
		compartment.name = "Compartment A"
		
		val box = factory.createBox
		box.name = "Box A"
		
		val board = factory.createBoard
		board.name = "Board A"
		
		val processor = factory.createProcessor
		processor.name = "Processor A"
		
		val core = factory.createCore
		core.name = "Core A"
		
		processor.cores.add(core)
		board.processors.add(processor)
		box.boards.add(board)
		compartment.boxes.add(box)
		assistModel.compartments.add(compartment)
		
        val resSet = new ResourceSetImpl
        val resource = resSet.createResource(URI.createURI("test.mdsl"))  
        resource.contents.add(assistModel)
        
		return assistModel
	}
}