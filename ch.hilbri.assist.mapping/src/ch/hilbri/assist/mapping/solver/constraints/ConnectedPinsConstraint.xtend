package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
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

/**
 * This constraint ensures that connected pins are properly handled
 * and it also ensures that each pin is only assigned max. 1 interface
 * 
 * - connected pins are handled by adding "virtual interfaces"
 *   which are only allowed to fill up the "unused pins" 
 * 
 * - assigning max. 1 interfaces is achieved by enforcing an alldiffernt
 *   constraint; however, it is not enforced for ALL variables at the same time
 *   due to performance penalties; therefore we try to split the set of all pins 
 *   into smaller sets which can be treated independently  
 */
class ConnectedPinsConstraint extends AbstractMappingConstraint {

	/* Member fields */
	private CompatibleInterfaceTypeGraph pinTypes
	
	/* Constructor */
	new(AssistModel p_model, Solver p_solver, SolverVariablesContainer p_solverVariables) {
		super("connected pins", p_model, p_solver, p_solverVariables)
		logger 			= LoggerFactory.getLogger(this.class)
		pinTypes 		= new CompatibleInterfaceTypeGraph(model)
	}
	
	
	override generate() {
		
		// We go through every set of pin types	
		for (pinTypeSet : pinTypes.connectedSets) {
			
			// Find all variables of interfaces which may use these pins
			val ifaceTypes = model.eqInterfaceTypes.filter[pinTypeSet.containsAll(model.getCompatiblePinTypes(it))].toList
			val ifaceList  = model.eqInterfaces.filter[ifaceTypes.contains(ioType)]
			val locVarList = ifaceList.map[solverVariables.getEqInterfaceLocationVariable(it, HardwareArchitectureLevelType.PIN)].toList
			
			// Add variables for connected pins
			for (rdc : model.rdcs.filter[internalConnectedPinBlock != null && !internalConnectedPinBlock.connectedPins.nullOrEmpty]) {
				// We just work with connected pins relevant for the current pin types
				// ASSUMPTION: all connected pins have the same type / or they are in the same typeSet
				for (entry : rdc.internalConnectedPinBlock.connectedPins.filter[pinTypeSet.contains(pins.get(0).eqInterfaceType)]) {
					
					// Which indizes are connected in this entry?
					val pinIndizes = entry.pins.map[model.pins.indexOf(it)]
					
					// Create n-1 pseudo interfaces
					val pseudoInterfaces = VF.enumeratedArray("PseudoIfaces", pinIndizes.size-1, pinIndizes, solver)
					
					// Add these to the locVarList so that we can enforce an allDifferent later
					locVarList.addAll(pseudoInterfaces)
				}
			}
			
			// Finally, we can enforce an AllDifferent Constraint for the current subset
			solver.post(ICF.alldifferent(locVarList, "AC"))
			
		}
	
		true
		
	}
	
}

/**
 * This specialized graph encapsulates everything that is needed to build
 * a graph for all pin types which are jointly used 
 * (or better: which cannot be treated independently)
 * 
 * Approach: we go through every type and retrieve the list of compatible types
 *           (this includes the "original" type)
 * 		     then we add a node for each type and add an edge to the "original" type
 *           
 * Result:  a graph with the pin types as nodes and edges between the nodes if these
 *          types have to be mapped "together" 
 *          (only nodes with no edges can be mapped independently!)
 */
class CompatibleInterfaceTypeGraph extends SimpleGraph<String, DefaultEdge> {
	new (AssistModel model) {
		super(DefaultEdge)
		
		for (type : model.eqInterfaceTypes) {
			val compatiblePinTypes = model.getCompatiblePinTypes(type)
			for (pinType : compatiblePinTypes) {
				addVertex(pinType)
				if (pinType != compatiblePinTypes.head) 
					addEdge(pinType, compatiblePinTypes.head)
			} 
		} 
	}
	
	/** Returns a list of sets of strings which represent connected interface types */
	def List<Set<String>> getConnectedSets() {
		val inspector = new ConnectivityInspector(this)
		inspector.connectedSets
	}
}
