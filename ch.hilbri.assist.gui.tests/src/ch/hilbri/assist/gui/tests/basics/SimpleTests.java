package ch.hilbri.assist.gui.tests.basics;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SimpleTests {
    private static SWTBot bot;

    @BeforeClass
    public static void beforeClass() throws Exception {
        bot = new SWTBot();
    }

    @Test
    public void executeExit() {
        SWTBotMenu fileMenu = bot.menu("File");
        Assert.assertNotNull(fileMenu);
    }

    @AfterClass
    public static void sleep() {
        bot.sleep(2000);
    }
}
