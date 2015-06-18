package ch.hilbri.assist.mapping.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ch.hilbri.assist.mapping.tests.constraints.AssistElementConstraintTests;
import ch.hilbri.assist.mapping.tests.constraints.ColocalityTest;
import ch.hilbri.assist.mapping.tests.constraints.ConfigurablePinTests;
import ch.hilbri.assist.mapping.tests.constraints.ConfigurablePinTests2;
import ch.hilbri.assist.mapping.tests.constraints.DislocalityPropagationTests;
import ch.hilbri.assist.mapping.tests.constraints.DislocalityTest2;
import ch.hilbri.assist.mapping.tests.constraints.DislocalityTests;
import ch.hilbri.assist.mapping.tests.constraints.ProtectionLevelTest1;
import ch.hilbri.assist.mapping.tests.constraints.ProtectionLevelTest2;
import ch.hilbri.assist.mapping.tests.constraints.ProtectionLevelTest3;
import ch.hilbri.assist.mapping.tests.constraints.ProtectionLevelTest4;
import ch.hilbri.assist.mapping.tests.constraints.RestrictValidDeploymentTest;
import ch.hilbri.assist.mapping.tests.constraints.RestrictValidDeploymentTest2;
import ch.hilbri.assist.mapping.tests.groups.ImplicitlyDefinedGroups;
import ch.hilbri.assist.mapping.tests.misc.ChocoSolverTests;
import ch.hilbri.assist.mapping.tests.misc.SearchTypeTests;
import ch.hilbri.assist.mapping.tests.results.BasicResultTests;
import ch.hilbri.assist.mapping.tests.strategies.BasicStrategyTest;

@RunWith(Suite.class)
@SuiteClasses({
	BasicResultTests.class,
	DislocalityTests.class,
	DislocalityPropagationTests.class,
	DislocalityTest2.class,
	ImplicitlyDefinedGroups.class,
	ColocalityTest.class,
	RestrictValidDeploymentTest.class,
	RestrictValidDeploymentTest2.class,
	SearchTypeTests.class,
	ChocoSolverTests.class,
	BasicStrategyTest.class,
	AssistElementConstraintTests.class,
	ConfigurablePinTests.class,
	ConfigurablePinTests2.class,
	ProtectionLevelTest1.class,
	ProtectionLevelTest2.class,
	ProtectionLevelTest3.class,
	ProtectionLevelTest4.class
})  

public class TestSuiteAllMappingTests {}
