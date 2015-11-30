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
package es.uah.aut.srg.micobs.mclev.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class SAIJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevsai"));
		return result;
	}
	
	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MCLEVLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		return importLibraries;
	}

	/**
	 * Checks that the languages of the extended interfaces match with the
	 * SAI's. Implements restriction TBD.
	 * @param sai the SAI to check.
	 */
	@Check
	void checkMSAI_LanguageExtendedInterface(MSAI sai)
	{	
		if (sai.getLanguage().eIsProxy() == true)
		{
			return;
		}
		
		int i = 0;
		for (MSAI esai : sai.getExtends())
		{
			if (esai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (esai.getLanguage() != sai.getLanguage() &&
				MCLEVUtil.getDefault().getAllParentLanguages(sai.getLanguage()).contains(esai.getLanguage()) == false)
			{
				error("The language of the extended interface " +
					  MCLEVStringHelper.getDefault().getElementName(esai) +
					  " does not match with the selected language",
					  sai, mclevsaiPackage.eINSTANCE.getMSAI_Extends(), i);
			}
			i++;
		}
	}

	/**
	 * Checks that there are no duplicates in the extended interfaces list of a
	 * software interface.
	 * @param sai the SAI to check.
	 */
	@Check
	void checkMSAI_DuplicatedExtendedInterface(MSAI sai)
	{
		Set<MSAI> interfaces = new HashSet<MSAI>();
		
		int i = 0;
		for (MSAI esai : sai.getExtends())
		{
			if (esai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (interfaces.add(esai) == false)
			{
				error("Duplicated extended SAI: " +
					  MCLEVStringHelper.getDefault().getElementName(esai),
					  sai, mclevsaiPackage.eINSTANCE.getMSAI_Extends(), i);
			}
			i++;
		}
	}

	/**
	 * Checks that there are no loops between the extended interfaces and the
	 * required ones.
	 * Implements Restriction TBD.
	 * @param sai the SAI to check
	 */
	@Check
	void checkMSAI_ExtendedLoop(MSAI sai)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		if (sai.getExtends().isEmpty())
		{
			return;
		}
		
		for (MSAI extended : sai.getExtends())
		{
			if (extended.eIsProxy() == true)
			{
				continue;
			}
			sais.addAll(MCLEVUtil.getDefault().getAllExtendedSAIs(extended));
			sais.add(extended);
		}

		int i = 0;
		
		for (MSAI required : sai.getRequires())
		{
			if (required.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (sais.contains(required) == true)
			{
				error("SAI " +
					  MCLEVStringHelper.getDefault().getElementName(required) +
					  " is both extended and required",
					  mclevsaiPackage.eINSTANCE.getMSAI_Requires(), i);
			}
			else
			{
				for (MSAI extended : MCLEVUtil.getDefault().getAllExtendedSAIs(required))
				{
					if (sais.contains(extended) == true)
					{
						error("SAI " +
								MCLEVStringHelper.getDefault().getElementName(extended) +
								", extended by SAI " +
								MCLEVStringHelper.getDefault().getElementName(required) +
								" is both extended and required",
								mclevsaiPackage.eINSTANCE.getMSAI_Requires(), i);
					}
				}
			}
			i++;
		}
	}

	/**
	 * Checks that there are no duplicated names on the attributes defined
	 * by the SAI.
	 * Implements Restriction TBD.
	 * 
	 * @param sai the SAI to check
	 */
	@Check
	public void checkMSAI_DuplicatedAttributeNames(MSAI sai)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MParameter param : sai.getAttributes())
		{
			if (names.add(StringHelper.toLowerDefString(param.getName())) == false)
			{
				error("Duplicated attribute name: " +
					  param.getName(), sai,
					  mclevsaiPackage.eINSTANCE.getMSAI_Attributes(), i);
			}
			i++;
		}
	}
}
