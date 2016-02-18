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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.adapters;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.decoder.ILibraryDecoder;
import es.uah.aut.srg.micobs.library.decoder.impl.LibraryDecoder;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;
import es.uah.aut.srg.micobs.library.encoder.impl.LibraryEncoder;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.provider.edroomdclassItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.provider.edroomprotItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.EDROOMLibraryManager;

/**
 * Adapter class for the EDROOM Domain Library. This library instantiates the library
 * encoder and decoder. In this case, the library encoder and the decoder
 * prevent from saving and loading any models related to the different
 * domains. This is done because the domains are installed by plug-ins and
 * thus they cannot be integrated in the system by using regular descriptors.
 *
 */
public class EDROOMLibraryAdapter extends LibraryAdapter {

	protected static ILibraryDecoder libraryDecoder;

	protected static ILibraryEncoder libraryEncoder;

	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return EDROOMLibraryManager.getLibraryManager();
	}

	@Override
	protected ILibraryDecoder getLibraryDecoder() throws LibraryManagerException {
		if (libraryDecoder == null)
		{
			libraryDecoder = new LibraryDecoder(
					EDROOMLibraryManager.getLibraryManager(),
					new EClass[] {
							edroomlibraryPackage.eINSTANCE.getEDROOMVersionedItemDataClass(),
							edroomlibraryPackage.eINSTANCE.getEDROOMVersionedItemProtocol()
						},
						new EClass[] {
							edroomdclassPackage.eINSTANCE.getEDROOMDataClass(),
							edroomprotPackage.eINSTANCE.getEDROOMProtocol()
						},
						new AdapterFactory[] {
							new edroomdclassItemProviderAdapterFactory(),
							new edroomprotItemProviderAdapterFactory()
						},
						edroomlibraryPackage.eINSTANCE.getEDROOMPackage(),
						edroomlibraryFactory.eINSTANCE,
						new String[] {
							"edroom_dclass",
							"edroom_prot"
						});
		}
		return libraryDecoder;
	}

	@Override
	protected ILibraryEncoder getLibraryEncoder()
			throws LibraryManagerException {
		if (libraryEncoder == null)
		{
			libraryEncoder = new LibraryEncoder();
		}
		return libraryEncoder;
	}

}
