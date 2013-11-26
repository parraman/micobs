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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.xtext.MESPAbstractJavaValidator;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class SWPJavaValidator extends MESPAbstractJavaValidator {

	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MESPLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(MESPLibraryManager.getLibraryManager());
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mespswp"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mespcommon"));
		return result;
	}
	
	public static final String IMPROPER_SWPSUPPORTEDPLATFORM_NAME = "0";
	
	/**
	 * Checks that all the OSAPIs demanded by all the provided interfaces
	 * do match with the OSAPIs of all the supported platforms.
	 * 
	 * @param swp the software package that is to be checked.
	 */
	@Check
	public void checkMSwPackage_InterfacesSupportOSAPI(MSwPackage swp)
	{
		Set<MSwInterface> pswis = new HashSet<MSwInterface>();
		for (MAbstractSwPackage aswp : swp.getInherits())
		{
			if (aswp.eIsProxy() == true)
			{
				continue;
			}
			pswis.addAll(mesputil.getAllProvidedSwInterfaces(aswp));
		}
		for (MSwPackageProvidedInterface pswi : swp.getProvides())
		{
			if (pswi.getSwinterface() == null ||
				pswi.getSwinterface().eIsProxy() == true)
			{
				continue;
			}
			pswis.add(pswi.getSwinterface());
		}
		for (MSwPackage extend : swp.getExtends())
		{
			 if (extend.eIsProxy() == true)
			 {
				 continue;
			 }
			 pswis.removeAll(mesputil.getAllProvidedSwInterfaces(extend));
		}
		
		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{
			for (MSwInterface swi : pswis)
			{
				if (swi.getRequiredOSAPI() != null)
				{
					if (swpsp.getOsapi() == null ||
						swpsp.getOsapi() != swi.getRequiredOSAPI())
					{
						error("Provided interface " +
						      MESPStringHelper.getDefault().getElementName(swi) +
							  " requires OSAPI " +
							  MESPStringHelper.getDefault().getElementName(swi.getRequiredOSAPI()),
							  swpsp, mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Osapi(), -1);
					}
				}
			}
			for (MSwPackageRequiredInterface rswi : swp.getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface &&
					((MSwInterface)rswi.getInterface()).getRequiredOSAPI() != null)
				{
					if (swpsp.getOsapi() == null ||
						swpsp.getOsapi() != ((MSwInterface)rswi.getInterface()).getRequiredOSAPI())
					{
						error("Required interface " +
						      MESPStringHelper.getDefault().getElementName(((MSwInterface)rswi.getInterface())) +
							  " requires OSAPI " +
							  MESPStringHelper.getDefault().getElementName(((MSwInterface)rswi.getInterface()).getRequiredOSAPI()),
							  swpsp, mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Osapi(), -1);
					}
				}
			}
		}
	}
	
	@Check
	public void checkMSwPackageSupportedPlatform_RequiredInterfacesSupportOSAPI(MSwPackageSupportedPlatform swpsp)
	{
		for (MSwPackageRequiredInterface rswi : swpsp.getRequires())
		{
			if (rswi.getInterface() != null &&
				rswi.getInterface().eIsProxy() == false &&
				rswi.getInterface() instanceof MSwInterface &&
				((MSwInterface)rswi.getInterface()).getRequiredOSAPI() != null)
			{
				if (swpsp.getOsapi() == null ||
					swpsp.getOsapi() != ((MSwInterface)rswi.getInterface()).getRequiredOSAPI())
				{
					error("Required interface " +
					      MESPStringHelper.getDefault().getElementName(((MSwInterface)rswi.getInterface())) +
						  " requires OSAPI " +
						  MESPStringHelper.getDefault().getElementName(((MSwInterface)rswi.getInterface()).getRequiredOSAPI()),
						  swpsp, mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Osapi(), -1);
				}
			}
		}
	}
	
	/**
	 * Checks that the name of a supported platform of an operating system
	 * conforms to the naming standard. It produces a warning otherwise.
	 * @param swpsp the supported platform to check.
	 */
	@Check
	public void checkMSwPackageSupportedPlatform_Naming(MSwPackageSupportedPlatform swpsp) {
		
		if (swpsp.getName() != null &&
			MESPStringHelper.getDefault().getProperName(swpsp) != null &&
			swpsp.getName().matches(MESPStringHelper.getDefault().getProperName(swpsp)) == false)
		{
			warning("Supported Platform name does not match the recommended one",
				    commonPackage.eINSTANCE.getMCommonReferenceableObj_Name(),
				    IMPROPER_SWPSUPPORTEDPLATFORM_NAME,
				    swpsp.getName(),
				    MESPStringHelper.getDefault().getProperName(swpsp));
		}
		
	}
	
	/**
	 * Checks that the selected languages are supported by everyone of the
	 * construction tools.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	public void checkMSwPackage_CToolsSupportLanguage(MSwPackage swp) {
		
		int i = 0;
		for (MConstructionTool ctool : swp.getCtools())
		{
			if (ctool.eIsProxy() == false)
			{
				for (MLanguage language : swp.getLanguages())
				{
					if (language.eIsProxy() == true)
					{
						continue;
					}
					if (ctool.getSupportedLanguages().contains(language) == false)
					{
						error("Construction tool " +
							  MESPStringHelper.getDefault().getElementName(ctool) +
							  " does not support language " +
							  MESPStringHelper.getDefault().getElementName(language),
							  swp, mespswpPackage.eINSTANCE.getMSwPackage_Ctools(), i);
						break;
					}
				}
				
				for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
				{
					for (MLanguage language : swpsp.getLanguages())
					{
						if (language.eIsProxy() == true)
						{
							continue;
						}
						if (ctool.getSupportedLanguages().contains(language) == false)
						{
							error("Construction tool " +
								  MESPStringHelper.getDefault().getElementName(ctool) +
								  " does not support language " +
								  MESPStringHelper.getDefault().getElementName(language),
								  swp, mespswpPackage.eINSTANCE.getMSwPackage_Ctools(), i);
							break;
						}
					}
				}

			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the languages list of a
	 * software package.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	public void checkMSwPackage_DuplicatedLanguage(MSwPackage swp) {
		
		Set<MLanguage> langs = new HashSet<MLanguage>();
		
		int i = 0;
		for (MLanguage lang : swp.getLanguages())
		{
			if (lang.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (langs.add(lang) == false)
			{
				error("Duplicated language: " +
					  MESPStringHelper.getDefault().getElementName(lang),
					   swp, mespswpPackage.eINSTANCE.getMSwPackage_Languages(), i);
			}
			i++;
		}
		
		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{
			i = 0;
			
			for (MLanguage lang : swpsp.getLanguages())
			{
				if (lang.eIsProxy() == true)
				{
					i++;
					continue;
				}
				if (langs.add(lang) == false)
				{
					error("Duplicated language: " +
						  MESPStringHelper.getDefault().getElementName(lang),
						   swp, mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Languages(), i);
				}
				i++;
			}
		}

	}
	
	/**
	 * Checks that there are no duplicates in the construction tools list of a
	 * software package.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	public void checkMSwPackage_DuplicatedConstructionTool(MSwPackage swp) {
		
		Set<MConstructionTool> ctools = new HashSet<MConstructionTool>();
		
		int i = 0;
		for (MConstructionTool ctool : swp.getCtools())
		{
			if (ctool.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctools.add(ctool) == false)
			{
				error("Duplicated construction tool: " +
					  MESPStringHelper.getDefault().getElementName(ctool),
					   swp, mespswpPackage.eINSTANCE.getMSwPackage_Ctools(), i);
			}
			i++;
		}	
	}
	
	/**
	 * Global check of the extended software packages. This function checks
	 * that the construction tools of the extended packages match with the
	 * one of the package and also that the languages and platforms do
	 * match.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	void checkMSwPackage_ExtendedPackages(MSwPackage swp)
	{
		if (swp.getExtends().isEmpty())
		{
			return;
		}
		
		int i = 0;
		boolean found = false;
		for (MSwPackage eswp : swp.getExtends())
		{
			if (eswp.eIsProxy() == true)
			{
				i++;
				continue;
			}
			found = false;
			for (MConstructionTool ctool : eswp.getCtools())
			{
				if (swp.getCtools().contains(ctool))
				{
					found = true;
					break;
				}
			}
			if (found == false)
			{
				error("Extended software package " +
					  MESPStringHelper.getDefault().getElementName(eswp) + 
					  " does not support any of the selected construction tools",
					  swp, mespswpPackage.eINSTANCE.getMSwPackage_Extends(), i);
			}

			found = false;
			
			for (MSwPackageSupportedPlatform extendedSWPSP : eswp.getSupportedPlatforms())
			{		
				for (MSwPackageSupportedPlatform swsp : swp.getSupportedPlatforms())
				{
					if (mesputil.platformIntersection(swsp, extendedSWPSP))
					{
						found = true;
						break;
					}
				}
			}
			if (found == false)
			{
				error("There are no compatible implementations with the software package " +
					  MESPStringHelper.getDefault().getElementName(eswp),
					  swp, mespswpPackage.eINSTANCE.getMSwPackage_Extends(), i);
			}
			
			i++;
		}
	}
	
	/**
	 * Checks that the interfaces are of the language of the package or of
	 * one of the languages it extends.
	 * 
	 * @param swp the software package to check.
	 */
	void checkMSwPackage_InterfacesSupportLanguage(MSwPackage swp)
	{
		int i = 0;
		
		for (MSwPackageProvidedInterface rswi : swp.getProvides())
		{
			if (rswi.getSwinterface().eIsProxy() == true)
			{
				i++;
				continue;
			}
			MSwInterface swi = rswi.getSwinterface();
			boolean found = false;
			for (MLanguage language : swp.getLanguages())
			{
				if (language.eIsProxy() == false && 
					language == swi.getLanguage() &&
					util.getAllParentLanguages(language).contains(swi.getLanguage()) == true)
				{
					found = true;
					break;
				}
			}

			if (found == false)
			{
				error("Language " +
						  MESPStringHelper.getDefault().getElementName(swi.getLanguage()) + 
						  " is not supported by the package", swp,
						  mespswpPackage.eINSTANCE.getMAbstractSwPackage_Provides(), i);
			}
			i++;
		}

		i = 0;
		for (MSwPackageRequiredInterface rswi : swp.getRequires())
		{
			MLanguage ifaceLang;
			
			if (rswi.getInterface() == null ||
				rswi.getInterface().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (rswi.getInterface() instanceof MSwInterface)
			{
				MSwInterface swi = (MSwInterface) rswi.getInterface();
				ifaceLang = swi.getLanguage();
			}
			else 
			{
				MOSSwInterface osswi = (MOSSwInterface)rswi.getInterface();
				MOperatingSystemAPI osapi = (MOperatingSystemAPI) osswi.getReferencedElement();
				
				ifaceLang = osapi.getLanguage();
			}

			boolean found = false;
			for (MLanguage language : swp.getLanguages())
			{
				if (language.eIsProxy() == false && 
					(language == ifaceLang ||
					util.getAllParentLanguages(language).contains(ifaceLang) == true))
				{
					found = true;
					break;
				}
			}
			if (found == false)
			{
				
				error("Language " +
					  MESPStringHelper.getDefault().getElementName(ifaceLang) + 
					  " is not supported by the package",
					  swp,
					  mespswpPackage.eINSTANCE.getMSwPackage_Requires(), i);
			}
			i++;
		}

		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{
			i = 0;
			for (MSwPackageRequiredInterface rswi : swpsp.getRequires())
			{
				MLanguage ifaceLang;
				if (rswi.getInterface() == null ||
						rswi.getInterface().eIsProxy() == true)
				{
					i++;
					continue;
				}
				if (rswi.getInterface() instanceof MSwInterface)
				{
					MSwInterface swi = (MSwInterface) rswi.getInterface();
					ifaceLang = swi.getLanguage();
				}
				else 
				{
					MOSSwInterface osswi = (MOSSwInterface)rswi.getInterface();
					MOperatingSystemAPI osapi = (MOperatingSystemAPI) osswi.getReferencedElement();
					
					ifaceLang = osapi.getLanguage();
				}

				boolean found = false;
				for (MLanguage language : swp.getLanguages())
				{
					if (language.eIsProxy() == false && 
						(language == ifaceLang ||
						util.getAllParentLanguages(language).contains(ifaceLang) == true))
					{
						found = true;
						break;
					}
				}
				if (found == false)
				{
					for (MLanguage language : swpsp.getLanguages())
					{
						if (language.eIsProxy() == false && 
							(language == ifaceLang ||
							util.getAllParentLanguages(language).contains(ifaceLang) == true))
						{
							found = true;
							break;
						}
					}
					if (found == false)
					{
						error("Language " +
							  MESPStringHelper.getDefault().getElementName(ifaceLang) + 
							  " is not supported by the package",
							  swp,
							  mespswpPackage.eINSTANCE.getMSwPackage_Requires(), i);	
					}
				}
				i++;
			}
			
			if (swpsp.getOsapi() != null &&
				swpsp.getOsapi().eIsProxy() == false)
			{
				boolean found = false;
				for (MLanguage language : swp.getLanguages())
				{
					if (language.eIsProxy() == false && 
						(language == swpsp.getOsapi().getLanguage() ||
						util.getAllParentLanguages(language).contains(swpsp.getOsapi().getLanguage()) == true))
					{
						found = true;
						break;
					}
				}
					
				if (found == false)
				{
					for (MLanguage language : swpsp.getLanguages())
					{
						if (language.eIsProxy() == false && 
							(language == swpsp.getOsapi().getLanguage() ||
							util.getAllParentLanguages(language).contains(swpsp.getOsapi().getLanguage()) == true))
						{
							found = true;
							break;
						}
					}
					if (found == false)
					{
						error("Language " +
								MESPStringHelper.getDefault().getElementName(swpsp.getOsapi().getLanguage()) + 
								" is not supported by the service library",
								mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Osapi());
					}
				}
			}
		}
		
	}
	
	/**
	 * Checks that there are no duplicates in the parent packages list of a
	 * software package.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	void checkMSwPackage_DuplicatedInheritanceOrExtension(MAbstractSwPackage swp)
	{
		Set<MAbstractSwPackage> inherited = new HashSet<MAbstractSwPackage>();
		
		int i = 0;
		for (MAbstractSwPackage pack : swp.getInherits())
		{
			if (inherited.add(pack) == false)
			{
				error("Duplicated parent package: " +
					  MESPStringHelper.getDefault().getElementName(pack),
					  swp, mespswpPackage.eINSTANCE.getMAbstractSwPackage_Inherits(), i);
			}
			i++;
		}
		
		if (swp instanceof MSwPackage)
		{
			Set<MSwPackage> extended = new HashSet<MSwPackage>();

			i = 0;
			for (MSwPackage pack : ((MSwPackage)swp).getExtends())
			{
				if (inherited.contains(pack) == true)
				{
					error("Software package " +
						  MESPStringHelper.getDefault().getElementName(pack) +
						  " is already being inherited",
						  swp, mespswpPackage.eINSTANCE.getMSwPackage_Extends(), i);
				}
				if (extended.add(pack) == false)
				{
					error("Duplicated extended package: " +
						  MESPStringHelper.getDefault().getElementName(pack),
						  swp, mespswpPackage.eINSTANCE.getMSwPackage_Extends(), i);
				}
				i++;
			}
		}
	}

	/**
	 * Checks that there are no duplicated supported platform names within a
	 * software package.
	 * 
	 * @param swp the software package to check
	 */
	@Check
	public void checkMSwPackage_DuplicatedSupportedPlatformNames(MSwPackage swp)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{
			if (names.add(StringHelper.toLowerDefString(swpsp.getName())) == false)
			{
				error("Duplicated supported platform name: " + swpsp.getName(),
					  swp,
					  mespswpPackage.eINSTANCE.getMSwPackage_SupportedPlatforms(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks the well-formedness of a software package supported platform.
	 * 
	 * @param swpsp The software package supported platform to check.
	 */
	@Check
	public void checkMSwPackageSupportedPlatform_Wellformedness(MSwPackageSupportedPlatform swpsp)
	{
		if (swpsp.getOsapi() == null &&
			((swpsp.getOs() != null && swpsp.getOs().eIsProxy() == false) ||
			 (swpsp.getArchitecture() != null && swpsp.getArchitecture().eIsProxy() == false) ||
			 (swpsp.getMicroprocessor() != null && swpsp.getMicroprocessor().eIsProxy() == false) ||
			 (swpsp.getBoard() != null && swpsp.getBoard().eIsProxy() == false)))
		{
			error("If the OSAPI is undefined, the rest of the fields must also be undefined",
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Osapi());
		}
		if (swpsp.getOs() == null &&
			((swpsp.getArchitecture() != null && swpsp.getArchitecture().eIsProxy() == false) ||
			 (swpsp.getMicroprocessor() != null && swpsp.getMicroprocessor().eIsProxy() == false) ||
			 (swpsp.getBoard() != null && swpsp.getBoard().eIsProxy() == false)))
		{
			error("If the OS is undefined, the rest of the fields must also be undefined",
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Os());
		}
		if (swpsp.getArchitecture() == null &&
			((swpsp.getCompiler() != null && swpsp.getCompiler().eIsProxy() == false) ||
			 (swpsp.getMicroprocessor() != null && swpsp.getMicroprocessor().eIsProxy() == false) ||
			 (swpsp.getBoard() != null && swpsp.getBoard().eIsProxy() == false)))
		{
			error("If the architecture is undefined, the compiler, the microprocessor and the board must also be undefined",
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Architecture());
		}
		if (swpsp.getMicroprocessor() == null &&
			(swpsp.getBoard() != null && swpsp.getBoard().eIsProxy() == false))
		{
			error("If the microprocessor is undefined, the board must also be undefined",
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Microprocessor());
		}
	}

	/**
	 * Checks that the operating system of a software package supported
	 * platform supports the selected OSAPI.
	 * 
	 * @param swpsp the software package supported platform to check.
	 */
	@Check
	public void checkMSwPackageSupportedPlatform_OSSupportsOSAPI(MSwPackageSupportedPlatform swpsp)
	{
		if (swpsp.getOsapi() != null &&
			swpsp.getOsapi().eIsProxy() == false &&
			swpsp.getOs() != null &&
			swpsp.getOs().eIsProxy() == false &&
			!pdlutil.getAllSupportedOSAPIs(swpsp.getOs()).contains(swpsp.getOsapi()))
		{
			error("The operating system " +
				  MESPStringHelper.getDefault().getElementName(swpsp.getOs())+
				  " does not support the OSAPI " +
				  MESPStringHelper.getDefault().getElementName(swpsp.getOsapi()),
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Os());
		}
	}
	
	/**
	 * Checks that the compiler of a software package supported
	 * platform supports the selected languages.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	public void checkMSwPackage_CompilerSupport(MSwPackage swp)
	{
		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{
			if (swpsp.getArchitecture() != null &&
				swpsp.getArchitecture().eIsProxy() == false &&
				swpsp.getCompiler() != null &&
				swpsp.getCompiler().eIsProxy() == false)
			{
				for (MLanguage language : swp.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (pdlutil.supportsLanguageForArchitecture(swpsp.getCompiler(),
							language, swpsp.getArchitecture()) == false)
					{
						error("The compiler " +
							  MESPStringHelper.getDefault().getElementName(swpsp.getCompiler())+
							  " does not support the language " +
							  MESPStringHelper.getDefault().getElementName(language) +
							  " for the architecture " +
							  MESPStringHelper.getDefault().getElementName(swpsp.getArchitecture()), swpsp,
							  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Compiler(), -1);
					}
				}
				for (MLanguage language : swpsp.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (pdlutil.supportsLanguageForArchitecture(swpsp.getCompiler(),
							language, swpsp.getArchitecture()) == false)
					{
						error("The compiler " +
							  MESPStringHelper.getDefault().getElementName(swpsp.getCompiler())+
							  " does not support the language " +
							  MESPStringHelper.getDefault().getElementName(language) +
							  " for the architecture " +
							  MESPStringHelper.getDefault().getElementName(swpsp.getArchitecture()), swpsp,
							  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Compiler(), -1);
					}
				}
			}
		}
	}
	
	/**
	 * Checks that the operating system of a software resource supported
	 * platform supports the corresponding platform.
	 * 
	 * @param swpsp the software package supported platform to check.
	 */
	@Check
	public void checkMSwPackageSupportedPlatform_OSSupport(MSwPackageSupportedPlatform swpsp)
	{
		if (swpsp.getOsapi() == null ||
			swpsp.getOsapi().eIsProxy() == true ||
			swpsp.getOs() == null ||
			swpsp.getOs().eIsProxy() == true ||
			swpsp.getArchitecture() == null ||
			swpsp.getArchitecture().eIsProxy() == true)
		{
			return;
		}
		
		MOperatingSystem os = swpsp.getOs();
		
		MPlatform platform = mesputil.toPlatform(swpsp);
		
		if (!pdlutil.supportsPlatform(os, platform))
		{
			error("The implementations of the operating system " +
				  MESPStringHelper.getDefault().getElementName(platform.getOs()) +
				  " are not supported by this platform",
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Os());

		}
	}

	/**
	 * Checks that the microprocessor and the board of a software resource
	 * supported platform are correctly defined.
	 * 
	 * @param swpsp The software package supported platform to check.
	 */
	@Check
	public void checkMSwPackageSupportedPlatform_MpAndBoard(MSwPackageSupportedPlatform swpsp)
	{
		if (swpsp.getArchitecture() != null &&
			swpsp.getArchitecture().eIsProxy() == false &&
			swpsp.getMicroprocessor() != null &&
			swpsp.getMicroprocessor().eIsProxy() == false &&
			swpsp.getMicroprocessor().getArchitecture() != swpsp.getArchitecture())
		{
			error("Microprocessor " +
				  MESPStringHelper.getDefault().getElementName(swpsp.getMicroprocessor()) +
				  " does not support the architecture " +
				  MESPStringHelper.getDefault().getElementName(swpsp.getArchitecture()),
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Microprocessor());
		}
		if (swpsp.getMicroprocessor() != null &&
			swpsp.getMicroprocessor().eIsProxy() == false &&
			swpsp.getBoard() != null &&
			swpsp.getBoard().eIsProxy() != false &&
			swpsp.getBoard().getMicroprocessor() != swpsp.getMicroprocessor())
		{
			error("Board " +
				  MESPStringHelper.getDefault().getElementName(swpsp.getBoard()) +
				  " does not support the microprocessor " +
				  MESPStringHelper.getDefault().getElementName(swpsp.getMicroprocessor()),
				  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Board());
		}
	}
	
	/**
	 * Checks that the intersection between the supported platforms of a
	 * software resource is always zero.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	public void checkMSwPackage_SupportedPlatformZeroIntersection(MSwPackage swp) {
		
		if (swp.getSupportedPlatforms().size() >= 2)
		{
			int i = 0;
			for (MSwPackageSupportedPlatform swrsp : swp.getSupportedPlatforms())
			{
				if ((swrsp.getOsapi() != null && swrsp.getOsapi().eIsProxy() == true) ||
					(swrsp.getOs() != null && swrsp.getOs().eIsProxy() == true) ||
					(swrsp.getArchitecture() != null && swrsp.getArchitecture().eIsProxy() == true) ||
					(swrsp.getCompiler() != null && swrsp.getCompiler().eIsProxy() == true) ||
					(swrsp.getMicroprocessor() != null && swrsp.getMicroprocessor().eIsProxy() == true) ||
					(swrsp.getBoard() != null && swrsp.getBoard().eIsProxy() == true))
				{
					continue;
				}
				for (Iterator<MSwPackageSupportedPlatform> q = swp.getSupportedPlatforms().iterator(); q.hasNext(); )
				{
					MSwPackageSupportedPlatform otherSWRSP = q.next();
					if (swrsp == otherSWRSP)
					{
						continue;
					}
					if ((otherSWRSP.getOsapi() != null && otherSWRSP.getOsapi().eIsProxy() == true) ||
						(otherSWRSP.getOs() != null && otherSWRSP.getOs().eIsProxy() == true) ||
						(otherSWRSP.getArchitecture() != null && otherSWRSP.getArchitecture().eIsProxy() == true) ||
						(otherSWRSP.getCompiler() != null && otherSWRSP.getCompiler().eIsProxy() == true) ||
						(otherSWRSP.getMicroprocessor() != null && otherSWRSP.getMicroprocessor().eIsProxy() == true) ||
						(otherSWRSP.getBoard() != null && otherSWRSP.getBoard().eIsProxy() == true))
					{
						continue;
					}
					if (mesputil.platformIntersection(swrsp, otherSWRSP))
					{
						error("Supported Platforms intersection is not zero", 
							  swp,
							  mespswpPackage.eINSTANCE.getMSwPackage_SupportedPlatforms(), i);
					}
					i++;
				}
			}
		}
	}

	
	/**
	 * Checks that the interfaces belonging of the complete set of provided
	 * interfaces are not included in the set of required interfaces.
	 * 
	 * @param swp the software resource to check.
	 */
	@Check
	public void checkMSwPackage_DuplicatedInterfaceAndLoop(MSwPackage swp)
	{
		
		Set<MSwInterface> providedInterfaces = new HashSet<MSwInterface>();
		Set<MSwInterface> extendedInterfaces = new HashSet<MSwInterface>();
		
		for (MAbstractSwPackage parent : swp.getInherits())
		{
			if (parent.eIsProxy() == true)
			{
				continue;
			}
			providedInterfaces.addAll(mesputil.getAllProvidedSwInterfaces(parent));
		}
		
		// Now we have to check if the extended packages implement any of the
		// interfaces obtained from the inherited packages
		int i = 0;
		for (MSwPackage extended : swp.getExtends())
		{
			if (extended.eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (MSwInterface swi : mesputil.getAllProvidedSwInterfaces(extended))
			{
				if (extendedInterfaces.add(swi) == false)
				{
					error("Software interface " +
						  MESPStringHelper.getDefault().getElementName(swi) +
						  " is alredy implemented by another extended package", 
						  mespswpPackage.eINSTANCE.getMSwPackage_Extends(), i);	
				}
				providedInterfaces.remove(swi);
			}
			i++;
		}

		i = 0;
		for (MSwPackageProvidedInterface pswi : swp.getProvides())
		{
			if (pswi.getSwinterface().eIsProxy() == true)
			{
				i++;
				continue;
			}
			MSwInterface swi = pswi.getSwinterface();
			if (extendedInterfaces.contains(swi) == true)
			{
				error("Software interface " +
					  MESPStringHelper.getDefault().getElementName(swi) +
				      " is alredy implemented by an extended package", 
				      mespswpPackage.eINSTANCE.getMSwPackage_Extends(), i);	
			}
			if (providedInterfaces.add(swi) == false)
			{
				error("Software interface " +
					  MESPStringHelper.getDefault().getElementName(swi) +
					  " is alredy being inherited", 
					  mespswpPackage.eINSTANCE.getMSwPackage_Extends(), i);	
			}
			i++;
		}

		i = 0;
		for (MSwPackageRequiredInterface rswi : swp.getRequires())
		{
			if (rswi.getInterface().eIsProxy() == true ||
				rswi.getInterface() instanceof MOSSwInterface)
			{
				i++;
				continue;
			}
			MSwInterface swi = (MSwInterface) rswi.getInterface();
			if (providedInterfaces.contains(swi) == true)
			{
				error("Interface " +
					  MESPStringHelper.getDefault().getElementName(swi) +
					  " is both provided and required", swp,
					  mespswpPackage.eINSTANCE.getMSwPackage_Requires(), i);	
			}
			else
			{
				for (MSwInterface pswi : mesputil.getAllExtendedSwInterfaces(swi))
				{
					if (providedInterfaces.contains(pswi) == true)
					{
						error("Interface " +
							  MESPStringHelper.getDefault().getElementName(pswi) +
							  " is both provided and required", swp,
							  mespswpPackage.eINSTANCE.getMSwPackage_Requires(), i);
					}
				}
			}
			i++;
		}

		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{	
			i = 0;
			for (MSwPackageRequiredInterface rswi : swpsp.getRequires())
			{
				if (rswi.getInterface().eIsProxy() == true ||
					rswi.getInterface() instanceof MOSSwInterface)
				{
					i++;
					continue;
				}
				MSwInterface swi = (MSwInterface) rswi.getInterface();
				if (providedInterfaces.contains(swi) == true)
				{
					error("Interface " +
						  MESPStringHelper.getDefault().getElementName(swi) +
						  " is both provided and required", swpsp,
						  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Requires(), i);	
				}
				else
				{
					for (MSwInterface pswi : mesputil.getAllExtendedSwInterfaces(swi))
					{
						if (providedInterfaces.contains(pswi) == true)
						{
							error("Interface " +
								  MESPStringHelper.getDefault().getElementName(pswi) +
								  " is both provided and required", swpsp,
								  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Requires(), i);	
						}
					}
				}
				i++;
			}

		}
	}
	
	/**
	 * Checks that there are no duplicated parameter names in the definition of
	 * a software package supported platform.
	 * 
	 * @param swpsp the software package supported platform to check.
	 */
	@Check
	public void checkMSwPackageSupportedPlatform_Parameters(MSwPackageSupportedPlatform swpsp)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();

		int i = 0;

		for (final MParameter parameter : swpsp.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(), parameter,
					  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		MPlatform plt = mesputil.toPlatform(swpsp);
		checkParameterDefaultValues(parameters, plt);
			
	}
	
	/**
	 * Checks that there are no duplicates in the definition of a software
	 * package.
	 * 
	 * @param aswp the software package to check.
	 */
	@Check
	public void checkMSwPackage_DuplicatedProvidedInterfaces(MAbstractSwPackage aswp)
	{
		Set<MSwInterface> interfaces = new HashSet<MSwInterface>();
		
		int i = 0;
		
		for (MSwPackageProvidedInterface iface : aswp.getProvides())
		{
			if (iface.getSwinterface().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (interfaces.add(iface.getSwinterface()) == false)
			{
				error("Duplicated provided interface: " +
					  MESPStringHelper.getDefault().getElementName(iface.getSwinterface()),
					  mespswpPackage.eINSTANCE.getMAbstractSwPackage_Provides(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the definition of a software
	 * package.
	 * 
	 * @param swp the software package to check.
	 */
	@Check
	public void checkMSwPackageRequiredInterfacesList_DuplicatedInterfaces(MSwPackage swp)
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		Set<MOSSwInterface> osswis = new HashSet<MOSSwInterface>();

		int i = 0;
		
		for (MSwPackageRequiredInterface iface : swp.getRequires())
		{
			if (iface.getInterface() == null ||
				iface.getInterface().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (iface.getInterface() instanceof MSwInterface)
			{
				if (swis.add((MSwInterface) iface.getInterface()) == false)
				{
					error("Duplicated required interface: " +
						  MESPStringHelper.getDefault().getElementName(iface.getInterface()),
						  mespswpPackage.eINSTANCE.getMSwPackage_Requires(), i);
				}
			}
			else
			{
				if (osswis.add((MOSSwInterface) iface.getInterface()) == false)
				{
					error("Duplicated required interface: " +
						  MESPStringHelper.getDefault().getElementName(iface.getInterface()),
						  mespswpPackage.eINSTANCE.getMSwPackage_Requires(), i);
				}
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the definition of a software
	 * package supported platform.
	 * 
	 * @param swswp the software package supported platform to check.
	 */
	@Check
	public void checkMSwPackageSupportedPlatform_DuplicatedInterfaces(MSwPackageSupportedPlatform swpsp)
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		Set<MOSSwInterface> osswis = new HashSet<MOSSwInterface>();

		int i = 0;
		
		for (MSwPackageRequiredInterface iface : swpsp.getRequires())
		{
			if (iface.getInterface() == null ||
				iface.getInterface().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (iface.getInterface() instanceof MSwInterface)
			{
				if (swis.add((MSwInterface) iface.getInterface()) == false)
				{
					error("Duplicated required interface: " +
						  MESPStringHelper.getDefault().getElementName(iface.getInterface()),
						  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Requires(), i);
				}
			}
			else
			{
				if (osswis.add((MOSSwInterface) iface.getInterface()) == false)
				{
					error("Duplicated required interface: " +
						  MESPStringHelper.getDefault().getElementName(iface.getInterface()),
						  mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Requires(), i);
				}
			}
			i++;
		}
	}
	
	/**
	 * Checks the values assigned to the parameters of the interfaces provided
	 * by a given software package.
	 * 
	 * This parameters may have dependencies on other parameters.
	 * 
	 * @param aswp the provided software interface declaration.
	 */
	@Check
	public void checkMAbstractSwPackage_ValueAssignments(MAbstractSwPackage aswp)
	{	
		// If the package is a regular one, we have to deal with the
		// supported platforms
		if (aswp instanceof MSwPackage)
		{
			MSwPackage swp = (MSwPackage) aswp;
			
			for (MSwPackageProvidedInterface pswi : swp.getProvides())
			{
				if (pswi.getSwinterface() == null ||
					pswi.getSwinterface().eIsProxy() == true)
				{
					continue;
				}
				
				for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
				{
					Map<MParameter, MParameterValueAssignment> assignments = 
							new HashMap<MParameter, MParameterValueAssignment>();
					MPlatform plt = mesputil.toPlatform(swpsp);
					
					for (MAbstractSwPackage parentSwP : aswp.getInherits())
					{
						if (parentSwP == null ||
							parentSwP.eIsProxy() == true)
						{
							continue;
						}
						assignments.putAll(mesputil.getMapAllParameterValueAssignments(parentSwP,
							pswi.getSwinterface()));
					}
					
					Set<MParameter> local = new HashSet<MParameter>();
					
					int i = 0;
					
					for (MParameterValueAssignment pva : pswi.getParameterValueAssignments())
					{
						if (pva.getParameter() == null ||
							pva.getParameter().eIsProxy() == true)
						{
							continue;
						}
						else if (local.add(pva.getParameter()) == false)
						{
							error("Duplicated assignment on the same parameter: " + pva.getParameter().getName(),
									pswi, mespswpPackage.eINSTANCE.getMSwPackageProvidedInterface_ParameterValueAssignments(), i);
						}
						else
						{
							assignments.put(pva.getParameter(), pva);
						}
					}
					checkParameterValueAssignments(assignments, plt);
				}
			}
		}
		else
		{
			for (MSwPackageProvidedInterface pswi : aswp.getProvides())
			{
				if (pswi.getSwinterface() == null ||
					pswi.getSwinterface().eIsProxy() == true)
				{
					continue;
				}
				
				Map<MParameter, MParameterValueAssignment> assignments = 
						new HashMap<MParameter, MParameterValueAssignment>();
				
				for (MAbstractSwPackage parentSwP : aswp.getInherits())
				{
					if (parentSwP == null ||
						parentSwP.eIsProxy() == true)
					{
						continue;
					}
					assignments.putAll(mesputil.getMapAllParameterValueAssignments(parentSwP,
						pswi.getSwinterface()));
				}
				
				Set<MParameter> local = new HashSet<MParameter>();
				
				int i = 0;
				
				for (MParameterValueAssignment pva : pswi.getParameterValueAssignments())
				{
					if (pva.getParameter() == null ||
						pva.getParameter().eIsProxy() == true)
					{
						continue;
					}
					else if (local.add(pva.getParameter()) == false)
					{
						error("Duplicated assignment on the same parameter: " + pva.getParameter().getName(),
								pswi, mespswpPackage.eINSTANCE.getMSwPackageProvidedInterface_ParameterValueAssignments(), i);
					}
					else
					{
						assignments.put(pva.getParameter(), pva);
					}
				}
				checkParameterValueAssignments(assignments);					

			}
		}
	}
	
	/**
	 * Checks that a parameter defined by a software package whose default value
	 * depends on its different supported platforms is well defined.
	 * 
	 * This means that for each of the supported platforms, one and only one
	 * default value is assigned.
	 * 
	 * @param paramSwitch the parameter.
	 */
	@Check
	public void checkMParameterSWPSPSwitch_ParameterDefinition(MParameterSWPSPSwitch paramSwitch)
	{
		MSwPackage swp = (MSwPackage) paramSwitch.eContainer();
		Map<MSwPackageSupportedPlatform, MParameterSWPSPSwitchCase> pltCase = 
				new HashMap<MSwPackageSupportedPlatform, MParameterSWPSPSwitchCase>();
		
		int i = 0;
		
		for (MParameterSWPSPSwitchCase paramCase : paramSwitch.getCases())
		{
			if (paramCase.getPlatform() == null ||
				paramCase.getPlatform().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (pltCase.put(paramCase.getPlatform(), paramCase) != null)
			{
				error("Duplicated default value for the same supported platform: " + paramCase.getPlatform().getName(),
						paramSwitch, mespswpPackage.eINSTANCE.getMParameterSWPSPSwitch_Cases(), i);
			}
		}
		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{
			if (pltCase.get(swpsp) == null)
			{
				error("Missing default value for supported platform " + swpsp.getName(),
						paramSwitch, mespswpPackage.eINSTANCE.getMParameterSWPSPSwitch_Cases(), -1);							
			}
		}
	}
	
	/**
	 * Checks that all the parameters with a default value depending on
	 * the supported platforms of a software package are properly defined.
	 * 
	 * @param aswp the software package to check.
	 */
	@Check
	public void checkMAbstractSwPackage_Parameters(MAbstractSwPackage aswp)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();

		int i = 0;
		
		for (final MParameter parameter : aswp.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(), parameter,
					  mespswpPackage.eINSTANCE.getMAbstractSwPackage_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}

		if (aswp instanceof MSwPackage)
		{
			MSwPackage swp = (MSwPackage) aswp;
			for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
			{
				MPlatform plt = mesputil.toPlatform(swpsp);
				checkParameterDefaultValues(parameters, plt);
			}
		}
	}
	
	
	/**
	 * Checks that there are no duplicated names on the supported devices list
	 * of a driver software package supported platform.
	 * 
	 * @param drvsp the driver software package supported platform to check.
	 */
	@Check
	public void checkMDriverSwPackageSupportedPlatform_DuplicatedSupportedDeviceNames(MDriverSwPackageSupportedPlatform drvsp)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MDriverSwPackageSupportedDevice supportedDevice : drvsp.getSupportedDevices())
		{
			if (names.add(StringHelper.toLowerDefString(supportedDevice.getName())) == false)
			{
				error("Duplicated supported device name: " +
						supportedDevice.getName(),
					  mespswpPackage.eINSTANCE.getMDriverSwPackageSupportedPlatform_SupportedDevices(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that the board is selected before any supported device is
	 * defined and that the board supports the devices.
	 * @param drvsp the driver software package supported platform to
	 * check.
	 */
	@Check
	public void checkMDriverSwPackageSupportedPlatform_supportedDevices(MDriverSwPackageSupportedPlatform drvsp)
	{
		if (drvsp.getSupportedDevices().isEmpty() == false &&
			(drvsp.getBoard() == null || drvsp.getBoard().eIsProxy() == true))
		{
			error("The board must be defined in order to declare supported devices",
				mespswpPackage.eINSTANCE.getMSwPackageSupportedPlatform_Board());
			return;
		}
		
		for (MDriverSwPackageSupportedDevice sdevice : drvsp.getSupportedDevices())
		{
			if (sdevice.getDevice() == null ||
				sdevice.getDevice().eIsProxy() == true)
			{
				continue;
			}
			if (pdlutil.getBoardSupportedDevices(drvsp.getBoard()).contains(sdevice.getDevice()) == false)
			{
				error("The board does not support the selected device",
						sdevice,
						mespswpPackage.eINSTANCE.getMDriverSwPackageSupportedDevice_Device(), -1);
			}
		}
			
	}
		
}
