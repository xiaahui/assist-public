package ch.hilbri.assist.mapping.ui.metrics.old;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;

import ch.hilbri.assist.mapping.ui.metrics.MetricTableView;

class MetricLabelProvider extends CellLabelProvider {

	private TableEditor editor;
	private MetricTableView metricTableView;
	private Map<Object, Button> buttons = new HashMap<Object, Button>();
	
	/**
	 * Constructor 
	 * 
	 * @param metricTableView
	 */
	public MetricLabelProvider(MetricTableView metricTableView) {
		this.metricTableView = metricTableView;
	}


	@Override
	public void update(final ViewerCell cell) {
		final MetricTableElement metric = (MetricTableElement) cell.getElement();
		switch (cell.getColumnIndex()) {
		case 0:
			cell.setText(String.valueOf(this.metricTableView.getTable().indexOf((TableItem) cell.getItem()) + 1));
			break;
		case 1:
			cell.setText(String.valueOf(metric.getWeight()));
			break;
		case 2:
			cell.setText(metric.getName());
			break;
		case 3:
			if (metric.isBuiltIn()) {
				cell.setText("Built-in");
			} else {
				cell.setText("Custom");
			}
			break;
		case 4:
			final Button button;
			
			if (buttons.containsKey(cell.getElement())) {
				button = buttons.get(cell.getElement());
			} 
			
			else {
				button = new Button((Composite) cell.getViewerRow().getControl(), SWT.NONE);
				button.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						if (MetricLabelProvider.this.metricTableView.elementlist.size() > 0) {
							MessageDialog metricRemoveDialog = new MessageDialog(
									null, "Remove Metric", null, "Are you sure you want to remove the Metric \"" + metric.getName() + "\"?",
									MessageDialog.QUESTION, new String[] {"Yes", "No" }, 1);
							if (metricRemoveDialog.open() == 0) {
								MetricLabelProvider.this.metricTableView.elementlist.remove(metric);
								button.getDisplay().asyncExec(new Runnable() {

									@Override
									public void run() {
										buttons.remove(cell.getElement());
										button.dispose();
										MetricLabelProvider.this.metricTableView.getTableViewer().refresh();
									}
								});
							}
						}
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {}
				});
				
				buttons.put(cell.getElement(), button);
			}

			Image bgImg = new Image(this.metricTableView.getTable().getDisplay(), getClass().getClassLoader().getResourceAsStream("/icons/metricTable/remove_metric.gif"));
			button.setImage(bgImg);
			editor = new TableEditor(this.metricTableView.getTable());
			editor.grabHorizontal = true;
			editor.grabVertical = true;
			TableItem item = (TableItem) cell.getItem();
			editor.setEditor(button, item, 4);
			editor.layout();
			break;
		}

	}

	@Override
	public void dispose() {
		for (Button btn : buttons.values()) btn.dispose();
		super.dispose();
	}

	@Override
	public void dispose(ColumnViewer viewer, ViewerColumn column) {
		super.dispose(viewer, column);
	}
}