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
package es.uah.aut.srg.micobs.mclev.mclevdom.generator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapter;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;

/**
 * Interface that can be used to install a MCLEV deployment project creator.
 * This interface is used by the MCLEV project definition wizard and to perform
 * two steps of the process: folder creation and file generation.
 * 
 * When a domain is defined, it can define an adapter for this interface by
 * installing a proper {@link DomainAdapter}
 *
 */
public interface IEmptyMCLEVDeploymentProjectCreator {

	/**
	 * Creates the folders of a given deployment project.
	 * @param depPackageFile the root of the deployment model used in the project.
	 * @param newProject the container root of the project.
	 * @param monitor the process monitor.
	 */
	public void createFolders(MMCLEVMCADPackageFile depPackageFile, IContainer newProject, IProgressMonitor monitor);
	
	/**
	 * Generates all the files needed by the deployment project. This method
	 * is always executed after <code>createFolders</code>.
	 * @param depPackageFile the root of the deployment model used in the project.
	 * @param newProject the container root of the project.
	 * @param monitor the process monitor.
	 */
	public void generateFiles(MMCLEVMCADPackageFile depPackageFile, IContainer newProject, IProgressMonitor monitor);
	
}