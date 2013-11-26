package es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.util.LanguageCGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.plugin.MESPLangC_C99Plugin;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;

public class EmptyOSSwInterfaceRepositoryCreator implements IEmptyOSSwInterfaceRepositoryCreator {
	
	@Override
	public void generateFiles(MMESPOSSWIPackageFile swiPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Generating files", 100);//$NON-NLS-1$

		try {
			LanguageCGeneratorUtil.generateOSSwInterfaceTemplate(newProject.getLocation().toPortableString() + "/" +
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
	public void createFolders(MMESPOSSWIPackageFile osswiPackageFile, IContainer newProject, IProgressMonitor monitor) {
		
		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$

		// We have to create the skeleton of the SwResource project
		LanguageCGeneratorUtil.createOSSwInterfaceRepositorySkeleton(osswiPackageFile, newProject);
		
		monitor.done();
		
	}

}
