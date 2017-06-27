package ch.hilbri.assist.mapping.ui.infosheet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;

/* Needs to implement IPartListener2 to get notified, if the active editor changes */
public class InfoSheetView implements IPartListener2 {
	
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private MultiPageEditor currentEditor;
	private Label lblName;
	private Label lblNumber;
	private Label lblScore;
	private Label lblComplete;
	private Label lblSpecification;
	
	public InfoSheetView() {
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
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		ScrolledForm scrldfrmCurrentSolution = formToolkit.createScrolledForm(composite);
		formToolkit.paintBordersFor(scrldfrmCurrentSolution);
		scrldfrmCurrentSolution.setText("Current Solution");
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		scrldfrmCurrentSolution.getBody().setLayout(gridLayout);
		
		Section sctnNewSection = formToolkit.createSection(scrldfrmCurrentSolution.getBody(), Section.EXPANDED | Section.TITLE_BAR);
		sctnNewSection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnNewSection);
		sctnNewSection.setText("General Information");
		
		Composite composite_1 = new Composite(scrldfrmCurrentSolution.getBody(), SWT.NONE);
		composite_1.setLayout(new GridLayout(2, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		
		Label lblTitleSpecification = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleSpecification, true, true);
		lblTitleSpecification.setText("Specification:");
		
		lblSpecification = new Label(composite_1, SWT.NONE);
		lblSpecification.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(lblSpecification, true, true);
		
		Label lblTitleName = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleName, true, true);
		lblTitleName.setText("Name:");
		
		lblName = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblName, true, true);
		
		Label lblTitleNumber = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleNumber, true, true);
		lblTitleNumber.setText("Number:");
		
		lblNumber = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblNumber, true, true);
		
		Label lblTitleScore = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleScore, true, true);
		lblTitleScore.setText("Score:");
		
		lblScore = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblScore, true, true);
		
		Label lblTitleComplete = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblTitleComplete, true, true);
		lblTitleComplete.setText("Complete:");
		
		lblComplete = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblComplete, true, true);
		
		Section sctnMetrics = formToolkit.createSection(scrldfrmCurrentSolution.getBody(), Section.TITLE_BAR);
		sctnMetrics.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnMetrics);
		sctnMetrics.setText("Metrics");
		
		Composite composite_2 = new Composite(scrldfrmCurrentSolution.getBody(), SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(composite_2);
		formToolkit.paintBordersFor(composite_2);
		
		Section sctnComponents = formToolkit.createSection(scrldfrmCurrentSolution.getBody(), Section.TITLE_BAR);
		sctnComponents.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnComponents);
		sctnComponents.setText("Components");
		
		Composite composite_3 = new Composite(scrldfrmCurrentSolution.getBody(), SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(composite_3);
		formToolkit.paintBordersFor(composite_3);
		
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(this);
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		IWorkbenchPart p = partRef.getPart(false);
		if (p instanceof MultiPageEditor) {
			currentEditor = (MultiPageEditor) p;
			lblSpecification.setText(currentEditor.getTitle());
		}
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		currentEditor = null;
		if (!lblSpecification.isDisposed())	lblSpecification.setText("");
	}
	
	@Override
	public void partClosed(IWorkbenchPartReference partRef) {}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {}
}
