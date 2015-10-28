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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.library.IReferencingLibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.impl.LibraryManagerExtensionHook;
import es.uah.aut.srg.micobs.library.impl.ReferencingLibraryManager;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryFactory;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;

/**
 * Class that instantiates the MCLEV Library manager singleton object.
 *
 */
public class MCLEVLibraryManager {
	
	protected static final String EXTENSION = "domain";
	private static final String LIBRARY_FILENAME = "the.mclevlibrary";
	
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
			INSTANCE = new ReferencingLibraryManager(MCLEVPlugin.getPlugin(),
					LIBRARY_FILENAME,
					mclevlibraryPackage.eINSTANCE.getMMCLEVLibrary(), 
					mclevlibraryPackage.eINSTANCE.getMMCLEVPackage(),
					mclevlibraryFactory.eINSTANCE,
					new EClass[] {
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemIODomain(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemAODomain(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemSAI(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemDriverServiceLibrary(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemServiceLibrary(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemAbstractServiceLibrary(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemInterface(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemInterfaceMapping(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemComponent(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemAbstractComponent(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemMCAD(),
						mclevlibraryPackage.eINSTANCE.getMMCLEVItemFlatMCAD()
					},
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
					});
			
			extensionHook = new LibraryManagerExtensionHook(
					INSTANCE, MCLEVPlugin.getPlugin().getSymbolicName(), EXTENSION,
					mclevdomPackage.eINSTANCE.getMIODomain());
			extensionHook.loadExtensionModels();

		}
		return INSTANCE;
	}
	
	private static ReferencingLibraryManager INSTANCE;
	

}
