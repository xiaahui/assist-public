package ch.hilbri.assist.mapping.importers.excel.data

import org.eclipse.xtend.lib.annotations.Data

@Data class IOAdapter implements Comparable<IOAdapter> {
	String type
	String ioProtectionLevel
	String units
	
	override compareTo(IOAdapter o) {
		val int myNumber 	= Integer.parseInt(type.replaceAll("^[a-zA-Z]*", ""))
		val int otherNumber = Integer.parseInt(o.type.replaceAll("^[a-zA-Z]*", ""))
		
		return myNumber - otherNumber
	}
	
}