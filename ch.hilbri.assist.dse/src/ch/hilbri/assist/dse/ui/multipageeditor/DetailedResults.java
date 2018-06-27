package ch.hilbri.assist.dse.ui.multipageeditor;

import java.util.List;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import ch.hilbri.assist.dse.results.ExplorationResult;

public class DetailedResults extends Composite {
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Table tblResults;
    private TableViewer tblViewerResults;

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
        
        tblViewerResults = new TableViewer(compOverview, SWT.BORDER | SWT.FULL_SELECTION);
        tblResults = tblViewerResults.getTable();
        tblResults.setLinesVisible(true);
        tblResults.setHeaderVisible(true);
        tblResults.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        formToolkit.paintBordersFor(tblResults);
        
        TableViewerColumn tblViewerColumnCandidate = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tblViewerColumnCandidate.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, this));
        TableColumn tblclmnCandidate = tblViewerColumnCandidate.getColumn();
        tblclmnCandidate.setWidth(100);
        tblclmnCandidate.setText("Candidate");
        
        
        TableViewerColumn tblViewerColumnFeasible = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tblViewerColumnFeasible.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, this));
        TableColumn tblclmnFeasible = tblViewerColumnFeasible.getColumn();
        tblclmnFeasible.setWidth(100);
        tblclmnFeasible.setText("Feasible");
        
        TableViewerColumn tblViewerColumnGenerate = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tblViewerColumnGenerate.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, this));
        TableColumn tblclmnGenerate = tblViewerColumnGenerate.getColumn();
        tblclmnGenerate.setWidth(100);
        tblclmnGenerate.setText("Generate");
        tblViewerResults.setContentProvider(new ArrayContentProvider());
    }
    
    public void setExplorationResults(List<ExplorationResult> results) {
        tblViewerResults.setInput(results);
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

}
