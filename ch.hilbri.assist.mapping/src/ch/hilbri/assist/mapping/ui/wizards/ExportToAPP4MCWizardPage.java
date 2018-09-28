package ch.hilbri.assist.mapping.ui.wizards;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.model.MappingResult;

public class ExportToAPP4MCWizardPage extends WizardPage {

    private Button btnBrowseExistingModel;

    enum ExportMode {
        CREATE_NEW_MODEL, 
        ADD_TO_EXISTING_MODEL
    }

    private ExportMode exportMode;

    private Text txtExistingModelFileName;
    private Text txtNewModelFileName;
    private Combo cbxMultiPageEditors;
    private Combo cbxSolutions;

    private MultiPageEditor selectedMultiPageEditor;
    private MappingResult selectedMappingResult;
    private Button btnBrowseNewModel;

    /**
     * Create the wizard.
     */
    public ExportToAPP4MCWizardPage() {
        super("wizardPage");
        setPageComplete(false);
        setTitle("Export to APP4MC Model");
        setDescription("This wizard exports a solution to an APP4MC model");
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        setControl(container);
        container.setLayout(new GridLayout(1, false));

        Group grpAssistSolution = new Group(container, SWT.NONE);
        grpAssistSolution.setText("ASSIST Model");
        grpAssistSolution.setLayout(new GridLayout(2, false));
        grpAssistSolution.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblSpecification = new Label(grpAssistSolution, SWT.NONE);
        lblSpecification.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblSpecification.setBounds(0, 0, 55, 15);
        lblSpecification.setText("Specification:");

        cbxMultiPageEditors = new Combo(grpAssistSolution, SWT.READ_ONLY);
        cbxMultiPageEditors.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                /* When we select a new editor, we have to check for possible solutions */
                int selectionIdx = cbxMultiPageEditors.getSelectionIndex();

                if (selectionIdx >= 0) {
                
                    /* Which editors are available? */
                    IEditorReference[] allEditors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
                    List<MultiPageEditor> allMappingEditors = new ArrayList<MultiPageEditor>();
                    for (IEditorReference editorRef : allEditors) {
                        IEditorPart editor = editorRef.getEditor(true);
                        if (editor instanceof MultiPageEditor)
                            allMappingEditors.add((MultiPageEditor) editor);
                    }

                    /* Get the selected MultiPageEditor */
                    selectedMultiPageEditor = allMappingEditors.get(selectionIdx);

                    /* Remove the old solutions */
                    cbxSolutions.deselectAll();
                    cbxSolutions.removeAll();

                    /* Retrieve the new list of solutions */
                    if (selectedMultiPageEditor.getMappingResultsList() != null)
                        for (MappingResult r : selectedMultiPageEditor.getMappingResultsList())
                            cbxSolutions.add(r.getName());

                    /* Preselect the first solution */
                    if (cbxSolutions.getItemCount() > 0) {
                        cbxSolutions.select(0);
                        cbxSolutions.notifyListeners(SWT.Selection, new Event());
                    }

                    /* Check if we can finish the wizard now */
                    checkPageComplete();
                }
            }
        });
        cbxMultiPageEditors.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        /*
         * Preload the combobox with open and available editors - which should contain
         * solutions
         */
        IEditorReference[] allEditors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
        List<MultiPageEditor> allMappingEditors = new ArrayList<MultiPageEditor>();
        for (IEditorReference e : allEditors) {
            IEditorPart editor = e.getEditor(true);
            if (editor instanceof MultiPageEditor)
                allMappingEditors.add((MultiPageEditor) editor);
        }
        
        for (MultiPageEditor mpe : allMappingEditors) {
            FileEditorInput fileInput = (FileEditorInput) mpe.getEditorInput();
            IProject project = fileInput.getFile().getProject();
            IPath relPath = fileInput.getFile().getProjectRelativePath();
            cbxMultiPageEditors.add(project.getName() + "/" + relPath.toString());
        }
       
        Label lblSolution = new Label(grpAssistSolution, SWT.NONE);
        lblSolution.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblSolution.setBounds(0, 0, 55, 15);
        lblSolution.setText("Solution:");

        cbxSolutions = new Combo(grpAssistSolution, SWT.READ_ONLY);
        cbxSolutions.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                selectedMappingResult = selectedMultiPageEditor.getMappingResultsList()
                        .get(cbxSolutions.getSelectionIndex());
                checkPageComplete();
            }
        });
        cbxSolutions.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Group grpExportMode = new Group(container, SWT.NONE);
        GridLayout gl_grpExportMode = new GridLayout(3, false);
        gl_grpExportMode.marginLeft = 5;
        grpExportMode.setLayout(gl_grpExportMode);
        grpExportMode.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpExportMode.setText("Export Mode");

        Button btnCreateNewModel = new Button(grpExportMode, SWT.RADIO);
        btnCreateNewModel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                txtExistingModelFileName.setEnabled(false);
                btnBrowseExistingModel.setEnabled(false);
                txtNewModelFileName.setEnabled(true);
                btnBrowseNewModel.setEnabled(true);
                exportMode = ExportMode.CREATE_NEW_MODEL;
                checkPageComplete();
            }
        });
        btnCreateNewModel.setSelection(true);
        btnCreateNewModel.setText("Create new APP4MC Model:");
        
                txtNewModelFileName = new Text(grpExportMode, SWT.BORDER);
                txtNewModelFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
                txtNewModelFileName.addModifyListener(new ModifyListener() {
                    public void modifyText(ModifyEvent e) {
                        checkPageComplete();
                    }
                });
        
                btnBrowseNewModel = new Button(grpExportMode, SWT.NONE);
                btnBrowseNewModel.addSelectionListener(new SelectionAdapter() {
                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        FileDialog dialog = new FileDialog(getShell(), SWT.OPEN | SWT.SHEET);
                        dialog.setFilterExtensions(new String[] { "*.amxmi" });
                        String file = dialog.open();
                        if (file != null) {
                            file = file.trim();
                            if (file.length() > 0) {
                                if (!FilenameUtils.isExtension(file, "amxmi")) file += ".amxmi";    
                                txtNewModelFileName.setText(file);
                            }
                        }
                    }
                });
                btnBrowseNewModel.setText("...");

        Button btnAddToExistingModel = new Button(grpExportMode, SWT.RADIO);
        btnAddToExistingModel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                txtExistingModelFileName.setEnabled(true);
                btnBrowseExistingModel.setEnabled(true);
                txtNewModelFileName.setEnabled(false);
                btnBrowseNewModel.setEnabled(false);
                exportMode = ExportMode.ADD_TO_EXISTING_MODEL;
                checkPageComplete();
            }
        });
        btnAddToExistingModel.setText("Add to existing APP4MC Model:");

        txtExistingModelFileName = new Text(grpExportMode, SWT.BORDER);
        txtExistingModelFileName.setEnabled(false);
        txtExistingModelFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        btnBrowseExistingModel = new Button(grpExportMode, SWT.NONE);
        btnBrowseExistingModel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                FileDialog dialog = new FileDialog(getShell(), SWT.OPEN | SWT.SHEET);
                dialog.setFilterExtensions(new String[] { "*.amxmi" });
                String file = dialog.open();
                if (file != null) {
                    file = file.trim();
                    if (file.length() > 0) {
                        if (!FilenameUtils.isExtension(file, "amxmi")) file += ".amxmi";    
                        txtExistingModelFileName.setText(file);
                    }
                }
            }
        });
        btnBrowseExistingModel.setEnabled(false);
        btnBrowseExistingModel.setText("...");

        // Finally, all UI widgets are loaded 
        // If we have an editor, the preselect it
        
        if (cbxMultiPageEditors.getItemCount() > 0) {
            cbxMultiPageEditors.select(0);
            cbxMultiPageEditors.notifyListeners(SWT.Selection, new Event());
        }

        
    }

    private void checkPageComplete() {

        /* If no multipage editor is selected, we are not complete */
        if (cbxMultiPageEditors.getSelectionIndex() == -1) {
            setPageComplete(false);
            return;
        }

        /* If no solution is selected, we are not complete */
        if (cbxSolutions.getSelectionIndex() == -1) {
            setPageComplete(false);
            return;
        }

        /*
         * If we want to export based on an existing model, we need to have a filename
         */
        if (exportMode == ExportMode.ADD_TO_EXISTING_MODEL) {

            if (txtExistingModelFileName.getText().length() == 0) {
                setPageComplete(false);
                return;
            }

            File file = new File(txtExistingModelFileName.getText());
            if (!file.exists() || file.isDirectory()) {
                setPageComplete(false);
                return;
            }
        }

        /* We need to have a filename to export to */
        if (txtNewModelFileName.getText().length() == 0) {
            setPageComplete(false);
            return;
        }

        /* Apparently, all other checks were passed, so we are complete! */
        setPageComplete(true);
    }

    public MappingResult getSelectedMappingResult() {
        return selectedMappingResult;
    }

    public String getSelectedAmaltheaTemplate() {
        if (exportMode == ExportMode.CREATE_NEW_MODEL)
            return null;
        else
            return txtExistingModelFileName.getText();
    }

    public String getSelectedExportFilename() {
        return txtNewModelFileName.getText();
    }

}
