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
package es.uah.aut.srg.micobs.system.library.systemlibrary.presentation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.ui.MICOBSLibraryEditorActionBarContributor;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryFactory;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * Class that implements the System Library editor action bar contributor.
 *
 */
public class systemlibraryActionBarContributor extends
		MICOBSLibraryEditorActionBarContributor {

	@Override
	protected ILibraryManager getLibraryManager() throws LibraryManagerException {
		return SystemLibraryManager.getLibraryManager();
	}

	@Override
	protected EFactory getLibraryFactory() {
		return systemlibraryFactory.eINSTANCE;
	}

	@Override
	protected EClass getPackageClass() {
		return systemlibraryPackage.eINSTANCE.getMSystemPackage();
	}

}
