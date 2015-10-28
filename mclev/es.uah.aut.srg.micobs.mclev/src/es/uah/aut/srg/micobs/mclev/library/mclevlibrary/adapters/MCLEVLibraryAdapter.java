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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.adapters;

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
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryFactory;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.provider.mclevcmpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.provider.mclevdomItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.provider.mclevflatmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.mcleviface.provider.mclevifaceItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.provider.mclevimapItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.provider.mclevmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.provider.mclevsaiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.provider.mclevslibItemProviderAdapterFactory;

/**
 * Adapter class for the MCLEV Library. This library instantiates the library
 * encoder and decoder. In this case, the library encoder and the decoder
 * prevent from saving and loading any models related to the different
 * domains. This is done because the domains are installed by plug-ins and
 * thus they cannot be integrated in the system by using regular descriptors.
 *
 */
public class MCLEVLibraryAdapter extends LibraryAdapter {

	protected static ILibraryDecoder libraryDecoder;
	
	protected static ILibraryEncoder libraryEncoder;
	
	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return MCLEVLibraryManager.getLibraryManager();
	}
	
	@Override
	protected ILibraryDecoder getLibraryDecoder() throws LibraryManagerException {
		if (libraryDecoder == null)
		{
			AdapterFactory domItemProviderAdapterFactory = new mclevdomItemProviderAdapterFactory();
			AdapterFactory cmpItemProviderAdapterFactory = new mclevcmpItemProviderAdapterFactory();
			AdapterFactory slibItemProviderAdapterFactory = new mclevslibItemProviderAdapterFactory();
			
			libraryDecoder = new LibraryDecoder(
					MCLEVLibraryManager.getLibraryManager(),
					new EClass[] {
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemIODomain(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemAODomain(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemSAI(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemDriverServiceLibrary(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemServiceLibrary(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemAbstractServiceLibrary(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemInterface(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemInterfaceMapping(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemComponent(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemAbstractComponent(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemMCAD(),
							mclevlibraryPackage.eINSTANCE.getMMCLEVVersionedItemFlatMCAD()
						},
						new EClass[] {
							mclevdomPackage.eINSTANCE.getMIODomain(),
							mclevdomPackage.eINSTANCE.getMAODomain(),
							mclevsaiPackage.eINSTANCE.getMSAI(),
							mclevslibPackage.eINSTANCE.getMDriverServiceLibrary(),
							mclevslibPackage.eINSTANCE.getMServiceLibrary(),
							mclevslibPackage.eINSTANCE.getMAbstractServiceLibrary(),
							mclevifacePackage.eINSTANCE.getMInterface(),
							mclevimapPackage.eINSTANCE.getMInterfaceMapping(),
							mclevcmpPackage.eINSTANCE.getMComponent(),
							mclevcmpPackage.eINSTANCE.getMAbstractComponent(),
							mclevmcadPackage.eINSTANCE.getMMCADeployment(),
							mclevflatmcadPackage.eINSTANCE.getMFlatMCAD()
						},
						new AdapterFactory[] {
							domItemProviderAdapterFactory,
							domItemProviderAdapterFactory,
							new mclevsaiItemProviderAdapterFactory(),
							slibItemProviderAdapterFactory,
							slibItemProviderAdapterFactory,
							slibItemProviderAdapterFactory,
							new mclevifaceItemProviderAdapterFactory(),
							new mclevimapItemProviderAdapterFactory(),
							cmpItemProviderAdapterFactory,
							cmpItemProviderAdapterFactory,
							new mclevmcadItemProviderAdapterFactory(),
							new mclevflatmcadItemProviderAdapterFactory()
						},
						mclevlibraryPackage.eINSTANCE.getMMCLEVPackage(),
						mclevlibraryFactory.eINSTANCE,
						new String[] {
							"mclev_dom",
							"mclev_dom",
							"mclev_sai",
							"mclev_slib",
							"mclev_slib",
							"mclev_slib",
							"mclev_iface",
							"mclev_imap",
							"mclev_cmp",
							"mclev_cmp",
							"mclev_mcad",
							"mclev_flatmcad"
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
					
					if (versionedItem instanceof MMCLEVVersionedItemIODomain ||
						versionedItem instanceof MMCLEVVersionedItemAODomain)
					{
						return new ArrayList<MDescriptor>();
					}
					return super.getDescriptors(versionedItem);
				}

				@Override
				public List<MDescriptor> getDescriptors(MCommonPackageItem item)
						throws LibraryManagerException {
					
					if (item instanceof MMCLEVItemIODomain ||
						item instanceof MMCLEVItemAODomain)
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
