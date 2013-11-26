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

import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;

/**
 * Interface to create an empty SwPackage project.
 *
 */
public interface IEmptySwPackageProjectCreator {

	/**
	 * Creates the folder structure of the new SwPackage project.
	 * 
	 * @param swpPackageFile the root of the software package model file.
	 * @param newProject the container where the new folders will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void createFolders(MMESPSWPPackageFile swpPackageFile, IContainer newProject, IProgressMonitor monitor);
	
	/**
	 * Creates the initial set of files the new SwPackage project.
	 * 
	 * @param swpPackageFile the root of the software package model file.
	 * @param newProject the container where the new files will be created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public void generateFiles(MMESPSWPPackageFile swpPackageFile, IContainer newProject, IProgressMonitor monitor);
	
}
