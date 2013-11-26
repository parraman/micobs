package es.uah.aut.srg.micobs.mesp.lang.cpp_98.generator.util;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.plugin.MESPLangCPP_98Plugin;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;
import es.uah.aut.srg.modeling.util.xpand.XpandUtil;

public class LanguageCPPGeneratorUtil {

	protected static EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
		@Override
		protected EPackage[] allPackages() {
			return new EPackage[] { EcorePackage.eINSTANCE, 
				commonPackage.eINSTANCE,
				systemPackage.eINSTANCE,
				pdlPackage.eINSTANCE,
				mespcommonPackage.eINSTANCE,
				mespctoolPackage.eINSTANCE,
				mesposswiPackage.eINSTANCE,
				mesposswpPackage.eINSTANCE,
				mespswiPackage.eINSTANCE,
				mespswpPackage.eINSTANCE,
				mesppswpPackage.eINSTANCE,
				mespdepPackage.eINSTANCE };
    	}
	};
	
	public static void createSwInterfaceRepositorySkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPSWIPackageFile)
		{
			FileHelper.createFolder(rootFolder,
						MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
						MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_public_foldername"));
		}
	}
	
	public static void createOSSwInterfaceRepositorySkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPOSSWIPackageFile)
		{
			FileHelper.createFolder(rootFolder,
						MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
						MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_public_foldername"));
		}
	}
	
	public static void createSwPackageProjectSkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPSWPPackageFile)
		{
			MMESPSWPPackageFile swpPackageFile = (MMESPSWPPackageFile)model;

			FileHelper.createFolder(rootFolder,
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_src_foldername"));
			FileHelper.createFolder(rootFolder,
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					StringHelper.toLowerDefString(swpPackageFile.getElement().getName()));
		}
	}
	
	public static void createPlatformSwPackageProjectSkeleton(EObject model, IContainer rootFolder)
	{
		FileHelper.createFolder(rootFolder,
				MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
				MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPlatformSwPackage_include_platform_foldername"));
	}
		
	public static void createOSSwPackageProjectSkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPOSSWPPackageFile)
		{
			MMESPOSSWPPackageFile osswpPackageFile = (MMESPOSSWPPackageFile)model;

			FileHelper.createFolder(rootFolder,
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_src_foldername"));
			FileHelper.createFolder(rootFolder,
					MESPLangCPP_98Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					StringHelper.toLowerDefString(osswpPackageFile.getElement().getName()));
		}
	}
	
	
	
	public static void generateProvidedInterfaceTemplate(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildCPP_98ProvidedInterfaceTemplate::main",
			false);
	}
	
	public static void generateOSSwInterfaceTemplate(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildCPP_98OSSwInterfaceTemplate::main",
			false);
	}

}
