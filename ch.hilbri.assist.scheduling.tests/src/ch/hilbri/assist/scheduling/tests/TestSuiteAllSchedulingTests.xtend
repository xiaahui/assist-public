package ch.hilbri.assist.scheduling.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import ch.hilbri.assist.scheduling.tests.basics.ExampleTests

@RunWith(Suite) 
@SuiteClasses(
	#[
		ExampleTests
	]
)

class TestSuiteAllSchedulingTests {}
