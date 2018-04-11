package ch.hilbri.assist.gui.tests.basics

import ch.hilbri.assist.gui.Application
import org.eclipse.e4.core.contexts.EclipseContextFactory
import org.eclipse.e4.core.contexts.IEclipseContext
import org.eclipse.e4.ui.workbench.IWorkbench
import org.eclipse.swtbot.e4.finder.widgets.SWTWorkbenchBot
import org.eclipse.swtbot.eclipse.finder.waits.Conditions
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.junit.AfterClass
import org.junit.Test
import org.junit.runner.RunWith
import org.osgi.framework.FrameworkUtil

import static org.eclipse.swtbot.swt.finder.waits.Conditions.*

@RunWith(SWTBotJunit4ClassRunner)
class BasicTests {

    static SWTWorkbenchBot bot = new SWTWorkbenchBot(getEclipseContext())

    @Test
    def void checkFullWorkflow() {

        /* Create a new project */
        bot.menu("File").menu("New Project").click

        val newProjectShell = bot.shell("New ASSIST Project").activate
        val newProjectShellBot = newProjectShell.bot
        
        newProjectShellBot.textWithLabel("&Project name:").setText("ExampleProject");
        newProjectShellBot.button("Finish").click
        
        bot.waitUntil(shellCloses(newProjectShell), 20000)

        /* Create a new mapping specification */
        bot.tree().getTreeItem("ExampleProject").select();
        bot.toolbarButtonWithTooltip("New Mapping Specification").click();
        val newMappingSpecShell = bot.shell("New Mapping Specification")
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(newMappingSpecShell))

        /* Generate Mappings */
        bot.partByTitle("newSpecification.mdsl").show
        bot.menu("Mapping").menu("Generate Mappings").click();
        val generateMappingShell = bot.shell("Mapping Generation")
        bot.button("Search").click();
        bot.waitUntil(shellCloses(generateMappingShell)) 
        val list = bot.parts

        bot.partByTitle("Mapping - Evaluation").show
//        bot.comboBox().setSelection("Random Score (built-in)");
//        bot.comboBox(1).setSelection("1");
//        bot.button("Add Metric").click();
//        bot.button("Evaluate results").click();
//        
//        bot.editorByTitle("newSpecification.mdsl").show();
//        bot.button("Sort by score").click();
//        bot.menu("Mapping").menu("Export current solution to Scheduling").click();
//        bot.button("Finish").click();
//        bot.editors.last.show();
//        bot.menu("Scheduling").menu("Generate Schedule").click();
    
    }

    @Test
    def void checkAboutBox() {
        bot.menu("Help").menu("About").click()
        bot.waitUntil(Conditions.shellIsActive("About ASSIST"))
        bot.shell("About ASSIST").activate()
        bot.button("OK").click()
    }

    @AfterClass
    def static void sleep() {
        bot.sleep(2000)
    }
    
    
    protected def static IEclipseContext getEclipseContext() {
        val serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(Application).bundleContext)
        return serviceContext.get(IWorkbench).application.context
    }
}
