package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.model.AssistModel
import org.jacop.core.Store
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer

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
		 * Die 0-te Ebene verbindet Cores mit Processors. Die Processors 
		 * werden durchnummeriert (von 0 bis n_Proc, entspricht upperLevelComponentCtr). Die Laenge der Liste
		 * in der 0-ten Ebene entspricht der Anzahl an Cores (n_Core) und
		 * gehoert jeweils zu dem Core in der Reihenfolge, wie sie in der Liste
		 * allHardwareComponents.get(MappingDataModel.CORE_LEVEL) stehen.
		 * Jedem Core wird jetzt in dieser Liste die Nummer seines Processors zugewiesen 
		 */
//		int[][] hardwareLevelLink = new int[model.getHardwareLevelCount() - 1][];
		return true
	}
	
}