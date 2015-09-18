package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.solver.SearchType
import org.junit.Test

import static org.junit.Assert.*

class SearchTypeTests {
	
	@Test
	def checkExactlyOneDefault() {
		assertEquals(SearchType.values.filter[it.isDefault].length, 1)
	}
	
	@Test
	def checkAvailableStrategieCount() {
		assertTrue(SearchType.values.length >= 1)
	}
	
	@Test
	def checkStaticDefaultIsDefault() {
		assertTrue(SearchType.getDefaultSearchType.isDefault)
	}
}