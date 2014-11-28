package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.slf4j.LoggerFactory
import solver.Solver
import solver.constraints.ICF
import solver.variables.VF
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType

class NetworkConstraints extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("Network constraints", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class);
	}
	
	override generate() {
		
		/*
		 * STEP 1) 
		 * 
		 * LocationVariables for all communication relations have already been created as 
		 * part of the solver variables class
		 */
		 
		  
		/* STEP 2)
		 * 
		 * LocationVariables for all communication relations have to be linked to the
		 * locationVariables of all comprised threads (board level), so that the placement
		 * to a network affects the placement to boards
		 */
		
		
		val tableFromXToNetwork = new ArrayList<Integer>
		for (network : model.networks)
			for (board : network.boards)  
				tableFromXToNetwork.add(model.networks.indexOf(network))
		
		val tableFromXToBoard = new ArrayList<Integer>
		for (network : model.networks)
			for (board : network.boards)  
				tableFromXToBoard.add(model.allBoards.indexOf(board))
							
		
		for (commRelation : model.communicationRelations) {
			for (thread : commRelation.allThreads) {
				// Create the link between LocVar_g (commRelation) and
				// LocVar_t_i^2 (location variable of the thread on the board level)
				
				// Step a)
				val commRelVar   = solverVariables.getCommunicationRelationLocationVariable(commRelation)
				val xVar = VF.enumerated("X", 0, tableFromXToNetwork.size - 1, solver)
				solver.post(ICF.element(commRelVar, tableFromXToNetwork, xVar))

				// Step b)
				val LocVar = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD.value)
				solver.post(ICF.element(LocVar, tableFromXToBoard, xVar))				
			}			
		}

		/*
		 * STEP 3)
		 * 
		 * Impose restrictions on the placement from communication relations to networks
		 * in order to obey bandwidth restrictions
		 */
		
		return true
	}
	
}