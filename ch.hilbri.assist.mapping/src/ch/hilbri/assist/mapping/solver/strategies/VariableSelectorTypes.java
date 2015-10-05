package ch.hilbri.assist.mapping.solver.strategies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.chocosolver.solver.search.strategy.ISF;
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy;
import org.chocosolver.solver.variables.IntVar;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

public enum VariableSelectorTypes {

	MIN_DOMAIN_FIRST("Min domainsize first", "Interfaces with smallest domain are chosen first.", false, true),
	MAX_DEGREE_FIRST("Max relation degree first", "Interfaces are selected based on their appearance in co-locality and dislocality groups", false, true),
	MOST_DISLOCALITIES_FIRST("Max dislocalities first", "The interface which is part of the highest number of dislocality relations is chosen first", false, true),
	RANDOM("Random", "Interfaces are chosen at random", false, true),
	DOM_OVER_WDEG("Domain over weighted degree", "Interfaces are selected based on: min({Domainsize(iface) / weight * degree(interface)})", true, true),
	ACTIVITY("Activity", "See: 'Activity-Based Search for Black-Box Constraint Programming Solvers', L. Michel and P. Van Hentenryck, 2012.", false, false),
	;
	
	// Properties
	private	final String humanReadableName;
	private final String humanReadableExplanation;
	private final boolean isDefault;
	private final boolean isValueSelectorRequired;
		
	VariableSelectorTypes(String name, String explanation, boolean isDefault, boolean isValueSelectorRequired) {
		this.humanReadableName = name;
		this.humanReadableExplanation = explanation;
		this.isDefault = isDefault;
		this.isValueSelectorRequired = isValueSelectorRequired;
	}
	
	public String getHumanReadableName() 			{ return humanReadableName; 		}
	public String getHumanReadableExplanation()		{ return humanReadableExplanation; 	}
	public boolean isDefault()						{ return isDefault;					}
	public boolean isValueSelectorRequired()		{ return isValueSelectorRequired;	}
	
	public AbstractStrategy<IntVar> getStrategy(SolverVariablesContainer solverVariables, AssistModel model, long randomSeed, ValueSelectorTypes valSelector) {
		IntVar[] vars = solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN);
		
		switch (this) {
			case DOM_OVER_WDEG:				return ISF.domOverWDeg(vars, randomSeed, valSelector.getValueSector(solverVariables, model, randomSeed));
			case MAX_DEGREE_FIRST:			return ISF.custom(new FirstFailThenMaxRelationDegree(solverVariables, model), valSelector.getValueSector(solverVariables, model, randomSeed), vars);
			case MIN_DOMAIN_FIRST:			return ISF.custom(ISF.minDomainSize_var_selector(), valSelector.getValueSector(solverVariables, model, randomSeed), vars); 
			case MOST_DISLOCALITIES_FIRST:	return ISF.custom(new VariablesInMostDislocalityRelationsFirst(solverVariables, model), valSelector.getValueSector(solverVariables, model, randomSeed), vars);
			case RANDOM:					return ISF.custom(ISF.random_var_selector(randomSeed), valSelector.getValueSector(solverVariables, model, randomSeed), vars);
			case ACTIVITY:					return ISF.activity(vars, randomSeed);
		}
		return null;
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
