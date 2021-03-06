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
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.xtext.MESPElementAbstractScopeProvider;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * This class contains custom scoping description.
 * 
 */
public class PSWPScopeProvider extends MESPElementAbstractScopeProvider {
	
	
	/**
	 * Provides the scope for the referenced element, i.e. the platform, linked
	 * to a platform software package.
	 * 
	 * @param pswp the platform software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCommonPackageReferencingElement_referencedElement(final MPlatformSwPackage pswp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)pswp.eContainer()).getImports();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, pdlPackage.eINSTANCE.getMPlatform());
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope for the operating system software packages attached
	 * to a platform software package.
	 * 
	 * @param pswp the platform software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOSSwPackage(final MPlatformSwPackage pswp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)pswp.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)pswp.eContainer()).getPackage();
		
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
		importLibraries.add(MESPLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}

}

