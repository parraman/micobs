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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.ui;

import org.eclipse.emf.common.notify.AdapterFactory;

import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.handlers.UploadToLibraryHandler;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswi.provider.mesposswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.provider.mesposswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesppswp.provider.mesppswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.provider.mespswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.provider.mespswpItemProviderAdapterFactory;

/**
 * Class that implements the handler for upload a model file to
 * the MESP Library.
 *
 */
public class UploadToMESPLibraryHandler extends UploadToLibraryHandler {

	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return MESPLibraryManager.getLibraryManager();
	}

	@Override
	protected boolean checkPackageFile(MCommonPackageFile packageFile) {
		return 	((packageFile instanceof MMESPOSSWPPackageFile) ||
				 (packageFile instanceof MMESPOSSWIPackageFile) ||
				 (packageFile instanceof MMESPPSWPPackageFile) ||
				 (packageFile instanceof MMESPSWIPackageFile) ||
				 (packageFile instanceof MMESPSWPPackageFile) ||
				 (packageFile instanceof MMESPDEPPackageFile));
	}

	@Override
	protected AdapterFactory getModelAdapterFactory(
			MCommonPackageFile packageFile) {
		if (packageFile instanceof MMESPOSSWPPackageFile)
		{
			return new mesposswpItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPOSSWIPackageFile)
		{
			return new mesposswiItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPPSWPPackageFile)
		{
			return new mesppswpItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPSWIPackageFile)
		{
			return new mespswiItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPSWPPackageFile)
		{
			return new mespswpItemProviderAdapterFactory();
		}
		else
		{
			return new mespdepItemProviderAdapterFactory();
		}
	}
}
