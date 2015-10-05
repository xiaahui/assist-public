package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import org.junit.Test

import static org.junit.Assert.*

class SearchTypeTests {
	
	@Test
	def checkExactlyOneDefault() {
		assertEquals(VariableSelectorTypes.values.filter[it.isDefault].length, 1)
		assertEquals(ValueSelectorTypes.values.filter[it.isDefault].length, 1)
	}
	
	@Test
	def checkAvailableStrategieCount() {
		assertTrue(VariableSelectorTypes.values.length >= 1)
		assertTrue(ValueSelectorTypes.values.length >= 1)
	}
	
	@Test
	def checkStaticDefaultIsDefault() {
		assertTrue(VariableSelectorTypes.getDefault.isDefault)
		assertTrue(ValueSelectorTypes.getDefault.isDefault)
	}
}