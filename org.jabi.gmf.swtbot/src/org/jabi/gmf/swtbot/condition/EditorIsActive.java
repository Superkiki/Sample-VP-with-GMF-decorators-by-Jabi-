package org.jabi.gmf.swtbot.condition;

import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;

public class EditorIsActive extends DefaultCondition {

	private SWTBotEditor editor;

	public EditorIsActive(SWTBotEditor editor) {
		this.editor = editor;
	}

	@Override
	public boolean test() throws Exception {
		return editor.isActive();
	}

	@Override
	public String getFailureMessage() {
		return "Editor " + editor.getTitle() + " failed to open";
	}
}