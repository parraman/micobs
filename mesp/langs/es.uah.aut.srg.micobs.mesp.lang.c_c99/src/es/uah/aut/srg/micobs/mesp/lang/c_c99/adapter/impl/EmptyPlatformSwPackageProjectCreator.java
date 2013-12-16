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
package es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.util.LanguageCGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyPlatformSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;

/**
 * Default implementation of a  the Platform Software Package project creator
 * for the C(C99) language.
 *
 */
public class EmptyPlatformSwPackageProjectCreator implements IEmptyPlatformSwPackageProjectCreator {

	@Override
	public void generateFiles(MMESPPSWPPackageFile pswPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		monitor.done();
		
	}

	@Override
	public void createFolders(MMESPPSWPPackageFile pswPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the SwResource project
		LanguageCGeneratorUtil.createPlatformSwPackageProjectSkeleton(pswPackageFile, newProject);
		
		monitor.done();
		
	}

}
