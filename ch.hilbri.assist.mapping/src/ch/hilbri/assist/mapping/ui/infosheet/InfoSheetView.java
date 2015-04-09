package ch.hilbri.assist.mapping.ui.infosheet;

import java.text.DecimalFormat;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.scene.control.TreeItem;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.RDC;
import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx.TreeObject;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;


public class InfoSheetView {
	
	public static final String SET_INFO_VIEW_CONTENT_PROVIDER = "set_info_view_content_provider";
	
	
	private DetailedResultsViewUiModel model;
	
	private Label lblScore, lblSolution;
	private ChangeListener<TreeItem<TreeObject>> clickListener;
	private ScrolledForm form;
	private FormToolkit toolkit;
	private ChangeListener<Number> drawListener;
	private ListChangeListener<Result> resultListener;
	private Table tableComponentProperties;
	private Table tableMetricProperties;
	private Label lblCompleteSolution;

	
	public InfoSheetView() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		form = toolkit.createScrolledForm(parent);
		form.setBounds(0, 0, 448, 389);
		form.setText("Current Deployment");
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
	    compositeDeploymentSolution.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
	    GridLayout gl_compositeDeploymentSolution = new GridLayout(2, false);
	    gl_compositeDeploymentSolution.marginBottom = 5;
	    gl_compositeDeploymentSolution.marginLeft = 10;
	    compositeDeploymentSolution.setLayout(gl_compositeDeploymentSolution);
	    
	    toolkit.createLabel(compositeDeploymentSolution, "Deployment Number:", SWT.NONE);
	    
	    lblSolution = toolkit.createLabel(compositeDeploymentSolution, "", SWT.NONE);
	    GridData gd_lblSolution = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
	    gd_lblSolution.minimumWidth = 100;
	    lblSolution.setLayoutData(gd_lblSolution);
	    lblSolution.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	    
	    toolkit.createLabel(compositeDeploymentSolution, "Deployment Score:", SWT.NONE);
	    
	    lblScore = toolkit.createLabel(compositeDeploymentSolution, "", SWT.NONE);
	    GridData gd_lblScore = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_lblScore.minimumWidth = 100;
	    lblScore.setLayoutData(gd_lblScore);
	    lblScore.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	    
	    toolkit.createLabel(compositeDeploymentSolution, "Solution is complete:", SWT.NONE);
	    	    
	    lblCompleteSolution = toolkit.createLabel(compositeDeploymentSolution, "", SWT.NONE);
	    GridData gd_lblComSolution = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_lblComSolution.minimumWidth = 100;
	    lblCompleteSolution.setLayoutData(gd_lblComSolution);
	    lblCompleteSolution.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	    	    
	    setDeploymentNumberAndScore(-1);
	    
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

	
	/**
	 * The method receives the broadcast from a Mapping Editor with the model of
	 * the focused editor.
	 * 
	 * @param obj
	 *            Object array with size 2 which holds the
	 *            DetailedResultsViewUiModel as first and MultiPageEditor as second
	 */
	@Inject
	@Optional
	public void setMetricContentProvider(@UIEventTopic(SET_INFO_VIEW_CONTENT_PROVIDER) MultiPageEditor editor) {

		final DetailedResultsViewUiModel model = editor.getDetailedResultViewUiModel();

		if (model.getEditor() == editor) {
			if (this.model != model) {
				clearForm();
				clearListeners();
				
				this.model = model;
			
				clickListener = new ChangeListener<TreeItem<TreeObject>>() {

					@Override
					public void changed(ObservableValue<? extends TreeItem<TreeObject>> arg0, TreeItem<TreeObject> prevObject, final TreeItem<TreeObject> newObject) {
						Display disp = form.getDisplay();
						disp.asyncExec(new Runnable() {

							@Override
							public void run() {
								setDeploymentNumberAndScore(model.indexToDrawProperty().get());
								fillComponentPropertiesTable(newObject.getValue().getObject());
							}
						});
					}
				};
				model.clickedObjectProperty().addListener(clickListener);
				
				drawListener = new ChangeListener<Number>() {

					@Override
					public void changed(ObservableValue<? extends Number> arg0,	Number arg1, final Number arg2) {
						final int index = model.indexToDrawProperty().get();
						Display disp = form.getDisplay();
						disp.asyncExec(new Runnable() {
							@Override
							public void run() {
								setDeploymentNumberAndScore(index);
							}
						});
					}
				};
				model.indexToDrawProperty().addListener(drawListener);
				
				resultListener = new ListChangeListener<Result>() {

					@Override
					public void onChanged(final javafx.collections.ListChangeListener.Change<? extends Result> change) {
						while (change.next()) {
							if (model.getObservableResultsList().size() > 0) {
								final int index = model.indexToDrawProperty().get();
								Display disp = form.getDisplay();
								disp.asyncExec(new Runnable() {
									@Override
									public void run() {
										setDeploymentNumberAndScore(index);
									}
								});
							} else {
								setDeploymentNumberAndScore(-1);
							}
						}
					}
				};
				model.getObservableResultsList().addListener(resultListener);
				
				if (model.getResults() != null) { 
					setDeploymentNumberAndScore(0);
				} else {
					setDeploymentNumberAndScore(-1);
				}
			}
		}
	}
	
