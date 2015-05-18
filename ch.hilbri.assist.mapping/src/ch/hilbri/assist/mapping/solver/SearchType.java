package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum SearchType {
	MIN_DOMAIN_FIRST_AND_SHORTEST_DISTANCE
								("Min Domainsize First + Closest Connector First",
								 "Interfaces are selected based on min domainsize first strategy; " +
								 "connectors are selected based on minimum shortest distance",
								 true),
	
	MIN_DOMAIN_FIRST_AND_RANDOM_CONNECTORS
								("Min Domainsize First + Random Connector", 				
								 "Interfaces are selected based on min domainsize first strategy; " +
	                             "connectors are selected randomly.", 
								 false),

	MIN_DOMAIN_FIRST_AND_MIN_VALUE_CONNECTORS
								("Min Domainsize First + Min Connector Index First", 				
								 "Interfaces are selected based on min domainsize first strategy; " +
		                         "connectors are selected based on lowest index first.", 
								 false),

								 
	MAX_DEGREE_FIRST			("Max Relation Degree First + Min Connector Index First", 				
								 "Interfaces are selected based on their appearance in co-locality and dislocality groups; " + 
								 "connectors are selected based on lowest index first", 
								 false),
								 
	HARDEST_DISLOCALITIES_FIRST	("Hardest Dislocalities First", 	
								 "The interface which affects the highest number of other interfaces due to its dislocality relations is chosen first. " +
								 "Connectors with lower index values are picked first.", 
								 false),
											 
	HARDEST_COLOCALITIES_FIRST	("Hardest Colocalities First", 	
								 "The interface and the connector in the colocality relation with the highest demand/supply ratio for the connector are chosen first. ", 
								 false),
														 
	SCARCEST_IOTYPE_FIRST		("Scarcest Interface Type First", 	
								 "The interface with the scarcest interface type and the smallest domain is chosen first. " + 
								 "Connectors with lower index values are picked first.", 
								 false),
								 
	VARS_IN_MOST_DISLOC			("Most Dislocalities First", 		
								 "The interface which is part of the highest number of dislocality relations is chosen first. " + 
	                             "Connectors with lower index values are picked first.", 
	                             false),
	
	RANDOM_RANDOM				("Fully Random", 							
								 "Interfaces and the connectors are randomly chosen.", 
								 false),
	                             
	DOM_OVER_WDEG_MIN_VAL_FIRST	("Domain over weighted degree + Min Value First", 	
								 "Interfaces are selected based on: min({Domainsize(iface) / weight * degree(interface)}); " +
								 "connectors are chosen by minimum available index first", 
								 false),
								 
								 
	DOM_OVER_WDEG_MIN_VAL_FIRST_VER_1_3	
								("Domain over weighted degree + Min Value First (ASSIST 1.3)", 	
							     "Interfaces are selected based on: min({Domainsize(iface) / weight * degree(interface)}); " +
								 "connectors are chosen by minimum available index first; " + 
							     "improved co-locality handling for pairs of on-same relations is disabled", 
								 false),
			
	DOM_OVER_WDEG_CLOSEST_DISTANCE 
								("Domain over weighted degree + Closest Connector First",
								 "Interfaces are selected based on: min({Domainsize(iface) / weight * degree(interface)}); " +
								 "connectors are selected based on minimum shortest distance",
								 false),
								 
	ACTIVITY					("Activity", 						
								 "See: 'Activity-Based Search for Black-Box Constraint Programming Solvers', L. Michel and P. Van Hentenryck, 2012.", 
								 false),
	
	IMPACT						("Impact",
								 "See: 'Impact-Based Search Strategies for Constraint Programming', Philippe Refalo, 2004. " +
								 "This is possibly broken. Be wary!", 
								 false)
	;
	
	
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
