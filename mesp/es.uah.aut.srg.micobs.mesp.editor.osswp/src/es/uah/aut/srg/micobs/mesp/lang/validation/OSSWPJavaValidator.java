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
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.xtext.MESPAbstractJavaValidator;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
 

public class OSSWPJavaValidator extends MESPAbstractJavaValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mesposswp"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
		return result;
	}
	
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
	
	/**
	 * Checks that there are no duplicates in the construction tools list of a
	 * operating system software package.
	 * @param osswp the operating system software package to check.
	 */
	@Check
	public void checkMOSSwPackage_DuplicatedConstructionTool(MOSSwPackage osswp) {
		
		Set<MConstructionTool> ctools = new HashSet<MConstructionTool>();
		
		int i = 0;
		for (MConstructionTool ctool : osswp.getCtools())
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
					   osswp, mesposswpPackage.eINSTANCE.getMOSSwPackage_Ctools(), i);
			}
			i++;
		}	
	}
	
	/**
	 * Checks that the languages of the selected operating system 
	 * are supported by everyone of the construction tools.
	 * 
	 * @param osswp the operating system software package to check.
	 */
	@Check
	public void checkMOSSwPackage_CToolsSupportLanguage(MOSSwPackage osswp) {
		
		if (osswp.getReferencedElement() == null ||
			osswp.getReferencedElement().eIsProxy() == true)
		{
			return;
		}
		
		MOperatingSystem os = (MOperatingSystem)osswp.getReferencedElement();
		
		int i = 0;
		for (MConstructionTool ctool : osswp.getCtools())
		{
			if (ctool.eIsProxy() == false)
			{
				for (MLanguage language : os.getLanguages())
				{
					if (ctool.getSupportedLanguages().contains(language) == false)
					{
						error("Construction tool " +
							  MESPStringHelper.getDefault().getElementName(ctool) +
							  " does not support language " +
							  MESPStringHelper.getDefault().getElementName(language),
							  osswp, mesposswpPackage.eINSTANCE.getMOSSwPackage_Ctools(), i);
						break;
					}
				}
				
				for (MOSSupportedPlatform ossp : os.getSupportedPlatforms())
				{
					for (MLanguage language : ossp.getLanguages())
					{
						if (ctool.getSupportedLanguages().contains(language) == false)
						{
							error("Construction tool " +
								  MESPStringHelper.getDefault().getElementName(ctool) +
								  " does not support language " +
								  MESPStringHelper.getDefault().getElementName(language),
								  osswp, mesposswpPackage.eINSTANCE.getMOSSwPackage_Ctools(), i);
							break;
						}
					}
				}

			}
			i++;
		}
	}
	
	/**
	 * Checks that all the OSSwPackages extended by a given package
	 * do support at least one of the construction tools attached
	 * to it.
	 *  
	 * @param osswp the operating system software package to check.
	 */
	@Check
	void checkMOSSwPackage_ExtendedPackagesCTools(MOSSwPackage osswp)
	{
		if (osswp.getExtends().isEmpty())
		{
			return;
		}
		
		int i = 0;
		boolean found = false;
		for (MOSSwPackage eswp : osswp.getExtends())
		{
			if (eswp.eIsProxy() == true)
			{
				i++;
				continue;
			}
			found = false;
			for (MConstructionTool ctool : eswp.getCtools())
			{
				if (osswp.getCtools().contains(ctool))
				{
					found = true;
					break;
				}
			}
			if (found == false)
			{
				error("Extended operating system software package " +
					  MESPStringHelper.getDefault().getElementName(eswp) + 
					  " does not support any of the selected construction tools",
					  osswp, mesposswpPackage.eINSTANCE.getMOSSwPackage_Extends(), i);
			}
			i++;
		}
		
	}

	
	/**
	 * Checks that every OSAPI of the attached OS is provided once and only
	 * once.
	 * 
	 * @param osswp the operating system software package to check.
	 */
	@Check
	public void checkMOSSwPackage_ProvidesOSAPIs(MOSSwPackage osswp)
	{
		Set<MOSSwInterface> localOSSWIs = new HashSet<MOSSwInterface>();
		Set<MOSSwInterface> extendedOSSWIs = new HashSet<MOSSwInterface>();
		Set<MOperatingSystemAPI> localOSAPIs = new HashSet<MOperatingSystemAPI>();
		Set<MOperatingSystemAPI> extendedOSAPIs = new HashSet<MOperatingSystemAPI>();
		
		if (osswp.getReferencedElement() == null ||
			osswp.getReferencedElement().eIsProxy() ||
			(osswp.getReferencedElement() instanceof MOperatingSystem) == false)
		{
			return;
		}
		
		MOperatingSystem os = (MOperatingSystem)osswp.getReferencedElement();

		int i = 0;
		
		for (MOSSwPackage extended : osswp.getExtends())
		{
			if (extended.eIsProxy())
			{
				i++;
				continue;
			}
			for (MOSSwInterface osswi : mesputil.getAllProvidedOSSWIs(extended))
			{
				extendedOSAPIs.add((MOperatingSystemAPI) osswi.getReferencedElement());
				extendedOSSWIs.add(osswi);
			}
			i++;
		}
		
		i = 0;
		for (MOSSwInterface osswi : osswp.getProvidedOSSWIs())
		{
			if (osswi.eIsProxy())
			{
				i++;
				continue;
			}
			if (pdlutil.getAllSupportedOSAPIs(os).contains(osswi.getReferencedElement()) == false)
			{
				error("Operating System API " +
					  MESPStringHelper.getDefault().getElementName(osswi.getReferencedElement()) +
					  " is not supported by the operating system " +
					  MESPStringHelper.getDefault().getElementName(os), 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_ProvidedOSSWIs(), i);
			}
			if (localOSAPIs.add((MOperatingSystemAPI) osswi.getReferencedElement()) == false)
			{
				error("Operating System API " +
					  MESPStringHelper.getDefault().getElementName(osswi.getReferencedElement()) +
					  " is being linked more than once", 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_ProvidedOSSWIs(), i);
			}
			if (extendedOSAPIs.contains(osswi.getReferencedElement()) == true)
			{
				error("Operating System API " +
					  MESPStringHelper.getDefault().getElementName(osswi.getReferencedElement()) +
				      " is already being linked by an extended OS software package", 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_ProvidedOSSWIs(), i);
			}
			if (localOSSWIs.add(osswi) == false)
			{
				error("Operating System Software Interface " +
					  MESPStringHelper.getDefault().getElementName(osswi) +
					  " is provided more than once", 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_ProvidedOSSWIs(), i);
			}
			if (extendedOSSWIs.contains(osswi) == true)
			{
				error("Operating System Software Interface " +
					  MESPStringHelper.getDefault().getElementName(osswi) +
					  " is already provided by an extended OS software package", 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_ProvidedOSSWIs(), i);
			}
			i++;
		}
		
		
		// We're going to check the other restriction in the same
		// function for performance purposes:
		for (MOperatingSystemAPI osapi : pdlutil.getAllSupportedOSAPIs(os))
		{
			if (localOSAPIs.contains(osapi) == false &&
				extendedOSAPIs.contains(osapi) == false)
			{
				error("Operating system API  " +
					  MESPStringHelper.getDefault().getElementName(osapi) +
					  " is not being implemented", 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_ProvidedOSSWIs());
			}
		}
	}

	/**
	 * Checks that the implementations of the extended operating systems are
	 * part of the extension tree of the software package.
	 * 
	 * @param osswp the operating system software package to check.
	 */
	@Check
	public void checkMOSSwPackage_ExtendedOperatingSystems(MOSSwPackage osswp)
	{
		Set<MOSSwPackage> osswps = new HashSet<MOSSwPackage>();
		
		if (osswp.getReferencedElement() == null ||
			osswp.getReferencedElement().eIsProxy() ||
			(osswp.getReferencedElement() instanceof MOperatingSystem) == false)
		{
			return;
		}
		
		MOperatingSystem os = (MOperatingSystem) osswp.getReferencedElement();
		
		if (os.getInherits().isEmpty())
		{
			return;
		}

		int i = 0;
		for (MOSSwPackage extended : osswp.getExtends())
		{
			MOperatingSystem extendedOS = (MOperatingSystem)extended.getReferencedElement();
			if (os.getInherits().contains(extendedOS) == false)
			{
				error("Operating System " +
					  MESPStringHelper.getDefault().getElementName(extendedOS) +
					  " is not inherited by the operating system " +
					  MESPStringHelper.getDefault().getElementName(extendedOS), 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_Extends(), i);
			}
			if (osswps.add(extended) == false)
			{
				error("Operating System " +
					  MESPStringHelper.getDefault().getElementName(extended) +
					  " is extended more than once", 
					  mesposswpPackage.eINSTANCE.getMOSSwPackage_Extends(), i);
			}
			i++;
		}
	}

}
