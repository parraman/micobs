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
package es.uah.aut.srg.micobs.mclev.domain.nulldomain.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mclev.mclevdom.generator.IEmptyMCLEVDeploymentProjectCreator;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;

public class EmptyMCLEVDeploymentProjectCreator implements
		IEmptyMCLEVDeploymentProjectCreator {

	@Override
	public void generateFiles(MMCLEVMCADPackageFile depPackageFile,
			IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		monitor.done();

	}
	

	@Override
	public void createFolders(MMCLEVMCADPackageFile depPackageFile,
			IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		monitor.done();
	}

}
