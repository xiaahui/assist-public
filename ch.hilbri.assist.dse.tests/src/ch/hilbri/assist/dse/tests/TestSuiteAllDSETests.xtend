package ch.hilbri.assist.dse.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import ch.hilbri.assist.dse.tests.basics.VariancePointRemovalTests

@RunWith(Suite) 
@SuiteClasses(
	#[
		VariancePointRemovalTests
	])
class 	TestSuiteAllDSETests {}

