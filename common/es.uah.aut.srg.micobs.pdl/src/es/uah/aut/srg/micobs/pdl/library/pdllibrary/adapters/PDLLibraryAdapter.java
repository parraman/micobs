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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.adapters;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.decoder.ILibraryDecoder;
import es.uah.aut.srg.micobs.library.decoder.impl.LibraryDecoder;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;
import es.uah.aut.srg.micobs.library.encoder.impl.LibraryEncoder;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryFactory;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.pdl.provider.pdlItemProviderAdapterFactory;

/**
 * Adapter class for the Platform Library. This library instantiates the library
 * encoder and decoder.
 *
 */
public class PDLLibraryAdapter extends LibraryAdapter {

	protected static ILibraryDecoder libraryDecoder;
	
	protected static ILibraryEncoder libraryEncoder;
	
	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return PDLLibraryManager.getLibraryManager();
	}
	
	@Override
	protected ILibraryDecoder getLibraryDecoder() throws LibraryManagerException {
		if (libraryDecoder == null)
		{
			AdapterFactory adapterFactory = new pdlItemProviderAdapterFactory();
			String extension = "micobs_pdl";
			
			libraryDecoder = new LibraryDecoder(
					PDLLibraryManager.getLibraryManager(),
					new EClass[] {
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemArchitecture(),
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemBoard(),
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemDevice(),
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemMicroprocessor(),
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemCompiler(),
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemOperatingSystem(),
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemOperatingSystemAPI(),
							pdllibraryPackage.eINSTANCE.getMPDLVersionedItemPlatform()
						},
						new EClass[] {
							pdlPackage.eINSTANCE.getMArchitecture(),
							pdlPackage.eINSTANCE.getMBoard(),
							pdlPackage.eINSTANCE.getMDevice(),
							pdlPackage.eINSTANCE.getMMicroprocessor(),
							pdlPackage.eINSTANCE.getMCompiler(),
							pdlPackage.eINSTANCE.getMOperatingSystem(),
							pdlPackage.eINSTANCE.getMOperatingSystemAPI(),
							pdlPackage.eINSTANCE.getMPlatform()
						},
						new AdapterFactory[] {
							adapterFactory,
							adapterFactory,
							adapterFactory,
							adapterFactory,
							adapterFactory,
							adapterFactory,
							adapterFactory,
							adapterFactory
						},
						pdllibraryPackage.eINSTANCE.getMPDLPackage(),
						pdllibraryFactory.eINSTANCE,
						new String[] {
							extension,
							extension,
							extension,
							extension,
							extension,
							extension,
							extension,
							extension
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
