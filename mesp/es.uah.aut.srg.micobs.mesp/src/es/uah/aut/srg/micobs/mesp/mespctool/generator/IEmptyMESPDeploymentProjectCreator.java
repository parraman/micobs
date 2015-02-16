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
package es.uah.aut.srg.micobs.mesp.mespctool.generator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;

/**
 * Interface to create an empty MESP deployment project. This interface
 * should be implemented for each of the different constructions tools 
 * installed in the system.
 *
 */
public interface IEmptyMESPDeploymentProjectCreator {

	/**
	 * Creates the folder structure of the new MESP deployment project.
	 * 
	 * @param depPackageFile the root of the MESP deployment model file.
	 * @param newProject the container where the new folders will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void createFolders(MMESPDEPPackageFile depPackageFile, IContainer newProject, IProgressMonitor monitor);
	
	/**
	 * Creates the initial set of files of the new MESP deployment project.
	 * 
	 * @param depPackageFile the root of the MESP deployment model file.
	 * @param newProject the container where the new files will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void generateFiles(MMESPDEPPackageFile depPackageFile, IContainer newProject, IProgressMonitor monitor);
	
}
