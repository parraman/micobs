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

import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.xtext.MESPAbstractJavaValidator;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.modeling.util.string.StringHelper;

public class SWIJavaValidator extends MESPAbstractJavaValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mespswi"));
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
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	/**
	 * Checks that the OSAPI required by a software interface matches the
	 * OSAPIs that might require the interfaces it extends.
	 *  
	 * @param swi the software interface to check.
	 */
	@Check
	void checkMSwInterface_RequiredOSAPIsMatch(MSwInterface swi)
	{
		if (swi.getRequiredOSAPI() == null ||
			swi.getRequiredOSAPI().eIsProxy() == true)
		{
			return;
		}
		
		Set<MSwInterface> extended = new HashSet<MSwInterface>();
		
		for (MSwInterface iface : swi.getExtends())
		{
			if (iface.eIsProxy() == false)
			{
				extended.addAll(mesputil.getAllExtendedSwInterfaces(iface));
				extended.add(iface);
			}
		}
		
		for (MSwInterface eswi : extended)
		{
			if (eswi.getRequiredOSAPI() != null &&
				eswi.getRequiredOSAPI() != swi.getRequiredOSAPI())
			{
				error("The required OSAPI " +
					  MESPStringHelper.getDefault().getElementName(swi.getRequiredOSAPI()) +
					  " does not match with the OSAPI required by the extended interface " +
					  MESPStringHelper.getDefault().getElementName(eswi),
					  swi, mespswiPackage.eINSTANCE.getMSwInterface_RequiredOSAPI(), -1);
			}
		}
	}
	
	/**
	 * Checks that the languages of the extended interfaces match with the
	 * software interface's.
	 * @param swi the software interface to check.
	 */
	@Check
	void checkMSwInterface_LanguageExtendedInterface(MSwInterface swi)
	{	
		if (swi.getLanguage().eIsProxy() == true)
		{
			return;
		}
		
		int i = 0;
		for (MSwInterface iface : swi.getExtends())
		{
			if (iface.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (iface.getLanguage() != swi.getLanguage() &&
					util.getAllParentLanguages(swi.getLanguage()).contains(iface.getLanguage()) == false)
			{
				error("The language of the extended interface " +
					  MESPStringHelper.getDefault().getElementName(iface) +
					  " does not match with the selected language",
					  swi, mespswiPackage.eINSTANCE.getMSwInterface_Extends(), i);
			}
			i++;
		}
	}
		
	/**
	 * Checks that there are no loops between the extended interfaces and the
	 * required ones.
	 * @param swi the software interface to check
	 */
	@Check
	void checkMSwInterface_ExtendedLoop(MSwInterface swi)
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		if (swi.getExtends().isEmpty())
		{
			return;
		}
		
		for (MSwInterface extended : swi.getExtends())
		{
			if (extended.eIsProxy() == true)
			{
				continue;
			}
			swis.addAll(mesputil.getAllExtendedSwInterfaces(extended));
			swis.add(extended);
		}

		int i = 0;
		
		for (MSwInterface required : swi.getRequires())
		{
			if (required.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (swis.contains(required) == true)
			{
				error("Software interface " +
					  MESPStringHelper.getDefault().getElementName(required) +
					  " is both extended and required",
					  mespswiPackage.eINSTANCE.getMSwInterface_Requires(), i);
			}
			else
			{
				for (MSwInterface extended : mesputil.getAllExtendedSwInterfaces(required))
				{
					if (swis.contains(extended) == true)
					{
						error("Software interface " +
								MESPStringHelper.getDefault().getElementName(extended) +
								", extended by software interface " +
								MESPStringHelper.getDefault().getElementName(required) +
								" is both extended and required",
								mespswiPackage.eINSTANCE.getMSwInterface_Requires(), i);
					}
				}
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the extended interfaces list of a
	 * software interface.
	 * @param swi the software interface to check.
	 */
	@Check
	void checkMSwInterface_DuplicatedExtendedInterface(MSwInterface swi)
	{
		Set<MSwInterface> interfaces = new HashSet<MSwInterface>();
		
		int i = 0;
		for (MSwInterface iface : swi.getExtends())
		{
			if (iface.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (interfaces.add(iface) == false)
			{
				error("Duplicated extended interface: " +
					  MESPStringHelper.getDefault().getElementName(iface),
					  swi, mespswiPackage.eINSTANCE.getMSwInterface_Extends(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that every provided resource has a different name.
	 * @param swi the software interface to check.
	 */
	@Check 
	void checkMSwInterface_PRDuplicatedName(MSwInterface swi)
	{	
		Set<String> parameters = new HashSet<String>();
		
		int i = 0;
		for (Iterator<MProvidedResource> r = 
				swi.getProvidedResources().iterator(); r.hasNext(); )
		{
			MProvidedResource res = r.next();
			if (parameters.add(StringHelper.toLowerDefString(res.getName())) == false)
			{
				error("Duplicated resource name: " + res.getName(), swi,
					  mespswiPackage.eINSTANCE.getMSwInterface_ProvidedResources(), i);
			}
			i++;
		}
	}
	
	@Check
	void checkMSwInterface_Parameters(MSwInterface swi)
	{
		Set<String> names = new HashSet<String>();
		Set<MParameter> parameters = new HashSet<MParameter>();
		
		int i = 0;

		for (final MParameter parameter : swi.getParameters())
		{
			if (names.add(StringHelper.toLowerDefString(parameter.getName())) == false)
			{
				error("Duplicated parameter name: " +
					  parameter.getName(), parameter,
					  mespswiPackage.eINSTANCE.getMSwInterface_Parameters(), i);
			}
			else if (!(parameter instanceof MEnumParameterDefinition))
			{
				parameters.add(parameter);
			}
			i++;
		}
		checkParameterDefaultValues(parameters);
	}

}
