package ch.hilbri.assist.mapping.dsl;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

class CreateSrcGenKeepFiles implements IWorkflowComponent {
	
	public CreateSrcGenKeepFiles() {
	}
	
	private String path = "";
	
	public void setPath(String p) {
		path = p;
	}
	
	@Override
	public void invoke(IWorkflowContext ctx) {
		System.out.println("Creating file: " + path);
		File file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override 
	public void postInvoke() {}
	
	@Override 
	public void preInvoke() {}
	
}
