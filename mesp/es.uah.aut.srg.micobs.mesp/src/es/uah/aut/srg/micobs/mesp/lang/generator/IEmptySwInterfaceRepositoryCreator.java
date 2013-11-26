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
package es.uah.aut.srg.micobs.mesp.lang.generator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;

/**
 * Interface to create an empty SwInterface project.
 *
 */
public interface IEmptySwInterfaceRepositoryCreator {

	/**
	 * Creates the folder structure of the new SwInterface project.
	 * 
	 * @param swiPackageFile the root of the software interface model file.
	 * @param newProject the container where the new folders will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void createFolders(MMESPSWIPackageFile swiPackageFile, IContainer newProject, IProgressMonitor monitor);
	
	/**
	 * Creates the initial set of files the new SwInterface project.
	 * 
	 * @param swiPackageFile the root of the software interface model file.
	 * @param newProject the container where the new files will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void generateFiles(MMESPSWIPackageFile swiPackageFile, IContainer newProject, IProgressMonitor monitor);
	
}
