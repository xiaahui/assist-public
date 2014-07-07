package ch.hilbri.assist.model.presentation;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

/**
 * PP Editor extending the generated PP editor and adding some functionality for 
 * communication with the other plugins
 *
 */
public class ModelEditorAssist extends ModelEditor {
	
	ModelEditorAssist editor ;
	
	public ModelEditorAssist() {
		super();
		new Modelcreationlistener();
		editor = this;
	}
	
	public class Modelcreationlistener implements EventHandler {  
		  
		 public Modelcreationlistener() {  
		  Object service = PlatformUI.getWorkbench().getService(IEventBroker.class);  
		  if (service instanceof IEventBroker) {
			  ((IEventBroker) service).subscribe("createModel/*", this); 
		  }
		 }  
		  
		 @Override  
		 public void handleEvent(Event e) {  
			 System.out.println("Receiving creation request.");
			 if (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() == editor.getSite().getPage()) {
				 Object service = PlatformUI.getWorkbench().getService(IEventBroker.class);
				 if (service instanceof IEventBroker) {
					 System.out.println("Sending model.");
					 ((IEventBroker) service).send("modelCreated/"+ e.getTopic().substring(e.getTopic().lastIndexOf("/") + 1), editor);  
				 }
			 } 
		 }  
	}  
	
	@Override
	public void createPages() {
		super.createPages();
	}
}
