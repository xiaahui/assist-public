package ch.hilbri.assist.mapping.benchmarking.generator

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.ModelFactory
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
	static def AssistModel generateSingle(int compCount, int boxCount, int boardCount, int procCount, int coreCount, int appCount, int taskCount) {
		generateSingleRandomized(compCount, compCount, boxCount, boxCount, boardCount, boardCount, procCount, procCount, coreCount, coreCount, appCount, appCount, taskCount, taskCount)
	}

	/* Just a facade */
	static def AssistModel generateSingleRandomized(
		List<Integer> compCount, 
		List<Integer> boxCount, 
		List<Integer> boardCount, 
		List<Integer> procCount, 
		List<Integer> coreCount, 
		List<Integer> appCount, 
		List<Integer> taskCount
	) 
	{
		Assert.assertTrue(compCount.size == 2)
		Assert.assertTrue(boxCount.size == 2)
		Assert.assertTrue(boardCount.size == 2)
		Assert.assertTrue(procCount.size == 2)
		Assert.assertTrue(coreCount.size == 2)
		Assert.assertTrue(appCount.size == 2)
		Assert.assertTrue(taskCount.size == 2)
		
		generateSingleRandomized(
			compCount.head, 	compCount.last, 
			boxCount.head, 		boxCount.last, 
			boardCount.head, 	boardCount.last, 
			procCount.head, 	procCount.last, 
			coreCount.head, 	coreCount.last, 
			appCount.head, 		appCount.last, 
			taskCount.head, 	taskCount.last
		)
	}
	
	static def AssistModel generateSingleRandomized(
		int compCountMin, 	int compCountMax, 
		int boxCountMin,  	int boxCountMax, 
		int boardCountMin, 	int boardCountMax, 
		int procCountMin, 	int procCountMax, 
		int coreCountMin,	int coreCountMax,
		int appCountMin,	int appCountMax,
		int taskCountMin,	int taskCountMax) 
	{
		/* Check validity of input arguments */
		Assert.assertTrue(compCountMin > 0)	
		Assert.assertTrue(boxCountMin > 0)
		Assert.assertTrue(boardCountMin > 0)
		Assert.assertTrue(procCountMin > 0)
		Assert.assertTrue(coreCountMin > 0)
		Assert.assertTrue(appCountMin > 0)
		Assert.assertTrue(taskCountMin > 0)

		Assert.assertTrue(compCountMin  <= compCountMax)	
		Assert.assertTrue(boxCountMin   <= boxCountMax)
		Assert.assertTrue(boardCountMin <= boardCountMax)
		Assert.assertTrue(procCountMin  <= procCountMax)
		Assert.assertTrue(coreCountMin  <= coreCountMax)
		Assert.assertTrue(appCountMin   <= appCountMax)
		Assert.assertTrue(taskCountMin  <= taskCountMax)

		/* Start cracking ... */
		val factory = ModelFactory.eINSTANCE
		val assistModel = factory.createAssistModel()

		/* Creating the applications */
		for (appCount : 1 ..< rng.nextInt(appCountMin, appCountMax + 1) + 1) {
			val application = factory.createApplication
			application.name = '''Application_«appCount»'''
			assistModel.applications.add(application)	
				
			for (taskCount : 1 ..< rng.nextInt(taskCountMin, taskCountMax + 1) + 1) {	
				val task = factory.createTask
				task.name = '''Task_«appCount».«taskCount»'''
				application.tasks.add(task)						
			}

					
		}	

		/* Creating the hardware tree */
		for (compCount : 1 ..< rng.nextInt(compCountMin, compCountMax + 1) + 1) {
			val compartment = factory.createCompartment
			compartment.name = '''Compartment_«compCount»'''
			assistModel.compartments.add(compartment)

			for (boxCount : 1 ..< rng.nextInt(boxCountMin, boxCountMax + 1) + 1) {
				val box = factory.createBox
				box.name = '''Box_«compCount».«boxCount»'''
				compartment.boxes.add(box)
				
				for (boardCount : 1 ..< rng.nextInt(boardCountMin, boardCountMax + 1) + 1) {
					val board = factory.createBoard
					board.name = '''Board_«compCount».«boxCount».«boardCount»'''
					box.boards.add(board)
			
					for (procCount : 1 ..< rng.nextInt(procCountMin, procCountMax + 1) + 1) {
						val processor = factory.createProcessor
						processor.name = '''Processor_«compCount».«boxCount».«boardCount».«procCount»'''
						board.processors.add(processor)			
						
						for (coreCount : 1 ..< rng.nextInt(coreCountMin, coreCountMax + 1) + 1) {
							val core = factory.createCore
							core.name = '''Core_«compCount».«boxCount».«boardCount».«procCount».«coreCount»'''
							processor.cores.add(core)														
						}
					}
				}	
			}
		}

		val resSet = new ResourceSetImpl
		val resource = resSet.createResource(URI.createURI("test.mdsl"))
		resource.contents.add(assistModel)
		
		return assistModel
	}
}