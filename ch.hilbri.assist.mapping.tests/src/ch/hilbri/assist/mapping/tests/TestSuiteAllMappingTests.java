package ch.hilbri.assist.mapping.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ch.hilbri.assist.mapping.tests.misc.ChocoSolverTests;
import ch.hilbri.assist.mapping.tests.misc.SearchTypeTests;
import ch.hilbri.assist.mapping.tests.strategies.BasicStrategyTest;

@RunWith(Suite.class)
@SuiteClasses({
	SearchTypeTests.class,
	ChocoSolverTests.class,
	BasicStrategyTest.class
})  

public class TestSuiteAllMappingTests {}
