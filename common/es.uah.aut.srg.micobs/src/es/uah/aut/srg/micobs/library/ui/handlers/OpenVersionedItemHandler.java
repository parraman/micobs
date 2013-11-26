/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.library.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.modeling.util.file.FileConverter;

/**
 * Handler that implements the functionality of opening a model file stored
 * in the library on a new editor. Since this file is stored read-only, the user
 * will not be able to modify it from the editor.
 *
 */
public class OpenVersionedItemHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		
		IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		
		if (selection.getFirstElement() instanceof MCommonPackageVersionedItem)
		{
			MCommonPackageVersionedItem item = (MCommonPackageVersionedItem)selection.getFirstElement();
			
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(FileConverter.platformPluginURItoFile(URI.createURI(item.getLocalModelURI(), true)).toURI());

		    try {
		        IDE.openEditorOnFileStore( page, fileStore );
		    } catch ( PartInitException e ) {
		    	throw new ExecutionException(e.getMessage());
		    }
		}


		return null;
	}

}

