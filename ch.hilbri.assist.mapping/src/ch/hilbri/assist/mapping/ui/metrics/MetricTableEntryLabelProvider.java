package ch.hilbri.assist.mapping.ui.metrics;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.wb.swt.ResourceManager;

public class MetricTableEntryLabelProvider extends CellLabelProvider {

	private Table tblSelectedMetrics;
	private MetricsView metricsView;
	
	/* Stores all remove-buttons; we have to store them, so they
	 * can be accessed and disposed, after their parent (entry) has been removed */
	private Map<Object, Button> allRemoveButtons = new HashMap<Object, Button>();
	
	public MetricTableEntryLabelProvider(Table tblSelectedMetrics, MetricsView metricsView) {
		super();
		this.tblSelectedMetrics = tblSelectedMetrics;
		this.metricsView = metricsView;
	}
	
	@Override
	public void update(final ViewerCell cell) {

		final MetricTableEntry metricTableEntry = (MetricTableEntry) cell.getElement();
		
		switch (cell.getColumnIndex()) {
		
		case 0:
			cell.setText(String.valueOf(tblSelectedMetrics.indexOf((TableItem) cell.getItem()) + 1));
			break;
		
		case 1:
			cell.setText(metricTableEntry.getMetric().getName());
			break;
		
		case 2:
			if (metricTableEntry.getMetric().isBuiltIn()) cell.setText("Built-in");
			else cell.setText("Custom");
			break;
		
		case 3:
			cell.setText(String.valueOf(metricTableEntry.getWeight()));
			break;
		
		case 4:
			TableItem item = (TableItem) cell.getItem();
			final Button btnRemove;
			
			if (allRemoveButtons.containsKey(cell.getElement())) 
				btnRemove = allRemoveButtons.get(cell.getElement());
			
			else {
				btnRemove = new Button((Composite) cell.getViewerRow().getControl(), SWT.NONE);
				btnRemove.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/remove.gif"));
				btnRemove.addSelectionListener(new SelectionListener() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						MessageDialog metricRemoveDialog = new MessageDialog(
								null, "Remove Metric", null, "Are you sure you want to remove the Metric \"" + metricTableEntry.getMetric().getName() + "\"?",
								MessageDialog.QUESTION, new String[] {"Yes", "No" }, 1);
						
						if (metricRemoveDialog.open() == 0) {
							metricsView.removeEntryFromTable(metricTableEntry);
							btnRemove.dispose();
						}
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {}
				});
				
				allRemoveButtons.put(cell.getElement(), btnRemove);
			}
			
			TableEditor editor = new TableEditor(tblSelectedMetrics);
			editor.grabHorizontal = true;
			editor.grabVertical = true;
			editor.setEditor(btnRemove, item, 4);
			editor.layout();
			
			break;
		}
	}

}
