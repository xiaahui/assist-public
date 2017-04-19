package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx;

import ch.hilbri.assist.mapping.model.result.HardwareElement;
import ch.hilbri.assist.mapping.model.result.Thread;
import ch.hilbri.assist.mapping.model.result.Result;

/**
 * Object of the Treeitems, so that it is possible to get the underlying data 
 * later on
 *
 */
public class TreeObject{

	private Object object;
	
	public TreeObject(Object object) {
		this.object = object;
	}
	
	@Override
	public String toString() {
		if (object instanceof HardwareElement) 	return ((HardwareElement)object).getName();
		else if (object instanceof Thread) 		return ((Thread)object).getName();
		else 									return ((Result)object).getSystemName();
	}
	
	public Object getObject() {
		return object;
	}
}