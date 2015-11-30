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
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 */
public class IFACEScopeProvider extends MICOBSElementAbstractScopeProvider {
	
	/**
	 * Provides the scope with the list of interfaces that the interface can
	 * extend.
	 * 
	 * @param iface the interface.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterface_extends(final MInterface iface, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iface.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)iface.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevifacePackage.eINSTANCE.getMInterface());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevifacePackage.eINSTANCE.getMInterface()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of interface types to which the
	 * interface can belong. Implements Restriction 64.
	 * 
	 * @param iface the interface.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterface_type(final MInterface iface, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (iface.getDomain() == null ||
			iface.getDomain().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MDomain domain = iface.getDomain();
		
		if (domain instanceof MIODomain)
		{
			Set<MIODomain> parentDomains = MCLEVUtil.getDefault().getInheritedDomains((MIODomain) domain);
			
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MIODomain iod : parentDomains)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(iod));
			}
			outerScope = getFullObjectScope(parentTypes);
		}
		else
		{
			Set<MAODomain> parentDomains = MCLEVUtil.getDefault().getInheritedDomains((MAODomain) domain);
			
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MAODomain aod : parentDomains)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(aod));
			}
			outerScope = getFullObjectScope(parentTypes);
			
		}
		
		return getRelativeObjectScope(domain.getInterfaceTypes(), outerScope);
	}
	
	/**
	 * Provides the scope with the list of domains that can be attached to the
	 * definition of an interface.
	 * 
	 * @param iface the interface.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterface_domain(final MInterface iface, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iface.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)iface.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevdomPackage.eINSTANCE.getMIODomain());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevdomPackage.eINSTANCE.getMIODomain()));
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(imports, mclevdomPackage.eINSTANCE.getMAODomain()));
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevdomPackage.eINSTANCE.getMAODomain()));
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
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		return importLibraries;
	}

}
