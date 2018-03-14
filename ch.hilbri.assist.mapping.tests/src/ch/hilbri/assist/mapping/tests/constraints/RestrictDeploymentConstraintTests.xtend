package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Processor
import java.util.List
import org.junit.Assert
import org.junit.Test

class RestrictDeploymentConstraintTests extends AbstractMappingTest {
	
	@Test
	def void testTaskLevelSpecificationAndOnlyCoreReference() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board Board1 {
				Processor P1 {
					Core C0 { }
					Core C1 { }
				}
				Processor P2 {
					Core C3 { }
					Core C4 { }
				}
			}
		}
	}
}

Software {
	Application A1 {
		Task A1_T1 {
			RestrictDeploymentTo { Comp1.Box1.Board1.P1.C0, Comp1.Box1.Board1.P2.C3 };
		}
	}
}
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions
		
		for (result : assistSolver.results) {
			for (task : assistModel.allTasks) {
				var List<Core> allowedCores
				if (task.restrictMappingToHardwareElements.empty)
					allowedCores = assistModel.allCores
				else
					allowedCores = task.restrictMappingToHardwareElements.map[it.allCoresForHardwareElement].flatten.toList
		
				val resultingCore = result.getHardwareElementForTask(task, 0)
				
				Assert.assertTrue("[Result " + (assistSolver.results.indexOf(result)+1) + "/"+assistSolver.results.size + "]: The task must be placed on a core that was allowed", allowedCores.contains(resultingCore))				
			}
		}
		
		Assert.assertEquals("There should only be 2 results, because there are only 2 cores possible", 2, assistSolver.results.size)
	}
	
	
	private def List<Core> getAllCoresForHardwareElement(HardwareElement hwElem) {
		if (hwElem instanceof Compartment) 		hwElem.allCores
		else if (hwElem instanceof Box) 		hwElem.allCores
		else if (hwElem instanceof Board)  		hwElem.allCores
		else if (hwElem instanceof Processor) 	hwElem.allCores
		else if (hwElem instanceof Core) 		#[hwElem]
		else #[]
	}
}