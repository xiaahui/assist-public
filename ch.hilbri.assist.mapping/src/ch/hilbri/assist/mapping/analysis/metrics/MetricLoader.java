package ch.hilbri.assist.mapping.analysis.metrics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.compiler.tool.EclipseCompiler;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.StandardJavaElementContentProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.osgi.framework.Bundle;

import ch.hilbri.assist.application.helpers.ConsoleCommands;
import ch.hilbri.assist.application.helpers.Helpers;
import ch.hilbri.assist.application.helpers.PathProvider;
import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;
import ch.hilbri.assist.result.mapping.AbstractMetric;

/**
 * Static class to handle all loading requests of all metrics in the current
 * workspace
 * 
 * @author Mirko Liebender
 *
 */
public class MetricLoader {

	private static int DEFAULT_WEIGHT = 1;

	public static List<AbstractMetric> loadMetric(ResultsAnalysis metricsList,
			DetailedResultsViewUiModel model) {

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();

		IWorkspaceRoot fWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();

		/**
		 * List for the metrics to be chosen from
		 */
		ArrayList<ICompilationUnit> sourceList = new ArrayList<ICompilationUnit>();

		/**
		 * Dialog for choosing the projects from which metrics will be imported
		 */
		MetricProjectContentProvider metricProjectProvider = new MetricProjectContentProvider();
		IJavaModel workspaceModel = JavaCore.create(fWorkspaceRoot);
		ListSelectionDialog dialog = new ListSelectionDialog(shell,
				workspaceModel, metricProjectProvider,
				new JavaElementLabelProvider(
						JavaElementLabelProvider.SHOW_DEFAULT),
				"Select the Metric Projects from which you want to import Metrics:");
		dialog.setTitle("Project Selection");
		dialog.setInitialSelections(metricProjectProvider
				.getElements(workspaceModel));
		if (dialog.open() == Window.OK) {

			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
					shell);
			try {
				progressDialog.run(true, true,
						new ProjectScanningJob(dialog.getResult(), sourceList));
			} catch (InvocationTargetException e) {
				ConsoleCommands
						.writeErrorLineToConsole("InvocationTargetException while starting project scanner.");
				e.printStackTrace();
				return null;
			} catch (InterruptedException e) {
				ConsoleCommands
						.writeErrorLineToConsole("InterruptedException while scanning projects.");
				e.printStackTrace();
				return null;
			}
			if (progressDialog.getReturnCode() != IStatus.OK) {
				return null;
			}
		} else {
			return null;
		}

		List<String> metricPaths = new ArrayList<String>();

		if (sourceList.size() > 0) {
			/**
			 * Dialog for choosing the metrics to import
			 */
			MetricSourceContentProvider metricSourceProvider = new MetricSourceContentProvider();
			ListSelectionDialog metricDialog = new ListSelectionDialog(shell,
					sourceList, metricSourceProvider,
					new WorkbenchLabelProvider(),
					"Select the Metrics you want to import.");
			metricDialog.setTitle("Metric Selection");
			metricDialog.setInitialElementSelections(sourceList);

			if (metricDialog.open() == Window.OK) {
				Object[] selections = metricDialog.getResult();
				for (Object sel : selections) {
					if (sel instanceof ICompilationUnit) {
						metricPaths.add((((ICompilationUnit) sel).getResource()
								.getLocation().toOSString()));
					} else {
						ConsoleCommands
								.writeErrorLineToConsole("Unexpected error occured during import of a metric.");
					}
				}
			} else {
				return null;
			}
		} else {
			MessageDialog metricExistsDialog = new MessageDialog(null,
					"No Metric found", null,
					"No Metric was found in the selected projects.",
					MessageDialog.INFORMATION, new String[] { "OK" }, 2);
			metricExistsDialog.open();
			return null;
		}

		List<AbstractMetric> compiledMetrics = new ArrayList<>();

