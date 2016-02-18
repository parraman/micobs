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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.library.IReferencingLibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.impl.ReferencingLibraryManager;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.plugin.EDROOMPlugin;

/**
 * Class that instantiates the EDOOM Domain Library manager singleton object.
 *
 */
public class EDROOMLibraryManager {

	private static final String LIBRARY_FILENAME = "the.edroomlibrary";

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
			INSTANCE = new ReferencingLibraryManager(EDROOMPlugin.getPlugin(),
					LIBRARY_FILENAME,
					edroomlibraryPackage.eINSTANCE.getEDROOMLibrary(),
					edroomlibraryPackage.eINSTANCE.getEDROOMPackage(),
					edroomlibraryFactory.eINSTANCE,
					new EClass[] {
						edroomlibraryPackage.eINSTANCE.getEDROOMItemDataClass(),
						edroomlibraryPackage.eINSTANCE.getEDROOMItemProtocol()
					},
					new EClass[] {
						edroomlibraryPackage.eINSTANCE.getEDROOMVersionedItemDataClass(),
						edroomlibraryPackage.eINSTANCE.getEDROOMVersionedItemProtocol()
					},
					new EClass[] {
						edroomdclassPackage.eINSTANCE.getEDROOMDataClass(),
						edroomprotPackage.eINSTANCE.getEDROOMProtocol()
					});

		}
		return INSTANCE;
	}

	private static ReferencingLibraryManager INSTANCE;


}
