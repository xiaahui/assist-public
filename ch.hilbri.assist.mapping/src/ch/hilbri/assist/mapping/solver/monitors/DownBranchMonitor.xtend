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
	private IntVar[] locationVariablesPin
	private IntVar[] locationVariablesCon
	private Logger logger
	private int bestProgressPin = 0
	private int bestProgressCon = 0
	private AssistModel model
	
	private IntVar[] instantiatedPinVars
	private IntVar[] instantiatedConVars
	
	new(SolverVariablesContainer p_solverVariables, AssistModel p_model) {
		solverVariables = p_solverVariables
		locationVariablesPin = solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN)
		locationVariablesCon = solverVariables.getLocationVariables(HardwareArchitectureLevelType.CONNECTOR)
		logger = LoggerFactory.getLogger(this.class)
		instantiatedPinVars = locationVariablesPin.filter[instantiated]
		instantiatedConVars = locationVariablesCon.filter[instantiated]
		model = p_model
	}
	
	def calculateProgress() {
		
		val instantiatedPinVarCount = locationVariablesPin.filter[instantiated].size
		val instantiatedConVarCount = locationVariablesCon.filter[instantiated].size  
		val currentProgressPinLevel = instantiatedPinVarCount * 100 / locationVariablesPin.length
		val currentProgressConLevel = instantiatedConVarCount * 100 / locationVariablesCon.length
		
		/* Only report progress if it actually changes by at least 1% */
		if (Math.abs(currentProgressPinLevel - bestProgressPin) >= 1 || Math.abs(currentProgressConLevel - bestProgressCon) >= 1) {
			logger.info('''Search progress: «String::format("%4d", instantiatedConVarCount)» / «locationVariablesCon.length» (= «String::format("%3d", currentProgressConLevel)»%) of all CONNECTOR location variables are mapped''')
			logger.info('''                 «String::format("%4d", instantiatedPinVarCount)» / «locationVariablesPin.length» (= «String::format("%3d", currentProgressPinLevel)»%) of all PIN location variables are mapped''')

			bestProgressPin = currentProgressPinLevel
			bestProgressCon = currentProgressConLevel
			
			val curInstantiatedVars = locationVariablesPin.filter[instantiated]
			val newVars = curInstantiatedVars.filter[!instantiatedPinVars.contains(it)]
			
			logger.info('''                 . instantiated vars = «newVars.size» (during last step)''')
			logger.info('''                   [«FOR v : newVars»«IF v != newVars.head», «ENDIF»«solverVariables.getEqInterfaceForLocationVariable(v).name» -> Pin «model.pins.get(v.value).name»)«ENDFOR»]''')

			instantiatedPinVars = curInstantiatedVars
			
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