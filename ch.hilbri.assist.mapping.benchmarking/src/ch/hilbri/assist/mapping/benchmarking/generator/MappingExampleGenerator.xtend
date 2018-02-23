package ch.hilbri.assist.mapping.benchmarking.generator

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.HardwareArchitectureLevelType
import ch.hilbri.assist.model.ModelFactory
import java.io.IOException
import java.util.Collections
import java.util.List
import java.util.concurrent.ThreadLocalRandom
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Assert

class MappingExampleGenerator {

	/* Our random number generator
	 * (@see https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java)	 */
	static val rng = ThreadLocalRandom.current
	

	
	/* Just a facade */
	static def AssistModel generateSingle(int compCount, int boxCount, int boardCount, int procCount, int coreCount, int appCount, int taskCount, int dislocRelCount, int dislocAppCount, List<HardwareArchitectureLevelType> dislocLevels) {
		generateSingleRandomized(compCount, compCount, boxCount, boxCount, boardCount, boardCount, procCount, procCount, coreCount, coreCount, appCount, appCount, taskCount, taskCount, dislocRelCount, dislocRelCount, dislocAppCount, dislocAppCount, dislocLevels)
	}

	/* Just a facade */
	static def AssistModel generateSingleRandomized(
		List<Integer> compCount, 
		List<Integer> boxCount, 
		List<Integer> boardCount, 
		List<Integer> procCount, 
		List<Integer> coreCount, 
		List<Integer> appCount, 
		List<Integer> taskCount,
		List<Integer> dislocRelCount,
		List<Integer> dislocAppCount,
		List<HardwareArchitectureLevelType> dislocLevels)  
	{
		Assert.assertTrue(compCount.size == 2)
		Assert.assertTrue(boxCount.size == 2)
		Assert.assertTrue(boardCount.size == 2)
		Assert.assertTrue(procCount.size == 2)
		Assert.assertTrue(coreCount.size == 2)
		Assert.assertTrue(appCount.size == 2)
		Assert.assertTrue(taskCount.size == 2)
		
		generateSingleRandomized(
			compCount.head, 		compCount.last, 
			boxCount.head, 			boxCount.last, 
			boardCount.head, 		boardCount.last, 
			procCount.head, 		procCount.last, 
			coreCount.head, 		coreCount.last, 
			appCount.head, 			appCount.last, 
			taskCount.head, 		taskCount.last,
			dislocRelCount.head,	dislocRelCount.last,
			dislocAppCount.head,	dislocAppCount.last,
			dislocLevels	
		)
	}
	
