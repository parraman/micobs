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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.plugin.MESPCToolGNUMake_3_81Plugin;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPUtil;
import es.uah.aut.srg.micobs.ui.handlers.UpdateRemoteFoldersHandler;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Handler of the command that updates the software packages deployed by
 * a given deployment model.
 *
 */
public class UpdateDeploymentSwPackages extends UpdateRemoteFoldersHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_UI_UpdateDeploymentSwPackages_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_UI_UpdateDeploymentSwPackages_ModelClassError_message");
	}

	@Override
	protected IFolder[] getFoldersToUnlink(IContainer rootFolder, EObject model) {
		return new IFolder[] 
		       { rootFolder.getFolder(new Path(MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_swpackages_foldername"))) };
	}
	
	@Override
	protected Diagnostic getNewMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList) {
		
		return getSWPMappingLists(rootFolder, model, itemList);
		
	}

	public static Diagnostic getSWPMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList) {
		
		MMESPDeployment deployment = (MMESPDeployment) ((MMESPDEPPackageFile)model).getElement();
		HashMap<String, String> swResourcesMap = new HashMap<String, String>();
		ILibraryManager libraryManager;
		try {
			libraryManager = MESPLibraryManager.getLibraryManager();
		} catch (LibraryManagerException e) {
			MESPCToolGNUMake_3_81Plugin.INSTANCE.log(e);
			return CheckingDiagnostic.createError(
					MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
							"_ERROR_ErrorWhenLoadingTheLibrary"));
		}
		
		CheckingDiagnostic diagnostic = CheckingDiagnostic.createOK("SWP Mapping List", model);
		
		Collection<MMESPSwPackageDeployment> swpds = null;
		
		if (deployment.getDeploymentAlternatives().isEmpty() == true)
		{
			swpds = deployment.getDeployedSwPackages();
		}
		else
		{
			swpds = new HashSet<MMESPSwPackageDeployment>();
			for (MMESPDeploymentAlternative alt : MESPUtil.getDefault().getLeafDeploymentAlternatives(deployment))
			{
				swpds.addAll(MESPUtil.getDefault().getAllDeployedSwPackagesFromAlternative(alt));
			}
			
		}
		
		for (Iterator<MMESPSwPackageDeployment> s = swpds.iterator(); s.hasNext(); )
		{
			MSwPackage swr = s.next().getSwPackage();
			MCommonPackageVersionedItem item;
			try {
				item = libraryManager.getVersionedItem(swr.getUri(), swr.getVersion());
			} catch (LibraryManagerException e) {
				MESPCToolGNUMake_3_81Plugin.INSTANCE.log(e);
				diagnostic.add(CheckingDiagnostic.createError(
						MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
								"_ERROR_ErrorWhenLoadingTheLibrary")));
				return diagnostic;
			}
			
			if (item instanceof MMESPVersionedItemSwPackage)
			{
				if (((MMESPVersionedItemSwPackage)item).getRepositoryFolderURI() != null &&
					((MMESPVersionedItemSwPackage)item).getRepositoryFolderURI().length() != 0)
				{
					swResourcesMap.put(
							StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swr)),
							((MMESPVersionedItemSwPackage)item).getRepositoryFolderURI());
				}
				else
				{
					diagnostic.add(CheckingDiagnostic.createError(
							MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
									"_ERROR_MSwResourceStorageURINotDefined", 
									new Object[] { swr.getName() }), swr));
				}
			}
			else if (item instanceof MMESPVersionedItemDriverSwPackage)
			{
				if (((MMESPVersionedItemDriverSwPackage)item).getRepositoryFolderURI() != null &&
					((MMESPVersionedItemDriverSwPackage)item).getRepositoryFolderURI().length() != 0)
				{
					swResourcesMap.put(
							StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swr)),
							((MMESPVersionedItemDriverSwPackage)item).getRepositoryFolderURI());
				}
				else
				{
					diagnostic.add(CheckingDiagnostic.createError(
							MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
									"_ERROR_MSwResourceStorageURINotDefined", 
									new Object[] { swr.getName() }), swr));
				}
			}
			else {
				diagnostic.add(CheckingDiagnostic.createError(
						MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
								"_ERROR_WrongModelItem", 
								new Object[] { MESPStringHelper.getDefault().getElementName(swr),
										 	   mesplibraryPackage.eINSTANCE.getMMESPItemSwPackage().getName()}), swr));
			}

		}			
		
		
		itemList.add(swResourcesMap);
		return diagnostic;
	}

	@Override
	protected EClass getModelEClass() {
		return mespdepPackage.eINSTANCE.getMMESPDEPPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mespdepItemProviderAdapterFactory();
	}

}
