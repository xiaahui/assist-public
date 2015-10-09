package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.search.loop.monitors.IMonitorSolution
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SolutionFoundMonitor implements IMonitorSolution {
	
	private Logger logger
	private int counter
	private AssistModel model
	private SolverVariablesContainer solverVariables
	
	// For backwards compatibility
	new() {
		this(null, null)
	}
	
	new(SolverVariablesContainer p_solverVariables, AssistModel p_model) {
		logger = LoggerFactory.getLogger(this.class)
		counter = 1
		model = p_model
		solverVariables = p_solverVariables
	}
	
	override onSolution() {
		
		if (model != null && solverVariables != null) {
			// Calculate current cable weight
			var double sum = 0
			val ifacesOnRDCLevel = solverVariables.getLocationVariables(HardwareArchitectureLevelType.RDC).filter[isInstantiated]
			for (rdc : model.rdcs) {
				val rdcIndex = model.rdcs.indexOf(rdc)
				val ifaceVarsOnCurrentRDCs = ifacesOnRDCLevel.filter[isInstantiatedTo(rdcIndex)]
				
				if (!ifaceVarsOnCurrentRDCs.nullOrEmpty && model.globalBlock.cableWeightDataBlock != null) {
					val ifacesOnCurrentRDC = ifaceVarsOnCurrentRDCs.map[solverVariables.getEqInterfaceForLocationVariable(it)]
					val weightedCableLengthForRDC = ifacesOnCurrentRDC
											.map[
												(Math.abs(it.resourceX - rdc.resourceX) +  // Retrieve the length
										     	Math.abs(it.resourceY - rdc.resourceY) +
											 	Math.abs(it.resourceZ - rdc.resourceZ))
											 	*
											 	model.globalBlock.cableWeightDataBlock.getCableWeight(ioType)	// Multiply by weight of this iotype
											]
											.reduce[p1, p2|p1+p2]
					sum+=weightedCableLengthForRDC
				}
			}
		
			logger.info('''Solution «counter» found with total cable weight of "«sum»"''')
		}
		
		else { 
			logger.info('''Solution «counter» found.''')
		}
		counter++
	}
	
}