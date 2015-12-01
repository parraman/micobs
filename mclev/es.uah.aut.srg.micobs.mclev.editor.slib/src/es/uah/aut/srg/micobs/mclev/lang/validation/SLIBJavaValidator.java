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
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class SLIBJavaValidator extends MICOBSAbstractJavaValidator {

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
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevslib"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevcommon"));
		return result;
	}
	
	public static final String IMPROPER_SLIBSUPPORTEDPLATFORM_NAME = "0";
	
	/**
	 * Checks that the name of a supported platform of a service library
	 * conforms to the naming standard. It produces a warning otherwise.
	 * @param slsp the supported platform to check.
	 */
	@Check
	public void checkMServiceLibrarySupportedPlatform_Naming(MServiceLibrarySupportedPlatform slsp) {
		
		if (slsp.getName() != null &&
			MCLEVStringHelper.getDefault().getProperName(slsp) != null &&
			slsp.getName().matches(MCLEVStringHelper.getDefault().getProperName(slsp)) == false)
		{
			warning("Supported Platform name does not match the recommended one",
				    commonPackage.eINSTANCE.getMCommonReferenceableObj_Name(),
				    IMPROPER_SLIBSUPPORTEDPLATFORM_NAME,
				    slsp.getName(),
				    MCLEVStringHelper.getDefault().getProperName(slsp));
		}
		
	}
	
	/**
	 * Global check of the extended service libraries. This function checks
	 * that the languages and platforms do match. Implements Restrictions TBD.
	 * @param slib the service library to check.
	 */
	@Check
	void checkMServiceLibrary_ExtendedLibraries(MServiceLibrary slib)
	{
		if (slib.getExtends().isEmpty())
		{
			return;
		}
		
		int i = 0;
		boolean found = false;
		for (MServiceLibrary eswp : slib.getExtends())
		{
			if (eswp.eIsProxy() == true)
			{
				i++;
				continue;
			}
			
			found = false;

			for (MServiceLibrarySupportedPlatform extendedSWPSP : eswp.getSupportedPlatforms())
			{		
				for (MServiceLibrarySupportedPlatform swsp : slib.getSupportedPlatforms())
				{
					if (MCLEVUtil.getDefault().platformIntersection(swsp, extendedSWPSP))
					{
						found = true;
						break;
					}
				}
			}
			
			if (found == false)
			{
				error("There are no compatible implementations with the service library " +
					  MCLEVStringHelper.getDefault().getElementName(eswp),
					  slib, mclevslibPackage.eINSTANCE.getMServiceLibrary_Extends(), i);
			}
			
			i++;
		}
	}
	
	/**
	 * Checks that the interfaces are of the languages of the library or of
	 * one of the languages they extend. Implements Restriction TBD.
	 * @param slib the service library to check.
	 */
	void checkMServiceLibrary_InterfacesSupportLanguages(MServiceLibrary slib)
	{
		int i = 0;

		for (MServiceLibraryProvidedSAI psai : slib.getProvides())
		{
			MSAI sai = psai.getSai();
			if (sai == null ||
				sai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			boolean found = false;
			for (MLanguage language : slib.getLanguages())
			{
				if (language.eIsProxy() == false && 
					(language == sai.getLanguage() ||
					MCLEVUtil.getDefault().getAllParentLanguages(language).contains(sai.getLanguage()) == true))
				{
					found = true;
					break;
				}
			}

			if (found == false)
			{
				error("Language " +
						  MCLEVStringHelper.getDefault().getElementName(sai.getLanguage()) + 
						  " is not supported by the service library",
						  slib,
						  mclevslibPackage.eINSTANCE.getMAbstractServiceLibrary_Provides(), i);
			}
			i++;
		}
		
		i = 0;
		for (MSAI sai : slib.getRequires())
		{
			if (sai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			boolean found = false;
			for (MLanguage language : slib.getLanguages())
			{
				if (language.eIsProxy() == false && 
					(language == sai.getLanguage() ||
					MCLEVUtil.getDefault().getAllParentLanguages(language).contains(sai.getLanguage()) == true))
				{
					found = true;
					break;
				}
			}
			if (found == false)
			{
				error("Language " +
					  MCLEVStringHelper.getDefault().getElementName(sai.getLanguage()) + 
					  " is not supported by the service library",
					  slib, mclevslibPackage.eINSTANCE.getMServiceLibrary_Requires(), i);
			}
			i++;
		}

		for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
		{
			i = 0;
			boolean found = false;
			for (MSAI sai : slsp.getRequires())
			{
				if (sai.eIsProxy() == true)
				{
					i++;
					continue;
				}
				found = false;
				for (MLanguage language : slib.getLanguages())
				{
					if (language.eIsProxy() == false && 
						(language == sai.getLanguage() ||
						MCLEVUtil.getDefault().getAllParentLanguages(language).contains(sai.getLanguage()) == true))
					{
						found = true;
						break;
					}
				}
				
				if (found == false)
				{
					for (MLanguage language : slsp.getLanguages())
					{
						if (language.eIsProxy() == false && 
							(language == sai.getLanguage() ||
							MCLEVUtil.getDefault().getAllParentLanguages(language).contains(sai.getLanguage()) == true))
						{
							found = true;
							break;
						}
					}
					if (found == false)
					{
						error("Language " +
							  MCLEVStringHelper.getDefault().getElementName(sai.getLanguage()) + 
							  " is not supported by the service library",
							  slsp, mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Requires(), i);
					}
				}
				i++;
			}
			
			if (slsp.getOsapi() != null &&
				slsp.getOsapi().eIsProxy() == false)
			{
				found = false;
				for (MLanguage language : slib.getLanguages())
				{
					if (language.eIsProxy() == false && 
						(language == slsp.getOsapi().getLanguage() ||
						MCLEVUtil.getDefault().getAllParentLanguages(language).contains(slsp.getOsapi().getLanguage()) == true))
					{
						found = true;
						break;
					}
				}
				
				if (found == false)
				{
					for (MLanguage language : slsp.getLanguages())
					{
						if (language.eIsProxy() == false && 
							(language == slsp.getOsapi().getLanguage() ||
							MCLEVUtil.getDefault().getAllParentLanguages(language).contains(slsp.getOsapi().getLanguage()) == true))
						{
							found = true;
							break;
						}
					}
					if (found == false)
					{
						error("Language " +
								MCLEVStringHelper.getDefault().getElementName(slsp.getOsapi().getLanguage()) + 
								" is not supported by the service library",
								mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Osapi());
					}
				}
			}
		}
		
	}
	
	/**
	 * Checks that there are no duplicates in the list of parent libraries of a
	 * service library.
	 * @param slib the service library to check.
	 */
	@Check
	void checkMAbstractServiceLibrary_DuplicatedInheritanceOrExtension(MAbstractServiceLibrary slib)
	{
		Set<MAbstractServiceLibrary> inherited = new HashSet<MAbstractServiceLibrary>();
		
		int i = 0;
		for (MAbstractServiceLibrary islib : slib.getInherits())
		{
			if (inherited.add(islib) == false)
			{
				error("Duplicated parent library: " +
					  MCLEVStringHelper.getDefault().getElementName(islib),
					  slib, mclevslibPackage.eINSTANCE.getMAbstractServiceLibrary_Inherits(), i);
			}
			i++;
		}
		
		if (slib instanceof MServiceLibrary)
		{
			Set<MServiceLibrary> extended = new HashSet<MServiceLibrary>();

			i = 0;
			for (MServiceLibrary eslib : ((MServiceLibrary)slib).getExtends())
			{
				if (inherited.contains(eslib) == true)
				{
					error("Service library " +
						  MCLEVStringHelper.getDefault().getElementName(eslib) +
						  " is already being inherited",
						  slib, mclevslibPackage.eINSTANCE.getMServiceLibrary_Extends(), i);
				}
				if (extended.add(eslib) == false)
				{
					error("Duplicated extended library: " +
						  MCLEVStringHelper.getDefault().getElementName(eslib),
						  slib, mclevslibPackage.eINSTANCE.getMServiceLibrary_Extends(), i);
				}
				i++;
			}
		}

	}

	/**
	 * Checks that there are no duplicated supported platform names within a
	 * service library.
	 * Implements Restriction TBD.
	 * @param slib the service library to check
	 */
	@Check
	public void checkMServiceLibrary_DuplicatedSupportedPlatformNames(MServiceLibrary slib)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
		{
			if (names.add(StringHelper.toLowerDefString(slsp.getName())) == false)
			{
				error("Duplicated supported platform name: " + slsp.getName(),
						mclevslibPackage.eINSTANCE.getMServiceLibrary_SupportedPlatforms(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks the well-formedness of a service library supported platform.
	 * Implements Restrictions 142, 143, 144 and 145.
	 * @param slsp the service library supported platform to check.
	 */
	@Check
	public void checkMServiceLibrarySupportedPlatform_wellformedness(MServiceLibrarySupportedPlatform slsp)
	{
		if (slsp.getOsapi() == null &&
			((slsp.getOs() != null && slsp.getOs().eIsProxy() == false) ||
			 (slsp.getArchitecture() != null && slsp.getArchitecture().eIsProxy() == false) ||
			 (slsp.getMicroprocessor() != null && slsp.getMicroprocessor().eIsProxy() == false) ||
			 (slsp.getBoard() != null && slsp.getBoard().eIsProxy() == false)))
		{
			error("If the OSAPI is undefined, the rest of the fields must also be undefined",
				  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Osapi());
		}
		if (slsp.getOs() == null &&
			((slsp.getArchitecture() != null && slsp.getArchitecture().eIsProxy() == false) ||
			 (slsp.getMicroprocessor() != null && slsp.getMicroprocessor().eIsProxy() == false) ||
			 (slsp.getBoard() != null && slsp.getBoard().eIsProxy() == false)))
		{
			error("If the OS is undefined, the rest of the fields must also be undefined",
					mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Os());
		}
		if (slsp.getArchitecture() == null &&
			((slsp.getCompiler() != null && slsp.getCompiler().eIsProxy() == false) ||
			 (slsp.getMicroprocessor() != null && slsp.getMicroprocessor().eIsProxy() == false) ||
			 (slsp.getBoard() != null && slsp.getBoard().eIsProxy() == false)))
		{
			error("If the architecture is undefined, the compiler, the microprocessor and the board must also be undefined",
				mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Architecture());
		}
		if (slsp.getMicroprocessor() == null &&
			(slsp.getBoard() != null && slsp.getBoard().eIsProxy() == false))
		{
			error("If the microprocessor is undefined, the board must also be undefined",
				mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Microprocessor());
		}
	}

	/**
	 * Checks that the operating system of a service library supported
	 * platform supports the selected OSAPI.
	 * Implements Restriction 146.
	 * @param slsp the service library supported platform to check.
	 */
	@Check
	public void checkMServiceLibrarySupportedPlatform_OSSupportsOSAPI(MServiceLibrarySupportedPlatform slsp)
	{
		if (slsp.getOsapi() != null &&
			slsp.getOsapi().eIsProxy() == false &&
			slsp.getOs() != null &&
			slsp.getOs().eIsProxy() == false &&
			!MCLEVUtil.getDefault().getAllSupportedOSAPIs(slsp.getOs()).contains(slsp.getOsapi()))
		{
			error("The operating system " +
				  MCLEVStringHelper.getDefault().getElementName(slsp.getOs())+
				  " does not support the OSAPI " +
				  MCLEVStringHelper.getDefault().getElementName(slsp.getOsapi()),
				  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Os());
		}
	}
	
	/**
	 * Checks that the compiler of a service library supported
	 * platform supports the selected languages.
	 * Implements Restriction TBD.
	 * @param slib the service library to check.
	 */
	@Check
	public void checkMServiceLibrary_CompilerSupport(MServiceLibrary slib)
	{
		if (slib.getLanguages().isEmpty())
		{
			return;
		}
		for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
		{
			if (slsp.getArchitecture() != null &&
				slsp.getArchitecture().eIsProxy() == false && 
				slsp.getCompiler() != null &&
				slsp.getCompiler().eIsProxy() == false)
			{
				for (MLanguage language : slib.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (MCLEVUtil.getDefault().supportsLanguageForArchitecture(slsp.getCompiler(), language, 
							slsp.getArchitecture()) == false)
					{
						error("The compiler " +
							  MCLEVStringHelper.getDefault().getElementName(slsp.getCompiler())+
							  " does not support the language " +
							  MCLEVStringHelper.getDefault().getElementName(language) +
							  " for the architecture " +
							  MCLEVStringHelper.getDefault().getElementName(slsp.getArchitecture()), slsp,
							  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Compiler(), -1);
					}
				}
				for (MLanguage language : slsp.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (MCLEVUtil.getDefault().supportsLanguageForArchitecture(slsp.getCompiler(), language, 
							slsp.getArchitecture()) == false)
					{
						error("The compiler " +
							  MCLEVStringHelper.getDefault().getElementName(slsp.getCompiler())+
							  " does not support the language " +
							  MCLEVStringHelper.getDefault().getElementName(language) +
							  " for the architecture " +
							  MCLEVStringHelper.getDefault().getElementName(slsp.getArchitecture()), slsp,
							  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Compiler(), -1);
					}
				}
			}
		}
	}
	
	/**
	 * Checks that the operating system of a service library supported
	 * platform supports the corresponding platform.
	 * Implements Restriction 147.
	 * @param slsp the service library supported platform to check.
	 */
	@Check
	public void checkMServiceLibrarySupportedPlatform_OSSupport(MServiceLibrarySupportedPlatform slsp)
	{
		if (slsp.getOsapi() == null ||
			slsp.getOsapi().eIsProxy() == true ||
			slsp.getOs() == null ||
			slsp.getOs().eIsProxy() == true ||
			slsp.getArchitecture() == null ||
			slsp.getArchitecture().eIsProxy() == true)
		{
			return;
		}
		
		MOperatingSystem os = slsp.getOs();
		MPlatform platform = pdlFactory.eINSTANCE.createMPlatform();
		platform.setOsapi(slsp.getOsapi());
		platform.setOs(slsp.getOs());
		platform.setArchitecture(slsp.getArchitecture());
		platform.setCompiler(slsp.getCompiler());
		platform.setMicroprocessor(slsp.getMicroprocessor());
		platform.setBoard(slsp.getBoard());
		
		if (!MCLEVUtil.getDefault().supportsPlatform(os, platform))
		{
			error("The implementations of the operating system " +
				  MCLEVStringHelper.getDefault().getElementName(platform.getOs()) +
				  " are not supported by this platform",
				  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Os());

		}
	}

	/**
	 * Checks that the microprocessor and the board of a service library
	 * supported platform are correctly defined.
	 * Implements Restrictions 148 and 149.
	 * @param slsp the service library supported platform to check.
	 */
	@Check
	public void checkMServiceLibrarySupportedPlatform_MpAndBoard(MServiceLibrarySupportedPlatform slsp)
	{
		if (slsp.getArchitecture() != null &&
			slsp.getArchitecture().eIsProxy() == false &&
			slsp.getMicroprocessor() != null &&
			slsp.getMicroprocessor().eIsProxy() == false &&
			slsp.getMicroprocessor().getArchitecture() != slsp.getArchitecture())
		{
			error("Microprocessor " +
				  MCLEVStringHelper.getDefault().getElementName(slsp.getMicroprocessor()) +
				  " does not support the architecture " +
				  MCLEVStringHelper.getDefault().getElementName(slsp.getArchitecture()),
				  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Microprocessor());
		}
		if (slsp.getMicroprocessor() != null &&
			slsp.getMicroprocessor().eIsProxy() == false &&
			slsp.getBoard() != null &&
			slsp.getBoard().eIsProxy() != false &&
			slsp.getBoard().getMicroprocessor() != slsp.getMicroprocessor())
		{
			error("Board " +
				  MCLEVStringHelper.getDefault().getElementName(slsp.getBoard()) +
				  " does not support the microprocessor " +
				  MCLEVStringHelper.getDefault().getElementName(slsp.getMicroprocessor()),
				  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Board());
		}
	}
	
	/**
	 * Checks that the intersection between the supported platforms of a
	 * service library is always zero.
	 * Implements restriction 150.
	 * @param slib the service library to check.
	 */
	@Check
	public void checkMServiceLibrary_SupportedPlatformZeroIntersection(MServiceLibrary slib) {
		
		if (slib.getSupportedPlatforms().size() >= 2)
		{
			int i = 0;
			for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
			{
				if ((slsp.getOsapi() != null && slsp.getOsapi().eIsProxy() == true) ||
					(slsp.getOs() != null && slsp.getOs().eIsProxy() == true) ||
					(slsp.getArchitecture() != null && slsp.getArchitecture().eIsProxy() == true) ||
					(slsp.getCompiler() != null && slsp.getCompiler().eIsProxy() == true) ||
					(slsp.getMicroprocessor() != null && slsp.getMicroprocessor().eIsProxy() == true) ||
					(slsp.getBoard() != null && slsp.getBoard().eIsProxy() == true))
				{
					continue;
				}
				for (Iterator<MServiceLibrarySupportedPlatform> q = slib.getSupportedPlatforms().iterator(); q.hasNext(); )
				{
					MServiceLibrarySupportedPlatform otherSLSP = q.next();
					if (slsp == otherSLSP)
					{
						continue;
					}
					if ((otherSLSP.getOsapi() != null && otherSLSP.getOsapi().eIsProxy() == true) ||
						(otherSLSP.getOs() != null && otherSLSP.getOs().eIsProxy() == true) ||
						(otherSLSP.getArchitecture() != null && otherSLSP.getArchitecture().eIsProxy() == true) ||
						(otherSLSP.getCompiler() != null && otherSLSP.getCompiler().eIsProxy() == true) ||
						(otherSLSP.getMicroprocessor() != null && otherSLSP.getMicroprocessor().eIsProxy() == true) ||
						(otherSLSP.getBoard() != null && otherSLSP.getBoard().eIsProxy() == true))
					{
						continue;
					}
					if (MCLEVUtil.getDefault().platformIntersection(slsp, otherSLSP))
					{
						error("Supported Platforms intersection is not zero", slib,
							  mclevslibPackage.eINSTANCE.getMServiceLibrary_SupportedPlatforms(), i);
					}
					i++;
				}
			}
		}
	}

	
	/**
	 * Checks that the interfaces belonging of the complete set of provided
	 * interfaces are not included in the set of required interfaces.
	 * Implements Restriction 151m.
	 * @param slib the service library to check.
	 */
	@Check
	public void checkMServiceLibrary_DuplicatedInterfaceAndLoop(MServiceLibrary slib)
	{
		
		Set<MSAI> providedInterfaces = new HashSet<MSAI>();
		Set<MSAI> extendedInterfaces = new HashSet<MSAI>();
		
		for (MAbstractServiceLibrary parent : slib.getInherits())
		{
			if (parent.eIsProxy() == true)
			{
				continue;
			}
			providedInterfaces.addAll(MCLEVUtil.getDefault().getAllProvidedSAIs(parent));
		}
		
		// Now we have to check if the extended libraries implement any of the
		// interfaces obtained from the inherited libraries
		int i = 0;
		for (MServiceLibrary extended : slib.getExtends())
		{
			if (extended.eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (MSAI sai : MCLEVUtil.getDefault().getAllProvidedSAIs(extended))
			{
				if (extendedInterfaces.add(sai) == false)
				{
					error("SAI " +
						  MCLEVStringHelper.getDefault().getElementName(sai) +
						  " is alredy implemented by another extended library", 
						  mclevslibPackage.eINSTANCE.getMServiceLibrary_Extends(), i);	
				}
				if (providedInterfaces.contains(sai) == true)
				{
					error("SAI " +
						  MCLEVStringHelper.getDefault().getElementName(sai) +
						  " is alredy being inherited", 
						  mclevslibPackage.eINSTANCE.getMServiceLibrary_Extends(), i);	
				}
			}
			i++;
		}

		i = 0;
		for (MServiceLibraryProvidedSAI psai : slib.getProvides())
		{
			MSAI sai = psai.getSai();
			if (sai == null ||
				sai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (extendedInterfaces.contains(sai) == true)
			{
				error("SAI " +
					  MCLEVStringHelper.getDefault().getElementName(sai) +
				      " is alredy implemented by an extended library", 
				      mclevslibPackage.eINSTANCE.getMServiceLibrary_Extends(), i);	
			}
			if (providedInterfaces.add(sai) == false)
			{
				error("Service library " +
					  MCLEVStringHelper.getDefault().getElementName(sai) +
					  " is alredy being inherited", 
					  mclevslibPackage.eINSTANCE.getMServiceLibrary_Extends(), i);	
			}
			i++;
		}
		
		i = 0;
		for (MSAI sai : slib.getRequires())
		{
			if (sai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (providedInterfaces.contains(sai) == true)
			{
				error("SAI " +
					  MCLEVStringHelper.getDefault().getElementName(sai) +
					  " is both provided and required", 
					  mclevslibPackage.eINSTANCE.getMServiceLibrary_Requires(), i);	
			}
			else
			{
				for (MSAI psai : MCLEVUtil.getDefault().getAllExtendedSAIs(sai))
				{
					if (providedInterfaces.contains(psai) == true)
					{
						error("SAI " +
							  MCLEVStringHelper.getDefault().getElementName(psai) +
							  " is both provided and required", 
							  mclevslibPackage.eINSTANCE.getMServiceLibrary_Requires(), i);	
					}
				}
			}
			i++;
		}

		for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
		{	
			i = 0;
			for (MSAI sai : slsp.getRequires())
			{
				if (sai.eIsProxy() == true)
				{
					i++;
					continue;
				}
				if (providedInterfaces.contains(sai) == true)
				{
					error("Interface " +
						  MCLEVStringHelper.getDefault().getElementName(sai) +
						  " is both provided and required",
						  slsp,
						  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Requires(), i);	
				}
				else
				{
					for (MSAI psai : MCLEVUtil.getDefault().getAllExtendedSAIs(sai))
					{
						if (providedInterfaces.contains(psai) == true)
						{
							error("SAI " +
								  MCLEVStringHelper.getDefault().getElementName(psai) +
								  " is both provided and required", slsp,
								  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Requires(), i);	
						}
					}
				}
				i++;
			}
		}

	}
	
	/**
	 * Checks that there are no duplicated parameter names within the parameter
	 * list of a software resource supported platform.
	 * Implements Restriction 152b.
	 * @param aslib the service library to check.
	 */
	@Check
	public void checkMServiceLibrary_DuplicatedAttributeNames(MAbstractServiceLibrary aslib)
	{		
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MParameter param : aslib.getAttributes())
		{	
			if (names.add(StringHelper.toLowerDefString(param.getName())) == false)
			{
				error("Duplicated attribute name: " + param.getName(), 
						mclevslibPackage.eINSTANCE.getMAbstractServiceLibrary_Attributes(), i);	
			}
			i++;
		}
	}

	/**
	 * Checks that there are no duplicated parameter names within the parameter
	 * list of a software resource supported platform.
	 * Implements Restriction 152b.
	 * @param slibsp the software resource to check.
	 */
	@Check
	public void checkMServiceLibrarySupportedPlatform_DuplicatedAttributeNames(MServiceLibrarySupportedPlatform slibsp)
	{		
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MParameter param : slibsp.getAttributes())
		{	
			if (names.add(StringHelper.toLowerDefString(param.getName())) == false)
			{
				error("Duplicated parameter name: " + param.getName(), 
						mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Attributes(), i);	
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the provided and required
	 * SAIs lists of a service library.
	 * @param slib the service library to check.
	 */
	@Check
	public void checkMServiceLibrary_DuplicatedInterfaces(MServiceLibrary slib)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		int i = 0;

		for (MServiceLibraryProvidedSAI psai : slib.getProvides())
		{
			if (psai.getSai() != null &&
				psai.getSai().eIsProxy() == false &&
				sais.add(psai.getSai()) == false)
			{
				error("Duplicated provided SAI: " +
					  MCLEVStringHelper.getDefault().getElementName(psai.getSai()), 
					  slib,
					  mclevslibPackage.eINSTANCE.getMAbstractServiceLibrary_Provides(), i);
			}
			i++;
		}

		i = 0;
		sais.clear();
		
		for (MSAI sai : slib.getRequires())
		{
			if (sais.add(sai) == false)
			{
				error("Duplicated required SAI: " +
					  MCLEVStringHelper.getDefault().getElementName(sai), slib,
					  mclevslibPackage.eINSTANCE.getMServiceLibrary_Requires(), i);
			}
			i++;
		}
	}

	/**
	 * Checks that there are no duplicates in the required SAIs list of
	 * a service library supported platform.
	 * @param slsp the service library supported platform to check.
	 */
	@Check
	public void checkMServiceLibrarySupportedPlatform_DuplicatedInterfaces(MServiceLibrarySupportedPlatform slsp)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		int i = 0;
			
		for (MSAI sai : slsp.getRequires())
		{
			if (sais.add(sai) == false)
			{
				error("Duplicated required SAI: " +
					  MCLEVStringHelper.getDefault().getElementName(sai), slsp,
					  mclevslibPackage.eINSTANCE.getMServiceLibrarySupportedPlatform_Requires(), i);
			}
			i++;
		}
	}


}
