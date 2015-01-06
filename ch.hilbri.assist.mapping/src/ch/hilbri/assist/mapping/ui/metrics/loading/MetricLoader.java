package ch.hilbri.assist.mapping.ui.metrics.loading;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import ch.hilbri.assist.application.helpers.ConsoleCommands;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;
import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;

public class MetricLoader {

	static int DEFAULT_WEIGHT = 1;

	public static List<AbstractMetric> loadMetric(ArrayList<AbstractMetric> metricsList, DetailedResultsViewUiModel model) {

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		IWorkspaceRoot fWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

//		ArrayList<ICompilationUnit> sourceList = new ArrayList<ICompilationUnit>();
//
//		MetricProjectContentProvider metricProjectProvider = new MetricProjectContentProvider();
//		IJavaModel workspaceModel = JavaCore.create(fWorkspaceRoot);
//		ListSelectionDialog dialog = new ListSelectionDialog(shell, workspaceModel, metricProjectProvider,
//				new JavaElementLabelProvider(
//						JavaElementLabelProvider.SHOW_DEFAULT),
//				"Select the Metric Projects from which you want to import Metrics:");
//		dialog.setTitle("Project Selection");
//		dialog.setInitialSelections(metricProjectProvider.getElements(workspaceModel));
//
//		if (dialog.open() == Window.OK) {
//
//			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
//			try {
//				progressDialog.run(true, true, new ProjectScanningJob(dialog.getResult(), sourceList));
//			} catch (InvocationTargetException e) {
//				ConsoleCommands.writeErrorLineToConsole("InvocationTargetException while starting project scanner.");
//				e.printStackTrace();
//				return null;
//			} catch (InterruptedException e) {
//				ConsoleCommands.writeErrorLineToConsole("InterruptedException while scanning projects.");
//				e.printStackTrace();
//				return null;
//			}
//			
//			if (progressDialog.getReturnCode() != IStatus.OK) return null;
//			
//		} else {
//			return null;
//		}
//
		List<String> metricPaths = new ArrayList<String>();
//
//		if (sourceList.size() > 0) {
//			/**
//			 * Dialog for choosing the metrics to import
//			 */
//			MetricSourceContentProvider metricSourceProvider = new MetricSourceContentProvider();
//			ListSelectionDialog metricDialog = new ListSelectionDialog(shell, sourceList, metricSourceProvider,	new WorkbenchLabelProvider(), "Select the Metrics you want to import.");
//			metricDialog.setTitle("Metric Selection");
//			metricDialog.setInitialElementSelections(sourceList);
//
//			if (metricDialog.open() == Window.OK) {
//				Object[] selections = metricDialog.getResult();
//				for (Object sel : selections) {
//					if (sel instanceof ICompilationUnit) {
//						metricPaths.add((((ICompilationUnit) sel).getResource().getLocation().toOSString()));
//					} else {
//						ConsoleCommands.writeErrorLineToConsole("Unexpected error occured during import of a metric.");
//					}
//				}
//			} else {
//				return null;
//			}
//		} else {
//			MessageDialog metricExistsDialog = new MessageDialog(null,
//					"No Metric found", null,
//					"No Metric was found in the selected projects.",
//					MessageDialog.INFORMATION, new String[] { "OK" }, 2);
//			metricExistsDialog.open();
//			return null;
//		}

		List<AbstractMetric> compiledMetrics = new ArrayList<>();

		metricPaths.add("C:/Users/hilb_ro/runtime-ch.hilbri.assist.application.product/TestProjekt/Compiled-metrics/metrics/");
		
		
		if (metricPaths.size() > 0) {

			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
			try {
				progressDialog.run(true, true, new MetricCompilingRunnable(metricPaths, compiledMetrics, window, model));
			} catch (InvocationTargetException e) {
				ConsoleCommands.writeErrorLineToConsole("InvocationTargetException while starting metric compiler.");
				e.printStackTrace();
				return null;
			} catch (InterruptedException e) {
				ConsoleCommands.writeErrorLineToConsole("InterruptedException while compiling metrics.");
				e.printStackTrace();
				return null;
			}
			if (progressDialog.getReturnCode() != IStatus.OK) {
				return null;
			}
			
		} else return null;
		
		if (compiledMetrics.size() > 0) {

			for (AbstractMetric metric : compiledMetrics) {
				if (metric != null) {
					boolean unused = true;
					int position = 0;
					for (; position < metricsList.size(); position++) {
						AbstractMetric tmp = metricsList.get(position);
						if (metric.getName() == tmp.getName()) {
							unused = false;
							break;
						}
					}
					metric.setBuiltIn(false);
					
					if (unused) {
						metricsList.add(metric);
						
					} else {
						MessageDialog metricExistsDialog = new MessageDialog(
								null, "Metric \"" + metric.getName()
										+ "\" already exists!", null,
								"Do you want to override it?",
								MessageDialog.QUESTION, new String[] { "Yes",
										"No", }, 1); // No
														// is
														// default
						int result = metricExistsDialog.open();
						if (result == 0) {
							metricsList.set(position, metric);
						} else {
							continue;
						}
					}
				} else {
					ConsoleCommands.writeErrorLineToConsole("Metric is null and can't be imported.");
				}
			}
			return compiledMetrics;
		} else {
			ConsoleCommands.writeErrorLineToConsole("No compiled metrics found.");
		}
		return null;
	}

	
}
