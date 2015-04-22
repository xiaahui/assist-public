package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedColocally
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.eclipse.emf.common.util.BasicEList

class ImprovedColocalitiesConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("improved interface colocality (on same)", model, solver, solverVariables)
	}
	
	override generate() {
		
		var atLeastOneConstraintWasPosted = false
		
		for (r : model.colocalityRelations) {
				
			// Which io types are requested by all interfaces in this relation?
			val requestedIoTypes = r.allInterfaces.map[it.ioType].toSet.toList
				
			// How many interfaces are required on the connectors for each type?
			val reqCapacitiesPerIoType = requestedIoTypes.map[
				val t = it
				r.allInterfaces.filter[it.ioType.equals(t)].length
			]

			if (r.hardwareLevel == HardwareArchitectureLevelType.CONNECTOR) {
	
				// Get a list of connectors having sufficient IO interfaces
				val validConnectors = model.allConnectors.filter[
					val availCapacitiesPerIoType = it.getAvailableEqInterfaces(new BasicEList<String>(requestedIoTypes)).toList
					val remainingCapacitiesPerIoType = availCapacitiesPerIoType.map[it - reqCapacitiesPerIoType.get(availCapacitiesPerIoType.indexOf(it))]	
					
					if (remainingCapacitiesPerIoType.min >= 0) 	true
					else 										false 					
				]
				
				val validConnectorsIndizes = validConnectors.map[model.allConnectors.indexOf(it)]
				
				for (iface : r.allInterfaces) {
					val ifaceVar = solverVariables.getEqInterfaceLocationVariable(iface, 0)
					solver.post(ICF.member(ifaceVar, validConnectorsIndizes))
					atLeastOneConstraintWasPosted = true
				}
			
			} // end if connector
			
			else if (r.hardwareLevel == HardwareArchitectureLevelType.RDC) {
				
				// Get a list of RDCs having sufficient IO interfaces
				val validRDCs = model.allRDCs.filter[
					val availCapacitiesPerIoType = it.getAvailableEqInterfaces(new BasicEList<String>(requestedIoTypes)).toList
					val remainingCapacitiesPerIoType = availCapacitiesPerIoType.map[it - reqCapacitiesPerIoType.get(availCapacitiesPerIoType.indexOf(it))]	
					
					if (remainingCapacitiesPerIoType.min >= 0) 	true
					else 										false 					
				]
				
				val validRDCIndizes = validRDCs.map[model.allRDCs.indexOf(it)]
				
				for (iface : r.allInterfaces) {
					val ifaceVar = solverVariables.getEqInterfaceLocationVariable(iface, 1)
					solver.post(ICF.member(ifaceVar, validRDCIndizes))
					atLeastOneConstraintWasPosted = true
				}
			
			} // end if RDC
			
			else if (r.hardwareLevel == HardwareArchitectureLevelType.COMPARTMENT) {
				
				// Get a list of COMPARTMENTs having sufficient IO interfaces
				val validCompartments = model.compartments.filter[
					val availCapacitiesPerIoType = it.getAvailableEqInterfaces(new BasicEList<String>(requestedIoTypes)).toList
					val remainingCapacitiesPerIoType = availCapacitiesPerIoType.map[it - reqCapacitiesPerIoType.get(availCapacitiesPerIoType.indexOf(it))]	
					
					if (remainingCapacitiesPerIoType.min >= 0) 	true
					else 										false 					
				]
				
				val validCompartmentIndizes = validCompartments.map[model.allCompartments.indexOf(it)]
				
				for (iface : r.allInterfaces) {
					val ifaceVar = solverVariables.getEqInterfaceLocationVariable(iface, 2)
					solver.post(ICF.member(ifaceVar, validCompartmentIndizes))
					atLeastOneConstraintWasPosted = true
				}
			} // if compartment 
			
			else {
				/* fail */
			}
			
			try { solver.propagate }
			catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedColocally(this, r.allEqInterfaceOrGroupNames, r.hardwareLevel.literal) }
		
		} // for relation

		atLeastOneConstraintWasPosted
	}
}