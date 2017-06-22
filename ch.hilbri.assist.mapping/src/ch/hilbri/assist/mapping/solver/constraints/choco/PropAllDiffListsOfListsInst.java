package ch.hilbri.assist.mapping.solver.constraints.choco;

import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.events.IntEventType;
import org.chocosolver.util.ESat;

import gnu.trove.stack.array.TIntArrayStack;

public class PropAllDiffListsOfListsInst extends Propagator<IntVar> {

	protected TIntArrayStack toCheck = new TIntArrayStack();
	private int[] cumulLengths = null;
	
	
	//***********************************************************************************
    // CONSTRUCTORS
    //***********************************************************************************

	
	public PropAllDiffListsOfListsInst(int[] cumulLengths, IntVar[] flatVariablesList) {
		super(flatVariablesList, PropagatorPriority.UNARY, true);
		// cumulLengths needs to be strictly monotone increasing (no empty lists) and the last entry must be equal to the number of vars, maybe we should check here
		this.cumulLengths = cumulLengths;
	}
	
	//***********************************************************************************
    // INFO
    //***********************************************************************************

    @Override
    public int getPropagationConditions(int vIdx) {
        return IntEventType.instantiation();
    }

    //***********************************************************************************
    // PROPAGATION
    //***********************************************************************************

    @Override
    public void propagate(int evtmask) throws ContradictionException {
        for (int i = 0; i < vars.length; i++) {
    		if (vars[i].isInstantiated()) {
    			toCheck.push(i);
            }
        }
        fixpoint();
    }
    
    @Override
    public void propagate(int varIdx, int mask) throws ContradictionException {
		toCheck.push(varIdx);
/*        
    	int ctr = 0;
    	
    	outerloop:
    	for (int i = 0; i < variables.length; i++) {
    		for (int j = 0; j < variables[i].length; j++) {
    			if (ctr == varIdx) {
    				toCheck.push(i);
    				toCheck.push(j);
    				break outerloop;
    			} else {
    				ctr++;
    			}
    		}
    	}
*/    	        
        fixpoint();
    }

    protected void fixpoint() throws ContradictionException {
//        try {
//            while (toCheck.size() > 0) {
//            	final int vIdx = toCheck.pop();
//            	final int val = vars[vIdx].getValue();
//                
//                // Remove that value from all other vars in all other sets
//            	int lIdx = 0; // counter for the sub-lists
//            	
//            	// Can we skip the first sub-list?
//            	final boolean inList = (vIdx < cumulLengths[0]);
//                
//            	// Go through all variables
//            	for (int i = (inList ? cumulLengths[0] : 0); i < vars.length; i++) {
//                	// Are we at the end of a sub-list?
//            		if (i == cumulLengths[lIdx]) {
//                		lIdx++;  // go to the next sub-list
//                		// is the variable in the now current sub-list
//                		if (vIdx >= cumulLengths[lIdx-1] && vIdx < cumulLengths[lIdx]) {
//                			// Skip this sub-list
//                			i = cumulLengths[lIdx] - 1; // because of the i++ in the for loop
//                			continue;
//                		}
//                	}
//            		if (vars[i].removeValue(val, aCause)) {
//            			if (vars[i].isInstantiated()) {
//            				toCheck.push(i);
//                		}
//                	}
//                }
//            }
//        }
//        catch (ContradictionException cex) {
//            toCheck.clear();
//            throw cex;
//        }
    }
    
    
	@Override
	public ESat isEntailed() {
        ESat ret = ESat.TRUE;
     	int lIdx = 0;
	    for (int i = 0; i < vars.length; i++) {
        	if (i == cumulLengths[lIdx]) {
        		lIdx++;
        	}
            if (vars[i].isInstantiated()) {
            	final int val = vars[i].getValue();
                for (int j = cumulLengths[lIdx]; j < vars.length; j++) {
					if (vars[j].isInstantiatedTo(val)) return ESat.FALSE; 
                }
            } else {
            	ret = ESat.UNDEFINED;
            }
        }
        return ret;
	}
}
