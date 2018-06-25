package ch.hilbri.assist.gui.tests.basics

import org.eclipse.e4.core.contexts.IEclipseContext
import org.eclipse.swtbot.e4.finder.widgets.SWTWorkbenchBot
import org.eclipse.swtbot.eclipse.finder.waits.Conditions
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.ui.PlatformUI
import org.junit.AfterClass
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.swtbot.swt.finder.waits.Conditions.*

@RunWith(SWTBotJunit4ClassRunner)
class BasicTests {

    /* This is RCP3.x API style - but unfortunately, I have no idea,
     * how to get the Eclipse Context in any other way               */
    static SWTWorkbenchBot bot = new SWTWorkbenchBot(PlatformUI.workbench.getService(IEclipseContext))

    @Test
    def void checkToolBar() {
        val assistShell = bot.activeShell

        /* Create a new project */
        bot.menu("File").menu("New Project").click
        val newProjectShell = bot.shell("New ASSIST Project").activate
        val newProjectShellBot = newProjectShell.bot
        newProjectShellBot.textWithLabel("&Project name:").setText("ExampleProject");
        newProjectShellBot.button("Finish").click

        bot.waitUntil(shellCloses(newProjectShell), 20000)

        /* Trigger a default DSE spec */
        bot.tree().getTreeItem("ExampleProject").select()
        bot.toolbarButtonWithTooltip("New DSE Specification").click()
        bot.button("Finish").click()
        bot.partByTitle("newSpecification.ddsl").show()
        assistShell.activate
        
        /* Trigger a default Mapping spec */
        bot.tree().getTreeItem("ExampleProject").select()
        bot.toolbarButtonWithTooltip("New Mapping Specification").click()
        bot.button("Finish").click()
        bot.partByTitle("newSpecification.mdsl").show()
        assistShell.activate
 
        /* Trigger a default Scheduling spec */
        bot.tree().getTreeItem("ExampleProject").select()
        bot.toolbarButtonWithTooltip("New Scheduling Specification").click()
        bot.button("Finish").click()
        bot.partByTitle("newSpecification.sdsl").show()
        assistShell.activate
 
        /* Remove Project */
        bot.tree().getTreeItem("ExampleProject").select();
        bot.menu("Edit").menu("Delete").click();
        val deleteConfirmation = bot.shell("Delete Resources")
        bot.checkBox(0).select()
        bot.button("OK").click()
        bot.waitUntil(shellCloses(deleteConfirmation))
    }

    /* Run the basic workflow of creating a mapping spec and exporting it to the scheduling */
    @Test
    def void checkFullWorkflow() {

        val assistShell = bot.activeShell

        /* Create a new project */
        bot.menu("File").menu("New Project").click

        val newProjectShell = bot.shell("New ASSIST Project").activate
        val newProjectShellBot = newProjectShell.bot

        newProjectShellBot.textWithLabel("&Project name:").setText("ExampleProject");
        newProjectShellBot.button("Finish").click

        bot.waitUntil(shellCloses(newProjectShell), 20000)

        /* Create a new mapping specification */
        bot.tree().getTreeItem("ExampleProject").select();
        assistShell.setFocus
        bot.toolbarButtonWithTooltip("New Mapping Specification").click();
        val newMappingSpecShell = bot.shell("New Mapping Specification")
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(newMappingSpecShell))

        /* Generate Mappings */
        bot.partByTitle("newSpecification.mdsl").show()
        bot.menu("Mapping").menu("Generate Mappings").click();
        val generateMappingShell = bot.shell("Mapping Generation")
        bot.button("Search").click();
        bot.waitUntil(shellCloses(generateMappingShell))
        bot.sleep(2000)

        /* Evaluate Mappings */
        bot.comboBox().setSelection("Random Score (built-in)")
        bot.comboBox(1).setSelection("1")
        bot.button("Add").click
        bot.button("Evaluate").click

        /* Export solution to scheduling */
        assistShell.activate
        bot.partByTitle("newSpecification.mdsl").show()
        bot.waitUntil(widgetIsEnabled(bot.menu("Mapping").menu("Export Solution to Scheduling")), 20000)
        bot.menu("Mapping").menu("Export Solution to Scheduling").click
        bot.button("Finish").click();

        /* Run Scheduling */
        assistShell.setFocus
        bot.partByTitle("newSpecification - Mapping Solution 1 of 2.sdsl").show
        bot.menu("Scheduling").menu("Generate Schedule").click();

        /* Remove Project */
        bot.tree().getTreeItem("ExampleProject").select();
        bot.menu("Edit").menu("Delete").click();
        val deleteConfirmation = bot.shell("Delete Resources")
        bot.checkBox(0).select()
        bot.button("OK").click()
        bot.waitUntil(shellCloses(deleteConfirmation))
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
