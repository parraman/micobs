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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.adapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.decoder.ILibraryDecoder;
import es.uah.aut.srg.micobs.library.decoder.impl.LibraryDecoder;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;
import es.uah.aut.srg.micobs.library.encoder.impl.LibraryEncoder;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryFactory;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.provider.mespctoolItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.provider.mesposswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.provider.mesposswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.provider.mesppswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.provider.mespswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.provider.mespswpItemProviderAdapterFactory;

/**
 * Adapter class for the MESP Library. This library instantiates the library
 * encoder and decoder. In this case, the library encoder and the decoder
 * prevent from saving and loading any models related to the different
 * construction tools. This is done because the construction tools are
 * installed by the different plugins and thus they cannot be integrated
 * in the system by using regular descriptors.
 *
 */
public class MESPLibraryAdapter extends LibraryAdapter {

	protected static ILibraryDecoder libraryDecoder;
	
	protected static ILibraryEncoder libraryEncoder;
	
	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return MESPLibraryManager.getLibraryManager();
	}
	
	@Override
	protected ILibraryDecoder getLibraryDecoder() throws LibraryManagerException {
		if (libraryDecoder == null)
		{
			libraryDecoder = new LibraryDecoder(
					MESPLibraryManager.getLibraryManager(),
					new EClass[] {
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemOSSwInterface(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemOSSwPackage(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemPlatformSwPackage(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemSwInterface(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemDriverSwPackage(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemSwPackage(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemAbstractSwPackage(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemConstructionTool(),
							mesplibraryPackage.eINSTANCE.getMMESPVersionedItemDeployment()
						},
						new EClass[] {
							mesposswiPackage.eINSTANCE.getMOSSwInterface(),
							mesposswpPackage.eINSTANCE.getMOSSwPackage(),
							mesppswpPackage.eINSTANCE.getMPlatformSwPackage(),
							mespswiPackage.eINSTANCE.getMSwInterface(),
							mespswpPackage.eINSTANCE.getMDriverSwPackage(),
							mespswpPackage.eINSTANCE.getMSwPackage(),
							mespswpPackage.eINSTANCE.getMAbstractSwPackage(),
							mespctoolPackage.eINSTANCE.getMConstructionTool(),
							mespdepPackage.eINSTANCE.getMMESPDeployment()
						},
						new AdapterFactory[] {
							new mesposswiItemProviderAdapterFactory(),
							new mesposswpItemProviderAdapterFactory(),
							new mesppswpItemProviderAdapterFactory(),
							new mespswiItemProviderAdapterFactory(),
							new mespswpItemProviderAdapterFactory(),
							new mespswpItemProviderAdapterFactory(),
							new mespswpItemProviderAdapterFactory(),
							new mespctoolItemProviderAdapterFactory(),
							new mespdepItemProviderAdapterFactory()
						},
						mesplibraryPackage.eINSTANCE.getMMESPPackage(),
						mesplibraryFactory.eINSTANCE,
						new String[] {
							"mesp_osswi",
							"mesp_osswp",
							"mesp_pswp",
							"mesp_swi",
							"mesp_swp",
							"mesp_swp",
							"mesp_swp",
							"mesp_ctool",
							"mesp_dep"
						});
		}
		return libraryDecoder;
	}

	@Override
	protected ILibraryEncoder getLibraryEncoder()
			throws LibraryManagerException {
		if (libraryEncoder == null)
		{
			libraryEncoder = new LibraryEncoder() {

				@Override
				public List<MDescriptor> getDescriptors(
						MCommonPackageVersionedItem versionedItem)
						throws LibraryManagerException {
					
					if (versionedItem instanceof MMESPVersionedItemConstructionTool)
					{
						return new ArrayList<MDescriptor>();
					}
					return super.getDescriptors(versionedItem);
				}

				@Override
				public List<MDescriptor> getDescriptors(MCommonPackageItem item)
						throws LibraryManagerException {
					
					if (item instanceof MMESPItemConstructionTool)
					{
						return new ArrayList<MDescriptor>();
					}
					
					return super.getDescriptors(item);
				}
				
				
				
			};
		}
		return libraryEncoder;
	}

}
