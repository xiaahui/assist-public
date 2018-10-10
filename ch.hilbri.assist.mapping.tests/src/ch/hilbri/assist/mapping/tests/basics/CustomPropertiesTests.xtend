package ch.hilbri.assist.mapping.tests.basics

import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class CustomPropertiesTests extends AbstractMappingTest {
    @Test
    def void Test1() {
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
                            Core C0 {
                                Capacity = 100;
                                Custom Property "MyIntProperty" = 0;
                                Custom Property "MyStringProperty" = "C0";
                            }
                            Core C1 {
                                Capacity = 100;
                                Custom Property "MyIntProperty" = 1;
                                Custom Property "MyStringProperty" = "C1";
                            }
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Custom Property "MyIntProperty" = 1;
                    Custom Property "MyStringProperty" = "T1";
                }
            }
        }''')

        /* We have a proper model */
        Assert.assertNotNull(assistModel)

        /* It does not contain any errors */
        Assert.assertTrue(assistModel.eResource.errors.isEmpty)

        val assistSolver = new AssistMappingSolver(assistModel)
        assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
        assistSolver.solverMaxSolutions = 1000
        assistSolver.runInitialization
        assistSolver.runConstraintGeneration
        assistSolver.runSolutionSearch
        assistSolver.createSolutions

        /* We are expecting 2 solutions */
        Assert.assertEquals(2, assistSolver.results.size)

        /* We are expecting two cores and one task */
        Assert.assertEquals(2, assistModel.allCores.size)
        Assert.assertEquals(1, assistModel.allTasks.size)

        /* Lets check these properties for the task */
        val task = assistModel.allTasks.head

        val propList = task.getCustomPropertiesWithName("MyIntProperty")
        Assert.assertEquals(1, propList.size)
        Assert.assertEquals(1, task.getCustomIntProperty("MyIntProperty"))

        val propList2 = task.getCustomPropertiesWithName("MyStringProperty")
        Assert.assertEquals(1, propList2.size)
        Assert.assertEquals("T1", task.getCustomStringProperty("MyStringProperty"))


        /* Lets check these properties for the cores */
        for (core : assistModel.allCores) {
            Assert.assertEquals(assistModel.allCores.indexOf(core), core.getCustomIntProperty("MyIntProperty"))
            Assert.assertEquals(core.name, core.getCustomStringProperty("MyStringProperty"))
        }
    }
}
