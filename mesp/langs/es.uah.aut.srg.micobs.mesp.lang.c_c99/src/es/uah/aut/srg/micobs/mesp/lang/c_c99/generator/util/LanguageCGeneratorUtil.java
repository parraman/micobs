/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mesp.lang.c_c99.generator.util;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.plugin.MESPLangC_C99Plugin;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;
import es.uah.aut.srg.modeling.util.xpand.XpandUtil;

/**
 * Class that provides methods to launch model transformations on MESP models
 * attached to the C(C99) language.
 *
 */
public class LanguageCGeneratorUtil {

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
	
	public static void generateProvidedInterfaceTemplate(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildC_C99ProvidedInterfaceTemplate::main",
			false);
	}
	
	public static void generateOSSwInterfaceTemplate(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildC_C99OSSwInterfaceTemplate::main",
			false);
	}
	
	public static void createSwInterfaceRepositorySkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPSWIPackageFile)
		{
			FileHelper.createFolder(rootFolder,
						MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
						MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_public_foldername"));
		}
	}
	
	public static void createOSSwInterfaceRepositorySkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPOSSWIPackageFile)
		{
			FileHelper.createFolder(rootFolder,
						MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
						MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_public_foldername"));
		}
	}

	public static void createSwPackageProjectSkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPSWPPackageFile)
		{
			MMESPSWPPackageFile swpPackageFile = (MMESPSWPPackageFile)model;

			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_src_foldername"));
			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					StringHelper.toLowerDefString(swpPackageFile.getElement().getName()));
		}
	}
	

	public static void createPlatformSwPackageProjectSkeleton(EObject model, IContainer rootFolder)
	{
		FileHelper.createFolder(rootFolder,
				MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
				MESPLangC_C99Plugin.INSTANCE.getString("_MESPPlatformSwPackage_include_platform_foldername"));
	}
	
	public static void createPlatformFoldersTree(MSwPackage swp, IContainer rootFolder)
	{
		for (MSwPackageSupportedPlatform swpsp : swp.getSupportedPlatforms())
		{
			String folder = "";
			
			if (swpsp.getOsapi() != null)
			{
				folder += 
						"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swpsp.getOsapi()));
				if (swpsp.getOs() != null)
				{
					folder += 
							"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swpsp.getOs()));
					if (swpsp.getArchitecture() != null)
					{
						folder += 
								"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swpsp.getArchitecture()));
						if (swpsp.getCompiler() != null)
						{
							folder += 
									"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swpsp.getCompiler()));
						}
						if (swpsp.getMicroprocessor() != null)
						{
							folder += 
									"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swpsp.getMicroprocessor()));
							if (swpsp.getBoard() != null)
							{
								folder += 
										"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swpsp.getBoard()));
							}						
						}
					}
				}
			}
			
			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_src_foldername") + "/" +
					folder);
			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					StringHelper.toLowerDefString(swp.getName()) + "/" +
					folder);		
		}
	}
	
	public static void createPlatformFoldersTree(MOSSwPackage osswp, IContainer rootFolder)
	{
		for (MOSSupportedPlatform ossp : ((MOperatingSystem)osswp.getReferencedElement()).getSupportedPlatforms())
		{
			String folder = "";
			
			if (ossp.getArchitecture() != null)
			{
				folder += 
						"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(ossp.getArchitecture()));
				if (ossp.getCompiler() != null)
				{
					folder += 
							"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(ossp.getCompiler()));
				}
				if (ossp.getMicroprocessor() != null)
				{
					folder += 
							"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(ossp.getMicroprocessor()));
					if (ossp.getBoard() != null)
					{
						folder += 
								"/" + StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(ossp.getBoard()));
					}						
				}
			}
			
			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_src_foldername") + "/" +
					folder);
			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					StringHelper.toLowerDefString(osswp.getName()) + "/" +
					folder);		
		}
	}
	
	public static void createOSSwPackageProjectSkeleton(EObject model, IContainer rootFolder)
	{
		if (model instanceof MMESPOSSWPPackageFile)
		{
			MMESPOSSWPPackageFile osswpPackageFile = (MMESPOSSWPPackageFile)model;

			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_src_foldername"));
			FileHelper.createFolder(rootFolder,
					MESPLangC_C99Plugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					StringHelper.toLowerDefString(osswpPackageFile.getElement().getName()));

		}
	}
	
	public static void generateLocalConfigFile(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
				model, 
				metamodel, 
				"template::BuildC_C99LocalConfigFile::main",
				false);
	}
}
