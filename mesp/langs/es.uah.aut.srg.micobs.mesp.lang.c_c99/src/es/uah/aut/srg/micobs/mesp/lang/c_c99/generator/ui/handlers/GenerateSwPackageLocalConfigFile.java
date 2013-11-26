package es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.util.LanguageCGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.plugin.MESPLangC_C99Plugin;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.provider.mespswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;
import es.uah.aut.srg.modeling.util.file.FileHelper;

public class GenerateSwPackageLocalConfigFile extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return MESPLangC_C99Plugin.INSTANCE.getString("_UI_GenerateSwPackageLocalConfigFile_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPLangC_C99Plugin.INSTANCE.getString("_UI_GenerateSwPackageLocalConfigFile_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mespswpPackage.eINSTANCE.getMMESPSWPPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mespswpItemProviderAdapterFactory();
	}

	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {

		MMESPSWPPackageFile swPackagePackageFile = (MMESPSWPPackageFile)model;

		if (rootFolder.getFolder(new Path(MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername"))).exists() == false)
		{
			FileHelper.createFolder(MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername"));
		}
		try {
			LanguageCGeneratorUtil.generateLocalConfigFile(rootFolder.getLocation().toPortableString() + "/" +
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername"),
					swPackagePackageFile, new NullProgressMonitor());	
		} catch (Exception e)
		{
			MESPLangC_C99Plugin.INSTANCE.log(e);
		}
	}

}
