package ch.hilbri.assist.scheduling.tests.basics

import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException

class TaskSwitchingTimeTests extends AbstractSchedulingTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

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
            // Schedule: Task1 [Distance] Task2  OR Task2 [Distance] Task1
            task2Exec.begin - task1Exec.end >= 1 || task1Exec.begin - task2Exec.end >= 1
        )
    }

    @Test
    def void switchingTimeTest2() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 60;
    TaskSwitchDelay = 5;
    
}

Hardware {
    Compartment Comp1 {
        Box Box1 {
            Board Board1 {
                Processor P1 {
                    Core C0 {  }
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
            Period = 15;
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 1;
            Period = 30;
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

        /* Make sure, that between task1 and task2 there is always a distance of 5 */
        val task1Execs = solution.schedule.get(assistModel.allTasks.get(0))
        val task2Execs = solution.schedule.get(assistModel.allTasks.get(1))
        /* --> Compare all execution instances pairwise */
        for (task1Exec : task1Execs)
            for (task2Exec : task2Execs)
                Assert.assertTrue(task2Exec.begin - task1Exec.end >= 5 || task1Exec.begin - task2Exec.end >= 5)
    }

    @Test
    def void NoSolution() {
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
                }
            }
        }
    }
}

Software {
    Application A1 {
        Task A1_T1 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 2;
        }
    }
}  
         ''')
        // No exception should be thrown up to here ...
        // Here we expect and exception, because there are no solutions for this problem    
        exception.expect(BasicConstraintsException)
        createAndRunSolver(assistModel)
    }
}
