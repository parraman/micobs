package es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.util.LanguageCPPGeneratorUtil;

public class EmptyOSSwPackageProjectCreator implements IEmptyOSSwPackageProjectCreator {

	@Override
	public void generateFiles(MMESPOSSWPPackageFile osswpPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		monitor.done();
		
	}

	@Override
	public void createFolders(MMESPOSSWPPackageFile osswpPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the operating system software
		// package project
		LanguageCPPGeneratorUtil.createOSSwPackageProjectSkeleton(osswpPackageFile, newProject);
		
		monitor.done();
		
	}

}
