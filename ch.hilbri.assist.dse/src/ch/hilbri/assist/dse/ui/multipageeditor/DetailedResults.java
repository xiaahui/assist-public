package ch.hilbri.assist.dse.ui.multipageeditor;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class DetailedResults extends Composite {
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Table table;

    /**
     * Create the composite.
     * @param parent
     * @param style
     */
    public DetailedResults(Composite parent, int style) {
        super(parent, style);
        setLayout(new FillLayout(SWT.HORIZONTAL));
        
        ScrolledForm mainForm = formToolkit.createScrolledForm(this);
        formToolkit.decorateFormHeading(mainForm.getForm());
        FontDescriptor fontDescriptor = FontDescriptor.createFrom(mainForm.getFont());
        fontDescriptor.setStyle(SWT.BOLD).increaseHeight(1);
        mainForm.setFont(fontDescriptor.createFont(mainForm.getDisplay()));
        mainForm.setText("Exploration Results");
        
        mainForm.getBody().setLayout(new GridLayout(1, false));
        
        Section sctnOverview = formToolkit.createSection(mainForm.getBody(), Section.EXPANDED | Section.TITLE_BAR);
        sctnOverview.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        formToolkit.paintBordersFor(sctnOverview);
        sctnOverview.setText("Overview");
        Composite compOverview = formToolkit.createComposite(sctnOverview, SWT.NONE);
        formToolkit.paintBordersFor(compOverview);
        sctnOverview.setClient(compOverview);
        compOverview.setLayout(new GridLayout(1, false));
        
        table = new Table(compOverview, SWT.BORDER | SWT.FULL_SELECTION);
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        formToolkit.adapt(table);
        formToolkit.paintBordersFor(table);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

}
