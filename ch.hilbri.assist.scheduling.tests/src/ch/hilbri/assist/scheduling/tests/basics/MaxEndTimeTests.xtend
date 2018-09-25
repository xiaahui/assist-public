package ch.hilbri.assist.scheduling.tests.basics

import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import org.junit.Assert
import org.junit.Test


class MaxEndTimeTests extends AbstractSchedulingTest {
	
    @Test
    def void maxEndTimeTest1() {
    	val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Manufacturer = "Manufacturer 1";
		Box Box1 {
			Manufacturer = "Manufacturer 1";
			Board Board1 {
				Manufacturer = "Manufacturer 2";
				DesignAssuranceLevel = A;
				Processor P1 {
					Core C0 { Capacity = 100; }
					Core C1 { Capacity = 100; }
				}
			}
		}
	}
}

Software {
	Application A1 {
		CriticalityLevel = A;
		Task A1_T1 {
			AssignedCore = Comp1.Box1.Board1.P1.C0;
			Duration = 6;
			Period = 20;
			Color = green;
		}
	
		Task A1_T2 {
			AssignedCore = Comp1.Box1.Board1.P1.C0;
			Duration = 5;
			Period = 20;
			MaxEndTime = 7;
			Color = red;
		}
	}
}
		''')
		val assistSolver = createAndRunSolver(assistModel)

        /* Basic Checks to make sure that we have some results */
        Assert.assertNotNull(assistSolver.chocoSolutions)
        Assert.assertEquals(1, assistSolver.chocoSolutions.size)
        Assert.assertNotNull(assistSolver.results)
        Assert.assertEquals(1, assistSolver.results.size)
        
        /* Make sure that we have exactly one instance of the desired length */
        val solution = assistSolver.results.head
        
        /* Get all choco tasks for A1_T2 */
       	val chocoTasks = solution.schedule.get(assistModel.allTasks.filter[name == "A1_T2"].head)
        Assert.assertEquals(1, chocoTasks.size)
        val chocoTask = chocoTasks.head
        Assert.assertTrue(chocoTask.end <= 7)
    }
}