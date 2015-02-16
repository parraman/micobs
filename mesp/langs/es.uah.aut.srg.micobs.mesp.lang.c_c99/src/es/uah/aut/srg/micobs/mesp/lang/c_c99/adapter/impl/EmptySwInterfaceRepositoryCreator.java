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
package es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.util.LanguageCGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.plugin.MESPLangC_C99Plugin;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;

/**
 * Default implementation of a  the SwInterface repository creator for the
 * C(C99) language.
 *
 */
public class EmptySwInterfaceRepositoryCreator implements IEmptySwInterfaceRepositoryCreator {
	
	@Override
	public void generateFiles(MMESPSWIPackageFile swiPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		try {
			LanguageCGeneratorUtil.generateProvidedInterfaceTemplate(newProject.getLocation().toPortableString() + "/" +
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_public_foldername"),
				swiPackageFile.getElement(), new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPLangC_C99Plugin.INSTANCE.log(e);
		}
	
		monitor.done();
		
	}

	@Override
	public void createFolders(MMESPSWIPackageFile swiPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the SwResource project
		LanguageCGeneratorUtil.createSwInterfaceRepositorySkeleton(swiPackageFile, newProject);
		
		monitor.done();
		
	}

}
