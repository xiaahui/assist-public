package ch.hilbri.assist.mapping.tests.basics

import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test

import static org.junit.Assert.*

class MiscTests extends AbstractMappingTest {

	/* Makes sure that tasks with identical names will also be handled properly */
	@Test
	def void testMultipleTasksWithIdenticalName() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board Board1 {
				Processor P1 {
					Core C0 {
					}
					Core C1 {
					}
					Core C2 {
					}
					Core C3 {
					}
				}
			}
		}
	}
}

Software {
	Application A1 {
		Task Exec {
		}
	}
	Application A2 {
		Task Exec {
		}
	}
	Application A3 {
		Task Exec {
		}
	}
}
		 ''')
		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		val results = assistSolver.results
		assertEquals(64, results.size)
	}
}
