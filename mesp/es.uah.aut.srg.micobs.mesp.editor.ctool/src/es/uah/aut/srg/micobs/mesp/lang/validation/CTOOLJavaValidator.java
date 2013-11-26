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
package es.uah.aut.srg.micobs.mesp.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
 

public class CTOOLJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MESPLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(MESPLibraryManager.getLibraryManager());
		return importLibraries;
	}	
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mespctool"));
		return result;
	}
	
	/**
	 * Checks that there are no duplicated languages in the list of
	 * references of a construction tool.
	 * 
	 * @param ctool the construction tool to check.
	 */
	@Check
	public void checkMConstructionTool_DuplicatedSupportedLanguage(MConstructionTool ctool)
	{
		Set<MLanguage> langs = new HashSet<MLanguage>();
		
		int i = 0;
		for (MLanguage lang : ctool.getSupportedLanguages())
		{
			if (lang == null ||
				lang.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (langs.add(lang) == false)
			{
				error("Duplicated supported language: " +
					  MESPStringHelper.getDefault().getElementName(lang),
					  mespctoolPackage.eINSTANCE.getMConstructionTool_SupportedLanguages(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated extended construction tools
	 * in the definition of a tool.
	 * 
	 * @param ctool the construction tool to check.
	 */
	@Check
	public void checkMConstructionTool_DuplicatedExtendedCTool(MConstructionTool ctool)
	{
		Set<MConstructionTool> ctools = new HashSet<MConstructionTool>();
		
		int i = 0;
		for (MConstructionTool extCTool : ctool.getExtends())
		{
			if (extCTool == null ||
				extCTool.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctools.add(extCTool) == false)
			{
				error("Duplicated extended construction tool: " +
					  MESPStringHelper.getDefault().getElementName(extCTool),
					  mespctoolPackage.eINSTANCE.getMConstructionTool_Extends(), i);
			}
			i++;
		}
	}

}
