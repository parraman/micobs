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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.ui;

import org.eclipse.emf.common.notify.AdapterFactory;

import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.handlers.UploadToLibraryHandler;
import es.uah.aut.srg.micobs.pdl.MPDLPackageFile;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.pdl.provider.pdlItemProviderAdapterFactory;

/**
 * Class that implements the handler for upload a model file to
 * the Platform Library.
 *
 */
public class UploadToPDLLibraryHandler extends UploadToLibraryHandler {

	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return PDLLibraryManager.getLibraryManager();
	}

	@Override
	protected boolean checkPackageFile(MCommonPackageFile packageFile) {
		return (packageFile instanceof MPDLPackageFile);
	}

	@Override
	protected AdapterFactory getModelAdapterFactory(
			MCommonPackageFile packageFile) {
		return new pdlItemProviderAdapterFactory();
	}

}
