package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx.ResultsViewController;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;
import ch.hilbri.assist.model.presentation.ModelEditorAssist;

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
		
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		canvas = new FXCanvas(parent, SWT.NONE);
		
		detailedResultsViewUiModel = new DetailedResultsViewUiModel();
		detailedResultViewController = new ResultsViewController(detailedResultsViewUiModel);
		
		Scene scene = new Scene(detailedResultViewController);
		scene.getStylesheets().addAll(getClass().getResource("/resources/detailedResultsView.css").toExternalForm());
		canvas.setScene(scene);
		
		canvas.addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) {
				adjustSize();
			}

			@Override
			public void controlMoved(ControlEvent e) {
			}
		});
		
	}

	private void adjustSize() {
		detailedResultViewController.adjustSize(canvas.getClientArea().width);	 
	}
	
	public DetailedResultsViewUiModel getDetailedResultsViewUiModel() {
		return detailedResultsViewUiModel;
	}
	
//	/**
//	 * This method is invoked right after being created and
//	 * starts a job which to find the schedules
//	 */
//	@Inject
//	@Optional
//	public void startMapping(@UIEventTopic(START_MAPPING) ModelEditorAssist assistEditor) {
//		if (assistEditor == editor && editor != null) {
////			SolverJob job;
////			try {
////				job = new SolverJob("Find all solutions", new MappingDataModel(editor.getEditingDomain().getResourceSet().getResources().get(0)), detailedResultsViewUiModel, ppEditor);
////				job.setUser(true);
////				job.schedule(); 
////			} catch (Exception e) {
////				e.printStackTrace();
////			}
//		} else {
//			ConsoleCommands.writeLineToConsole("Wrong Window or editor == null?" + (editor == null));
//		}
//	}

	public void setEditor(MultiPageEditor multiPageEditor) {
		detailedResultsViewUiModel.setEditor(multiPageEditor);
	}

	public void resetView() {
		detailedResultViewController.resetView();
	}
}
