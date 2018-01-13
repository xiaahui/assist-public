package ch.hilbri.assist.scheduling.solver.strategies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.chocosolver.solver.search.strategy.Search;
import org.chocosolver.solver.search.strategy.selectors.variables.DomOverWDeg;
import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail;
import org.chocosolver.solver.search.strategy.selectors.variables.Random;
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy;
import org.chocosolver.solver.variables.IntVar;

import ch.hilbri.assist.scheduling.model.AssistModelScheduling;
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer;

public enum VariableSelectorTypes {

	DOM_OVER_WDEG("Domain over weighted degree", "", "DOWD", true, 	true),
	MIN_DOMAIN_FIRST("Min domainsize first", "",   	"MNDF", false, 	true),
	RANDOM("Random", "",								"RAND", false, 	true)
	;
	
	// Properties
	private	final String humanReadableName;
	private final String humanReadableExplanation;
	private final String cliArgumentName;
	private final boolean isDefault;
	private final boolean isValueSelectorRequired;
		
	VariableSelectorTypes(String name, String explanation, String cliArgumentName, boolean isDefault, boolean isValueSelectorRequired) {
		this.humanReadableName = name;
		this.humanReadableExplanation = explanation;
		this.cliArgumentName = cliArgumentName;
		this.isDefault = isDefault;
		this.isValueSelectorRequired = isValueSelectorRequired;
	}
	
	public String getHumanReadableName() 			{ return humanReadableName; 		}
	public String getHumanReadableExplanation()		{ return humanReadableExplanation; 	}
	public String getCliArgumentName()				{ return cliArgumentName;			}
	public boolean isDefault()						{ return isDefault;					}
	public boolean isValueSelectorRequired()		{ return isValueSelectorRequired;	}
	
	public AbstractStrategy<IntVar> getStrategy(SolverVariablesContainer solverVariables, AssistModelScheduling assistModel, long seed, ValueSelectorTypes valSelector) {
		
		/* I think we should try to iterate over all variables - not just the core level */
		// IntVar[] vars = solverVariables.getLocationVariablesForCoreLevel();
		IntVar[] vars = solverVariables.getAllVariables();
		
		
		switch (this) {
			case DOM_OVER_WDEG:		return new DomOverWDeg(vars, seed, valSelector.getValueSector(solverVariables, assistModel, seed));
			case RANDOM:				return Search.intVarSearch(new Random<>(seed), valSelector.getValueSector(solverVariables, assistModel, seed), vars);
			case MIN_DOMAIN_FIRST:	return Search.intVarSearch(new FirstFail(vars[0].getModel()), valSelector.getValueSector(solverVariables, assistModel, seed), vars);
		}
		
		return null;
	}
	
	public static VariableSelectorTypes getVariableSelectorOrDefault(String cliArgumentName) {
		switch (cliArgumentName) {
			case "RAND" : return RANDOM;
			case "DOWD" : return DOM_OVER_WDEG;
			case "MNDF" : return MIN_DOMAIN_FIRST;
			default		: return getDefault();
		}
	}

	/*
	 * Sort the values, so that the default strategy is first 
	 * and the remaining strategies are sorted by name  
	 */
	public static List<VariableSelectorTypes> getSortedValues() {
		List<VariableSelectorTypes> list = new ArrayList<VariableSelectorTypes>();
		
		for (VariableSelectorTypes t : VariableSelectorTypes.values()) list.add(t);
		
		Collections.sort(list, new Comparator<VariableSelectorTypes>(){

			@Override
			public int compare(VariableSelectorTypes o1, VariableSelectorTypes o2) {
				if (o1.isDefault()) 		return -1;
				else if (o2.isDefault()) 	return  1;
				else return o1.humanReadableName.compareTo(o2.humanReadableName);
			}});
		
		return list;
	}
	
	public static VariableSelectorTypes getDefault()	{ 
		for (VariableSelectorTypes t : VariableSelectorTypes.values()) 
			if (t.isDefault) return t;
		return null;
	}
	
	
}
