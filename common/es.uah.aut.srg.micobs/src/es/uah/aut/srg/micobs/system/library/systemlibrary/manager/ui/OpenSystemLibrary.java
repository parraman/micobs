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
package es.uah.aut.srg.micobs.system.library.systemlibrary.manager.ui;

import org.eclipse.emf.common.util.URI;

import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.handlers.OpenLibraryHandler;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * Class that implements the handler for opening the System Library editor.
 *
 */
public class OpenSystemLibrary extends OpenLibraryHandler {

	@Override
	protected URI getLibraryPlatformURI() throws LibraryManagerException {
		return SystemLibraryManager.getLibraryManager().getLibraryPlatformURI();
	}

}