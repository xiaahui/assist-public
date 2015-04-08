package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Solver
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.eclipse.xtend.lib.annotations.Data

@Data class SolverVariablesContainer {
	
	/** A list of location variables for each interface (and each system layer) */
	Map<EqInterface, List<IntVar>> 	eqInterfaceLocationVariables	= new HashMap 
	
	Map<IntVar, EqInterface> 		locationVarMap = new HashMap
	
	IntVar                          optVar
	
	int[] locationVariableLevels 
	
	/* CONSTRUCTOR */
	new (AssistModel model, Solver solver, int[] locationVariableLevels) {
	
		this.locationVariableLevels = locationVariableLevels
		
		/* Initialize the hash map for all thread-related location variables */
		for (iface : model.eqInterfaces) {
			val l = new ArrayList<IntVar>
			
			// Connector Level (index 0)
			val ifaceLocVarCon = VF.enumerated("Loc-" + iface.name + "-Connector", 0, model.allConnectors.length-1, solver) 
			l.add(ifaceLocVarCon)
			locationVarMap.put(ifaceLocVarCon, iface)
			
			// RDC Level (index 1)
			val ifaceLocVarRDC = VF.enumerated("Loc-" + iface.name + "-RDC", 0, model.allRDCs.length-1, solver) 
			l.add(ifaceLocVarRDC)
			locationVarMap.put(ifaceLocVarCon, iface)
			
			// Compartment Level (index 2)
			val ifaceLocVarComp = VF.enumerated("Loc-" + iface.name + "-Compartment", 0, model.allCompartments.length-1, solver)
			l.add(ifaceLocVarComp)
			locationVarMap.put(ifaceLocVarCon, iface)
			
			eqInterfaceLocationVariables.put(iface, l)
		}
		this.optVar = VF.enumerated("N", 0, model.allRDCs.length, solver)
	}
	
	def IntVar[] getLocationVariables() {
		val list = new ArrayList<IntVar>

		for (l: this.locationVariableLevels)
			for (iface : eqInterfaceLocationVariables.keySet.sortBy[name])
				list.add(eqInterfaceLocationVariables.get(iface).get(l))

		return list	
	}
	
	def IntVar[] getLocationVariables(int level) {
		val list = new ArrayList<IntVar>

		for (iface : eqInterfaceLocationVariables.keySet.sortBy[name])
			list.add(eqInterfaceLocationVariables.get(iface).get(level))

		return list	
	}
	
	def int[] getLevels() {
		this.locationVariableLevels
	}

	/** Returns the optimization variable */
	def IntVar getOptimizationVariable() {
		return optVar
	}

	/** Returns the location variable for a given thread and a given hardware level */
	def IntVar getEqInterfaceLocationVariable(EqInterface iface, int level) {
		return eqInterfaceLocationVariables.get(iface).get(level)
	}
		
	
	def EqInterface getInterfaceForLocationVariable(IntVar variable) {
		val t = locationVarMap.get(variable)
		
		if (t != null)
			return t
		else
			return null
	}
	
}