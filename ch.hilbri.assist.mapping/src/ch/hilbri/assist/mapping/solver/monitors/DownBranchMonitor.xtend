package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DownBranchMonitor implements IMonitorDownBranch {
	
	private SolverVariablesContainer solverVariables
	private IntVar[] locationVariables
	private Logger logger
	private int bestProgress = 0
	private AssistModel model
	
	private IntVar[] instantiatedVars
	
	new(SolverVariablesContainer p_solverVariables, AssistModel p_model) {
		solverVariables = p_solverVariables
		locationVariables = solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN)
		logger = LoggerFactory.getLogger(this.class)
		instantiatedVars = locationVariables.filter[instantiated]
		model = p_model
	}
	
	def calculateProgress() {
		
		val instantiatedVarCount = locationVariables.filter[instantiated].size 
		val currentProgress = instantiatedVarCount * 100 / locationVariables.length
		
		/* Only report progress if it actually changes by at least 1% */
		if (Math.abs(currentProgress - bestProgress) >= 1) {
			logger.info('''Search progress: «String::format("%4d", instantiatedVarCount)» (= «currentProgress»%) of all location variables are mapped without violating any specification''')
			bestProgress = currentProgress
			
			val curInstantiatedVars = locationVariables.filter[instantiated]
			val newVars = curInstantiatedVars.filter[!instantiatedVars.contains(it)]
			
			logger.info('''                 . instantiated vars = «newVars.size» (during last step)''')
			logger.info('''                   [«FOR v : newVars»«IF v != newVars.head», «ENDIF»«solverVariables.getEqInterfaceForLocationVariable(v).name»«ENDFOR»]''')

			instantiatedVars = curInstantiatedVars
			
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
			
			logger.info('''                 . total cable weight = "«sum»" (of all currently mapped interfaces)''')
		}	
	}
	
	override afterDownLeftBranch() {
	}
	
	override afterDownRightBranch() {
	}
	
	override beforeDownLeftBranch() {
		calculateProgress
	}
	
	override beforeDownRightBranch() {
	}
	
}