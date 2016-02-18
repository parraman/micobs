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
package es.uah.aut.srg.micobs.mclev.domain.nulldomain.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.domain.nulldomain.generator.util.NULLDomainGeneratorUtil;
import es.uah.aut.srg.micobs.mclev.domain.nulldomain.plugin.NULLDomainPlugin;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.provider.mclevflatmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

/**
 * Handler of the command that generates the default construction files
 * of the main code of an application.
 *
 */
public class GenerateMESPDeployment extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return NULLDomainPlugin.INSTANCE.getString("_UI_GenerateMESPDeployment_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return NULLDomainPlugin.INSTANCE.getString("_UI_GenerateMESPDeployment_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mclevflatmcadPackage.eINSTANCE.getMMCLEVFLATMCADPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mclevflatmcadItemProviderAdapterFactory();
	}
	
	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {
		
		Collection<MCommonPackage> packages;
		try {
			packages = MESPLibraryManager.getLibraryManager().getAllPackages();
		} catch (LibraryManagerException e) {
			NULLDomainPlugin.INSTANCE.log(e);
			return;
		}
		
		ElementListSelectionDialog dialog = 
				new ElementListSelectionDialog(shell,
						new LabelProvider()
							{

								@Override
								public String getText(Object element) {
									if (element instanceof MCommonPackage)
									{
										return ((MCommonPackage)element).getUri();
									}
									return super.getText(element);
								}
							});
		
		dialog.setTitle("Package Selection");
		dialog.setMessage("Select the MESP package of the target model:");
		dialog.setElements(packages.toArray());
		dialog.setMultipleSelection(false);
		
		MCommonPackage selectedPackage = null;
		
		// User pressed cancel
		if (dialog.open() == Window.OK) {
			
			Object[] result = dialog.getResult(); 
			
			selectedPackage = (MCommonPackage) result[0];
		}
		else
		{
			return;
		}
		
		try {
			NULLDomainGeneratorUtil.generateMESPDeployment(rootFolder.getLocation().toPortableString() + "/" +
					NULLDomainPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"),
					model,
					monitor,
					selectedPackage);
		} catch (Exception e)
		{
			NULLDomainPlugin.INSTANCE.log(e);
		}

	}

}