	private void addRowToTableComponentProperties(String category, String value) {
		String checkedValue =  (value == null || value.isEmpty()) ? "n/a" : value;
		TableItem tblItem = new TableItem(tableComponentProperties, SWT.NONE);
		tblItem.setText(0, category);
		tblItem.setFont(0, SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		tblItem.setText(1, checkedValue);
		tblItem.setFont(1, SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	}
	
	private void addRowToTableMetricProperties(String category, String value1, String value2, String value3) {
		String checkedValue1 =  (value1 == null || value1.isEmpty()) ? "n/a" : value1;
		String checkedValue2 =  (value2 == null || value2.isEmpty()) ? "n/a" : value2;
		String checkedValue3 =  (value3 == null || value3.isEmpty()) ? "n/a" : value3;
		TableItem tblItem = new TableItem(tableMetricProperties, SWT.NONE);
		tblItem.setText(0, category);
		tblItem.setFont(0, SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		tblItem.setText(1, checkedValue1);
		tblItem.setFont(1, SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		tblItem.setText(2, checkedValue2);
		tblItem.setFont(2, SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		tblItem.setText(3, checkedValue3);
		tblItem.setFont(3, SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
	}

	private void fillMetricPropertiesTable(Result r) {
		
		if (tableMetricProperties != null)
			tableMetricProperties.removeAll();
		
		if (r != null) {
			for (AbstractMetric m : r.getEvaluation().getMetricsUsed()) {
				addRowToTableMetricProperties(m.getName(), 
												""+m.getWeight(),
												String.format("%.3f", r.getEvaluation().getAbsoluteScores().get(m)), 
												String.format("%.3f", r.getEvaluation().getScaledScores().get(m))
										 	);
			}
		}
		
	}
	

	/**
	 * Creates the View for the Info Panel
	 */
	private void fillComponentPropertiesTable(Object obj) {

		/* Clear table */
		if (tableComponentProperties != null) 
			tableComponentProperties.removeAll();

		if (obj != null) {
			if (obj instanceof Result)
				addRowToTableComponentProperties("System Name", ((Result) obj).getModel().getSystemName());

			else if (obj instanceof HardwareElement) {

				if (obj instanceof Connector) {
					Connector c = (Connector) obj;
					addRowToTableComponentProperties("Component type", "Connector");
					addRowToTableComponentProperties("Name", c.getName());

					for (AvailableEqInterface iface : c.getAvailableEqInterfaces()) {
						addRowToTableComponentProperties("Available of type '" + iface.getEqInterfaceType() + "'", ""+ iface.getCount());
					}
				
				} else if (obj instanceof RDC) {
					RDC b = (RDC) obj;
					addRowToTableComponentProperties("Component type", "RDC");
					addRowToTableComponentProperties("Name", b.getName());
					addRowToTableComponentProperties("Manufacturer", b.getManufacturer());
					addRowToTableComponentProperties("Power supply", b.getPowerSupply());
					addRowToTableComponentProperties("Side", b.getSide());
					addRowToTableComponentProperties("Type", b.getRdcType());
					addRowToTableComponentProperties("ESS", b.getEss());
					addRowToTableComponentProperties("Resource X", ""+b.getResourceX());
					addRowToTableComponentProperties("Resource Y", ""+b.getResourceY());
					addRowToTableComponentProperties("Resource Z", ""+b.getResourceZ());
					addRowToTableComponentProperties("Contains connectors", b.getConnectors().toString());
					
				} else if (obj instanceof Compartment) {
					Compartment c = (Compartment) obj;
					addRowToTableComponentProperties("Component Type", "Compartment");
					addRowToTableComponentProperties("Name", c.getName());
					addRowToTableComponentProperties("Manufacturer", c.getManufacturer());
					addRowToTableComponentProperties("Power supply", c.getPowerSupply());
					addRowToTableComponentProperties("Side", c.getSide());
					addRowToTableComponentProperties("Zone", c.getZone());
					addRowToTableComponentProperties("Contains RDCs", c.getRdcs().toString());
				}
			} /* Hardware element */
			
			else if (obj instanceof EqInterface) {
				EqInterface iface  = (EqInterface) obj;
				addRowToTableComponentProperties("Component Type", "Interface");
				addRowToTableComponentProperties("Name", iface.getName());
				addRowToTableComponentProperties("System", iface.getSystem());
				addRowToTableComponentProperties("SubAta", iface.getSubAta());
				addRowToTableComponentProperties("LineName", iface.getLineName());
				addRowToTableComponentProperties("GrpInfo", iface.getGrpInfo());
				addRowToTableComponentProperties("Route", iface.getRoute());
				addRowToTableComponentProperties("PwSup1", iface.getPwSup1());
				addRowToTableComponentProperties("EmhZone1", iface.getEmhZone1());
				addRowToTableComponentProperties("IOType", iface.getIoType());
				addRowToTableComponentProperties("Resource", iface.getResource());
				addRowToTableComponentProperties("Resource X", ""+iface.getResourceX());
				addRowToTableComponentProperties("Resource Y", ""+iface.getResourceY());
				addRowToTableComponentProperties("Resource Z", ""+iface.getResourceZ());
			}
		
		} // != null
	}

	/**
	 * Sets the Score and Solution Labels according to the current solution at index
	 */
	private void setDeploymentNumberAndScore(int index) {
		if (index == -1) {
			Display.getDefault().syncExec(new Runnable() {
			    public void run() {
			    	lblScore.setText("n/a");
					lblSolution.setText("n/a");
					lblCompleteSolution.setText("n/a");
					fillMetricPropertiesTable(null);
					fillComponentPropertiesTable(null);
					
			    }
			});
			
		} else {
			if (index <= model.getObservableResultsList().size()-1) {
				Result r = model.getObservableResultsList().get(index);
				DecimalFormat f = new DecimalFormat("#0.00"); 
				
				lblScore.setText(f.format(r.getEvaluation().getTotalScaledScore()));
				lblSolution.setText((index + 1) + " of " + model.getObservableResultsList().size());
				
				if (!r.isPartialSolution()) lblCompleteSolution.setText("Yes");
				else						lblCompleteSolution.setText("No (" + (new DecimalFormat("#0.00").format(r.getCompletenessAsPercentage())) + "%)");
				
				fillMetricPropertiesTable(r);
			}
			else {
				setDeploymentNumberAndScore(-1);
			}
		}
	}
	
	private void clearListeners() {
		if (clickListener != null) model.clickedObjectProperty().removeListener(clickListener);
		if (drawListener != null) model.indexToDrawProperty().removeListener(drawListener);
		if (resultListener != null) model.getObservableResultsList().removeListener(resultListener);
	}

	private void clearForm() {
			fillComponentPropertiesTable(null);
			setDeploymentNumberAndScore(-1);
	}

	@Focus
	public void setFocus() {
	}

	@PreDestroy
	public void dispose() {
	}
	
	/**
	 * Removes the property bindings
	 */
	@PreDestroy
	private void preDestroy() {
		clearListeners();
	}
}


