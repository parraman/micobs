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
package es.uah.aut.srg.micobs.mesp.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.xtext.MESPAbstractJavaValidator;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class OSSWIJavaValidator extends MESPAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mesposswi"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mespcommon"));
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
	 * Checks that the OSAPIs of the inherited interfaces are also
	 * part of the inheritance tree of the same OSAPIs.
	 * 
	 * @param osswi the operating system software interface to check.
	 */
	@Check 
	void checkMOSSwInterface_InheritanceTree(MOSSwInterface osswi)
	{	
		Set<MOperatingSystemAPI> osapis = new HashSet<MOperatingSystemAPI>();
		Set<MOSSwInterface> osswis = new HashSet<MOSSwInterface>();
		
		if (osswi.getReferencedElement() == null ||
			osswi.getReferencedElement().eIsProxy() == true ||
			!(osswi.getReferencedElement() instanceof MOperatingSystemAPI))
		{
			return;
		}
			
		MOperatingSystemAPI osapi = ((MOperatingSystemAPI)osswi.getReferencedElement());
		
		int i = 0;
		for (MOSSwInterface parent : osswi.getExtends())
		{
			if (parent.eIsProxy())
			{
				i++;
				continue;
			}
			if (osapi.getInherits().contains(parent.getReferencedElement()) == false)
			{
				error("Operating system API " +
					  MESPStringHelper.getDefault().getElementName(parent.getReferencedElement()) +
					  " is not originally inherited by operating system API " +
					  MESPStringHelper.getDefault().getElementName(osswi.getReferencedElement()),
					  mesposswiPackage.eINSTANCE.getMOSSwInterface_Extends(), i);
			}
			if (osswis.add(parent) == false)
			{
				error("Duplicated extended operating system software interface :" +
					  MESPStringHelper.getDefault().getElementName(parent),
					  mesposswiPackage.eINSTANCE.getMOSSwInterface_Extends(), i);
			}
			if (osapis.add((MOperatingSystemAPI) parent.getReferencedElement()) == false)
			{
				error("Duplicated implementation of operating system API:" +
					  MESPStringHelper.getDefault().getElementName(parent.getReferencedElement()),
					  mesposswiPackage.eINSTANCE.getMOSSwInterface_Extends(), i);
			}
			i++;
		}
		
		for (MOperatingSystemAPI parent : osapi.getInherits())
		{
			if (osapis.contains(parent) == false)
			{
				error("Inherited OSAPI " +
					  MESPStringHelper.getDefault().getElementName(parent) +
					  " is not being implemented by any of the selected operating system software interfaces",
					  mesposswiPackage.eINSTANCE.getMOSSwInterface_Extends());
			}
		}
	}
	
	/**
	 * Checks that every provided resource has a different name.
	 * 
	 * @param osswi the operating system software interface to check.
	 */
	@Check 
	void checkMSwInterface_PRDuplicatedName(MOSSwInterface osswi)
	{	
		Set<String> parameters = new HashSet<String>();
		
		int i = 0;
		for (Iterator<MProvidedResource> r = 
				osswi.getProvidedResources().iterator(); r.hasNext(); )
		{
			MProvidedResource res = r.next();
			if (parameters.add(StringHelper.toLowerDefString(res.getName())) == false)
			{
				error("Duplicated resource name: " + res.getName(), osswi,
					  mesposswiPackage.eINSTANCE.getMOSSwInterface_ProvidedResources(), i);
			}
			i++;
		}
	}

}
