package ch.hilbri.assist.gui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
/*
 * This is intentionally empty to avoid an e4 warning about an orphan perspective - 
 * the real perspective is configured in the Application.e4xmi model
 */
public class MainPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {

	}

}
