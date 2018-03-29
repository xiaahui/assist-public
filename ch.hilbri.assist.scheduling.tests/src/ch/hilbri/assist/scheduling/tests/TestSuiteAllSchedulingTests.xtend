package ch.hilbri.assist.scheduling.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import ch.hilbri.assist.scheduling.tests.basics.ExampleTests
import ch.hilbri.assist.scheduling.tests.basics.DurationTests
import ch.hilbri.assist.scheduling.tests.basics.TaskSwitchingTimeTests

@RunWith(Suite) 
@SuiteClasses(
	#[
		ExampleTests,
		DurationTests,
		TaskSwitchingTimeTests
	]
)

class TestSuiteAllSchedulingTests {}
