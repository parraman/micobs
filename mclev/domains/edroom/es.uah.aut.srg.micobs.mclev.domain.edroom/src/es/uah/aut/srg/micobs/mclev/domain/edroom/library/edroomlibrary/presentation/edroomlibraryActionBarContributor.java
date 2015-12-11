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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.presentation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.MICOBSLibraryEditorActionBarContributor;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.EDROOMLibraryManager;

/**
 * Class that implements the EDROOM Domain Library editor action bar contributor.
 *
 */
public class edroomlibraryActionBarContributor extends MICOBSLibraryEditorActionBarContributor {

	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return EDROOMLibraryManager.getLibraryManager();
	}

	@Override
	protected EFactory getLibraryFactory() {
		return edroomlibraryFactory.eINSTANCE;
	}

	@Override
	protected EClass getPackageClass() {
		return edroomlibraryPackage.eINSTANCE.getEDROOMPackage();
	}

}
