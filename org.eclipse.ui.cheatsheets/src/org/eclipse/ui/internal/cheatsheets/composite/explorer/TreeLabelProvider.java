/*******************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.internal.cheatsheets.composite.explorer;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.cheatsheets.CheatSheetPlugin;
import org.eclipse.ui.internal.cheatsheets.composite.model.TaskStateUtilities;
import org.eclipse.ui.internal.cheatsheets.composite.parser.ICompositeCheatsheetTags;
import org.eclipse.ui.internal.cheatsheets.composite.views.TaskEditorManager;
import org.eclipse.ui.internal.provisional.cheatsheets.ICompositeCheatSheetTask;
import org.eclipse.ui.internal.provisional.cheatsheets.ITaskGroup;
import org.osgi.framework.Bundle;

public class TreeLabelProvider extends LabelProvider {

	private static int BLOCKED = -1;
	private Image defaultImage = null; // Image for tasks with null kind
	
	/*
	 * A set of related images
	 */
	private class ImageSet {
		// Use a map rather than array so the nuber of icons is not hard coded
		Map images = new HashMap();
		
		public void put(int index, Image image) {
			images.put(Integer.toString(index), image);
		}
		
		public Image getImage(int index) {
			return (Image)images.get(Integer.toString(index));
		}
		
		void dispose() {
			for (Iterator iter = images.values().iterator(); iter.hasNext(); ) {
				Image nextImage = (Image)iter.next();
				nextImage.dispose();
			}		
		}
	}
	
	private Map imageMap = null; // each entry is an ImageSet
		
	public TreeLabelProvider() {
		imageMap = new HashMap();
	}

	public String getText(Object obj) {
		String result;
		if (obj instanceof ICompositeCheatSheetTask) {
			result =  ((ICompositeCheatSheetTask) obj).getName();
		} else {
		    result =  obj.toString();
		}
		if (result == null) {
			result = ""; //$NON-NLS-1$
		}
		return result;
	}

	public Image getImage(Object obj) {
		if (obj instanceof ICompositeCheatSheetTask) {
			ICompositeCheatSheetTask task = (ICompositeCheatSheetTask) obj;
			return lookupImage(task.getKind(), task.getState(), TaskStateUtilities.isBlocked(task));		
		}
		return super.getImage(obj);
	}

	public Image lookupImage(String kind, int state, boolean isBlocked) {
		ImageSet images = (ImageSet) imageMap.get(kind);
		if (images == null) {
			images = createImages(kind);
			imageMap.put(kind, images);
		}
		if (isBlocked) {
			return images.getImage(BLOCKED);
		}
	    return images.getImage(state);
	}

	/**
	 * Create a set of images for a task which may be [redefined.
	 * @param kind
	 * @return
	 */
	private ImageSet createImages(String kind) {
		ImageSet images = new ImageSet();
		ImageDescriptor desc;
		desc = getPredefinedImageDescriptor(kind, true);
        if (desc == null) {
		    desc = TaskEditorManager.getInstance().getImageDescriptor(kind);
        }
		if (desc != null) {		
			Image baseImage = desc.createImage();
			images.put(ICompositeCheatSheetTask.NOT_STARTED, baseImage);
			
			//---Customized to disable ticks and stuff from the icons ---
			images.put(ICompositeCheatSheetTask.IN_PROGRESS,desc.createImage());
			images.put(ICompositeCheatSheetTask.SKIPPED,desc.createImage());
			images.put(ICompositeCheatSheetTask.COMPLETED,desc.createImage());
			images.put(BLOCKED, desc.createImage());
			
//			createImageWithOverlay(ICompositeCheatSheetTask.IN_PROGRESS, 
//		               "$nl$/icons/ovr16/task_in_progress.gif",  //$NON-NLS-1$
//		               images, 
//		               desc);
//			createImageWithOverlay(ICompositeCheatSheetTask.SKIPPED, 
//		               "$nl$/icons/ovr16/task_skipped.gif",  //$NON-NLS-1$
//		               images, 
//		               desc);
//			createDisabledImage(kind, BLOCKED, 
//		               images, 
//		               baseImage);
//			createImageWithOverlay(ICompositeCheatSheetTask.COMPLETED, 
//		               "$nl$/icons/ovr16/task_complete.gif",  //$NON-NLS-1$
//		               images, 
//		               desc);
			
		}
		return images;
	}

	private ImageDescriptor getPredefinedImageDescriptor(String kind, boolean isEnabled) {
		String filename;
		if (ICompositeCheatsheetTags.CHEATSHEET_TASK_KIND.equals(kind)) {
			filename = "cheatsheet_task.gif"; //$NON-NLS-1$
		} else if (ITaskGroup.SET.equals(kind)) {
			filename = "task_set.gif"; //$NON-NLS-1$
		} else if (ITaskGroup.CHOICE.equals(kind)) {
			filename = "task_choice.gif"; //$NON-NLS-1$
		} else if (ITaskGroup.SEQUENCE.equals(kind)) {
			filename = "task_sequence.gif"; //$NON-NLS-1$
		} else {
			return null;
		}
		String iconPath =  "$nl$/icons/"; //$NON-NLS-1$
		if (isEnabled) { 
			iconPath += CheatSheetPlugin.T_OBJ;
		} else {
			iconPath += CheatSheetPlugin.T_DLCL;
		}
		iconPath += filename;
		return createImageDescriptor(iconPath);
	}

//	private void createImageWithOverlay(int state, String imagePath, ImageSet images, ImageDescriptor baseDescriptor) {
//		ImageDescriptor descriptor = createImageDescriptor(imagePath); 
//		OverlayIcon icon = new OverlayIcon(baseDescriptor, new ImageDescriptor[][] {
//				{}, { descriptor } });
//		images.put(state, icon.createImage());
//	}
//	
//	private void createDisabledImage(String kind, int state, ImageSet images, Image baseImage) {
//		// The four images for task_set, task_sequence, task_choice and cheatsheet_task can be found
//		// in icons/dlcl16. 
//		//  extend the extension point to allow disabled images to be specified.
//		//if 
//
//		ImageDescriptor desc = getPredefinedImageDescriptor(kind, false);
//		Image disabledImage;
//		if (desc != null) {
//			disabledImage = desc.createImage();
//		} else {
//		    disabledImage = createGrayedImage(baseImage);
//		}
//		images.put(state, disabledImage);		
//	}

//	private Image createGrayedImage(Image image) {
//		return new Image(image.getDevice(), image, SWT.IMAGE_DISABLE);
//	}

	private ImageDescriptor createImageDescriptor(String relativePath) {
		Bundle bundle = CheatSheetPlugin.getPlugin().getBundle();
		URL url = FileLocator.find(bundle, new Path(relativePath),null);
		if (url == null) return null;
		try {
			url = FileLocator.resolve(url);
			return ImageDescriptor.createFromURL(url);
		} catch (IOException e) {
			return null;
		}
	}

	public void dispose() {
		if (imageMap != null) {
			for (Iterator iter = imageMap.values().iterator(); iter.hasNext(); ) {
			    ImageSet nextImages = (ImageSet)iter.next();
			    nextImages.dispose();
			}
			imageMap = null;
		}
		if (defaultImage != null) {
			defaultImage.dispose();
			defaultImage = null;
		}
	}
	
}
