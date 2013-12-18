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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
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
 * Handler of the command that cleans the construction files that are
 * no longer used.
 *
 */
public class CleanDeploymentGNUMakeConstructionFiles extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return GNUMakePlugin.INSTANCE.getString("_UI_CleanMainFolders_ConfirmDialog_message");
	}

	@Override
	protected List <IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		
		List <IResource> resourceList = new ArrayList<IResource>();
		
		MMESPDeployment deployment = (MMESPDeployment) ((MMESPDEPPackageFile)model).getElement();
		
		Set<String> mainFolderNames = GNUMakeStringHelper.getMainFolderNames(deployment);
		
		IResource[] contents = rootFolder.members();
			
		for (int i = 0; i < contents.length; i++)
		{
			if (contents[i] instanceof IFile)
			{
				IFile file = (IFile)contents[i];
				if (file.getFileExtension() == null ||
					file.getFileExtension().matches("mk") == false)
				{
					continue;
				}
				boolean found = false;
				for (Iterator<String> s = mainFolderNames.iterator(); s.hasNext(); )
				{
					String name = s.next() + ".mk";
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
