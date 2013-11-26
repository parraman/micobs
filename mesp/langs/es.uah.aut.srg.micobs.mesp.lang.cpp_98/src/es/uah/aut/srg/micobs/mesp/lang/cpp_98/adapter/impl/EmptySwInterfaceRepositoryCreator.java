package es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.util.LanguageCPPGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.plugin.MESPLangCPP_98Plugin;

public class EmptySwInterfaceRepositoryCreator implements IEmptySwInterfaceRepositoryCreator {
	
	protected static final String LANGUAGE_NAME = "CPP";
	protected static final String LANGUAGE_VERSION = "98";

	@Override
	public void generateFiles(MMESPSWIPackageFile swiPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		try {
			LanguageCPPGeneratorUtil.generateProvidedInterfaceTemplate(newProject.getLocation().toPortableString() + "/" +
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_public_foldername"),
				swiPackageFile.getElement(), new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPLangCPP_98Plugin.INSTANCE.log(e);
		}
	
		monitor.done();
		
	}

	@Override
	public void createFolders(MMESPSWIPackageFile swiPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the SwResource project
		LanguageCPPGeneratorUtil.createSwInterfaceRepositorySkeleton(swiPackageFile, newProject);
		
		monitor.done();
	}

}
