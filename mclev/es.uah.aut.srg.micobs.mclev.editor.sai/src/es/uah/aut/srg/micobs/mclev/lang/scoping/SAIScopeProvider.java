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
package es.uah.aut.srg.micobs.mclev.lang.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 */
public class SAIScopeProvider extends MICOBSElementAbstractScopeProvider {
	
	/**
	 * Provides the scope for the referenceable objects that can be used
	 * in the definition of an attribute.
	 * @param parameter the configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(final MParameter parameter, EReference reference)
	{
		MSAI sai = (MSAI)parameter.eContainer();
			 
		Set<MParameter> params = new HashSet<MParameter>();
				
		for (MSAI pswi : sai.getExtends())
		{
			if (pswi.eIsProxy() == false)
			{
				params.addAll(MCLEVUtil.getDefault().getAllAttributes(pswi));
			}
		}
				
		for (MParameter param : sai.getAttributes())
		{
			if (param == parameter)
			{
				continue;
			}
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		
		IScope outerScope = getFullObjectScope(params);
		
		if (parameter instanceof MEnumParameter)
		{
			// Then we have to return the literals
			if (((MEnumParameter)parameter).getEnumDefinition() != null &&
				((MEnumParameter)parameter).getEnumDefinition().eIsProxy() == false)
			{
				return getSimpleObjectScope(((MEnumParameter)parameter).getEnumDefinition().getLiterals(), outerScope);
			}
		}
				
		return outerScope;
			 
	}


	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an attribute within a SAI.
	 * Implements Restriction TBD
	 * @param sai the SAI.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MSAI sai, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MSAI pswi : sai.getExtends())
		{
			if (pswi.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(pswi));
			}
		}
		
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getEnumAttributeDefinitions(sai), outerScope);
	}
	
	/**
	 * Provides the scope for the inherited interfaces of a given SAI.
	 * 
	 * @param iface the SAI.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSAI(final MSAI iface, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iface.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)iface.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope for the OSAPIs that can be required by a SAI.
	 * 
	 * @param iface the SAI.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystemAPI(final MSAI iface, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iface.eContainer()).getImports();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

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
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		return importLibraries;
	}

}
