package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Solver
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.eclipse.xtend.lib.annotations.Data

@Data class SolverVariablesContainer {
	
	/** A map containing the location variables for each interface (and each system layer) */
	private Map<EqInterface, List<IntVar>>  eqInterfaceLocationVariables = new HashMap 
	
	/** A map containing the interface for each location variable */
	private Map<IntVar, EqInterface> 		locationVarMap = new HashMap
	
	/* ****************************
	 * CONSTRUCTOR
	 * **************************** */
	new (AssistModel model, Solver solver) {
		
		/* Initialize the hash map for all eqInterface-related location variables */
		for (iface : model.eqInterfaces) {
			
			// Pin Level (index 0)
			val ifaceLocVarPin = VF.enumerated(iface.name + "-Pin", 0, model.pins.length-1, solver)
			locationVarMap.put(ifaceLocVarPin, iface)			
			
			// Connector Level (index 1)
			val ifaceLocVarCon = VF.enumerated(iface.name + "-Con", 0, model.connectors.length-1, solver) 
			locationVarMap.put(ifaceLocVarCon, iface)
			
			// RDC Level (index 2)
			val ifaceLocVarRDC = VF.enumerated(iface.name + "-RDC", 0, model.rdcs.length-1, solver) 
			locationVarMap.put(ifaceLocVarRDC, iface)
			
			// Compartment Level (index 3)
			val ifaceLocVarComp = VF.enumerated(iface.name + "-Com", 0, model.compartments.length-1, solver)
			locationVarMap.put(ifaceLocVarComp, iface)
			
			eqInterfaceLocationVariables.put(iface, #[ifaceLocVarPin, ifaceLocVarCon, ifaceLocVarRDC, ifaceLocVarComp])
		}
		
	}

	/** Returns a list of all location variables */
	def IntVar[] getLocationVariables() {
		eqInterfaceLocationVariables.values
									.flatten
							  		.sortBy[name]
	}

	/** Return a list of all location variables for a specific hardware level 
	 * (index 0 = pin level, 1 = connector level, ...)
	 */	
	def IntVar[] getLocationVariables(int level) {
		eqInterfaceLocationVariables.values
		                            .map[get(level)]
		                            .sortBy[name]
	}
	
	
	/** Return a list of all location variables for a specific hardware level */	
	def IntVar[] getLocationVariables(HardwareArchitectureLevelType hwLevel) {
		getLocationVariables(getLevelIndex(hwLevel))
	}

	/** Retrieve the index for a specified hardware level */
	def int getLevelIndex(HardwareArchitectureLevelType hwLevel) {
		switch (hwLevel) {
			case HardwareArchitectureLevelType.PIN			:  0
			case HardwareArchitectureLevelType.CONNECTOR	:  1
			case HardwareArchitectureLevelType.RDC			:  2
			case HardwareArchitectureLevelType.COMPARTMENT	:  3
			default											: -1
		}		
	}

	/** 
	 * Returns the location variable for a given interface and 
	 * a given hardware level as index (0: pins, 1: connectors, ...)
	 */
	def IntVar getEqInterfaceLocationVariable(EqInterface iface, int level) {
		eqInterfaceLocationVariables.get(iface).get(level)
	}
	
	/** 
	 * Returns the location variable for a given interface and 
	 * a given hardware level as enum value
	 */
	def IntVar getEqInterfaceLocationVariable(EqInterface iface, HardwareArchitectureLevelType level) {
		getEqInterfaceLocationVariable(iface, getLevelIndex(level))
	}
		
	/**
	 * Returns the interface for a given solver variable
	 */
	def EqInterface getEqInterfaceForLocationVariable(IntVar variable) {
		locationVarMap.get(variable)
	}
	
	/*
	 * Dummy method to prevent getter generation
	 */
	private def getEqInterfaceLocationVariables() {
		return eqInterfaceLocationVariables
	}
	
	/*
	 * Dummy method to prevent getter generation
	 */
	private def getLocationVarMap() {
		return locationVarMap
	}
}
