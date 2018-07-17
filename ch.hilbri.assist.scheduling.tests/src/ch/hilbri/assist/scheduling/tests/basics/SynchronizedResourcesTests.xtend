package ch.hilbri.assist.scheduling.tests.basics

import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import org.junit.Assert
import org.junit.Test

class SynchronizedResourcesTests extends AbstractSchedulingTest {

    @Test
    def void testTwoSimpleApplications() {
        val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board Board1 {
				Provides shared feature "FeatureA" with synchronized access;
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
			Period = 2;
			Requires shared Board feature "FeatureA";
		}
		Task A1_T2 {
			AssignedCore = Comp1.Box1.Board1.P1.C1;
			Duration = 1;
			Period = 2;
			Requires shared Board feature "FeatureA";
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

        /* Retrieve all execution instances */
        val allExecutionInstances = assistModel.allTasks.map[solution.schedule.get(it)].flatten

        /* Make sure, we have exactly two execution instances, one for each task */
        Assert.assertEquals(2, allExecutionInstances.size)

        /* Make sure, that these two execution instances are not overlapping */
        val instance1 = allExecutionInstances.get(0)
        val instance2 = allExecutionInstances.get(1)
        Assert.assertTrue("These two execution instances should not overlap",
            instance1.end <= instance2.begin || instance2.end <= instance1.begin)
    }

    @Test
    def void testThreeApplicationsOnDifferentProcessors() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
}

Hardware {
    Compartment Comp1 {
        Box Box1 {
            Board Board1 {
                Provides shared feature "FeatureA" with synchronized access;
                Processor P1 {
                    Core C0 {}
                    Core C1 {}
                }
                Processor P2 {
                    Core C0 {}
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
            Period = 10;
            Requires shared Board feature "FeatureA";
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 2;
            Period = 10;
            Requires shared Board feature "FeatureA";
        }
        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P2.C0;
            Duration = 5;
            Period = 20;
            Requires shared Board feature "FeatureA";
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

        /* Retrieve all execution instances */
        val allExecutionInstances = assistModel.allTasks.map[solution.schedule.get(it)].flatten

        /* We need to iterate over every pair of execution instance and check that it is not overlapping */
        for (var i = 0; i < allExecutionInstances.size; i++) {
            for (var j = i + 1; j < allExecutionInstances.size; j++) {
                /* Make sure, that these two execution instances are not overlapping */
                val instance1 = allExecutionInstances.get(i)
                val instance2 = allExecutionInstances.get(j)
                Assert.
                    assertTrue('''These two execution instances should not overlap ({«i»}: [«instance1.begin»,«instance1.end»], {«j»}: [«instance2.begin»,«instance2.end»])''',
                        instance1.end <= instance2.begin || instance2.end <= instance1.begin)
            }
        }
    }
    
    @Test
    def void testFeatureAppliesToSelectedTasksOnly() {
        val assistModel = parser.parse('''
Global {
    System = "Example System";
    MinimumHyperPeriod = 100;
}

Hardware {
    Compartment Comp1 {
        Box Box1 {
            Provides shared feature "FeatureA";
            Board Board1 {
                Provides shared feature "FeatureA" with synchronized access;
                Processor P1 {
                    Core C0 {}
                    Core C1 {}
                }
                Processor P2 {
                    Core C0 {}
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
            Requires shared Board feature "FeatureA";
        }
        Task A1_T2 {
            AssignedCore = Comp1.Box1.Board1.P1.C1;
            Duration = 1;
            Period = 2;
            Requires shared Board feature "FeatureA";
        }
        Task A1_T3 {
            AssignedCore = Comp1.Box1.Board1.P2.C0;
            Duration = 1;
            Period = 2;
            Requires shared Box feature "FeatureA";
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

        /* Retrieve all execution instances for T1 and T2 */
        val allExecutionInstances = assistModel.allTasks.filter[getName == "A1_T1" || getName == "A1_T2"]
                                                        .map[solution.schedule.get(it)].flatten

        /* We need to iterate over every pair of execution instance and check that it is not overlapping */
        for (var i = 0; i < allExecutionInstances.size; i++) {
            for (var j = i + 1; j < allExecutionInstances.size; j++) {
                /* Make sure, that these two execution instances are not overlapping */
                val instance1 = allExecutionInstances.get(i)
                val instance2 = allExecutionInstances.get(j)
                Assert.
                    assertTrue('''These two execution instances should not overlap ({«i»}: [«instance1.begin»,«instance1.end»], {«j»}: [«instance2.begin»,«instance2.end»])''',
                        instance1.end <= instance2.begin || instance2.end <= instance1.begin)
            }
        }
    }
}
