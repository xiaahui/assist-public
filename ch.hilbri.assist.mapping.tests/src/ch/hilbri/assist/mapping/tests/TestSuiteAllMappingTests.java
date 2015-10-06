package ch.hilbri.assist.mapping.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	BasicTests.class,
	InterfaceTypeTests.class,
	ConnectedPinsTests.class,
	ChocoSolverTests.class,
	SearchTypeTests.class,
	StrategyTests.class,
	ColocalityTests.class
})  

public class TestSuiteAllMappingTests {}
