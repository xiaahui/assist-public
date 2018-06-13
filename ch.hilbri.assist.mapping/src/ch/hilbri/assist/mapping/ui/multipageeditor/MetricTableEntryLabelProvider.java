package ch.hilbri.assist.mapping.ui.multipageeditor;

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

import ch.hilbri.assist.model.AbstractMetric;

public class MetricTableEntryLabelProvider extends CellLabelProvider {

    private Table tblSelectedMetrics;
    private DetailedResults metricsView;

    /*
     * Stores all remove-buttons; we have to store them, so they can be accessed and
     * disposed, after their parent (entry) has been removed
     */
    private Map<Object, Button> allRemoveButtons = new HashMap<Object, Button>();

    public MetricTableEntryLabelProvider(Table tblSelectedMetrics, DetailedResults metricsView) {
        super();
        this.tblSelectedMetrics = tblSelectedMetrics;
        this.metricsView = metricsView;
    }

    @Override
    public void update(final ViewerCell cell) {

        final AbstractMetric metricTableEntry = (AbstractMetric) cell.getElement();

        switch (cell.getColumnIndex()) {

        case 0:
            cell.setText(String.valueOf(tblSelectedMetrics.indexOf((TableItem) cell.getItem()) + 1));
            break;

        case 1:
            cell.setText(metricTableEntry.getName());
            break;

        case 2:
            if (metricTableEntry.isBuiltIn())
                cell.setText("Built-in");
            else
                cell.setText("Custom");
            break;

        case 3:
            cell.setText(Integer.toString(metricTableEntry.getWeight()));
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
                        MessageDialog metricRemoveDialog = new MessageDialog(null, "Remove Metric", null,
                                "Are you sure you want to remove the Metric \"" + metricTableEntry.getName() + "\"?",
                                MessageDialog.QUESTION, new String[] { "Yes", "No" }, 1);

                        // Check if "Yes" button was selected (index = 0)
                        if (metricRemoveDialog.open() == 0) {
                            metricsView.removeSelectedMetric(metricTableEntry);
                            clearButton(metricTableEntry);
                        }
                    }

                    @Override
                    public void widgetDefaultSelected(SelectionEvent e) {
                        widgetSelected(e);
                    }
                });

                allRemoveButtons.put(cell.getElement(), btnRemove);
            }

            TableEditor editor = new TableEditor(tblSelectedMetrics);
            editor.minimumWidth = 25;
            editor.grabVertical = true;
            editor.setEditor(btnRemove, item, 4);
            editor.layout();

            break;
        }
    }

    public void clearButton(AbstractMetric metric) {
        Button btn = (Button) allRemoveButtons.get(metric);
        if (btn != null)
            btn.dispose();
    }

    public void clearAllButtons() {
        for (Object btn : allRemoveButtons.values())
            ((Button) btn).dispose();

        allRemoveButtons.clear();
    }

}
