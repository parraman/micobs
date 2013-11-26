package es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.util.LanguageCPPGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.plugin.MESPLangCPP_98Plugin;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.provider.mespswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

public class GenerateSwInterfaceTemplate extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return MESPLangCPP_98Plugin.INSTANCE.getString("_UI_GenerateSwInterfaceTemplate_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPLangCPP_98Plugin.INSTANCE.getString("_UI_GenerateSwInterfaceTemplate_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mespswiPackage.eINSTANCE.getMMESPSWIPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mespswiItemProviderAdapterFactory();
	}

	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {

		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$
		
		MMESPSWIPackageFile swInterfacePackageFile = (MMESPSWIPackageFile)model;

		// We have to create the skeleton of the package
		LanguageCPPGeneratorUtil.createSwInterfaceRepositorySkeleton(model, rootFolder);
		
		try {
			LanguageCPPGeneratorUtil.generateProvidedInterfaceTemplate(rootFolder.getLocation().toPortableString() + "/" +
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_public_foldername"),
					swInterfacePackageFile.getElement(), new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPLangCPP_98Plugin.INSTANCE.log(e);
		}
		
		monitor.done();
		
	}

}
