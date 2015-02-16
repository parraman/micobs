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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.util.GNUMakeStringHelper;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

/**
 * Handler of the command that cleans the main folders that are no longer
 * used.
 *
 */
public class CleanMainFolders extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return GNUMakePlugin.INSTANCE.getString("_UI_CleanMainFolders_ConfirmDialog_message");
	}

	@Override
	protected List <IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		
		List <IResource> resourceList = new ArrayList<IResource>();
		IFolder mainFolder = rootFolder.getFolder(
				new Path(GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_main_foldername")));
		
		MMESPDeployment deployment = (MMESPDeployment) ((MMESPDEPPackageFile)model).getElement();
		
		Set<String> mainFolderNames = GNUMakeStringHelper.getMainFolderNames(deployment);
		
		if (mainFolder.exists() && mainFolder.members().length != 0)
		{
			IResource[] contents = mainFolder.members();
			
			for (int i = 0; i < contents.length; i++)
			{
				if (contents[i] instanceof IFolder)
				{
					IFolder file = (IFolder)contents[i];
					boolean found = false;
					for (Iterator<String> s = mainFolderNames.iterator(); s.hasNext(); )
					{
						String name = s.next();
						if (name.matches(file.getName()))
						{
							found = true;
							break;
						}
					}
					if (!found)
					{
						resourceList.add(file);
					}
				}
			}
		}
		return resourceList;
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {
		
	}

	@Override
	protected String getModelClassErrorMessage() {
		return GNUMakePlugin.INSTANCE.getString("_UI_CleanMainFolders_ModelClassError_message");
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
