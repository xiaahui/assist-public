package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.ProtectionLevelType
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceTypeCouldNotBeMapped
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceTypeDemandExceedsSupply
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import java.util.Set
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.jgrapht.alg.ConnectivityInspector
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.SimpleGraph
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ConfigurablePinInterfaceTypeConstraint extends AbstractMappingConstraint {
	private Logger logger
	private SimpleGraph<String, DefaultEdge> graph
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface type with configurable pins", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class)
		createGraphFromInput
	}
	
	override generate() {
		
		for (types : allConnectedSetsFromGraph) {
				
				// How many pins of a compatible io type does each connector offer? (no protection level yet)	
				val compatiblePinSupplyPerConnector = model.allConnectors.map[
														if (!availableEqInterfaces.filter[eqInterfaceType.multipleEquals(types)].isNullOrEmpty)
															 availableEqInterfaces.filter[eqInterfaceType.multipleEquals(types)].map[count].reduce[p1, p2|p1 + p2]
														else 
															0]
														
				// A list of all interfaces of the current type														
				val interfacesOfTypeIterator 	= model.eqInterfaces.filter[ioType.multipleEquals(types)]
			
				// 	How many interfaces of the current type are requested?
				val totalDemand 				= interfacesOfTypeIterator.length
			
				// How many pins are connected?
				var connectedPinCount = model.allRDCs.map[connectedPins.filter[pins.get(0).eqInterfaceType.multipleEquals(types)]
											                   .map[pins.length - 1]]
															   .flatten
															   .reduce[p1, p2|p1+p2]

				if (connectedPinCount == null) connectedPinCount = 0;
				
				// How many interfaces of the current type are available? (ignoring connected pins)
				val totalSupply = compatiblePinSupplyPerConnector.reduce[p1, p2|p1+p2] 
				
				// Check that the supply is sufficient for the demand (now we check including connected pins)
				if (totalDemand > totalSupply - connectedPinCount)
					throw new InterfaceTypeDemandExceedsSupply(this, types.toList, totalDemand, totalSupply - connectedPinCount)
					

				// A list of all interface indices with the current type
				val int[] indexListOfAffectedInterfaces = interfacesOfTypeIterator.map[model.eqInterfaces.indexOf(it)]
				
				// building allowed tuples 
				val tuples = new Tuples(true) // true = valid tuples
				var int pinIdx = 0
				for (int connIdx : 0 ..< model.allConnectors.length) {
					for (int pin : 0 ..< compatiblePinSupplyPerConnector.get(connIdx)) {
						tuples.add(connIdx, pinIdx)
						pinIdx++						
					}
				}
			
				val connectorLocationVars = indexListOfAffectedInterfaces.map[solverVariables.getLocationVariables(0).get(it)]
				val pinLocationVars = new ArrayList<IntVar>
			
				// 	building table constraints reflecting the location hierarchy		
				for (locVar : connectorLocationVars) {
					val pinVar = VF.enumerated("Pin-"+locVar.name, 0, totalSupply-1, solver) // Pin-variable which is like a connector variables ranging over all pins of this type
					solver.post(ICF.table(locVar, pinVar, tuples, ""))
					pinLocationVars.add(pinVar)
					
					// until now, every compatible eqInterface can be placed on any compatible pin
						
					// Now we have to restrict pin variable in order to implement rules for the protection level
					val validPinIndizes = getValidPinIndizes(solverVariables.getInterfaceForLocationVariable(locVar), types)
					if (validPinIndizes != null) {
						solver.post(ICF.member(pinVar, validPinIndizes))
					}
				}
	
				// Durchgeschaltete Pins (connected pins) BEGIN
				
				// Look at RDCs having a connected pins specification only
				for (rdc : model.allRDCs.filter[!connectedPins.nullOrEmpty])
					
					// Look at connected pin specifications which are contained in the current type selection
					// ASSUMPTION: all pins within the same specification have an identical io type 
					for (connPinEntry : rdc.connectedPins.filter[pins.get(0).eqInterfaceType.multipleEquals(types)]) {
						
						// which pins (indizes) are connected?
						val indizes = model.allConnectors
												.filter[!availableEqInterfaces.filter[eqInterfaceType.multipleEquals(types)].isNullOrEmpty]
												.map[availableEqInterfaces.filter[eqInterfaceType.multipleEquals(types)]
																		  .map[ availEqIfaces | newArrayOfSize(availEqIfaces.count).map[availEqIfaces]]
																		  .flatten]

												.flatten
												.indexed
												.filter[connPinEntry.pins.contains(value)]
												.map[key]
	
						
						// create n-1 pseudo interfaces
						val pseudoInterfaces = VF.enumeratedArray("PseudoInterfaces", indizes.size-1, indizes, solver)
						
						// add them to the list of pinLocationVars
						pinLocationVars.addAll(pseudoInterfaces)
					}
				// Durchgeschaltete Pins (connected pins) END
	
				solver.post(ICF.alldifferent(pinLocationVars, "AC")) // Pins must not share a single type offered --> this realizes the sum constraint for each connector
				
				try { solver.propagate } 
				catch (ContradictionException e) { throw new InterfaceTypeCouldNotBeMapped(this, types.toList) }
		}
		
		true
	}
	
	private def List<Integer> getValidPinIndizes(EqInterface iface, Set<String> types) {
		
		val validPins = model.allConnectors
								// Retrieve all connectors having at least one type compatible pin
								.filter[!availableEqInterfaces.filter[eqInterfaceType.multipleEquals(types)].isNullOrEmpty]
										
								// Expand all availableEqInterfaces to get a list of all pins
								.map[ con |
											con.availableEqInterfaces.filter[eqInterfaceType.multipleEquals(types)]
																	 .map[ availEqIface |
																		 	newIntArrayOfSize(availEqIface.count)
																		 		.map[new Pair<RDC, ProtectionLevelType>(con.rdc, availEqIface.protectionLevel)]
																		 ]
																	 .flatten
									]
												
								// for each type compatible pin, we should now have a list of pairs comprising
								// of its rdc and protection level [<rdc1, level>, <rdc1, level>, ...] 
								.flatten
												
								// No we get the index [<0, <rdc1, level>>, <1, <rdc1, level>>, ...]
								.indexed		

								// Now we filter for allowed pins
								.filter[filterPinAccordingToProtectionLevel(iface, value.key, value.value)]
		
								// we just want the indizes
								.map[key]
								
								// as a list
								.toList

		return validPins
	}
	
	private def boolean filterPinAccordingToProtectionLevel(EqInterface iface, RDC rdc, ProtectionLevelType pinProtectionLevel) {

		// no additional pin restrictions?
		if (model.protectionLevelData == null) 
			return true 
		
		val protLevelRequirements = model.protectionLevelData.protectionLevelEntries.filter[emhZone1.equals(iface.emhZone1) && 
										      		  										rdcLocation.equals(rdc.location)]
		
		// does this mapping require special treatment?
		if (protLevelRequirements.nullOrEmpty)
			return true 
		
		// we do need to look at the requirements and check the compatibility
		// of the protection level
		else {
			for (req : protLevelRequirements)
				for (level : req.protectionLevel) {
					if (level == pinProtectionLevel) return true
				}			
		}
		
		return false
		 
	}
	
	
	private def boolean multipleEquals(String value, Set<String> types) {
		for (type : types)
			if (value.equals(type)) return true
		
		return false
	}
	
	
	private def List<Set<String>> getAllConnectedSetsFromGraph() {
		val inspector = new ConnectivityInspector(graph)
		return inspector.connectedSets 
	}
	
	private def void createGraphFromInput() {
		graph = new SimpleGraph<String, DefaultEdge>(DefaultEdge)
		
		val eqInterfaceIoTypes = model.eqInterfaces.map[it.ioType].toSet.toList 
		
		// 1. Add all types (no configurable pins yet)
		for (type : eqInterfaceIoTypes) {
			graph.addVertex(type)	
		}
		
		// 2. Add all configurable pin types 
		for (entry : model.compatibleIoTypes) {
			
			// Do we already have the left side in our graph?
			if (!eqInterfaceIoTypes.contains(entry.eqInterfaceIoType)) 
				graph.addVertex(entry.eqInterfaceIoType)
				
			// Go through all right side entries
			for (compatibleType : entry.pinInterfaceIoTypes) {
				if (!eqInterfaceIoTypes.contains(compatibleType))
					graph.addVertex(compatibleType)
				
				graph.addEdge(entry.eqInterfaceIoType, compatibleType)
			}
		}
	}
	
	
}