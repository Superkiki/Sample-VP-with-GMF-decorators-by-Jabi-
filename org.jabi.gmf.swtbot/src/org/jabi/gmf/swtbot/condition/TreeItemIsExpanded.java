package org.jabi.gmf.swtbot.condition;

import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

public class TreeItemIsExpanded extends DefaultCondition {

	private SWTBotTreeItem treeItem;

	public TreeItemIsExpanded(SWTBotTreeItem treeItem) {
		this.treeItem = treeItem;

	}

	@Override
	public boolean test() throws Exception {
		return treeItem.isExpanded();
	}

	@Override
	public String getFailureMessage() {
		return "TreeItem failed to expand " + treeItem.getText();
	}
}