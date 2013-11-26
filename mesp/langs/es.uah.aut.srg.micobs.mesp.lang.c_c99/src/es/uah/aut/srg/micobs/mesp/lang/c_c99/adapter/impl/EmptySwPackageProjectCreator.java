package es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.util.LanguageCGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;

public class EmptySwPackageProjectCreator implements IEmptySwPackageProjectCreator {

	@Override
	public void generateFiles(MMESPSWPPackageFile swPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		monitor.done();
		
	}

	@Override
	public void createFolders(MMESPSWPPackageFile swPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the SwResource project
		LanguageCGeneratorUtil.createSwPackageProjectSkeleton(swPackageFile, newProject);
		
		monitor.done();
		
	}

}
