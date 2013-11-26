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

import java.util.HashMap;
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
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPUtil;
import es.uah.aut.srg.micobs.ui.handlers.UpdateRemoteFoldersHandler;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Handler of the command that updates the software interfaces provided for
 * a given deployment model.
 *
 */
public class UpdateDeploymentSwInterfaces extends UpdateRemoteFoldersHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_UI_UpdateDeploymentSwInterfaces_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_UI_UpdateDeploymentSwInterfaces_ModelClassError_message");
	}

	@Override
	protected IFolder[] getFoldersToUnlink(IContainer rootFolder,
			EObject model) {
		return new IFolder[] 
			       { rootFolder.getFolder(new Path(MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_swinterfaces_foldername"))) };
	}
	
	@Override
	protected Diagnostic getNewMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList) {
		
		return getSWIMappingLists(rootFolder, model, itemList);
		
	}

	public static Diagnostic getSWIMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList) {
		
		
		MMESPDeployment deployment = (MMESPDeployment) ((MMESPDEPPackageFile)model).getElement();
		HashMap<String, String> swInterfacesMap = new HashMap<String, String>();
		ILibraryManager libraryManager;
		try {
			libraryManager = MESPLibraryManager.getLibraryManager();
		} catch (LibraryManagerException e) {
			MESPCToolGNUMake_3_81Plugin.INSTANCE.log(e);
			return CheckingDiagnostic.createError(
					MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
							"_ERROR_ErrorWhenLoadingTheLibrary"));
		}
		
		CheckingDiagnostic diagnostic = CheckingDiagnostic.createOK("SWI Mapping List", model);
		
		String folderName = MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_swinterfaces_foldername");

		FileHelper.createFolder(rootFolder, folderName);
		
		for (MSwInterface swi : MESPUtil.getDefault().getAllProvidedSwInterfaces(deployment))
		{
			MCommonPackageVersionedItem item;
			try {
				item = libraryManager.getVersionedItem(swi.getUri(), swi.getVersion());
			} catch (LibraryManagerException e) {
				MESPCToolGNUMake_3_81Plugin.INSTANCE.log(e);
				diagnostic.add(CheckingDiagnostic.createError(
						MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
								"_ERROR_ErrorWhenLoadingTheLibrary")));
				return diagnostic;
			}
			if (!(item instanceof MMESPVersionedItemSwInterface))
			{
				diagnostic.add(CheckingDiagnostic.createError(
						MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
								"_ERROR_WrongModelItem", 
								new Object[] { MESPStringHelper.getDefault().getElementName(swi),
										 	   mesplibraryPackage.eINSTANCE.getMMESPItemSwInterface().getName()}), swi));
				continue;
			}
			if (((MMESPVersionedItemSwInterface)item).getRepositoryFolderURI() != null &&
				((MMESPVersionedItemSwInterface)item).getRepositoryFolderURI().length() != 0)
			{
				swInterfacesMap.put(
						StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swi)),
						((MMESPVersionedItemSwInterface)item).getRepositoryFolderURI());
			}
			else
			{
				diagnostic.add(CheckingDiagnostic.createError(
						MESPCToolGNUMake_3_81Plugin.INSTANCE.getString(
								"_ERROR_MSwResourceStorageURINotDefined", 
								new Object[] { swi.getName() }), swi));
			}
		}
		
		itemList.add(swInterfacesMap);
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
