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

			val ifaceList			 	= model.eqInterfaces.filter[typeSet.contains(ioType)] 
			val locVarList				= ifaceList.map[solverVariables.getEqInterfaceLocationVariable(it, HardwareArchitectureLevelType.PIN)]
			val compatiblePinIndizes 	= model.pins.filter[typeSet.contains(eqInterfaceType)].map[model.pins.indexOf(it)]

			// Restrict all eqInterfaces of this type to compatible pinInterfaces
			for (locVar : locVarList) 
				solver.post(ICF.member(locVar, compatiblePinIndizes))

			// Enforce an allDifferent for these interfaces	(only one pin for each interface)		
			solver.post(ICF.alldifferent(locVarList))			

			// Restrict all eqInterfaces to pins with a compatible protection level
			for (iface : ifaceList) {
				//  - Retrieve list of allowed pins (filter according to protection level)
				val allowedPinIndizes = compatiblePinIndizes.filter[filterPinsForProtectionLevel(iface, 
																								model.pins.get(it).connector.rdc, 
																								model.pins.get(it).protectionLevel)]
				//  - Post a member constraint
				solver.post(ICF.member(solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.PIN), 
									   allowedPinIndizes))
			}
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
