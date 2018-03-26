package ch.hilbri.assist.scheduling.tests;

import ch.hilbri.assist.scheduling.tests.basics.DurationTests;
import ch.hilbri.assist.scheduling.tests.basics.ExampleTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ExampleTests.class, DurationTests.class })
@SuppressWarnings("all")
public class TestSuiteAllSchedulingTests {
}
