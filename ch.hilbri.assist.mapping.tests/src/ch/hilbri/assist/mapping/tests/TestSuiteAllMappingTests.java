package ch.hilbri.assist.mapping.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ch.hilbri.assist.mapping.tests.constraints.DislocalityTests;
import ch.hilbri.assist.mapping.tests.results.BasicResultTests;

@RunWith(Suite.class)
@SuiteClasses({
	BasicResultTests.class,
	DislocalityTests.class
})  

public class TestSuiteAllMappingTests {}
