package org.chocosolver.solver.constraints.nary.alldifferent;

import gnu.trove.map.hash.THashMap;
import gnu.trove.stack.array.TIntArrayStack;

import java.util.Arrays;
import java.util.List;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.events.IntEventType;
import org.chocosolver.util.ESat;

public class PropAllDiffListsOfListsInst extends Propagator<IntVar> {

	protected TIntArrayStack toCheck = new TIntArrayStack();
	private IntVar[][] variables = null;
	
	
	//***********************************************************************************
    // CONSTRUCTORS
    //***********************************************************************************

	
	public PropAllDiffListsOfListsInst(IntVar[][] variables, IntVar[] flatVariablesList) {
		super(flatVariablesList, PropagatorPriority.UNARY, true);
		this.variables = variables;
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
        toCheck.clear();
        
        for (int i = 0; i < variables.length; i++) {
        	for (int j = 0; j < variables[i].length; j++) { 
        		if (variables[i][j].isInstantiated()) {
                	// order of instructions matters!
        			toCheck.push(i);
        			toCheck.push(j);
        		}
            }
        }
        fixpoint();
    }
    
    @Override
    public void propagate(int varIdx, int mask) throws ContradictionException {
        
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
    	        
        fixpoint();
    }

    protected void fixpoint() throws ContradictionException {
        try {
            while (toCheck.size() > 0) {
                
            	// order of instructions matters!
            	int vidx_j = toCheck.pop();
            	int vidx_i = toCheck.pop();
            	
            	int val = variables[vidx_i][vidx_j].getValue();
                
                // Remove that value from all other vars in all other sets
                for (int i = 0; i < variables.length; i++) {
                	for (int j = 0; j < variables[i].length; j++) {
                    	// Am I in a different list than vidx?
                		if (i != vidx_i) {
                    		if (variables[i][j].removeValue(val, aCause)) {
                    			if (variables[i][j].isInstantiated()) {
                    				toCheck.push(i);
                    				toCheck.push(j);
                    			}
                    		}
                    	}
                	}
                }
        
            }
        }
        catch (ContradictionException cex) {
            toCheck.clear();
            throw cex;
        }
    }
    
    
	@Override
	public ESat isEntailed() {
		 int nbInst = 0;
	     for (int i = 0; i < variables.length; i++) {
	    	 for (int j = 0; j < variables[i].length; j++) {
	    		 if (variables[i][j].isInstantiated()) {
	    			 nbInst++;
	    			 
	    			 // Check if any other variable in any other set is instantiated to the same value
	    			 for (int x = i+1; x < variables.length; x++) {
	    				 for (int y = 0; y < variables[x].length; y++) {
	    					if (variables[x][y].isInstantiatedTo(variables[i][j].getValue())) return ESat.FALSE; 
	    				 }
	    			 }
	    				 
	    		 }
	    	 }
	     }
	     
	     if (nbInst == vars.length) return ESat.TRUE;
	     
	     return ESat.UNDEFINED;
	}
}
