package ch.hilbri.assist.scheduling.tests.basics

import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import org.junit.Assert
import org.junit.Test

class DurationTests extends AbstractSchedulingTest {

    @Test
    def void durationTest1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
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
            Duration = 1;
            Period = 2;
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
        val chocoTasks = solution.schedule.get(assistModel.allTasks.head)

        /* We want to have one chocoTask */
        Assert.assertEquals(1, chocoTasks.size)
        val chocoTask = chocoTasks.head

        /* Check, that it is assigned properly // has proper length */
        Assert.assertEquals(1, chocoTask.end - chocoTask.begin)
    }

    @Test
    def void durationTest2() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
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
            Duration = 1;
            Period = 2;
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 1;
            Period = 2;
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

        /* Make sure that the solution is correct */
        for (i : 0 ..< 2) {
            Assert.assertEquals(1, solution.schedule.get(assistModel.allTasks.get(i)).size)
            val task = solution.schedule.get(assistModel.allTasks.get(i)).head
            Assert.assertEquals(1, task.end - task.begin)
            Assert.assertTrue(task.begin >= 0)
            Assert.assertTrue(task.begin < 2)
            Assert.assertTrue(task.end > 0)
            Assert.assertTrue(task.end <= 2)
        }
    }

    @Test
    def void longHyperPeriodTest2() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 60;
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
            Duration = 1;
            Period = 2;
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

        /* Make sure that the solution is correct */
        for (taskIdx : 0 ..< 2) {
            val task = assistModel.allTasks.get(taskIdx)

            /* Check how often the tasks will be executed */
            if (taskIdx == 0)
                Assert.assertEquals(30, solution.schedule.get(task).size)
            else if (taskIdx == 1)
                Assert.assertEquals(2, solution.schedule.get(task).size)
            else
                Assert.assertFalse("Wrong taskIdx", true)

            val taskExecutions = solution.schedule.get(assistModel.allTasks.get(taskIdx))
            for (execIdx : 0 ..< taskExecutions.size) {
                val taskExecution = taskExecutions.get(execIdx)
                /* Check proper duration */
                Assert.assertEquals(1, taskExecution.end - taskExecution.begin)

                /* Check maximum bounds */
                Assert.assertTrue(taskExecution.begin >= 0)
                Assert.assertTrue(taskExecution.begin < 60)
                Assert.assertTrue(taskExecution.end > 0)
                Assert.assertTrue(taskExecution.end <= 60)

                /* Check periodicity */
                Assert.assertTrue(taskExecution.begin >= execIdx * task.period)
                Assert.assertTrue(taskExecution.begin < (execIdx + 1) * task.period)
                Assert.assertTrue(taskExecution.end > execIdx * task.period)
                Assert.assertTrue(taskExecution.end <= (execIdx + 1) * task.period)
            }
        }
    }

}
