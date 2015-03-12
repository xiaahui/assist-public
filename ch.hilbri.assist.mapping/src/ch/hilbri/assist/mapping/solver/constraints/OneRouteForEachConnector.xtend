package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.VF
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import org.chocosolver.solver.constraints.Propagator
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.constraints.PropagatorPriority
import org.chocosolver.solver.variables.events.IntEventType
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.util.ESat

class OneRouteForEachConnector extends AbstractMappingConstraint {
	
	private static class ValueImplication extends Propagator<IntVar> {

		private int[] table

		new(IntVar[] varList, int[] table) {
			super(varList, PropagatorPriority.BINARY, true);
			this.table = table;
		}
		
	    override getPropagationConditions(int vIdx) {
	        return IntEventType.instantiation();
	    }
	
	    override propagate(int evtmask) throws ContradictionException {
	    	if (vars.get(0).instantiated) {
	    		propagate(0, 0)
	    	}
	    	if (vars.get(1).instantiated) {
	    		propagate(1, 0)
	    	}
	    }
	    
	    override propagate(int varIdx, int mask) throws ContradictionException {
	    	if (varIdx == 0) {
	    		vars.get(1).instantiateTo(table.get(vars.get(0).value), aCause)
	    	} else {
	    		val value = vars.get(1).value
	    		for (int idx: 0..<table.length) {
	    			if (table.get(idx) != value) {
	    				vars.get(0).removeValue(idx, aCause)
	    			}
	    		}
	    	}
	    }
					
		override isEntailed() {
	    	if (vars.get(0).instantiated && vars.get(1).instantiated) {
	    		if (vars.get(1).value == table.get(vars.get(0).value)) {
	    			return ESat.TRUE
	    		}
	    		return ESat.FALSE
		    }
			return ESat.UNDEFINED
		}	
			
	} 
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("one route for each connector", model, solver, solverVariables)	
	}
	
	def getConstraint(IntVar p, IntVar q, int[] table) {
		return new Constraint("ValueImplication", new ValueImplication(#[p, q], table))
	}
	
	override generate() {
		
		// 1. Liste aller Routen der Interfaces besorgen (routes should be case-insensitive!)
		val listOfAllRoutes = model.eqInterfaces.map[route.toUpperCase].toSet.toList.sort		
		if (listOfAllRoutes.length <= 1) return false
				
		// 2. Domain mit den Indizes der obigen Liste anlegen
		// 3. Für jeden Connector eine Variable, die die "Route" des Connectors speichert (Domain = siehe voriger Schritt)
		val listOfAllRouteVariablesForEachConnector = model.allConnectors.map[VF.enumerated("RouteVarFor" + it.name, 0, listOfAllRoutes.length-1, solver)]
		
		// 4. Indikatorvariablen für die Connectoren und die belegten Routen bauen
		// -> für jeden Connector gibt es ein Array von BoolVars (bzw. eine Matrix für alle Connectoren)
		// -> boolean_channel verknüpft die Variablen (aus 3.) mit den Indikatorvariablen 
		val routeIndicatorVariablesForEachConnector = VF.boolMatrix("r", model.allConnectors.size, listOfAllRoutes.size, solver)
		for (int connIdx : 0 ..< model.allConnectors.size) 
			solver.post(ICF.boolean_channeling(routeIndicatorVariablesForEachConnector.get(connIdx), listOfAllRouteVariablesForEachConnector.get(connIdx), 0))
				
		// 5.    foreach (connector : model.allConnectors)
		//          foreach (iface : model.allInterfaces)
		// 				solver.post(ICF.arithm(p, "<=", q)  // kleiner gleich!
		//					p = LocationIndicatorVariables(iface).get(connector_idx)
		//					q = RoutenIndicatorVariables(connector).get(iface_route_idx)  --> siehe 4.
		for (int connIdx : 0 ..< model.allConnectors.size)
			for (int ifaceIdx : 0 ..< model.eqInterfaces.size) {
				val BoolVar p = solverVariables.getInterfaceConnectorIndicatorVariables.get(connIdx).get(ifaceIdx) 
				val BoolVar q = routeIndicatorVariablesForEachConnector.get(connIdx).get(listOfAllRoutes.indexOf(model.eqInterfaces.get(ifaceIdx).route.toUpperCase)) 
				solver.post(ICF.arithm(p, "<=", q))
			}
	
		// 6. Propagieren
		try { solver.propagate }
		catch (ContradictionException e) { throw new BasicConstraintsException(this) }

		return true
	}
	
}