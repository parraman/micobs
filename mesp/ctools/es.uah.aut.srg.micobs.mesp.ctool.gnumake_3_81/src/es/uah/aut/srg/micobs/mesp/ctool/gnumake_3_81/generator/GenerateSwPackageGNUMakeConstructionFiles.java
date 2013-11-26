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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.generator.util.GNUMakeGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.plugin.MESPCToolGNUMake_3_81Plugin;
import es.uah.aut.srg.micobs.mesp.mespctool.generator.ui.handlers.GenerateSwPackageConstructionFiles;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;

/**
 * Handler of the command that generates the default construction files
 * of a software package.
 *
 */
public class GenerateSwPackageGNUMakeConstructionFiles extends GenerateSwPackageConstructionFiles {

	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {
		
		try {
			GNUMakeGeneratorUtil.generateMSwPackageDefsMk(rootFolder.getLocation().toPortableString(), 
				((MMESPSWPPackageFile)model).getElement(), 
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPCToolGNUMake_3_81Plugin.INSTANCE.log(e);
		}

	}

}
