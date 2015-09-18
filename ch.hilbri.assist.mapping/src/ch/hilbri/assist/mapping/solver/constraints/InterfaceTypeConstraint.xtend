package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.ProtectionLevelType
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import java.util.Set
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.variables.VF
import org.jgrapht.alg.ConnectivityInspector
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.SimpleGraph
import org.slf4j.LoggerFactory

class InterfaceTypeConstraint extends AbstractMappingConstraint {
	
	/* Member fields */
	private CompatibleInterfaceTypeGraph ifaceTypeGraph
	
	/* Constructor */
	new(AssistModel p_model, Solver p_solver, SolverVariablesContainer p_solverVariables) {
		super("(configurable) interface type", p_model, p_solver, p_solverVariables)
		logger 			= LoggerFactory.getLogger(this.class)
		ifaceTypeGraph 	= new CompatibleInterfaceTypeGraph(model)
	}

	override generate() {

		for (typeSet : ifaceTypeGraph.connectedSets) {

			// This is a list of all interfaces that we have to work with in this loop
			val ifaceList			 	= model.eqInterfaces.filter[typeSet.contains(ioType)] 
			
			// This is the list of solver variables for the interfaces above
			val locVarList				= ifaceList.map[solverVariables.getEqInterfaceLocationVariable(it, HardwareArchitectureLevelType.PIN)].toList
			
			// This is list of all compatible pins for the interfaces, 
			// if we just look at the eqInterfaceType
			val typeCompatiblePinIndizes 	= model.pins.filter[typeSet.contains(eqInterfaceType)].map[model.pins.indexOf(it)]

			// Restrict all eqInterfaces to pins with a compatible protection level
			for (iface : ifaceList) {
				//  - Retrieve list of allowed pins (filter according to protection level)
				val protLevelCompatiblePinIndizes = typeCompatiblePinIndizes.filter[filterPinsForProtectionLevel(iface, 
																								model.pins.get(it).connector.rdc, 
																								model.pins.get(it).protectionLevel)]
				//  - Post a member constraint
				solver.post(ICF.member(solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.PIN), 
									   protLevelCompatiblePinIndizes))
			}
			
			// Now we need to look at the connected pins
			for (rdc : model.RDCs.filter[internalConnectedPinBlock != null && !internalConnectedPinBlock.connectedPins.nullOrEmpty]) {
				// We just work with connected pins relevant for the current interface types
				// ASSUMPTION: all connected pins have the same type / or they are in the same typeSet
				for (entry : rdc.internalConnectedPinBlock.connectedPins.filter[typeSet.contains(pins.get(0).eqInterfaceType)]) {
					
					// Which indizes are connected in this entry?
					val pinIndizes = entry.pins.map[model.pins.indexOf(it)]
					
					// Create n-1 pseudo interfaces
					val pseudoInterfaces = VF.enumeratedArray("PseudoIfaces", pinIndizes.size-1, pinIndizes, solver)
					
					// Add these to the locVarList so that we can enforce an allDifferent later
					locVarList.addAll(pseudoInterfaces)
				}
			}
			
			// Finally, we can enforce an AllDifferent Constraint
			solver.post(ICF.alldifferent(locVarList, "AC"))
		}

		true
	}
	
	private def boolean filterPinsForProtectionLevel(EqInterface iface, RDC rdc, ProtectionLevelType pinProtectionLevel) {

		// no additional pin restrictions?
		if (model.protectionLevelData == null) 
			return true 
		
		val protLevelRequirements = model.globalBlock.protectionLevelDataBlock.protectionLevelEntries.
										filter[emhZone1 == iface.emhZone1 && rdcLocation == rdc.location]
		
		// does this mapping require special treatment?
		if (protLevelRequirements.nullOrEmpty)
			return true 
		
		// we do need to look at the requirements and check the compatibility
		// of the protection level
		else {
			for (req : protLevelRequirements)
				for (level : req.protectionLevel) 
					if (level == pinProtectionLevel) 
						return true
							
		}
		
		return false
	}
}

/**
 * This specialized graph encapsulates everything that is needed to build
 * a graph for all interface types
 */
class CompatibleInterfaceTypeGraph extends SimpleGraph<String, DefaultEdge> {
	new (AssistModel p_model) {
		super(DefaultEdge)
		
		// 1. Add all types (no configurable pins yet)
		for (type : p_model.eqInterfaceTypes) 
			addVertex(type)	
		
		// 2. Add all configurable pin types 
		if (p_model.compatibleIoTypes != null) {
			for (entry : p_model.compatibleIoTypes) {
			
				// Do we already have the left side in our graph?
				if (!p_model.eqInterfaceTypes.contains(entry.eqInterfaceIoType)) 
					addVertex(entry.eqInterfaceIoType)
				
				// Go through all right side entries
				for (compatibleType : entry.pinInterfaceIoTypes) {
					if (!p_model.eqInterfaceTypes.contains(compatibleType))
						addVertex(compatibleType)
				
					addEdge(entry.eqInterfaceIoType, compatibleType)
				}
			}
		}
	}
	
	/** Returns a list of sets of strings which represent connected interface types */
	def List<Set<String>> getConnectedSets() {
		val inspector = new ConnectivityInspector(this)
		inspector.connectedSets
	}
}
