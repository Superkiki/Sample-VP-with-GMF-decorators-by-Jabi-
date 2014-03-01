package org.jabi.gmf.swtbot;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.obeo.dsl.viewpoint.tests.swtbot.support.api.bot.SWTDesignerBot;
import fr.obeo.dsl.viewpoint.tests.swtbot.support.api.editor.SWTBotDesignerEditor;
import fr.obeo.dsl.viewpoint.tests.swtbot.support.api.editor.SWTBotDesignerHelper;

@RunWith(SWTBotJunit4ClassRunner.class)
public class GMFTest {

	private static final String SAMPLE_PATH = "C:\\ObeoDesigner-6.2-win32.win32.x86_64\\ObeoDesigner\\wk\\org.jabi.gmf.sample.zip";
	private static SWTDesignerBot bot = new SWTDesignerBot();
	private static Keyboard keyboard = KeyboardFactory.getSWTKeyboard();

	@BeforeClass
	public static void beforeClass() throws Exception {
		SWTBotPreferences.TIMEOUT = 10000;
		bot.button("OK").click();
		bot.viewByTitle("Welcome").close();
	}

	@Test
	public void test() {
		bot.menu("Import...").click();
		bot.tree().getTreeItem("General").expand();
		bot.tree().getTreeItem("General")
				.getNode("Existing Projects into Workspace").select();
		bot.button("Next >").click();
		bot.radio("Select archive file:").click();
		bot.text(1).setText(SAMPLE_PATH);
		keyboard.pressShortcut(Keystrokes.CR);
		bot.button("Finish").click();
		bot.text("type filter text").setFocus();
		keyboard.pressShortcut(Keystrokes.TAB);
		bot.tree();
		bot.tree().getTreeItem("org.jabi.gmf.sample").select();
		bot.tree().getTreeItem("org.jabi.gmf.sample").expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").click();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.getNode("MyModel diagram").expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.getNode("MyModel diagram").expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.getNode("MyModel diagram").getNode("MyModel diagram")
				.doubleClick();

		SWTBotDesignerEditor editor = SWTBotDesignerHelper
				.getDesignerEditor("MyModel diagram");
	}

}
