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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.impl.LibraryManager;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryFactory;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;

/**
 * Class that instantiates the Platform Library manager singleton object.
 *
 */
public class PDLLibraryManager {
	
	private static final String LIBRARY_FILENAME = "the.pdllibrary";
	
	/**
	 * Returns the library manager singleton object.
	 * 
	 * If an error occurs when accessing the library, the method will throw
	 * a {@link LibraryManagerException}.
	 * 
	 * @return the library manager singleton object.
	 */
	public static ILibraryManager getLibraryManager() throws LibraryManagerException {
		
		if (INSTANCE == null)
		{
			INSTANCE = new LibraryManager(PDLPlugin.getPlugin(),
					LIBRARY_FILENAME, 
					pdllibraryPackage.eINSTANCE.getMPDLLibrary(),
					pdllibraryPackage.eINSTANCE.getMPDLPackage(), pdllibraryFactory.eINSTANCE, 
					new EClass[] {
						pdllibraryPackage.eINSTANCE.getMPDLItemOperatingSystemAPI(),
						pdllibraryPackage.eINSTANCE.getMPDLItemOperatingSystem(),
						pdllibraryPackage.eINSTANCE.getMPDLItemArchitecture(),
						pdllibraryPackage.eINSTANCE.getMPDLItemCompiler(),
						pdllibraryPackage.eINSTANCE.getMPDLItemMicroprocessor(),
						pdllibraryPackage.eINSTANCE.getMPDLItemBoard(),
						pdllibraryPackage.eINSTANCE.getMPDLItemDevice(),
						pdllibraryPackage.eINSTANCE.getMPDLItemPlatform()
					}, 
					new EClass[] {
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemOperatingSystemAPI(),
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemOperatingSystem(),
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemArchitecture(),
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemCompiler(),
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemMicroprocessor(),
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemBoard(),
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemDevice(),
						pdllibraryPackage.eINSTANCE.getMPDLVersionedItemPlatform()
					},
					new EClass[] {
						pdlPackage.eINSTANCE.getMOperatingSystemAPI(),
						pdlPackage.eINSTANCE.getMOperatingSystem(),
						pdlPackage.eINSTANCE.getMArchitecture(),
						pdlPackage.eINSTANCE.getMCompiler(),
						pdlPackage.eINSTANCE.getMMicroprocessor(),
						pdlPackage.eINSTANCE.getMBoard(),
						pdlPackage.eINSTANCE.getMDevice(),
						pdlPackage.eINSTANCE.getMPlatform()
					});
		}
		return INSTANCE;
	}
	
	private static LibraryManager INSTANCE;
	

}
