package ch.hilbri.assist.gui.misc

import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class CreateGitKeepFiles implements IWorkflowComponent {

    /* The MWE2 Workflow for the Xtext grammar removes the entire src-gen folder,
     * but we want to keep the folder and need a special file for this purpose .src-gen-keep
     * otherwise: git will not checkin an empty directory
     */
    override invoke(IWorkflowContext ctx) {
        val currentRelativePath = Paths.get("");
        val s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);

        try {
            Files.createFile(Paths.get("src-gen/.src-gen-keep"))
            Files.createFile(Paths.get("../ch.hilbri.assist.mapping.dsl.ide/src-gen/.src-gen-keep"))
            Files.createFile(Paths.get("../ch.hilbri.assist.mapping.dsl.tests/src-gen/.src-gen-keep"))
            Files.createFile(Paths.get("../ch.hilbri.assist.mapping.dsl.ui/src-gen/.src-gen-keep"))
            Files.createFile(Paths.get("../ch.hilbri.assist.mapping.dsl.ui.tests/src-gen/.src-gen-keep"))
        } catch (Exception e) {
            System.out.println("Maven build - do not need to create the .src-gen-keep files")
        }
    }

    override postInvoke() {
    }

    override preInvoke() {
    }

}
