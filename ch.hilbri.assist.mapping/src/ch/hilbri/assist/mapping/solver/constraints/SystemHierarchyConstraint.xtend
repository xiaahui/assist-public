package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF

/**
 * Ziel: Zwischen allen Abstraktionsebenen im Modell muessen Verbindungen hergestellt werden.
 */
class SystemHierarchyConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("System Hierarchy Constraints", model, solver, solverVariables)
	}
	
	override generate() {
		
		/* Wir brauchen einen "Link" zwischen allen Hardware-Ebenen */
		for (levelCtr : HardwareArchitectureLevelType.CORE_VALUE .. model.hardwareLevelCount - 1) {

			/* HardwareLevelLink ist ein Feld von Indizes der Parent-Komponenten 		
			 * hardwareLevelLink[KindIndex] = Parent_Index
			 *
			 * Beispiel: 
			 * - für die Verknüpfung von Cores und Prozessoren wird ein Link zwischen Ebene 1 und 2 benötigt
			 * - die liste hardwareLevelLink enthaelt so viele Element, wie es Cores im Modell gibt
			 * - für jeden Core wird der Index des Parents (= Prozessor) eingetragen
			 */ 
			
			val hardwareLevelLink = model.getAllHardwareElements(levelCtr)
										.map[eContainer]   											// get the parent object
										.map[model.getAllHardwareElements(levelCtr+1).indexOf(it)] 	// get the parent index 
			
			
			/*
			 * Nun werden die Location Variablen eines Threads zwischen den Ebenen mit einem Element Constraint verknüpft;
			 * Sollte damit beispielweise ein Prozessor als Lösung ausfallen, so werden automatisch auch die Kerne des 
			 * Prozessors aus dem Lösungsraum entfernt (und umgedreht)
			 */
			for (t : model.allThreads) {
				var index  = solverVariables.getThreadLocationVariable(t, levelCtr)
				var values = solverVariables.getThreadLocationVariable(t, levelCtr + 1)
				solver.post(ICF.element(values, hardwareLevelLink, index))
			}			
		} 
		
		propagate()
		
		return true
	}
	
}