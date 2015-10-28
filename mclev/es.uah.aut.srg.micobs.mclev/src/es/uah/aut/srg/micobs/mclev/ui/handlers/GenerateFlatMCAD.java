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
package es.uah.aut.srg.micobs.mclev.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mclev.generator.util.MCLEVGeneratorUtil;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.provider.mclevmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

/**
 * Handler that implements the functionality of generating a new Flat MCAD
 * model from an existing and well-defined MCAD model file.
 */
public class GenerateFlatMCAD extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return MCLEVPlugin.INSTANCE.getString("_UI_GenerateFlatMCAD_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MCLEVPlugin.INSTANCE.getString("_UI_GenerateFlatMCAD_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mclevmcadPackage.eINSTANCE.getMMCLEVMCADPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mclevmcadItemProviderAdapterFactory();
	}

	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {

		MMCLEVMCADPackageFile mcadPackageFile = (MMCLEVMCADPackageFile)model;

		try {
			MMCLEVFLATMCADPackageFile flatPackageFile = MCLEVGeneratorUtil.generateFlatMCAD(
					mcadPackageFile, monitor);
			if (flatPackageFile != null)
			{
				MCLEVGeneratorUtil.serializeFlatMCAD(rootFolder.getLocation().toPortableString() + "/" +
						MCLEVPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"),
					flatPackageFile, monitor);	
			}
		} catch (Exception e)
		{
			MCLEVPlugin.INSTANCE.log(e);
		}
	}

}