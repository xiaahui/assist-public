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
}