package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.ModelFactory
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.io.IOException
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.resource.SaveOptions
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DownBranchMonitor implements IMonitorDownBranch {
	
	private SolverVariablesContainer solverVariables
	private IntVar[] locationVariablesPin
	private IntVar[] locationVariablesCon
	private Logger logger
	private int bestProgress = 0
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
		
		val takeSnapshot = false
		
		if (takeSnapshot && currentProgressConLevel >= 100) {

			val consOfB07 = model.connectors.filter[rdc.name == "CRDC_B07"]
									  		.map[model.connectors.indexOf(it)]
									  		.toList
									  		
			val ifacesOfB07 = locationVariablesCon.filter[consOfB07.contains(value)]
												  .map[solverVariables.getEqInterfaceForLocationVariable(it)]
												  .toList

			// Remove all restrictions
			model.restrictionsBlock.colocalityRelations.clear
			model.restrictionsBlock.dislocalityRelations.clear
			model.restrictionsBlock.validDeployments.clear
			model.restrictionsBlock.invalidDeployments.clear

			// Add connector restrictions
			val f = ModelFactory.eINSTANCE
			for (iface : ifacesOfB07) {
				val vd = f.createValidDeployment
				vd.eqInterfaceOrGroups.add(iface)
				val con = model.connectors.get(solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.CONNECTOR).value)
				vd.hardwareElements.add(con)	
				model.restrictionsBlock.validDeployments.add(vd)
			}
			
			
			// Remove all other interfaces 
			model.interfacesBlock.eqInterfaces.removeAll(model.eqInterfaces.filter[!ifacesOfB07.contains(it)])			
			
			// Remove all interface groups
			model.interfaceGroupsBlock.eqInterfaceGroups.clear
			
			// Remove all other RDCs
			for (comp : model.compartmentsBlock.compartments) {
				val removableRDCs = comp.rdcs.filter[name != "CRDC_B07"].toList
				comp.rdcs.removeAll(removableRDCs)
			}
			
			// Remove empty compartments
			val removableComps = model.compartmentsBlock.compartments.filter[rdcs.isNullOrEmpty]
			model.compartmentsBlock.compartments.removeAll(removableComps)
			
			// Persist updated model
			val resSet = new ResourceSetImpl
			val resource = resSet.createResource(URI.createFileURI("C:\\ASSIST-Toolsuite\\Inputs\\Robert-partial.mdsl"))
			resource.contents.clear
			resource.contents.add(model)
	
			try {
				val opt = SaveOptions.newBuilder.format.options.toOptionsMap
				resource.save(opt)
			} catch (IOException e) {
				e.printStackTrace
			}		
		}
		
		
		/* Only report progress if it actually changes by at least 1% */
		if (true || Math.abs(currentProgressPinLevel - bestProgress) >= 1) {
			logger.info('''Search progress: «String::format("%4d", instantiatedConVarCount)» / «locationVariablesCon.length» (= «String::format("%3d", currentProgressConLevel)»%) of all CONNECTOR location variables are mapped''')
			logger.info('''                 «String::format("%4d", instantiatedPinVarCount)» / «locationVariablesPin.length» (= «String::format("%3d", currentProgressPinLevel)»%) of all PIN location variables are mapped''')

			bestProgress = currentProgressPinLevel
			
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