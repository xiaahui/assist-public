package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.Task
import java.util.Map.Entry
import org.eclipse.emf.ecore.util.EcoreUtil

class DeploymentAsSchedulingModel {
	
	static def AssistModel create(MappingResult mappingResult) {
		val oldModel = mappingResult.getModel
		val clonedModel = EcoreUtil.copy(oldModel)
	
		// Give the new model a better name
		clonedModel.systemName = oldModel.systemName + " - Mapping Solution XXX"	
	
		// Remove attributes from the mapping which are no longer used in scheduling
		for (task : clonedModel.allTasks) {
			task.coreUtilization = 0 // set to default value
		}

        // Deployment Restrictions are also not supported in the scheduling spec - delete them
        for (app : clonedModel.applications) {
            app.restrictMappingToHardwareElements.clear
            for (task : app.tasks)
                task.restrictMappingToHardwareElements.clear
        }

		// Remove all relations
		clonedModel => [
			dislocalityRelations.clear
			colocalityRelations.clear
			dissimilarityRelations.clear
		]		
	
		// Now we apply the mapping result to the model
		for (Entry<Task, Core> entry : mappingResult.getTask2CoreMap.entrySet) {
			val task = entry.key
			val taskIdx = oldModel.allTasks.indexOf(task)
			val core = entry.value
			val coreIdx = oldModel.allCores.indexOf(core)
			val periodValue = 20
			val taskDuration = Math.round(Math.floor(new Double(task.coreUtilization) / new Double(core.coreCapacity) * periodValue)) as int 
			
			
			// Here we assume that despite the object cloning, the index of the cores and tasks
			// stays constant --> otherwise we would have to implement the Result in EMF reference manner
			// in order to benefit from automatic copying mechanisms
			val clonedTask = clonedModel.allTasks.get(taskIdx)
			clonedTask => [
				assignedCore 	= clonedModel.allCores.get(coreIdx)
				period			= periodValue
				duration			= taskDuration
			]
		}
		return clonedModel
	}
}
