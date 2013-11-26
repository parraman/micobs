package es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.util.LanguageCPPGeneratorUtil;

public class EmptySwPackageProjectCreator implements IEmptySwPackageProjectCreator {

	@Override
	public void generateFiles(MMESPSWPPackageFile swpPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		monitor.done();
		
	}

	@Override
	public void createFolders(MMESPSWPPackageFile swpPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the software package project
		LanguageCPPGeneratorUtil.createSwPackageProjectSkeleton(swpPackageFile, newProject);
		
		monitor.done();
		
	}

}
