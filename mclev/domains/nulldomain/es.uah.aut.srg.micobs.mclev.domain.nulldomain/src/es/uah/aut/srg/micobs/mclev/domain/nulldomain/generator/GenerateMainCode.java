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
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mclev.domain.nulldomain.generator.util.NULLDomainGeneratorUtil;
import es.uah.aut.srg.micobs.mclev.domain.nulldomain.plugin.NULLDomainPlugin;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.provider.mclevflatmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.util.GNUMakeStringHelper;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

/**
 * Handler of the command that generates the main deployment code of an
 * application.
 *
 */
public class GenerateMainCode extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return NULLDomainPlugin.INSTANCE.getString("_UI_GenerateMainCode_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return NULLDomainPlugin.INSTANCE.getString("_UI_GenerateMainCode_ModelClassError_message");
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
		
		try {
			NULLDomainGeneratorUtil.generateMainCode(rootFolder.getLocation().toPortableString()  + "/" +
					GNUMakeStringHelper.getMainFolder(),
					model,
					monitor);
		} catch (Exception e)
		{
			NULLDomainPlugin.INSTANCE.log(e);
		}

	}

}
