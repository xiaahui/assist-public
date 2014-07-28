package ch.hilbri.assist.mapping.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ch.hilbri.assist.mapping.tests.results.BasicResultTests;
import ch.hilbri.assist.mapping.tests.results.MultipleResultsTests;

@RunWith(Suite.class)
@SuiteClasses({
	BasicResultTests.class,
	MultipleResultsTests.class
})  

public class TestSuiteAllMappingTests {}
