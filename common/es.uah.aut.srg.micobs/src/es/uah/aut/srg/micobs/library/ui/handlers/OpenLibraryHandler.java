/*******************************************************************************
 * Copyright (c) 2013-2015 UAH Space Research Group.
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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.modeling.util.file.FileConverter;

/**
 * Abstract class that implements the basic functions to open a library editors.
 * This class must be sub-classed for every type of library.
 *
 */
public abstract class OpenLibraryHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		

		IFileStore fileStore;
		try {
			fileStore = EFS.getLocalFileSystem().fromLocalFile(FileConverter.platformPluginURItoFile(getLibraryPlatformURI()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			throw new ExecutionException(e.getMessage());
		}

	    try {
	        IDE.openEditorOnFileStore( page, fileStore );
	    } catch ( PartInitException e ) {
	    	throw new ExecutionException(e.getMessage());
	    }
		return null;
	}

	/**
	 * Returns the URI of the library file. This method has to be implemented
	 * for every type of library by the corresponding subclass.
	 * 
	 * If an error occurs when accessing the library, the method will throw
	 * a {@link LibraryManagerException}.
	 * 
	 * @return the URI of the library file.
	 */
	protected abstract URI getLibraryPlatformURI() throws LibraryManagerException;

}

