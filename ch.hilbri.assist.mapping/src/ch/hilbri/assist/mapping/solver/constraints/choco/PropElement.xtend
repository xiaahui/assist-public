package ch.hilbri.assist.mapping.solver.constraints.choco

import org.chocosolver.solver.constraints.Propagator
import org.chocosolver.solver.constraints.PropagatorPriority
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.events.IntEventType

class PropElement extends Propagator<IntVar> {
	
	private int[] table
	private IntVar indexVar
	private IntVar valueVar
	
	new(IntVar value, int[] table, IntVar index) {
		// vars.get(0) --> value
		// vars.get(1) --> index
		super(#[value, index], PropagatorPriority.BINARY, true)
		this.table = table
		this.indexVar = index
		this.valueVar = value
	}

	override isEntailed() {
		// TODO: Implement me!
	}	
	
	// Initial propagation
	override propagate(int evtmask) throws ContradictionException {
		// Restrict the possible variables for the index var
		indexVar.updateLowerBound(0, aCause)
		indexVar.updateUpperBound(table.length - 1, aCause)
		
		// Trigger an initial filtering
		filter(false)
	}
	
	// "Regular" propagation 
	override propagate(int varIdx, int mask) throws ContradictionException {
		// TODO: Implement me!
		
		// Do some stuff special, if one of the variables got instantiated
		if (IntEventType.isInstantiate(mask)) {
		
			// value var got instantiated
			if (varIdx == 0) {
				
				// Retrieve the value of the value variable
				val value = valueVar.value
				
				// Remove every index which does not correspond to this value
				val vit = indexVar.getValueIterator(true)
 				while(vit.hasNext()) {
     				val index = vit.next
     				
     				// if this index does not lead to the instantiated value, remove it
  					if (table.get(index) != value)
  						indexVar.removeValue(index, aCause)   
 				}
			}
			
			// index var got instantiated
			else if (varIdx == 1) {
				// instantiate value var
				valueVar.instantiateTo(table.get(indexVar.value), aCause)
				setPassive
			} 
		}
		
		// it wasn't an instantiation event
		else {
			if (varIdx == 0) filter(true)
			else			 filter(false)
		}
	}

	def filter(boolean startWithIndex) throws ContradictionException {
       	var boolean dirtyFlag
        var boolean updateIndexFromValue = startWithIndex

		// Run until nothing changed
        do {
            if (startWithIndex) dirtyFlag = updateIndexFromValue()
            else 				dirtyFlag = updateValueFromIndex()

			// Next run, start with the other "mode" (toggle)
            updateIndexFromValue = updateIndexFromValue.xor(true)
        } while (dirtyFlag);
	}

	def boolean updateIndexFromValue() throws ContradictionException {
		false
	}
	
	def boolean updateValueFromIndex() throws ContradictionException {
		var hasChanged = false
		
		// go through all values in valueVar
		val vit = valueVar.getValueIterator(true)
 		while(vit.hasNext()) {
//     		val value = vit.next
			
			// for each value, there should be a corresponding
			// index in the indexVar
//			table.     	
		}
		return hasChanged
	}
	

		
}