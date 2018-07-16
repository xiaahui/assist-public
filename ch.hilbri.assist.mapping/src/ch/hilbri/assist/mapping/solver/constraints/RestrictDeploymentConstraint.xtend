package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.HardwareArchitectureLevelType
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Processor
import java.util.List
import org.chocosolver.solver.Model

class RestrictDeploymentConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("restrict deployment", model, chocoModel, solverVariables)
	}

	override generate() {
		var worked = false

		for (task : model.allTasks) {

			/* Check if we need to do anything - is at least one restriction specified? */
			if (!task.restrictMappingToHardwareElements.empty ||
				!task.application.restrictMappingToHardwareElements.empty) {

				/* Retrieve the list of valid cores */
				/* - application-level              */
				var List<Core> validCoresApplicationLevel
				if (task.application.restrictMappingToHardwareElements.empty)
					validCoresApplicationLevel = model.allCores
				else
					validCoresApplicationLevel = task.application.restrictMappingToHardwareElements.map[allCoresForHardwareElement].flatten.toList
			
				/* - task level */
				var List<Core> validCoresTaskLevel
				if (task.restrictMappingToHardwareElements.empty)
					validCoresTaskLevel = model.allCores
				else
					validCoresTaskLevel = task.restrictMappingToHardwareElements.map[allCoresForHardwareElement].flatten.toList

				/* Build the intersection between these two lists */
				val validCores = newArrayList()
				validCores.addAll(validCoresApplicationLevel)
				validCores.retainAll(validCoresTaskLevel)
				
				/* We need some valid cores - or we have to fail ... */
				if (validCores.empty)
					throw new BasicConstraintsException(this)
				
				/* Find the indizes of each valid core */
				val validCoreIdxs = validCores.map[model.allCores.indexOf(it)]
				
				/* Prepare to post a constraint for this restriction */
				val taskVar = solverVariables.getLocationVariableForTaskAndLevel(task, HardwareArchitectureLevelType.CORE)
				
				/* Post the constraint for this task variable */
				chocoModel.member(taskVar, validCoreIdxs).post()
				
				/* We did some work ... */
				worked = true
			}
		}

		propagate()
		
		return worked
	}

	private def List<Core> getAllCoresForHardwareElement(HardwareElement hwElem) {
		if (hwElem instanceof Compartment)
			hwElem.allCores
		else if (hwElem instanceof Box)
			hwElem.allCores
		else if (hwElem instanceof Board)
			hwElem.allCores
		else if (hwElem instanceof Processor)
			hwElem.allCores
		else if(hwElem instanceof Core) #[hwElem] else #[]
	}
}
