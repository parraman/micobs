package es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.util.LanguageCGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.plugin.MESPLangCPP_98Plugin;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.provider.mesposswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

public class CreateOSSwPackagePlatformFoldersTree extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return null;
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPLangCPP_98Plugin.INSTANCE.getString("_UI_GenerateOSSwPackagePlatformFoldersTree_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mesposswpPackage.eINSTANCE.getMMESPOSSWPPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mesposswpItemProviderAdapterFactory();
	}

	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {

		MMESPOSSWPPackageFile osswPackagePackageFile = (MMESPOSSWPPackageFile)model;
		
		if (osswPackagePackageFile.getElement() instanceof MOSSwPackage)
		{
			LanguageCGeneratorUtil.createPlatformFoldersTree((MOSSwPackage)osswPackagePackageFile.getElement(),
					rootFolder);
			
		}
		
	}

}
