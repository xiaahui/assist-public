package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ColocalityRelation
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
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
	Map<EqInterface, List<IntVar>>  eqInterfaceLocationVariables = new HashMap 
	
	Map<IntVar, EqInterface> 		locationVarMap = new HashMap
	
	private int[]                   locationVariableLevels 
	
	private List<IntVar>            colocationVariables = new ArrayList<IntVar>
	
	
	
	private IntVar[]                optVars
	
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
			locationVarMap.put(ifaceLocVarRDC, iface)
			
			// Compartment Level (index 2)
			val ifaceLocVarComp = VF.enumerated("Loc-" + iface.name + "-Compartment", 0, model.allCompartments.length-1, solver)
			l.add(ifaceLocVarComp)
			locationVarMap.put(ifaceLocVarComp, iface)
			
			eqInterfaceLocationVariables.put(iface, l)
		}

		for (r : model.colocalityRelations) {
			for (v: getColocationVariables(r)) {
				if (!colocationVariables.contains(v)) {
					colocationVariables.add(v)
				}
			}
		}

		this.optVars = #[VF.bounded("UsedRDCCount", 0, model.allRDCs.length, solver),
						 VF.bounded("TotalCableLength", 0, Integer.MAX_VALUE / 2, solver)]
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

	def int getLevelIndex(HardwareArchitectureLevelType hwLevel) {
		switch (hwLevel) {
			case HardwareArchitectureLevelType.CONNECTOR: return 0
			case HardwareArchitectureLevelType.RDC: return 1
			case HardwareArchitectureLevelType.COMPARTMENT: return 2
			default: return -1
		}		
	}

	def List<IntVar> getColocationVariables() {
		colocationVariables
	}
	
	def List<IntVar> getColocationVariables(ColocalityRelation r) {
		val l = getLevelIndex(r.hardwareLevel)
		val list = new ArrayList<IntVar>
		for (ifaceOrGroup : r.eqInterfaceOrGroups) {
			if (ifaceOrGroup instanceof EqInterface) {
				list.add(getEqInterfaceLocationVariable(ifaceOrGroup, l))
			} else if (ifaceOrGroup instanceof EqInterfaceGroup) {
				list.addAll(ifaceOrGroup.eqInterfaces.map[getEqInterfaceLocationVariable(it, l)])
			}
		}
		return list
	}
	
	/** Returns the optimization variable */
	def IntVar[] getOptimizationVariables() {
		return optVars
	}

	/** Returns the location variable for a given thread and a given hardware level */
	def IntVar getEqInterfaceLocationVariable(EqInterface iface, int level) {
		return eqInterfaceLocationVariables.get(iface).get(level)
	}
		
	
	def IntVar getEqInterfaceLocationVariable(EqInterface iface, HardwareArchitectureLevelType level) {
		switch (level) {
			case CONNECTOR: 	{ return getEqInterfaceLocationVariable(iface, 0)	}
			case RDC: 			{ return getEqInterfaceLocationVariable(iface, 1)	}
			case COMPARTMENT: 	{ return getEqInterfaceLocationVariable(iface, 2)	}
		}
		return null
	}
	
	def EqInterface getInterfaceForLocationVariable(IntVar variable) {
		return locationVarMap.get(variable)
	}
	
}
