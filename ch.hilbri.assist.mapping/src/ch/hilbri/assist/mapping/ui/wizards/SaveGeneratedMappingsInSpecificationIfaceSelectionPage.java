package ch.hilbri.assist.mapping.ui.wizards;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.Pin;

public class SaveGeneratedMappingsInSpecificationIfaceSelectionPage extends WizardPage {
	
	private static class Sorter extends ViewerSorter {
		public int compare(Viewer viewer, Object e1, Object e2) {
			EqInterface iface1 = (EqInterface) e1;
			EqInterface iface2 = (EqInterface) e2;
			return iface1.getName().compareTo(iface2.getName());
		}
	}
	
	
	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {	return null; }
		public String getColumnText(Object element, int columnIndex) {
			
			EqInterface iface = (EqInterface) element;
			switch (columnIndex) {
			case 0: return "";
			case 1: return iface.getName();
			case 2: return mapping.get(iface).getConnector().getRdc().getCompartment().getName() + "." + 
						   mapping.get(iface).getConnector().getRdc().getName() + "." + 
						   mapping.get(iface).getConnector().getName() + " . " + 
						   mapping.get(iface).getName(); 
			case 3: return iface.getIoType();
			case 4: return iface.getSystem();
			}
			return "";
		}
	}
	
	private class InterfaceFilter extends ViewerFilter {
		private String searchString;
		public void setSearchString(String s) { searchString = ".*" + s + ".*"; }
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (searchString == null || searchString.length() == 0) return true;
			EqInterface iface = (EqInterface) element;
			if (iface.getName().matches(searchString)) return true;
			if (iface.getIoType().matches(searchString)) return true;
			if (iface.getSystem().matches(searchString)) return true;
			if ((mapping.get(iface).getConnector().getRdc().getCompartment().getName() + "." + 
				 mapping.get(iface).getConnector().getRdc().getName() + "." + 
				 mapping.get(iface).getConnector().getName() + "." +
				 mapping.get(iface).getName())
				.matches(searchString)) return true;
			
			return false;
		}
	}
	
	private class InterfaceCheckStateProvider implements ICheckStateProvider {

		private ArrayList<Object> checkedElements = new ArrayList<Object>();
		
		public void toggleState(Object o) {
			if (checkedElements.contains(o)) checkedElements.remove(o);
			else							 checkedElements.add(o);
		}
		
		public void uncheck(Object[] list) {
			for (Object o : list) 
				if (checkedElements.contains(o))
					checkedElements.remove(o);
		}
		
		public void check(Object[] list) {
			for (Object o : list)
				if (!checkedElements.contains(o))
					checkedElements.add(o);
		}
		
		public void setChecked(Object[] list) {
			checkedElements.clear();
			if (list != null)
				for (Object o : list)
					checkedElements.add(o);
		}
		
		@Override
		public boolean isChecked(Object element) {	return checkedElements.contains(element);	}
		@Override
		public boolean isGrayed(Object element) {	return false;	}
	}
	
	private Table table;
	private CheckboxTableViewer tableViewer;
	private Map<EqInterface, Pin> mapping;
	private Text searchText;
	private InterfaceFilter filter; 

	protected SaveGeneratedMappingsInSpecificationIfaceSelectionPage(Map<EqInterface, Pin> mapping) {
		super("InterfaceSelection");
		setTitle("Select Interface Mappings");
		setDescription("Please select the mappings from the current solution.");
		
		this.mapping = mapping;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		
		Composite mainComposite = new Composite(container, SWT.NONE);
		GridData gd_mainComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_mainComposite.heightHint = 363;
		gd_mainComposite.widthHint = 559;
		mainComposite.setLayoutData(gd_mainComposite);
		GridLayout gl_mainComposite = new GridLayout(1, false);
		gl_mainComposite.marginWidth = 0;
		mainComposite.setLayout(gl_mainComposite);
		
		Composite composite_1 = new Composite(mainComposite, SWT.NONE);
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_composite_1.widthHint = 560;
		composite_1.setLayoutData(gd_composite_1);
		composite_1.setSize(574, 35);
		GridLayout gl_composite_1 = new GridLayout(3, false);
		gl_composite_1.marginWidth = 0;
		composite_1.setLayout(gl_composite_1);
		
		Label lblSearch = new Label(composite_1, SWT.NONE);
		lblSearch.setText("Filter:");
		
		searchText = new Text(composite_1, SWT.BORDER);
		GridData gd_searchText = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_searchText.widthHint = 150;
		searchText.setLayoutData(gd_searchText);
		
		Button btnClear = new Button(composite_1, SWT.NONE);
		btnClear.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				searchText.setText("");
				filter.setSearchString("");
				tableViewer.refresh();
			}
		});
		btnClear.setText("Clear");
		
		Label lblMatchingInterfaces = new Label(mainComposite, SWT.NONE);
		lblMatchingInterfaces.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblMatchingInterfaces.setSize(108, 15);
		lblMatchingInterfaces.setText("Matching Interfaces:");
		
		table = new Table(mainComposite, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION | SWT.MULTI);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setSize(574, 45);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnSelected = new TableColumn(table, SWT.CENTER);
		tblclmnSelected.setText("Save");
		tblclmnSelected.setResizable(false);
		tblclmnSelected.setWidth(38);
		
		TableColumn tblclmnInterfaceName = new TableColumn(table, SWT.NONE);
		tblclmnInterfaceName.setWidth(123);
		tblclmnInterfaceName.setText("Interface Name");
		
		TableColumn tblclmnMapping = new TableColumn(table, SWT.NONE);
		tblclmnMapping.setResizable(false);
		tblclmnMapping.setWidth(152);
		tblclmnMapping.setText("Mapping");
		
		TableColumn tblclmnIoType = new TableColumn(table, SWT.NONE);
		tblclmnIoType.setResizable(false);
		tblclmnIoType.setWidth(111);
		tblclmnIoType.setText("IO Type");
		
		TableColumn tblclmnSystem = new TableColumn(table, SWT.NONE);
		tblclmnSystem.setResizable(false);
		tblclmnSystem.setWidth(129);
		tblclmnSystem.setText("System");
		
		InterfaceCheckStateProvider ifaceCheckState = new InterfaceCheckStateProvider();
		ifaceCheckState.setChecked(mapping.keySet().toArray());
		
		filter = new InterfaceFilter();
		
		tableViewer = new CheckboxTableViewer(table);
		tableViewer.setSorter(new Sorter());
		tableViewer.setAllGrayed(false);
		tableViewer.setAllChecked(true);
		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setInput(mapping.keySet());
		tableViewer.setCheckStateProvider(ifaceCheckState);
		
		Composite composite = new Composite(mainComposite, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false,
				1, 1));
		composite.setSize(359, 35);
		GridLayout gl_composite = new GridLayout(4, false);
		gl_composite.marginWidth = 0;
		composite.setLayout(gl_composite);

		Button btnCheckAll = new Button(composite, SWT.NONE);
		btnCheckAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				TableItem[] items = table.getItems();
				Object[] objects = new Object[items.length];
				for (int i = 0; i < items.length; i++)
					objects[i] = items[i].getData();

				ifaceCheckState.check(objects);
				tableViewer.refresh();
			}
		});
		btnCheckAll.setText("Check All");
		
		Button btnClearAll = new Button(composite, SWT.NONE);
		btnClearAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				TableItem[] items = table.getItems();
				Object[] objects = new Object[items.length];
				for (int i = 0; i < items.length; i++)
					objects[i] = items[i].getData();

				ifaceCheckState.uncheck(objects);
				tableViewer.refresh();
			}
		});
		btnClearAll.setText("Uncheck All");

		Button btnCheckSelectedInterfaces = new Button(composite, SWT.NONE);
		btnCheckSelectedInterfaces.setSize(92, 25);
		btnCheckSelectedInterfaces.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				TableItem[] items = table.getSelection();
				Object[] objects = new Object[items.length];
				for (int i = 0; i < items.length; i++)
					objects[i] = items[i].getData();

				ifaceCheckState.check(objects);
				tableViewer.refresh();
			}
		});
		btnCheckSelectedInterfaces.setText("Check Selected");
		
		Button btnUncheckSelectedInterfaces = new Button(composite, SWT.NONE);
		btnUncheckSelectedInterfaces
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						TableItem[] items = table.getSelection();
						Object[] objects = new Object[items.length];
						for (int i = 0; i < items.length; i++)
							objects[i] = items[i].getData();

						ifaceCheckState.uncheck(objects);
						tableViewer.refresh();
					}
				});
		btnUncheckSelectedInterfaces.setText("Uncheck Selected");

		tableViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				ifaceCheckState.toggleState(event.getElement());
			}
		});
		tableViewer.addFilter(filter);
		
		searchText.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ke) {
				filter.setSearchString(searchText.getText());
				tableViewer.refresh();
			}
		});
		
		setControl(container);
	}
	
	public Object[] getSelectedInterfaces() { 
		return tableViewer.getCheckedElements();
	}
}
