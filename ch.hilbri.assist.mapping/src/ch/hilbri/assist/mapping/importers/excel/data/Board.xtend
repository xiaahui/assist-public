package ch.hilbri.assist.mapping.importers.excel.data

import java.util.HashMap
import java.util.Map
import java.util.ArrayList

 @org.eclipse.xtend.lib.annotations.Data class Board {
	String name
	String type
	String powersupply
	String side
	String ess
	Map<String, String> genericParameters = new HashMap<String, String>
	ArrayList<IOAdapter> ioAdapters = new ArrayList<IOAdapter>
}