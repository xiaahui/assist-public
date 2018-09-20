package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class FeatureConstraintTests extends AbstractMappingTest {
    
    /* We need to test, that the task may only be mapped to a core 
     * which is providing the feature "CoreFeature"                */
    @Test
    def void Test1Simple() {
        val assistModel = parser.parse('''
        Global { System = "Example System"; }
        
        Hardware {
            Compartment Comp1 {
                Box Box1 {
                    Board Board1 {
                        Processor P1 {
                            Core C0 { Provides shared feature "CoreFeature"; }
                            Core C1 { }
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Requires shared Core feature "CoreFeature";
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
        
        /* There should only be 1 solution */
        Assert.assertEquals(1, assistSolver.results.size)
     
        /* Check that Task A1_T1 is mapped to Core CO in this result */
        val result = assistSolver.results.head
        Assert.assertEquals(assistModel.allCores.filter[name == "C0"].head, result.task2CoreMap.get(assistModel.allTasks.head))   
    }
    
    /* We need to test, that the task may only be mapped to cores on boards
     * which are providing the feature "BoardFeature"                          */
    @Test
    def void Test2Simple() {
        val assistModel = parser.parse('''
        Global {
            System = "Example System";
        }
        
        Hardware {
            Compartment Comp1 {
                Box Box1 {
                    Board Board1 {
                        Provides shared feature "BoardFeature"; 
                        Processor P1 {
                            Core C0 {}
                        }
                    }
                    Board Board2 {
                        Provides shared feature "OtherBoardFeature"; 
                        Processor P1 {
                            Core C1 {}
                        }
                    }
                    Board Board3 {
                        Processor P1 {
                            Core C2 {}
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Requires shared Board feature "BoardFeature";
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
        
        /* There should only be 1 solution */
        Assert.assertEquals(1, assistSolver.results.size)
     
        /* Check that Task A1_T1 is mapped to Core CO in this result */
        val result = assistSolver.results.head
        Assert.assertEquals(assistModel.allCores.filter[name == "C0"].head, result.task2CoreMap.get(assistModel.allTasks.head))   
    }
    
    /* We need to test, that constraints with similar names on different levels are treated accordingly  */
    @Test
    def void Test3Simple() {
        val assistModel = parser.parse('''
        Global {
            System = "Example System";
        }
        
        Hardware {
            Compartment Comp1 {
                Box Box1 {
                    Board Board1 {
                        Provides shared feature "Feature"; 
                        Processor P1 {
                            Core C0 {}
                        }
                    }
                    Board Board2 {
                        Processor P1 {
                            Provides shared feature "Feature";
                            Core C1 {}
                        }
                    }
                    Board Board3 {
                        Processor P1 {
                            Core C2 {
                                Provides shared feature "Feature";
                            }
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Requires shared Processor feature "Feature";
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
        
        /* There should only be 1 solution */
        Assert.assertEquals(1, assistSolver.results.size)
     
        /* Check that Task A1_T1 is mapped to Core CO in this result */
        val result = assistSolver.results.head
        Assert.assertEquals(assistModel.allCores.filter[name == "C1"].head, result.task2CoreMap.get(assistModel.allTasks.head))   
    }
    
    
    
    /* We need to test, that the capacity of an exclusive ressource is being properly respected */
    @Test
    def void Test1Exclusive() {
        val assistModel = parser.parse('''
        Global {
            System = "Example System";
        }
        
        Hardware {
            Compartment Comp1 {
                Box Box1 {
                    Board Board1 {
                        Provides 1 of exclusive feature "BoardFeature"; 
                        Processor P1 {
                            Core C0 {}
                        }
                    }
                    Board Board2 {
                        Provides 1 of exclusive feature "BoardFeature"; 
                        Processor P1 {
                            Core C1 {}
                        }
                    }
                    Board Board3 {
                        Processor P1 {
                            Core C2 {}
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Requires 1 of exclusive Board feature "BoardFeature";
                }
                Task A1_T2 {
                    Requires 1 of exclusive Board feature "BoardFeature";
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
        
        /* There should only be 2 solutions */
        Assert.assertEquals(2, assistSolver.results.size)
     
        /* Check that there is only 1 task mapped to CO and 1 task mapped to C1 */
        for (result : assistSolver.results) {
            val tasksC0 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C0"].head)
            val tasksC1 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C1"].head)
            val tasksC2 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C2"].head)
            
            Assert.assertEquals(1, tasksC0.size)
            Assert.assertEquals(1, tasksC1.size)
            Assert.assertEquals(0, tasksC2.size)
        }
    }
    
    
        /* We need to test, that the capacity of an exclusive ressource is being properly respected 
         * (this time we want check the core level instead of the board level) */
    @Test
    def void Test2Exclusive() {
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
                                Provides 2 of exclusive feature "Feature"; 
                            }
                        }
                    }
                    Board Board2 {
                        Provides 2 of exclusive feature "Feature"; 
                        Processor P1 {
                            Core C1 {}
                        }
                    }
                    Board Board3 {
                        Processor P1 {
                            Core C2 {}
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Requires 1 of exclusive Core feature "Feature";
                }
                Task A1_T2 {
                    Requires 1 of exclusive Core feature "Feature";
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
        
        /* There should only be 1 solution */
        Assert.assertEquals(1, assistSolver.results.size)
     
        /* Check that there is only 1 task mapped to CO and 1 task mapped to C1 */
        for (result : assistSolver.results) {
            val tasksC0 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C0"].head)
            val tasksC1 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C1"].head)
            val tasksC2 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C2"].head)
            
            Assert.assertEquals(2, tasksC0.size)
            Assert.assertEquals(0, tasksC1.size)
            Assert.assertEquals(0, tasksC2.size)
        }
    }
    
    
    /* We need to test, that shared and exclusive features with the same name may coexist */
    @Test
    def void Test1ExclusiveAndShared() {
        val assistModel = parser.parse('''
        Global {
            System = "Example System";
        }
        
        Hardware {
            Compartment Comp1 {
                Box Box1 {
                    Board Board1 {
                        Processor P1 {
                            Core C0 {}
                        }
                    }
                    Board Board2 {
                        Processor P1 {
                            Provides shared feature "Feature"; 
                            Core C1 {}
                        }
                    }
                    Board Board3 {
                        Processor P1 {
                            Provides 2 of exclusive feature "Feature"; 
                            Core C2 {}
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Requires 1 of exclusive Processor feature "Feature";
                }
                Task A1_T2 {
                    Requires shared Processor feature "Feature";
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
        
        /* There should only be 1 solution */
        Assert.assertEquals(1, assistSolver.results.size)
     
        /* Check that there is only 1 task mapped to CO and 1 task mapped to C1 */
        for (result : assistSolver.results) {
            val tasksC0 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C0"].head)
            val tasksC1 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C1"].head)
            val tasksC2 = result.getMappedTasksForCore(assistModel.allCores.filter[name == "C2"].head)
            
            Assert.assertEquals(0, tasksC0.size)
            Assert.assertEquals(1, tasksC1.size)
            Assert.assertEquals(1, tasksC2.size)
            
            // Check that T1 is depoyed to C2
            Assert.assertEquals("A1_T1", tasksC2.head.getName)
            
            // Check that T2 is deployed to C1
            Assert.assertEquals("A1_T2", tasksC1.head.getName)
        }
    }
}