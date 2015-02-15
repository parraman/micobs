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
package es.uah.aut.srg.micobs.system.library.systemlibrary.adapter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.decoder.ILibraryDecoder;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * Adapter class for the System Library. This library instantiates the library
 * encoder and decoder. In this case, the library encoder and the decoder
 * prevent from saving and loading any models related to the different languages.
 * This is done because the languages are installed by the different plugins and
 * thus they cannot be integrated in the system by using regular descriptors.
 *
 */
public class SystemLibraryAdapter extends LibraryAdapter {

	protected static ILibraryDecoder libraryDecoder;
	
	protected static ILibraryEncoder libraryEncoder;
	
	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return SystemLibraryManager.getLibraryManager();
	}
	
	@Override
	protected ILibraryDecoder getLibraryDecoder() throws LibraryManagerException {
		if (libraryDecoder == null)
		{			
			libraryDecoder = new ILibraryDecoder() {

				@Override
				public Diagnostic decodeDescriptor(MDescriptor descriptor,
						IProgressMonitor monitor) {
					return CheckingDiagnostic.createOK(
							MICOBSPlugin.INSTANCE.getString("_OK_ItemProcessed", 
							new Object[] { descriptor.getItem() }), descriptor);
				}
				
			};
		}
		return libraryDecoder;
	}
	
	@Override
	protected ILibraryEncoder getLibraryEncoder() throws LibraryManagerException {
		
		if (libraryEncoder == null)
		{
			libraryEncoder = new ILibraryEncoder() {

				@Override
				public List<MDescriptor> getDescriptors(
						MCommonPackageVersionedItem versionedItem)
						throws LibraryManagerException {
					return new ArrayList<MDescriptor>();
				}

				@Override
				public List<MDescriptor> getDescriptors(MCommonPackageItem item)
						throws LibraryManagerException {
					return new ArrayList<MDescriptor>();
				}

				@Override
				public List<MDescriptor> getDescriptors(MCommonPackage _package)
						throws LibraryManagerException {
					return new ArrayList<MDescriptor>();
				}
				
			};
		}
		return libraryEncoder;
		
	}
	
}
