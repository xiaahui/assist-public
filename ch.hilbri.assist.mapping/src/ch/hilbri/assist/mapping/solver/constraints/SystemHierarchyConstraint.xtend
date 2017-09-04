package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model
import org.chocosolver.solver.constraints.^extension.Tuples
import org.eclipse.emf.ecore.EObject

class SystemHierarchyConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("system hierarchy", model, chocoModel, solverVariables)
	}

	override generate() {
		
		// Building a table constraint for each layer in the location hierarchy

		val tuples = new Tuples(true)
		val cores = model.allCores
		for (int coreIdx : 0 ..< cores.length) {
			var index = newArrayList
			var eObj = cores.get(coreIdx) as EObject
				
			while (eObj.eContainer !== null) {
				val parent = eObj.eContainer
				val eObjIdx = parent.eContents.indexOf(eObj)
				index.add(eObjIdx)
				eObj = parent				
			}		
		
			tuples.add(index)
		}

		// building table constraints reflecting the location hierarchy		

		for (t : model.allTasks) {
			val varList = solverVariables.getLocationVariablesForTask(t)			
			chocoModel.table(varList, tuples, "GAC3rm+").post
		}		

		propagate()

		return true
	}

}
