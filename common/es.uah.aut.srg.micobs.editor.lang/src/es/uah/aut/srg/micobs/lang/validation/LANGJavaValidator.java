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
package es.uah.aut.srg.micobs.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;

/**
 * Language model Java validator.
 *
 */
public class LANGJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return SystemLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		return importLibraries;
	}

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE
				.getEPackage("http://srg.aut.uah.es/micobs/system"));
		return result;
	}

	/**
	 * Checks that there are no duplicates in the extended languages list of
	 * a given language.
	 * 
	 * @param lang the language to check.
	 */
	@Check
	public void checkMLanguage_DuplicatedExtendedLanguage(MLanguage lang) {
		Set<MLanguage> langs = new HashSet<MLanguage>();

		int i = 0;
		for (MLanguage extLang : lang.getExtends()) {
			if (extLang == null || extLang.eIsProxy() == true) {
				i++;
				continue;
			}
			if (langs.add(extLang) == false) {
				error("Duplicated extended language: "
						+ MICOBSStringHelper.getInstance().getElementName(extLang),
						systemPackage.eINSTANCE.getMLanguage_Extends(), i);
			}
			i++;
		}
	}

}
