package ch.hilbri.assist.scheduling.results

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult
import ch.hilbri.assist.scheduling.model.ModelFactory
import java.util.HashMap
import java.util.List

class ResultFactoryFromSolverSolutions {
	
//	private static Logger logger = LoggerFactory.getLogger(ResultFactoryFromSolverSolutions)

	static def List<AssistModelSchedulingResult> create(AssistModelScheduling assistModel) {

		val f = ModelFactory.eINSTANCE
	
		/* Create a dummy result for one or two tasks */
		val result = f.createAssistModelSchedulingResult => [
			model = assistModel
			schedule = new HashMap
			
			val task = assistModel.allTasks.head
			val task_schedule = #[
				f.createTaskExecutionInstance => [begin = 1; end = 5],
				f.createTaskExecutionInstance => [begin = 7; end = 10],
				f.createTaskExecutionInstance => [begin = 11; end = 14],
				f.createTaskExecutionInstance => [begin = 17; end = 18]
			]
			schedule.put(task, task_schedule)				
		
			if (assistModel.allTasks.head != assistModel.allTasks.last) {
				val task2 = assistModel.allTasks.last
				val task2_schedule = #[
					f.createTaskExecutionInstance => [begin = 1; end = 12],
					f.createTaskExecutionInstance => [begin = 14; end = 22]
				]
				schedule.put(task2, task2_schedule)				
			}
		]
		
		return #[result]
	}
}
