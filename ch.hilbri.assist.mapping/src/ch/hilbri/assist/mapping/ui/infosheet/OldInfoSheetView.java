package ch.hilbri.assist.mapping.ui.infosheet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

public class OldInfoSheetView {
	
	private Label lblSolutionScore, lblSolutionIndex, lblSolutionName, lblSolutionComplete;
	private ScrolledForm form;
	private FormToolkit toolkit;
	private Table tableComponentProperties;
	private Table tableMetricProperties;
	

	
	public OldInfoSheetView() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		form = toolkit.createScrolledForm(parent);
		form.setBounds(0, 0, 448, 614);
		form.setText("Current Solution");
		toolkit.decorateFormHeading(form.getForm());
		form.setDelayedReflow(true);
	    GridLayout gridLayout = new GridLayout(1, false);
	    gridLayout.marginWidth = 0;
	    form.getBody().setLayout(gridLayout);
	    
	    /* Section Deployment Information */
	    /* ****************************** */
	    Section sectionDeploymentSolution = toolkit.createSection(form.getBody(), Section.EXPANDED | Section.TITLE_BAR);
	    sectionDeploymentSolution.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    sectionDeploymentSolution.setText("General Information");
	    
	    Composite compositeDeploymentSolution = toolkit.createComposite(form.getBody(), SWT.WRAP);
	    GridData gd_compositeDeploymentSolution = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
	    gd_compositeDeploymentSolution.widthHint = 427;
	    compositeDeploymentSolution.setLayoutData(gd_compositeDeploymentSolution);
	    GridLayout gl_compositeDeploymentSolution = new GridLayout(2, false);
	    gl_compositeDeploymentSolution.marginBottom = 5;
	    gl_compositeDeploymentSolution.marginLeft = 10;
	    compositeDeploymentSolution.setLayout(gl_compositeDeploymentSolution);
	    
	    toolkit.createLabel(compositeDeploymentSolution, "Solution Name:", SWT.NONE);
	    
	    lblSolutionName = toolkit.createLabel(compositeDeploymentSolution, "", SWT.NONE);
	    GridData gd_lblSolutionName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_lblSolutionName.minimumWidth = 250;
	    lblSolutionName.setLayoutData(gd_lblSolutionName);
	    lblSolutionName.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	    
	    toolkit.createLabel(compositeDeploymentSolution, "Solution Number:", SWT.NONE);
	    
	    lblSolutionIndex = toolkit.createLabel(compositeDeploymentSolution, "", SWT.NONE);
	    GridData gd_lblSolution = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
	    gd_lblSolution.minimumWidth = 250;
	    lblSolutionIndex.setLayoutData(gd_lblSolution);
	    lblSolutionIndex.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	    
	    toolkit.createLabel(compositeDeploymentSolution, "Solution Score:", SWT.NONE);
	    
	    lblSolutionScore = toolkit.createLabel(compositeDeploymentSolution, "", SWT.NONE);
	    GridData gd_lblScore = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_lblScore.minimumWidth = 250;
	    lblSolutionScore.setLayoutData(gd_lblScore);
	    lblSolutionScore.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	    
	    toolkit.createLabel(compositeDeploymentSolution, "Solution is complete:", SWT.NONE);
	    	    
	    lblSolutionComplete = toolkit.createLabel(compositeDeploymentSolution, "", SWT.NONE);
	    GridData gd_lblComSolution = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_lblComSolution.minimumWidth = 250;
	    lblSolutionComplete.setLayoutData(gd_lblComSolution);
	    lblSolutionComplete.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	    	    
//	    setDeploymentNumberAndScore(-1);
	    
	    /* Section Metric Information */
	    /* ************************** */
	    Section sectionMetricsOverview = toolkit.createSection(form.getBody(), Section.EXPANDED | Section.TITLE_BAR);
	    sectionMetricsOverview.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    sectionMetricsOverview.setText("Metrics Overview"); //$NON-NLS-1$

	    final Composite compositeMetricSolution = toolkit.createComposite(form.getBody(), SWT.WRAP);
	    compositeMetricSolution.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
	    GridLayout gl_compositeMetricSolution = new GridLayout(1, false);
	    gl_compositeMetricSolution.marginBottom = 5;
	    gl_compositeMetricSolution.marginLeft = 10;
	    compositeMetricSolution.setLayout(gl_compositeMetricSolution);
	    
	    tableMetricProperties = toolkit.createTable(compositeMetricSolution, SWT.NONE);
	    GridData gd_tableMetricProperties = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
	    gd_tableMetricProperties.heightHint = 128;
	    tableMetricProperties.setLayoutData(gd_tableMetricProperties);
	    toolkit.paintBordersFor(tableMetricProperties);
	    tableMetricProperties.setHeaderVisible(true);
	    tableMetricProperties.setLinesVisible(true);
	    
