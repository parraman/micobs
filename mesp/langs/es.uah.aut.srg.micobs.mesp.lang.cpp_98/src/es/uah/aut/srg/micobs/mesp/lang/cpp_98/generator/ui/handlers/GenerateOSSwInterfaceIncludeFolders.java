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

import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.provider.mesposswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.util.LanguageCPPGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.plugin.MESPLangCPP_98Plugin;

public class GenerateOSSwInterfaceIncludeFolders extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return null;
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPLangCPP_98Plugin.INSTANCE.getString("_UI_GenerateOSSwInterfaceIncludeFolders_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mesposswiPackage.eINSTANCE.getMMESPOSSWIPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mesposswiItemProviderAdapterFactory();
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

		// We have to create the skeleton of the package
		LanguageCPPGeneratorUtil.createOSSwInterfaceRepositorySkeleton(model, rootFolder);
		
		monitor.done();
		
	}

}
