package ch.hilbri.assist.mapping.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import ch.hilbri.assist.mapping.tests.basics.ExampleTests
import ch.hilbri.assist.mapping.tests.constraints.SystemHierarchyConstraintTests

@RunWith(Suite) 
@SuiteClasses(#[ExampleTests, SystemHierarchyConstraintTests])
class TestSuiteAllMappingTests {
}
