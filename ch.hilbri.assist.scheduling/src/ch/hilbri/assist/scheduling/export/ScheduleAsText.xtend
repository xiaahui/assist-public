package ch.hilbri.assist.scheduling.export

import ch.hilbri.assist.model.SchedulingResult

class ScheduleAsText {
   def static String generate(SchedulingResult result) {
    '''
	Mapping Results:
	«FOR task : result.model.allTasks» 
	Task «task.fullName» --> «task.assignedCore.fullName»
	«ENDFOR» 
	 
	Scheduling Results:		
	«FOR task : result.model.allTasks»
	Task «task.fullName»: {«FOR exec : result.schedule.get(task)»[«exec.begin», «exec.end»]«IF exec != result.schedule.get(task).last», «ENDIF»«ENDFOR»}
	«ENDFOR»
	'''
   } 
}
