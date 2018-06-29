package ch.hilbri.assist.dse.ui.multipageeditor;

import java.util.List;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;

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
        
        /* Unfortunately, this is necessary to draw an image in a centered alignment */
        tblResults.addListener(SWT.PaintItem, new Listener() {
        	@Override
            public void handleEvent(Event event) {
                // Am I on column I need..?
        		if(event.index == 1) {
                    Image tmpImage;
                	ExplorationResult result = (ExplorationResult) event.item.getData(); 
                	if (result.isFeasible()) 
                		tmpImage = ResourceManager.getPluginImage("ch.hilbri.assist.dse", "icons/yes-green.gif");
                	else
                		tmpImage = ResourceManager.getPluginImage("ch.hilbri.assist.dse", "icons/no-red.gif");
                	
                    int tmpWidth = 0;
                    int tmpHeight = 0;
                    int tmpX = 0;
                    int tmpY = 0;

                    tmpWidth = tblResults.getColumn(event.index).getWidth();
                    tmpHeight = ((TableItem)event.item).getBounds().height;

                    tmpX = tmpImage.getBounds().width;
                    tmpX = (tmpWidth / 2 - tmpX / 2);
                    tmpY = tmpImage.getBounds().height;
                    tmpY = (tmpHeight / 2 - tmpY / 2);
                    if(tmpX <= 0) tmpX = event.x;
                    else tmpX += event.x;
                    if(tmpY <= 0) tmpY = event.y;
                    else tmpY += event.y;
                    event.gc.drawImage(tmpImage, tmpX, tmpY);
                }
            }
        });
        
        TableViewerColumn tblViewerColumnCandidate = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tblViewerColumnCandidate.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, formToolkit));
        TableColumn tblclmnCandidate = tblViewerColumnCandidate.getColumn();
        tblclmnCandidate.setWidth(100);
        tblclmnCandidate.setText("Name");
        
        TableViewerColumn tableViewerColumnResult = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tableViewerColumnResult.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, formToolkit));
        TableColumn tblclmnResult = tableViewerColumnResult.getColumn();
        tblclmnResult.setAlignment(SWT.CENTER);
        tblclmnResult.setWidth(70);
        tblclmnResult.setText("Feasible");
        
        TableViewerColumn tblViewerColumnGenerate = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tblViewerColumnGenerate.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, formToolkit));
        TableColumn tblclmnGenerate = tblViewerColumnGenerate.getColumn();
        tblclmnGenerate.setAlignment(SWT.CENTER);
        tblclmnGenerate.setWidth(100);
        tblclmnGenerate.setText("Generate");
        
        TableViewerColumn tableViewerColumnHardware = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tableViewerColumnHardware.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, formToolkit));
        TableColumn tblclmnHardware = tableViewerColumnHardware.getColumn();
        tblclmnHardware.setAlignment(SWT.CENTER);
        tblclmnHardware.setWidth(150);
        tblclmnHardware.setText("Selected Boards");
        
        TableViewerColumn tableViewerColumnSoftware = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tableViewerColumnSoftware.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, formToolkit));
        TableColumn tblclmnSoftware = tableViewerColumnSoftware.getColumn();
        tblclmnSoftware.setAlignment(SWT.CENTER);
        tblclmnSoftware.setWidth(150);
        tblclmnSoftware.setText("Selected Applications");
        
        TableViewerColumn tableViewerColumnRestrictions = new TableViewerColumn(tblViewerResults, SWT.NONE);
        tableViewerColumnRestrictions.setLabelProvider(new ExplorationResultsLabelProvider(tblResults, formToolkit));
        TableColumn tblclmnRestrictions = tableViewerColumnRestrictions.getColumn();
        tblclmnRestrictions.setAlignment(SWT.CENTER);
        tblclmnRestrictions.setWidth(150);
        tblclmnRestrictions.setText("Selected Restrictions");
        
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
