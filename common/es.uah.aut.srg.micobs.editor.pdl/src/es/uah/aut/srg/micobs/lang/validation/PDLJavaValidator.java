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
package es.uah.aut.srg.micobs.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.MDevice;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.pdl.util.IPDLUtil;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLStringHelper;
import es.uah.aut.srg.micobs.pdl.xtext.PDLAbstractJavaValidator;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class PDLJavaValidator extends PDLAbstractJavaValidator {

	@Inject
	protected IPDLUtil pdlutil;

	@Override
	public ILibraryManager getFileLibraryManager() throws LibraryManagerException {
		return PDLLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/pdl"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
		return result;
	}
	
	public static final String IMPROPER_OSSUPPORTEDPLATFORM_NAME = "0";
	
	/**
	 * Checks that the name of a supported platform of an operating system
	 * conforms to the naming standard. It produces a warning otherwise.
	 * @param ossp the operating system supported platform to check.
	 */
	@Check
	public void checkMOSSupportedPlatform_Naming(MOSSupportedPlatform ossp) {
		
		if (ossp.getName() != null &&
			PDLStringHelper.getInstance().getProperName(ossp) != null &&
			ossp.getName().matches(PDLStringHelper.getInstance().getProperName(ossp)) == false)
		{
			warning("Supported Platform name does not match the recommended one",
				    commonPackage.eINSTANCE.getMCommonReferenceableObj_Name(),
				    IMPROPER_OSSUPPORTEDPLATFORM_NAME, ossp.getName(),
				    PDLStringHelper.getInstance().getProperName(ossp));
		}
		
	}
	
	/**
	 * Checks that there are no duplicates in the languages list of an
	 * operating system.
	 * 
	 * @param os the operating system to check.
	 */
	@Check
	public void checkMSwPackage_DuplicatedLanguage(MOperatingSystem os) {
		
		Set<MLanguage> langs = new HashSet<MLanguage>();
		
		int i = 0;
		for (MLanguage lang : os.getLanguages())
		{
			if (lang.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (langs.add(lang) == false)
			{
				error("Duplicated language: " +
					  PDLStringHelper.getInstance().getElementName(lang),
					   os, pdlPackage.eINSTANCE.getMOperatingSystem_Languages(), i);
			}
			i++;
		}
		
		for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
		{
			i = 0;
			langs.clear();
			
			for (MLanguage lang : ossp.getLanguages())
			{
				if (lang.eIsProxy() == true)
				{
					i++;
					continue;
				}
				if (langs.add(lang) == false)
				{
					error("Duplicated language: " +
						  PDLStringHelper.getInstance().getElementName(lang),
						   ossp, pdlPackage.eINSTANCE.getMOSSupportedPlatform_Languages(), i);
				}
				i++;
			}
		}

	}
	
	/**
	 * Checks that there are no duplicated supported platform names within a
	 * operating system software package.
	 * @param os the software package to check
	 */
	@Check
	public void checkMOperatingSystem_DuplicatedSupportedPlatformNames(MOperatingSystem os)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
		{
			if (names.add(StringHelper.toLowerDefString(ossp.getName())) == false)
			{
				error("Duplicated supported platform name: " + ossp.getName(),
						pdlPackage.eINSTANCE.getMOperatingSystem_SupportedPlatforms(), i);
			}
			i++;
		}
	}
	
	public static final String IMPROPER_PLATFORM_NAME = "1";
	
	/**
	 * Checks that the name of a platform conforms to the naming standard.
	 * It produces a warning otherwise.
	 * @param platform the platform to check.
	 */
	@Check
	public void checkMPlatform_Naming(MPlatform platform) {
		
		if (platform.getName() != null &&
			PDLStringHelper.getInstance().getProperName(platform) != null &&
			platform.getName().matches(PDLStringHelper.getInstance().getProperName(platform)) == false)
		{
			warning("Platform name does not match the recommended one",
				    commonPackage.eINSTANCE.getMCommonPackageElement_Name(),
				    IMPROPER_PLATFORM_NAME, 
				    platform.getName(),
				    PDLStringHelper.getInstance().getProperName(platform));
		}
		
	}
	
	/**
	 * Checks that there is at least one supported platform that intersects
	 * with the supported platforms of the inherited operating systems.
	 * @param os the operating system to check.
	 */
	@Check
	public void checkMOperatingSystem_InheritedOSs(MOperatingSystem os) {
		
		int i = 0;
		for (MOperatingSystem extended : os.getInherits())
		{
			if (extended.eIsProxy() == true)
			{
				i++;
				continue;
			}
			
			boolean found = false;
			for (MOSSupportedPlatform extendedOSSP : extended.getSupportedPlatforms())
			{		
				for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
				{
					if (pdlutil.platformIntersection(ossp, extendedOSSP))
					{
						found = true;
						break;
					}
				}
			}
			if (found == false)
			{
				error("There are no compatible implementations with the operating system " +
					  PDLStringHelper.getInstance().getElementName(extended),
					  pdlPackage.eINSTANCE.getMOperatingSystem_Inherits(), i);
			}
			i++;
		}
	}

	
	/**
	 * Checks the well-formedness of an operating system supported platform.
	 * @param ossp the operating system supported platform to check.
	 */
	@Check
	public void checkMOperatingSystem_OSSPWellformedness(MOSSupportedPlatform ossp) {
		
		if (ossp.getMicroprocessor() == null &&
			ossp.getBoard() != null &&
			ossp.getBoard().eIsProxy() == false)
		{
			error("A microprocessor must be defined if a board is",
				  pdlPackage.eINSTANCE.getMOSSupportedPlatform_Microprocessor());
		}
		if (ossp.getArchitecture() != null &&
			ossp.getArchitecture().eIsProxy() == false &&
			ossp.getMicroprocessor() != null &&
			ossp.getMicroprocessor().eIsProxy() == false &&
			ossp.getMicroprocessor().getArchitecture() != ossp.getArchitecture())
		{
			error("The microprocessor must support the selected architecture",
				  pdlPackage.eINSTANCE.getMOSSupportedPlatform_Microprocessor());
		}				
		if (ossp.getMicroprocessor() != null &&
			ossp.getMicroprocessor().eIsProxy() == false &&
			ossp.getBoard() != null &&
			ossp.getBoard().eIsProxy() == false &&
			ossp.getBoard().getMicroprocessor() != ossp.getMicroprocessor())
		{
			error("Board must support selected Microprocessor",
				  pdlPackage.eINSTANCE.getMOSSupportedPlatform_Board());
		}
	}
	
	/**
	 * Checks that the compiler of an operating system supported
	 * platform supports the selected languages.
	 * @param os the operating system to check.
	 */
	@Check
	public void checkMOperatingSystem_CompilerSupport(MOperatingSystem os)
	{
		for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
		{
			if (ossp.getArchitecture() != null &&
				ossp.getArchitecture().eIsProxy() == false && 
				ossp.getCompiler() != null &&
				ossp.getCompiler().eIsProxy() == false)
			{
				for (MLanguage language : os.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (pdlutil.supportsLanguageForArchitecture(ossp.getCompiler(), language, 
							ossp.getArchitecture()) == false)
					{
						error("The compiler " +
							  PDLStringHelper.getInstance().getElementName(ossp.getCompiler())+
							  " does not support the language " +
							  PDLStringHelper.getInstance().getElementName(language) +
							  " for the architecture " +
							  PDLStringHelper.getInstance().getElementName(ossp.getArchitecture()), ossp,
							  pdlPackage.eINSTANCE.getMOSSupportedPlatform_Compiler(), -1);
					}
				}
				for (MLanguage language : ossp.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (pdlutil.supportsLanguageForArchitecture(ossp.getCompiler(), language, 
							ossp.getArchitecture()) == false)
					{
						error("The compiler " +
							  PDLStringHelper.getInstance().getElementName(ossp.getCompiler())+
							  " does not support the language " +
							  PDLStringHelper.getInstance().getElementName(language) +
							  " for the architecture " +
							  PDLStringHelper.getInstance().getElementName(ossp.getArchitecture()), ossp,
							  pdlPackage.eINSTANCE.getMOSSupportedPlatform_Compiler(), -1);
					}
				}
			}
		}

	}
	
	
	/**
	 * Checks that the user does not include the same API twice and that the
	 * selected OSAPI's language is on the list of languages of the OS.
	 * @param os the operating system to check.
	 */
	@Check
	public void checkMOperatingSystem_CorrectOSAPI(MOperatingSystem os) {
		
		Set<MOperatingSystemAPI> providedOSAPIs = new HashSet<MOperatingSystemAPI>();
	
		int i = 0;
		
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			MOperatingSystemAPI osapi = sosapi.getOsapi();
			
			if (osapi.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (providedOSAPIs.add(osapi) == false)
			{
				error("Duplicated OSAPI: " +
					  PDLStringHelper.getInstance().getElementName(osapi),
					  os,
					  pdlPackage.eINSTANCE.getMOperatingSystem_SupportedOSAPIs(), i);
			}
			else if (os.getLanguages().contains(osapi.getLanguage()) == false)
			{
				error("Language " + PDLStringHelper.getInstance().getElementName(osapi.getLanguage()) +
					  " of OSAPI " + PDLStringHelper.getInstance().getElementName(osapi) + 
					  " is not supported by the operating system",
					  pdlPackage.eINSTANCE.getMOperatingSystem_SupportedOSAPIs(), i);
			}
			i++;
		}
		
		i = 0;
		for (MOperatingSystem parent : os.getInherits())
		{
			for (MOperatingSystemAPI parentOSAPI : pdlutil.getAllSupportedOSAPIs(parent))
			{
				if (providedOSAPIs.add(parentOSAPI) == false)
				{
					error("OSAPI " +
						  PDLStringHelper.getInstance().getElementName(parentOSAPI) + 
						  " is already being provided by the operating system " +
						  PDLStringHelper.getInstance().getElementName(parent),
						  pdlPackage.eINSTANCE.getMOperatingSystem_Inherits(), i);
				}
			}
			i++;
		}
	}
	
	/**
	 * Checks that the intersection between the supported platforms of an
	 * operating system is always zero.
	 * @param os the operating system to check.
	 */
	@Check
	public void checkMOperatingSystem_SupportedPlatformZeroIntersection(MOperatingSystem os) {
		
		if (os.getSupportedPlatforms().size() >= 2)
		{
			int i = 0;
			for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
			{
				if (ossp.getArchitecture() == null ||
					ossp.getArchitecture().eIsProxy() == true ||
					ossp.getCompiler() == null ||
					ossp.getCompiler().eIsProxy() ||
					(ossp.getMicroprocessor() != null &&
					 ossp.getMicroprocessor().eIsProxy() == true) ||
					(ossp.getBoard() != null &&
					 ossp.getBoard().eIsProxy() == true))
				{
					continue;
				}
			
				for (MOSSupportedPlatform otherOSSP : os.getSupportedPlatforms())
				{
					if (ossp == otherOSSP)
					{
						continue;
					}
					if (otherOSSP.getArchitecture() == null ||
						otherOSSP.getArchitecture().eIsProxy() == true ||
						otherOSSP.getCompiler() == null ||
						otherOSSP.getCompiler().eIsProxy() ||
						(otherOSSP.getMicroprocessor() != null &&
						otherOSSP.getMicroprocessor().eIsProxy() == true) ||
						(otherOSSP.getBoard() != null &&
						otherOSSP.getBoard().eIsProxy() == true))
					{
							continue;
					}
					if (pdlutil.platformIntersection(ossp, otherOSSP))
					{
						error("OS Supported Platforms intersection is not zero", os,
							  pdlPackage.eINSTANCE.getMOperatingSystem_SupportedPlatforms(), i);						
					}
				}
				i++;
			}
		}
	}
	
	
	/**
	 * Checks that the OSAPI selected for a platform is supported by the
	 * assigned operating system.
	 * @param platform the platform to check.
	 */
	@Check
	public void checkMPlatform_OSProvidesOSAPI(MPlatform platform)
	{
		if (platform.getOs() != null &&
			platform.getOs().eIsProxy() == false &&
			!(pdlutil.getAllSupportedOSAPIs(platform.getOs()).contains(
				platform.getOsapi())))
		{
			error("Operating system " +
				  PDLStringHelper.getInstance().getElementName(platform.getOs()) +
				  " does not provide osapi " +
				  PDLStringHelper.getInstance().getElementName(platform.getOsapi()),
				  pdlPackage.eINSTANCE.getMPlatform_Os());
		}
	}
	
	/**
	 * Checks that the bounds of the devices supported by a board are within
	 * limits.
	 * @param supportedDevice the board supported device to check.
	 */
	@Check
	public void checkMBoardSupportedDevice_bounds(MBoardSupportedDevice supportedDevice)
	{
		Long lowerBound, upperBound;
		
		try {
			lowerBound = util.parseIntegerExpression(supportedDevice.getLowerBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					pdlPackage.eINSTANCE.getMBoardSupportedDevice_LowerBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					pdlPackage.eINSTANCE.getMBoardSupportedDevice_LowerBound());
			return;
		}
		
		try {
			upperBound = util.parseIntegerExpression(supportedDevice.getUpperBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					pdlPackage.eINSTANCE.getMBoardSupportedDevice_UpperBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					pdlPackage.eINSTANCE.getMBoardSupportedDevice_UpperBound());
			return;
		}
		
		if (lowerBound < 0)
		{
			error("The lower bound must always be greater than or equal to zero",
				  pdlPackage.eINSTANCE.getMBoardSupportedDevice_LowerBound());
		}
		
		if (upperBound != -1 &&
			upperBound < lowerBound)
		{
			error("The upper bound must be greater than or equal to the lower bound",
				  pdlPackage.eINSTANCE.getMBoardSupportedDevice_UpperBound());
		}
	}
	
	/**
	 * Checks that there are no duplicated supported devices in the definition
	 * of a board.
	 * @param board the board to check.
	 */
	@Check
	public void checkMBoard_duplicatedSupportedDevices(MBoard board)
	{
		Set<MDevice> devs = new HashSet<MDevice>();
		
		int i = 0;
		
		for (MBoardSupportedDevice sdevice : board.getSupportedDevices())
		{
			if (sdevice.getDevice() == null ||
				sdevice.getDevice().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (devs.add(sdevice.getDevice()) == false)
			{
				error("Duplicated supported device: " + 
						PDLStringHelper.getInstance().getElementName(sdevice.getDevice()),
						pdlPackage.eINSTANCE.getMBoard_SupportedDevices(), i);
			}
			i++;
		}
	}

	/**
	 * Checks that a platform is well defined.
	 * @param platform the platform to check.
	 */
	@Check
	public void checkMPlatform_wellformedness(MPlatform platform) {
		
		if (platform.getMicroprocessor() == null &&
			platform.getBoard() != null &&
			platform.getBoard().eIsProxy() == false)
		{
			error("Microprocessor must be defined if the board is",
				  pdlPackage.eINSTANCE.getMPlatform_Microprocessor());
		}
		if (platform.getArchitecture() != null &&
			platform.getArchitecture().eIsProxy() == false &&
			platform.getMicroprocessor() != null &&
			platform.getMicroprocessor().eIsProxy() == false &&
			platform.getMicroprocessor().getArchitecture() !=
			platform.getArchitecture())
		{
			error("Microprocessor must support selected architecture",
				  pdlPackage.eINSTANCE.getMPlatform_Microprocessor());
		}
		if (platform.getMicroprocessor() != null &&
			platform.getMicroprocessor().eIsProxy() == false &&
			platform.getBoard() != null &&
			platform.getBoard().eIsProxy() == false &&
			platform.getBoard().getMicroprocessor() != null) {
			
			if (platform.getBoard().getMicroprocessor() !=
				platform.getMicroprocessor())
			{
				error("Board must support selected microprocessor",
					  pdlPackage.eINSTANCE.getMPlatform_Board());
			}
		}
	}

	/**
	 * Checks that the implementation of the selected operating system
	 * supports the whole platform.
	 * @param platform the platform to check.
	 */
	@Check
	public void checkMPlatform_OSSupport(MPlatform platform)
	{
		if (platform.getOs() == null &&
			platform.getOs().eIsProxy() == true)
		{
			return;
		}
		MOperatingSystem os = platform.getOs();
		
		if (!pdlutil.supportsPlatform(os, platform))
		{
			error("The implementations of the operating system " +
				  PDLStringHelper.getInstance().getElementName(platform.getOs()) +
				  " are not supported by this platform",
				  pdlPackage.eINSTANCE.getMPlatform_Os());

		}
	}
	
	/**
	 * Checks that a parameter defined by an operating system whose default value
	 * depends on its different supported platforms is well defined.
	 * 
	 * This means that for each of the supported platforms, one and only one
	 * default value is assigned.
	 * 
	 * @param paramSwitch the parameter.
	 */
	@Check
	public void checkMParameterOSSPSwitch_ParameterDefinition(MParameterOSSPSwitch paramSwitch)
	{
		MOperatingSystem os = (MOperatingSystem) paramSwitch.eContainer();
		Map<MOSSupportedPlatform, MParameterOSSPSwitchCase> pltCase = 
				new HashMap<MOSSupportedPlatform, MParameterOSSPSwitchCase>();

		int i = 0;

		for (MParameterOSSPSwitchCase paramCase : paramSwitch.getCases())
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
						paramSwitch, pdlPackage.eINSTANCE.getMParameterOSSPSwitch_Cases(), i);
			}
		}
		for (MOSSupportedPlatform swpsp : os.getSupportedPlatforms())
		{
			if (pltCase.get(swpsp) == null)
			{
				error("Missing default value for supported platform " + swpsp.getName(),
						paramSwitch, pdlPackage.eINSTANCE.getMParameterOSSPSwitch_Cases(), -1);							
			}
		}
	}
	
	/**
	 * Checks that an OSAPI parameter value assignment whose value depends on
	 * the different deployment platforms is well defined.
	 * 
	 * @param pvaSwitch the parameter value assignment to check.
	 */
	@Check
	public void checkMOSSupportedOSAPIPVASwitch_AssignmentDefinition(MOSSupportedOSAPIPVASwitch pvaSwitch)
	{
		Map<MOSSupportedPlatform, MOSSupportedOSAPIPVASwitchCase> pltCase = 
				new HashMap<MOSSupportedPlatform, MOSSupportedOSAPIPVASwitchCase>();
		
		int i = 0;
		
		for (MOSSupportedOSAPIPVASwitchCase pvaCase : pvaSwitch.getCases())
		{
			if (pvaCase.getPlatform() == null ||
				pvaCase.getPlatform().eIsProxy() == true)
			{
				i++;
				continue;
			}

			if (pltCase.put(pvaCase.getPlatform(), pvaCase) != null)
			{
				error("Duplicated assignment on the same supported platform: " + pvaCase.getPlatform().getName(),
						pvaSwitch, pdlPackage.eINSTANCE.getMOSSupportedOSAPIPVASwitch_Cases(), i);
			}

			i++;
		}

	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of an operating system API and that the default values
	 * are properly defined.
	 * 
	 * @param osapi the OSAPI to check.
	 */
	@Check
	public void checkMOperatingSystemAPI_parameters(MOperatingSystemAPI osapi)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameter parameter : osapi.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMOperatingSystemAPI_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters, null);
	}
	
	/**
	 * Checks the values assigned to the parameters defined by a supported
	 * OSAPI. This parameters may have dependencies on other parameters.
	 * @param sosapi the OSAPI supported by an operating system.
	 */
	@Check
	public void checkMOperatingSystem_ValueAssignments(MOperatingSystem os)
	{
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			if (sosapi.getOsapi() == null ||
				sosapi.getOsapi().eIsProxy() == true)
			{
				continue;
			}
			
			for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
			{
				Map<MParameter, MParameterValueAssignment> assignments = 
						new HashMap<MParameter, MParameterValueAssignment>();
				
				MPlatform plt = pdlutil.toPlatform(sosapi.getOsapi(), os, ossp);

				for (MOperatingSystem parentOS : os.getInherits())
				{
					if (parentOS == null ||
						parentOS.eIsProxy() == true)
					{
						continue;
					}
					assignments.putAll(pdlutil.getMapAllParameterValueAssignments(parentOS,
						sosapi.getOsapi()));
				}
				
				Set<MParameter> local = new HashSet<MParameter>();
				
				int i = 0;
				
				for (MParameterValueAssignment pva : sosapi.getParameterValueAssignments())
				{
					if (pva.getParameter() == null ||
						pva.getParameter().eIsProxy() == true)
					{
						continue;
					}
					else if (local.add(pva.getParameter()) == false)
					{
						error("Duplicated assignment on the same parameter: " + pva.getParameter().getName(),
								sosapi, pdlPackage.eINSTANCE.getMOSSupportedOSAPI_ParameterValueAssignments(), i);
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
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of an operating system and that the parameter values
	 * are properly defined.
	 * 
	 * @param os the operating system to check.
	 */
	@Check
	public void checkMOperatingSystem_parameters(MOperatingSystem os)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameter parameter : os.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMOperatingSystem_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			if (sosapi == null ||
				sosapi.eIsProxy() == true)
			{
				continue;
			}
			for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
			{
				MPlatform plt = pdlutil.toPlatform(sosapi.getOsapi(), os, ossp);
				checkParameterDefaultValues(parameters, plt);
			}
		}
	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of an operating system supported platform.
	 * @param ossp the operating system supported platform to check.
	 */
	@Check
	public void checkMOSSupportedPlatform_parameters(MOSSupportedPlatform ossp)
	{
		Set<String> names = new HashSet<String>();
		MOperatingSystem os = (MOperatingSystem) ossp.eContainer();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameter parameter : ossp.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMOSSupportedPlatform_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			if (sosapi.getOsapi() == null ||
				sosapi.getOsapi().eIsProxy() == true)
			{
				continue;
			}
			MPlatform plt = pdlutil.toPlatform(sosapi.getOsapi(), os, ossp);
			checkParameterDefaultValues(parameters, plt);
		}
	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of an architecture and that the default values are
	 * defined correctly.
	 * 
	 * @param architecture the architecture to check.
	 */
	@Check
	public void checkMArchitecture_parameters(MArchitecture architecture)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();

		int i = 0;
		
		for (MParameter parameter : architecture.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMArchitecture_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters);
	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of a microprocessor and that the default values of the
	 * parameters are defined correctly.
	 * 
	 * @param mp the microprocessor to check.
	 */
	@Check
	public void checkMMicroprocessor_parameters(MMicroprocessor mp)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameter parameter : mp.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMMicroprocessor_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters);
	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of a board and that the different default values are
	 * correctly defined.
	 * 
	 * @param board the board to check.
	 */
	@Check
	public void checkMBoard_Parameters(MBoard board)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameter parameter : board.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMBoard_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters);
	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of a compiler and that the default values of the
	 * parameters are correctly defined.
	 * 
	 * @param compiler the compiler to check.
	 */
	@Check
	public void checkMCompiler_Parameters(MCompiler compiler)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameter parameter : compiler.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMCompiler_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters);
	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of a compiler frontend and that the default values
	 * are correctly defined.
	 * 
	 * @param frontend the compiler frontend to check.
	 */
	@Check
	public void checkMCompilerFrontend_Parameters(MCompilerFrontend frontend)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameter parameter : frontend.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMCompiler_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters);
	}
	
	/**
	 * Checks that there are not two parameters with the same name in the
	 * definition of a platform and that the default values of the
	 * parameters are correctly defined.
	 * 
	 * @param platform the platform to check.
	 */
	@Check
	public void checkMPlatform_Parameters(MPlatform platform)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		if (platform.getOsapi() == null ||
			platform.getOsapi().eIsProxy() == true ||
			platform.getOs() == null ||
			platform.getOs().eIsProxy() == true)
		{
			return;
		}
		
		int i = 0;
		
		for (MParameter parameter : platform.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(),
					  pdlPackage.eINSTANCE.getMPlatform_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters, platform);
	}
	
	/**
	 * Checks that there are not two frontends with the same name in the
	 * definition of a compiler.
	 * @param compiler the compiler to check.
	 */
	@Check
	public void checkMCompiler_DuplicatedFrontendName(MCompiler compiler)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MCompilerFrontend frontend : compiler.getFrontends())
		{
			if (names.add(StringHelper.toLowerDefString(frontend.getName())) == false)
			{
				error("Duplicated frontend name: " +
					  frontend.getName(),
					  pdlPackage.eINSTANCE.getMCompiler_Frontends(), i);
			}
			i++;
		}
	}
	
}
