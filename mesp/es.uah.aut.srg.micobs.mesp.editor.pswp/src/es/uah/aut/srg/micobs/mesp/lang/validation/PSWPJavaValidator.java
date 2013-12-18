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
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.xtext.MESPAbstractJavaValidator;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
 

public class PSWPJavaValidator extends MESPAbstractJavaValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mesppswp"));
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
	 * Checks that all the operating system software packages attached
	 * to a given platform software package do support at least one of the
	 * selected construction tools.
	 * 
	 * @param pswp the platform software package to check.
	 */
	@Check
	void checkMPlatformSwPackage_OSSwPackagesCTools(MPlatformSwPackage pswp)
	{
		if (pswp.getOsSwPackages().isEmpty())
		{
			return;
		}
		
		int i = 0;
		boolean found = false;
		for (MOSSwPackage osswp : pswp.getOsSwPackages())
		{
			if (osswp.eIsProxy() == true)
			{
				i++;
				continue;
			}
			found = false;
			for (MConstructionTool ctool : osswp.getCtools())
			{
				if (pswp.getCtools().contains(ctool))
				{
					found = true;
					break;
				}
			}
			if (found == false)
			{
				error("OS software package " +
					  MESPStringHelper.getDefault().getElementName(osswp) + 
					  " does not support any of the selected construction tools",
					  pswp, mesppswpPackage.eINSTANCE.getMPlatformSwPackage_OsSwPackages(), i);
			}
			i++;
		}
		
	}
	
	/**
	 * Checks that one of the selected OSSwPackages supports the OS of the
	 * attached platform and that the rest are the ones extended by it.
	 * 
	 * @param pswp The platform software package to check.
	 */
	@Check
	public void checkMPlatformSwPackage_OSSwPackage(MPlatformSwPackage pswp)
	{
		Set<MOSSwPackage> osswps = new HashSet<MOSSwPackage>();
		
		MOSSwPackage mainOSSWP = null;
		
		if (pswp.getReferencedElement() == null || 
			pswp.getReferencedElement().eIsProxy() == true ||
			!(pswp.getReferencedElement() instanceof MPlatform))
		{
			return;
		}
		MPlatform platform = (MPlatform)(pswp.getReferencedElement());
		
		int i = 0;
		
		boolean found = false;
		
		for (MOSSwPackage osswp : pswp.getOsSwPackages())
		{
			if (osswp.eIsProxy() == false)
			{
				MOperatingSystem os = (MOperatingSystem)osswp.getReferencedElement();
				if (osswps.add(osswp) == false)
				{
					error("Duplicated OS software package: " + 
						  MESPStringHelper.getDefault().getElementName(osswp), 
						  mesppswpPackage.eINSTANCE.getMPlatformSwPackage_OsSwPackages(), i);
				}
				if (os == platform.getOs())
				{
					found = true;
					mainOSSWP = osswp;
				}
			}
		}
		
		if (found == false)
		{
			error("There is no OS software package implementing the operating system " + 
				  MESPStringHelper.getDefault().getElementName(platform.getOs()), 
				  mesppswpPackage.eINSTANCE.getMPlatformSwPackage_OsSwPackages());
		}
		else
		{
			for (MOSSwPackage osswp : osswps)
			{
				if (osswp == mainOSSWP)
				{
					continue;
				}
				if (mesputil.getAllExtendedOSSwPackages(mainOSSWP).contains(osswp) == false)
				{
					error("OS software package " + 
						  MESPStringHelper.getDefault().getElementName(osswp) + 
						  " is not part of the extended packages of the OS software package " +
						  MESPStringHelper.getDefault().getElementName(mainOSSWP), 
						  mesppswpPackage.eINSTANCE.getMPlatformSwPackage_OsSwPackages());
				}
			}
			for (MOSSwPackage osswp : mesputil.getAllExtendedOSSwPackages(mainOSSWP))
			{
				if (osswps.contains(osswp) == false)
				{
					error("OS software package " + 
						  MESPStringHelper.getDefault().getElementName(osswp) + 
						  ", extended by the OS software package " +
						  MESPStringHelper.getDefault().getElementName(mainOSSWP) +
						  " is not included", 
						  mesppswpPackage.eINSTANCE.getMPlatformSwPackage_OsSwPackages());
				}
				// TODO: Add the quickfix
			}
		}

	}

}
