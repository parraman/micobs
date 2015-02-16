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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.ui;

import org.eclipse.emf.common.util.URI;

import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.handlers.OpenLibraryHandler;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;

/**
 * Class that implements the handler for opening the Platform Library editor.
 *
 */
public class OpenPDLLibrary extends OpenLibraryHandler {

	@Override
	protected URI getLibraryPlatformURI() throws LibraryManagerException {
		return PDLLibraryManager.getLibraryManager().getLibraryPlatformURI();
	}

}