	/**
	 * REAL WORK IS DONE HERE!
	 * 
	 */
	static def AssistModel generateSingleRandomized(
		int compCountMin, 	int compCountMax, 
		int boxCountMin,  	int boxCountMax, 
		int boardCountMin, 	int boardCountMax, 
		int procCountMin, 	int procCountMax, 
		int coreCountMin,	int coreCountMax,
		int appCountMin,	int appCountMax,
		int taskCountMin,	int taskCountMax,
		int dislocRelCountMin, int dislocRelCountMax,
		int dislocAppCountMin, int dislocAppCountMax,
		List<HardwareArchitectureLevelType> dislocLevels) 
	{
	
		/* Check validity of input arguments */
		Assert.assertTrue(compCountMin > 0)	
		Assert.assertTrue(boxCountMin > 0)
		Assert.assertTrue(boardCountMin > 0)
		Assert.assertTrue(procCountMin > 0)
		Assert.assertTrue(coreCountMin > 0)
		Assert.assertTrue(appCountMin > 0)
		Assert.assertTrue(taskCountMin > 0)
		Assert.assertTrue(dislocRelCountMin > 0)
		Assert.assertTrue(dislocAppCountMin > 0)
		Assert.assertTrue(dislocLevels.size > 0)

		Assert.assertTrue(compCountMin  <= compCountMax)	
		Assert.assertTrue(boxCountMin   <= boxCountMax)
		Assert.assertTrue(boardCountMin <= boardCountMax)
		Assert.assertTrue(procCountMin  <= procCountMax)
		Assert.assertTrue(coreCountMin  <= coreCountMax)
		Assert.assertTrue(appCountMin   <= appCountMax)
		Assert.assertTrue(taskCountMin  <= taskCountMax)
		Assert.assertTrue(dislocRelCountMin <= dislocRelCountMax)
		Assert.assertTrue(dislocAppCountMin <= dislocAppCountMax)

		/* Start cracking ... */
		val factory = ModelFactory.eINSTANCE
		val assistModel = factory.createAssistModel()
		assistModel.systemName = "Example System"

		/* Creating the hardware tree */
		for (compCount : 1 ..< rng.nextInt(compCountMin, compCountMax + 1) + 1) {
			val compartment = factory.createCompartment
			compartment.name = '''Compartment_«compCount»'''
			assistModel.compartments.add(compartment)

			for (boxCount : 1 ..< rng.nextInt(boxCountMin, boxCountMax + 1) + 1) {
				val box = factory.createBox
				box.name = '''Box_«compCount»_«boxCount»'''
				compartment.boxes.add(box)
				
				for (boardCount : 1 ..< rng.nextInt(boardCountMin, boardCountMax + 1) + 1) {
					val board = factory.createBoard
					board.name = '''Board_«compCount»_«boxCount»_«boardCount»'''
					box.boards.add(board)
			
					for (procCount : 1 ..< rng.nextInt(procCountMin, procCountMax + 1) + 1) {
						val processor = factory.createProcessor
						processor.name = '''Processor_«compCount»_«boxCount»_«boardCount»_«procCount»'''
						board.processors.add(processor)			
						
						for (coreCount : 1 ..< rng.nextInt(coreCountMin, coreCountMax + 1) + 1) {
							val core = factory.createCore
							core.name = '''Core_«compCount»_«boxCount»_«boardCount»_«procCount»_«coreCount»'''
							processor.cores.add(core)														
						}
					}
				}	
			}
		}

		/* Creating the applications */
		for (appCount : 1 ..< rng.nextInt(appCountMin, appCountMax + 1) + 1) {
			val application = factory.createApplication
			application.name = '''Application_«appCount»'''
			assistModel.applications.add(application)	
				
			for (taskCount : 1 ..< rng.nextInt(taskCountMin, taskCountMax + 1) + 1) {	
				val task = factory.createTask
				task.name = '''Task_«appCount»_«taskCount»'''
				application.tasks.add(task)						
			}
		}
		
		/* Creating the dislocality requirements */
		for (dislocRelCount : 1 ..< rng.nextInt(dislocRelCountMin, dislocRelCountMax + 1) + 1) {
			val dislocality = factory.createDislocalityRelation
			assistModel.dislocalityRelations.add(dislocality)
			
			/* Define the level of the dislocality relation (where should they differ? Processor? Board? Box?) 
			 * Choice is made uniformly among the set of given levels											 */
			dislocality.hardwareLevel = dislocLevels.get(rng.nextInt(0, dislocLevels.size))		
			
			/* We should not try to have a dislocality relations with more applications than we actually have */
			var dislocAppCountLimit = rng.nextInt(dislocAppCountMin, dislocAppCountMax + 1)
			if (dislocAppCountLimit > assistModel.applications.size)
				dislocAppCountLimit = assistModel.applications.size
			
			for (dislocAppCount : 1 ..< dislocAppCountLimit + 1) {
				/* Choose an application randomly that was not already added */
				var boolean applicationAdded = false
				while (!applicationAdded) {
					val selectedApplication = assistModel.applications.get(rng.nextInt(0, assistModel.applications.size))
					if (!dislocality.applications.contains(selectedApplication)) 
						applicationAdded = dislocality.applications.add(selectedApplication)
				}
			}
		}	

		/* Enforce all applications to have their tasks on the same board */
		for (app : assistModel.applications) {
			val colocality = factory.createColocalityRelation
			colocality.applications.add(app)
			colocality.hardwareLevel = HardwareArchitectureLevelType.BOARD
			assistModel.colocalityRelations.add(colocality)
		}
			
			
		/* Prepare everything to have the model persisted - if desired */
		val resSet = new ResourceSetImpl
		val resource = resSet.createResource(URI.createURI("test.mdsl"))
		resource.contents.add(assistModel)
		
		return assistModel
	}
	
	static def saveToFile(AssistModel assistModel, String filePath) {
		val resSet = new ResourceSetImpl
		val resource = resSet.createResource(URI.createFileURI(filePath))
		resource.contents.add(assistModel)

        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}