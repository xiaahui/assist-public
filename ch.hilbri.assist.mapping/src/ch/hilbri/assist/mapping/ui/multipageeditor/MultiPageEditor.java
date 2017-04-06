package ch.hilbri.assist.mapping.ui.multipageeditor;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Injector;

import ch.hilbri.assist.mapping.dsl.ui.internal.DslActivator;
import ch.hilbri.assist.mapping.ui.infosheet.InfoSheetView;
import ch.hilbri.assist.mapping.ui.metrics.MetricsView;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.ResultsView;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

/**
 * A multi-page editor. This editor has 2 pages:
 * <ul>
 * <li>page 0 contains a nested Xtext editor.
 * <li>page 1 shows a more detailed result (new form)
 * <li>page 2 shows the results of the mapping process as a tree view
 * </ul>
 */
public class MultiPageEditor extends MultiPageEditorPart implements	IResourceChangeListener {

	/** The text editor used in page 0. */
	private XtextEditor editor;

	/** View showing more detailed results */
	private ResultsView detailedResultsView;
	
	/**
	 * Creates a multi-page editor.
	 */
	public MultiPageEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);

	}

	@Override
	protected int getPageCount() {
		return super.getPageCount();
	}


	
	/**
	 * Creates page 0 of the multi-page editor, which contains a Xtext editor.
	 */
	void createPage0() {
		try {
			DslActivator activator = DslActivator.getInstance();
			Injector injector = activator.getInjector("ch.hilbri.assist.mapping.dsl.MappingDSL");
			editor = injector.getInstance(XtextEditor.class);
			int index = addPage(editor, getEditorInput());
			setPageText(index, "Specification");
			setPartName(editor.getTitle());

		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),	"Error creating nested text editor", null, e.getStatus());
		}
	}

	/**
	 * Creates page 2 of the multi-page editor, which shows the resultview.
	 */

	void createPage1() {
		Composite composite = new Composite(this.getContainer(), SWT.NULL);

		detailedResultsView = new ResultsView();
		detailedResultsView.createPartControl(composite);
		detailedResultsView.setEditor(this);
		int index = addPage(composite);
		setPageText(index, "Results");
	}

	/**
	 * Returns the Xtexteditor used in page 0
	 * 
	 * @return XtextEditor
	 */
	public XtextEditor getXtextEditor() {
		return editor;
	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage0();
		createPage1();

		openInfoSheetView();

		openMetricView();

		this.setPartName(editor.getTitle());
		this.setActivePage(0);
		
		// We have to get notified if the editor lost focus - maybe
		// the user switched to a java file
		// Now we have to clear the metrics view 
		editor.getSite().getPage().addPartListener(new IPartListener2()
        {
           @Override
           public void partActivated(IWorkbenchPartReference partRef) {
           }
           
           @Override
           public void partBroughtToTop(IWorkbenchPartReference partRef) {
           }
           
           @Override
           public void partClosed(IWorkbenchPartReference partRef) {
           }
           
           @Override
           public void partDeactivated(IWorkbenchPartReference partRef) {
        	}

           @Override
           public void partOpened(IWorkbenchPartReference partRef) {
           }
           
           @Override
           public void partHidden(IWorkbenchPartReference partRef) {
        	   sendEditorLostFocus();
           }
           
           @Override
           public void partVisible(IWorkbenchPartReference partRef) {
        	   sendModelToContentProviders();
           }
           
           @Override
           public void partInputChanged(IWorkbenchPartReference partRef) {}
       }); 
	}

	/**
	 * Opens the Metric Table View at the bottom in case there is none
	 */
	private void openMetricView() {
		Object objApp = PlatformUI.getWorkbench().getService(MApplication.class);
		Object objModel = PlatformUI.getWorkbench().getService(EModelService.class);
		
		if (objApp instanceof MApplication && objModel instanceof EModelService) {
			MApplication application = (MApplication) objApp;
			EModelService modelService = (EModelService) objModel;
//			Helpers.addViewToBottomfield(
//					"ch.hilbri.assist.mapping.metrictable",
//					"Evaluation Metrics",
//					"bundleclass://ch.hilbri.assist.mapping/ch.hilbri.assist.mapping.ui.metrics.MetricsView",
//					application, modelService, true,
//					"platform:/plugin/ch.hilbri.assist.mapping/icons/generic-file.gif"
//					);
		}
		
	}

	/**
	 * Opens the Info Sheet View at the right site in case there is none
	 */
	private void openInfoSheetView() {
		Object objApp = PlatformUI.getWorkbench().getService(MApplication.class);
		Object objModel = PlatformUI.getWorkbench().getService(EModelService.class);
		if (objApp instanceof MApplication && objModel instanceof EModelService) {
			MApplication application = (MApplication) objApp;
			EModelService modelService = (EModelService) objModel;
////			Helpers.addViewToInfofield(
//					"ch.hilbri.assist.mapping.infosheet",
//					"Information",
//					"bundleclass://ch.hilbri.assist.mapping/ch.hilbri.assist.mapping.ui.infosheet.InfoSheetView",
//					application, modelService, true);
		}
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelection selection = window.getSelectionService().getSelection("org.eclipse.ui.navigator.ProjectExplorer");
		
		if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
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

			IProject project = resource.getProject();
			IFolder metricFolder = project.getFolder("." + project.getName() + ".metrics");
			
			if (metricFolder.exists()) {
				try {
					metricFolder.delete(true, null);
				} catch (CoreException e1) {
					e1.printStackTrace();
					return;
				}
			}
		}

		notfityMetricTable();

		super.dispose();
	}

	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the
	 * text for page 0's tab, and updates this multi-page editor's input to
	 * correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}

	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		
		super.init(site, editorInput);
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * Does nothing yet.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
	}

	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i < pages.length; i++) {
						if (((FileEditorInput) editor.getEditorInput())
								.getFile().getProject()
								.equals(event.getResource())) {
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart, true);
						}
					}
				}
			});
		}
	}

	public DetailedResultsViewUiModel getDetailedResultViewUiModel() {
		return detailedResultsView.getDetailedResultsViewUiModel();
	}

	public void resetView() {
		detailedResultsView.resetView();
	}

	public void setActiveResultPage() {
		this.setFocus();
		this.setActivePage(1);
	}

	@Override
	public void setFocus() {
		super.setFocus();
		Object objApp = PlatformUI.getWorkbench().getService(MApplication.class);
		Object objModel = PlatformUI.getWorkbench().getService(EModelService.class);
		if (objApp instanceof MApplication && objModel instanceof EModelService) {
			MApplication application = (MApplication) objApp;
			EModelService modelService = (EModelService) objModel;
//			Helpers.addViewToInfofield(
//					"ch.hilbri.assist.mapping.infosheet",
//					"Information",
//					"bundleclass://ch.hilbri.assist.mapping/ch.hilbri.assist.mapping.ui.infosheet.InfoSheetView",
//					application, modelService, true);


//			Helpers.addViewToBottomfield(
//					"ch.hilbri.assist.mapping.metrictable",
//					"Evaluation Metrics",
//					"bundleclass://ch.hilbri.assist.mapping/ch.hilbri.assist.mapping.ui.metrics.MetricsView",
//					application, modelService, true,
//					"platform:/plugin/ch.hilbri.assist.mapping/icons/generic-file.gif"
//					);

		}
		
		sendModelToContentProviders();
	}

	/**
	 * Sends the model to the appropriate views
	 */
	private void sendModelToContentProviders() {
		Object service = PlatformUI.getWorkbench().getService(IEventBroker.class);
		sendInfoViewContentProvider(service);
		sendMetricContentProvider(service);
	}

	/**
	 * Broadcasts an event with the info view content provider of this editor
	 * @param service 
	 * 
	 * @param metricContentProvider
	 */
	private void sendInfoViewContentProvider(Object service) {
		if (service instanceof IEventBroker) {
			((IEventBroker) service).send(InfoSheetView.SET_INFO_VIEW_CONTENT_PROVIDER, this);
		}
	}

	/**
	 * Broadcasts an event with the metric content provider of this editor
	 * @param service 
	 * 
	 * @param metricContentProvider
	 */
	private void sendMetricContentProvider(Object service) {
		if (service instanceof IEventBroker) {
			((IEventBroker) service).send(MetricsView.MSG_CURRENT_EDITOR_SWITCHED, this);
		}
	}
	
	/**
	 * Broadcasts an event (Editor lost focus)
	 * @param service 
	 * 
	 * @param metricContentProvider
	 */
	void sendEditorLostFocus() {
		
		Object service = PlatformUI.getWorkbench().getService(IEventBroker.class);
		if (service instanceof IEventBroker) {
			((IEventBroker) service).send(MetricsView.MSG_CURRENT_EDITOR_LOST_FOCUS, this);
		}
	}

	/**
	 * Broadcasts an event to tell the metric table: this editor is gone
	 */
	private void notfityMetricTable() {
		Object service = PlatformUI.getWorkbench().getService(IEventBroker.class);
		if (service instanceof IEventBroker) {
			((IEventBroker) service).send(MetricsView.MSG_CURRENT_EDITOR_CLOSED, this);
		}
	}
	
	

}