	    final TableColumn tcmp1 = new TableColumn(tableMetricProperties, SWT.LEFT);
	    tcmp1.setWidth(120);
	    tcmp1.setResizable(true);
	    tcmp1.setText("Metric");
	    
	    final TableColumn tcmp2 = new TableColumn(tableMetricProperties, SWT.RIGHT);
	    tcmp2.setWidth(50);
	    tcmp2.setResizable(true);
	    tcmp2.setText("Weight");
	    
	    final TableColumn tcmp3 = new TableColumn(tableMetricProperties, SWT.RIGHT);
	    tcmp3.setWidth(98);
	    tcmp3.setResizable(true);
	    tcmp3.setText("Score (absolute)");

	    final TableColumn tcmp4 = new TableColumn(tableMetricProperties, SWT.RIGHT);
	    tcmp4.setWidth(140);
	    tcmp4.setResizable(true);
	    tcmp4.setText("Score (weighted, scaled)");
	    
	    /* Section Component Properties */
	    /* **************************** */
	    
	    Section sectionArchitectureElementProperties = toolkit.createSection(form.getBody(), Section.EXPANDED | Section.TITLE_BAR);
	    sectionArchitectureElementProperties.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    sectionArchitectureElementProperties.setText("Selected Component"); //$NON-NLS-1$

	    Composite compositeComponentInformation = toolkit.createComposite(form.getBody(), SWT.NONE);
	    compositeComponentInformation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
	    GridLayout gl_compositeComponentInformation = new GridLayout(1, false);
	    gl_compositeComponentInformation.marginBottom = 5;
	    gl_compositeComponentInformation.marginLeft = 10;
	    compositeComponentInformation.setLayout(gl_compositeComponentInformation);
	    
	    tableComponentProperties = toolkit.createTable(compositeComponentInformation, SWT.NONE);
	    GridData gd_tableComponentProperties = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
	    gd_tableComponentProperties.heightHint = 128;
	    tableComponentProperties.setLayoutData(gd_tableComponentProperties);
	    toolkit.paintBordersFor(tableComponentProperties);
	    tableComponentProperties.setHeaderVisible(true);
	    tableComponentProperties.setLinesVisible(true);
	    
	    final TableColumn tc1 = new TableColumn(tableComponentProperties, SWT.LEFT);
	    tc1.setResizable(true);
	    tc1.setText("Property");
	    tc1.setWidth(130);
	    final TableColumn tc2 = new TableColumn(tableComponentProperties, SWT.LEFT);
	    tc2.setWidth(200);
	    tc2.setResizable(true);
	    tc2.setText("Value");
	}

	
	
	
//	private void addRowToTableComponentProperties(String category, String value) {
//		String checkedValue =  (value == null || value.isEmpty()) ? "n/a" : value;
//		TableItem tblItem = new TableItem(tableComponentProperties, SWT.NONE);
//		tblItem.setText(0, category);
//		tblItem.setFont(0, SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
//		tblItem.setText(1, checkedValue);
//		tblItem.setFont(1, SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
//	}
	
//	private void addRowToTableMetricProperties(String category, String value1, String value2, String value3) {
//		String checkedValue1 =  (value1 == null || value1.isEmpty()) ? "n/a" : value1;
//		String checkedValue2 =  (value2 == null || value2.isEmpty()) ? "n/a" : value2;
//		String checkedValue3 =  (value3 == null || value3.isEmpty()) ? "n/a" : value3;
//		TableItem tblItem = new TableItem(tableMetricProperties, SWT.NONE);
//		tblItem.setText(0, category);
//		tblItem.setFont(0, SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
//		tblItem.setText(1, checkedValue1);
//		tblItem.setFont(1, SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
//		tblItem.setText(2, checkedValue2);
//		tblItem.setFont(2, SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
//		tblItem.setText(3, checkedValue3);
//		tblItem.setFont(3, SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
//	}

	
	

