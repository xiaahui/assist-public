package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.basics.ExampleTests
import ch.hilbri.assist.mapping.tests.basics.IndicatorVariablesTests
import ch.hilbri.assist.mapping.tests.constraints.SystemHierarchyConstraintTests
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import ch.hilbri.assist.mapping.tests.constraints.CoreUtilizationConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.RAMorROMConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.ColocalityConstraintTests

@RunWith(Suite) 
@SuiteClasses(
	#[
		ExampleTests, 
		IndicatorVariablesTests, 
		SystemHierarchyConstraintTests,
		CoreUtilizationConstraintTests,
		RAMorROMConstraintTests,
		ColocalityConstraintTests
	]
)

class TestSuiteAllMappingTests {}
