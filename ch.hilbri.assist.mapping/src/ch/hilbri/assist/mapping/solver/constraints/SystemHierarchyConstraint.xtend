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
		/**
		 * hardwareLevelLink ist ein Feld von Feldern. Die erste Dimension
		 * beschreibt die erforderliche "Link-Ebene"; Bei n-Ebenen brauchen wir
		 * n-1 Links zwischen den Ebenen. Der link geht immer von der unteren
		 * Ebene zur oberen Ebene (z.B. Cores -> Prozessor).
		 * 
		 * Die zweite Dimension ist ein Feld, dessen Laenge der Anzahl der
		 * Elemente der unteren Ebene entspricht (z.B. maxCores). Jeder Index
		 * entspricht einem Element der Liste aller Componenten der unteren
		 * Ebene. Der Eintrag zu jedem Index entspricht der parent-ID des
		 * index-Elements, also z.B. der Prozessor-ID fuer einen Core.
		 * 
		 * Bsp:
		 * Die 1-te Ebene verbindet Cores mit Processors. Die Processors 
		 * werden durchnummeriert (von 0 bis n_Proc, entspricht upperLevelComponentCtr). Die Laenge der Liste
		 * in der 0-ten Ebene entspricht der Anzahl an Cores (n_Core) und
		 * gehoert jeweils zu dem Core in der Reihenfolge, wie sie in der Liste
		 * allHardwareComponents.get(MappingDataModel.CORE_LEVEL) stehen.
		 * Jedem Core wird jetzt in dieser Liste die Nummer seines Processors zugewiesen 
		 */
		 
		 
		val hardwareLevelLink = new ArrayList<ArrayList<Integer>>
		
		for (levelCtr : 1..model.hardwareLevelCount-1 ) {
			
			/* hardwareLevelLink[lowerLevel][Kind_Index] = Parent_Index */
			val list = new ArrayList<Integer>
			for (hw : model.getAllHardwareElements(levelCtr))
				list.add(hw.eContainer.eContainer.eContents.indexOf(hw.eContainer)+1)
			hardwareLevelLink.add(list)

			for (t : model.allThreads) {
				var index  = solverVariables.getThreadLocationVariable(t, levelCtr)
				var values = solverVariables.getThreadLocationVariable(t, levelCtr + 1)
				constraintStore.impose(new Element( index, hardwareLevelLink.get(levelCtr-1), values))
			}			
		} 
		
		return true
	}
	
}