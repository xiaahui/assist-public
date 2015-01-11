package ch.hilbri.assist.mapping.importers.excel.data

import java.util.HashMap
import java.util.Map

@Data class Application {
	String 	name

	String	protectionLevel
		
	/** 
	 * String: ioAdapterType, Integer: Anzahl
	 */
	Map<String, Integer> ioAdapterRequirements = new HashMap<String, Integer>
	
	Map<String, String> genericParameters = new HashMap<String, String>
	 	
}