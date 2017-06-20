package ch.hilbri.assist.mapping.solver.strategies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.chocosolver.solver.search.strategy.selectors.values.IntDomainMax;
import org.chocosolver.solver.search.strategy.selectors.values.IntDomainMin;
import org.chocosolver.solver.search.strategy.selectors.values.IntDomainRandom;
import org.chocosolver.solver.search.strategy.selectors.values.IntValueSelector;

import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

public enum ValueSelectorTypes {
	
	// Types
	MIN_VALUE_FIRST ("Min. core index first", "Cores with the minimum index available are taken first", "MNCF", true),
	MAX_VALUE_FIRST ("Max. core index first", "Cores with the maximum index available are taken first", "MXCF", false),
	RANDOM ("Random core", "Cores are chosen at random", "RAND", false)
	;
	
	// Properties
	
	private	final String humanReadableName;
	private final String humanReadableExplanation;
	private final String cliArgumentName;
	private final boolean isDefault;

	// Constructor
	
	ValueSelectorTypes(String name, String explanation, String cliArgumentName, boolean isDefault) {
		this.humanReadableName = name;
		this.humanReadableExplanation = explanation;
		this.cliArgumentName = cliArgumentName;
		this.isDefault = isDefault;
	}
	
	// Methods
	
	public String getHumanReadableName() 			{ return humanReadableName; 		}
	public String getHumanReadableExplanation()		{ return humanReadableExplanation; 	}
	public String getCliArgumentName()				{ return cliArgumentName;			}
	public boolean isDefault()						{ return isDefault;					}
	
	public IntValueSelector getValueSector(SolverVariablesContainer solverVariables, AssistModel assistModel, long randomSeed) { 
		switch (this) {
			case MIN_VALUE_FIRST:										return new IntDomainMin();
			case MAX_VALUE_FIRST:										return new IntDomainMax();
			case RANDOM:												return new IntDomainRandom(randomSeed);
		}
		return null;
	}
	
	/*
	 * Sort the values, so that the default strategy is first 
	 * and the remaining strategies are sorted by name  
	 */
	public static List<ValueSelectorTypes> getSortedValues() {
		List<ValueSelectorTypes> list = new ArrayList<ValueSelectorTypes>();
				
		for (ValueSelectorTypes t : ValueSelectorTypes.values()) list.add(t);
		
		Collections.sort(list, (o1, o2) -> {
			if (o1.isDefault()) 		return -1;
			else if (o2.isDefault()) 	return  1;
			else return o1.humanReadableName.compareTo(o2.humanReadableName);
		});		
		return list;
	}
	
	public static ValueSelectorTypes getDefault()	{ 
		for (ValueSelectorTypes t : ValueSelectorTypes.values()) 
			if (t.isDefault) return t;
		
		// if none is default - return the first
		if (ValueSelectorTypes.values().length > 0)
			return ValueSelectorTypes.values()[0];
		
		else
			return null;
	}
	
	public static ValueSelectorTypes getValueSelectorOrDefault(String cliArgumentName) {
		switch (cliArgumentName) {
		case "MNCF" : return MIN_VALUE_FIRST;
		case "MXCF" : return MAX_VALUE_FIRST;
		case "RAND" : return RANDOM;
		default		: return getDefault();
		}
	}
}
