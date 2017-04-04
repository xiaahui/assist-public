package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ch.hilbri.assist.mapping.model.presentation.ModelEditorAssist;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx.ResultsViewController;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;

public class ResultsView {

	public static final String EDITOR = "Model_Editor";
	
	public static final String START_MAPPING = "start/mapping";
	
	@Inject
	@Optional
	@Named(EDITOR)
	private ModelEditorAssist editor;
	
	private FXCanvas canvas;

	private DetailedResultsViewUiModel detailedResultsViewUiModel;
	private ResultsViewController detailedResultViewController;

	/** 
	 * Creates the view and adds the necessary UI components
	 *  
	 */
	@Inject
	public void createPartControl(Composite parent) {
		
		// fixed a part-control error bug
		javafx.application.Platform.setImplicitExit(false);
		
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		canvas = new FXCanvas(parent, SWT.NONE);
		
		detailedResultsViewUiModel = new DetailedResultsViewUiModel();
		detailedResultViewController = new ResultsViewController(detailedResultsViewUiModel);
		
		Scene scene = new Scene(detailedResultViewController);
		scene.getStylesheets().addAll(getClass().getResource("/resources/detailedResultsView.css").toExternalForm());
		canvas.setScene(scene);
	}

	public DetailedResultsViewUiModel getDetailedResultsViewUiModel() {
		return detailedResultsViewUiModel;
	}
	

	public void setEditor(MultiPageEditor multiPageEditor) {
		detailedResultsViewUiModel.setEditor(multiPageEditor);
	}

	public void resetView() {
		detailedResultViewController.resetView();
	}
}
