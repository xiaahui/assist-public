package ch.hilbri.assist.mapping.ui.infosheet;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;

/* Needs to implement IPartListener2 to get notified, if the active editor changes */
public class InfoSheetView implements IPartListener2 {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	private MultiPageEditor currentEditor;

	private Label lblName;
	private Label lblScaledScore;
	private Label lblComplete;
	private Label lblSpecification;

	public static InfoSheetView INSTANCE;
	private Label lblAssignmentCount;
	private Label lblAbsoluteScore;
	private Table tblResultMetrics;
	private TableViewer tblViewerResultMetrics;
	private Table tblComponents;
	private TableViewer tblViewerComponents;

	public InfoSheetView() {
		InfoSheetView.INSTANCE = this;
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.marginHeight = 0;
		gl_parent.verticalSpacing = 0;
		gl_parent.marginWidth = 0;
		parent.setLayout(gl_parent);

		Composite composite = new Composite(parent, SWT.NONE);
		GridData gd_composite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_composite.widthHint = 321;
		composite.setLayoutData(gd_composite);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));

		ScrolledForm scrldfrmCurrentSolution = formToolkit.createScrolledForm(composite);
		formToolkit.paintBordersFor(scrldfrmCurrentSolution);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		scrldfrmCurrentSolution.getBody().setLayout(gridLayout);

		Section sctnNewSection = formToolkit.createSection(scrldfrmCurrentSolution.getBody(),
				Section.EXPANDED | Section.TITLE_BAR);
		sctnNewSection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnNewSection);
		sctnNewSection.setText("General Information");

		Composite composite_1 = new Composite(scrldfrmCurrentSolution.getBody(), SWT.NONE);
		composite_1.setLayout(new GridLayout(2, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);

		Label lblTitleName = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleName, true, true);
		lblTitleName.setText("Name:");

		lblName = new Label(composite_1, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(lblName, true, true);

		Label lblTitleComplete = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleComplete, true, true);
		lblTitleComplete.setText("Complete:");

		lblComplete = new Label(composite_1, SWT.NONE);
		lblComplete.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(lblComplete, true, true);

		Label lblTitleAssignmentCount = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleAssignmentCount, true, true);
		lblTitleAssignmentCount.setText("Assignments:");

		lblAssignmentCount = new Label(composite_1, SWT.NONE);
		lblAssignmentCount.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(lblAssignmentCount, true, true);

		Label lblTitleScaledScore = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleScaledScore, true, true);
		lblTitleScaledScore.setText("Score (scaled):");

		lblScaledScore = new Label(composite_1, SWT.NONE);
		lblScaledScore.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(lblScaledScore, true, true);

		Label lblTitleAbsoluteScore = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleAbsoluteScore, true, true);
		lblTitleAbsoluteScore.setText("Score (absolute):");

		lblAbsoluteScore = new Label(composite_1, SWT.NONE);
		lblAbsoluteScore.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(lblAbsoluteScore, true, true);
		
		Label lblTitleSpecification = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleSpecification, true, true);
		lblTitleSpecification.setText("File:");

		lblSpecification = new Label(composite_1, SWT.NONE);
		lblSpecification.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(lblSpecification, true, true);

		Section sctnMetrics = formToolkit.createSection(scrldfrmCurrentSolution.getBody(), Section.TITLE_BAR);
		sctnMetrics.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnMetrics);
		sctnMetrics.setText("Evaluation");

		Composite composite_2 = new Composite(scrldfrmCurrentSolution.getBody(), SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite_2 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_composite_2.heightHint = 100;
		composite_2.setLayoutData(gd_composite_2);
		formToolkit.adapt(composite_2);
		formToolkit.paintBordersFor(composite_2);

		tblViewerResultMetrics = new TableViewer(composite_2, SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
		tblViewerResultMetrics.setContentProvider(ArrayContentProvider.getInstance());
		tblResultMetrics = tblViewerResultMetrics.getTable();
		tblResultMetrics.setLinesVisible(true);
		tblResultMetrics.setHeaderVisible(true);
		formToolkit.paintBordersFor(tblResultMetrics);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tblViewerResultMetrics, SWT.NONE);
		TableColumn tblclmnMetricName = tableViewerColumn.getColumn();
		tblclmnMetricName.setWidth(100);
		tblclmnMetricName.setText("Name");
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tblViewerResultMetrics, SWT.NONE);
		TableColumn tblclmnScorescaled = tableViewerColumn_2.getColumn();
		tblclmnScorescaled.setWidth(100);
		tblclmnScorescaled.setText("Score (scaled)");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tblViewerResultMetrics, SWT.NONE);
		TableColumn tblclmnScore = tableViewerColumn_1.getColumn();
		tblclmnScore.setWidth(100);
		tblclmnScore.setText("Score (absolute)");
		tblViewerResultMetrics.setLabelProvider(new MetricScoresTableLabelProvider());

		Section sctnComponents = formToolkit.createSection(scrldfrmCurrentSolution.getBody(), Section.TITLE_BAR);
		sctnComponents.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnComponents);
		sctnComponents.setText("Component Information");

		Composite composite_3 = new Composite(scrldfrmCurrentSolution.getBody(), SWT.NONE);
		composite_3.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(composite_3);
		formToolkit.paintBordersFor(composite_3);
		
		tblViewerComponents = new TableViewer(composite_3, SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
		tblComponents = tblViewerComponents.getTable();
		tblComponents.setHeaderVisible(true);
		tblComponents.setLinesVisible(true);
		tblViewerComponents.setContentProvider(new ComponentsContentProvider(null));
		formToolkit.paintBordersFor(tblComponents);
		
		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tblViewerComponents, SWT.NONE);
		TableColumn tblclmnProperty = tableViewerColumn_4.getColumn();
		tblclmnProperty.setWidth(100);
		tblclmnProperty.setText("Property");
		
		TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tblViewerComponents, SWT.NONE);
		TableColumn tblclmnValue = tableViewerColumn_5.getColumn();
		tblclmnValue.setWidth(200);
		tblclmnValue.setText("Value");
		tblViewerComponents.setLabelProvider(new ComponentLabelProvider());

		// We want to get notified, when the active part changes
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(this);
	}

	public void setSelectedComponent(MultiPageEditor sender, Object component) {
		if (currentEditor == sender) {
			if (component != null) {
				tblViewerComponents.setInput(component);
			}
		}
		else
			clearInfoSheet();
		

	}
	
	public void setSelectedResult(MultiPageEditor sender, Result result) {
		/*
		 * Did we receive the selectedResult from the sender we expect it to
		 * receive from?
		 */
		if (currentEditor == sender) {
			if (result != null) {
				lblName.setText(result.getName());
				lblComplete.setText(result.isPartialSolution() ? "No" : "Yes");
				lblScaledScore.setText(String.format("%.3f", result.getScaledTotalScore()));
				lblAbsoluteScore.setText(String.format("%.3f", result.getAbsoluteTotalScore()));
				lblSpecification.setText(currentEditor.getTitle());
				lblAssignmentCount.setText(Integer.toString(result.getTask2CoreMap().keySet().size()));
				tblViewerResultMetrics.setInput(new MetricScoresTupleList(result.getMetricAbsoluteScoresMap(),
						result.getMetricScaledScoresMap()));
				tblViewerComponents.setContentProvider(new ComponentsContentProvider(currentEditor.getCurrentMappingResult()));
				
			} else
				clearInfoSheet();
		}
	}

	public void clearInfoSheet() {

		for (Label l : Arrays.asList(lblName, lblComplete, lblScaledScore, lblAbsoluteScore, lblSpecification,
				lblAssignmentCount))
			if (!l.isDisposed())
				l.setText("");
		
		if (!tblResultMetrics.isDisposed())
			tblViewerResultMetrics.setInput(null);
		
		if (!tblComponents.isDisposed())
			tblViewerComponents.setInput(null);
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		IWorkbenchPart p = partRef.getPart(false);
		if (p instanceof MultiPageEditor) {
			currentEditor = (MultiPageEditor) p;
			setSelectedResult(currentEditor, currentEditor.getCurrentMappingResult());
		}
	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		currentEditor = null;
		clearInfoSheet();
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
	}
}
