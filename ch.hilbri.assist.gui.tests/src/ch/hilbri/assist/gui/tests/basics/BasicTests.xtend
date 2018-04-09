package ch.hilbri.assist.gui.tests.basics

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.eclipse.finder.waits.Conditions
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.swtbot.swt.finder.waits.Conditions.*

@RunWith(SWTBotJunit4ClassRunner)
class BasicTests {

    static SWTWorkbenchBot bot

    @BeforeClass
    def static void beforeClass() throws Exception {
        bot = new SWTWorkbenchBot()
    }

    @Test
    def void createNewProject() {

        /* Create a new project */
        bot.menu("File").menu("New Project").click

        val newProjectShell = bot.shell("New ASSIST Project").activate
        val newProjectShellBot = newProjectShell.bot
        
        newProjectShellBot.textWithLabel("&Project name:").setText("ExampleProjectNew");
        newProjectShellBot.button("Finish").click
        
        bot.waitUntil(shellCloses(newProjectShell), 20000)

//        /* Create a new mapping specification */
//        bot.tree().getTreeItem("ExampleProject").select();
//        bot.toolbarButtonWithTooltip("New Mapping Specification").click();
//        val newMappingSpecShell = bot.shell("New Mapping Specification")
//        newMappingSpecShell.activate
//        bot.waitUntil(new DefaultCondition() {
//            override getFailureMessage() { "unable to select" }
//            override test() { bot.button("Finish").isEnabled }
//        })
//        bot.button("Finish").click();
//        bot.waitUntil(shellCloses(newMappingSpecShell))
//
//        /* Generate Mappings */
//        bot.editorByTitle("newSpecification.mdsl").show();
//        bot.menu("Mapping").menu("Generate Mappings").click();
//        val generateMappingShell = bot.shell("Mapping Generation")
//        generateMappingShell.activate
//        bot.button("Search").click();
//        bot.waitUntil(shellCloses(generateMappingShell)) 
        
        

    /* Create a new scheduling specification */
    // bot.tree().getTreeItem("ExampleProject").select();
    // bot.toolbarButtonWithTooltip("New Scheduling Specification").click();
    // bot.waitUntil(Conditions.shellIsActive("New Scheduling Specification"));
    // bot.shell("New Scheduling Specification").activate();
    // bot.waitUntil(Conditions.widgetIsEnabled(bot.button("Finish")));
    // bot.button("Finish").click();
    //
    // /* Generate Schedule */
    // bot.editorByTitle("newSpecification.sdsl").show();
    // bot.menu("Scheduling").menu("Generate Schedule").click();
    // }
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
}
