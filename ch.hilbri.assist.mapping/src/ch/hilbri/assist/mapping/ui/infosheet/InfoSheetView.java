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
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class InfoSheetView {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

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
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		
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
		
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO	Set the focus to control
	}
}
