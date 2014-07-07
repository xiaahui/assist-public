package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class GotoSolutionDialog extends Dialog {
	private Text text;
	private int solutionNumber;
	private int gotoSolution;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public GotoSolutionDialog(Shell parentShell, int solutionNumber) {
		super(parentShell);
		this.solutionNumber = solutionNumber;
		gotoSolution = solutionNumber;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		Label lblGoToSolution = new Label(container, SWT.NONE);
		lblGoToSolution.setText("Go to Solution:");

		text = new Text(container, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text.widthHint = 87;
		text.setLayoutData(gd_text);

		text.setText(String.valueOf(solutionNumber));
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				try {
					int sol = Integer.parseInt(text.getText());
					gotoSolution = sol - 1;
				} catch (NumberFormatException e1) {
					text.setText(String.valueOf(solutionNumber));
				}
			}
		});

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,	true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(215, 150);
	}

	public int getGotoSolution() {
		return gotoSolution;
	}

}
