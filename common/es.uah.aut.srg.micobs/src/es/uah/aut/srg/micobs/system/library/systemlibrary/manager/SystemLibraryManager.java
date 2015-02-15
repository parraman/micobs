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
package es.uah.aut.srg.micobs.system.library.systemlibrary.manager;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.impl.LibraryManager;
import es.uah.aut.srg.micobs.library.impl.LibraryManagerExtensionHook;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryFactory;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage;

/**
 * Class that instantiates the System Library manager singleton object.
 *
 */
public class SystemLibraryManager {
	
	protected static final String EXTENSION = "language";
	protected static final String ATT_URI = "uri";
	protected static final String ATT_VERSION = "version";
	protected static final String ATT_MODEL = "model";

	private static LibraryManagerExtensionHook extensionHook;
	
	private static final String LIBRARY_FILENAME = "the.systemlibrary";
	
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
			INSTANCE = new LibraryManager(MICOBSPlugin.getPlugin(),
					LIBRARY_FILENAME, 
					systemlibraryPackage.eINSTANCE.getMSystemLibrary(),
					systemlibraryPackage.eINSTANCE.getMSystemPackage(), systemlibraryFactory.eINSTANCE, 
					new EClass[] {
						systemlibraryPackage.eINSTANCE.getMSystemItemLanguage(),
					}, 
					new EClass[] {
						systemlibraryPackage.eINSTANCE.getMSystemVersionedItemLanguage()
					},
					new EClass[] {
						systemPackage.eINSTANCE.getMLanguage()
					});
			
			extensionHook = new LibraryManagerExtensionHook(
					INSTANCE, MICOBSPlugin.getPlugin().getSymbolicName(), EXTENSION, 
					systemPackage.eINSTANCE.getMLanguage());
			extensionHook.loadExtensionModels();
		}
		return INSTANCE;
	}
	
	private static LibraryManager INSTANCE;

}
