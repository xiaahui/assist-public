package ch.hilbri.assist.mapping.solver.strategies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.chocosolver.solver.search.strategy.ISF;
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

public enum ValueSelectorTypes {
	
	// Types
	
	MIN_VALUE_FIRST ("Min. pin index first", "Pins with the minimum index available are taken first", "MNPF", false),
	MAX_VALUE_FIRST ("Max. pin index first", "Pins with the maximum index available are taken first", "MXPF", false),
	RANDOM ("Random pin", "Pins are chosen at random", "RAND", false),
	CLOSEST_DISTANCE ("Closest RDC first", "Closest RDC first; pins of an RDC are selected according to input order", "CLRF", true),
	CLOSEST_DISTANCE_AND_EXACT_TYPES_AND_MIN_PROT_LEVEL ("Closest RDC, matching types and min. protection level", "Pins from the closest RDC with matching types and minimum protection level first", "CRTF", false)
	
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
	
	public IntValueSelector getValueSector(SolverVariablesContainer solverVariables, AssistModel model, long randomSeed) { 
		switch (this) {
			case CLOSEST_DISTANCE: 										return new RDCWithShortestDistanceSelector(solverVariables, model);
			case CLOSEST_DISTANCE_AND_EXACT_TYPES_AND_MIN_PROT_LEVEL:	return new RDCWithShortestDistanceAndTypesSelector(solverVariables, model); 
			case MIN_VALUE_FIRST:										return ISF.min_value_selector();
			case MAX_VALUE_FIRST:										return ISF.max_value_selector();
			case RANDOM:												return ISF.random_value_selector(randomSeed);
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
		
		Collections.sort(list, new Comparator<ValueSelectorTypes>(){

			@Override
			public int compare(ValueSelectorTypes o1, ValueSelectorTypes o2) {
				if (o1.isDefault()) 		return -1;
				else if (o2.isDefault()) 	return  1;
				else return o1.humanReadableName.compareTo(o2.humanReadableName);
			}});
		
		return list;
	}
	
	public static ValueSelectorTypes getDefault()	{ 
		for (ValueSelectorTypes t : ValueSelectorTypes.values()) 
			if (t.isDefault) return t;
		
		return null;
	}
	
	public static ValueSelectorTypes getValueSelectorOrDefault(String cliArgumentName) {
		switch (cliArgumentName) {
		case "MNPF" : return MIN_VALUE_FIRST;
		case "MXPF" : return MAX_VALUE_FIRST;
		case "RAND" : return RANDOM;
		case "CLRF" : return CLOSEST_DISTANCE;
		case "CRTF" : return CLOSEST_DISTANCE_AND_EXACT_TYPES_AND_MIN_PROT_LEVEL;
		default		: return getDefault();
		}
	}
}
