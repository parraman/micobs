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
package es.uah.aut.srg.micobs.mesp.lang.scoping;

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
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.xtext.MESPElementAbstractScopeProvider;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * This class contains custom scoping description.
 * 
 */
public class SWIScopeProvider extends MESPElementAbstractScopeProvider {

	
	/**
	 * Provides the scope for the referenceable objects that can be used
	 * in the definition of a configuration parameter.
	 * 
	 * @param parameter the configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(final MParameter parameter, EReference reference)
	{
		MSwInterface swi;
		if (parameter.eContainer() instanceof MSwInterface)
		{
			swi = (MSwInterface)parameter.eContainer();
			 
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MSwInterface pswi : swi.getExtends())
			{
				if (pswi.eIsProxy() == false)
				{
					params.addAll(mesputil.getAllParameters(pswi));
				}
			}
			for (MParameter param : swi.getParameters())
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
				MEnumParameter param = (MEnumParameter)parameter;
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), outerScope);
				}
			}
				
			return outerScope;
			 
		}
		else if (parameter.eContainer() instanceof MInstantiableResource)
		{
			// osswi -> provided resources list -> resource -> param
			MInstantiableResource ires = (MInstantiableResource)parameter.eContainer();
			swi = (MSwInterface)ires.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MSwInterface pswi : swi.getExtends())
			{
				if (pswi.eIsProxy() == false)
				{
					params.addAll(mesputil.getAllParameters(pswi));
				}
			}
			
			for (MParameter param : swi.getParameters())
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
				
			for (MParameter param : ires.getParameters())
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
				MEnumParameter param = (MEnumParameter)parameter;
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), outerScope);
				}
			}
				
			return outerScope;
		}
		else
		{
			return IScope.NULLSCOPE;
		}
	}


	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within a platform.
	 * 
	 * @param platform the platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MSwInterface osswi, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MSwInterface pswi : osswi.getExtends())
		{
			if (pswi.eIsProxy() == false)
			{
				outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(pswi));
			}
		}
		
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(mesputil.getEnumParameterDefinitions(osswi), outerScope);
	}

	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within an instantiable resource.
	 * This types are the ones defined by the very SwInterface plus the
	 * ones defined by the interfaces it extends.
	 * 
	 * @param ires the enumerated configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MInstantiableResource ires, EReference reference)
	{
		MSwInterface swi = (MSwInterface)ires.eContainer().eContainer();
		
		Set<MEnumParameterDefinition> outerDefs = mesputil.getEnumParameterDefinitions(swi);
		
		for (MSwInterface posswi : swi.getExtends())
		{
			if (posswi.eIsProxy() == false)
			{
				outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(posswi));
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(mesputil.getEnumParameterDefinitions(ires), outerScope);
	}

	/**
	 * Provides the scope for the OSAPIs that can be required by a software
	 * interface.
	 * 
	 * @param iface the software interface.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystemAPI(final MSwInterface iface, EReference reference)
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
	
	/**
	 * Provides the scope for the inherited interfaces of a given software
	 * interface.
	 * 
	 * @param iface the software interface.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwInterface(final MSwInterface iface, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iface.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)iface.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(MESPLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

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
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(MESPLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	

}