//	/**
//	 * Creates the View for the Info Panel
//	 */
//	private void fillComponentPropertiesTable(Object obj) {
//
//		/* Clear table */
//		if (tableComponentProperties != null) 
//			tableComponentProperties.removeAll();
//
//		if (obj != null) {
//			if (obj instanceof Result)
//				addRowToTableComponentProperties("System Name", ((Result) obj).getSystemName());
//
//			else if (obj instanceof HardwareElement) {
//
//				if (obj instanceof Core) {
//					Core c = (Core) obj;
//					DecimalFormat f = new DecimalFormat("#0.00");
//					addRowToTableComponentProperties("Component type", "Core");
//					addRowToTableComponentProperties("Name", c.getName());
//					addRowToTableComponentProperties("Architecture", c.getArchitecture());
//					addRowToTableComponentProperties("Max. capacity", "" + c.getCapacity());
//					addRowToTableComponentProperties("Current load", (c.getCapacity() > 0 ? f.format(new Double(c.getUtilization()) * 100 / new Double(c.getCapacity())) : "0") + "%");
//				} 
//				
//				else if (obj instanceof Processor) {
//					Processor p = (Processor) obj;
//					addRowToTableComponentProperties("Component type", "Processor");
//					addRowToTableComponentProperties("Name", p.getName());
//					addRowToTableComponentProperties("Manufacturer", p.getManufacturer());
//					addRowToTableComponentProperties("Type", p.getProcessorType());
//					addRowToTableComponentProperties("# Cores", "" + p.getCores().size());
//				} 
//				
//				else if (obj instanceof Board) {
//					Board b = (Board) obj;
//					DecimalFormat f = new DecimalFormat("#0.00");
//					addRowToTableComponentProperties("Component type", "Board");
//					addRowToTableComponentProperties("Name", b.getName());
//					addRowToTableComponentProperties("Manufacturer", b.getManufacturer());
//					addRowToTableComponentProperties("Power suppy", b.getPowerSupply());
//					addRowToTableComponentProperties("DAL", b.getAssuranceLevel().toString());
//					addRowToTableComponentProperties("RAM", b.getRamUtilization() + " of " + b.getRamCapacity() + " (" + ((b.getRomCapacity() > 0) ? f.format(new Double(b.getRamUtilization()) * 100 / new Double(b.getRamCapacity())) : "0") + "%)");
//					addRowToTableComponentProperties("ROM", b.getRomUtilization() + " of " + b.getRomCapacity() + " (" + ((b.getRomCapacity() > 0) ? f.format(new Double(b.getRomUtilization()) * 100 / new Double(b.getRomCapacity())) : "0") + "%)");
//					
//					for (IOAdapter a : b.getIoAdapters()) 
//						addRowToTableComponentProperties("I/O adapters '" + a.getAdapterType() + "'", ""+a.getTotalUnitCount());
//
//				} else if (obj instanceof Box) {
//					Box b = (Box) obj;
//					addRowToTableComponentProperties("Component Type", "Box");
//					addRowToTableComponentProperties("Name", b.getName());
//					addRowToTableComponentProperties("Manufacturer", b.getManufacturer());
//				} else if (obj instanceof Compartment) {
//					Compartment c = (Compartment) obj;
//					addRowToTableComponentProperties("Component Type", "Compartment");
//					addRowToTableComponentProperties("Name", c.getName());
//					addRowToTableComponentProperties("Manufacturer", c.getManufacturer());
//					addRowToTableComponentProperties("Side", c.getSide());
//					addRowToTableComponentProperties("Zone", c.getZone());
//					addRowToTableComponentProperties("Power Suppy", c.getPowerSupply());
//				}
//			} else if (obj instanceof Thread) {
//				Thread t = (Thread) obj;
//				addRowToTableComponentProperties("Component Type", "Thread");
//				addRowToTableComponentProperties("Application Name", t.getApplication().getName());
//				addRowToTableComponentProperties("Thread ID", t.getName());
//				addRowToTableComponentProperties("Criticality", t.getApplication().getCriticalityLevel().getLiteral());
//				addRowToTableComponentProperties("Core utilization", "" + t.getApplication().getCoreUtilization());
//				addRowToTableComponentProperties("RAM utilization", "" + t.getApplication().getRamUtilization());
//				addRowToTableComponentProperties("ROM utilization", "" + t.getApplication().getRomUtilization());
//				addRowToTableComponentProperties("Developed by", t.getApplication().getDevelopedBy());
//			}
//		}
//	}
//
//	/**
//	 * Sets the Score and Solution Labels according to the current solution at index
//	 */
//	private void setDeploymentNumberAndScore(int index) {
//		if (index == -1) {
//			Display.getDefault().syncExec(new Runnable() {
//			    public void run() {
//			    	lblSolutionName.setText("n/a");
//			    	lblSolutionScore.setText("n/a");
//					lblSolutionIndex.setText("n/a");
//					lblSolutionComplete.setText("n/a");
//					fillComponentPropertiesTable(null);
//					
//			    }
//			});
//			
//		} else {
//			if (index <= model.getObservableResultsList().size()-1) {
//				Result r = model.getObservableResultsList().get(index);
//				DecimalFormat f = new DecimalFormat("#0.00"); 
//				
//				lblSolutionName.setText(r.getName());
//				lblSolutionScore.setText(f.format(r.getEvaluation().getTotalScaledScore()));
//				lblSolutionIndex.setText((index + 1) + " of " + model.getObservableResultsList().size());
//				
//				lblSolutionComplete.setText("Yes");
//				
//				fillMetricPropertiesTable(r);
//			}
//			else {
//				setDeploymentNumberAndScore(-1);
//			}
//		}
//	}
//
//	private void clearForm() {
//			fillComponentPropertiesTable(null);
//			setDeploymentNumberAndScore(-1);
//	}

	@Focus
	public void setFocus() {
	}

	@PreDestroy
	public void dispose() {
	}
	

}


