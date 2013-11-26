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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.library.IReferencingLibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.impl.LibraryManagerExtensionHook;
import es.uah.aut.srg.micobs.library.impl.ReferencingLibraryManager;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryFactory;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;

/**
 * Class that instantiates the MESP Library manager singleton object.
 *
 */
public class MESPLibraryManager {
	
	protected static final String EXTENSION = "ctool";
	private static final String LIBRARY_FILENAME = "the.mesplibrary";
	
	private static LibraryManagerExtensionHook extensionHook;
	
	/**
	 * Returns the library manager singleton object.
	 * 
	 * If an error occurs when accessing the library, the method will throw
	 * a {@link LibraryManagerException}.
	 * 
	 * @return the library manager singleton object.
	 */
	public static IReferencingLibraryManager getLibraryManager() throws LibraryManagerException {
		
		if (INSTANCE == null)
		{
			INSTANCE = new ReferencingLibraryManager(MESPPlugin.getPlugin(),
					LIBRARY_FILENAME,
					mesplibraryPackage.eINSTANCE.getMMESPLibrary(), 
					mesplibraryPackage.eINSTANCE.getMMESPPackage(),
					mesplibraryFactory.eINSTANCE,
					new EClass[] {
						mesplibraryPackage.eINSTANCE.getMMESPItemOSSwInterface(),
						mesplibraryPackage.eINSTANCE.getMMESPItemOSSwPackage(),
						mesplibraryPackage.eINSTANCE.getMMESPItemPlatformSwPackage(),
						mesplibraryPackage.eINSTANCE.getMMESPItemSwInterface(),
						mesplibraryPackage.eINSTANCE.getMMESPItemDriverSwPackage(),
						mesplibraryPackage.eINSTANCE.getMMESPItemSwPackage(),
						mesplibraryPackage.eINSTANCE.getMMESPItemAbstractSwPackage(),
						mesplibraryPackage.eINSTANCE.getMMESPItemConstructionTool(),
						mesplibraryPackage.eINSTANCE.getMMESPItemDeployment()
					},
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
					});
			
			extensionHook = new LibraryManagerExtensionHook(INSTANCE, MESPPlugin.getPlugin().getSymbolicName(), EXTENSION);
			extensionHook.loadExtensionModels();

		}
		return INSTANCE;
	}
	
	private static ReferencingLibraryManager INSTANCE;
	

}
