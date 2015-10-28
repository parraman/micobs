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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.ui;

import org.eclipse.emf.common.notify.AdapterFactory;

import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.handlers.UploadToLibraryHandler;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevcmp.provider.mclevcmpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevdom.provider.mclevdomItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.provider.mclevflatmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile;
import es.uah.aut.srg.micobs.mclev.mcleviface.provider.mclevifaceItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevimap.provider.mclevimapItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.provider.mclevmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevsai.provider.mclevsaiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevslib.provider.mclevslibItemProviderAdapterFactory;

/**
 * Class that implements the handler for upload a model file to
 * the MCLEV Library.
 *
 */
public class UploadToMCLEVLibraryHandler extends UploadToLibraryHandler {

	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return MCLEVLibraryManager.getLibraryManager();
	}

	@Override
	protected boolean checkPackageFile(MCommonPackageFile packageFile) {
		return 	((packageFile instanceof MMCLEVCMPPackageFile) ||
				 (packageFile instanceof MMCLEVDOMPackageFile) ||
				 (packageFile instanceof MMCLEVIFACEPackageFile) ||
				 (packageFile instanceof MMCLEVIMAPPackageFile) ||
				 (packageFile instanceof MMCLEVMCADPackageFile) ||
				 (packageFile instanceof MMCLEVSAIPackageFile) ||
				 (packageFile instanceof MMCLEVSLIBPackageFile) ||
				 (packageFile instanceof MMCLEVFLATMCADPackageFile));
	}

	@Override
	protected AdapterFactory getModelAdapterFactory(
			MCommonPackageFile packageFile) {
		if (packageFile instanceof MMCLEVCMPPackageFile)
		{
			return new mclevcmpItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMCLEVDOMPackageFile)
		{
			return new mclevdomItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMCLEVIFACEPackageFile)
		{
			return new mclevifaceItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMCLEVIMAPPackageFile)
		{
			return new mclevimapItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMCLEVMCADPackageFile)
		{
			return new mclevmcadItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMCLEVSAIPackageFile)
		{
			return new mclevsaiItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMCLEVSLIBPackageFile)
		{
			return new mclevslibItemProviderAdapterFactory();
		}
		else
		{
			return new mclevflatmcadItemProviderAdapterFactory();
		}
	}
}
