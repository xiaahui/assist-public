package ch.hilbri.assist.gui.tests.basics;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class BasicTests {
    private static SWTWorkbenchBot bot;

    @BeforeClass
    public static void beforeClass() throws Exception {
        bot = new SWTWorkbenchBot();
    }
    
    @Test
    public void createNewProject() {
    	bot.menu("File").menu("New Project").click();
    	bot.waitUntil(Conditions.shellIsActive("New ASSIST Project"));
    	bot.shell("New ASSIST Project").activate();
    	bot.textWithLabel("&Project name:").setText("ExampleProject");
    	bot.waitUntil(Conditions.widgetIsEnabled(bot.button("Finish")));
    	bot.button("Finish").click();
    
    	/* Create a new mapping specification */
       	bot.tree().getTreeItem("ExampleProject").select();
    	bot.toolbarButtonWithTooltip("New Mapping Specification").click();
    	bot.waitUntil(Conditions.shellIsActive("New Mapping Specification"));
    	bot.shell("New Mapping Specification").activate();
    	bot.waitUntil(Conditions.widgetIsEnabled(bot.button("Finish")));
    	bot.button("Finish").click();
    	
    	/* Generate Mappings */
    	bot.editorByTitle("newSpecification.mdsl").show();
    	bot.menu("Mapping").menu("Generate Mappings").click();
    	bot.waitUntil(Conditions.widgetIsEnabled(bot.button("Search")));
    	bot.button("Search").click();
    
    	/* Create a new scheduling specification */
    	bot.tree().getTreeItem("ExampleProject").select();
    	bot.toolbarButtonWithTooltip("New Scheduling Specification").click();
    	bot.waitUntil(Conditions.shellIsActive("New Scheduling Specification"));
    	bot.shell("New Scheduling Specification").activate();
    	bot.waitUntil(Conditions.widgetIsEnabled(bot.button("Finish")));
    	bot.button("Finish").click();

    	/* Generate Schedule */
    	bot.editorByTitle("newSpecification.sdsl").show();
    	bot.menu("Scheduling").menu("Generate Schedule").click();
    }
    
    @Test
    public void checkAboutBox() {
    	bot.menu("Help").menu("About").click();
    	bot.waitUntil(Conditions.shellIsActive("About ASSIST"));
    	bot.shell("About ASSIST").activate();
    	bot.button("OK").click();
    }
    
    @AfterClass
    public static void sleep() {
    	bot.sleep(2000);
    }
}
