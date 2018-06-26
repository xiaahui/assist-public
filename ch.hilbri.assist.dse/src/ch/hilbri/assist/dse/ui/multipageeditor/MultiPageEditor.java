package ch.hilbri.assist.dse.ui.multipageeditor;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Injector;

import ch.hilbri.assist.dse.dsl.ui.internal.DslActivator;

public class MultiPageEditor extends MultiPageEditorPart {

    /** The text editor used in page 0. */
    private XtextEditor tabEditor;

    /**
     * Creates page 0 of the multi-page editor, which contains a Xtext editor.
     */
    void createPage0() {
        try {
            DslActivator activator = DslActivator.getInstance();
            Injector injector = activator.getInjector("ch.hilbri.assist.dse.dsl.DSEDsl");
            tabEditor = injector.getInstance(XtextEditor.class);
            int index = addPage(tabEditor, getEditorInput());
            setPageText(index, "Specification");
            setPartName(tabEditor.getTitle());

        } catch (PartInitException e) {
            ErrorDialog.openError(getSite().getShell(), "Error creating nested text editor", null, e.getStatus());
        }
    }

    /**
     * Creates the pages of the multi-page editor.
     */
    protected void createPages() {
        createPage0();

        this.setPartName(tabEditor.getTitle());
        this.setActivePage(0);
    }

    /**
     * Saves the multi-page editor's document.
     */
    public void doSave(IProgressMonitor monitor) {
        IEditorPart editor = getEditor(0);
        editor.doSaveAs();
        setPageText(0, editor.getTitle());
        setInput(editor.getEditorInput());
    }

    /**
     * Saves the multi-page editor's document as another file. Also updates the text
     * for page 0's tab, and updates this multi-page editor's input to correspond to
     * the nested editor's.
     */
    public void doSaveAs() {
        IEditorPart editor = getEditor(0);
        editor.doSaveAs();
        setPageText(0, editor.getTitle());
        setInput(editor.getEditorInput());
    }

    public void gotoMarker(IMarker marker) {
        setActivePage(0);
        IDE.gotoMarker(getEditor(0), marker);
    }

    public void showResultsTab() {
//        setActivePage(1);
    }
    
    @Override
    public boolean isSaveAsAllowed() {
        return true;
    }

    public XtextEditor getTabEditor() {
        return tabEditor;
    }
}
