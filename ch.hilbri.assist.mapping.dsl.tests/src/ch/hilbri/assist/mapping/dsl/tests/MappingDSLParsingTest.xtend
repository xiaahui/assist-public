package ch.hilbri.assist.mapping.dsl.tests

import ch.hilbri.assist.mapping.model.AssistModel
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MappingDSLInjectorProvider)
class MappingDSLParsingTest {
	@Inject
	ParseHelper<AssistModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
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
							Core C0 { Capacity = 100; }
							Core C1 { Capacity = 100; }
						}
					}
				}
			}
		}
		
		Software {
			Application A1 {
				CriticalityLevel = A;
				Task A1_T1 {
					CoreUtilization = 10;
				}
			}
		}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
