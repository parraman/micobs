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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.generator;

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
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.util.GNUMakeUtilProvider;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.ui.handlers.UpdateRemoteFoldersHandler;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Handler of the command that updates the operating system software
 * interfaces used in a given deployment model.
 *
 */
public class UpdateDeploymentOSSwInterfaces extends UpdateRemoteFoldersHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return GNUMakePlugin.INSTANCE.getString("_UI_UpdateDeploymentOSSwInterfaces_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return GNUMakePlugin.INSTANCE.getString("_UI_UpdateDeploymentOSSwInterfaces_ModelClassError_message");
	}

	@Override
	protected IFolder[] getFoldersToUnlink(IContainer rootFolder,
			EObject model) {
		return new IFolder[] 
			       { rootFolder.getFolder(new Path(GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_osswinterfaces_foldername"))) };
	}
	
	public static Diagnostic getOOSWIMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList) {
		
		MMESPDeployment deployment = (MMESPDeployment) ((MMESPDEPPackageFile)model).getElement();
		HashMap<String, String> osswisMap = new HashMap<String, String>();
		ILibraryManager libraryManager;
		try {
			libraryManager = MESPLibraryManager.getLibraryManager();
		} catch (LibraryManagerException e) {
			GNUMakePlugin.INSTANCE.log(e);
			return CheckingDiagnostic.createError(
					GNUMakePlugin.INSTANCE.getString(
							"_ERROR_ErrorWhenLoadingTheLibrary"));
		}
		
		CheckingDiagnostic diagnostic = CheckingDiagnostic.createOK("OSSWI Mapping List", model);
		
		
		String folderName = GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_osswinterfaces_foldername");

		FileHelper.createFolder(rootFolder, folderName);
		
		for (MOSSwInterface osswi : GNUMakeUtilProvider.getMESPUtil().getAllProvidedOSSwInterfaces(deployment))
		{
			MCommonPackageVersionedItem item;
			try {
				item = libraryManager.getVersionedItem(osswi.getUri(), osswi.getVersion());
			} catch (LibraryManagerException e) {
				GNUMakePlugin.INSTANCE.log(e);
				diagnostic.add(CheckingDiagnostic.createError(
						GNUMakePlugin.INSTANCE.getString(
								"_ERROR_ErrorWhenLoadingTheLibrary")));
				return diagnostic;
			}
			if (!(item instanceof MMESPVersionedItemOSSwInterface))
			{
				diagnostic.add(CheckingDiagnostic.createError(
						GNUMakePlugin.INSTANCE.getString(
								"_ERROR_WrongModelItem", 
								new Object[] { MESPStringHelper.getDefault().getElementName(osswi),
										 	   mesplibraryPackage.eINSTANCE.getMMESPItemOSSwInterface().getName()}), osswi));
				continue;
			}
			if (((MMESPVersionedItemOSSwInterface)item).getRepositoryFolderURI() != null &&
				((MMESPVersionedItemOSSwInterface)item).getRepositoryFolderURI().length() != 0)
			{
				osswisMap.put(
						StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(osswi)),
						((MMESPVersionedItemOSSwInterface)item).getRepositoryFolderURI());
			}
			else
			{
				diagnostic.add(CheckingDiagnostic.createError(
						GNUMakePlugin.INSTANCE.getString(
								"_ERROR_MSwResourceStorageURINotDefined", 
								new Object[] { osswi.getName() }), osswi));
			}
		}
		
		itemList.add(osswisMap);
		return diagnostic;
	}

	@Override
	protected Diagnostic getNewMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList) {
		
		return getOOSWIMappingLists(rootFolder, model, itemList);

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
