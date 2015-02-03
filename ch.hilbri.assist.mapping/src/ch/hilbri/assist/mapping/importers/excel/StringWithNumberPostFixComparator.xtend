package ch.hilbri.assist.mapping.importers.excel

import java.util.Comparator

class StringWithNumberPostFixComparator implements Comparator<String> {
	
	override compare(String o1, String o2) {
		val int o1Num = Integer.parseInt(o1.replaceAll("^[a-zA-Z]*", ""))
		val int o2Num = Integer.parseInt(o2.replaceAll("^[a-zA-Z]*", ""))
		
		return o1Num - o2Num
	
	}
	
}