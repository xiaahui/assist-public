package ch.hilbri.assist.mapping.solver.constraints.choco

import org.chocosolver.solver.constraints.Propagator
import org.chocosolver.solver.constraints.PropagatorPriority
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.events.IntEventType

class PropElement extends Propagator<IntVar> {
	
	private int[] table
	
	new(IntVar value, int[] table, IntVar index) {
		super(#[value, index], PropagatorPriority.BINARY, true)
		this.table = table
	}

	override isEntailed() {
		// TODO: Implement me!
	}	
	
	override propagate(int evtmask) throws ContradictionException {
		// Restrict the possible variables for the index var
		vars.get(1).updateLowerBound(0, aCause)
		vars.get(1).updateUpperBound(table.length - 1, aCause)
		
		// Trigger an initial filtering
		filter(false, 2)
	}
	
	override propagate(int varIdx, int mask) throws ContradictionException {
		// TODO: Implement me!
		if (IntEventType.isInstantiate(mask)) {
			// value var got instantiated
			if (varIdx == 0) {
				// instantiate index var
//				vars.get(1).instantiateTo(table.indexOf(vars.get(0).value), aCause)
//				this.vars[1].instantiateTo(this.table[this.vars[1].getValue()], aCause)
//             	this.setPassive()
			}
			
			// index var got instantiated
			else if (varIdx == 1) {
				// instantiate value var
			} 
		}
		
		// call filter - start with index; if index got updated, then filter index and values
	}

	def filter(boolean startWithIndex, int minRuns) throws ContradictionException {
        var int runCounter = 0
		var boolean dirtyFlag
        var boolean updateIndexFromValue = startWithIndex

		// Run at least minRuns times or until nothing changed
        do {
            if (startWithIndex) dirtyFlag = updateIndexFromValue()
            else 				dirtyFlag = updateValueFromIndex()

			// Next run, start with the other "mode"
            updateIndexFromValue = updateIndexFromValue.xor(true)
            
            runCounter++
			
        } while (dirtyFlag || runCounter < minRuns);
	}

	def boolean updateIndexFromValue() throws ContradictionException {
		false
	}
	
	def boolean updateValueFromIndex() throws ContradictionException {
		false
	}
	

		
}