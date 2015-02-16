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
package es.uah.aut.srg.micobs.mesp.lang.generator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;

/**
 * Interface to create an empty Platform SwPackage project.
 *
 */
public interface IEmptyPlatformSwPackageProjectCreator {

	/**
	 * Creates the folder structure of the new Platform SwPackage project.
	 * 
	 * @param pswpPackageFile the root of the platform software package
	 * model file.
	 * @param newProject the container where the new folders will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void createFolders(MMESPPSWPPackageFile pswpPackageFile, IContainer newProject, IProgressMonitor monitor);
	
	/**
	 * Creates initial set of files of the new Platform SwPackage project.
	 * 
	 * @param pswpPackageFile the root of the platform software package
	 * model file.
	 * @param newProject the container where the new files will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void generateFiles(MMESPPSWPPackageFile pswpPackageFile, IContainer newProject, IProgressMonitor monitor);
	
}
