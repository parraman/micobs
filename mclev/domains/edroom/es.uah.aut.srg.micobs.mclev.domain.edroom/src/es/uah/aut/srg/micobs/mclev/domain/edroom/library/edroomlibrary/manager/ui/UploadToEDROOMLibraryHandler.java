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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.ui;

import org.eclipse.emf.common.notify.AdapterFactory;

import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.handlers.UploadToLibraryHandler;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.provider.edroomdclassItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.provider.edroomprotItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.EDROOMLibraryManager;

/**
 * Class that implements the handler for upload a model file to
 * the EDROOM Domain Library.
 *
 */
public class UploadToEDROOMLibraryHandler extends UploadToLibraryHandler {

	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return EDROOMLibraryManager.getLibraryManager();
	}

	@Override
	protected boolean checkPackageFile(MCommonPackageFile packageFile) {
		return 	((packageFile instanceof EDROOMDCLASSPackageFile) ||
				 (packageFile instanceof EDROOMPROTPackageFile));
	}

	@Override
	protected AdapterFactory getModelAdapterFactory(
			MCommonPackageFile packageFile) {
		if (packageFile instanceof EDROOMDCLASSPackageFile)
		{
			return new edroomdclassItemProviderAdapterFactory();
		}
		else
		{
			return new edroomprotItemProviderAdapterFactory();
		}
	}
}
