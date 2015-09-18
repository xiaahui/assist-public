//package ch.hilbri.assist.mapping.tests.constraints
//
//import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
//import org.chocosolver.solver.Solver
//import org.chocosolver.solver.constraints.ICF
//import org.chocosolver.solver.search.solution.AllSolutionsRecorder
//import org.chocosolver.solver.search.strategy.ISF
//import org.chocosolver.solver.variables.VF
//import org.eclipse.xtext.junit4.XtextRunner
//import org.junit.Test
//import org.junit.runner.RunWith
//
//import static org.junit.Assert.*
//import org.chocosolver.solver.exception.ContradictionException
//
//@RunWith(XtextRunner)
//class AssistElementConstraintTests {
//	
//	@Test
//	def void basicTest() {
//		
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[10,11,12,13]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 4)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 0)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 10)
//		
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 1)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 11)
//		
//		assertEquals(recorder.solutions.get(2).getIntVal(indexVar), 2)
//		assertEquals(recorder.solutions.get(2).getIntVal(valueVar), 12)
//
//		assertEquals(recorder.solutions.get(3).getIntVal(indexVar), 3)
//		assertEquals(recorder.solutions.get(3).getIntVal(valueVar), 13)
//	}
//	
//	@Test
//	def void indexRemovalAtTheBeginningTest() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[10,11,12,13]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		// Removing indizes 0,1
//		solver.post(ICF.member(indexVar, #[2,3]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 2)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 2)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 12)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 3)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 13)
//	}
//
//	@Test
//	def void indexRemovalAtTheEndTest() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[10,11,12,13]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		// Removing indizes 2,3
//		solver.post(ICF.member(indexVar, #[0,1]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 2)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 0)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 10)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 1)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 11)
//	}
//	
//	@Test
//	def void indexRemovalInTheMiddle() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[10,11,12,13]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		// Removing indizes 1,2
//		solver.post(ICF.member(indexVar, #[0,3]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 2)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 0)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 10)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 3)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 13)
//	}
//	
//	@Test
//	def void valueRemovalAtTheBeginningTest() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[10,11,12,13]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		// Removing values 10, 11
//		solver.post(ICF.member(valueVar, #[12,13]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 2)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 2)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 12)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 3)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 13)
//	}
//
//	@Test
//	def void valueRemovalAtTheEndTest() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[10,11,12,13]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		// Removing values 12, 13
//		solver.post(ICF.member(valueVar, #[10,11]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 2)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 0)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 10)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 1)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 11)
//	}
//	
//	@Test
//	def void valueRemovalInTheMiddle() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[10,11,12,13]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		// Removing values 11,12
//		solver.post(ICF.member(valueVar, #[10,13]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 2)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 0)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 10)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 3)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 13)
//	}
//	
//	@Test
//	def void doubleValuesTest() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[1,1,2]
//		val indexVar = VF.enumerated("index", 0, 2, solver)
//		val valueVar = VF.enumerated("value", 1, 2, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 3)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 0)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 1)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 1)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 1)
//		
//		assertEquals(recorder.solutions.get(2).getIntVal(indexVar), 2)
//		assertEquals(recorder.solutions.get(2).getIntVal(valueVar), 2)
//	}
//	
//	@Test
//	def void largerDomainsWithSmallerTable() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[15,500,700]
//		val indexVar = VF.enumerated("index", 0, 2000, solver)
//		val valueVar = VF.enumerated("value", 1, 2000, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		solver.propagate
//		
//		assertEquals(3, indexVar.domainSize)
//		assertEquals(3, valueVar.domainSize)
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(recorder.solutions.length, 3)
//		
//		assertEquals(recorder.solutions.get(0).getIntVal(indexVar), 0)
//		assertEquals(recorder.solutions.get(0).getIntVal(valueVar), 15)
//
//		assertEquals(recorder.solutions.get(1).getIntVal(indexVar), 1)
//		assertEquals(recorder.solutions.get(1).getIntVal(valueVar), 500)
//		
//		assertEquals(recorder.solutions.get(2).getIntVal(indexVar), 2)
//		assertEquals(recorder.solutions.get(2).getIntVal(valueVar), 700)
//	}
//	
//	@Test(expected=ContradictionException)
//	def void failingElementConstraint() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[15,500,700]
//		val indexVar = VF.enumerated("index", 0, 2000, solver)
//		val valueVar = VF.enumerated("value", 1, 2000, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		solver.post(ICF.arithm(indexVar, "<", 1))
//		solver.post(ICF.arithm(valueVar, ">", 300))
//		
//		solver.propagate
//	}
//		
//	@Test
//	def void unsortedValueListe() {
//		val solver = new Solver
//		
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[13,11,12,11]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		
//		solver.post(ICF.member(valueVar, #[12, 13]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(2, recorder.solutions.length)
//		
//		assertEquals(0, recorder.solutions.get(0).getIntVal(indexVar))
//		assertEquals(13, recorder.solutions.get(0).getIntVal(valueVar))
//		
//		assertEquals(2, recorder.solutions.get(1).getIntVal(indexVar))
//		assertEquals(12, recorder.solutions.get(1).getIntVal(valueVar))
//	}
//	
//		
//	@Test
//	def void instantiationTest1() {	
//		
//		val solver = new Solver
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[13,11,12,11]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		solver.post(ICF.member(valueVar, #[12]))
//		
//		solver.set(ISF.lexico_LB(#[indexVar, valueVar]))
//		solver.findAllSolutions
//		
//		assertEquals(1, recorder.solutions.length)
//		
//		assertEquals(2, recorder.solutions.get(0).getIntVal(indexVar))
//		assertEquals(12, recorder.solutions.get(0).getIntVal(valueVar))
//	}
//	
//	@Test
//	def void instantiationTest2() {	
//		
//		val solver = new Solver
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[13,11,12,11]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		solver.post(ICF.member(valueVar, #[11]))
//		
//		solver.propagate
//		
//		var iterator = indexVar.getValueIterator(true)
//		assertEquals(1, iterator.next)
//		assertEquals(3, iterator.next)
//		
//		assertFalse(iterator.hasNext)
//	}
//	
//	@Test
//	def void instantiationTest3() {	
//		
//		val solver = new Solver
//		val recorder = new AllSolutionsRecorder(solver)
//		solver.set(recorder)
//		
//		val table = #[13,11,12,11]
//		val indexVar = VF.enumerated("index", 0, 3, solver)
//		val valueVar = VF.enumerated("value", 10, 13, solver)
//		
//		solver.post(ACF.element(valueVar, table, indexVar))
//		
//		solver.post(ICF.member(valueVar, #[13]))
//		
//		solver.propagate
//		
//		var iterator = indexVar.getValueIterator(true)
//		assertEquals(0, iterator.next)
//		
//		assertFalse(iterator.hasNext)
//	}
//}