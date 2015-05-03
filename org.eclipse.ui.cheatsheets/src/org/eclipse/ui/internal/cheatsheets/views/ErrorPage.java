/*******************************************************************************
 *  Copyright (c) 2002, 2008 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.internal.cheatsheets.views;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.internal.cheatsheets.CheatSheetPlugin;
import org.eclipse.ui.internal.cheatsheets.ICheatSheetResource;
import org.eclipse.ui.internal.cheatsheets.Messages;


public class ErrorPage extends Page {
	
	/*
	 * Class used to sort status with errors first, then warnings
	 */
	private class StatusSorter {
		private List errors = new ArrayList();
		private List warnings = new ArrayList();
		private List info = new ArrayList();
		
		public StatusSorter(IStatus status) {
			sortStatus(status);
		}
		
		private void sortStatus(IStatus status) {
			if (status.isMultiStatus()) {
				IStatus[] children = status.getChildren();
				for (int i = 0; i< children.length; i++) {
					sortStatus(children[i]);
				}
			} else {
				switch(status.getSeverity()) {
				case IStatus.ERROR:
					errors.add(status);
					break;
				case IStatus.WARNING:
					warnings.add(status);
					break;
				default:
					info.add(status);
				}
			}	
		}
		
		public List getSortedStatus() {
			List result = new ArrayList();
			result.addAll(errors);
			result.addAll(warnings);
			result.addAll(info);
			return result;
		}
	}

	private String message;
	private IStatus status;
	
	public ErrorPage() {
	}

	public ErrorPage(String errorMessage) {
		this.message = errorMessage;
	}
	
	public ErrorPage(IStatus status) {
		this.status = status;
	}

	public void createPart(Composite parent) {
		super.createPart(parent);
		if (status != null) {
			showStatus(status);
		} else {
			String errorString = null;
			if(message == null) {
				errorString = Messages.ERROR_PAGE_MESSAGE;
			} else {
				errorString = message;
			}
			Label errorLabel = toolkit.createLabel(form.getBody(), errorString, SWT.WRAP);
			errorLabel.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB));
		}		
	}

	private void showStatus(IStatus status) {
		StatusSorter sorter = new StatusSorter(status);
		List sorted = sorter.getSortedStatus();
		for (Iterator iter = sorted.iterator(); iter.hasNext();) {
			IStatus nextStatus = (IStatus)iter.next();
			Label imageLabel = toolkit.createLabel(form.getBody(), ""); //$NON-NLS-1$
			imageLabel.setImage(getImage(nextStatus.getSeverity()));
			Label messageLabel = toolkit.createLabel(form.getBody(), nextStatus.getMessage(), SWT.WRAP);
			TableWrapData layoutData = new TableWrapData(TableWrapData.FILL_GRAB);
			layoutData.indent = 10;
			messageLabel.setLayoutData(layoutData);		
		}
	}
	
	/**
     * Return the image for a status message
     *
     * @return
     */
    private Image getImage(int severity) {
        switch(severity) {
        case IStatus.ERROR: 
            return CheatSheetPlugin.getPlugin().getImage(ICheatSheetResource.ERROR);
        case IStatus.WARNING:
            return CheatSheetPlugin.getPlugin().getImage(ICheatSheetResource.WARNING);
        default:
            return CheatSheetPlugin.getPlugin().getImage(ICheatSheetResource.INFORMATION);
        }
    }

	/**
	 * Creates the cheatsheet's title areawhich will consists
	 * of a title and image.
	 *
	 * @param parent the SWT parent for the title area composite
	 */
	protected String getTitle() {
		return Messages.ERROR_LOADING_CHEATSHEET_CONTENT;
	}

	public void initialized() {
		// No initialization required
	}
}
