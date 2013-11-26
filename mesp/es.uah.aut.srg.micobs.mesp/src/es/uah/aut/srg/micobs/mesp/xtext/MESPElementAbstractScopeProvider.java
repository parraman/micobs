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
package es.uah.aut.srg.micobs.mesp.xtext;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPUtil;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

public abstract class MESPElementAbstractScopeProvider extends
	MICOBSElementAbstractScopeProvider {

	/**
	 * Provides the scope for the list of construction tools installed in the
	 * system.
	 * 
	 * @param file the root of the element to which the reference belongs.
	 * @param reference the object that represents the reference.
	 * @return the scope with the selectable construction tools.
	 */
	public IScope scope_MConstructionTool(final MCommonPackageFile file, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = file.getImports();
		final MCommonPackage elementPackage = file.getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mespctoolPackage.eINSTANCE.getMConstructionTool());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mespctoolPackage.eINSTANCE.getMConstructionTool()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	/**
	 * Returns the complete set of parameters defined by the different platform
	 * elements attached to a given software package supported platform.
	 * 
	 * @param swpsp the software package supported platform.
	 * @return the set of parameters.
	 */
	protected Set<MParameter> getAllPlatformParameters(MSwPackageSupportedPlatform swpsp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		if (swpsp.getOsapi() != null &&
			swpsp.getOsapi().eIsProxy() == false)
		{
			params.addAll(MESPUtil.getDefault().getAllParameters(swpsp.getOsapi()));
		}
		if (swpsp.getOs() != null &&
			swpsp.getOs().eIsProxy() == false)
		{
			params.addAll(MESPUtil.getDefault().getAllParameters(swpsp.getOs()));
		}
		if (swpsp.getArchitecture() != null &&
			swpsp.getArchitecture().eIsProxy() == false)
		{
			params.addAll(MESPUtil.getDefault().getAllParameters(swpsp.getArchitecture()));
		}
		if (swpsp.getCompiler() != null &&
			swpsp.getCompiler().eIsProxy() == false)
		{
			if (swpsp.getArchitecture() != null &&
					swpsp.getArchitecture().eIsProxy() == false)
			{
				params.addAll(MESPUtil.getDefault().getAllParameters(swpsp.getCompiler()));
			}
			else
			{
				params.addAll(MESPUtil.getDefault().getAllParameters(swpsp.getCompiler(), swpsp.getArchitecture()));
			}
		}
		if (swpsp.getMicroprocessor() != null &&
			swpsp.getMicroprocessor().eIsProxy() == false)
		{
			params.addAll(MESPUtil.getDefault().getParameters(swpsp.getMicroprocessor()));
		}
		if (swpsp.getBoard() != null &&
			swpsp.getBoard().eIsProxy() == false)
		{
			params.addAll(MESPUtil.getDefault().getParameters(swpsp.getBoard()));
		}
		
		return params;
	}

}