package ch.hilbri.assist.gui.misc

import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class CreateGitKeepFiles implements IWorkflowComponent {

    String file

    /* The MWE2 Workflow for the Xtext grammar removes the entire src-gen folder,
     * but we want to keep the folder and need a special file for this purpose .src-gen-keep
     * otherwise: git will not check in an empty directory
     */
    override invoke(IWorkflowContext ctx) {
        try {
              System.out.println('''Creating file «file»''')
              Files.createFile(Paths.get(file))                
        } catch (Exception e) {
            System.out.println('''Some error occurred when creating file «file»''')
        }
    }
    
    def void setFile(String file) {
        this.file = file
    }

    override postInvoke() {
    }

    override preInvoke() {
    }

}
