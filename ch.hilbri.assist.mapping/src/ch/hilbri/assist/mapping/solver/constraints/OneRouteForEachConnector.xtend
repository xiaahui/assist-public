package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver

class OneRouteForEachConnector extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("dissimilarity", model, solver, solverVariables)	
	}
	
	override generate() {
		
		// 1. Liste aller Routen der Interfaces besorgen
		
		// 2. Domain mit den Indizes der obigen Liste anlegen
		
		// 3. Für jeden Connector eine Variable, die die "Route" des Connectors speichert (Domain = siehe voriger Schritt)
		
		// 4. Indikatorvariablen für die Connectoren und die belegten Routen bauen
		// -> für jeden Connector gibt es ein Array von BoolVars
		// -> boolean_channel verknüpft die Variablen (aus 3.) mit den Indikatorvariablen 
		
		// 5.    foreach (connector : model.allConnectors)
		//          foreach (iface : model.allInterfaces)
		// 				solver.post(ICF.arithm(p, "<=", q)  // kleiner gleich!
		//					p = LocationIndicatorVariables(iface).get(connector_idx)
		//					q = RoutenIndicatorVariables(connector).get(iface_route_idx)  --> siehe 4.
		true
	}
	
}