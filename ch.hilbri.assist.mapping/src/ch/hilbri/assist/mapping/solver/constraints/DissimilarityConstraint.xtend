package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.DissimilarityEntry
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.Model
import org.chocosolver.solver.constraints.Constraint

class DissimilarityConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("dissimilarity", model, chocoModel, solverVariables)
	}

	override generate() {
		for (dissimRelation : model.dissimilarityRelations) {
			val dissimClause  = dissimRelation.dissimilarityClause
			if (dissimClause instanceof DissimilarityEntry) {
				val constraint = generateConstraint(dissimRelation.applications, dissimClause)
				chocoModel.post(constraint)				 	
			}
		}
		true
	}
	
	private def Constraint generateConstraint(List<Application> applications, DissimilarityEntry entry) {
		
	}
	
	
}