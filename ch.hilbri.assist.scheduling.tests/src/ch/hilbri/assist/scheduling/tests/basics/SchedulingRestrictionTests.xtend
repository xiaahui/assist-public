package ch.hilbri.assist.scheduling.tests.basics

import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import org.junit.Assert
import org.junit.Test

class SchedulingRestrictionTests extends AbstractSchedulingTest {

    @Test
    def void testRestrictionStartAtTheSameTime1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 1;
            Period = 10;
            Color = red;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1, A1.A1_T4 start at the same time;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)

        // Check that the starting points are equal in both tasks
        for (i : 0 ..< task1Execs.size)
            Assert.assertEquals(task1Execs.get(i).begin, task4Execs.get(i).begin)
    }

    @Test
    def void testRestrictionFinishAtTheSameTime1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = red;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1, A1.A1_T4 finish at the same time;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)

        // Check that the finishing points are equal in both tasks
        for (i : 0 ..< task1Execs.size)
            Assert.assertEquals(task1Execs.get(i).end, task4Execs.get(i).end)
    }

    @Test
    def void testRestrictionStartAfterOtherFinished1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = red;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1 starts after A1.A1_T4 has finished;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)

        // Check that task1 always begins after task4 has finished
        for (i : 0 ..< task1Execs.size)
            Assert.assertTrue(task1Execs.get(i).begin >= task4Execs.get(i).end)
    }

    @Test
    def void testRestrictionStartAfterOtherFinished2() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
            Color = red;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = blue;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1,A1.A1_T2 start after A1.A1_T4 has finished;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task2Execs = solution.schedule.get(task2)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)
        Assert.assertEquals(task2Execs.size, task4Execs.size)

        // Check that task1 and task2 always begin after task4 has finished
        for (i : 0 ..< task1Execs.size) {
            Assert.assertTrue(task1Execs.get(i).begin >= task4Execs.get(i).end)
            Assert.assertTrue(task2Execs.get(i).begin >= task4Execs.get(i).end)
        }
    }

    @Test
    def void testRestrictionStartAfterOtherFinishedWithDelay1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = blue;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1 starts after A1.A1_T4 has finished with delay of at least 1;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)

        // Check that task1 begins with a delay of at least 1 after task4 has finished
        for (i : 0 ..< task1Execs.size) {
            Assert.assertTrue(task1Execs.get(i).begin >= (task4Execs.get(i).end + 1))
        }
    }

    @Test
    def void testRestrictionStartAfterOtherFinishedWithDelay2() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
}

Hardware {
    Compartment Comp1 {
        Box Box1 {
            Board Board1 {
                Processor P1 {
                    Core C0 {}
                    Core C1 {}
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
            Period = 10;
            Color = red;
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
            Color = red;
        }
        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }
        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = blue;
        }
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
    }
}

Restrictions {
    A1.A1_T1, A1.A1_T2 start after A1.A1_T4 has finished with delay of at least 1;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task2Execs = solution.schedule.get(task2)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)
        Assert.assertEquals(task2Execs.size, task4Execs.size)

        // Check that task1 and task2 begin with a delay of at least 1 after task4 has finished
        for (i : 0 ..< task1Execs.size) {
            Assert.assertTrue(task1Execs.get(i).begin >= (task4Execs.get(i).end + 1))
            Assert.assertTrue(task2Execs.get(i).begin >= (task4Execs.get(i).end + 1))
        }
    }

    @Test
    def void testRestrictionStartAfterOtherStarted1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = red;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1 starts after A1.A1_T4 has started;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)

        // Check that task1 always begins after task4 has finished
        for (i : 0 ..< task1Execs.size)
            Assert.assertTrue(task1Execs.get(i).begin >= task4Execs.get(i).begin)
    }

    @Test
    def void testRestrictionStartAfterOtherStarted2() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
            Color = red;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = blue;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1,A1.A1_T2 start after A1.A1_T4 has started;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task2Execs = solution.schedule.get(task2)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)
        Assert.assertEquals(task2Execs.size, task4Execs.size)

        // Check that task1 and task2 always begin after task4 has finished
        for (i : 0 ..< task1Execs.size) {
            Assert.assertTrue(task1Execs.get(i).begin >= task4Execs.get(i).begin)
            Assert.assertTrue(task2Execs.get(i).begin >= task4Execs.get(i).begin)
        }
    }

    @Test
    def void testRestrictionStartAfterOtherStartedWithDelay1() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
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
            Period = 10;
            Color = red;
        }

        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
        }

        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }

        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = blue;
        }
        
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
        
    }
}

Restrictions {
    A1.A1_T1 starts after A1.A1_T4 has started with delay of at least 1;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)

        // Check that task1 begins with a delay of at least 1 after task4 has started
        for (i : 0 ..< task1Execs.size) {
            Assert.assertTrue(task1Execs.get(i).begin >= (task4Execs.get(i).begin + 1))
        }
    }

    @Test
    def void testRestrictionStartAfterOtherStartedWithDelay2() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
}

Hardware {
    Compartment Comp1 {
        Box Box1 {
            Board Board1 {
                Processor P1 {
                    Core C0 {}
                    Core C1 {}
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
            Period = 10;
            Color = red;
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C0;
            Duration = 2;
            Period = 10;
            Color = red;
        }
        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
        }
        Task A1_T4 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Color = blue;
        }
        Task A1_T5 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 4;
            Period = 10;
        }
    }
}

Restrictions {
    A1.A1_T1, A1.A1_T2 start after A1.A1_T4 has started with delay of at least 1;
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
        val task4 = assistModel.allTasks.get(3)

        val task1Execs = solution.schedule.get(task1)
        val task2Execs = solution.schedule.get(task2)
        val task4Execs = solution.schedule.get(task4)

        Assert.assertEquals(task1Execs.size, task4Execs.size)
        Assert.assertEquals(task2Execs.size, task4Execs.size)

        // Check that task1 and task2 begin with a delay of at least 1 after task4 has finished
        for (i : 0 ..< task1Execs.size) {
            Assert.assertTrue(task1Execs.get(i).begin >= (task4Execs.get(i).begin + 1))
            Assert.assertTrue(task2Execs.get(i).begin >= (task4Execs.get(i).begin + 1))
        }
    }
    
     @Test
    def void testRestrictionDisjointExecution() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
}

Hardware {
    Compartment Comp1 {
        Box Box1 {
            Board Board1 {
                Processor P1 {
                    Core C0 {}
                    Core C1 {}
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
            Period = 10;
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 1;
            Period = 10;
        }
    }
}

Restrictions {
    A1.A1_T1, A1.A1_T2 require disjoint execution;
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

        val task1Execs = solution.schedule.get(task1)
        val task2Execs = solution.schedule.get(task2)

		/* Make sure that each task has the same execution instance count */
        Assert.assertEquals(task1Execs.size, task2Execs.size)

        // Check that the execution instances of task1 and task2 are not overlapping
        for (i : 0 ..< task1Execs.size) {
            Assert.assertTrue("Tasks in execution unit " + i + " should not overlap", 
            	// Task 1 is before task 2 ---> task1.end <= task2.begin
            	task1Execs.get(i).end <= task2Execs.get(i).begin ||
            	// Task 2 is before task 1 --> task2.end <= task1.begin
            	task2Execs.get(i).end <= task1Execs.get(i).begin
            )
        }
    }

}
