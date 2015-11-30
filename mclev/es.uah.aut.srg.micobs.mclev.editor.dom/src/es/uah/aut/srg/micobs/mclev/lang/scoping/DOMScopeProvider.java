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
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 */
public class DOMScopeProvider extends MICOBSElementAbstractScopeProvider {

	
	/**
	 * Provides the list of component types that can be included as part of the
	 * component type instances of an IOD component type.
	 * @param domain the IOD to which the component type belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MExchangeModel(final MIODomain domain, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		Set<MExchangeModel> parentTypes = new HashSet<MExchangeModel>();
			
		for (MIODomain iod : domain.getInherits())
		{
			if (iod.eIsProxy() == false)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllExchangeModels(iod));
			}
		}
		outerScope = getFullObjectScope(parentTypes);
		
		return getRelativeObjectScope(domain.getExchangeModels(), outerScope);
	}
	
	/**
	 * Provides the list of exchange models that can be included as part of the list
	 * of inherited connectors of a connector.
	 * Implements Restrictions 26 and 27.
	 * @param connector the connector to which the inherit reference belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MExchangeModel_inherits(final MExchangeModel exchangeModel, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		MIODomain domain = (MIODomain)exchangeModel.eContainer();
		
		Set<MExchangeModel> parentTypes = new HashSet<MExchangeModel>();
			
		for (MIODomain piod : domain.getInherits())
		{
			if (piod.eIsProxy() == false)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllExchangeModels(piod));
			}
		}
		outerScope = getFullObjectScope(parentTypes);

		Set<MExchangeModel> currentTypes = new HashSet<MExchangeModel>();
		for (MExchangeModel em : domain.getExchangeModels())
		{
			if (em != exchangeModel)
			{
				currentTypes.add(em);
			}
		}
		
		return getRelativeObjectScope(currentTypes, outerScope);

	}

	/**
	 * Provides the list of connectors that can be included as part of the list
	 * of inherited connectors of a connector.
	 * Implements Restrictions 26 and 27.
	 * @param connector the connector to which the inherit reference belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MConnector_inherits(final MConnector connector, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		MDomain domain = (MDomain)connector.eContainer();
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			Set<MConnector> parentTypes = new HashSet<MConnector>();
			
			for (MIODomain piod : iod.getInherits())
			{
				if (piod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllConnectors(piod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			Set<MConnector> parentTypes = new HashSet<MConnector>();
			
			for (MAODomain paod : aod.getInherits())
			{
				if (paod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllConnectors(paod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
			
		}
		Set<MConnector> currentTypes = new HashSet<MConnector>();
		for (MConnector conn : domain.getConnectors())
		{
			if (conn != connector)
			{
				currentTypes.add(conn);
			}
		}
		
		return getRelativeObjectScope(currentTypes, outerScope);

	}
	
	/**
	 * Provides the list of types that can be included as part of the list of
	 * inherited port types of a port type.
	 * Implements Restrictions 22 and 23.
	 * @param portType the port type to which the inherit reference belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MPortType_inherits(final MPortType portType, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		MDomain domain = (MDomain)portType.eContainer();
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			Set<MPortType> parentTypes = new HashSet<MPortType>();
			
			for (MIODomain piod : iod.getInherits())
			{
				if (piod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllPortTypes(piod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			Set<MPortType> parentTypes = new HashSet<MPortType>();
			
			for (MAODomain paod : aod.getInherits())
			{
				if (paod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllPortTypes(paod));
				}	
			}
			outerScope = getFullObjectScope(parentTypes);
			
		}
		
		Set<MPortType> currentTypes = new HashSet<MPortType>();
		for (MPortType ptype : domain.getPortTypes())
		{
			if (ptype != portType)
			{
				currentTypes.add(ptype);
			}
		}
		
		return getRelativeObjectScope(currentTypes, outerScope);

		
	}

	/**
	 * Provides the list of port types that can be included as part of the
	 * definition of the different types of elements of a domain. This list
	 * includes the port types defined by the very domain plus the types
	 * defined by the domains from which it inherits. It is the same function
	 * for both types of domains (IOD and AOD). Implements Restriction 38.
	 * @param domain the domain defining the element.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */	
	public IScope scope_MPortType(final MDomain domain, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			Set<MPortType> parentTypes = new HashSet<MPortType>();
			
			for (MIODomain piod : iod.getInherits())
			{
				if (piod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllPortTypes(piod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			Set<MPortType> parentTypes = new HashSet<MPortType>();
			
			for (MAODomain paod : aod.getInherits())
			{
				if (paod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllPortTypes(paod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
			
		}
		
		return getRelativeObjectScope(domain.getPortTypes(), outerScope);
	}
	
	/**
	 * Provides the list of interface types that can be included as part of the
	 * definition of the different types of elements of a domain. This list
	 * includes the interface types defined by the very domain plus the 
	 * types defined by the domains from which it inherits. It is the same
	 * function for both types of domains (IOD and AOD). Implements Restriction
	 * 37.
	 * @param domain the domain defining the element.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterfaceType(final MDomain domain, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MIODomain piod : iod.getInherits())
			{
				if (piod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(piod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MAODomain paod : aod.getInherits())
			{
				if (paod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(paod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
			
		}

		return getRelativeObjectScope(domain.getInterfaceTypes(), outerScope);

	}
	
	/**
	 * Provides the list of types that can be included as part of the list of
	 * inherited interface types of an interface type.
	 * Implements Restrictions 24 and 25.
	 * @param interfaceType the interface type to which the inherit
	 * 		  reference belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterfaceType_inherits(final MInterfaceType interfaceType, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		MDomain domain = (MDomain)interfaceType.eContainer();
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MIODomain piod : iod.getInherits())
			{
				if (piod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(piod));
				}
			}
			outerScope = getFullObjectScope(parentTypes);
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MAODomain paod : aod.getInherits())
			{
				if (paod.eIsProxy() == false)
				{
					parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(paod));	
				}
			}
			outerScope = getFullObjectScope(parentTypes);
			
		}

		Set<MInterfaceType> currentTypes = new HashSet<MInterfaceType>();
		for (MInterfaceType itype : domain.getInterfaceTypes())
		{
			if (itype != interfaceType)
			{
				currentTypes.add(itype);
			}
		}
		
		return getRelativeObjectScope(currentTypes, outerScope);

	}
	
	/**
	 * Provides the list of component types that can be included as part of the
	 * component type instances of an AOD component type.
	 * @param aod the AOD to which the component type belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAODComponentType(final MAODomain aod, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		Set<MComponentType> parentTypes = new HashSet<MComponentType>();
			
		for (MAODomain paod : aod.getInherits())
		{
			if (paod.eIsProxy() == false)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllComponentTypes(paod));
			}
			
		}
		outerScope = getFullObjectScope(parentTypes);

		return getRelativeObjectScope(aod.getComponentTypes(), outerScope);

	}
	
	/**
	 * Provides the list of component types that can be included as part of the
	 * list of inherited component types of an AOD component type.
	 * Implements Restriction 21.
	 * @param componentType the component type to which the inherit
	 * 		  reference belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAODComponentType_inherits(final MAODComponentType componentType, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		MAODomain domain = (MAODomain)componentType.eContainer();
		
		Set<MComponentType> parentTypes = new HashSet<MComponentType>();
			
		for (MAODomain aod : domain.getInherits())
		{
			if (aod.eIsProxy() == false)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllComponentTypes(aod));
			}
		}
		outerScope = getFullObjectScope(parentTypes);

		Set<MAODComponentType> currentTypes = new HashSet<MAODComponentType>();
		for (MAODComponentType ctype : domain.getComponentTypes())
		{
			if (ctype != componentType)
			{
				currentTypes.add(ctype);
			}
		}
		
		return getRelativeObjectScope(currentTypes, outerScope);

	}
	
	/**
	 * Provides the list of component types that can be included as part of the
	 * list of inherited component types of an abstract IOD component type.
	 * Implements Restriction 20.
	 * @param componentType the component type to which the inherit
	 *        reference belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MIODAbstractComponentType_inherits(final MIODAbstractComponentType componentType, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		MIODomain domain = (MIODomain)componentType.eContainer();
		
		Set<MComponentType> parentTypes = new HashSet<MComponentType>();
			
		for (MIODomain iod : domain.getInherits())
		{
			if (iod.eIsProxy() == false)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllComponentTypes(iod));
			}	
		}
		outerScope = getFullObjectScope(parentTypes);

		Set<MIODAbstractComponentType> currentTypes = new HashSet<MIODAbstractComponentType>();
		for (MIODAbstractComponentType ctype : domain.getComponentTypes())
		{
			if (ctype != componentType)
			{
				currentTypes.add(ctype);
			}
		}
		
		return getRelativeObjectScope(currentTypes, outerScope);

	}
	
	/**
	 * Provides the list of component types that can be included as part of the
	 * component type instances of an IOD component type.
	 * @param domain the IOD to which the component type belongs.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MIODAbstractComponentType(final MIODomain domain, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		Set<MComponentType> parentTypes = new HashSet<MComponentType>();
			
		for (MIODomain piod : domain.getInherits())
		{
			if (piod.eIsProxy() == false)
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllComponentTypes(piod));
			}
		}
		outerScope = getFullObjectScope(parentTypes);
		
		return getRelativeObjectScope(domain.getComponentTypes(), outerScope);
	}
	
	/**
	 * Provides the scope with the list of AODs that can be included as
	 * inheritance references in the definition of an AOD.
	 * @param aodomain the application oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAODomain(final MAODomain aodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)aodomain.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)aodomain.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of IODs that can be included as
	 * inheritance references in the definition of an IOD.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MIODomain(final MIODomain iodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iodomain.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)iodomain.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of operating systems APIs that can be
	 * included in the definition of an IOD. This list includes the oeprating
	 * system APIs present in the PDL packages imported by the domain.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystemAPI(final MIODomain iodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iodomain.eContainer()).getImports();
		
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
	 * Provides the scope with the list of operating systems that can be
	 * included in the definition of an IOD. This list includes the operating
	 * systems present in the PDL packages imported by the domain.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystem(final MIODomain iodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iodomain.eContainer()).getImports();
		
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
	 * Provides the scope with the list of architectures that can be included
	 * in the definition of an IOD. This list includes the architectures 
	 * present in the PDL packages imported by the domain.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MArchitecture(final MIODomain iodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iodomain.eContainer()).getImports();
		
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
	 * Provides the scope with the list of compilers that can be included in
	 * the definition of an IOD. This list includes the compilers present in
	 * the PDL packages imported by the domain.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCompiler(final MIODomain iodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iodomain.eContainer()).getImports();
		
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
	 * Provides the scope with the list of microprocessors that can be included
	 * in the definition of an IOD. This list includes the microprocessors
	 * present in the PDL packages imported by the domain.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMicroprocessor(final MIODomain iodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iodomain.eContainer()).getImports();
		
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
	 * Provides the scope with the list of boards that can be included in the
	 * definition of an IOD. This list includes the boards present in the PDL
	 * packages imported by the domain.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MBoard(final MIODomain iodomain, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)iodomain.eContainer()).getImports();
		
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
	 * Provides the scope with the list of SAIs that can be required by an IOD.
	 * This list includes the interfaces present in the packages imported by
	 * the domain.
	 * @param iodomain the implementation oriented domain.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSAI(final MIODomain component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)component.eContainer()).getPackage();
		
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