		if (metricPaths.size() > 0) {

			IWorkbenchWindow window = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();

			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
					shell);
			try {
				progressDialog.run(true, true, new MetricCompilingRunnable(
						metricPaths, compiledMetrics, window, model));
			} catch (InvocationTargetException e) {
				ConsoleCommands
						.writeErrorLineToConsole("InvocationTargetException while starting metric compiler.");
				e.printStackTrace();
				return null;
			} catch (InterruptedException e) {
				ConsoleCommands
						.writeErrorLineToConsole("InterruptedException while compiling metrics.");
				e.printStackTrace();
				return null;
			}
			if (progressDialog.getReturnCode() != IStatus.OK) {
				return null;
			}
		} else {
			return null;
		}

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
						// ConsoleCommands
						// .writeLineToConsole("Added metric \""
						// + metric.getName() + "\"");
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
							// metricsList.remove(position);
							// metricsList.add(metric);
							// ConsoleCommands
							// .writeLineToConsole("Added metric \""
							// + metric.getName() + "\"");
						} else {
							continue;
						}
					}
				} else {
					ConsoleCommands
							.writeErrorLineToConsole("Metric is null and can't be imported.");
				}

				// ConsoleCommands
				// .writeLineToConsole("Setting up metrictable");
				// initialiseTable();
			}
			return compiledMetrics;
		} else {
			ConsoleCommands
					.writeErrorLineToConsole("No compiled metrics found.");
		}
		return null;
	}

	// ---------------------------classes----------------------------------

	/**
	 * This class filters the Java Projects and returns only the Metric Projects
	 * of a given Workspaceroot.
	 * 
	 */
	private static class MetricProjectContentProvider extends
			StandardJavaElementContentProvider {

		@Override
		public Object[] getElements(Object element) {

			List<Object> filteredProjects = new ArrayList<Object>();

			Object[] unfilteredProjects = super.getElements(element);
			ProjectLoop: for (Object project : unfilteredProjects) {
				if (project instanceof IJavaProject) {
					IJavaProject tmp = (IJavaProject) project;
					IProjectDescription description;
					try {
						description = tmp.getProject().getDescription();
						String[] natures = description.getNatureIds();
						for (String nature : natures) {
							if (nature
									.equals(PathProvider.MAPPING_NATURE_METRICNATURE)) {
								filteredProjects.add(project);
								continue ProjectLoop;
							}
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}

			return filteredProjects.toArray();

		}
	}

	/**
	 * Simple Content Provider to show the metric source files in a
	 * ListSelectionDialog
	 * 
	 * @author Mirko Liebender
	 * 
	 */
	private static class MetricSourceContentProvider extends
			BaseWorkbenchContentProvider {

		@Override
		public Object[] getElements(Object element) {

			List<?> metrics = new ArrayList<Object>();
			if (element instanceof ArrayList<?>) {
				metrics = (ArrayList<?>) element;
			}
			return metrics.toArray();
		}
	}

	/**
	 * This class scans all the chosen projects for metric source files.
	 * 
	 * @author Mirko Liebender
	 * 
	 */
	private static class ProjectScanningJob implements IRunnableWithProgress {

		private Object[] results;
		private ArrayList<ICompilationUnit> sourceList;

		public ProjectScanningJob(Object[] results,
				ArrayList<ICompilationUnit> sourceList) {
			this.results = results;
			this.sourceList = sourceList;

		}

		@Override
		public void run(IProgressMonitor monitor) {
			if (results != null) {
				monitor.beginTask(
						"Scanning Projects for metric source files...",
						results.length);
				// This checks the selected projects for java source files

				for (Object result : results) {
					if (result instanceof IJavaProject) {
						IJavaProject jproject = (IJavaProject) result;
						IPackageFragment[] pkgs;
						try {
							pkgs = jproject.getPackageFragments();
							for (int i = 0; i < pkgs.length; i++) {
								IPackageFragment pkg = pkgs[i];
								ICompilationUnit[] us = pkg
										.getCompilationUnits();
								for (int k = 0; k < us.length; k++) {
									ICompilationUnit source = us[k];

									// Checks if the java file extends
									// AbstracMetric and is thereby a metric
									for (IType type : source.getAllTypes()) {
										String superClass = type
												.getSuperclassName();
										if (superClass != null) {
											if (superClass
													.equals(AbstractMetric.class
															.getSimpleName())) {
												sourceList.add(source);
											}
										}
									}
								}
							}
						} catch (JavaModelException e) {
							ConsoleCommands
									.writeErrorLineToConsole("JavaModelException while scanning project "
											+ jproject.getJavaProject()
													.getElementName()
											+ " for java source files.");
							e.printStackTrace();
						}
					}
					monitor.worked(1);
				}
			}
			monitor.done();
		}
	}

	/**
	 * This class compiles all the chosen metrics.
	 * 
	 * @author Mirko Liebender
	 * 
	 */
	private static class MetricCompilingRunnable implements
			IRunnableWithProgress {

		private List<String> metricPaths;
		private List<AbstractMetric> compiledMetrics;
		private IWorkbenchWindow window;
		private DetailedResultsViewUiModel model;

		public MetricCompilingRunnable(List<String> metricPaths,
				List<AbstractMetric> compiledMetrics, IWorkbenchWindow window,
				DetailedResultsViewUiModel model) {
			this.metricPaths = metricPaths;
			this.compiledMetrics = compiledMetrics;
			this.window = window;
			this.model = model;
		}

		@Override
		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {
			monitor.beginTask("Compiling and importing metrics...",
					metricPaths.size());
			IProject project = null;

			IEditorPart editorPart = model.getEditor();

			if (editorPart != null) {
				IFileEditorInput input = (IFileEditorInput) editorPart
						.getEditorInput();
				IFile file = input.getFile();
				project = file.getProject();
			}

			if (project == null) {
				ISelection selection = window.getSelectionService()
						.getSelection(PathProvider.ECL_PROJECT_EXPLORER);
				if (selection != null && selection.isEmpty() == false
						&& selection instanceof IStructuredSelection) {
					IStructuredSelection ssel = (IStructuredSelection) selection;
					if (ssel.size() > 1)
						return;
					Object obj = ssel.getFirstElement();
					IResource resource;
					if (obj instanceof IResource)
						resource = (IResource) obj;
					else if (!(obj instanceof IAdaptable))
						resource = null;
					else {
						IAdaptable adaptable = (IAdaptable) obj;
						Object adapter = adaptable.getAdapter(IResource.class);
						resource = (IResource) adapter;
					}

					project = resource.getProject();
				}
			}

			if (project != null) {
				// creating hidden folders for metric java and class
				// file

				String hiddenFolderName = "." + project.getName() + ".metrics";

				IFolder metricFolder = project.getFolder(hiddenFolderName);
				if (metricFolder.exists()) {
					try {
						metricFolder.delete(true, null);
					} catch (CoreException e) {
						ConsoleCommands
								.writeErrorToConsole("CoreException while trying to delete the folder for the metric files:"
										+ e.getMessage());
						e.printStackTrace();
						return;
					}
				}

				try {
					metricFolder.create(false, true, null);
				} catch (CoreException e) {
					ConsoleCommands
							.writeErrorToConsole("CoreException while trying to create a folder for the metric files:"
									+ e.getMessage());
					e.printStackTrace();
					return;
				}

				for (String selectedFile : metricPaths) {
					// The following part is responsible for the dynamic
					// compilation of a custom metric and adding it
					// to the metric table inside the result view

					File srcFile = new File(selectedFile);
					BufferedReader reader;
					String src = "";
					try {
						reader = new BufferedReader(new FileReader(srcFile));

						String tmp = reader.readLine();
						while (tmp != null) {
							String packagerPattern = "(\\s*)(package{1})(\\s+)([\\w\\.]+)(\\s*)(;)";
							if (!tmp.matches(packagerPattern)) {
								src += tmp + "\n";
							}
							tmp = reader.readLine();
						}
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

					if (src.length() == 0) {

						ConsoleCommands
								.writeErrorToConsole("An error occured while parsing the metric source file.");
						continue;
					}

					AbstractMetric metric = null;

					String metricName = srcFile.getName()
							.subSequence(0, srcFile.getName().lastIndexOf("."))
							.toString();
					File javaSrcFile = new File(project.getProject()
							.getLocation()
							+ "\\"
							+ hiddenFolderName
							+ "\\"
							+ metricName + ".java");
					try {
						Writer p = new FileWriter(javaSrcFile);
						p.write(src);
						p.close();

						JavaCompiler compiler = new EclipseCompiler(); // ToolProvider.getSystemJavaCompiler();
																		// //
						StandardJavaFileManager fileManager = compiler
								.getStandardFileManager(null, null, null);
						Iterable<? extends JavaFileObject> units;
						units = fileManager.getJavaFileObjectsFromFiles(Arrays
								.asList(javaSrcFile));
						List<String> optionList = new ArrayList<String>();

						// Checks if the eclipse runtime is in debug
						// mode
						// FIXME
						if (Helpers.isInDebugMode) {
							// Nasty workaround, but at least dynamic
							Bundle bundle = org.eclipse.core.runtime.Platform
									.getBundle(PathProvider.MAPPING);
							optionList.addAll(Arrays.asList(
									"-cp",
									bundle.getLocation().substring(
											bundle.getLocation().lastIndexOf(
													"file:/") + 6)
											+ "bin"));
						} else {
							optionList.addAll(Arrays.asList("-cp",
									PathProvider.EXT_JAR_MAPPING));
						}

						StringWriter output = new StringWriter();
						CompilationTask task = compiler.getTask(output,
								fileManager, null, optionList, null, units);
						if (task.call()) {
							ConsoleCommands
									.writeLineToConsole("Compiling metric \""
											+ metricName + "\" successful");
						} else {
							ConsoleCommands
									.writeLineToConsole("Compiling metric \""
											+ metricName + "\" failed\n"
											+ output.toString());
							fileManager.close();
							continue;
						}
						fileManager.close();

						// URL url;
						// url = new
						// URL("file:/C:/Users/mli/rcp_workspace/de.fraunhofer.fokus.precisionpro.mapping.examples/.de.fraunhofer.fokus.precisionpro.mapping.examples.metrics/");
						// URLClassLoader classLoader =
						// URLClassLoader.newInstance(new URL[] {url},
						// getClass().getClassLoader());
						URLClassLoader classLoader = new URLClassLoader(
								new URL[] { javaSrcFile.getAbsoluteFile()
										.getParentFile().toURI().toURL() },
								getClass().getClassLoader());

						Class<? extends AbstractMetric> metricClass = Class
								.forName(metricName, true, classLoader)
								.asSubclass(AbstractMetric.class);

						classLoader.close();
						// ConsoleCommands
						// .writeLineToConsole("Created Class..."
						// + metricClass.getName());
						metric = metricClass.getDeclaredConstructor(int.class)
								.newInstance(DEFAULT_WEIGHT);

					} catch (IOException e) {
						e.printStackTrace();
						ConsoleCommands.writeErrorLineToConsole("IOException:"
								+ e.getMessage());
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("ClassNotFoundException:"
										+ e.getMessage());
					} catch (InstantiationException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("InstantiationException:"
										+ e.getMessage());
					} catch (IllegalAccessException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("IllegalAccessException:"
										+ e.getMessage());
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("IllegalArgumentException:"
										+ e.getMessage());
					} catch (InvocationTargetException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("InvocationTargetException:"
										+ e.getMessage());
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("NoSuchMethodException:"
										+ e.getMessage());
					} catch (SecurityException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("SecurityException"
										+ e.getMessage());
					} catch (ExceptionInInitializerError e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("ExceptionInInitializerError"
										+ e.getMessage());
					} catch (ClassCastException e) {
						e.printStackTrace();
						ConsoleCommands
								.writeErrorLineToConsole("ClassCastException"
										+ e.getMessage());
					}

					javaSrcFile.delete();

					compiledMetrics.add(metric);
					monitor.worked(1);
				}
			} else {
				ConsoleCommands
						.writeErrorToConsole("A critical error occured while trying to import metrics. Couldn't resolve project path. Please try to select the working project and try again.");
				return;
			}
			monitor.done();
		}
	}
}
