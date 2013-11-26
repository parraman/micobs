package es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.ui.handlers;

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
import es.uah.aut.srg.micobs.mesp.lang.c_c99.plugin.MESPLangC_C99Plugin;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.provider.mespswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

public class GenerateSwInterfaceIncludeFolders extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return null;
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPLangC_C99Plugin.INSTANCE.getString("_UI_GenerateSwInterfaceIncludeFolders_ModelClassError_message");
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

		// We have to create the skeleton of the package
		LanguageCGeneratorUtil.createSwInterfaceRepositorySkeleton(model, rootFolder);
		
		monitor.done();
		
	}

}
