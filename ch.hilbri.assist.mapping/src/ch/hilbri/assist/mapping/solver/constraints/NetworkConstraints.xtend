package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.LCF
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.VF
import org.slf4j.LoggerFactory
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.networks.NetworkHasInsufficientBandwidth

class NetworkConstraints extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("network", model, solver, solverVariables)
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
		 * Distinguish between virtual networks (board local, shared memory only) and real networks
		 */
		
		val indicesOfVirtualNetworks = model.networks.filter[isIsBoardLocal].map[model.networks.indexOf(it)]
		
		for (commRelation : model.communicationRelations) {
			
			// Get the deployment variable for this communication relation
			val commRelVar = solverVariables.getCommunicationRelationLocationVariable(commRelation)
			
			// This is a constraints which is used to check whether commRelation is NOT deployed to a virtual Network (board local)
			val deploymentToRealNetworkConstraint = ICF.not_member(commRelVar, indicesOfVirtualNetworks)
			
			// If it is deployed to a real network, we have to make sure, at least two different boards are used ("to make it real")
			val allLocationVariablesOfCommRelation = commRelation.allThreads.map[solverVariables.getThreadLocationVariable(it, HardwareArchitectureLevelType.BOARD.value)]
			val useAtLeastTwoBoardsForRealNetworkDeploymentConstraint = ICF.atleast_nvalues(allLocationVariablesOfCommRelation, VF.fixed(2, solver), true) 

			// automatically posted to the solver			
			LCF.ifThen(deploymentToRealNetworkConstraint,useAtLeastTwoBoardsForRealNetworkDeploymentConstraint)
			
		}
		
		/*
		 * STEP 4)
		 * 
		 * Impose restrictions on the placement from communication relations to networks
		 * in order to obey bandwidth restrictions for REAL networks only
		 */
		
		for (network : model.networks.filter[isIsBoardLocal == false]) {
		
			val factorList = new ArrayList<BoolVar>
			val bandwidthUtilizationList = new ArrayList<Integer>()
			
			for (commRelation : model.communicationRelations) {
				val commRelVar = solverVariables.getCommunicationRelationLocationVariable(commRelation)
				val constraint = ICF.arithm(commRelVar, "=", model.networks.indexOf(network))
				val delta      = constraint.reif
				
				factorList.add(delta)
				bandwidthUtilizationList.add(commRelation.bandwidthUtilization)
			}
			
			
			solver.post(ICF.scalar(factorList, bandwidthUtilizationList, "=", solverVariables.getAbsoluteBandwidthUtilizationVariable(network))) 
		
			try { solver.propagate	}
			catch (ContradictionException e) {
				throw new NetworkHasInsufficientBandwidth(this, network)
			}
		}
		
		propagate()
		
		return true
	}
	
}