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
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.ctool.gnumake.generator.util.GNUMakeGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.mespctool.generator.ui.handlers.GenerateDeploymentConstructionFiles;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;

/**
 * Handler of the command that creates the default GNU Makefile project
 * skeleton.
 *
 */
public class GenerateDeploymentGNUMakeProjectSkeleton extends GenerateDeploymentConstructionFiles {

	@Override
	protected String getConfirmDialogMessage() {
		return null;
	}
	
	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {
		
		GNUMakeGeneratorUtil.createMESPDeploymentProjectSkeleton((MMESPDEPPackageFile) model, rootFolder);
		
	}
}
