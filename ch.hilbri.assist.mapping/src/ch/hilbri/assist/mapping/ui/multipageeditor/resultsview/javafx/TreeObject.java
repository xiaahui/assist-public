package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx;

import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.result.mapping.Result;

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
		if (object instanceof Connector)		return ((Connector) object).getName();
		else if (object instanceof EqInterface) return ((EqInterface)object).getName();
		else 									return ((Result)object).getModel().getSystemName();
	}
	
	public Object getObject() {
		return object;
	}
}