package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum SearchType {
	MIN_DOMAIN_FIRST			("Min domain first", 				
								 "The interface with the minimal amount of available connectors is chosen first. " +
	                             "Connectors with lower index values are picked first.", 
								 false),
								 
	MAX_DEGREE_FIRST			("Max degree first", 				
								 "Empty", 
								 false),
								 
	HARDEST_DISLOCALITIES_FIRST	("Hardest dislocalities first", 	
								 "The interface which affects the highest number of other interfaces due to its dislocality relations is chosen first. " +
								 "Connectors with lower index values are picked first.", 
								 false),
								 
	SCARCEST_IOTYPE_FIRST		("Scarcest interface type first", 	
								 "The interface with the scarcest interface type and the smallest domain is chosen first. " + 
								 "Connectors with lower index values are picked first.", 
								 false),
								 
	VARS_IN_MOST_DISLOC			("Most dislocalities first", 		
								 "The interface which is part of the highest number of dislocality relations is chosen first. " + 
	                             "Connectors with lower index values are picked first.", 
	                             false),
	
	RANDOM						("Random", 							
								 "Interfaces and the connectors are randomly chosen.", 
								 false),
	                             
	DOM_OVER_WDEG				("Domain over weighted degree", 	"This is black magic.", true),
	
	ACTIVITY					("Activity", 						"This is black magic.", false),
	
	IMPACT						("Impact", 							"This is possibly broken. Be wary!", false);
	
	
	private final String humanReadableName;
	private final String humanReadableExplanation;
	private final boolean isDefaultSearchType;

	SearchType(String name, String explanation, boolean isDefault) {
		this.humanReadableName = name;
		this.humanReadableExplanation = explanation;
		this.isDefaultSearchType = isDefault;
	}
	
	public String getHumanReadableName() 			{ return humanReadableName; 		}
	public String getHumanReadableExplanation()		{ return humanReadableExplanation; 	}
	public boolean isDefault()						{ return isDefaultSearchType;		}

	public static SearchType getDefaultSearchType()	{ 
		for (SearchType t : SearchType.values()) 
			if (t.isDefaultSearchType)	return t;
		
		return null;
	}
	
	/*
	 * Sort the values, so that the default strategy is first 
	 * and the remaining strategies are sorted by name  
	 */
	public static List<SearchType> getSortedValues() {
		List<SearchType> list = new ArrayList<SearchType>();
		
		for (SearchType t : SearchType.values()) list.add(t);
		
		Collections.sort(list, new Comparator<SearchType>(){

			@Override
			public int compare(SearchType o1, SearchType o2) {
				if (o1.isDefault()) 		return -1;
				else if (o2.isDefault()) 	return  1;
				else return o1.humanReadableName.compareTo(o2.humanReadableName);
			}});
		
		return list;
	}
}
