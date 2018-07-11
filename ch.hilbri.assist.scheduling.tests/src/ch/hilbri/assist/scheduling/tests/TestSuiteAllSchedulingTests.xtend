package ch.hilbri.assist.scheduling.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import ch.hilbri.assist.scheduling.tests.basics.ExampleTests
import ch.hilbri.assist.scheduling.tests.basics.DurationTests
import ch.hilbri.assist.scheduling.tests.basics.TaskSwitchingTimeTests
import ch.hilbri.assist.scheduling.tests.basics.PeriodicityTests
import ch.hilbri.assist.scheduling.tests.basics.SynchronizedResourcesTests
import ch.hilbri.assist.scheduling.tests.importer.AmaltheaImporterTests
import ch.hilbri.assist.scheduling.tests.basics.SchedulingRestrictionTests

@RunWith(Suite) 
@SuiteClasses(
	#[
		ExampleTests,
		DurationTests,
		TaskSwitchingTimeTests,
		PeriodicityTests,
		SchedulingRestrictionTests, 
		SynchronizedResourcesTests,
		AmaltheaImporterTests
	]
)

class TestSuiteAllSchedulingTests {}
