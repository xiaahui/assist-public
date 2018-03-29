package ch.hilbri.assist.scheduling.tests.basics

import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import org.junit.Assert
import org.junit.Test

class TaskSwitchingTimeTests extends AbstractSchedulingTest {

    @Test
    def void switchingTimeTest1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    TaskSwitchDelay = 1;
}

Hardware {
    Compartment Comp1 {
        Box Box1 {
            Board Board1 {
                Processor P1 {
                    Core C0 {  }
                    Core C1 {  }
                }
            }
        }
    }
}

Software {
    Application A1 {
        Task A1_T1 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 4;
            Period = 8;
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 8;
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
        
        /* Make sure, that each task has only one execution */
        Assert.assertEquals(2, assistModel.allTasks.size)
        for (task : assistModel.allTasks)
            Assert.assertEquals(1, solution.schedule.get(task).size)
        
        /* Make sure, that between task1 and task2 there is always a distance of 1 */
        val task1Exec = solution.schedule.get(assistModel.allTasks.get(0)).head
        val task2Exec = solution.schedule.get(assistModel.allTasks.get(1)).head
        
        Assert.assertTrue(
            // Schedule: Task1 [Distance] Task2
            task2Exec.begin - task1Exec.end >= 1     ||
            
            // Schedule: Task2 [Distance] Task1
            task1Exec.begin - task2Exec.end >= 1
        )
    }
}
