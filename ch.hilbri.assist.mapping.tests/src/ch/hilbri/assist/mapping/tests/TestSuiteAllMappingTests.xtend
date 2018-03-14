package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.basics.ExampleTests
import ch.hilbri.assist.mapping.tests.basics.IndicatorVariablesTests
import ch.hilbri.assist.mapping.tests.constraints.ColocalityConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.CoreUtilizationConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.DesignAssuranceLevelConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.DislocalityConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.DissimilarityConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.RAMorROMConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.RestrictDeploymentConstraintTests
import ch.hilbri.assist.mapping.tests.constraints.SystemHierarchyConstraintTests
import ch.hilbri.assist.mapping.tests.other.PropNoGoodTests
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@RunWith(Suite) 
@SuiteClasses(
	#[
		ExampleTests, 
		IndicatorVariablesTests, 
		SystemHierarchyConstraintTests,
		CoreUtilizationConstraintTests,
		RAMorROMConstraintTests,
		ColocalityConstraintTests,
		DislocalityConstraintTests,
		DissimilarityConstraintTests,
		DesignAssuranceLevelConstraintTests,
		PropNoGoodTests,
		RestrictDeploymentConstraintTests
	]
)

class TestSuiteAllMappingTests {}
