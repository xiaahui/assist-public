package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.basics.IndicatorVariablesTests
import ch.hilbri.assist.mapping.tests.constraints.SystemHierarchyConstraintTests
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@RunWith(Suite) 
@SuiteClasses(#[IndicatorVariablesTests, SystemHierarchyConstraintTests])
class TestSuiteAllMappingTests {
}
