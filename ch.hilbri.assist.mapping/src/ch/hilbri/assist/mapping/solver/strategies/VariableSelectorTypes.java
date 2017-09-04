package ch.hilbri.assist.mapping.solver.strategies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.chocosolver.solver.search.strategy.Search;
import org.chocosolver.solver.search.strategy.selectors.variables.DomOverWDeg;
import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail;
import org.chocosolver.solver.search.strategy.selectors.variables.ImpactBased;
import org.chocosolver.solver.search.strategy.selectors.variables.Random;
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy;
import org.chocosolver.solver.variables.IntVar;

import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

public enum VariableSelectorTypes {

	DOM_OVER_WDEG("Domain over weighted degree", 							"Tasks are selected based on: min({Domainsize(task) / weight * degree(task)})",												"DOWD", true, 	true),
	MIN_DOMAIN_FIRST("Min domainsize first", 								"Tasks with smallest domain are chosen first.", 																			"MNDF", false, 	true),
	RANDOM("Random", 														"Tasks are chosen at random", 																								"RAND", false, 	true),
	ACTIVITY("Activity",													"A black-box strategy for IntVar which selects the non-instantiated variable with the largest ratio a(x) / |d(x)|, " + 
																			"where |d(x)| denotes the domain size of a variable x and a(x) its activity.", 												"ACTY", false, 	false),
	IMPACT("Impact", 														"A black-box strategy for IntVar which selects the non-instantiated variable with the largest impact " + 
																			"sum_{a in d(x)}{1 - I(x = a), I(x = a) denotes the impact of assigning the variable x to a value a from its domain d(x). ","IPCT", false, false)	
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
	
	public AbstractStrategy<IntVar> getStrategy(SolverVariablesContainer solverVariables, AssistModel assistModel, long seed, ValueSelectorTypes valSelector) {
		
		/* I think we should try to iterate over all variables - not just the core level */
		// IntVar[] vars = solverVariables.getLocationVariablesForCoreLevel();
		IntVar[] vars = solverVariables.getAllLocationVariables();
		
		
		switch (this) {
			case DOM_OVER_WDEG:			return new DomOverWDeg(vars, seed, valSelector.getValueSector(solverVariables, assistModel, seed));
			case RANDOM:				return Search.intVarSearch(new Random<>(seed), valSelector.getValueSector(solverVariables, assistModel, seed), vars);
			case MIN_DOMAIN_FIRST:		return Search.intVarSearch(new FirstFail(vars[0].getModel()), valSelector.getValueSector(solverVariables, assistModel, seed), vars);
			case ACTIVITY:				return Search.activityBasedSearch(vars);
			case IMPACT:				return new ImpactBased(vars, false); 
		}
		
		return null;
	}
	
	public static VariableSelectorTypes getVariableSelectorOrDefault(String cliArgumentName) {
		switch (cliArgumentName) {
			case "RAND" : return RANDOM;
			case "DOWD" : return DOM_OVER_WDEG;
			case "MNDF" : return MIN_DOMAIN_FIRST;
			case "ACTY"	: return ACTIVITY;
			case "IPCT" : return IMPACT;
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
