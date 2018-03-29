package ch.hilbri.assist.scheduling.tests.basics

import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import org.junit.Assert
import org.junit.Test

class PeriodicityTests extends AbstractSchedulingTest {

    @Test
    def void periodicityTest1() {
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
            Periodicity = strict;
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
        val executionUnits = solution.schedule.get(assistModel.allTasks.head)
        Assert.assertEquals(30, executionUnits.size)

        for (Idx : 1 ..< 30)
            Assert.assertTrue(executionUnits.get(Idx - 1).begin + 2 == executionUnits.get(Idx).begin)
    }

    @Test
    def void periodicityMixedTest1() {
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
            Duration = 2;
            Period = 5;
            Periodicity = flexible;
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
            Periodicity = strict;
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

        val task1 = assistModel.allTasks.get(0)
        val task2 = assistModel.allTasks.get(1)

        val task1Schedule = solution.schedule.get(task1)
        Assert.assertEquals(12, task1Schedule.size)

        val task2Schedule = solution.schedule.get(task2)
        Assert.assertEquals(6, task2Schedule.size)

        /* Make sure that task2 is still strict */
        for (Idx : 1 ..< 6)
            Assert.assertTrue(task2Schedule.get(Idx - 1).begin + task2.period == task2Schedule.get(Idx).begin)
    }

    @Test
    def void periodicityMixedTest2() {
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
            Duration = 5;
            Period = 10;
            Periodicity = strict;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 1;
            Period = 5;
            Periodicity = flexible;
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

        val task1 = assistModel.allTasks.get(0) // strict
        val task2 = assistModel.allTasks.get(1) // flexible
        val task1Schedule = solution.schedule.get(task1)
        Assert.assertEquals(6, task1Schedule.size)

        val task2Schedule = solution.schedule.get(task2)
        Assert.assertEquals(12, task2Schedule.size)

        /* Make sure that task1 is still strict */
        for (Idx : 1 ..< task1Schedule.size)
            Assert.assertTrue(task1Schedule.get(Idx - 1).begin + task1.period == task1Schedule.get(Idx).begin)

        /* Make sure that task2 periodicity (flexible) is still valid */
        for (Idx : 0 ..< task2Schedule.size) {
            Assert.assertTrue(task2Schedule.get(Idx).begin >= Idx * task2.period)
            Assert.assertTrue(task2Schedule.get(Idx).begin < (Idx + 1) * task2.period)

            Assert.assertTrue(task2Schedule.get(Idx).end > Idx * task2.period)
            Assert.assertTrue(task2Schedule.get(Idx).end <= (Idx + 1) * task2.period)
        }

        /* Task 2 should have different beginnings (to show its "flexibility")  
         * - go through every pair and check distance between begin and end */
        val distances = newArrayList()
        for (i : 0 ..< (task2Schedule.size - 1)) {
            val taskEndLast = task2Schedule.get(i).end
            val taskBeginNext = task2Schedule.get(i + 1).begin
            val distance = taskBeginNext - taskEndLast
            distances.add(distance)
        }

        /* There should be two different distances between tasks (depending on whether the other task was executing) */
        Assert.assertEquals(2, distances.toSet.size)

    }

}
