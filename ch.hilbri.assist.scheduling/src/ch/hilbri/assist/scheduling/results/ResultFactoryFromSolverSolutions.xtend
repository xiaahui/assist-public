package ch.hilbri.assist.scheduling.results

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult
import ch.hilbri.assist.scheduling.model.ModelFactory
import java.util.HashMap

class ResultFactoryFromSolverSolutions {
	
//	private static Logger logger = LoggerFactory.getLogger(ResultFactoryFromSolverSolutions)

	static def AssistModelSchedulingResult create(AssistModelScheduling assistModel) {

		val f = ModelFactory.eINSTANCE
		val result = f.createAssistModelSchedulingResult => [
			model = assistModel
			
			val task = assistModel.allTasks.head
			val task_schedule = #[
				f.createTaskExecutionInstance => [begin = 1; end = 5],
				f.createTaskExecutionInstance => [begin = 6; end = 10],
				f.createTaskExecutionInstance => [begin = 11; end = 14],
				f.createTaskExecutionInstance => [begin = 15; end = 18]
			]
		
			schedule = new HashMap
			schedule.put(task, task_schedule)				
		]
		return result
	}
}
