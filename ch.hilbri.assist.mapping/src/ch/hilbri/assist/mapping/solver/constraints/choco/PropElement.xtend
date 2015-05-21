package ch.hilbri.assist.mapping.solver.constraints.choco

import java.util.ArrayList
import org.chocosolver.solver.constraints.Propagator
import org.chocosolver.solver.constraints.PropagatorPriority
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.events.IntEventType
import org.chocosolver.util.ESat

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
		// Check satisfaction, if all is instantiated
		if (isCompletelyInstantiated) {
			if (valueVar.isInstantiatedTo(table.get(indexVar.value)))
				return ESat.TRUE
			else
				return ESat.FALSE
		} 
		else {
			return ESat.UNDEFINED
		}
			
	}	
	
	// Initial propagation
	override propagate(int evtmask) throws ContradictionException {
		// Restrict the possible variables for the index var
		indexVar.updateLowerBound(0, aCause)
		indexVar.updateUpperBound(table.length - 1, aCause)
		
		// Trigger an initial filtering
		filter
	}
	
	// "Regular" propagation 
	override propagate(int varIdx, int mask) throws ContradictionException {
		
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
			filter
		}
	}

	def filter() throws ContradictionException {
       	
       	// Retrieve all values from indexVar 
       	val indexVarValues = new ArrayList<Integer>
       	val indexIter = indexVar.getValueIterator(true)
       	while (indexIter.hasNext) indexVarValues.add(indexIter.next)
       	
       	// Retrieve all values from valueVar
       	val valueVarValues = new ArrayList<Integer>
       	val valueIter = valueVar.getValueIterator(true)
       	while (valueIter.hasNext) valueVarValues.add(valueIter.next)
       	
       	// All values of both vars are now contained in valueVarValues and indexVarValues
       	
       	// Now we try to find the values, which can be removed from the valueVar
       	val removeableValueVarValues = valueVarValues
       									.filter[value |							   	// filter the existing values
       											indexVarValues.map[table.get(it)]  
       											.filter[value.equals(it)]
       											.length == 0]						// there is no index value which references this value

		// Remove the values which have no corresponding index       											
       	for (v : removeableValueVarValues)
       		valueVar.removeValue(v, aCause)
       		
        
        // Now we try to find the values, which can be removed from the indexVar
        // (Is there a value for every index?)
        val removeableIndexVarValues = indexVarValues.filter[index | valueVarValues.filter[it.equals(table.get(index))]
        																		   .length == 0]

		// Remove the indizes which have no corresponding value
		for (v : removeableIndexVarValues)
			indexVar.removeValue(v, aCause)    
    }
}