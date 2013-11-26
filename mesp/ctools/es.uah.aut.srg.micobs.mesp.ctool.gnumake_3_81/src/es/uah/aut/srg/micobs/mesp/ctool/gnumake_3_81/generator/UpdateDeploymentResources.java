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

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.plugin.MESPCToolGNUMake_3_81Plugin;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.ui.handlers.UpdateRemoteFoldersHandler;

/**
 * Handler of the command that updates all the external resources
 * (packages and interfaces) used in a given deployment model.
 *
 */
public class UpdateDeploymentResources extends UpdateRemoteFoldersHandler {

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
			{ 
				// The order in the array of folder should match with that of the getNewMappingLists function
				rootFolder.getFolder(new Path(MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_osswinterfaces_foldername"))),
				rootFolder.getFolder(new Path(MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_osswpackages_foldername"))),
				rootFolder.getFolder(new Path(MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_swinterfaces_foldername"))),
				rootFolder.getFolder(new Path(MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_swpackages_foldername"))),
				rootFolder.getFolder(new Path(MESPCToolGNUMake_3_81Plugin.INSTANCE.getString("_MESPDeploymentProject_platformswpackages_foldername")))
			};
	}
	
	@Override
	protected Diagnostic getNewMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList) {
		
		CheckingDiagnostic diagnostic = CheckingDiagnostic.createOK("Get Mapping Lists", model);
		
		diagnostic.addAll(UpdateDeploymentOSSwInterfaces.getOOSWIMappingLists(rootFolder, model, itemList));
		diagnostic.addAll(UpdateDeploymentOSSwPackages.getOSSWPNewMappingLists(rootFolder, model, itemList));
		diagnostic.addAll(UpdateDeploymentSwInterfaces.getSWIMappingLists(rootFolder, model, itemList));
		diagnostic.addAll(UpdateDeploymentSwPackages.getSWPMappingLists(rootFolder, model, itemList));
		diagnostic.addAll(UpdateDeploymentPlatformSwPackages.getPSWPMappingLists(rootFolder, model, itemList));
		
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
