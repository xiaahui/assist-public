package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import org.chocosolver.solver.Model
import org.chocosolver.solver.constraints.^extension.Tuples

class SystemHierarchyConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("system hierarchy", model, chocoModel, solverVariables)
	}

	override generate() {
		
		// Building a table constraint for each layer in the location hierarchy

		val tuples = new Tuples(true)
		
		for (int coreIdx : 0 ..< model.allCores.length) {
		
			val core = model.allCores.get(coreIdx)
			val processor = core.processor
			val board = processor.board
			val box = board.box
			val compartment = box.compartment
			
			val processorIdx = model.allProcessors.indexOf(processor)
			val boardIdx = model.allBoards.indexOf(board)
			val boxIdx = model.allBoxes.indexOf(box)
			val compartmentIdx = model.allCompartments.indexOf(compartment)
		
			tuples.add(#[coreIdx, processorIdx, boardIdx, boxIdx, compartmentIdx])
		}

		// building table constraints reflecting the location hierarchy		

		for (t : model.allTasks) {
			val varList = solverVariables.getLocationVariablesForTask(t)			
			chocoModel.table(varList, tuples, "GAC3rm+").post
		}		

		propagate()

		return true
	}

}
