package es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyPlatformSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.util.LanguageCPPGeneratorUtil;

public class EmptyPlatformSwPackageProjectCreator implements IEmptyPlatformSwPackageProjectCreator {

	@Override
	public void generateFiles(MMESPPSWPPackageFile pswpPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		monitor.done();
		
	}

	@Override
	public void createFolders(MMESPPSWPPackageFile pswpPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the platform software package
		// project
		LanguageCPPGeneratorUtil.createPlatformSwPackageProjectSkeleton(pswpPackageFile, newProject);
		
		monitor.done();
		
	}

}
