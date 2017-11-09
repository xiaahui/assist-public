package ch.hilbri.assist.dse.dsl

import java.io.File
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class CreateSrcGenKeepFiles implements IWorkflowComponent {
	
	String path = ""
	
	def setPath(String p) {
		path = p
	}
	
	override invoke(IWorkflowContext ctx) {
		System.out.println('''Creating file: «path»''')
		val file = new File(path)
		file.createNewFile
	}
	
	override postInvoke() {}
	
	override preInvoke() {}
	
}