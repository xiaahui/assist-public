package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.MappingResult

class DeploymentAsText {
   def static String generate(MappingResult result) {
    '''
    Mapping Result: «result.name»
     
    «FOR task : result.model.allTasks»
    Task «task.fullName» --> «result.task2CoreMap.get(task).fullName»
    «ENDFOR»
    
    '''
   } 
}