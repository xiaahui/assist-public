package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx;

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
//		if (object instanceof GenericHardwareComponent) {
//			return "[" + ((GenericHardwareComponent)object).getHardwareLevel().getHardwareComponentType() + "] " + ((GenericHardwareComponent)object).getName();
//		} else if (object instanceof Thread) {
//			return "[Thread] " + ((Thread)object).getName() +"";
//		} else {
//			return ((Result)object).getSystemName();
//		}
		return "TreeObjectString";
	}
	
	public Object getObject() {
		return object;
	}
}