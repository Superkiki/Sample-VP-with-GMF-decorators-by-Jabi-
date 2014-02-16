package org.jabi.gmf.swtbot;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.obeo.dsl.viewpoint.tests.swtbot.support.api.bot.SWTDesignerBot;
import fr.obeo.dsl.viewpoint.tests.swtbot.support.api.editor.SWTBotDesignerEditor;

@RunWith(SWTBotJunit4ClassRunner.class)
public class GMFTest {

	private static SWTDesignerBot bot = new SWTDesignerBot();
	private static Keyboard keyboard = KeyboardFactory.getSWTKeyboard();

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot.viewByTitle("Welcome").close();

		bot.menu("Import...").click();
		bot.tree().getTreeItem("General").expand();
		bot.tree().getTreeItem("General")
				.getNode("Existing Projects into Workspace").select();
		bot.button("Next >").click();
		bot.radio("Select archive file:").click();
		bot.text(1).setText("/home/hsellou/workspaces/org.jabi.gmf.sample.zip");
		keyboard.pressShortcut(Keystrokes.CR);
		bot.button("Finish").click();
		bot.viewByTitle("Model Explorer").setFocus();
		bot.tree().getTreeItem("org.jabi.gmf.sample").expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.getNode("MyModel diagram").expand();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.getNode("MyModel diagram").getNode("MyModel diagram").select();
		bot.tree().getTreeItem("org.jabi.gmf.sample")
				.getNode("representations.aird").getNode("mymodelViewpoint")
				.getNode("MyModel diagram").getNode("MyModel diagram").click();

		SWTBotDesignerEditor editor = bot.ge

	}

	@Test
	public void test() {

	}

}
