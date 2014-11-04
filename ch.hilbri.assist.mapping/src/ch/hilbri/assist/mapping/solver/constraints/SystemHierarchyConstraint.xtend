package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.datamodel.model.AssistModel
import java.util.ArrayList
import org.jacop.constraints.Element
import org.jacop.core.Store

/**
 * Ziel: Zwischen allen Abstraktionsebenen im Modell muessen Verbindungen hergestellt werden.
 */
class SystemHierarchyConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("System Hierarchy Constraints", model, constraintStore, solverVariables)
	}
	
	override generate() {
		
		/* Wir brauchen einen "Link" zwischen allen Hardware-Ebenen */
		for (levelCtr : 1..model.hardwareLevelCount-1 ) {

			/* HardwareLevelLink ist ein Feld von Nummern von Parent-Komponenten 		
			 * hardwareLevelLink[KindIndex] = Parent_Nummer (nicht Index!) 
			 *
			 * Beispiel: 
			 * - für die Verknüpfung von Cores und Prozessoren wird ein Link zwischen Ebene 1 und 2 benötigt
			 * - die liste hardwareLevelLink enthÃ¤lt so viele Element, wie es Cores im Modell gibt
			 * - für jeden Core wird die Nummer (nicht der Index! - da JaCoP bei 1 zu zählen anfängt) des Parents (= Prozessor)
			 *   eingetragen
			 */ 
			
			val hardwareLevelLink = new ArrayList<Integer>
			for (childHardwareComponent : model.getAllHardwareElements(levelCtr)) {
				val parentHardwareComponent = childHardwareComponent.eContainer
				hardwareLevelLink.add(model.getAllHardwareElements(levelCtr+1).indexOf(parentHardwareComponent)+1)
			}
			
			/*
			 * Nun werden die Location Variablen eines Threads zwischen den Ebenen mit einem Element Constraint verknüpft;
			 * Sollte damit beispielweise ein Prozessor als Lösung ausfallen, so werden automatisch auch die Kerne des 
			 * Prozessors aus dem Lösungsraum entfernt (und umgedreht)
			 */
			for (t : model.allThreads) {
				var index  = solverVariables.getThreadLocationVariable(t, levelCtr)
				var values = solverVariables.getThreadLocationVariable(t, levelCtr + 1)
				constraintStore.impose(new Element(index, hardwareLevelLink, values))
			}			
		} 
		
		return true
	}
	
}