package ch.hilbri.assist.mapping.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;

public class ExportToAPP4MCWizardPage extends WizardPage {
    
    
    private Button btnBrowseExistingModel;
    
    enum ExportTemplateMode { EMPTY_MODEL , EXISTING_MODEL }
    private ExportTemplateMode exportMode;

    private Text txtExportTemplateFileName;
    private Text txtExportToFileName;
    private Combo cbxMultiPageEditors;
    private Combo cbxSolutions;
    
    /**
     * Create the wizard.
     */
    public ExportToAPP4MCWizardPage() {
        super("wizardPage");
        setTitle("Export to APP4MC Model");
        setDescription("This wizard exports a solution to an APP4MC model");
    }

    /**
     * Create contents of the wizard.
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
        
        cbxMultiPageEditors = new Combo(grpAssistSolution, SWT.NONE);
        cbxMultiPageEditors.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        /* Preload the combobox with open and available editors - which should contain solutions */
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
        
        if (cbxMultiPageEditors.getItemCount() > 0)
            cbxMultiPageEditors.select(0);
        
        Label lblSolution = new Label(grpAssistSolution, SWT.NONE);
        lblSolution.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblSolution.setBounds(0, 0, 55, 15);
        lblSolution.setText("Solution:");
        
        cbxSolutions = new Combo(grpAssistSolution, SWT.NONE);
        cbxSolutions.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        Group grpExportMode = new Group(container, SWT.NONE);
        GridLayout gl_grpExportMode = new GridLayout(3, false);
        gl_grpExportMode.marginLeft = 5;
        grpExportMode.setLayout(gl_grpExportMode);
        grpExportMode.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpExportMode.setText("Export Template");
        
        Button btnEmptyModel = new Button(grpExportMode, SWT.RADIO);
        btnEmptyModel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                txtExportTemplateFileName.setEnabled(false);
                btnBrowseExistingModel.setEnabled(false);
                exportMode = ExportTemplateMode.EMPTY_MODEL;
            }
        });
        btnEmptyModel.setSelection(true);
        btnEmptyModel.setText("Use empty APP4MC Model");
        new Label(grpExportMode, SWT.NONE);
        new Label(grpExportMode, SWT.NONE);
        
        Button btnExistingModel = new Button(grpExportMode, SWT.RADIO);
        btnExistingModel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                txtExportTemplateFileName.setEnabled(true);
                btnBrowseExistingModel.setEnabled(true);
                exportMode = ExportTemplateMode.EXISTING_MODEL;
            }
        });
        btnExistingModel.setText("Use existing APP4MC Model");
        
        txtExportTemplateFileName = new Text(grpExportMode, SWT.BORDER);
        txtExportTemplateFileName.setEnabled(false);
        GridData gd_txtExistingModelFileName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_txtExistingModelFileName.horizontalIndent = 10;
        txtExportTemplateFileName.setLayoutData(gd_txtExistingModelFileName);
        
        btnBrowseExistingModel = new Button(grpExportMode, SWT.NONE);
        btnBrowseExistingModel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                FileDialog dialog = new FileDialog(getShell(), SWT.OPEN | SWT.SHEET);
                dialog.setFilterExtensions(new String[] {"*.amxmi"});
                String file = dialog.open();
                if (file != null) {
                    file = file.trim();
                    if (file.length() > 0) {
                        txtExportTemplateFileName.setText(file);
                    }
                }
            }
        });
        btnBrowseExistingModel.setEnabled(false);
        btnBrowseExistingModel.setText("Browse ...");
        
        Group grpAppmcModel = new Group(container, SWT.NONE);
        grpAppmcModel.setLayout(new GridLayout(3, false));
        grpAppmcModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpAppmcModel.setText("APP4MC Model");
        
        Label lblAPP4MCModel = new Label(grpAppmcModel, SWT.NONE);
        lblAPP4MCModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblAPP4MCModel.setText("Filename:");
        
        txtExportToFileName = new Text(grpAppmcModel, SWT.BORDER);
        txtExportToFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        Button btnBrowseAPP4MCFile = new Button(grpAppmcModel, SWT.NONE);
        btnBrowseAPP4MCFile.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                FileDialog dialog = new FileDialog(getShell(), SWT.OPEN | SWT.SHEET);
                dialog.setFilterExtensions(new String[] {"*.amxmi"});
                String file = dialog.open();
                if (file != null) {
                    file = file.trim();
                    if (file.length() > 0) {
                        txtExportToFileName.setText(file);
                    }
                }
            }
        });
        btnBrowseAPP4MCFile.setText("Browse ...");
        
    }
}
