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
                                Properties {
                                    "MyIntProperty" = 0;
                                    "MyStringProperty" = "C0";
                                }
                            }
                            Core C1 {
                                Capacity = 100;
                                Properties {
                                    "MyIntProperty" = 1;
                                    "MyStringProperty" = "C1";
                                }
                            }
                        }
                    }
                }
            }
        }
        
        Software {
            Application A1 {
                Task A1_T1 {
                    Properties { 
                        "MyIntProperty" = 1;
                        "MyStringProperty" = "T1";
                    }
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
        for (property : task.customProperties) {
            if (property.name.equals("MyIntProperty")) {
                Assert.assertEquals(1, property.intValue)
                Assert.assertTrue(property.stringValue.equals("1"))
            } else if (property.name.equals("MyStringProperty")) {
                Assert.assertTrue(property.stringValue.equals("T1"))
                Assert.assertNull(property.intValue)
            } else
                Assert.assertFalse(true) // there should be no other property
        }

        /* Lets check these properties for the cores */
        for (core : assistModel.allCores) {
            for (property : core.customProperties) {
                if (property.name.equals("MyIntProperty")) {
                    Assert.assertEquals(assistModel.allCores.indexOf(core), property.intValue)
                    Assert.assertTrue(property.stringValue.equals(assistModel.allCores.indexOf(core).toString))
                } else if (property.name.equals("MyStringProperty")) {
                    Assert.assertTrue(property.stringValue.equals(core.name))
                    Assert.assertNull(property.intValue)
                } else
                    Assert.assertFalse(true) // there should be no other property
            }
        }
    }
}
